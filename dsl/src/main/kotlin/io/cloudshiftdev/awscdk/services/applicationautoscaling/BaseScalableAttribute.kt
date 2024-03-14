package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct

public abstract class BaseScalableAttribute internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttribute,
) : Construct(cdkObject) {
  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttribute,
  ) : BaseScalableAttribute(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttribute):
        BaseScalableAttribute = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseScalableAttribute):
        software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttribute = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttribute
  }
}
