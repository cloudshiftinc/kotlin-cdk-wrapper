@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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
import software.amazon.awscdk.services.guardduty.CfnDetectorProps

/**
 * Properties for defining a `CfnDetector`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * CfnDetectorProps cfnDetectorProps = CfnDetectorProps.builder()
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
public class CfnDetectorPropsDsl {
  private val cdkBuilder: CfnDetectorProps.Builder = CfnDetectorProps.builder()

  private val _features: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param dataSources Describes which data sources will be enabled for the detector.
   */
  public fun dataSources(dataSources: IResolvable) {
    cdkBuilder.dataSources(dataSources)
  }

  /**
   * @param dataSources Describes which data sources will be enabled for the detector.
   */
  public fun dataSources(dataSources: CfnDetector.CFNDataSourceConfigurationsProperty) {
    cdkBuilder.dataSources(dataSources)
  }

  /**
   * @param enable Specifies whether the detector is to be enabled on creation. 
   */
  public fun enable(enable: Boolean) {
    cdkBuilder.enable(enable)
  }

  /**
   * @param enable Specifies whether the detector is to be enabled on creation. 
   */
  public fun enable(enable: IResolvable) {
    cdkBuilder.enable(enable)
  }

  /**
   * @param features A list of features that will be configured for the detector.
   */
  public fun features(vararg features: Any) {
    _features.addAll(listOf(*features))
  }

  /**
   * @param features A list of features that will be configured for the detector.
   */
  public fun features(features: Collection<Any>) {
    _features.addAll(features)
  }

  /**
   * @param features A list of features that will be configured for the detector.
   */
  public fun features(features: IResolvable) {
    cdkBuilder.features(features)
  }

  /**
   * @param findingPublishingFrequency Specifies how frequently updated findings are exported.
   */
  public fun findingPublishingFrequency(findingPublishingFrequency: String) {
    cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
  }

  /**
   * @param tags Specifies tags added to a new detector resource.
   * Each tag consists of a key and an optional value, both of which you define.
   *
   * Currently, support is available only for creating and deleting a tag. No support exists for
   * updating the tags.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Specifies tags added to a new detector resource.
   * Each tag consists of a key and an optional value, both of which you define.
   *
   * Currently, support is available only for creating and deleting a tag. No support exists for
   * updating the tags.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDetectorProps {
    if(_features.isNotEmpty()) cdkBuilder.features(_features)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
