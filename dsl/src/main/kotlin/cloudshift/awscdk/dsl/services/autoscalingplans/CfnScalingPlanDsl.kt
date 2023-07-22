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
