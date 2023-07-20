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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.BillingMode
import software.amazon.awscdk.services.dynamodb.StreamViewType
import software.amazon.awscdk.services.dynamodb.TableClass
import software.amazon.awscdk.services.dynamodb.TableEncryption
import software.amazon.awscdk.services.dynamodb.TableOptions
import software.amazon.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class TableOptionsDsl {
    private val cdkBuilder: TableOptions.Builder = TableOptions.builder()

    private val _replicationRegions: MutableList<String> = mutableListOf()

    public fun billingMode(billingMode: BillingMode) {
        cdkBuilder.billingMode(billingMode)
    }

    public fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean) {
        cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled)
    }

    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    public fun encryption(encryption: TableEncryption) {
        cdkBuilder.encryption(encryption)
    }

    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun partitionKey(block: AttributeDsl.() -> Unit = {}) {
        val builder = AttributeDsl()
        builder.apply(block)
        cdkBuilder.partitionKey(builder.build())
    }

    public fun partitionKey(partitionKey: Attribute) {
        cdkBuilder.partitionKey(partitionKey)
    }

    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
        cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
    }

    public fun readCapacity(readCapacity: Number) {
        cdkBuilder.readCapacity(readCapacity)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun replicationRegions(vararg replicationRegions: String) {
        _replicationRegions.addAll(listOf(*replicationRegions))
    }

    public fun replicationRegions(replicationRegions: Collection<String>) {
        _replicationRegions.addAll(replicationRegions)
    }

    public fun replicationTimeout(replicationTimeout: Duration) {
        cdkBuilder.replicationTimeout(replicationTimeout)
    }

    public fun sortKey(block: AttributeDsl.() -> Unit = {}) {
        val builder = AttributeDsl()
        builder.apply(block)
        cdkBuilder.sortKey(builder.build())
    }

    public fun sortKey(sortKey: Attribute) {
        cdkBuilder.sortKey(sortKey)
    }

    public fun stream(stream: StreamViewType) {
        cdkBuilder.stream(stream)
    }

    public fun tableClass(tableClass: TableClass) {
        cdkBuilder.tableClass(tableClass)
    }

    public fun timeToLiveAttribute(timeToLiveAttribute: String) {
        cdkBuilder.timeToLiveAttribute(timeToLiveAttribute)
    }

    public fun waitForReplicationToFinish(waitForReplicationToFinish: Boolean) {
        cdkBuilder.waitForReplicationToFinish(waitForReplicationToFinish)
    }

    public fun writeCapacity(writeCapacity: Number) {
        cdkBuilder.writeCapacity(writeCapacity)
    }

    public fun build(): TableOptions {
        if (_replicationRegions.isNotEmpty()) cdkBuilder.replicationRegions(_replicationRegions)
        return cdkBuilder.build()
    }
}
