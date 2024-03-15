@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean
import kotlin.Unit

public interface ResolveOptions {
  public fun preparing(): Boolean? = unwrap(this).getPreparing()

  public fun removeEmpty(): Boolean? = unwrap(this).getRemoveEmpty()

  public fun resolver(): ITokenResolver

  public fun scope(): IConstruct

  @CdkDslMarker
  public interface Builder {
    public fun preparing(preparing: Boolean)

    public fun removeEmpty(removeEmpty: Boolean)

    public fun resolver(resolver: ITokenResolver)

    public fun scope(scope: IConstruct)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.ResolveOptions.Builder =
        software.amazon.awscdk.ResolveOptions.builder()

    override fun preparing(preparing: Boolean) {
      cdkBuilder.preparing(preparing)
    }

    override fun removeEmpty(removeEmpty: Boolean) {
      cdkBuilder.removeEmpty(removeEmpty)
    }

    override fun resolver(resolver: ITokenResolver) {
      cdkBuilder.resolver(resolver.let(ITokenResolver::unwrap))
    }

    override fun scope(scope: IConstruct) {
      cdkBuilder.scope(scope.let(IConstruct::unwrap))
    }

    public fun build(): software.amazon.awscdk.ResolveOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ResolveOptions,
  ) : CdkObject(cdkObject), ResolveOptions {
    override fun preparing(): Boolean? = unwrap(this).getPreparing()

    override fun removeEmpty(): Boolean? = unwrap(this).getRemoveEmpty()

    override fun resolver(): ITokenResolver = unwrap(this).getResolver().let(ITokenResolver::wrap)

    override fun scope(): IConstruct = unwrap(this).getScope().let(IConstruct::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResolveOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ResolveOptions): ResolveOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResolveOptions): software.amazon.awscdk.ResolveOptions = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.ResolveOptions
  }
}
