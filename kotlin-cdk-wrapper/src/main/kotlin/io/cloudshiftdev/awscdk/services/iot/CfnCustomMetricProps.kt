@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCustomMetric`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnCustomMetricProps cfnCustomMetricProps = CfnCustomMetricProps.builder()
 * .metricType("metricType")
 * // the properties below are optional
 * .displayName("displayName")
 * .metricName("metricName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html)
 */
public interface CfnCustomMetricProps {
  /**
   * The friendly name in the console for the custom metric.
   *
   * This name doesn't have to be unique. Don't use this name as the metric identifier in the device
   * metric report. You can update the friendly name after you define it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The name of the custom metric.
   *
   * This will be used in the metric report submitted from the device/thing. The name can't begin
   * with `aws:` . You can’t change the name after you define it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-metricname)
   */
  public fun metricName(): String? = unwrap(this).getMetricName()

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
   */
  public fun metricType(): String

  /**
   * Metadata that can be used to manage the custom metric.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCustomMetricProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param displayName The friendly name in the console for the custom metric.
     * This name doesn't have to be unique. Don't use this name as the metric identifier in the
     * device metric report. You can update the friendly name after you define it.
     */
    public fun displayName(displayName: String)

    /**
     * @param metricName The name of the custom metric.
     * This will be used in the metric report submitted from the device/thing. The name can't begin
     * with `aws:` . You can’t change the name after you define it.
     */
    public fun metricName(metricName: String)

    /**
     * @param metricType The type of the custom metric. Types include `string-list` ,
     * `ip-address-list` , `number-list` , and `number` . 
     *
     * The type `number` only takes a single metric value as an input, but when you submit the
     * metrics value in the DeviceMetrics report, you must pass it as an array with a single value.
     */
    public fun metricType(metricType: String)

    /**
     * @param tags Metadata that can be used to manage the custom metric.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that can be used to manage the custom metric.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCustomMetricProps.Builder =
        software.amazon.awscdk.services.iot.CfnCustomMetricProps.builder()

    /**
     * @param displayName The friendly name in the console for the custom metric.
     * This name doesn't have to be unique. Don't use this name as the metric identifier in the
     * device metric report. You can update the friendly name after you define it.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param metricName The name of the custom metric.
     * This will be used in the metric report submitted from the device/thing. The name can't begin
     * with `aws:` . You can’t change the name after you define it.
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * @param metricType The type of the custom metric. Types include `string-list` ,
     * `ip-address-list` , `number-list` , and `number` . 
     *
     * The type `number` only takes a single metric value as an input, but when you submit the
     * metrics value in the DeviceMetrics report, you must pass it as an array with a single value.
     */
    override fun metricType(metricType: String) {
      cdkBuilder.metricType(metricType)
    }

    /**
     * @param tags Metadata that can be used to manage the custom metric.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata that can be used to manage the custom metric.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnCustomMetricProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iot.CfnCustomMetricProps,
  ) : CdkObject(cdkObject), CfnCustomMetricProps {
    /**
     * The friendly name in the console for the custom metric.
     *
     * This name doesn't have to be unique. Don't use this name as the metric identifier in the
     * device metric report. You can update the friendly name after you define it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The name of the custom metric.
     *
     * This will be used in the metric report submitted from the device/thing. The name can't begin
     * with `aws:` . You can’t change the name after you define it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-metricname)
     */
    override fun metricName(): String? = unwrap(this).getMetricName()

    /**
     * The type of the custom metric. Types include `string-list` , `ip-address-list` ,
     * `number-list` , and `number` .
     *
     *
     * The type `number` only takes a single metric value as an input, but when you submit the
     * metrics value in the DeviceMetrics report, you must pass it as an array with a single value.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-metrictype)
     */
    override fun metricType(): String = unwrap(this).getMetricType()

    /**
     * Metadata that can be used to manage the custom metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomMetricProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCustomMetricProps):
        CfnCustomMetricProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCustomMetricProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomMetricProps):
        software.amazon.awscdk.services.iot.CfnCustomMetricProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iot.CfnCustomMetricProps
  }
}
