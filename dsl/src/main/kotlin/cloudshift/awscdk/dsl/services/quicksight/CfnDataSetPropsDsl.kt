@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet
import software.amazon.awscdk.services.quicksight.CfnDataSetProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSetPropsDsl {
    private val cdkBuilder: CfnDataSetProps.Builder = CfnDataSetProps.builder()

    private val _columnGroups: MutableList<Any> = mutableListOf()

    private val _columnLevelPermissionRules: MutableList<Any> = mutableListOf()

    private val _datasetParameters: MutableList<Any> = mutableListOf()

    private val _permissions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    public fun columnGroups(vararg columnGroups: Any) {
        _columnGroups.addAll(listOf(*columnGroups))
    }

    public fun columnGroups(columnGroups: Collection<Any>) {
        _columnGroups.addAll(columnGroups)
    }

    public fun columnGroups(columnGroups: IResolvable) {
        cdkBuilder.columnGroups(columnGroups)
    }

    public fun columnLevelPermissionRules(vararg columnLevelPermissionRules: Any) {
        _columnLevelPermissionRules.addAll(listOf(*columnLevelPermissionRules))
    }

    public fun columnLevelPermissionRules(columnLevelPermissionRules: Collection<Any>) {
        _columnLevelPermissionRules.addAll(columnLevelPermissionRules)
    }

    public fun columnLevelPermissionRules(columnLevelPermissionRules: IResolvable) {
        cdkBuilder.columnLevelPermissionRules(columnLevelPermissionRules)
    }

    public fun dataSetId(dataSetId: String) {
        cdkBuilder.dataSetId(dataSetId)
    }

    public fun dataSetRefreshProperties(dataSetRefreshProperties: IResolvable) {
        cdkBuilder.dataSetRefreshProperties(dataSetRefreshProperties)
    }

    public fun dataSetRefreshProperties(dataSetRefreshProperties: CfnDataSet.DataSetRefreshPropertiesProperty) {
        cdkBuilder.dataSetRefreshProperties(dataSetRefreshProperties)
    }

    public fun dataSetUsageConfiguration(dataSetUsageConfiguration: IResolvable) {
        cdkBuilder.dataSetUsageConfiguration(dataSetUsageConfiguration)
    }

    public fun dataSetUsageConfiguration(dataSetUsageConfiguration: CfnDataSet.DataSetUsageConfigurationProperty) {
        cdkBuilder.dataSetUsageConfiguration(dataSetUsageConfiguration)
    }

    public fun datasetParameters(vararg datasetParameters: Any) {
        _datasetParameters.addAll(listOf(*datasetParameters))
    }

    public fun datasetParameters(datasetParameters: Collection<Any>) {
        _datasetParameters.addAll(datasetParameters)
    }

    public fun datasetParameters(datasetParameters: IResolvable) {
        cdkBuilder.datasetParameters(datasetParameters)
    }

    public fun fieldFolders(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.fieldFolders(builder.map)
    }

    public fun fieldFolders(fieldFolders: Map<String, Any>) {
        cdkBuilder.fieldFolders(fieldFolders)
    }

    public fun fieldFolders(fieldFolders: IResolvable) {
        cdkBuilder.fieldFolders(fieldFolders)
    }

    public fun importMode(importMode: String) {
        cdkBuilder.importMode(importMode)
    }

    public fun ingestionWaitPolicy(ingestionWaitPolicy: IResolvable) {
        cdkBuilder.ingestionWaitPolicy(ingestionWaitPolicy)
    }

    public fun ingestionWaitPolicy(ingestionWaitPolicy: CfnDataSet.IngestionWaitPolicyProperty) {
        cdkBuilder.ingestionWaitPolicy(ingestionWaitPolicy)
    }

    public fun logicalTableMap(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.logicalTableMap(builder.map)
    }

    public fun logicalTableMap(logicalTableMap: Map<String, Any>) {
        cdkBuilder.logicalTableMap(logicalTableMap)
    }

    public fun logicalTableMap(logicalTableMap: IResolvable) {
        cdkBuilder.logicalTableMap(logicalTableMap)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun permissions(vararg permissions: Any) {
        _permissions.addAll(listOf(*permissions))
    }

    public fun permissions(permissions: Collection<Any>) {
        _permissions.addAll(permissions)
    }

    public fun permissions(permissions: IResolvable) {
        cdkBuilder.permissions(permissions)
    }

    public fun physicalTableMap(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.physicalTableMap(builder.map)
    }

    public fun physicalTableMap(physicalTableMap: Map<String, Any>) {
        cdkBuilder.physicalTableMap(physicalTableMap)
    }

    public fun physicalTableMap(physicalTableMap: IResolvable) {
        cdkBuilder.physicalTableMap(physicalTableMap)
    }

    public fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: IResolvable) {
        cdkBuilder.rowLevelPermissionDataSet(rowLevelPermissionDataSet)
    }

    public fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: CfnDataSet.RowLevelPermissionDataSetProperty) {
        cdkBuilder.rowLevelPermissionDataSet(rowLevelPermissionDataSet)
    }

    public fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: IResolvable) {
        cdkBuilder.rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration)
    }

    public fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: CfnDataSet.RowLevelPermissionTagConfigurationProperty) {
        cdkBuilder.rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDataSetProps {
        if (_columnGroups.isNotEmpty()) cdkBuilder.columnGroups(_columnGroups)
        if (_columnLevelPermissionRules.isNotEmpty()) {
            cdkBuilder.columnLevelPermissionRules(_columnLevelPermissionRules)
        }
        if (_datasetParameters.isNotEmpty()) cdkBuilder.datasetParameters(_datasetParameters)
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
