@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling.common

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number

public interface IRandomGenerator {
  public fun nextBoolean(): Boolean

  public fun nextInt(arg0: Number, arg1: Number): Number

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.common.IRandomGenerator,
  ) : CdkObject(cdkObject), IRandomGenerator {
    override fun nextBoolean(): Boolean = unwrap(this).nextBoolean()

    override fun nextInt(arg0: Number, arg1: Number): Number = unwrap(this).nextInt(arg0, arg1)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.common.IRandomGenerator):
        IRandomGenerator = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRandomGenerator):
        software.amazon.awscdk.services.autoscaling.common.IRandomGenerator = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.common.IRandomGenerator
  }
}
