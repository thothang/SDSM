package com.example.sdsm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.graphics.toArgb
import com.example.sdsm.domain.model.Session
import com.example.sdsm.domain.model.Subject
import com.example.sdsm.domain.model.Task
import com.example.sdsm.presentation.NavGraphs
import com.example.sdsm.presentation.theme.SDSMTheme
import com.ramcosta.composedestinations.DestinationsNavHost
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SDSMTheme {
                    DestinationsNavHost(navGraph = NavGraphs.root)
                }
            }
        }
    }

val subjects = listOf(
    Subject(name = "EL", goalHours = 10f, colors = Subject.subjectCardColors[0].map { it.toArgb() }, subjectId = 0),
    Subject(name = "EL", goalHours = 10f, colors = Subject.subjectCardColors[1].map { it.toArgb() }, subjectId = 0),
    Subject(name = "EL", goalHours = 10f, colors = Subject.subjectCardColors[2].map { it.toArgb() }, subjectId = 0),
    Subject(name = "EL", goalHours = 10f, colors = Subject.subjectCardColors[3].map { it.toArgb() }, subjectId = 0)
)

val tasks = listOf(
    Task(
        title = "P n",
        description = "",
        dueDate = 0L,
        priority = 0,
        relatedToSubject = "",
        isComplete = false,
        taskSubjectId = 0,
        taskId = 1,
    ),
    Task(
        title = "P n",
        description = "",
        dueDate = 0L,
        priority = 1,
        relatedToSubject = "",
        isComplete = true,
        taskSubjectId = 0,
        taskId = 1,
    ),
    Task(
        title = "P n",
        description = "",
        dueDate = 0L,
        priority = 2,
        relatedToSubject = "",
        isComplete = false,
        taskSubjectId = 0,
        taskId = 1,
    ),
)

val sessions = listOf(
    Session(
        relatedToSubject = "EL",
        date = 0L,
        duration = 2,
        sessionId = 0,
        sessionSubjectId = 0
    ),
    Session(
        relatedToSubject = "EL",
        date = 0L,
        duration = 2,
        sessionId = 0,
        sessionSubjectId = 0
    ),
    Session(
        relatedToSubject = "math",
        date = 0L,
        duration = 2,
        sessionId = 0,
        sessionSubjectId = 0
    )
)


