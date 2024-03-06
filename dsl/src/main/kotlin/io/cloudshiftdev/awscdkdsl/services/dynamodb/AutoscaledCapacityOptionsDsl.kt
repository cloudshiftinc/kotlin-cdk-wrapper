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
import kotlin.Number
import software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions

/**
 * Options used to configure autoscaled capacity.
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
public class AutoscaledCapacityOptionsDsl {
    private val cdkBuilder: AutoscaledCapacityOptions.Builder = AutoscaledCapacityOptions.builder()

    /** @param maxCapacity The maximum allowable capacity. */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /** @param minCapacity The minimum allowable capacity. */
    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * @param seedCapacity If you want to switch a table's billing mode from on-demand to
     *   provisioned or from provisioned to on-demand, you must specify a value for this property
     *   for each autoscaled resource.
     */
    public fun seedCapacity(seedCapacity: Number) {
        cdkBuilder.seedCapacity(seedCapacity)
    }

    /**
     * @param targetUtilizationPercent The ratio of consumed capacity units to provisioned capacity
     *   units. Note: Target utilization percent cannot be less than 20 and cannot be greater
     *   than 90.
     */
    public fun targetUtilizationPercent(targetUtilizationPercent: Number) {
        cdkBuilder.targetUtilizationPercent(targetUtilizationPercent)
    }

    public fun build(): AutoscaledCapacityOptions = cdkBuilder.build()
}
