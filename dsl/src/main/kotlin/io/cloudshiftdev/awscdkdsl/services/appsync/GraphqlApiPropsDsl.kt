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
import software.amazon.awscdk.services.appsync.GraphqlApiProps
import software.amazon.awscdk.services.appsync.ISchema
import software.amazon.awscdk.services.appsync.IntrospectionConfig
import software.amazon.awscdk.services.appsync.LogConfig
import software.amazon.awscdk.services.appsync.Visibility

/**
 * Properties for an AppSync GraphQL API.
 *
 * Example:
 * ```
 * GraphqlApi sourceApi = GraphqlApi.Builder.create(this, "FirstSourceAPI")
 * .name("FirstSourceAPI")
 * .definition(Definition.fromFile(join(__dirname, "appsync.merged-api-1.graphql")))
 * .build();
 * IGraphqlApi importedMergedApi = GraphqlApi.fromGraphqlApiAttributes(this, "ImportedMergedApi",
 * GraphqlApiAttributes.builder()
 * .graphqlApiId("MyApiId")
 * .graphqlApiArn("MyApiArn")
 * .build());
 * IRole importedExecutionRole = Role.fromRoleArn(this, "ExecutionRole",
 * "arn:aws:iam::ACCOUNT:role/MyExistingRole");
 * SourceApiAssociation.Builder.create(this, "SourceApiAssociation2")
 * .sourceApi(sourceApi)
 * .mergedApi(importedMergedApi)
 * .mergeType(MergeType.MANUAL_MERGE)
 * .mergedApiExecutionRole(importedExecutionRole)
 * .build();
 * ```
 */
@CdkDslMarker
public class GraphqlApiPropsDsl {
    private val cdkBuilder: GraphqlApiProps.Builder = GraphqlApiProps.builder()

    /** @param authorizationConfig Optional authorization configuration. */
    public fun authorizationConfig(authorizationConfig: AuthorizationConfigDsl.() -> Unit = {}) {
        val builder = AuthorizationConfigDsl()
        builder.apply(authorizationConfig)
        cdkBuilder.authorizationConfig(builder.build())
    }

    /** @param authorizationConfig Optional authorization configuration. */
    public fun authorizationConfig(authorizationConfig: AuthorizationConfig) {
        cdkBuilder.authorizationConfig(authorizationConfig)
    }

    /** @param definition Definition (schema file or source APIs) for this GraphQL Api. */
    public fun definition(definition: Definition) {
        cdkBuilder.definition(definition)
    }

    /**
     * @param domainName The domain name configuration for the GraphQL API. The Route 53 hosted zone
     *   and CName DNS record must be configured in addition to this setting to enable custom domain
     *   URL
     */
    public fun domainName(domainName: DomainOptionsDsl.() -> Unit = {}) {
        val builder = DomainOptionsDsl()
        builder.apply(domainName)
        cdkBuilder.domainName(builder.build())
    }

    /**
     * @param domainName The domain name configuration for the GraphQL API. The Route 53 hosted zone
     *   and CName DNS record must be configured in addition to this setting to enable custom domain
     *   URL
     */
    public fun domainName(domainName: DomainOptions) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * @param environmentVariables A map containing the list of resources with their properties and
     *   environment variables. There are a few rules you must follow when creating keys and values:
     * * Keys must begin with a letter.
     * * Keys must be between 2 and 64 characters long.
     * * Keys can only contain letters, numbers, and the underscore character (_).
     * * Values can be up to 512 characters long.
     * * You can configure up to 50 key-value pairs in a GraphQL API.
     */
    public fun environmentVariables(environmentVariables: Map<String, String>) {
        cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * @param introspectionConfig A value indicating whether the API to enable (ENABLED) or disable
     *   (DISABLED) introspection.
     */
    public fun introspectionConfig(introspectionConfig: IntrospectionConfig) {
        cdkBuilder.introspectionConfig(introspectionConfig)
    }

    /** @param logConfig Logging configuration for this api. */
    public fun logConfig(logConfig: LogConfigDsl.() -> Unit = {}) {
        val builder = LogConfigDsl()
        builder.apply(logConfig)
        cdkBuilder.logConfig(builder.build())
    }

    /** @param logConfig Logging configuration for this api. */
    public fun logConfig(logConfig: LogConfig) {
        cdkBuilder.logConfig(logConfig)
    }

    /** @param name the name of the GraphQL API. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param schema GraphQL schema definition. Specify how you want to define your schema.
     *   SchemaFile.fromAsset(filePath: string) allows schema definition through schema.graphql file
     * @deprecated use Definition.schema instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun schema(schema: ISchema) {
        cdkBuilder.schema(schema)
    }

    /**
     * @param visibility A value indicating whether the API is accessible from anywhere (GLOBAL) or
     *   can only be access from a VPC (PRIVATE).
     */
    public fun visibility(visibility: Visibility) {
        cdkBuilder.visibility(visibility)
    }

    /**
     * @param xrayEnabled A flag indicating whether or not X-Ray tracing is enabled for the GraphQL
     *   API.
     */
    public fun xrayEnabled(xrayEnabled: Boolean) {
        cdkBuilder.xrayEnabled(xrayEnabled)
    }

    public fun build(): GraphqlApiProps = cdkBuilder.build()
}
