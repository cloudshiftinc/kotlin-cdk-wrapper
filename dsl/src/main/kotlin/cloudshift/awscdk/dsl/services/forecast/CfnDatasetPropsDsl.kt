@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.forecast

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.forecast.CfnDataset
import software.amazon.awscdk.services.forecast.CfnDatasetProps

/**
 * Properties for defining a `CfnDataset`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.forecast.*;
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
@CdkDslMarker
public class CfnDatasetPropsDsl {
  private val cdkBuilder: CfnDatasetProps.Builder = CfnDatasetProps.builder()

  private val _tags: MutableList<CfnDataset.TagsItemsProperty> = mutableListOf()

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
  public fun dataFrequency(dataFrequency: String) {
    cdkBuilder.dataFrequency(dataFrequency)
  }

  /**
   * @param datasetName The name of the dataset. 
   */
  public fun datasetName(datasetName: String) {
    cdkBuilder.datasetName(datasetName)
  }

  /**
   * @param datasetType The dataset type. 
   */
  public fun datasetType(datasetType: String) {
    cdkBuilder.datasetType(datasetType)
  }

  /**
   * @param domain The domain associated with the dataset. 
   */
  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  /**
   * @param encryptionConfig A Key Management Service (KMS) key and the Identity and Access
   * Management (IAM) role that Amazon Forecast can assume to access the key.
   */
  public fun encryptionConfig(encryptionConfig: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(encryptionConfig)
    cdkBuilder.encryptionConfig(builder.map)
  }

  /**
   * @param encryptionConfig A Key Management Service (KMS) key and the Identity and Access
   * Management (IAM) role that Amazon Forecast can assume to access the key.
   */
  public fun encryptionConfig(encryptionConfig: Any) {
    cdkBuilder.encryptionConfig(encryptionConfig)
  }

  /**
   * @param schema The schema for the dataset. 
   * The schema attributes and their order must match the fields in your data. The dataset `Domain`
   * and `DatasetType` that you choose determine the minimum required fields in your training data. For
   * information about the required fields for a specific dataset domain and type, see [Dataset Domains
   * and Dataset
   * Types](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-domains-ds-types.html) .
   */
  public fun schema(schema: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(schema)
    cdkBuilder.schema(builder.map)
  }

  /**
   * @param schema The schema for the dataset. 
   * The schema attributes and their order must match the fields in your data. The dataset `Domain`
   * and `DatasetType` that you choose determine the minimum required fields in your training data. For
   * information about the required fields for a specific dataset domain and type, see [Dataset Domains
   * and Dataset
   * Types](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-domains-ds-types.html) .
   */
  public fun schema(schema: Any) {
    cdkBuilder.schema(schema)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnDatasetTagsItemsPropertyDsl.() -> Unit) {
    _tags.add(CfnDatasetTagsItemsPropertyDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnDataset.TagsItemsProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDatasetProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
