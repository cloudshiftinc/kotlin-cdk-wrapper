@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.targets.*;
 * Instance instance;
 * InstanceTarget instanceTarget = new InstanceTarget(instance, 123);
 * ```
 */
public open class InstanceTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.targets.InstanceTarget,
) : InstanceIdTarget(cdkObject) {
  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.targets.InstanceTarget):
        InstanceTarget = InstanceTarget(cdkObject)

    internal fun unwrap(wrapped: InstanceTarget):
        software.amazon.awscdk.services.elasticloadbalancingv2.targets.InstanceTarget =
        wrapped.cdkObject
  }
}
