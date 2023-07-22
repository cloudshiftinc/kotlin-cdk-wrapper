@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet
import software.constructs.Construct

@CdkDslMarker
public class CfnDataSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDataSet.Builder = CfnDataSet.Builder.create(scope, id)

  private val _columnGroups: MutableList<Any> = mutableListOf()

  private val _columnLevelPermissionRules: MutableList<Any> = mutableListOf()

  private val _datasetParameters: MutableList<Any> = mutableListOf()

  private val _permissions: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The AWS account ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-awsaccountid)
   * @param awsAccountId The AWS account ID. 
   */
  public fun awsAccountId(awsAccountId: String) {
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
  public fun columnGroups(vararg columnGroups: Any) {
    _columnGroups.addAll(listOf(*columnGroups))
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
  public fun columnGroups(columnGroups: Collection<Any>) {
    _columnGroups.addAll(columnGroups)
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
  public fun columnGroups(columnGroups: IResolvable) {
    cdkBuilder.columnGroups(columnGroups)
  }

  /**
   * A set of one or more definitions of a `ColumnLevelPermissionRule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columnlevelpermissionrules)
   * @param columnLevelPermissionRules A set of one or more definitions of a
   * `ColumnLevelPermissionRule` . 
   */
  public fun columnLevelPermissionRules(vararg columnLevelPermissionRules: Any) {
    _columnLevelPermissionRules.addAll(listOf(*columnLevelPermissionRules))
  }

  /**
   * A set of one or more definitions of a `ColumnLevelPermissionRule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columnlevelpermissionrules)
   * @param columnLevelPermissionRules A set of one or more definitions of a
   * `ColumnLevelPermissionRule` . 
   */
  public fun columnLevelPermissionRules(columnLevelPermissionRules: Collection<Any>) {
    _columnLevelPermissionRules.addAll(columnLevelPermissionRules)
  }

  /**
   * A set of one or more definitions of a `ColumnLevelPermissionRule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columnlevelpermissionrules)
   * @param columnLevelPermissionRules A set of one or more definitions of a
   * `ColumnLevelPermissionRule` . 
   */
  public fun columnLevelPermissionRules(columnLevelPermissionRules: IResolvable) {
    cdkBuilder.columnLevelPermissionRules(columnLevelPermissionRules)
  }

  /**
   * An ID for the dataset that you want to create.
   *
   * This ID is unique per AWS Region for each AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetid)
   * @param dataSetId An ID for the dataset that you want to create. 
   */
  public fun dataSetId(dataSetId: String) {
    cdkBuilder.dataSetId(dataSetId)
  }

  /**
   * The dataset refresh properties for the dataset.</p>.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetrefreshproperties)
   * @param dataSetRefreshProperties The dataset refresh properties for the dataset.</p>. 
   */
  public fun dataSetRefreshProperties(dataSetRefreshProperties: IResolvable) {
    cdkBuilder.dataSetRefreshProperties(dataSetRefreshProperties)
  }

  /**
   * The dataset refresh properties for the dataset.</p>.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetrefreshproperties)
   * @param dataSetRefreshProperties The dataset refresh properties for the dataset.</p>. 
   */
  public
      fun dataSetRefreshProperties(dataSetRefreshProperties: CfnDataSet.DataSetRefreshPropertiesProperty) {
    cdkBuilder.dataSetRefreshProperties(dataSetRefreshProperties)
  }

  /**
   * The usage configuration to apply to child datasets that reference this dataset as a source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetusageconfiguration)
   * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
   * reference this dataset as a source. 
   */
  public fun dataSetUsageConfiguration(dataSetUsageConfiguration: IResolvable) {
    cdkBuilder.dataSetUsageConfiguration(dataSetUsageConfiguration)
  }

  /**
   * The usage configuration to apply to child datasets that reference this dataset as a source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetusageconfiguration)
   * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
   * reference this dataset as a source. 
   */
  public
      fun dataSetUsageConfiguration(dataSetUsageConfiguration: CfnDataSet.DataSetUsageConfigurationProperty) {
    cdkBuilder.dataSetUsageConfiguration(dataSetUsageConfiguration)
  }

  /**
   * The parameters declared in the dataset.</p>.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetparameters)
   * @param datasetParameters The parameters declared in the dataset.</p>. 
   */
  public fun datasetParameters(vararg datasetParameters: Any) {
    _datasetParameters.addAll(listOf(*datasetParameters))
  }

  /**
   * The parameters declared in the dataset.</p>.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetparameters)
   * @param datasetParameters The parameters declared in the dataset.</p>. 
   */
  public fun datasetParameters(datasetParameters: Collection<Any>) {
    _datasetParameters.addAll(datasetParameters)
  }

  /**
   * The parameters declared in the dataset.</p>.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetparameters)
   * @param datasetParameters The parameters declared in the dataset.</p>. 
   */
  public fun datasetParameters(datasetParameters: IResolvable) {
    cdkBuilder.datasetParameters(datasetParameters)
  }

  /**
   * The folder that contains fields and nested subfolders for your dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-fieldfolders)
   * @param fieldFolders The folder that contains fields and nested subfolders for your dataset. 
   */
  public fun fieldFolders(fieldFolders: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(fieldFolders)
    cdkBuilder.fieldFolders(builder.map)
  }

  /**
   * The folder that contains fields and nested subfolders for your dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-fieldfolders)
   * @param fieldFolders The folder that contains fields and nested subfolders for your dataset. 
   */
  public fun fieldFolders(fieldFolders: Map<String, Any>) {
    cdkBuilder.fieldFolders(fieldFolders)
  }

  /**
   * The folder that contains fields and nested subfolders for your dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-fieldfolders)
   * @param fieldFolders The folder that contains fields and nested subfolders for your dataset. 
   */
  public fun fieldFolders(fieldFolders: IResolvable) {
    cdkBuilder.fieldFolders(fieldFolders)
  }

  /**
   * Indicates whether you want to import the data into SPICE.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-importmode)
   * @param importMode Indicates whether you want to import the data into SPICE. 
   */
  public fun importMode(importMode: String) {
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
  public fun ingestionWaitPolicy(ingestionWaitPolicy: IResolvable) {
    cdkBuilder.ingestionWaitPolicy(ingestionWaitPolicy)
  }

  /**
   * The wait policy to use when creating or updating a Dataset.
   *
   * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-ingestionwaitpolicy)
   * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset. 
   */
  public fun ingestionWaitPolicy(ingestionWaitPolicy: CfnDataSet.IngestionWaitPolicyProperty) {
    cdkBuilder.ingestionWaitPolicy(ingestionWaitPolicy)
  }

  /**
   * Configures the combination and transformation of the data from the physical tables.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-logicaltablemap)
   * @param logicalTableMap Configures the combination and transformation of the data from the
   * physical tables. 
   */
  public fun logicalTableMap(logicalTableMap: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(logicalTableMap)
    cdkBuilder.logicalTableMap(builder.map)
  }

  /**
   * Configures the combination and transformation of the data from the physical tables.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-logicaltablemap)
   * @param logicalTableMap Configures the combination and transformation of the data from the
   * physical tables. 
   */
  public fun logicalTableMap(logicalTableMap: Map<String, Any>) {
    cdkBuilder.logicalTableMap(logicalTableMap)
  }

  /**
   * Configures the combination and transformation of the data from the physical tables.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-logicaltablemap)
   * @param logicalTableMap Configures the combination and transformation of the data from the
   * physical tables. 
   */
  public fun logicalTableMap(logicalTableMap: IResolvable) {
    cdkBuilder.logicalTableMap(logicalTableMap)
  }

  /**
   * The display name for the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-name)
   * @param name The display name for the dataset. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * A list of resource permissions on the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-permissions)
   * @param permissions A list of resource permissions on the dataset. 
   */
  public fun permissions(vararg permissions: Any) {
    _permissions.addAll(listOf(*permissions))
  }

  /**
   * A list of resource permissions on the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-permissions)
   * @param permissions A list of resource permissions on the dataset. 
   */
  public fun permissions(permissions: Collection<Any>) {
    _permissions.addAll(permissions)
  }

  /**
   * A list of resource permissions on the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-permissions)
   * @param permissions A list of resource permissions on the dataset. 
   */
  public fun permissions(permissions: IResolvable) {
    cdkBuilder.permissions(permissions)
  }

  /**
   * Declares the physical tables that are available in the underlying data sources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-physicaltablemap)
   * @param physicalTableMap Declares the physical tables that are available in the underlying data
   * sources. 
   */
  public fun physicalTableMap(physicalTableMap: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(physicalTableMap)
    cdkBuilder.physicalTableMap(builder.map)
  }

  /**
   * Declares the physical tables that are available in the underlying data sources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-physicaltablemap)
   * @param physicalTableMap Declares the physical tables that are available in the underlying data
   * sources. 
   */
  public fun physicalTableMap(physicalTableMap: Map<String, Any>) {
    cdkBuilder.physicalTableMap(physicalTableMap)
  }

  /**
   * Declares the physical tables that are available in the underlying data sources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-physicaltablemap)
   * @param physicalTableMap Declares the physical tables that are available in the underlying data
   * sources. 
   */
  public fun physicalTableMap(physicalTableMap: IResolvable) {
    cdkBuilder.physicalTableMap(physicalTableMap)
  }

  /**
   * The row-level security configuration for the data that you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset)
   * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
   * want to create. 
   */
  public fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: IResolvable) {
    cdkBuilder.rowLevelPermissionDataSet(rowLevelPermissionDataSet)
  }

  /**
   * The row-level security configuration for the data that you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset)
   * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
   * want to create. 
   */
  public
      fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: CfnDataSet.RowLevelPermissionDataSetProperty) {
    cdkBuilder.rowLevelPermissionDataSet(rowLevelPermissionDataSet)
  }

  /**
   * The element you can use to define tags for row-level security.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiontagconfiguration)
   * @param rowLevelPermissionTagConfiguration The element you can use to define tags for row-level
   * security. 
   */
  public fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: IResolvable) {
    cdkBuilder.rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration)
  }

  /**
   * The element you can use to define tags for row-level security.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiontagconfiguration)
   * @param rowLevelPermissionTagConfiguration The element you can use to define tags for row-level
   * security. 
   */
  public
      fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: CfnDataSet.RowLevelPermissionTagConfigurationProperty) {
    cdkBuilder.rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration)
  }

  /**
   * Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-tags)
   * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to the
   * dataset. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-tags)
   * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to the
   * dataset. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDataSet {
    if(_columnGroups.isNotEmpty()) cdkBuilder.columnGroups(_columnGroups)
    if(_columnLevelPermissionRules.isNotEmpty())
        cdkBuilder.columnLevelPermissionRules(_columnLevelPermissionRules)
    if(_datasetParameters.isNotEmpty()) cdkBuilder.datasetParameters(_datasetParameters)
    if(_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
