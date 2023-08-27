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

package io.cloudshiftdev.awscdkdsl.services.ivs

import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration

/** A destination configuration contains information about where recorded video will be stored. */
public inline fun CfnRecordingConfiguration.setDestinationConfiguration(
    block: CfnRecordingConfigurationDestinationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRecordingConfigurationDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return setDestinationConfiguration(builder.build())
}

/** A rendition configuration describes which renditions should be recorded for a stream. */
public inline fun CfnRecordingConfiguration.setRenditionConfiguration(
    block: CfnRecordingConfigurationRenditionConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRecordingConfigurationRenditionConfigurationPropertyDsl()
    builder.apply(block)
    return setRenditionConfiguration(builder.build())
}

/**
 * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
 * controls the interval at which thumbnails are generated for the live session.
 */
public inline fun CfnRecordingConfiguration.setThumbnailConfiguration(
    block: CfnRecordingConfigurationThumbnailConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRecordingConfigurationThumbnailConfigurationPropertyDsl()
    builder.apply(block)
    return setThumbnailConfiguration(builder.build())
}
