@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface ReplicaGlobalSecondaryIndexOptions {
  public fun contributorInsights(): Boolean? = unwrap(this).getContributorInsights()

  public fun readCapacity(): Capacity? = unwrap(this).getReadCapacity()?.let(Capacity::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun contributorInsights(contributorInsights: Boolean)

    public fun readCapacity(readCapacity: Capacity)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dynamodb.ReplicaGlobalSecondaryIndexOptions.Builder =
        software.amazon.awscdk.services.dynamodb.ReplicaGlobalSecondaryIndexOptions.builder()

    override fun contributorInsights(contributorInsights: Boolean) {
      cdkBuilder.contributorInsights(contributorInsights)
    }

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
    override fun contributorInsights(): Boolean? = unwrap(this).getContributorInsights()

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
