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

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.common.IRandomGenerator,
  ) : CdkObject(cdkObject),
      IRandomGenerator {
    /**
     *
     */
    override fun nextBoolean(): Boolean = unwrap(this).nextBoolean()

    /**
     * @param min 
     * @param max 
     */
    override fun nextInt(min: Number, max: Number): Number = unwrap(this).nextInt(min, max)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.common.IRandomGenerator):
        IRandomGenerator = CdkObjectWrappers.wrap(cdkObject) as? IRandomGenerator ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRandomGenerator):
        software.amazon.awscdk.services.autoscaling.common.IRandomGenerator = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.common.IRandomGenerator
  }
}
