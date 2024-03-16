@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Interface for states that can have 'next' states.
 */
public interface INextable {
  /**
   * Go to the indicated state after this state.
   *
   * @return The chain of states built up
   * @param state 
   */
  public fun next(state: IChainable): Chain

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.INextable): INextable
        = CdkObjectWrappers.wrap(cdkObject) as INextable

    internal fun unwrap(wrapped: INextable): software.amazon.awscdk.services.stepfunctions.INextable
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.INextable
  }
}
