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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnChannelMsSmoothGroupSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.MsSmoothGroupSettingsProperty.Builder =
        CfnChannel.MsSmoothGroupSettingsProperty.builder()

    public fun acquisitionPointId(acquisitionPointId: String) {
        cdkBuilder.acquisitionPointId(acquisitionPointId)
    }

    public fun audioOnlyTimecodeControl(audioOnlyTimecodeControl: String) {
        cdkBuilder.audioOnlyTimecodeControl(audioOnlyTimecodeControl)
    }

    public fun certificateMode(certificateMode: String) {
        cdkBuilder.certificateMode(certificateMode)
    }

    public fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
    }

    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
        cdkBuilder.destination(destination)
    }

    public fun eventId(eventId: String) {
        cdkBuilder.eventId(eventId)
    }

    public fun eventIdMode(eventIdMode: String) {
        cdkBuilder.eventIdMode(eventIdMode)
    }

    public fun eventStopBehavior(eventStopBehavior: String) {
        cdkBuilder.eventStopBehavior(eventStopBehavior)
    }

    public fun filecacheDuration(filecacheDuration: Number) {
        cdkBuilder.filecacheDuration(filecacheDuration)
    }

    public fun fragmentLength(fragmentLength: Number) {
        cdkBuilder.fragmentLength(fragmentLength)
    }

    public fun inputLossAction(inputLossAction: String) {
        cdkBuilder.inputLossAction(inputLossAction)
    }

    public fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
    }

    public fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
    }

    public fun segmentationMode(segmentationMode: String) {
        cdkBuilder.segmentationMode(segmentationMode)
    }

    public fun sendDelayMs(sendDelayMs: Number) {
        cdkBuilder.sendDelayMs(sendDelayMs)
    }

    public fun sparseTrackType(sparseTrackType: String) {
        cdkBuilder.sparseTrackType(sparseTrackType)
    }

    public fun streamManifestBehavior(streamManifestBehavior: String) {
        cdkBuilder.streamManifestBehavior(streamManifestBehavior)
    }

    public fun timestampOffset(timestampOffset: String) {
        cdkBuilder.timestampOffset(timestampOffset)
    }

    public fun timestampOffsetMode(timestampOffsetMode: String) {
        cdkBuilder.timestampOffsetMode(timestampOffsetMode)
    }

    public fun build(): CfnChannel.MsSmoothGroupSettingsProperty = cdkBuilder.build()
}
