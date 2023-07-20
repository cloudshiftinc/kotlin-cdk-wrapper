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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGlobalTableDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGlobalTable.Builder = CfnGlobalTable.Builder.create(scope, id)

    private val _attributeDefinitions: MutableList<Any> = mutableListOf()

    private val _globalSecondaryIndexes: MutableList<Any> = mutableListOf()

    private val _keySchema: MutableList<Any> = mutableListOf()

    private val _localSecondaryIndexes: MutableList<Any> = mutableListOf()

    private val _replicas: MutableList<Any> = mutableListOf()

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

    public fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any) {
        _globalSecondaryIndexes.addAll(listOf(*globalSecondaryIndexes))
    }

    public fun globalSecondaryIndexes(globalSecondaryIndexes: Collection<Any>) {
        _globalSecondaryIndexes.addAll(globalSecondaryIndexes)
    }

    public fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable) {
        cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes)
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

    public fun localSecondaryIndexes(vararg localSecondaryIndexes: Any) {
        _localSecondaryIndexes.addAll(listOf(*localSecondaryIndexes))
    }

    public fun localSecondaryIndexes(localSecondaryIndexes: Collection<Any>) {
        _localSecondaryIndexes.addAll(localSecondaryIndexes)
    }

    public fun localSecondaryIndexes(localSecondaryIndexes: IResolvable) {
        cdkBuilder.localSecondaryIndexes(localSecondaryIndexes)
    }

    public fun replicas(vararg replicas: Any) {
        _replicas.addAll(listOf(*replicas))
    }

    public fun replicas(replicas: Collection<Any>) {
        _replicas.addAll(replicas)
    }

    public fun replicas(replicas: IResolvable) {
        cdkBuilder.replicas(replicas)
    }

    public fun sseSpecification(sseSpecification: IResolvable) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    public fun sseSpecification(sseSpecification: CfnGlobalTable.SSESpecificationProperty) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    public fun streamSpecification(streamSpecification: IResolvable) {
        cdkBuilder.streamSpecification(streamSpecification)
    }

    public fun streamSpecification(streamSpecification: CfnGlobalTable.StreamSpecificationProperty) {
        cdkBuilder.streamSpecification(streamSpecification)
    }

    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun timeToLiveSpecification(timeToLiveSpecification: IResolvable) {
        cdkBuilder.timeToLiveSpecification(timeToLiveSpecification)
    }

    public fun timeToLiveSpecification(timeToLiveSpecification: CfnGlobalTable.TimeToLiveSpecificationProperty) {
        cdkBuilder.timeToLiveSpecification(timeToLiveSpecification)
    }

    public fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: IResolvable) {
        cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings)
    }

    public fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: CfnGlobalTable.WriteProvisionedThroughputSettingsProperty) {
        cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings)
    }

    public fun build(): CfnGlobalTable {
        if (_attributeDefinitions.isNotEmpty()) cdkBuilder.attributeDefinitions(_attributeDefinitions)
        if (_globalSecondaryIndexes.isNotEmpty()) {
            cdkBuilder.globalSecondaryIndexes(_globalSecondaryIndexes)
        }
        if (_keySchema.isNotEmpty()) cdkBuilder.keySchema(_keySchema)
        if (_localSecondaryIndexes.isNotEmpty()) cdkBuilder.localSecondaryIndexes(_localSecondaryIndexes)
        if (_replicas.isNotEmpty()) cdkBuilder.replicas(_replicas)
        return cdkBuilder.build()
    }
}
