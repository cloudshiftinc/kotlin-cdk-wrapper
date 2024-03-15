@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

public open class GlobalAcceleratorTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53.targets.GlobalAcceleratorTarget,
) : GlobalAcceleratorDomainTarget(cdkObject) {
  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.GlobalAcceleratorTarget):
        GlobalAcceleratorTarget = GlobalAcceleratorTarget(cdkObject)

    internal fun unwrap(wrapped: GlobalAcceleratorTarget):
        software.amazon.awscdk.services.route53.targets.GlobalAcceleratorTarget = wrapped.cdkObject
  }
}
