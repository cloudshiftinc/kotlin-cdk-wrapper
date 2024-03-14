package io.cloudshiftdev.awscdk.services.ecs

import kotlin.String
import kotlin.collections.List

public open class PlacementStrategy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.PlacementStrategy,
) {
  /**
   * Return the placement JSON.
   */
  public open fun toJson(): List<CfnService.PlacementStrategyProperty> =
      unwrap(this).toJson().map(CfnService.PlacementStrategyProperty::wrap)

  public companion object {
    public fun packedBy(resource: BinPackResource): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.packedBy(resource.let(BinPackResource::unwrap)).let(PlacementStrategy::wrap)

    public fun packedByCpu(): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.packedByCpu().let(PlacementStrategy::wrap)

    public fun packedByMemory(): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.packedByMemory().let(PlacementStrategy::wrap)

    public fun randomly(): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.randomly().let(PlacementStrategy::wrap)

    public fun spreadAcross(fields: String): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.spreadAcross(fields).let(PlacementStrategy::wrap)

    public fun spreadAcrossInstances(): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.spreadAcrossInstances().let(PlacementStrategy::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.PlacementStrategy):
        PlacementStrategy = PlacementStrategy(cdkObject)

    internal fun unwrap(wrapped: PlacementStrategy):
        software.amazon.awscdk.services.ecs.PlacementStrategy = wrapped.cdkObject
  }
}
