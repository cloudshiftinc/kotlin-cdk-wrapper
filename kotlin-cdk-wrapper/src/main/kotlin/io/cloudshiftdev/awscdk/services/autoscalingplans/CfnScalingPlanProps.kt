@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscalingplans

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnScalingPlanProps {
  public fun applicationSource(): Any

  public fun scalingInstructions(): Any

  @CdkDslMarker
  public interface Builder {
    public fun applicationSource(applicationSource: IResolvable)

    public fun applicationSource(applicationSource: CfnScalingPlan.ApplicationSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b42aa89f03ac6d21b9e8871f03c19c5c99f780a9ddebbbdf3224520e6a29794")
    public
        fun applicationSource(applicationSource: CfnScalingPlan.ApplicationSourceProperty.Builder.() -> Unit)

    public fun scalingInstructions(scalingInstructions: IResolvable)

    public fun scalingInstructions(scalingInstructions: List<Any>)

    public fun scalingInstructions(vararg scalingInstructions: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps.Builder =
        software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps.builder()

    override fun applicationSource(applicationSource: IResolvable) {
      cdkBuilder.applicationSource(applicationSource.let(IResolvable::unwrap))
    }

    override fun applicationSource(applicationSource: CfnScalingPlan.ApplicationSourceProperty) {
      cdkBuilder.applicationSource(applicationSource.let(CfnScalingPlan.ApplicationSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b42aa89f03ac6d21b9e8871f03c19c5c99f780a9ddebbbdf3224520e6a29794")
    override
        fun applicationSource(applicationSource: CfnScalingPlan.ApplicationSourceProperty.Builder.() -> Unit):
        Unit = applicationSource(CfnScalingPlan.ApplicationSourceProperty(applicationSource))

    override fun scalingInstructions(scalingInstructions: IResolvable) {
      cdkBuilder.scalingInstructions(scalingInstructions.let(IResolvable::unwrap))
    }

    override fun scalingInstructions(scalingInstructions: List<Any>) {
      cdkBuilder.scalingInstructions(scalingInstructions)
    }

    override fun scalingInstructions(vararg scalingInstructions: Any): Unit =
        scalingInstructions(scalingInstructions.toList())

    public fun build(): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps,
  ) : CdkObject(cdkObject), CfnScalingPlanProps {
    override fun applicationSource(): Any = unwrap(this).getApplicationSource()

    override fun scalingInstructions(): Any = unwrap(this).getScalingInstructions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScalingPlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps):
        CfnScalingPlanProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScalingPlanProps):
        software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps
  }
}
