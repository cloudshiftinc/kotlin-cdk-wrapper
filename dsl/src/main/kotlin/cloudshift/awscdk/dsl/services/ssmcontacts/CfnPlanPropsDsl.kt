@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnPlanProps

@CdkDslMarker
public class CfnPlanPropsDsl {
  private val cdkBuilder: CfnPlanProps.Builder = CfnPlanProps.builder()

  private val _rotationIds: MutableList<String> = mutableListOf()

  private val _stages: MutableList<Any> = mutableListOf()

  /**
   * @param contactId The Amazon Resource Name (ARN) of the contact. 
   */
  public fun contactId(contactId: String) {
    cdkBuilder.contactId(contactId)
  }

  /**
   * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated with
   * the plan.
   */
  public fun rotationIds(vararg rotationIds: String) {
    _rotationIds.addAll(listOf(*rotationIds))
  }

  /**
   * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated with
   * the plan.
   */
  public fun rotationIds(rotationIds: Collection<String>) {
    _rotationIds.addAll(rotationIds)
  }

  /**
   * @param stages A list of stages that the escalation plan or engagement plan uses to engage
   * contacts and contact methods.
   */
  public fun stages(vararg stages: Any) {
    _stages.addAll(listOf(*stages))
  }

  /**
   * @param stages A list of stages that the escalation plan or engagement plan uses to engage
   * contacts and contact methods.
   */
  public fun stages(stages: Collection<Any>) {
    _stages.addAll(stages)
  }

  /**
   * @param stages A list of stages that the escalation plan or engagement plan uses to engage
   * contacts and contact methods.
   */
  public fun stages(stages: IResolvable) {
    cdkBuilder.stages(stages)
  }

  public fun build(): CfnPlanProps {
    if(_rotationIds.isNotEmpty()) cdkBuilder.rotationIds(_rotationIds)
    if(_stages.isNotEmpty()) cdkBuilder.stages(_stages)
    return cdkBuilder.build()
  }
}
