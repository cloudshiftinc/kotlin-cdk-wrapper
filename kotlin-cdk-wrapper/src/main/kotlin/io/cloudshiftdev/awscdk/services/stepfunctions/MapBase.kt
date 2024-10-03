@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.collections.List

/**
 * Define a Map state in the state machine.
 *
 * A `Map` state can be used to run a set of steps for each element of an input array.
 * A Map state will execute the same steps for multiple entries of an array in the state input.
 *
 * While the Parallel state executes multiple branches of steps using the same input, a Map state
 * will execute the same steps for multiple entries of an array in the state input.
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-map-state.html)
 */
public abstract class MapBase(
  cdkObject: software.amazon.awscdk.services.stepfunctions.MapBase,
) : State(cdkObject),
    INextable {
  /**
   * Continuable states of this Chainable.
   */
  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  /**
   * Continue normal execution with the given state.
   *
   * @param next 
   */
  public override fun next(next: IChainable): Chain =
      unwrap(this).next(next.let(IChainable.Companion::unwrap)).let(Chain::wrap)

  /**
   * Return the Amazon States Language object for this state.
   */
  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.MapBase,
  ) : MapBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.MapBase): MapBase =
        CdkObjectWrappers.wrap(cdkObject) as? MapBase ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: MapBase): software.amazon.awscdk.services.stepfunctions.MapBase =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.MapBase
  }
}
