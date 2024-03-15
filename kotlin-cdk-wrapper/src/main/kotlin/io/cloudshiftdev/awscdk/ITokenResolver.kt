@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.List

/**
 * How to resolve tokens.
 */
public interface ITokenResolver {
  /**
   * Resolve a tokenized list.
   *
   * @param l 
   * @param context 
   */
  public fun resolveList(l: List<String>, context: IResolveContext): Any

  /**
   * Resolve a string with at least one stringified token in it.
   *
   * (May use concatenation)
   *
   * @param s 
   * @param context 
   */
  public fun resolveString(s: TokenizedStringFragments, context: IResolveContext): Any

  /**
   * Resolve a single token.
   *
   * @param t 
   * @param context 
   * @param postProcessor 
   */
  public fun resolveToken(
    t: IResolvable,
    context: IResolveContext,
    postProcessor: IPostProcessor,
  ): Any

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ITokenResolver,
  ) : CdkObject(cdkObject), ITokenResolver {
    /**
     * Resolve a tokenized list.
     *
     * @param l 
     * @param context 
     */
    override fun resolveList(l: List<String>, context: IResolveContext): Any =
        unwrap(this).resolveList(l, context.let(IResolveContext::unwrap))

    /**
     * Resolve a string with at least one stringified token in it.
     *
     * (May use concatenation)
     *
     * @param s 
     * @param context 
     */
    override fun resolveString(s: TokenizedStringFragments, context: IResolveContext): Any =
        unwrap(this).resolveString(s.let(TokenizedStringFragments::unwrap),
        context.let(IResolveContext::unwrap))

    /**
     * Resolve a single token.
     *
     * @param t 
     * @param context 
     * @param postProcessor 
     */
    override fun resolveToken(
      t: IResolvable,
      context: IResolveContext,
      postProcessor: IPostProcessor,
    ): Any = unwrap(this).resolveToken(t.let(IResolvable::unwrap),
        context.let(IResolveContext::unwrap), postProcessor.let(IPostProcessor::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ITokenResolver): ITokenResolver =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITokenResolver): software.amazon.awscdk.ITokenResolver = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.ITokenResolver
  }
}
