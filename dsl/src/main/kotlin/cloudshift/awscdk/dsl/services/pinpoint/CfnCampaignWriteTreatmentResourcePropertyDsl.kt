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

  public fun customDeliveryConfiguration(customDeliveryConfiguration: IResolvable) {
    cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration)
  }

  public
      fun customDeliveryConfiguration(customDeliveryConfiguration: CfnCampaign.CustomDeliveryConfigurationProperty) {
    cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration)
  }

  public fun messageConfiguration(messageConfiguration: IResolvable) {
    cdkBuilder.messageConfiguration(messageConfiguration)
  }

  public fun messageConfiguration(messageConfiguration: CfnCampaign.MessageConfigurationProperty) {
    cdkBuilder.messageConfiguration(messageConfiguration)
  }

  public fun schedule(schedule: IResolvable) {
    cdkBuilder.schedule(schedule)
  }

  public fun schedule(schedule: CfnCampaign.ScheduleProperty) {
    cdkBuilder.schedule(schedule)
  }

  public fun sizePercent(sizePercent: Number) {
    cdkBuilder.sizePercent(sizePercent)
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

  public fun build(): CfnCampaign.WriteTreatmentResourceProperty = cdkBuilder.build()
}
