@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnPlan
import software.constructs.Construct

/**
 * Information about the stages and on-call rotation teams associated with an escalation plan or
 * engagement plan.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmcontacts.*;
 * CfnPlan cfnPlan = CfnPlan.Builder.create(this, "MyCfnPlan")
 * .contactId("contactId")
 * // the properties below are optional
 * .rotationIds(List.of("rotationIds"))
 * .stages(List.of(StageProperty.builder()
 * .durationInMinutes(123)
 * // the properties below are optional
 * .targets(List.of(TargetsProperty.builder()
 * .channelTargetInfo(ChannelTargetInfoProperty.builder()
 * .channelId("channelId")
 * .retryIntervalInMinutes(123)
 * .build())
 * .contactTargetInfo(ContactTargetInfoProperty.builder()
 * .contactId("contactId")
 * .isEssential(false)
 * .build())
 * .build()))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html)
 */
@CdkDslMarker
public class CfnPlanDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPlan.Builder = CfnPlan.Builder.create(scope, id)

  private val _rotationIds: MutableList<String> = mutableListOf()

  private val _stages: MutableList<Any> = mutableListOf()

  /**
   * The Amazon Resource Name (ARN) of the contact.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-contactid)
   * @param contactId The Amazon Resource Name (ARN) of the contact. 
   */
  public fun contactId(contactId: String) {
    cdkBuilder.contactId(contactId)
  }

  /**
   * The Amazon Resource Names (ARNs) of the on-call rotations associated with the plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-rotationids)
   * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated with
   * the plan. 
   */
  public fun rotationIds(vararg rotationIds: String) {
    _rotationIds.addAll(listOf(*rotationIds))
  }

  /**
   * The Amazon Resource Names (ARNs) of the on-call rotations associated with the plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-rotationids)
   * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated with
   * the plan. 
   */
  public fun rotationIds(rotationIds: Collection<String>) {
    _rotationIds.addAll(rotationIds)
  }

  /**
   * A list of stages that the escalation plan or engagement plan uses to engage contacts and
   * contact methods.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-stages)
   * @param stages A list of stages that the escalation plan or engagement plan uses to engage
   * contacts and contact methods. 
   */
  public fun stages(vararg stages: Any) {
    _stages.addAll(listOf(*stages))
  }

  /**
   * A list of stages that the escalation plan or engagement plan uses to engage contacts and
   * contact methods.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-stages)
   * @param stages A list of stages that the escalation plan or engagement plan uses to engage
   * contacts and contact methods. 
   */
  public fun stages(stages: Collection<Any>) {
    _stages.addAll(stages)
  }

  /**
   * A list of stages that the escalation plan or engagement plan uses to engage contacts and
   * contact methods.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-stages)
   * @param stages A list of stages that the escalation plan or engagement plan uses to engage
   * contacts and contact methods. 
   */
  public fun stages(stages: IResolvable) {
    cdkBuilder.stages(stages)
  }

  public fun build(): CfnPlan {
    if(_rotationIds.isNotEmpty()) cdkBuilder.rotationIds(_rotationIds)
    if(_stages.isNotEmpty()) cdkBuilder.stages(_stages)
    return cdkBuilder.build()
  }
}
