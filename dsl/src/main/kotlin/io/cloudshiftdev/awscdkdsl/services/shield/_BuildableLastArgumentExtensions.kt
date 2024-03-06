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

package io.cloudshiftdev.awscdkdsl.services.shield

import kotlin.Unit
import software.amazon.awscdk.services.shield.CfnProtection

/** The automatic application layer DDoS mitigation settings for the protection. */
public inline fun CfnProtection.setApplicationLayerAutomaticResponseConfiguration(
    block: CfnProtectionApplicationLayerAutomaticResponseConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnProtectionApplicationLayerAutomaticResponseConfigurationPropertyDsl()
    builder.apply(block)
    return setApplicationLayerAutomaticResponseConfiguration(builder.build())
}
