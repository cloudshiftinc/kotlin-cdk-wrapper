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

package io.cloudshiftdev.awscdkdsl.services.arczonalshift

import kotlin.Unit
import software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration

/**
 * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
 * specified for a practice run, as well as any blocked dates or blocked windows for the practice
 * run.
 */
public inline fun CfnZonalAutoshiftConfiguration.setPracticeRunConfiguration(
    block: CfnZonalAutoshiftConfigurationPracticeRunConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnZonalAutoshiftConfigurationPracticeRunConfigurationPropertyDsl()
    builder.apply(block)
    return setPracticeRunConfiguration(builder.build())
}
