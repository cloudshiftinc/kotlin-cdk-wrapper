@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnContactProps

@CdkDslMarker
public class CfnContactPropsDsl {
  private val cdkBuilder: CfnContactProps.Builder = CfnContactProps.builder()

  private val _plan: MutableList<Any> = mutableListOf()

  /**
   * @param alias The unique and identifiable alias of the contact or escalation plan. 
   */
  public fun alias(alias: String) {
    cdkBuilder.alias(alias)
  }

  /**
   * @param displayName The full name of the contact or escalation plan. 
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  /**
   * @param plan A list of stages.
   * A contact has an engagement plan with stages that contact specified contact channels. An
   * escalation plan uses stages that contact specified contacts.
   */
  public fun plan(vararg plan: Any) {
    _plan.addAll(listOf(*plan))
  }

  /**
   * @param plan A list of stages.
   * A contact has an engagement plan with stages that contact specified contact channels. An
   * escalation plan uses stages that contact specified contacts.
   */
  public fun plan(plan: Collection<Any>) {
    _plan.addAll(plan)
  }

  /**
   * @param plan A list of stages.
   * A contact has an engagement plan with stages that contact specified contact channels. An
   * escalation plan uses stages that contact specified contacts.
   */
  public fun plan(plan: IResolvable) {
    cdkBuilder.plan(plan)
  }

  /**
   * @param type Refers to the type of contact:. 
   * * `PERSONAL` : A single, individual contact.
   * * `ESCALATION` : An escalation plan.
   * * `ONCALL_SCHEDULE` : An on-call schedule.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnContactProps {
    if(_plan.isNotEmpty()) cdkBuilder.plan(_plan)
    return cdkBuilder.build()
  }
}
