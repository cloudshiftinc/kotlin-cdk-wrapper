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
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Settings for the M3U8 container.
 *
 * The parent of this entity is StandardHlsSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * M3u8SettingsProperty m3u8SettingsProperty = M3u8SettingsProperty.builder()
 * .audioFramesPerPes(123)
 * .audioPids("audioPids")
 * .ecmPid("ecmPid")
 * .klvBehavior("klvBehavior")
 * .klvDataPids("klvDataPids")
 * .nielsenId3Behavior("nielsenId3Behavior")
 * .patInterval(123)
 * .pcrControl("pcrControl")
 * .pcrPeriod(123)
 * .pcrPid("pcrPid")
 * .pmtInterval(123)
 * .pmtPid("pmtPid")
 * .programNum(123)
 * .scte35Behavior("scte35Behavior")
 * .scte35Pid("scte35Pid")
 * .timedMetadataBehavior("timedMetadataBehavior")
 * .timedMetadataPid("timedMetadataPid")
 * .transportStreamId(123)
 * .videoPid("videoPid")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-m3u8settings.html)
 */
@CdkDslMarker
public class CfnChannelM3u8SettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.M3u8SettingsProperty.Builder =
        CfnChannel.M3u8SettingsProperty.builder()

    /** @param audioFramesPerPes The number of audio frames to insert for each PES packet. */
    public fun audioFramesPerPes(audioFramesPerPes: Number) {
        cdkBuilder.audioFramesPerPes(audioFramesPerPes)
    }

    /**
     * @param audioPids The PID of the elementary audio streams in the transport stream. Multiple
     *   values are accepted, and can be entered in ranges or by comma separation. You can enter the
     *   value as a decimal or hexadecimal value.
     */
    public fun audioPids(audioPids: String) {
        cdkBuilder.audioPids(audioPids)
    }

    /** @param ecmPid This parameter is unused and deprecated. */
    public fun ecmPid(ecmPid: String) {
        cdkBuilder.ecmPid(ecmPid)
    }

    /** @param klvBehavior the value to be set. */
    public fun klvBehavior(klvBehavior: String) {
        cdkBuilder.klvBehavior(klvBehavior)
    }

    /** @param klvDataPids the value to be set. */
    public fun klvDataPids(klvDataPids: String) {
        cdkBuilder.klvDataPids(klvDataPids)
    }

    /**
     * @param nielsenId3Behavior If set to passthrough, Nielsen inaudible tones for media tracking
     *   will be detected in the input audio and an equivalent ID3 tag will be inserted in the
     *   output.
     */
    public fun nielsenId3Behavior(nielsenId3Behavior: String) {
        cdkBuilder.nielsenId3Behavior(nielsenId3Behavior)
    }

    /**
     * @param patInterval The number of milliseconds between instances of this table in the output
     *   transport stream. A value of "0" writes out the PMT once per segment file.
     */
    public fun patInterval(patInterval: Number) {
        cdkBuilder.patInterval(patInterval)
    }

    /**
     * @param pcrControl When set to pcrEveryPesPacket, a Program Clock Reference value is inserted
     *   for every Packetized Elementary Stream (PES) header. This parameter is effective only when
     *   the PCR PID is the same as the video or audio elementary stream.
     */
    public fun pcrControl(pcrControl: String) {
        cdkBuilder.pcrControl(pcrControl)
    }

    /**
     * @param pcrPeriod The maximum time, in milliseconds, between Program Clock References (PCRs)
     *   inserted into the transport stream.
     */
    public fun pcrPeriod(pcrPeriod: Number) {
        cdkBuilder.pcrPeriod(pcrPeriod)
    }

    /**
     * @param pcrPid The PID of the Program Clock Reference (PCR) in the transport stream. When no
     *   value is given, MediaLive assigns the same value as the video PID. You can enter the value
     *   as a decimal or hexadecimal value.
     */
    public fun pcrPid(pcrPid: String) {
        cdkBuilder.pcrPid(pcrPid)
    }

    /**
     * @param pmtInterval The number of milliseconds between instances of this table in the output
     *   transport stream. A value of "0" writes out the PMT once per segment file.
     */
    public fun pmtInterval(pmtInterval: Number) {
        cdkBuilder.pmtInterval(pmtInterval)
    }

    /**
     * @param pmtPid The PID for the Program Map Table (PMT) in the transport stream. You can enter
     *   the value as a decimal or hexadecimal value.
     */
    public fun pmtPid(pmtPid: String) {
        cdkBuilder.pmtPid(pmtPid)
    }

    /** @param programNum The value of the program number field in the Program Map Table (PMT). */
    public fun programNum(programNum: Number) {
        cdkBuilder.programNum(programNum)
    }

    /**
     * @param scte35Behavior If set to passthrough, passes any SCTE-35 signals from the input source
     *   to this output.
     */
    public fun scte35Behavior(scte35Behavior: String) {
        cdkBuilder.scte35Behavior(scte35Behavior)
    }

    /**
     * @param scte35Pid The PID of the SCTE-35 stream in the transport stream. You can enter the
     *   value as a decimal or hexadecimal value.
     */
    public fun scte35Pid(scte35Pid: String) {
        cdkBuilder.scte35Pid(scte35Pid)
    }

    /**
     * @param timedMetadataBehavior When set to passthrough, timed metadata is passed through from
     *   input to output.
     */
    public fun timedMetadataBehavior(timedMetadataBehavior: String) {
        cdkBuilder.timedMetadataBehavior(timedMetadataBehavior)
    }

    /**
     * @param timedMetadataPid The PID of the timed metadata stream in the transport stream. You can
     *   enter the value as a decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or
     *   0x1ff6).
     */
    public fun timedMetadataPid(timedMetadataPid: String) {
        cdkBuilder.timedMetadataPid(timedMetadataPid)
    }

    /**
     * @param transportStreamId The value of the transport stream ID field in the Program Map Table
     *   (PMT).
     */
    public fun transportStreamId(transportStreamId: Number) {
        cdkBuilder.transportStreamId(transportStreamId)
    }

    /**
     * @param videoPid The PID of the elementary video stream in the transport stream. You can enter
     *   the value as a decimal or hexadecimal value.
     */
    public fun videoPid(videoPid: String) {
        cdkBuilder.videoPid(videoPid)
    }

    public fun build(): CfnChannel.M3u8SettingsProperty = cdkBuilder.build()
}
