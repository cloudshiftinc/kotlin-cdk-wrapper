@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscalingplans

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnScalingPlan`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscalingplans.*;
 * CfnScalingPlanProps cfnScalingPlanProps = CfnScalingPlanProps.builder()
 * .applicationSource(ApplicationSourceProperty.builder()
 * .cloudFormationStackArn("cloudFormationStackArn")
 * .tagFilters(List.of(TagFilterProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .values(List.of("values"))
 * .build()))
 * .build())
 * .scalingInstructions(List.of(ScalingInstructionProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .resourceId("resourceId")
 * .scalableDimension("scalableDimension")
 * .serviceNamespace("serviceNamespace")
 * .targetTrackingConfigurations(List.of(TargetTrackingConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .customizedScalingMetricSpecification(CustomizedScalingMetricSpecificationProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * .statistic("statistic")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .unit("unit")
 * .build())
 * .disableScaleIn(false)
 * .estimatedInstanceWarmup(123)
 * .predefinedScalingMetricSpecification(PredefinedScalingMetricSpecificationProperty.builder()
 * .predefinedScalingMetricType("predefinedScalingMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build()))
 * // the properties below are optional
 * .customizedLoadMetricSpecification(CustomizedLoadMetricSpecificationProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * .statistic("statistic")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .unit("unit")
 * .build())
 * .disableDynamicScaling(false)
 * .predefinedLoadMetricSpecification(PredefinedLoadMetricSpecificationProperty.builder()
 * .predefinedLoadMetricType("predefinedLoadMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .predictiveScalingMaxCapacityBehavior("predictiveScalingMaxCapacityBehavior")
 * .predictiveScalingMaxCapacityBuffer(123)
 * .predictiveScalingMode("predictiveScalingMode")
 * .scalingPolicyUpdateBehavior("scalingPolicyUpdateBehavior")
 * .scheduledActionBufferTime(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html)
 */
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
        CfnScalingPlanProps = CdkObjectWrappers.wrap(cdkObject) as? CfnScalingPlanProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScalingPlanProps):
        software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps
  }
}
