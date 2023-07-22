@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnRotation
import software.amazon.awscdk.services.ssmcontacts.CfnRotationProps

@CdkDslMarker
public class CfnRotationPropsDsl {
  private val cdkBuilder: CfnRotationProps.Builder = CfnRotationProps.builder()

  private val _contactIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param contactIds The Amazon Resource Names (ARNs) of the contacts to add to the rotation. 
   * The order in which you list the contacts is their shift order in the rotation schedule.
   */
  public fun contactIds(vararg contactIds: String) {
    _contactIds.addAll(listOf(*contactIds))
  }

  /**
   * @param contactIds The Amazon Resource Names (ARNs) of the contacts to add to the rotation. 
   * The order in which you list the contacts is their shift order in the rotation schedule.
   */
  public fun contactIds(contactIds: Collection<String>) {
    _contactIds.addAll(contactIds)
  }

  /**
   * @param name The name for the rotation. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param recurrence Information about the rule that specifies when shift team members rotate. 
   */
  public fun recurrence(recurrence: IResolvable) {
    cdkBuilder.recurrence(recurrence)
  }

  /**
   * @param recurrence Information about the rule that specifies when shift team members rotate. 
   */
  public fun recurrence(recurrence: CfnRotation.RecurrenceSettingsProperty) {
    cdkBuilder.recurrence(recurrence)
  }

  /**
   * @param startTime The date and time the rotation goes into effect. 
   */
  public fun startTime(startTime: String) {
    cdkBuilder.startTime(startTime)
  }

  /**
   * @param tags Optional metadata to assign to the rotation.
   * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
   * environment. For more information, see [Tagging Incident Manager
   * resources](https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html) in the
   * *Incident Manager User Guide* .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Optional metadata to assign to the rotation.
   * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
   * environment. For more information, see [Tagging Incident Manager
   * resources](https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html) in the
   * *Incident Manager User Guide* .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param timeZoneId The time zone to base the rotation’s activity on, in Internet Assigned
   * Numbers Authority (IANA) format. 
   * For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the [Time
   * Zone Database](https://docs.aws.amazon.com/https://www.iana.org/time-zones) on the IANA website.
   */
  public fun timeZoneId(timeZoneId: String) {
    cdkBuilder.timeZoneId(timeZoneId)
  }

  public fun build(): CfnRotationProps {
    if(_contactIds.isNotEmpty()) cdkBuilder.contactIds(_contactIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
