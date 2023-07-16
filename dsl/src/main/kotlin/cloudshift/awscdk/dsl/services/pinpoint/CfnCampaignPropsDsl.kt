@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import software.amazon.awscdk.services.pinpoint.CfnCampaignProps

@CdkDslMarker
public class CfnCampaignPropsDsl {
  private val cdkBuilder: CfnCampaignProps.Builder = CfnCampaignProps.builder()

  private val _additionalTreatments: MutableList<Any> = mutableListOf()

  public fun additionalTreatments(vararg additionalTreatments: Any) {
    _additionalTreatments.addAll(listOf(*additionalTreatments))
  }

  public fun additionalTreatments(additionalTreatments: Collection<Any>) {
    _additionalTreatments.addAll(additionalTreatments)
  }

  public fun additionalTreatments(additionalTreatments: IResolvable) {
    cdkBuilder.additionalTreatments(additionalTreatments)
  }

  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  public fun campaignHook(campaignHook: IResolvable) {
    cdkBuilder.campaignHook(campaignHook)
  }

  public fun campaignHook(campaignHook: CfnCampaign.CampaignHookProperty) {
    cdkBuilder.campaignHook(campaignHook)
  }

  public fun customDeliveryConfiguration(customDeliveryConfiguration: IResolvable) {
    cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration)
  }

  public
      fun customDeliveryConfiguration(customDeliveryConfiguration: CfnCampaign.CustomDeliveryConfigurationProperty) {
    cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun holdoutPercent(holdoutPercent: Number) {
    cdkBuilder.holdoutPercent(holdoutPercent)
  }

  public fun isPaused(isPaused: Boolean) {
    cdkBuilder.isPaused(isPaused)
  }

  public fun isPaused(isPaused: IResolvable) {
    cdkBuilder.isPaused(isPaused)
  }

  public fun limits(limits: IResolvable) {
    cdkBuilder.limits(limits)
  }

  public fun limits(limits: CfnCampaign.LimitsProperty) {
    cdkBuilder.limits(limits)
  }

  public fun messageConfiguration(messageConfiguration: IResolvable) {
    cdkBuilder.messageConfiguration(messageConfiguration)
  }

  public fun messageConfiguration(messageConfiguration: CfnCampaign.MessageConfigurationProperty) {
    cdkBuilder.messageConfiguration(messageConfiguration)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun schedule(schedule: IResolvable) {
    cdkBuilder.schedule(schedule)
  }

  public fun schedule(schedule: CfnCampaign.ScheduleProperty) {
    cdkBuilder.schedule(schedule)
  }

  public fun segmentId(segmentId: String) {
    cdkBuilder.segmentId(segmentId)
  }

  public fun segmentVersion(segmentVersion: Number) {
    cdkBuilder.segmentVersion(segmentVersion)
  }

  public fun tags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tags(builder.map)
  }

  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun templateConfiguration(templateConfiguration: IResolvable) {
    cdkBuilder.templateConfiguration(templateConfiguration)
  }

  public
      fun templateConfiguration(templateConfiguration: CfnCampaign.TemplateConfigurationProperty) {
    cdkBuilder.templateConfiguration(templateConfiguration)
  }

  public fun treatmentDescription(treatmentDescription: String) {
    cdkBuilder.treatmentDescription(treatmentDescription)
  }

  public fun treatmentName(treatmentName: String) {
    cdkBuilder.treatmentName(treatmentName)
  }

  public fun build(): CfnCampaignProps {
    if(_additionalTreatments.isNotEmpty()) cdkBuilder.additionalTreatments(_additionalTreatments)
    return cdkBuilder.build()
  }
}
