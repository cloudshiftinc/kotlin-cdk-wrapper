package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IAspect
import io.cloudshiftdev.constructs.IConstruct

public open class AutoScalingGroupRequireImdsv2Aspect internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.autoscaling.AutoScalingGroupRequireImdsv2Aspect,
) : CdkObject(cdkObject), IAspect {
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
