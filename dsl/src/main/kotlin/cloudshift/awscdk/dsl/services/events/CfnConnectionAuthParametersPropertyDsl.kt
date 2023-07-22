@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnConnection

/**
 * Contains the authorization parameters to use for the connection.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * AuthParametersProperty authParametersProperty = AuthParametersProperty.builder()
 * .apiKeyAuthParameters(ApiKeyAuthParametersProperty.builder()
 * .apiKeyName("apiKeyName")
 * .apiKeyValue("apiKeyValue")
 * .build())
 * .basicAuthParameters(BasicAuthParametersProperty.builder()
 * .password("password")
 * .username("username")
 * .build())
 * .invocationHttpParameters(ConnectionHttpParametersProperty.builder()
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
 * .oAuthParameters(OAuthParametersProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-authparameters.html)
 */
@CdkDslMarker
public class CfnConnectionAuthParametersPropertyDsl {
  private val cdkBuilder: CfnConnection.AuthParametersProperty.Builder =
      CfnConnection.AuthParametersProperty.builder()

  /**
   * @param apiKeyAuthParameters The API Key parameters to use for authorization.
   */
  public fun apiKeyAuthParameters(apiKeyAuthParameters: IResolvable) {
    cdkBuilder.apiKeyAuthParameters(apiKeyAuthParameters)
  }

  /**
   * @param apiKeyAuthParameters The API Key parameters to use for authorization.
   */
  public
      fun apiKeyAuthParameters(apiKeyAuthParameters: CfnConnection.ApiKeyAuthParametersProperty) {
    cdkBuilder.apiKeyAuthParameters(apiKeyAuthParameters)
  }

  /**
   * @param basicAuthParameters The authorization parameters for Basic authorization.
   */
  public fun basicAuthParameters(basicAuthParameters: IResolvable) {
    cdkBuilder.basicAuthParameters(basicAuthParameters)
  }

  /**
   * @param basicAuthParameters The authorization parameters for Basic authorization.
   */
  public fun basicAuthParameters(basicAuthParameters: CfnConnection.BasicAuthParametersProperty) {
    cdkBuilder.basicAuthParameters(basicAuthParameters)
  }

  /**
   * @param invocationHttpParameters Additional parameters for the connection that are passed
   * through with every invocation to the HTTP endpoint.
   */
  public fun invocationHttpParameters(invocationHttpParameters: IResolvable) {
    cdkBuilder.invocationHttpParameters(invocationHttpParameters)
  }

  /**
   * @param invocationHttpParameters Additional parameters for the connection that are passed
   * through with every invocation to the HTTP endpoint.
   */
  public
      fun invocationHttpParameters(invocationHttpParameters: CfnConnection.ConnectionHttpParametersProperty) {
    cdkBuilder.invocationHttpParameters(invocationHttpParameters)
  }

  /**
   * @param oAuthParameters The OAuth parameters to use for authorization.
   */
  public fun oAuthParameters(oAuthParameters: IResolvable) {
    cdkBuilder.oAuthParameters(oAuthParameters)
  }

  /**
   * @param oAuthParameters The OAuth parameters to use for authorization.
   */
  public fun oAuthParameters(oAuthParameters: CfnConnection.OAuthParametersProperty) {
    cdkBuilder.oAuthParameters(oAuthParameters)
  }

  public fun build(): CfnConnection.AuthParametersProperty = cdkBuilder.build()
}
