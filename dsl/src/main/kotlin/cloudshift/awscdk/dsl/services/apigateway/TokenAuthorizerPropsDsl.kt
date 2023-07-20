@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.TokenAuthorizerProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.IFunction

@CdkDslMarker
public class TokenAuthorizerPropsDsl {
  private val cdkBuilder: TokenAuthorizerProps.Builder = TokenAuthorizerProps.builder()

  public fun assumeRole(assumeRole: IRole) {
    cdkBuilder.assumeRole(assumeRole)
  }

  public fun authorizerName(authorizerName: String) {
    cdkBuilder.authorizerName(authorizerName)
  }

  public fun handler(handler: IFunction) {
    cdkBuilder.handler(handler)
  }

  public fun identitySource(identitySource: String) {
    cdkBuilder.identitySource(identitySource)
  }

  public fun resultsCacheTtl(resultsCacheTtl: Duration) {
    cdkBuilder.resultsCacheTtl(resultsCacheTtl)
  }

  public fun validationRegex(validationRegex: String) {
    cdkBuilder.validationRegex(validationRegex)
  }

  public fun build(): TokenAuthorizerProps = cdkBuilder.build()
}
