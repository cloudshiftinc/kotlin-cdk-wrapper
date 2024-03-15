@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface EcsOptimizedImageOptions {
  public fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

  @CdkDslMarker
  public interface Builder {
    public fun cachedInContext(cachedInContext: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.EcsOptimizedImageOptions.Builder =
        software.amazon.awscdk.services.ecs.EcsOptimizedImageOptions.builder()

    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    public fun build(): software.amazon.awscdk.services.ecs.EcsOptimizedImageOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.EcsOptimizedImageOptions,
  ) : CdkObject(cdkObject), EcsOptimizedImageOptions {
    override fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsOptimizedImageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EcsOptimizedImageOptions):
        EcsOptimizedImageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsOptimizedImageOptions):
        software.amazon.awscdk.services.ecs.EcsOptimizedImageOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.EcsOptimizedImageOptions
  }
}
