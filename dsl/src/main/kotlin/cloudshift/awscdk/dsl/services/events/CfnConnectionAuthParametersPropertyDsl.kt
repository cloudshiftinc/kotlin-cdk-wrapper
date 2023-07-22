@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnConnection

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
