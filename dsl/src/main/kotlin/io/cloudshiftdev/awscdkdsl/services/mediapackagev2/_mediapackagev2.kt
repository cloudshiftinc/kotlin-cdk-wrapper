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

package io.cloudshiftdev.awscdkdsl.services.mediapackagev2

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackagev2.CfnChannel
import software.amazon.awscdk.services.mediapackagev2.CfnChannelGroup
import software.amazon.awscdk.services.mediapackagev2.CfnChannelGroupProps
import software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicy
import software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps
import software.amazon.awscdk.services.mediapackagev2.CfnChannelProps
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicy
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps
import software.constructs.Construct

public object mediapackagev2 {
    /**
     * Creates a channel to receive content.
     *
     * After it's created, a channel provides static input URLs. These URLs remain the same
     * throughout the lifetime of the channel, regardless of any failures or upgrades that might
     * occur. Use these URLs to configure the outputs of your upstream encoder.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * CfnChannel cfnChannel = CfnChannel.Builder.create(this, "MyCfnChannel")
     * .channelGroupName("channelGroupName")
     * .channelName("channelName")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html)
     */
    public inline fun cfnChannel(
        scope: Construct,
        id: String,
        block: CfnChannelDsl.() -> Unit = {},
    ): CfnChannel {
        val builder = CfnChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuraiton for a MediaPackage V2 channel group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * CfnChannelGroup cfnChannelGroup = CfnChannelGroup.Builder.create(this, "MyCfnChannelGroup")
     * .channelGroupName("channelGroupName")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html)
     */
    public inline fun cfnChannelGroup(
        scope: Construct,
        id: String,
        block: CfnChannelGroupDsl.() -> Unit = {},
    ): CfnChannelGroup {
        val builder = CfnChannelGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnChannelGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * CfnChannelGroupProps cfnChannelGroupProps = CfnChannelGroupProps.builder()
     * .channelGroupName("channelGroupName")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html)
     */
    public inline fun cfnChannelGroupProps(
        block: CfnChannelGroupPropsDsl.() -> Unit = {}
    ): CfnChannelGroupProps {
        val builder = CfnChannelGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The input URL where the source stream should be sent.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * IngestEndpointProperty ingestEndpointProperty = IngestEndpointProperty.builder()
     * .id("id")
     * .url("url")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-channel-ingestendpoint.html)
     */
    public inline fun cfnChannelIngestEndpointProperty(
        block: CfnChannelIngestEndpointPropertyDsl.() -> Unit = {}
    ): CfnChannel.IngestEndpointProperty {
        val builder = CfnChannelIngestEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration parameters of a MediaPackage V2 channel policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * Object policy;
     * CfnChannelPolicy cfnChannelPolicy = CfnChannelPolicy.Builder.create(this, "MyCfnChannelPolicy")
     * .channelGroupName("channelGroupName")
     * .channelName("channelName")
     * .policy(policy)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelpolicy.html)
     */
    public inline fun cfnChannelPolicy(
        scope: Construct,
        id: String,
        block: CfnChannelPolicyDsl.() -> Unit = {},
    ): CfnChannelPolicy {
        val builder = CfnChannelPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnChannelPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * Object policy;
     * CfnChannelPolicyProps cfnChannelPolicyProps = CfnChannelPolicyProps.builder()
     * .channelGroupName("channelGroupName")
     * .channelName("channelName")
     * .policy(policy)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelpolicy.html)
     */
    public inline fun cfnChannelPolicyProps(
        block: CfnChannelPolicyPropsDsl.() -> Unit = {}
    ): CfnChannelPolicyProps {
        val builder = CfnChannelPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * CfnChannelProps cfnChannelProps = CfnChannelProps.builder()
     * .channelGroupName("channelGroupName")
     * .channelName("channelName")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html)
     */
    public inline fun cfnChannelProps(block: CfnChannelPropsDsl.() -> Unit = {}): CfnChannelProps {
        val builder = CfnChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration parameters for a MediaPackage V2 origin endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * CfnOriginEndpoint cfnOriginEndpoint = CfnOriginEndpoint.Builder.create(this,
     * "MyCfnOriginEndpoint")
     * .channelGroupName("channelGroupName")
     * .channelName("channelName")
     * .originEndpointName("originEndpointName")
     * // the properties below are optional
     * .containerType("containerType")
     * .description("description")
     * .hlsManifests(List.of(HlsManifestConfigurationProperty.builder()
     * .manifestName("manifestName")
     * // the properties below are optional
     * .childManifestName("childManifestName")
     * .filterConfiguration(FilterConfigurationProperty.builder()
     * .end("end")
     * .manifestFilter("manifestFilter")
     * .start("start")
     * .timeDelaySeconds(123)
     * .build())
     * .manifestWindowSeconds(123)
     * .programDateTimeIntervalSeconds(123)
     * .scteHls(ScteHlsProperty.builder()
     * .adMarkerHls("adMarkerHls")
     * .build())
     * .url("url")
     * .build()))
     * .lowLatencyHlsManifests(List.of(LowLatencyHlsManifestConfigurationProperty.builder()
     * .manifestName("manifestName")
     * // the properties below are optional
     * .childManifestName("childManifestName")
     * .filterConfiguration(FilterConfigurationProperty.builder()
     * .end("end")
     * .manifestFilter("manifestFilter")
     * .start("start")
     * .timeDelaySeconds(123)
     * .build())
     * .manifestWindowSeconds(123)
     * .programDateTimeIntervalSeconds(123)
     * .scteHls(ScteHlsProperty.builder()
     * .adMarkerHls("adMarkerHls")
     * .build())
     * .url("url")
     * .build()))
     * .segment(SegmentProperty.builder()
     * .encryption(EncryptionProperty.builder()
     * .encryptionMethod(EncryptionMethodProperty.builder()
     * .cmafEncryptionMethod("cmafEncryptionMethod")
     * .tsEncryptionMethod("tsEncryptionMethod")
     * .build())
     * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
     * .drmSystems(List.of("drmSystems"))
     * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
     * .presetSpeke20Audio("presetSpeke20Audio")
     * .presetSpeke20Video("presetSpeke20Video")
     * .build())
     * .resourceId("resourceId")
     * .roleArn("roleArn")
     * .url("url")
     * .build())
     * // the properties below are optional
     * .constantInitializationVector("constantInitializationVector")
     * .keyRotationIntervalSeconds(123)
     * .build())
     * .includeIframeOnlyStreams(false)
     * .scte(ScteProperty.builder()
     * .scteFilter(List.of("scteFilter"))
     * .build())
     * .segmentDurationSeconds(123)
     * .segmentName("segmentName")
     * .tsIncludeDvbSubtitles(false)
     * .tsUseAudioRenditionGroup(false)
     * .build())
     * .startoverWindowSeconds(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html)
     */
    public inline fun cfnOriginEndpoint(
        scope: Construct,
        id: String,
        block: CfnOriginEndpointDsl.() -> Unit = {},
    ): CfnOriginEndpoint {
        val builder = CfnOriginEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use `encryptionContractConfiguration` to configure one or more content encryption keys for
     * your endpoints that use SPEKE Version 2.0. The encryption contract defines which content keys
     * are used to encrypt the audio and video tracks in your stream. To configure the encryption
     * contract, specify which audio and video encryption presets to use.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * EncryptionContractConfigurationProperty encryptionContractConfigurationProperty =
     * EncryptionContractConfigurationProperty.builder()
     * .presetSpeke20Audio("presetSpeke20Audio")
     * .presetSpeke20Video("presetSpeke20Video")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryptioncontractconfiguration.html)
     */
    public inline fun cfnOriginEndpointEncryptionContractConfigurationProperty(
        block: CfnOriginEndpointEncryptionContractConfigurationPropertyDsl.() -> Unit = {}
    ): CfnOriginEndpoint.EncryptionContractConfigurationProperty {
        val builder = CfnOriginEndpointEncryptionContractConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The encryption method associated with the origin endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * EncryptionMethodProperty encryptionMethodProperty = EncryptionMethodProperty.builder()
     * .cmafEncryptionMethod("cmafEncryptionMethod")
     * .tsEncryptionMethod("tsEncryptionMethod")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryptionmethod.html)
     */
    public inline fun cfnOriginEndpointEncryptionMethodProperty(
        block: CfnOriginEndpointEncryptionMethodPropertyDsl.() -> Unit = {}
    ): CfnOriginEndpoint.EncryptionMethodProperty {
        val builder = CfnOriginEndpointEncryptionMethodPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of video encryption presets.
     *
     * Value description:
     * * `PRESET-VIDEO-1` - Use one content key to encrypt all of the video tracks in your stream.
     * * `PRESET-VIDEO-2` - Use one content key to encrypt all of the SD video tracks and one
     *   content key for all HD and higher resolutions video tracks.
     * * `PRESET-VIDEO-3` - Use one content key to encrypt all of the SD video tracks, one content
     *   key for HD video tracks and one content key for all UHD video tracks.
     * * `PRESET-VIDEO-4` - Use one content key to encrypt all of the SD video tracks, one content
     *   key for HD video tracks, one content key for all UHD1 video tracks and one content key for
     *   all UHD2 video tracks.
     * * `PRESET-VIDEO-5` - Use one content key to encrypt all of the SD video tracks, one content
     *   key for HD1 video tracks, one content key for HD2 video tracks, one content key for all
     *   UHD1 video tracks and one content key for all UHD2 video tracks.
     * * `PRESET-VIDEO-6` - Use one content key to encrypt all of the SD video tracks, one content
     *   key for HD1 video tracks, one content key for HD2 video tracks and one content key for all
     *   UHD video tracks.
     * * `PRESET-VIDEO-7` - Use one content key to encrypt all of the SD+HD1 video tracks, one
     *   content key for HD2 video tracks and one content key for all UHD video tracks.
     * * `PRESET-VIDEO-8` - Use one content key to encrypt all of the SD+HD1 video tracks, one
     *   content key for HD2 video tracks, one content key for all UHD1 video tracks and one content
     *   key for all UHD2 video tracks.
     * * `SHARED` - Use the same content key for all of the video and audio tracks in your stream.
     * * `UNENCRYPTED` - Don't encrypt any of the video tracks in your stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * EncryptionProperty encryptionProperty = EncryptionProperty.builder()
     * .encryptionMethod(EncryptionMethodProperty.builder()
     * .cmafEncryptionMethod("cmafEncryptionMethod")
     * .tsEncryptionMethod("tsEncryptionMethod")
     * .build())
     * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
     * .drmSystems(List.of("drmSystems"))
     * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
     * .presetSpeke20Audio("presetSpeke20Audio")
     * .presetSpeke20Video("presetSpeke20Video")
     * .build())
     * .resourceId("resourceId")
     * .roleArn("roleArn")
     * .url("url")
     * .build())
     * // the properties below are optional
     * .constantInitializationVector("constantInitializationVector")
     * .keyRotationIntervalSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryption.html)
     */
    public inline fun cfnOriginEndpointEncryptionProperty(
        block: CfnOriginEndpointEncryptionPropertyDsl.() -> Unit = {}
    ): CfnOriginEndpoint.EncryptionProperty {
        val builder = CfnOriginEndpointEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Filter configuration includes settings for manifest filtering, start and end times, and time
     * delay that apply to all of your egress requests for this manifest.
     *
     * </p>
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * FilterConfigurationProperty filterConfigurationProperty = FilterConfigurationProperty.builder()
     * .end("end")
     * .manifestFilter("manifestFilter")
     * .start("start")
     * .timeDelaySeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html)
     */
    public inline fun cfnOriginEndpointFilterConfigurationProperty(
        block: CfnOriginEndpointFilterConfigurationPropertyDsl.() -> Unit = {}
    ): CfnOriginEndpoint.FilterConfigurationProperty {
        val builder = CfnOriginEndpointFilterConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The HLS manfiest configuration associated with the origin endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * HlsManifestConfigurationProperty hlsManifestConfigurationProperty =
     * HlsManifestConfigurationProperty.builder()
     * .manifestName("manifestName")
     * // the properties below are optional
     * .childManifestName("childManifestName")
     * .filterConfiguration(FilterConfigurationProperty.builder()
     * .end("end")
     * .manifestFilter("manifestFilter")
     * .start("start")
     * .timeDelaySeconds(123)
     * .build())
     * .manifestWindowSeconds(123)
     * .programDateTimeIntervalSeconds(123)
     * .scteHls(ScteHlsProperty.builder()
     * .adMarkerHls("adMarkerHls")
     * .build())
     * .url("url")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html)
     */
    public inline fun cfnOriginEndpointHlsManifestConfigurationProperty(
        block: CfnOriginEndpointHlsManifestConfigurationPropertyDsl.() -> Unit = {}
    ): CfnOriginEndpoint.HlsManifestConfigurationProperty {
        val builder = CfnOriginEndpointHlsManifestConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specify a low-latency HTTP live streaming (LL-HLS) manifest configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * LowLatencyHlsManifestConfigurationProperty lowLatencyHlsManifestConfigurationProperty =
     * LowLatencyHlsManifestConfigurationProperty.builder()
     * .manifestName("manifestName")
     * // the properties below are optional
     * .childManifestName("childManifestName")
     * .filterConfiguration(FilterConfigurationProperty.builder()
     * .end("end")
     * .manifestFilter("manifestFilter")
     * .start("start")
     * .timeDelaySeconds(123)
     * .build())
     * .manifestWindowSeconds(123)
     * .programDateTimeIntervalSeconds(123)
     * .scteHls(ScteHlsProperty.builder()
     * .adMarkerHls("adMarkerHls")
     * .build())
     * .url("url")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html)
     */
    public inline fun cfnOriginEndpointLowLatencyHlsManifestConfigurationProperty(
        block: CfnOriginEndpointLowLatencyHlsManifestConfigurationPropertyDsl.() -> Unit = {}
    ): CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty {
        val builder = CfnOriginEndpointLowLatencyHlsManifestConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration parameters of a policy associated with a MediaPackage V2 origin
     * endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * Object policy;
     * CfnOriginEndpointPolicy cfnOriginEndpointPolicy = CfnOriginEndpointPolicy.Builder.create(this,
     * "MyCfnOriginEndpointPolicy")
     * .channelGroupName("channelGroupName")
     * .channelName("channelName")
     * .originEndpointName("originEndpointName")
     * .policy(policy)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html)
     */
    public inline fun cfnOriginEndpointPolicy(
        scope: Construct,
        id: String,
        block: CfnOriginEndpointPolicyDsl.() -> Unit = {},
    ): CfnOriginEndpointPolicy {
        val builder = CfnOriginEndpointPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnOriginEndpointPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * Object policy;
     * CfnOriginEndpointPolicyProps cfnOriginEndpointPolicyProps =
     * CfnOriginEndpointPolicyProps.builder()
     * .channelGroupName("channelGroupName")
     * .channelName("channelName")
     * .originEndpointName("originEndpointName")
     * .policy(policy)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html)
     */
    public inline fun cfnOriginEndpointPolicyProps(
        block: CfnOriginEndpointPolicyPropsDsl.() -> Unit = {}
    ): CfnOriginEndpointPolicyProps {
        val builder = CfnOriginEndpointPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnOriginEndpoint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * CfnOriginEndpointProps cfnOriginEndpointProps = CfnOriginEndpointProps.builder()
     * .channelGroupName("channelGroupName")
     * .channelName("channelName")
     * .originEndpointName("originEndpointName")
     * // the properties below are optional
     * .containerType("containerType")
     * .description("description")
     * .hlsManifests(List.of(HlsManifestConfigurationProperty.builder()
     * .manifestName("manifestName")
     * // the properties below are optional
     * .childManifestName("childManifestName")
     * .filterConfiguration(FilterConfigurationProperty.builder()
     * .end("end")
     * .manifestFilter("manifestFilter")
     * .start("start")
     * .timeDelaySeconds(123)
     * .build())
     * .manifestWindowSeconds(123)
     * .programDateTimeIntervalSeconds(123)
     * .scteHls(ScteHlsProperty.builder()
     * .adMarkerHls("adMarkerHls")
     * .build())
     * .url("url")
     * .build()))
     * .lowLatencyHlsManifests(List.of(LowLatencyHlsManifestConfigurationProperty.builder()
     * .manifestName("manifestName")
     * // the properties below are optional
     * .childManifestName("childManifestName")
     * .filterConfiguration(FilterConfigurationProperty.builder()
     * .end("end")
     * .manifestFilter("manifestFilter")
     * .start("start")
     * .timeDelaySeconds(123)
     * .build())
     * .manifestWindowSeconds(123)
     * .programDateTimeIntervalSeconds(123)
     * .scteHls(ScteHlsProperty.builder()
     * .adMarkerHls("adMarkerHls")
     * .build())
     * .url("url")
     * .build()))
     * .segment(SegmentProperty.builder()
     * .encryption(EncryptionProperty.builder()
     * .encryptionMethod(EncryptionMethodProperty.builder()
     * .cmafEncryptionMethod("cmafEncryptionMethod")
     * .tsEncryptionMethod("tsEncryptionMethod")
     * .build())
     * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
     * .drmSystems(List.of("drmSystems"))
     * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
     * .presetSpeke20Audio("presetSpeke20Audio")
     * .presetSpeke20Video("presetSpeke20Video")
     * .build())
     * .resourceId("resourceId")
     * .roleArn("roleArn")
     * .url("url")
     * .build())
     * // the properties below are optional
     * .constantInitializationVector("constantInitializationVector")
     * .keyRotationIntervalSeconds(123)
     * .build())
     * .includeIframeOnlyStreams(false)
     * .scte(ScteProperty.builder()
     * .scteFilter(List.of("scteFilter"))
     * .build())
     * .segmentDurationSeconds(123)
     * .segmentName("segmentName")
     * .tsIncludeDvbSubtitles(false)
     * .tsUseAudioRenditionGroup(false)
     * .build())
     * .startoverWindowSeconds(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html)
     */
    public inline fun cfnOriginEndpointProps(
        block: CfnOriginEndpointPropsDsl.() -> Unit = {}
    ): CfnOriginEndpointProps {
        val builder = CfnOriginEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The SCTE-35 HLS configuration associated with the origin endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * ScteHlsProperty scteHlsProperty = ScteHlsProperty.builder()
     * .adMarkerHls("adMarkerHls")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-sctehls.html)
     */
    public inline fun cfnOriginEndpointScteHlsProperty(
        block: CfnOriginEndpointScteHlsPropertyDsl.() -> Unit = {}
    ): CfnOriginEndpoint.ScteHlsProperty {
        val builder = CfnOriginEndpointScteHlsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The SCTE-35 configuration associated with the origin endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * ScteProperty scteProperty = ScteProperty.builder()
     * .scteFilter(List.of("scteFilter"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-scte.html)
     */
    public inline fun cfnOriginEndpointScteProperty(
        block: CfnOriginEndpointSctePropertyDsl.() -> Unit = {}
    ): CfnOriginEndpoint.ScteProperty {
        val builder = CfnOriginEndpointSctePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The segment configuration, including the segment name, duration, and other configuration
     * values.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * SegmentProperty segmentProperty = SegmentProperty.builder()
     * .encryption(EncryptionProperty.builder()
     * .encryptionMethod(EncryptionMethodProperty.builder()
     * .cmafEncryptionMethod("cmafEncryptionMethod")
     * .tsEncryptionMethod("tsEncryptionMethod")
     * .build())
     * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
     * .drmSystems(List.of("drmSystems"))
     * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
     * .presetSpeke20Audio("presetSpeke20Audio")
     * .presetSpeke20Video("presetSpeke20Video")
     * .build())
     * .resourceId("resourceId")
     * .roleArn("roleArn")
     * .url("url")
     * .build())
     * // the properties below are optional
     * .constantInitializationVector("constantInitializationVector")
     * .keyRotationIntervalSeconds(123)
     * .build())
     * .includeIframeOnlyStreams(false)
     * .scte(ScteProperty.builder()
     * .scteFilter(List.of("scteFilter"))
     * .build())
     * .segmentDurationSeconds(123)
     * .segmentName("segmentName")
     * .tsIncludeDvbSubtitles(false)
     * .tsUseAudioRenditionGroup(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html)
     */
    public inline fun cfnOriginEndpointSegmentProperty(
        block: CfnOriginEndpointSegmentPropertyDsl.() -> Unit = {}
    ): CfnOriginEndpoint.SegmentProperty {
        val builder = CfnOriginEndpointSegmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters for the SPEKE key provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediapackagev2.*;
     * SpekeKeyProviderProperty spekeKeyProviderProperty = SpekeKeyProviderProperty.builder()
     * .drmSystems(List.of("drmSystems"))
     * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
     * .presetSpeke20Audio("presetSpeke20Audio")
     * .presetSpeke20Video("presetSpeke20Video")
     * .build())
     * .resourceId("resourceId")
     * .roleArn("roleArn")
     * .url("url")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-spekekeyprovider.html)
     */
    public inline fun cfnOriginEndpointSpekeKeyProviderProperty(
        block: CfnOriginEndpointSpekeKeyProviderPropertyDsl.() -> Unit = {}
    ): CfnOriginEndpoint.SpekeKeyProviderProperty {
        val builder = CfnOriginEndpointSpekeKeyProviderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
