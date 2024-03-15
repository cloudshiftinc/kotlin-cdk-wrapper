@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

public interface IChainable {
  public fun endStates(): List<INextable>

  public fun id(): String

  public fun startState(): State

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.IChainable,
  ) : CdkObject(cdkObject), IChainable {
    override fun endStates(): List<INextable> = unwrap(this).getEndStates().map(INextable::wrap)

    override fun id(): String = unwrap(this).getId()

    override fun startState(): State = unwrap(this).getStartState().let(State::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.IChainable):
        IChainable = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IChainable):
        software.amazon.awscdk.services.stepfunctions.IChainable = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.stepfunctions.IChainable
  }
}
