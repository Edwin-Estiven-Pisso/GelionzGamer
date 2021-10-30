package com.gelionz.gelionzgamer;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;

//IMPORTACIONES PARA EL EMAIL

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Contactanos extends AppCompatActivity {

    Session session = null;
    ProgressDialog pdialog = null;
    Context context = null;
    EditText reciep, sub, msg;
    String rec, subject, textMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactanos);
        context = this;

        Button login = (Button) findViewById(R.id.btnEnviarContactanos);
        reciep = (EditText) findViewById(R.id.txtCorreoContactanos);
        sub = (EditText) findViewById(R.id.txtAsuntoContactanos);
        msg = (EditText) findViewById(R.id.txtMensajeContactanos);

        login.setOnClickListener(this::onClick);
    }

    public void onClick(View v) {
        rec = reciep.getText().toString();
        subject = sub.getText().toString();
        textMessage = msg.getText().toString();


        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        session = Session.getDefaultInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("gelionzgamercomentarios@gmail.com", "ComentariosGelionzGamer2021");
            }
        });

        pdialog = ProgressDialog.show(context, "", "ENVIANDO SU CORREO", true); //BARRA DONDE CARGA EL ENVIO DEL CORREO

        RetreiveFeedTask task = new RetreiveFeedTask();
        task.execute();
    }

    class RetreiveFeedTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {

            try{
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("gelionzgameroficial@gmail.com"));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(rec));
                message.setSubject(subject);
                message.setContent(textMessage, "text/html; charset=utf-8");
                Transport.send(message);
            } catch(MessagingException e) {
                e.printStackTrace();
            } catch(Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            pdialog.dismiss();
            reciep.setText("");
            msg.setText("");
            sub.setText("");
            Toast.makeText(getApplicationContext(), "CORREO ENVIADO CON EXITO", Toast.LENGTH_LONG).show();
        }
    }
}