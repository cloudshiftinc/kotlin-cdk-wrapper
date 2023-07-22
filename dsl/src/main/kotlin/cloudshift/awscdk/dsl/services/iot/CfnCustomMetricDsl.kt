@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iot.CfnCustomMetric
import software.constructs.Construct

@CdkDslMarker
public class CfnCustomMetricDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCustomMetric.Builder = CfnCustomMetric.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The friendly name in the console for the custom metric.
   *
   * This name doesn't have to be unique. Don't use this name as the metric identifier in the device
   * metric report. You can update the friendly name after you define it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-displayname)
   * @param displayName The friendly name in the console for the custom metric. 
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  /**
   * The name of the custom metric.
   *
   * This will be used in the metric report submitted from the device/thing. The name can't begin
   * with `aws:` . You can’t change the name after you define it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-metricname)
   * @param metricName The name of the custom metric. 
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * The type of the custom metric. Types include `string-list` , `ip-address-list` , `number-list`
   * , and `number` .
   *
   *
   * The type `number` only takes a single metric value as an input, but when you submit the metrics
   * value in the DeviceMetrics report, you must pass it as an array with a single value.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-metrictype)
   * @param metricType The type of the custom metric. Types include `string-list` ,
   * `ip-address-list` , `number-list` , and `number` . 
   */
  public fun metricType(metricType: String) {
    cdkBuilder.metricType(metricType)
  }

  /**
   * Metadata that can be used to manage the custom metric.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-tags)
   * @param tags Metadata that can be used to manage the custom metric. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Metadata that can be used to manage the custom metric.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-tags)
   * @param tags Metadata that can be used to manage the custom metric. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCustomMetric {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
