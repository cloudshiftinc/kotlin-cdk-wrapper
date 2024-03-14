package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String
import kotlin.collections.List

public open class PlacementConstraint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.PlacementConstraint,
) : CdkObject(cdkObject) {
  /**
   * Return the placement JSON.
   */
  public open fun toJson(): List<CfnService.PlacementConstraintProperty> =
      unwrap(this).toJson().map(CfnService.PlacementConstraintProperty::wrap)

  public companion object {
    public fun distinctInstances(): PlacementConstraint =
        software.amazon.awscdk.services.ecs.PlacementConstraint.distinctInstances().let(PlacementConstraint::wrap)

    public fun memberOf(expressions: String): PlacementConstraint =
        software.amazon.awscdk.services.ecs.PlacementConstraint.memberOf(expressions).let(PlacementConstraint::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.PlacementConstraint):
        PlacementConstraint = PlacementConstraint(cdkObject)

    internal fun unwrap(wrapped: PlacementConstraint):
        software.amazon.awscdk.services.ecs.PlacementConstraint = wrapped.cdkObject
  }
}
