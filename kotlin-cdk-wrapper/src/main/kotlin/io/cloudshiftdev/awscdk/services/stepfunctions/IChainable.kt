@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.collections.List

/**
 * Interface for objects that can be used in a Chain.
 */
public interface IChainable {
  /**
   * The chainable end state(s) of this chainable.
   */
  public fun endStates(): List<INextable>

  /**
   * Descriptive identifier for this chainable.
   */
  public fun id(): String

  /**
   * The start state of this chainable.
   */
  public fun startState(): State

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.IChainable,
  ) : CdkObject(cdkObject),
      IChainable {
    /**
     * The chainable end state(s) of this chainable.
     */
    override fun endStates(): List<INextable> = unwrap(this).getEndStates().map(INextable::wrap)

    /**
     * Descriptive identifier for this chainable.
     */
    override fun id(): String = unwrap(this).getId()

    /**
     * The start state of this chainable.
     */
    override fun startState(): State = unwrap(this).getStartState().let(State::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.IChainable):
        IChainable = CdkObjectWrappers.wrap(cdkObject) as? IChainable ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IChainable):
        software.amazon.awscdk.services.stepfunctions.IChainable = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.stepfunctions.IChainable
  }
}
