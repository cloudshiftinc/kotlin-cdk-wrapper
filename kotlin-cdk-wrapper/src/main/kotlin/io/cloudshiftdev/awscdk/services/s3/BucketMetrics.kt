@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface BucketMetrics {
  public fun id(): String

  public fun prefix(): String? = unwrap(this).getPrefix()

  public fun tagFilters(): Map<String, Any> = unwrap(this).getTagFilters() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun id(id: String)

    public fun prefix(prefix: String)

    public fun tagFilters(tagFilters: Map<String, Any>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.BucketMetrics.Builder =
        software.amazon.awscdk.services.s3.BucketMetrics.builder()

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    override fun tagFilters(tagFilters: Map<String, Any>) {
      cdkBuilder.tagFilters(tagFilters)
    }

    public fun build(): software.amazon.awscdk.services.s3.BucketMetrics = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.BucketMetrics,
  ) : CdkObject(cdkObject), BucketMetrics {
    override fun id(): String = unwrap(this).getId()

    override fun prefix(): String? = unwrap(this).getPrefix()

    override fun tagFilters(): Map<String, Any> = unwrap(this).getTagFilters() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BucketMetrics {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.BucketMetrics): BucketMetrics =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BucketMetrics): software.amazon.awscdk.services.s3.BucketMetrics =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.s3.BucketMetrics
  }
}
