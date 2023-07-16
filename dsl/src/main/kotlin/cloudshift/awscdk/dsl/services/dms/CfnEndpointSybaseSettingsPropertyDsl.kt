@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dms.CfnEndpoint

@CdkDslMarker
public class CfnEndpointSybaseSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.SybaseSettingsProperty.Builder =
      CfnEndpoint.SybaseSettingsProperty.builder()

  public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
    cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
  }

  public fun secretsManagerSecretId(secretsManagerSecretId: String) {
    cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
  }

  public fun build(): CfnEndpoint.SybaseSettingsProperty = cdkBuilder.build()
}
