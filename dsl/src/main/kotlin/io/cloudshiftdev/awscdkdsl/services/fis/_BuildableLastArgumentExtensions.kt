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

package io.cloudshiftdev.awscdkdsl.services.fis

import kotlin.Unit
import software.amazon.awscdk.services.fis.CfnExperimentTemplate

/** The experiment options for an experiment template. */
public inline fun CfnExperimentTemplate.setExperimentOptions(
    block: CfnExperimentTemplateExperimentTemplateExperimentOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnExperimentTemplateExperimentTemplateExperimentOptionsPropertyDsl()
    builder.apply(block)
    return setExperimentOptions(builder.build())
}

/** The configuration for experiment logging. */
public inline fun CfnExperimentTemplate.setLogConfiguration(
    block: CfnExperimentTemplateExperimentTemplateLogConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnExperimentTemplateExperimentTemplateLogConfigurationPropertyDsl()
    builder.apply(block)
    return setLogConfiguration(builder.build())
}
