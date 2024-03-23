@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * ApiKey Properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * Authorizer authorizer;
 * Integration integration;
 * Model model;
 * RequestValidator requestValidator;
 * RestApi restApi;
 * Stage stage;
 * ApiKeyProps apiKeyProps = ApiKeyProps.builder()
 * .apiKeyName("apiKeyName")
 * .customerId("customerId")
 * .defaultCorsPreflightOptions(CorsOptions.builder()
 * .allowOrigins(List.of("allowOrigins"))
 * // the properties below are optional
 * .allowCredentials(false)
 * .allowHeaders(List.of("allowHeaders"))
 * .allowMethods(List.of("allowMethods"))
 * .disableCache(false)
 * .exposeHeaders(List.of("exposeHeaders"))
 * .maxAge(Duration.minutes(30))
 * .statusCode(123)
 * .build())
 * .defaultIntegration(integration)
 * .defaultMethodOptions(MethodOptions.builder()
 * .apiKeyRequired(false)
 * .authorizationScopes(List.of("authorizationScopes"))
 * .authorizationType(AuthorizationType.NONE)
 * .authorizer(authorizer)
 * .methodResponses(List.of(MethodResponse.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .responseModels(Map.of(
 * "responseModelsKey", model))
 * .responseParameters(Map.of(
 * "responseParametersKey", false))
 * .build()))
 * .operationName("operationName")
 * .requestModels(Map.of(
 * "requestModelsKey", model))
 * .requestParameters(Map.of(
 * "requestParametersKey", false))
 * .requestValidator(requestValidator)
 * .requestValidatorOptions(RequestValidatorOptions.builder()
 * .requestValidatorName("requestValidatorName")
 * .validateRequestBody(false)
 * .validateRequestParameters(false)
 * .build())
 * .build())
 * .description("description")
 * .enabled(false)
 * .generateDistinctId(false)
 * .resources(List.of(restApi))
 * .stages(List.of(stage))
 * .value("value")
 * .build();
 * ```
 */
public interface ApiKeyProps : ApiKeyOptions {
  /**
   * An AWS Marketplace customer identifier to use when integrating with the AWS SaaS Marketplace.
   *
   * Default: none
   */
  public fun customerId(): String? = unwrap(this).getCustomerId()

  /**
   * Indicates whether the API key can be used by clients.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * Specifies whether the key identifier is distinct from the created API key value.
   *
   * Default: false
   */
  public fun generateDistinctId(): Boolean? = unwrap(this).getGenerateDistinctId()

  /**
   * (deprecated) A list of resources this api key is associated with.
   *
   * Default: none
   *
   * * use `stages` instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun resources(): List<IRestApi> = unwrap(this).getResources()?.map(IRestApi::wrap) ?:
      emptyList()

  /**
   * A list of Stages this api key is associated with.
   *
   * Default: - the api key is not associated with any stages
   */
  public fun stages(): List<IStage> = unwrap(this).getStages()?.map(IStage::wrap) ?: emptyList()

  /**
   * A builder for [ApiKeyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiKeyName A name for the API key.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the API key name.
     */
    public fun apiKeyName(apiKeyName: String)

    /**
     * @param customerId An AWS Marketplace customer identifier to use when integrating with the AWS
     * SaaS Marketplace.
     */
    public fun customerId(customerId: String)

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0505410c94eff681cc452b76055bbbe10c30d2330d41d57f71de4569d641e533")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    public fun defaultIntegration(defaultIntegration: Integration)

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a80f1c78c50186af838b8ae2b9a5dfdab34b7d909ac7b8661cf876516d6acb80")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83261c2b54df25214169d1340f32139c54811994df74e520d45f7148f47f0668")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    /**
     * @param description A description of the purpose of the API key.
     */
    public fun description(description: String)

    /**
     * @param enabled Indicates whether the API key can be used by clients.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param generateDistinctId Specifies whether the key identifier is distinct from the created
     * API key value.
     */
    public fun generateDistinctId(generateDistinctId: Boolean)

    /**
     * @param resources A list of resources this api key is associated with.
     * @deprecated - use `stages` instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun resources(resources: List<IRestApi>)

    /**
     * @param resources A list of resources this api key is associated with.
     * @deprecated - use `stages` instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun resources(vararg resources: IRestApi)

    /**
     * @param stages A list of Stages this api key is associated with.
     */
    public fun stages(stages: List<IStage>)

    /**
     * @param stages A list of Stages this api key is associated with.
     */
    public fun stages(vararg stages: IStage)

    /**
     * @param value The value of the API key.
     * Must be at least 20 characters long.
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ApiKeyProps.Builder =
        software.amazon.awscdk.services.apigateway.ApiKeyProps.builder()

    /**
     * @param apiKeyName A name for the API key.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the API key name.
     */
    override fun apiKeyName(apiKeyName: String) {
      cdkBuilder.apiKeyName(apiKeyName)
    }

    /**
     * @param customerId An AWS Marketplace customer identifier to use when integrating with the AWS
     * SaaS Marketplace.
     */
    override fun customerId(customerId: String) {
      cdkBuilder.customerId(customerId)
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0505410c94eff681cc452b76055bbbe10c30d2330d41d57f71de4569d641e533")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a80f1c78c50186af838b8ae2b9a5dfdab34b7d909ac7b8661cf876516d6acb80")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83261c2b54df25214169d1340f32139c54811994df74e520d45f7148f47f0668")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    /**
     * @param description A description of the purpose of the API key.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param enabled Indicates whether the API key can be used by clients.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param generateDistinctId Specifies whether the key identifier is distinct from the created
     * API key value.
     */
    override fun generateDistinctId(generateDistinctId: Boolean) {
      cdkBuilder.generateDistinctId(generateDistinctId)
    }

    /**
     * @param resources A list of resources this api key is associated with.
     * @deprecated - use `stages` instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun resources(resources: List<IRestApi>) {
      cdkBuilder.resources(resources.map(IRestApi::unwrap))
    }

    /**
     * @param resources A list of resources this api key is associated with.
     * @deprecated - use `stages` instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun resources(vararg resources: IRestApi): Unit = resources(resources.toList())

    /**
     * @param stages A list of Stages this api key is associated with.
     */
    override fun stages(stages: List<IStage>) {
      cdkBuilder.stages(stages.map(IStage::unwrap))
    }

    /**
     * @param stages A list of Stages this api key is associated with.
     */
    override fun stages(vararg stages: IStage): Unit = stages(stages.toList())

    /**
     * @param value The value of the API key.
     * Must be at least 20 characters long.
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.ApiKeyProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.ApiKeyProps,
  ) : CdkObject(cdkObject), ApiKeyProps {
    /**
     * A name for the API key.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the API key name.
     *
     * Default: automically generated name
     */
    override fun apiKeyName(): String? = unwrap(this).getApiKeyName()

    /**
     * An AWS Marketplace customer identifier to use when integrating with the AWS SaaS Marketplace.
     *
     * Default: none
     */
    override fun customerId(): String? = unwrap(this).getCustomerId()

    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     */
    override fun defaultCorsPreflightOptions(): CorsOptions? =
        unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     */
    override fun defaultIntegration(): Integration? =
        unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     */
    override fun defaultMethodOptions(): MethodOptions? =
        unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

    /**
     * A description of the purpose of the API key.
     *
     * Default: none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Indicates whether the API key can be used by clients.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * Specifies whether the key identifier is distinct from the created API key value.
     *
     * Default: false
     */
    override fun generateDistinctId(): Boolean? = unwrap(this).getGenerateDistinctId()

    /**
     * (deprecated) A list of resources this api key is associated with.
     *
     * Default: none
     *
     * * use `stages` instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun resources(): List<IRestApi> = unwrap(this).getResources()?.map(IRestApi::wrap) ?:
        emptyList()

    /**
     * A list of Stages this api key is associated with.
     *
     * Default: - the api key is not associated with any stages
     */
    override fun stages(): List<IStage> = unwrap(this).getStages()?.map(IStage::wrap) ?: emptyList()

    /**
     * The value of the API key.
     *
     * Must be at least 20 characters long.
     *
     * Default: none
     */
    override fun `value`(): String? = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ApiKeyProps):
        ApiKeyProps = CdkObjectWrappers.wrap(cdkObject) as? ApiKeyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiKeyProps):
        software.amazon.awscdk.services.apigateway.ApiKeyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.ApiKeyProps
  }
}
