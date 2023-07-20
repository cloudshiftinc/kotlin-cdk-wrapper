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

package cloudshift.awscdk.dsl.services.rekognition

import software.amazon.awscdk.services.rekognition.CfnStreamProcessor
import kotlin.Unit

public inline fun CfnStreamProcessor.setKinesisVideoStream(
    block: CfnStreamProcessorKinesisVideoStreamPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnStreamProcessorKinesisVideoStreamPropertyDsl()
    builder.apply(block)
    return setKinesisVideoStream(builder.build())
}

public inline fun CfnStreamProcessor.setConnectedHomeSettings(
    block: CfnStreamProcessorConnectedHomeSettingsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnStreamProcessorConnectedHomeSettingsPropertyDsl()
    builder.apply(block)
    return setConnectedHomeSettings(builder.build())
}

public inline fun CfnStreamProcessor.setDataSharingPreference(
    block: CfnStreamProcessorDataSharingPreferencePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnStreamProcessorDataSharingPreferencePropertyDsl()
    builder.apply(block)
    return setDataSharingPreference(builder.build())
}

public inline fun CfnStreamProcessor.setFaceSearchSettings(
    block: CfnStreamProcessorFaceSearchSettingsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnStreamProcessorFaceSearchSettingsPropertyDsl()
    builder.apply(block)
    return setFaceSearchSettings(builder.build())
}

public inline fun CfnStreamProcessor.setKinesisDataStream(
    block: CfnStreamProcessorKinesisDataStreamPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnStreamProcessorKinesisDataStreamPropertyDsl()
    builder.apply(block)
    return setKinesisDataStream(builder.build())
}

public inline fun CfnStreamProcessor.setNotificationChannel(
    block: CfnStreamProcessorNotificationChannelPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnStreamProcessorNotificationChannelPropertyDsl()
    builder.apply(block)
    return setNotificationChannel(builder.build())
}

public inline fun CfnStreamProcessor.setS3Destination(
    block: CfnStreamProcessorS3DestinationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnStreamProcessorS3DestinationPropertyDsl()
    builder.apply(block)
    return setS3Destination(builder.build())
}
