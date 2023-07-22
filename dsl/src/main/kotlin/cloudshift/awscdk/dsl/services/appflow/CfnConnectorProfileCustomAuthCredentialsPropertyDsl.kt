@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileCustomAuthCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.CustomAuthCredentialsProperty.Builder =
      CfnConnectorProfile.CustomAuthCredentialsProperty.builder()

  /**
   * @param credentialsMap A map that holds custom authentication credentials.
   */
  public fun credentialsMap(credentialsMap: Map<String, String>) {
    cdkBuilder.credentialsMap(credentialsMap)
  }

  /**
   * @param credentialsMap A map that holds custom authentication credentials.
   */
  public fun credentialsMap(credentialsMap: IResolvable) {
    cdkBuilder.credentialsMap(credentialsMap)
  }

  /**
   * @param customAuthenticationType The custom authentication type that the connector uses. 
   */
  public fun customAuthenticationType(customAuthenticationType: String) {
    cdkBuilder.customAuthenticationType(customAuthenticationType)
  }

  public fun build(): CfnConnectorProfile.CustomAuthCredentialsProperty = cdkBuilder.build()
}
