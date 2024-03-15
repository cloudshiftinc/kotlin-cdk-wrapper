@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.List

public interface ITokenResolver {
  public fun resolveList(arg0: List<String>, arg1: IResolveContext): Any

  public fun resolveString(arg0: TokenizedStringFragments, arg1: IResolveContext): Any

  public fun resolveToken(
    arg0: IResolvable,
    arg1: IResolveContext,
    arg2: IPostProcessor,
  ): Any

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ITokenResolver,
  ) : CdkObject(cdkObject), ITokenResolver {
    override fun resolveList(arg0: List<String>, arg1: IResolveContext): Any =
        unwrap(this).resolveList(arg0, arg1.let(IResolveContext::unwrap))

    override fun resolveString(arg0: TokenizedStringFragments, arg1: IResolveContext): Any =
        unwrap(this).resolveString(arg0.let(TokenizedStringFragments::unwrap),
        arg1.let(IResolveContext::unwrap))

    override fun resolveToken(
      arg0: IResolvable,
      arg1: IResolveContext,
      arg2: IPostProcessor,
    ): Any = unwrap(this).resolveToken(arg0.let(IResolvable::unwrap),
        arg1.let(IResolveContext::unwrap), arg2.let(IPostProcessor::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ITokenResolver): ITokenResolver =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITokenResolver): software.amazon.awscdk.ITokenResolver = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.ITokenResolver
  }
}
