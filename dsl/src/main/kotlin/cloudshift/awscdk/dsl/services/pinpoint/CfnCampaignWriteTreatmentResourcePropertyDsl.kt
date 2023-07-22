@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@CdkDslMarker
public class CfnCampaignWriteTreatmentResourcePropertyDsl {
  private val cdkBuilder: CfnCampaign.WriteTreatmentResourceProperty.Builder =
      CfnCampaign.WriteTreatmentResourceProperty.builder()

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
   * @param messageConfiguration The message configuration settings for the treatment.
   */
  public fun messageConfiguration(messageConfiguration: IResolvable) {
    cdkBuilder.messageConfiguration(messageConfiguration)
  }

  /**
   * @param messageConfiguration The message configuration settings for the treatment.
   */
  public fun messageConfiguration(messageConfiguration: CfnCampaign.MessageConfigurationProperty) {
    cdkBuilder.messageConfiguration(messageConfiguration)
  }

  /**
   * @param schedule The schedule settings for the treatment.
   */
  public fun schedule(schedule: IResolvable) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * @param schedule The schedule settings for the treatment.
   */
  public fun schedule(schedule: CfnCampaign.ScheduleProperty) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * @param sizePercent The allocated percentage of users (segment members) to send the treatment
   * to.
   */
  public fun sizePercent(sizePercent: Number) {
    cdkBuilder.sizePercent(sizePercent)
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
   * @param treatmentDescription A custom description of the treatment.
   */
  public fun treatmentDescription(treatmentDescription: String) {
    cdkBuilder.treatmentDescription(treatmentDescription)
  }

  /**
   * @param treatmentName A custom name for the treatment.
   */
  public fun treatmentName(treatmentName: String) {
    cdkBuilder.treatmentName(treatmentName)
  }

  public fun build(): CfnCampaign.WriteTreatmentResourceProperty = cdkBuilder.build()
}
