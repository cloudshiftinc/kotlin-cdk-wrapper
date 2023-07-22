@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileSAPODataConnectorProfileCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty.Builder =
      CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty.builder()

  /**
   * @param basicAuthCredentials The SAPOData basic authentication credentials.
   */
  public fun basicAuthCredentials(basicAuthCredentials: IResolvable) {
    cdkBuilder.basicAuthCredentials(basicAuthCredentials)
  }

  /**
   * @param basicAuthCredentials The SAPOData basic authentication credentials.
   */
  public
      fun basicAuthCredentials(basicAuthCredentials: CfnConnectorProfile.BasicAuthCredentialsProperty) {
    cdkBuilder.basicAuthCredentials(basicAuthCredentials)
  }

  /**
   * @param oAuthCredentials The SAPOData OAuth type authentication credentials.
   */
  public fun oAuthCredentials(oAuthCredentials: IResolvable) {
    cdkBuilder.oAuthCredentials(oAuthCredentials)
  }

  /**
   * @param oAuthCredentials The SAPOData OAuth type authentication credentials.
   */
  public fun oAuthCredentials(oAuthCredentials: CfnConnectorProfile.OAuthCredentialsProperty) {
    cdkBuilder.oAuthCredentials(oAuthCredentials)
  }

  public fun build(): CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty =
      cdkBuilder.build()
}
