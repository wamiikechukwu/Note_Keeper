package com.example.notekeeper

class courseInfo(val courseId: String, val title: String){

}

class NoteInfo(val course: courseInfo, var title: String, var text: String){

}