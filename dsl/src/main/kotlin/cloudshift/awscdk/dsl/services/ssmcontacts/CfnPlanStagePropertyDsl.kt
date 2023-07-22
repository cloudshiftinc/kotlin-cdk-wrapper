@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnPlan

@CdkDslMarker
public class CfnPlanStagePropertyDsl {
  private val cdkBuilder: CfnPlan.StageProperty.Builder = CfnPlan.StageProperty.builder()

  private val _targets: MutableList<Any> = mutableListOf()

  /**
   * @param durationInMinutes The time to wait until beginning the next stage. 
   * The duration can only be set to 0 if a target is specified.
   */
  public fun durationInMinutes(durationInMinutes: Number) {
    cdkBuilder.durationInMinutes(durationInMinutes)
  }

  /**
   * @param targets The contacts or contact methods that the escalation plan or engagement plan is
   * engaging.
   */
  public fun targets(vararg targets: Any) {
    _targets.addAll(listOf(*targets))
  }

  /**
   * @param targets The contacts or contact methods that the escalation plan or engagement plan is
   * engaging.
   */
  public fun targets(targets: Collection<Any>) {
    _targets.addAll(targets)
  }

  /**
   * @param targets The contacts or contact methods that the escalation plan or engagement plan is
   * engaging.
   */
  public fun targets(targets: IResolvable) {
    cdkBuilder.targets(targets)
  }

  public fun build(): CfnPlan.StageProperty {
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
