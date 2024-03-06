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

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.Billing
import software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexPropsV2
import software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps
import software.amazon.awscdk.services.dynamodb.ReplicaTableProps
import software.amazon.awscdk.services.dynamodb.StreamViewType
import software.amazon.awscdk.services.dynamodb.TableClass
import software.amazon.awscdk.services.dynamodb.TableEncryptionV2
import software.amazon.awscdk.services.dynamodb.TableV2
import software.amazon.awscdk.services.kinesis.IStream
import software.constructs.Construct

/**
 * A DynamoDB Table.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.*;
 * App app = new App();
 * Stack stack = Stack.Builder.create(app,
 * "Stack").env(Environment.builder().region("us-west-2").build()).build();
 * TableV2 globalTable = TableV2.Builder.create(stack, "GlobalTable")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * // applys to all replicas, i.e., us-west-2, us-east-1, us-east-2
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .replicas(List.of(ReplicaTableProps.builder().region("us-east-1").build(),
 * ReplicaTableProps.builder().region("us-east-2").build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class TableV2Dsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: TableV2.Builder = TableV2.Builder.create(scope, id)

    private val _globalSecondaryIndexes: MutableList<GlobalSecondaryIndexPropsV2> = mutableListOf()

    private val _localSecondaryIndexes: MutableList<LocalSecondaryIndexProps> = mutableListOf()

    private val _replicas: MutableList<ReplicaTableProps> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The billing mode and capacity settings to apply to the table.
     *
     * Default: Billing.onDemand()
     *
     * @param billing The billing mode and capacity settings to apply to the table.
     */
    public fun billing(billing: Billing) {
        cdkBuilder.billing(billing)
    }

    /**
     * Whether CloudWatch contributor insights is enabled.
     *
     * Default: false
     *
     * @param contributorInsights Whether CloudWatch contributor insights is enabled.
     */
    public fun contributorInsights(contributorInsights: Boolean) {
        cdkBuilder.contributorInsights(contributorInsights)
    }

    /**
     * Whether deletion protection is enabled.
     *
     * Default: false
     *
     * @param deletionProtection Whether deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * When an item in the table is modified, StreamViewType determines what information is written
     * to the stream.
     *
     * Default: - streams are disabled if replicas are not configured and this property is not
     * specified. If this property is not specified when replicas are configured, then
     * NEW_AND_OLD_IMAGES will be the StreamViewType for all replicas
     *
     * @param dynamoStream When an item in the table is modified, StreamViewType determines what
     *   information is written to the stream.
     */
    public fun dynamoStream(dynamoStream: StreamViewType) {
        cdkBuilder.dynamoStream(dynamoStream)
    }

    /**
     * The server-side encryption.
     *
     * Default: TableEncryptionV2.dynamoOwnedKey()
     *
     * @param encryption The server-side encryption.
     */
    public fun encryption(encryption: TableEncryptionV2) {
        cdkBuilder.encryption(encryption)
    }

    /**
     * Global secondary indexes.
     *
     * Note: You can provide a maximum of 20 global secondary indexes.
     *
     * Default: - no global secondary indexes
     *
     * @param globalSecondaryIndexes Global secondary indexes.
     */
    public fun globalSecondaryIndexes(
        globalSecondaryIndexes: GlobalSecondaryIndexPropsV2Dsl.() -> Unit
    ) {
        _globalSecondaryIndexes.add(
            GlobalSecondaryIndexPropsV2Dsl().apply(globalSecondaryIndexes).build()
        )
    }

    /**
     * Global secondary indexes.
     *
     * Note: You can provide a maximum of 20 global secondary indexes.
     *
     * Default: - no global secondary indexes
     *
     * @param globalSecondaryIndexes Global secondary indexes.
     */
    public fun globalSecondaryIndexes(
        globalSecondaryIndexes: Collection<GlobalSecondaryIndexPropsV2>
    ) {
        _globalSecondaryIndexes.addAll(globalSecondaryIndexes)
    }

    /**
     * Kinesis Data Stream to capture item level changes.
     *
     * Default: - no Kinesis Data Stream
     *
     * @param kinesisStream Kinesis Data Stream to capture item level changes.
     */
    public fun kinesisStream(kinesisStream: IStream) {
        cdkBuilder.kinesisStream(kinesisStream)
    }

    /**
     * Local secondary indexes.
     *
     * Note: You can only provide a maximum of 5 local secondary indexes.
     *
     * Default: - no local secondary indexes
     *
     * @param localSecondaryIndexes Local secondary indexes.
     */
    public fun localSecondaryIndexes(
        localSecondaryIndexes: LocalSecondaryIndexPropsDsl.() -> Unit
    ) {
        _localSecondaryIndexes.add(
            LocalSecondaryIndexPropsDsl().apply(localSecondaryIndexes).build()
        )
    }

    /**
     * Local secondary indexes.
     *
     * Note: You can only provide a maximum of 5 local secondary indexes.
     *
     * Default: - no local secondary indexes
     *
     * @param localSecondaryIndexes Local secondary indexes.
     */
    public fun localSecondaryIndexes(localSecondaryIndexes: Collection<LocalSecondaryIndexProps>) {
        _localSecondaryIndexes.addAll(localSecondaryIndexes)
    }

    /**
     * Partition key attribute definition.
     *
     * @param partitionKey Partition key attribute definition.
     */
    public fun partitionKey(partitionKey: AttributeDsl.() -> Unit = {}) {
        val builder = AttributeDsl()
        builder.apply(partitionKey)
        cdkBuilder.partitionKey(builder.build())
    }

    /**
     * Partition key attribute definition.
     *
     * @param partitionKey Partition key attribute definition.
     */
    public fun partitionKey(partitionKey: Attribute) {
        cdkBuilder.partitionKey(partitionKey)
    }

    /**
     * Whether point-in-time recovery is enabled.
     *
     * Default: false
     *
     * @param pointInTimeRecovery Whether point-in-time recovery is enabled.
     */
    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
        cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
    }

    /**
     * The removal policy applied to the table.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy The removal policy applied to the table.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * Replica tables to deploy with the primary table.
     *
     * Note: Adding replica tables allows you to use your table as a global table. You cannot
     * specify a replica table in the region that the primary table will be deployed to. Replica
     * tables will only be supported if the stack deployment region is defined.
     *
     * Default: - no replica tables
     *
     * @param replicas Replica tables to deploy with the primary table.
     */
    public fun replicas(replicas: ReplicaTablePropsDsl.() -> Unit) {
        _replicas.add(ReplicaTablePropsDsl().apply(replicas).build())
    }

    /**
     * Replica tables to deploy with the primary table.
     *
     * Note: Adding replica tables allows you to use your table as a global table. You cannot
     * specify a replica table in the region that the primary table will be deployed to. Replica
     * tables will only be supported if the stack deployment region is defined.
     *
     * Default: - no replica tables
     *
     * @param replicas Replica tables to deploy with the primary table.
     */
    public fun replicas(replicas: Collection<ReplicaTableProps>) {
        _replicas.addAll(replicas)
    }

    /**
     * Sort key attribute definition.
     *
     * Default: - no sort key
     *
     * @param sortKey Sort key attribute definition.
     */
    public fun sortKey(sortKey: AttributeDsl.() -> Unit = {}) {
        val builder = AttributeDsl()
        builder.apply(sortKey)
        cdkBuilder.sortKey(builder.build())
    }

    /**
     * Sort key attribute definition.
     *
     * Default: - no sort key
     *
     * @param sortKey Sort key attribute definition.
     */
    public fun sortKey(sortKey: Attribute) {
        cdkBuilder.sortKey(sortKey)
    }

    /**
     * The table class.
     *
     * Default: TableClass.STANDARD
     *
     * @param tableClass The table class.
     */
    public fun tableClass(tableClass: TableClass) {
        cdkBuilder.tableClass(tableClass)
    }

    /**
     * The name of the table.
     *
     * Default: - generated by CloudFormation
     *
     * @param tableName The name of the table.
     */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    /**
     * Tags to be applied to the table or replica table.
     *
     * Default: - no tags
     *
     * @param tags Tags to be applied to the table or replica table.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Tags to be applied to the table or replica table.
     *
     * Default: - no tags
     *
     * @param tags Tags to be applied to the table or replica table.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The name of the TTL attribute.
     *
     * Default: - TTL is disabled
     *
     * @param timeToLiveAttribute The name of the TTL attribute.
     */
    public fun timeToLiveAttribute(timeToLiveAttribute: String) {
        cdkBuilder.timeToLiveAttribute(timeToLiveAttribute)
    }

    public fun build(): TableV2 {
        if (_globalSecondaryIndexes.isNotEmpty())
            cdkBuilder.globalSecondaryIndexes(_globalSecondaryIndexes)
        if (_localSecondaryIndexes.isNotEmpty())
            cdkBuilder.localSecondaryIndexes(_localSecondaryIndexes)
        if (_replicas.isNotEmpty()) cdkBuilder.replicas(_replicas)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
