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
import software.amazon.awscdk.services.quicksight.CfnDataSetProps

@CdkDslMarker
public class CfnDataSetPropsDsl {
  private val cdkBuilder: CfnDataSetProps.Builder = CfnDataSetProps.builder()

  private val _columnGroups: MutableList<Any> = mutableListOf()

  private val _columnLevelPermissionRules: MutableList<Any> = mutableListOf()

  private val _datasetParameters: MutableList<Any> = mutableListOf()

  private val _permissions: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param awsAccountId The AWS account ID.
   */
  public fun awsAccountId(awsAccountId: String) {
    cdkBuilder.awsAccountId(awsAccountId)
  }

  /**
   * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
   * features.
   * Currently, only geospatial hierarchy is supported.
   */
  public fun columnGroups(vararg columnGroups: Any) {
    _columnGroups.addAll(listOf(*columnGroups))
  }

  /**
   * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
   * features.
   * Currently, only geospatial hierarchy is supported.
   */
  public fun columnGroups(columnGroups: Collection<Any>) {
    _columnGroups.addAll(columnGroups)
  }

  /**
   * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
   * features.
   * Currently, only geospatial hierarchy is supported.
   */
  public fun columnGroups(columnGroups: IResolvable) {
    cdkBuilder.columnGroups(columnGroups)
  }

  /**
   * @param columnLevelPermissionRules A set of one or more definitions of a
   * `ColumnLevelPermissionRule` .
   */
  public fun columnLevelPermissionRules(vararg columnLevelPermissionRules: Any) {
    _columnLevelPermissionRules.addAll(listOf(*columnLevelPermissionRules))
  }

  /**
   * @param columnLevelPermissionRules A set of one or more definitions of a
   * `ColumnLevelPermissionRule` .
   */
  public fun columnLevelPermissionRules(columnLevelPermissionRules: Collection<Any>) {
    _columnLevelPermissionRules.addAll(columnLevelPermissionRules)
  }

  /**
   * @param columnLevelPermissionRules A set of one or more definitions of a
   * `ColumnLevelPermissionRule` .
   */
  public fun columnLevelPermissionRules(columnLevelPermissionRules: IResolvable) {
    cdkBuilder.columnLevelPermissionRules(columnLevelPermissionRules)
  }

  /**
   * @param dataSetId An ID for the dataset that you want to create.
   * This ID is unique per AWS Region for each AWS account.
   */
  public fun dataSetId(dataSetId: String) {
    cdkBuilder.dataSetId(dataSetId)
  }

  /**
   * @param dataSetRefreshProperties The dataset refresh properties for the dataset.</p>.
   */
  public fun dataSetRefreshProperties(dataSetRefreshProperties: IResolvable) {
    cdkBuilder.dataSetRefreshProperties(dataSetRefreshProperties)
  }

  /**
   * @param dataSetRefreshProperties The dataset refresh properties for the dataset.</p>.
   */
  public
      fun dataSetRefreshProperties(dataSetRefreshProperties: CfnDataSet.DataSetRefreshPropertiesProperty) {
    cdkBuilder.dataSetRefreshProperties(dataSetRefreshProperties)
  }

  /**
   * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
   * reference this dataset as a source.
   */
  public fun dataSetUsageConfiguration(dataSetUsageConfiguration: IResolvable) {
    cdkBuilder.dataSetUsageConfiguration(dataSetUsageConfiguration)
  }

  /**
   * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
   * reference this dataset as a source.
   */
  public
      fun dataSetUsageConfiguration(dataSetUsageConfiguration: CfnDataSet.DataSetUsageConfigurationProperty) {
    cdkBuilder.dataSetUsageConfiguration(dataSetUsageConfiguration)
  }

  /**
   * @param datasetParameters The parameters declared in the dataset.</p>.
   */
  public fun datasetParameters(vararg datasetParameters: Any) {
    _datasetParameters.addAll(listOf(*datasetParameters))
  }

  /**
   * @param datasetParameters The parameters declared in the dataset.</p>.
   */
  public fun datasetParameters(datasetParameters: Collection<Any>) {
    _datasetParameters.addAll(datasetParameters)
  }

  /**
   * @param datasetParameters The parameters declared in the dataset.</p>.
   */
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

  /**
   * @param importMode Indicates whether you want to import the data into SPICE.
   */
  public fun importMode(importMode: String) {
    cdkBuilder.importMode(importMode)
  }

  /**
   * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset.
   * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
   */
  public fun ingestionWaitPolicy(ingestionWaitPolicy: IResolvable) {
    cdkBuilder.ingestionWaitPolicy(ingestionWaitPolicy)
  }

  /**
   * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset.
   * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
   */
  public fun ingestionWaitPolicy(ingestionWaitPolicy: CfnDataSet.IngestionWaitPolicyProperty) {
    cdkBuilder.ingestionWaitPolicy(ingestionWaitPolicy)
  }

  /**
   * @param logicalTableMap Configures the combination and transformation of the data from the
   * physical tables.
   */
  public fun logicalTableMap(logicalTableMap: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(logicalTableMap)
    cdkBuilder.logicalTableMap(builder.map)
  }

  /**
   * @param logicalTableMap Configures the combination and transformation of the data from the
   * physical tables.
   */
  public fun logicalTableMap(logicalTableMap: Map<String, Any>) {
    cdkBuilder.logicalTableMap(logicalTableMap)
  }

  /**
   * @param logicalTableMap Configures the combination and transformation of the data from the
   * physical tables.
   */
  public fun logicalTableMap(logicalTableMap: IResolvable) {
    cdkBuilder.logicalTableMap(logicalTableMap)
  }

  /**
   * @param name The display name for the dataset.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param permissions A list of resource permissions on the dataset.
   */
  public fun permissions(vararg permissions: Any) {
    _permissions.addAll(listOf(*permissions))
  }

  /**
   * @param permissions A list of resource permissions on the dataset.
   */
  public fun permissions(permissions: Collection<Any>) {
    _permissions.addAll(permissions)
  }

  /**
   * @param permissions A list of resource permissions on the dataset.
   */
  public fun permissions(permissions: IResolvable) {
    cdkBuilder.permissions(permissions)
  }

  /**
   * @param physicalTableMap Declares the physical tables that are available in the underlying data
   * sources.
   */
  public fun physicalTableMap(physicalTableMap: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(physicalTableMap)
    cdkBuilder.physicalTableMap(builder.map)
  }

  /**
   * @param physicalTableMap Declares the physical tables that are available in the underlying data
   * sources.
   */
  public fun physicalTableMap(physicalTableMap: Map<String, Any>) {
    cdkBuilder.physicalTableMap(physicalTableMap)
  }

  /**
   * @param physicalTableMap Declares the physical tables that are available in the underlying data
   * sources.
   */
  public fun physicalTableMap(physicalTableMap: IResolvable) {
    cdkBuilder.physicalTableMap(physicalTableMap)
  }

  /**
   * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
   * want to create.
   */
  public fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: IResolvable) {
    cdkBuilder.rowLevelPermissionDataSet(rowLevelPermissionDataSet)
  }

  /**
   * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
   * want to create.
   */
  public
      fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: CfnDataSet.RowLevelPermissionDataSetProperty) {
    cdkBuilder.rowLevelPermissionDataSet(rowLevelPermissionDataSet)
  }

  /**
   * @param rowLevelPermissionTagConfiguration The element you can use to define tags for row-level
   * security.
   */
  public fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: IResolvable) {
    cdkBuilder.rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration)
  }

  /**
   * @param rowLevelPermissionTagConfiguration The element you can use to define tags for row-level
   * security.
   */
  public
      fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: CfnDataSet.RowLevelPermissionTagConfigurationProperty) {
    cdkBuilder.rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration)
  }

  /**
   * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to the
   * dataset.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to the
   * dataset.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDataSetProps {
    if(_columnGroups.isNotEmpty()) cdkBuilder.columnGroups(_columnGroups)
    if(_columnLevelPermissionRules.isNotEmpty())
        cdkBuilder.columnLevelPermissionRules(_columnLevelPermissionRules)
    if(_datasetParameters.isNotEmpty()) cdkBuilder.datasetParameters(_datasetParameters)
    if(_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
