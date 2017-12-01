package de.zalando.zally.rule.api

import de.zalando.zally.dto.ViolationType

data class Violation(
    val rule: Rule,
    val description: String,
    val violationType: ViolationType,
    val paths: List<String>
)
