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
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for an HLS output group.
 *
 * The parent of this entity is OutputGroupSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * HlsGroupSettingsProperty hlsGroupSettingsProperty = HlsGroupSettingsProperty.builder()
 * .adMarkers(List.of("adMarkers"))
 * .baseUrlContent("baseUrlContent")
 * .baseUrlContent1("baseUrlContent1")
 * .baseUrlManifest("baseUrlManifest")
 * .baseUrlManifest1("baseUrlManifest1")
 * .captionLanguageMappings(List.of(CaptionLanguageMappingProperty.builder()
 * .captionChannel(123)
 * .languageCode("languageCode")
 * .languageDescription("languageDescription")
 * .build()))
 * .captionLanguageSetting("captionLanguageSetting")
 * .clientCache("clientCache")
 * .codecSpecification("codecSpecification")
 * .constantIv("constantIv")
 * .destination(OutputLocationRefProperty.builder()
 * .destinationRefId("destinationRefId")
 * .build())
 * .directoryStructure("directoryStructure")
 * .discontinuityTags("discontinuityTags")
 * .encryptionType("encryptionType")
 * .hlsCdnSettings(HlsCdnSettingsProperty.builder()
 * .hlsAkamaiSettings(HlsAkamaiSettingsProperty.builder()
 * .connectionRetryInterval(123)
 * .filecacheDuration(123)
 * .httpTransferMode("httpTransferMode")
 * .numRetries(123)
 * .restartDelay(123)
 * .salt("salt")
 * .token("token")
 * .build())
 * .hlsBasicPutSettings(HlsBasicPutSettingsProperty.builder()
 * .connectionRetryInterval(123)
 * .filecacheDuration(123)
 * .numRetries(123)
 * .restartDelay(123)
 * .build())
 * .hlsMediaStoreSettings(HlsMediaStoreSettingsProperty.builder()
 * .connectionRetryInterval(123)
 * .filecacheDuration(123)
 * .mediaStoreStorageClass("mediaStoreStorageClass")
 * .numRetries(123)
 * .restartDelay(123)
 * .build())
 * .hlsS3Settings(HlsS3SettingsProperty.builder()
 * .cannedAcl("cannedAcl")
 * .build())
 * .hlsWebdavSettings(HlsWebdavSettingsProperty.builder()
 * .connectionRetryInterval(123)
 * .filecacheDuration(123)
 * .httpTransferMode("httpTransferMode")
 * .numRetries(123)
 * .restartDelay(123)
 * .build())
 * .build())
 * .hlsId3SegmentTagging("hlsId3SegmentTagging")
 * .iFrameOnlyPlaylists("iFrameOnlyPlaylists")
 * .incompleteSegmentBehavior("incompleteSegmentBehavior")
 * .indexNSegments(123)
 * .inputLossAction("inputLossAction")
 * .ivInManifest("ivInManifest")
 * .ivSource("ivSource")
 * .keepSegments(123)
 * .keyFormat("keyFormat")
 * .keyFormatVersions("keyFormatVersions")
 * .keyProviderSettings(KeyProviderSettingsProperty.builder()
 * .staticKeySettings(StaticKeySettingsProperty.builder()
 * .keyProviderServer(InputLocationProperty.builder()
 * .passwordParam("passwordParam")
 * .uri("uri")
 * .username("username")
 * .build())
 * .staticKeyValue("staticKeyValue")
 * .build())
 * .build())
 * .manifestCompression("manifestCompression")
 * .manifestDurationFormat("manifestDurationFormat")
 * .minSegmentLength(123)
 * .mode("mode")
 * .outputSelection("outputSelection")
 * .programDateTime("programDateTime")
 * .programDateTimeClock("programDateTimeClock")
 * .programDateTimePeriod(123)
 * .redundantManifest("redundantManifest")
 * .segmentationMode("segmentationMode")
 * .segmentLength(123)
 * .segmentsPerSubdirectory(123)
 * .streamInfResolution("streamInfResolution")
 * .timedMetadataId3Frame("timedMetadataId3Frame")
 * .timedMetadataId3Period(123)
 * .timestampDeltaMilliseconds(123)
 * .tsFileMode("tsFileMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsgroupsettings.html)
 */
@CdkDslMarker
public class CfnChannelHlsGroupSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.HlsGroupSettingsProperty.Builder =
        CfnChannel.HlsGroupSettingsProperty.builder()

    private val _adMarkers: MutableList<String> = mutableListOf()

    private val _captionLanguageMappings: MutableList<Any> = mutableListOf()

    /**
     * @param adMarkers Chooses one or more ad marker types to pass SCTE35 signals through to this
     *   group of Apple HLS outputs.
     */
    public fun adMarkers(vararg adMarkers: String) {
        _adMarkers.addAll(listOf(*adMarkers))
    }

    /**
     * @param adMarkers Chooses one or more ad marker types to pass SCTE35 signals through to this
     *   group of Apple HLS outputs.
     */
    public fun adMarkers(adMarkers: Collection<String>) {
        _adMarkers.addAll(adMarkers)
    }

    /**
     * @param baseUrlContent A partial URI prefix that will be prepended to each output in the media
     *   .m3u8 file. The partial URI prefix can be used if the base manifest is delivered from a
     *   different URL than the main .m3u8 file.
     */
    public fun baseUrlContent(baseUrlContent: String) {
        cdkBuilder.baseUrlContent(baseUrlContent)
    }

    /**
     * @param baseUrlContent1 Optional. One value per output group. This field is required only if
     *   you are completing Base URL content A, and the downstream system has notified you that the
     *   media files for pipeline 1 of all outputs are in a location different from the media files
     *   for pipeline 0.
     */
    public fun baseUrlContent1(baseUrlContent1: String) {
        cdkBuilder.baseUrlContent1(baseUrlContent1)
    }

    /**
     * @param baseUrlManifest A partial URI prefix that will be prepended to each output in the
     *   media .m3u8 file. The partial URI prefix can be used if the base manifest is delivered from
     *   a different URL than the main .m3u8 file.
     */
    public fun baseUrlManifest(baseUrlManifest: String) {
        cdkBuilder.baseUrlManifest(baseUrlManifest)
    }

    /**
     * @param baseUrlManifest1 Optional. One value per output group. Complete this field only if you
     *   are completing Base URL manifest A, and the downstream system has notified you that the
     *   child manifest files for pipeline 1 of all outputs are in a location different from the
     *   child manifest files for pipeline 0.
     */
    public fun baseUrlManifest1(baseUrlManifest1: String) {
        cdkBuilder.baseUrlManifest1(baseUrlManifest1)
    }

    /**
     * @param captionLanguageMappings A mapping of up to 4 captions channels to captions languages.
     *   This is meaningful only if captionLanguageSetting is set to "insert."
     */
    public fun captionLanguageMappings(vararg captionLanguageMappings: Any) {
        _captionLanguageMappings.addAll(listOf(*captionLanguageMappings))
    }

    /**
     * @param captionLanguageMappings A mapping of up to 4 captions channels to captions languages.
     *   This is meaningful only if captionLanguageSetting is set to "insert."
     */
    public fun captionLanguageMappings(captionLanguageMappings: Collection<Any>) {
        _captionLanguageMappings.addAll(captionLanguageMappings)
    }

    /**
     * @param captionLanguageMappings A mapping of up to 4 captions channels to captions languages.
     *   This is meaningful only if captionLanguageSetting is set to "insert."
     */
    public fun captionLanguageMappings(captionLanguageMappings: IResolvable) {
        cdkBuilder.captionLanguageMappings(captionLanguageMappings)
    }

    /**
     * @param captionLanguageSetting Applies only to 608 embedded output captions. Insert: Include
     *   CLOSED-CAPTIONS lines in the manifest. Specify at least one language in the CC1 Language
     *   Code field. One CLOSED-CAPTION line is added for each Language Code that you specify. Make
     *   sure to specify the languages in the order in which they appear in the original source (if
     *   the source is embedded format) or the order of the captions selectors (if the source is
     *   other than embedded). Otherwise, languages in the manifest will not match properly with the
     *   output captions. None: Include the CLOSED-CAPTIONS=NONE line in the manifest. Omit: Omit
     *   any CLOSED-CAPTIONS line from the manifest.
     */
    public fun captionLanguageSetting(captionLanguageSetting: String) {
        cdkBuilder.captionLanguageSetting(captionLanguageSetting)
    }

    /**
     * @param clientCache When set to "disabled," sets the #EXT-X-ALLOW-CACHE:no tag in the
     *   manifest, which prevents clients from saving media segments for later replay.
     */
    public fun clientCache(clientCache: String) {
        cdkBuilder.clientCache(clientCache)
    }

    /**
     * @param codecSpecification The specification to use (RFC-6381 or the default RFC-4281) during
     *   m3u8 playlist generation.
     */
    public fun codecSpecification(codecSpecification: String) {
        cdkBuilder.codecSpecification(codecSpecification)
    }

    /**
     * @param constantIv Used with encryptionType. This is a 128-bit, 16-byte hex value that is
     *   represented by a 32-character text string. If ivSource is set to "explicit," this parameter
     *   is required and is used as the IV for encryption.
     */
    public fun constantIv(constantIv: String) {
        cdkBuilder.constantIv(constantIv)
    }

    /**
     * @param destination A directory or HTTP destination for the HLS segments, manifest files, and
     *   encryption keys (if enabled).
     */
    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    /**
     * @param destination A directory or HTTP destination for the HLS segments, manifest files, and
     *   encryption keys (if enabled).
     */
    public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
        cdkBuilder.destination(destination)
    }

    /** @param directoryStructure Places segments in subdirectories. */
    public fun directoryStructure(directoryStructure: String) {
        cdkBuilder.directoryStructure(directoryStructure)
    }

    /**
     * @param discontinuityTags Specifies whether to insert EXT-X-DISCONTINUITY tags in the HLS
     *   child manifests for this output group. Typically, choose Insert because these tags are
     *   required in the manifest (according to the HLS specification) and serve an important
     *   purpose. Choose Never Insert only if the downstream system is doing real-time failover
     *   (without using the MediaLive automatic failover feature) and only if that downstream system
     *   has advised you to exclude the tags.
     */
    public fun discontinuityTags(discontinuityTags: String) {
        cdkBuilder.discontinuityTags(discontinuityTags)
    }

    /**
     * @param encryptionType Encrypts the segments with the specified encryption scheme. Exclude
     *   this parameter if you don't want encryption.
     */
    public fun encryptionType(encryptionType: String) {
        cdkBuilder.encryptionType(encryptionType)
    }

    /** @param hlsCdnSettings The parameters that control interactions with the CDN. */
    public fun hlsCdnSettings(hlsCdnSettings: IResolvable) {
        cdkBuilder.hlsCdnSettings(hlsCdnSettings)
    }

    /** @param hlsCdnSettings The parameters that control interactions with the CDN. */
    public fun hlsCdnSettings(hlsCdnSettings: CfnChannel.HlsCdnSettingsProperty) {
        cdkBuilder.hlsCdnSettings(hlsCdnSettings)
    }

    /** @param hlsId3SegmentTagging State of HLS ID3 Segment Tagging. */
    public fun hlsId3SegmentTagging(hlsId3SegmentTagging: String) {
        cdkBuilder.hlsId3SegmentTagging(hlsId3SegmentTagging)
    }

    /**
     * @param iFrameOnlyPlaylists DISABLED: Don't create an I-frame-only manifest, but do create the
     *   master and media manifests (according to the Output Selection field). STANDARD: Create an
     *   I-frame-only manifest for each output that contains video, as well as the other manifests
     *   (according to the Output Selection field). The I-frame manifest contains a
     *
     * #EXT-X-I-FRAMES-ONLY tag to indicate it is I-frame only, and one or more #EXT-X-BYTERANGE
     * entries identifying the I-frame position. For example, #EXT-X-BYTERANGE:160364&#64;1461888".
     */
    public fun iFrameOnlyPlaylists(iFrameOnlyPlaylists: String) {
        cdkBuilder.iFrameOnlyPlaylists(iFrameOnlyPlaylists)
    }

    /**
     * @param incompleteSegmentBehavior Specifies whether to include the final (incomplete) segment
     *   in the media output when the pipeline stops producing output because of a channel stop, a
     *   channel pause or a loss of input to the pipeline. Auto means that MediaLive decides whether
     *   to include the final segment, depending on the channel class and the types of output
     *   groups. Suppress means to never include the incomplete segment. We recommend you choose
     *   Auto and let MediaLive control the behavior.
     */
    public fun incompleteSegmentBehavior(incompleteSegmentBehavior: String) {
        cdkBuilder.incompleteSegmentBehavior(incompleteSegmentBehavior)
    }

    /**
     * @param indexNSegments Applies only if the Mode field is LIVE. Specifies the maximum number of
     *   segments in the media manifest file. After this maximum, older segments are removed from
     *   the media manifest. This number must be less than or equal to the Keep Segments field.
     */
    public fun indexNSegments(indexNSegments: Number) {
        cdkBuilder.indexNSegments(indexNSegments)
    }

    /** @param inputLossAction A parameter that controls output group behavior on an input loss. */
    public fun inputLossAction(inputLossAction: String) {
        cdkBuilder.inputLossAction(inputLossAction)
    }

    /**
     * @param ivInManifest Used with encryptionType. The IV (initialization vector) is a 128-bit
     *   number used in conjunction with the key for encrypting blocks. If set to "include," the IV
     *   is listed in the manifest. Otherwise, the IV is not in the manifest.
     */
    public fun ivInManifest(ivInManifest: String) {
        cdkBuilder.ivInManifest(ivInManifest)
    }

    /**
     * @param ivSource Used with encryptionType. The IV (initialization vector) is a 128-bit number
     *   used in conjunction with the key for encrypting blocks. If this setting is
     *   "followsSegmentNumber," it causes the IV to change every segment (to match the segment
     *   number). If this is set to "explicit," you must enter a constantIv value.
     */
    public fun ivSource(ivSource: String) {
        cdkBuilder.ivSource(ivSource)
    }

    /**
     * @param keepSegments Applies only if the Mode field is LIVE. Specifies the number of media
     *   segments (.ts files) to retain in the destination directory.
     */
    public fun keepSegments(keepSegments: Number) {
        cdkBuilder.keepSegments(keepSegments)
    }

    /**
     * @param keyFormat Specifies how the key is represented in the resource identified by the URI.
     *   If the parameter is absent, an implicit value of "identity" is used. A reverse DNS string
     *   can also be specified.
     */
    public fun keyFormat(keyFormat: String) {
        cdkBuilder.keyFormat(keyFormat)
    }

    /**
     * @param keyFormatVersions Either a single positive integer version value or a slash-delimited
     *   list of version values (1/2/3).
     */
    public fun keyFormatVersions(keyFormatVersions: String) {
        cdkBuilder.keyFormatVersions(keyFormatVersions)
    }

    /** @param keyProviderSettings The key provider settings. */
    public fun keyProviderSettings(keyProviderSettings: IResolvable) {
        cdkBuilder.keyProviderSettings(keyProviderSettings)
    }

    /** @param keyProviderSettings The key provider settings. */
    public fun keyProviderSettings(keyProviderSettings: CfnChannel.KeyProviderSettingsProperty) {
        cdkBuilder.keyProviderSettings(keyProviderSettings)
    }

    /** @param manifestCompression When set to gzip, compresses HLS playlist. */
    public fun manifestCompression(manifestCompression: String) {
        cdkBuilder.manifestCompression(manifestCompression)
    }

    /**
     * @param manifestDurationFormat Indicates whether the output manifest should use a floating
     *   point or integer values for segment duration.
     */
    public fun manifestDurationFormat(manifestDurationFormat: String) {
        cdkBuilder.manifestDurationFormat(manifestDurationFormat)
    }

    /**
     * @param minSegmentLength When set, minimumSegmentLength is enforced by looking ahead and back
     *   within the specified range for a nearby avail and extending the segment size if needed.
     */
    public fun minSegmentLength(minSegmentLength: Number) {
        cdkBuilder.minSegmentLength(minSegmentLength)
    }

    /**
     * @param mode If "vod," all segments are indexed and kept permanently in the destination and
     *   manifest. If "live," only the number segments specified in keepSegments and indexNSegments
     *   are kept. Newer segments replace older segments, which might prevent players from rewinding
     *   all the way to the beginning of the channel. VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT
     *   while the channel is running, converting it to a "VOD" type manifest on completion of the
     *   stream.
     */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    /**
     * @param outputSelection MANIFESTSANDSEGMENTS: Generates manifests (the master manifest, if
     *   applicable, and media manifests) for this output group. SEGMENTSONLY: Doesn't generate any
     *   manifests for this output group.
     */
    public fun outputSelection(outputSelection: String) {
        cdkBuilder.outputSelection(outputSelection)
    }

    /**
     * @param programDateTime Includes or excludes the EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest
     *   files. The value is calculated as follows: Either the program date and time are initialized
     *   using the input timecode source, or the time is initialized using the input timecode source
     *   and the date is initialized using the timestampOffset.
     */
    public fun programDateTime(programDateTime: String) {
        cdkBuilder.programDateTime(programDateTime)
    }

    /** @param programDateTimeClock the value to be set. */
    public fun programDateTimeClock(programDateTimeClock: String) {
        cdkBuilder.programDateTimeClock(programDateTimeClock)
    }

    /**
     * @param programDateTimePeriod The period of insertion of the EXT-X-PROGRAM-DATE-TIME entry, in
     *   seconds.
     */
    public fun programDateTimePeriod(programDateTimePeriod: Number) {
        cdkBuilder.programDateTimePeriod(programDateTimePeriod)
    }

    /**
     * @param redundantManifest ENABLED: The master manifest (.m3u8 file) for each pipeline includes
     *   information about both pipelines: first its own media files, then the media files of the
     *   other pipeline. This feature allows a playout device that supports stale manifest detection
     *   to switch from one manifest to the other, when the current manifest seems to be stale.
     *   There are still two destinations and two master manifests, but both master manifests
     *   reference the media files from both pipelines. DISABLED: The master manifest (.m3u8 file)
     *   for each pipeline includes information about its own pipeline only. For an HLS output group
     *   with MediaPackage as the destination, the DISABLED behavior is always followed.
     *   MediaPackage regenerates the manifests it serves to players, so a redundant manifest from
     *   MediaLive is irrelevant.
     */
    public fun redundantManifest(redundantManifest: String) {
        cdkBuilder.redundantManifest(redundantManifest)
    }

    /**
     * @param segmentLength The length of the MPEG-2 Transport Stream segments to create, in
     *   seconds. Note that segments will end on the next keyframe after this number of seconds, so
     *   the actual segment length might be longer.
     */
    public fun segmentLength(segmentLength: Number) {
        cdkBuilder.segmentLength(segmentLength)
    }

    /**
     * @param segmentationMode useInputSegmentation has been deprecated. The configured segment size
     *   is always used.
     */
    public fun segmentationMode(segmentationMode: String) {
        cdkBuilder.segmentationMode(segmentationMode)
    }

    /**
     * @param segmentsPerSubdirectory The number of segments to write to a subdirectory before
     *   starting a new one. For this setting to have an effect, directoryStructure must be
     *   subdirectoryPerStream.
     */
    public fun segmentsPerSubdirectory(segmentsPerSubdirectory: Number) {
        cdkBuilder.segmentsPerSubdirectory(segmentsPerSubdirectory)
    }

    /**
     * @param streamInfResolution The include or exclude RESOLUTION attribute for a video in the
     *   EXT-X-STREAM-INF tag of a variant manifest.
     */
    public fun streamInfResolution(streamInfResolution: String) {
        cdkBuilder.streamInfResolution(streamInfResolution)
    }

    /** @param timedMetadataId3Frame Indicates the ID3 frame that has the timecode. */
    public fun timedMetadataId3Frame(timedMetadataId3Frame: String) {
        cdkBuilder.timedMetadataId3Frame(timedMetadataId3Frame)
    }

    /** @param timedMetadataId3Period The timed metadata interval, in seconds. */
    public fun timedMetadataId3Period(timedMetadataId3Period: Number) {
        cdkBuilder.timedMetadataId3Period(timedMetadataId3Period)
    }

    /**
     * @param timestampDeltaMilliseconds Provides an extra millisecond delta offset to fine tune the
     *   timestamps.
     */
    public fun timestampDeltaMilliseconds(timestampDeltaMilliseconds: Number) {
        cdkBuilder.timestampDeltaMilliseconds(timestampDeltaMilliseconds)
    }

    /**
     * @param tsFileMode SEGMENTEDFILES: Emits the program as segments -multiple .ts media files.
     *   SINGLEFILE: Applies only if the Mode field is VOD. Emits the program as a single .ts media
     *   file. The media manifest includes #EXT-X-BYTERANGE tags to index segments for playback. A
     *   typical use for this value is when sending the output to AWS Elemental MediaConvert, which
     *   can accept only a single media file. Playback while the channel is running is not
     *   guaranteed due to HTTP server caching.
     */
    public fun tsFileMode(tsFileMode: String) {
        cdkBuilder.tsFileMode(tsFileMode)
    }

    public fun build(): CfnChannel.HlsGroupSettingsProperty {
        if (_adMarkers.isNotEmpty()) cdkBuilder.adMarkers(_adMarkers)
        if (_captionLanguageMappings.isNotEmpty())
            cdkBuilder.captionLanguageMappings(_captionLanguageMappings)
        return cdkBuilder.build()
    }
}
