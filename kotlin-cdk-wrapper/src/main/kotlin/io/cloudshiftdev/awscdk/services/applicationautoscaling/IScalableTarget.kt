@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 *
 */
public interface IScalableTarget : IResource {
  /**
   *
   */
  public fun scalableTargetId(): String

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.IScalableTarget):
        IScalableTarget = CdkObjectWrappers.wrap(cdkObject) as IScalableTarget

    internal fun unwrap(wrapped: IScalableTarget):
        software.amazon.awscdk.services.applicationautoscaling.IScalableTarget = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.IScalableTarget
  }
}
