package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import kotlin.collections.List

public abstract class MapBase internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.MapBase,
) : State(cdkObject), INextable {
  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  public override fun next(next: IChainable): Chain =
      unwrap(this).next(next.let(IChainable::unwrap)).let(Chain::wrap)

  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.MapBase,
  ) : MapBase(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.MapBase): MapBase =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MapBase): software.amazon.awscdk.services.stepfunctions.MapBase =
        (wrapped as Wrapper).cdkObject
  }
}
