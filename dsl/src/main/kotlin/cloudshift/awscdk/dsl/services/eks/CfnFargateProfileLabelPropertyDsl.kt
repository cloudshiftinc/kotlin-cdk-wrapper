@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.CfnFargateProfile

@CdkDslMarker
public class CfnFargateProfileLabelPropertyDsl {
  private val cdkBuilder: CfnFargateProfile.LabelProperty.Builder =
      CfnFargateProfile.LabelProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnFargateProfile.LabelProperty = cdkBuilder.build()
}
