@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

@CdkDslMarker
public class CfnUserProfileRStudioServerProAppSettingsPropertyDsl {
  private val cdkBuilder: CfnUserProfile.RStudioServerProAppSettingsProperty.Builder =
      CfnUserProfile.RStudioServerProAppSettingsProperty.builder()

  public fun accessStatus(accessStatus: String) {
    cdkBuilder.accessStatus(accessStatus)
  }

  public fun userGroup(userGroup: String) {
    cdkBuilder.userGroup(userGroup)
  }

  public fun build(): CfnUserProfile.RStudioServerProAppSettingsProperty = cdkBuilder.build()
}
