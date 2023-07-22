@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnConnection

/**
 * Contains the OAuth authorization parameters to use for the connection.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * OAuthParametersProperty oAuthParametersProperty = OAuthParametersProperty.builder()
 * .authorizationEndpoint("authorizationEndpoint")
 * .clientParameters(ClientParametersProperty.builder()
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .build())
 * .httpMethod("httpMethod")
 * // the properties below are optional
 * .oAuthHttpParameters(ConnectionHttpParametersProperty.builder()
 * .bodyParameters(List.of(ParameterProperty.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .isValueSecret(false)
 * .build()))
 * .headerParameters(List.of(ParameterProperty.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .isValueSecret(false)
 * .build()))
 * .queryStringParameters(List.of(ParameterProperty.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .isValueSecret(false)
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-oauthparameters.html)
 */
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
