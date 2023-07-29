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

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnDetector
import software.constructs.Construct

/**
 * The `AWS::GuardDuty::Detector` resource specifies a new GuardDuty detector.
 *
 * A detector is an object that represents the GuardDuty service. A detector is required for
 * GuardDuty to become operational.
 *
 * Make sure you use either `DataSources` or `Features` in a one request, and not both.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * CfnDetector cfnDetector = CfnDetector.Builder.create(this, "MyCfnDetector")
 * .enable(false)
 * // the properties below are optional
 * .dataSources(CFNDataSourceConfigurationsProperty.builder()
 * .kubernetes(CFNKubernetesConfigurationProperty.builder()
 * .auditLogs(CFNKubernetesAuditLogsConfigurationProperty.builder()
 * .enable(false)
 * .build())
 * .build())
 * .malwareProtection(CFNMalwareProtectionConfigurationProperty.builder()
 * .scanEc2InstanceWithFindings(CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()
 * .ebsVolumes(false)
 * .build())
 * .build())
 * .s3Logs(CFNS3LogsConfigurationProperty.builder()
 * .enable(false)
 * .build())
 * .build())
 * .features(List.of(FeatureConfigurationsProperty.builder()
 * .additionalConfiguration(List.of(FeatureAdditionalConfigurationProperty.builder()
 * .name("name")
 * .status("status")
 * .build()))
 * .name("name")
 * .status("status")
 * .build()))
 * .findingPublishingFrequency("findingPublishingFrequency")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html)
 */
@CdkDslMarker
public class CfnDetectorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDetector.Builder = CfnDetector.Builder.create(scope, id)

    private val _features: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Describes which data sources will be enabled for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-datasources)
     *
     * @param dataSources Describes which data sources will be enabled for the detector.
     */
    public fun dataSources(dataSources: IResolvable) {
        cdkBuilder.dataSources(dataSources)
    }

    /**
     * Describes which data sources will be enabled for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-datasources)
     *
     * @param dataSources Describes which data sources will be enabled for the detector.
     */
    public fun dataSources(dataSources: CfnDetector.CFNDataSourceConfigurationsProperty) {
        cdkBuilder.dataSources(dataSources)
    }

    /**
     * Specifies whether the detector is to be enabled on creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable)
     *
     * @param enable Specifies whether the detector is to be enabled on creation.
     */
    public fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
    }

    /**
     * Specifies whether the detector is to be enabled on creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable)
     *
     * @param enable Specifies whether the detector is to be enabled on creation.
     */
    public fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable)
    }

    /**
     * A list of features that will be configured for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-features)
     *
     * @param features A list of features that will be configured for the detector.
     */
    public fun features(vararg features: Any) {
        _features.addAll(listOf(*features))
    }

    /**
     * A list of features that will be configured for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-features)
     *
     * @param features A list of features that will be configured for the detector.
     */
    public fun features(features: Collection<Any>) {
        _features.addAll(features)
    }

    /**
     * A list of features that will be configured for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-features)
     *
     * @param features A list of features that will be configured for the detector.
     */
    public fun features(features: IResolvable) {
        cdkBuilder.features(features)
    }

    /**
     * Specifies how frequently updated findings are exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-findingpublishingfrequency)
     *
     * @param findingPublishingFrequency Specifies how frequently updated findings are exported.
     */
    public fun findingPublishingFrequency(findingPublishingFrequency: String) {
        cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
    }

    /**
     * Specifies tags added to a new detector resource.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Currently, support is available only for creating and deleting a tag. No support exists for
     * updating the tags.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-tags)
     *
     * @param tags Specifies tags added to a new detector resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Specifies tags added to a new detector resource.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Currently, support is available only for creating and deleting a tag. No support exists for
     * updating the tags.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-tags)
     *
     * @param tags Specifies tags added to a new detector resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDetector {
        if (_features.isNotEmpty()) cdkBuilder.features(_features)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
