@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::IoT::CustomMetric` resource to define a custom metric published by your devices to
 * Device Defender.
 *
 * For API reference, see
 * [CreateCustomMetric](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCustomMetric.html)
 * and for general information, see [Custom
 * metrics](https://docs.aws.amazon.com/iot/latest/developerguide/dd-detect-custom-metrics.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnCustomMetric cfnCustomMetric = CfnCustomMetric.Builder.create(this, "MyCfnCustomMetric")
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
public open class CfnCustomMetric(
  cdkObject: software.amazon.awscdk.services.iot.CfnCustomMetric,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomMetricProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnCustomMetric(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCustomMetricProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomMetricProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCustomMetricProps(props)
  )

  /**
   * The Amazon Resource Number (ARN) of the custom metric;
   *
   * for example, `arn: *aws-partition* :iot: *region* : *accountId* :custommetric/ *metricName*` .
   */
  public open fun attrMetricArn(): String = unwrap(this).getAttrMetricArn()

  /**
   * The friendly name in the console for the custom metric.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The friendly name in the console for the custom metric.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the custom metric.
   */
  public open fun metricName(): String? = unwrap(this).getMetricName()

  /**
   * The name of the custom metric.
   */
  public open fun metricName(`value`: String) {
    unwrap(this).setMetricName(`value`)
  }

  /**
   * The type of the custom metric.
   *
   * Types include `string-list` , `ip-address-list` , `number-list` , and `number` .
   */
  public open fun metricType(): String = unwrap(this).getMetricType()

  /**
   * The type of the custom metric.
   *
   * Types include `string-list` , `ip-address-list` , `number-list` , and `number` .
   */
  public open fun metricType(`value`: String) {
    unwrap(this).setMetricType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata that can be used to manage the custom metric.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata that can be used to manage the custom metric.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata that can be used to manage the custom metric.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnCustomMetric].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The friendly name in the console for the custom metric.
     *
     * This name doesn't have to be unique. Don't use this name as the metric identifier in the
     * device metric report. You can update the friendly name after you define it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-displayname)
     * @param displayName The friendly name in the console for the custom metric. 
     */
    public fun displayName(displayName: String)

    /**
     * The name of the custom metric.
     *
     * This will be used in the metric report submitted from the device/thing. The name can't begin
     * with `aws:` . You can’t change the name after you define it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-metricname)
     * @param metricName The name of the custom metric. 
     */
    public fun metricName(metricName: String)

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
     * @param metricType The type of the custom metric. Types include `string-list` ,
     * `ip-address-list` , `number-list` , and `number` . 
     */
    public fun metricType(metricType: String)

    /**
     * Metadata that can be used to manage the custom metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-tags)
     * @param tags Metadata that can be used to manage the custom metric. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that can be used to manage the custom metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-tags)
     * @param tags Metadata that can be used to manage the custom metric. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCustomMetric.Builder =
        software.amazon.awscdk.services.iot.CfnCustomMetric.Builder.create(scope, id)

    /**
     * The friendly name in the console for the custom metric.
     *
     * This name doesn't have to be unique. Don't use this name as the metric identifier in the
     * device metric report. You can update the friendly name after you define it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-displayname)
     * @param displayName The friendly name in the console for the custom metric. 
     */
    override fun displayName(displayName: String) {
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
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

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
     * @param metricType The type of the custom metric. Types include `string-list` ,
     * `ip-address-list` , `number-list` , and `number` . 
     */
    override fun metricType(metricType: String) {
      cdkBuilder.metricType(metricType)
    }

    /**
     * Metadata that can be used to manage the custom metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-tags)
     * @param tags Metadata that can be used to manage the custom metric. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Metadata that can be used to manage the custom metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-custommetric.html#cfn-iot-custommetric-tags)
     * @param tags Metadata that can be used to manage the custom metric. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnCustomMetric = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnCustomMetric.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomMetric {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomMetric(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCustomMetric):
        CfnCustomMetric = CfnCustomMetric(cdkObject)

    internal fun unwrap(wrapped: CfnCustomMetric):
        software.amazon.awscdk.services.iot.CfnCustomMetric = wrapped.cdkObject as
        software.amazon.awscdk.services.iot.CfnCustomMetric
  }
}
