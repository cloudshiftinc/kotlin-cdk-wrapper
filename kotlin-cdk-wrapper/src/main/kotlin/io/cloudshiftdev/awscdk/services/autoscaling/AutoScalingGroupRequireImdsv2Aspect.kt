@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.IAspect
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct

/**
 * Aspect that makes IMDSv2 required on instances deployed by AutoScalingGroups.
 *
 * Example:
 *
 * ```
 * AutoScalingGroupRequireImdsv2Aspect aspect = new AutoScalingGroupRequireImdsv2Aspect();
 * Aspects.of(this).add(aspect);
 * ```
 */
public open class AutoScalingGroupRequireImdsv2Aspect internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.autoscaling.AutoScalingGroupRequireImdsv2Aspect,
) : CdkObject(cdkObject), IAspect {
  public constructor() :
      this(software.amazon.awscdk.services.autoscaling.AutoScalingGroupRequireImdsv2Aspect()
  )

  /**
   * All aspects can visit an IConstruct.
   *
   * @param node 
   */
  public override fun visit(node: IConstruct) {
    unwrap(this).visit(node.let(IConstruct::unwrap))
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.AutoScalingGroupRequireImdsv2Aspect):
        AutoScalingGroupRequireImdsv2Aspect = AutoScalingGroupRequireImdsv2Aspect(cdkObject)

    internal fun unwrap(wrapped: AutoScalingGroupRequireImdsv2Aspect):
        software.amazon.awscdk.services.autoscaling.AutoScalingGroupRequireImdsv2Aspect =
        wrapped.cdkObject
  }
}
