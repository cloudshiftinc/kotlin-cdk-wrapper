@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.systemsmanagersap

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.systemsmanagersap.CfnApplication

@CdkDslMarker
public class CfnApplicationCredentialPropertyDsl {
  private val cdkBuilder: CfnApplication.CredentialProperty.Builder =
      CfnApplication.CredentialProperty.builder()

  public fun credentialType(credentialType: String) {
    cdkBuilder.credentialType(credentialType)
  }

  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  public fun secretId(secretId: String) {
    cdkBuilder.secretId(secretId)
  }

  public fun build(): CfnApplication.CredentialProperty = cdkBuilder.build()
}
