@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.fis

import software.amazon.awscdk.services.fis.CfnExperimentTemplate
import kotlin.Unit

public inline fun CfnExperimentTemplate.setLogConfiguration(
    block: CfnExperimentTemplateExperimentTemplateLogConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnExperimentTemplateExperimentTemplateLogConfigurationPropertyDsl()
    builder.apply(block)
    return setLogConfiguration(builder.build())
}
