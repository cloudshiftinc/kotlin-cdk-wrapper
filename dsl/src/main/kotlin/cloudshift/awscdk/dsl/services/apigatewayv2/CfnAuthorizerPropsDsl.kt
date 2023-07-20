@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer
import software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps

@CdkDslMarker
public class CfnAuthorizerPropsDsl {
  private val cdkBuilder: CfnAuthorizerProps.Builder = CfnAuthorizerProps.builder()

  private val _identitySource: MutableList<String> = mutableListOf()

  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  public fun authorizerCredentialsArn(authorizerCredentialsArn: String) {
    cdkBuilder.authorizerCredentialsArn(authorizerCredentialsArn)
  }

  public fun authorizerPayloadFormatVersion(authorizerPayloadFormatVersion: String) {
    cdkBuilder.authorizerPayloadFormatVersion(authorizerPayloadFormatVersion)
  }

  public fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number) {
    cdkBuilder.authorizerResultTtlInSeconds(authorizerResultTtlInSeconds)
  }

  public fun authorizerType(authorizerType: String) {
    cdkBuilder.authorizerType(authorizerType)
  }

  public fun authorizerUri(authorizerUri: String) {
    cdkBuilder.authorizerUri(authorizerUri)
  }

  public fun enableSimpleResponses(enableSimpleResponses: Boolean) {
    cdkBuilder.enableSimpleResponses(enableSimpleResponses)
  }

  public fun enableSimpleResponses(enableSimpleResponses: IResolvable) {
    cdkBuilder.enableSimpleResponses(enableSimpleResponses)
  }

  public fun identitySource(vararg identitySource: String) {
    _identitySource.addAll(listOf(*identitySource))
  }

  public fun identitySource(identitySource: Collection<String>) {
    _identitySource.addAll(identitySource)
  }

  public fun identityValidationExpression(identityValidationExpression: String) {
    cdkBuilder.identityValidationExpression(identityValidationExpression)
  }

  public fun jwtConfiguration(jwtConfiguration: IResolvable) {
    cdkBuilder.jwtConfiguration(jwtConfiguration)
  }

  public fun jwtConfiguration(jwtConfiguration: CfnAuthorizer.JWTConfigurationProperty) {
    cdkBuilder.jwtConfiguration(jwtConfiguration)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnAuthorizerProps {
    if(_identitySource.isNotEmpty()) cdkBuilder.identitySource(_identitySource)
    return cdkBuilder.build()
  }
}
