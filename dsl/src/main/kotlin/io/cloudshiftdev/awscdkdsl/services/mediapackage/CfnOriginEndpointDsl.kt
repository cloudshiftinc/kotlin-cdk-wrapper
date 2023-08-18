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

package io.cloudshiftdev.awscdkdsl.services.mediapackage

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint
import software.constructs.Construct

/**
 * Create an endpoint on an AWS Elemental MediaPackage channel.
 *
 * An endpoint represents a single delivery point of a channel, and defines content output handling
 * through various components, such as packaging protocols, DRM and encryption integration, and
 * more.
 *
 * After it's created, an endpoint provides a fixed public URL. This URL remains the same throughout
 * the lifetime of the endpoint, regardless of any failures or upgrades that might occur. Integrate
 * the URL with a downstream CDN (such as Amazon CloudFront) or playback device.
 *
 * Example:
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
@CdkDslMarker
public class CfnOriginEndpointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnOriginEndpoint.Builder = CfnOriginEndpoint.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _whitelist: MutableList<String> = mutableListOf()

    /**
     * Parameters for CDN authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-authorization)
     *
     * @param authorization Parameters for CDN authorization.
     */
    public fun authorization(authorization: IResolvable) {
        cdkBuilder.authorization(authorization)
    }

    /**
     * Parameters for CDN authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-authorization)
     *
     * @param authorization Parameters for CDN authorization.
     */
    public fun authorization(authorization: CfnOriginEndpoint.AuthorizationProperty) {
        cdkBuilder.authorization(authorization)
    }

    /**
     * The ID of the channel associated with this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-channelid)
     *
     * @param channelId The ID of the channel associated with this endpoint.
     */
    public fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
    }

    /**
     * Parameters for Common Media Application Format (CMAF) packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-cmafpackage)
     *
     * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging.
     */
    public fun cmafPackage(cmafPackage: IResolvable) {
        cdkBuilder.cmafPackage(cmafPackage)
    }

    /**
     * Parameters for Common Media Application Format (CMAF) packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-cmafpackage)
     *
     * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging.
     */
    public fun cmafPackage(cmafPackage: CfnOriginEndpoint.CmafPackageProperty) {
        cdkBuilder.cmafPackage(cmafPackage)
    }

    /**
     * Parameters for DASH packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-dashpackage)
     *
     * @param dashPackage Parameters for DASH packaging.
     */
    public fun dashPackage(dashPackage: IResolvable) {
        cdkBuilder.dashPackage(dashPackage)
    }

    /**
     * Parameters for DASH packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-dashpackage)
     *
     * @param dashPackage Parameters for DASH packaging.
     */
    public fun dashPackage(dashPackage: CfnOriginEndpoint.DashPackageProperty) {
        cdkBuilder.dashPackage(dashPackage)
    }

    /**
     * Any descriptive information that you want to add to the endpoint for future identification
     * purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-description)
     *
     * @param description Any descriptive information that you want to add to the endpoint for
     *   future identification purposes.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-hlspackage)
     *
     * @param hlsPackage Parameters for Apple HLS packaging.
     */
    public fun hlsPackage(hlsPackage: IResolvable) {
        cdkBuilder.hlsPackage(hlsPackage)
    }

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-hlspackage)
     *
     * @param hlsPackage Parameters for Apple HLS packaging.
     */
    public fun hlsPackage(hlsPackage: CfnOriginEndpoint.HlsPackageProperty) {
        cdkBuilder.hlsPackage(hlsPackage)
    }

    /**
     * The manifest ID is required and must be unique within the OriginEndpoint.
     *
     * The ID can't be changed after the endpoint is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-id)
     *
     * @param id The manifest ID is required and must be unique within the OriginEndpoint.
     */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * A short string that's appended to the end of the endpoint URL to create a unique path to this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-manifestname)
     *
     * @param manifestName A short string that's appended to the end of the endpoint URL to create a
     *   unique path to this endpoint.
     */
    public fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
    }

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-msspackage)
     *
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
     */
    public fun mssPackage(mssPackage: IResolvable) {
        cdkBuilder.mssPackage(mssPackage)
    }

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-msspackage)
     *
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
     */
    public fun mssPackage(mssPackage: CfnOriginEndpoint.MssPackageProperty) {
        cdkBuilder.mssPackage(mssPackage)
    }

    /**
     * Controls video origination from this endpoint.
     *
     * Valid values:
     * * `ALLOW` - enables this endpoint to serve content to requesting devices.
     * * `DENY` - prevents this endpoint from serving content. Denying origination is helpful for
     *   harvesting live-to-VOD assets. For more information about harvesting and origination, see
     *   [Live-to-VOD Requirements](https://docs.aws.amazon.com/mediapackage/latest/ug/ltov-reqmts.html)
     *   .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-origination)
     *
     * @param origination Controls video origination from this endpoint.
     */
    public fun origination(origination: String) {
        cdkBuilder.origination(origination)
    }

    /**
     * Maximum duration (seconds) of content to retain for startover playback.
     *
     * Omit this attribute or enter `0` to indicate that startover playback is disabled for this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-startoverwindowseconds)
     *
     * @param startoverWindowSeconds Maximum duration (seconds) of content to retain for startover
     *   playback.
     */
    public fun startoverWindowSeconds(startoverWindowSeconds: Number) {
        cdkBuilder.startoverWindowSeconds(startoverWindowSeconds)
    }

    /**
     * The tags to assign to the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-tags)
     *
     * @param tags The tags to assign to the endpoint.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to assign to the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-tags)
     *
     * @param tags The tags to assign to the endpoint.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Minimum duration (seconds) of delay to enforce on the playback of live content.
     *
     * Omit this attribute or enter `0` to indicate that there is no time delay in effect for this
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-timedelayseconds)
     *
     * @param timeDelaySeconds Minimum duration (seconds) of delay to enforce on the playback of
     *   live content.
     */
    public fun timeDelaySeconds(timeDelaySeconds: Number) {
        cdkBuilder.timeDelaySeconds(timeDelaySeconds)
    }

    /**
     * The IP addresses that can access this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-whitelist)
     *
     * @param whitelist The IP addresses that can access this endpoint.
     */
    public fun whitelist(vararg whitelist: String) {
        _whitelist.addAll(listOf(*whitelist))
    }

    /**
     * The IP addresses that can access this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-whitelist)
     *
     * @param whitelist The IP addresses that can access this endpoint.
     */
    public fun whitelist(whitelist: Collection<String>) {
        _whitelist.addAll(whitelist)
    }

    public fun build(): CfnOriginEndpoint {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_whitelist.isNotEmpty()) cdkBuilder.whitelist(_whitelist)
        return cdkBuilder.build()
    }
}
