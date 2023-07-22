@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@CdkDslMarker
public class CfnResponsePlanIncidentTemplatePropertyDsl {
  private val cdkBuilder: CfnResponsePlan.IncidentTemplateProperty.Builder =
      CfnResponsePlan.IncidentTemplateProperty.builder()

  private val _incidentTags: MutableList<Any> = mutableListOf()

  private val _notificationTargets: MutableList<Any> = mutableListOf()

  /**
   * @param dedupeString Used to create only one incident record for an incident.
   */
  public fun dedupeString(dedupeString: String) {
    cdkBuilder.dedupeString(dedupeString)
  }

  /**
   * @param impact Defines the impact to the customers. Providing an impact overwrites the impact
   * provided by a response plan. 
   * **Possible impacts:** - `1` - Critical impact, this typically relates to full application
   * failure that impacts many to all customers.
   *
   * * `2` - High impact, partial application failure with impact to many customers.
   * * `3` - Medium impact, the application is providing reduced service to customers.
   * * `4` - Low impact, customer might aren't impacted by the problem yet.
   * * `5` - No impact, customers aren't currently impacted but urgent action is needed to avoid
   * impact.
   */
  public fun impact(impact: Number) {
    cdkBuilder.impact(impact)
  }

  /**
   * @param incidentTags Tags to assign to the template.
   * When the `StartIncident` API action is called, Incident Manager assigns the tags specified in
   * the template to the incident.
   */
  public fun incidentTags(vararg incidentTags: Any) {
    _incidentTags.addAll(listOf(*incidentTags))
  }

  /**
   * @param incidentTags Tags to assign to the template.
   * When the `StartIncident` API action is called, Incident Manager assigns the tags specified in
   * the template to the incident.
   */
  public fun incidentTags(incidentTags: Collection<Any>) {
    _incidentTags.addAll(incidentTags)
  }

  /**
   * @param incidentTags Tags to assign to the template.
   * When the `StartIncident` API action is called, Incident Manager assigns the tags specified in
   * the template to the incident.
   */
  public fun incidentTags(incidentTags: IResolvable) {
    cdkBuilder.incidentTags(incidentTags)
  }

  /**
   * @param notificationTargets The SNS targets that AWS Chatbot uses to notify the chat channel of
   * updates to an incident.
   * You can also make updates to the incident through the chat channel using the SNS topics.
   */
  public fun notificationTargets(vararg notificationTargets: Any) {
    _notificationTargets.addAll(listOf(*notificationTargets))
  }

  /**
   * @param notificationTargets The SNS targets that AWS Chatbot uses to notify the chat channel of
   * updates to an incident.
   * You can also make updates to the incident through the chat channel using the SNS topics.
   */
  public fun notificationTargets(notificationTargets: Collection<Any>) {
    _notificationTargets.addAll(notificationTargets)
  }

  /**
   * @param notificationTargets The SNS targets that AWS Chatbot uses to notify the chat channel of
   * updates to an incident.
   * You can also make updates to the incident through the chat channel using the SNS topics.
   */
  public fun notificationTargets(notificationTargets: IResolvable) {
    cdkBuilder.notificationTargets(notificationTargets)
  }

  /**
   * @param summary The summary describes what has happened during the incident.
   */
  public fun summary(summary: String) {
    cdkBuilder.summary(summary)
  }

  /**
   * @param title The title of the incident is a brief and easily recognizable. 
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnResponsePlan.IncidentTemplateProperty {
    if(_incidentTags.isNotEmpty()) cdkBuilder.incidentTags(_incidentTags)
    if(_notificationTargets.isNotEmpty()) cdkBuilder.notificationTargets(_notificationTargets)
    return cdkBuilder.build()
  }
}
