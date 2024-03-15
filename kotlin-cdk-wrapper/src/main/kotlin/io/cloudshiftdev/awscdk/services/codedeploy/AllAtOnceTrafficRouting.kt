@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.constructs.Construct

public open class AllAtOnceTrafficRouting internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codedeploy.AllAtOnceTrafficRouting,
) : TrafficRouting(cdkObject) {
  public override fun bind(_scope: Construct): TrafficRoutingConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap)).let(TrafficRoutingConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.AllAtOnceTrafficRouting):
        AllAtOnceTrafficRouting = AllAtOnceTrafficRouting(cdkObject)

    internal fun unwrap(wrapped: AllAtOnceTrafficRouting):
        software.amazon.awscdk.services.codedeploy.AllAtOnceTrafficRouting = wrapped.cdkObject
  }
}