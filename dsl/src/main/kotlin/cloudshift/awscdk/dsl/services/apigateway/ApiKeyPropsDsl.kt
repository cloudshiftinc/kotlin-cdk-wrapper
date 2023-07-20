@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigateway.ApiKeyProps
import software.amazon.awscdk.services.apigateway.CorsOptions
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.IStage
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.MethodOptions

@CdkDslMarker
public class ApiKeyPropsDsl {
  private val cdkBuilder: ApiKeyProps.Builder = ApiKeyProps.builder()

  private val _resources: MutableList<IRestApi> = mutableListOf()

  private val _stages: MutableList<IStage> = mutableListOf()

  public fun apiKeyName(apiKeyName: String) {
    cdkBuilder.apiKeyName(apiKeyName)
  }

  public fun customerId(customerId: String) {
    cdkBuilder.customerId(customerId)
  }

  public fun defaultCorsPreflightOptions(block: CorsOptionsDsl.() -> Unit = {}) {
    val builder = CorsOptionsDsl()
    builder.apply(block)
    cdkBuilder.defaultCorsPreflightOptions(builder.build())
  }

  public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
    cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions)
  }

  public fun defaultIntegration(block: IntegrationDsl.() -> Unit = {}) {
    val builder = IntegrationDsl()
    builder.apply(block)
    cdkBuilder.defaultIntegration(builder.build())
  }

  public fun defaultIntegration(defaultIntegration: Integration) {
    cdkBuilder.defaultIntegration(defaultIntegration)
  }

  public fun defaultMethodOptions(block: MethodOptionsDsl.() -> Unit = {}) {
    val builder = MethodOptionsDsl()
    builder.apply(block)
    cdkBuilder.defaultMethodOptions(builder.build())
  }

  public fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
    cdkBuilder.defaultMethodOptions(defaultMethodOptions)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun generateDistinctId(generateDistinctId: Boolean) {
    cdkBuilder.generateDistinctId(generateDistinctId)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun resources(vararg resources: IRestApi) {
    _resources.addAll(listOf(*resources))
  }

  @Deprecated(message = "deprecated in CDK")
  public fun resources(resources: Collection<IRestApi>) {
    _resources.addAll(resources)
  }

  public fun stages(vararg stages: IStage) {
    _stages.addAll(listOf(*stages))
  }

  public fun stages(stages: Collection<IStage>) {
    _stages.addAll(stages)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): ApiKeyProps {
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    if(_stages.isNotEmpty()) cdkBuilder.stages(_stages)
    return cdkBuilder.build()
  }
}
