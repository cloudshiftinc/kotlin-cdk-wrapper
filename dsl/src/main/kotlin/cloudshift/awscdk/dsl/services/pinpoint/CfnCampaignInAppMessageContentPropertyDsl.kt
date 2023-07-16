@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@CdkDslMarker
public class CfnCampaignInAppMessageContentPropertyDsl {
  private val cdkBuilder: CfnCampaign.InAppMessageContentProperty.Builder =
      CfnCampaign.InAppMessageContentProperty.builder()

  public fun backgroundColor(backgroundColor: String) {
    cdkBuilder.backgroundColor(backgroundColor)
  }

  public fun bodyConfig(bodyConfig: IResolvable) {
    cdkBuilder.bodyConfig(bodyConfig)
  }

  public fun bodyConfig(bodyConfig: CfnCampaign.InAppMessageBodyConfigProperty) {
    cdkBuilder.bodyConfig(bodyConfig)
  }

  public fun headerConfig(headerConfig: IResolvable) {
    cdkBuilder.headerConfig(headerConfig)
  }

  public fun headerConfig(headerConfig: CfnCampaign.InAppMessageHeaderConfigProperty) {
    cdkBuilder.headerConfig(headerConfig)
  }

  public fun imageUrl(imageUrl: String) {
    cdkBuilder.imageUrl(imageUrl)
  }

  public fun primaryBtn(primaryBtn: IResolvable) {
    cdkBuilder.primaryBtn(primaryBtn)
  }

  public fun primaryBtn(primaryBtn: CfnCampaign.InAppMessageButtonProperty) {
    cdkBuilder.primaryBtn(primaryBtn)
  }

  public fun secondaryBtn(secondaryBtn: IResolvable) {
    cdkBuilder.secondaryBtn(secondaryBtn)
  }

  public fun secondaryBtn(secondaryBtn: CfnCampaign.InAppMessageButtonProperty) {
    cdkBuilder.secondaryBtn(secondaryBtn)
  }

  public fun build(): CfnCampaign.InAppMessageContentProperty = cdkBuilder.build()
}
