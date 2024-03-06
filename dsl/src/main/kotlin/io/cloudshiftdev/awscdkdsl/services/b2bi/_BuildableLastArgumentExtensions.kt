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

package io.cloudshiftdev.awscdkdsl.services.b2bi

import kotlin.Unit
import software.amazon.awscdk.services.b2bi.CfnCapability
import software.amazon.awscdk.services.b2bi.CfnTransformer

/** Specifies a structure that contains the details for a capability. */
public inline fun CfnCapability.setConfiguration(
    block: CfnCapabilityCapabilityConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCapabilityCapabilityConfigurationPropertyDsl()
    builder.apply(block)
    return setConfiguration(builder.build())
}

/** Returns the details for the EDI standard that is being used for the transformer. */
public inline fun CfnTransformer.setEdiType(
    block: CfnTransformerEdiTypePropertyDsl.() -> Unit = {}
) {
    val builder = CfnTransformerEdiTypePropertyDsl()
    builder.apply(block)
    return setEdiType(builder.build())
}
