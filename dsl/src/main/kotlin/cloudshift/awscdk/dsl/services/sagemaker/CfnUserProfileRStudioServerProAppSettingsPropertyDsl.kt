@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

@CdkDslMarker
public class CfnUserProfileRStudioServerProAppSettingsPropertyDsl {
  private val cdkBuilder: CfnUserProfile.RStudioServerProAppSettingsProperty.Builder =
      CfnUserProfile.RStudioServerProAppSettingsProperty.builder()

  /**
   * @param accessStatus Indicates whether the current user has access to the `RStudioServerPro`
   * app.
   */
  public fun accessStatus(accessStatus: String) {
    cdkBuilder.accessStatus(accessStatus)
  }

  /**
   * @param userGroup The level of permissions that the user has within the `RStudioServerPro` app.
   * This value defaults to `User`. The `Admin` value allows the user access to the RStudio
   * Administrative Dashboard.
   */
  public fun userGroup(userGroup: String) {
    cdkBuilder.userGroup(userGroup)
  }

  public fun build(): CfnUserProfile.RStudioServerProAppSettingsProperty = cdkBuilder.build()
}
