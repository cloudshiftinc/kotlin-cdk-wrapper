@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment

@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentNotifyConfigurationTypePropertyDsl {
  private val cdkBuilder:
      CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty.Builder =
      CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty.builder()

  public fun blockEmail(blockEmail: IResolvable) {
    cdkBuilder.blockEmail(blockEmail)
  }

  public
      fun blockEmail(blockEmail: CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty) {
    cdkBuilder.blockEmail(blockEmail)
  }

  public fun from(from: String) {
    cdkBuilder.from(from)
  }

  public fun mfaEmail(mfaEmail: IResolvable) {
    cdkBuilder.mfaEmail(mfaEmail)
  }

  public fun mfaEmail(mfaEmail: CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty) {
    cdkBuilder.mfaEmail(mfaEmail)
  }

  public fun noActionEmail(noActionEmail: IResolvable) {
    cdkBuilder.noActionEmail(noActionEmail)
  }

  public
      fun noActionEmail(noActionEmail: CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty) {
    cdkBuilder.noActionEmail(noActionEmail)
  }

  public fun replyTo(replyTo: String) {
    cdkBuilder.replyTo(replyTo)
  }

  public fun sourceArn(sourceArn: String) {
    cdkBuilder.sourceArn(sourceArn)
  }

  public fun build(): CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty =
      cdkBuilder.build()
}
