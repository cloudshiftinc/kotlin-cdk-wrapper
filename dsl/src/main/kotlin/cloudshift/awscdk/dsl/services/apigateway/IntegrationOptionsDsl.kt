@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.ConnectionType
import software.amazon.awscdk.services.apigateway.ContentHandling
import software.amazon.awscdk.services.apigateway.IVpcLink
import software.amazon.awscdk.services.apigateway.IntegrationOptions
import software.amazon.awscdk.services.apigateway.IntegrationResponse
import software.amazon.awscdk.services.apigateway.PassthroughBehavior
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class IntegrationOptionsDsl {
  private val cdkBuilder: IntegrationOptions.Builder = IntegrationOptions.builder()

  private val _cacheKeyParameters: MutableList<String> = mutableListOf()

  private val _integrationResponses: MutableList<IntegrationResponse> = mutableListOf()

  public fun cacheKeyParameters(vararg cacheKeyParameters: String) {
    _cacheKeyParameters.addAll(listOf(*cacheKeyParameters))
  }

  public fun cacheKeyParameters(cacheKeyParameters: Collection<String>) {
    _cacheKeyParameters.addAll(cacheKeyParameters)
  }

  public fun cacheNamespace(cacheNamespace: String) {
    cdkBuilder.cacheNamespace(cacheNamespace)
  }

  public fun connectionType(connectionType: ConnectionType) {
    cdkBuilder.connectionType(connectionType)
  }

  public fun contentHandling(contentHandling: ContentHandling) {
    cdkBuilder.contentHandling(contentHandling)
  }

  public fun credentialsPassthrough(credentialsPassthrough: Boolean) {
    cdkBuilder.credentialsPassthrough(credentialsPassthrough)
  }

  public fun credentialsRole(credentialsRole: IRole) {
    cdkBuilder.credentialsRole(credentialsRole)
  }

  public fun integrationResponses(integrationResponses: IntegrationResponseDsl.() -> Unit) {
    _integrationResponses.add(IntegrationResponseDsl().apply(integrationResponses).build())
  }

  public fun integrationResponses(integrationResponses: Collection<IntegrationResponse>) {
    _integrationResponses.addAll(integrationResponses)
  }

  public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
    cdkBuilder.passthroughBehavior(passthroughBehavior)
  }

  public fun requestParameters(requestParameters: Map<String, String>) {
    cdkBuilder.requestParameters(requestParameters)
  }

  public fun requestTemplates(requestTemplates: Map<String, String>) {
    cdkBuilder.requestTemplates(requestTemplates)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun vpcLink(vpcLink: IVpcLink) {
    cdkBuilder.vpcLink(vpcLink)
  }

  public fun build(): IntegrationOptions {
    if(_cacheKeyParameters.isNotEmpty()) cdkBuilder.cacheKeyParameters(_cacheKeyParameters)
    if(_integrationResponses.isNotEmpty()) cdkBuilder.integrationResponses(_integrationResponses)
    return cdkBuilder.build()
  }
}
