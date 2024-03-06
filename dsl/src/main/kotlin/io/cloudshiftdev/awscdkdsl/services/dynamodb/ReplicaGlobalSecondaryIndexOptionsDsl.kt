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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.dynamodb.Capacity
import software.amazon.awscdk.services.dynamodb.ReplicaGlobalSecondaryIndexOptions

/**
 * Options used to configure global secondary indexes on a replica table.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.*;
 * App app = new App();
 * Stack stack = Stack.Builder.create(app,
 * "Stack").env(Environment.builder().region("us-west-2").build()).build();
 * TableV2 globalTable = TableV2.Builder.create(stack, "GlobalTable")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .contributorInsights(true)
 * .billing(Billing.provisioned(ThroughputProps.builder()
 * .readCapacity(Capacity.fixed(10))
 * .writeCapacity(Capacity.autoscaled(AutoscaledCapacityOptions.builder().maxCapacity(10).build()))
 * .build()))
 * // each global secondary index will inherit contributor insights as true
 * .globalSecondaryIndexes(List.of(GlobalSecondaryIndexPropsV2.builder()
 * .indexName("gsi1")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .readCapacity(Capacity.fixed(15))
 * .build(), GlobalSecondaryIndexPropsV2.builder()
 * .indexName("gsi2")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .writeCapacity(Capacity.autoscaled(AutoscaledCapacityOptions.builder().minCapacity(5).maxCapacity(20).build()))
 * .build()))
 * .replicas(List.of(ReplicaTableProps.builder()
 * .region("us-east-1")
 * .globalSecondaryIndexOptions(Map.of(
 * "gsi1", ReplicaGlobalSecondaryIndexOptions.builder()
 * .readCapacity(Capacity.autoscaled(AutoscaledCapacityOptions.builder().minCapacity(1).maxCapacity(10).build()))
 * .build()))
 * .build(), ReplicaTableProps.builder()
 * .region("us-east-2")
 * .globalSecondaryIndexOptions(Map.of(
 * "gsi2", ReplicaGlobalSecondaryIndexOptions.builder()
 * .contributorInsights(false)
 * .build()))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class ReplicaGlobalSecondaryIndexOptionsDsl {
    private val cdkBuilder: ReplicaGlobalSecondaryIndexOptions.Builder =
        ReplicaGlobalSecondaryIndexOptions.builder()

    /**
     * @param contributorInsights Whether CloudWatch contributor insights is enabled for a specific
     *   global secondary index on a replica table.
     */
    public fun contributorInsights(contributorInsights: Boolean) {
        cdkBuilder.contributorInsights(contributorInsights)
    }

    /**
     * @param readCapacity The read capacity for a specific global secondary index on a replica
     *   table. Note: This can only be configured if primary table billing is provisioned.
     */
    public fun readCapacity(readCapacity: Capacity) {
        cdkBuilder.readCapacity(readCapacity)
    }

    public fun build(): ReplicaGlobalSecondaryIndexOptions = cdkBuilder.build()
}
