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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.appsync.AuthorizationConfig
import software.amazon.awscdk.services.appsync.Definition
import software.amazon.awscdk.services.appsync.DomainOptions
import software.amazon.awscdk.services.appsync.GraphqlApi
import software.amazon.awscdk.services.appsync.ISchema
import software.amazon.awscdk.services.appsync.IntrospectionConfig
import software.amazon.awscdk.services.appsync.LogConfig
import software.amazon.awscdk.services.appsync.Visibility
import software.constructs.Construct

/**
 * An AppSync GraphQL API.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.events.*;
 * GraphqlApi api = GraphqlApi.Builder.create(this, "EventBridgeApi")
 * .name("EventBridgeApi")
 * .definition(Definition.fromFile(join(__dirname, "appsync.eventbridge.graphql")))
 * .build();
 * EventBus bus = EventBus.Builder.create(this, "DestinationEventBus").build();
 * EventBridgeDataSource dataSource = api.addEventBridgeDataSource("NoneDS", bus);
 * dataSource.createResolver("EventResolver", BaseResolverProps.builder()
 * .typeName("Mutation")
 * .fieldName("emitEvent")
 * .requestMappingTemplate(MappingTemplate.fromFile("request.vtl"))
 * .responseMappingTemplate(MappingTemplate.fromFile("response.vtl"))
 * .build());
 * ```
 */
@CdkDslMarker
public class GraphqlApiDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: GraphqlApi.Builder = GraphqlApi.Builder.create(scope, id)

    /**
     * Optional authorization configuration.
     *
     * Default: - API Key authorization
     *
     * @param authorizationConfig Optional authorization configuration.
     */
    public fun authorizationConfig(authorizationConfig: AuthorizationConfigDsl.() -> Unit = {}) {
        val builder = AuthorizationConfigDsl()
        builder.apply(authorizationConfig)
        cdkBuilder.authorizationConfig(builder.build())
    }

    /**
     * Optional authorization configuration.
     *
     * Default: - API Key authorization
     *
     * @param authorizationConfig Optional authorization configuration.
     */
    public fun authorizationConfig(authorizationConfig: AuthorizationConfig) {
        cdkBuilder.authorizationConfig(authorizationConfig)
    }

    /**
     * Definition (schema file or source APIs) for this GraphQL Api.
     *
     * @param definition Definition (schema file or source APIs) for this GraphQL Api.
     */
    public fun definition(definition: Definition) {
        cdkBuilder.definition(definition)
    }

    /**
     * The domain name configuration for the GraphQL API.
     *
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to enable custom domain URL
     *
     * Default: - no domain name
     *
     * @param domainName The domain name configuration for the GraphQL API.
     */
    public fun domainName(domainName: DomainOptionsDsl.() -> Unit = {}) {
        val builder = DomainOptionsDsl()
        builder.apply(domainName)
        cdkBuilder.domainName(builder.build())
    }

    /**
     * The domain name configuration for the GraphQL API.
     *
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to enable custom domain URL
     *
     * Default: - no domain name
     *
     * @param domainName The domain name configuration for the GraphQL API.
     */
    public fun domainName(domainName: DomainOptions) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * A map containing the list of resources with their properties and environment variables.
     *
     * There are a few rules you must follow when creating keys and values:
     * * Keys must begin with a letter.
     * * Keys must be between 2 and 64 characters long.
     * * Keys can only contain letters, numbers, and the underscore character (_).
     * * Values can be up to 512 characters long.
     * * You can configure up to 50 key-value pairs in a GraphQL API.
     *
     * Default: - No environment variables.
     *
     * @param environmentVariables A map containing the list of resources with their properties and
     *   environment variables.
     */
    public fun environmentVariables(environmentVariables: Map<String, String>) {
        cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * A value indicating whether the API to enable (ENABLED) or disable (DISABLED) introspection.
     *
     * Default: IntrospectionConfig.ENABLED
     *
     * @param introspectionConfig A value indicating whether the API to enable (ENABLED) or disable
     *   (DISABLED) introspection.
     */
    public fun introspectionConfig(introspectionConfig: IntrospectionConfig) {
        cdkBuilder.introspectionConfig(introspectionConfig)
    }

    /**
     * Logging configuration for this api.
     *
     * Default: - None
     *
     * @param logConfig Logging configuration for this api.
     */
    public fun logConfig(logConfig: LogConfigDsl.() -> Unit = {}) {
        val builder = LogConfigDsl()
        builder.apply(logConfig)
        cdkBuilder.logConfig(builder.build())
    }

    /**
     * Logging configuration for this api.
     *
     * Default: - None
     *
     * @param logConfig Logging configuration for this api.
     */
    public fun logConfig(logConfig: LogConfig) {
        cdkBuilder.logConfig(logConfig)
    }

    /**
     * the name of the GraphQL API.
     *
     * @param name the name of the GraphQL API.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * (deprecated) GraphQL schema definition. Specify how you want to define your schema.
     *
     * SchemaFile.fromAsset(filePath: string) allows schema definition through schema.graphql file
     *
     * Default: - schema will be generated code-first (i.e. addType, addObjectType, etc.)
     *
     * @param schema GraphQL schema definition. Specify how you want to define your schema.
     * @deprecated use Definition.schema instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun schema(schema: ISchema) {
        cdkBuilder.schema(schema)
    }

    /**
     * A value indicating whether the API is accessible from anywhere (GLOBAL) or can only be access
     * from a VPC (PRIVATE).
     *
     * Default: - GLOBAL
     *
     * @param visibility A value indicating whether the API is accessible from anywhere (GLOBAL) or
     *   can only be access from a VPC (PRIVATE).
     */
    public fun visibility(visibility: Visibility) {
        cdkBuilder.visibility(visibility)
    }

    /**
     * A flag indicating whether or not X-Ray tracing is enabled for the GraphQL API.
     *
     * Default: - false
     *
     * @param xrayEnabled A flag indicating whether or not X-Ray tracing is enabled for the GraphQL
     *   API.
     */
    public fun xrayEnabled(xrayEnabled: Boolean) {
        cdkBuilder.xrayEnabled(xrayEnabled)
    }

    public fun build(): GraphqlApi = cdkBuilder.build()
}
