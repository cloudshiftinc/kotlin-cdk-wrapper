@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.applicationautoscaling.ScalingSchedule
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IScalableFunctionAttribute : IConstruct {
  public fun scaleOnSchedule(arg0: String, arg1: ScalingSchedule)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e652746809f3e4412c49544d1500446974784d78cd2e4c1d569436b4931291f")
  public fun scaleOnSchedule(arg0: String, arg1: ScalingSchedule.Builder.() -> Unit)

  public fun scaleOnUtilization(arg0: UtilizationScalingOptions)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe32b38d4b85bd17fe2b79bbbf0cf909ca5f3e4294d4935b76798b3372d86202")
  public fun scaleOnUtilization(arg0: UtilizationScalingOptions.Builder.() -> Unit)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.IScalableFunctionAttribute,
  ) : CdkObject(cdkObject), IScalableFunctionAttribute {
    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun scaleOnSchedule(arg0: String, arg1: ScalingSchedule) {
      unwrap(this).scaleOnSchedule(arg0, arg1.let(ScalingSchedule::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e652746809f3e4412c49544d1500446974784d78cd2e4c1d569436b4931291f")
    override fun scaleOnSchedule(arg0: String, arg1: ScalingSchedule.Builder.() -> Unit): Unit =
        scaleOnSchedule(arg0, ScalingSchedule(arg1))

    override fun scaleOnUtilization(arg0: UtilizationScalingOptions) {
      unwrap(this).scaleOnUtilization(arg0.let(UtilizationScalingOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe32b38d4b85bd17fe2b79bbbf0cf909ca5f3e4294d4935b76798b3372d86202")
    override fun scaleOnUtilization(arg0: UtilizationScalingOptions.Builder.() -> Unit): Unit =
        scaleOnUtilization(UtilizationScalingOptions(arg0))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IScalableFunctionAttribute):
        IScalableFunctionAttribute = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IScalableFunctionAttribute):
        software.amazon.awscdk.services.lambda.IScalableFunctionAttribute = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.IScalableFunctionAttribute
  }
}
