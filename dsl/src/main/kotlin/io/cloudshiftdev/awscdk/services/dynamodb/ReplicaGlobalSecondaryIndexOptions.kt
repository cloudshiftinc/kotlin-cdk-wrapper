package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

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
