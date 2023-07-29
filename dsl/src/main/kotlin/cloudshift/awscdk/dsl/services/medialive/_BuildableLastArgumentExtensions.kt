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

package cloudshift.awscdk.dsl.services.medialive

import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel
import software.amazon.awscdk.services.medialive.CfnInput

/** Specification of CDI inputs for this channel. */
public inline fun CfnChannel.setCdiInputSpecification(
    block: CfnChannelCdiInputSpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnChannelCdiInputSpecificationPropertyDsl()
    builder.apply(block)
    return setCdiInputSpecification(builder.build())
}

/** The encoding configuration for the output content. */
public inline fun CfnChannel.setEncoderSettings(
    block: CfnChannelEncoderSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnChannelEncoderSettingsPropertyDsl()
    builder.apply(block)
    return setEncoderSettings(builder.build())
}

/** The input specification for this channel. */
public inline fun CfnChannel.setInputSpecification(
    block: CfnChannelInputSpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnChannelInputSpecificationPropertyDsl()
    builder.apply(block)
    return setInputSpecification(builder.build())
}

/**  */
public inline fun CfnChannel.setMaintenance(
    block: CfnChannelMaintenanceCreateSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnChannelMaintenanceCreateSettingsPropertyDsl()
    builder.apply(block)
    return setMaintenance(builder.build())
}

/**
 * Settings to enable VPC mode in the channel, so that the endpoints for all outputs are in your
 * VPC.
 */
public inline fun CfnChannel.setVpc(block: CfnChannelVpcOutputSettingsPropertyDsl.() -> Unit = {}) {
    val builder = CfnChannelVpcOutputSettingsPropertyDsl()
    builder.apply(block)
    return setVpc(builder.build())
}

/** Settings that apply only if the input is an push input where the source is on Amazon VPC. */
public inline fun CfnInput.setVpc(block: CfnInputInputVpcRequestPropertyDsl.() -> Unit = {}) {
    val builder = CfnInputInputVpcRequestPropertyDsl()
    builder.apply(block)
    return setVpc(builder.build())
}
