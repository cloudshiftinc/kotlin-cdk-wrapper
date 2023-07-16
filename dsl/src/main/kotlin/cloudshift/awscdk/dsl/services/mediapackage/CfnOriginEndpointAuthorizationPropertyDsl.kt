@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint

@CdkDslMarker
public class CfnOriginEndpointAuthorizationPropertyDsl {
  private val cdkBuilder: CfnOriginEndpoint.AuthorizationProperty.Builder =
      CfnOriginEndpoint.AuthorizationProperty.builder()

  public fun cdnIdentifierSecret(cdnIdentifierSecret: String) {
    cdkBuilder.cdnIdentifierSecret(cdnIdentifierSecret)
  }

  public fun secretsRoleArn(secretsRoleArn: String) {
    cdkBuilder.secretsRoleArn(secretsRoleArn)
  }

  public fun build(): CfnOriginEndpoint.AuthorizationProperty = cdkBuilder.build()
}
