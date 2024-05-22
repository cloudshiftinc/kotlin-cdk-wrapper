@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents how capacity is managed and how you are charged for read and write throughput for a
 * DynamoDB table.
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
public abstract class Billing(
  cdkObject: software.amazon.awscdk.services.dynamodb.Billing,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun mode(): BillingMode = unwrap(this).getMode().let(BillingMode::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dynamodb.Billing,
  ) : Billing(cdkObject)

  public companion object {
    public fun onDemand(): Billing =
        software.amazon.awscdk.services.dynamodb.Billing.onDemand().let(Billing::wrap)

    public fun provisioned(props: ThroughputProps): Billing =
        software.amazon.awscdk.services.dynamodb.Billing.provisioned(props.let(ThroughputProps.Companion::unwrap)).let(Billing::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a809155c8ce7d1be4bf74289d5a94ae5c101cc12d650e3fdd8528190ca8597a")
    public fun provisioned(props: ThroughputProps.Builder.() -> Unit): Billing =
        provisioned(ThroughputProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.Billing): Billing =
        CdkObjectWrappers.wrap(cdkObject) as? Billing ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Billing): software.amazon.awscdk.services.dynamodb.Billing =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.Billing
  }
}
