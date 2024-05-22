@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.constructs.Construct

/**
 * Define a traffic routing config of type 'AllAtOnce'.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codedeploy.*;
 * TrafficRouting allAtOnceTrafficRouting = AllAtOnceTrafficRouting.allAtOnce();
 * ```
 */
public open class AllAtOnceTrafficRouting(
  cdkObject: software.amazon.awscdk.services.codedeploy.AllAtOnceTrafficRouting,
) : TrafficRouting(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.codedeploy.AllAtOnceTrafficRouting()
  )

  /**
   * Return a TrafficRoutingConfig of type `AllAtOnce`.
   *
   * @param _scope 
   */
  public override fun bind(scope: Construct): TrafficRoutingConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap)).let(TrafficRoutingConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.AllAtOnceTrafficRouting):
        AllAtOnceTrafficRouting = AllAtOnceTrafficRouting(cdkObject)

    internal fun unwrap(wrapped: AllAtOnceTrafficRouting):
        software.amazon.awscdk.services.codedeploy.AllAtOnceTrafficRouting = wrapped.cdkObject as
        software.amazon.awscdk.services.codedeploy.AllAtOnceTrafficRouting
  }
}
