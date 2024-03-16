@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling.common

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number

/**
 *
 */
public interface IRandomGenerator {
  /**
   *
   */
  public fun nextBoolean(): Boolean

  /**
   * @param min 
   * @param max 
   */
  public fun nextInt(min: Number, max: Number): Number

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.common.IRandomGenerator):
        IRandomGenerator = CdkObjectWrappers.wrap(cdkObject) as IRandomGenerator

    internal fun unwrap(wrapped: IRandomGenerator):
        software.amazon.awscdk.services.autoscaling.common.IRandomGenerator = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.common.IRandomGenerator
  }
}
