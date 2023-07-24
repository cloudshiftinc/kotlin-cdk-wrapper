@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.forecast

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.forecast.CfnDataset
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Creates an Amazon Forecast dataset.
 *
 * The information about the dataset that you provide helps Forecast understand how to consume the
 * data for model training. This includes the following:
 *
 * * *`DataFrequency`* - How frequently your historical time-series data is collected.
 * * *`Domain`* and *`DatasetType`* - Each dataset has an associated dataset domain and a type
 * within the domain. Amazon Forecast provides a list of predefined domains and types within each
 * domain. For each unique dataset domain and type within the domain, Amazon Forecast requires your
 * data to include a minimum set of predefined fields.
 * * *`Schema`* - A schema specifies the fields in the dataset, including the field name and data
 * type.
 *
 * After creating a dataset, you import your training data into it and add the dataset to a dataset
 * group. You use the dataset group to create a predictor. For more information, see [Importing
 * datasets](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-datasets-groups.html) .
 *
 * To get a list of all your datasets, use the
 * [ListDatasets](https://docs.aws.amazon.com/forecast/latest/dg/API_ListDatasets.html) operation.
 *
 * For example Forecast datasets, see the [Amazon Forecast Sample GitHub
 * repository](https://docs.aws.amazon.com/https://github.com/aws-samples/amazon-forecast-samples) .
 *
 *
 * The `Status` of a dataset must be `ACTIVE` before you can import training data. Use the
 * [DescribeDataset](https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDataset.html) operation
 * to get the status.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.forecast.*;
 * Object encryptionConfig;
 * Object schema;
 * CfnDataset cfnDataset = CfnDataset.Builder.create(this, "MyCfnDataset")
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
public class CfnDatasetDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnDataset.Builder = CfnDataset.Builder.create(scope, id)

    private val _tags: MutableList<CfnDataset.TagsItemsProperty> = mutableListOf()

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
     * @param dataFrequency The frequency of data collection. This parameter is required for
     * RELATED_TIME_SERIES datasets.
     */
    public fun dataFrequency(dataFrequency: String) {
        cdkBuilder.dataFrequency(dataFrequency)
    }

    /**
     * The name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-datasetname)
     * @param datasetName The name of the dataset.
     */
    public fun datasetName(datasetName: String) {
        cdkBuilder.datasetName(datasetName)
    }

    /**
     * The dataset type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-datasettype)
     * @param datasetType The dataset type.
     */
    public fun datasetType(datasetType: String) {
        cdkBuilder.datasetType(datasetType)
    }

    /**
     * The domain associated with the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-domain)
     * @param domain The domain associated with the dataset.
     */
    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    /**
     * A Key Management Service (KMS) key and the Identity and Access Management (IAM) role that
     * Amazon Forecast can assume to access the key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-encryptionconfig)
     * @param encryptionConfig A Key Management Service (KMS) key and the Identity and Access
     * Management (IAM) role that Amazon Forecast can assume to access the key.
     */
    public fun encryptionConfig(encryptionConfig: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(encryptionConfig)
        cdkBuilder.encryptionConfig(builder.map)
    }

    /**
     * A Key Management Service (KMS) key and the Identity and Access Management (IAM) role that
     * Amazon Forecast can assume to access the key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-encryptionconfig)
     * @param encryptionConfig A Key Management Service (KMS) key and the Identity and Access
     * Management (IAM) role that Amazon Forecast can assume to access the key.
     */
    public fun encryptionConfig(encryptionConfig: Any) {
        cdkBuilder.encryptionConfig(encryptionConfig)
    }

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
     * @param schema The schema for the dataset.
     */
    public fun schema(schema: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(schema)
        cdkBuilder.schema(builder.map)
    }

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
     * @param schema The schema for the dataset.
     */
    public fun schema(schema: Any) {
        cdkBuilder.schema(schema)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-tags)
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnDatasetTagsItemsPropertyDsl.() -> Unit) {
        _tags.add(CfnDatasetTagsItemsPropertyDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-tags)
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnDataset.TagsItemsProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDataset {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
