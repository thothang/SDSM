package com.example.sdsm.presentation.session

import com.example.sdsm.domain.model.Session
import com.example.sdsm.domain.model.Subject

data class SessionState(
    val subjects: List<Subject> = emptyList(),
    val sessions: List<Session> = emptyList(),
    val relatedToSubject: String? = null,
    val subjectId: Int? = null,
    val session: Session? = null
)
