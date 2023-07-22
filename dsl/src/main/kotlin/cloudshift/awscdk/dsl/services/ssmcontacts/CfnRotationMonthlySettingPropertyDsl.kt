@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ssmcontacts.CfnRotation

@CdkDslMarker
public class CfnRotationMonthlySettingPropertyDsl {
  private val cdkBuilder: CfnRotation.MonthlySettingProperty.Builder =
      CfnRotation.MonthlySettingProperty.builder()

  /**
   * @param dayOfMonth The day of the month when monthly recurring on-call rotations begin. 
   */
  public fun dayOfMonth(dayOfMonth: Number) {
    cdkBuilder.dayOfMonth(dayOfMonth)
  }

  /**
   * @param handOffTime The time of day when a monthly recurring on-call shift rotation begins. 
   */
  public fun handOffTime(handOffTime: String) {
    cdkBuilder.handOffTime(handOffTime)
  }

  public fun build(): CfnRotation.MonthlySettingProperty = cdkBuilder.build()
}
