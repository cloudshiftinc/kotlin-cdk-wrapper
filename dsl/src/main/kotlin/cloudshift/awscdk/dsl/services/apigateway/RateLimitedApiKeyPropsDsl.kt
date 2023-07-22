@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigateway.CorsOptions
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.IStage
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.MethodOptions
import software.amazon.awscdk.services.apigateway.QuotaSettings
import software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps
import software.amazon.awscdk.services.apigateway.ThrottleSettings
import software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage

/**
 * RateLimitedApiKey properties.
 *
 * Example:
 *
 * ```
 * RestApi api;
 * RateLimitedApiKey key = RateLimitedApiKey.Builder.create(this, "rate-limited-api-key")
 * .customerId("hello-customer")
 * .stages(List.of(api.getDeploymentStage()))
 * .quota(QuotaSettings.builder()
 * .limit(10000)
 * .period(Period.MONTH)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class RateLimitedApiKeyPropsDsl {
  private val cdkBuilder: RateLimitedApiKeyProps.Builder = RateLimitedApiKeyProps.builder()

  private val _apiStages: MutableList<UsagePlanPerApiStage> = mutableListOf()

  private val _resources: MutableList<IRestApi> = mutableListOf()

  private val _stages: MutableList<IStage> = mutableListOf()

  /**
   * @param apiKeyName A name for the API key.
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the API key name.
   */
  public fun apiKeyName(apiKeyName: String) {
    cdkBuilder.apiKeyName(apiKeyName)
  }

  /**
   * @param apiStages API Stages to be associated with the RateLimitedApiKey.
   */
  public fun apiStages(apiStages: UsagePlanPerApiStageDsl.() -> Unit) {
    _apiStages.add(UsagePlanPerApiStageDsl().apply(apiStages).build())
  }

  /**
   * @param apiStages API Stages to be associated with the RateLimitedApiKey.
   */
  public fun apiStages(apiStages: Collection<UsagePlanPerApiStage>) {
    _apiStages.addAll(apiStages)
  }

  /**
   * @param customerId An AWS Marketplace customer identifier to use when integrating with the AWS
   * SaaS Marketplace.
   */
  public fun customerId(customerId: String) {
    cdkBuilder.customerId(customerId)
  }

  /**
   * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
   * all child resources.
   * You can add CORS at the resource-level using `addCorsPreflight`.
   */
  public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptionsDsl.() -> Unit =
      {}) {
    val builder = CorsOptionsDsl()
    builder.apply(defaultCorsPreflightOptions)
    cdkBuilder.defaultCorsPreflightOptions(builder.build())
  }

  /**
   * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
   * all child resources.
   * You can add CORS at the resource-level using `addCorsPreflight`.
   */
  public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
    cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions)
  }

  /**
   * @param defaultIntegration An integration to use as a default for all methods created within
   * this API unless an integration is specified.
   */
  public fun defaultIntegration(defaultIntegration: IntegrationDsl.() -> Unit = {}) {
    val builder = IntegrationDsl()
    builder.apply(defaultIntegration)
    cdkBuilder.defaultIntegration(builder.build())
  }

  /**
   * @param defaultIntegration An integration to use as a default for all methods created within
   * this API unless an integration is specified.
   */
  public fun defaultIntegration(defaultIntegration: Integration) {
    cdkBuilder.defaultIntegration(defaultIntegration)
  }

  /**
   * @param defaultMethodOptions Method options to use as a default for all methods created within
   * this API unless custom options are specified.
   */
  public fun defaultMethodOptions(defaultMethodOptions: MethodOptionsDsl.() -> Unit = {}) {
    val builder = MethodOptionsDsl()
    builder.apply(defaultMethodOptions)
    cdkBuilder.defaultMethodOptions(builder.build())
  }

  /**
   * @param defaultMethodOptions Method options to use as a default for all methods created within
   * this API unless custom options are specified.
   */
  public fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
    cdkBuilder.defaultMethodOptions(defaultMethodOptions)
  }

  /**
   * @param description A description of the purpose of the API key.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param enabled Indicates whether the API key can be used by clients.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param generateDistinctId Specifies whether the key identifier is distinct from the created API
   * key value.
   */
  public fun generateDistinctId(generateDistinctId: Boolean) {
    cdkBuilder.generateDistinctId(generateDistinctId)
  }

  /**
   * @param quota Number of requests clients can make in a given time period.
   */
  public fun quota(quota: QuotaSettingsDsl.() -> Unit = {}) {
    val builder = QuotaSettingsDsl()
    builder.apply(quota)
    cdkBuilder.quota(builder.build())
  }

  /**
   * @param quota Number of requests clients can make in a given time period.
   */
  public fun quota(quota: QuotaSettings) {
    cdkBuilder.quota(quota)
  }

  /**
   * @param resources A list of resources this api key is associated with.
   * @deprecated - use `stages` instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun resources(vararg resources: IRestApi) {
    _resources.addAll(listOf(*resources))
  }

  /**
   * @param resources A list of resources this api key is associated with.
   * @deprecated - use `stages` instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun resources(resources: Collection<IRestApi>) {
    _resources.addAll(resources)
  }

  /**
   * @param stages A list of Stages this api key is associated with.
   */
  public fun stages(vararg stages: IStage) {
    _stages.addAll(listOf(*stages))
  }

  /**
   * @param stages A list of Stages this api key is associated with.
   */
  public fun stages(stages: Collection<IStage>) {
    _stages.addAll(stages)
  }

  /**
   * @param throttle Overall throttle settings for the API.
   */
  public fun throttle(throttle: ThrottleSettingsDsl.() -> Unit = {}) {
    val builder = ThrottleSettingsDsl()
    builder.apply(throttle)
    cdkBuilder.throttle(builder.build())
  }

  /**
   * @param throttle Overall throttle settings for the API.
   */
  public fun throttle(throttle: ThrottleSettings) {
    cdkBuilder.throttle(throttle)
  }

  /**
   * @param value The value of the API key.
   * Must be at least 20 characters long.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): RateLimitedApiKeyProps {
    if(_apiStages.isNotEmpty()) cdkBuilder.apiStages(_apiStages)
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    if(_stages.isNotEmpty()) cdkBuilder.stages(_stages)
    return cdkBuilder.build()
  }
}
