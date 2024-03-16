@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackage

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnOriginEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediapackage.*;
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
public interface CfnOriginEndpointProps {
  /**
   * Parameters for CDN authorization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-authorization)
   */
  public fun authorization(): Any? = unwrap(this).getAuthorization()

  /**
   * The ID of the channel associated with this endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-channelid)
   */
  public fun channelId(): String

  /**
   * Parameters for Common Media Application Format (CMAF) packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-cmafpackage)
   */
  public fun cmafPackage(): Any? = unwrap(this).getCmafPackage()

  /**
   * Parameters for DASH packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-dashpackage)
   */
  public fun dashPackage(): Any? = unwrap(this).getDashPackage()

  /**
   * Any descriptive information that you want to add to the endpoint for future identification
   * purposes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Parameters for Apple HLS packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-hlspackage)
   */
  public fun hlsPackage(): Any? = unwrap(this).getHlsPackage()

  /**
   * The manifest ID is required and must be unique within the OriginEndpoint.
   *
   * The ID can't be changed after the endpoint is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-id)
   */
  public fun id(): String

  /**
   * A short string that's appended to the end of the endpoint URL to create a unique path to this
   * endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-manifestname)
   */
  public fun manifestName(): String? = unwrap(this).getManifestName()

  /**
   * Parameters for Microsoft Smooth Streaming packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-msspackage)
   */
  public fun mssPackage(): Any? = unwrap(this).getMssPackage()

  /**
   * Controls video origination from this endpoint.
   *
   * Valid values:
   *
   * * `ALLOW` - enables this endpoint to serve content to requesting devices.
   * * `DENY` - prevents this endpoint from serving content. Denying origination is helpful for
   * harvesting live-to-VOD assets. For more information about harvesting and origination, see
   * [Live-to-VOD Requirements](https://docs.aws.amazon.com/mediapackage/latest/ug/ltov-reqmts.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-origination)
   */
  public fun origination(): String? = unwrap(this).getOrigination()

  /**
   * Maximum duration (seconds) of content to retain for startover playback.
   *
   * Omit this attribute or enter `0` to indicate that startover playback is disabled for this
   * endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-startoverwindowseconds)
   */
  public fun startoverWindowSeconds(): Number? = unwrap(this).getStartoverWindowSeconds()

  /**
   * The tags to assign to the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Minimum duration (seconds) of delay to enforce on the playback of live content.
   *
   * Omit this attribute or enter `0` to indicate that there is no time delay in effect for this
   * endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-timedelayseconds)
   */
  public fun timeDelaySeconds(): Number? = unwrap(this).getTimeDelaySeconds()

  /**
   * The IP addresses that can access this endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-whitelist)
   */
  public fun whitelist(): List<String> = unwrap(this).getWhitelist() ?: emptyList()

  /**
   * A builder for [CfnOriginEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorization Parameters for CDN authorization.
     */
    public fun authorization(authorization: IResolvable)

    /**
     * @param authorization Parameters for CDN authorization.
     */
    public fun authorization(authorization: CfnOriginEndpoint.AuthorizationProperty)

    /**
     * @param authorization Parameters for CDN authorization.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f801da8105bf39d97a2fbdeca325c2b6bd4d6171a1a2d66d9448ead22795f097")
    public
        fun authorization(authorization: CfnOriginEndpoint.AuthorizationProperty.Builder.() -> Unit)

    /**
     * @param channelId The ID of the channel associated with this endpoint. 
     */
    public fun channelId(channelId: String)

    /**
     * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging.
     */
    public fun cmafPackage(cmafPackage: IResolvable)

    /**
     * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging.
     */
    public fun cmafPackage(cmafPackage: CfnOriginEndpoint.CmafPackageProperty)

    /**
     * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14cb4e7ed8209566fedc946dcffa964029f068b8c482268aa0c3ec70c66abd25")
    public fun cmafPackage(cmafPackage: CfnOriginEndpoint.CmafPackageProperty.Builder.() -> Unit)

    /**
     * @param dashPackage Parameters for DASH packaging.
     */
    public fun dashPackage(dashPackage: IResolvable)

    /**
     * @param dashPackage Parameters for DASH packaging.
     */
    public fun dashPackage(dashPackage: CfnOriginEndpoint.DashPackageProperty)

    /**
     * @param dashPackage Parameters for DASH packaging.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17a61d02d1efc5932dab8bf49c0c59685fe59699b4d1736ed0718e4efc4d0735")
    public fun dashPackage(dashPackage: CfnOriginEndpoint.DashPackageProperty.Builder.() -> Unit)

    /**
     * @param description Any descriptive information that you want to add to the endpoint for
     * future identification purposes.
     */
    public fun description(description: String)

    /**
     * @param hlsPackage Parameters for Apple HLS packaging.
     */
    public fun hlsPackage(hlsPackage: IResolvable)

    /**
     * @param hlsPackage Parameters for Apple HLS packaging.
     */
    public fun hlsPackage(hlsPackage: CfnOriginEndpoint.HlsPackageProperty)

    /**
     * @param hlsPackage Parameters for Apple HLS packaging.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b8f3001bd687a03b2149142ac34e936103f7a0bff40f15e75a1d5745c0d4185")
    public fun hlsPackage(hlsPackage: CfnOriginEndpoint.HlsPackageProperty.Builder.() -> Unit)

    /**
     * @param id The manifest ID is required and must be unique within the OriginEndpoint. 
     * The ID can't be changed after the endpoint is created.
     */
    public fun id(id: String)

    /**
     * @param manifestName A short string that's appended to the end of the endpoint URL to create a
     * unique path to this endpoint.
     */
    public fun manifestName(manifestName: String)

    /**
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
     */
    public fun mssPackage(mssPackage: IResolvable)

    /**
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
     */
    public fun mssPackage(mssPackage: CfnOriginEndpoint.MssPackageProperty)

    /**
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d4603520e616e20f4200d09ef31cb581ce170a1316d75f03bb7e3f94ea9a9665")
    public fun mssPackage(mssPackage: CfnOriginEndpoint.MssPackageProperty.Builder.() -> Unit)

    /**
     * @param origination Controls video origination from this endpoint.
     * Valid values:
     *
     * * `ALLOW` - enables this endpoint to serve content to requesting devices.
     * * `DENY` - prevents this endpoint from serving content. Denying origination is helpful for
     * harvesting live-to-VOD assets. For more information about harvesting and origination, see
     * [Live-to-VOD Requirements](https://docs.aws.amazon.com/mediapackage/latest/ug/ltov-reqmts.html)
     * .
     */
    public fun origination(origination: String)

    /**
     * @param startoverWindowSeconds Maximum duration (seconds) of content to retain for startover
     * playback.
     * Omit this attribute or enter `0` to indicate that startover playback is disabled for this
     * endpoint.
     */
    public fun startoverWindowSeconds(startoverWindowSeconds: Number)

    /**
     * @param tags The tags to assign to the endpoint.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to assign to the endpoint.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param timeDelaySeconds Minimum duration (seconds) of delay to enforce on the playback of
     * live content.
     * Omit this attribute or enter `0` to indicate that there is no time delay in effect for this
     * endpoint.
     */
    public fun timeDelaySeconds(timeDelaySeconds: Number)

    /**
     * @param whitelist The IP addresses that can access this endpoint.
     */
    public fun whitelist(whitelist: List<String>)

    /**
     * @param whitelist The IP addresses that can access this endpoint.
     */
    public fun whitelist(vararg whitelist: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps.Builder =
        software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps.builder()

    /**
     * @param authorization Parameters for CDN authorization.
     */
    override fun authorization(authorization: IResolvable) {
      cdkBuilder.authorization(authorization.let(IResolvable::unwrap))
    }

    /**
     * @param authorization Parameters for CDN authorization.
     */
    override fun authorization(authorization: CfnOriginEndpoint.AuthorizationProperty) {
      cdkBuilder.authorization(authorization.let(CfnOriginEndpoint.AuthorizationProperty::unwrap))
    }

    /**
     * @param authorization Parameters for CDN authorization.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f801da8105bf39d97a2fbdeca325c2b6bd4d6171a1a2d66d9448ead22795f097")
    override
        fun authorization(authorization: CfnOriginEndpoint.AuthorizationProperty.Builder.() -> Unit):
        Unit = authorization(CfnOriginEndpoint.AuthorizationProperty(authorization))

    /**
     * @param channelId The ID of the channel associated with this endpoint. 
     */
    override fun channelId(channelId: String) {
      cdkBuilder.channelId(channelId)
    }

    /**
     * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging.
     */
    override fun cmafPackage(cmafPackage: IResolvable) {
      cdkBuilder.cmafPackage(cmafPackage.let(IResolvable::unwrap))
    }

    /**
     * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging.
     */
    override fun cmafPackage(cmafPackage: CfnOriginEndpoint.CmafPackageProperty) {
      cdkBuilder.cmafPackage(cmafPackage.let(CfnOriginEndpoint.CmafPackageProperty::unwrap))
    }

    /**
     * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14cb4e7ed8209566fedc946dcffa964029f068b8c482268aa0c3ec70c66abd25")
    override fun cmafPackage(cmafPackage: CfnOriginEndpoint.CmafPackageProperty.Builder.() -> Unit):
        Unit = cmafPackage(CfnOriginEndpoint.CmafPackageProperty(cmafPackage))

    /**
     * @param dashPackage Parameters for DASH packaging.
     */
    override fun dashPackage(dashPackage: IResolvable) {
      cdkBuilder.dashPackage(dashPackage.let(IResolvable::unwrap))
    }

    /**
     * @param dashPackage Parameters for DASH packaging.
     */
    override fun dashPackage(dashPackage: CfnOriginEndpoint.DashPackageProperty) {
      cdkBuilder.dashPackage(dashPackage.let(CfnOriginEndpoint.DashPackageProperty::unwrap))
    }

    /**
     * @param dashPackage Parameters for DASH packaging.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17a61d02d1efc5932dab8bf49c0c59685fe59699b4d1736ed0718e4efc4d0735")
    override fun dashPackage(dashPackage: CfnOriginEndpoint.DashPackageProperty.Builder.() -> Unit):
        Unit = dashPackage(CfnOriginEndpoint.DashPackageProperty(dashPackage))

    /**
     * @param description Any descriptive information that you want to add to the endpoint for
     * future identification purposes.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param hlsPackage Parameters for Apple HLS packaging.
     */
    override fun hlsPackage(hlsPackage: IResolvable) {
      cdkBuilder.hlsPackage(hlsPackage.let(IResolvable::unwrap))
    }

    /**
     * @param hlsPackage Parameters for Apple HLS packaging.
     */
    override fun hlsPackage(hlsPackage: CfnOriginEndpoint.HlsPackageProperty) {
      cdkBuilder.hlsPackage(hlsPackage.let(CfnOriginEndpoint.HlsPackageProperty::unwrap))
    }

    /**
     * @param hlsPackage Parameters for Apple HLS packaging.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b8f3001bd687a03b2149142ac34e936103f7a0bff40f15e75a1d5745c0d4185")
    override fun hlsPackage(hlsPackage: CfnOriginEndpoint.HlsPackageProperty.Builder.() -> Unit):
        Unit = hlsPackage(CfnOriginEndpoint.HlsPackageProperty(hlsPackage))

    /**
     * @param id The manifest ID is required and must be unique within the OriginEndpoint. 
     * The ID can't be changed after the endpoint is created.
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param manifestName A short string that's appended to the end of the endpoint URL to create a
     * unique path to this endpoint.
     */
    override fun manifestName(manifestName: String) {
      cdkBuilder.manifestName(manifestName)
    }

    /**
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
     */
    override fun mssPackage(mssPackage: IResolvable) {
      cdkBuilder.mssPackage(mssPackage.let(IResolvable::unwrap))
    }

    /**
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
     */
    override fun mssPackage(mssPackage: CfnOriginEndpoint.MssPackageProperty) {
      cdkBuilder.mssPackage(mssPackage.let(CfnOriginEndpoint.MssPackageProperty::unwrap))
    }

    /**
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d4603520e616e20f4200d09ef31cb581ce170a1316d75f03bb7e3f94ea9a9665")
    override fun mssPackage(mssPackage: CfnOriginEndpoint.MssPackageProperty.Builder.() -> Unit):
        Unit = mssPackage(CfnOriginEndpoint.MssPackageProperty(mssPackage))

    /**
     * @param origination Controls video origination from this endpoint.
     * Valid values:
     *
     * * `ALLOW` - enables this endpoint to serve content to requesting devices.
     * * `DENY` - prevents this endpoint from serving content. Denying origination is helpful for
     * harvesting live-to-VOD assets. For more information about harvesting and origination, see
     * [Live-to-VOD Requirements](https://docs.aws.amazon.com/mediapackage/latest/ug/ltov-reqmts.html)
     * .
     */
    override fun origination(origination: String) {
      cdkBuilder.origination(origination)
    }

    /**
     * @param startoverWindowSeconds Maximum duration (seconds) of content to retain for startover
     * playback.
     * Omit this attribute or enter `0` to indicate that startover playback is disabled for this
     * endpoint.
     */
    override fun startoverWindowSeconds(startoverWindowSeconds: Number) {
      cdkBuilder.startoverWindowSeconds(startoverWindowSeconds)
    }

    /**
     * @param tags The tags to assign to the endpoint.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to assign to the endpoint.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param timeDelaySeconds Minimum duration (seconds) of delay to enforce on the playback of
     * live content.
     * Omit this attribute or enter `0` to indicate that there is no time delay in effect for this
     * endpoint.
     */
    override fun timeDelaySeconds(timeDelaySeconds: Number) {
      cdkBuilder.timeDelaySeconds(timeDelaySeconds)
    }

    /**
     * @param whitelist The IP addresses that can access this endpoint.
     */
    override fun whitelist(whitelist: List<String>) {
      cdkBuilder.whitelist(whitelist)
    }

    /**
     * @param whitelist The IP addresses that can access this endpoint.
     */
    override fun whitelist(vararg whitelist: String): Unit = whitelist(whitelist.toList())

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps,
  ) : CdkObject(cdkObject), CfnOriginEndpointProps {
    /**
     * Parameters for CDN authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-authorization)
     */
    override fun authorization(): Any? = unwrap(this).getAuthorization()

    /**
     * The ID of the channel associated with this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-channelid)
     */
    override fun channelId(): String = unwrap(this).getChannelId()

    /**
     * Parameters for Common Media Application Format (CMAF) packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-cmafpackage)
     */
    override fun cmafPackage(): Any? = unwrap(this).getCmafPackage()

    /**
     * Parameters for DASH packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-dashpackage)
     */
    override fun dashPackage(): Any? = unwrap(this).getDashPackage()

    /**
     * Any descriptive information that you want to add to the endpoint for future identification
     * purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-hlspackage)
     */
    override fun hlsPackage(): Any? = unwrap(this).getHlsPackage()

    /**
     * The manifest ID is required and must be unique within the OriginEndpoint.
     *
     * The ID can't be changed after the endpoint is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-id)
     */
    override fun id(): String = unwrap(this).getId()

    /**
     * A short string that's appended to the end of the endpoint URL to create a unique path to this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-manifestname)
     */
    override fun manifestName(): String? = unwrap(this).getManifestName()

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-msspackage)
     */
    override fun mssPackage(): Any? = unwrap(this).getMssPackage()

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
     */
    override fun origination(): String? = unwrap(this).getOrigination()

    /**
     * Maximum duration (seconds) of content to retain for startover playback.
     *
     * Omit this attribute or enter `0` to indicate that startover playback is disabled for this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-startoverwindowseconds)
     */
    override fun startoverWindowSeconds(): Number? = unwrap(this).getStartoverWindowSeconds()

    /**
     * The tags to assign to the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Minimum duration (seconds) of delay to enforce on the playback of live content.
     *
     * Omit this attribute or enter `0` to indicate that there is no time delay in effect for this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-timedelayseconds)
     */
    override fun timeDelaySeconds(): Number? = unwrap(this).getTimeDelaySeconds()

    /**
     * The IP addresses that can access this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-whitelist)
     */
    override fun whitelist(): List<String> = unwrap(this).getWhitelist() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOriginEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps):
        CfnOriginEndpointProps = CdkObjectWrappers.wrap(cdkObject) as CfnOriginEndpointProps

    internal fun unwrap(wrapped: CfnOriginEndpointProps):
        software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps
  }
}
