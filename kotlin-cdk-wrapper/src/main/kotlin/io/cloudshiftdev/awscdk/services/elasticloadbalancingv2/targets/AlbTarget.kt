@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets

public open class AlbTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbTarget,
) : AlbArnTarget(cdkObject) {
  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbTarget):
        AlbTarget = AlbTarget(cdkObject)

    internal fun unwrap(wrapped: AlbTarget):
        software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbTarget = wrapped.cdkObject
  }
}
