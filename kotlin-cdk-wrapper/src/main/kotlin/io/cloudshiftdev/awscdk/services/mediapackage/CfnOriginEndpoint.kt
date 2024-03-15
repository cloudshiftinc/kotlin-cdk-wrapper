@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackage

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create an endpoint on an AWS Elemental MediaPackage channel.
 *
 * An endpoint represents a single delivery point of a channel, and defines content output handling
 * through various components, such as packaging protocols, DRM and encryption integration, and more.
 *
 * After it's created, an endpoint provides a fixed public URL. This URL remains the same throughout
 * the lifetime of the endpoint, regardless of any failures or upgrades that might occur. Integrate the
 * URL with a downstream CDN (such as Amazon CloudFront) or playback device.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediapackage.*;
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
public open class CfnOriginEndpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The endpoint's unique system-generated resource name, based on the AWS record.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * URL for the key provider’s key retrieval API endpoint.
   *
   * Must start with https://.
   */
  public open fun attrUrl(): String = unwrap(this).getAttrUrl()

  /**
   * Parameters for CDN authorization.
   */
  public open fun authorization(): Any? = unwrap(this).getAuthorization()

  /**
   * Parameters for CDN authorization.
   */
  public open fun authorization(`value`: IResolvable) {
    unwrap(this).setAuthorization(`value`.let(IResolvable::unwrap))
  }

  /**
   * Parameters for CDN authorization.
   */
  public open fun authorization(`value`: AuthorizationProperty) {
    unwrap(this).setAuthorization(`value`.let(AuthorizationProperty::unwrap))
  }

  /**
   * Parameters for CDN authorization.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("97c0bdcf2382d217003371a366e735b1d08a2be7a8be28a026b56c3364dacdad")
  public open fun authorization(`value`: AuthorizationProperty.Builder.() -> Unit): Unit =
      authorization(AuthorizationProperty(`value`))

  /**
   * The ID of the channel associated with this endpoint.
   */
  public open fun channelId(): String = unwrap(this).getChannelId()

  /**
   * The ID of the channel associated with this endpoint.
   */
  public open fun channelId(`value`: String) {
    unwrap(this).setChannelId(`value`)
  }

  /**
   * Parameters for Common Media Application Format (CMAF) packaging.
   */
  public open fun cmafPackage(): Any? = unwrap(this).getCmafPackage()

  /**
   * Parameters for Common Media Application Format (CMAF) packaging.
   */
  public open fun cmafPackage(`value`: IResolvable) {
    unwrap(this).setCmafPackage(`value`.let(IResolvable::unwrap))
  }

  /**
   * Parameters for Common Media Application Format (CMAF) packaging.
   */
  public open fun cmafPackage(`value`: CmafPackageProperty) {
    unwrap(this).setCmafPackage(`value`.let(CmafPackageProperty::unwrap))
  }

  /**
   * Parameters for Common Media Application Format (CMAF) packaging.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b649452bb1089e65f94e54e1400a0d9c1d77d031581f4e4ccec7a6612bacdc5f")
  public open fun cmafPackage(`value`: CmafPackageProperty.Builder.() -> Unit): Unit =
      cmafPackage(CmafPackageProperty(`value`))

  /**
   * Parameters for DASH packaging.
   */
  public open fun dashPackage(): Any? = unwrap(this).getDashPackage()

  /**
   * Parameters for DASH packaging.
   */
  public open fun dashPackage(`value`: IResolvable) {
    unwrap(this).setDashPackage(`value`.let(IResolvable::unwrap))
  }

  /**
   * Parameters for DASH packaging.
   */
  public open fun dashPackage(`value`: DashPackageProperty) {
    unwrap(this).setDashPackage(`value`.let(DashPackageProperty::unwrap))
  }

  /**
   * Parameters for DASH packaging.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("61a997a92b16e411079cf7310c606f5cad8d8763dadbb5f8dd0bf92239164862")
  public open fun dashPackage(`value`: DashPackageProperty.Builder.() -> Unit): Unit =
      dashPackage(DashPackageProperty(`value`))

  /**
   * Any descriptive information that you want to add to the endpoint for future identification
   * purposes.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Any descriptive information that you want to add to the endpoint for future identification
   * purposes.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Parameters for Apple HLS packaging.
   */
  public open fun hlsPackage(): Any? = unwrap(this).getHlsPackage()

  /**
   * Parameters for Apple HLS packaging.
   */
  public open fun hlsPackage(`value`: IResolvable) {
    unwrap(this).setHlsPackage(`value`.let(IResolvable::unwrap))
  }

  /**
   * Parameters for Apple HLS packaging.
   */
  public open fun hlsPackage(`value`: HlsPackageProperty) {
    unwrap(this).setHlsPackage(`value`.let(HlsPackageProperty::unwrap))
  }

  /**
   * Parameters for Apple HLS packaging.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7b69d1fa6edccb0188749d2de59b7cab4ccdad804e4becf37912f64eae8d73a2")
  public open fun hlsPackage(`value`: HlsPackageProperty.Builder.() -> Unit): Unit =
      hlsPackage(HlsPackageProperty(`value`))

  /**
   * The manifest ID is required and must be unique within the OriginEndpoint.
   */
  public open fun id(): String = unwrap(this).getId()

  /**
   * The manifest ID is required and must be unique within the OriginEndpoint.
   */
  public open fun id(`value`: String) {
    unwrap(this).setId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A short string that's appended to the end of the endpoint URL to create a unique path to this
   * endpoint.
   */
  public open fun manifestName(): String? = unwrap(this).getManifestName()

  /**
   * A short string that's appended to the end of the endpoint URL to create a unique path to this
   * endpoint.
   */
  public open fun manifestName(`value`: String) {
    unwrap(this).setManifestName(`value`)
  }

  /**
   * Parameters for Microsoft Smooth Streaming packaging.
   */
  public open fun mssPackage(): Any? = unwrap(this).getMssPackage()

  /**
   * Parameters for Microsoft Smooth Streaming packaging.
   */
  public open fun mssPackage(`value`: IResolvable) {
    unwrap(this).setMssPackage(`value`.let(IResolvable::unwrap))
  }

  /**
   * Parameters for Microsoft Smooth Streaming packaging.
   */
  public open fun mssPackage(`value`: MssPackageProperty) {
    unwrap(this).setMssPackage(`value`.let(MssPackageProperty::unwrap))
  }

  /**
   * Parameters for Microsoft Smooth Streaming packaging.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8724e6a3fc876d57f781026f5c786c3244160a0b6738ca0953cc03abb5d2d28")
  public open fun mssPackage(`value`: MssPackageProperty.Builder.() -> Unit): Unit =
      mssPackage(MssPackageProperty(`value`))

  /**
   * Controls video origination from this endpoint.
   */
  public open fun origination(): String? = unwrap(this).getOrigination()

  /**
   * Controls video origination from this endpoint.
   */
  public open fun origination(`value`: String) {
    unwrap(this).setOrigination(`value`)
  }

  /**
   * Maximum duration (seconds) of content to retain for startover playback.
   */
  public open fun startoverWindowSeconds(): Number? = unwrap(this).getStartoverWindowSeconds()

  /**
   * Maximum duration (seconds) of content to retain for startover playback.
   */
  public open fun startoverWindowSeconds(`value`: Number) {
    unwrap(this).setStartoverWindowSeconds(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to assign to the endpoint.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to assign to the endpoint.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to assign to the endpoint.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Minimum duration (seconds) of delay to enforce on the playback of live content.
   */
  public open fun timeDelaySeconds(): Number? = unwrap(this).getTimeDelaySeconds()

  /**
   * Minimum duration (seconds) of delay to enforce on the playback of live content.
   */
  public open fun timeDelaySeconds(`value`: Number) {
    unwrap(this).setTimeDelaySeconds(`value`)
  }

  /**
   * The IP addresses that can access this endpoint.
   */
  public open fun whitelist(): List<String> = unwrap(this).getWhitelist() ?: emptyList()

  /**
   * The IP addresses that can access this endpoint.
   */
  public open fun whitelist(`value`: List<String>) {
    unwrap(this).setWhitelist(`value`)
  }

  /**
   * The IP addresses that can access this endpoint.
   */
  public open fun whitelist(vararg `value`: String): Unit = whitelist(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediapackage.CfnOriginEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Parameters for CDN authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-authorization)
     * @param authorization Parameters for CDN authorization. 
     */
    public fun authorization(authorization: IResolvable)

    /**
     * Parameters for CDN authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-authorization)
     * @param authorization Parameters for CDN authorization. 
     */
    public fun authorization(authorization: AuthorizationProperty)

    /**
     * Parameters for CDN authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-authorization)
     * @param authorization Parameters for CDN authorization. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97fcf3e9063ad56e7085d7c35a18890a28370cabd5ef99a38f46be5db7b69107")
    public fun authorization(authorization: AuthorizationProperty.Builder.() -> Unit)

    /**
     * The ID of the channel associated with this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-channelid)
     * @param channelId The ID of the channel associated with this endpoint. 
     */
    public fun channelId(channelId: String)

    /**
     * Parameters for Common Media Application Format (CMAF) packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-cmafpackage)
     * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging. 
     */
    public fun cmafPackage(cmafPackage: IResolvable)

    /**
     * Parameters for Common Media Application Format (CMAF) packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-cmafpackage)
     * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging. 
     */
    public fun cmafPackage(cmafPackage: CmafPackageProperty)

    /**
     * Parameters for Common Media Application Format (CMAF) packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-cmafpackage)
     * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfa5760a41763aac28b9e675a3b40c4e18606545322da91febad65639153df08")
    public fun cmafPackage(cmafPackage: CmafPackageProperty.Builder.() -> Unit)

    /**
     * Parameters for DASH packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-dashpackage)
     * @param dashPackage Parameters for DASH packaging. 
     */
    public fun dashPackage(dashPackage: IResolvable)

    /**
     * Parameters for DASH packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-dashpackage)
     * @param dashPackage Parameters for DASH packaging. 
     */
    public fun dashPackage(dashPackage: DashPackageProperty)

    /**
     * Parameters for DASH packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-dashpackage)
     * @param dashPackage Parameters for DASH packaging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c7b8292e6e0e6a0d73c620650197ed90918cd10e794c28f5bef40278c14926e")
    public fun dashPackage(dashPackage: DashPackageProperty.Builder.() -> Unit)

    /**
     * Any descriptive information that you want to add to the endpoint for future identification
     * purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-description)
     * @param description Any descriptive information that you want to add to the endpoint for
     * future identification purposes. 
     */
    public fun description(description: String)

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-hlspackage)
     * @param hlsPackage Parameters for Apple HLS packaging. 
     */
    public fun hlsPackage(hlsPackage: IResolvable)

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-hlspackage)
     * @param hlsPackage Parameters for Apple HLS packaging. 
     */
    public fun hlsPackage(hlsPackage: HlsPackageProperty)

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-hlspackage)
     * @param hlsPackage Parameters for Apple HLS packaging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b04ac551306ae3ac6c2d3d4f1f64dbdf984e40f7166ffd884b7c18e7705e978")
    public fun hlsPackage(hlsPackage: HlsPackageProperty.Builder.() -> Unit)

    /**
     * The manifest ID is required and must be unique within the OriginEndpoint.
     *
     * The ID can't be changed after the endpoint is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-id)
     * @param id The manifest ID is required and must be unique within the OriginEndpoint. 
     */
    public fun id(id: String)

    /**
     * A short string that's appended to the end of the endpoint URL to create a unique path to this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-manifestname)
     * @param manifestName A short string that's appended to the end of the endpoint URL to create a
     * unique path to this endpoint. 
     */
    public fun manifestName(manifestName: String)

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-msspackage)
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging. 
     */
    public fun mssPackage(mssPackage: IResolvable)

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-msspackage)
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging. 
     */
    public fun mssPackage(mssPackage: MssPackageProperty)

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-msspackage)
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00fd056cbafc82c1730dc05dd4c3dc0d7502008627714d8b3e0a5c7700e49ba0")
    public fun mssPackage(mssPackage: MssPackageProperty.Builder.() -> Unit)

    /**
     * Controls video origination from this endpoint.
     *
     * Valid values:
     *
     * * `ALLOW` - enables this endpoint to serve content to requesting devices.
     * * `DENY` - prevents this endpoint from serving content. Denying origination is helpful for
     * harvesting live-to-VOD assets. For more information about harvesting and origination, see
     * [Live-to-VOD Requirements](https://docs.aws.amazon.com/mediapackage/latest/ug/ltov-reqmts.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-origination)
     * @param origination Controls video origination from this endpoint. 
     */
    public fun origination(origination: String)

    /**
     * Maximum duration (seconds) of content to retain for startover playback.
     *
     * Omit this attribute or enter `0` to indicate that startover playback is disabled for this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-startoverwindowseconds)
     * @param startoverWindowSeconds Maximum duration (seconds) of content to retain for startover
     * playback. 
     */
    public fun startoverWindowSeconds(startoverWindowSeconds: Number)

    /**
     * The tags to assign to the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-tags)
     * @param tags The tags to assign to the endpoint. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to assign to the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-tags)
     * @param tags The tags to assign to the endpoint. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Minimum duration (seconds) of delay to enforce on the playback of live content.
     *
     * Omit this attribute or enter `0` to indicate that there is no time delay in effect for this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-timedelayseconds)
     * @param timeDelaySeconds Minimum duration (seconds) of delay to enforce on the playback of
     * live content. 
     */
    public fun timeDelaySeconds(timeDelaySeconds: Number)

    /**
     * The IP addresses that can access this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-whitelist)
     * @param whitelist The IP addresses that can access this endpoint. 
     */
    public fun whitelist(whitelist: List<String>)

    /**
     * The IP addresses that can access this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-whitelist)
     * @param whitelist The IP addresses that can access this endpoint. 
     */
    public fun whitelist(vararg whitelist: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.Builder =
        software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.Builder.create(scope, id)

    /**
     * Parameters for CDN authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-authorization)
     * @param authorization Parameters for CDN authorization. 
     */
    override fun authorization(authorization: IResolvable) {
      cdkBuilder.authorization(authorization.let(IResolvable::unwrap))
    }

    /**
     * Parameters for CDN authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-authorization)
     * @param authorization Parameters for CDN authorization. 
     */
    override fun authorization(authorization: AuthorizationProperty) {
      cdkBuilder.authorization(authorization.let(AuthorizationProperty::unwrap))
    }

    /**
     * Parameters for CDN authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-authorization)
     * @param authorization Parameters for CDN authorization. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97fcf3e9063ad56e7085d7c35a18890a28370cabd5ef99a38f46be5db7b69107")
    override fun authorization(authorization: AuthorizationProperty.Builder.() -> Unit): Unit =
        authorization(AuthorizationProperty(authorization))

    /**
     * The ID of the channel associated with this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-channelid)
     * @param channelId The ID of the channel associated with this endpoint. 
     */
    override fun channelId(channelId: String) {
      cdkBuilder.channelId(channelId)
    }

    /**
     * Parameters for Common Media Application Format (CMAF) packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-cmafpackage)
     * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging. 
     */
    override fun cmafPackage(cmafPackage: IResolvable) {
      cdkBuilder.cmafPackage(cmafPackage.let(IResolvable::unwrap))
    }

    /**
     * Parameters for Common Media Application Format (CMAF) packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-cmafpackage)
     * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging. 
     */
    override fun cmafPackage(cmafPackage: CmafPackageProperty) {
      cdkBuilder.cmafPackage(cmafPackage.let(CmafPackageProperty::unwrap))
    }

    /**
     * Parameters for Common Media Application Format (CMAF) packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-cmafpackage)
     * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfa5760a41763aac28b9e675a3b40c4e18606545322da91febad65639153df08")
    override fun cmafPackage(cmafPackage: CmafPackageProperty.Builder.() -> Unit): Unit =
        cmafPackage(CmafPackageProperty(cmafPackage))

    /**
     * Parameters for DASH packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-dashpackage)
     * @param dashPackage Parameters for DASH packaging. 
     */
    override fun dashPackage(dashPackage: IResolvable) {
      cdkBuilder.dashPackage(dashPackage.let(IResolvable::unwrap))
    }

    /**
     * Parameters for DASH packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-dashpackage)
     * @param dashPackage Parameters for DASH packaging. 
     */
    override fun dashPackage(dashPackage: DashPackageProperty) {
      cdkBuilder.dashPackage(dashPackage.let(DashPackageProperty::unwrap))
    }

    /**
     * Parameters for DASH packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-dashpackage)
     * @param dashPackage Parameters for DASH packaging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c7b8292e6e0e6a0d73c620650197ed90918cd10e794c28f5bef40278c14926e")
    override fun dashPackage(dashPackage: DashPackageProperty.Builder.() -> Unit): Unit =
        dashPackage(DashPackageProperty(dashPackage))

    /**
     * Any descriptive information that you want to add to the endpoint for future identification
     * purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-description)
     * @param description Any descriptive information that you want to add to the endpoint for
     * future identification purposes. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-hlspackage)
     * @param hlsPackage Parameters for Apple HLS packaging. 
     */
    override fun hlsPackage(hlsPackage: IResolvable) {
      cdkBuilder.hlsPackage(hlsPackage.let(IResolvable::unwrap))
    }

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-hlspackage)
     * @param hlsPackage Parameters for Apple HLS packaging. 
     */
    override fun hlsPackage(hlsPackage: HlsPackageProperty) {
      cdkBuilder.hlsPackage(hlsPackage.let(HlsPackageProperty::unwrap))
    }

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-hlspackage)
     * @param hlsPackage Parameters for Apple HLS packaging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b04ac551306ae3ac6c2d3d4f1f64dbdf984e40f7166ffd884b7c18e7705e978")
    override fun hlsPackage(hlsPackage: HlsPackageProperty.Builder.() -> Unit): Unit =
        hlsPackage(HlsPackageProperty(hlsPackage))

    /**
     * The manifest ID is required and must be unique within the OriginEndpoint.
     *
     * The ID can't be changed after the endpoint is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-id)
     * @param id The manifest ID is required and must be unique within the OriginEndpoint. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * A short string that's appended to the end of the endpoint URL to create a unique path to this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-manifestname)
     * @param manifestName A short string that's appended to the end of the endpoint URL to create a
     * unique path to this endpoint. 
     */
    override fun manifestName(manifestName: String) {
      cdkBuilder.manifestName(manifestName)
    }

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-msspackage)
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging. 
     */
    override fun mssPackage(mssPackage: IResolvable) {
      cdkBuilder.mssPackage(mssPackage.let(IResolvable::unwrap))
    }

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-msspackage)
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging. 
     */
    override fun mssPackage(mssPackage: MssPackageProperty) {
      cdkBuilder.mssPackage(mssPackage.let(MssPackageProperty::unwrap))
    }

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-msspackage)
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00fd056cbafc82c1730dc05dd4c3dc0d7502008627714d8b3e0a5c7700e49ba0")
    override fun mssPackage(mssPackage: MssPackageProperty.Builder.() -> Unit): Unit =
        mssPackage(MssPackageProperty(mssPackage))

    /**
     * Controls video origination from this endpoint.
     *
     * Valid values:
     *
     * * `ALLOW` - enables this endpoint to serve content to requesting devices.
     * * `DENY` - prevents this endpoint from serving content. Denying origination is helpful for
     * harvesting live-to-VOD assets. For more information about harvesting and origination, see
     * [Live-to-VOD Requirements](https://docs.aws.amazon.com/mediapackage/latest/ug/ltov-reqmts.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-origination)
     * @param origination Controls video origination from this endpoint. 
     */
    override fun origination(origination: String) {
      cdkBuilder.origination(origination)
    }

    /**
     * Maximum duration (seconds) of content to retain for startover playback.
     *
     * Omit this attribute or enter `0` to indicate that startover playback is disabled for this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-startoverwindowseconds)
     * @param startoverWindowSeconds Maximum duration (seconds) of content to retain for startover
     * playback. 
     */
    override fun startoverWindowSeconds(startoverWindowSeconds: Number) {
      cdkBuilder.startoverWindowSeconds(startoverWindowSeconds)
    }

    /**
     * The tags to assign to the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-tags)
     * @param tags The tags to assign to the endpoint. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to assign to the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-tags)
     * @param tags The tags to assign to the endpoint. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Minimum duration (seconds) of delay to enforce on the playback of live content.
     *
     * Omit this attribute or enter `0` to indicate that there is no time delay in effect for this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-timedelayseconds)
     * @param timeDelaySeconds Minimum duration (seconds) of delay to enforce on the playback of
     * live content. 
     */
    override fun timeDelaySeconds(timeDelaySeconds: Number) {
      cdkBuilder.timeDelaySeconds(timeDelaySeconds)
    }

    /**
     * The IP addresses that can access this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-whitelist)
     * @param whitelist The IP addresses that can access this endpoint. 
     */
    override fun whitelist(whitelist: List<String>) {
      cdkBuilder.whitelist(whitelist)
    }

    /**
     * The IP addresses that can access this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-whitelist)
     * @param whitelist The IP addresses that can access this endpoint. 
     */
    override fun whitelist(vararg whitelist: String): Unit = whitelist(whitelist.toList())

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOriginEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOriginEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint):
        CfnOriginEndpoint = CfnOriginEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnOriginEndpoint):
        software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint = wrapped.cdkObject
  }

  /**
   * Parameters for Microsoft Smooth Streaming packaging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
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
  public interface MssPackageProperty {
    /**
     * Parameters for encrypting content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-msspackage.html#cfn-mediapackage-originendpoint-msspackage-encryption)
     */
    public fun encryption(): Any? = unwrap(this).getEncryption()

    /**
     * Time window (in seconds) contained in each manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-msspackage.html#cfn-mediapackage-originendpoint-msspackage-manifestwindowseconds)
     */
    public fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

    /**
     * Duration (in seconds) of each fragment.
     *
     * Actual fragments are rounded to the nearest multiple of the source fragment duration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-msspackage.html#cfn-mediapackage-originendpoint-msspackage-segmentdurationseconds)
     */
    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    /**
     * Limitations for outputs from the endpoint, based on the video bitrate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-msspackage.html#cfn-mediapackage-originendpoint-msspackage-streamselection)
     */
    public fun streamSelection(): Any? = unwrap(this).getStreamSelection()

    /**
     * A builder for [MssPackageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryption Parameters for encrypting content.
       */
      public fun encryption(encryption: IResolvable)

      /**
       * @param encryption Parameters for encrypting content.
       */
      public fun encryption(encryption: MssEncryptionProperty)

      /**
       * @param encryption Parameters for encrypting content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6440d39ca8d9a8c40d15cf80df5bd57e971d7d2bd1803cd4107003b46af13628")
      public fun encryption(encryption: MssEncryptionProperty.Builder.() -> Unit)

      /**
       * @param manifestWindowSeconds Time window (in seconds) contained in each manifest.
       */
      public fun manifestWindowSeconds(manifestWindowSeconds: Number)

      /**
       * @param segmentDurationSeconds Duration (in seconds) of each fragment.
       * Actual fragments are rounded to the nearest multiple of the source fragment duration.
       */
      public fun segmentDurationSeconds(segmentDurationSeconds: Number)

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      public fun streamSelection(streamSelection: IResolvable)

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      public fun streamSelection(streamSelection: StreamSelectionProperty)

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4175e1ef5ed609f7966bcfad0b3aeb10b8b4956ec2e456c2f1057f60ebb641a9")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty.builder()

      /**
       * @param encryption Parameters for encrypting content.
       */
      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      override fun encryption(encryption: MssEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(MssEncryptionProperty::unwrap))
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6440d39ca8d9a8c40d15cf80df5bd57e971d7d2bd1803cd4107003b46af13628")
      override fun encryption(encryption: MssEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(MssEncryptionProperty(encryption))

      /**
       * @param manifestWindowSeconds Time window (in seconds) contained in each manifest.
       */
      override fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
      }

      /**
       * @param segmentDurationSeconds Duration (in seconds) of each fragment.
       * Actual fragments are rounded to the nearest multiple of the source fragment duration.
       */
      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4175e1ef5ed609f7966bcfad0b3aeb10b8b4956ec2e456c2f1057f60ebb641a9")
      override fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit):
          Unit = streamSelection(StreamSelectionProperty(streamSelection))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty,
    ) : CdkObject(cdkObject), MssPackageProperty {
      /**
       * Parameters for encrypting content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-msspackage.html#cfn-mediapackage-originendpoint-msspackage-encryption)
       */
      override fun encryption(): Any? = unwrap(this).getEncryption()

      /**
       * Time window (in seconds) contained in each manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-msspackage.html#cfn-mediapackage-originendpoint-msspackage-manifestwindowseconds)
       */
      override fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

      /**
       * Duration (in seconds) of each fragment.
       *
       * Actual fragments are rounded to the nearest multiple of the source fragment duration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-msspackage.html#cfn-mediapackage-originendpoint-msspackage-segmentdurationseconds)
       */
      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

      /**
       * Limitations for outputs from the endpoint, based on the video bitrate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-msspackage.html#cfn-mediapackage-originendpoint-msspackage-streamselection)
       */
      override fun streamSelection(): Any? = unwrap(this).getStreamSelection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MssPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty):
          MssPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MssPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty
    }
  }

  /**
   * Parameters for Common Media Application Format (CMAF) packaging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
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
  public interface CmafPackageProperty {
    /**
     * Parameters for encrypting content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafpackage.html#cfn-mediapackage-originendpoint-cmafpackage-encryption)
     */
    public fun encryption(): Any? = unwrap(this).getEncryption()

    /**
     * A list of HLS manifest configurations that are available from this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafpackage.html#cfn-mediapackage-originendpoint-cmafpackage-hlsmanifests)
     */
    public fun hlsManifests(): Any? = unwrap(this).getHlsManifests()

    /**
     * Duration (in seconds) of each segment.
     *
     * Actual segments are rounded to the nearest multiple of the source segment duration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafpackage.html#cfn-mediapackage-originendpoint-cmafpackage-segmentdurationseconds)
     */
    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    /**
     * An optional custom string that is prepended to the name of each segment.
     *
     * If not specified, the segment prefix defaults to the ChannelId.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafpackage.html#cfn-mediapackage-originendpoint-cmafpackage-segmentprefix)
     */
    public fun segmentPrefix(): String? = unwrap(this).getSegmentPrefix()

    /**
     * Limitations for outputs from the endpoint, based on the video bitrate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafpackage.html#cfn-mediapackage-originendpoint-cmafpackage-streamselection)
     */
    public fun streamSelection(): Any? = unwrap(this).getStreamSelection()

    /**
     * A builder for [CmafPackageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryption Parameters for encrypting content.
       */
      public fun encryption(encryption: IResolvable)

      /**
       * @param encryption Parameters for encrypting content.
       */
      public fun encryption(encryption: CmafEncryptionProperty)

      /**
       * @param encryption Parameters for encrypting content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78196d1b0daab96676bcb7cb1ed6a754d345c918367a6bb55f3e6c4f33a733a7")
      public fun encryption(encryption: CmafEncryptionProperty.Builder.() -> Unit)

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint.
       */
      public fun hlsManifests(hlsManifests: IResolvable)

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint.
       */
      public fun hlsManifests(hlsManifests: List<Any>)

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint.
       */
      public fun hlsManifests(vararg hlsManifests: Any)

      /**
       * @param segmentDurationSeconds Duration (in seconds) of each segment.
       * Actual segments are rounded to the nearest multiple of the source segment duration.
       */
      public fun segmentDurationSeconds(segmentDurationSeconds: Number)

      /**
       * @param segmentPrefix An optional custom string that is prepended to the name of each
       * segment.
       * If not specified, the segment prefix defaults to the ChannelId.
       */
      public fun segmentPrefix(segmentPrefix: String)

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      public fun streamSelection(streamSelection: IResolvable)

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      public fun streamSelection(streamSelection: StreamSelectionProperty)

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87448f8eefe25bed723f1b18695f5ec731121e2d992694889b75880fa85e14c9")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty.builder()

      /**
       * @param encryption Parameters for encrypting content.
       */
      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      override fun encryption(encryption: CmafEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(CmafEncryptionProperty::unwrap))
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78196d1b0daab96676bcb7cb1ed6a754d345c918367a6bb55f3e6c4f33a733a7")
      override fun encryption(encryption: CmafEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(CmafEncryptionProperty(encryption))

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint.
       */
      override fun hlsManifests(hlsManifests: IResolvable) {
        cdkBuilder.hlsManifests(hlsManifests.let(IResolvable::unwrap))
      }

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint.
       */
      override fun hlsManifests(hlsManifests: List<Any>) {
        cdkBuilder.hlsManifests(hlsManifests)
      }

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint.
       */
      override fun hlsManifests(vararg hlsManifests: Any): Unit =
          hlsManifests(hlsManifests.toList())

      /**
       * @param segmentDurationSeconds Duration (in seconds) of each segment.
       * Actual segments are rounded to the nearest multiple of the source segment duration.
       */
      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      /**
       * @param segmentPrefix An optional custom string that is prepended to the name of each
       * segment.
       * If not specified, the segment prefix defaults to the ChannelId.
       */
      override fun segmentPrefix(segmentPrefix: String) {
        cdkBuilder.segmentPrefix(segmentPrefix)
      }

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87448f8eefe25bed723f1b18695f5ec731121e2d992694889b75880fa85e14c9")
      override fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit):
          Unit = streamSelection(StreamSelectionProperty(streamSelection))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty,
    ) : CdkObject(cdkObject), CmafPackageProperty {
      /**
       * Parameters for encrypting content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafpackage.html#cfn-mediapackage-originendpoint-cmafpackage-encryption)
       */
      override fun encryption(): Any? = unwrap(this).getEncryption()

      /**
       * A list of HLS manifest configurations that are available from this endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafpackage.html#cfn-mediapackage-originendpoint-cmafpackage-hlsmanifests)
       */
      override fun hlsManifests(): Any? = unwrap(this).getHlsManifests()

      /**
       * Duration (in seconds) of each segment.
       *
       * Actual segments are rounded to the nearest multiple of the source segment duration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafpackage.html#cfn-mediapackage-originendpoint-cmafpackage-segmentdurationseconds)
       */
      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

      /**
       * An optional custom string that is prepended to the name of each segment.
       *
       * If not specified, the segment prefix defaults to the ChannelId.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafpackage.html#cfn-mediapackage-originendpoint-cmafpackage-segmentprefix)
       */
      override fun segmentPrefix(): String? = unwrap(this).getSegmentPrefix()

      /**
       * Limitations for outputs from the endpoint, based on the video bitrate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafpackage.html#cfn-mediapackage-originendpoint-cmafpackage-streamselection)
       */
      override fun streamSelection(): Any? = unwrap(this).getStreamSelection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CmafPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty):
          CmafPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CmafPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty
    }
  }

  /**
   * Parameters for enabling CDN authorization on the endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * AuthorizationProperty authorizationProperty = AuthorizationProperty.builder()
   * .cdnIdentifierSecret("cdnIdentifierSecret")
   * .secretsRoleArn("secretsRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-authorization.html)
   */
  public interface AuthorizationProperty {
    /**
     * The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that your Content
     * Delivery Network (CDN) uses for authorization to access your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-authorization.html#cfn-mediapackage-originendpoint-authorization-cdnidentifiersecret)
     */
    public fun cdnIdentifierSecret(): String

    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows AWS Elemental MediaPackage to
     * communicate with AWS Secrets Manager .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-authorization.html#cfn-mediapackage-originendpoint-authorization-secretsrolearn)
     */
    public fun secretsRoleArn(): String

    /**
     * A builder for [AuthorizationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cdnIdentifierSecret The Amazon Resource Name (ARN) for the secret in AWS Secrets
       * Manager that your Content Delivery Network (CDN) uses for authorization to access your
       * endpoint. 
       */
      public fun cdnIdentifierSecret(cdnIdentifierSecret: String)

      /**
       * @param secretsRoleArn The Amazon Resource Name (ARN) for the IAM role that allows AWS
       * Elemental MediaPackage to communicate with AWS Secrets Manager . 
       */
      public fun secretsRoleArn(secretsRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty.builder()

      /**
       * @param cdnIdentifierSecret The Amazon Resource Name (ARN) for the secret in AWS Secrets
       * Manager that your Content Delivery Network (CDN) uses for authorization to access your
       * endpoint. 
       */
      override fun cdnIdentifierSecret(cdnIdentifierSecret: String) {
        cdkBuilder.cdnIdentifierSecret(cdnIdentifierSecret)
      }

      /**
       * @param secretsRoleArn The Amazon Resource Name (ARN) for the IAM role that allows AWS
       * Elemental MediaPackage to communicate with AWS Secrets Manager . 
       */
      override fun secretsRoleArn(secretsRoleArn: String) {
        cdkBuilder.secretsRoleArn(secretsRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty,
    ) : CdkObject(cdkObject), AuthorizationProperty {
      /**
       * The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that your Content
       * Delivery Network (CDN) uses for authorization to access your endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-authorization.html#cfn-mediapackage-originendpoint-authorization-cdnidentifiersecret)
       */
      override fun cdnIdentifierSecret(): String = unwrap(this).getCdnIdentifierSecret()

      /**
       * The Amazon Resource Name (ARN) for the IAM role that allows AWS Elemental MediaPackage to
       * communicate with AWS Secrets Manager .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-authorization.html#cfn-mediapackage-originendpoint-authorization-secretsrolearn)
       */
      override fun secretsRoleArn(): String = unwrap(this).getSecretsRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty):
          AuthorizationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthorizationProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty
    }
  }

  /**
   * Key provider settings for DRM.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
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
  public interface SpekeKeyProviderProperty {
    /**
     * The Amazon Resource Name (ARN) for the certificate that you imported to AWS Certificate
     * Manager to add content key encryption to this endpoint.
     *
     * For this feature to work, your DRM key provider must support content key encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-spekekeyprovider.html#cfn-mediapackage-originendpoint-spekekeyprovider-certificatearn)
     */
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    /**
     * Use `encryptionContractConfiguration` to configure one or more content encryption keys for
     * your endpoints that use SPEKE Version 2.0. The encryption contract defines which content keys
     * are used to encrypt the audio and video tracks in your stream. To configure the encryption
     * contract, specify which audio and video encryption presets to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-spekekeyprovider.html#cfn-mediapackage-originendpoint-spekekeyprovider-encryptioncontractconfiguration)
     */
    public fun encryptionContractConfiguration(): Any? =
        unwrap(this).getEncryptionContractConfiguration()

    /**
     * Unique identifier for this endpoint, as it is configured in the key provider service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-spekekeyprovider.html#cfn-mediapackage-originendpoint-spekekeyprovider-resourceid)
     */
    public fun resourceId(): String

    /**
     * The ARN for the IAM role that's granted by the key provider to provide access to the key
     * provider API.
     *
     * This role must have a trust policy that allows AWS Elemental MediaPackage to assume the role,
     * and it must have a sufficient permissions policy to allow access to the specific key retrieval
     * URL. Valid format: arn:aws:iam::{accountID}:role/{name}
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-spekekeyprovider.html#cfn-mediapackage-originendpoint-spekekeyprovider-rolearn)
     */
    public fun roleArn(): String

    /**
     * List of unique identifiers for the DRM systems to use, as defined in the CPIX specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-spekekeyprovider.html#cfn-mediapackage-originendpoint-spekekeyprovider-systemids)
     */
    public fun systemIds(): List<String>

    /**
     * URL for the key provider’s key retrieval API endpoint.
     *
     * Must start with https://.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-spekekeyprovider.html#cfn-mediapackage-originendpoint-spekekeyprovider-url)
     */
    public fun url(): String

    /**
     * A builder for [SpekeKeyProviderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateArn The Amazon Resource Name (ARN) for the certificate that you imported
       * to AWS Certificate Manager to add content key encryption to this endpoint.
       * For this feature to work, your DRM key provider must support content key encryption.
       */
      public fun certificateArn(certificateArn: String)

      /**
       * @param encryptionContractConfiguration Use `encryptionContractConfiguration` to configure
       * one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
       * encryption contract defines which content keys are used to encrypt the audio and video tracks
       * in your stream. To configure the encryption contract, specify which audio and video encryption
       * presets to use.
       */
      public fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable)

      /**
       * @param encryptionContractConfiguration Use `encryptionContractConfiguration` to configure
       * one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
       * encryption contract defines which content keys are used to encrypt the audio and video tracks
       * in your stream. To configure the encryption contract, specify which audio and video encryption
       * presets to use.
       */
      public
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty)

      /**
       * @param encryptionContractConfiguration Use `encryptionContractConfiguration` to configure
       * one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
       * encryption contract defines which content keys are used to encrypt the audio and video tracks
       * in your stream. To configure the encryption contract, specify which audio and video encryption
       * presets to use.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76fba1a01bae904772c3b3b4f3acadd72b1868f4529f2b5d53749d90fe77850f")
      public
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty.Builder.() -> Unit)

      /**
       * @param resourceId Unique identifier for this endpoint, as it is configured in the key
       * provider service. 
       */
      public fun resourceId(resourceId: String)

      /**
       * @param roleArn The ARN for the IAM role that's granted by the key provider to provide
       * access to the key provider API. 
       * This role must have a trust policy that allows AWS Elemental MediaPackage to assume the
       * role, and it must have a sufficient permissions policy to allow access to the specific key
       * retrieval URL. Valid format: arn:aws:iam::{accountID}:role/{name}
       */
      public fun roleArn(roleArn: String)

      /**
       * @param systemIds List of unique identifiers for the DRM systems to use, as defined in the
       * CPIX specification. 
       */
      public fun systemIds(systemIds: List<String>)

      /**
       * @param systemIds List of unique identifiers for the DRM systems to use, as defined in the
       * CPIX specification. 
       */
      public fun systemIds(vararg systemIds: String)

      /**
       * @param url URL for the key provider’s key retrieval API endpoint. 
       * Must start with https://.
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty.builder()

      /**
       * @param certificateArn The Amazon Resource Name (ARN) for the certificate that you imported
       * to AWS Certificate Manager to add content key encryption to this endpoint.
       * For this feature to work, your DRM key provider must support content key encryption.
       */
      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      /**
       * @param encryptionContractConfiguration Use `encryptionContractConfiguration` to configure
       * one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
       * encryption contract defines which content keys are used to encrypt the audio and video tracks
       * in your stream. To configure the encryption contract, specify which audio and video encryption
       * presets to use.
       */
      override fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionContractConfiguration Use `encryptionContractConfiguration` to configure
       * one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
       * encryption contract defines which content keys are used to encrypt the audio and video tracks
       * in your stream. To configure the encryption contract, specify which audio and video encryption
       * presets to use.
       */
      override
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration.let(EncryptionContractConfigurationProperty::unwrap))
      }

      /**
       * @param encryptionContractConfiguration Use `encryptionContractConfiguration` to configure
       * one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
       * encryption contract defines which content keys are used to encrypt the audio and video tracks
       * in your stream. To configure the encryption contract, specify which audio and video encryption
       * presets to use.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76fba1a01bae904772c3b3b4f3acadd72b1868f4529f2b5d53749d90fe77850f")
      override
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty.Builder.() -> Unit):
          Unit =
          encryptionContractConfiguration(EncryptionContractConfigurationProperty(encryptionContractConfiguration))

      /**
       * @param resourceId Unique identifier for this endpoint, as it is configured in the key
       * provider service. 
       */
      override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      /**
       * @param roleArn The ARN for the IAM role that's granted by the key provider to provide
       * access to the key provider API. 
       * This role must have a trust policy that allows AWS Elemental MediaPackage to assume the
       * role, and it must have a sufficient permissions policy to allow access to the specific key
       * retrieval URL. Valid format: arn:aws:iam::{accountID}:role/{name}
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param systemIds List of unique identifiers for the DRM systems to use, as defined in the
       * CPIX specification. 
       */
      override fun systemIds(systemIds: List<String>) {
        cdkBuilder.systemIds(systemIds)
      }

      /**
       * @param systemIds List of unique identifiers for the DRM systems to use, as defined in the
       * CPIX specification. 
       */
      override fun systemIds(vararg systemIds: String): Unit = systemIds(systemIds.toList())

      /**
       * @param url URL for the key provider’s key retrieval API endpoint. 
       * Must start with https://.
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty,
    ) : CdkObject(cdkObject), SpekeKeyProviderProperty {
      /**
       * The Amazon Resource Name (ARN) for the certificate that you imported to AWS Certificate
       * Manager to add content key encryption to this endpoint.
       *
       * For this feature to work, your DRM key provider must support content key encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-spekekeyprovider.html#cfn-mediapackage-originendpoint-spekekeyprovider-certificatearn)
       */
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()

      /**
       * Use `encryptionContractConfiguration` to configure one or more content encryption keys for
       * your endpoints that use SPEKE Version 2.0. The encryption contract defines which content keys
       * are used to encrypt the audio and video tracks in your stream. To configure the encryption
       * contract, specify which audio and video encryption presets to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-spekekeyprovider.html#cfn-mediapackage-originendpoint-spekekeyprovider-encryptioncontractconfiguration)
       */
      override fun encryptionContractConfiguration(): Any? =
          unwrap(this).getEncryptionContractConfiguration()

      /**
       * Unique identifier for this endpoint, as it is configured in the key provider service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-spekekeyprovider.html#cfn-mediapackage-originendpoint-spekekeyprovider-resourceid)
       */
      override fun resourceId(): String = unwrap(this).getResourceId()

      /**
       * The ARN for the IAM role that's granted by the key provider to provide access to the key
       * provider API.
       *
       * This role must have a trust policy that allows AWS Elemental MediaPackage to assume the
       * role, and it must have a sufficient permissions policy to allow access to the specific key
       * retrieval URL. Valid format: arn:aws:iam::{accountID}:role/{name}
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-spekekeyprovider.html#cfn-mediapackage-originendpoint-spekekeyprovider-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * List of unique identifiers for the DRM systems to use, as defined in the CPIX
       * specification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-spekekeyprovider.html#cfn-mediapackage-originendpoint-spekekeyprovider-systemids)
       */
      override fun systemIds(): List<String> = unwrap(this).getSystemIds()

      /**
       * URL for the key provider’s key retrieval API endpoint.
       *
       * Must start with https://.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-spekekeyprovider.html#cfn-mediapackage-originendpoint-spekekeyprovider-url)
       */
      override fun url(): String = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpekeKeyProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty):
          SpekeKeyProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpekeKeyProviderProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty
    }
  }

  /**
   * An HTTP Live Streaming (HLS) manifest configuration on a CMAF endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
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
  public interface HlsManifestProperty {
    /**
     * Controls how ad markers are included in the packaged endpoint.
     *
     * Valid values:
     *
     * * `NONE` - Omits all SCTE-35 ad markers from the output.
     * * `PASSTHROUGH` - Creates a copy in the output of the SCTE-35 ad markers (comments) taken
     * directly from the input manifest.
     * * `SCTE35_ENHANCED` - Generates ad markers and blackout tags in the output based on the
     * SCTE-35 messages from the input manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-admarkers)
     */
    public fun adMarkers(): String? = unwrap(this).getAdMarkers()

    /**
     * Specifies the SCTE-35 message types that AWS Elemental MediaPackage treats as ad markers in
     * the output manifest.
     *
     * Valid values:
     *
     * * `BREAK`
     * * `DISTRIBUTOR_ADVERTISEMENT`
     * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY`
     * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY`
     * * `PROVIDER_ADVERTISEMENT`
     * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY`
     * * `PROVIDER_PLACEMENT_OPPORTUNITY`
     * * `SPLICE_INSERT`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-adtriggers)
     */
    public fun adTriggers(): List<String> = unwrap(this).getAdTriggers() ?: emptyList()

    /**
     * The flags on SCTE-35 segmentation descriptors that have to be present for AWS Elemental
     * MediaPackage to insert ad markers in the output manifest.
     *
     * For information about SCTE-35 in AWS Elemental MediaPackage , see [SCTE-35 Message Options in
     * AWS Elemental MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/scte.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-adsondeliveryrestrictions)
     */
    public fun adsOnDeliveryRestrictions(): String? = unwrap(this).getAdsOnDeliveryRestrictions()

    /**
     * The manifest ID is required and must be unique within the OriginEndpoint.
     *
     * The ID can't be changed after the endpoint is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-id)
     */
    public fun id(): String

    /**
     * Applies to stream sets with a single video track only.
     *
     * When true, the stream set includes an additional I-frame only stream, along with the other
     * tracks. If false, this extra stream is not included.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-includeiframeonlystream)
     */
    public fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

    /**
     * A short string that's appended to the end of the endpoint URL to create a unique path to this
     * endpoint.
     *
     * The manifestName on the HLSManifest object overrides the manifestName that you provided on
     * the originEndpoint object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-manifestname)
     */
    public fun manifestName(): String? = unwrap(this).getManifestName()

    /**
     * When specified as either `event` or `vod` , a corresponding `EXT-X-PLAYLIST-TYPE` entry is
     * included in the media playlist.
     *
     * Indicates if the playlist is live-to-VOD content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-playlisttype)
     */
    public fun playlistType(): String? = unwrap(this).getPlaylistType()

    /**
     * Time window (in seconds) contained in each parent manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-playlistwindowseconds)
     */
    public fun playlistWindowSeconds(): Number? = unwrap(this).getPlaylistWindowSeconds()

    /**
     * Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output manifest at the interval that you
     * specify.
     *
     * Additionally, ID3Timed metadata messages are generated every 5 seconds starting when the
     * content was ingested.
     *
     * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed
     * through to the HLS output.
     *
     * Omit this attribute or enter `0` to indicate that the `EXT-X-PROGRAM-DATE-TIME` tags are not
     * included in the manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-programdatetimeintervalseconds)
     */
    public fun programDateTimeIntervalSeconds(): Number? =
        unwrap(this).getProgramDateTimeIntervalSeconds()

    /**
     * The URL that's used to request this manifest from this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * A builder for [HlsManifestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adMarkers Controls how ad markers are included in the packaged endpoint.
       * Valid values:
       *
       * * `NONE` - Omits all SCTE-35 ad markers from the output.
       * * `PASSTHROUGH` - Creates a copy in the output of the SCTE-35 ad markers (comments) taken
       * directly from the input manifest.
       * * `SCTE35_ENHANCED` - Generates ad markers and blackout tags in the output based on the
       * SCTE-35 messages from the input manifest.
       */
      public fun adMarkers(adMarkers: String)

      /**
       * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage
       * treats as ad markers in the output manifest.
       * Valid values:
       *
       * * `BREAK`
       * * `DISTRIBUTOR_ADVERTISEMENT`
       * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_ADVERTISEMENT`
       * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_PLACEMENT_OPPORTUNITY`
       * * `SPLICE_INSERT`
       */
      public fun adTriggers(adTriggers: List<String>)

      /**
       * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage
       * treats as ad markers in the output manifest.
       * Valid values:
       *
       * * `BREAK`
       * * `DISTRIBUTOR_ADVERTISEMENT`
       * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_ADVERTISEMENT`
       * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_PLACEMENT_OPPORTUNITY`
       * * `SPLICE_INSERT`
       */
      public fun adTriggers(vararg adTriggers: String)

      /**
       * @param adsOnDeliveryRestrictions The flags on SCTE-35 segmentation descriptors that have to
       * be present for AWS Elemental MediaPackage to insert ad markers in the output manifest.
       * For information about SCTE-35 in AWS Elemental MediaPackage , see [SCTE-35 Message Options
       * in AWS Elemental MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/scte.html) .
       */
      public fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String)

      /**
       * @param id The manifest ID is required and must be unique within the OriginEndpoint. 
       * The ID can't be changed after the endpoint is created.
       */
      public fun id(id: String)

      /**
       * @param includeIframeOnlyStream Applies to stream sets with a single video track only.
       * When true, the stream set includes an additional I-frame only stream, along with the other
       * tracks. If false, this extra stream is not included.
       */
      public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean)

      /**
       * @param includeIframeOnlyStream Applies to stream sets with a single video track only.
       * When true, the stream set includes an additional I-frame only stream, along with the other
       * tracks. If false, this extra stream is not included.
       */
      public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable)

      /**
       * @param manifestName A short string that's appended to the end of the endpoint URL to create
       * a unique path to this endpoint.
       * The manifestName on the HLSManifest object overrides the manifestName that you provided on
       * the originEndpoint object.
       */
      public fun manifestName(manifestName: String)

      /**
       * @param playlistType When specified as either `event` or `vod` , a corresponding
       * `EXT-X-PLAYLIST-TYPE` entry is included in the media playlist.
       * Indicates if the playlist is live-to-VOD content.
       */
      public fun playlistType(playlistType: String)

      /**
       * @param playlistWindowSeconds Time window (in seconds) contained in each parent manifest.
       */
      public fun playlistWindowSeconds(playlistWindowSeconds: Number)

      /**
       * @param programDateTimeIntervalSeconds Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output
       * manifest at the interval that you specify.
       * Additionally, ID3Timed metadata messages are generated every 5 seconds starting when the
       * content was ingested.
       *
       * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed
       * through to the HLS output.
       *
       * Omit this attribute or enter `0` to indicate that the `EXT-X-PROGRAM-DATE-TIME` tags are
       * not included in the manifest.
       */
      public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number)

      /**
       * @param url The URL that's used to request this manifest from this endpoint.
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty.builder()

      /**
       * @param adMarkers Controls how ad markers are included in the packaged endpoint.
       * Valid values:
       *
       * * `NONE` - Omits all SCTE-35 ad markers from the output.
       * * `PASSTHROUGH` - Creates a copy in the output of the SCTE-35 ad markers (comments) taken
       * directly from the input manifest.
       * * `SCTE35_ENHANCED` - Generates ad markers and blackout tags in the output based on the
       * SCTE-35 messages from the input manifest.
       */
      override fun adMarkers(adMarkers: String) {
        cdkBuilder.adMarkers(adMarkers)
      }

      /**
       * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage
       * treats as ad markers in the output manifest.
       * Valid values:
       *
       * * `BREAK`
       * * `DISTRIBUTOR_ADVERTISEMENT`
       * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_ADVERTISEMENT`
       * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_PLACEMENT_OPPORTUNITY`
       * * `SPLICE_INSERT`
       */
      override fun adTriggers(adTriggers: List<String>) {
        cdkBuilder.adTriggers(adTriggers)
      }

      /**
       * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage
       * treats as ad markers in the output manifest.
       * Valid values:
       *
       * * `BREAK`
       * * `DISTRIBUTOR_ADVERTISEMENT`
       * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_ADVERTISEMENT`
       * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_PLACEMENT_OPPORTUNITY`
       * * `SPLICE_INSERT`
       */
      override fun adTriggers(vararg adTriggers: String): Unit = adTriggers(adTriggers.toList())

      /**
       * @param adsOnDeliveryRestrictions The flags on SCTE-35 segmentation descriptors that have to
       * be present for AWS Elemental MediaPackage to insert ad markers in the output manifest.
       * For information about SCTE-35 in AWS Elemental MediaPackage , see [SCTE-35 Message Options
       * in AWS Elemental MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/scte.html) .
       */
      override fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String) {
        cdkBuilder.adsOnDeliveryRestrictions(adsOnDeliveryRestrictions)
      }

      /**
       * @param id The manifest ID is required and must be unique within the OriginEndpoint. 
       * The ID can't be changed after the endpoint is created.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param includeIframeOnlyStream Applies to stream sets with a single video track only.
       * When true, the stream set includes an additional I-frame only stream, along with the other
       * tracks. If false, this extra stream is not included.
       */
      override fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
      }

      /**
       * @param includeIframeOnlyStream Applies to stream sets with a single video track only.
       * When true, the stream set includes an additional I-frame only stream, along with the other
       * tracks. If false, this extra stream is not included.
       */
      override fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream.let(IResolvable::unwrap))
      }

      /**
       * @param manifestName A short string that's appended to the end of the endpoint URL to create
       * a unique path to this endpoint.
       * The manifestName on the HLSManifest object overrides the manifestName that you provided on
       * the originEndpoint object.
       */
      override fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
      }

      /**
       * @param playlistType When specified as either `event` or `vod` , a corresponding
       * `EXT-X-PLAYLIST-TYPE` entry is included in the media playlist.
       * Indicates if the playlist is live-to-VOD content.
       */
      override fun playlistType(playlistType: String) {
        cdkBuilder.playlistType(playlistType)
      }

      /**
       * @param playlistWindowSeconds Time window (in seconds) contained in each parent manifest.
       */
      override fun playlistWindowSeconds(playlistWindowSeconds: Number) {
        cdkBuilder.playlistWindowSeconds(playlistWindowSeconds)
      }

      /**
       * @param programDateTimeIntervalSeconds Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output
       * manifest at the interval that you specify.
       * Additionally, ID3Timed metadata messages are generated every 5 seconds starting when the
       * content was ingested.
       *
       * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed
       * through to the HLS output.
       *
       * Omit this attribute or enter `0` to indicate that the `EXT-X-PROGRAM-DATE-TIME` tags are
       * not included in the manifest.
       */
      override fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
        cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
      }

      /**
       * @param url The URL that's used to request this manifest from this endpoint.
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty,
    ) : CdkObject(cdkObject), HlsManifestProperty {
      /**
       * Controls how ad markers are included in the packaged endpoint.
       *
       * Valid values:
       *
       * * `NONE` - Omits all SCTE-35 ad markers from the output.
       * * `PASSTHROUGH` - Creates a copy in the output of the SCTE-35 ad markers (comments) taken
       * directly from the input manifest.
       * * `SCTE35_ENHANCED` - Generates ad markers and blackout tags in the output based on the
       * SCTE-35 messages from the input manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-admarkers)
       */
      override fun adMarkers(): String? = unwrap(this).getAdMarkers()

      /**
       * Specifies the SCTE-35 message types that AWS Elemental MediaPackage treats as ad markers in
       * the output manifest.
       *
       * Valid values:
       *
       * * `BREAK`
       * * `DISTRIBUTOR_ADVERTISEMENT`
       * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_ADVERTISEMENT`
       * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_PLACEMENT_OPPORTUNITY`
       * * `SPLICE_INSERT`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-adtriggers)
       */
      override fun adTriggers(): List<String> = unwrap(this).getAdTriggers() ?: emptyList()

      /**
       * The flags on SCTE-35 segmentation descriptors that have to be present for AWS Elemental
       * MediaPackage to insert ad markers in the output manifest.
       *
       * For information about SCTE-35 in AWS Elemental MediaPackage , see [SCTE-35 Message Options
       * in AWS Elemental MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/scte.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-adsondeliveryrestrictions)
       */
      override fun adsOnDeliveryRestrictions(): String? =
          unwrap(this).getAdsOnDeliveryRestrictions()

      /**
       * The manifest ID is required and must be unique within the OriginEndpoint.
       *
       * The ID can't be changed after the endpoint is created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * Applies to stream sets with a single video track only.
       *
       * When true, the stream set includes an additional I-frame only stream, along with the other
       * tracks. If false, this extra stream is not included.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-includeiframeonlystream)
       */
      override fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

      /**
       * A short string that's appended to the end of the endpoint URL to create a unique path to
       * this endpoint.
       *
       * The manifestName on the HLSManifest object overrides the manifestName that you provided on
       * the originEndpoint object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-manifestname)
       */
      override fun manifestName(): String? = unwrap(this).getManifestName()

      /**
       * When specified as either `event` or `vod` , a corresponding `EXT-X-PLAYLIST-TYPE` entry is
       * included in the media playlist.
       *
       * Indicates if the playlist is live-to-VOD content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-playlisttype)
       */
      override fun playlistType(): String? = unwrap(this).getPlaylistType()

      /**
       * Time window (in seconds) contained in each parent manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-playlistwindowseconds)
       */
      override fun playlistWindowSeconds(): Number? = unwrap(this).getPlaylistWindowSeconds()

      /**
       * Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output manifest at the interval that you
       * specify.
       *
       * Additionally, ID3Timed metadata messages are generated every 5 seconds starting when the
       * content was ingested.
       *
       * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed
       * through to the HLS output.
       *
       * Omit this attribute or enter `0` to indicate that the `EXT-X-PROGRAM-DATE-TIME` tags are
       * not included in the manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-programdatetimeintervalseconds)
       */
      override fun programDateTimeIntervalSeconds(): Number? =
          unwrap(this).getProgramDateTimeIntervalSeconds()

      /**
       * The URL that's used to request this manifest from this endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html#cfn-mediapackage-originendpoint-hlsmanifest-url)
       */
      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsManifestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty):
          HlsManifestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsManifestProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty
    }
  }

  /**
   * Parameters for Apple HLS packaging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
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
  public interface HlsPackageProperty {
    /**
     * Controls how ad markers are included in the packaged endpoint.
     *
     * Valid values:
     *
     * * `NONE` - Omits all SCTE-35 ad markers from the output.
     * * `PASSTHROUGH` - Creates a copy in the output of the SCTE-35 ad markers (comments) taken
     * directly from the input manifest.
     * * `SCTE35_ENHANCED` - Generates ad markers and blackout tags in the output based on the
     * SCTE-35 messages from the input manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-admarkers)
     */
    public fun adMarkers(): String? = unwrap(this).getAdMarkers()

    /**
     * Specifies the SCTE-35 message types that AWS Elemental MediaPackage treats as ad markers in
     * the output manifest.
     *
     * Valid values:
     *
     * * `BREAK`
     * * `DISTRIBUTOR_ADVERTISEMENT`
     * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY`
     * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY`
     * * `PROVIDER_ADVERTISEMENT`
     * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY`
     * * `PROVIDER_PLACEMENT_OPPORTUNITY`
     * * `SPLICE_INSERT`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-adtriggers)
     */
    public fun adTriggers(): List<String> = unwrap(this).getAdTriggers() ?: emptyList()

    /**
     * The flags on SCTE-35 segmentation descriptors that have to be present for AWS Elemental
     * MediaPackage to insert ad markers in the output manifest.
     *
     * For information about SCTE-35 in AWS Elemental MediaPackage , see [SCTE-35 Message Options in
     * AWS Elemental MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/scte.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-adsondeliveryrestrictions)
     */
    public fun adsOnDeliveryRestrictions(): String? = unwrap(this).getAdsOnDeliveryRestrictions()

    /**
     * Parameters for encrypting content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-encryption)
     */
    public fun encryption(): Any? = unwrap(this).getEncryption()

    /**
     * When enabled, MediaPackage passes through digital video broadcasting (DVB) subtitles into the
     * output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-includedvbsubtitles)
     */
    public fun includeDvbSubtitles(): Any? = unwrap(this).getIncludeDvbSubtitles()

    /**
     * Only applies to stream sets with a single video track.
     *
     * When true, the stream set includes an additional I-frame only stream, along with the other
     * tracks. If false, this extra stream is not included.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-includeiframeonlystream)
     */
    public fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

    /**
     * When specified as either `event` or `vod` , a corresponding `EXT-X-PLAYLIST-TYPE` entry is
     * included in the media playlist.
     *
     * Indicates if the playlist is live-to-VOD content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-playlisttype)
     */
    public fun playlistType(): String? = unwrap(this).getPlaylistType()

    /**
     * Time window (in seconds) contained in each parent manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-playlistwindowseconds)
     */
    public fun playlistWindowSeconds(): Number? = unwrap(this).getPlaylistWindowSeconds()

    /**
     * Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output manifest at the interval that you
     * specify.
     *
     * Additionally, ID3Timed metadata messages are generated every 5 seconds starting when the
     * content was ingested.
     *
     * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed
     * through to the HLS output.
     *
     * Omit this attribute or enter `0` to indicate that the `EXT-X-PROGRAM-DATE-TIME` tags are not
     * included in the manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-programdatetimeintervalseconds)
     */
    public fun programDateTimeIntervalSeconds(): Number? =
        unwrap(this).getProgramDateTimeIntervalSeconds()

    /**
     * Duration (in seconds) of each fragment.
     *
     * Actual fragments are rounded to the nearest multiple of the source fragment duration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-segmentdurationseconds)
     */
    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    /**
     * Limitations for outputs from the endpoint, based on the video bitrate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-streamselection)
     */
    public fun streamSelection(): Any? = unwrap(this).getStreamSelection()

    /**
     * When true, AWS Elemental MediaPackage bundles all audio tracks in a rendition group.
     *
     * All other tracks in the stream can be used with any audio rendition from the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-useaudiorenditiongroup)
     */
    public fun useAudioRenditionGroup(): Any? = unwrap(this).getUseAudioRenditionGroup()

    /**
     * A builder for [HlsPackageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adMarkers Controls how ad markers are included in the packaged endpoint.
       * Valid values:
       *
       * * `NONE` - Omits all SCTE-35 ad markers from the output.
       * * `PASSTHROUGH` - Creates a copy in the output of the SCTE-35 ad markers (comments) taken
       * directly from the input manifest.
       * * `SCTE35_ENHANCED` - Generates ad markers and blackout tags in the output based on the
       * SCTE-35 messages from the input manifest.
       */
      public fun adMarkers(adMarkers: String)

      /**
       * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage
       * treats as ad markers in the output manifest.
       * Valid values:
       *
       * * `BREAK`
       * * `DISTRIBUTOR_ADVERTISEMENT`
       * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_ADVERTISEMENT`
       * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_PLACEMENT_OPPORTUNITY`
       * * `SPLICE_INSERT`
       */
      public fun adTriggers(adTriggers: List<String>)

      /**
       * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage
       * treats as ad markers in the output manifest.
       * Valid values:
       *
       * * `BREAK`
       * * `DISTRIBUTOR_ADVERTISEMENT`
       * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_ADVERTISEMENT`
       * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_PLACEMENT_OPPORTUNITY`
       * * `SPLICE_INSERT`
       */
      public fun adTriggers(vararg adTriggers: String)

      /**
       * @param adsOnDeliveryRestrictions The flags on SCTE-35 segmentation descriptors that have to
       * be present for AWS Elemental MediaPackage to insert ad markers in the output manifest.
       * For information about SCTE-35 in AWS Elemental MediaPackage , see [SCTE-35 Message Options
       * in AWS Elemental MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/scte.html) .
       */
      public fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String)

      /**
       * @param encryption Parameters for encrypting content.
       */
      public fun encryption(encryption: IResolvable)

      /**
       * @param encryption Parameters for encrypting content.
       */
      public fun encryption(encryption: HlsEncryptionProperty)

      /**
       * @param encryption Parameters for encrypting content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b900de351db94148571062a983ca815c20f194a2d322cd02772af17c93c6febc")
      public fun encryption(encryption: HlsEncryptionProperty.Builder.() -> Unit)

      /**
       * @param includeDvbSubtitles When enabled, MediaPackage passes through digital video
       * broadcasting (DVB) subtitles into the output.
       */
      public fun includeDvbSubtitles(includeDvbSubtitles: Boolean)

      /**
       * @param includeDvbSubtitles When enabled, MediaPackage passes through digital video
       * broadcasting (DVB) subtitles into the output.
       */
      public fun includeDvbSubtitles(includeDvbSubtitles: IResolvable)

      /**
       * @param includeIframeOnlyStream Only applies to stream sets with a single video track.
       * When true, the stream set includes an additional I-frame only stream, along with the other
       * tracks. If false, this extra stream is not included.
       */
      public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean)

      /**
       * @param includeIframeOnlyStream Only applies to stream sets with a single video track.
       * When true, the stream set includes an additional I-frame only stream, along with the other
       * tracks. If false, this extra stream is not included.
       */
      public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable)

      /**
       * @param playlistType When specified as either `event` or `vod` , a corresponding
       * `EXT-X-PLAYLIST-TYPE` entry is included in the media playlist.
       * Indicates if the playlist is live-to-VOD content.
       */
      public fun playlistType(playlistType: String)

      /**
       * @param playlistWindowSeconds Time window (in seconds) contained in each parent manifest.
       */
      public fun playlistWindowSeconds(playlistWindowSeconds: Number)

      /**
       * @param programDateTimeIntervalSeconds Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output
       * manifest at the interval that you specify.
       * Additionally, ID3Timed metadata messages are generated every 5 seconds starting when the
       * content was ingested.
       *
       * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed
       * through to the HLS output.
       *
       * Omit this attribute or enter `0` to indicate that the `EXT-X-PROGRAM-DATE-TIME` tags are
       * not included in the manifest.
       */
      public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number)

      /**
       * @param segmentDurationSeconds Duration (in seconds) of each fragment.
       * Actual fragments are rounded to the nearest multiple of the source fragment duration.
       */
      public fun segmentDurationSeconds(segmentDurationSeconds: Number)

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      public fun streamSelection(streamSelection: IResolvable)

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      public fun streamSelection(streamSelection: StreamSelectionProperty)

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e619665dfc697c58e1e80ef5fb726de90301736ca4ea3fd52eec226effa20d3f")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit)

      /**
       * @param useAudioRenditionGroup When true, AWS Elemental MediaPackage bundles all audio
       * tracks in a rendition group.
       * All other tracks in the stream can be used with any audio rendition from the group.
       */
      public fun useAudioRenditionGroup(useAudioRenditionGroup: Boolean)

      /**
       * @param useAudioRenditionGroup When true, AWS Elemental MediaPackage bundles all audio
       * tracks in a rendition group.
       * All other tracks in the stream can be used with any audio rendition from the group.
       */
      public fun useAudioRenditionGroup(useAudioRenditionGroup: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty.builder()

      /**
       * @param adMarkers Controls how ad markers are included in the packaged endpoint.
       * Valid values:
       *
       * * `NONE` - Omits all SCTE-35 ad markers from the output.
       * * `PASSTHROUGH` - Creates a copy in the output of the SCTE-35 ad markers (comments) taken
       * directly from the input manifest.
       * * `SCTE35_ENHANCED` - Generates ad markers and blackout tags in the output based on the
       * SCTE-35 messages from the input manifest.
       */
      override fun adMarkers(adMarkers: String) {
        cdkBuilder.adMarkers(adMarkers)
      }

      /**
       * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage
       * treats as ad markers in the output manifest.
       * Valid values:
       *
       * * `BREAK`
       * * `DISTRIBUTOR_ADVERTISEMENT`
       * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_ADVERTISEMENT`
       * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_PLACEMENT_OPPORTUNITY`
       * * `SPLICE_INSERT`
       */
      override fun adTriggers(adTriggers: List<String>) {
        cdkBuilder.adTriggers(adTriggers)
      }

      /**
       * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage
       * treats as ad markers in the output manifest.
       * Valid values:
       *
       * * `BREAK`
       * * `DISTRIBUTOR_ADVERTISEMENT`
       * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_ADVERTISEMENT`
       * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_PLACEMENT_OPPORTUNITY`
       * * `SPLICE_INSERT`
       */
      override fun adTriggers(vararg adTriggers: String): Unit = adTriggers(adTriggers.toList())

      /**
       * @param adsOnDeliveryRestrictions The flags on SCTE-35 segmentation descriptors that have to
       * be present for AWS Elemental MediaPackage to insert ad markers in the output manifest.
       * For information about SCTE-35 in AWS Elemental MediaPackage , see [SCTE-35 Message Options
       * in AWS Elemental MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/scte.html) .
       */
      override fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String) {
        cdkBuilder.adsOnDeliveryRestrictions(adsOnDeliveryRestrictions)
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      override fun encryption(encryption: HlsEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(HlsEncryptionProperty::unwrap))
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b900de351db94148571062a983ca815c20f194a2d322cd02772af17c93c6febc")
      override fun encryption(encryption: HlsEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(HlsEncryptionProperty(encryption))

      /**
       * @param includeDvbSubtitles When enabled, MediaPackage passes through digital video
       * broadcasting (DVB) subtitles into the output.
       */
      override fun includeDvbSubtitles(includeDvbSubtitles: Boolean) {
        cdkBuilder.includeDvbSubtitles(includeDvbSubtitles)
      }

      /**
       * @param includeDvbSubtitles When enabled, MediaPackage passes through digital video
       * broadcasting (DVB) subtitles into the output.
       */
      override fun includeDvbSubtitles(includeDvbSubtitles: IResolvable) {
        cdkBuilder.includeDvbSubtitles(includeDvbSubtitles.let(IResolvable::unwrap))
      }

      /**
       * @param includeIframeOnlyStream Only applies to stream sets with a single video track.
       * When true, the stream set includes an additional I-frame only stream, along with the other
       * tracks. If false, this extra stream is not included.
       */
      override fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
      }

      /**
       * @param includeIframeOnlyStream Only applies to stream sets with a single video track.
       * When true, the stream set includes an additional I-frame only stream, along with the other
       * tracks. If false, this extra stream is not included.
       */
      override fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream.let(IResolvable::unwrap))
      }

      /**
       * @param playlistType When specified as either `event` or `vod` , a corresponding
       * `EXT-X-PLAYLIST-TYPE` entry is included in the media playlist.
       * Indicates if the playlist is live-to-VOD content.
       */
      override fun playlistType(playlistType: String) {
        cdkBuilder.playlistType(playlistType)
      }

      /**
       * @param playlistWindowSeconds Time window (in seconds) contained in each parent manifest.
       */
      override fun playlistWindowSeconds(playlistWindowSeconds: Number) {
        cdkBuilder.playlistWindowSeconds(playlistWindowSeconds)
      }

      /**
       * @param programDateTimeIntervalSeconds Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output
       * manifest at the interval that you specify.
       * Additionally, ID3Timed metadata messages are generated every 5 seconds starting when the
       * content was ingested.
       *
       * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed
       * through to the HLS output.
       *
       * Omit this attribute or enter `0` to indicate that the `EXT-X-PROGRAM-DATE-TIME` tags are
       * not included in the manifest.
       */
      override fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
        cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
      }

      /**
       * @param segmentDurationSeconds Duration (in seconds) of each fragment.
       * Actual fragments are rounded to the nearest multiple of the source fragment duration.
       */
      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e619665dfc697c58e1e80ef5fb726de90301736ca4ea3fd52eec226effa20d3f")
      override fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit):
          Unit = streamSelection(StreamSelectionProperty(streamSelection))

      /**
       * @param useAudioRenditionGroup When true, AWS Elemental MediaPackage bundles all audio
       * tracks in a rendition group.
       * All other tracks in the stream can be used with any audio rendition from the group.
       */
      override fun useAudioRenditionGroup(useAudioRenditionGroup: Boolean) {
        cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup)
      }

      /**
       * @param useAudioRenditionGroup When true, AWS Elemental MediaPackage bundles all audio
       * tracks in a rendition group.
       * All other tracks in the stream can be used with any audio rendition from the group.
       */
      override fun useAudioRenditionGroup(useAudioRenditionGroup: IResolvable) {
        cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty,
    ) : CdkObject(cdkObject), HlsPackageProperty {
      /**
       * Controls how ad markers are included in the packaged endpoint.
       *
       * Valid values:
       *
       * * `NONE` - Omits all SCTE-35 ad markers from the output.
       * * `PASSTHROUGH` - Creates a copy in the output of the SCTE-35 ad markers (comments) taken
       * directly from the input manifest.
       * * `SCTE35_ENHANCED` - Generates ad markers and blackout tags in the output based on the
       * SCTE-35 messages from the input manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-admarkers)
       */
      override fun adMarkers(): String? = unwrap(this).getAdMarkers()

      /**
       * Specifies the SCTE-35 message types that AWS Elemental MediaPackage treats as ad markers in
       * the output manifest.
       *
       * Valid values:
       *
       * * `BREAK`
       * * `DISTRIBUTOR_ADVERTISEMENT`
       * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_ADVERTISEMENT`
       * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY`
       * * `PROVIDER_PLACEMENT_OPPORTUNITY`
       * * `SPLICE_INSERT`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-adtriggers)
       */
      override fun adTriggers(): List<String> = unwrap(this).getAdTriggers() ?: emptyList()

      /**
       * The flags on SCTE-35 segmentation descriptors that have to be present for AWS Elemental
       * MediaPackage to insert ad markers in the output manifest.
       *
       * For information about SCTE-35 in AWS Elemental MediaPackage , see [SCTE-35 Message Options
       * in AWS Elemental MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/scte.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-adsondeliveryrestrictions)
       */
      override fun adsOnDeliveryRestrictions(): String? =
          unwrap(this).getAdsOnDeliveryRestrictions()

      /**
       * Parameters for encrypting content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-encryption)
       */
      override fun encryption(): Any? = unwrap(this).getEncryption()

      /**
       * When enabled, MediaPackage passes through digital video broadcasting (DVB) subtitles into
       * the output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-includedvbsubtitles)
       */
      override fun includeDvbSubtitles(): Any? = unwrap(this).getIncludeDvbSubtitles()

      /**
       * Only applies to stream sets with a single video track.
       *
       * When true, the stream set includes an additional I-frame only stream, along with the other
       * tracks. If false, this extra stream is not included.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-includeiframeonlystream)
       */
      override fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

      /**
       * When specified as either `event` or `vod` , a corresponding `EXT-X-PLAYLIST-TYPE` entry is
       * included in the media playlist.
       *
       * Indicates if the playlist is live-to-VOD content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-playlisttype)
       */
      override fun playlistType(): String? = unwrap(this).getPlaylistType()

      /**
       * Time window (in seconds) contained in each parent manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-playlistwindowseconds)
       */
      override fun playlistWindowSeconds(): Number? = unwrap(this).getPlaylistWindowSeconds()

      /**
       * Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output manifest at the interval that you
       * specify.
       *
       * Additionally, ID3Timed metadata messages are generated every 5 seconds starting when the
       * content was ingested.
       *
       * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed
       * through to the HLS output.
       *
       * Omit this attribute or enter `0` to indicate that the `EXT-X-PROGRAM-DATE-TIME` tags are
       * not included in the manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-programdatetimeintervalseconds)
       */
      override fun programDateTimeIntervalSeconds(): Number? =
          unwrap(this).getProgramDateTimeIntervalSeconds()

      /**
       * Duration (in seconds) of each fragment.
       *
       * Actual fragments are rounded to the nearest multiple of the source fragment duration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-segmentdurationseconds)
       */
      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

      /**
       * Limitations for outputs from the endpoint, based on the video bitrate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-streamselection)
       */
      override fun streamSelection(): Any? = unwrap(this).getStreamSelection()

      /**
       * When true, AWS Elemental MediaPackage bundles all audio tracks in a rendition group.
       *
       * All other tracks in the stream can be used with any audio rendition from the group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlspackage.html#cfn-mediapackage-originendpoint-hlspackage-useaudiorenditiongroup)
       */
      override fun useAudioRenditionGroup(): Any? = unwrap(this).getUseAudioRenditionGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty):
          HlsPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty
    }
  }

  /**
   * Limitations for outputs from the endpoint, based on the video bitrate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * StreamSelectionProperty streamSelectionProperty = StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-streamselection.html)
   */
  public interface StreamSelectionProperty {
    /**
     * The upper limit of the bitrates that this endpoint serves.
     *
     * If the video track exceeds this threshold, then AWS Elemental MediaPackage excludes it from
     * output. If you don't specify a value, it defaults to 2147483647 bits per second.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-streamselection.html#cfn-mediapackage-originendpoint-streamselection-maxvideobitspersecond)
     */
    public fun maxVideoBitsPerSecond(): Number? = unwrap(this).getMaxVideoBitsPerSecond()

    /**
     * The lower limit of the bitrates that this endpoint serves.
     *
     * If the video track is below this threshold, then AWS Elemental MediaPackage excludes it from
     * output. If you don't specify a value, it defaults to 0 bits per second.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-streamselection.html#cfn-mediapackage-originendpoint-streamselection-minvideobitspersecond)
     */
    public fun minVideoBitsPerSecond(): Number? = unwrap(this).getMinVideoBitsPerSecond()

    /**
     * Order in which the different video bitrates are presented to the player.
     *
     * Valid values: `ORIGINAL` , `VIDEO_BITRATE_ASCENDING` , `VIDEO_BITRATE_DESCENDING` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-streamselection.html#cfn-mediapackage-originendpoint-streamselection-streamorder)
     */
    public fun streamOrder(): String? = unwrap(this).getStreamOrder()

    /**
     * A builder for [StreamSelectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxVideoBitsPerSecond The upper limit of the bitrates that this endpoint serves.
       * If the video track exceeds this threshold, then AWS Elemental MediaPackage excludes it from
       * output. If you don't specify a value, it defaults to 2147483647 bits per second.
       */
      public fun maxVideoBitsPerSecond(maxVideoBitsPerSecond: Number)

      /**
       * @param minVideoBitsPerSecond The lower limit of the bitrates that this endpoint serves.
       * If the video track is below this threshold, then AWS Elemental MediaPackage excludes it
       * from output. If you don't specify a value, it defaults to 0 bits per second.
       */
      public fun minVideoBitsPerSecond(minVideoBitsPerSecond: Number)

      /**
       * @param streamOrder Order in which the different video bitrates are presented to the player.
       * Valid values: `ORIGINAL` , `VIDEO_BITRATE_ASCENDING` , `VIDEO_BITRATE_DESCENDING` .
       */
      public fun streamOrder(streamOrder: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty.builder()

      /**
       * @param maxVideoBitsPerSecond The upper limit of the bitrates that this endpoint serves.
       * If the video track exceeds this threshold, then AWS Elemental MediaPackage excludes it from
       * output. If you don't specify a value, it defaults to 2147483647 bits per second.
       */
      override fun maxVideoBitsPerSecond(maxVideoBitsPerSecond: Number) {
        cdkBuilder.maxVideoBitsPerSecond(maxVideoBitsPerSecond)
      }

      /**
       * @param minVideoBitsPerSecond The lower limit of the bitrates that this endpoint serves.
       * If the video track is below this threshold, then AWS Elemental MediaPackage excludes it
       * from output. If you don't specify a value, it defaults to 0 bits per second.
       */
      override fun minVideoBitsPerSecond(minVideoBitsPerSecond: Number) {
        cdkBuilder.minVideoBitsPerSecond(minVideoBitsPerSecond)
      }

      /**
       * @param streamOrder Order in which the different video bitrates are presented to the player.
       * Valid values: `ORIGINAL` , `VIDEO_BITRATE_ASCENDING` , `VIDEO_BITRATE_DESCENDING` .
       */
      override fun streamOrder(streamOrder: String) {
        cdkBuilder.streamOrder(streamOrder)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty,
    ) : CdkObject(cdkObject), StreamSelectionProperty {
      /**
       * The upper limit of the bitrates that this endpoint serves.
       *
       * If the video track exceeds this threshold, then AWS Elemental MediaPackage excludes it from
       * output. If you don't specify a value, it defaults to 2147483647 bits per second.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-streamselection.html#cfn-mediapackage-originendpoint-streamselection-maxvideobitspersecond)
       */
      override fun maxVideoBitsPerSecond(): Number? = unwrap(this).getMaxVideoBitsPerSecond()

      /**
       * The lower limit of the bitrates that this endpoint serves.
       *
       * If the video track is below this threshold, then AWS Elemental MediaPackage excludes it
       * from output. If you don't specify a value, it defaults to 0 bits per second.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-streamselection.html#cfn-mediapackage-originendpoint-streamselection-minvideobitspersecond)
       */
      override fun minVideoBitsPerSecond(): Number? = unwrap(this).getMinVideoBitsPerSecond()

      /**
       * Order in which the different video bitrates are presented to the player.
       *
       * Valid values: `ORIGINAL` , `VIDEO_BITRATE_ASCENDING` , `VIDEO_BITRATE_DESCENDING` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-streamselection.html#cfn-mediapackage-originendpoint-streamselection-streamorder)
       */
      override fun streamOrder(): String? = unwrap(this).getStreamOrder()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StreamSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty):
          StreamSelectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamSelectionProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty
    }
  }

  /**
   * Holds encryption information so that access to the content can be controlled by a DRM solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
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
  public interface CmafEncryptionProperty {
    /**
     * An optional 128-bit, 16-byte hex value represented by a 32-character string, used in
     * conjunction with the key for encrypting blocks.
     *
     * If you don't specify a value, then AWS Elemental MediaPackage creates the constant
     * initialization vector (IV).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafencryption.html#cfn-mediapackage-originendpoint-cmafencryption-constantinitializationvector)
     */
    public fun constantInitializationVector(): String? =
        unwrap(this).getConstantInitializationVector()

    /**
     * The encryption method to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafencryption.html#cfn-mediapackage-originendpoint-cmafencryption-encryptionmethod)
     */
    public fun encryptionMethod(): String? = unwrap(this).getEncryptionMethod()

    /**
     * Number of seconds before AWS Elemental MediaPackage rotates to a new key.
     *
     * By default, rotation is set to 60 seconds. Set to `0` to disable key rotation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafencryption.html#cfn-mediapackage-originendpoint-cmafencryption-keyrotationintervalseconds)
     */
    public fun keyRotationIntervalSeconds(): Number? = unwrap(this).getKeyRotationIntervalSeconds()

    /**
     * Parameters for the SPEKE key provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafencryption.html#cfn-mediapackage-originendpoint-cmafencryption-spekekeyprovider)
     */
    public fun spekeKeyProvider(): Any

    /**
     * A builder for [CmafEncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param constantInitializationVector An optional 128-bit, 16-byte hex value represented by a
       * 32-character string, used in conjunction with the key for encrypting blocks.
       * If you don't specify a value, then AWS Elemental MediaPackage creates the constant
       * initialization vector (IV).
       */
      public fun constantInitializationVector(constantInitializationVector: String)

      /**
       * @param encryptionMethod The encryption method to use.
       */
      public fun encryptionMethod(encryptionMethod: String)

      /**
       * @param keyRotationIntervalSeconds Number of seconds before AWS Elemental MediaPackage
       * rotates to a new key.
       * By default, rotation is set to 60 seconds. Set to `0` to disable key rotation.
       */
      public fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28d41f3d947944d41f0bac8496160097adc1e6c97148897e374c518d63e4efba")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty.builder()

      /**
       * @param constantInitializationVector An optional 128-bit, 16-byte hex value represented by a
       * 32-character string, used in conjunction with the key for encrypting blocks.
       * If you don't specify a value, then AWS Elemental MediaPackage creates the constant
       * initialization vector (IV).
       */
      override fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
      }

      /**
       * @param encryptionMethod The encryption method to use.
       */
      override fun encryptionMethod(encryptionMethod: String) {
        cdkBuilder.encryptionMethod(encryptionMethod)
      }

      /**
       * @param keyRotationIntervalSeconds Number of seconds before AWS Elemental MediaPackage
       * rotates to a new key.
       * By default, rotation is set to 60 seconds. Set to `0` to disable key rotation.
       */
      override fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
        cdkBuilder.keyRotationIntervalSeconds(keyRotationIntervalSeconds)
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28d41f3d947944d41f0bac8496160097adc1e6c97148897e374c518d63e4efba")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty,
    ) : CdkObject(cdkObject), CmafEncryptionProperty {
      /**
       * An optional 128-bit, 16-byte hex value represented by a 32-character string, used in
       * conjunction with the key for encrypting blocks.
       *
       * If you don't specify a value, then AWS Elemental MediaPackage creates the constant
       * initialization vector (IV).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafencryption.html#cfn-mediapackage-originendpoint-cmafencryption-constantinitializationvector)
       */
      override fun constantInitializationVector(): String? =
          unwrap(this).getConstantInitializationVector()

      /**
       * The encryption method to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafencryption.html#cfn-mediapackage-originendpoint-cmafencryption-encryptionmethod)
       */
      override fun encryptionMethod(): String? = unwrap(this).getEncryptionMethod()

      /**
       * Number of seconds before AWS Elemental MediaPackage rotates to a new key.
       *
       * By default, rotation is set to 60 seconds. Set to `0` to disable key rotation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafencryption.html#cfn-mediapackage-originendpoint-cmafencryption-keyrotationintervalseconds)
       */
      override fun keyRotationIntervalSeconds(): Number? =
          unwrap(this).getKeyRotationIntervalSeconds()

      /**
       * Parameters for the SPEKE key provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafencryption.html#cfn-mediapackage-originendpoint-cmafencryption-spekekeyprovider)
       */
      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CmafEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty):
          CmafEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CmafEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * EncryptionContractConfigurationProperty encryptionContractConfigurationProperty =
   * EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-encryptioncontractconfiguration.html)
   */
  public interface EncryptionContractConfigurationProperty {
    /**
     * A collection of audio encryption presets.
     *
     * Value description:
     *
     * * `PRESET-AUDIO-1` - Use one content key to encrypt all of the audio tracks in your stream.
     * * `PRESET-AUDIO-2` - Use one content key to encrypt all of the stereo audio tracks and one
     * content key to encrypt all of the multichannel audio tracks.
     * * `PRESET-AUDIO-3` - Use one content key to encrypt all of the stereo audio tracks, one
     * content key to encrypt all of the multichannel audio tracks with 3 to 6 channels, and one
     * content key to encrypt all of the multichannel audio tracks with more than 6 channels.
     * * `SHARED` - Use the same content key for all of the audio and video tracks in your stream.
     * * `UNENCRYPTED` - Don't encrypt any of the audio tracks in your stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-encryptioncontractconfiguration.html#cfn-mediapackage-originendpoint-encryptioncontractconfiguration-presetspeke20audio)
     */
    public fun presetSpeke20Audio(): String

    /**
     * A collection of video encryption presets.
     *
     * Value description:
     *
     * * `PRESET-VIDEO-1` - Use one content key to encrypt all of the video tracks in your stream.
     * * `PRESET-VIDEO-2` - Use one content key to encrypt all of the SD video tracks and one
     * content key for all HD and higher resolutions video tracks.
     * * `PRESET-VIDEO-3` - Use one content key to encrypt all of the SD video tracks, one content
     * key for HD video tracks and one content key for all UHD video tracks.
     * * `PRESET-VIDEO-4` - Use one content key to encrypt all of the SD video tracks, one content
     * key for HD video tracks, one content key for all UHD1 video tracks and one content key for all
     * UHD2 video tracks.
     * * `PRESET-VIDEO-5` - Use one content key to encrypt all of the SD video tracks, one content
     * key for HD1 video tracks, one content key for HD2 video tracks, one content key for all UHD1
     * video tracks and one content key for all UHD2 video tracks.
     * * `PRESET-VIDEO-6` - Use one content key to encrypt all of the SD video tracks, one content
     * key for HD1 video tracks, one content key for HD2 video tracks and one content key for all UHD
     * video tracks.
     * * `PRESET-VIDEO-7` - Use one content key to encrypt all of the SD+HD1 video tracks, one
     * content key for HD2 video tracks and one content key for all UHD video tracks.
     * * `PRESET-VIDEO-8` - Use one content key to encrypt all of the SD+HD1 video tracks, one
     * content key for HD2 video tracks, one content key for all UHD1 video tracks and one content key
     * for all UHD2 video tracks.
     * * `SHARED` - Use the same content key for all of the video and audio tracks in your stream.
     * * `UNENCRYPTED` - Don't encrypt any of the video tracks in your stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-encryptioncontractconfiguration.html#cfn-mediapackage-originendpoint-encryptioncontractconfiguration-presetspeke20video)
     */
    public fun presetSpeke20Video(): String

    /**
     * A builder for [EncryptionContractConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param presetSpeke20Audio A collection of audio encryption presets. 
       * Value description:
       *
       * * `PRESET-AUDIO-1` - Use one content key to encrypt all of the audio tracks in your stream.
       * * `PRESET-AUDIO-2` - Use one content key to encrypt all of the stereo audio tracks and one
       * content key to encrypt all of the multichannel audio tracks.
       * * `PRESET-AUDIO-3` - Use one content key to encrypt all of the stereo audio tracks, one
       * content key to encrypt all of the multichannel audio tracks with 3 to 6 channels, and one
       * content key to encrypt all of the multichannel audio tracks with more than 6 channels.
       * * `SHARED` - Use the same content key for all of the audio and video tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the audio tracks in your stream.
       */
      public fun presetSpeke20Audio(presetSpeke20Audio: String)

      /**
       * @param presetSpeke20Video A collection of video encryption presets. 
       * Value description:
       *
       * * `PRESET-VIDEO-1` - Use one content key to encrypt all of the video tracks in your stream.
       * * `PRESET-VIDEO-2` - Use one content key to encrypt all of the SD video tracks and one
       * content key for all HD and higher resolutions video tracks.
       * * `PRESET-VIDEO-3` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-4` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks, one content key for all UHD1 video tracks and one content key for all
       * UHD2 video tracks.
       * * `PRESET-VIDEO-5` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks, one content key for all UHD1
       * video tracks and one content key for all UHD2 video tracks.
       * * `PRESET-VIDEO-6` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks and one content key for all UHD
       * video tracks.
       * * `PRESET-VIDEO-7` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-8` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks, one content key for all UHD1 video tracks and one content
       * key for all UHD2 video tracks.
       * * `SHARED` - Use the same content key for all of the video and audio tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the video tracks in your stream.
       */
      public fun presetSpeke20Video(presetSpeke20Video: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty.builder()

      /**
       * @param presetSpeke20Audio A collection of audio encryption presets. 
       * Value description:
       *
       * * `PRESET-AUDIO-1` - Use one content key to encrypt all of the audio tracks in your stream.
       * * `PRESET-AUDIO-2` - Use one content key to encrypt all of the stereo audio tracks and one
       * content key to encrypt all of the multichannel audio tracks.
       * * `PRESET-AUDIO-3` - Use one content key to encrypt all of the stereo audio tracks, one
       * content key to encrypt all of the multichannel audio tracks with 3 to 6 channels, and one
       * content key to encrypt all of the multichannel audio tracks with more than 6 channels.
       * * `SHARED` - Use the same content key for all of the audio and video tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the audio tracks in your stream.
       */
      override fun presetSpeke20Audio(presetSpeke20Audio: String) {
        cdkBuilder.presetSpeke20Audio(presetSpeke20Audio)
      }

      /**
       * @param presetSpeke20Video A collection of video encryption presets. 
       * Value description:
       *
       * * `PRESET-VIDEO-1` - Use one content key to encrypt all of the video tracks in your stream.
       * * `PRESET-VIDEO-2` - Use one content key to encrypt all of the SD video tracks and one
       * content key for all HD and higher resolutions video tracks.
       * * `PRESET-VIDEO-3` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-4` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks, one content key for all UHD1 video tracks and one content key for all
       * UHD2 video tracks.
       * * `PRESET-VIDEO-5` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks, one content key for all UHD1
       * video tracks and one content key for all UHD2 video tracks.
       * * `PRESET-VIDEO-6` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks and one content key for all UHD
       * video tracks.
       * * `PRESET-VIDEO-7` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-8` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks, one content key for all UHD1 video tracks and one content
       * key for all UHD2 video tracks.
       * * `SHARED` - Use the same content key for all of the video and audio tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the video tracks in your stream.
       */
      override fun presetSpeke20Video(presetSpeke20Video: String) {
        cdkBuilder.presetSpeke20Video(presetSpeke20Video)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty,
    ) : CdkObject(cdkObject), EncryptionContractConfigurationProperty {
      /**
       * A collection of audio encryption presets.
       *
       * Value description:
       *
       * * `PRESET-AUDIO-1` - Use one content key to encrypt all of the audio tracks in your stream.
       * * `PRESET-AUDIO-2` - Use one content key to encrypt all of the stereo audio tracks and one
       * content key to encrypt all of the multichannel audio tracks.
       * * `PRESET-AUDIO-3` - Use one content key to encrypt all of the stereo audio tracks, one
       * content key to encrypt all of the multichannel audio tracks with 3 to 6 channels, and one
       * content key to encrypt all of the multichannel audio tracks with more than 6 channels.
       * * `SHARED` - Use the same content key for all of the audio and video tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the audio tracks in your stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-encryptioncontractconfiguration.html#cfn-mediapackage-originendpoint-encryptioncontractconfiguration-presetspeke20audio)
       */
      override fun presetSpeke20Audio(): String = unwrap(this).getPresetSpeke20Audio()

      /**
       * A collection of video encryption presets.
       *
       * Value description:
       *
       * * `PRESET-VIDEO-1` - Use one content key to encrypt all of the video tracks in your stream.
       * * `PRESET-VIDEO-2` - Use one content key to encrypt all of the SD video tracks and one
       * content key for all HD and higher resolutions video tracks.
       * * `PRESET-VIDEO-3` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-4` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks, one content key for all UHD1 video tracks and one content key for all
       * UHD2 video tracks.
       * * `PRESET-VIDEO-5` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks, one content key for all UHD1
       * video tracks and one content key for all UHD2 video tracks.
       * * `PRESET-VIDEO-6` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks and one content key for all UHD
       * video tracks.
       * * `PRESET-VIDEO-7` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-8` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks, one content key for all UHD1 video tracks and one content
       * key for all UHD2 video tracks.
       * * `SHARED` - Use the same content key for all of the video and audio tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the video tracks in your stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-encryptioncontractconfiguration.html#cfn-mediapackage-originendpoint-encryptioncontractconfiguration-presetspeke20video)
       */
      override fun presetSpeke20Video(): String = unwrap(this).getPresetSpeke20Video()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EncryptionContractConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty):
          EncryptionContractConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionContractConfigurationProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.EncryptionContractConfigurationProperty
    }
  }

  /**
   * Holds encryption information so that access to the content can be controlled by a DRM solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
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
  public interface HlsEncryptionProperty {
    /**
     * A 128-bit, 16-byte hex value represented by a 32-character string, used with the key for
     * encrypting blocks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsencryption.html#cfn-mediapackage-originendpoint-hlsencryption-constantinitializationvector)
     */
    public fun constantInitializationVector(): String? =
        unwrap(this).getConstantInitializationVector()

    /**
     * HLS encryption type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsencryption.html#cfn-mediapackage-originendpoint-hlsencryption-encryptionmethod)
     */
    public fun encryptionMethod(): String? = unwrap(this).getEncryptionMethod()

    /**
     * Number of seconds before AWS Elemental MediaPackage rotates to a new key.
     *
     * By default, rotation is set to 60 seconds. Set to `0` to disable key rotation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsencryption.html#cfn-mediapackage-originendpoint-hlsencryption-keyrotationintervalseconds)
     */
    public fun keyRotationIntervalSeconds(): Number? = unwrap(this).getKeyRotationIntervalSeconds()

    /**
     * Repeat the `EXT-X-KEY` directive for every media segment.
     *
     * This might result in an increase in client requests to the DRM server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsencryption.html#cfn-mediapackage-originendpoint-hlsencryption-repeatextxkey)
     */
    public fun repeatExtXKey(): Any? = unwrap(this).getRepeatExtXKey()

    /**
     * Parameters for the SPEKE key provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsencryption.html#cfn-mediapackage-originendpoint-hlsencryption-spekekeyprovider)
     */
    public fun spekeKeyProvider(): Any

    /**
     * A builder for [HlsEncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a
       * 32-character string, used with the key for encrypting blocks.
       */
      public fun constantInitializationVector(constantInitializationVector: String)

      /**
       * @param encryptionMethod HLS encryption type.
       */
      public fun encryptionMethod(encryptionMethod: String)

      /**
       * @param keyRotationIntervalSeconds Number of seconds before AWS Elemental MediaPackage
       * rotates to a new key.
       * By default, rotation is set to 60 seconds. Set to `0` to disable key rotation.
       */
      public fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number)

      /**
       * @param repeatExtXKey Repeat the `EXT-X-KEY` directive for every media segment.
       * This might result in an increase in client requests to the DRM server.
       */
      public fun repeatExtXKey(repeatExtXKey: Boolean)

      /**
       * @param repeatExtXKey Repeat the `EXT-X-KEY` directive for every media segment.
       * This might result in an increase in client requests to the DRM server.
       */
      public fun repeatExtXKey(repeatExtXKey: IResolvable)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2cef8146b0592c3a2aabbb8a511c58ba9dc55a21669525f5b827d482e6256add")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty.builder()

      /**
       * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a
       * 32-character string, used with the key for encrypting blocks.
       */
      override fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
      }

      /**
       * @param encryptionMethod HLS encryption type.
       */
      override fun encryptionMethod(encryptionMethod: String) {
        cdkBuilder.encryptionMethod(encryptionMethod)
      }

      /**
       * @param keyRotationIntervalSeconds Number of seconds before AWS Elemental MediaPackage
       * rotates to a new key.
       * By default, rotation is set to 60 seconds. Set to `0` to disable key rotation.
       */
      override fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
        cdkBuilder.keyRotationIntervalSeconds(keyRotationIntervalSeconds)
      }

      /**
       * @param repeatExtXKey Repeat the `EXT-X-KEY` directive for every media segment.
       * This might result in an increase in client requests to the DRM server.
       */
      override fun repeatExtXKey(repeatExtXKey: Boolean) {
        cdkBuilder.repeatExtXKey(repeatExtXKey)
      }

      /**
       * @param repeatExtXKey Repeat the `EXT-X-KEY` directive for every media segment.
       * This might result in an increase in client requests to the DRM server.
       */
      override fun repeatExtXKey(repeatExtXKey: IResolvable) {
        cdkBuilder.repeatExtXKey(repeatExtXKey.let(IResolvable::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2cef8146b0592c3a2aabbb8a511c58ba9dc55a21669525f5b827d482e6256add")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty,
    ) : CdkObject(cdkObject), HlsEncryptionProperty {
      /**
       * A 128-bit, 16-byte hex value represented by a 32-character string, used with the key for
       * encrypting blocks.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsencryption.html#cfn-mediapackage-originendpoint-hlsencryption-constantinitializationvector)
       */
      override fun constantInitializationVector(): String? =
          unwrap(this).getConstantInitializationVector()

      /**
       * HLS encryption type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsencryption.html#cfn-mediapackage-originendpoint-hlsencryption-encryptionmethod)
       */
      override fun encryptionMethod(): String? = unwrap(this).getEncryptionMethod()

      /**
       * Number of seconds before AWS Elemental MediaPackage rotates to a new key.
       *
       * By default, rotation is set to 60 seconds. Set to `0` to disable key rotation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsencryption.html#cfn-mediapackage-originendpoint-hlsencryption-keyrotationintervalseconds)
       */
      override fun keyRotationIntervalSeconds(): Number? =
          unwrap(this).getKeyRotationIntervalSeconds()

      /**
       * Repeat the `EXT-X-KEY` directive for every media segment.
       *
       * This might result in an increase in client requests to the DRM server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsencryption.html#cfn-mediapackage-originendpoint-hlsencryption-repeatextxkey)
       */
      override fun repeatExtXKey(): Any? = unwrap(this).getRepeatExtXKey()

      /**
       * Parameters for the SPEKE key provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsencryption.html#cfn-mediapackage-originendpoint-hlsencryption-spekekeyprovider)
       */
      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty):
          HlsEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty
    }
  }

  /**
   * Parameters for DASH packaging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
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
  public interface DashPackageProperty {
    /**
     * Specifies the SCTE-35 message types that AWS Elemental MediaPackage treats as ad markers in
     * the output manifest.
     *
     * Valid values:
     *
     * * `BREAK`
     * * `DISTRIBUTOR_ADVERTISEMENT`
     * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY` .
     * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY` .
     * * `PROVIDER_ADVERTISEMENT` .
     * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY` .
     * * `PROVIDER_PLACEMENT_OPPORTUNITY` .
     * * `SPLICE_INSERT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-adtriggers)
     */
    public fun adTriggers(): List<String> = unwrap(this).getAdTriggers() ?: emptyList()

    /**
     * The flags on SCTE-35 segmentation descriptors that have to be present for AWS Elemental
     * MediaPackage to insert ad markers in the output manifest.
     *
     * For information about SCTE-35 in AWS Elemental MediaPackage , see [SCTE-35 Message Options in
     * AWS Elemental MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/scte.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-adsondeliveryrestrictions)
     */
    public fun adsOnDeliveryRestrictions(): String? = unwrap(this).getAdsOnDeliveryRestrictions()

    /**
     * Parameters for encrypting content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-encryption)
     */
    public fun encryption(): Any? = unwrap(this).getEncryption()

    /**
     * This applies only to stream sets with a single video track.
     *
     * When true, the stream set includes an additional I-frame trick-play only stream, along with
     * the other tracks. If false, this extra stream is not included.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-includeiframeonlystream)
     */
    public fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

    /**
     * Determines the position of some tags in the manifest.
     *
     * Valid values:
     *
     * * `FULL` - Elements like `SegmentTemplate` and `ContentProtection` are included in each
     * `Representation` .
     * * `COMPACT` - Duplicate elements are combined and presented at the `AdaptationSet` level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-manifestlayout)
     */
    public fun manifestLayout(): String? = unwrap(this).getManifestLayout()

    /**
     * Time window (in seconds) contained in each manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-manifestwindowseconds)
     */
    public fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

    /**
     * Minimum amount of content (measured in seconds) that a player must keep available in the
     * buffer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-minbuffertimeseconds)
     */
    public fun minBufferTimeSeconds(): Number? = unwrap(this).getMinBufferTimeSeconds()

    /**
     * Minimum amount of time (in seconds) that the player should wait before requesting updates to
     * the manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-minupdateperiodseconds)
     */
    public fun minUpdatePeriodSeconds(): Number? = unwrap(this).getMinUpdatePeriodSeconds()

    /**
     * Controls whether AWS Elemental MediaPackage produces single-period or multi-period DASH
     * manifests.
     *
     * For more information about periods, see [Multi-period DASH in AWS Elemental
     * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/multi-period.html) .
     *
     * Valid values:
     *
     * * `ADS` - AWS Elemental MediaPackage will produce multi-period DASH manifests. Periods are
     * created based on the SCTE-35 ad markers present in the input manifest.
     * * *No value* - AWS Elemental MediaPackage will produce single-period DASH manifests. This is
     * the default setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-periodtriggers)
     */
    public fun periodTriggers(): List<String> = unwrap(this).getPeriodTriggers() ?: emptyList()

    /**
     * The DASH profile for the output.
     *
     * Valid values:
     *
     * * `NONE` - The output doesn't use a DASH profile.
     * * `HBBTV_1_5` - The output is compliant with HbbTV v1.5.
     * * `DVB_DASH_2014` - The output is compliant with DVB-DASH 2014.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-profile)
     */
    public fun profile(): String? = unwrap(this).getProfile()

    /**
     * Duration (in seconds) of each fragment.
     *
     * Actual fragments are rounded to the nearest multiple of the source fragment duration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-segmentdurationseconds)
     */
    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    /**
     * Determines the type of variable used in the `media` URL of the `SegmentTemplate` tag in the
     * manifest.
     *
     * Also specifies if segment timeline information is included in `SegmentTimeline` or
     * `SegmentTemplate` .
     *
     * Valid values:
     *
     * * `NUMBER_WITH_TIMELINE` - The `$Number$` variable is used in the `media` URL. The value of
     * this variable is the sequential number of the segment. A full `SegmentTimeline` object is
     * presented in each `SegmentTemplate` .
     * * `NUMBER_WITH_DURATION` - The `$Number$` variable is used in the `media` URL and a
     * `duration` attribute is added to the segment template. The `SegmentTimeline` object is removed
     * from the representation.
     * * `TIME_WITH_TIMELINE` - The `$Time$` variable is used in the `media` URL. The value of this
     * variable is the timestamp of when the segment starts. A full `SegmentTimeline` object is
     * presented in each `SegmentTemplate` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-segmenttemplateformat)
     */
    public fun segmentTemplateFormat(): String? = unwrap(this).getSegmentTemplateFormat()

    /**
     * Limitations for outputs from the endpoint, based on the video bitrate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-streamselection)
     */
    public fun streamSelection(): Any? = unwrap(this).getStreamSelection()

    /**
     * Amount of time (in seconds) that the player should be from the live point at the end of the
     * manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-suggestedpresentationdelayseconds)
     */
    public fun suggestedPresentationDelaySeconds(): Number? =
        unwrap(this).getSuggestedPresentationDelaySeconds()

    /**
     * Determines the type of UTC timing included in the DASH Media Presentation Description (MPD).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-utctiming)
     */
    public fun utcTiming(): String? = unwrap(this).getUtcTiming()

    /**
     * Specifies the value attribute of the UTC timing field when utcTiming is set to HTTP-ISO or
     * HTTP-HEAD.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-utctiminguri)
     */
    public fun utcTimingUri(): String? = unwrap(this).getUtcTimingUri()

    /**
     * A builder for [DashPackageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage
       * treats as ad markers in the output manifest.
       * Valid values:
       *
       * * `BREAK`
       * * `DISTRIBUTOR_ADVERTISEMENT`
       * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY` .
       * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY` .
       * * `PROVIDER_ADVERTISEMENT` .
       * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY` .
       * * `PROVIDER_PLACEMENT_OPPORTUNITY` .
       * * `SPLICE_INSERT` .
       */
      public fun adTriggers(adTriggers: List<String>)

      /**
       * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage
       * treats as ad markers in the output manifest.
       * Valid values:
       *
       * * `BREAK`
       * * `DISTRIBUTOR_ADVERTISEMENT`
       * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY` .
       * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY` .
       * * `PROVIDER_ADVERTISEMENT` .
       * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY` .
       * * `PROVIDER_PLACEMENT_OPPORTUNITY` .
       * * `SPLICE_INSERT` .
       */
      public fun adTriggers(vararg adTriggers: String)

      /**
       * @param adsOnDeliveryRestrictions The flags on SCTE-35 segmentation descriptors that have to
       * be present for AWS Elemental MediaPackage to insert ad markers in the output manifest.
       * For information about SCTE-35 in AWS Elemental MediaPackage , see [SCTE-35 Message Options
       * in AWS Elemental MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/scte.html) .
       */
      public fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String)

      /**
       * @param encryption Parameters for encrypting content.
       */
      public fun encryption(encryption: IResolvable)

      /**
       * @param encryption Parameters for encrypting content.
       */
      public fun encryption(encryption: DashEncryptionProperty)

      /**
       * @param encryption Parameters for encrypting content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("948d988176ac0bb0cc86f0f8d83bc2275d1ae219a4aeb6ece1359fe2cf199d11")
      public fun encryption(encryption: DashEncryptionProperty.Builder.() -> Unit)

      /**
       * @param includeIframeOnlyStream This applies only to stream sets with a single video track.
       * When true, the stream set includes an additional I-frame trick-play only stream, along with
       * the other tracks. If false, this extra stream is not included.
       */
      public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean)

      /**
       * @param includeIframeOnlyStream This applies only to stream sets with a single video track.
       * When true, the stream set includes an additional I-frame trick-play only stream, along with
       * the other tracks. If false, this extra stream is not included.
       */
      public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable)

      /**
       * @param manifestLayout Determines the position of some tags in the manifest.
       * Valid values:
       *
       * * `FULL` - Elements like `SegmentTemplate` and `ContentProtection` are included in each
       * `Representation` .
       * * `COMPACT` - Duplicate elements are combined and presented at the `AdaptationSet` level.
       */
      public fun manifestLayout(manifestLayout: String)

      /**
       * @param manifestWindowSeconds Time window (in seconds) contained in each manifest.
       */
      public fun manifestWindowSeconds(manifestWindowSeconds: Number)

      /**
       * @param minBufferTimeSeconds Minimum amount of content (measured in seconds) that a player
       * must keep available in the buffer.
       */
      public fun minBufferTimeSeconds(minBufferTimeSeconds: Number)

      /**
       * @param minUpdatePeriodSeconds Minimum amount of time (in seconds) that the player should
       * wait before requesting updates to the manifest.
       */
      public fun minUpdatePeriodSeconds(minUpdatePeriodSeconds: Number)

      /**
       * @param periodTriggers Controls whether AWS Elemental MediaPackage produces single-period or
       * multi-period DASH manifests.
       * For more information about periods, see [Multi-period DASH in AWS Elemental
       * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/multi-period.html) .
       *
       * Valid values:
       *
       * * `ADS` - AWS Elemental MediaPackage will produce multi-period DASH manifests. Periods are
       * created based on the SCTE-35 ad markers present in the input manifest.
       * * *No value* - AWS Elemental MediaPackage will produce single-period DASH manifests. This
       * is the default setting.
       */
      public fun periodTriggers(periodTriggers: List<String>)

      /**
       * @param periodTriggers Controls whether AWS Elemental MediaPackage produces single-period or
       * multi-period DASH manifests.
       * For more information about periods, see [Multi-period DASH in AWS Elemental
       * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/multi-period.html) .
       *
       * Valid values:
       *
       * * `ADS` - AWS Elemental MediaPackage will produce multi-period DASH manifests. Periods are
       * created based on the SCTE-35 ad markers present in the input manifest.
       * * *No value* - AWS Elemental MediaPackage will produce single-period DASH manifests. This
       * is the default setting.
       */
      public fun periodTriggers(vararg periodTriggers: String)

      /**
       * @param profile The DASH profile for the output.
       * Valid values:
       *
       * * `NONE` - The output doesn't use a DASH profile.
       * * `HBBTV_1_5` - The output is compliant with HbbTV v1.5.
       * * `DVB_DASH_2014` - The output is compliant with DVB-DASH 2014.
       */
      public fun profile(profile: String)

      /**
       * @param segmentDurationSeconds Duration (in seconds) of each fragment.
       * Actual fragments are rounded to the nearest multiple of the source fragment duration.
       */
      public fun segmentDurationSeconds(segmentDurationSeconds: Number)

      /**
       * @param segmentTemplateFormat Determines the type of variable used in the `media` URL of the
       * `SegmentTemplate` tag in the manifest.
       * Also specifies if segment timeline information is included in `SegmentTimeline` or
       * `SegmentTemplate` .
       *
       * Valid values:
       *
       * * `NUMBER_WITH_TIMELINE` - The `$Number$` variable is used in the `media` URL. The value of
       * this variable is the sequential number of the segment. A full `SegmentTimeline` object is
       * presented in each `SegmentTemplate` .
       * * `NUMBER_WITH_DURATION` - The `$Number$` variable is used in the `media` URL and a
       * `duration` attribute is added to the segment template. The `SegmentTimeline` object is removed
       * from the representation.
       * * `TIME_WITH_TIMELINE` - The `$Time$` variable is used in the `media` URL. The value of
       * this variable is the timestamp of when the segment starts. A full `SegmentTimeline` object is
       * presented in each `SegmentTemplate` .
       */
      public fun segmentTemplateFormat(segmentTemplateFormat: String)

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      public fun streamSelection(streamSelection: IResolvable)

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      public fun streamSelection(streamSelection: StreamSelectionProperty)

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("879539f71955f2beaacfa5fe377ab9909ae70367607cfb4ea736f8bcc1ce6e0c")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit)

      /**
       * @param suggestedPresentationDelaySeconds Amount of time (in seconds) that the player should
       * be from the live point at the end of the manifest.
       */
      public fun suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds: Number)

      /**
       * @param utcTiming Determines the type of UTC timing included in the DASH Media Presentation
       * Description (MPD).
       */
      public fun utcTiming(utcTiming: String)

      /**
       * @param utcTimingUri Specifies the value attribute of the UTC timing field when utcTiming is
       * set to HTTP-ISO or HTTP-HEAD.
       */
      public fun utcTimingUri(utcTimingUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty.builder()

      /**
       * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage
       * treats as ad markers in the output manifest.
       * Valid values:
       *
       * * `BREAK`
       * * `DISTRIBUTOR_ADVERTISEMENT`
       * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY` .
       * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY` .
       * * `PROVIDER_ADVERTISEMENT` .
       * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY` .
       * * `PROVIDER_PLACEMENT_OPPORTUNITY` .
       * * `SPLICE_INSERT` .
       */
      override fun adTriggers(adTriggers: List<String>) {
        cdkBuilder.adTriggers(adTriggers)
      }

      /**
       * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage
       * treats as ad markers in the output manifest.
       * Valid values:
       *
       * * `BREAK`
       * * `DISTRIBUTOR_ADVERTISEMENT`
       * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY` .
       * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY` .
       * * `PROVIDER_ADVERTISEMENT` .
       * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY` .
       * * `PROVIDER_PLACEMENT_OPPORTUNITY` .
       * * `SPLICE_INSERT` .
       */
      override fun adTriggers(vararg adTriggers: String): Unit = adTriggers(adTriggers.toList())

      /**
       * @param adsOnDeliveryRestrictions The flags on SCTE-35 segmentation descriptors that have to
       * be present for AWS Elemental MediaPackage to insert ad markers in the output manifest.
       * For information about SCTE-35 in AWS Elemental MediaPackage , see [SCTE-35 Message Options
       * in AWS Elemental MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/scte.html) .
       */
      override fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String) {
        cdkBuilder.adsOnDeliveryRestrictions(adsOnDeliveryRestrictions)
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      override fun encryption(encryption: DashEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(DashEncryptionProperty::unwrap))
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("948d988176ac0bb0cc86f0f8d83bc2275d1ae219a4aeb6ece1359fe2cf199d11")
      override fun encryption(encryption: DashEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(DashEncryptionProperty(encryption))

      /**
       * @param includeIframeOnlyStream This applies only to stream sets with a single video track.
       * When true, the stream set includes an additional I-frame trick-play only stream, along with
       * the other tracks. If false, this extra stream is not included.
       */
      override fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
      }

      /**
       * @param includeIframeOnlyStream This applies only to stream sets with a single video track.
       * When true, the stream set includes an additional I-frame trick-play only stream, along with
       * the other tracks. If false, this extra stream is not included.
       */
      override fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream.let(IResolvable::unwrap))
      }

      /**
       * @param manifestLayout Determines the position of some tags in the manifest.
       * Valid values:
       *
       * * `FULL` - Elements like `SegmentTemplate` and `ContentProtection` are included in each
       * `Representation` .
       * * `COMPACT` - Duplicate elements are combined and presented at the `AdaptationSet` level.
       */
      override fun manifestLayout(manifestLayout: String) {
        cdkBuilder.manifestLayout(manifestLayout)
      }

      /**
       * @param manifestWindowSeconds Time window (in seconds) contained in each manifest.
       */
      override fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
      }

      /**
       * @param minBufferTimeSeconds Minimum amount of content (measured in seconds) that a player
       * must keep available in the buffer.
       */
      override fun minBufferTimeSeconds(minBufferTimeSeconds: Number) {
        cdkBuilder.minBufferTimeSeconds(minBufferTimeSeconds)
      }

      /**
       * @param minUpdatePeriodSeconds Minimum amount of time (in seconds) that the player should
       * wait before requesting updates to the manifest.
       */
      override fun minUpdatePeriodSeconds(minUpdatePeriodSeconds: Number) {
        cdkBuilder.minUpdatePeriodSeconds(minUpdatePeriodSeconds)
      }

      /**
       * @param periodTriggers Controls whether AWS Elemental MediaPackage produces single-period or
       * multi-period DASH manifests.
       * For more information about periods, see [Multi-period DASH in AWS Elemental
       * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/multi-period.html) .
       *
       * Valid values:
       *
       * * `ADS` - AWS Elemental MediaPackage will produce multi-period DASH manifests. Periods are
       * created based on the SCTE-35 ad markers present in the input manifest.
       * * *No value* - AWS Elemental MediaPackage will produce single-period DASH manifests. This
       * is the default setting.
       */
      override fun periodTriggers(periodTriggers: List<String>) {
        cdkBuilder.periodTriggers(periodTriggers)
      }

      /**
       * @param periodTriggers Controls whether AWS Elemental MediaPackage produces single-period or
       * multi-period DASH manifests.
       * For more information about periods, see [Multi-period DASH in AWS Elemental
       * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/multi-period.html) .
       *
       * Valid values:
       *
       * * `ADS` - AWS Elemental MediaPackage will produce multi-period DASH manifests. Periods are
       * created based on the SCTE-35 ad markers present in the input manifest.
       * * *No value* - AWS Elemental MediaPackage will produce single-period DASH manifests. This
       * is the default setting.
       */
      override fun periodTriggers(vararg periodTriggers: String): Unit =
          periodTriggers(periodTriggers.toList())

      /**
       * @param profile The DASH profile for the output.
       * Valid values:
       *
       * * `NONE` - The output doesn't use a DASH profile.
       * * `HBBTV_1_5` - The output is compliant with HbbTV v1.5.
       * * `DVB_DASH_2014` - The output is compliant with DVB-DASH 2014.
       */
      override fun profile(profile: String) {
        cdkBuilder.profile(profile)
      }

      /**
       * @param segmentDurationSeconds Duration (in seconds) of each fragment.
       * Actual fragments are rounded to the nearest multiple of the source fragment duration.
       */
      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      /**
       * @param segmentTemplateFormat Determines the type of variable used in the `media` URL of the
       * `SegmentTemplate` tag in the manifest.
       * Also specifies if segment timeline information is included in `SegmentTimeline` or
       * `SegmentTemplate` .
       *
       * Valid values:
       *
       * * `NUMBER_WITH_TIMELINE` - The `$Number$` variable is used in the `media` URL. The value of
       * this variable is the sequential number of the segment. A full `SegmentTimeline` object is
       * presented in each `SegmentTemplate` .
       * * `NUMBER_WITH_DURATION` - The `$Number$` variable is used in the `media` URL and a
       * `duration` attribute is added to the segment template. The `SegmentTimeline` object is removed
       * from the representation.
       * * `TIME_WITH_TIMELINE` - The `$Time$` variable is used in the `media` URL. The value of
       * this variable is the timestamp of when the segment starts. A full `SegmentTimeline` object is
       * presented in each `SegmentTemplate` .
       */
      override fun segmentTemplateFormat(segmentTemplateFormat: String) {
        cdkBuilder.segmentTemplateFormat(segmentTemplateFormat)
      }

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("879539f71955f2beaacfa5fe377ab9909ae70367607cfb4ea736f8bcc1ce6e0c")
      override fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit):
          Unit = streamSelection(StreamSelectionProperty(streamSelection))

      /**
       * @param suggestedPresentationDelaySeconds Amount of time (in seconds) that the player should
       * be from the live point at the end of the manifest.
       */
      override fun suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds: Number) {
        cdkBuilder.suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds)
      }

      /**
       * @param utcTiming Determines the type of UTC timing included in the DASH Media Presentation
       * Description (MPD).
       */
      override fun utcTiming(utcTiming: String) {
        cdkBuilder.utcTiming(utcTiming)
      }

      /**
       * @param utcTimingUri Specifies the value attribute of the UTC timing field when utcTiming is
       * set to HTTP-ISO or HTTP-HEAD.
       */
      override fun utcTimingUri(utcTimingUri: String) {
        cdkBuilder.utcTimingUri(utcTimingUri)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty,
    ) : CdkObject(cdkObject), DashPackageProperty {
      /**
       * Specifies the SCTE-35 message types that AWS Elemental MediaPackage treats as ad markers in
       * the output manifest.
       *
       * Valid values:
       *
       * * `BREAK`
       * * `DISTRIBUTOR_ADVERTISEMENT`
       * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY` .
       * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY` .
       * * `PROVIDER_ADVERTISEMENT` .
       * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY` .
       * * `PROVIDER_PLACEMENT_OPPORTUNITY` .
       * * `SPLICE_INSERT` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-adtriggers)
       */
      override fun adTriggers(): List<String> = unwrap(this).getAdTriggers() ?: emptyList()

      /**
       * The flags on SCTE-35 segmentation descriptors that have to be present for AWS Elemental
       * MediaPackage to insert ad markers in the output manifest.
       *
       * For information about SCTE-35 in AWS Elemental MediaPackage , see [SCTE-35 Message Options
       * in AWS Elemental MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/scte.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-adsondeliveryrestrictions)
       */
      override fun adsOnDeliveryRestrictions(): String? =
          unwrap(this).getAdsOnDeliveryRestrictions()

      /**
       * Parameters for encrypting content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-encryption)
       */
      override fun encryption(): Any? = unwrap(this).getEncryption()

      /**
       * This applies only to stream sets with a single video track.
       *
       * When true, the stream set includes an additional I-frame trick-play only stream, along with
       * the other tracks. If false, this extra stream is not included.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-includeiframeonlystream)
       */
      override fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

      /**
       * Determines the position of some tags in the manifest.
       *
       * Valid values:
       *
       * * `FULL` - Elements like `SegmentTemplate` and `ContentProtection` are included in each
       * `Representation` .
       * * `COMPACT` - Duplicate elements are combined and presented at the `AdaptationSet` level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-manifestlayout)
       */
      override fun manifestLayout(): String? = unwrap(this).getManifestLayout()

      /**
       * Time window (in seconds) contained in each manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-manifestwindowseconds)
       */
      override fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

      /**
       * Minimum amount of content (measured in seconds) that a player must keep available in the
       * buffer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-minbuffertimeseconds)
       */
      override fun minBufferTimeSeconds(): Number? = unwrap(this).getMinBufferTimeSeconds()

      /**
       * Minimum amount of time (in seconds) that the player should wait before requesting updates
       * to the manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-minupdateperiodseconds)
       */
      override fun minUpdatePeriodSeconds(): Number? = unwrap(this).getMinUpdatePeriodSeconds()

      /**
       * Controls whether AWS Elemental MediaPackage produces single-period or multi-period DASH
       * manifests.
       *
       * For more information about periods, see [Multi-period DASH in AWS Elemental
       * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/multi-period.html) .
       *
       * Valid values:
       *
       * * `ADS` - AWS Elemental MediaPackage will produce multi-period DASH manifests. Periods are
       * created based on the SCTE-35 ad markers present in the input manifest.
       * * *No value* - AWS Elemental MediaPackage will produce single-period DASH manifests. This
       * is the default setting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-periodtriggers)
       */
      override fun periodTriggers(): List<String> = unwrap(this).getPeriodTriggers() ?: emptyList()

      /**
       * The DASH profile for the output.
       *
       * Valid values:
       *
       * * `NONE` - The output doesn't use a DASH profile.
       * * `HBBTV_1_5` - The output is compliant with HbbTV v1.5.
       * * `DVB_DASH_2014` - The output is compliant with DVB-DASH 2014.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-profile)
       */
      override fun profile(): String? = unwrap(this).getProfile()

      /**
       * Duration (in seconds) of each fragment.
       *
       * Actual fragments are rounded to the nearest multiple of the source fragment duration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-segmentdurationseconds)
       */
      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

      /**
       * Determines the type of variable used in the `media` URL of the `SegmentTemplate` tag in the
       * manifest.
       *
       * Also specifies if segment timeline information is included in `SegmentTimeline` or
       * `SegmentTemplate` .
       *
       * Valid values:
       *
       * * `NUMBER_WITH_TIMELINE` - The `$Number$` variable is used in the `media` URL. The value of
       * this variable is the sequential number of the segment. A full `SegmentTimeline` object is
       * presented in each `SegmentTemplate` .
       * * `NUMBER_WITH_DURATION` - The `$Number$` variable is used in the `media` URL and a
       * `duration` attribute is added to the segment template. The `SegmentTimeline` object is removed
       * from the representation.
       * * `TIME_WITH_TIMELINE` - The `$Time$` variable is used in the `media` URL. The value of
       * this variable is the timestamp of when the segment starts. A full `SegmentTimeline` object is
       * presented in each `SegmentTemplate` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-segmenttemplateformat)
       */
      override fun segmentTemplateFormat(): String? = unwrap(this).getSegmentTemplateFormat()

      /**
       * Limitations for outputs from the endpoint, based on the video bitrate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-streamselection)
       */
      override fun streamSelection(): Any? = unwrap(this).getStreamSelection()

      /**
       * Amount of time (in seconds) that the player should be from the live point at the end of the
       * manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-suggestedpresentationdelayseconds)
       */
      override fun suggestedPresentationDelaySeconds(): Number? =
          unwrap(this).getSuggestedPresentationDelaySeconds()

      /**
       * Determines the type of UTC timing included in the DASH Media Presentation Description
       * (MPD).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-utctiming)
       */
      override fun utcTiming(): String? = unwrap(this).getUtcTiming()

      /**
       * Specifies the value attribute of the UTC timing field when utcTiming is set to HTTP-ISO or
       * HTTP-HEAD.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html#cfn-mediapackage-originendpoint-dashpackage-utctiminguri)
       */
      override fun utcTimingUri(): String? = unwrap(this).getUtcTimingUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DashPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty):
          DashPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty
    }
  }

  /**
   * Holds encryption information so that access to the content can be controlled by a DRM solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
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
  public interface MssEncryptionProperty {
    /**
     * Parameters for the SPEKE key provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-mssencryption.html#cfn-mediapackage-originendpoint-mssencryption-spekekeyprovider)
     */
    public fun spekeKeyProvider(): Any

    /**
     * A builder for [MssEncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9eb9558174361d4e1c7efd9c34c14fa88ec14494c90196e6cd0f0db58597a31")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty.builder()

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9eb9558174361d4e1c7efd9c34c14fa88ec14494c90196e6cd0f0db58597a31")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty,
    ) : CdkObject(cdkObject), MssEncryptionProperty {
      /**
       * Parameters for the SPEKE key provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-mssencryption.html#cfn-mediapackage-originendpoint-mssencryption-spekekeyprovider)
       */
      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MssEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty):
          MssEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MssEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssEncryptionProperty
    }
  }

  /**
   * Holds encryption information so that access to the content can be controlled by a DRM solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
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
  public interface DashEncryptionProperty {
    /**
     * Number of seconds before AWS Elemental MediaPackage rotates to a new key.
     *
     * By default, rotation is set to 60 seconds. Set to `0` to disable key rotation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashencryption.html#cfn-mediapackage-originendpoint-dashencryption-keyrotationintervalseconds)
     */
    public fun keyRotationIntervalSeconds(): Number? = unwrap(this).getKeyRotationIntervalSeconds()

    /**
     * Parameters for the SPEKE key provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashencryption.html#cfn-mediapackage-originendpoint-dashencryption-spekekeyprovider)
     */
    public fun spekeKeyProvider(): Any

    /**
     * A builder for [DashEncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keyRotationIntervalSeconds Number of seconds before AWS Elemental MediaPackage
       * rotates to a new key.
       * By default, rotation is set to 60 seconds. Set to `0` to disable key rotation.
       */
      public fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69f8de9ebec4b03286ed4459ce6d5aebf729a7ac320196f5140a4a873a44556e")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty.builder()

      /**
       * @param keyRotationIntervalSeconds Number of seconds before AWS Elemental MediaPackage
       * rotates to a new key.
       * By default, rotation is set to 60 seconds. Set to `0` to disable key rotation.
       */
      override fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
        cdkBuilder.keyRotationIntervalSeconds(keyRotationIntervalSeconds)
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69f8de9ebec4b03286ed4459ce6d5aebf729a7ac320196f5140a4a873a44556e")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty,
    ) : CdkObject(cdkObject), DashEncryptionProperty {
      /**
       * Number of seconds before AWS Elemental MediaPackage rotates to a new key.
       *
       * By default, rotation is set to 60 seconds. Set to `0` to disable key rotation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashencryption.html#cfn-mediapackage-originendpoint-dashencryption-keyrotationintervalseconds)
       */
      override fun keyRotationIntervalSeconds(): Number? =
          unwrap(this).getKeyRotationIntervalSeconds()

      /**
       * Parameters for the SPEKE key provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashencryption.html#cfn-mediapackage-originendpoint-dashencryption-spekekeyprovider)
       */
      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DashEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty):
          DashEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty
    }
  }
}
