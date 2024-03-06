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

package io.cloudshiftdev.awscdkdsl.services.mediatailor

import kotlin.Unit
import software.amazon.awscdk.services.mediatailor.CfnChannel
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration
import software.amazon.awscdk.services.mediatailor.CfnSourceLocation

/** The slate used to fill gaps between programs in the schedule. */
public inline fun CfnChannel.setFillerSlate(
    block: CfnChannelSlateSourcePropertyDsl.() -> Unit = {}
) {
    val builder = CfnChannelSlateSourcePropertyDsl()
    builder.apply(block)
    return setFillerSlate(builder.build())
}

/** The log configuration. */
public inline fun CfnChannel.setLogConfiguration(
    block: CfnChannelLogConfigurationForChannelPropertyDsl.() -> Unit = {}
) {
    val builder = CfnChannelLogConfigurationForChannelPropertyDsl()
    builder.apply(block)
    return setLogConfiguration(builder.build())
}

/** The configuration for time-shifted viewing. */
public inline fun CfnChannel.setTimeShiftConfiguration(
    block: CfnChannelTimeShiftConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnChannelTimeShiftConfigurationPropertyDsl()
    builder.apply(block)
    return setTimeShiftConfiguration(builder.build())
}

/** The configuration for avail suppression, also known as ad suppression. */
public inline fun CfnPlaybackConfiguration.setAvailSuppression(
    block: CfnPlaybackConfigurationAvailSuppressionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPlaybackConfigurationAvailSuppressionPropertyDsl()
    builder.apply(block)
    return setAvailSuppression(builder.build())
}

/** The configuration for bumpers. */
public inline fun CfnPlaybackConfiguration.setBumper(
    block: CfnPlaybackConfigurationBumperPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPlaybackConfigurationBumperPropertyDsl()
    builder.apply(block)
    return setBumper(builder.build())
}

/**
 * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content
 * and ad segment management.
 */
public inline fun CfnPlaybackConfiguration.setCdnConfiguration(
    block: CfnPlaybackConfigurationCdnConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPlaybackConfigurationCdnConfigurationPropertyDsl()
    builder.apply(block)
    return setCdnConfiguration(builder.build())
}

/** The configuration for a DASH source. */
public inline fun CfnPlaybackConfiguration.setDashConfiguration(
    block: CfnPlaybackConfigurationDashConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPlaybackConfigurationDashConfigurationPropertyDsl()
    builder.apply(block)
    return setDashConfiguration(builder.build())
}

/** The configuration for HLS content. */
public inline fun CfnPlaybackConfiguration.setHlsConfiguration(
    block: CfnPlaybackConfigurationHlsConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPlaybackConfigurationHlsConfigurationPropertyDsl()
    builder.apply(block)
    return setHlsConfiguration(builder.build())
}

/** The configuration for pre-roll ad insertion. */
public inline fun CfnPlaybackConfiguration.setLivePreRollConfiguration(
    block: CfnPlaybackConfigurationLivePreRollConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPlaybackConfigurationLivePreRollConfigurationPropertyDsl()
    builder.apply(block)
    return setLivePreRollConfiguration(builder.build())
}

/** The configuration for manifest processing rules. */
public inline fun CfnPlaybackConfiguration.setManifestProcessingRules(
    block: CfnPlaybackConfigurationManifestProcessingRulesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPlaybackConfigurationManifestProcessingRulesPropertyDsl()
    builder.apply(block)
    return setManifestProcessingRules(builder.build())
}

/** The access configuration for the source location. */
public inline fun CfnSourceLocation.setAccessConfiguration(
    block: CfnSourceLocationAccessConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSourceLocationAccessConfigurationPropertyDsl()
    builder.apply(block)
    return setAccessConfiguration(builder.build())
}

/** The default segment delivery configuration. */
public inline fun CfnSourceLocation.setDefaultSegmentDeliveryConfiguration(
    block: CfnSourceLocationDefaultSegmentDeliveryConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSourceLocationDefaultSegmentDeliveryConfigurationPropertyDsl()
    builder.apply(block)
    return setDefaultSegmentDeliveryConfiguration(builder.build())
}

/** The HTTP configuration for the source location. */
public inline fun CfnSourceLocation.setHttpConfiguration(
    block: CfnSourceLocationHttpConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSourceLocationHttpConfigurationPropertyDsl()
    builder.apply(block)
    return setHttpConfiguration(builder.build())
}
