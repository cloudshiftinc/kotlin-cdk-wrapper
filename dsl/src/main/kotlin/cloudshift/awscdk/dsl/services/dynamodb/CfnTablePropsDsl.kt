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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnTable
import software.amazon.awscdk.services.dynamodb.CfnTableProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTablePropsDsl {
    private val cdkBuilder: CfnTableProps.Builder = CfnTableProps.builder()

    private val _attributeDefinitions: MutableList<Any> = mutableListOf()

    private val _globalSecondaryIndexes: MutableList<Any> = mutableListOf()

    private val _keySchema: MutableList<Any> = mutableListOf()

    private val _localSecondaryIndexes: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun attributeDefinitions(vararg attributeDefinitions: Any) {
        _attributeDefinitions.addAll(listOf(*attributeDefinitions))
    }

    public fun attributeDefinitions(attributeDefinitions: Collection<Any>) {
        _attributeDefinitions.addAll(attributeDefinitions)
    }

    public fun attributeDefinitions(attributeDefinitions: IResolvable) {
        cdkBuilder.attributeDefinitions(attributeDefinitions)
    }

    public fun billingMode(billingMode: String) {
        cdkBuilder.billingMode(billingMode)
    }

    public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification)
    }

    public fun contributorInsightsSpecification(contributorInsightsSpecification: CfnTable.ContributorInsightsSpecificationProperty) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification)
    }

    public fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean) {
        cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled)
    }

    public fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable) {
        cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled)
    }

    public fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any) {
        _globalSecondaryIndexes.addAll(listOf(*globalSecondaryIndexes))
    }

    public fun globalSecondaryIndexes(globalSecondaryIndexes: Collection<Any>) {
        _globalSecondaryIndexes.addAll(globalSecondaryIndexes)
    }

    public fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable) {
        cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes)
    }

    public fun importSourceSpecification(importSourceSpecification: IResolvable) {
        cdkBuilder.importSourceSpecification(importSourceSpecification)
    }

    public fun importSourceSpecification(importSourceSpecification: CfnTable.ImportSourceSpecificationProperty) {
        cdkBuilder.importSourceSpecification(importSourceSpecification)
    }

    public fun keySchema(vararg keySchema: Any) {
        _keySchema.addAll(listOf(*keySchema))
    }

    public fun keySchema(keySchema: Collection<Any>) {
        _keySchema.addAll(keySchema)
    }

    public fun keySchema(keySchema: IResolvable) {
        cdkBuilder.keySchema(keySchema)
    }

    public fun kinesisStreamSpecification(kinesisStreamSpecification: IResolvable) {
        cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification)
    }

    public fun kinesisStreamSpecification(kinesisStreamSpecification: CfnTable.KinesisStreamSpecificationProperty) {
        cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification)
    }

    public fun localSecondaryIndexes(vararg localSecondaryIndexes: Any) {
        _localSecondaryIndexes.addAll(listOf(*localSecondaryIndexes))
    }

    public fun localSecondaryIndexes(localSecondaryIndexes: Collection<Any>) {
        _localSecondaryIndexes.addAll(localSecondaryIndexes)
    }

    public fun localSecondaryIndexes(localSecondaryIndexes: IResolvable) {
        cdkBuilder.localSecondaryIndexes(localSecondaryIndexes)
    }

    public fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: IResolvable) {
        cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification)
    }

    public fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: CfnTable.PointInTimeRecoverySpecificationProperty) {
        cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification)
    }

    public fun provisionedThroughput(provisionedThroughput: IResolvable) {
        cdkBuilder.provisionedThroughput(provisionedThroughput)
    }

    public fun provisionedThroughput(provisionedThroughput: CfnTable.ProvisionedThroughputProperty) {
        cdkBuilder.provisionedThroughput(provisionedThroughput)
    }

    public fun sseSpecification(sseSpecification: IResolvable) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    public fun sseSpecification(sseSpecification: CfnTable.SSESpecificationProperty) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    public fun streamSpecification(streamSpecification: IResolvable) {
        cdkBuilder.streamSpecification(streamSpecification)
    }

    public fun streamSpecification(streamSpecification: CfnTable.StreamSpecificationProperty) {
        cdkBuilder.streamSpecification(streamSpecification)
    }

    public fun tableClass(tableClass: String) {
        cdkBuilder.tableClass(tableClass)
    }

    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun timeToLiveSpecification(timeToLiveSpecification: IResolvable) {
        cdkBuilder.timeToLiveSpecification(timeToLiveSpecification)
    }

    public fun timeToLiveSpecification(timeToLiveSpecification: CfnTable.TimeToLiveSpecificationProperty) {
        cdkBuilder.timeToLiveSpecification(timeToLiveSpecification)
    }

    public fun build(): CfnTableProps {
        if (_attributeDefinitions.isNotEmpty()) cdkBuilder.attributeDefinitions(_attributeDefinitions)
        if (_globalSecondaryIndexes.isNotEmpty()) {
            cdkBuilder.globalSecondaryIndexes(_globalSecondaryIndexes)
        }
        if (_keySchema.isNotEmpty()) cdkBuilder.keySchema(_keySchema)
        if (_localSecondaryIndexes.isNotEmpty()) cdkBuilder.localSecondaryIndexes(_localSecondaryIndexes)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
