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
import software.amazon.awscdk.services.apigateway.RateLimitedApiKey
import software.amazon.awscdk.services.apigateway.ThrottleSettings
import software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage
import software.constructs.Construct

/**
 * An API Gateway ApiKey, for which a rate limiting configuration can be specified.
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
public class RateLimitedApiKeyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: RateLimitedApiKey.Builder = RateLimitedApiKey.Builder.create(scope, id)

  private val _apiStages: MutableList<UsagePlanPerApiStage> = mutableListOf()

  private val _resources: MutableList<IRestApi> = mutableListOf()

  private val _stages: MutableList<IStage> = mutableListOf()

  /**
   * A name for the API key.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the API key name.
   *
   * Default: automically generated name
   *
   * @param apiKeyName A name for the API key. 
   */
  public fun apiKeyName(apiKeyName: String) {
    cdkBuilder.apiKeyName(apiKeyName)
  }

  /**
   * API Stages to be associated with the RateLimitedApiKey.
   *
   * Default: none
   *
   * @param apiStages API Stages to be associated with the RateLimitedApiKey. 
   */
  public fun apiStages(apiStages: UsagePlanPerApiStageDsl.() -> Unit) {
    _apiStages.add(UsagePlanPerApiStageDsl().apply(apiStages).build())
  }

  /**
   * API Stages to be associated with the RateLimitedApiKey.
   *
   * Default: none
   *
   * @param apiStages API Stages to be associated with the RateLimitedApiKey. 
   */
  public fun apiStages(apiStages: Collection<UsagePlanPerApiStage>) {
    _apiStages.addAll(apiStages)
  }

  /**
   * An AWS Marketplace customer identifier to use when integrating with the AWS SaaS Marketplace.
   *
   * Default: none
   *
   * @param customerId An AWS Marketplace customer identifier to use when integrating with the AWS
   * SaaS Marketplace. 
   */
  public fun customerId(customerId: String) {
    cdkBuilder.customerId(customerId)
  }

  /**
   * Adds a CORS preflight OPTIONS method to this resource and all child resources.
   *
   * You can add CORS at the resource-level using `addCorsPreflight`.
   *
   * Default: - CORS is disabled
   *
   * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
   * all child resources. 
   */
  public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptionsDsl.() -> Unit =
      {}) {
    val builder = CorsOptionsDsl()
    builder.apply(defaultCorsPreflightOptions)
    cdkBuilder.defaultCorsPreflightOptions(builder.build())
  }

  /**
   * Adds a CORS preflight OPTIONS method to this resource and all child resources.
   *
   * You can add CORS at the resource-level using `addCorsPreflight`.
   *
   * Default: - CORS is disabled
   *
   * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
   * all child resources. 
   */
  public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
    cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions)
  }

  /**
   * An integration to use as a default for all methods created within this API unless an
   * integration is specified.
   *
   * Default: - Inherited from parent.
   *
   * @param defaultIntegration An integration to use as a default for all methods created within
   * this API unless an integration is specified. 
   */
  public fun defaultIntegration(defaultIntegration: IntegrationDsl.() -> Unit = {}) {
    val builder = IntegrationDsl()
    builder.apply(defaultIntegration)
    cdkBuilder.defaultIntegration(builder.build())
  }

  /**
   * An integration to use as a default for all methods created within this API unless an
   * integration is specified.
   *
   * Default: - Inherited from parent.
   *
   * @param defaultIntegration An integration to use as a default for all methods created within
   * this API unless an integration is specified. 
   */
  public fun defaultIntegration(defaultIntegration: Integration) {
    cdkBuilder.defaultIntegration(defaultIntegration)
  }

  /**
   * Method options to use as a default for all methods created within this API unless custom
   * options are specified.
   *
   * Default: - Inherited from parent.
   *
   * @param defaultMethodOptions Method options to use as a default for all methods created within
   * this API unless custom options are specified. 
   */
  public fun defaultMethodOptions(defaultMethodOptions: MethodOptionsDsl.() -> Unit = {}) {
    val builder = MethodOptionsDsl()
    builder.apply(defaultMethodOptions)
    cdkBuilder.defaultMethodOptions(builder.build())
  }

  /**
   * Method options to use as a default for all methods created within this API unless custom
   * options are specified.
   *
   * Default: - Inherited from parent.
   *
   * @param defaultMethodOptions Method options to use as a default for all methods created within
   * this API unless custom options are specified. 
   */
  public fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
    cdkBuilder.defaultMethodOptions(defaultMethodOptions)
  }

  /**
   * A description of the purpose of the API key.
   *
   * Default: none
   *
   * @param description A description of the purpose of the API key. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Indicates whether the API key can be used by clients.
   *
   * Default: true
   *
   * @param enabled Indicates whether the API key can be used by clients. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * Specifies whether the key identifier is distinct from the created API key value.
   *
   * Default: false
   *
   * @param generateDistinctId Specifies whether the key identifier is distinct from the created API
   * key value. 
   */
  public fun generateDistinctId(generateDistinctId: Boolean) {
    cdkBuilder.generateDistinctId(generateDistinctId)
  }

  /**
   * Number of requests clients can make in a given time period.
   *
   * Default: none
   *
   * @param quota Number of requests clients can make in a given time period. 
   */
  public fun quota(quota: QuotaSettingsDsl.() -> Unit = {}) {
    val builder = QuotaSettingsDsl()
    builder.apply(quota)
    cdkBuilder.quota(builder.build())
  }

  /**
   * Number of requests clients can make in a given time period.
   *
   * Default: none
   *
   * @param quota Number of requests clients can make in a given time period. 
   */
  public fun quota(quota: QuotaSettings) {
    cdkBuilder.quota(quota)
  }

  /**
   * (deprecated) A list of resources this api key is associated with.
   *
   * Default: none
   *
   * * use `stages` instead
   * @param resources A list of resources this api key is associated with. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun resources(vararg resources: IRestApi) {
    _resources.addAll(listOf(*resources))
  }

  /**
   * (deprecated) A list of resources this api key is associated with.
   *
   * Default: none
   *
   * * use `stages` instead
   * @param resources A list of resources this api key is associated with. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun resources(resources: Collection<IRestApi>) {
    _resources.addAll(resources)
  }

  /**
   * A list of Stages this api key is associated with.
   *
   * Default: - the api key is not associated with any stages
   *
   * @param stages A list of Stages this api key is associated with. 
   */
  public fun stages(vararg stages: IStage) {
    _stages.addAll(listOf(*stages))
  }

  /**
   * A list of Stages this api key is associated with.
   *
   * Default: - the api key is not associated with any stages
   *
   * @param stages A list of Stages this api key is associated with. 
   */
  public fun stages(stages: Collection<IStage>) {
    _stages.addAll(stages)
  }

  /**
   * Overall throttle settings for the API.
   *
   * Default: none
   *
   * @param throttle Overall throttle settings for the API. 
   */
  public fun throttle(throttle: ThrottleSettingsDsl.() -> Unit = {}) {
    val builder = ThrottleSettingsDsl()
    builder.apply(throttle)
    cdkBuilder.throttle(builder.build())
  }

  /**
   * Overall throttle settings for the API.
   *
   * Default: none
   *
   * @param throttle Overall throttle settings for the API. 
   */
  public fun throttle(throttle: ThrottleSettings) {
    cdkBuilder.throttle(throttle)
  }

  /**
   * The value of the API key.
   *
   * Must be at least 20 characters long.
   *
   * Default: none
   *
   * @param value The value of the API key. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): RateLimitedApiKey {
    if(_apiStages.isNotEmpty()) cdkBuilder.apiStages(_apiStages)
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    if(_stages.isNotEmpty()) cdkBuilder.stages(_stages)
    return cdkBuilder.build()
  }
}
