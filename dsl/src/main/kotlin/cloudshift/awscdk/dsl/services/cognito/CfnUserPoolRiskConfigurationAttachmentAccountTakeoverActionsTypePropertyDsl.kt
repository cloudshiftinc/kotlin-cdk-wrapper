@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment

@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentAccountTakeoverActionsTypePropertyDsl {
  private val cdkBuilder:
      CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty.Builder =
      CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty.builder()

  /**
   * @param highAction Action to take for a high risk.
   */
  public fun highAction(highAction: IResolvable) {
    cdkBuilder.highAction(highAction)
  }

  /**
   * @param highAction Action to take for a high risk.
   */
  public
      fun highAction(highAction: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty) {
    cdkBuilder.highAction(highAction)
  }

  /**
   * @param lowAction Action to take for a low risk.
   */
  public fun lowAction(lowAction: IResolvable) {
    cdkBuilder.lowAction(lowAction)
  }

  /**
   * @param lowAction Action to take for a low risk.
   */
  public
      fun lowAction(lowAction: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty) {
    cdkBuilder.lowAction(lowAction)
  }

  /**
   * @param mediumAction Action to take for a medium risk.
   */
  public fun mediumAction(mediumAction: IResolvable) {
    cdkBuilder.mediumAction(mediumAction)
  }

  /**
   * @param mediumAction Action to take for a medium risk.
   */
  public
      fun mediumAction(mediumAction: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty) {
    cdkBuilder.mediumAction(mediumAction)
  }

  public fun build(): CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty =
      cdkBuilder.build()
}
