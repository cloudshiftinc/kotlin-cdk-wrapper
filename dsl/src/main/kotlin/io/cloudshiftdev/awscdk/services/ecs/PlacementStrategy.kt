package io.cloudshiftdev.awscdk.services.ecs

import kotlin.String
import kotlin.collections.List

public open class PlacementStrategy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.PlacementStrategy,
) {
  public open fun toJson(): List<CfnService.PlacementStrategyProperty> =
      unwrap(this).toJson().map(CfnService.PlacementStrategyProperty::wrap)

  public companion object {
    public open fun packedBy(resource: BinPackResource): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.packedBy(resource.let(BinPackResource::unwrap)).let(PlacementStrategy::wrap)

    public open fun packedByCpu(): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.packedByCpu().let(PlacementStrategy::wrap)

    public open fun packedByMemory(): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.packedByMemory().let(PlacementStrategy::wrap)

    public open fun randomly(): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.randomly().let(PlacementStrategy::wrap)

    public open fun spreadAcross(fields: String): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.spreadAcross(fields).let(PlacementStrategy::wrap)

    public open fun spreadAcrossInstances(): PlacementStrategy =
        software.amazon.awscdk.services.ecs.PlacementStrategy.spreadAcrossInstances().let(PlacementStrategy::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.PlacementStrategy):
        PlacementStrategy = PlacementStrategy(cdkObject)

    internal fun unwrap(wrapped: PlacementStrategy):
        software.amazon.awscdk.services.ecs.PlacementStrategy = wrapped.cdkObject
  }
}
