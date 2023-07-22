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

  /**
   * @param backgroundColor The background color for an in-app message banner, expressed as a hex
   * color code (such as #000000 for black).
   */
  public fun backgroundColor(backgroundColor: String) {
    cdkBuilder.backgroundColor(backgroundColor)
  }

  /**
   * @param bodyConfig Specifies the configuration of main body text in an in-app message template.
   */
  public fun bodyConfig(bodyConfig: IResolvable) {
    cdkBuilder.bodyConfig(bodyConfig)
  }

  /**
   * @param bodyConfig Specifies the configuration of main body text in an in-app message template.
   */
  public fun bodyConfig(bodyConfig: CfnCampaign.InAppMessageBodyConfigProperty) {
    cdkBuilder.bodyConfig(bodyConfig)
  }

  /**
   * @param headerConfig Specifies the configuration and content of the header or title text of the
   * in-app message.
   */
  public fun headerConfig(headerConfig: IResolvable) {
    cdkBuilder.headerConfig(headerConfig)
  }

  /**
   * @param headerConfig Specifies the configuration and content of the header or title text of the
   * in-app message.
   */
  public fun headerConfig(headerConfig: CfnCampaign.InAppMessageHeaderConfigProperty) {
    cdkBuilder.headerConfig(headerConfig)
  }

  /**
   * @param imageUrl The URL of the image that appears on an in-app message banner.
   */
  public fun imageUrl(imageUrl: String) {
    cdkBuilder.imageUrl(imageUrl)
  }

  /**
   * @param primaryBtn An object that contains configuration information about the primary button in
   * an in-app message.
   */
  public fun primaryBtn(primaryBtn: IResolvable) {
    cdkBuilder.primaryBtn(primaryBtn)
  }

  /**
   * @param primaryBtn An object that contains configuration information about the primary button in
   * an in-app message.
   */
  public fun primaryBtn(primaryBtn: CfnCampaign.InAppMessageButtonProperty) {
    cdkBuilder.primaryBtn(primaryBtn)
  }

  /**
   * @param secondaryBtn An object that contains configuration information about the secondary
   * button in an in-app message.
   */
  public fun secondaryBtn(secondaryBtn: IResolvable) {
    cdkBuilder.secondaryBtn(secondaryBtn)
  }

  /**
   * @param secondaryBtn An object that contains configuration information about the secondary
   * button in an in-app message.
   */
  public fun secondaryBtn(secondaryBtn: CfnCampaign.InAppMessageButtonProperty) {
    cdkBuilder.secondaryBtn(secondaryBtn)
  }

  public fun build(): CfnCampaign.InAppMessageContentProperty = cdkBuilder.build()
}
