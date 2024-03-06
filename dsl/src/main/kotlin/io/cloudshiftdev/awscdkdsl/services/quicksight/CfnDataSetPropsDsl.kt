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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet
import software.amazon.awscdk.services.quicksight.CfnDataSetProps

/**
 * Properties for defining a `CfnDataSet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * Object tagRuleConfigurations;
 * CfnDataSetProps cfnDataSetProps = CfnDataSetProps.builder()
 * .awsAccountId("awsAccountId")
 * .columnGroups(List.of(ColumnGroupProperty.builder()
 * .geoSpatialColumnGroup(GeoSpatialColumnGroupProperty.builder()
 * .columns(List.of("columns"))
 * .name("name")
 * // the properties below are optional
 * .countryCode("countryCode")
 * .build())
 * .build()))
 * .columnLevelPermissionRules(List.of(ColumnLevelPermissionRuleProperty.builder()
 * .columnNames(List.of("columnNames"))
 * .principals(List.of("principals"))
 * .build()))
 * .dataSetId("dataSetId")
 * .datasetParameters(List.of(DatasetParameterProperty.builder()
 * .dateTimeDatasetParameter(DateTimeDatasetParameterProperty.builder()
 * .id("id")
 * .name("name")
 * .valueType("valueType")
 * // the properties below are optional
 * .defaultValues(DateTimeDatasetParameterDefaultValuesProperty.builder()
 * .staticValues(List.of("staticValues"))
 * .build())
 * .timeGranularity("timeGranularity")
 * .build())
 * .decimalDatasetParameter(DecimalDatasetParameterProperty.builder()
 * .id("id")
 * .name("name")
 * .valueType("valueType")
 * // the properties below are optional
 * .defaultValues(DecimalDatasetParameterDefaultValuesProperty.builder()
 * .staticValues(List.of(123))
 * .build())
 * .build())
 * .integerDatasetParameter(IntegerDatasetParameterProperty.builder()
 * .id("id")
 * .name("name")
 * .valueType("valueType")
 * // the properties below are optional
 * .defaultValues(IntegerDatasetParameterDefaultValuesProperty.builder()
 * .staticValues(List.of(123))
 * .build())
 * .build())
 * .stringDatasetParameter(StringDatasetParameterProperty.builder()
 * .id("id")
 * .name("name")
 * .valueType("valueType")
 * // the properties below are optional
 * .defaultValues(StringDatasetParameterDefaultValuesProperty.builder()
 * .staticValues(List.of("staticValues"))
 * .build())
 * .build())
 * .build()))
 * .dataSetRefreshProperties(DataSetRefreshPropertiesProperty.builder()
 * .refreshConfiguration(RefreshConfigurationProperty.builder()
 * .incrementalRefresh(IncrementalRefreshProperty.builder()
 * .lookbackWindow(LookbackWindowProperty.builder()
 * .columnName("columnName")
 * .size(123)
 * .sizeUnit("sizeUnit")
 * .build())
 * .build())
 * .build())
 * .build())
 * .dataSetUsageConfiguration(DataSetUsageConfigurationProperty.builder()
 * .disableUseAsDirectQuerySource(false)
 * .disableUseAsImportedSource(false)
 * .build())
 * .fieldFolders(Map.of(
 * "fieldFoldersKey", FieldFolderProperty.builder()
 * .columns(List.of("columns"))
 * .description("description")
 * .build()))
 * .importMode("importMode")
 * .ingestionWaitPolicy(IngestionWaitPolicyProperty.builder()
 * .ingestionWaitTimeInHours(123)
 * .waitForSpiceIngestion(false)
 * .build())
 * .logicalTableMap(Map.of(
 * "logicalTableMapKey", LogicalTableProperty.builder()
 * .alias("alias")
 * .source(LogicalTableSourceProperty.builder()
 * .dataSetArn("dataSetArn")
 * .joinInstruction(JoinInstructionProperty.builder()
 * .leftOperand("leftOperand")
 * .onClause("onClause")
 * .rightOperand("rightOperand")
 * .type("type")
 * // the properties below are optional
 * .leftJoinKeyProperties(JoinKeyPropertiesProperty.builder()
 * .uniqueKey(false)
 * .build())
 * .rightJoinKeyProperties(JoinKeyPropertiesProperty.builder()
 * .uniqueKey(false)
 * .build())
 * .build())
 * .physicalTableId("physicalTableId")
 * .build())
 * // the properties below are optional
 * .dataTransforms(List.of(TransformOperationProperty.builder()
 * .castColumnTypeOperation(CastColumnTypeOperationProperty.builder()
 * .columnName("columnName")
 * .newColumnType("newColumnType")
 * // the properties below are optional
 * .format("format")
 * .subType("subType")
 * .build())
 * .createColumnsOperation(CreateColumnsOperationProperty.builder()
 * .columns(List.of(CalculatedColumnProperty.builder()
 * .columnId("columnId")
 * .columnName("columnName")
 * .expression("expression")
 * .build()))
 * .build())
 * .filterOperation(FilterOperationProperty.builder()
 * .conditionExpression("conditionExpression")
 * .build())
 * .overrideDatasetParameterOperation(OverrideDatasetParameterOperationProperty.builder()
 * .parameterName("parameterName")
 * // the properties below are optional
 * .newDefaultValues(NewDefaultValuesProperty.builder()
 * .dateTimeStaticValues(List.of("dateTimeStaticValues"))
 * .decimalStaticValues(List.of(123))
 * .integerStaticValues(List.of(123))
 * .stringStaticValues(List.of("stringStaticValues"))
 * .build())
 * .newParameterName("newParameterName")
 * .build())
 * .projectOperation(ProjectOperationProperty.builder()
 * .projectedColumns(List.of("projectedColumns"))
 * .build())
 * .renameColumnOperation(RenameColumnOperationProperty.builder()
 * .columnName("columnName")
 * .newColumnName("newColumnName")
 * .build())
 * .tagColumnOperation(TagColumnOperationProperty.builder()
 * .columnName("columnName")
 * .tags(List.of(ColumnTagProperty.builder()
 * .columnDescription(ColumnDescriptionProperty.builder()
 * .text("text")
 * .build())
 * .columnGeographicRole("columnGeographicRole")
 * .build()))
 * .build())
 * .build()))
 * .build()))
 * .name("name")
 * .permissions(List.of(ResourcePermissionProperty.builder()
 * .actions(List.of("actions"))
 * .principal("principal")
 * .build()))
 * .physicalTableMap(Map.of(
 * "physicalTableMapKey", PhysicalTableProperty.builder()
 * .customSql(CustomSqlProperty.builder()
 * .columns(List.of(InputColumnProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .subType("subType")
 * .build()))
 * .dataSourceArn("dataSourceArn")
 * .name("name")
 * .sqlQuery("sqlQuery")
 * .build())
 * .relationalTable(RelationalTableProperty.builder()
 * .dataSourceArn("dataSourceArn")
 * .inputColumns(List.of(InputColumnProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .subType("subType")
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .catalog("catalog")
 * .schema("schema")
 * .build())
 * .s3Source(S3SourceProperty.builder()
 * .dataSourceArn("dataSourceArn")
 * .inputColumns(List.of(InputColumnProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .subType("subType")
 * .build()))
 * // the properties below are optional
 * .uploadSettings(UploadSettingsProperty.builder()
 * .containsHeader(false)
 * .delimiter("delimiter")
 * .format("format")
 * .startFromRow(123)
 * .textQualifier("textQualifier")
 * .build())
 * .build())
 * .build()))
 * .rowLevelPermissionDataSet(RowLevelPermissionDataSetProperty.builder()
 * .arn("arn")
 * .permissionPolicy("permissionPolicy")
 * // the properties below are optional
 * .formatVersion("formatVersion")
 * .namespace("namespace")
 * .status("status")
 * .build())
 * .rowLevelPermissionTagConfiguration(RowLevelPermissionTagConfigurationProperty.builder()
 * .tagRules(List.of(RowLevelPermissionTagRuleProperty.builder()
 * .columnName("columnName")
 * .tagKey("tagKey")
 * // the properties below are optional
 * .matchAllValue("matchAllValue")
 * .tagMultiValueDelimiter("tagMultiValueDelimiter")
 * .build()))
 * // the properties below are optional
 * .status("status")
 * .tagRuleConfigurations(tagRuleConfigurations)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html)
 */
@CdkDslMarker
public class CfnDataSetPropsDsl {
    private val cdkBuilder: CfnDataSetProps.Builder = CfnDataSetProps.builder()

    private val _columnGroups: MutableList<Any> = mutableListOf()

    private val _columnLevelPermissionRules: MutableList<Any> = mutableListOf()

    private val _datasetParameters: MutableList<Any> = mutableListOf()

    private val _permissions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param awsAccountId The AWS account ID. */
    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
     *   features. Currently, only geospatial hierarchy is supported.
     */
    public fun columnGroups(vararg columnGroups: Any) {
        _columnGroups.addAll(listOf(*columnGroups))
    }

    /**
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
     *   features. Currently, only geospatial hierarchy is supported.
     */
    public fun columnGroups(columnGroups: Collection<Any>) {
        _columnGroups.addAll(columnGroups)
    }

    /**
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
     *   features. Currently, only geospatial hierarchy is supported.
     */
    public fun columnGroups(columnGroups: IResolvable) {
        cdkBuilder.columnGroups(columnGroups)
    }

    /**
     * @param columnLevelPermissionRules A set of one or more definitions of a
     *   `ColumnLevelPermissionRule` .
     */
    public fun columnLevelPermissionRules(vararg columnLevelPermissionRules: Any) {
        _columnLevelPermissionRules.addAll(listOf(*columnLevelPermissionRules))
    }

    /**
     * @param columnLevelPermissionRules A set of one or more definitions of a
     *   `ColumnLevelPermissionRule` .
     */
    public fun columnLevelPermissionRules(columnLevelPermissionRules: Collection<Any>) {
        _columnLevelPermissionRules.addAll(columnLevelPermissionRules)
    }

    /**
     * @param columnLevelPermissionRules A set of one or more definitions of a
     *   `ColumnLevelPermissionRule` .
     */
    public fun columnLevelPermissionRules(columnLevelPermissionRules: IResolvable) {
        cdkBuilder.columnLevelPermissionRules(columnLevelPermissionRules)
    }

    /**
     * @param dataSetId An ID for the dataset that you want to create. This ID is unique per AWS
     *   Region for each AWS account.
     */
    public fun dataSetId(dataSetId: String) {
        cdkBuilder.dataSetId(dataSetId)
    }

    /** @param dataSetRefreshProperties The refresh properties of a dataset. */
    public fun dataSetRefreshProperties(dataSetRefreshProperties: IResolvable) {
        cdkBuilder.dataSetRefreshProperties(dataSetRefreshProperties)
    }

    /** @param dataSetRefreshProperties The refresh properties of a dataset. */
    public fun dataSetRefreshProperties(
        dataSetRefreshProperties: CfnDataSet.DataSetRefreshPropertiesProperty
    ) {
        cdkBuilder.dataSetRefreshProperties(dataSetRefreshProperties)
    }

    /**
     * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
     *   reference this dataset as a source.
     */
    public fun dataSetUsageConfiguration(dataSetUsageConfiguration: IResolvable) {
        cdkBuilder.dataSetUsageConfiguration(dataSetUsageConfiguration)
    }

    /**
     * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
     *   reference this dataset as a source.
     */
    public fun dataSetUsageConfiguration(
        dataSetUsageConfiguration: CfnDataSet.DataSetUsageConfigurationProperty
    ) {
        cdkBuilder.dataSetUsageConfiguration(dataSetUsageConfiguration)
    }

    /** @param datasetParameters The parameters that are declared in a dataset. */
    public fun datasetParameters(vararg datasetParameters: Any) {
        _datasetParameters.addAll(listOf(*datasetParameters))
    }

    /** @param datasetParameters The parameters that are declared in a dataset. */
    public fun datasetParameters(datasetParameters: Collection<Any>) {
        _datasetParameters.addAll(datasetParameters)
    }

    /** @param datasetParameters The parameters that are declared in a dataset. */
    public fun datasetParameters(datasetParameters: IResolvable) {
        cdkBuilder.datasetParameters(datasetParameters)
    }

    /**
     * @param fieldFolders The folder that contains fields and nested subfolders for your dataset.
     */
    public fun fieldFolders(fieldFolders: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(fieldFolders)
        cdkBuilder.fieldFolders(builder.map)
    }

    /**
     * @param fieldFolders The folder that contains fields and nested subfolders for your dataset.
     */
    public fun fieldFolders(fieldFolders: Map<String, Any>) {
        cdkBuilder.fieldFolders(fieldFolders)
    }

    /**
     * @param fieldFolders The folder that contains fields and nested subfolders for your dataset.
     */
    public fun fieldFolders(fieldFolders: IResolvable) {
        cdkBuilder.fieldFolders(fieldFolders)
    }

    /** @param importMode Indicates whether you want to import the data into SPICE. */
    public fun importMode(importMode: String) {
        cdkBuilder.importMode(importMode)
    }

    /**
     * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset. The
     *   default is to wait for SPICE ingestion to finish with timeout of 36 hours.
     */
    public fun ingestionWaitPolicy(ingestionWaitPolicy: IResolvable) {
        cdkBuilder.ingestionWaitPolicy(ingestionWaitPolicy)
    }

    /**
     * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset. The
     *   default is to wait for SPICE ingestion to finish with timeout of 36 hours.
     */
    public fun ingestionWaitPolicy(ingestionWaitPolicy: CfnDataSet.IngestionWaitPolicyProperty) {
        cdkBuilder.ingestionWaitPolicy(ingestionWaitPolicy)
    }

    /**
     * @param logicalTableMap Configures the combination and transformation of the data from the
     *   physical tables.
     */
    public fun logicalTableMap(logicalTableMap: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(logicalTableMap)
        cdkBuilder.logicalTableMap(builder.map)
    }

    /**
     * @param logicalTableMap Configures the combination and transformation of the data from the
     *   physical tables.
     */
    public fun logicalTableMap(logicalTableMap: Map<String, Any>) {
        cdkBuilder.logicalTableMap(logicalTableMap)
    }

    /**
     * @param logicalTableMap Configures the combination and transformation of the data from the
     *   physical tables.
     */
    public fun logicalTableMap(logicalTableMap: IResolvable) {
        cdkBuilder.logicalTableMap(logicalTableMap)
    }

    /** @param name The display name for the dataset. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param permissions A list of resource permissions on the dataset. */
    public fun permissions(vararg permissions: Any) {
        _permissions.addAll(listOf(*permissions))
    }

    /** @param permissions A list of resource permissions on the dataset. */
    public fun permissions(permissions: Collection<Any>) {
        _permissions.addAll(permissions)
    }

    /** @param permissions A list of resource permissions on the dataset. */
    public fun permissions(permissions: IResolvable) {
        cdkBuilder.permissions(permissions)
    }

    /**
     * @param physicalTableMap Declares the physical tables that are available in the underlying
     *   data sources.
     */
    public fun physicalTableMap(physicalTableMap: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(physicalTableMap)
        cdkBuilder.physicalTableMap(builder.map)
    }

    /**
     * @param physicalTableMap Declares the physical tables that are available in the underlying
     *   data sources.
     */
    public fun physicalTableMap(physicalTableMap: Map<String, Any>) {
        cdkBuilder.physicalTableMap(physicalTableMap)
    }

    /**
     * @param physicalTableMap Declares the physical tables that are available in the underlying
     *   data sources.
     */
    public fun physicalTableMap(physicalTableMap: IResolvable) {
        cdkBuilder.physicalTableMap(physicalTableMap)
    }

    /**
     * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
     *   want to create.
     */
    public fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: IResolvable) {
        cdkBuilder.rowLevelPermissionDataSet(rowLevelPermissionDataSet)
    }

    /**
     * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
     *   want to create.
     */
    public fun rowLevelPermissionDataSet(
        rowLevelPermissionDataSet: CfnDataSet.RowLevelPermissionDataSetProperty
    ) {
        cdkBuilder.rowLevelPermissionDataSet(rowLevelPermissionDataSet)
    }

    /**
     * @param rowLevelPermissionTagConfiguration The element you can use to define tags for
     *   row-level security.
     */
    public fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: IResolvable) {
        cdkBuilder.rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration)
    }

    /**
     * @param rowLevelPermissionTagConfiguration The element you can use to define tags for
     *   row-level security.
     */
    public fun rowLevelPermissionTagConfiguration(
        rowLevelPermissionTagConfiguration: CfnDataSet.RowLevelPermissionTagConfigurationProperty
    ) {
        cdkBuilder.rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration)
    }

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     *   the dataset.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     *   the dataset.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDataSetProps {
        if (_columnGroups.isNotEmpty()) cdkBuilder.columnGroups(_columnGroups)
        if (_columnLevelPermissionRules.isNotEmpty())
            cdkBuilder.columnLevelPermissionRules(_columnLevelPermissionRules)
        if (_datasetParameters.isNotEmpty()) cdkBuilder.datasetParameters(_datasetParameters)
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
