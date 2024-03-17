@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents the amount of read and write operations supported by a DynamoDB table.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
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
public abstract class Capacity internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dynamodb.Capacity,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun mode(): CapacityMode = unwrap(this).getMode().let(CapacityMode::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.Capacity,
  ) : Capacity(cdkObject)

  public companion object {
    public fun autoscaled(options: AutoscaledCapacityOptions): Capacity =
        software.amazon.awscdk.services.dynamodb.Capacity.autoscaled(options.let(AutoscaledCapacityOptions::unwrap)).let(Capacity::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96f6dbb03cf6826a48596492729e14be59467cc53d33e92c46267f599b4579ad")
    public fun autoscaled(options: AutoscaledCapacityOptions.Builder.() -> Unit): Capacity =
        autoscaled(AutoscaledCapacityOptions(options))

    public fun fixed(iops: Number): Capacity =
        software.amazon.awscdk.services.dynamodb.Capacity.fixed(iops).let(Capacity::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.Capacity): Capacity =
        CdkObjectWrappers.wrap(cdkObject) as? Capacity ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Capacity): software.amazon.awscdk.services.dynamodb.Capacity =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.Capacity
  }
}
