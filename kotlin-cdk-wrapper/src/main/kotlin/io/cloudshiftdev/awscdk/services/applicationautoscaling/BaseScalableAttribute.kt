@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct

/**
 * Represent an attribute for which autoscaling can be configured.
 *
 * This class is basically a light wrapper around ScalableTarget, but with
 * all methods protected instead of public so they can be selectively
 * exposed and/or more specific versions of them can be exposed by derived
 * classes for individual services support autoscaling.
 *
 * Typical use cases:
 *
 * * Hide away the PredefinedMetric enum for target tracking policies.
 * * Don't expose all scaling methods (for example Dynamo tables don't support
 * Step Scaling, so the Dynamo subclass won't expose this method).
 */
public abstract class BaseScalableAttribute(
  cdkObject: software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttribute,
) : Construct(cdkObject) {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttribute,
  ) : BaseScalableAttribute(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttribute):
        BaseScalableAttribute = CdkObjectWrappers.wrap(cdkObject) as? BaseScalableAttribute ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseScalableAttribute):
        software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttribute = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttribute
  }
}
