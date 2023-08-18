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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for a Microsoft Smooth output group.
 *
 * The parent of this entity is OutputGroupSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MsSmoothGroupSettingsProperty msSmoothGroupSettingsProperty =
 * MsSmoothGroupSettingsProperty.builder()
 * .acquisitionPointId("acquisitionPointId")
 * .audioOnlyTimecodeControl("audioOnlyTimecodeControl")
 * .certificateMode("certificateMode")
 * .connectionRetryInterval(123)
 * .destination(OutputLocationRefProperty.builder()
 * .destinationRefId("destinationRefId")
 * .build())
 * .eventId("eventId")
 * .eventIdMode("eventIdMode")
 * .eventStopBehavior("eventStopBehavior")
 * .filecacheDuration(123)
 * .fragmentLength(123)
 * .inputLossAction("inputLossAction")
 * .numRetries(123)
 * .restartDelay(123)
 * .segmentationMode("segmentationMode")
 * .sendDelayMs(123)
 * .sparseTrackType("sparseTrackType")
 * .streamManifestBehavior("streamManifestBehavior")
 * .timestampOffset("timestampOffset")
 * .timestampOffsetMode("timestampOffsetMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mssmoothgroupsettings.html)
 */
@CdkDslMarker
public class CfnChannelMsSmoothGroupSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.MsSmoothGroupSettingsProperty.Builder =
        CfnChannel.MsSmoothGroupSettingsProperty.builder()

    /**
     * @param acquisitionPointId The value of the Acquisition Point Identity element that is used in
     *   each message placed in the sparse track. Enabled only if sparseTrackType is not "none."
     */
    public fun acquisitionPointId(acquisitionPointId: String) {
        cdkBuilder.acquisitionPointId(acquisitionPointId)
    }

    /**
     * @param audioOnlyTimecodeControl If set to passthrough for an audio-only Microsoft Smooth
     *   output, the fragment absolute time is set to the current timecode. This option does not
     *   write timecodes to the audio elementary stream.
     */
    public fun audioOnlyTimecodeControl(audioOnlyTimecodeControl: String) {
        cdkBuilder.audioOnlyTimecodeControl(audioOnlyTimecodeControl)
    }

    /**
     * @param certificateMode If set to verifyAuthenticity, verifies the HTTPS certificate chain to
     *   a trusted certificate authority (CA). This causes HTTPS outputs to self-signed certificates
     *   to fail.
     */
    public fun certificateMode(certificateMode: String) {
        cdkBuilder.certificateMode(certificateMode)
    }

    /**
     * @param connectionRetryInterval The number of seconds to wait before retrying the connection
     *   to the IIS server if the connection is lost. Content is cached during this time, and the
     *   cache is delivered to the IIS server after the connection is re-established.
     */
    public fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
    }

    /**
     * @param destination The Smooth Streaming publish point on an IIS server. MediaLive acts as a
     *   "Push" encoder to IIS.
     */
    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    /**
     * @param destination The Smooth Streaming publish point on an IIS server. MediaLive acts as a
     *   "Push" encoder to IIS.
     */
    public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
        cdkBuilder.destination(destination)
    }

    /**
     * @param eventId The Microsoft Smooth channel ID that is sent to the IIS server. Specify the ID
     *   only if eventIdMode is set to useConfigured.
     */
    public fun eventId(eventId: String) {
        cdkBuilder.eventId(eventId)
    }

    /**
     * @param eventIdMode Specifies whether to send a channel ID to the IIS server. If no channel ID
     *   is sent and the same channel is used without changing the publishing point, clients might
     *   see cached video from the previous run. Options: - "useConfigured" - use the value provided
     *   in eventId - "useTimestamp" - generate and send a channel ID based on the current
     *   timestamp - "noEventId" - do not send a channel ID to the IIS server.
     */
    public fun eventIdMode(eventIdMode: String) {
        cdkBuilder.eventIdMode(eventIdMode)
    }

    /**
     * @param eventStopBehavior When set to sendEos, sends an EOS signal to an IIS server when
     *   stopping the channel.
     */
    public fun eventStopBehavior(eventStopBehavior: String) {
        cdkBuilder.eventStopBehavior(eventStopBehavior)
    }

    /** @param filecacheDuration The size, in seconds, of the file cache for streaming outputs. */
    public fun filecacheDuration(filecacheDuration: Number) {
        cdkBuilder.filecacheDuration(filecacheDuration)
    }

    /**
     * @param fragmentLength The length, in seconds, of mp4 fragments to generate. The fragment
     *   length must be compatible with GOP size and frame rate.
     */
    public fun fragmentLength(fragmentLength: Number) {
        cdkBuilder.fragmentLength(fragmentLength)
    }

    /** @param inputLossAction A parameter that controls output group behavior on an input loss. */
    public fun inputLossAction(inputLossAction: String) {
        cdkBuilder.inputLossAction(inputLossAction)
    }

    /** @param numRetries The number of retry attempts. */
    public fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
    }

    /**
     * @param restartDelay The number of seconds before initiating a restart due to output failure,
     *   due to exhausting the numRetries on one segment, or exceeding filecacheDuration.
     */
    public fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
    }

    /**
     * @param segmentationMode useInputSegmentation has been deprecated. The configured segment size
     *   is always used.
     */
    public fun segmentationMode(segmentationMode: String) {
        cdkBuilder.segmentationMode(segmentationMode)
    }

    /**
     * @param sendDelayMs The number of milliseconds to delay the output from the second pipeline.
     */
    public fun sendDelayMs(sendDelayMs: Number) {
        cdkBuilder.sendDelayMs(sendDelayMs)
    }

    /**
     * @param sparseTrackType If set to scte35, uses incoming SCTE-35 messages to generate a sparse
     *   track in this group of Microsoft Smooth outputs.
     */
    public fun sparseTrackType(sparseTrackType: String) {
        cdkBuilder.sparseTrackType(sparseTrackType)
    }

    /**
     * @param streamManifestBehavior When set to send, sends a stream manifest so that the
     *   publishing point doesn't start until all streams start.
     */
    public fun streamManifestBehavior(streamManifestBehavior: String) {
        cdkBuilder.streamManifestBehavior(streamManifestBehavior)
    }

    /**
     * @param timestampOffset The timestamp offset for the channel. Used only if timestampOffsetMode
     *   is set to useConfiguredOffset.
     */
    public fun timestampOffset(timestampOffset: String) {
        cdkBuilder.timestampOffset(timestampOffset)
    }

    /**
     * @param timestampOffsetMode The type of timestamp date offset to use.
     * * useEventStartDate: Use the date the channel was started as the offset -
     *   useConfiguredOffset: Use an explicitly configured date as the offset.
     */
    public fun timestampOffsetMode(timestampOffsetMode: String) {
        cdkBuilder.timestampOffsetMode(timestampOffsetMode)
    }

    public fun build(): CfnChannel.MsSmoothGroupSettingsProperty = cdkBuilder.build()
}
