@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

/**
 * Options used to configure global secondary indexes on a replica table.
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
public interface ReplicaGlobalSecondaryIndexOptions {
  /**
   * Whether CloudWatch contributor insights is enabled for a specific global secondary index on a
   * replica table.
   *
   * Default: - inherited from the primary table
   */
  public fun contributorInsights(): Boolean? = unwrap(this).getContributorInsights()

  /**
   * The read capacity for a specific global secondary index on a replica table.
   *
   * Note: This can only be configured if primary table billing is provisioned.
   *
   * Default: - inherited from the primary table
   */
  public fun readCapacity(): Capacity? = unwrap(this).getReadCapacity()?.let(Capacity::wrap)

  /**
   * A builder for [ReplicaGlobalSecondaryIndexOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contributorInsights Whether CloudWatch contributor insights is enabled for a specific
     * global secondary index on a replica table.
     */
    public fun contributorInsights(contributorInsights: Boolean)

    /**
     * @param readCapacity The read capacity for a specific global secondary index on a replica
     * table.
     * Note: This can only be configured if primary table billing is provisioned.
     */
    public fun readCapacity(readCapacity: Capacity)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dynamodb.ReplicaGlobalSecondaryIndexOptions.Builder =
        software.amazon.awscdk.services.dynamodb.ReplicaGlobalSecondaryIndexOptions.builder()

    /**
     * @param contributorInsights Whether CloudWatch contributor insights is enabled for a specific
     * global secondary index on a replica table.
     */
    override fun contributorInsights(contributorInsights: Boolean) {
      cdkBuilder.contributorInsights(contributorInsights)
    }

    /**
     * @param readCapacity The read capacity for a specific global secondary index on a replica
     * table.
     * Note: This can only be configured if primary table billing is provisioned.
     */
    override fun readCapacity(readCapacity: Capacity) {
      cdkBuilder.readCapacity(readCapacity.let(Capacity::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.ReplicaGlobalSecondaryIndexOptions
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.dynamodb.ReplicaGlobalSecondaryIndexOptions,
  ) : CdkObject(cdkObject), ReplicaGlobalSecondaryIndexOptions {
    /**
     * Whether CloudWatch contributor insights is enabled for a specific global secondary index on a
     * replica table.
     *
     * Default: - inherited from the primary table
     */
    override fun contributorInsights(): Boolean? = unwrap(this).getContributorInsights()

    /**
     * The read capacity for a specific global secondary index on a replica table.
     *
     * Note: This can only be configured if primary table billing is provisioned.
     *
     * Default: - inherited from the primary table
     */
    override fun readCapacity(): Capacity? = unwrap(this).getReadCapacity()?.let(Capacity::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ReplicaGlobalSecondaryIndexOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.ReplicaGlobalSecondaryIndexOptions):
        ReplicaGlobalSecondaryIndexOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReplicaGlobalSecondaryIndexOptions):
        software.amazon.awscdk.services.dynamodb.ReplicaGlobalSecondaryIndexOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.dynamodb.ReplicaGlobalSecondaryIndexOptions
  }
}
