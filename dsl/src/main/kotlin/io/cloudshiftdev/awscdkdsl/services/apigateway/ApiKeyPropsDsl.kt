@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
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

/**
 * ApiKey Properties.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.apigateway.*;
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
@CdkDslMarker
public class ApiKeyPropsDsl {
    private val cdkBuilder: ApiKeyProps.Builder = ApiKeyProps.builder()

    private val _resources: MutableList<IRestApi> = mutableListOf()

    private val _stages: MutableList<IStage> = mutableListOf()

    /**
     * @param apiKeyName A name for the API key. If you don't specify a name, AWS CloudFormation
     *   generates a unique physical ID and uses that ID for the API key name.
     */
    public fun apiKeyName(apiKeyName: String) {
        cdkBuilder.apiKeyName(apiKeyName)
    }

    /**
     * @param customerId An AWS Marketplace customer identifier to use when integrating with the AWS
     *   SaaS Marketplace.
     */
    public fun customerId(customerId: String) {
        cdkBuilder.customerId(customerId)
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     *   all child resources. You can add CORS at the resource-level using `addCorsPreflight`.
     */
    public fun defaultCorsPreflightOptions(
        defaultCorsPreflightOptions: CorsOptionsDsl.() -> Unit = {}
    ) {
        val builder = CorsOptionsDsl()
        builder.apply(defaultCorsPreflightOptions)
        cdkBuilder.defaultCorsPreflightOptions(builder.build())
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     *   all child resources. You can add CORS at the resource-level using `addCorsPreflight`.
     */
    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
        cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions)
    }

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     *   this API unless an integration is specified.
     */
    public fun defaultIntegration(defaultIntegration: IntegrationDsl.() -> Unit = {}) {
        val builder = IntegrationDsl()
        builder.apply(defaultIntegration)
        cdkBuilder.defaultIntegration(builder.build())
    }

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     *   this API unless an integration is specified.
     */
    public fun defaultIntegration(defaultIntegration: Integration) {
        cdkBuilder.defaultIntegration(defaultIntegration)
    }

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     *   this API unless custom options are specified.
     */
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptionsDsl.() -> Unit = {}) {
        val builder = MethodOptionsDsl()
        builder.apply(defaultMethodOptions)
        cdkBuilder.defaultMethodOptions(builder.build())
    }

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     *   this API unless custom options are specified.
     */
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
        cdkBuilder.defaultMethodOptions(defaultMethodOptions)
    }

    /** @param description A description of the purpose of the API key. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param enabled Indicates whether the API key can be used by clients. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param generateDistinctId Specifies whether the key identifier is distinct from the created
     *   API key value.
     */
    public fun generateDistinctId(generateDistinctId: Boolean) {
        cdkBuilder.generateDistinctId(generateDistinctId)
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

    /** @param stages A list of Stages this api key is associated with. */
    public fun stages(vararg stages: IStage) {
        _stages.addAll(listOf(*stages))
    }

    /** @param stages A list of Stages this api key is associated with. */
    public fun stages(stages: Collection<IStage>) {
        _stages.addAll(stages)
    }

    /** @param value The value of the API key. Must be at least 20 characters long. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): ApiKeyProps {
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        if (_stages.isNotEmpty()) cdkBuilder.stages(_stages)
        return cdkBuilder.build()
    }
}
