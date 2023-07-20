@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroup

@CdkDslMarker
public class CfnPackagingGroupAuthorizationPropertyDsl {
  private val cdkBuilder: CfnPackagingGroup.AuthorizationProperty.Builder =
      CfnPackagingGroup.AuthorizationProperty.builder()

  public fun cdnIdentifierSecret(cdnIdentifierSecret: String) {
    cdkBuilder.cdnIdentifierSecret(cdnIdentifierSecret)
  }

  public fun secretsRoleArn(secretsRoleArn: String) {
    cdkBuilder.secretsRoleArn(secretsRoleArn)
  }

  public fun build(): CfnPackagingGroup.AuthorizationProperty = cdkBuilder.build()
}
