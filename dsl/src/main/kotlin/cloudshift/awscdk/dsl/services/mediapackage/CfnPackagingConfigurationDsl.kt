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

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration
import software.constructs.Construct

/**
 * Creates a packaging configuration in a packaging group.
 *
 * The packaging configuration represents a single delivery point for an asset. It determines the
 * format and setting for the egressing content. Specify only one package format per configuration,
 * such as `HlsPackage` .
 *
 * Example:
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
@CdkDslMarker
public class CfnPackagingConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPackagingConfiguration.Builder =
        CfnPackagingConfiguration.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Parameters for CMAF packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-cmafpackage)
     *
     * @param cmafPackage Parameters for CMAF packaging.
     */
    public fun cmafPackage(cmafPackage: IResolvable) {
        cdkBuilder.cmafPackage(cmafPackage)
    }

    /**
     * Parameters for CMAF packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-cmafpackage)
     *
     * @param cmafPackage Parameters for CMAF packaging.
     */
    public fun cmafPackage(cmafPackage: CfnPackagingConfiguration.CmafPackageProperty) {
        cdkBuilder.cmafPackage(cmafPackage)
    }

    /**
     * Parameters for DASH-ISO packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-dashpackage)
     *
     * @param dashPackage Parameters for DASH-ISO packaging.
     */
    public fun dashPackage(dashPackage: IResolvable) {
        cdkBuilder.dashPackage(dashPackage)
    }

    /**
     * Parameters for DASH-ISO packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-dashpackage)
     *
     * @param dashPackage Parameters for DASH-ISO packaging.
     */
    public fun dashPackage(dashPackage: CfnPackagingConfiguration.DashPackageProperty) {
        cdkBuilder.dashPackage(dashPackage)
    }

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-hlspackage)
     *
     * @param hlsPackage Parameters for Apple HLS packaging.
     */
    public fun hlsPackage(hlsPackage: IResolvable) {
        cdkBuilder.hlsPackage(hlsPackage)
    }

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-hlspackage)
     *
     * @param hlsPackage Parameters for Apple HLS packaging.
     */
    public fun hlsPackage(hlsPackage: CfnPackagingConfiguration.HlsPackageProperty) {
        cdkBuilder.hlsPackage(hlsPackage)
    }

    /**
     * Unique identifier that you assign to the packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-id)
     *
     * @param id Unique identifier that you assign to the packaging configuration.
     */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-msspackage)
     *
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
     */
    public fun mssPackage(mssPackage: IResolvable) {
        cdkBuilder.mssPackage(mssPackage)
    }

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-msspackage)
     *
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
     */
    public fun mssPackage(mssPackage: CfnPackagingConfiguration.MssPackageProperty) {
        cdkBuilder.mssPackage(mssPackage)
    }

    /**
     * The ID of the packaging group associated with this packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-packaginggroupid)
     *
     * @param packagingGroupId The ID of the packaging group associated with this packaging
     *   configuration.
     */
    public fun packagingGroupId(packagingGroupId: String) {
        cdkBuilder.packagingGroupId(packagingGroupId)
    }

    /**
     * The tags to assign to the packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-tags)
     *
     * @param tags The tags to assign to the packaging configuration.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to assign to the packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-tags)
     *
     * @param tags The tags to assign to the packaging configuration.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPackagingConfiguration {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
