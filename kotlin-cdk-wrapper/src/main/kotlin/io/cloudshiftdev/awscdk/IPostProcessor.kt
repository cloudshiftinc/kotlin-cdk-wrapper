@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any

/**
 * A Token that can post-process the complete resolved value, after resolve() has recursed over it.
 */
public interface IPostProcessor {
  /**
   * Process the completely resolved value, after full recursion/resolution has happened.
   *
   * @param input 
   * @param context 
   */
  public fun postProcess(input: Any, context: IResolveContext): Any

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IPostProcessor): IPostProcessor =
        CdkObjectWrappers.wrap(cdkObject) as IPostProcessor

    internal fun unwrap(wrapped: IPostProcessor): software.amazon.awscdk.IPostProcessor = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.IPostProcessor
  }
}
