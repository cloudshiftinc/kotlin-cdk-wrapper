@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscalingplans

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
import software.constructs.Construct

/**
 * The `AWS::AutoScalingPlans::ScalingPlan` resource defines an AWS Auto Scaling scaling plan.
 *
 * A scaling plan is used to scale application resources to size them appropriately to ensure that
 * enough resource is available in the application at peak times and to reduce allocated resource
 * during periods of low utilization. The following resources can be added to a scaling plan:
 *
 * * Amazon EC2 Auto Scaling groups
 * * Amazon EC2 Spot Fleet requests
 * * Amazon ECS services
 * * Amazon DynamoDB tables and global secondary indexes
 * * Amazon Aurora Replicas
 *
 * For more information, see the [AWS Auto Scaling User
 * Guide](https://docs.aws.amazon.com/autoscaling/plans/userguide/what-is-aws-auto-scaling.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscalingplans.*;
 * CfnScalingPlan cfnScalingPlan = CfnScalingPlan.Builder.create(this, "MyCfnScalingPlan")
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
@CdkDslMarker
public class CfnScalingPlanDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnScalingPlan.Builder = CfnScalingPlan.Builder.create(scope, id)

  private val _scalingInstructions: MutableList<Any> = mutableListOf()

  /**
   * A CloudFormation stack or a set of tags.
   *
   * You can create one scaling plan per application source. The `ApplicationSource` property must
   * be present to ensure interoperability with the AWS Auto Scaling console.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-applicationsource)
   * @param applicationSource A CloudFormation stack or a set of tags. 
   */
  public fun applicationSource(applicationSource: IResolvable) {
    cdkBuilder.applicationSource(applicationSource)
  }

  /**
   * A CloudFormation stack or a set of tags.
   *
   * You can create one scaling plan per application source. The `ApplicationSource` property must
   * be present to ensure interoperability with the AWS Auto Scaling console.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-applicationsource)
   * @param applicationSource A CloudFormation stack or a set of tags. 
   */
  public fun applicationSource(applicationSource: CfnScalingPlan.ApplicationSourceProperty) {
    cdkBuilder.applicationSource(applicationSource)
  }

  /**
   * The scaling instructions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions)
   * @param scalingInstructions The scaling instructions. 
   */
  public fun scalingInstructions(vararg scalingInstructions: Any) {
    _scalingInstructions.addAll(listOf(*scalingInstructions))
  }

  /**
   * The scaling instructions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions)
   * @param scalingInstructions The scaling instructions. 
   */
  public fun scalingInstructions(scalingInstructions: Collection<Any>) {
    _scalingInstructions.addAll(scalingInstructions)
  }

  /**
   * The scaling instructions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions)
   * @param scalingInstructions The scaling instructions. 
   */
  public fun scalingInstructions(scalingInstructions: IResolvable) {
    cdkBuilder.scalingInstructions(scalingInstructions)
  }

  public fun build(): CfnScalingPlan {
    if(_scalingInstructions.isNotEmpty()) cdkBuilder.scalingInstructions(_scalingInstructions)
    return cdkBuilder.build()
  }
}
