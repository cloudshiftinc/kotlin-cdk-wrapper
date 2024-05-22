@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.List

/**
 * Default resolver implementation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * IFragmentConcatenator fragmentConcatenator;
 * DefaultTokenResolver defaultTokenResolver = new DefaultTokenResolver(fragmentConcatenator);
 * ```
 */
public open class DefaultTokenResolver(
  cdkObject: software.amazon.awscdk.DefaultTokenResolver,
) : CdkObject(cdkObject), ITokenResolver {
  public constructor(concat: IFragmentConcatenator) :
      this(software.amazon.awscdk.DefaultTokenResolver(concat.let(IFragmentConcatenator.Companion::unwrap))
  )

  /**
   * Resolve a tokenized list.
   *
   * @param xs 
   * @param context 
   */
  public override fun resolveList(xs: List<String>, context: IResolveContext): Any =
      unwrap(this).resolveList(xs, context.let(IResolveContext.Companion::unwrap))

  /**
   * Resolve string fragments to Tokens.
   *
   * @param fragments 
   * @param context 
   */
  public override fun resolveString(fragments: TokenizedStringFragments, context: IResolveContext):
      Any = unwrap(this).resolveString(fragments.let(TokenizedStringFragments.Companion::unwrap),
      context.let(IResolveContext.Companion::unwrap))

  /**
   * Default Token resolution.
   *
   * Resolve the Token, recurse into whatever it returns,
   * then finally post-process it.
   *
   * @param t 
   * @param context 
   * @param postProcessor 
   */
  public override fun resolveToken(
    t: IResolvable,
    context: IResolveContext,
    postProcessor: IPostProcessor,
  ): Any = unwrap(this).resolveToken(t.let(IResolvable.Companion::unwrap),
      context.let(IResolveContext.Companion::unwrap),
      postProcessor.let(IPostProcessor.Companion::unwrap))

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.DefaultTokenResolver): DefaultTokenResolver
        = DefaultTokenResolver(cdkObject)

    internal fun unwrap(wrapped: DefaultTokenResolver): software.amazon.awscdk.DefaultTokenResolver
        = wrapped.cdkObject as software.amazon.awscdk.DefaultTokenResolver
  }
}
