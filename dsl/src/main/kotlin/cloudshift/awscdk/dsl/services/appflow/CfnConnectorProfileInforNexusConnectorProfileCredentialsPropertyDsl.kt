@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileInforNexusConnectorProfileCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty.Builder
      = CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty.builder()

  /**
   * @param accessKeyId The Access Key portion of the credentials. 
   */
  public fun accessKeyId(accessKeyId: String) {
    cdkBuilder.accessKeyId(accessKeyId)
  }

  /**
   * @param datakey The encryption keys used to encrypt data. 
   */
  public fun datakey(datakey: String) {
    cdkBuilder.datakey(datakey)
  }

  /**
   * @param secretAccessKey The secret key used to sign requests. 
   */
  public fun secretAccessKey(secretAccessKey: String) {
    cdkBuilder.secretAccessKey(secretAccessKey)
  }

  /**
   * @param userId The identifier for the user. 
   */
  public fun userId(userId: String) {
    cdkBuilder.userId(userId)
  }

  public fun build(): CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty =
      cdkBuilder.build()
}
