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

package io.cloudshiftdev.awscdkdsl.services.rekognition

import kotlin.Unit
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

/** Connected home settings to use on a streaming video. */
public inline fun CfnStreamProcessor.setConnectedHomeSettings(
    block: CfnStreamProcessorConnectedHomeSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStreamProcessorConnectedHomeSettingsPropertyDsl()
    builder.apply(block)
    return setConnectedHomeSettings(builder.build())
}

/** Allows you to opt in or opt out to share data with Rekognition to improve model performance. */
public inline fun CfnStreamProcessor.setDataSharingPreference(
    block: CfnStreamProcessorDataSharingPreferencePropertyDsl.() -> Unit = {}
) {
    val builder = CfnStreamProcessorDataSharingPreferencePropertyDsl()
    builder.apply(block)
    return setDataSharingPreference(builder.build())
}

/**
 * The input parameters used to recognize faces in a streaming video analyzed by an Amazon
 * Rekognition stream processor.
 */
public inline fun CfnStreamProcessor.setFaceSearchSettings(
    block: CfnStreamProcessorFaceSearchSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStreamProcessorFaceSearchSettingsPropertyDsl()
    builder.apply(block)
    return setFaceSearchSettings(builder.build())
}

/** Amazon Rekognition's Video Stream Processor takes a Kinesis video stream as input. */
public inline fun CfnStreamProcessor.setKinesisDataStream(
    block: CfnStreamProcessorKinesisDataStreamPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStreamProcessorKinesisDataStreamPropertyDsl()
    builder.apply(block)
    return setKinesisDataStream(builder.build())
}

/**
 * The Kinesis video stream that provides the source of the streaming video for an Amazon
 * Rekognition Video stream processor.
 */
public inline fun CfnStreamProcessor.setKinesisVideoStream(
    block: CfnStreamProcessorKinesisVideoStreamPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStreamProcessorKinesisVideoStreamPropertyDsl()
    builder.apply(block)
    return setKinesisVideoStream(builder.build())
}

/**
 * The Amazon Simple Notification Service topic to which Amazon Rekognition publishes the object
 * detection results and completion status of a video analysis operation.
 */
public inline fun CfnStreamProcessor.setNotificationChannel(
    block: CfnStreamProcessorNotificationChannelPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStreamProcessorNotificationChannelPropertyDsl()
    builder.apply(block)
    return setNotificationChannel(builder.build())
}

/**
 * The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed inference
 * results of a video analysis operation.
 */
public inline fun CfnStreamProcessor.setS3Destination(
    block: CfnStreamProcessorS3DestinationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStreamProcessorS3DestinationPropertyDsl()
    builder.apply(block)
    return setS3Destination(builder.build())
}
