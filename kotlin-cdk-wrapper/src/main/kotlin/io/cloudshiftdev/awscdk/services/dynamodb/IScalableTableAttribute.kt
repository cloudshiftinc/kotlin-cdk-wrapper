@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.applicationautoscaling.ScalingSchedule
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IScalableTableAttribute {
  public fun scaleOnSchedule(arg0: String, arg1: ScalingSchedule)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e652746809f3e4412c49544d1500446974784d78cd2e4c1d569436b4931291f")
  public fun scaleOnSchedule(arg0: String, arg1: ScalingSchedule.Builder.() -> Unit)

  public fun scaleOnUtilization(arg0: UtilizationScalingProps)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df7aa7d44150d61decd5c4ccb502479fe291ac38d35d0eed8af5ae5676750e45")
  public fun scaleOnUtilization(arg0: UtilizationScalingProps.Builder.() -> Unit)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.IScalableTableAttribute,
  ) : CdkObject(cdkObject), IScalableTableAttribute {
    override fun scaleOnSchedule(arg0: String, arg1: ScalingSchedule) {
      unwrap(this).scaleOnSchedule(arg0, arg1.let(ScalingSchedule::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e652746809f3e4412c49544d1500446974784d78cd2e4c1d569436b4931291f")
    override fun scaleOnSchedule(arg0: String, arg1: ScalingSchedule.Builder.() -> Unit): Unit =
        scaleOnSchedule(arg0, ScalingSchedule(arg1))

    override fun scaleOnUtilization(arg0: UtilizationScalingProps) {
      unwrap(this).scaleOnUtilization(arg0.let(UtilizationScalingProps::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df7aa7d44150d61decd5c4ccb502479fe291ac38d35d0eed8af5ae5676750e45")
    override fun scaleOnUtilization(arg0: UtilizationScalingProps.Builder.() -> Unit): Unit =
        scaleOnUtilization(UtilizationScalingProps(arg0))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.IScalableTableAttribute):
        IScalableTableAttribute = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IScalableTableAttribute):
        software.amazon.awscdk.services.dynamodb.IScalableTableAttribute = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.IScalableTableAttribute
  }
}
