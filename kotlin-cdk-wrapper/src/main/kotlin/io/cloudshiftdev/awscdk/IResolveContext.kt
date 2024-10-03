@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Current resolution context for tokens.
 */
public interface IResolveContext {
  /**
   * Path in the JSON document that is being constructed.
   */
  public fun documentPath(): List<String>

  /**
   * True when we are still preparing, false if we're rendering the final output.
   */
  public fun preparing(): Boolean

  /**
   * Use this postprocessor after the entire token structure has been resolved.
   *
   * @param postProcessor 
   */
  public fun registerPostProcessor(postProcessor: IPostProcessor)

  /**
   * Resolve an inner object.
   *
   * @param x 
   * @param options
   */
  public fun resolve(x: Any): Any

  /**
   * Resolve an inner object.
   *
   * @param x 
   * @param options
   */
  public fun resolve(x: Any, options: ResolveChangeContextOptions): Any

  /**
   * Resolve an inner object.
   *
   * @param x 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db6f0e945d885bf6bbf91c126c04d7917a4c9e7c10e9a8c19706a073cbe95ff3")
  public fun resolve(x: Any, options: ResolveChangeContextOptions.Builder.() -> Unit): Any

  /**
   * The scope from which resolution has been initiated.
   */
  public fun scope(): IConstruct

  private class Wrapper(
    cdkObject: software.amazon.awscdk.IResolveContext,
  ) : CdkObject(cdkObject),
      IResolveContext {
    /**
     * Path in the JSON document that is being constructed.
     */
    override fun documentPath(): List<String> = unwrap(this).getDocumentPath()

    /**
     * True when we are still preparing, false if we're rendering the final output.
     */
    override fun preparing(): Boolean = unwrap(this).getPreparing()

    /**
     * Use this postprocessor after the entire token structure has been resolved.
     *
     * @param postProcessor 
     */
    override fun registerPostProcessor(postProcessor: IPostProcessor) {
      unwrap(this).registerPostProcessor(postProcessor.let(IPostProcessor.Companion::unwrap))
    }

    /**
     * Resolve an inner object.
     *
     * @param x 
     * @param options
     */
    override fun resolve(x: Any): Any = unwrap(this).resolve(x)

    /**
     * Resolve an inner object.
     *
     * @param x 
     * @param options
     */
    override fun resolve(x: Any, options: ResolveChangeContextOptions): Any =
        unwrap(this).resolve(x, options.let(ResolveChangeContextOptions.Companion::unwrap))

    /**
     * Resolve an inner object.
     *
     * @param x 
     * @param options
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db6f0e945d885bf6bbf91c126c04d7917a4c9e7c10e9a8c19706a073cbe95ff3")
    override fun resolve(x: Any, options: ResolveChangeContextOptions.Builder.() -> Unit): Any =
        resolve(x, ResolveChangeContextOptions(options))

    /**
     * The scope from which resolution has been initiated.
     */
    override fun scope(): IConstruct = unwrap(this).getScope().let(IConstruct::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IResolveContext): IResolveContext =
        CdkObjectWrappers.wrap(cdkObject) as? IResolveContext ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IResolveContext): software.amazon.awscdk.IResolveContext = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.IResolveContext
  }
}
