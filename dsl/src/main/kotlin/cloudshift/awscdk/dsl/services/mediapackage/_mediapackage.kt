@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnAsset
import software.amazon.awscdk.services.mediapackage.CfnAssetProps
import software.amazon.awscdk.services.mediapackage.CfnChannel
import software.amazon.awscdk.services.mediapackage.CfnChannelProps
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroup
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps
import software.constructs.Construct

public object mediapackage {
  /**
   * Creates an asset to ingest VOD content.
   *
   * After it's created, the asset starts ingesting content and generates playback URLs for the
   * packaging configurations associated with it. When ingest is complete, downstream devices use the
   * appropriate URL to request VOD content from AWS Elemental MediaPackage .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * CfnAsset cfnAsset = CfnAsset.Builder.create(this, "MyCfnAsset")
   * .id("id")
   * .packagingGroupId("packagingGroupId")
   * .sourceArn("sourceArn")
   * .sourceRoleArn("sourceRoleArn")
   * // the properties below are optional
   * .egressEndpoints(List.of(EgressEndpointProperty.builder()
   * .packagingConfigurationId("packagingConfigurationId")
   * .url("url")
   * .build()))
   * .resourceId("resourceId")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html)
   */
  public inline fun cfnAsset(
    scope: Construct,
    id: String,
    block: CfnAssetDsl.() -> Unit = {},
  ): CfnAsset {
    val builder = CfnAssetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The playback endpoint for a packaging configuration on an asset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * EgressEndpointProperty egressEndpointProperty = EgressEndpointProperty.builder()
   * .packagingConfigurationId("packagingConfigurationId")
   * .url("url")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-asset-egressendpoint.html)
   */
  public inline
      fun cfnAssetEgressEndpointProperty(block: CfnAssetEgressEndpointPropertyDsl.() -> Unit = {}):
      CfnAsset.EgressEndpointProperty {
    val builder = CfnAssetEgressEndpointPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnAsset`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * CfnAssetProps cfnAssetProps = CfnAssetProps.builder()
   * .id("id")
   * .packagingGroupId("packagingGroupId")
   * .sourceArn("sourceArn")
   * .sourceRoleArn("sourceRoleArn")
   * // the properties below are optional
   * .egressEndpoints(List.of(EgressEndpointProperty.builder()
   * .packagingConfigurationId("packagingConfigurationId")
   * .url("url")
   * .build()))
   * .resourceId("resourceId")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html)
   */
  public inline fun cfnAssetProps(block: CfnAssetPropsDsl.() -> Unit = {}): CfnAssetProps {
    val builder = CfnAssetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a channel to receive content.
   *
   * After it's created, a channel provides static input URLs. These URLs remain the same throughout
   * the lifetime of the channel, regardless of any failures or upgrades that might occur. Use these
   * URLs to configure the outputs of your upstream encoder.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * CfnChannel cfnChannel = CfnChannel.Builder.create(this, "MyCfnChannel")
   * .id("id")
   * // the properties below are optional
   * .description("description")
   * .egressAccessLogs(LogConfigurationProperty.builder()
   * .logGroupName("logGroupName")
   * .build())
   * .hlsIngest(HlsIngestProperty.builder()
   * .ingestEndpoints(List.of(IngestEndpointProperty.builder()
   * .id("id")
   * .password("password")
   * .url("url")
   * .username("username")
   * .build()))
   * .build())
   * .ingressAccessLogs(LogConfigurationProperty.builder()
   * .logGroupName("logGroupName")
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html)
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
   * HLS ingest configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * HlsIngestProperty hlsIngestProperty = HlsIngestProperty.builder()
   * .ingestEndpoints(List.of(IngestEndpointProperty.builder()
   * .id("id")
   * .password("password")
   * .url("url")
   * .username("username")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-hlsingest.html)
   */
  public inline fun cfnChannelHlsIngestProperty(block: CfnChannelHlsIngestPropertyDsl.() -> Unit =
      {}): CfnChannel.HlsIngestProperty {
    val builder = CfnChannelHlsIngestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An endpoint for ingesting source content for a channel.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * IngestEndpointProperty ingestEndpointProperty = IngestEndpointProperty.builder()
   * .id("id")
   * .password("password")
   * .url("url")
   * .username("username")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-ingestendpoint.html)
   */
  public inline
      fun cfnChannelIngestEndpointProperty(block: CfnChannelIngestEndpointPropertyDsl.() -> Unit =
      {}): CfnChannel.IngestEndpointProperty {
    val builder = CfnChannelIngestEndpointPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The access log configuration parameters for your channel.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * LogConfigurationProperty logConfigurationProperty = LogConfigurationProperty.builder()
   * .logGroupName("logGroupName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-logconfiguration.html)
   */
  public inline
      fun cfnChannelLogConfigurationProperty(block: CfnChannelLogConfigurationPropertyDsl.() -> Unit
      = {}): CfnChannel.LogConfigurationProperty {
    val builder = CfnChannelLogConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnChannel`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * CfnChannelProps cfnChannelProps = CfnChannelProps.builder()
   * .id("id")
   * // the properties below are optional
   * .description("description")
   * .egressAccessLogs(LogConfigurationProperty.builder()
   * .logGroupName("logGroupName")
   * .build())
   * .hlsIngest(HlsIngestProperty.builder()
   * .ingestEndpoints(List.of(IngestEndpointProperty.builder()
   * .id("id")
   * .password("password")
   * .url("url")
   * .username("username")
   * .build()))
   * .build())
   * .ingressAccessLogs(LogConfigurationProperty.builder()
   * .logGroupName("logGroupName")
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html)
   */
  public inline fun cfnChannelProps(block: CfnChannelPropsDsl.() -> Unit = {}): CfnChannelProps {
    val builder = CfnChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Create an endpoint on an AWS Elemental MediaPackage channel.
   *
   * An endpoint represents a single delivery point of a channel, and defines content output
   * handling through various components, such as packaging protocols, DRM and encryption integration,
   * and more.
   *
   * After it's created, an endpoint provides a fixed public URL. This URL remains the same
   * throughout the lifetime of the endpoint, regardless of any failures or upgrades that might occur.
   * Integrate the URL with a downstream CDN (such as Amazon CloudFront) or playback device.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * CfnOriginEndpoint cfnOriginEndpoint = CfnOriginEndpoint.Builder.create(this,
   * "MyCfnOriginEndpoint")
   * .channelId("channelId")
   * .id("id")
   * // the properties below are optional
   * .authorization(AuthorizationProperty.builder()
   * .cdnIdentifierSecret("cdnIdentifierSecret")
   * .secretsRoleArn("secretsRoleArn")
   * .build())
   * .cmafPackage(CmafPackageProperty.builder()
   * .encryption(CmafEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .constantInitializationVector("constantInitializationVector")
   * .encryptionMethod("encryptionMethod")
   * .keyRotationIntervalSeconds(123)
   * .build())
   * .hlsManifests(List.of(HlsManifestProperty.builder()
   * .id("id")
   * // the properties below are optional
   * .adMarkers("adMarkers")
   * .adsOnDeliveryRestrictions("adsOnDeliveryRestrictions")
   * .adTriggers(List.of("adTriggers"))
   * .includeIframeOnlyStream(false)
   * .manifestName("manifestName")
   * .playlistType("playlistType")
   * .playlistWindowSeconds(123)
   * .programDateTimeIntervalSeconds(123)
   * .url("url")
   * .build()))
   * .segmentDurationSeconds(123)
   * .segmentPrefix("segmentPrefix")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build())
   * .dashPackage(DashPackageProperty.builder()
   * .adsOnDeliveryRestrictions("adsOnDeliveryRestrictions")
   * .adTriggers(List.of("adTriggers"))
   * .encryption(DashEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .keyRotationIntervalSeconds(123)
   * .build())
   * .includeIframeOnlyStream(false)
   * .manifestLayout("manifestLayout")
   * .manifestWindowSeconds(123)
   * .minBufferTimeSeconds(123)
   * .minUpdatePeriodSeconds(123)
   * .periodTriggers(List.of("periodTriggers"))
   * .profile("profile")
   * .segmentDurationSeconds(123)
   * .segmentTemplateFormat("segmentTemplateFormat")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .suggestedPresentationDelaySeconds(123)
   * .utcTiming("utcTiming")
   * .utcTimingUri("utcTimingUri")
   * .build())
   * .description("description")
   * .hlsPackage(HlsPackageProperty.builder()
   * .adMarkers("adMarkers")
   * .adsOnDeliveryRestrictions("adsOnDeliveryRestrictions")
   * .adTriggers(List.of("adTriggers"))
   * .encryption(HlsEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .constantInitializationVector("constantInitializationVector")
   * .encryptionMethod("encryptionMethod")
   * .keyRotationIntervalSeconds(123)
   * .repeatExtXKey(false)
   * .build())
   * .includeDvbSubtitles(false)
   * .includeIframeOnlyStream(false)
   * .playlistType("playlistType")
   * .playlistWindowSeconds(123)
   * .programDateTimeIntervalSeconds(123)
   * .segmentDurationSeconds(123)
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .useAudioRenditionGroup(false)
   * .build())
   * .manifestName("manifestName")
   * .mssPackage(MssPackageProperty.builder()
   * .encryption(MssEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build())
   * .manifestWindowSeconds(123)
   * .segmentDurationSeconds(123)
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build())
   * .origination("origination")
   * .startoverWindowSeconds(123)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .timeDelaySeconds(123)
   * .whitelist(List.of("whitelist"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html)
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
   * Parameters for enabling CDN authorization on the endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * AuthorizationProperty authorizationProperty = AuthorizationProperty.builder()
   * .cdnIdentifierSecret("cdnIdentifierSecret")
   * .secretsRoleArn("secretsRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-authorization.html)
   */
  public inline
      fun cfnOriginEndpointAuthorizationProperty(block: CfnOriginEndpointAuthorizationPropertyDsl.() -> Unit
      = {}): CfnOriginEndpoint.AuthorizationProperty {
    val builder = CfnOriginEndpointAuthorizationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Holds encryption information so that access to the content can be controlled by a DRM solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * CmafEncryptionProperty cmafEncryptionProperty = CmafEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .constantInitializationVector("constantInitializationVector")
   * .encryptionMethod("encryptionMethod")
   * .keyRotationIntervalSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafencryption.html)
   */
  public inline
      fun cfnOriginEndpointCmafEncryptionProperty(block: CfnOriginEndpointCmafEncryptionPropertyDsl.() -> Unit
      = {}): CfnOriginEndpoint.CmafEncryptionProperty {
    val builder = CfnOriginEndpointCmafEncryptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Parameters for Common Media Application Format (CMAF) packaging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * CmafPackageProperty cmafPackageProperty = CmafPackageProperty.builder()
   * .encryption(CmafEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .constantInitializationVector("constantInitializationVector")
   * .encryptionMethod("encryptionMethod")
   * .keyRotationIntervalSeconds(123)
   * .build())
   * .hlsManifests(List.of(HlsManifestProperty.builder()
   * .id("id")
   * // the properties below are optional
   * .adMarkers("adMarkers")
   * .adsOnDeliveryRestrictions("adsOnDeliveryRestrictions")
   * .adTriggers(List.of("adTriggers"))
   * .includeIframeOnlyStream(false)
   * .manifestName("manifestName")
   * .playlistType("playlistType")
   * .playlistWindowSeconds(123)
   * .programDateTimeIntervalSeconds(123)
   * .url("url")
   * .build()))
   * .segmentDurationSeconds(123)
   * .segmentPrefix("segmentPrefix")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafpackage.html)
   */
  public inline
      fun cfnOriginEndpointCmafPackageProperty(block: CfnOriginEndpointCmafPackagePropertyDsl.() -> Unit
      = {}): CfnOriginEndpoint.CmafPackageProperty {
    val builder = CfnOriginEndpointCmafPackagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Holds encryption information so that access to the content can be controlled by a DRM solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * DashEncryptionProperty dashEncryptionProperty = DashEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .keyRotationIntervalSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashencryption.html)
   */
  public inline
      fun cfnOriginEndpointDashEncryptionProperty(block: CfnOriginEndpointDashEncryptionPropertyDsl.() -> Unit
      = {}): CfnOriginEndpoint.DashEncryptionProperty {
    val builder = CfnOriginEndpointDashEncryptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Parameters for DASH packaging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * DashPackageProperty dashPackageProperty = DashPackageProperty.builder()
   * .adsOnDeliveryRestrictions("adsOnDeliveryRestrictions")
   * .adTriggers(List.of("adTriggers"))
   * .encryption(DashEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .keyRotationIntervalSeconds(123)
   * .build())
   * .includeIframeOnlyStream(false)
   * .manifestLayout("manifestLayout")
   * .manifestWindowSeconds(123)
   * .minBufferTimeSeconds(123)
   * .minUpdatePeriodSeconds(123)
   * .periodTriggers(List.of("periodTriggers"))
   * .profile("profile")
   * .segmentDurationSeconds(123)
   * .segmentTemplateFormat("segmentTemplateFormat")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .suggestedPresentationDelaySeconds(123)
   * .utcTiming("utcTiming")
   * .utcTimingUri("utcTimingUri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html)
   */
  public inline
      fun cfnOriginEndpointDashPackageProperty(block: CfnOriginEndpointDashPackagePropertyDsl.() -> Unit
      = {}): CfnOriginEndpoint.DashPackageProperty {
    val builder = CfnOriginEndpointDashPackagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use `encryptionContractConfiguration` to configure one or more content encryption keys for your
   * endpoints that use SPEKE Version 2.0. The encryption contract defines the content keys used to
   * encrypt the audio and video tracks in your stream. To configure the encryption contract, specify
   * which audio and video encryption presets to use. For more information about these presets, see
   * [SPEKE Version 2.0
   * Presets](https://docs.aws.amazon.com/mediapackage/latest/ug/drm-content-speke-v2-presets.html) .
   *
   * Note the following considerations when using `encryptionContractConfiguration` :
   *
   * * You can use `encryptionContractConfiguration` for DASH endpoints that use SPEKE Version 2.0.
   * SPEKE Version 2.0 relies on the CPIX Version 2.3 specification.
   * * You cannot combine an `UNENCRYPTED` preset with `UNENCRYPTED` or `SHARED` presets across
   * `presetSpeke20Audio` and `presetSpeke20Video` .
   * * When you use a `SHARED` preset, you must use it for both `presetSpeke20Audio` and
   * `presetSpeke20Video` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * EncryptionContractConfigurationProperty encryptionContractConfigurationProperty =
   * EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-encryptioncontractconfiguration.html)
   */
  public inline
      fun cfnOriginEndpointEncryptionContractConfigurationProperty(block: CfnOriginEndpointEncryptionContractConfigurationPropertyDsl.() -> Unit
      = {}): CfnOriginEndpoint.EncryptionContractConfigurationProperty {
    val builder = CfnOriginEndpointEncryptionContractConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Holds encryption information so that access to the content can be controlled by a DRM solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * HlsEncryptionProperty hlsEncryptionProperty = HlsEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .constantInitializationVector("constantInitializationVector")
   * .encryptionMethod("encryptionMethod")
   * .keyRotationIntervalSeconds(123)
   * .repeatExtXKey(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsencryption.html)
   */
  public inline
      fun cfnOriginEndpointHlsEncryptionProperty(block: CfnOriginEndpointHlsEncryptionPropertyDsl.() -> Unit
      = {}): CfnOriginEndpoint.HlsEncryptionProperty {
    val builder = CfnOriginEndpointHlsEncryptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An HTTP Live Streaming (HLS) manifest configuration on a CMAF endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * HlsManifestProperty hlsManifestProperty = HlsManifestProperty.builder()
   * .id("id")
   * // the properties below are optional
   * .adMarkers("adMarkers")
   * .adsOnDeliveryRestrictions("adsOnDeliveryRestrictions")
   * .adTriggers(List.of("adTriggers"))
   * .includeIframeOnlyStream(false)
   * .manifestName("manifestName")
   * .playlistType("playlistType")
   * .playlistWindowSeconds(123)
   * .programDateTimeIntervalSeconds(123)
   * .url("url")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html)
   */
  public inline
      fun cfnOriginEndpointHlsManifestProperty(block: CfnOriginEndpointHlsManifestPropertyDsl.() -> Unit
      = {}): CfnOriginEndpoint.HlsManifestProperty {
    val builder = CfnOriginEndpointHlsManifestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Parameters for Apple HLS packaging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * HlsPackageProperty hlsPackageProperty = HlsPackageProperty.builder()
   * .adMarkers("adMarkers")
   * .adsOnDeliveryRestrictions("adsOnDeliveryRestrictions")
   * .adTriggers(List.of("adTriggers"))
   * .encryption(HlsEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .constantInitializationVector("constantInitializationVector")
   * .encryptionMethod("encryptionMethod")
   * .keyRotationIntervalSeconds(123)
   * .repeatExtXKey(false)
   * .build())
   * .includeDvbSubtitles(false)
   * .includeIframeOnlyStream(false)
   * .playlistType("playlistType")
   * .playlistWindowSeconds(123)
   * .programDateTimeIntervalSeconds(123)
   * .segmentDurationSeconds(123)
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .useAudioRenditionGroup(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html)
   */
  public inline
      fun cfnOriginEndpointHlsPackageProperty(block: CfnOriginEndpointHlsPackagePropertyDsl.() -> Unit
      = {}): CfnOriginEndpoint.HlsPackageProperty {
    val builder = CfnOriginEndpointHlsPackagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Holds encryption information so that access to the content can be controlled by a DRM solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * MssEncryptionProperty mssEncryptionProperty = MssEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-mssencryption.html)
   */
  public inline
      fun cfnOriginEndpointMssEncryptionProperty(block: CfnOriginEndpointMssEncryptionPropertyDsl.() -> Unit
      = {}): CfnOriginEndpoint.MssEncryptionProperty {
    val builder = CfnOriginEndpointMssEncryptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Parameters for Microsoft Smooth Streaming packaging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * MssPackageProperty mssPackageProperty = MssPackageProperty.builder()
   * .encryption(MssEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build())
   * .manifestWindowSeconds(123)
   * .segmentDurationSeconds(123)
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-msspackage.html)
   */
  public inline
      fun cfnOriginEndpointMssPackageProperty(block: CfnOriginEndpointMssPackagePropertyDsl.() -> Unit
      = {}): CfnOriginEndpoint.MssPackageProperty {
    val builder = CfnOriginEndpointMssPackagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnOriginEndpoint`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * CfnOriginEndpointProps cfnOriginEndpointProps = CfnOriginEndpointProps.builder()
   * .channelId("channelId")
   * .id("id")
   * // the properties below are optional
   * .authorization(AuthorizationProperty.builder()
   * .cdnIdentifierSecret("cdnIdentifierSecret")
   * .secretsRoleArn("secretsRoleArn")
   * .build())
   * .cmafPackage(CmafPackageProperty.builder()
   * .encryption(CmafEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .constantInitializationVector("constantInitializationVector")
   * .encryptionMethod("encryptionMethod")
   * .keyRotationIntervalSeconds(123)
   * .build())
   * .hlsManifests(List.of(HlsManifestProperty.builder()
   * .id("id")
   * // the properties below are optional
   * .adMarkers("adMarkers")
   * .adsOnDeliveryRestrictions("adsOnDeliveryRestrictions")
   * .adTriggers(List.of("adTriggers"))
   * .includeIframeOnlyStream(false)
   * .manifestName("manifestName")
   * .playlistType("playlistType")
   * .playlistWindowSeconds(123)
   * .programDateTimeIntervalSeconds(123)
   * .url("url")
   * .build()))
   * .segmentDurationSeconds(123)
   * .segmentPrefix("segmentPrefix")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build())
   * .dashPackage(DashPackageProperty.builder()
   * .adsOnDeliveryRestrictions("adsOnDeliveryRestrictions")
   * .adTriggers(List.of("adTriggers"))
   * .encryption(DashEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .keyRotationIntervalSeconds(123)
   * .build())
   * .includeIframeOnlyStream(false)
   * .manifestLayout("manifestLayout")
   * .manifestWindowSeconds(123)
   * .minBufferTimeSeconds(123)
   * .minUpdatePeriodSeconds(123)
   * .periodTriggers(List.of("periodTriggers"))
   * .profile("profile")
   * .segmentDurationSeconds(123)
   * .segmentTemplateFormat("segmentTemplateFormat")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .suggestedPresentationDelaySeconds(123)
   * .utcTiming("utcTiming")
   * .utcTimingUri("utcTimingUri")
   * .build())
   * .description("description")
   * .hlsPackage(HlsPackageProperty.builder()
   * .adMarkers("adMarkers")
   * .adsOnDeliveryRestrictions("adsOnDeliveryRestrictions")
   * .adTriggers(List.of("adTriggers"))
   * .encryption(HlsEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .constantInitializationVector("constantInitializationVector")
   * .encryptionMethod("encryptionMethod")
   * .keyRotationIntervalSeconds(123)
   * .repeatExtXKey(false)
   * .build())
   * .includeDvbSubtitles(false)
   * .includeIframeOnlyStream(false)
   * .playlistType("playlistType")
   * .playlistWindowSeconds(123)
   * .programDateTimeIntervalSeconds(123)
   * .segmentDurationSeconds(123)
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .useAudioRenditionGroup(false)
   * .build())
   * .manifestName("manifestName")
   * .mssPackage(MssPackageProperty.builder()
   * .encryption(MssEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build())
   * .manifestWindowSeconds(123)
   * .segmentDurationSeconds(123)
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build())
   * .origination("origination")
   * .startoverWindowSeconds(123)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .timeDelaySeconds(123)
   * .whitelist(List.of("whitelist"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html)
   */
  public inline fun cfnOriginEndpointProps(block: CfnOriginEndpointPropsDsl.() -> Unit = {}):
      CfnOriginEndpointProps {
    val builder = CfnOriginEndpointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Key provider settings for DRM.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * SpekeKeyProviderProperty spekeKeyProviderProperty = SpekeKeyProviderProperty.builder()
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .certificateArn("certificateArn")
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-spekekeyprovider.html)
   */
  public inline
      fun cfnOriginEndpointSpekeKeyProviderProperty(block: CfnOriginEndpointSpekeKeyProviderPropertyDsl.() -> Unit
      = {}): CfnOriginEndpoint.SpekeKeyProviderProperty {
    val builder = CfnOriginEndpointSpekeKeyProviderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Limitations for outputs from the endpoint, based on the video bitrate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * StreamSelectionProperty streamSelectionProperty = StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-streamselection.html)
   */
  public inline
      fun cfnOriginEndpointStreamSelectionProperty(block: CfnOriginEndpointStreamSelectionPropertyDsl.() -> Unit
      = {}): CfnOriginEndpoint.StreamSelectionProperty {
    val builder = CfnOriginEndpointStreamSelectionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a packaging configuration in a packaging group.
   *
   * The packaging configuration represents a single delivery point for an asset. It determines the
   * format and setting for the egressing content. Specify only one package format per configuration,
   * such as `HlsPackage` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * CfnPackagingConfiguration cfnPackagingConfiguration =
   * CfnPackagingConfiguration.Builder.create(this, "MyCfnPackagingConfiguration")
   * .id("id")
   * .packagingGroupId("packagingGroupId")
   * // the properties below are optional
   * .cmafPackage(CmafPackageProperty.builder()
   * .hlsManifests(List.of(HlsManifestProperty.builder()
   * .adMarkers("adMarkers")
   * .includeIframeOnlyStream(false)
   * .manifestName("manifestName")
   * .programDateTimeIntervalSeconds(123)
   * .repeatExtXKey(false)
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build()))
   * // the properties below are optional
   * .encryption(CmafEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build())
   * .includeEncoderConfigurationInSegments(false)
   * .segmentDurationSeconds(123)
   * .build())
   * .dashPackage(DashPackageProperty.builder()
   * .dashManifests(List.of(DashManifestProperty.builder()
   * .manifestLayout("manifestLayout")
   * .manifestName("manifestName")
   * .minBufferTimeSeconds(123)
   * .profile("profile")
   * .scteMarkersSource("scteMarkersSource")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build()))
   * // the properties below are optional
   * .encryption(DashEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build())
   * .includeEncoderConfigurationInSegments(false)
   * .includeIframeOnlyStream(false)
   * .periodTriggers(List.of("periodTriggers"))
   * .segmentDurationSeconds(123)
   * .segmentTemplateFormat("segmentTemplateFormat")
   * .build())
   * .hlsPackage(HlsPackageProperty.builder()
   * .hlsManifests(List.of(HlsManifestProperty.builder()
   * .adMarkers("adMarkers")
   * .includeIframeOnlyStream(false)
   * .manifestName("manifestName")
   * .programDateTimeIntervalSeconds(123)
   * .repeatExtXKey(false)
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build()))
   * // the properties below are optional
   * .encryption(HlsEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .constantInitializationVector("constantInitializationVector")
   * .encryptionMethod("encryptionMethod")
   * .build())
   * .includeDvbSubtitles(false)
   * .segmentDurationSeconds(123)
   * .useAudioRenditionGroup(false)
   * .build())
   * .mssPackage(MssPackageProperty.builder()
   * .mssManifests(List.of(MssManifestProperty.builder()
   * .manifestName("manifestName")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build()))
   * // the properties below are optional
   * .encryption(MssEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build())
   * .segmentDurationSeconds(123)
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html)
   */
  public inline fun cfnPackagingConfiguration(
    scope: Construct,
    id: String,
    block: CfnPackagingConfigurationDsl.() -> Unit = {},
  ): CfnPackagingConfiguration {
    val builder = CfnPackagingConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Holds encryption information so that access to the content can be controlled by a DRM solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * CmafEncryptionProperty cmafEncryptionProperty = CmafEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-cmafencryption.html)
   */
  public inline
      fun cfnPackagingConfigurationCmafEncryptionProperty(block: CfnPackagingConfigurationCmafEncryptionPropertyDsl.() -> Unit
      = {}): CfnPackagingConfiguration.CmafEncryptionProperty {
    val builder = CfnPackagingConfigurationCmafEncryptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Parameters for a packaging configuration that uses Common Media Application Format (CMAF)
   * packaging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * CmafPackageProperty cmafPackageProperty = CmafPackageProperty.builder()
   * .hlsManifests(List.of(HlsManifestProperty.builder()
   * .adMarkers("adMarkers")
   * .includeIframeOnlyStream(false)
   * .manifestName("manifestName")
   * .programDateTimeIntervalSeconds(123)
   * .repeatExtXKey(false)
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build()))
   * // the properties below are optional
   * .encryption(CmafEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build())
   * .includeEncoderConfigurationInSegments(false)
   * .segmentDurationSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-cmafpackage.html)
   */
  public inline
      fun cfnPackagingConfigurationCmafPackageProperty(block: CfnPackagingConfigurationCmafPackagePropertyDsl.() -> Unit
      = {}): CfnPackagingConfiguration.CmafPackageProperty {
    val builder = CfnPackagingConfigurationCmafPackagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Holds encryption information so that access to the content can be controlled by a DRM solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * DashEncryptionProperty dashEncryptionProperty = DashEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashencryption.html)
   */
  public inline
      fun cfnPackagingConfigurationDashEncryptionProperty(block: CfnPackagingConfigurationDashEncryptionPropertyDsl.() -> Unit
      = {}): CfnPackagingConfiguration.DashEncryptionProperty {
    val builder = CfnPackagingConfigurationDashEncryptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Parameters for a DASH manifest.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * DashManifestProperty dashManifestProperty = DashManifestProperty.builder()
   * .manifestLayout("manifestLayout")
   * .manifestName("manifestName")
   * .minBufferTimeSeconds(123)
   * .profile("profile")
   * .scteMarkersSource("scteMarkersSource")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashmanifest.html)
   */
  public inline
      fun cfnPackagingConfigurationDashManifestProperty(block: CfnPackagingConfigurationDashManifestPropertyDsl.() -> Unit
      = {}): CfnPackagingConfiguration.DashManifestProperty {
    val builder = CfnPackagingConfigurationDashManifestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Parameters for a packaging configuration that uses Dynamic Adaptive Streaming over HTTP (DASH)
   * packaging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * DashPackageProperty dashPackageProperty = DashPackageProperty.builder()
   * .dashManifests(List.of(DashManifestProperty.builder()
   * .manifestLayout("manifestLayout")
   * .manifestName("manifestName")
   * .minBufferTimeSeconds(123)
   * .profile("profile")
   * .scteMarkersSource("scteMarkersSource")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build()))
   * // the properties below are optional
   * .encryption(DashEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build())
   * .includeEncoderConfigurationInSegments(false)
   * .includeIframeOnlyStream(false)
   * .periodTriggers(List.of("periodTriggers"))
   * .segmentDurationSeconds(123)
   * .segmentTemplateFormat("segmentTemplateFormat")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html)
   */
  public inline
      fun cfnPackagingConfigurationDashPackageProperty(block: CfnPackagingConfigurationDashPackagePropertyDsl.() -> Unit
      = {}): CfnPackagingConfiguration.DashPackageProperty {
    val builder = CfnPackagingConfigurationDashPackagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use `encryptionContractConfiguration` to configure one or more content encryption keys for your
   * endpoints that use SPEKE Version 2.0. The encryption contract defines the content keys used to
   * encrypt the audio and video tracks in your stream. To configure the encryption contract, specify
   * which audio and video encryption presets to use. For more information about these presets, see
   * [SPEKE Version 2.0
   * Presets](https://docs.aws.amazon.com/mediapackage/latest/ug/drm-content-speke-v2-presets.html) .
   *
   * Note the following considerations when using `encryptionContractConfiguration` :
   *
   * * You can use `encryptionContractConfiguration` for DASH endpoints that use SPEKE Version 2.0.
   * SPEKE Version 2.0 relies on the CPIX Version 2.3 specification.
   * * You cannot combine an `UNENCRYPTED` preset with `UNENCRYPTED` or `SHARED` presets across
   * `presetSpeke20Audio` and `presetSpeke20Video` .
   * * When you use a `SHARED` preset, you must use it for both `presetSpeke20Audio` and
   * `presetSpeke20Video` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * EncryptionContractConfigurationProperty encryptionContractConfigurationProperty =
   * EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-encryptioncontractconfiguration.html)
   */
  public inline
      fun cfnPackagingConfigurationEncryptionContractConfigurationProperty(block: CfnPackagingConfigurationEncryptionContractConfigurationPropertyDsl.() -> Unit
      = {}): CfnPackagingConfiguration.EncryptionContractConfigurationProperty {
    val builder = CfnPackagingConfigurationEncryptionContractConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Holds encryption information so that access to the content can be controlled by a DRM solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * HlsEncryptionProperty hlsEncryptionProperty = HlsEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .constantInitializationVector("constantInitializationVector")
   * .encryptionMethod("encryptionMethod")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsencryption.html)
   */
  public inline
      fun cfnPackagingConfigurationHlsEncryptionProperty(block: CfnPackagingConfigurationHlsEncryptionPropertyDsl.() -> Unit
      = {}): CfnPackagingConfiguration.HlsEncryptionProperty {
    val builder = CfnPackagingConfigurationHlsEncryptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Parameters for an HLS manifest.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * HlsManifestProperty hlsManifestProperty = HlsManifestProperty.builder()
   * .adMarkers("adMarkers")
   * .includeIframeOnlyStream(false)
   * .manifestName("manifestName")
   * .programDateTimeIntervalSeconds(123)
   * .repeatExtXKey(false)
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsmanifest.html)
   */
  public inline
      fun cfnPackagingConfigurationHlsManifestProperty(block: CfnPackagingConfigurationHlsManifestPropertyDsl.() -> Unit
      = {}): CfnPackagingConfiguration.HlsManifestProperty {
    val builder = CfnPackagingConfigurationHlsManifestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Parameters for a packaging configuration that uses HTTP Live Streaming (HLS) packaging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * HlsPackageProperty hlsPackageProperty = HlsPackageProperty.builder()
   * .hlsManifests(List.of(HlsManifestProperty.builder()
   * .adMarkers("adMarkers")
   * .includeIframeOnlyStream(false)
   * .manifestName("manifestName")
   * .programDateTimeIntervalSeconds(123)
   * .repeatExtXKey(false)
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build()))
   * // the properties below are optional
   * .encryption(HlsEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .constantInitializationVector("constantInitializationVector")
   * .encryptionMethod("encryptionMethod")
   * .build())
   * .includeDvbSubtitles(false)
   * .segmentDurationSeconds(123)
   * .useAudioRenditionGroup(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlspackage.html)
   */
  public inline
      fun cfnPackagingConfigurationHlsPackageProperty(block: CfnPackagingConfigurationHlsPackagePropertyDsl.() -> Unit
      = {}): CfnPackagingConfiguration.HlsPackageProperty {
    val builder = CfnPackagingConfigurationHlsPackagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Holds encryption information so that access to the content can be controlled by a DRM solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * MssEncryptionProperty mssEncryptionProperty = MssEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-mssencryption.html)
   */
  public inline
      fun cfnPackagingConfigurationMssEncryptionProperty(block: CfnPackagingConfigurationMssEncryptionPropertyDsl.() -> Unit
      = {}): CfnPackagingConfiguration.MssEncryptionProperty {
    val builder = CfnPackagingConfigurationMssEncryptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Parameters for a Microsoft Smooth manifest.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * MssManifestProperty mssManifestProperty = MssManifestProperty.builder()
   * .manifestName("manifestName")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-mssmanifest.html)
   */
  public inline
      fun cfnPackagingConfigurationMssManifestProperty(block: CfnPackagingConfigurationMssManifestPropertyDsl.() -> Unit
      = {}): CfnPackagingConfiguration.MssManifestProperty {
    val builder = CfnPackagingConfigurationMssManifestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Parameters for a packaging configuration that uses Microsoft Smooth Streaming (MSS) packaging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * MssPackageProperty mssPackageProperty = MssPackageProperty.builder()
   * .mssManifests(List.of(MssManifestProperty.builder()
   * .manifestName("manifestName")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build()))
   * // the properties below are optional
   * .encryption(MssEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build())
   * .segmentDurationSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-msspackage.html)
   */
  public inline
      fun cfnPackagingConfigurationMssPackageProperty(block: CfnPackagingConfigurationMssPackagePropertyDsl.() -> Unit
      = {}): CfnPackagingConfiguration.MssPackageProperty {
    val builder = CfnPackagingConfigurationMssPackagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnPackagingConfiguration`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * CfnPackagingConfigurationProps cfnPackagingConfigurationProps =
   * CfnPackagingConfigurationProps.builder()
   * .id("id")
   * .packagingGroupId("packagingGroupId")
   * // the properties below are optional
   * .cmafPackage(CmafPackageProperty.builder()
   * .hlsManifests(List.of(HlsManifestProperty.builder()
   * .adMarkers("adMarkers")
   * .includeIframeOnlyStream(false)
   * .manifestName("manifestName")
   * .programDateTimeIntervalSeconds(123)
   * .repeatExtXKey(false)
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build()))
   * // the properties below are optional
   * .encryption(CmafEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build())
   * .includeEncoderConfigurationInSegments(false)
   * .segmentDurationSeconds(123)
   * .build())
   * .dashPackage(DashPackageProperty.builder()
   * .dashManifests(List.of(DashManifestProperty.builder()
   * .manifestLayout("manifestLayout")
   * .manifestName("manifestName")
   * .minBufferTimeSeconds(123)
   * .profile("profile")
   * .scteMarkersSource("scteMarkersSource")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build()))
   * // the properties below are optional
   * .encryption(DashEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build())
   * .includeEncoderConfigurationInSegments(false)
   * .includeIframeOnlyStream(false)
   * .periodTriggers(List.of("periodTriggers"))
   * .segmentDurationSeconds(123)
   * .segmentTemplateFormat("segmentTemplateFormat")
   * .build())
   * .hlsPackage(HlsPackageProperty.builder()
   * .hlsManifests(List.of(HlsManifestProperty.builder()
   * .adMarkers("adMarkers")
   * .includeIframeOnlyStream(false)
   * .manifestName("manifestName")
   * .programDateTimeIntervalSeconds(123)
   * .repeatExtXKey(false)
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build()))
   * // the properties below are optional
   * .encryption(HlsEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .constantInitializationVector("constantInitializationVector")
   * .encryptionMethod("encryptionMethod")
   * .build())
   * .includeDvbSubtitles(false)
   * .segmentDurationSeconds(123)
   * .useAudioRenditionGroup(false)
   * .build())
   * .mssPackage(MssPackageProperty.builder()
   * .mssManifests(List.of(MssManifestProperty.builder()
   * .manifestName("manifestName")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build()))
   * // the properties below are optional
   * .encryption(MssEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build())
   * .segmentDurationSeconds(123)
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html)
   */
  public inline
      fun cfnPackagingConfigurationProps(block: CfnPackagingConfigurationPropsDsl.() -> Unit = {}):
      CfnPackagingConfigurationProps {
    val builder = CfnPackagingConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE)
   * service that provides encryption keys.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * SpekeKeyProviderProperty spekeKeyProviderProperty = SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-spekekeyprovider.html)
   */
  public inline
      fun cfnPackagingConfigurationSpekeKeyProviderProperty(block: CfnPackagingConfigurationSpekeKeyProviderPropertyDsl.() -> Unit
      = {}): CfnPackagingConfiguration.SpekeKeyProviderProperty {
    val builder = CfnPackagingConfigurationSpekeKeyProviderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Limitations for outputs from the endpoint, based on the video bitrate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * StreamSelectionProperty streamSelectionProperty = StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-streamselection.html)
   */
  public inline
      fun cfnPackagingConfigurationStreamSelectionProperty(block: CfnPackagingConfigurationStreamSelectionPropertyDsl.() -> Unit
      = {}): CfnPackagingConfiguration.StreamSelectionProperty {
    val builder = CfnPackagingConfigurationStreamSelectionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a packaging group.
   *
   * The packaging group holds one or more packaging configurations. When you create an asset, you
   * specify the packaging group associated with the asset. The asset has playback endpoints for each
   * packaging configuration within the group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * CfnPackagingGroup cfnPackagingGroup = CfnPackagingGroup.Builder.create(this,
   * "MyCfnPackagingGroup")
   * .id("id")
   * // the properties below are optional
   * .authorization(AuthorizationProperty.builder()
   * .cdnIdentifierSecret("cdnIdentifierSecret")
   * .secretsRoleArn("secretsRoleArn")
   * .build())
   * .egressAccessLogs(LogConfigurationProperty.builder()
   * .logGroupName("logGroupName")
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html)
   */
  public inline fun cfnPackagingGroup(
    scope: Construct,
    id: String,
    block: CfnPackagingGroupDsl.() -> Unit = {},
  ): CfnPackagingGroup {
    val builder = CfnPackagingGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Parameters for enabling CDN authorization.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * AuthorizationProperty authorizationProperty = AuthorizationProperty.builder()
   * .cdnIdentifierSecret("cdnIdentifierSecret")
   * .secretsRoleArn("secretsRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packaginggroup-authorization.html)
   */
  public inline
      fun cfnPackagingGroupAuthorizationProperty(block: CfnPackagingGroupAuthorizationPropertyDsl.() -> Unit
      = {}): CfnPackagingGroup.AuthorizationProperty {
    val builder = CfnPackagingGroupAuthorizationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Sets a custom Amazon CloudWatch log group name for egress logs.
   *
   * If a log group name isn't specified, the default name is used:
   * /aws/MediaPackage/EgressAccessLogs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * LogConfigurationProperty logConfigurationProperty = LogConfigurationProperty.builder()
   * .logGroupName("logGroupName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packaginggroup-logconfiguration.html)
   */
  public inline
      fun cfnPackagingGroupLogConfigurationProperty(block: CfnPackagingGroupLogConfigurationPropertyDsl.() -> Unit
      = {}): CfnPackagingGroup.LogConfigurationProperty {
    val builder = CfnPackagingGroupLogConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnPackagingGroup`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.mediapackage.*;
   * CfnPackagingGroupProps cfnPackagingGroupProps = CfnPackagingGroupProps.builder()
   * .id("id")
   * // the properties below are optional
   * .authorization(AuthorizationProperty.builder()
   * .cdnIdentifierSecret("cdnIdentifierSecret")
   * .secretsRoleArn("secretsRoleArn")
   * .build())
   * .egressAccessLogs(LogConfigurationProperty.builder()
   * .logGroupName("logGroupName")
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html)
   */
  public inline fun cfnPackagingGroupProps(block: CfnPackagingGroupPropsDsl.() -> Unit = {}):
      CfnPackagingGroupProps {
    val builder = CfnPackagingGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
