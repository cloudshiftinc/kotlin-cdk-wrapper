package io.cloudshiftdev.awscdk.services.forecast

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDatasetGroupProps {
  /**
   * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the
   * dataset group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-datasetarns)
   */
  public fun datasetArns(): List<String> = unwrap(this).getDatasetArns() ?: emptyList()

  /**
   * The name of the dataset group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-datasetgroupname)
   */
  public fun datasetGroupName(): String

  /**
   * The domain associated with the dataset group.
   *
   * When you add a dataset to a dataset group, this value and the value specified for the `Domain`
   * parameter of the
   * [CreateDataset](https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDataset.html) operation
   * must match.
   *
   * The `Domain` and `DatasetType` that you choose determine the fields that must be present in
   * training data that you import to a dataset. For example, if you choose the `RETAIL` domain and
   * `TARGET_TIME_SERIES` as the `DatasetType` , Amazon Forecast requires that `item_id` , `timestamp`
   * , and `demand` fields are present in your data. For more information, see [Dataset
   * groups](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-datasets-groups.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-domain)
   */
  public fun domain(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDatasetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param datasetArns An array of Amazon Resource Names (ARNs) of the datasets that you want to
     * include in the dataset group.
     */
    public fun datasetArns(datasetArns: List<String>)

    /**
     * @param datasetArns An array of Amazon Resource Names (ARNs) of the datasets that you want to
     * include in the dataset group.
     */
    public fun datasetArns(vararg datasetArns: String)

    /**
     * @param datasetGroupName The name of the dataset group. 
     */
    public fun datasetGroupName(datasetGroupName: String)

    /**
     * @param domain The domain associated with the dataset group. 
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
     */
    public fun domain(domain: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.forecast.CfnDatasetGroupProps.Builder =
        software.amazon.awscdk.services.forecast.CfnDatasetGroupProps.builder()

    /**
     * @param datasetArns An array of Amazon Resource Names (ARNs) of the datasets that you want to
     * include in the dataset group.
     */
    override fun datasetArns(datasetArns: List<String>) {
      cdkBuilder.datasetArns(datasetArns)
    }

    /**
     * @param datasetArns An array of Amazon Resource Names (ARNs) of the datasets that you want to
     * include in the dataset group.
     */
    override fun datasetArns(vararg datasetArns: String): Unit = datasetArns(datasetArns.toList())

    /**
     * @param datasetGroupName The name of the dataset group. 
     */
    override fun datasetGroupName(datasetGroupName: String) {
      cdkBuilder.datasetGroupName(datasetGroupName)
    }

    /**
     * @param domain The domain associated with the dataset group. 
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
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.forecast.CfnDatasetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.forecast.CfnDatasetGroupProps,
  ) : CdkObject(cdkObject), CfnDatasetGroupProps {
    /**
     * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the
     * dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-datasetarns)
     */
    override fun datasetArns(): List<String> = unwrap(this).getDatasetArns() ?: emptyList()

    /**
     * The name of the dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-datasetgroupname)
     */
    override fun datasetGroupName(): String = unwrap(this).getDatasetGroupName()

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
     */
    override fun domain(): String = unwrap(this).getDomain()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatasetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.forecast.CfnDatasetGroupProps):
        CfnDatasetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetGroupProps):
        software.amazon.awscdk.services.forecast.CfnDatasetGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.forecast.CfnDatasetGroupProps
  }
}
