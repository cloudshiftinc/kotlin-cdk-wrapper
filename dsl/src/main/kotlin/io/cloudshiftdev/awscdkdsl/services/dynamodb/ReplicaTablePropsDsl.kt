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
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.dynamodb.Capacity
import software.amazon.awscdk.services.dynamodb.ReplicaGlobalSecondaryIndexOptions
import software.amazon.awscdk.services.dynamodb.ReplicaTableProps
import software.amazon.awscdk.services.dynamodb.TableClass
import software.amazon.awscdk.services.kinesis.IStream

/**
 * Properties used to configure a replica table.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.*;
 * App app = new App();
 * Stack stack = Stack.Builder.create(app,
 * "Stack").env(Environment.builder().region("us-west-2").build()).build();
 * TableV2 globalTable = TableV2.Builder.create(stack, "GlobalTable")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .replicas(List.of(ReplicaTableProps.builder().region("us-east-1").build()))
 * .build();
 * globalTable.addReplica(ReplicaTableProps.builder().region("us-east-2").deletionProtection(true).build());
 * ```
 */
@CdkDslMarker
public class ReplicaTablePropsDsl {
    private val cdkBuilder: ReplicaTableProps.Builder = ReplicaTableProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param contributorInsights Whether CloudWatch contributor insights is enabled. */
    public fun contributorInsights(contributorInsights: Boolean) {
        cdkBuilder.contributorInsights(contributorInsights)
    }

    /** @param deletionProtection Whether deletion protection is enabled. */
    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param globalSecondaryIndexOptions Options used to configure global secondary index
     *   properties.
     */
    public fun globalSecondaryIndexOptions(
        globalSecondaryIndexOptions: Map<String, ReplicaGlobalSecondaryIndexOptions>
    ) {
        cdkBuilder.globalSecondaryIndexOptions(globalSecondaryIndexOptions)
    }

    /** @param kinesisStream Kinesis Data Stream to capture item level changes. */
    public fun kinesisStream(kinesisStream: IStream) {
        cdkBuilder.kinesisStream(kinesisStream)
    }

    /** @param pointInTimeRecovery Whether point-in-time recovery is enabled. */
    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
        cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
    }

    /**
     * @param readCapacity The read capacity. Note: This can only be configured if the primary table
     *   billing is provisioned.
     */
    public fun readCapacity(readCapacity: Capacity) {
        cdkBuilder.readCapacity(readCapacity)
    }

    /** @param region The region that the replica table will be created in. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /** @param tableClass The table class. */
    public fun tableClass(tableClass: TableClass) {
        cdkBuilder.tableClass(tableClass)
    }

    /** @param tags Tags to be applied to the table or replica table. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Tags to be applied to the table or replica table. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): ReplicaTableProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
