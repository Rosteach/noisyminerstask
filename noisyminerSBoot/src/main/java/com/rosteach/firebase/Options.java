package com.rosteach.firebase;

import java.io.FileInputStream;

import com.google.firebase.FirebaseOptions;

public class Options {
	FirebaseOptions options = new FirebaseOptions.Builder()
			  .setServiceAccount(new FileInputStream("path/to/serviceAccountCredentials.json"))
			  .setDatabaseUrl("https://databaseName.firebaseio.com/")
			  .build();
	FirebaseApp.initializeApp(options);		
}
