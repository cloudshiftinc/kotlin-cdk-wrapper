@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a dataset.
 *
 * This operation doesn't support datasets that include uploaded files as a source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.quicksight.*;
 * Object tagRuleConfigurations;
 * CfnDataSet cfnDataSet = CfnDataSet.Builder.create(this, "MyCfnDataSet")
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
public open class CfnDataSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the dataset.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The amount of SPICE capacity used by this dataset.
   *
   * This is 0 if the dataset isn't
   * imported into SPICE.</p>
   */
  public open fun attrConsumedSpiceCapacityInBytes(): IResolvable =
      unwrap(this).getAttrConsumedSpiceCapacityInBytes().let(IResolvable::wrap)

  /**
   * The time this dataset version was created.
   */
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  /**
   * The time this dataset version was last updated.
   */
  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  /**
   * The list of columns after all transforms.
   *
   * These columns are available in templates,
   * analyses, and dashboards.</p>
   */
  public open fun attrOutputColumns(): IResolvable =
      unwrap(this).getAttrOutputColumns().let(IResolvable::wrap)

  /**
   * The AWS account ID.
   */
  public open fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  /**
   * The AWS account ID.
   */
  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  /**
   * Groupings of columns that work together in certain Amazon QuickSight features.
   */
  public open fun columnGroups(): Any? = unwrap(this).getColumnGroups()

  /**
   * Groupings of columns that work together in certain Amazon QuickSight features.
   */
  public open fun columnGroups(`value`: IResolvable) {
    unwrap(this).setColumnGroups(`value`.let(IResolvable::unwrap))
  }

  /**
   * Groupings of columns that work together in certain Amazon QuickSight features.
   */
  public open fun columnGroups(`value`: List<Any>) {
    unwrap(this).setColumnGroups(`value`)
  }

  /**
   * Groupings of columns that work together in certain Amazon QuickSight features.
   */
  public open fun columnGroups(vararg `value`: Any): Unit = columnGroups(`value`.toList())

  /**
   * A set of one or more definitions of a `ColumnLevelPermissionRule` .
   */
  public open fun columnLevelPermissionRules(): Any? = unwrap(this).getColumnLevelPermissionRules()

  /**
   * A set of one or more definitions of a `ColumnLevelPermissionRule` .
   */
  public open fun columnLevelPermissionRules(`value`: IResolvable) {
    unwrap(this).setColumnLevelPermissionRules(`value`.let(IResolvable::unwrap))
  }

  /**
   * A set of one or more definitions of a `ColumnLevelPermissionRule` .
   */
  public open fun columnLevelPermissionRules(`value`: List<Any>) {
    unwrap(this).setColumnLevelPermissionRules(`value`)
  }

  /**
   * A set of one or more definitions of a `ColumnLevelPermissionRule` .
   */
  public open fun columnLevelPermissionRules(vararg `value`: Any): Unit =
      columnLevelPermissionRules(`value`.toList())

  /**
   * An ID for the dataset that you want to create.
   */
  public open fun dataSetId(): String? = unwrap(this).getDataSetId()

  /**
   * An ID for the dataset that you want to create.
   */
  public open fun dataSetId(`value`: String) {
    unwrap(this).setDataSetId(`value`)
  }

  /**
   * The refresh properties of a dataset.
   */
  public open fun dataSetRefreshProperties(): Any? = unwrap(this).getDataSetRefreshProperties()

  /**
   * The refresh properties of a dataset.
   */
  public open fun dataSetRefreshProperties(`value`: IResolvable) {
    unwrap(this).setDataSetRefreshProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * The refresh properties of a dataset.
   */
  public open fun dataSetRefreshProperties(`value`: DataSetRefreshPropertiesProperty) {
    unwrap(this).setDataSetRefreshProperties(`value`.let(DataSetRefreshPropertiesProperty::unwrap))
  }

  /**
   * The refresh properties of a dataset.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f503b96cf7d203a59d4b2249b4db2d74bc982b921ba7891718737c1784d32ad")
  public open
      fun dataSetRefreshProperties(`value`: DataSetRefreshPropertiesProperty.Builder.() -> Unit):
      Unit = dataSetRefreshProperties(DataSetRefreshPropertiesProperty(`value`))

  /**
   * The usage configuration to apply to child datasets that reference this dataset as a source.
   */
  public open fun dataSetUsageConfiguration(): Any? = unwrap(this).getDataSetUsageConfiguration()

  /**
   * The usage configuration to apply to child datasets that reference this dataset as a source.
   */
  public open fun dataSetUsageConfiguration(`value`: IResolvable) {
    unwrap(this).setDataSetUsageConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The usage configuration to apply to child datasets that reference this dataset as a source.
   */
  public open fun dataSetUsageConfiguration(`value`: DataSetUsageConfigurationProperty) {
    unwrap(this).setDataSetUsageConfiguration(`value`.let(DataSetUsageConfigurationProperty::unwrap))
  }

  /**
   * The usage configuration to apply to child datasets that reference this dataset as a source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6f957a22a68080352e1e705f2ee0f7ad7178b0158c4ceba8d84bce512ad07911")
  public open
      fun dataSetUsageConfiguration(`value`: DataSetUsageConfigurationProperty.Builder.() -> Unit):
      Unit = dataSetUsageConfiguration(DataSetUsageConfigurationProperty(`value`))

  /**
   * The parameters that are declared in a dataset.
   */
  public open fun datasetParameters(): Any? = unwrap(this).getDatasetParameters()

  /**
   * The parameters that are declared in a dataset.
   */
  public open fun datasetParameters(`value`: IResolvable) {
    unwrap(this).setDatasetParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * The parameters that are declared in a dataset.
   */
  public open fun datasetParameters(`value`: List<Any>) {
    unwrap(this).setDatasetParameters(`value`)
  }

  /**
   * The parameters that are declared in a dataset.
   */
  public open fun datasetParameters(vararg `value`: Any): Unit = datasetParameters(`value`.toList())

  /**
   * The folder that contains fields and nested subfolders for your dataset.
   */
  public open fun fieldFolders(): Any? = unwrap(this).getFieldFolders()

  /**
   * The folder that contains fields and nested subfolders for your dataset.
   */
  public open fun fieldFolders(`value`: IResolvable) {
    unwrap(this).setFieldFolders(`value`.let(IResolvable::unwrap))
  }

  /**
   * The folder that contains fields and nested subfolders for your dataset.
   */
  public open fun fieldFolders(`value`: Map<String, Any>) {
    unwrap(this).setFieldFolders(`value`)
  }

  /**
   * Indicates whether you want to import the data into SPICE.
   */
  public open fun importMode(): String? = unwrap(this).getImportMode()

  /**
   * Indicates whether you want to import the data into SPICE.
   */
  public open fun importMode(`value`: String) {
    unwrap(this).setImportMode(`value`)
  }

  /**
   * The wait policy to use when creating or updating a Dataset.
   */
  public open fun ingestionWaitPolicy(): Any? = unwrap(this).getIngestionWaitPolicy()

  /**
   * The wait policy to use when creating or updating a Dataset.
   */
  public open fun ingestionWaitPolicy(`value`: IResolvable) {
    unwrap(this).setIngestionWaitPolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * The wait policy to use when creating or updating a Dataset.
   */
  public open fun ingestionWaitPolicy(`value`: IngestionWaitPolicyProperty) {
    unwrap(this).setIngestionWaitPolicy(`value`.let(IngestionWaitPolicyProperty::unwrap))
  }

  /**
   * The wait policy to use when creating or updating a Dataset.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c3f6e273c2baf9557683876729f153f91af9ce7972d27ad4710224da906418b2")
  public open fun ingestionWaitPolicy(`value`: IngestionWaitPolicyProperty.Builder.() -> Unit): Unit
      = ingestionWaitPolicy(IngestionWaitPolicyProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Configures the combination and transformation of the data from the physical tables.
   */
  public open fun logicalTableMap(): Any? = unwrap(this).getLogicalTableMap()

  /**
   * Configures the combination and transformation of the data from the physical tables.
   */
  public open fun logicalTableMap(`value`: IResolvable) {
    unwrap(this).setLogicalTableMap(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configures the combination and transformation of the data from the physical tables.
   */
  public open fun logicalTableMap(`value`: Map<String, Any>) {
    unwrap(this).setLogicalTableMap(`value`)
  }

  /**
   * The display name for the dataset.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The display name for the dataset.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A list of resource permissions on the dataset.
   */
  public open fun permissions(): Any? = unwrap(this).getPermissions()

  /**
   * A list of resource permissions on the dataset.
   */
  public open fun permissions(`value`: IResolvable) {
    unwrap(this).setPermissions(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of resource permissions on the dataset.
   */
  public open fun permissions(`value`: List<Any>) {
    unwrap(this).setPermissions(`value`)
  }

  /**
   * A list of resource permissions on the dataset.
   */
  public open fun permissions(vararg `value`: Any): Unit = permissions(`value`.toList())

  /**
   * Declares the physical tables that are available in the underlying data sources.
   */
  public open fun physicalTableMap(): Any? = unwrap(this).getPhysicalTableMap()

  /**
   * Declares the physical tables that are available in the underlying data sources.
   */
  public open fun physicalTableMap(`value`: IResolvable) {
    unwrap(this).setPhysicalTableMap(`value`.let(IResolvable::unwrap))
  }

  /**
   * Declares the physical tables that are available in the underlying data sources.
   */
  public open fun physicalTableMap(`value`: Map<String, Any>) {
    unwrap(this).setPhysicalTableMap(`value`)
  }

  /**
   * The row-level security configuration for the data that you want to create.
   */
  public open fun rowLevelPermissionDataSet(): Any? = unwrap(this).getRowLevelPermissionDataSet()

  /**
   * The row-level security configuration for the data that you want to create.
   */
  public open fun rowLevelPermissionDataSet(`value`: IResolvable) {
    unwrap(this).setRowLevelPermissionDataSet(`value`.let(IResolvable::unwrap))
  }

  /**
   * The row-level security configuration for the data that you want to create.
   */
  public open fun rowLevelPermissionDataSet(`value`: RowLevelPermissionDataSetProperty) {
    unwrap(this).setRowLevelPermissionDataSet(`value`.let(RowLevelPermissionDataSetProperty::unwrap))
  }

  /**
   * The row-level security configuration for the data that you want to create.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a96a5cfa4e111de0081543de481cee9778cd7ed81f95ad730ba579990c838528")
  public open
      fun rowLevelPermissionDataSet(`value`: RowLevelPermissionDataSetProperty.Builder.() -> Unit):
      Unit = rowLevelPermissionDataSet(RowLevelPermissionDataSetProperty(`value`))

  /**
   * The element you can use to define tags for row-level security.
   */
  public open fun rowLevelPermissionTagConfiguration(): Any? =
      unwrap(this).getRowLevelPermissionTagConfiguration()

  /**
   * The element you can use to define tags for row-level security.
   */
  public open fun rowLevelPermissionTagConfiguration(`value`: IResolvable) {
    unwrap(this).setRowLevelPermissionTagConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The element you can use to define tags for row-level security.
   */
  public open
      fun rowLevelPermissionTagConfiguration(`value`: RowLevelPermissionTagConfigurationProperty) {
    unwrap(this).setRowLevelPermissionTagConfiguration(`value`.let(RowLevelPermissionTagConfigurationProperty::unwrap))
  }

  /**
   * The element you can use to define tags for row-level security.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d4eee0adf41d378bf4e5491d261267bc89360347f50c68caed50561824909c2")
  public open
      fun rowLevelPermissionTagConfiguration(`value`: RowLevelPermissionTagConfigurationProperty.Builder.() -> Unit):
      Unit = rowLevelPermissionTagConfiguration(RowLevelPermissionTagConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.quicksight.CfnDataSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-awsaccountid)
     * @param awsAccountId The AWS account ID. 
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * Groupings of columns that work together in certain Amazon QuickSight features.
     *
     * Currently, only geospatial hierarchy is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columngroups)
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
     * features. 
     */
    public fun columnGroups(columnGroups: IResolvable)

    /**
     * Groupings of columns that work together in certain Amazon QuickSight features.
     *
     * Currently, only geospatial hierarchy is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columngroups)
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
     * features. 
     */
    public fun columnGroups(columnGroups: List<Any>)

    /**
     * Groupings of columns that work together in certain Amazon QuickSight features.
     *
     * Currently, only geospatial hierarchy is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columngroups)
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
     * features. 
     */
    public fun columnGroups(vararg columnGroups: Any)

    /**
     * A set of one or more definitions of a `ColumnLevelPermissionRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columnlevelpermissionrules)
     * @param columnLevelPermissionRules A set of one or more definitions of a
     * `ColumnLevelPermissionRule` . 
     */
    public fun columnLevelPermissionRules(columnLevelPermissionRules: IResolvable)

    /**
     * A set of one or more definitions of a `ColumnLevelPermissionRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columnlevelpermissionrules)
     * @param columnLevelPermissionRules A set of one or more definitions of a
     * `ColumnLevelPermissionRule` . 
     */
    public fun columnLevelPermissionRules(columnLevelPermissionRules: List<Any>)

    /**
     * A set of one or more definitions of a `ColumnLevelPermissionRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columnlevelpermissionrules)
     * @param columnLevelPermissionRules A set of one or more definitions of a
     * `ColumnLevelPermissionRule` . 
     */
    public fun columnLevelPermissionRules(vararg columnLevelPermissionRules: Any)

    /**
     * An ID for the dataset that you want to create.
     *
     * This ID is unique per AWS Region for each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetid)
     * @param dataSetId An ID for the dataset that you want to create. 
     */
    public fun dataSetId(dataSetId: String)

    /**
     * The refresh properties of a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetrefreshproperties)
     * @param dataSetRefreshProperties The refresh properties of a dataset. 
     */
    public fun dataSetRefreshProperties(dataSetRefreshProperties: IResolvable)

    /**
     * The refresh properties of a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetrefreshproperties)
     * @param dataSetRefreshProperties The refresh properties of a dataset. 
     */
    public fun dataSetRefreshProperties(dataSetRefreshProperties: DataSetRefreshPropertiesProperty)

    /**
     * The refresh properties of a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetrefreshproperties)
     * @param dataSetRefreshProperties The refresh properties of a dataset. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b11bbe24eafa6fe8be5693ba34a09f2b8c06e64b642fae3c4124b121a329b8e")
    public
        fun dataSetRefreshProperties(dataSetRefreshProperties: DataSetRefreshPropertiesProperty.Builder.() -> Unit)

    /**
     * The usage configuration to apply to child datasets that reference this dataset as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetusageconfiguration)
     * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
     * reference this dataset as a source. 
     */
    public fun dataSetUsageConfiguration(dataSetUsageConfiguration: IResolvable)

    /**
     * The usage configuration to apply to child datasets that reference this dataset as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetusageconfiguration)
     * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
     * reference this dataset as a source. 
     */
    public
        fun dataSetUsageConfiguration(dataSetUsageConfiguration: DataSetUsageConfigurationProperty)

    /**
     * The usage configuration to apply to child datasets that reference this dataset as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetusageconfiguration)
     * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
     * reference this dataset as a source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e74504af1fbf07a0fcc56d906fa7a031042df28284b6663483e5b97999e74d86")
    public
        fun dataSetUsageConfiguration(dataSetUsageConfiguration: DataSetUsageConfigurationProperty.Builder.() -> Unit)

    /**
     * The parameters that are declared in a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetparameters)
     * @param datasetParameters The parameters that are declared in a dataset. 
     */
    public fun datasetParameters(datasetParameters: IResolvable)

    /**
     * The parameters that are declared in a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetparameters)
     * @param datasetParameters The parameters that are declared in a dataset. 
     */
    public fun datasetParameters(datasetParameters: List<Any>)

    /**
     * The parameters that are declared in a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetparameters)
     * @param datasetParameters The parameters that are declared in a dataset. 
     */
    public fun datasetParameters(vararg datasetParameters: Any)

    /**
     * The folder that contains fields and nested subfolders for your dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-fieldfolders)
     * @param fieldFolders The folder that contains fields and nested subfolders for your dataset. 
     */
    public fun fieldFolders(fieldFolders: IResolvable)

    /**
     * The folder that contains fields and nested subfolders for your dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-fieldfolders)
     * @param fieldFolders The folder that contains fields and nested subfolders for your dataset. 
     */
    public fun fieldFolders(fieldFolders: Map<String, Any>)

    /**
     * Indicates whether you want to import the data into SPICE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-importmode)
     * @param importMode Indicates whether you want to import the data into SPICE. 
     */
    public fun importMode(importMode: String)

    /**
     * The wait policy to use when creating or updating a Dataset.
     *
     * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-ingestionwaitpolicy)
     * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset. 
     */
    public fun ingestionWaitPolicy(ingestionWaitPolicy: IResolvable)

    /**
     * The wait policy to use when creating or updating a Dataset.
     *
     * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-ingestionwaitpolicy)
     * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset. 
     */
    public fun ingestionWaitPolicy(ingestionWaitPolicy: IngestionWaitPolicyProperty)

    /**
     * The wait policy to use when creating or updating a Dataset.
     *
     * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-ingestionwaitpolicy)
     * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e9a06411827148f45b4562d2103434b0311c0f9d115d15413b42353b07b0dc6")
    public
        fun ingestionWaitPolicy(ingestionWaitPolicy: IngestionWaitPolicyProperty.Builder.() -> Unit)

    /**
     * Configures the combination and transformation of the data from the physical tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-logicaltablemap)
     * @param logicalTableMap Configures the combination and transformation of the data from the
     * physical tables. 
     */
    public fun logicalTableMap(logicalTableMap: IResolvable)

    /**
     * Configures the combination and transformation of the data from the physical tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-logicaltablemap)
     * @param logicalTableMap Configures the combination and transformation of the data from the
     * physical tables. 
     */
    public fun logicalTableMap(logicalTableMap: Map<String, Any>)

    /**
     * The display name for the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-name)
     * @param name The display name for the dataset. 
     */
    public fun name(name: String)

    /**
     * A list of resource permissions on the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-permissions)
     * @param permissions A list of resource permissions on the dataset. 
     */
    public fun permissions(permissions: IResolvable)

    /**
     * A list of resource permissions on the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-permissions)
     * @param permissions A list of resource permissions on the dataset. 
     */
    public fun permissions(permissions: List<Any>)

    /**
     * A list of resource permissions on the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-permissions)
     * @param permissions A list of resource permissions on the dataset. 
     */
    public fun permissions(vararg permissions: Any)

    /**
     * Declares the physical tables that are available in the underlying data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-physicaltablemap)
     * @param physicalTableMap Declares the physical tables that are available in the underlying
     * data sources. 
     */
    public fun physicalTableMap(physicalTableMap: IResolvable)

    /**
     * Declares the physical tables that are available in the underlying data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-physicaltablemap)
     * @param physicalTableMap Declares the physical tables that are available in the underlying
     * data sources. 
     */
    public fun physicalTableMap(physicalTableMap: Map<String, Any>)

    /**
     * The row-level security configuration for the data that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset)
     * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
     * want to create. 
     */
    public fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: IResolvable)

    /**
     * The row-level security configuration for the data that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset)
     * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
     * want to create. 
     */
    public
        fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: RowLevelPermissionDataSetProperty)

    /**
     * The row-level security configuration for the data that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset)
     * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
     * want to create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72c8133ac76b705895da48093797a90a33b3f6b2239ca56e1b2b68b27d76ff3e")
    public
        fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: RowLevelPermissionDataSetProperty.Builder.() -> Unit)

    /**
     * The element you can use to define tags for row-level security.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiontagconfiguration)
     * @param rowLevelPermissionTagConfiguration The element you can use to define tags for
     * row-level security. 
     */
    public fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: IResolvable)

    /**
     * The element you can use to define tags for row-level security.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiontagconfiguration)
     * @param rowLevelPermissionTagConfiguration The element you can use to define tags for
     * row-level security. 
     */
    public
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: RowLevelPermissionTagConfigurationProperty)

    /**
     * The element you can use to define tags for row-level security.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiontagconfiguration)
     * @param rowLevelPermissionTagConfiguration The element you can use to define tags for
     * row-level security. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48530a6bc1ae355140ee3d734117ed4ce35265abec30be91ecdfa5082105a3c9")
    public
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: RowLevelPermissionTagConfigurationProperty.Builder.() -> Unit)

    /**
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-tags)
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the dataset. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-tags)
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the dataset. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnDataSet.Builder =
        software.amazon.awscdk.services.quicksight.CfnDataSet.Builder.create(scope, id)

    /**
     * The AWS account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-awsaccountid)
     * @param awsAccountId The AWS account ID. 
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * Groupings of columns that work together in certain Amazon QuickSight features.
     *
     * Currently, only geospatial hierarchy is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columngroups)
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
     * features. 
     */
    override fun columnGroups(columnGroups: IResolvable) {
      cdkBuilder.columnGroups(columnGroups.let(IResolvable::unwrap))
    }

    /**
     * Groupings of columns that work together in certain Amazon QuickSight features.
     *
     * Currently, only geospatial hierarchy is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columngroups)
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
     * features. 
     */
    override fun columnGroups(columnGroups: List<Any>) {
      cdkBuilder.columnGroups(columnGroups)
    }

    /**
     * Groupings of columns that work together in certain Amazon QuickSight features.
     *
     * Currently, only geospatial hierarchy is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columngroups)
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
     * features. 
     */
    override fun columnGroups(vararg columnGroups: Any): Unit = columnGroups(columnGroups.toList())

    /**
     * A set of one or more definitions of a `ColumnLevelPermissionRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columnlevelpermissionrules)
     * @param columnLevelPermissionRules A set of one or more definitions of a
     * `ColumnLevelPermissionRule` . 
     */
    override fun columnLevelPermissionRules(columnLevelPermissionRules: IResolvable) {
      cdkBuilder.columnLevelPermissionRules(columnLevelPermissionRules.let(IResolvable::unwrap))
    }

    /**
     * A set of one or more definitions of a `ColumnLevelPermissionRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columnlevelpermissionrules)
     * @param columnLevelPermissionRules A set of one or more definitions of a
     * `ColumnLevelPermissionRule` . 
     */
    override fun columnLevelPermissionRules(columnLevelPermissionRules: List<Any>) {
      cdkBuilder.columnLevelPermissionRules(columnLevelPermissionRules)
    }

    /**
     * A set of one or more definitions of a `ColumnLevelPermissionRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columnlevelpermissionrules)
     * @param columnLevelPermissionRules A set of one or more definitions of a
     * `ColumnLevelPermissionRule` . 
     */
    override fun columnLevelPermissionRules(vararg columnLevelPermissionRules: Any): Unit =
        columnLevelPermissionRules(columnLevelPermissionRules.toList())

    /**
     * An ID for the dataset that you want to create.
     *
     * This ID is unique per AWS Region for each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetid)
     * @param dataSetId An ID for the dataset that you want to create. 
     */
    override fun dataSetId(dataSetId: String) {
      cdkBuilder.dataSetId(dataSetId)
    }

    /**
     * The refresh properties of a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetrefreshproperties)
     * @param dataSetRefreshProperties The refresh properties of a dataset. 
     */
    override fun dataSetRefreshProperties(dataSetRefreshProperties: IResolvable) {
      cdkBuilder.dataSetRefreshProperties(dataSetRefreshProperties.let(IResolvable::unwrap))
    }

    /**
     * The refresh properties of a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetrefreshproperties)
     * @param dataSetRefreshProperties The refresh properties of a dataset. 
     */
    override
        fun dataSetRefreshProperties(dataSetRefreshProperties: DataSetRefreshPropertiesProperty) {
      cdkBuilder.dataSetRefreshProperties(dataSetRefreshProperties.let(DataSetRefreshPropertiesProperty::unwrap))
    }

    /**
     * The refresh properties of a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetrefreshproperties)
     * @param dataSetRefreshProperties The refresh properties of a dataset. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b11bbe24eafa6fe8be5693ba34a09f2b8c06e64b642fae3c4124b121a329b8e")
    override
        fun dataSetRefreshProperties(dataSetRefreshProperties: DataSetRefreshPropertiesProperty.Builder.() -> Unit):
        Unit = dataSetRefreshProperties(DataSetRefreshPropertiesProperty(dataSetRefreshProperties))

    /**
     * The usage configuration to apply to child datasets that reference this dataset as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetusageconfiguration)
     * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
     * reference this dataset as a source. 
     */
    override fun dataSetUsageConfiguration(dataSetUsageConfiguration: IResolvable) {
      cdkBuilder.dataSetUsageConfiguration(dataSetUsageConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The usage configuration to apply to child datasets that reference this dataset as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetusageconfiguration)
     * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
     * reference this dataset as a source. 
     */
    override
        fun dataSetUsageConfiguration(dataSetUsageConfiguration: DataSetUsageConfigurationProperty) {
      cdkBuilder.dataSetUsageConfiguration(dataSetUsageConfiguration.let(DataSetUsageConfigurationProperty::unwrap))
    }

    /**
     * The usage configuration to apply to child datasets that reference this dataset as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetusageconfiguration)
     * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
     * reference this dataset as a source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e74504af1fbf07a0fcc56d906fa7a031042df28284b6663483e5b97999e74d86")
    override
        fun dataSetUsageConfiguration(dataSetUsageConfiguration: DataSetUsageConfigurationProperty.Builder.() -> Unit):
        Unit =
        dataSetUsageConfiguration(DataSetUsageConfigurationProperty(dataSetUsageConfiguration))

    /**
     * The parameters that are declared in a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetparameters)
     * @param datasetParameters The parameters that are declared in a dataset. 
     */
    override fun datasetParameters(datasetParameters: IResolvable) {
      cdkBuilder.datasetParameters(datasetParameters.let(IResolvable::unwrap))
    }

    /**
     * The parameters that are declared in a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetparameters)
     * @param datasetParameters The parameters that are declared in a dataset. 
     */
    override fun datasetParameters(datasetParameters: List<Any>) {
      cdkBuilder.datasetParameters(datasetParameters)
    }

    /**
     * The parameters that are declared in a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetparameters)
     * @param datasetParameters The parameters that are declared in a dataset. 
     */
    override fun datasetParameters(vararg datasetParameters: Any): Unit =
        datasetParameters(datasetParameters.toList())

    /**
     * The folder that contains fields and nested subfolders for your dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-fieldfolders)
     * @param fieldFolders The folder that contains fields and nested subfolders for your dataset. 
     */
    override fun fieldFolders(fieldFolders: IResolvable) {
      cdkBuilder.fieldFolders(fieldFolders.let(IResolvable::unwrap))
    }

    /**
     * The folder that contains fields and nested subfolders for your dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-fieldfolders)
     * @param fieldFolders The folder that contains fields and nested subfolders for your dataset. 
     */
    override fun fieldFolders(fieldFolders: Map<String, Any>) {
      cdkBuilder.fieldFolders(fieldFolders)
    }

    /**
     * Indicates whether you want to import the data into SPICE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-importmode)
     * @param importMode Indicates whether you want to import the data into SPICE. 
     */
    override fun importMode(importMode: String) {
      cdkBuilder.importMode(importMode)
    }

    /**
     * The wait policy to use when creating or updating a Dataset.
     *
     * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-ingestionwaitpolicy)
     * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset. 
     */
    override fun ingestionWaitPolicy(ingestionWaitPolicy: IResolvable) {
      cdkBuilder.ingestionWaitPolicy(ingestionWaitPolicy.let(IResolvable::unwrap))
    }

    /**
     * The wait policy to use when creating or updating a Dataset.
     *
     * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-ingestionwaitpolicy)
     * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset. 
     */
    override fun ingestionWaitPolicy(ingestionWaitPolicy: IngestionWaitPolicyProperty) {
      cdkBuilder.ingestionWaitPolicy(ingestionWaitPolicy.let(IngestionWaitPolicyProperty::unwrap))
    }

    /**
     * The wait policy to use when creating or updating a Dataset.
     *
     * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-ingestionwaitpolicy)
     * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e9a06411827148f45b4562d2103434b0311c0f9d115d15413b42353b07b0dc6")
    override
        fun ingestionWaitPolicy(ingestionWaitPolicy: IngestionWaitPolicyProperty.Builder.() -> Unit):
        Unit = ingestionWaitPolicy(IngestionWaitPolicyProperty(ingestionWaitPolicy))

    /**
     * Configures the combination and transformation of the data from the physical tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-logicaltablemap)
     * @param logicalTableMap Configures the combination and transformation of the data from the
     * physical tables. 
     */
    override fun logicalTableMap(logicalTableMap: IResolvable) {
      cdkBuilder.logicalTableMap(logicalTableMap.let(IResolvable::unwrap))
    }

    /**
     * Configures the combination and transformation of the data from the physical tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-logicaltablemap)
     * @param logicalTableMap Configures the combination and transformation of the data from the
     * physical tables. 
     */
    override fun logicalTableMap(logicalTableMap: Map<String, Any>) {
      cdkBuilder.logicalTableMap(logicalTableMap)
    }

    /**
     * The display name for the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-name)
     * @param name The display name for the dataset. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of resource permissions on the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-permissions)
     * @param permissions A list of resource permissions on the dataset. 
     */
    override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable::unwrap))
    }

    /**
     * A list of resource permissions on the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-permissions)
     * @param permissions A list of resource permissions on the dataset. 
     */
    override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions)
    }

    /**
     * A list of resource permissions on the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-permissions)
     * @param permissions A list of resource permissions on the dataset. 
     */
    override fun permissions(vararg permissions: Any): Unit = permissions(permissions.toList())

    /**
     * Declares the physical tables that are available in the underlying data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-physicaltablemap)
     * @param physicalTableMap Declares the physical tables that are available in the underlying
     * data sources. 
     */
    override fun physicalTableMap(physicalTableMap: IResolvable) {
      cdkBuilder.physicalTableMap(physicalTableMap.let(IResolvable::unwrap))
    }

    /**
     * Declares the physical tables that are available in the underlying data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-physicaltablemap)
     * @param physicalTableMap Declares the physical tables that are available in the underlying
     * data sources. 
     */
    override fun physicalTableMap(physicalTableMap: Map<String, Any>) {
      cdkBuilder.physicalTableMap(physicalTableMap)
    }

    /**
     * The row-level security configuration for the data that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset)
     * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
     * want to create. 
     */
    override fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: IResolvable) {
      cdkBuilder.rowLevelPermissionDataSet(rowLevelPermissionDataSet.let(IResolvable::unwrap))
    }

    /**
     * The row-level security configuration for the data that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset)
     * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
     * want to create. 
     */
    override
        fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: RowLevelPermissionDataSetProperty) {
      cdkBuilder.rowLevelPermissionDataSet(rowLevelPermissionDataSet.let(RowLevelPermissionDataSetProperty::unwrap))
    }

    /**
     * The row-level security configuration for the data that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset)
     * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
     * want to create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72c8133ac76b705895da48093797a90a33b3f6b2239ca56e1b2b68b27d76ff3e")
    override
        fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: RowLevelPermissionDataSetProperty.Builder.() -> Unit):
        Unit =
        rowLevelPermissionDataSet(RowLevelPermissionDataSetProperty(rowLevelPermissionDataSet))

    /**
     * The element you can use to define tags for row-level security.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiontagconfiguration)
     * @param rowLevelPermissionTagConfiguration The element you can use to define tags for
     * row-level security. 
     */
    override
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: IResolvable) {
      cdkBuilder.rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The element you can use to define tags for row-level security.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiontagconfiguration)
     * @param rowLevelPermissionTagConfiguration The element you can use to define tags for
     * row-level security. 
     */
    override
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: RowLevelPermissionTagConfigurationProperty) {
      cdkBuilder.rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration.let(RowLevelPermissionTagConfigurationProperty::unwrap))
    }

    /**
     * The element you can use to define tags for row-level security.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiontagconfiguration)
     * @param rowLevelPermissionTagConfiguration The element you can use to define tags for
     * row-level security. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48530a6bc1ae355140ee3d734117ed4ce35265abec30be91ecdfa5082105a3c9")
    override
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: RowLevelPermissionTagConfigurationProperty.Builder.() -> Unit):
        Unit =
        rowLevelPermissionTagConfiguration(RowLevelPermissionTagConfigurationProperty(rowLevelPermissionTagConfiguration))

    /**
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-tags)
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the dataset. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-tags)
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the dataset. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.quicksight.CfnDataSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet): CfnDataSet
        = CfnDataSet(cdkObject)

    internal fun unwrap(wrapped: CfnDataSet): software.amazon.awscdk.services.quicksight.CfnDataSet
        = wrapped.cdkObject
  }

  /**
   * Groupings of columns that work together in certain Amazon QuickSight features.
   *
   * This is a variant type structure. For this structure to be valid, only one of the attributes
   * can be non-null.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * ColumnGroupProperty columnGroupProperty = ColumnGroupProperty.builder()
   * .geoSpatialColumnGroup(GeoSpatialColumnGroupProperty.builder()
   * .columns(List.of("columns"))
   * .name("name")
   * // the properties below are optional
   * .countryCode("countryCode")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columngroup.html)
   */
  public interface ColumnGroupProperty {
    /**
     * Geospatial column group that denotes a hierarchy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columngroup.html#cfn-quicksight-dataset-columngroup-geospatialcolumngroup)
     */
    public fun geoSpatialColumnGroup(): Any? = unwrap(this).getGeoSpatialColumnGroup()

    /**
     * A builder for [ColumnGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param geoSpatialColumnGroup Geospatial column group that denotes a hierarchy.
       */
      public fun geoSpatialColumnGroup(geoSpatialColumnGroup: IResolvable)

      /**
       * @param geoSpatialColumnGroup Geospatial column group that denotes a hierarchy.
       */
      public fun geoSpatialColumnGroup(geoSpatialColumnGroup: GeoSpatialColumnGroupProperty)

      /**
       * @param geoSpatialColumnGroup Geospatial column group that denotes a hierarchy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbd4d291cd40db33396c220c06606a0b2373f738c9d3bde0ed15d8ffb7f3df7f")
      public
          fun geoSpatialColumnGroup(geoSpatialColumnGroup: GeoSpatialColumnGroupProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnGroupProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnGroupProperty.builder()

      /**
       * @param geoSpatialColumnGroup Geospatial column group that denotes a hierarchy.
       */
      override fun geoSpatialColumnGroup(geoSpatialColumnGroup: IResolvable) {
        cdkBuilder.geoSpatialColumnGroup(geoSpatialColumnGroup.let(IResolvable::unwrap))
      }

      /**
       * @param geoSpatialColumnGroup Geospatial column group that denotes a hierarchy.
       */
      override fun geoSpatialColumnGroup(geoSpatialColumnGroup: GeoSpatialColumnGroupProperty) {
        cdkBuilder.geoSpatialColumnGroup(geoSpatialColumnGroup.let(GeoSpatialColumnGroupProperty::unwrap))
      }

      /**
       * @param geoSpatialColumnGroup Geospatial column group that denotes a hierarchy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbd4d291cd40db33396c220c06606a0b2373f738c9d3bde0ed15d8ffb7f3df7f")
      override
          fun geoSpatialColumnGroup(geoSpatialColumnGroup: GeoSpatialColumnGroupProperty.Builder.() -> Unit):
          Unit = geoSpatialColumnGroup(GeoSpatialColumnGroupProperty(geoSpatialColumnGroup))

      public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnGroupProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnGroupProperty,
    ) : CdkObject(cdkObject), ColumnGroupProperty {
      /**
       * Geospatial column group that denotes a hierarchy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columngroup.html#cfn-quicksight-dataset-columngroup-geospatialcolumngroup)
       */
      override fun geoSpatialColumnGroup(): Any? = unwrap(this).getGeoSpatialColumnGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnGroupProperty):
          ColumnGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnGroupProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnGroupProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnGroupProperty
    }
  }

  /**
   * Metadata for a column that is used as the input of a transform operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * InputColumnProperty inputColumnProperty = InputColumnProperty.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .subType("subType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-inputcolumn.html)
   */
  public interface InputColumnProperty {
    /**
     * The name of this column in the underlying data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-inputcolumn.html#cfn-quicksight-dataset-inputcolumn-name)
     */
    public fun name(): String

    /**
     * The sub data type of the column.
     *
     * Sub types are only available for decimal columns that are part of a SPICE dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-inputcolumn.html#cfn-quicksight-dataset-inputcolumn-subtype)
     */
    public fun subType(): String? = unwrap(this).getSubType()

    /**
     * The data type of the column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-inputcolumn.html#cfn-quicksight-dataset-inputcolumn-type)
     */
    public fun type(): String

    /**
     * A builder for [InputColumnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of this column in the underlying data source. 
       */
      public fun name(name: String)

      /**
       * @param subType The sub data type of the column.
       * Sub types are only available for decimal columns that are part of a SPICE dataset.
       */
      public fun subType(subType: String)

      /**
       * @param type The data type of the column. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty.builder()

      /**
       * @param name The name of this column in the underlying data source. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param subType The sub data type of the column.
       * Sub types are only available for decimal columns that are part of a SPICE dataset.
       */
      override fun subType(subType: String) {
        cdkBuilder.subType(subType)
      }

      /**
       * @param type The data type of the column. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty,
    ) : CdkObject(cdkObject), InputColumnProperty {
      /**
       * The name of this column in the underlying data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-inputcolumn.html#cfn-quicksight-dataset-inputcolumn-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The sub data type of the column.
       *
       * Sub types are only available for decimal columns that are part of a SPICE dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-inputcolumn.html#cfn-quicksight-dataset-inputcolumn-subtype)
       */
      override fun subType(): String? = unwrap(this).getSubType()

      /**
       * The data type of the column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-inputcolumn.html#cfn-quicksight-dataset-inputcolumn-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty):
          InputColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputColumnProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty
    }
  }

  /**
   * Metadata that contains a description for a column.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * ColumnDescriptionProperty columnDescriptionProperty = ColumnDescriptionProperty.builder()
   * .text("text")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columndescription.html)
   */
  public interface ColumnDescriptionProperty {
    /**
     * The text of a description for a column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columndescription.html#cfn-quicksight-dataset-columndescription-text)
     */
    public fun text(): String? = unwrap(this).getText()

    /**
     * A builder for [ColumnDescriptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param text The text of a description for a column.
       */
      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty.builder()

      /**
       * @param text The text of a description for a column.
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty,
    ) : CdkObject(cdkObject), ColumnDescriptionProperty {
      /**
       * The text of a description for a column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columndescription.html#cfn-quicksight-dataset-columndescription-text)
       */
      override fun text(): String? = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnDescriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty):
          ColumnDescriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnDescriptionProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnDescriptionProperty
    }
  }

  /**
   * A calculated column for a dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * CalculatedColumnProperty calculatedColumnProperty = CalculatedColumnProperty.builder()
   * .columnId("columnId")
   * .columnName("columnName")
   * .expression("expression")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-calculatedcolumn.html)
   */
  public interface CalculatedColumnProperty {
    /**
     * A unique ID to identify a calculated column.
     *
     * During a dataset update, if the column ID of a calculated column matches that of an existing
     * calculated column, Amazon QuickSight preserves the existing calculated column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-calculatedcolumn.html#cfn-quicksight-dataset-calculatedcolumn-columnid)
     */
    public fun columnId(): String

    /**
     * Column name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-calculatedcolumn.html#cfn-quicksight-dataset-calculatedcolumn-columnname)
     */
    public fun columnName(): String

    /**
     * An expression that defines the calculated column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-calculatedcolumn.html#cfn-quicksight-dataset-calculatedcolumn-expression)
     */
    public fun expression(): String

    /**
     * A builder for [CalculatedColumnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columnId A unique ID to identify a calculated column. 
       * During a dataset update, if the column ID of a calculated column matches that of an
       * existing calculated column, Amazon QuickSight preserves the existing calculated column.
       */
      public fun columnId(columnId: String)

      /**
       * @param columnName Column name. 
       */
      public fun columnName(columnName: String)

      /**
       * @param expression An expression that defines the calculated column. 
       */
      public fun expression(expression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty.builder()

      /**
       * @param columnId A unique ID to identify a calculated column. 
       * During a dataset update, if the column ID of a calculated column matches that of an
       * existing calculated column, Amazon QuickSight preserves the existing calculated column.
       */
      override fun columnId(columnId: String) {
        cdkBuilder.columnId(columnId)
      }

      /**
       * @param columnName Column name. 
       */
      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      /**
       * @param expression An expression that defines the calculated column. 
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty,
    ) : CdkObject(cdkObject), CalculatedColumnProperty {
      /**
       * A unique ID to identify a calculated column.
       *
       * During a dataset update, if the column ID of a calculated column matches that of an
       * existing calculated column, Amazon QuickSight preserves the existing calculated column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-calculatedcolumn.html#cfn-quicksight-dataset-calculatedcolumn-columnid)
       */
      override fun columnId(): String = unwrap(this).getColumnId()

      /**
       * Column name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-calculatedcolumn.html#cfn-quicksight-dataset-calculatedcolumn-columnname)
       */
      override fun columnName(): String = unwrap(this).getColumnName()

      /**
       * An expression that defines the calculated column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-calculatedcolumn.html#cfn-quicksight-dataset-calculatedcolumn-expression)
       */
      override fun expression(): String = unwrap(this).getExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CalculatedColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty):
          CalculatedColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CalculatedColumnProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.CalculatedColumnProperty
    }
  }

  /**
   * A physical table type for an S3 data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * S3SourceProperty s3SourceProperty = S3SourceProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-s3source.html)
   */
  public interface S3SourceProperty {
    /**
     * The Amazon Resource Name (ARN) for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-s3source.html#cfn-quicksight-dataset-s3source-datasourcearn)
     */
    public fun dataSourceArn(): String

    /**
     * A physical table type for an S3 data source.
     *
     *
     * For files that aren't JSON, only `STRING` data types are supported in input columns.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-s3source.html#cfn-quicksight-dataset-s3source-inputcolumns)
     */
    public fun inputColumns(): Any

    /**
     * Information about the format for the S3 source file or files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-s3source.html#cfn-quicksight-dataset-s3source-uploadsettings)
     */
    public fun uploadSettings(): Any? = unwrap(this).getUploadSettings()

    /**
     * A builder for [S3SourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataSourceArn The Amazon Resource Name (ARN) for the data source. 
       */
      public fun dataSourceArn(dataSourceArn: String)

      /**
       * @param inputColumns A physical table type for an S3 data source. 
       *
       * For files that aren't JSON, only `STRING` data types are supported in input columns.
       */
      public fun inputColumns(inputColumns: IResolvable)

      /**
       * @param inputColumns A physical table type for an S3 data source. 
       *
       * For files that aren't JSON, only `STRING` data types are supported in input columns.
       */
      public fun inputColumns(inputColumns: List<Any>)

      /**
       * @param inputColumns A physical table type for an S3 data source. 
       *
       * For files that aren't JSON, only `STRING` data types are supported in input columns.
       */
      public fun inputColumns(vararg inputColumns: Any)

      /**
       * @param uploadSettings Information about the format for the S3 source file or files.
       */
      public fun uploadSettings(uploadSettings: IResolvable)

      /**
       * @param uploadSettings Information about the format for the S3 source file or files.
       */
      public fun uploadSettings(uploadSettings: UploadSettingsProperty)

      /**
       * @param uploadSettings Information about the format for the S3 source file or files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e1c99ab7c68549c21ceb18a313feb7b90a976e2a3bccae8689a7e49a2a353a4")
      public fun uploadSettings(uploadSettings: UploadSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty.builder()

      /**
       * @param dataSourceArn The Amazon Resource Name (ARN) for the data source. 
       */
      override fun dataSourceArn(dataSourceArn: String) {
        cdkBuilder.dataSourceArn(dataSourceArn)
      }

      /**
       * @param inputColumns A physical table type for an S3 data source. 
       *
       * For files that aren't JSON, only `STRING` data types are supported in input columns.
       */
      override fun inputColumns(inputColumns: IResolvable) {
        cdkBuilder.inputColumns(inputColumns.let(IResolvable::unwrap))
      }

      /**
       * @param inputColumns A physical table type for an S3 data source. 
       *
       * For files that aren't JSON, only `STRING` data types are supported in input columns.
       */
      override fun inputColumns(inputColumns: List<Any>) {
        cdkBuilder.inputColumns(inputColumns)
      }

      /**
       * @param inputColumns A physical table type for an S3 data source. 
       *
       * For files that aren't JSON, only `STRING` data types are supported in input columns.
       */
      override fun inputColumns(vararg inputColumns: Any): Unit =
          inputColumns(inputColumns.toList())

      /**
       * @param uploadSettings Information about the format for the S3 source file or files.
       */
      override fun uploadSettings(uploadSettings: IResolvable) {
        cdkBuilder.uploadSettings(uploadSettings.let(IResolvable::unwrap))
      }

      /**
       * @param uploadSettings Information about the format for the S3 source file or files.
       */
      override fun uploadSettings(uploadSettings: UploadSettingsProperty) {
        cdkBuilder.uploadSettings(uploadSettings.let(UploadSettingsProperty::unwrap))
      }

      /**
       * @param uploadSettings Information about the format for the S3 source file or files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e1c99ab7c68549c21ceb18a313feb7b90a976e2a3bccae8689a7e49a2a353a4")
      override fun uploadSettings(uploadSettings: UploadSettingsProperty.Builder.() -> Unit): Unit =
          uploadSettings(UploadSettingsProperty(uploadSettings))

      public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty,
    ) : CdkObject(cdkObject), S3SourceProperty {
      /**
       * The Amazon Resource Name (ARN) for the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-s3source.html#cfn-quicksight-dataset-s3source-datasourcearn)
       */
      override fun dataSourceArn(): String = unwrap(this).getDataSourceArn()

      /**
       * A physical table type for an S3 data source.
       *
       *
       * For files that aren't JSON, only `STRING` data types are supported in input columns.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-s3source.html#cfn-quicksight-dataset-s3source-inputcolumns)
       */
      override fun inputColumns(): Any = unwrap(this).getInputColumns()

      /**
       * Information about the format for the S3 source file or files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-s3source.html#cfn-quicksight-dataset-s3source-uploadsettings)
       */
      override fun uploadSettings(): Any? = unwrap(this).getUploadSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty):
          S3SourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3SourceProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty
    }
  }

  /**
   * Permission for the resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * ResourcePermissionProperty resourcePermissionProperty = ResourcePermissionProperty.builder()
   * .actions(List.of("actions"))
   * .principal("principal")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-resourcepermission.html)
   */
  public interface ResourcePermissionProperty {
    /**
     * The IAM action to grant or revoke permisions on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-resourcepermission.html#cfn-quicksight-dataset-resourcepermission-actions)
     */
    public fun actions(): List<String>

    /**
     * The Amazon Resource Name (ARN) of the principal. This can be one of the following:.
     *
     * * The ARN of an Amazon QuickSight user or group associated with a data source or dataset.
     * (This is common.)
     * * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
     * dashboard, template, or theme. (This is common.)
     * * The ARN of an AWS account root: This is an IAM ARN rather than a Amazon QuickSight ARN. Use
     * this option only to share resources (templates) across AWS accounts . (This is less common.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-resourcepermission.html#cfn-quicksight-dataset-resourcepermission-principal)
     */
    public fun principal(): String

    /**
     * A builder for [ResourcePermissionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions The IAM action to grant or revoke permisions on. 
       */
      public fun actions(actions: List<String>)

      /**
       * @param actions The IAM action to grant or revoke permisions on. 
       */
      public fun actions(vararg actions: String)

      /**
       * @param principal The Amazon Resource Name (ARN) of the principal. This can be one of the
       * following:. 
       * * The ARN of an Amazon QuickSight user or group associated with a data source or dataset.
       * (This is common.)
       * * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
       * dashboard, template, or theme. (This is common.)
       * * The ARN of an AWS account root: This is an IAM ARN rather than a Amazon QuickSight ARN.
       * Use this option only to share resources (templates) across AWS accounts . (This is less
       * common.)
       */
      public fun principal(principal: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ResourcePermissionProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.ResourcePermissionProperty.builder()

      /**
       * @param actions The IAM action to grant or revoke permisions on. 
       */
      override fun actions(actions: List<String>) {
        cdkBuilder.actions(actions)
      }

      /**
       * @param actions The IAM action to grant or revoke permisions on. 
       */
      override fun actions(vararg actions: String): Unit = actions(actions.toList())

      /**
       * @param principal The Amazon Resource Name (ARN) of the principal. This can be one of the
       * following:. 
       * * The ARN of an Amazon QuickSight user or group associated with a data source or dataset.
       * (This is common.)
       * * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
       * dashboard, template, or theme. (This is common.)
       * * The ARN of an AWS account root: This is an IAM ARN rather than a Amazon QuickSight ARN.
       * Use this option only to share resources (templates) across AWS accounts . (This is less
       * common.)
       */
      override fun principal(principal: String) {
        cdkBuilder.principal(principal)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.ResourcePermissionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ResourcePermissionProperty,
    ) : CdkObject(cdkObject), ResourcePermissionProperty {
      /**
       * The IAM action to grant or revoke permisions on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-resourcepermission.html#cfn-quicksight-dataset-resourcepermission-actions)
       */
      override fun actions(): List<String> = unwrap(this).getActions()

      /**
       * The Amazon Resource Name (ARN) of the principal. This can be one of the following:.
       *
       * * The ARN of an Amazon QuickSight user or group associated with a data source or dataset.
       * (This is common.)
       * * The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis,
       * dashboard, template, or theme. (This is common.)
       * * The ARN of an AWS account root: This is an IAM ARN rather than a Amazon QuickSight ARN.
       * Use this option only to share resources (templates) across AWS accounts . (This is less
       * common.)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-resourcepermission.html#cfn-quicksight-dataset-resourcepermission-principal)
       */
      override fun principal(): String = unwrap(this).getPrincipal()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourcePermissionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.ResourcePermissionProperty):
          ResourcePermissionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourcePermissionProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.ResourcePermissionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.ResourcePermissionProperty
    }
  }

  /**
   * A tag for a column in a
   * `[TagColumnOperation](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_TagColumnOperation.html)`
   * structure. This is a variant type structure. For this structure to be valid, only one of the
   * attributes can be non-null.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * ColumnTagProperty columnTagProperty = ColumnTagProperty.builder()
   * .columnDescription(ColumnDescriptionProperty.builder()
   * .text("text")
   * .build())
   * .columnGeographicRole("columnGeographicRole")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columntag.html)
   */
  public interface ColumnTagProperty {
    /**
     * A description for a column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columntag.html#cfn-quicksight-dataset-columntag-columndescription)
     */
    public fun columnDescription(): Any? = unwrap(this).getColumnDescription()

    /**
     * A geospatial role for a column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columntag.html#cfn-quicksight-dataset-columntag-columngeographicrole)
     */
    public fun columnGeographicRole(): String? = unwrap(this).getColumnGeographicRole()

    /**
     * A builder for [ColumnTagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columnDescription A description for a column.
       */
      public fun columnDescription(columnDescription: IResolvable)

      /**
       * @param columnDescription A description for a column.
       */
      public fun columnDescription(columnDescription: ColumnDescriptionProperty)

      /**
       * @param columnDescription A description for a column.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03e5e3ca560aa97d41df505842459bdeaf0cd70b1d1271d530ee23614738cf74")
      public fun columnDescription(columnDescription: ColumnDescriptionProperty.Builder.() -> Unit)

      /**
       * @param columnGeographicRole A geospatial role for a column.
       */
      public fun columnGeographicRole(columnGeographicRole: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty.builder()

      /**
       * @param columnDescription A description for a column.
       */
      override fun columnDescription(columnDescription: IResolvable) {
        cdkBuilder.columnDescription(columnDescription.let(IResolvable::unwrap))
      }

      /**
       * @param columnDescription A description for a column.
       */
      override fun columnDescription(columnDescription: ColumnDescriptionProperty) {
        cdkBuilder.columnDescription(columnDescription.let(ColumnDescriptionProperty::unwrap))
      }

      /**
       * @param columnDescription A description for a column.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03e5e3ca560aa97d41df505842459bdeaf0cd70b1d1271d530ee23614738cf74")
      override
          fun columnDescription(columnDescription: ColumnDescriptionProperty.Builder.() -> Unit):
          Unit = columnDescription(ColumnDescriptionProperty(columnDescription))

      /**
       * @param columnGeographicRole A geospatial role for a column.
       */
      override fun columnGeographicRole(columnGeographicRole: String) {
        cdkBuilder.columnGeographicRole(columnGeographicRole)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty,
    ) : CdkObject(cdkObject), ColumnTagProperty {
      /**
       * A description for a column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columntag.html#cfn-quicksight-dataset-columntag-columndescription)
       */
      override fun columnDescription(): Any? = unwrap(this).getColumnDescription()

      /**
       * A geospatial role for a column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columntag.html#cfn-quicksight-dataset-columntag-columngeographicrole)
       */
      override fun columnGeographicRole(): String? = unwrap(this).getColumnGeographicRole()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty):
          ColumnTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnTagProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnTagProperty
    }
  }

  /**
   * List of default values defined for a given string date time parameter type.
   *
   * Currently only static values are supported.</p>
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * DateTimeDatasetParameterDefaultValuesProperty dateTimeDatasetParameterDefaultValuesProperty =
   * DateTimeDatasetParameterDefaultValuesProperty.builder()
   * .staticValues(List.of("staticValues"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datetimedatasetparameterdefaultvalues.html)
   */
  public interface DateTimeDatasetParameterDefaultValuesProperty {
    /**
     * A list of static default values for a given date time parameter.
     *
     * The valid format for this property is `yyyy-MM-dd’T’HH:mm:ss’Z’` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datetimedatasetparameterdefaultvalues.html#cfn-quicksight-dataset-datetimedatasetparameterdefaultvalues-staticvalues)
     */
    public fun staticValues(): List<String> = unwrap(this).getStaticValues() ?: emptyList()

    /**
     * A builder for [DateTimeDatasetParameterDefaultValuesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param staticValues A list of static default values for a given date time parameter.
       * The valid format for this property is `yyyy-MM-dd’T’HH:mm:ss’Z’` .
       */
      public fun staticValues(staticValues: List<String>)

      /**
       * @param staticValues A list of static default values for a given date time parameter.
       * The valid format for this property is `yyyy-MM-dd’T’HH:mm:ss’Z’` .
       */
      public fun staticValues(vararg staticValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty.builder()

      /**
       * @param staticValues A list of static default values for a given date time parameter.
       * The valid format for this property is `yyyy-MM-dd’T’HH:mm:ss’Z’` .
       */
      override fun staticValues(staticValues: List<String>) {
        cdkBuilder.staticValues(staticValues)
      }

      /**
       * @param staticValues A list of static default values for a given date time parameter.
       * The valid format for this property is `yyyy-MM-dd’T’HH:mm:ss’Z’` .
       */
      override fun staticValues(vararg staticValues: String): Unit =
          staticValues(staticValues.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty,
    ) : CdkObject(cdkObject), DateTimeDatasetParameterDefaultValuesProperty {
      /**
       * A list of static default values for a given date time parameter.
       *
       * The valid format for this property is `yyyy-MM-dd’T’HH:mm:ss’Z’` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datetimedatasetparameterdefaultvalues.html#cfn-quicksight-dataset-datetimedatasetparameterdefaultvalues-staticvalues)
       */
      override fun staticValues(): List<String> = unwrap(this).getStaticValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DateTimeDatasetParameterDefaultValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty):
          DateTimeDatasetParameterDefaultValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DateTimeDatasetParameterDefaultValuesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty
    }
  }

  /**
   * A set of rules associated with a tag.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * RowLevelPermissionTagRuleProperty rowLevelPermissionTagRuleProperty =
   * RowLevelPermissionTagRuleProperty.builder()
   * .columnName("columnName")
   * .tagKey("tagKey")
   * // the properties below are optional
   * .matchAllValue("matchAllValue")
   * .tagMultiValueDelimiter("tagMultiValueDelimiter")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagrule.html)
   */
  public interface RowLevelPermissionTagRuleProperty {
    /**
     * The column name that a tag key is assigned to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagrule.html#cfn-quicksight-dataset-rowlevelpermissiontagrule-columnname)
     */
    public fun columnName(): String

    /**
     * A string that you want to use to filter by all the values in a column in the dataset and
     * don’t want to list the values one by one.
     *
     * For example, you can use an asterisk as your match all value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagrule.html#cfn-quicksight-dataset-rowlevelpermissiontagrule-matchallvalue)
     */
    public fun matchAllValue(): String? = unwrap(this).getMatchAllValue()

    /**
     * The unique key for a tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagrule.html#cfn-quicksight-dataset-rowlevelpermissiontagrule-tagkey)
     */
    public fun tagKey(): String

    /**
     * A string that you want to use to delimit the values when you pass the values at run time.
     *
     * For example, you can delimit the values with a comma.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagrule.html#cfn-quicksight-dataset-rowlevelpermissiontagrule-tagmultivaluedelimiter)
     */
    public fun tagMultiValueDelimiter(): String? = unwrap(this).getTagMultiValueDelimiter()

    /**
     * A builder for [RowLevelPermissionTagRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columnName The column name that a tag key is assigned to. 
       */
      public fun columnName(columnName: String)

      /**
       * @param matchAllValue A string that you want to use to filter by all the values in a column
       * in the dataset and don’t want to list the values one by one.
       * For example, you can use an asterisk as your match all value.
       */
      public fun matchAllValue(matchAllValue: String)

      /**
       * @param tagKey The unique key for a tag. 
       */
      public fun tagKey(tagKey: String)

      /**
       * @param tagMultiValueDelimiter A string that you want to use to delimit the values when you
       * pass the values at run time.
       * For example, you can delimit the values with a comma.
       */
      public fun tagMultiValueDelimiter(tagMultiValueDelimiter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagRuleProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagRuleProperty.builder()

      /**
       * @param columnName The column name that a tag key is assigned to. 
       */
      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      /**
       * @param matchAllValue A string that you want to use to filter by all the values in a column
       * in the dataset and don’t want to list the values one by one.
       * For example, you can use an asterisk as your match all value.
       */
      override fun matchAllValue(matchAllValue: String) {
        cdkBuilder.matchAllValue(matchAllValue)
      }

      /**
       * @param tagKey The unique key for a tag. 
       */
      override fun tagKey(tagKey: String) {
        cdkBuilder.tagKey(tagKey)
      }

      /**
       * @param tagMultiValueDelimiter A string that you want to use to delimit the values when you
       * pass the values at run time.
       * For example, you can delimit the values with a comma.
       */
      override fun tagMultiValueDelimiter(tagMultiValueDelimiter: String) {
        cdkBuilder.tagMultiValueDelimiter(tagMultiValueDelimiter)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagRuleProperty,
    ) : CdkObject(cdkObject), RowLevelPermissionTagRuleProperty {
      /**
       * The column name that a tag key is assigned to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagrule.html#cfn-quicksight-dataset-rowlevelpermissiontagrule-columnname)
       */
      override fun columnName(): String = unwrap(this).getColumnName()

      /**
       * A string that you want to use to filter by all the values in a column in the dataset and
       * don’t want to list the values one by one.
       *
       * For example, you can use an asterisk as your match all value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagrule.html#cfn-quicksight-dataset-rowlevelpermissiontagrule-matchallvalue)
       */
      override fun matchAllValue(): String? = unwrap(this).getMatchAllValue()

      /**
       * The unique key for a tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagrule.html#cfn-quicksight-dataset-rowlevelpermissiontagrule-tagkey)
       */
      override fun tagKey(): String = unwrap(this).getTagKey()

      /**
       * A string that you want to use to delimit the values when you pass the values at run time.
       *
       * For example, you can delimit the values with a comma.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagrule.html#cfn-quicksight-dataset-rowlevelpermissiontagrule-tagmultivaluedelimiter)
       */
      override fun tagMultiValueDelimiter(): String? = unwrap(this).getTagMultiValueDelimiter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RowLevelPermissionTagRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagRuleProperty):
          RowLevelPermissionTagRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RowLevelPermissionTagRuleProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagRuleProperty
    }
  }

  /**
   * A data transformation on a logical table.
   *
   * This is a variant type structure. For this structure to be valid, only one of the attributes
   * can be non-null.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TransformOperationProperty transformOperationProperty = TransformOperationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-transformoperation.html)
   */
  public interface TransformOperationProperty {
    /**
     * A transform operation that casts a column to a different type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-transformoperation.html#cfn-quicksight-dataset-transformoperation-castcolumntypeoperation)
     */
    public fun castColumnTypeOperation(): Any? = unwrap(this).getCastColumnTypeOperation()

    /**
     * An operation that creates calculated columns.
     *
     * Columns created in one such operation form a lexical closure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-transformoperation.html#cfn-quicksight-dataset-transformoperation-createcolumnsoperation)
     */
    public fun createColumnsOperation(): Any? = unwrap(this).getCreateColumnsOperation()

    /**
     * An operation that filters rows based on some condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-transformoperation.html#cfn-quicksight-dataset-transformoperation-filteroperation)
     */
    public fun filterOperation(): Any? = unwrap(this).getFilterOperation()

    /**
     * A transform operation that overrides the dataset parameter values defined in another
     * dataset.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-transformoperation.html#cfn-quicksight-dataset-transformoperation-overridedatasetparameteroperation)
     */
    public fun overrideDatasetParameterOperation(): Any? =
        unwrap(this).getOverrideDatasetParameterOperation()

    /**
     * An operation that projects columns.
     *
     * Operations that come after a projection can only refer to projected columns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-transformoperation.html#cfn-quicksight-dataset-transformoperation-projectoperation)
     */
    public fun projectOperation(): Any? = unwrap(this).getProjectOperation()

    /**
     * An operation that renames a column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-transformoperation.html#cfn-quicksight-dataset-transformoperation-renamecolumnoperation)
     */
    public fun renameColumnOperation(): Any? = unwrap(this).getRenameColumnOperation()

    /**
     * An operation that tags a column with additional information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-transformoperation.html#cfn-quicksight-dataset-transformoperation-tagcolumnoperation)
     */
    public fun tagColumnOperation(): Any? = unwrap(this).getTagColumnOperation()

    /**
     * A builder for [TransformOperationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param castColumnTypeOperation A transform operation that casts a column to a different
       * type.
       */
      public fun castColumnTypeOperation(castColumnTypeOperation: IResolvable)

      /**
       * @param castColumnTypeOperation A transform operation that casts a column to a different
       * type.
       */
      public fun castColumnTypeOperation(castColumnTypeOperation: CastColumnTypeOperationProperty)

      /**
       * @param castColumnTypeOperation A transform operation that casts a column to a different
       * type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eed6192ccc81b9d1e2ba7188ab20a8c6942e3e540378d23c73ed5b418ae69dbc")
      public
          fun castColumnTypeOperation(castColumnTypeOperation: CastColumnTypeOperationProperty.Builder.() -> Unit)

      /**
       * @param createColumnsOperation An operation that creates calculated columns.
       * Columns created in one such operation form a lexical closure.
       */
      public fun createColumnsOperation(createColumnsOperation: IResolvable)

      /**
       * @param createColumnsOperation An operation that creates calculated columns.
       * Columns created in one such operation form a lexical closure.
       */
      public fun createColumnsOperation(createColumnsOperation: CreateColumnsOperationProperty)

      /**
       * @param createColumnsOperation An operation that creates calculated columns.
       * Columns created in one such operation form a lexical closure.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a1a600f06409b22e09c297d51a1d8063fe444a2cc35df8faa6d7612c921f25c")
      public
          fun createColumnsOperation(createColumnsOperation: CreateColumnsOperationProperty.Builder.() -> Unit)

      /**
       * @param filterOperation An operation that filters rows based on some condition.
       */
      public fun filterOperation(filterOperation: IResolvable)

      /**
       * @param filterOperation An operation that filters rows based on some condition.
       */
      public fun filterOperation(filterOperation: FilterOperationProperty)

      /**
       * @param filterOperation An operation that filters rows based on some condition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f4e4a130657fd54b048123fc35c452cc79ad12e12a6ee6133f286e6845f1598")
      public fun filterOperation(filterOperation: FilterOperationProperty.Builder.() -> Unit)

      /**
       * @param overrideDatasetParameterOperation A transform operation that overrides the dataset
       * parameter values defined in another dataset.</p>.
       */
      public fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: IResolvable)

      /**
       * @param overrideDatasetParameterOperation A transform operation that overrides the dataset
       * parameter values defined in another dataset.</p>.
       */
      public
          fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: OverrideDatasetParameterOperationProperty)

      /**
       * @param overrideDatasetParameterOperation A transform operation that overrides the dataset
       * parameter values defined in another dataset.</p>.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21ab89056d9e1abb0f8cde30f2a70da44800cc1d476ede018f934876ae0ddc99")
      public
          fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: OverrideDatasetParameterOperationProperty.Builder.() -> Unit)

      /**
       * @param projectOperation An operation that projects columns.
       * Operations that come after a projection can only refer to projected columns.
       */
      public fun projectOperation(projectOperation: IResolvable)

      /**
       * @param projectOperation An operation that projects columns.
       * Operations that come after a projection can only refer to projected columns.
       */
      public fun projectOperation(projectOperation: ProjectOperationProperty)

      /**
       * @param projectOperation An operation that projects columns.
       * Operations that come after a projection can only refer to projected columns.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("800bbecc32a653d442f5adaa61f1c4fb785664a0c403c790fcd16c02c32774f1")
      public fun projectOperation(projectOperation: ProjectOperationProperty.Builder.() -> Unit)

      /**
       * @param renameColumnOperation An operation that renames a column.
       */
      public fun renameColumnOperation(renameColumnOperation: IResolvable)

      /**
       * @param renameColumnOperation An operation that renames a column.
       */
      public fun renameColumnOperation(renameColumnOperation: RenameColumnOperationProperty)

      /**
       * @param renameColumnOperation An operation that renames a column.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e66963c9f5e77057bb144e2af341dcebdb67d6c055efb95d3db93b8eb933988")
      public
          fun renameColumnOperation(renameColumnOperation: RenameColumnOperationProperty.Builder.() -> Unit)

      /**
       * @param tagColumnOperation An operation that tags a column with additional information.
       */
      public fun tagColumnOperation(tagColumnOperation: IResolvable)

      /**
       * @param tagColumnOperation An operation that tags a column with additional information.
       */
      public fun tagColumnOperation(tagColumnOperation: TagColumnOperationProperty)

      /**
       * @param tagColumnOperation An operation that tags a column with additional information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ffa3a41a8ce0be3fc3ac48146287259f6da2c6108486e8e158862d9beeae356e")
      public
          fun tagColumnOperation(tagColumnOperation: TagColumnOperationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.TransformOperationProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.TransformOperationProperty.builder()

      /**
       * @param castColumnTypeOperation A transform operation that casts a column to a different
       * type.
       */
      override fun castColumnTypeOperation(castColumnTypeOperation: IResolvable) {
        cdkBuilder.castColumnTypeOperation(castColumnTypeOperation.let(IResolvable::unwrap))
      }

      /**
       * @param castColumnTypeOperation A transform operation that casts a column to a different
       * type.
       */
      override
          fun castColumnTypeOperation(castColumnTypeOperation: CastColumnTypeOperationProperty) {
        cdkBuilder.castColumnTypeOperation(castColumnTypeOperation.let(CastColumnTypeOperationProperty::unwrap))
      }

      /**
       * @param castColumnTypeOperation A transform operation that casts a column to a different
       * type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eed6192ccc81b9d1e2ba7188ab20a8c6942e3e540378d23c73ed5b418ae69dbc")
      override
          fun castColumnTypeOperation(castColumnTypeOperation: CastColumnTypeOperationProperty.Builder.() -> Unit):
          Unit = castColumnTypeOperation(CastColumnTypeOperationProperty(castColumnTypeOperation))

      /**
       * @param createColumnsOperation An operation that creates calculated columns.
       * Columns created in one such operation form a lexical closure.
       */
      override fun createColumnsOperation(createColumnsOperation: IResolvable) {
        cdkBuilder.createColumnsOperation(createColumnsOperation.let(IResolvable::unwrap))
      }

      /**
       * @param createColumnsOperation An operation that creates calculated columns.
       * Columns created in one such operation form a lexical closure.
       */
      override fun createColumnsOperation(createColumnsOperation: CreateColumnsOperationProperty) {
        cdkBuilder.createColumnsOperation(createColumnsOperation.let(CreateColumnsOperationProperty::unwrap))
      }

      /**
       * @param createColumnsOperation An operation that creates calculated columns.
       * Columns created in one such operation form a lexical closure.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a1a600f06409b22e09c297d51a1d8063fe444a2cc35df8faa6d7612c921f25c")
      override
          fun createColumnsOperation(createColumnsOperation: CreateColumnsOperationProperty.Builder.() -> Unit):
          Unit = createColumnsOperation(CreateColumnsOperationProperty(createColumnsOperation))

      /**
       * @param filterOperation An operation that filters rows based on some condition.
       */
      override fun filterOperation(filterOperation: IResolvable) {
        cdkBuilder.filterOperation(filterOperation.let(IResolvable::unwrap))
      }

      /**
       * @param filterOperation An operation that filters rows based on some condition.
       */
      override fun filterOperation(filterOperation: FilterOperationProperty) {
        cdkBuilder.filterOperation(filterOperation.let(FilterOperationProperty::unwrap))
      }

      /**
       * @param filterOperation An operation that filters rows based on some condition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f4e4a130657fd54b048123fc35c452cc79ad12e12a6ee6133f286e6845f1598")
      override fun filterOperation(filterOperation: FilterOperationProperty.Builder.() -> Unit):
          Unit = filterOperation(FilterOperationProperty(filterOperation))

      /**
       * @param overrideDatasetParameterOperation A transform operation that overrides the dataset
       * parameter values defined in another dataset.</p>.
       */
      override
          fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: IResolvable) {
        cdkBuilder.overrideDatasetParameterOperation(overrideDatasetParameterOperation.let(IResolvable::unwrap))
      }

      /**
       * @param overrideDatasetParameterOperation A transform operation that overrides the dataset
       * parameter values defined in another dataset.</p>.
       */
      override
          fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: OverrideDatasetParameterOperationProperty) {
        cdkBuilder.overrideDatasetParameterOperation(overrideDatasetParameterOperation.let(OverrideDatasetParameterOperationProperty::unwrap))
      }

      /**
       * @param overrideDatasetParameterOperation A transform operation that overrides the dataset
       * parameter values defined in another dataset.</p>.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21ab89056d9e1abb0f8cde30f2a70da44800cc1d476ede018f934876ae0ddc99")
      override
          fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: OverrideDatasetParameterOperationProperty.Builder.() -> Unit):
          Unit =
          overrideDatasetParameterOperation(OverrideDatasetParameterOperationProperty(overrideDatasetParameterOperation))

      /**
       * @param projectOperation An operation that projects columns.
       * Operations that come after a projection can only refer to projected columns.
       */
      override fun projectOperation(projectOperation: IResolvable) {
        cdkBuilder.projectOperation(projectOperation.let(IResolvable::unwrap))
      }

      /**
       * @param projectOperation An operation that projects columns.
       * Operations that come after a projection can only refer to projected columns.
       */
      override fun projectOperation(projectOperation: ProjectOperationProperty) {
        cdkBuilder.projectOperation(projectOperation.let(ProjectOperationProperty::unwrap))
      }

      /**
       * @param projectOperation An operation that projects columns.
       * Operations that come after a projection can only refer to projected columns.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("800bbecc32a653d442f5adaa61f1c4fb785664a0c403c790fcd16c02c32774f1")
      override fun projectOperation(projectOperation: ProjectOperationProperty.Builder.() -> Unit):
          Unit = projectOperation(ProjectOperationProperty(projectOperation))

      /**
       * @param renameColumnOperation An operation that renames a column.
       */
      override fun renameColumnOperation(renameColumnOperation: IResolvable) {
        cdkBuilder.renameColumnOperation(renameColumnOperation.let(IResolvable::unwrap))
      }

      /**
       * @param renameColumnOperation An operation that renames a column.
       */
      override fun renameColumnOperation(renameColumnOperation: RenameColumnOperationProperty) {
        cdkBuilder.renameColumnOperation(renameColumnOperation.let(RenameColumnOperationProperty::unwrap))
      }

      /**
       * @param renameColumnOperation An operation that renames a column.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e66963c9f5e77057bb144e2af341dcebdb67d6c055efb95d3db93b8eb933988")
      override
          fun renameColumnOperation(renameColumnOperation: RenameColumnOperationProperty.Builder.() -> Unit):
          Unit = renameColumnOperation(RenameColumnOperationProperty(renameColumnOperation))

      /**
       * @param tagColumnOperation An operation that tags a column with additional information.
       */
      override fun tagColumnOperation(tagColumnOperation: IResolvable) {
        cdkBuilder.tagColumnOperation(tagColumnOperation.let(IResolvable::unwrap))
      }

      /**
       * @param tagColumnOperation An operation that tags a column with additional information.
       */
      override fun tagColumnOperation(tagColumnOperation: TagColumnOperationProperty) {
        cdkBuilder.tagColumnOperation(tagColumnOperation.let(TagColumnOperationProperty::unwrap))
      }

      /**
       * @param tagColumnOperation An operation that tags a column with additional information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ffa3a41a8ce0be3fc3ac48146287259f6da2c6108486e8e158862d9beeae356e")
      override
          fun tagColumnOperation(tagColumnOperation: TagColumnOperationProperty.Builder.() -> Unit):
          Unit = tagColumnOperation(TagColumnOperationProperty(tagColumnOperation))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.TransformOperationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.TransformOperationProperty,
    ) : CdkObject(cdkObject), TransformOperationProperty {
      /**
       * A transform operation that casts a column to a different type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-transformoperation.html#cfn-quicksight-dataset-transformoperation-castcolumntypeoperation)
       */
      override fun castColumnTypeOperation(): Any? = unwrap(this).getCastColumnTypeOperation()

      /**
       * An operation that creates calculated columns.
       *
       * Columns created in one such operation form a lexical closure.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-transformoperation.html#cfn-quicksight-dataset-transformoperation-createcolumnsoperation)
       */
      override fun createColumnsOperation(): Any? = unwrap(this).getCreateColumnsOperation()

      /**
       * An operation that filters rows based on some condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-transformoperation.html#cfn-quicksight-dataset-transformoperation-filteroperation)
       */
      override fun filterOperation(): Any? = unwrap(this).getFilterOperation()

      /**
       * A transform operation that overrides the dataset parameter values defined in another
       * dataset.</p>.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-transformoperation.html#cfn-quicksight-dataset-transformoperation-overridedatasetparameteroperation)
       */
      override fun overrideDatasetParameterOperation(): Any? =
          unwrap(this).getOverrideDatasetParameterOperation()

      /**
       * An operation that projects columns.
       *
       * Operations that come after a projection can only refer to projected columns.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-transformoperation.html#cfn-quicksight-dataset-transformoperation-projectoperation)
       */
      override fun projectOperation(): Any? = unwrap(this).getProjectOperation()

      /**
       * An operation that renames a column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-transformoperation.html#cfn-quicksight-dataset-transformoperation-renamecolumnoperation)
       */
      override fun renameColumnOperation(): Any? = unwrap(this).getRenameColumnOperation()

      /**
       * An operation that tags a column with additional information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-transformoperation.html#cfn-quicksight-dataset-transformoperation-tagcolumnoperation)
       */
      override fun tagColumnOperation(): Any? = unwrap(this).getTagColumnOperation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TransformOperationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.TransformOperationProperty):
          TransformOperationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformOperationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.TransformOperationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.TransformOperationProperty
    }
  }

  /**
   * A transform operation that filters rows based on a condition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * FilterOperationProperty filterOperationProperty = FilterOperationProperty.builder()
   * .conditionExpression("conditionExpression")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-filteroperation.html)
   */
  public interface FilterOperationProperty {
    /**
     * An expression that must evaluate to a Boolean value.
     *
     * Rows for which the expression evaluates to true are kept in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-filteroperation.html#cfn-quicksight-dataset-filteroperation-conditionexpression)
     */
    public fun conditionExpression(): String

    /**
     * A builder for [FilterOperationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditionExpression An expression that must evaluate to a Boolean value. 
       * Rows for which the expression evaluates to true are kept in the dataset.
       */
      public fun conditionExpression(conditionExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty.builder()

      /**
       * @param conditionExpression An expression that must evaluate to a Boolean value. 
       * Rows for which the expression evaluates to true are kept in the dataset.
       */
      override fun conditionExpression(conditionExpression: String) {
        cdkBuilder.conditionExpression(conditionExpression)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty,
    ) : CdkObject(cdkObject), FilterOperationProperty {
      /**
       * An expression that must evaluate to a Boolean value.
       *
       * Rows for which the expression evaluates to true are kept in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-filteroperation.html#cfn-quicksight-dataset-filteroperation-conditionexpression)
       */
      override fun conditionExpression(): String = unwrap(this).getConditionExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterOperationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty):
          FilterOperationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterOperationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.FilterOperationProperty
    }
  }

  /**
   * Properties associated with the columns participating in a join.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * JoinKeyPropertiesProperty joinKeyPropertiesProperty = JoinKeyPropertiesProperty.builder()
   * .uniqueKey(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joinkeyproperties.html)
   */
  public interface JoinKeyPropertiesProperty {
    /**
     * A value that indicates that a row in a table is uniquely identified by the columns in a join
     * key.
     *
     * This is used by Amazon QuickSight to optimize query performance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joinkeyproperties.html#cfn-quicksight-dataset-joinkeyproperties-uniquekey)
     */
    public fun uniqueKey(): Any? = unwrap(this).getUniqueKey()

    /**
     * A builder for [JoinKeyPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param uniqueKey A value that indicates that a row in a table is uniquely identified by the
       * columns in a join key.
       * This is used by Amazon QuickSight to optimize query performance.
       */
      public fun uniqueKey(uniqueKey: Boolean)

      /**
       * @param uniqueKey A value that indicates that a row in a table is uniquely identified by the
       * columns in a join key.
       * This is used by Amazon QuickSight to optimize query performance.
       */
      public fun uniqueKey(uniqueKey: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty.builder()

      /**
       * @param uniqueKey A value that indicates that a row in a table is uniquely identified by the
       * columns in a join key.
       * This is used by Amazon QuickSight to optimize query performance.
       */
      override fun uniqueKey(uniqueKey: Boolean) {
        cdkBuilder.uniqueKey(uniqueKey)
      }

      /**
       * @param uniqueKey A value that indicates that a row in a table is uniquely identified by the
       * columns in a join key.
       * This is used by Amazon QuickSight to optimize query performance.
       */
      override fun uniqueKey(uniqueKey: IResolvable) {
        cdkBuilder.uniqueKey(uniqueKey.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty,
    ) : CdkObject(cdkObject), JoinKeyPropertiesProperty {
      /**
       * A value that indicates that a row in a table is uniquely identified by the columns in a
       * join key.
       *
       * This is used by Amazon QuickSight to optimize query performance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joinkeyproperties.html#cfn-quicksight-dataset-joinkeyproperties-uniquekey)
       */
      override fun uniqueKey(): Any? = unwrap(this).getUniqueKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JoinKeyPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty):
          JoinKeyPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JoinKeyPropertiesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty
    }
  }

  /**
   * A decimal parameter that is created in the dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * DecimalDatasetParameterProperty decimalDatasetParameterProperty =
   * DecimalDatasetParameterProperty.builder()
   * .id("id")
   * .name("name")
   * .valueType("valueType")
   * // the properties below are optional
   * .defaultValues(DecimalDatasetParameterDefaultValuesProperty.builder()
   * .staticValues(List.of(123))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-decimaldatasetparameter.html)
   */
  public interface DecimalDatasetParameterProperty {
    /**
     * A list of default values for a given decimal parameter.
     *
     * This structure only accepts static values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-decimaldatasetparameter.html#cfn-quicksight-dataset-decimaldatasetparameter-defaultvalues)
     */
    public fun defaultValues(): Any? = unwrap(this).getDefaultValues()

    /**
     * An identifier for the decimal parameter created in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-decimaldatasetparameter.html#cfn-quicksight-dataset-decimaldatasetparameter-id)
     */
    public fun id(): String

    /**
     * The name of the decimal parameter that is created in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-decimaldatasetparameter.html#cfn-quicksight-dataset-decimaldatasetparameter-name)
     */
    public fun name(): String

    /**
     * The value type of the dataset parameter.
     *
     * Valid values are `single value` or `multi value` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-decimaldatasetparameter.html#cfn-quicksight-dataset-decimaldatasetparameter-valuetype)
     */
    public fun valueType(): String

    /**
     * A builder for [DecimalDatasetParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultValues A list of default values for a given decimal parameter.
       * This structure only accepts static values.
       */
      public fun defaultValues(defaultValues: IResolvable)

      /**
       * @param defaultValues A list of default values for a given decimal parameter.
       * This structure only accepts static values.
       */
      public fun defaultValues(defaultValues: DecimalDatasetParameterDefaultValuesProperty)

      /**
       * @param defaultValues A list of default values for a given decimal parameter.
       * This structure only accepts static values.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4d4ff0f93eb81d978ccb9a0fffb48162c91f0195f969e7d66d43669aff10713")
      public
          fun defaultValues(defaultValues: DecimalDatasetParameterDefaultValuesProperty.Builder.() -> Unit)

      /**
       * @param id An identifier for the decimal parameter created in the dataset. 
       */
      public fun id(id: String)

      /**
       * @param name The name of the decimal parameter that is created in the dataset. 
       */
      public fun name(name: String)

      /**
       * @param valueType The value type of the dataset parameter. 
       * Valid values are `single value` or `multi value` .
       */
      public fun valueType(valueType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterProperty.builder()

      /**
       * @param defaultValues A list of default values for a given decimal parameter.
       * This structure only accepts static values.
       */
      override fun defaultValues(defaultValues: IResolvable) {
        cdkBuilder.defaultValues(defaultValues.let(IResolvable::unwrap))
      }

      /**
       * @param defaultValues A list of default values for a given decimal parameter.
       * This structure only accepts static values.
       */
      override fun defaultValues(defaultValues: DecimalDatasetParameterDefaultValuesProperty) {
        cdkBuilder.defaultValues(defaultValues.let(DecimalDatasetParameterDefaultValuesProperty::unwrap))
      }

      /**
       * @param defaultValues A list of default values for a given decimal parameter.
       * This structure only accepts static values.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4d4ff0f93eb81d978ccb9a0fffb48162c91f0195f969e7d66d43669aff10713")
      override
          fun defaultValues(defaultValues: DecimalDatasetParameterDefaultValuesProperty.Builder.() -> Unit):
          Unit = defaultValues(DecimalDatasetParameterDefaultValuesProperty(defaultValues))

      /**
       * @param id An identifier for the decimal parameter created in the dataset. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param name The name of the decimal parameter that is created in the dataset. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param valueType The value type of the dataset parameter. 
       * Valid values are `single value` or `multi value` .
       */
      override fun valueType(valueType: String) {
        cdkBuilder.valueType(valueType)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterProperty,
    ) : CdkObject(cdkObject), DecimalDatasetParameterProperty {
      /**
       * A list of default values for a given decimal parameter.
       *
       * This structure only accepts static values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-decimaldatasetparameter.html#cfn-quicksight-dataset-decimaldatasetparameter-defaultvalues)
       */
      override fun defaultValues(): Any? = unwrap(this).getDefaultValues()

      /**
       * An identifier for the decimal parameter created in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-decimaldatasetparameter.html#cfn-quicksight-dataset-decimaldatasetparameter-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The name of the decimal parameter that is created in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-decimaldatasetparameter.html#cfn-quicksight-dataset-decimaldatasetparameter-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The value type of the dataset parameter.
       *
       * Valid values are `single value` or `multi value` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-decimaldatasetparameter.html#cfn-quicksight-dataset-decimaldatasetparameter-valuetype)
       */
      override fun valueType(): String = unwrap(this).getValueType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DecimalDatasetParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterProperty):
          DecimalDatasetParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DecimalDatasetParameterProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterProperty
    }
  }

  /**
   * Geospatial column group that denotes a hierarchy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * GeoSpatialColumnGroupProperty geoSpatialColumnGroupProperty =
   * GeoSpatialColumnGroupProperty.builder()
   * .columns(List.of("columns"))
   * .name("name")
   * // the properties below are optional
   * .countryCode("countryCode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-geospatialcolumngroup.html)
   */
  public interface GeoSpatialColumnGroupProperty {
    /**
     * Columns in this hierarchy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-geospatialcolumngroup.html#cfn-quicksight-dataset-geospatialcolumngroup-columns)
     */
    public fun columns(): List<String>

    /**
     * Country code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-geospatialcolumngroup.html#cfn-quicksight-dataset-geospatialcolumngroup-countrycode)
     */
    public fun countryCode(): String? = unwrap(this).getCountryCode()

    /**
     * A display name for the hierarchy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-geospatialcolumngroup.html#cfn-quicksight-dataset-geospatialcolumngroup-name)
     */
    public fun name(): String

    /**
     * A builder for [GeoSpatialColumnGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columns Columns in this hierarchy. 
       */
      public fun columns(columns: List<String>)

      /**
       * @param columns Columns in this hierarchy. 
       */
      public fun columns(vararg columns: String)

      /**
       * @param countryCode Country code.
       */
      public fun countryCode(countryCode: String)

      /**
       * @param name A display name for the hierarchy. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty.builder()

      /**
       * @param columns Columns in this hierarchy. 
       */
      override fun columns(columns: List<String>) {
        cdkBuilder.columns(columns)
      }

      /**
       * @param columns Columns in this hierarchy. 
       */
      override fun columns(vararg columns: String): Unit = columns(columns.toList())

      /**
       * @param countryCode Country code.
       */
      override fun countryCode(countryCode: String) {
        cdkBuilder.countryCode(countryCode)
      }

      /**
       * @param name A display name for the hierarchy. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty,
    ) : CdkObject(cdkObject), GeoSpatialColumnGroupProperty {
      /**
       * Columns in this hierarchy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-geospatialcolumngroup.html#cfn-quicksight-dataset-geospatialcolumngroup-columns)
       */
      override fun columns(): List<String> = unwrap(this).getColumns()

      /**
       * Country code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-geospatialcolumngroup.html#cfn-quicksight-dataset-geospatialcolumngroup-countrycode)
       */
      override fun countryCode(): String? = unwrap(this).getCountryCode()

      /**
       * A display name for the hierarchy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-geospatialcolumngroup.html#cfn-quicksight-dataset-geospatialcolumngroup-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GeoSpatialColumnGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty):
          GeoSpatialColumnGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeoSpatialColumnGroupProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty
    }
  }

  /**
   * A transform operation that overrides the dataset parameter values that are defined in another
   * dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * OverrideDatasetParameterOperationProperty overrideDatasetParameterOperationProperty =
   * OverrideDatasetParameterOperationProperty.builder()
   * .parameterName("parameterName")
   * // the properties below are optional
   * .newDefaultValues(NewDefaultValuesProperty.builder()
   * .dateTimeStaticValues(List.of("dateTimeStaticValues"))
   * .decimalStaticValues(List.of(123))
   * .integerStaticValues(List.of(123))
   * .stringStaticValues(List.of("stringStaticValues"))
   * .build())
   * .newParameterName("newParameterName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-overridedatasetparameteroperation.html)
   */
  public interface OverrideDatasetParameterOperationProperty {
    /**
     * The new default values for the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-overridedatasetparameteroperation.html#cfn-quicksight-dataset-overridedatasetparameteroperation-newdefaultvalues)
     */
    public fun newDefaultValues(): Any? = unwrap(this).getNewDefaultValues()

    /**
     * The new name for the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-overridedatasetparameteroperation.html#cfn-quicksight-dataset-overridedatasetparameteroperation-newparametername)
     */
    public fun newParameterName(): String? = unwrap(this).getNewParameterName()

    /**
     * The name of the parameter to be overridden with different values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-overridedatasetparameteroperation.html#cfn-quicksight-dataset-overridedatasetparameteroperation-parametername)
     */
    public fun parameterName(): String

    /**
     * A builder for [OverrideDatasetParameterOperationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param newDefaultValues The new default values for the parameter.
       */
      public fun newDefaultValues(newDefaultValues: IResolvable)

      /**
       * @param newDefaultValues The new default values for the parameter.
       */
      public fun newDefaultValues(newDefaultValues: NewDefaultValuesProperty)

      /**
       * @param newDefaultValues The new default values for the parameter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ef0f6263592a20f89b8c5dd1b0789a6f47f1a6ccbfd7db5534de3efc9541d2b6")
      public fun newDefaultValues(newDefaultValues: NewDefaultValuesProperty.Builder.() -> Unit)

      /**
       * @param newParameterName The new name for the parameter.
       */
      public fun newParameterName(newParameterName: String)

      /**
       * @param parameterName The name of the parameter to be overridden with different values. 
       */
      public fun parameterName(parameterName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.OverrideDatasetParameterOperationProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.OverrideDatasetParameterOperationProperty.builder()

      /**
       * @param newDefaultValues The new default values for the parameter.
       */
      override fun newDefaultValues(newDefaultValues: IResolvable) {
        cdkBuilder.newDefaultValues(newDefaultValues.let(IResolvable::unwrap))
      }

      /**
       * @param newDefaultValues The new default values for the parameter.
       */
      override fun newDefaultValues(newDefaultValues: NewDefaultValuesProperty) {
        cdkBuilder.newDefaultValues(newDefaultValues.let(NewDefaultValuesProperty::unwrap))
      }

      /**
       * @param newDefaultValues The new default values for the parameter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ef0f6263592a20f89b8c5dd1b0789a6f47f1a6ccbfd7db5534de3efc9541d2b6")
      override fun newDefaultValues(newDefaultValues: NewDefaultValuesProperty.Builder.() -> Unit):
          Unit = newDefaultValues(NewDefaultValuesProperty(newDefaultValues))

      /**
       * @param newParameterName The new name for the parameter.
       */
      override fun newParameterName(newParameterName: String) {
        cdkBuilder.newParameterName(newParameterName)
      }

      /**
       * @param parameterName The name of the parameter to be overridden with different values. 
       */
      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.OverrideDatasetParameterOperationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.OverrideDatasetParameterOperationProperty,
    ) : CdkObject(cdkObject), OverrideDatasetParameterOperationProperty {
      /**
       * The new default values for the parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-overridedatasetparameteroperation.html#cfn-quicksight-dataset-overridedatasetparameteroperation-newdefaultvalues)
       */
      override fun newDefaultValues(): Any? = unwrap(this).getNewDefaultValues()

      /**
       * The new name for the parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-overridedatasetparameteroperation.html#cfn-quicksight-dataset-overridedatasetparameteroperation-newparametername)
       */
      override fun newParameterName(): String? = unwrap(this).getNewParameterName()

      /**
       * The name of the parameter to be overridden with different values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-overridedatasetparameteroperation.html#cfn-quicksight-dataset-overridedatasetparameteroperation-parametername)
       */
      override fun parameterName(): String = unwrap(this).getParameterName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OverrideDatasetParameterOperationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.OverrideDatasetParameterOperationProperty):
          OverrideDatasetParameterOperationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OverrideDatasetParameterOperationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.OverrideDatasetParameterOperationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.OverrideDatasetParameterOperationProperty
    }
  }

  /**
   * Information about a dataset that contains permissions for row-level security (RLS).
   *
   * The permissions dataset maps fields to users or groups. For more information, see [Using
   * Row-Level Security (RLS) to Restrict Access to a
   * Dataset](https://docs.aws.amazon.com/quicksight/latest/user/restrict-access-to-a-data-set-using-row-level-security.html)
   * in the *Amazon QuickSight User Guide* .
   *
   * The option to deny permissions by setting `PermissionPolicy` to `DENY_ACCESS` is not supported
   * for new RLS datasets.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * RowLevelPermissionDataSetProperty rowLevelPermissionDataSetProperty =
   * RowLevelPermissionDataSetProperty.builder()
   * .arn("arn")
   * .permissionPolicy("permissionPolicy")
   * // the properties below are optional
   * .formatVersion("formatVersion")
   * .namespace("namespace")
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiondataset.html)
   */
  public interface RowLevelPermissionDataSetProperty {
    /**
     * The Amazon Resource Name (ARN) of the dataset that contains permissions for RLS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiondataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset-arn)
     */
    public fun arn(): String

    /**
     * The user or group rules associated with the dataset that contains permissions for RLS.
     *
     * By default, `FormatVersion` is `VERSION_1` . When `FormatVersion` is `VERSION_1` , `UserName`
     * and `GroupName` are required. When `FormatVersion` is `VERSION_2` , `UserARN` and `GroupARN` are
     * required, and `Namespace` must not exist.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiondataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset-formatversion)
     */
    public fun formatVersion(): String? = unwrap(this).getFormatVersion()

    /**
     * The namespace associated with the dataset that contains permissions for RLS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiondataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset-namespace)
     */
    public fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * The type of permissions to use when interpreting the permissions for RLS.
     *
     * `DENY_ACCESS` is included for backward compatibility only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiondataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset-permissionpolicy)
     */
    public fun permissionPolicy(): String

    /**
     * The status of the row-level security permission dataset.
     *
     * If enabled, the status is `ENABLED` . If disabled, the status is `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiondataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * A builder for [RowLevelPermissionDataSetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Amazon Resource Name (ARN) of the dataset that contains permissions for RLS.
       * 
       */
      public fun arn(arn: String)

      /**
       * @param formatVersion The user or group rules associated with the dataset that contains
       * permissions for RLS.
       * By default, `FormatVersion` is `VERSION_1` . When `FormatVersion` is `VERSION_1` ,
       * `UserName` and `GroupName` are required. When `FormatVersion` is `VERSION_2` , `UserARN` and
       * `GroupARN` are required, and `Namespace` must not exist.
       */
      public fun formatVersion(formatVersion: String)

      /**
       * @param namespace The namespace associated with the dataset that contains permissions for
       * RLS.
       */
      public fun namespace(namespace: String)

      /**
       * @param permissionPolicy The type of permissions to use when interpreting the permissions
       * for RLS. 
       * `DENY_ACCESS` is included for backward compatibility only.
       */
      public fun permissionPolicy(permissionPolicy: String)

      /**
       * @param status The status of the row-level security permission dataset.
       * If enabled, the status is `ENABLED` . If disabled, the status is `DISABLED` .
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty.builder()

      /**
       * @param arn The Amazon Resource Name (ARN) of the dataset that contains permissions for RLS.
       * 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param formatVersion The user or group rules associated with the dataset that contains
       * permissions for RLS.
       * By default, `FormatVersion` is `VERSION_1` . When `FormatVersion` is `VERSION_1` ,
       * `UserName` and `GroupName` are required. When `FormatVersion` is `VERSION_2` , `UserARN` and
       * `GroupARN` are required, and `Namespace` must not exist.
       */
      override fun formatVersion(formatVersion: String) {
        cdkBuilder.formatVersion(formatVersion)
      }

      /**
       * @param namespace The namespace associated with the dataset that contains permissions for
       * RLS.
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      /**
       * @param permissionPolicy The type of permissions to use when interpreting the permissions
       * for RLS. 
       * `DENY_ACCESS` is included for backward compatibility only.
       */
      override fun permissionPolicy(permissionPolicy: String) {
        cdkBuilder.permissionPolicy(permissionPolicy)
      }

      /**
       * @param status The status of the row-level security permission dataset.
       * If enabled, the status is `ENABLED` . If disabled, the status is `DISABLED` .
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty,
    ) : CdkObject(cdkObject), RowLevelPermissionDataSetProperty {
      /**
       * The Amazon Resource Name (ARN) of the dataset that contains permissions for RLS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiondataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset-arn)
       */
      override fun arn(): String = unwrap(this).getArn()

      /**
       * The user or group rules associated with the dataset that contains permissions for RLS.
       *
       * By default, `FormatVersion` is `VERSION_1` . When `FormatVersion` is `VERSION_1` ,
       * `UserName` and `GroupName` are required. When `FormatVersion` is `VERSION_2` , `UserARN` and
       * `GroupARN` are required, and `Namespace` must not exist.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiondataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset-formatversion)
       */
      override fun formatVersion(): String? = unwrap(this).getFormatVersion()

      /**
       * The namespace associated with the dataset that contains permissions for RLS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiondataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset-namespace)
       */
      override fun namespace(): String? = unwrap(this).getNamespace()

      /**
       * The type of permissions to use when interpreting the permissions for RLS.
       *
       * `DENY_ACCESS` is included for backward compatibility only.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiondataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset-permissionpolicy)
       */
      override fun permissionPolicy(): String = unwrap(this).getPermissionPolicy()

      /**
       * The status of the row-level security permission dataset.
       *
       * If enabled, the status is `ENABLED` . If disabled, the status is `DISABLED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiondataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset-status)
       */
      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RowLevelPermissionDataSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty):
          RowLevelPermissionDataSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RowLevelPermissionDataSetProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionDataSetProperty
    }
  }

  /**
   * A physical table type for relational data sources.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * RelationalTableProperty relationalTableProperty = RelationalTableProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-relationaltable.html)
   */
  public interface RelationalTableProperty {
    /**
     * The catalog associated with a table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-relationaltable.html#cfn-quicksight-dataset-relationaltable-catalog)
     */
    public fun catalog(): String? = unwrap(this).getCatalog()

    /**
     * The Amazon Resource Name (ARN) for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-relationaltable.html#cfn-quicksight-dataset-relationaltable-datasourcearn)
     */
    public fun dataSourceArn(): String

    /**
     * The column schema of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-relationaltable.html#cfn-quicksight-dataset-relationaltable-inputcolumns)
     */
    public fun inputColumns(): Any

    /**
     * The name of the relational table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-relationaltable.html#cfn-quicksight-dataset-relationaltable-name)
     */
    public fun name(): String

    /**
     * The schema name.
     *
     * This name applies to certain relational database engines.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-relationaltable.html#cfn-quicksight-dataset-relationaltable-schema)
     */
    public fun schema(): String? = unwrap(this).getSchema()

    /**
     * A builder for [RelationalTableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalog The catalog associated with a table.
       */
      public fun catalog(catalog: String)

      /**
       * @param dataSourceArn The Amazon Resource Name (ARN) for the data source. 
       */
      public fun dataSourceArn(dataSourceArn: String)

      /**
       * @param inputColumns The column schema of the table. 
       */
      public fun inputColumns(inputColumns: IResolvable)

      /**
       * @param inputColumns The column schema of the table. 
       */
      public fun inputColumns(inputColumns: List<Any>)

      /**
       * @param inputColumns The column schema of the table. 
       */
      public fun inputColumns(vararg inputColumns: Any)

      /**
       * @param name The name of the relational table. 
       */
      public fun name(name: String)

      /**
       * @param schema The schema name.
       * This name applies to certain relational database engines.
       */
      public fun schema(schema: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty.builder()

      /**
       * @param catalog The catalog associated with a table.
       */
      override fun catalog(catalog: String) {
        cdkBuilder.catalog(catalog)
      }

      /**
       * @param dataSourceArn The Amazon Resource Name (ARN) for the data source. 
       */
      override fun dataSourceArn(dataSourceArn: String) {
        cdkBuilder.dataSourceArn(dataSourceArn)
      }

      /**
       * @param inputColumns The column schema of the table. 
       */
      override fun inputColumns(inputColumns: IResolvable) {
        cdkBuilder.inputColumns(inputColumns.let(IResolvable::unwrap))
      }

      /**
       * @param inputColumns The column schema of the table. 
       */
      override fun inputColumns(inputColumns: List<Any>) {
        cdkBuilder.inputColumns(inputColumns)
      }

      /**
       * @param inputColumns The column schema of the table. 
       */
      override fun inputColumns(vararg inputColumns: Any): Unit =
          inputColumns(inputColumns.toList())

      /**
       * @param name The name of the relational table. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param schema The schema name.
       * This name applies to certain relational database engines.
       */
      override fun schema(schema: String) {
        cdkBuilder.schema(schema)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty,
    ) : CdkObject(cdkObject), RelationalTableProperty {
      /**
       * The catalog associated with a table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-relationaltable.html#cfn-quicksight-dataset-relationaltable-catalog)
       */
      override fun catalog(): String? = unwrap(this).getCatalog()

      /**
       * The Amazon Resource Name (ARN) for the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-relationaltable.html#cfn-quicksight-dataset-relationaltable-datasourcearn)
       */
      override fun dataSourceArn(): String = unwrap(this).getDataSourceArn()

      /**
       * The column schema of the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-relationaltable.html#cfn-quicksight-dataset-relationaltable-inputcolumns)
       */
      override fun inputColumns(): Any = unwrap(this).getInputColumns()

      /**
       * The name of the relational table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-relationaltable.html#cfn-quicksight-dataset-relationaltable-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The schema name.
       *
       * This name applies to certain relational database engines.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-relationaltable.html#cfn-quicksight-dataset-relationaltable-schema)
       */
      override fun schema(): String? = unwrap(this).getSchema()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RelationalTableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty):
          RelationalTableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelationalTableProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty
    }
  }

  /**
   * A *logical table* is a unit that joins and that data transformations operate on.
   *
   * A logical table has a source, which can be either a physical table or result of a join. When a
   * logical table points to a physical table, the logical table acts as a mutable copy of that
   * physical table through transform operations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * LogicalTableProperty logicalTableProperty = LogicalTableProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-logicaltable.html)
   */
  public interface LogicalTableProperty {
    /**
     * A display name for the logical table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-logicaltable.html#cfn-quicksight-dataset-logicaltable-alias)
     */
    public fun alias(): String

    /**
     * Transform operations that act on this logical table.
     *
     * For this structure to be valid, only one of the attributes can be non-null.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-logicaltable.html#cfn-quicksight-dataset-logicaltable-datatransforms)
     */
    public fun dataTransforms(): Any? = unwrap(this).getDataTransforms()

    /**
     * Source of this logical table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-logicaltable.html#cfn-quicksight-dataset-logicaltable-source)
     */
    public fun source(): Any

    /**
     * A builder for [LogicalTableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alias A display name for the logical table. 
       */
      public fun alias(alias: String)

      /**
       * @param dataTransforms Transform operations that act on this logical table.
       * For this structure to be valid, only one of the attributes can be non-null.
       */
      public fun dataTransforms(dataTransforms: IResolvable)

      /**
       * @param dataTransforms Transform operations that act on this logical table.
       * For this structure to be valid, only one of the attributes can be non-null.
       */
      public fun dataTransforms(dataTransforms: List<Any>)

      /**
       * @param dataTransforms Transform operations that act on this logical table.
       * For this structure to be valid, only one of the attributes can be non-null.
       */
      public fun dataTransforms(vararg dataTransforms: Any)

      /**
       * @param source Source of this logical table. 
       */
      public fun source(source: IResolvable)

      /**
       * @param source Source of this logical table. 
       */
      public fun source(source: LogicalTableSourceProperty)

      /**
       * @param source Source of this logical table. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("985accfe8cb3d471c9f271f0ee7ccda2339d6feefba9b5a08cfc81a779ae5f57")
      public fun source(source: LogicalTableSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty.builder()

      /**
       * @param alias A display name for the logical table. 
       */
      override fun alias(alias: String) {
        cdkBuilder.alias(alias)
      }

      /**
       * @param dataTransforms Transform operations that act on this logical table.
       * For this structure to be valid, only one of the attributes can be non-null.
       */
      override fun dataTransforms(dataTransforms: IResolvable) {
        cdkBuilder.dataTransforms(dataTransforms.let(IResolvable::unwrap))
      }

      /**
       * @param dataTransforms Transform operations that act on this logical table.
       * For this structure to be valid, only one of the attributes can be non-null.
       */
      override fun dataTransforms(dataTransforms: List<Any>) {
        cdkBuilder.dataTransforms(dataTransforms)
      }

      /**
       * @param dataTransforms Transform operations that act on this logical table.
       * For this structure to be valid, only one of the attributes can be non-null.
       */
      override fun dataTransforms(vararg dataTransforms: Any): Unit =
          dataTransforms(dataTransforms.toList())

      /**
       * @param source Source of this logical table. 
       */
      override fun source(source: IResolvable) {
        cdkBuilder.source(source.let(IResolvable::unwrap))
      }

      /**
       * @param source Source of this logical table. 
       */
      override fun source(source: LogicalTableSourceProperty) {
        cdkBuilder.source(source.let(LogicalTableSourceProperty::unwrap))
      }

      /**
       * @param source Source of this logical table. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("985accfe8cb3d471c9f271f0ee7ccda2339d6feefba9b5a08cfc81a779ae5f57")
      override fun source(source: LogicalTableSourceProperty.Builder.() -> Unit): Unit =
          source(LogicalTableSourceProperty(source))

      public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty,
    ) : CdkObject(cdkObject), LogicalTableProperty {
      /**
       * A display name for the logical table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-logicaltable.html#cfn-quicksight-dataset-logicaltable-alias)
       */
      override fun alias(): String = unwrap(this).getAlias()

      /**
       * Transform operations that act on this logical table.
       *
       * For this structure to be valid, only one of the attributes can be non-null.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-logicaltable.html#cfn-quicksight-dataset-logicaltable-datatransforms)
       */
      override fun dataTransforms(): Any? = unwrap(this).getDataTransforms()

      /**
       * Source of this logical table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-logicaltable.html#cfn-quicksight-dataset-logicaltable-source)
       */
      override fun source(): Any = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogicalTableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty):
          LogicalTableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogicalTableProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableProperty
    }
  }

  /**
   * Information about the format for a source file or files.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * UploadSettingsProperty uploadSettingsProperty = UploadSettingsProperty.builder()
   * .containsHeader(false)
   * .delimiter("delimiter")
   * .format("format")
   * .startFromRow(123)
   * .textQualifier("textQualifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-uploadsettings.html)
   */
  public interface UploadSettingsProperty {
    /**
     * Whether the file has a header row, or the files each have a header row.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-uploadsettings.html#cfn-quicksight-dataset-uploadsettings-containsheader)
     */
    public fun containsHeader(): Any? = unwrap(this).getContainsHeader()

    /**
     * The delimiter between values in the file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-uploadsettings.html#cfn-quicksight-dataset-uploadsettings-delimiter)
     */
    public fun delimiter(): String? = unwrap(this).getDelimiter()

    /**
     * File format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-uploadsettings.html#cfn-quicksight-dataset-uploadsettings-format)
     */
    public fun format(): String? = unwrap(this).getFormat()

    /**
     * A row number to start reading data from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-uploadsettings.html#cfn-quicksight-dataset-uploadsettings-startfromrow)
     */
    public fun startFromRow(): Number? = unwrap(this).getStartFromRow()

    /**
     * Text qualifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-uploadsettings.html#cfn-quicksight-dataset-uploadsettings-textqualifier)
     */
    public fun textQualifier(): String? = unwrap(this).getTextQualifier()

    /**
     * A builder for [UploadSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containsHeader Whether the file has a header row, or the files each have a header
       * row.
       */
      public fun containsHeader(containsHeader: Boolean)

      /**
       * @param containsHeader Whether the file has a header row, or the files each have a header
       * row.
       */
      public fun containsHeader(containsHeader: IResolvable)

      /**
       * @param delimiter The delimiter between values in the file.
       */
      public fun delimiter(delimiter: String)

      /**
       * @param format File format.
       */
      public fun format(format: String)

      /**
       * @param startFromRow A row number to start reading data from.
       */
      public fun startFromRow(startFromRow: Number)

      /**
       * @param textQualifier Text qualifier.
       */
      public fun textQualifier(textQualifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty.builder()

      /**
       * @param containsHeader Whether the file has a header row, or the files each have a header
       * row.
       */
      override fun containsHeader(containsHeader: Boolean) {
        cdkBuilder.containsHeader(containsHeader)
      }

      /**
       * @param containsHeader Whether the file has a header row, or the files each have a header
       * row.
       */
      override fun containsHeader(containsHeader: IResolvable) {
        cdkBuilder.containsHeader(containsHeader.let(IResolvable::unwrap))
      }

      /**
       * @param delimiter The delimiter between values in the file.
       */
      override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      /**
       * @param format File format.
       */
      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      /**
       * @param startFromRow A row number to start reading data from.
       */
      override fun startFromRow(startFromRow: Number) {
        cdkBuilder.startFromRow(startFromRow)
      }

      /**
       * @param textQualifier Text qualifier.
       */
      override fun textQualifier(textQualifier: String) {
        cdkBuilder.textQualifier(textQualifier)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty,
    ) : CdkObject(cdkObject), UploadSettingsProperty {
      /**
       * Whether the file has a header row, or the files each have a header row.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-uploadsettings.html#cfn-quicksight-dataset-uploadsettings-containsheader)
       */
      override fun containsHeader(): Any? = unwrap(this).getContainsHeader()

      /**
       * The delimiter between values in the file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-uploadsettings.html#cfn-quicksight-dataset-uploadsettings-delimiter)
       */
      override fun delimiter(): String? = unwrap(this).getDelimiter()

      /**
       * File format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-uploadsettings.html#cfn-quicksight-dataset-uploadsettings-format)
       */
      override fun format(): String? = unwrap(this).getFormat()

      /**
       * A row number to start reading data from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-uploadsettings.html#cfn-quicksight-dataset-uploadsettings-startfromrow)
       */
      override fun startFromRow(): Number? = unwrap(this).getStartFromRow()

      /**
       * Text qualifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-uploadsettings.html#cfn-quicksight-dataset-uploadsettings-textqualifier)
       */
      override fun textQualifier(): String? = unwrap(this).getTextQualifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UploadSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty):
          UploadSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UploadSettingsProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty
    }
  }

  /**
   * The parameter declarations of the dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * DatasetParameterProperty datasetParameterProperty = DatasetParameterProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetparameter.html)
   */
  public interface DatasetParameterProperty {
    /**
     * A date time parameter that is created in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetparameter.html#cfn-quicksight-dataset-datasetparameter-datetimedatasetparameter)
     */
    public fun dateTimeDatasetParameter(): Any? = unwrap(this).getDateTimeDatasetParameter()

    /**
     * A decimal parameter that is created in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetparameter.html#cfn-quicksight-dataset-datasetparameter-decimaldatasetparameter)
     */
    public fun decimalDatasetParameter(): Any? = unwrap(this).getDecimalDatasetParameter()

    /**
     * An integer parameter that is created in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetparameter.html#cfn-quicksight-dataset-datasetparameter-integerdatasetparameter)
     */
    public fun integerDatasetParameter(): Any? = unwrap(this).getIntegerDatasetParameter()

    /**
     * A string parameter that is created in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetparameter.html#cfn-quicksight-dataset-datasetparameter-stringdatasetparameter)
     */
    public fun stringDatasetParameter(): Any? = unwrap(this).getStringDatasetParameter()

    /**
     * A builder for [DatasetParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dateTimeDatasetParameter A date time parameter that is created in the dataset.
       */
      public fun dateTimeDatasetParameter(dateTimeDatasetParameter: IResolvable)

      /**
       * @param dateTimeDatasetParameter A date time parameter that is created in the dataset.
       */
      public
          fun dateTimeDatasetParameter(dateTimeDatasetParameter: DateTimeDatasetParameterProperty)

      /**
       * @param dateTimeDatasetParameter A date time parameter that is created in the dataset.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6330e56a4b08c037e5a0198b51c1a974e2d11af1bb08379c97c0f6aae67e16b")
      public
          fun dateTimeDatasetParameter(dateTimeDatasetParameter: DateTimeDatasetParameterProperty.Builder.() -> Unit)

      /**
       * @param decimalDatasetParameter A decimal parameter that is created in the dataset.
       */
      public fun decimalDatasetParameter(decimalDatasetParameter: IResolvable)

      /**
       * @param decimalDatasetParameter A decimal parameter that is created in the dataset.
       */
      public fun decimalDatasetParameter(decimalDatasetParameter: DecimalDatasetParameterProperty)

      /**
       * @param decimalDatasetParameter A decimal parameter that is created in the dataset.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1634e53f113aed724cabad720b0fa19f4e316e4b1f7116b4cf0999c1bfe2aae2")
      public
          fun decimalDatasetParameter(decimalDatasetParameter: DecimalDatasetParameterProperty.Builder.() -> Unit)

      /**
       * @param integerDatasetParameter An integer parameter that is created in the dataset.
       */
      public fun integerDatasetParameter(integerDatasetParameter: IResolvable)

      /**
       * @param integerDatasetParameter An integer parameter that is created in the dataset.
       */
      public fun integerDatasetParameter(integerDatasetParameter: IntegerDatasetParameterProperty)

      /**
       * @param integerDatasetParameter An integer parameter that is created in the dataset.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40a5b0841ed1324c9c1a99dd407c95d8169daf3049187f30e0306f959955ebcb")
      public
          fun integerDatasetParameter(integerDatasetParameter: IntegerDatasetParameterProperty.Builder.() -> Unit)

      /**
       * @param stringDatasetParameter A string parameter that is created in the dataset.
       */
      public fun stringDatasetParameter(stringDatasetParameter: IResolvable)

      /**
       * @param stringDatasetParameter A string parameter that is created in the dataset.
       */
      public fun stringDatasetParameter(stringDatasetParameter: StringDatasetParameterProperty)

      /**
       * @param stringDatasetParameter A string parameter that is created in the dataset.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e94bf3ec5d1ec0fc7536914e63dcc28a3d93ab61b8b6cf48eaa37438c83110e7")
      public
          fun stringDatasetParameter(stringDatasetParameter: StringDatasetParameterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DatasetParameterProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.DatasetParameterProperty.builder()

      /**
       * @param dateTimeDatasetParameter A date time parameter that is created in the dataset.
       */
      override fun dateTimeDatasetParameter(dateTimeDatasetParameter: IResolvable) {
        cdkBuilder.dateTimeDatasetParameter(dateTimeDatasetParameter.let(IResolvable::unwrap))
      }

      /**
       * @param dateTimeDatasetParameter A date time parameter that is created in the dataset.
       */
      override
          fun dateTimeDatasetParameter(dateTimeDatasetParameter: DateTimeDatasetParameterProperty) {
        cdkBuilder.dateTimeDatasetParameter(dateTimeDatasetParameter.let(DateTimeDatasetParameterProperty::unwrap))
      }

      /**
       * @param dateTimeDatasetParameter A date time parameter that is created in the dataset.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6330e56a4b08c037e5a0198b51c1a974e2d11af1bb08379c97c0f6aae67e16b")
      override
          fun dateTimeDatasetParameter(dateTimeDatasetParameter: DateTimeDatasetParameterProperty.Builder.() -> Unit):
          Unit =
          dateTimeDatasetParameter(DateTimeDatasetParameterProperty(dateTimeDatasetParameter))

      /**
       * @param decimalDatasetParameter A decimal parameter that is created in the dataset.
       */
      override fun decimalDatasetParameter(decimalDatasetParameter: IResolvable) {
        cdkBuilder.decimalDatasetParameter(decimalDatasetParameter.let(IResolvable::unwrap))
      }

      /**
       * @param decimalDatasetParameter A decimal parameter that is created in the dataset.
       */
      override
          fun decimalDatasetParameter(decimalDatasetParameter: DecimalDatasetParameterProperty) {
        cdkBuilder.decimalDatasetParameter(decimalDatasetParameter.let(DecimalDatasetParameterProperty::unwrap))
      }

      /**
       * @param decimalDatasetParameter A decimal parameter that is created in the dataset.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1634e53f113aed724cabad720b0fa19f4e316e4b1f7116b4cf0999c1bfe2aae2")
      override
          fun decimalDatasetParameter(decimalDatasetParameter: DecimalDatasetParameterProperty.Builder.() -> Unit):
          Unit = decimalDatasetParameter(DecimalDatasetParameterProperty(decimalDatasetParameter))

      /**
       * @param integerDatasetParameter An integer parameter that is created in the dataset.
       */
      override fun integerDatasetParameter(integerDatasetParameter: IResolvable) {
        cdkBuilder.integerDatasetParameter(integerDatasetParameter.let(IResolvable::unwrap))
      }

      /**
       * @param integerDatasetParameter An integer parameter that is created in the dataset.
       */
      override
          fun integerDatasetParameter(integerDatasetParameter: IntegerDatasetParameterProperty) {
        cdkBuilder.integerDatasetParameter(integerDatasetParameter.let(IntegerDatasetParameterProperty::unwrap))
      }

      /**
       * @param integerDatasetParameter An integer parameter that is created in the dataset.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40a5b0841ed1324c9c1a99dd407c95d8169daf3049187f30e0306f959955ebcb")
      override
          fun integerDatasetParameter(integerDatasetParameter: IntegerDatasetParameterProperty.Builder.() -> Unit):
          Unit = integerDatasetParameter(IntegerDatasetParameterProperty(integerDatasetParameter))

      /**
       * @param stringDatasetParameter A string parameter that is created in the dataset.
       */
      override fun stringDatasetParameter(stringDatasetParameter: IResolvable) {
        cdkBuilder.stringDatasetParameter(stringDatasetParameter.let(IResolvable::unwrap))
      }

      /**
       * @param stringDatasetParameter A string parameter that is created in the dataset.
       */
      override fun stringDatasetParameter(stringDatasetParameter: StringDatasetParameterProperty) {
        cdkBuilder.stringDatasetParameter(stringDatasetParameter.let(StringDatasetParameterProperty::unwrap))
      }

      /**
       * @param stringDatasetParameter A string parameter that is created in the dataset.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e94bf3ec5d1ec0fc7536914e63dcc28a3d93ab61b8b6cf48eaa37438c83110e7")
      override
          fun stringDatasetParameter(stringDatasetParameter: StringDatasetParameterProperty.Builder.() -> Unit):
          Unit = stringDatasetParameter(StringDatasetParameterProperty(stringDatasetParameter))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.DatasetParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DatasetParameterProperty,
    ) : CdkObject(cdkObject), DatasetParameterProperty {
      /**
       * A date time parameter that is created in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetparameter.html#cfn-quicksight-dataset-datasetparameter-datetimedatasetparameter)
       */
      override fun dateTimeDatasetParameter(): Any? = unwrap(this).getDateTimeDatasetParameter()

      /**
       * A decimal parameter that is created in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetparameter.html#cfn-quicksight-dataset-datasetparameter-decimaldatasetparameter)
       */
      override fun decimalDatasetParameter(): Any? = unwrap(this).getDecimalDatasetParameter()

      /**
       * An integer parameter that is created in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetparameter.html#cfn-quicksight-dataset-datasetparameter-integerdatasetparameter)
       */
      override fun integerDatasetParameter(): Any? = unwrap(this).getIntegerDatasetParameter()

      /**
       * A string parameter that is created in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetparameter.html#cfn-quicksight-dataset-datasetparameter-stringdatasetparameter)
       */
      override fun stringDatasetParameter(): Any? = unwrap(this).getStringDatasetParameter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.DatasetParameterProperty):
          DatasetParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetParameterProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.DatasetParameterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.DatasetParameterProperty
    }
  }

  /**
   * The new default values for the parameter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * NewDefaultValuesProperty newDefaultValuesProperty = NewDefaultValuesProperty.builder()
   * .dateTimeStaticValues(List.of("dateTimeStaticValues"))
   * .decimalStaticValues(List.of(123))
   * .integerStaticValues(List.of(123))
   * .stringStaticValues(List.of("stringStaticValues"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-newdefaultvalues.html)
   */
  public interface NewDefaultValuesProperty {
    /**
     * A list of static default values for a given date time parameter.
     *
     * The valid format for this property is `yyyy-MM-dd’T’HH:mm:ss’Z’` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-newdefaultvalues.html#cfn-quicksight-dataset-newdefaultvalues-datetimestaticvalues)
     */
    public fun dateTimeStaticValues(): List<String> = unwrap(this).getDateTimeStaticValues() ?:
        emptyList()

    /**
     * A list of static default values for a given decimal parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-newdefaultvalues.html#cfn-quicksight-dataset-newdefaultvalues-decimalstaticvalues)
     */
    public fun decimalStaticValues(): Any? = unwrap(this).getDecimalStaticValues()

    /**
     * A list of static default values for a given integer parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-newdefaultvalues.html#cfn-quicksight-dataset-newdefaultvalues-integerstaticvalues)
     */
    public fun integerStaticValues(): Any? = unwrap(this).getIntegerStaticValues()

    /**
     * A list of static default values for a given string parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-newdefaultvalues.html#cfn-quicksight-dataset-newdefaultvalues-stringstaticvalues)
     */
    public fun stringStaticValues(): List<String> = unwrap(this).getStringStaticValues() ?:
        emptyList()

    /**
     * A builder for [NewDefaultValuesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dateTimeStaticValues A list of static default values for a given date time
       * parameter.
       * The valid format for this property is `yyyy-MM-dd’T’HH:mm:ss’Z’` .
       */
      public fun dateTimeStaticValues(dateTimeStaticValues: List<String>)

      /**
       * @param dateTimeStaticValues A list of static default values for a given date time
       * parameter.
       * The valid format for this property is `yyyy-MM-dd’T’HH:mm:ss’Z’` .
       */
      public fun dateTimeStaticValues(vararg dateTimeStaticValues: String)

      /**
       * @param decimalStaticValues A list of static default values for a given decimal parameter.
       */
      public fun decimalStaticValues(decimalStaticValues: IResolvable)

      /**
       * @param decimalStaticValues A list of static default values for a given decimal parameter.
       */
      public fun decimalStaticValues(decimalStaticValues: List<Number>)

      /**
       * @param decimalStaticValues A list of static default values for a given decimal parameter.
       */
      public fun decimalStaticValues(vararg decimalStaticValues: Number)

      /**
       * @param integerStaticValues A list of static default values for a given integer parameter.
       */
      public fun integerStaticValues(integerStaticValues: IResolvable)

      /**
       * @param integerStaticValues A list of static default values for a given integer parameter.
       */
      public fun integerStaticValues(integerStaticValues: List<Number>)

      /**
       * @param integerStaticValues A list of static default values for a given integer parameter.
       */
      public fun integerStaticValues(vararg integerStaticValues: Number)

      /**
       * @param stringStaticValues A list of static default values for a given string parameter.
       */
      public fun stringStaticValues(stringStaticValues: List<String>)

      /**
       * @param stringStaticValues A list of static default values for a given string parameter.
       */
      public fun stringStaticValues(vararg stringStaticValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.NewDefaultValuesProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.NewDefaultValuesProperty.builder()

      /**
       * @param dateTimeStaticValues A list of static default values for a given date time
       * parameter.
       * The valid format for this property is `yyyy-MM-dd’T’HH:mm:ss’Z’` .
       */
      override fun dateTimeStaticValues(dateTimeStaticValues: List<String>) {
        cdkBuilder.dateTimeStaticValues(dateTimeStaticValues)
      }

      /**
       * @param dateTimeStaticValues A list of static default values for a given date time
       * parameter.
       * The valid format for this property is `yyyy-MM-dd’T’HH:mm:ss’Z’` .
       */
      override fun dateTimeStaticValues(vararg dateTimeStaticValues: String): Unit =
          dateTimeStaticValues(dateTimeStaticValues.toList())

      /**
       * @param decimalStaticValues A list of static default values for a given decimal parameter.
       */
      override fun decimalStaticValues(decimalStaticValues: IResolvable) {
        cdkBuilder.decimalStaticValues(decimalStaticValues.let(IResolvable::unwrap))
      }

      /**
       * @param decimalStaticValues A list of static default values for a given decimal parameter.
       */
      override fun decimalStaticValues(decimalStaticValues: List<Number>) {
        cdkBuilder.decimalStaticValues(decimalStaticValues)
      }

      /**
       * @param decimalStaticValues A list of static default values for a given decimal parameter.
       */
      override fun decimalStaticValues(vararg decimalStaticValues: Number): Unit =
          decimalStaticValues(decimalStaticValues.toList())

      /**
       * @param integerStaticValues A list of static default values for a given integer parameter.
       */
      override fun integerStaticValues(integerStaticValues: IResolvable) {
        cdkBuilder.integerStaticValues(integerStaticValues.let(IResolvable::unwrap))
      }

      /**
       * @param integerStaticValues A list of static default values for a given integer parameter.
       */
      override fun integerStaticValues(integerStaticValues: List<Number>) {
        cdkBuilder.integerStaticValues(integerStaticValues)
      }

      /**
       * @param integerStaticValues A list of static default values for a given integer parameter.
       */
      override fun integerStaticValues(vararg integerStaticValues: Number): Unit =
          integerStaticValues(integerStaticValues.toList())

      /**
       * @param stringStaticValues A list of static default values for a given string parameter.
       */
      override fun stringStaticValues(stringStaticValues: List<String>) {
        cdkBuilder.stringStaticValues(stringStaticValues)
      }

      /**
       * @param stringStaticValues A list of static default values for a given string parameter.
       */
      override fun stringStaticValues(vararg stringStaticValues: String): Unit =
          stringStaticValues(stringStaticValues.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.NewDefaultValuesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.NewDefaultValuesProperty,
    ) : CdkObject(cdkObject), NewDefaultValuesProperty {
      /**
       * A list of static default values for a given date time parameter.
       *
       * The valid format for this property is `yyyy-MM-dd’T’HH:mm:ss’Z’` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-newdefaultvalues.html#cfn-quicksight-dataset-newdefaultvalues-datetimestaticvalues)
       */
      override fun dateTimeStaticValues(): List<String> = unwrap(this).getDateTimeStaticValues() ?:
          emptyList()

      /**
       * A list of static default values for a given decimal parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-newdefaultvalues.html#cfn-quicksight-dataset-newdefaultvalues-decimalstaticvalues)
       */
      override fun decimalStaticValues(): Any? = unwrap(this).getDecimalStaticValues()

      /**
       * A list of static default values for a given integer parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-newdefaultvalues.html#cfn-quicksight-dataset-newdefaultvalues-integerstaticvalues)
       */
      override fun integerStaticValues(): Any? = unwrap(this).getIntegerStaticValues()

      /**
       * A list of static default values for a given string parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-newdefaultvalues.html#cfn-quicksight-dataset-newdefaultvalues-stringstaticvalues)
       */
      override fun stringStaticValues(): List<String> = unwrap(this).getStringStaticValues() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NewDefaultValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.NewDefaultValuesProperty):
          NewDefaultValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NewDefaultValuesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.NewDefaultValuesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.NewDefaultValuesProperty
    }
  }

  /**
   * The element you can use to define tags for row-level security.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * Object tagRuleConfigurations;
   * RowLevelPermissionTagConfigurationProperty rowLevelPermissionTagConfigurationProperty =
   * RowLevelPermissionTagConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagconfiguration.html)
   */
  public interface RowLevelPermissionTagConfigurationProperty {
    /**
     * The status of row-level security tags.
     *
     * If enabled, the status is `ENABLED` . If disabled, the status is `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagconfiguration.html#cfn-quicksight-dataset-rowlevelpermissiontagconfiguration-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * The configuration of tags on a dataset to set row-level security.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagconfiguration.html#cfn-quicksight-dataset-rowlevelpermissiontagconfiguration-tagruleconfigurations)
     */
    public fun tagRuleConfigurations(): Any? = unwrap(this).getTagRuleConfigurations()

    /**
     * A set of rules associated with row-level security, such as the tag names and columns that
     * they are assigned to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagconfiguration.html#cfn-quicksight-dataset-rowlevelpermissiontagconfiguration-tagrules)
     */
    public fun tagRules(): Any

    /**
     * A builder for [RowLevelPermissionTagConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param status The status of row-level security tags.
       * If enabled, the status is `ENABLED` . If disabled, the status is `DISABLED` .
       */
      public fun status(status: String)

      /**
       * @param tagRuleConfigurations The configuration of tags on a dataset to set row-level
       * security.
       */
      public fun tagRuleConfigurations(tagRuleConfigurations: Any)

      /**
       * @param tagRules A set of rules associated with row-level security, such as the tag names
       * and columns that they are assigned to. 
       */
      public fun tagRules(tagRules: IResolvable)

      /**
       * @param tagRules A set of rules associated with row-level security, such as the tag names
       * and columns that they are assigned to. 
       */
      public fun tagRules(tagRules: List<Any>)

      /**
       * @param tagRules A set of rules associated with row-level security, such as the tag names
       * and columns that they are assigned to. 
       */
      public fun tagRules(vararg tagRules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagConfigurationProperty.builder()

      /**
       * @param status The status of row-level security tags.
       * If enabled, the status is `ENABLED` . If disabled, the status is `DISABLED` .
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param tagRuleConfigurations The configuration of tags on a dataset to set row-level
       * security.
       */
      override fun tagRuleConfigurations(tagRuleConfigurations: Any) {
        cdkBuilder.tagRuleConfigurations(tagRuleConfigurations)
      }

      /**
       * @param tagRules A set of rules associated with row-level security, such as the tag names
       * and columns that they are assigned to. 
       */
      override fun tagRules(tagRules: IResolvable) {
        cdkBuilder.tagRules(tagRules.let(IResolvable::unwrap))
      }

      /**
       * @param tagRules A set of rules associated with row-level security, such as the tag names
       * and columns that they are assigned to. 
       */
      override fun tagRules(tagRules: List<Any>) {
        cdkBuilder.tagRules(tagRules)
      }

      /**
       * @param tagRules A set of rules associated with row-level security, such as the tag names
       * and columns that they are assigned to. 
       */
      override fun tagRules(vararg tagRules: Any): Unit = tagRules(tagRules.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagConfigurationProperty,
    ) : CdkObject(cdkObject), RowLevelPermissionTagConfigurationProperty {
      /**
       * The status of row-level security tags.
       *
       * If enabled, the status is `ENABLED` . If disabled, the status is `DISABLED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagconfiguration.html#cfn-quicksight-dataset-rowlevelpermissiontagconfiguration-status)
       */
      override fun status(): String? = unwrap(this).getStatus()

      /**
       * The configuration of tags on a dataset to set row-level security.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagconfiguration.html#cfn-quicksight-dataset-rowlevelpermissiontagconfiguration-tagruleconfigurations)
       */
      override fun tagRuleConfigurations(): Any? = unwrap(this).getTagRuleConfigurations()

      /**
       * A set of rules associated with row-level security, such as the tag names and columns that
       * they are assigned to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagconfiguration.html#cfn-quicksight-dataset-rowlevelpermissiontagconfiguration-tagrules)
       */
      override fun tagRules(): Any = unwrap(this).getTagRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RowLevelPermissionTagConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagConfigurationProperty):
          RowLevelPermissionTagConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RowLevelPermissionTagConfigurationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.RowLevelPermissionTagConfigurationProperty
    }
  }

  /**
   * A rule defined to grant access on one or more restricted columns.
   *
   * Each dataset can have multiple rules. To create a restricted column, you add it to one or more
   * rules. Each rule must contain at least one column and at least one user or group. To be able to
   * see a restricted column, a user or group needs to be added to a rule for that column.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * ColumnLevelPermissionRuleProperty columnLevelPermissionRuleProperty =
   * ColumnLevelPermissionRuleProperty.builder()
   * .columnNames(List.of("columnNames"))
   * .principals(List.of("principals"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columnlevelpermissionrule.html)
   */
  public interface ColumnLevelPermissionRuleProperty {
    /**
     * An array of column names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columnlevelpermissionrule.html#cfn-quicksight-dataset-columnlevelpermissionrule-columnnames)
     */
    public fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

    /**
     * An array of Amazon Resource Names (ARNs) for Amazon QuickSight users or groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columnlevelpermissionrule.html#cfn-quicksight-dataset-columnlevelpermissionrule-principals)
     */
    public fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

    /**
     * A builder for [ColumnLevelPermissionRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columnNames An array of column names.
       */
      public fun columnNames(columnNames: List<String>)

      /**
       * @param columnNames An array of column names.
       */
      public fun columnNames(vararg columnNames: String)

      /**
       * @param principals An array of Amazon Resource Names (ARNs) for Amazon QuickSight users or
       * groups.
       */
      public fun principals(principals: List<String>)

      /**
       * @param principals An array of Amazon Resource Names (ARNs) for Amazon QuickSight users or
       * groups.
       */
      public fun principals(vararg principals: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnLevelPermissionRuleProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnLevelPermissionRuleProperty.builder()

      /**
       * @param columnNames An array of column names.
       */
      override fun columnNames(columnNames: List<String>) {
        cdkBuilder.columnNames(columnNames)
      }

      /**
       * @param columnNames An array of column names.
       */
      override fun columnNames(vararg columnNames: String): Unit = columnNames(columnNames.toList())

      /**
       * @param principals An array of Amazon Resource Names (ARNs) for Amazon QuickSight users or
       * groups.
       */
      override fun principals(principals: List<String>) {
        cdkBuilder.principals(principals)
      }

      /**
       * @param principals An array of Amazon Resource Names (ARNs) for Amazon QuickSight users or
       * groups.
       */
      override fun principals(vararg principals: String): Unit = principals(principals.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnLevelPermissionRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnLevelPermissionRuleProperty,
    ) : CdkObject(cdkObject), ColumnLevelPermissionRuleProperty {
      /**
       * An array of column names.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columnlevelpermissionrule.html#cfn-quicksight-dataset-columnlevelpermissionrule-columnnames)
       */
      override fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

      /**
       * An array of Amazon Resource Names (ARNs) for Amazon QuickSight users or groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columnlevelpermissionrule.html#cfn-quicksight-dataset-columnlevelpermissionrule-principals)
       */
      override fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ColumnLevelPermissionRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnLevelPermissionRuleProperty):
          ColumnLevelPermissionRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnLevelPermissionRuleProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnLevelPermissionRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnLevelPermissionRuleProperty
    }
  }

  /**
   * The incremental refresh configuration for a dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * IncrementalRefreshProperty incrementalRefreshProperty = IncrementalRefreshProperty.builder()
   * .lookbackWindow(LookbackWindowProperty.builder()
   * .columnName("columnName")
   * .size(123)
   * .sizeUnit("sizeUnit")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-incrementalrefresh.html)
   */
  public interface IncrementalRefreshProperty {
    /**
     * The lookback window setup for an incremental refresh configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-incrementalrefresh.html#cfn-quicksight-dataset-incrementalrefresh-lookbackwindow)
     */
    public fun lookbackWindow(): Any? = unwrap(this).getLookbackWindow()

    /**
     * A builder for [IncrementalRefreshProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lookbackWindow The lookback window setup for an incremental refresh configuration.
       */
      public fun lookbackWindow(lookbackWindow: IResolvable)

      /**
       * @param lookbackWindow The lookback window setup for an incremental refresh configuration.
       */
      public fun lookbackWindow(lookbackWindow: LookbackWindowProperty)

      /**
       * @param lookbackWindow The lookback window setup for an incremental refresh configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d076a231dab6dc3cf3a9fb65a3c9a1529398d973f5242a3f7841ec7d88b58222")
      public fun lookbackWindow(lookbackWindow: LookbackWindowProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.IncrementalRefreshProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.IncrementalRefreshProperty.builder()

      /**
       * @param lookbackWindow The lookback window setup for an incremental refresh configuration.
       */
      override fun lookbackWindow(lookbackWindow: IResolvable) {
        cdkBuilder.lookbackWindow(lookbackWindow.let(IResolvable::unwrap))
      }

      /**
       * @param lookbackWindow The lookback window setup for an incremental refresh configuration.
       */
      override fun lookbackWindow(lookbackWindow: LookbackWindowProperty) {
        cdkBuilder.lookbackWindow(lookbackWindow.let(LookbackWindowProperty::unwrap))
      }

      /**
       * @param lookbackWindow The lookback window setup for an incremental refresh configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d076a231dab6dc3cf3a9fb65a3c9a1529398d973f5242a3f7841ec7d88b58222")
      override fun lookbackWindow(lookbackWindow: LookbackWindowProperty.Builder.() -> Unit): Unit =
          lookbackWindow(LookbackWindowProperty(lookbackWindow))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.IncrementalRefreshProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.IncrementalRefreshProperty,
    ) : CdkObject(cdkObject), IncrementalRefreshProperty {
      /**
       * The lookback window setup for an incremental refresh configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-incrementalrefresh.html#cfn-quicksight-dataset-incrementalrefresh-lookbackwindow)
       */
      override fun lookbackWindow(): Any? = unwrap(this).getLookbackWindow()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IncrementalRefreshProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.IncrementalRefreshProperty):
          IncrementalRefreshProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IncrementalRefreshProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.IncrementalRefreshProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.IncrementalRefreshProperty
    }
  }

  /**
   * A transform operation that casts a column to a different type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * CastColumnTypeOperationProperty castColumnTypeOperationProperty =
   * CastColumnTypeOperationProperty.builder()
   * .columnName("columnName")
   * .newColumnType("newColumnType")
   * // the properties below are optional
   * .format("format")
   * .subType("subType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-castcolumntypeoperation.html)
   */
  public interface CastColumnTypeOperationProperty {
    /**
     * Column name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-castcolumntypeoperation.html#cfn-quicksight-dataset-castcolumntypeoperation-columnname)
     */
    public fun columnName(): String

    /**
     * When casting a column from string to datetime type, you can supply a string in a format
     * supported by Amazon QuickSight to denote the source data format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-castcolumntypeoperation.html#cfn-quicksight-dataset-castcolumntypeoperation-format)
     */
    public fun format(): String? = unwrap(this).getFormat()

    /**
     * New column data type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-castcolumntypeoperation.html#cfn-quicksight-dataset-castcolumntypeoperation-newcolumntype)
     */
    public fun newColumnType(): String

    /**
     * The sub data type of the new column.
     *
     * Sub types are only available for decimal columns that are part of a SPICE dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-castcolumntypeoperation.html#cfn-quicksight-dataset-castcolumntypeoperation-subtype)
     */
    public fun subType(): String? = unwrap(this).getSubType()

    /**
     * A builder for [CastColumnTypeOperationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columnName Column name. 
       */
      public fun columnName(columnName: String)

      /**
       * @param format When casting a column from string to datetime type, you can supply a string
       * in a format supported by Amazon QuickSight to denote the source data format.
       */
      public fun format(format: String)

      /**
       * @param newColumnType New column data type. 
       */
      public fun newColumnType(newColumnType: String)

      /**
       * @param subType The sub data type of the new column.
       * Sub types are only available for decimal columns that are part of a SPICE dataset.
       */
      public fun subType(subType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty.builder()

      /**
       * @param columnName Column name. 
       */
      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      /**
       * @param format When casting a column from string to datetime type, you can supply a string
       * in a format supported by Amazon QuickSight to denote the source data format.
       */
      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      /**
       * @param newColumnType New column data type. 
       */
      override fun newColumnType(newColumnType: String) {
        cdkBuilder.newColumnType(newColumnType)
      }

      /**
       * @param subType The sub data type of the new column.
       * Sub types are only available for decimal columns that are part of a SPICE dataset.
       */
      override fun subType(subType: String) {
        cdkBuilder.subType(subType)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty,
    ) : CdkObject(cdkObject), CastColumnTypeOperationProperty {
      /**
       * Column name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-castcolumntypeoperation.html#cfn-quicksight-dataset-castcolumntypeoperation-columnname)
       */
      override fun columnName(): String = unwrap(this).getColumnName()

      /**
       * When casting a column from string to datetime type, you can supply a string in a format
       * supported by Amazon QuickSight to denote the source data format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-castcolumntypeoperation.html#cfn-quicksight-dataset-castcolumntypeoperation-format)
       */
      override fun format(): String? = unwrap(this).getFormat()

      /**
       * New column data type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-castcolumntypeoperation.html#cfn-quicksight-dataset-castcolumntypeoperation-newcolumntype)
       */
      override fun newColumnType(): String = unwrap(this).getNewColumnType()

      /**
       * The sub data type of the new column.
       *
       * Sub types are only available for decimal columns that are part of a SPICE dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-castcolumntypeoperation.html#cfn-quicksight-dataset-castcolumntypeoperation-subtype)
       */
      override fun subType(): String? = unwrap(this).getSubType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CastColumnTypeOperationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty):
          CastColumnTypeOperationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CastColumnTypeOperationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.CastColumnTypeOperationProperty
    }
  }

  /**
   * The refresh properties of a dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * DataSetRefreshPropertiesProperty dataSetRefreshPropertiesProperty =
   * DataSetRefreshPropertiesProperty.builder()
   * .refreshConfiguration(RefreshConfigurationProperty.builder()
   * .incrementalRefresh(IncrementalRefreshProperty.builder()
   * .lookbackWindow(LookbackWindowProperty.builder()
   * .columnName("columnName")
   * .size(123)
   * .sizeUnit("sizeUnit")
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetrefreshproperties.html)
   */
  public interface DataSetRefreshPropertiesProperty {
    /**
     * The refresh configuration for a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetrefreshproperties.html#cfn-quicksight-dataset-datasetrefreshproperties-refreshconfiguration)
     */
    public fun refreshConfiguration(): Any? = unwrap(this).getRefreshConfiguration()

    /**
     * A builder for [DataSetRefreshPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param refreshConfiguration The refresh configuration for a dataset.
       */
      public fun refreshConfiguration(refreshConfiguration: IResolvable)

      /**
       * @param refreshConfiguration The refresh configuration for a dataset.
       */
      public fun refreshConfiguration(refreshConfiguration: RefreshConfigurationProperty)

      /**
       * @param refreshConfiguration The refresh configuration for a dataset.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d891b94496204b23a10ded06cb3c53dc1ea32e4458deafff5a702f6b82b61370")
      public
          fun refreshConfiguration(refreshConfiguration: RefreshConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetRefreshPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetRefreshPropertiesProperty.builder()

      /**
       * @param refreshConfiguration The refresh configuration for a dataset.
       */
      override fun refreshConfiguration(refreshConfiguration: IResolvable) {
        cdkBuilder.refreshConfiguration(refreshConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param refreshConfiguration The refresh configuration for a dataset.
       */
      override fun refreshConfiguration(refreshConfiguration: RefreshConfigurationProperty) {
        cdkBuilder.refreshConfiguration(refreshConfiguration.let(RefreshConfigurationProperty::unwrap))
      }

      /**
       * @param refreshConfiguration The refresh configuration for a dataset.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d891b94496204b23a10ded06cb3c53dc1ea32e4458deafff5a702f6b82b61370")
      override
          fun refreshConfiguration(refreshConfiguration: RefreshConfigurationProperty.Builder.() -> Unit):
          Unit = refreshConfiguration(RefreshConfigurationProperty(refreshConfiguration))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetRefreshPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetRefreshPropertiesProperty,
    ) : CdkObject(cdkObject), DataSetRefreshPropertiesProperty {
      /**
       * The refresh configuration for a dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetrefreshproperties.html#cfn-quicksight-dataset-datasetrefreshproperties-refreshconfiguration)
       */
      override fun refreshConfiguration(): Any? = unwrap(this).getRefreshConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSetRefreshPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetRefreshPropertiesProperty):
          DataSetRefreshPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSetRefreshPropertiesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetRefreshPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetRefreshPropertiesProperty
    }
  }

  /**
   * An integer parameter that is created in the dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * IntegerDatasetParameterProperty integerDatasetParameterProperty =
   * IntegerDatasetParameterProperty.builder()
   * .id("id")
   * .name("name")
   * .valueType("valueType")
   * // the properties below are optional
   * .defaultValues(IntegerDatasetParameterDefaultValuesProperty.builder()
   * .staticValues(List.of(123))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-integerdatasetparameter.html)
   */
  public interface IntegerDatasetParameterProperty {
    /**
     * A list of default values for a given integer parameter.
     *
     * This structure only accepts static values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-integerdatasetparameter.html#cfn-quicksight-dataset-integerdatasetparameter-defaultvalues)
     */
    public fun defaultValues(): Any? = unwrap(this).getDefaultValues()

    /**
     * An identifier for the integer parameter created in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-integerdatasetparameter.html#cfn-quicksight-dataset-integerdatasetparameter-id)
     */
    public fun id(): String

    /**
     * The name of the integer parameter that is created in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-integerdatasetparameter.html#cfn-quicksight-dataset-integerdatasetparameter-name)
     */
    public fun name(): String

    /**
     * The value type of the dataset parameter.
     *
     * Valid values are `single value` or `multi value` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-integerdatasetparameter.html#cfn-quicksight-dataset-integerdatasetparameter-valuetype)
     */
    public fun valueType(): String

    /**
     * A builder for [IntegerDatasetParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultValues A list of default values for a given integer parameter.
       * This structure only accepts static values.
       */
      public fun defaultValues(defaultValues: IResolvable)

      /**
       * @param defaultValues A list of default values for a given integer parameter.
       * This structure only accepts static values.
       */
      public fun defaultValues(defaultValues: IntegerDatasetParameterDefaultValuesProperty)

      /**
       * @param defaultValues A list of default values for a given integer parameter.
       * This structure only accepts static values.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2daeb77ff7c0cbcf3bdf7652790fef761fdb217132b7eb4fe84902632c02b9d1")
      public
          fun defaultValues(defaultValues: IntegerDatasetParameterDefaultValuesProperty.Builder.() -> Unit)

      /**
       * @param id An identifier for the integer parameter created in the dataset. 
       */
      public fun id(id: String)

      /**
       * @param name The name of the integer parameter that is created in the dataset. 
       */
      public fun name(name: String)

      /**
       * @param valueType The value type of the dataset parameter. 
       * Valid values are `single value` or `multi value` .
       */
      public fun valueType(valueType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterProperty.builder()

      /**
       * @param defaultValues A list of default values for a given integer parameter.
       * This structure only accepts static values.
       */
      override fun defaultValues(defaultValues: IResolvable) {
        cdkBuilder.defaultValues(defaultValues.let(IResolvable::unwrap))
      }

      /**
       * @param defaultValues A list of default values for a given integer parameter.
       * This structure only accepts static values.
       */
      override fun defaultValues(defaultValues: IntegerDatasetParameterDefaultValuesProperty) {
        cdkBuilder.defaultValues(defaultValues.let(IntegerDatasetParameterDefaultValuesProperty::unwrap))
      }

      /**
       * @param defaultValues A list of default values for a given integer parameter.
       * This structure only accepts static values.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2daeb77ff7c0cbcf3bdf7652790fef761fdb217132b7eb4fe84902632c02b9d1")
      override
          fun defaultValues(defaultValues: IntegerDatasetParameterDefaultValuesProperty.Builder.() -> Unit):
          Unit = defaultValues(IntegerDatasetParameterDefaultValuesProperty(defaultValues))

      /**
       * @param id An identifier for the integer parameter created in the dataset. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param name The name of the integer parameter that is created in the dataset. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param valueType The value type of the dataset parameter. 
       * Valid values are `single value` or `multi value` .
       */
      override fun valueType(valueType: String) {
        cdkBuilder.valueType(valueType)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterProperty,
    ) : CdkObject(cdkObject), IntegerDatasetParameterProperty {
      /**
       * A list of default values for a given integer parameter.
       *
       * This structure only accepts static values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-integerdatasetparameter.html#cfn-quicksight-dataset-integerdatasetparameter-defaultvalues)
       */
      override fun defaultValues(): Any? = unwrap(this).getDefaultValues()

      /**
       * An identifier for the integer parameter created in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-integerdatasetparameter.html#cfn-quicksight-dataset-integerdatasetparameter-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The name of the integer parameter that is created in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-integerdatasetparameter.html#cfn-quicksight-dataset-integerdatasetparameter-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The value type of the dataset parameter.
       *
       * Valid values are `single value` or `multi value` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-integerdatasetparameter.html#cfn-quicksight-dataset-integerdatasetparameter-valuetype)
       */
      override fun valueType(): String = unwrap(this).getValueType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IntegerDatasetParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterProperty):
          IntegerDatasetParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegerDatasetParameterProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterProperty
    }
  }

  /**
   * The usage configuration to apply to child datasets that reference this dataset as a source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * DataSetUsageConfigurationProperty dataSetUsageConfigurationProperty =
   * DataSetUsageConfigurationProperty.builder()
   * .disableUseAsDirectQuerySource(false)
   * .disableUseAsImportedSource(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetusageconfiguration.html)
   */
  public interface DataSetUsageConfigurationProperty {
    /**
     * An option that controls whether a child dataset of a direct query can use this dataset as a
     * source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetusageconfiguration.html#cfn-quicksight-dataset-datasetusageconfiguration-disableuseasdirectquerysource)
     */
    public fun disableUseAsDirectQuerySource(): Any? =
        unwrap(this).getDisableUseAsDirectQuerySource()

    /**
     * An option that controls whether a child dataset that's stored in QuickSight can use this
     * dataset as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetusageconfiguration.html#cfn-quicksight-dataset-datasetusageconfiguration-disableuseasimportedsource)
     */
    public fun disableUseAsImportedSource(): Any? = unwrap(this).getDisableUseAsImportedSource()

    /**
     * A builder for [DataSetUsageConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param disableUseAsDirectQuerySource An option that controls whether a child dataset of a
       * direct query can use this dataset as a source.
       */
      public fun disableUseAsDirectQuerySource(disableUseAsDirectQuerySource: Boolean)

      /**
       * @param disableUseAsDirectQuerySource An option that controls whether a child dataset of a
       * direct query can use this dataset as a source.
       */
      public fun disableUseAsDirectQuerySource(disableUseAsDirectQuerySource: IResolvable)

      /**
       * @param disableUseAsImportedSource An option that controls whether a child dataset that's
       * stored in QuickSight can use this dataset as a source.
       */
      public fun disableUseAsImportedSource(disableUseAsImportedSource: Boolean)

      /**
       * @param disableUseAsImportedSource An option that controls whether a child dataset that's
       * stored in QuickSight can use this dataset as a source.
       */
      public fun disableUseAsImportedSource(disableUseAsImportedSource: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetUsageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetUsageConfigurationProperty.builder()

      /**
       * @param disableUseAsDirectQuerySource An option that controls whether a child dataset of a
       * direct query can use this dataset as a source.
       */
      override fun disableUseAsDirectQuerySource(disableUseAsDirectQuerySource: Boolean) {
        cdkBuilder.disableUseAsDirectQuerySource(disableUseAsDirectQuerySource)
      }

      /**
       * @param disableUseAsDirectQuerySource An option that controls whether a child dataset of a
       * direct query can use this dataset as a source.
       */
      override fun disableUseAsDirectQuerySource(disableUseAsDirectQuerySource: IResolvable) {
        cdkBuilder.disableUseAsDirectQuerySource(disableUseAsDirectQuerySource.let(IResolvable::unwrap))
      }

      /**
       * @param disableUseAsImportedSource An option that controls whether a child dataset that's
       * stored in QuickSight can use this dataset as a source.
       */
      override fun disableUseAsImportedSource(disableUseAsImportedSource: Boolean) {
        cdkBuilder.disableUseAsImportedSource(disableUseAsImportedSource)
      }

      /**
       * @param disableUseAsImportedSource An option that controls whether a child dataset that's
       * stored in QuickSight can use this dataset as a source.
       */
      override fun disableUseAsImportedSource(disableUseAsImportedSource: IResolvable) {
        cdkBuilder.disableUseAsImportedSource(disableUseAsImportedSource.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetUsageConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetUsageConfigurationProperty,
    ) : CdkObject(cdkObject), DataSetUsageConfigurationProperty {
      /**
       * An option that controls whether a child dataset of a direct query can use this dataset as a
       * source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetusageconfiguration.html#cfn-quicksight-dataset-datasetusageconfiguration-disableuseasdirectquerysource)
       */
      override fun disableUseAsDirectQuerySource(): Any? =
          unwrap(this).getDisableUseAsDirectQuerySource()

      /**
       * An option that controls whether a child dataset that's stored in QuickSight can use this
       * dataset as a source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datasetusageconfiguration.html#cfn-quicksight-dataset-datasetusageconfiguration-disableuseasimportedsource)
       */
      override fun disableUseAsImportedSource(): Any? = unwrap(this).getDisableUseAsImportedSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataSetUsageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetUsageConfigurationProperty):
          DataSetUsageConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSetUsageConfigurationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetUsageConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.DataSetUsageConfigurationProperty
    }
  }

  /**
   * A list of default values for a given string dataset parameter type.
   *
   * This structure only accepts static values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * StringDatasetParameterDefaultValuesProperty stringDatasetParameterDefaultValuesProperty =
   * StringDatasetParameterDefaultValuesProperty.builder()
   * .staticValues(List.of("staticValues"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-stringdatasetparameterdefaultvalues.html)
   */
  public interface StringDatasetParameterDefaultValuesProperty {
    /**
     * A list of static default values for a given string parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-stringdatasetparameterdefaultvalues.html#cfn-quicksight-dataset-stringdatasetparameterdefaultvalues-staticvalues)
     */
    public fun staticValues(): List<String> = unwrap(this).getStaticValues() ?: emptyList()

    /**
     * A builder for [StringDatasetParameterDefaultValuesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param staticValues A list of static default values for a given string parameter.
       */
      public fun staticValues(staticValues: List<String>)

      /**
       * @param staticValues A list of static default values for a given string parameter.
       */
      public fun staticValues(vararg staticValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterDefaultValuesProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterDefaultValuesProperty.builder()

      /**
       * @param staticValues A list of static default values for a given string parameter.
       */
      override fun staticValues(staticValues: List<String>) {
        cdkBuilder.staticValues(staticValues)
      }

      /**
       * @param staticValues A list of static default values for a given string parameter.
       */
      override fun staticValues(vararg staticValues: String): Unit =
          staticValues(staticValues.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterDefaultValuesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterDefaultValuesProperty,
    ) : CdkObject(cdkObject), StringDatasetParameterDefaultValuesProperty {
      /**
       * A list of static default values for a given string parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-stringdatasetparameterdefaultvalues.html#cfn-quicksight-dataset-stringdatasetparameterdefaultvalues-staticvalues)
       */
      override fun staticValues(): List<String> = unwrap(this).getStaticValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StringDatasetParameterDefaultValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterDefaultValuesProperty):
          StringDatasetParameterDefaultValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StringDatasetParameterDefaultValuesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterDefaultValuesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterDefaultValuesProperty
    }
  }

  /**
   * A FieldFolder element is a folder that contains fields and nested subfolders.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * FieldFolderProperty fieldFolderProperty = FieldFolderProperty.builder()
   * .columns(List.of("columns"))
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-fieldfolder.html)
   */
  public interface FieldFolderProperty {
    /**
     * A folder has a list of columns.
     *
     * A column can only be in one folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-fieldfolder.html#cfn-quicksight-dataset-fieldfolder-columns)
     */
    public fun columns(): List<String> = unwrap(this).getColumns() ?: emptyList()

    /**
     * The description for a field folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-fieldfolder.html#cfn-quicksight-dataset-fieldfolder-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * A builder for [FieldFolderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columns A folder has a list of columns.
       * A column can only be in one folder.
       */
      public fun columns(columns: List<String>)

      /**
       * @param columns A folder has a list of columns.
       * A column can only be in one folder.
       */
      public fun columns(vararg columns: String)

      /**
       * @param description The description for a field folder.
       */
      public fun description(description: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.FieldFolderProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.FieldFolderProperty.builder()

      /**
       * @param columns A folder has a list of columns.
       * A column can only be in one folder.
       */
      override fun columns(columns: List<String>) {
        cdkBuilder.columns(columns)
      }

      /**
       * @param columns A folder has a list of columns.
       * A column can only be in one folder.
       */
      override fun columns(vararg columns: String): Unit = columns(columns.toList())

      /**
       * @param description The description for a field folder.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet.FieldFolderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.FieldFolderProperty,
    ) : CdkObject(cdkObject), FieldFolderProperty {
      /**
       * A folder has a list of columns.
       *
       * A column can only be in one folder.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-fieldfolder.html#cfn-quicksight-dataset-fieldfolder-columns)
       */
      override fun columns(): List<String> = unwrap(this).getColumns() ?: emptyList()

      /**
       * The description for a field folder.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-fieldfolder.html#cfn-quicksight-dataset-fieldfolder-description)
       */
      override fun description(): String? = unwrap(this).getDescription()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldFolderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.FieldFolderProperty):
          FieldFolderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldFolderProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.FieldFolderProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.FieldFolderProperty
    }
  }

  /**
   * The wait policy to use when creating or updating a Dataset.
   *
   * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * IngestionWaitPolicyProperty ingestionWaitPolicyProperty = IngestionWaitPolicyProperty.builder()
   * .ingestionWaitTimeInHours(123)
   * .waitForSpiceIngestion(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-ingestionwaitpolicy.html)
   */
  public interface IngestionWaitPolicyProperty {
    /**
     * The maximum time (in hours) to wait for Ingestion to complete.
     *
     * Default timeout is 36 hours. Applicable only when `DataSetImportMode` mode is set to SPICE
     * and `WaitForSpiceIngestion` is set to true.
     *
     * Default: - 36
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-ingestionwaitpolicy.html#cfn-quicksight-dataset-ingestionwaitpolicy-ingestionwaittimeinhours)
     */
    public fun ingestionWaitTimeInHours(): Number? = unwrap(this).getIngestionWaitTimeInHours()

    /**
     * Wait for SPICE ingestion to finish to mark dataset creation or update as successful.
     *
     * Default (true). Applicable only when `DataSetImportMode` mode is set to SPICE.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-ingestionwaitpolicy.html#cfn-quicksight-dataset-ingestionwaitpolicy-waitforspiceingestion)
     */
    public fun waitForSpiceIngestion(): Any? = unwrap(this).getWaitForSpiceIngestion()

    /**
     * A builder for [IngestionWaitPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ingestionWaitTimeInHours The maximum time (in hours) to wait for Ingestion to
       * complete.
       * Default timeout is 36 hours. Applicable only when `DataSetImportMode` mode is set to SPICE
       * and `WaitForSpiceIngestion` is set to true.
       */
      public fun ingestionWaitTimeInHours(ingestionWaitTimeInHours: Number)

      /**
       * @param waitForSpiceIngestion Wait for SPICE ingestion to finish to mark dataset creation or
       * update as successful.
       * Default (true). Applicable only when `DataSetImportMode` mode is set to SPICE.
       */
      public fun waitForSpiceIngestion(waitForSpiceIngestion: Boolean)

      /**
       * @param waitForSpiceIngestion Wait for SPICE ingestion to finish to mark dataset creation or
       * update as successful.
       * Default (true). Applicable only when `DataSetImportMode` mode is set to SPICE.
       */
      public fun waitForSpiceIngestion(waitForSpiceIngestion: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty.builder()

      /**
       * @param ingestionWaitTimeInHours The maximum time (in hours) to wait for Ingestion to
       * complete.
       * Default timeout is 36 hours. Applicable only when `DataSetImportMode` mode is set to SPICE
       * and `WaitForSpiceIngestion` is set to true.
       */
      override fun ingestionWaitTimeInHours(ingestionWaitTimeInHours: Number) {
        cdkBuilder.ingestionWaitTimeInHours(ingestionWaitTimeInHours)
      }

      /**
       * @param waitForSpiceIngestion Wait for SPICE ingestion to finish to mark dataset creation or
       * update as successful.
       * Default (true). Applicable only when `DataSetImportMode` mode is set to SPICE.
       */
      override fun waitForSpiceIngestion(waitForSpiceIngestion: Boolean) {
        cdkBuilder.waitForSpiceIngestion(waitForSpiceIngestion)
      }

      /**
       * @param waitForSpiceIngestion Wait for SPICE ingestion to finish to mark dataset creation or
       * update as successful.
       * Default (true). Applicable only when `DataSetImportMode` mode is set to SPICE.
       */
      override fun waitForSpiceIngestion(waitForSpiceIngestion: IResolvable) {
        cdkBuilder.waitForSpiceIngestion(waitForSpiceIngestion.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty,
    ) : CdkObject(cdkObject), IngestionWaitPolicyProperty {
      /**
       * The maximum time (in hours) to wait for Ingestion to complete.
       *
       * Default timeout is 36 hours. Applicable only when `DataSetImportMode` mode is set to SPICE
       * and `WaitForSpiceIngestion` is set to true.
       *
       * Default: - 36
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-ingestionwaitpolicy.html#cfn-quicksight-dataset-ingestionwaitpolicy-ingestionwaittimeinhours)
       */
      override fun ingestionWaitTimeInHours(): Number? = unwrap(this).getIngestionWaitTimeInHours()

      /**
       * Wait for SPICE ingestion to finish to mark dataset creation or update as successful.
       *
       * Default (true). Applicable only when `DataSetImportMode` mode is set to SPICE.
       *
       * Default: - true
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-ingestionwaitpolicy.html#cfn-quicksight-dataset-ingestionwaitpolicy-waitforspiceingestion)
       */
      override fun waitForSpiceIngestion(): Any? = unwrap(this).getWaitForSpiceIngestion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngestionWaitPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty):
          IngestionWaitPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngestionWaitPolicyProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.IngestionWaitPolicyProperty
    }
  }

  /**
   * A view of a data source that contains information about the shape of the data in the underlying
   * source.
   *
   * This is a variant type structure. For this structure to be valid, only one of the attributes
   * can be non-null.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * PhysicalTableProperty physicalTableProperty = PhysicalTableProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-physicaltable.html)
   */
  public interface PhysicalTableProperty {
    /**
     * A physical table type built from the results of the custom SQL query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-physicaltable.html#cfn-quicksight-dataset-physicaltable-customsql)
     */
    public fun customSql(): Any? = unwrap(this).getCustomSql()

    /**
     * A physical table type for relational data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-physicaltable.html#cfn-quicksight-dataset-physicaltable-relationaltable)
     */
    public fun relationalTable(): Any? = unwrap(this).getRelationalTable()

    /**
     * A physical table type for as S3 data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-physicaltable.html#cfn-quicksight-dataset-physicaltable-s3source)
     */
    public fun s3Source(): Any? = unwrap(this).getS3Source()

    /**
     * A builder for [PhysicalTableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customSql A physical table type built from the results of the custom SQL query.
       */
      public fun customSql(customSql: IResolvable)

      /**
       * @param customSql A physical table type built from the results of the custom SQL query.
       */
      public fun customSql(customSql: CustomSqlProperty)

      /**
       * @param customSql A physical table type built from the results of the custom SQL query.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8de2d027c27adb7e5f1f7a599bce2a6399996a50fabec8fada20668496532c7c")
      public fun customSql(customSql: CustomSqlProperty.Builder.() -> Unit)

      /**
       * @param relationalTable A physical table type for relational data sources.
       */
      public fun relationalTable(relationalTable: IResolvable)

      /**
       * @param relationalTable A physical table type for relational data sources.
       */
      public fun relationalTable(relationalTable: RelationalTableProperty)

      /**
       * @param relationalTable A physical table type for relational data sources.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be2a184082d73e5397cfd6d7000e53e720afba2eab436dc45d9ec51f638b4d04")
      public fun relationalTable(relationalTable: RelationalTableProperty.Builder.() -> Unit)

      /**
       * @param s3Source A physical table type for as S3 data source.
       */
      public fun s3Source(s3Source: IResolvable)

      /**
       * @param s3Source A physical table type for as S3 data source.
       */
      public fun s3Source(s3Source: S3SourceProperty)

      /**
       * @param s3Source A physical table type for as S3 data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5dfdad1d62a931b579a50d56da812a5bec396add755a6c823646e44fa76cd35f")
      public fun s3Source(s3Source: S3SourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.PhysicalTableProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.PhysicalTableProperty.builder()

      /**
       * @param customSql A physical table type built from the results of the custom SQL query.
       */
      override fun customSql(customSql: IResolvable) {
        cdkBuilder.customSql(customSql.let(IResolvable::unwrap))
      }

      /**
       * @param customSql A physical table type built from the results of the custom SQL query.
       */
      override fun customSql(customSql: CustomSqlProperty) {
        cdkBuilder.customSql(customSql.let(CustomSqlProperty::unwrap))
      }

      /**
       * @param customSql A physical table type built from the results of the custom SQL query.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8de2d027c27adb7e5f1f7a599bce2a6399996a50fabec8fada20668496532c7c")
      override fun customSql(customSql: CustomSqlProperty.Builder.() -> Unit): Unit =
          customSql(CustomSqlProperty(customSql))

      /**
       * @param relationalTable A physical table type for relational data sources.
       */
      override fun relationalTable(relationalTable: IResolvable) {
        cdkBuilder.relationalTable(relationalTable.let(IResolvable::unwrap))
      }

      /**
       * @param relationalTable A physical table type for relational data sources.
       */
      override fun relationalTable(relationalTable: RelationalTableProperty) {
        cdkBuilder.relationalTable(relationalTable.let(RelationalTableProperty::unwrap))
      }

      /**
       * @param relationalTable A physical table type for relational data sources.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be2a184082d73e5397cfd6d7000e53e720afba2eab436dc45d9ec51f638b4d04")
      override fun relationalTable(relationalTable: RelationalTableProperty.Builder.() -> Unit):
          Unit = relationalTable(RelationalTableProperty(relationalTable))

      /**
       * @param s3Source A physical table type for as S3 data source.
       */
      override fun s3Source(s3Source: IResolvable) {
        cdkBuilder.s3Source(s3Source.let(IResolvable::unwrap))
      }

      /**
       * @param s3Source A physical table type for as S3 data source.
       */
      override fun s3Source(s3Source: S3SourceProperty) {
        cdkBuilder.s3Source(s3Source.let(S3SourceProperty::unwrap))
      }

      /**
       * @param s3Source A physical table type for as S3 data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5dfdad1d62a931b579a50d56da812a5bec396add755a6c823646e44fa76cd35f")
      override fun s3Source(s3Source: S3SourceProperty.Builder.() -> Unit): Unit =
          s3Source(S3SourceProperty(s3Source))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.PhysicalTableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.PhysicalTableProperty,
    ) : CdkObject(cdkObject), PhysicalTableProperty {
      /**
       * A physical table type built from the results of the custom SQL query.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-physicaltable.html#cfn-quicksight-dataset-physicaltable-customsql)
       */
      override fun customSql(): Any? = unwrap(this).getCustomSql()

      /**
       * A physical table type for relational data sources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-physicaltable.html#cfn-quicksight-dataset-physicaltable-relationaltable)
       */
      override fun relationalTable(): Any? = unwrap(this).getRelationalTable()

      /**
       * A physical table type for as S3 data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-physicaltable.html#cfn-quicksight-dataset-physicaltable-s3source)
       */
      override fun s3Source(): Any? = unwrap(this).getS3Source()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PhysicalTableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.PhysicalTableProperty):
          PhysicalTableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PhysicalTableProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.PhysicalTableProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.PhysicalTableProperty
    }
  }

  /**
   * A transform operation that tags a column with additional information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TagColumnOperationProperty tagColumnOperationProperty = TagColumnOperationProperty.builder()
   * .columnName("columnName")
   * .tags(List.of(ColumnTagProperty.builder()
   * .columnDescription(ColumnDescriptionProperty.builder()
   * .text("text")
   * .build())
   * .columnGeographicRole("columnGeographicRole")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-tagcolumnoperation.html)
   */
  public interface TagColumnOperationProperty {
    /**
     * The column that this operation acts on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-tagcolumnoperation.html#cfn-quicksight-dataset-tagcolumnoperation-columnname)
     */
    public fun columnName(): String

    /**
     * The dataset column tag, currently only used for geospatial type tagging.
     *
     *
     * This is not tags for the AWS tagging feature.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-tagcolumnoperation.html#cfn-quicksight-dataset-tagcolumnoperation-tags)
     */
    public fun tags(): List<ColumnTagProperty>

    /**
     * A builder for [TagColumnOperationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columnName The column that this operation acts on. 
       */
      public fun columnName(columnName: String)

      /**
       * @param tags The dataset column tag, currently only used for geospatial type tagging. 
       *
       * This is not tags for the AWS tagging feature.
       */
      public fun tags(tags: List<ColumnTagProperty>)

      /**
       * @param tags The dataset column tag, currently only used for geospatial type tagging. 
       *
       * This is not tags for the AWS tagging feature.
       */
      public fun tags(vararg tags: ColumnTagProperty)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty.builder()

      /**
       * @param columnName The column that this operation acts on. 
       */
      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      /**
       * @param tags The dataset column tag, currently only used for geospatial type tagging. 
       *
       * This is not tags for the AWS tagging feature.
       */
      override fun tags(tags: List<ColumnTagProperty>) {
        cdkBuilder.tags(tags.map(ColumnTagProperty::unwrap))
      }

      /**
       * @param tags The dataset column tag, currently only used for geospatial type tagging. 
       *
       * This is not tags for the AWS tagging feature.
       */
      override fun tags(vararg tags: ColumnTagProperty): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty,
    ) : CdkObject(cdkObject), TagColumnOperationProperty {
      /**
       * The column that this operation acts on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-tagcolumnoperation.html#cfn-quicksight-dataset-tagcolumnoperation-columnname)
       */
      override fun columnName(): String = unwrap(this).getColumnName()

      /**
       * The dataset column tag, currently only used for geospatial type tagging.
       *
       *
       * This is not tags for the AWS tagging feature.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-tagcolumnoperation.html#cfn-quicksight-dataset-tagcolumnoperation-tags)
       */
      override fun tags(): List<ColumnTagProperty> =
          unwrap(this).getTags().map(ColumnTagProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagColumnOperationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty):
          TagColumnOperationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagColumnOperationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.TagColumnOperationProperty
    }
  }

  /**
   * A transform operation that renames a column.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * RenameColumnOperationProperty renameColumnOperationProperty =
   * RenameColumnOperationProperty.builder()
   * .columnName("columnName")
   * .newColumnName("newColumnName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-renamecolumnoperation.html)
   */
  public interface RenameColumnOperationProperty {
    /**
     * The name of the column to be renamed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-renamecolumnoperation.html#cfn-quicksight-dataset-renamecolumnoperation-columnname)
     */
    public fun columnName(): String

    /**
     * The new name for the column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-renamecolumnoperation.html#cfn-quicksight-dataset-renamecolumnoperation-newcolumnname)
     */
    public fun newColumnName(): String

    /**
     * A builder for [RenameColumnOperationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columnName The name of the column to be renamed. 
       */
      public fun columnName(columnName: String)

      /**
       * @param newColumnName The new name for the column. 
       */
      public fun newColumnName(newColumnName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty.builder()

      /**
       * @param columnName The name of the column to be renamed. 
       */
      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      /**
       * @param newColumnName The new name for the column. 
       */
      override fun newColumnName(newColumnName: String) {
        cdkBuilder.newColumnName(newColumnName)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty,
    ) : CdkObject(cdkObject), RenameColumnOperationProperty {
      /**
       * The name of the column to be renamed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-renamecolumnoperation.html#cfn-quicksight-dataset-renamecolumnoperation-columnname)
       */
      override fun columnName(): String = unwrap(this).getColumnName()

      /**
       * The new name for the column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-renamecolumnoperation.html#cfn-quicksight-dataset-renamecolumnoperation-newcolumnname)
       */
      override fun newColumnName(): String = unwrap(this).getNewColumnName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RenameColumnOperationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty):
          RenameColumnOperationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RenameColumnOperationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.RenameColumnOperationProperty
    }
  }

  /**
   * Output column.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * OutputColumnProperty outputColumnProperty = OutputColumnProperty.builder()
   * .description("description")
   * .name("name")
   * .subType("subType")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-outputcolumn.html)
   */
  public interface OutputColumnProperty {
    /**
     * A description for a column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-outputcolumn.html#cfn-quicksight-dataset-outputcolumn-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The display name of the column..
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-outputcolumn.html#cfn-quicksight-dataset-outputcolumn-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The sub data type of the column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-outputcolumn.html#cfn-quicksight-dataset-outputcolumn-subtype)
     */
    public fun subType(): String? = unwrap(this).getSubType()

    /**
     * The data type of the column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-outputcolumn.html#cfn-quicksight-dataset-outputcolumn-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [OutputColumnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description A description for a column.
       */
      public fun description(description: String)

      /**
       * @param name The display name of the column..
       */
      public fun name(name: String)

      /**
       * @param subType The sub data type of the column.
       */
      public fun subType(subType: String)

      /**
       * @param type The data type of the column.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.OutputColumnProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.OutputColumnProperty.builder()

      /**
       * @param description A description for a column.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param name The display name of the column..
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param subType The sub data type of the column.
       */
      override fun subType(subType: String) {
        cdkBuilder.subType(subType)
      }

      /**
       * @param type The data type of the column.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet.OutputColumnProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.OutputColumnProperty,
    ) : CdkObject(cdkObject), OutputColumnProperty {
      /**
       * A description for a column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-outputcolumn.html#cfn-quicksight-dataset-outputcolumn-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The display name of the column..
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-outputcolumn.html#cfn-quicksight-dataset-outputcolumn-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The sub data type of the column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-outputcolumn.html#cfn-quicksight-dataset-outputcolumn-subtype)
       */
      override fun subType(): String? = unwrap(this).getSubType()

      /**
       * The data type of the column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-outputcolumn.html#cfn-quicksight-dataset-outputcolumn-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.OutputColumnProperty):
          OutputColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputColumnProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.OutputColumnProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.OutputColumnProperty
    }
  }

  /**
   * The instructions associated with a join.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * JoinInstructionProperty joinInstructionProperty = JoinInstructionProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joininstruction.html)
   */
  public interface JoinInstructionProperty {
    /**
     * Join key properties of the left operand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joininstruction.html#cfn-quicksight-dataset-joininstruction-leftjoinkeyproperties)
     */
    public fun leftJoinKeyProperties(): Any? = unwrap(this).getLeftJoinKeyProperties()

    /**
     * The operand on the left side of a join.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joininstruction.html#cfn-quicksight-dataset-joininstruction-leftoperand)
     */
    public fun leftOperand(): String

    /**
     * The join instructions provided in the `ON` clause of a join.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joininstruction.html#cfn-quicksight-dataset-joininstruction-onclause)
     */
    public fun onClause(): String

    /**
     * Join key properties of the right operand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joininstruction.html#cfn-quicksight-dataset-joininstruction-rightjoinkeyproperties)
     */
    public fun rightJoinKeyProperties(): Any? = unwrap(this).getRightJoinKeyProperties()

    /**
     * The operand on the right side of a join.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joininstruction.html#cfn-quicksight-dataset-joininstruction-rightoperand)
     */
    public fun rightOperand(): String

    /**
     * The type of join that it is.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joininstruction.html#cfn-quicksight-dataset-joininstruction-type)
     */
    public fun type(): String

    /**
     * A builder for [JoinInstructionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param leftJoinKeyProperties Join key properties of the left operand.
       */
      public fun leftJoinKeyProperties(leftJoinKeyProperties: IResolvable)

      /**
       * @param leftJoinKeyProperties Join key properties of the left operand.
       */
      public fun leftJoinKeyProperties(leftJoinKeyProperties: JoinKeyPropertiesProperty)

      /**
       * @param leftJoinKeyProperties Join key properties of the left operand.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f6bf66b353192d5d5f0d33473549da91857329984caf2c9af6d5b962e468cf3")
      public
          fun leftJoinKeyProperties(leftJoinKeyProperties: JoinKeyPropertiesProperty.Builder.() -> Unit)

      /**
       * @param leftOperand The operand on the left side of a join. 
       */
      public fun leftOperand(leftOperand: String)

      /**
       * @param onClause The join instructions provided in the `ON` clause of a join. 
       */
      public fun onClause(onClause: String)

      /**
       * @param rightJoinKeyProperties Join key properties of the right operand.
       */
      public fun rightJoinKeyProperties(rightJoinKeyProperties: IResolvable)

      /**
       * @param rightJoinKeyProperties Join key properties of the right operand.
       */
      public fun rightJoinKeyProperties(rightJoinKeyProperties: JoinKeyPropertiesProperty)

      /**
       * @param rightJoinKeyProperties Join key properties of the right operand.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4672d23539b90c146309955541614b7a84ca676bdc60189367ca70eb534eca8e")
      public
          fun rightJoinKeyProperties(rightJoinKeyProperties: JoinKeyPropertiesProperty.Builder.() -> Unit)

      /**
       * @param rightOperand The operand on the right side of a join. 
       */
      public fun rightOperand(rightOperand: String)

      /**
       * @param type The type of join that it is. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty.builder()

      /**
       * @param leftJoinKeyProperties Join key properties of the left operand.
       */
      override fun leftJoinKeyProperties(leftJoinKeyProperties: IResolvable) {
        cdkBuilder.leftJoinKeyProperties(leftJoinKeyProperties.let(IResolvable::unwrap))
      }

      /**
       * @param leftJoinKeyProperties Join key properties of the left operand.
       */
      override fun leftJoinKeyProperties(leftJoinKeyProperties: JoinKeyPropertiesProperty) {
        cdkBuilder.leftJoinKeyProperties(leftJoinKeyProperties.let(JoinKeyPropertiesProperty::unwrap))
      }

      /**
       * @param leftJoinKeyProperties Join key properties of the left operand.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f6bf66b353192d5d5f0d33473549da91857329984caf2c9af6d5b962e468cf3")
      override
          fun leftJoinKeyProperties(leftJoinKeyProperties: JoinKeyPropertiesProperty.Builder.() -> Unit):
          Unit = leftJoinKeyProperties(JoinKeyPropertiesProperty(leftJoinKeyProperties))

      /**
       * @param leftOperand The operand on the left side of a join. 
       */
      override fun leftOperand(leftOperand: String) {
        cdkBuilder.leftOperand(leftOperand)
      }

      /**
       * @param onClause The join instructions provided in the `ON` clause of a join. 
       */
      override fun onClause(onClause: String) {
        cdkBuilder.onClause(onClause)
      }

      /**
       * @param rightJoinKeyProperties Join key properties of the right operand.
       */
      override fun rightJoinKeyProperties(rightJoinKeyProperties: IResolvable) {
        cdkBuilder.rightJoinKeyProperties(rightJoinKeyProperties.let(IResolvable::unwrap))
      }

      /**
       * @param rightJoinKeyProperties Join key properties of the right operand.
       */
      override fun rightJoinKeyProperties(rightJoinKeyProperties: JoinKeyPropertiesProperty) {
        cdkBuilder.rightJoinKeyProperties(rightJoinKeyProperties.let(JoinKeyPropertiesProperty::unwrap))
      }

      /**
       * @param rightJoinKeyProperties Join key properties of the right operand.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4672d23539b90c146309955541614b7a84ca676bdc60189367ca70eb534eca8e")
      override
          fun rightJoinKeyProperties(rightJoinKeyProperties: JoinKeyPropertiesProperty.Builder.() -> Unit):
          Unit = rightJoinKeyProperties(JoinKeyPropertiesProperty(rightJoinKeyProperties))

      /**
       * @param rightOperand The operand on the right side of a join. 
       */
      override fun rightOperand(rightOperand: String) {
        cdkBuilder.rightOperand(rightOperand)
      }

      /**
       * @param type The type of join that it is. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty,
    ) : CdkObject(cdkObject), JoinInstructionProperty {
      /**
       * Join key properties of the left operand.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joininstruction.html#cfn-quicksight-dataset-joininstruction-leftjoinkeyproperties)
       */
      override fun leftJoinKeyProperties(): Any? = unwrap(this).getLeftJoinKeyProperties()

      /**
       * The operand on the left side of a join.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joininstruction.html#cfn-quicksight-dataset-joininstruction-leftoperand)
       */
      override fun leftOperand(): String = unwrap(this).getLeftOperand()

      /**
       * The join instructions provided in the `ON` clause of a join.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joininstruction.html#cfn-quicksight-dataset-joininstruction-onclause)
       */
      override fun onClause(): String = unwrap(this).getOnClause()

      /**
       * Join key properties of the right operand.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joininstruction.html#cfn-quicksight-dataset-joininstruction-rightjoinkeyproperties)
       */
      override fun rightJoinKeyProperties(): Any? = unwrap(this).getRightJoinKeyProperties()

      /**
       * The operand on the right side of a join.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joininstruction.html#cfn-quicksight-dataset-joininstruction-rightoperand)
       */
      override fun rightOperand(): String = unwrap(this).getRightOperand()

      /**
       * The type of join that it is.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-joininstruction.html#cfn-quicksight-dataset-joininstruction-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JoinInstructionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty):
          JoinInstructionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JoinInstructionProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty
    }
  }

  /**
   * A transform operation that projects columns.
   *
   * Operations that come after a projection can only refer to projected columns.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * ProjectOperationProperty projectOperationProperty = ProjectOperationProperty.builder()
   * .projectedColumns(List.of("projectedColumns"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-projectoperation.html)
   */
  public interface ProjectOperationProperty {
    /**
     * Projected columns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-projectoperation.html#cfn-quicksight-dataset-projectoperation-projectedcolumns)
     */
    public fun projectedColumns(): List<String>

    /**
     * A builder for [ProjectOperationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param projectedColumns Projected columns. 
       */
      public fun projectedColumns(projectedColumns: List<String>)

      /**
       * @param projectedColumns Projected columns. 
       */
      public fun projectedColumns(vararg projectedColumns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty.builder()

      /**
       * @param projectedColumns Projected columns. 
       */
      override fun projectedColumns(projectedColumns: List<String>) {
        cdkBuilder.projectedColumns(projectedColumns)
      }

      /**
       * @param projectedColumns Projected columns. 
       */
      override fun projectedColumns(vararg projectedColumns: String): Unit =
          projectedColumns(projectedColumns.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty,
    ) : CdkObject(cdkObject), ProjectOperationProperty {
      /**
       * Projected columns.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-projectoperation.html#cfn-quicksight-dataset-projectoperation-projectedcolumns)
       */
      override fun projectedColumns(): List<String> = unwrap(this).getProjectedColumns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectOperationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty):
          ProjectOperationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectOperationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.ProjectOperationProperty
    }
  }

  /**
   * A list of default values for a given decimal parameter.
   *
   * This structure only accepts static values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * DecimalDatasetParameterDefaultValuesProperty decimalDatasetParameterDefaultValuesProperty =
   * DecimalDatasetParameterDefaultValuesProperty.builder()
   * .staticValues(List.of(123))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-decimaldatasetparameterdefaultvalues.html)
   */
  public interface DecimalDatasetParameterDefaultValuesProperty {
    /**
     * A list of static default values for a given decimal parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-decimaldatasetparameterdefaultvalues.html#cfn-quicksight-dataset-decimaldatasetparameterdefaultvalues-staticvalues)
     */
    public fun staticValues(): Any? = unwrap(this).getStaticValues()

    /**
     * A builder for [DecimalDatasetParameterDefaultValuesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param staticValues A list of static default values for a given decimal parameter.
       */
      public fun staticValues(staticValues: IResolvable)

      /**
       * @param staticValues A list of static default values for a given decimal parameter.
       */
      public fun staticValues(staticValues: List<Number>)

      /**
       * @param staticValues A list of static default values for a given decimal parameter.
       */
      public fun staticValues(vararg staticValues: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterDefaultValuesProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterDefaultValuesProperty.builder()

      /**
       * @param staticValues A list of static default values for a given decimal parameter.
       */
      override fun staticValues(staticValues: IResolvable) {
        cdkBuilder.staticValues(staticValues.let(IResolvable::unwrap))
      }

      /**
       * @param staticValues A list of static default values for a given decimal parameter.
       */
      override fun staticValues(staticValues: List<Number>) {
        cdkBuilder.staticValues(staticValues)
      }

      /**
       * @param staticValues A list of static default values for a given decimal parameter.
       */
      override fun staticValues(vararg staticValues: Number): Unit =
          staticValues(staticValues.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterDefaultValuesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterDefaultValuesProperty,
    ) : CdkObject(cdkObject), DecimalDatasetParameterDefaultValuesProperty {
      /**
       * A list of static default values for a given decimal parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-decimaldatasetparameterdefaultvalues.html#cfn-quicksight-dataset-decimaldatasetparameterdefaultvalues-staticvalues)
       */
      override fun staticValues(): Any? = unwrap(this).getStaticValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DecimalDatasetParameterDefaultValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterDefaultValuesProperty):
          DecimalDatasetParameterDefaultValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DecimalDatasetParameterDefaultValuesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterDefaultValuesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.DecimalDatasetParameterDefaultValuesProperty
    }
  }

  /**
   * A transform operation that creates calculated columns.
   *
   * Columns created in one such operation form a lexical closure.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * CreateColumnsOperationProperty createColumnsOperationProperty =
   * CreateColumnsOperationProperty.builder()
   * .columns(List.of(CalculatedColumnProperty.builder()
   * .columnId("columnId")
   * .columnName("columnName")
   * .expression("expression")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-createcolumnsoperation.html)
   */
  public interface CreateColumnsOperationProperty {
    /**
     * Calculated columns to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-createcolumnsoperation.html#cfn-quicksight-dataset-createcolumnsoperation-columns)
     */
    public fun columns(): Any

    /**
     * A builder for [CreateColumnsOperationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columns Calculated columns to create. 
       */
      public fun columns(columns: IResolvable)

      /**
       * @param columns Calculated columns to create. 
       */
      public fun columns(columns: List<Any>)

      /**
       * @param columns Calculated columns to create. 
       */
      public fun columns(vararg columns: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty.builder()

      /**
       * @param columns Calculated columns to create. 
       */
      override fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns.let(IResolvable::unwrap))
      }

      /**
       * @param columns Calculated columns to create. 
       */
      override fun columns(columns: List<Any>) {
        cdkBuilder.columns(columns)
      }

      /**
       * @param columns Calculated columns to create. 
       */
      override fun columns(vararg columns: Any): Unit = columns(columns.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty,
    ) : CdkObject(cdkObject), CreateColumnsOperationProperty {
      /**
       * Calculated columns to create.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-createcolumnsoperation.html#cfn-quicksight-dataset-createcolumnsoperation-columns)
       */
      override fun columns(): Any = unwrap(this).getColumns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CreateColumnsOperationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty):
          CreateColumnsOperationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CreateColumnsOperationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty
    }
  }

  /**
   * A physical table type built from the results of the custom SQL query.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * CustomSqlProperty customSqlProperty = CustomSqlProperty.builder()
   * .columns(List.of(InputColumnProperty.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .subType("subType")
   * .build()))
   * .dataSourceArn("dataSourceArn")
   * .name("name")
   * .sqlQuery("sqlQuery")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-customsql.html)
   */
  public interface CustomSqlProperty {
    /**
     * The column schema from the SQL query result set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-customsql.html#cfn-quicksight-dataset-customsql-columns)
     */
    public fun columns(): Any

    /**
     * The Amazon Resource Name (ARN) of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-customsql.html#cfn-quicksight-dataset-customsql-datasourcearn)
     */
    public fun dataSourceArn(): String

    /**
     * A display name for the SQL query result.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-customsql.html#cfn-quicksight-dataset-customsql-name)
     */
    public fun name(): String

    /**
     * The SQL query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-customsql.html#cfn-quicksight-dataset-customsql-sqlquery)
     */
    public fun sqlQuery(): String

    /**
     * A builder for [CustomSqlProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columns The column schema from the SQL query result set. 
       */
      public fun columns(columns: IResolvable)

      /**
       * @param columns The column schema from the SQL query result set. 
       */
      public fun columns(columns: List<Any>)

      /**
       * @param columns The column schema from the SQL query result set. 
       */
      public fun columns(vararg columns: Any)

      /**
       * @param dataSourceArn The Amazon Resource Name (ARN) of the data source. 
       */
      public fun dataSourceArn(dataSourceArn: String)

      /**
       * @param name A display name for the SQL query result. 
       */
      public fun name(name: String)

      /**
       * @param sqlQuery The SQL query. 
       */
      public fun sqlQuery(sqlQuery: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty.builder()

      /**
       * @param columns The column schema from the SQL query result set. 
       */
      override fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns.let(IResolvable::unwrap))
      }

      /**
       * @param columns The column schema from the SQL query result set. 
       */
      override fun columns(columns: List<Any>) {
        cdkBuilder.columns(columns)
      }

      /**
       * @param columns The column schema from the SQL query result set. 
       */
      override fun columns(vararg columns: Any): Unit = columns(columns.toList())

      /**
       * @param dataSourceArn The Amazon Resource Name (ARN) of the data source. 
       */
      override fun dataSourceArn(dataSourceArn: String) {
        cdkBuilder.dataSourceArn(dataSourceArn)
      }

      /**
       * @param name A display name for the SQL query result. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param sqlQuery The SQL query. 
       */
      override fun sqlQuery(sqlQuery: String) {
        cdkBuilder.sqlQuery(sqlQuery)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty,
    ) : CdkObject(cdkObject), CustomSqlProperty {
      /**
       * The column schema from the SQL query result set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-customsql.html#cfn-quicksight-dataset-customsql-columns)
       */
      override fun columns(): Any = unwrap(this).getColumns()

      /**
       * The Amazon Resource Name (ARN) of the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-customsql.html#cfn-quicksight-dataset-customsql-datasourcearn)
       */
      override fun dataSourceArn(): String = unwrap(this).getDataSourceArn()

      /**
       * A display name for the SQL query result.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-customsql.html#cfn-quicksight-dataset-customsql-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The SQL query.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-customsql.html#cfn-quicksight-dataset-customsql-sqlquery)
       */
      override fun sqlQuery(): String = unwrap(this).getSqlQuery()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomSqlProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty):
          CustomSqlProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomSqlProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty
    }
  }

  /**
   * The lookback window setup of an incremental refresh configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * LookbackWindowProperty lookbackWindowProperty = LookbackWindowProperty.builder()
   * .columnName("columnName")
   * .size(123)
   * .sizeUnit("sizeUnit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-lookbackwindow.html)
   */
  public interface LookbackWindowProperty {
    /**
     * The name of the lookback window column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-lookbackwindow.html#cfn-quicksight-dataset-lookbackwindow-columnname)
     */
    public fun columnName(): String? = unwrap(this).getColumnName()

    /**
     * The lookback window column size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-lookbackwindow.html#cfn-quicksight-dataset-lookbackwindow-size)
     */
    public fun size(): Number? = unwrap(this).getSize()

    /**
     * The size unit that is used for the lookback window column.
     *
     * Valid values for this structure are `HOUR` , `DAY` , and `WEEK` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-lookbackwindow.html#cfn-quicksight-dataset-lookbackwindow-sizeunit)
     */
    public fun sizeUnit(): String? = unwrap(this).getSizeUnit()

    /**
     * A builder for [LookbackWindowProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columnName The name of the lookback window column.
       */
      public fun columnName(columnName: String)

      /**
       * @param size The lookback window column size.
       */
      public fun size(size: Number)

      /**
       * @param sizeUnit The size unit that is used for the lookback window column.
       * Valid values for this structure are `HOUR` , `DAY` , and `WEEK` .
       */
      public fun sizeUnit(sizeUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.LookbackWindowProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.LookbackWindowProperty.builder()

      /**
       * @param columnName The name of the lookback window column.
       */
      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      /**
       * @param size The lookback window column size.
       */
      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      /**
       * @param sizeUnit The size unit that is used for the lookback window column.
       * Valid values for this structure are `HOUR` , `DAY` , and `WEEK` .
       */
      override fun sizeUnit(sizeUnit: String) {
        cdkBuilder.sizeUnit(sizeUnit)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.LookbackWindowProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.LookbackWindowProperty,
    ) : CdkObject(cdkObject), LookbackWindowProperty {
      /**
       * The name of the lookback window column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-lookbackwindow.html#cfn-quicksight-dataset-lookbackwindow-columnname)
       */
      override fun columnName(): String? = unwrap(this).getColumnName()

      /**
       * The lookback window column size.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-lookbackwindow.html#cfn-quicksight-dataset-lookbackwindow-size)
       */
      override fun size(): Number? = unwrap(this).getSize()

      /**
       * The size unit that is used for the lookback window column.
       *
       * Valid values for this structure are `HOUR` , `DAY` , and `WEEK` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-lookbackwindow.html#cfn-quicksight-dataset-lookbackwindow-sizeunit)
       */
      override fun sizeUnit(): String? = unwrap(this).getSizeUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LookbackWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.LookbackWindowProperty):
          LookbackWindowProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LookbackWindowProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.LookbackWindowProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.LookbackWindowProperty
    }
  }

  /**
   * A string parameter that is created in the dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * StringDatasetParameterProperty stringDatasetParameterProperty =
   * StringDatasetParameterProperty.builder()
   * .id("id")
   * .name("name")
   * .valueType("valueType")
   * // the properties below are optional
   * .defaultValues(StringDatasetParameterDefaultValuesProperty.builder()
   * .staticValues(List.of("staticValues"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-stringdatasetparameter.html)
   */
  public interface StringDatasetParameterProperty {
    /**
     * A list of default values for a given string dataset parameter type.
     *
     * This structure only accepts static values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-stringdatasetparameter.html#cfn-quicksight-dataset-stringdatasetparameter-defaultvalues)
     */
    public fun defaultValues(): Any? = unwrap(this).getDefaultValues()

    /**
     * An identifier for the string parameter that is created in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-stringdatasetparameter.html#cfn-quicksight-dataset-stringdatasetparameter-id)
     */
    public fun id(): String

    /**
     * The name of the string parameter that is created in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-stringdatasetparameter.html#cfn-quicksight-dataset-stringdatasetparameter-name)
     */
    public fun name(): String

    /**
     * The value type of the dataset parameter.
     *
     * Valid values are `single value` or `multi value` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-stringdatasetparameter.html#cfn-quicksight-dataset-stringdatasetparameter-valuetype)
     */
    public fun valueType(): String

    /**
     * A builder for [StringDatasetParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultValues A list of default values for a given string dataset parameter type.
       * This structure only accepts static values.
       */
      public fun defaultValues(defaultValues: IResolvable)

      /**
       * @param defaultValues A list of default values for a given string dataset parameter type.
       * This structure only accepts static values.
       */
      public fun defaultValues(defaultValues: StringDatasetParameterDefaultValuesProperty)

      /**
       * @param defaultValues A list of default values for a given string dataset parameter type.
       * This structure only accepts static values.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b730fe8fa5c0757a1266803319e3af2848421d9dbf9ce8d93af1f6b8fbffd1c")
      public
          fun defaultValues(defaultValues: StringDatasetParameterDefaultValuesProperty.Builder.() -> Unit)

      /**
       * @param id An identifier for the string parameter that is created in the dataset. 
       */
      public fun id(id: String)

      /**
       * @param name The name of the string parameter that is created in the dataset. 
       */
      public fun name(name: String)

      /**
       * @param valueType The value type of the dataset parameter. 
       * Valid values are `single value` or `multi value` .
       */
      public fun valueType(valueType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterProperty.builder()

      /**
       * @param defaultValues A list of default values for a given string dataset parameter type.
       * This structure only accepts static values.
       */
      override fun defaultValues(defaultValues: IResolvable) {
        cdkBuilder.defaultValues(defaultValues.let(IResolvable::unwrap))
      }

      /**
       * @param defaultValues A list of default values for a given string dataset parameter type.
       * This structure only accepts static values.
       */
      override fun defaultValues(defaultValues: StringDatasetParameterDefaultValuesProperty) {
        cdkBuilder.defaultValues(defaultValues.let(StringDatasetParameterDefaultValuesProperty::unwrap))
      }

      /**
       * @param defaultValues A list of default values for a given string dataset parameter type.
       * This structure only accepts static values.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b730fe8fa5c0757a1266803319e3af2848421d9dbf9ce8d93af1f6b8fbffd1c")
      override
          fun defaultValues(defaultValues: StringDatasetParameterDefaultValuesProperty.Builder.() -> Unit):
          Unit = defaultValues(StringDatasetParameterDefaultValuesProperty(defaultValues))

      /**
       * @param id An identifier for the string parameter that is created in the dataset. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param name The name of the string parameter that is created in the dataset. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param valueType The value type of the dataset parameter. 
       * Valid values are `single value` or `multi value` .
       */
      override fun valueType(valueType: String) {
        cdkBuilder.valueType(valueType)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterProperty,
    ) : CdkObject(cdkObject), StringDatasetParameterProperty {
      /**
       * A list of default values for a given string dataset parameter type.
       *
       * This structure only accepts static values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-stringdatasetparameter.html#cfn-quicksight-dataset-stringdatasetparameter-defaultvalues)
       */
      override fun defaultValues(): Any? = unwrap(this).getDefaultValues()

      /**
       * An identifier for the string parameter that is created in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-stringdatasetparameter.html#cfn-quicksight-dataset-stringdatasetparameter-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The name of the string parameter that is created in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-stringdatasetparameter.html#cfn-quicksight-dataset-stringdatasetparameter-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The value type of the dataset parameter.
       *
       * Valid values are `single value` or `multi value` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-stringdatasetparameter.html#cfn-quicksight-dataset-stringdatasetparameter-valuetype)
       */
      override fun valueType(): String = unwrap(this).getValueType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StringDatasetParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterProperty):
          StringDatasetParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StringDatasetParameterProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.StringDatasetParameterProperty
    }
  }

  /**
   * Information about the source of a logical table.
   *
   * This is a variant type structure. For this structure to be valid, only one of the attributes
   * can be non-null.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * LogicalTableSourceProperty logicalTableSourceProperty = LogicalTableSourceProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-logicaltablesource.html)
   */
  public interface LogicalTableSourceProperty {
    /**
     * The Amazon Resource Number (ARN) of the parent dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-logicaltablesource.html#cfn-quicksight-dataset-logicaltablesource-datasetarn)
     */
    public fun dataSetArn(): String? = unwrap(this).getDataSetArn()

    /**
     * Specifies the result of a join of two logical tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-logicaltablesource.html#cfn-quicksight-dataset-logicaltablesource-joininstruction)
     */
    public fun joinInstruction(): Any? = unwrap(this).getJoinInstruction()

    /**
     * Physical table ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-logicaltablesource.html#cfn-quicksight-dataset-logicaltablesource-physicaltableid)
     */
    public fun physicalTableId(): String? = unwrap(this).getPhysicalTableId()

    /**
     * A builder for [LogicalTableSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataSetArn The Amazon Resource Number (ARN) of the parent dataset.
       */
      public fun dataSetArn(dataSetArn: String)

      /**
       * @param joinInstruction Specifies the result of a join of two logical tables.
       */
      public fun joinInstruction(joinInstruction: IResolvable)

      /**
       * @param joinInstruction Specifies the result of a join of two logical tables.
       */
      public fun joinInstruction(joinInstruction: JoinInstructionProperty)

      /**
       * @param joinInstruction Specifies the result of a join of two logical tables.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7ea6b5366702ab36457018199798fdc810eae14d8d5cdaf970720af73cb2df5")
      public fun joinInstruction(joinInstruction: JoinInstructionProperty.Builder.() -> Unit)

      /**
       * @param physicalTableId Physical table ID.
       */
      public fun physicalTableId(physicalTableId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty.builder()

      /**
       * @param dataSetArn The Amazon Resource Number (ARN) of the parent dataset.
       */
      override fun dataSetArn(dataSetArn: String) {
        cdkBuilder.dataSetArn(dataSetArn)
      }

      /**
       * @param joinInstruction Specifies the result of a join of two logical tables.
       */
      override fun joinInstruction(joinInstruction: IResolvable) {
        cdkBuilder.joinInstruction(joinInstruction.let(IResolvable::unwrap))
      }

      /**
       * @param joinInstruction Specifies the result of a join of two logical tables.
       */
      override fun joinInstruction(joinInstruction: JoinInstructionProperty) {
        cdkBuilder.joinInstruction(joinInstruction.let(JoinInstructionProperty::unwrap))
      }

      /**
       * @param joinInstruction Specifies the result of a join of two logical tables.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7ea6b5366702ab36457018199798fdc810eae14d8d5cdaf970720af73cb2df5")
      override fun joinInstruction(joinInstruction: JoinInstructionProperty.Builder.() -> Unit):
          Unit = joinInstruction(JoinInstructionProperty(joinInstruction))

      /**
       * @param physicalTableId Physical table ID.
       */
      override fun physicalTableId(physicalTableId: String) {
        cdkBuilder.physicalTableId(physicalTableId)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty,
    ) : CdkObject(cdkObject), LogicalTableSourceProperty {
      /**
       * The Amazon Resource Number (ARN) of the parent dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-logicaltablesource.html#cfn-quicksight-dataset-logicaltablesource-datasetarn)
       */
      override fun dataSetArn(): String? = unwrap(this).getDataSetArn()

      /**
       * Specifies the result of a join of two logical tables.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-logicaltablesource.html#cfn-quicksight-dataset-logicaltablesource-joininstruction)
       */
      override fun joinInstruction(): Any? = unwrap(this).getJoinInstruction()

      /**
       * Physical table ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-logicaltablesource.html#cfn-quicksight-dataset-logicaltablesource-physicaltableid)
       */
      override fun physicalTableId(): String? = unwrap(this).getPhysicalTableId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogicalTableSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty):
          LogicalTableSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogicalTableSourceProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty
    }
  }

  /**
   * A date time parameter that is created in the dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * DateTimeDatasetParameterProperty dateTimeDatasetParameterProperty =
   * DateTimeDatasetParameterProperty.builder()
   * .id("id")
   * .name("name")
   * .valueType("valueType")
   * // the properties below are optional
   * .defaultValues(DateTimeDatasetParameterDefaultValuesProperty.builder()
   * .staticValues(List.of("staticValues"))
   * .build())
   * .timeGranularity("timeGranularity")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datetimedatasetparameter.html)
   */
  public interface DateTimeDatasetParameterProperty {
    /**
     * A list of default values for a given date time parameter.
     *
     * This structure only accepts static values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datetimedatasetparameter.html#cfn-quicksight-dataset-datetimedatasetparameter-defaultvalues)
     */
    public fun defaultValues(): Any? = unwrap(this).getDefaultValues()

    /**
     * An identifier for the parameter that is created in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datetimedatasetparameter.html#cfn-quicksight-dataset-datetimedatasetparameter-id)
     */
    public fun id(): String

    /**
     * The name of the date time parameter that is created in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datetimedatasetparameter.html#cfn-quicksight-dataset-datetimedatasetparameter-name)
     */
    public fun name(): String

    /**
     * The time granularity of the date time parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datetimedatasetparameter.html#cfn-quicksight-dataset-datetimedatasetparameter-timegranularity)
     */
    public fun timeGranularity(): String? = unwrap(this).getTimeGranularity()

    /**
     * The value type of the dataset parameter.
     *
     * Valid values are `single value` or `multi value` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datetimedatasetparameter.html#cfn-quicksight-dataset-datetimedatasetparameter-valuetype)
     */
    public fun valueType(): String

    /**
     * A builder for [DateTimeDatasetParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultValues A list of default values for a given date time parameter.
       * This structure only accepts static values.
       */
      public fun defaultValues(defaultValues: IResolvable)

      /**
       * @param defaultValues A list of default values for a given date time parameter.
       * This structure only accepts static values.
       */
      public fun defaultValues(defaultValues: DateTimeDatasetParameterDefaultValuesProperty)

      /**
       * @param defaultValues A list of default values for a given date time parameter.
       * This structure only accepts static values.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("18c7ba88abd5d85c222d29ce524830651a4b6470b535202ff31fcd450f7e03c7")
      public
          fun defaultValues(defaultValues: DateTimeDatasetParameterDefaultValuesProperty.Builder.() -> Unit)

      /**
       * @param id An identifier for the parameter that is created in the dataset. 
       */
      public fun id(id: String)

      /**
       * @param name The name of the date time parameter that is created in the dataset. 
       */
      public fun name(name: String)

      /**
       * @param timeGranularity The time granularity of the date time parameter.
       */
      public fun timeGranularity(timeGranularity: String)

      /**
       * @param valueType The value type of the dataset parameter. 
       * Valid values are `single value` or `multi value` .
       */
      public fun valueType(valueType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterProperty.builder()

      /**
       * @param defaultValues A list of default values for a given date time parameter.
       * This structure only accepts static values.
       */
      override fun defaultValues(defaultValues: IResolvable) {
        cdkBuilder.defaultValues(defaultValues.let(IResolvable::unwrap))
      }

      /**
       * @param defaultValues A list of default values for a given date time parameter.
       * This structure only accepts static values.
       */
      override fun defaultValues(defaultValues: DateTimeDatasetParameterDefaultValuesProperty) {
        cdkBuilder.defaultValues(defaultValues.let(DateTimeDatasetParameterDefaultValuesProperty::unwrap))
      }

      /**
       * @param defaultValues A list of default values for a given date time parameter.
       * This structure only accepts static values.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("18c7ba88abd5d85c222d29ce524830651a4b6470b535202ff31fcd450f7e03c7")
      override
          fun defaultValues(defaultValues: DateTimeDatasetParameterDefaultValuesProperty.Builder.() -> Unit):
          Unit = defaultValues(DateTimeDatasetParameterDefaultValuesProperty(defaultValues))

      /**
       * @param id An identifier for the parameter that is created in the dataset. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param name The name of the date time parameter that is created in the dataset. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param timeGranularity The time granularity of the date time parameter.
       */
      override fun timeGranularity(timeGranularity: String) {
        cdkBuilder.timeGranularity(timeGranularity)
      }

      /**
       * @param valueType The value type of the dataset parameter. 
       * Valid values are `single value` or `multi value` .
       */
      override fun valueType(valueType: String) {
        cdkBuilder.valueType(valueType)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterProperty,
    ) : CdkObject(cdkObject), DateTimeDatasetParameterProperty {
      /**
       * A list of default values for a given date time parameter.
       *
       * This structure only accepts static values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datetimedatasetparameter.html#cfn-quicksight-dataset-datetimedatasetparameter-defaultvalues)
       */
      override fun defaultValues(): Any? = unwrap(this).getDefaultValues()

      /**
       * An identifier for the parameter that is created in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datetimedatasetparameter.html#cfn-quicksight-dataset-datetimedatasetparameter-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The name of the date time parameter that is created in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datetimedatasetparameter.html#cfn-quicksight-dataset-datetimedatasetparameter-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The time granularity of the date time parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datetimedatasetparameter.html#cfn-quicksight-dataset-datetimedatasetparameter-timegranularity)
       */
      override fun timeGranularity(): String? = unwrap(this).getTimeGranularity()

      /**
       * The value type of the dataset parameter.
       *
       * Valid values are `single value` or `multi value` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-datetimedatasetparameter.html#cfn-quicksight-dataset-datetimedatasetparameter-valuetype)
       */
      override fun valueType(): String = unwrap(this).getValueType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DateTimeDatasetParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterProperty):
          DateTimeDatasetParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DateTimeDatasetParameterProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.DateTimeDatasetParameterProperty
    }
  }

  /**
   * A list of default values for a given integer parameter.
   *
   * This structure only accepts static values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * IntegerDatasetParameterDefaultValuesProperty integerDatasetParameterDefaultValuesProperty =
   * IntegerDatasetParameterDefaultValuesProperty.builder()
   * .staticValues(List.of(123))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-integerdatasetparameterdefaultvalues.html)
   */
  public interface IntegerDatasetParameterDefaultValuesProperty {
    /**
     * A list of static default values for a given integer parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-integerdatasetparameterdefaultvalues.html#cfn-quicksight-dataset-integerdatasetparameterdefaultvalues-staticvalues)
     */
    public fun staticValues(): Any? = unwrap(this).getStaticValues()

    /**
     * A builder for [IntegerDatasetParameterDefaultValuesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param staticValues A list of static default values for a given integer parameter.
       */
      public fun staticValues(staticValues: IResolvable)

      /**
       * @param staticValues A list of static default values for a given integer parameter.
       */
      public fun staticValues(staticValues: List<Number>)

      /**
       * @param staticValues A list of static default values for a given integer parameter.
       */
      public fun staticValues(vararg staticValues: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterDefaultValuesProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterDefaultValuesProperty.builder()

      /**
       * @param staticValues A list of static default values for a given integer parameter.
       */
      override fun staticValues(staticValues: IResolvable) {
        cdkBuilder.staticValues(staticValues.let(IResolvable::unwrap))
      }

      /**
       * @param staticValues A list of static default values for a given integer parameter.
       */
      override fun staticValues(staticValues: List<Number>) {
        cdkBuilder.staticValues(staticValues)
      }

      /**
       * @param staticValues A list of static default values for a given integer parameter.
       */
      override fun staticValues(vararg staticValues: Number): Unit =
          staticValues(staticValues.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterDefaultValuesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterDefaultValuesProperty,
    ) : CdkObject(cdkObject), IntegerDatasetParameterDefaultValuesProperty {
      /**
       * A list of static default values for a given integer parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-integerdatasetparameterdefaultvalues.html#cfn-quicksight-dataset-integerdatasetparameterdefaultvalues-staticvalues)
       */
      override fun staticValues(): Any? = unwrap(this).getStaticValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IntegerDatasetParameterDefaultValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterDefaultValuesProperty):
          IntegerDatasetParameterDefaultValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegerDatasetParameterDefaultValuesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterDefaultValuesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.IntegerDatasetParameterDefaultValuesProperty
    }
  }

  /**
   * The refresh configuration of a dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * RefreshConfigurationProperty refreshConfigurationProperty =
   * RefreshConfigurationProperty.builder()
   * .incrementalRefresh(IncrementalRefreshProperty.builder()
   * .lookbackWindow(LookbackWindowProperty.builder()
   * .columnName("columnName")
   * .size(123)
   * .sizeUnit("sizeUnit")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-refreshconfiguration.html)
   */
  public interface RefreshConfigurationProperty {
    /**
     * The incremental refresh for the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-refreshconfiguration.html#cfn-quicksight-dataset-refreshconfiguration-incrementalrefresh)
     */
    public fun incrementalRefresh(): Any? = unwrap(this).getIncrementalRefresh()

    /**
     * A builder for [RefreshConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param incrementalRefresh The incremental refresh for the dataset.
       */
      public fun incrementalRefresh(incrementalRefresh: IResolvable)

      /**
       * @param incrementalRefresh The incremental refresh for the dataset.
       */
      public fun incrementalRefresh(incrementalRefresh: IncrementalRefreshProperty)

      /**
       * @param incrementalRefresh The incremental refresh for the dataset.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cc1ee90b75ae38ef3dc53f2ef608e46b7e5bb8603b5a23b41319b65fd5c3eed")
      public
          fun incrementalRefresh(incrementalRefresh: IncrementalRefreshProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RefreshConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSet.RefreshConfigurationProperty.builder()

      /**
       * @param incrementalRefresh The incremental refresh for the dataset.
       */
      override fun incrementalRefresh(incrementalRefresh: IResolvable) {
        cdkBuilder.incrementalRefresh(incrementalRefresh.let(IResolvable::unwrap))
      }

      /**
       * @param incrementalRefresh The incremental refresh for the dataset.
       */
      override fun incrementalRefresh(incrementalRefresh: IncrementalRefreshProperty) {
        cdkBuilder.incrementalRefresh(incrementalRefresh.let(IncrementalRefreshProperty::unwrap))
      }

      /**
       * @param incrementalRefresh The incremental refresh for the dataset.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cc1ee90b75ae38ef3dc53f2ef608e46b7e5bb8603b5a23b41319b65fd5c3eed")
      override
          fun incrementalRefresh(incrementalRefresh: IncrementalRefreshProperty.Builder.() -> Unit):
          Unit = incrementalRefresh(IncrementalRefreshProperty(incrementalRefresh))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSet.RefreshConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSet.RefreshConfigurationProperty,
    ) : CdkObject(cdkObject), RefreshConfigurationProperty {
      /**
       * The incremental refresh for the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-refreshconfiguration.html#cfn-quicksight-dataset-refreshconfiguration-incrementalrefresh)
       */
      override fun incrementalRefresh(): Any? = unwrap(this).getIncrementalRefresh()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RefreshConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSet.RefreshConfigurationProperty):
          RefreshConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RefreshConfigurationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSet.RefreshConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnDataSet.RefreshConfigurationProperty
    }
  }
}
