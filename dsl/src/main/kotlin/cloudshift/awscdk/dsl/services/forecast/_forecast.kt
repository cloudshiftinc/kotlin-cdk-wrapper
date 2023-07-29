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

package cloudshift.awscdk.dsl.services.forecast

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.forecast.CfnDataset
import software.amazon.awscdk.services.forecast.CfnDatasetGroup
import software.amazon.awscdk.services.forecast.CfnDatasetGroupProps
import software.amazon.awscdk.services.forecast.CfnDatasetProps
import software.constructs.Construct

public object forecast {
    /**
     * Creates an Amazon Forecast dataset.
     *
     * The information about the dataset that you provide helps Forecast understand how to consume
     * the data for model training. This includes the following:
     * * *`DataFrequency`* - How frequently your historical time-series data is collected.
     * * *`Domain`* and *`DatasetType`* - Each dataset has an associated dataset domain and a type
     *   within the domain. Amazon Forecast provides a list of predefined domains and types within
     *   each domain. For each unique dataset domain and type within the domain, Amazon Forecast
     *   requires your data to include a minimum set of predefined fields.
     * * *`Schema`* - A schema specifies the fields in the dataset, including the field name and
     *   data type.
     *
     * After creating a dataset, you import your training data into it and add the dataset to a
     * dataset group. You use the dataset group to create a predictor. For more information, see
     * [Importing datasets](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-datasets-groups.html)
     * .
     *
     * To get a list of all your datasets, use the
     * [ListDatasets](https://docs.aws.amazon.com/forecast/latest/dg/API_ListDatasets.html)
     * operation.
     *
     * For example Forecast datasets, see the
     * [Amazon Forecast Sample GitHub repository](https://docs.aws.amazon.com/https://github.com/aws-samples/amazon-forecast-samples)
     * .
     *
     * The `Status` of a dataset must be `ACTIVE` before you can import training data. Use the
     * [DescribeDataset](https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDataset.html)
     * operation to get the status.
     *
     * Example:
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
    public inline fun cfnDataset(
        scope: Construct,
        id: String,
        block: CfnDatasetDsl.() -> Unit = {},
    ): CfnDataset {
        val builder = CfnDatasetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.forecast.*;
     * AttributesItemsProperty attributesItemsProperty = AttributesItemsProperty.builder()
     * .attributeName("attributeName")
     * .attributeType("attributeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-attributesitems.html)
     */
    public inline fun cfnDatasetAttributesItemsProperty(
        block: CfnDatasetAttributesItemsPropertyDsl.() -> Unit = {}
    ): CfnDataset.AttributesItemsProperty {
        val builder = CfnDatasetAttributesItemsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An AWS Key Management Service (KMS) key and an AWS Identity and Access Management (IAM) role
     * that Amazon Forecast can assume to access the key.
     *
     * You can specify this optional object in the `CreateDataset` and `CreatePredictor` requests.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.forecast.*;
     * EncryptionConfigProperty encryptionConfigProperty = EncryptionConfigProperty.builder()
     * .kmsKeyArn("kmsKeyArn")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-encryptionconfig.html)
     */
    public inline fun cfnDatasetEncryptionConfigProperty(
        block: CfnDatasetEncryptionConfigPropertyDsl.() -> Unit = {}
    ): CfnDataset.EncryptionConfigProperty {
        val builder = CfnDatasetEncryptionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a dataset group, which holds a collection of related datasets.
     *
     * You can add datasets to the dataset group when you create the dataset group, or later by
     * using the
     * [UpdateDatasetGroup](https://docs.aws.amazon.com/forecast/latest/dg/API_UpdateDatasetGroup.html)
     * operation.
     *
     * After creating a dataset group and adding datasets, you use the dataset group when you create
     * a predictor. For more information, see
     * [Dataset groups](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-datasets-groups.html)
     * .
     *
     * To get a list of all your datasets groups, use the
     * [ListDatasetGroups](https://docs.aws.amazon.com/forecast/latest/dg/API_ListDatasetGroups.html)
     * operation.
     *
     * The `Status` of a dataset group must be `ACTIVE` before you can use the dataset group to
     * create a predictor. To get the status, use the
     * [DescribeDatasetGroup](https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetGroup.html)
     * operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.forecast.*;
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
    public inline fun cfnDatasetGroup(
        scope: Construct,
        id: String,
        block: CfnDatasetGroupDsl.() -> Unit = {},
    ): CfnDatasetGroup {
        val builder = CfnDatasetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDatasetGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.forecast.*;
     * CfnDatasetGroupProps cfnDatasetGroupProps = CfnDatasetGroupProps.builder()
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
    public inline fun cfnDatasetGroupProps(
        block: CfnDatasetGroupPropsDsl.() -> Unit = {}
    ): CfnDatasetGroupProps {
        val builder = CfnDatasetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDataset`.
     *
     * Example:
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
    public inline fun cfnDatasetProps(block: CfnDatasetPropsDsl.() -> Unit = {}): CfnDatasetProps {
        val builder = CfnDatasetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the fields of a dataset.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.forecast.*;
     * SchemaProperty schemaProperty = SchemaProperty.builder()
     * .attributes(List.of(AttributesItemsProperty.builder()
     * .attributeName("attributeName")
     * .attributeType("attributeType")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-schema.html)
     */
    public inline fun cfnDatasetSchemaProperty(
        block: CfnDatasetSchemaPropertyDsl.() -> Unit = {}
    ): CfnDataset.SchemaProperty {
        val builder = CfnDatasetSchemaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A key-value pair to associate with a resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.forecast.*;
     * TagsItemsProperty tagsItemsProperty = TagsItemsProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-tagsitems.html)
     */
    public inline fun cfnDatasetTagsItemsProperty(
        block: CfnDatasetTagsItemsPropertyDsl.() -> Unit = {}
    ): CfnDataset.TagsItemsProperty {
        val builder = CfnDatasetTagsItemsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
