@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean
import kotlin.Unit

/**
 * Options to the resolve() operation.
 *
 * NOT the same as the ResolveContext; ResolveContext is exposed to Token
 * implementors and resolution hooks, whereas this struct is just to bundle
 * a number of things that would otherwise be arguments to resolve() in a
 * readable way.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import software.constructs.*;
 * Construct construct;
 * ITokenResolver tokenResolver;
 * ResolveOptions resolveOptions = ResolveOptions.builder()
 * .resolver(tokenResolver)
 * .scope(construct)
 * // the properties below are optional
 * .preparing(false)
 * .removeEmpty(false)
 * .build();
 * ```
 */
public interface ResolveOptions {
  /**
   * Whether the resolution is being executed during the prepare phase or not.
   *
   * Default: false
   */
  public fun preparing(): Boolean? = unwrap(this).getPreparing()

  /**
   * Whether to remove undefined elements from arrays and objects when resolving.
   *
   * Default: true
   */
  public fun removeEmpty(): Boolean? = unwrap(this).getRemoveEmpty()

  /**
   * The resolver to apply to any resolvable tokens found.
   */
  public fun resolver(): ITokenResolver

  /**
   * The scope from which resolution is performed.
   */
  public fun scope(): IConstruct

  /**
   * A builder for [ResolveOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param preparing Whether the resolution is being executed during the prepare phase or not.
     */
    public fun preparing(preparing: Boolean)

    /**
     * @param removeEmpty Whether to remove undefined elements from arrays and objects when
     * resolving.
     */
    public fun removeEmpty(removeEmpty: Boolean)

    /**
     * @param resolver The resolver to apply to any resolvable tokens found. 
     */
    public fun resolver(resolver: ITokenResolver)

    /**
     * @param scope The scope from which resolution is performed. 
     */
    public fun scope(scope: IConstruct)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.ResolveOptions.Builder =
        software.amazon.awscdk.ResolveOptions.builder()

    /**
     * @param preparing Whether the resolution is being executed during the prepare phase or not.
     */
    override fun preparing(preparing: Boolean) {
      cdkBuilder.preparing(preparing)
    }

    /**
     * @param removeEmpty Whether to remove undefined elements from arrays and objects when
     * resolving.
     */
    override fun removeEmpty(removeEmpty: Boolean) {
      cdkBuilder.removeEmpty(removeEmpty)
    }

    /**
     * @param resolver The resolver to apply to any resolvable tokens found. 
     */
    override fun resolver(resolver: ITokenResolver) {
      cdkBuilder.resolver(resolver.let(ITokenResolver::unwrap))
    }

    /**
     * @param scope The scope from which resolution is performed. 
     */
    override fun scope(scope: IConstruct) {
      cdkBuilder.scope(scope.let(IConstruct::unwrap))
    }

    public fun build(): software.amazon.awscdk.ResolveOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ResolveOptions,
  ) : CdkObject(cdkObject), ResolveOptions {
    /**
     * Whether the resolution is being executed during the prepare phase or not.
     *
     * Default: false
     */
    override fun preparing(): Boolean? = unwrap(this).getPreparing()

    /**
     * Whether to remove undefined elements from arrays and objects when resolving.
     *
     * Default: true
     */
    override fun removeEmpty(): Boolean? = unwrap(this).getRemoveEmpty()

    /**
     * The resolver to apply to any resolvable tokens found.
     */
    override fun resolver(): ITokenResolver = unwrap(this).getResolver().let(ITokenResolver::wrap)

    /**
     * The scope from which resolution is performed.
     */
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
