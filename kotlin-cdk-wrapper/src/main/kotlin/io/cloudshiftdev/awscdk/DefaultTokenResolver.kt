@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.List

public open class DefaultTokenResolver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.DefaultTokenResolver,
) : CdkObject(cdkObject), ITokenResolver {
  public override fun resolveList(xs: List<String>, context: IResolveContext): Any =
      unwrap(this).resolveList(xs, context.let(IResolveContext::unwrap))

  public override fun resolveString(fragments: TokenizedStringFragments, context: IResolveContext):
      Any = unwrap(this).resolveString(fragments.let(TokenizedStringFragments::unwrap),
      context.let(IResolveContext::unwrap))

  public override fun resolveToken(
    t: IResolvable,
    context: IResolveContext,
    postProcessor: IPostProcessor,
  ): Any = unwrap(this).resolveToken(t.let(IResolvable::unwrap),
      context.let(IResolveContext::unwrap), postProcessor.let(IPostProcessor::unwrap))

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.DefaultTokenResolver): DefaultTokenResolver
        = DefaultTokenResolver(cdkObject)

    internal fun unwrap(wrapped: DefaultTokenResolver): software.amazon.awscdk.DefaultTokenResolver
        = wrapped.cdkObject
  }
}
