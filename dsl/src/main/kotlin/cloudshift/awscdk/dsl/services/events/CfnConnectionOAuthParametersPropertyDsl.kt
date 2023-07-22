@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnConnection

@CdkDslMarker
public class CfnConnectionOAuthParametersPropertyDsl {
  private val cdkBuilder: CfnConnection.OAuthParametersProperty.Builder =
      CfnConnection.OAuthParametersProperty.builder()

  /**
   * @param authorizationEndpoint The URL to the authorization endpoint when OAuth is specified as
   * the authorization type. 
   */
  public fun authorizationEndpoint(authorizationEndpoint: String) {
    cdkBuilder.authorizationEndpoint(authorizationEndpoint)
  }

  /**
   * @param clientParameters A `CreateConnectionOAuthClientRequestParameters` object that contains
   * the client parameters for OAuth authorization. 
   */
  public fun clientParameters(clientParameters: IResolvable) {
    cdkBuilder.clientParameters(clientParameters)
  }

  /**
   * @param clientParameters A `CreateConnectionOAuthClientRequestParameters` object that contains
   * the client parameters for OAuth authorization. 
   */
  public fun clientParameters(clientParameters: CfnConnection.ClientParametersProperty) {
    cdkBuilder.clientParameters(clientParameters)
  }

  /**
   * @param httpMethod The method to use for the authorization request. 
   */
  public fun httpMethod(httpMethod: String) {
    cdkBuilder.httpMethod(httpMethod)
  }

  /**
   * @param oAuthHttpParameters A `ConnectionHttpParameters` object that contains details about the
   * additional parameters to use for the connection.
   */
  public fun oAuthHttpParameters(oAuthHttpParameters: IResolvable) {
    cdkBuilder.oAuthHttpParameters(oAuthHttpParameters)
  }

  /**
   * @param oAuthHttpParameters A `ConnectionHttpParameters` object that contains details about the
   * additional parameters to use for the connection.
   */
  public
      fun oAuthHttpParameters(oAuthHttpParameters: CfnConnection.ConnectionHttpParametersProperty) {
    cdkBuilder.oAuthHttpParameters(oAuthHttpParameters)
  }

  public fun build(): CfnConnection.OAuthParametersProperty = cdkBuilder.build()
}
