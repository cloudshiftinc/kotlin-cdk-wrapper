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
import software.amazon.awscdk.services.dynamodb.Capacity
import software.amazon.awscdk.services.dynamodb.ThroughputProps

/**
 * Properties used to configure provisioned throughput for a DynamoDB table.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.*;
 * App app = new App();
 * Stack stack = Stack.Builder.create(app,
 * "Stack").env(Environment.builder().region("us-west-2").build()).build();
 * TableV2 globalTable = TableV2.Builder.create(stack, "GlobalTable")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .billing(Billing.provisioned(ThroughputProps.builder()
 * .readCapacity(Capacity.fixed(10))
 * .writeCapacity(Capacity.autoscaled(AutoscaledCapacityOptions.builder().maxCapacity(15).build()))
 * .build()))
 * .replicas(List.of(ReplicaTableProps.builder()
 * .region("us-east-1")
 * .build(), ReplicaTableProps.builder()
 * .region("us-east-2")
 * .readCapacity(Capacity.autoscaled(AutoscaledCapacityOptions.builder().maxCapacity(20).targetUtilizationPercent(50).build()))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class ThroughputPropsDsl {
    private val cdkBuilder: ThroughputProps.Builder = ThroughputProps.builder()

    /** @param readCapacity The read capacity. */
    public fun readCapacity(readCapacity: Capacity) {
        cdkBuilder.readCapacity(readCapacity)
    }

    /** @param writeCapacity The write capacity. */
    public fun writeCapacity(writeCapacity: Capacity) {
        cdkBuilder.writeCapacity(writeCapacity)
    }

    public fun build(): ThroughputProps = cdkBuilder.build()
}
