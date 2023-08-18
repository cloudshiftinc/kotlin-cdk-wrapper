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

package io.cloudshiftdev.awscdkdsl.services.databrew

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnDataset
import software.amazon.awscdk.services.databrew.CfnDatasetProps
import software.amazon.awscdk.services.databrew.CfnJob
import software.amazon.awscdk.services.databrew.CfnJobProps
import software.amazon.awscdk.services.databrew.CfnProject
import software.amazon.awscdk.services.databrew.CfnProjectProps
import software.amazon.awscdk.services.databrew.CfnRecipe
import software.amazon.awscdk.services.databrew.CfnRecipeProps
import software.amazon.awscdk.services.databrew.CfnRuleset
import software.amazon.awscdk.services.databrew.CfnRulesetProps
import software.amazon.awscdk.services.databrew.CfnSchedule
import software.amazon.awscdk.services.databrew.CfnScheduleProps
import software.constructs.Construct

public object databrew {
    /**
     * Specifies a new DataBrew dataset.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * CfnDataset cfnDataset = CfnDataset.Builder.create(this, "MyCfnDataset")
     * .input(InputProperty.builder()
     * .databaseInputDefinition(DatabaseInputDefinitionProperty.builder()
     * .glueConnectionName("glueConnectionName")
     * // the properties below are optional
     * .databaseTableName("databaseTableName")
     * .queryString("queryString")
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build())
     * .dataCatalogInputDefinition(DataCatalogInputDefinitionProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build())
     * .metadata(MetadataProperty.builder()
     * .sourceArn("sourceArn")
     * .build())
     * .s3InputDefinition(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build())
     * .name("name")
     * // the properties below are optional
     * .format("format")
     * .formatOptions(FormatOptionsProperty.builder()
     * .csv(CsvOptionsProperty.builder()
     * .delimiter("delimiter")
     * .headerRow(false)
     * .build())
     * .excel(ExcelOptionsProperty.builder()
     * .headerRow(false)
     * .sheetIndexes(List.of(123))
     * .sheetNames(List.of("sheetNames"))
     * .build())
     * .json(JsonOptionsProperty.builder()
     * .multiLine(false)
     * .build())
     * .build())
     * .pathOptions(PathOptionsProperty.builder()
     * .filesLimit(FilesLimitProperty.builder()
     * .maxFiles(123)
     * // the properties below are optional
     * .order("order")
     * .orderedBy("orderedBy")
     * .build())
     * .lastModifiedDateCondition(FilterExpressionProperty.builder()
     * .expression("expression")
     * .valuesMap(List.of(FilterValueProperty.builder()
     * .value("value")
     * .valueReference("valueReference")
     * .build()))
     * .build())
     * .parameters(List.of(PathParameterProperty.builder()
     * .datasetParameter(DatasetParameterProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .createColumn(false)
     * .datetimeOptions(DatetimeOptionsProperty.builder()
     * .format("format")
     * // the properties below are optional
     * .localeCode("localeCode")
     * .timezoneOffset("timezoneOffset")
     * .build())
     * .filter(FilterExpressionProperty.builder()
     * .expression("expression")
     * .valuesMap(List.of(FilterValueProperty.builder()
     * .value("value")
     * .valueReference("valueReference")
     * .build()))
     * .build())
     * .build())
     * .pathParameterName("pathParameterName")
     * .build()))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html)
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
     * Represents a set of options that define how DataBrew will read a comma-separated value (CSV)
     * file when creating a dataset from that file.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * CsvOptionsProperty csvOptionsProperty = CsvOptionsProperty.builder()
     * .delimiter("delimiter")
     * .headerRow(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-csvoptions.html)
     */
    public inline fun cfnDatasetCsvOptionsProperty(
        block: CfnDatasetCsvOptionsPropertyDsl.() -> Unit = {}
    ): CfnDataset.CsvOptionsProperty {
        val builder = CfnDatasetCsvOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents how metadata stored in the AWS Glue Data Catalog is defined in a DataBrew dataset.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * DataCatalogInputDefinitionProperty dataCatalogInputDefinitionProperty =
     * DataCatalogInputDefinitionProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datacataloginputdefinition.html)
     */
    public inline fun cfnDatasetDataCatalogInputDefinitionProperty(
        block: CfnDatasetDataCatalogInputDefinitionPropertyDsl.() -> Unit = {}
    ): CfnDataset.DataCatalogInputDefinitionProperty {
        val builder = CfnDatasetDataCatalogInputDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Connection information for dataset input files stored in a database.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * DatabaseInputDefinitionProperty databaseInputDefinitionProperty =
     * DatabaseInputDefinitionProperty.builder()
     * .glueConnectionName("glueConnectionName")
     * // the properties below are optional
     * .databaseTableName("databaseTableName")
     * .queryString("queryString")
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-databaseinputdefinition.html)
     */
    public inline fun cfnDatasetDatabaseInputDefinitionProperty(
        block: CfnDatasetDatabaseInputDefinitionPropertyDsl.() -> Unit = {}
    ): CfnDataset.DatabaseInputDefinitionProperty {
        val builder = CfnDatasetDatabaseInputDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a dataset paramater that defines type and conditions for a parameter in the Amazon
     * S3 path of the dataset.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * DatasetParameterProperty datasetParameterProperty = DatasetParameterProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .createColumn(false)
     * .datetimeOptions(DatetimeOptionsProperty.builder()
     * .format("format")
     * // the properties below are optional
     * .localeCode("localeCode")
     * .timezoneOffset("timezoneOffset")
     * .build())
     * .filter(FilterExpressionProperty.builder()
     * .expression("expression")
     * .valuesMap(List.of(FilterValueProperty.builder()
     * .value("value")
     * .valueReference("valueReference")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datasetparameter.html)
     */
    public inline fun cfnDatasetDatasetParameterProperty(
        block: CfnDatasetDatasetParameterPropertyDsl.() -> Unit = {}
    ): CfnDataset.DatasetParameterProperty {
        val builder = CfnDatasetDatasetParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents additional options for correct interpretation of datetime parameters used in the
     * Amazon S3 path of a dataset.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * DatetimeOptionsProperty datetimeOptionsProperty = DatetimeOptionsProperty.builder()
     * .format("format")
     * // the properties below are optional
     * .localeCode("localeCode")
     * .timezoneOffset("timezoneOffset")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datetimeoptions.html)
     */
    public inline fun cfnDatasetDatetimeOptionsProperty(
        block: CfnDatasetDatetimeOptionsPropertyDsl.() -> Unit = {}
    ): CfnDataset.DatetimeOptionsProperty {
        val builder = CfnDatasetDatetimeOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a set of options that define how DataBrew will interpret a Microsoft Excel file
     * when creating a dataset from that file.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * ExcelOptionsProperty excelOptionsProperty = ExcelOptionsProperty.builder()
     * .headerRow(false)
     * .sheetIndexes(List.of(123))
     * .sheetNames(List.of("sheetNames"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-exceloptions.html)
     */
    public inline fun cfnDatasetExcelOptionsProperty(
        block: CfnDatasetExcelOptionsPropertyDsl.() -> Unit = {}
    ): CfnDataset.ExcelOptionsProperty {
        val builder = CfnDatasetExcelOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a limit imposed on number of Amazon S3 files that should be selected for a dataset
     * from a connected Amazon S3 path.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * FilesLimitProperty filesLimitProperty = FilesLimitProperty.builder()
     * .maxFiles(123)
     * // the properties below are optional
     * .order("order")
     * .orderedBy("orderedBy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-fileslimit.html)
     */
    public inline fun cfnDatasetFilesLimitProperty(
        block: CfnDatasetFilesLimitPropertyDsl.() -> Unit = {}
    ): CfnDataset.FilesLimitProperty {
        val builder = CfnDatasetFilesLimitPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a structure for defining parameter conditions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * FilterExpressionProperty filterExpressionProperty = FilterExpressionProperty.builder()
     * .expression("expression")
     * .valuesMap(List.of(FilterValueProperty.builder()
     * .value("value")
     * .valueReference("valueReference")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-filterexpression.html)
     */
    public inline fun cfnDatasetFilterExpressionProperty(
        block: CfnDatasetFilterExpressionPropertyDsl.() -> Unit = {}
    ): CfnDataset.FilterExpressionProperty {
        val builder = CfnDatasetFilterExpressionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a single entry in the `ValuesMap` of a `FilterExpression` .
     *
     * A `FilterValue` associates the name of a substitution variable in an expression to its value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * FilterValueProperty filterValueProperty = FilterValueProperty.builder()
     * .value("value")
     * .valueReference("valueReference")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-filtervalue.html)
     */
    public inline fun cfnDatasetFilterValueProperty(
        block: CfnDatasetFilterValuePropertyDsl.() -> Unit = {}
    ): CfnDataset.FilterValueProperty {
        val builder = CfnDatasetFilterValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a set of options that define the structure of either comma-separated value (CSV),
     * Excel, or JSON input.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * FormatOptionsProperty formatOptionsProperty = FormatOptionsProperty.builder()
     * .csv(CsvOptionsProperty.builder()
     * .delimiter("delimiter")
     * .headerRow(false)
     * .build())
     * .excel(ExcelOptionsProperty.builder()
     * .headerRow(false)
     * .sheetIndexes(List.of(123))
     * .sheetNames(List.of("sheetNames"))
     * .build())
     * .json(JsonOptionsProperty.builder()
     * .multiLine(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-formatoptions.html)
     */
    public inline fun cfnDatasetFormatOptionsProperty(
        block: CfnDatasetFormatOptionsPropertyDsl.() -> Unit = {}
    ): CfnDataset.FormatOptionsProperty {
        val builder = CfnDatasetFormatOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents information on how DataBrew can find data, in either the AWS Glue Data Catalog or
     * Amazon S3.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * InputProperty inputProperty = InputProperty.builder()
     * .databaseInputDefinition(DatabaseInputDefinitionProperty.builder()
     * .glueConnectionName("glueConnectionName")
     * // the properties below are optional
     * .databaseTableName("databaseTableName")
     * .queryString("queryString")
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build())
     * .dataCatalogInputDefinition(DataCatalogInputDefinitionProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build())
     * .metadata(MetadataProperty.builder()
     * .sourceArn("sourceArn")
     * .build())
     * .s3InputDefinition(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-input.html)
     */
    public inline fun cfnDatasetInputProperty(
        block: CfnDatasetInputPropertyDsl.() -> Unit = {}
    ): CfnDataset.InputProperty {
        val builder = CfnDatasetInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the JSON-specific options that define how input is to be interpreted by AWS Glue
     * DataBrew .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * JsonOptionsProperty jsonOptionsProperty = JsonOptionsProperty.builder()
     * .multiLine(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-jsonoptions.html)
     */
    public inline fun cfnDatasetJsonOptionsProperty(
        block: CfnDatasetJsonOptionsPropertyDsl.() -> Unit = {}
    ): CfnDataset.JsonOptionsProperty {
        val builder = CfnDatasetJsonOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains additional resource information needed for specific datasets.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * MetadataProperty metadataProperty = MetadataProperty.builder()
     * .sourceArn("sourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-metadata.html)
     */
    public inline fun cfnDatasetMetadataProperty(
        block: CfnDatasetMetadataPropertyDsl.() -> Unit = {}
    ): CfnDataset.MetadataProperty {
        val builder = CfnDatasetMetadataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a set of options that define how DataBrew selects files for a given Amazon S3 path
     * in a dataset.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * PathOptionsProperty pathOptionsProperty = PathOptionsProperty.builder()
     * .filesLimit(FilesLimitProperty.builder()
     * .maxFiles(123)
     * // the properties below are optional
     * .order("order")
     * .orderedBy("orderedBy")
     * .build())
     * .lastModifiedDateCondition(FilterExpressionProperty.builder()
     * .expression("expression")
     * .valuesMap(List.of(FilterValueProperty.builder()
     * .value("value")
     * .valueReference("valueReference")
     * .build()))
     * .build())
     * .parameters(List.of(PathParameterProperty.builder()
     * .datasetParameter(DatasetParameterProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .createColumn(false)
     * .datetimeOptions(DatetimeOptionsProperty.builder()
     * .format("format")
     * // the properties below are optional
     * .localeCode("localeCode")
     * .timezoneOffset("timezoneOffset")
     * .build())
     * .filter(FilterExpressionProperty.builder()
     * .expression("expression")
     * .valuesMap(List.of(FilterValueProperty.builder()
     * .value("value")
     * .valueReference("valueReference")
     * .build()))
     * .build())
     * .build())
     * .pathParameterName("pathParameterName")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-pathoptions.html)
     */
    public inline fun cfnDatasetPathOptionsProperty(
        block: CfnDatasetPathOptionsPropertyDsl.() -> Unit = {}
    ): CfnDataset.PathOptionsProperty {
        val builder = CfnDatasetPathOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a single entry in the path parameters of a dataset.
     *
     * Each `PathParameter` consists of a name and a parameter definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * PathParameterProperty pathParameterProperty = PathParameterProperty.builder()
     * .datasetParameter(DatasetParameterProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .createColumn(false)
     * .datetimeOptions(DatetimeOptionsProperty.builder()
     * .format("format")
     * // the properties below are optional
     * .localeCode("localeCode")
     * .timezoneOffset("timezoneOffset")
     * .build())
     * .filter(FilterExpressionProperty.builder()
     * .expression("expression")
     * .valuesMap(List.of(FilterValueProperty.builder()
     * .value("value")
     * .valueReference("valueReference")
     * .build()))
     * .build())
     * .build())
     * .pathParameterName("pathParameterName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-pathparameter.html)
     */
    public inline fun cfnDatasetPathParameterProperty(
        block: CfnDatasetPathParameterPropertyDsl.() -> Unit = {}
    ): CfnDataset.PathParameterProperty {
        val builder = CfnDatasetPathParameterPropertyDsl()
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
     * import software.amazon.awscdk.services.databrew.*;
     * CfnDatasetProps cfnDatasetProps = CfnDatasetProps.builder()
     * .input(InputProperty.builder()
     * .databaseInputDefinition(DatabaseInputDefinitionProperty.builder()
     * .glueConnectionName("glueConnectionName")
     * // the properties below are optional
     * .databaseTableName("databaseTableName")
     * .queryString("queryString")
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build())
     * .dataCatalogInputDefinition(DataCatalogInputDefinitionProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build())
     * .metadata(MetadataProperty.builder()
     * .sourceArn("sourceArn")
     * .build())
     * .s3InputDefinition(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build())
     * .name("name")
     * // the properties below are optional
     * .format("format")
     * .formatOptions(FormatOptionsProperty.builder()
     * .csv(CsvOptionsProperty.builder()
     * .delimiter("delimiter")
     * .headerRow(false)
     * .build())
     * .excel(ExcelOptionsProperty.builder()
     * .headerRow(false)
     * .sheetIndexes(List.of(123))
     * .sheetNames(List.of("sheetNames"))
     * .build())
     * .json(JsonOptionsProperty.builder()
     * .multiLine(false)
     * .build())
     * .build())
     * .pathOptions(PathOptionsProperty.builder()
     * .filesLimit(FilesLimitProperty.builder()
     * .maxFiles(123)
     * // the properties below are optional
     * .order("order")
     * .orderedBy("orderedBy")
     * .build())
     * .lastModifiedDateCondition(FilterExpressionProperty.builder()
     * .expression("expression")
     * .valuesMap(List.of(FilterValueProperty.builder()
     * .value("value")
     * .valueReference("valueReference")
     * .build()))
     * .build())
     * .parameters(List.of(PathParameterProperty.builder()
     * .datasetParameter(DatasetParameterProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .createColumn(false)
     * .datetimeOptions(DatetimeOptionsProperty.builder()
     * .format("format")
     * // the properties below are optional
     * .localeCode("localeCode")
     * .timezoneOffset("timezoneOffset")
     * .build())
     * .filter(FilterExpressionProperty.builder()
     * .expression("expression")
     * .valuesMap(List.of(FilterValueProperty.builder()
     * .value("value")
     * .valueReference("valueReference")
     * .build()))
     * .build())
     * .build())
     * .pathParameterName("pathParameterName")
     * .build()))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html)
     */
    public inline fun cfnDatasetProps(block: CfnDatasetPropsDsl.() -> Unit = {}): CfnDatasetProps {
        val builder = CfnDatasetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents an Amazon S3 location (bucket name, bucket owner, and object key) where DataBrew
     * can read input data, or write output from a job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-s3location.html)
     */
    public inline fun cfnDatasetS3LocationProperty(
        block: CfnDatasetS3LocationPropertyDsl.() -> Unit = {}
    ): CfnDataset.S3LocationProperty {
        val builder = CfnDatasetS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a new DataBrew job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * CfnJob cfnJob = CfnJob.Builder.create(this, "MyCfnJob")
     * .name("name")
     * .roleArn("roleArn")
     * .type("type")
     * // the properties below are optional
     * .databaseOutputs(List.of(DatabaseOutputProperty.builder()
     * .databaseOptions(DatabaseTableOutputOptionsProperty.builder()
     * .tableName("tableName")
     * // the properties below are optional
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build())
     * .build())
     * .glueConnectionName("glueConnectionName")
     * // the properties below are optional
     * .databaseOutputMode("databaseOutputMode")
     * .build()))
     * .dataCatalogOutputs(List.of(DataCatalogOutputProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * // the properties below are optional
     * .catalogId("catalogId")
     * .databaseOptions(DatabaseTableOutputOptionsProperty.builder()
     * .tableName("tableName")
     * // the properties below are optional
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build())
     * .build())
     * .overwrite(false)
     * .s3Options(S3TableOutputOptionsProperty.builder()
     * .location(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build())
     * .build())
     * .build()))
     * .datasetName("datasetName")
     * .encryptionKeyArn("encryptionKeyArn")
     * .encryptionMode("encryptionMode")
     * .jobSample(JobSampleProperty.builder()
     * .mode("mode")
     * .size(123)
     * .build())
     * .logSubscription("logSubscription")
     * .maxCapacity(123)
     * .maxRetries(123)
     * .outputLocation(OutputLocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build())
     * .outputs(List.of(OutputProperty.builder()
     * .location(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build())
     * // the properties below are optional
     * .compressionFormat("compressionFormat")
     * .format("format")
     * .formatOptions(OutputFormatOptionsProperty.builder()
     * .csv(CsvOutputOptionsProperty.builder()
     * .delimiter("delimiter")
     * .build())
     * .build())
     * .maxOutputFiles(123)
     * .overwrite(false)
     * .partitionColumns(List.of("partitionColumns"))
     * .build()))
     * .profileConfiguration(ProfileConfigurationProperty.builder()
     * .columnStatisticsConfigurations(List.of(ColumnStatisticsConfigurationProperty.builder()
     * .statistics(StatisticsConfigurationProperty.builder()
     * .includedStatistics(List.of("includedStatistics"))
     * .overrides(List.of(StatisticOverrideProperty.builder()
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .statistic("statistic")
     * .build()))
     * .build())
     * // the properties below are optional
     * .selectors(List.of(ColumnSelectorProperty.builder()
     * .name("name")
     * .regex("regex")
     * .build()))
     * .build()))
     * .datasetStatisticsConfiguration(StatisticsConfigurationProperty.builder()
     * .includedStatistics(List.of("includedStatistics"))
     * .overrides(List.of(StatisticOverrideProperty.builder()
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .statistic("statistic")
     * .build()))
     * .build())
     * .entityDetectorConfiguration(EntityDetectorConfigurationProperty.builder()
     * .entityTypes(List.of("entityTypes"))
     * // the properties below are optional
     * .allowedStatistics(AllowedStatisticsProperty.builder()
     * .statistics(List.of("statistics"))
     * .build())
     * .build())
     * .profileColumns(List.of(ColumnSelectorProperty.builder()
     * .name("name")
     * .regex("regex")
     * .build()))
     * .build())
     * .projectName("projectName")
     * .recipe(RecipeProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .version("version")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .timeout(123)
     * .validationConfigurations(List.of(ValidationConfigurationProperty.builder()
     * .rulesetArn("rulesetArn")
     * // the properties below are optional
     * .validationMode("validationMode")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html)
     */
    public inline fun cfnJob(
        scope: Construct,
        id: String,
        block: CfnJobDsl.() -> Unit = {},
    ): CfnJob {
        val builder = CfnJobDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration of statistics that are allowed to be run on columns that contain detected
     * entities.
     *
     * When undefined, no statistics will be computed on columns that contain detected entities.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * AllowedStatisticsProperty allowedStatisticsProperty = AllowedStatisticsProperty.builder()
     * .statistics(List.of("statistics"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-allowedstatistics.html)
     */
    public inline fun cfnJobAllowedStatisticsProperty(
        block: CfnJobAllowedStatisticsPropertyDsl.() -> Unit = {}
    ): CfnJob.AllowedStatisticsProperty {
        val builder = CfnJobAllowedStatisticsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Selector of a column from a dataset for profile job configuration.
     *
     * One selector includes either a column name or a regular expression.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * ColumnSelectorProperty columnSelectorProperty = ColumnSelectorProperty.builder()
     * .name("name")
     * .regex("regex")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-columnselector.html)
     */
    public inline fun cfnJobColumnSelectorProperty(
        block: CfnJobColumnSelectorPropertyDsl.() -> Unit = {}
    ): CfnJob.ColumnSelectorProperty {
        val builder = CfnJobColumnSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for column evaluations for a profile job.
     *
     * ColumnStatisticsConfiguration can be used to select evaluations and override parameters of
     * evaluations for particular columns.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * ColumnStatisticsConfigurationProperty columnStatisticsConfigurationProperty =
     * ColumnStatisticsConfigurationProperty.builder()
     * .statistics(StatisticsConfigurationProperty.builder()
     * .includedStatistics(List.of("includedStatistics"))
     * .overrides(List.of(StatisticOverrideProperty.builder()
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .statistic("statistic")
     * .build()))
     * .build())
     * // the properties below are optional
     * .selectors(List.of(ColumnSelectorProperty.builder()
     * .name("name")
     * .regex("regex")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-columnstatisticsconfiguration.html)
     */
    public inline fun cfnJobColumnStatisticsConfigurationProperty(
        block: CfnJobColumnStatisticsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnJob.ColumnStatisticsConfigurationProperty {
        val builder = CfnJobColumnStatisticsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a set of options that define how DataBrew will write a comma-separated value (CSV)
     * file.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * CsvOutputOptionsProperty csvOutputOptionsProperty = CsvOutputOptionsProperty.builder()
     * .delimiter("delimiter")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-csvoutputoptions.html)
     */
    public inline fun cfnJobCsvOutputOptionsProperty(
        block: CfnJobCsvOutputOptionsPropertyDsl.() -> Unit = {}
    ): CfnJob.CsvOutputOptionsProperty {
        val builder = CfnJobCsvOutputOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents options that specify how and where in the AWS Glue Data Catalog DataBrew writes
     * the output generated by recipe jobs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * DataCatalogOutputProperty dataCatalogOutputProperty = DataCatalogOutputProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * // the properties below are optional
     * .catalogId("catalogId")
     * .databaseOptions(DatabaseTableOutputOptionsProperty.builder()
     * .tableName("tableName")
     * // the properties below are optional
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build())
     * .build())
     * .overwrite(false)
     * .s3Options(S3TableOutputOptionsProperty.builder()
     * .location(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-datacatalogoutput.html)
     */
    public inline fun cfnJobDataCatalogOutputProperty(
        block: CfnJobDataCatalogOutputPropertyDsl.() -> Unit = {}
    ): CfnJob.DataCatalogOutputProperty {
        val builder = CfnJobDataCatalogOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a JDBC database output object which defines the output destination for a DataBrew
     * recipe job to write into.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * DatabaseOutputProperty databaseOutputProperty = DatabaseOutputProperty.builder()
     * .databaseOptions(DatabaseTableOutputOptionsProperty.builder()
     * .tableName("tableName")
     * // the properties below are optional
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build())
     * .build())
     * .glueConnectionName("glueConnectionName")
     * // the properties below are optional
     * .databaseOutputMode("databaseOutputMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-databaseoutput.html)
     */
    public inline fun cfnJobDatabaseOutputProperty(
        block: CfnJobDatabaseOutputPropertyDsl.() -> Unit = {}
    ): CfnJob.DatabaseOutputProperty {
        val builder = CfnJobDatabaseOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents options that specify how and where DataBrew writes the database output generated
     * by recipe jobs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * DatabaseTableOutputOptionsProperty databaseTableOutputOptionsProperty =
     * DatabaseTableOutputOptionsProperty.builder()
     * .tableName("tableName")
     * // the properties below are optional
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-databasetableoutputoptions.html)
     */
    public inline fun cfnJobDatabaseTableOutputOptionsProperty(
        block: CfnJobDatabaseTableOutputOptionsPropertyDsl.() -> Unit = {}
    ): CfnJob.DatabaseTableOutputOptionsProperty {
        val builder = CfnJobDatabaseTableOutputOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration of entity detection for a profile job.
     *
     * When undefined, entity detection is disabled.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * EntityDetectorConfigurationProperty entityDetectorConfigurationProperty =
     * EntityDetectorConfigurationProperty.builder()
     * .entityTypes(List.of("entityTypes"))
     * // the properties below are optional
     * .allowedStatistics(AllowedStatisticsProperty.builder()
     * .statistics(List.of("statistics"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-entitydetectorconfiguration.html)
     */
    public inline fun cfnJobEntityDetectorConfigurationProperty(
        block: CfnJobEntityDetectorConfigurationPropertyDsl.() -> Unit = {}
    ): CfnJob.EntityDetectorConfigurationProperty {
        val builder = CfnJobEntityDetectorConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A sample configuration for profile jobs only, which determines the number of rows on which
     * the profile job is run.
     *
     * If a `JobSample` value isn't provided, the default is used. The default value is CUSTOM_ROWS
     * for the mode parameter and 20,000 for the size parameter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * JobSampleProperty jobSampleProperty = JobSampleProperty.builder()
     * .mode("mode")
     * .size(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-jobsample.html)
     */
    public inline fun cfnJobJobSampleProperty(
        block: CfnJobJobSamplePropertyDsl.() -> Unit = {}
    ): CfnJob.JobSampleProperty {
        val builder = CfnJobJobSamplePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a set of options that define the structure of comma-separated (CSV) job output.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * OutputFormatOptionsProperty outputFormatOptionsProperty = OutputFormatOptionsProperty.builder()
     * .csv(CsvOutputOptionsProperty.builder()
     * .delimiter("delimiter")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-outputformatoptions.html)
     */
    public inline fun cfnJobOutputFormatOptionsProperty(
        block: CfnJobOutputFormatOptionsPropertyDsl.() -> Unit = {}
    ): CfnJob.OutputFormatOptionsProperty {
        val builder = CfnJobOutputFormatOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The location in Amazon S3 or AWS Glue Data Catalog where the job writes its output.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * OutputLocationProperty outputLocationProperty = OutputLocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-outputlocation.html)
     */
    public inline fun cfnJobOutputLocationProperty(
        block: CfnJobOutputLocationPropertyDsl.() -> Unit = {}
    ): CfnJob.OutputLocationProperty {
        val builder = CfnJobOutputLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents options that specify how and where in Amazon S3 DataBrew writes the output
     * generated by recipe jobs or profile jobs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * OutputProperty outputProperty = OutputProperty.builder()
     * .location(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build())
     * // the properties below are optional
     * .compressionFormat("compressionFormat")
     * .format("format")
     * .formatOptions(OutputFormatOptionsProperty.builder()
     * .csv(CsvOutputOptionsProperty.builder()
     * .delimiter("delimiter")
     * .build())
     * .build())
     * .maxOutputFiles(123)
     * .overwrite(false)
     * .partitionColumns(List.of("partitionColumns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html)
     */
    public inline fun cfnJobOutputProperty(
        block: CfnJobOutputPropertyDsl.() -> Unit = {}
    ): CfnJob.OutputProperty {
        val builder = CfnJobOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for profile jobs.
     *
     * Configuration can be used to select columns, do evaluations, and override default parameters
     * of evaluations. When configuration is undefined, the profile job will apply default settings
     * to all supported columns.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * ProfileConfigurationProperty profileConfigurationProperty =
     * ProfileConfigurationProperty.builder()
     * .columnStatisticsConfigurations(List.of(ColumnStatisticsConfigurationProperty.builder()
     * .statistics(StatisticsConfigurationProperty.builder()
     * .includedStatistics(List.of("includedStatistics"))
     * .overrides(List.of(StatisticOverrideProperty.builder()
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .statistic("statistic")
     * .build()))
     * .build())
     * // the properties below are optional
     * .selectors(List.of(ColumnSelectorProperty.builder()
     * .name("name")
     * .regex("regex")
     * .build()))
     * .build()))
     * .datasetStatisticsConfiguration(StatisticsConfigurationProperty.builder()
     * .includedStatistics(List.of("includedStatistics"))
     * .overrides(List.of(StatisticOverrideProperty.builder()
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .statistic("statistic")
     * .build()))
     * .build())
     * .entityDetectorConfiguration(EntityDetectorConfigurationProperty.builder()
     * .entityTypes(List.of("entityTypes"))
     * // the properties below are optional
     * .allowedStatistics(AllowedStatisticsProperty.builder()
     * .statistics(List.of("statistics"))
     * .build())
     * .build())
     * .profileColumns(List.of(ColumnSelectorProperty.builder()
     * .name("name")
     * .regex("regex")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-profileconfiguration.html)
     */
    public inline fun cfnJobProfileConfigurationProperty(
        block: CfnJobProfileConfigurationPropertyDsl.() -> Unit = {}
    ): CfnJob.ProfileConfigurationProperty {
        val builder = CfnJobProfileConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnJob`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * CfnJobProps cfnJobProps = CfnJobProps.builder()
     * .name("name")
     * .roleArn("roleArn")
     * .type("type")
     * // the properties below are optional
     * .databaseOutputs(List.of(DatabaseOutputProperty.builder()
     * .databaseOptions(DatabaseTableOutputOptionsProperty.builder()
     * .tableName("tableName")
     * // the properties below are optional
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build())
     * .build())
     * .glueConnectionName("glueConnectionName")
     * // the properties below are optional
     * .databaseOutputMode("databaseOutputMode")
     * .build()))
     * .dataCatalogOutputs(List.of(DataCatalogOutputProperty.builder()
     * .databaseName("databaseName")
     * .tableName("tableName")
     * // the properties below are optional
     * .catalogId("catalogId")
     * .databaseOptions(DatabaseTableOutputOptionsProperty.builder()
     * .tableName("tableName")
     * // the properties below are optional
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build())
     * .build())
     * .overwrite(false)
     * .s3Options(S3TableOutputOptionsProperty.builder()
     * .location(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build())
     * .build())
     * .build()))
     * .datasetName("datasetName")
     * .encryptionKeyArn("encryptionKeyArn")
     * .encryptionMode("encryptionMode")
     * .jobSample(JobSampleProperty.builder()
     * .mode("mode")
     * .size(123)
     * .build())
     * .logSubscription("logSubscription")
     * .maxCapacity(123)
     * .maxRetries(123)
     * .outputLocation(OutputLocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build())
     * .outputs(List.of(OutputProperty.builder()
     * .location(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build())
     * // the properties below are optional
     * .compressionFormat("compressionFormat")
     * .format("format")
     * .formatOptions(OutputFormatOptionsProperty.builder()
     * .csv(CsvOutputOptionsProperty.builder()
     * .delimiter("delimiter")
     * .build())
     * .build())
     * .maxOutputFiles(123)
     * .overwrite(false)
     * .partitionColumns(List.of("partitionColumns"))
     * .build()))
     * .profileConfiguration(ProfileConfigurationProperty.builder()
     * .columnStatisticsConfigurations(List.of(ColumnStatisticsConfigurationProperty.builder()
     * .statistics(StatisticsConfigurationProperty.builder()
     * .includedStatistics(List.of("includedStatistics"))
     * .overrides(List.of(StatisticOverrideProperty.builder()
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .statistic("statistic")
     * .build()))
     * .build())
     * // the properties below are optional
     * .selectors(List.of(ColumnSelectorProperty.builder()
     * .name("name")
     * .regex("regex")
     * .build()))
     * .build()))
     * .datasetStatisticsConfiguration(StatisticsConfigurationProperty.builder()
     * .includedStatistics(List.of("includedStatistics"))
     * .overrides(List.of(StatisticOverrideProperty.builder()
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .statistic("statistic")
     * .build()))
     * .build())
     * .entityDetectorConfiguration(EntityDetectorConfigurationProperty.builder()
     * .entityTypes(List.of("entityTypes"))
     * // the properties below are optional
     * .allowedStatistics(AllowedStatisticsProperty.builder()
     * .statistics(List.of("statistics"))
     * .build())
     * .build())
     * .profileColumns(List.of(ColumnSelectorProperty.builder()
     * .name("name")
     * .regex("regex")
     * .build()))
     * .build())
     * .projectName("projectName")
     * .recipe(RecipeProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .version("version")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .timeout(123)
     * .validationConfigurations(List.of(ValidationConfigurationProperty.builder()
     * .rulesetArn("rulesetArn")
     * // the properties below are optional
     * .validationMode("validationMode")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-job.html)
     */
    public inline fun cfnJobProps(block: CfnJobPropsDsl.() -> Unit = {}): CfnJobProps {
        val builder = CfnJobPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents one or more actions to be performed on a DataBrew dataset.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * RecipeProperty recipeProperty = RecipeProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-recipe.html)
     */
    public inline fun cfnJobRecipeProperty(
        block: CfnJobRecipePropertyDsl.() -> Unit = {}
    ): CfnJob.RecipeProperty {
        val builder = CfnJobRecipePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents an Amazon S3 location (bucket name, bucket owner, and object key) where DataBrew
     * can read input data, or write output from a job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-s3location.html)
     */
    public inline fun cfnJobS3LocationProperty(
        block: CfnJobS3LocationPropertyDsl.() -> Unit = {}
    ): CfnJob.S3LocationProperty {
        val builder = CfnJobS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents options that specify how and where DataBrew writes the Amazon S3 output generated
     * by recipe jobs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * S3TableOutputOptionsProperty s3TableOutputOptionsProperty =
     * S3TableOutputOptionsProperty.builder()
     * .location(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .bucketOwner("bucketOwner")
     * .key("key")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-s3tableoutputoptions.html)
     */
    public inline fun cfnJobS3TableOutputOptionsProperty(
        block: CfnJobS3TableOutputOptionsPropertyDsl.() -> Unit = {}
    ): CfnJob.S3TableOutputOptionsProperty {
        val builder = CfnJobS3TableOutputOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Override of a particular evaluation for a profile job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * StatisticOverrideProperty statisticOverrideProperty = StatisticOverrideProperty.builder()
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .statistic("statistic")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-statisticoverride.html)
     */
    public inline fun cfnJobStatisticOverrideProperty(
        block: CfnJobStatisticOverridePropertyDsl.() -> Unit = {}
    ): CfnJob.StatisticOverrideProperty {
        val builder = CfnJobStatisticOverridePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration of evaluations for a profile job.
     *
     * This configuration can be used to select evaluations and override the parameters of selected
     * evaluations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * StatisticsConfigurationProperty statisticsConfigurationProperty =
     * StatisticsConfigurationProperty.builder()
     * .includedStatistics(List.of("includedStatistics"))
     * .overrides(List.of(StatisticOverrideProperty.builder()
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .statistic("statistic")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-statisticsconfiguration.html)
     */
    public inline fun cfnJobStatisticsConfigurationProperty(
        block: CfnJobStatisticsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnJob.StatisticsConfigurationProperty {
        val builder = CfnJobStatisticsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for data quality validation.
     *
     * Used to select the Rulesets and Validation Mode to be used in the profile job. When
     * ValidationConfiguration is null, the profile job will run without data quality validation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * ValidationConfigurationProperty validationConfigurationProperty =
     * ValidationConfigurationProperty.builder()
     * .rulesetArn("rulesetArn")
     * // the properties below are optional
     * .validationMode("validationMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-validationconfiguration.html)
     */
    public inline fun cfnJobValidationConfigurationProperty(
        block: CfnJobValidationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnJob.ValidationConfigurationProperty {
        val builder = CfnJobValidationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a new AWS Glue DataBrew project.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
     * .datasetName("datasetName")
     * .name("name")
     * .recipeName("recipeName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .sample(SampleProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .size(123)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html)
     */
    public inline fun cfnProject(
        scope: Construct,
        id: String,
        block: CfnProjectDsl.() -> Unit = {},
    ): CfnProject {
        val builder = CfnProjectDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnProject`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
     * .datasetName("datasetName")
     * .name("name")
     * .recipeName("recipeName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .sample(SampleProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .size(123)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html)
     */
    public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
        val builder = CfnProjectPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the sample size and sampling type for DataBrew to use for interactive data
     * analysis.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * SampleProperty sampleProperty = SampleProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .size(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-project-sample.html)
     */
    public inline fun cfnProjectSampleProperty(
        block: CfnProjectSamplePropertyDsl.() -> Unit = {}
    ): CfnProject.SampleProperty {
        val builder = CfnProjectSamplePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a new AWS Glue DataBrew transformation recipe.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * CfnRecipe cfnRecipe = CfnRecipe.Builder.create(this, "MyCfnRecipe")
     * .name("name")
     * .steps(List.of(RecipeStepProperty.builder()
     * .action(ActionProperty.builder()
     * .operation("operation")
     * // the properties below are optional
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .build())
     * // the properties below are optional
     * .conditionExpressions(List.of(ConditionExpressionProperty.builder()
     * .condition("condition")
     * .targetColumn("targetColumn")
     * // the properties below are optional
     * .value("value")
     * .build()))
     * .build()))
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html)
     */
    public inline fun cfnRecipe(
        scope: Construct,
        id: String,
        block: CfnRecipeDsl.() -> Unit = {},
    ): CfnRecipe {
        val builder = CfnRecipeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a transformation and associated parameters that are used to apply a change to an
     * AWS Glue DataBrew dataset.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * ActionProperty actionProperty = ActionProperty.builder()
     * .operation("operation")
     * // the properties below are optional
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-action.html)
     */
    public inline fun cfnRecipeActionProperty(
        block: CfnRecipeActionPropertyDsl.() -> Unit = {}
    ): CfnRecipe.ActionProperty {
        val builder = CfnRecipeActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents an individual condition that evaluates to true or false.
     *
     * Conditions are used with recipe actions. The action is only performed for column values where
     * the condition evaluates to true.
     *
     * If a recipe requires more than one condition, then the recipe must specify multiple
     * `ConditionExpression` elements. Each condition is applied to the rows in a dataset first,
     * before the recipe action is performed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * ConditionExpressionProperty conditionExpressionProperty = ConditionExpressionProperty.builder()
     * .condition("condition")
     * .targetColumn("targetColumn")
     * // the properties below are optional
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-conditionexpression.html)
     */
    public inline fun cfnRecipeConditionExpressionProperty(
        block: CfnRecipeConditionExpressionPropertyDsl.() -> Unit = {}
    ): CfnRecipe.ConditionExpressionProperty {
        val builder = CfnRecipeConditionExpressionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents how metadata stored in the AWS Glue Data Catalog is defined in a DataBrew dataset.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * DataCatalogInputDefinitionProperty dataCatalogInputDefinitionProperty =
     * DataCatalogInputDefinitionProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-datacataloginputdefinition.html)
     */
    public inline fun cfnRecipeDataCatalogInputDefinitionProperty(
        block: CfnRecipeDataCatalogInputDefinitionPropertyDsl.() -> Unit = {}
    ): CfnRecipe.DataCatalogInputDefinitionProperty {
        val builder = CfnRecipeDataCatalogInputDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * InputProperty inputProperty = InputProperty.builder()
     * .dataCatalogInputDefinition(DataCatalogInputDefinitionProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build())
     * .s3InputDefinition(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-input.html)
     */
    public inline fun cfnRecipeInputProperty(
        block: CfnRecipeInputPropertyDsl.() -> Unit = {}
    ): CfnRecipe.InputProperty {
        val builder = CfnRecipeInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRecipe`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * CfnRecipeProps cfnRecipeProps = CfnRecipeProps.builder()
     * .name("name")
     * .steps(List.of(RecipeStepProperty.builder()
     * .action(ActionProperty.builder()
     * .operation("operation")
     * // the properties below are optional
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .build())
     * // the properties below are optional
     * .conditionExpressions(List.of(ConditionExpressionProperty.builder()
     * .condition("condition")
     * .targetColumn("targetColumn")
     * // the properties below are optional
     * .value("value")
     * .build()))
     * .build()))
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-recipe.html)
     */
    public inline fun cfnRecipeProps(block: CfnRecipePropsDsl.() -> Unit = {}): CfnRecipeProps {
        val builder = CfnRecipePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Parameters that are used as inputs for various recipe actions.
     *
     * The parameters are specific to the context in which they're used.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * Object input;
     * RecipeParametersProperty recipeParametersProperty = RecipeParametersProperty.builder()
     * .aggregateFunction("aggregateFunction")
     * .base("base")
     * .caseStatement("caseStatement")
     * .categoryMap("categoryMap")
     * .charsToRemove("charsToRemove")
     * .collapseConsecutiveWhitespace("collapseConsecutiveWhitespace")
     * .columnDataType("columnDataType")
     * .columnRange("columnRange")
     * .count("count")
     * .customCharacters("customCharacters")
     * .customStopWords("customStopWords")
     * .customValue("customValue")
     * .datasetsColumns("datasetsColumns")
     * .dateAddValue("dateAddValue")
     * .dateTimeFormat("dateTimeFormat")
     * .dateTimeParameters("dateTimeParameters")
     * .deleteOtherRows("deleteOtherRows")
     * .delimiter("delimiter")
     * .endPattern("endPattern")
     * .endPosition("endPosition")
     * .endValue("endValue")
     * .expandContractions("expandContractions")
     * .exponent("exponent")
     * .falseString("falseString")
     * .groupByAggFunctionOptions("groupByAggFunctionOptions")
     * .groupByColumns("groupByColumns")
     * .hiddenColumns("hiddenColumns")
     * .ignoreCase("ignoreCase")
     * .includeInSplit("includeInSplit")
     * .input(input)
     * .interval("interval")
     * .isText("isText")
     * .joinKeys("joinKeys")
     * .joinType("joinType")
     * .leftColumns("leftColumns")
     * .limit("limit")
     * .lowerBound("lowerBound")
     * .mapType("mapType")
     * .modeType("modeType")
     * .multiLine(false)
     * .numRows("numRows")
     * .numRowsAfter("numRowsAfter")
     * .numRowsBefore("numRowsBefore")
     * .orderByColumn("orderByColumn")
     * .orderByColumns("orderByColumns")
     * .other("other")
     * .pattern("pattern")
     * .patternOption1("patternOption1")
     * .patternOption2("patternOption2")
     * .patternOptions("patternOptions")
     * .period("period")
     * .position("position")
     * .removeAllPunctuation("removeAllPunctuation")
     * .removeAllQuotes("removeAllQuotes")
     * .removeAllWhitespace("removeAllWhitespace")
     * .removeCustomCharacters("removeCustomCharacters")
     * .removeCustomValue("removeCustomValue")
     * .removeLeadingAndTrailingPunctuation("removeLeadingAndTrailingPunctuation")
     * .removeLeadingAndTrailingQuotes("removeLeadingAndTrailingQuotes")
     * .removeLeadingAndTrailingWhitespace("removeLeadingAndTrailingWhitespace")
     * .removeLetters("removeLetters")
     * .removeNumbers("removeNumbers")
     * .removeSourceColumn("removeSourceColumn")
     * .removeSpecialCharacters("removeSpecialCharacters")
     * .rightColumns("rightColumns")
     * .sampleSize("sampleSize")
     * .sampleType("sampleType")
     * .secondaryInputs(List.of(SecondaryInputProperty.builder()
     * .dataCatalogInputDefinition(DataCatalogInputDefinitionProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build())
     * .s3InputDefinition(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build()))
     * .secondInput("secondInput")
     * .sheetIndexes(List.of(123))
     * .sheetNames(List.of("sheetNames"))
     * .sourceColumn("sourceColumn")
     * .sourceColumn1("sourceColumn1")
     * .sourceColumn2("sourceColumn2")
     * .sourceColumns("sourceColumns")
     * .startColumnIndex("startColumnIndex")
     * .startPattern("startPattern")
     * .startPosition("startPosition")
     * .startValue("startValue")
     * .stemmingMode("stemmingMode")
     * .stepCount("stepCount")
     * .stepIndex("stepIndex")
     * .stopWordsMode("stopWordsMode")
     * .strategy("strategy")
     * .targetColumn("targetColumn")
     * .targetColumnNames("targetColumnNames")
     * .targetDateFormat("targetDateFormat")
     * .targetIndex("targetIndex")
     * .timeZone("timeZone")
     * .tokenizerPattern("tokenizerPattern")
     * .trueString("trueString")
     * .udfLang("udfLang")
     * .units("units")
     * .unpivotColumn("unpivotColumn")
     * .upperBound("upperBound")
     * .useNewDataFrame("useNewDataFrame")
     * .value("value")
     * .value1("value1")
     * .value2("value2")
     * .valueColumn("valueColumn")
     * .viewFrame("viewFrame")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipeparameters.html)
     */
    public inline fun cfnRecipeRecipeParametersProperty(
        block: CfnRecipeRecipeParametersPropertyDsl.() -> Unit = {}
    ): CfnRecipe.RecipeParametersProperty {
        val builder = CfnRecipeRecipeParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a single step from a DataBrew recipe to be performed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * RecipeStepProperty recipeStepProperty = RecipeStepProperty.builder()
     * .action(ActionProperty.builder()
     * .operation("operation")
     * // the properties below are optional
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .build())
     * // the properties below are optional
     * .conditionExpressions(List.of(ConditionExpressionProperty.builder()
     * .condition("condition")
     * .targetColumn("targetColumn")
     * // the properties below are optional
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-recipestep.html)
     */
    public inline fun cfnRecipeRecipeStepProperty(
        block: CfnRecipeRecipeStepPropertyDsl.() -> Unit = {}
    ): CfnRecipe.RecipeStepProperty {
        val builder = CfnRecipeRecipeStepPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents an Amazon S3 location (bucket name, bucket owner, and object key) where DataBrew
     * can read input data, or write output from a job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-s3location.html)
     */
    public inline fun cfnRecipeS3LocationProperty(
        block: CfnRecipeS3LocationPropertyDsl.() -> Unit = {}
    ): CfnRecipe.S3LocationProperty {
        val builder = CfnRecipeS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents secondary inputs in a UNION transform.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * SecondaryInputProperty secondaryInputProperty = SecondaryInputProperty.builder()
     * .dataCatalogInputDefinition(DataCatalogInputDefinitionProperty.builder()
     * .catalogId("catalogId")
     * .databaseName("databaseName")
     * .tableName("tableName")
     * .tempDirectory(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build())
     * .s3InputDefinition(S3LocationProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .key("key")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-secondaryinput.html)
     */
    public inline fun cfnRecipeSecondaryInputProperty(
        block: CfnRecipeSecondaryInputPropertyDsl.() -> Unit = {}
    ): CfnRecipe.SecondaryInputProperty {
        val builder = CfnRecipeSecondaryInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a new ruleset that can be used in a profile job to validate the data quality of a
     * dataset.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * CfnRuleset cfnRuleset = CfnRuleset.Builder.create(this, "MyCfnRuleset")
     * .name("name")
     * .rules(List.of(RuleProperty.builder()
     * .checkExpression("checkExpression")
     * .name("name")
     * // the properties below are optional
     * .columnSelectors(List.of(ColumnSelectorProperty.builder()
     * .name("name")
     * .regex("regex")
     * .build()))
     * .disabled(false)
     * .substitutionMap(List.of(SubstitutionValueProperty.builder()
     * .value("value")
     * .valueReference("valueReference")
     * .build()))
     * .threshold(ThresholdProperty.builder()
     * .value(123)
     * // the properties below are optional
     * .type("type")
     * .unit("unit")
     * .build())
     * .build()))
     * .targetArn("targetArn")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html)
     */
    public inline fun cfnRuleset(
        scope: Construct,
        id: String,
        block: CfnRulesetDsl.() -> Unit = {},
    ): CfnRuleset {
        val builder = CfnRulesetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Selector of a column from a dataset for profile job configuration.
     *
     * One selector includes either a column name or a regular expression.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * ColumnSelectorProperty columnSelectorProperty = ColumnSelectorProperty.builder()
     * .name("name")
     * .regex("regex")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-columnselector.html)
     */
    public inline fun cfnRulesetColumnSelectorProperty(
        block: CfnRulesetColumnSelectorPropertyDsl.() -> Unit = {}
    ): CfnRuleset.ColumnSelectorProperty {
        val builder = CfnRulesetColumnSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRuleset`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * CfnRulesetProps cfnRulesetProps = CfnRulesetProps.builder()
     * .name("name")
     * .rules(List.of(RuleProperty.builder()
     * .checkExpression("checkExpression")
     * .name("name")
     * // the properties below are optional
     * .columnSelectors(List.of(ColumnSelectorProperty.builder()
     * .name("name")
     * .regex("regex")
     * .build()))
     * .disabled(false)
     * .substitutionMap(List.of(SubstitutionValueProperty.builder()
     * .value("value")
     * .valueReference("valueReference")
     * .build()))
     * .threshold(ThresholdProperty.builder()
     * .value(123)
     * // the properties below are optional
     * .type("type")
     * .unit("unit")
     * .build())
     * .build()))
     * .targetArn("targetArn")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html)
     */
    public inline fun cfnRulesetProps(block: CfnRulesetPropsDsl.() -> Unit = {}): CfnRulesetProps {
        val builder = CfnRulesetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a single data quality requirement that should be validated in the scope of this
     * dataset.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * RuleProperty ruleProperty = RuleProperty.builder()
     * .checkExpression("checkExpression")
     * .name("name")
     * // the properties below are optional
     * .columnSelectors(List.of(ColumnSelectorProperty.builder()
     * .name("name")
     * .regex("regex")
     * .build()))
     * .disabled(false)
     * .substitutionMap(List.of(SubstitutionValueProperty.builder()
     * .value("value")
     * .valueReference("valueReference")
     * .build()))
     * .threshold(ThresholdProperty.builder()
     * .value(123)
     * // the properties below are optional
     * .type("type")
     * .unit("unit")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-rule.html)
     */
    public inline fun cfnRulesetRuleProperty(
        block: CfnRulesetRulePropertyDsl.() -> Unit = {}
    ): CfnRuleset.RuleProperty {
        val builder = CfnRulesetRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A key-value pair to associate an expression's substitution variable names with their values.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * SubstitutionValueProperty substitutionValueProperty = SubstitutionValueProperty.builder()
     * .value("value")
     * .valueReference("valueReference")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-substitutionvalue.html)
     */
    public inline fun cfnRulesetSubstitutionValueProperty(
        block: CfnRulesetSubstitutionValuePropertyDsl.() -> Unit = {}
    ): CfnRuleset.SubstitutionValueProperty {
        val builder = CfnRulesetSubstitutionValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The threshold used with a non-aggregate check expression.
     *
     * The non-aggregate check expression will be applied to each row in a specific column. Then the
     * threshold will be used to determine whether the validation succeeds.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * ThresholdProperty thresholdProperty = ThresholdProperty.builder()
     * .value(123)
     * // the properties below are optional
     * .type("type")
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-threshold.html)
     */
    public inline fun cfnRulesetThresholdProperty(
        block: CfnRulesetThresholdPropertyDsl.() -> Unit = {}
    ): CfnRuleset.ThresholdProperty {
        val builder = CfnRulesetThresholdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a new schedule for one or more AWS Glue DataBrew jobs.
     *
     * Jobs can be run at a specific date and time, or at regular intervals.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * CfnSchedule cfnSchedule = CfnSchedule.Builder.create(this, "MyCfnSchedule")
     * .cronExpression("cronExpression")
     * .name("name")
     * // the properties below are optional
     * .jobNames(List.of("jobNames"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html)
     */
    public inline fun cfnSchedule(
        scope: Construct,
        id: String,
        block: CfnScheduleDsl.() -> Unit = {},
    ): CfnSchedule {
        val builder = CfnScheduleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSchedule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.databrew.*;
     * CfnScheduleProps cfnScheduleProps = CfnScheduleProps.builder()
     * .cronExpression("cronExpression")
     * .name("name")
     * // the properties below are optional
     * .jobNames(List.of("jobNames"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html)
     */
    public inline fun cfnScheduleProps(
        block: CfnSchedulePropsDsl.() -> Unit = {}
    ): CfnScheduleProps {
        val builder = CfnSchedulePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
