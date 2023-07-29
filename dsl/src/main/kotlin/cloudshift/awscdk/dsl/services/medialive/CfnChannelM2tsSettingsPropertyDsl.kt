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

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The configuration of the M2TS in the output.
 *
 * The parents of this entity are ArchiveContainerSettings and UdpContainerSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * M2tsSettingsProperty m2tsSettingsProperty = M2tsSettingsProperty.builder()
 * .absentInputAudioBehavior("absentInputAudioBehavior")
 * .arib("arib")
 * .aribCaptionsPid("aribCaptionsPid")
 * .aribCaptionsPidControl("aribCaptionsPidControl")
 * .audioBufferModel("audioBufferModel")
 * .audioFramesPerPes(123)
 * .audioPids("audioPids")
 * .audioStreamType("audioStreamType")
 * .bitrate(123)
 * .bufferModel("bufferModel")
 * .ccDescriptor("ccDescriptor")
 * .dvbNitSettings(DvbNitSettingsProperty.builder()
 * .networkId(123)
 * .networkName("networkName")
 * .repInterval(123)
 * .build())
 * .dvbSdtSettings(DvbSdtSettingsProperty.builder()
 * .outputSdt("outputSdt")
 * .repInterval(123)
 * .serviceName("serviceName")
 * .serviceProviderName("serviceProviderName")
 * .build())
 * .dvbSubPids("dvbSubPids")
 * .dvbTdtSettings(DvbTdtSettingsProperty.builder()
 * .repInterval(123)
 * .build())
 * .dvbTeletextPid("dvbTeletextPid")
 * .ebif("ebif")
 * .ebpAudioInterval("ebpAudioInterval")
 * .ebpLookaheadMs(123)
 * .ebpPlacement("ebpPlacement")
 * .ecmPid("ecmPid")
 * .esRateInPes("esRateInPes")
 * .etvPlatformPid("etvPlatformPid")
 * .etvSignalPid("etvSignalPid")
 * .fragmentTime(123)
 * .klv("klv")
 * .klvDataPids("klvDataPids")
 * .nielsenId3Behavior("nielsenId3Behavior")
 * .nullPacketBitrate(123)
 * .patInterval(123)
 * .pcrControl("pcrControl")
 * .pcrPeriod(123)
 * .pcrPid("pcrPid")
 * .pmtInterval(123)
 * .pmtPid("pmtPid")
 * .programNum(123)
 * .rateMode("rateMode")
 * .scte27Pids("scte27Pids")
 * .scte35Control("scte35Control")
 * .scte35Pid("scte35Pid")
 * .scte35PrerollPullupMilliseconds(123)
 * .segmentationMarkers("segmentationMarkers")
 * .segmentationStyle("segmentationStyle")
 * .segmentationTime(123)
 * .timedMetadataBehavior("timedMetadataBehavior")
 * .timedMetadataPid("timedMetadataPid")
 * .transportStreamId(123)
 * .videoPid("videoPid")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-m2tssettings.html)
 */
@CdkDslMarker
public class CfnChannelM2tsSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.M2tsSettingsProperty.Builder =
        CfnChannel.M2tsSettingsProperty.builder()

    /**
     * @param absentInputAudioBehavior When set to drop, the output audio streams are removed from
     *   the program if the selected input audio stream is removed from the input. This allows the
     *   output audio configuration to dynamically change based on the input configuration. If this
     *   is set to encodeSilence, all output audio streams will output encoded silence when not
     *   connected to an active input stream.
     */
    public fun absentInputAudioBehavior(absentInputAudioBehavior: String) {
        cdkBuilder.absentInputAudioBehavior(absentInputAudioBehavior)
    }

    /**
     * @param arib When set to enabled, uses ARIB-compliant field muxing and removes video
     *   descriptor.
     */
    public fun arib(arib: String) {
        cdkBuilder.arib(arib)
    }

    /**
     * @param aribCaptionsPid The PID for ARIB Captions in the transport stream. You can enter the
     *   value as a decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */
    public fun aribCaptionsPid(aribCaptionsPid: String) {
        cdkBuilder.aribCaptionsPid(aribCaptionsPid)
    }

    /**
     * @param aribCaptionsPidControl If set to auto, The PID number used for ARIB Captions will be
     *   auto-selected from unused PIDs. If set to useConfigured, ARIB captions will be on the
     *   configured PID number.
     */
    public fun aribCaptionsPidControl(aribCaptionsPidControl: String) {
        cdkBuilder.aribCaptionsPidControl(aribCaptionsPidControl)
    }

    /**
     * @param audioBufferModel When set to dvb, uses the DVB buffer model for Dolby Digital audio.
     *   When set to atsc, the ATSC model is used.
     */
    public fun audioBufferModel(audioBufferModel: String) {
        cdkBuilder.audioBufferModel(audioBufferModel)
    }

    /** @param audioFramesPerPes The number of audio frames to insert for each PES packet. */
    public fun audioFramesPerPes(audioFramesPerPes: Number) {
        cdkBuilder.audioFramesPerPes(audioFramesPerPes)
    }

    /**
     * @param audioPids The PID of the elementary audio streams in the transport stream. Multiple
     *   values are accepted, and can be entered in ranges or by comma separation. You can enter the
     *   value as a decimal or hexadecimal value. Each PID specified must be in the range of 32 (or
     *   0x20)..8182 (or 0x1ff6).
     */
    public fun audioPids(audioPids: String) {
        cdkBuilder.audioPids(audioPids)
    }

    /**
     * @param audioStreamType When set to atsc, uses stream type = 0x81 for AC3 and stream type =
     *   0x87 for EAC3. When set to dvb, uses stream type = 0x06.
     */
    public fun audioStreamType(audioStreamType: String) {
        cdkBuilder.audioStreamType(audioStreamType)
    }

    /**
     * @param bitrate The output bitrate of the transport stream in bits per second. Setting to 0
     *   lets the muxer automatically determine the appropriate bitrate.
     */
    public fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
    }

    /**
     * @param bufferModel If set to multiplex, uses the multiplex buffer model for accurate
     *   interleaving. Setting to bufferModel to none can lead to lower latency, but low-memory
     *   devices might not be able to play back the stream without interruptions.
     */
    public fun bufferModel(bufferModel: String) {
        cdkBuilder.bufferModel(bufferModel)
    }

    /** @param ccDescriptor When set to enabled, generates captionServiceDescriptor in PMT. */
    public fun ccDescriptor(ccDescriptor: String) {
        cdkBuilder.ccDescriptor(ccDescriptor)
    }

    /**
     * @param dvbNitSettings Inserts a DVB Network Information Table (NIT) at the specified table
     *   repetition interval.
     */
    public fun dvbNitSettings(dvbNitSettings: IResolvable) {
        cdkBuilder.dvbNitSettings(dvbNitSettings)
    }

    /**
     * @param dvbNitSettings Inserts a DVB Network Information Table (NIT) at the specified table
     *   repetition interval.
     */
    public fun dvbNitSettings(dvbNitSettings: CfnChannel.DvbNitSettingsProperty) {
        cdkBuilder.dvbNitSettings(dvbNitSettings)
    }

    /**
     * @param dvbSdtSettings Inserts a DVB Service Description Table (SDT) at the specified table
     *   repetition interval.
     */
    public fun dvbSdtSettings(dvbSdtSettings: IResolvable) {
        cdkBuilder.dvbSdtSettings(dvbSdtSettings)
    }

    /**
     * @param dvbSdtSettings Inserts a DVB Service Description Table (SDT) at the specified table
     *   repetition interval.
     */
    public fun dvbSdtSettings(dvbSdtSettings: CfnChannel.DvbSdtSettingsProperty) {
        cdkBuilder.dvbSdtSettings(dvbSdtSettings)
    }

    /**
     * @param dvbSubPids The PID for the input source DVB Subtitle data to this output. Multiple
     *   values are accepted, and can be entered in ranges and/or by comma separation. You can enter
     *   the value as a decimal or hexadecimal value. Each PID specified must be in the range of 32
     *   (or 0x20)..8182 (or 0x1ff6).
     */
    public fun dvbSubPids(dvbSubPids: String) {
        cdkBuilder.dvbSubPids(dvbSubPids)
    }

    /**
     * @param dvbTdtSettings Inserts DVB Time and Date Table (TDT) at the specified table repetition
     *   interval.
     */
    public fun dvbTdtSettings(dvbTdtSettings: IResolvable) {
        cdkBuilder.dvbTdtSettings(dvbTdtSettings)
    }

    /**
     * @param dvbTdtSettings Inserts DVB Time and Date Table (TDT) at the specified table repetition
     *   interval.
     */
    public fun dvbTdtSettings(dvbTdtSettings: CfnChannel.DvbTdtSettingsProperty) {
        cdkBuilder.dvbTdtSettings(dvbTdtSettings)
    }

    /**
     * @param dvbTeletextPid The PID for the input source DVB Teletext data to this output. You can
     *   enter the value as a decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or
     *   0x1ff6).
     */
    public fun dvbTeletextPid(dvbTeletextPid: String) {
        cdkBuilder.dvbTeletextPid(dvbTeletextPid)
    }

    /**
     * @param ebif If set to passthrough, passes any EBIF data from the input source to this output.
     */
    public fun ebif(ebif: String) {
        cdkBuilder.ebif(ebif)
    }

    /**
     * @param ebpAudioInterval When videoAndFixedIntervals is selected, audio EBP markers are added
     *   to partitions 3 and 4. The interval between these additional markers is fixed, and is
     *   slightly shorter than the video EBP marker interval. This is only available when EBP
     *   Cablelabs segmentation markers are selected. Partitions 1 and 2 always follow the video
     *   interval.
     */
    public fun ebpAudioInterval(ebpAudioInterval: String) {
        cdkBuilder.ebpAudioInterval(ebpAudioInterval)
    }

    /**
     * @param ebpLookaheadMs When set, enforces that Encoder Boundary Points do not come within the
     *   specified time interval of each other by looking ahead at input video. If another EBP is
     *   going to come in within the specified time interval, the current EBP is not emitted, and
     *   the segment is "stretched" to the next marker. The lookahead value does not add latency to
     *   the system. The channel must be configured elsewhere to create sufficient latency to make
     *   the lookahead accurate.
     */
    public fun ebpLookaheadMs(ebpLookaheadMs: Number) {
        cdkBuilder.ebpLookaheadMs(ebpLookaheadMs)
    }

    /**
     * @param ebpPlacement Controls placement of EBP on audio PIDs. If set to videoAndAudioPids, EBP
     *   markers are placed on the video PID and all audio PIDs. If set to videoPid, EBP markers are
     *   placed on only the video PID.
     */
    public fun ebpPlacement(ebpPlacement: String) {
        cdkBuilder.ebpPlacement(ebpPlacement)
    }

    /** @param ecmPid This field is unused and deprecated. */
    public fun ecmPid(ecmPid: String) {
        cdkBuilder.ecmPid(ecmPid)
    }

    /** @param esRateInPes Includes or excludes the ES Rate field in the PES header. */
    public fun esRateInPes(esRateInPes: String) {
        cdkBuilder.esRateInPes(esRateInPes)
    }

    /**
     * @param etvPlatformPid The PID for the input source ETV Platform data to this output. You can
     *   enter it as a decimal or hexadecimal value. Valid values are 32 (or 0x20) to 8182 (or
     *   0x1ff6).
     */
    public fun etvPlatformPid(etvPlatformPid: String) {
        cdkBuilder.etvPlatformPid(etvPlatformPid)
    }

    /**
     * @param etvSignalPid The PID for input source ETV Signal data to this output. You can enter
     *   the value as a decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or
     *   0x1ff6).
     */
    public fun etvSignalPid(etvSignalPid: String) {
        cdkBuilder.etvSignalPid(etvSignalPid)
    }

    /**
     * @param fragmentTime The length in seconds of each fragment. This is used only with EBP
     *   markers.
     */
    public fun fragmentTime(fragmentTime: Number) {
        cdkBuilder.fragmentTime(fragmentTime)
    }

    /**
     * @param klv If set to passthrough, passes any KLV data from the input source to this output.
     */
    public fun klv(klv: String) {
        cdkBuilder.klv(klv)
    }

    /**
     * @param klvDataPids The PID for the input source KLV data to this output. Multiple values are
     *   accepted, and can be entered in ranges or by comma separation. You can enter the value as a
     *   decimal or hexadecimal value. Each PID specified must be in the range of 32 (or 0x20)..8182
     *   (or 0x1ff6).
     */
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
     * @param nullPacketBitrate The value, in bits per second, of extra null packets to insert into
     *   the transport stream. This can be used if a downstream encryption system requires periodic
     *   null packets.
     */
    public fun nullPacketBitrate(nullPacketBitrate: Number) {
        cdkBuilder.nullPacketBitrate(nullPacketBitrate)
    }

    /**
     * @param patInterval The number of milliseconds between instances of this table in the output
     *   transport stream. Valid values are 0, 10..1000.
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
     *   as a decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */
    public fun pcrPid(pcrPid: String) {
        cdkBuilder.pcrPid(pcrPid)
    }

    /**
     * @param pmtInterval The number of milliseconds between instances of this table in the output
     *   transport stream. Valid values are 0, 10..1000.
     */
    public fun pmtInterval(pmtInterval: Number) {
        cdkBuilder.pmtInterval(pmtInterval)
    }

    /**
     * @param pmtPid The PID for the Program Map Table (PMT) in the transport stream. You can enter
     *   the value as a decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or
     *   0x1ff6).
     */
    public fun pmtPid(pmtPid: String) {
        cdkBuilder.pmtPid(pmtPid)
    }

    /** @param programNum The value of the program number field in the Program Map Table (PMT). */
    public fun programNum(programNum: Number) {
        cdkBuilder.programNum(programNum)
    }

    /**
     * @param rateMode When VBR, does not insert null packets into the transport stream to fill the
     *   specified bitrate. The bitrate setting acts as the maximum bitrate when VBR is set.
     */
    public fun rateMode(rateMode: String) {
        cdkBuilder.rateMode(rateMode)
    }

    /**
     * @param scte27Pids The PID for the input source SCTE-27 data to this output. Multiple values
     *   are accepted, and can be entered in ranges or by comma separation. You can enter the value
     *   as a decimal or hexadecimal value. Each PID specified must be in the range of 32 (or
     *   0x20)..8182 (or 0x1ff6).
     */
    public fun scte27Pids(scte27Pids: String) {
        cdkBuilder.scte27Pids(scte27Pids)
    }

    /**
     * @param scte35Control Optionally passes SCTE-35 signals from the input source to this output.
     */
    public fun scte35Control(scte35Control: String) {
        cdkBuilder.scte35Control(scte35Control)
    }

    /**
     * @param scte35Pid The PID of the SCTE-35 stream in the transport stream. You can enter the
     *   value as a decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */
    public fun scte35Pid(scte35Pid: String) {
        cdkBuilder.scte35Pid(scte35Pid)
    }

    /** @param scte35PrerollPullupMilliseconds the value to be set. */
    public fun scte35PrerollPullupMilliseconds(scte35PrerollPullupMilliseconds: Number) {
        cdkBuilder.scte35PrerollPullupMilliseconds(scte35PrerollPullupMilliseconds)
    }

    /**
     * @param segmentationMarkers Inserts segmentation markers at each segmentationTime period.
     *   raiSegstart sets the Random Access Indicator bit in the adaptation field. raiAdapt sets the
     *   RAI bit and adds the current timecode in the private data bytes. psiSegstart inserts PAT
     *   and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the
     *   adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebpLegacy adds
     *   Encoder Boundary Point information to the adaptation field using a legacy proprietary
     *   format.
     */
    public fun segmentationMarkers(segmentationMarkers: String) {
        cdkBuilder.segmentationMarkers(segmentationMarkers)
    }

    /**
     * @param segmentationStyle The segmentation style parameter controls how segmentation markers
     *   are inserted into the transport stream. With avails, it is possible that segments might be
     *   truncated, which can influence where future segmentation markers are inserted. When a
     *   segmentation style of resetCadence is selected and a segment is truncated due to an avail,
     *   we will reset the segmentation cadence. This means the subsequent segment will have a
     *   duration of $segmentationTime seconds. When a segmentation style of maintainCadence is
     *   selected and a segment is truncated due to an avail, we will not reset the segmentation
     *   cadence. This means the subsequent segment will likely be truncated as well. However, all
     *   segments after that will have a duration of $segmentationTime seconds. Note that EBP
     *   lookahead is a slight exception to this rule.
     */
    public fun segmentationStyle(segmentationStyle: String) {
        cdkBuilder.segmentationStyle(segmentationStyle)
    }

    /**
     * @param segmentationTime The length, in seconds, of each segment. This is required unless
     *   markers is set to None_.
     */
    public fun segmentationTime(segmentationTime: Number) {
        cdkBuilder.segmentationTime(segmentationTime)
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
     *   the value as a decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or
     *   0x1ff6).
     */
    public fun videoPid(videoPid: String) {
        cdkBuilder.videoPid(videoPid)
    }

    public fun build(): CfnChannel.M2tsSettingsProperty = cdkBuilder.build()
}
