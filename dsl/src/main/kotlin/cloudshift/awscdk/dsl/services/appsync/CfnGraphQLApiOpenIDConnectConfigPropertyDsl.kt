@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

/**
 * The `OpenIDConnectConfig` property type specifies the optional authorization configuration for
 * using an OpenID Connect compliant service with your GraphQL endpoint for an AWS AppSync GraphQL API.
 *
 * `OpenIDConnectConfig` is a property of the
 * [AWS::AppSync::GraphQLApi](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html)
 * property type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * OpenIDConnectConfigProperty openIDConnectConfigProperty = OpenIDConnectConfigProperty.builder()
 * .authTtl(123)
 * .clientId("clientId")
 * .iatTtl(123)
 * .issuer("issuer")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html)
 */
@CdkDslMarker
public class CfnGraphQLApiOpenIDConnectConfigPropertyDsl {
  private val cdkBuilder: CfnGraphQLApi.OpenIDConnectConfigProperty.Builder =
      CfnGraphQLApi.OpenIDConnectConfigProperty.builder()

  /**
   * @param authTtl The number of milliseconds that a token is valid after being authenticated.
   */
  public fun authTtl(authTtl: Number) {
    cdkBuilder.authTtl(authTtl)
  }

  /**
   * @param clientId The client identifier of the Relying party at the OpenID identity provider.
   * This identifier is typically obtained when the Relying party is registered with the OpenID
   * identity provider. You can specify a regular expression so that AWS AppSync can validate against
   * multiple client identifiers at a time.
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * @param iatTtl The number of milliseconds that a token is valid after it's issued to a user.
   */
  public fun iatTtl(iatTtl: Number) {
    cdkBuilder.iatTtl(iatTtl)
  }

  /**
   * @param issuer The issuer for the OIDC configuration.
   * The issuer returned by discovery must exactly match the value of `iss` in the ID token.
   */
  public fun issuer(issuer: String) {
    cdkBuilder.issuer(issuer)
  }

  public fun build(): CfnGraphQLApi.OpenIDConnectConfigProperty = cdkBuilder.build()
}
