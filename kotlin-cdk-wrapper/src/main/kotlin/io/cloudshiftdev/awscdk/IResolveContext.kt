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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IResolveContext): IResolveContext =
        CdkObjectWrappers.wrap(cdkObject) as IResolveContext

    internal fun unwrap(wrapped: IResolveContext): software.amazon.awscdk.IResolveContext = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.IResolveContext
  }
}
