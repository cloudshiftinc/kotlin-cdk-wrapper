@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.accessanalyzer

import kotlin.Unit
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer

/**
 * Contains information about the configuration of an unused access analyzer for an AWS organization
 * or account.
 */
public inline fun CfnAnalyzer.setAnalyzerConfiguration(
    block: CfnAnalyzerAnalyzerConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAnalyzerAnalyzerConfigurationPropertyDsl()
    builder.apply(block)
    return setAnalyzerConfiguration(builder.build())
}
