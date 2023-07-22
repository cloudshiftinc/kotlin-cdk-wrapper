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

  /**
   * @param additionalTreatments An array of requests that defines additional treatments for the
   * campaign, in addition to the default treatment for the campaign.
   */
  public fun additionalTreatments(vararg additionalTreatments: Any) {
    _additionalTreatments.addAll(listOf(*additionalTreatments))
  }

  /**
   * @param additionalTreatments An array of requests that defines additional treatments for the
   * campaign, in addition to the default treatment for the campaign.
   */
  public fun additionalTreatments(additionalTreatments: Collection<Any>) {
    _additionalTreatments.addAll(additionalTreatments)
  }

  /**
   * @param additionalTreatments An array of requests that defines additional treatments for the
   * campaign, in addition to the default treatment for the campaign.
   */
  public fun additionalTreatments(additionalTreatments: IResolvable) {
    cdkBuilder.additionalTreatments(additionalTreatments)
  }

  /**
   * @param applicationId The unique identifier for the Amazon Pinpoint application that the
   * campaign is associated with. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * @param campaignHook Specifies the Lambda function to use as a code hook for a campaign.
   */
  public fun campaignHook(campaignHook: IResolvable) {
    cdkBuilder.campaignHook(campaignHook)
  }

  /**
   * @param campaignHook Specifies the Lambda function to use as a code hook for a campaign.
   */
  public fun campaignHook(campaignHook: CfnCampaign.CampaignHookProperty) {
    cdkBuilder.campaignHook(campaignHook)
  }

  /**
   * @param customDeliveryConfiguration The delivery configuration settings for sending the
   * treatment through a custom channel.
   * This object is required if the `MessageConfiguration` object for the treatment specifies a
   * `CustomMessage` object.
   */
  public fun customDeliveryConfiguration(customDeliveryConfiguration: IResolvable) {
    cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration)
  }

  /**
   * @param customDeliveryConfiguration The delivery configuration settings for sending the
   * treatment through a custom channel.
   * This object is required if the `MessageConfiguration` object for the treatment specifies a
   * `CustomMessage` object.
   */
  public
      fun customDeliveryConfiguration(customDeliveryConfiguration: CfnCampaign.CustomDeliveryConfigurationProperty) {
    cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration)
  }

  /**
   * @param description A custom description of the campaign.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param holdoutPercent The allocated percentage of users (segment members) who shouldn't receive
   * messages from the campaign.
   */
  public fun holdoutPercent(holdoutPercent: Number) {
    cdkBuilder.holdoutPercent(holdoutPercent)
  }

  /**
   * @param isPaused Specifies whether to pause the campaign.
   * A paused campaign doesn't run unless you resume it by changing this value to `false` . If you
   * restart a campaign, the campaign restarts from the beginning and not at the point you paused it.
   * If a campaign is running it will complete and then pause. Pause only pauses or skips the next run
   * for a recurring future scheduled campaign. A campaign scheduled for immediate can't be paused.
   */
  public fun isPaused(isPaused: Boolean) {
    cdkBuilder.isPaused(isPaused)
  }

  /**
   * @param isPaused Specifies whether to pause the campaign.
   * A paused campaign doesn't run unless you resume it by changing this value to `false` . If you
   * restart a campaign, the campaign restarts from the beginning and not at the point you paused it.
   * If a campaign is running it will complete and then pause. Pause only pauses or skips the next run
   * for a recurring future scheduled campaign. A campaign scheduled for immediate can't be paused.
   */
  public fun isPaused(isPaused: IResolvable) {
    cdkBuilder.isPaused(isPaused)
  }

  /**
   * @param limits The messaging limits for the campaign.
   */
  public fun limits(limits: IResolvable) {
    cdkBuilder.limits(limits)
  }

  /**
   * @param limits The messaging limits for the campaign.
   */
  public fun limits(limits: CfnCampaign.LimitsProperty) {
    cdkBuilder.limits(limits)
  }

  /**
   * @param messageConfiguration The message configuration settings for the campaign.
   */
  public fun messageConfiguration(messageConfiguration: IResolvable) {
    cdkBuilder.messageConfiguration(messageConfiguration)
  }

  /**
   * @param messageConfiguration The message configuration settings for the campaign.
   */
  public fun messageConfiguration(messageConfiguration: CfnCampaign.MessageConfigurationProperty) {
    cdkBuilder.messageConfiguration(messageConfiguration)
  }

  /**
   * @param name The name of the campaign. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param priority An integer between 1 and 5, inclusive, that represents the priority of the
   * in-app message campaign, where 1 is the highest priority and 5 is the lowest.
   * If there are multiple messages scheduled to be displayed at the same time, the priority
   * determines the order in which those messages are displayed.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param schedule The schedule settings for the campaign. 
   */
  public fun schedule(schedule: IResolvable) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * @param schedule The schedule settings for the campaign. 
   */
  public fun schedule(schedule: CfnCampaign.ScheduleProperty) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * @param segmentId The unique identifier for the segment to associate with the campaign. 
   */
  public fun segmentId(segmentId: String) {
    cdkBuilder.segmentId(segmentId)
  }

  /**
   * @param segmentVersion The version of the segment to associate with the campaign.
   */
  public fun segmentVersion(segmentVersion: Number) {
    cdkBuilder.segmentVersion(segmentVersion)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param templateConfiguration The message template to use for the treatment.
   */
  public fun templateConfiguration(templateConfiguration: IResolvable) {
    cdkBuilder.templateConfiguration(templateConfiguration)
  }

  /**
   * @param templateConfiguration The message template to use for the treatment.
   */
  public
      fun templateConfiguration(templateConfiguration: CfnCampaign.TemplateConfigurationProperty) {
    cdkBuilder.templateConfiguration(templateConfiguration)
  }

  /**
   * @param treatmentDescription A custom description of the default treatment for the campaign.
   */
  public fun treatmentDescription(treatmentDescription: String) {
    cdkBuilder.treatmentDescription(treatmentDescription)
  }

  /**
   * @param treatmentName A custom name of the default treatment for the campaign, if the campaign
   * has multiple treatments.
   * A *treatment* is a variation of a campaign that's used for A/B testing.
   */
  public fun treatmentName(treatmentName: String) {
    cdkBuilder.treatmentName(treatmentName)
  }

  public fun build(): CfnCampaignProps {
    if(_additionalTreatments.isNotEmpty()) cdkBuilder.additionalTreatments(_additionalTreatments)
    return cdkBuilder.build()
  }
}
