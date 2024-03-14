package io.cloudshiftdev.awscdk.services.autoscalingplans

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnScalingPlanProps {
  /**
   * A CloudFormation stack or a set of tags.
   *
   * You can create one scaling plan per application source. The `ApplicationSource` property must
   * be present to ensure interoperability with the AWS Auto Scaling console.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-applicationsource)
   */
  public fun applicationSource(): Any

  /**
   * The scaling instructions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions)
   */
  public fun scalingInstructions(): Any

  /**
   * A builder for [CfnScalingPlanProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationSource A CloudFormation stack or a set of tags. 
     * You can create one scaling plan per application source. The `ApplicationSource` property must
     * be present to ensure interoperability with the AWS Auto Scaling console.
     */
    public fun applicationSource(applicationSource: IResolvable)

    /**
     * @param applicationSource A CloudFormation stack or a set of tags. 
     * You can create one scaling plan per application source. The `ApplicationSource` property must
     * be present to ensure interoperability with the AWS Auto Scaling console.
     */
    public fun applicationSource(applicationSource: CfnScalingPlan.ApplicationSourceProperty)

    /**
     * @param applicationSource A CloudFormation stack or a set of tags. 
     * You can create one scaling plan per application source. The `ApplicationSource` property must
     * be present to ensure interoperability with the AWS Auto Scaling console.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b42aa89f03ac6d21b9e8871f03c19c5c99f780a9ddebbbdf3224520e6a29794")
    public
        fun applicationSource(applicationSource: CfnScalingPlan.ApplicationSourceProperty.Builder.() -> Unit)

    /**
     * @param scalingInstructions The scaling instructions. 
     */
    public fun scalingInstructions(scalingInstructions: IResolvable)

    /**
     * @param scalingInstructions The scaling instructions. 
     */
    public fun scalingInstructions(scalingInstructions: List<Any>)

    /**
     * @param scalingInstructions The scaling instructions. 
     */
    public fun scalingInstructions(vararg scalingInstructions: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps.Builder =
        software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps.builder()

    /**
     * @param applicationSource A CloudFormation stack or a set of tags. 
     * You can create one scaling plan per application source. The `ApplicationSource` property must
     * be present to ensure interoperability with the AWS Auto Scaling console.
     */
    override fun applicationSource(applicationSource: IResolvable) {
      cdkBuilder.applicationSource(applicationSource.let(IResolvable::unwrap))
    }

    /**
     * @param applicationSource A CloudFormation stack or a set of tags. 
     * You can create one scaling plan per application source. The `ApplicationSource` property must
     * be present to ensure interoperability with the AWS Auto Scaling console.
     */
    override fun applicationSource(applicationSource: CfnScalingPlan.ApplicationSourceProperty) {
      cdkBuilder.applicationSource(applicationSource.let(CfnScalingPlan.ApplicationSourceProperty::unwrap))
    }

    /**
     * @param applicationSource A CloudFormation stack or a set of tags. 
     * You can create one scaling plan per application source. The `ApplicationSource` property must
     * be present to ensure interoperability with the AWS Auto Scaling console.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b42aa89f03ac6d21b9e8871f03c19c5c99f780a9ddebbbdf3224520e6a29794")
    override
        fun applicationSource(applicationSource: CfnScalingPlan.ApplicationSourceProperty.Builder.() -> Unit):
        Unit = applicationSource(CfnScalingPlan.ApplicationSourceProperty(applicationSource))

    /**
     * @param scalingInstructions The scaling instructions. 
     */
    override fun scalingInstructions(scalingInstructions: IResolvable) {
      cdkBuilder.scalingInstructions(scalingInstructions.let(IResolvable::unwrap))
    }

    /**
     * @param scalingInstructions The scaling instructions. 
     */
    override fun scalingInstructions(scalingInstructions: List<Any>) {
      cdkBuilder.scalingInstructions(scalingInstructions)
    }

    /**
     * @param scalingInstructions The scaling instructions. 
     */
    override fun scalingInstructions(vararg scalingInstructions: Any): Unit =
        scalingInstructions(scalingInstructions.toList())

    public fun build(): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps,
  ) : CdkObject(cdkObject), CfnScalingPlanProps {
    /**
     * A CloudFormation stack or a set of tags.
     *
     * You can create one scaling plan per application source. The `ApplicationSource` property must
     * be present to ensure interoperability with the AWS Auto Scaling console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-applicationsource)
     */
    override fun applicationSource(): Any = unwrap(this).getApplicationSource()

    /**
     * The scaling instructions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions)
     */
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
