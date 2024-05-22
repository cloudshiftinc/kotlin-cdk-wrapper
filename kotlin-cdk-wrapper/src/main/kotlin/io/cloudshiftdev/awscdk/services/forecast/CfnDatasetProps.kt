@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.forecast

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDataset`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.forecast.*;
 * Object encryptionConfig;
 * Object schema;
 * CfnDatasetProps cfnDatasetProps = CfnDatasetProps.builder()
 * .datasetName("datasetName")
 * .datasetType("datasetType")
 * .domain("domain")
 * .schema(schema)
 * // the properties below are optional
 * .dataFrequency("dataFrequency")
 * .encryptionConfig(encryptionConfig)
 * .tags(List.of(TagsItemsProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html)
 */
public interface CfnDatasetProps {
  /**
   * The frequency of data collection. This parameter is required for RELATED_TIME_SERIES datasets.
   *
   * Valid intervals are an integer followed by Y (Year), M (Month), W (Week), D (Day), H (Hour),
   * and min (Minute). For example, "1D" indicates every day and "15min" indicates every 15 minutes.
   * You cannot specify a value that would overlap with the next larger frequency. That means, for
   * example, you cannot specify a frequency of 60 minutes, because that is equivalent to 1 hour. The
   * valid values for each frequency are the following:
   *
   * * Minute - 1-59
   * * Hour - 1-23
   * * Day - 1-6
   * * Week - 1-4
   * * Month - 1-11
   * * Year - 1
   *
   * Thus, if you want every other week forecasts, specify "2W". Or, if you want quarterly
   * forecasts, you specify "3M".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-datafrequency)
   */
  public fun dataFrequency(): String? = unwrap(this).getDataFrequency()

  /**
   * The name of the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-datasetname)
   */
  public fun datasetName(): String

  /**
   * The dataset type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-datasettype)
   */
  public fun datasetType(): String

  /**
   * The domain associated with the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-domain)
   */
  public fun domain(): String

  /**
   * A Key Management Service (KMS) key and the Identity and Access Management (IAM) role that
   * Amazon Forecast can assume to access the key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-encryptionconfig)
   */
  public fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

  /**
   * The schema for the dataset.
   *
   * The schema attributes and their order must match the fields in your data. The dataset `Domain`
   * and `DatasetType` that you choose determine the minimum required fields in your training data. For
   * information about the required fields for a specific dataset domain and type, see [Dataset Domains
   * and Dataset
   * Types](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-domains-ds-types.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-schema)
   */
  public fun schema(): Any

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-tags)
   */
  public fun tags(): List<CfnDataset.TagsItemsProperty> =
      unwrap(this).getTags()?.map(CfnDataset.TagsItemsProperty::wrap) ?: emptyList()

  /**
   * A builder for [CfnDatasetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataFrequency The frequency of data collection. This parameter is required for
     * RELATED_TIME_SERIES datasets.
     * Valid intervals are an integer followed by Y (Year), M (Month), W (Week), D (Day), H (Hour),
     * and min (Minute). For example, "1D" indicates every day and "15min" indicates every 15 minutes.
     * You cannot specify a value that would overlap with the next larger frequency. That means, for
     * example, you cannot specify a frequency of 60 minutes, because that is equivalent to 1 hour. The
     * valid values for each frequency are the following:
     *
     * * Minute - 1-59
     * * Hour - 1-23
     * * Day - 1-6
     * * Week - 1-4
     * * Month - 1-11
     * * Year - 1
     *
     * Thus, if you want every other week forecasts, specify "2W". Or, if you want quarterly
     * forecasts, you specify "3M".
     */
    public fun dataFrequency(dataFrequency: String)

    /**
     * @param datasetName The name of the dataset. 
     */
    public fun datasetName(datasetName: String)

    /**
     * @param datasetType The dataset type. 
     */
    public fun datasetType(datasetType: String)

    /**
     * @param domain The domain associated with the dataset. 
     */
    public fun domain(domain: String)

    /**
     * @param encryptionConfig A Key Management Service (KMS) key and the Identity and Access
     * Management (IAM) role that Amazon Forecast can assume to access the key.
     */
    public fun encryptionConfig(encryptionConfig: Any)

    /**
     * @param schema The schema for the dataset. 
     * The schema attributes and their order must match the fields in your data. The dataset
     * `Domain` and `DatasetType` that you choose determine the minimum required fields in your
     * training data. For information about the required fields for a specific dataset domain and type,
     * see [Dataset Domains and Dataset
     * Types](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-domains-ds-types.html) .
     */
    public fun schema(schema: Any)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnDataset.TagsItemsProperty>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnDataset.TagsItemsProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.forecast.CfnDatasetProps.Builder =
        software.amazon.awscdk.services.forecast.CfnDatasetProps.builder()

    /**
     * @param dataFrequency The frequency of data collection. This parameter is required for
     * RELATED_TIME_SERIES datasets.
     * Valid intervals are an integer followed by Y (Year), M (Month), W (Week), D (Day), H (Hour),
     * and min (Minute). For example, "1D" indicates every day and "15min" indicates every 15 minutes.
     * You cannot specify a value that would overlap with the next larger frequency. That means, for
     * example, you cannot specify a frequency of 60 minutes, because that is equivalent to 1 hour. The
     * valid values for each frequency are the following:
     *
     * * Minute - 1-59
     * * Hour - 1-23
     * * Day - 1-6
     * * Week - 1-4
     * * Month - 1-11
     * * Year - 1
     *
     * Thus, if you want every other week forecasts, specify "2W". Or, if you want quarterly
     * forecasts, you specify "3M".
     */
    override fun dataFrequency(dataFrequency: String) {
      cdkBuilder.dataFrequency(dataFrequency)
    }

    /**
     * @param datasetName The name of the dataset. 
     */
    override fun datasetName(datasetName: String) {
      cdkBuilder.datasetName(datasetName)
    }

    /**
     * @param datasetType The dataset type. 
     */
    override fun datasetType(datasetType: String) {
      cdkBuilder.datasetType(datasetType)
    }

    /**
     * @param domain The domain associated with the dataset. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param encryptionConfig A Key Management Service (KMS) key and the Identity and Access
     * Management (IAM) role that Amazon Forecast can assume to access the key.
     */
    override fun encryptionConfig(encryptionConfig: Any) {
      cdkBuilder.encryptionConfig(encryptionConfig)
    }

    /**
     * @param schema The schema for the dataset. 
     * The schema attributes and their order must match the fields in your data. The dataset
     * `Domain` and `DatasetType` that you choose determine the minimum required fields in your
     * training data. For information about the required fields for a specific dataset domain and type,
     * see [Dataset Domains and Dataset
     * Types](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-domains-ds-types.html) .
     */
    override fun schema(schema: Any) {
      cdkBuilder.schema(schema)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnDataset.TagsItemsProperty>) {
      cdkBuilder.tags(tags.map(CfnDataset.TagsItemsProperty.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnDataset.TagsItemsProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.forecast.CfnDatasetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.forecast.CfnDatasetProps,
  ) : CdkObject(cdkObject), CfnDatasetProps {
    /**
     * The frequency of data collection. This parameter is required for RELATED_TIME_SERIES
     * datasets.
     *
     * Valid intervals are an integer followed by Y (Year), M (Month), W (Week), D (Day), H (Hour),
     * and min (Minute). For example, "1D" indicates every day and "15min" indicates every 15 minutes.
     * You cannot specify a value that would overlap with the next larger frequency. That means, for
     * example, you cannot specify a frequency of 60 minutes, because that is equivalent to 1 hour. The
     * valid values for each frequency are the following:
     *
     * * Minute - 1-59
     * * Hour - 1-23
     * * Day - 1-6
     * * Week - 1-4
     * * Month - 1-11
     * * Year - 1
     *
     * Thus, if you want every other week forecasts, specify "2W". Or, if you want quarterly
     * forecasts, you specify "3M".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-datafrequency)
     */
    override fun dataFrequency(): String? = unwrap(this).getDataFrequency()

    /**
     * The name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-datasetname)
     */
    override fun datasetName(): String = unwrap(this).getDatasetName()

    /**
     * The dataset type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-datasettype)
     */
    override fun datasetType(): String = unwrap(this).getDatasetType()

    /**
     * The domain associated with the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-domain)
     */
    override fun domain(): String = unwrap(this).getDomain()

    /**
     * A Key Management Service (KMS) key and the Identity and Access Management (IAM) role that
     * Amazon Forecast can assume to access the key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-encryptionconfig)
     */
    override fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

    /**
     * The schema for the dataset.
     *
     * The schema attributes and their order must match the fields in your data. The dataset
     * `Domain` and `DatasetType` that you choose determine the minimum required fields in your
     * training data. For information about the required fields for a specific dataset domain and type,
     * see [Dataset Domains and Dataset
     * Types](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-domains-ds-types.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-schema)
     */
    override fun schema(): Any = unwrap(this).getSchema()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-tags)
     */
    override fun tags(): List<CfnDataset.TagsItemsProperty> =
        unwrap(this).getTags()?.map(CfnDataset.TagsItemsProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatasetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.forecast.CfnDatasetProps):
        CfnDatasetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDatasetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetProps):
        software.amazon.awscdk.services.forecast.CfnDatasetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.forecast.CfnDatasetProps
  }
}
