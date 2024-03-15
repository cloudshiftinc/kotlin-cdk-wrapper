@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.forecast

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
 * Creates a dataset group, which holds a collection of related datasets.
 *
 * You can add datasets to the dataset group when you create the dataset group, or later by using
 * the [UpdateDatasetGroup](https://docs.aws.amazon.com/forecast/latest/dg/API_UpdateDatasetGroup.html)
 * operation.
 *
 * After creating a dataset group and adding datasets, you use the dataset group when you create a
 * predictor. For more information, see [Dataset
 * groups](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-datasets-groups.html) .
 *
 * To get a list of all your datasets groups, use the
 * [ListDatasetGroups](https://docs.aws.amazon.com/forecast/latest/dg/API_ListDatasetGroups.html)
 * operation.
 *
 *
 * The `Status` of a dataset group must be `ACTIVE` before you can use the dataset group to create a
 * predictor. To get the status, use the
 * [DescribeDatasetGroup](https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetGroup.html)
 * operation.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.forecast.*;
 * CfnDatasetGroup cfnDatasetGroup = CfnDatasetGroup.Builder.create(this, "MyCfnDatasetGroup")
 * .datasetGroupName("datasetGroupName")
 * .domain("domain")
 * // the properties below are optional
 * .datasetArns(List.of("datasetArns"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html)
 */
public open class CfnDatasetGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.forecast.CfnDatasetGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the dataset group.
   */
  public open fun attrDatasetGroupArn(): String = unwrap(this).getAttrDatasetGroupArn()

  /**
   * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the
   * dataset group.
   */
  public open fun datasetArns(): List<String> = unwrap(this).getDatasetArns() ?: emptyList()

  /**
   * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the
   * dataset group.
   */
  public open fun datasetArns(`value`: List<String>) {
    unwrap(this).setDatasetArns(`value`)
  }

  /**
   * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the
   * dataset group.
   */
  public open fun datasetArns(vararg `value`: String): Unit = datasetArns(`value`.toList())

  /**
   * The name of the dataset group.
   */
  public open fun datasetGroupName(): String = unwrap(this).getDatasetGroupName()

  /**
   * The name of the dataset group.
   */
  public open fun datasetGroupName(`value`: String) {
    unwrap(this).setDatasetGroupName(`value`)
  }

  /**
   * The domain associated with the dataset group.
   */
  public open fun domain(): String = unwrap(this).getDomain()

  /**
   * The domain associated with the dataset group.
   */
  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
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
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.forecast.CfnDatasetGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the
     * dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-datasetarns)
     * @param datasetArns An array of Amazon Resource Names (ARNs) of the datasets that you want to
     * include in the dataset group. 
     */
    public fun datasetArns(datasetArns: List<String>)

    /**
     * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the
     * dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-datasetarns)
     * @param datasetArns An array of Amazon Resource Names (ARNs) of the datasets that you want to
     * include in the dataset group. 
     */
    public fun datasetArns(vararg datasetArns: String)

    /**
     * The name of the dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-datasetgroupname)
     * @param datasetGroupName The name of the dataset group. 
     */
    public fun datasetGroupName(datasetGroupName: String)

    /**
     * The domain associated with the dataset group.
     *
     * When you add a dataset to a dataset group, this value and the value specified for the
     * `Domain` parameter of the
     * [CreateDataset](https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDataset.html) operation
     * must match.
     *
     * The `Domain` and `DatasetType` that you choose determine the fields that must be present in
     * training data that you import to a dataset. For example, if you choose the `RETAIL` domain and
     * `TARGET_TIME_SERIES` as the `DatasetType` , Amazon Forecast requires that `item_id` ,
     * `timestamp` , and `demand` fields are present in your data. For more information, see [Dataset
     * groups](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-datasets-groups.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-domain)
     * @param domain The domain associated with the dataset group. 
     */
    public fun domain(domain: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.forecast.CfnDatasetGroup.Builder =
        software.amazon.awscdk.services.forecast.CfnDatasetGroup.Builder.create(scope, id)

    /**
     * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the
     * dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-datasetarns)
     * @param datasetArns An array of Amazon Resource Names (ARNs) of the datasets that you want to
     * include in the dataset group. 
     */
    override fun datasetArns(datasetArns: List<String>) {
      cdkBuilder.datasetArns(datasetArns)
    }

    /**
     * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the
     * dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-datasetarns)
     * @param datasetArns An array of Amazon Resource Names (ARNs) of the datasets that you want to
     * include in the dataset group. 
     */
    override fun datasetArns(vararg datasetArns: String): Unit = datasetArns(datasetArns.toList())

    /**
     * The name of the dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-datasetgroupname)
     * @param datasetGroupName The name of the dataset group. 
     */
    override fun datasetGroupName(datasetGroupName: String) {
      cdkBuilder.datasetGroupName(datasetGroupName)
    }

    /**
     * The domain associated with the dataset group.
     *
     * When you add a dataset to a dataset group, this value and the value specified for the
     * `Domain` parameter of the
     * [CreateDataset](https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDataset.html) operation
     * must match.
     *
     * The `Domain` and `DatasetType` that you choose determine the fields that must be present in
     * training data that you import to a dataset. For example, if you choose the `RETAIL` domain and
     * `TARGET_TIME_SERIES` as the `DatasetType` , Amazon Forecast requires that `item_id` ,
     * `timestamp` , and `demand` fields are present in your data. For more information, see [Dataset
     * groups](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-datasets-groups.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-domain)
     * @param domain The domain associated with the dataset group. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.forecast.CfnDatasetGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.forecast.CfnDatasetGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDatasetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDatasetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.forecast.CfnDatasetGroup):
        CfnDatasetGroup = CfnDatasetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetGroup):
        software.amazon.awscdk.services.forecast.CfnDatasetGroup = wrapped.cdkObject
  }
}
