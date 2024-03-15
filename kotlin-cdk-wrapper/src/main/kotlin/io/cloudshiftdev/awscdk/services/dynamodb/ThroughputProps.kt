@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

/**
 * Properties used to configure provisioned throughput for a DynamoDB table.
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
public interface ThroughputProps {
  /**
   * The read capacity.
   */
  public fun readCapacity(): Capacity

  /**
   * The write capacity.
   */
  public fun writeCapacity(): Capacity

  /**
   * A builder for [ThroughputProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param readCapacity The read capacity. 
     */
    public fun readCapacity(readCapacity: Capacity)

    /**
     * @param writeCapacity The write capacity. 
     */
    public fun writeCapacity(writeCapacity: Capacity)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.ThroughputProps.Builder =
        software.amazon.awscdk.services.dynamodb.ThroughputProps.builder()

    /**
     * @param readCapacity The read capacity. 
     */
    override fun readCapacity(readCapacity: Capacity) {
      cdkBuilder.readCapacity(readCapacity.let(Capacity::unwrap))
    }

    /**
     * @param writeCapacity The write capacity. 
     */
    override fun writeCapacity(writeCapacity: Capacity) {
      cdkBuilder.writeCapacity(writeCapacity.let(Capacity::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.ThroughputProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.ThroughputProps,
  ) : CdkObject(cdkObject), ThroughputProps {
    /**
     * The read capacity.
     */
    override fun readCapacity(): Capacity = unwrap(this).getReadCapacity().let(Capacity::wrap)

    /**
     * The write capacity.
     */
    override fun writeCapacity(): Capacity = unwrap(this).getWriteCapacity().let(Capacity::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ThroughputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.ThroughputProps):
        ThroughputProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ThroughputProps):
        software.amazon.awscdk.services.dynamodb.ThroughputProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.dynamodb.ThroughputProps
  }
}
