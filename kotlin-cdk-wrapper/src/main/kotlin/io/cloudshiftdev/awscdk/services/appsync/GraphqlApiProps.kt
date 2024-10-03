@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for an AppSync GraphQL API.
 *
 * Example:
 *
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
public interface GraphqlApiProps {
  /**
   * Optional authorization configuration.
   *
   * Default: - API Key authorization
   */
  public fun authorizationConfig(): AuthorizationConfig? =
      unwrap(this).getAuthorizationConfig()?.let(AuthorizationConfig::wrap)

  /**
   * Definition (schema file or source APIs) for this GraphQL Api.
   */
  public fun definition(): Definition? = unwrap(this).getDefinition()?.let(Definition::wrap)

  /**
   * The domain name configuration for the GraphQL API.
   *
   * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting to
   * enable custom domain URL
   *
   * Default: - no domain name
   */
  public fun domainName(): DomainOptions? = unwrap(this).getDomainName()?.let(DomainOptions::wrap)

  /**
   * A map containing the list of resources with their properties and environment variables.
   *
   * There are a few rules you must follow when creating keys and values:
   *
   * * Keys must begin with a letter.
   * * Keys must be between 2 and 64 characters long.
   * * Keys can only contain letters, numbers, and the underscore character (_).
   * * Values can be up to 512 characters long.
   * * You can configure up to 50 key-value pairs in a GraphQL API.
   *
   * Default: - No environment variables.
   */
  public fun environmentVariables(): Map<String, String> = unwrap(this).getEnvironmentVariables() ?:
      emptyMap()

  /**
   * A value indicating whether the API to enable (ENABLED) or disable (DISABLED) introspection.
   *
   * Default: IntrospectionConfig.ENABLED
   */
  public fun introspectionConfig(): IntrospectionConfig? =
      unwrap(this).getIntrospectionConfig()?.let(IntrospectionConfig::wrap)

  /**
   * Logging configuration for this api.
   *
   * Default: - None
   */
  public fun logConfig(): LogConfig? = unwrap(this).getLogConfig()?.let(LogConfig::wrap)

  /**
   * the name of the GraphQL API.
   */
  public fun name(): String

  /**
   * A number indicating the maximum depth resolvers should be accepted when handling queries.
   *
   * Value must be withing range of 0 to 75
   *
   * Default: - The default value is 0 (or unspecified) which indicates no maximum depth.
   */
  public fun queryDepthLimit(): Number? = unwrap(this).getQueryDepthLimit()

  /**
   * A number indicating the maximum number of resolvers that should be accepted when handling
   * queries.
   *
   * Value must be withing range of 0 to 10000
   *
   * Default: - The default value is 0 (or unspecified), which will set the limit to 10000
   */
  public fun resolverCountLimit(): Number? = unwrap(this).getResolverCountLimit()

  /**
   * (deprecated) GraphQL schema definition. Specify how you want to define your schema.
   *
   * SchemaFile.fromAsset(filePath: string) allows schema definition through schema.graphql file
   *
   * Default: - schema will be generated code-first (i.e. addType, addObjectType, etc.)
   *
   * @deprecated use Definition.schema instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun schema(): ISchema? = unwrap(this).getSchema()?.let(ISchema::wrap)

  /**
   * A value indicating whether the API is accessible from anywhere (GLOBAL) or can only be access
   * from a VPC (PRIVATE).
   *
   * Default: - GLOBAL
   */
  public fun visibility(): Visibility? = unwrap(this).getVisibility()?.let(Visibility::wrap)

  /**
   * A flag indicating whether or not X-Ray tracing is enabled for the GraphQL API.
   *
   * Default: - false
   */
  public fun xrayEnabled(): Boolean? = unwrap(this).getXrayEnabled()

  /**
   * A builder for [GraphqlApiProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizationConfig Optional authorization configuration.
     */
    public fun authorizationConfig(authorizationConfig: AuthorizationConfig)

    /**
     * @param authorizationConfig Optional authorization configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32a5e3b21041e643077a244f7700162af9cc348e0dbe1eb9eec0bbb83b9b4f74")
    public fun authorizationConfig(authorizationConfig: AuthorizationConfig.Builder.() -> Unit)

    /**
     * @param definition Definition (schema file or source APIs) for this GraphQL Api.
     */
    public fun definition(definition: Definition)

    /**
     * @param domainName The domain name configuration for the GraphQL API.
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     */
    public fun domainName(domainName: DomainOptions)

    /**
     * @param domainName The domain name configuration for the GraphQL API.
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffb20b334b51034ffe0a8a879ec04bca60780ff1b6832593c55b196591bebef7")
    public fun domainName(domainName: DomainOptions.Builder.() -> Unit)

    /**
     * @param environmentVariables A map containing the list of resources with their properties and
     * environment variables.
     * There are a few rules you must follow when creating keys and values:
     *
     * * Keys must begin with a letter.
     * * Keys must be between 2 and 64 characters long.
     * * Keys can only contain letters, numbers, and the underscore character (_).
     * * Values can be up to 512 characters long.
     * * You can configure up to 50 key-value pairs in a GraphQL API.
     */
    public fun environmentVariables(environmentVariables: Map<String, String>)

    /**
     * @param introspectionConfig A value indicating whether the API to enable (ENABLED) or disable
     * (DISABLED) introspection.
     */
    public fun introspectionConfig(introspectionConfig: IntrospectionConfig)

    /**
     * @param logConfig Logging configuration for this api.
     */
    public fun logConfig(logConfig: LogConfig)

    /**
     * @param logConfig Logging configuration for this api.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2eb295cdf4d6f64a8719d107e92a427cea263d990fdc1a0e0630dd572aabf89")
    public fun logConfig(logConfig: LogConfig.Builder.() -> Unit)

    /**
     * @param name the name of the GraphQL API. 
     */
    public fun name(name: String)

    /**
     * @param queryDepthLimit A number indicating the maximum depth resolvers should be accepted
     * when handling queries.
     * Value must be withing range of 0 to 75
     */
    public fun queryDepthLimit(queryDepthLimit: Number)

    /**
     * @param resolverCountLimit A number indicating the maximum number of resolvers that should be
     * accepted when handling queries.
     * Value must be withing range of 0 to 10000
     */
    public fun resolverCountLimit(resolverCountLimit: Number)

    /**
     * @param schema GraphQL schema definition. Specify how you want to define your schema.
     * SchemaFile.fromAsset(filePath: string) allows schema definition through schema.graphql file
     * @deprecated use Definition.schema instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun schema(schema: ISchema)

    /**
     * @param visibility A value indicating whether the API is accessible from anywhere (GLOBAL) or
     * can only be access from a VPC (PRIVATE).
     */
    public fun visibility(visibility: Visibility)

    /**
     * @param xrayEnabled A flag indicating whether or not X-Ray tracing is enabled for the GraphQL
     * API.
     */
    public fun xrayEnabled(xrayEnabled: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.GraphqlApiProps.Builder =
        software.amazon.awscdk.services.appsync.GraphqlApiProps.builder()

    /**
     * @param authorizationConfig Optional authorization configuration.
     */
    override fun authorizationConfig(authorizationConfig: AuthorizationConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(AuthorizationConfig.Companion::unwrap))
    }

    /**
     * @param authorizationConfig Optional authorization configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32a5e3b21041e643077a244f7700162af9cc348e0dbe1eb9eec0bbb83b9b4f74")
    override fun authorizationConfig(authorizationConfig: AuthorizationConfig.Builder.() -> Unit):
        Unit = authorizationConfig(AuthorizationConfig(authorizationConfig))

    /**
     * @param definition Definition (schema file or source APIs) for this GraphQL Api.
     */
    override fun definition(definition: Definition) {
      cdkBuilder.definition(definition.let(Definition.Companion::unwrap))
    }

    /**
     * @param domainName The domain name configuration for the GraphQL API.
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     */
    override fun domainName(domainName: DomainOptions) {
      cdkBuilder.domainName(domainName.let(DomainOptions.Companion::unwrap))
    }

    /**
     * @param domainName The domain name configuration for the GraphQL API.
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffb20b334b51034ffe0a8a879ec04bca60780ff1b6832593c55b196591bebef7")
    override fun domainName(domainName: DomainOptions.Builder.() -> Unit): Unit =
        domainName(DomainOptions(domainName))

    /**
     * @param environmentVariables A map containing the list of resources with their properties and
     * environment variables.
     * There are a few rules you must follow when creating keys and values:
     *
     * * Keys must begin with a letter.
     * * Keys must be between 2 and 64 characters long.
     * * Keys can only contain letters, numbers, and the underscore character (_).
     * * Values can be up to 512 characters long.
     * * You can configure up to 50 key-value pairs in a GraphQL API.
     */
    override fun environmentVariables(environmentVariables: Map<String, String>) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * @param introspectionConfig A value indicating whether the API to enable (ENABLED) or disable
     * (DISABLED) introspection.
     */
    override fun introspectionConfig(introspectionConfig: IntrospectionConfig) {
      cdkBuilder.introspectionConfig(introspectionConfig.let(IntrospectionConfig.Companion::unwrap))
    }

    /**
     * @param logConfig Logging configuration for this api.
     */
    override fun logConfig(logConfig: LogConfig) {
      cdkBuilder.logConfig(logConfig.let(LogConfig.Companion::unwrap))
    }

    /**
     * @param logConfig Logging configuration for this api.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2eb295cdf4d6f64a8719d107e92a427cea263d990fdc1a0e0630dd572aabf89")
    override fun logConfig(logConfig: LogConfig.Builder.() -> Unit): Unit =
        logConfig(LogConfig(logConfig))

    /**
     * @param name the name of the GraphQL API. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param queryDepthLimit A number indicating the maximum depth resolvers should be accepted
     * when handling queries.
     * Value must be withing range of 0 to 75
     */
    override fun queryDepthLimit(queryDepthLimit: Number) {
      cdkBuilder.queryDepthLimit(queryDepthLimit)
    }

    /**
     * @param resolverCountLimit A number indicating the maximum number of resolvers that should be
     * accepted when handling queries.
     * Value must be withing range of 0 to 10000
     */
    override fun resolverCountLimit(resolverCountLimit: Number) {
      cdkBuilder.resolverCountLimit(resolverCountLimit)
    }

    /**
     * @param schema GraphQL schema definition. Specify how you want to define your schema.
     * SchemaFile.fromAsset(filePath: string) allows schema definition through schema.graphql file
     * @deprecated use Definition.schema instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun schema(schema: ISchema) {
      cdkBuilder.schema(schema.let(ISchema.Companion::unwrap))
    }

    /**
     * @param visibility A value indicating whether the API is accessible from anywhere (GLOBAL) or
     * can only be access from a VPC (PRIVATE).
     */
    override fun visibility(visibility: Visibility) {
      cdkBuilder.visibility(visibility.let(Visibility.Companion::unwrap))
    }

    /**
     * @param xrayEnabled A flag indicating whether or not X-Ray tracing is enabled for the GraphQL
     * API.
     */
    override fun xrayEnabled(xrayEnabled: Boolean) {
      cdkBuilder.xrayEnabled(xrayEnabled)
    }

    public fun build(): software.amazon.awscdk.services.appsync.GraphqlApiProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.GraphqlApiProps,
  ) : CdkObject(cdkObject),
      GraphqlApiProps {
    /**
     * Optional authorization configuration.
     *
     * Default: - API Key authorization
     */
    override fun authorizationConfig(): AuthorizationConfig? =
        unwrap(this).getAuthorizationConfig()?.let(AuthorizationConfig::wrap)

    /**
     * Definition (schema file or source APIs) for this GraphQL Api.
     */
    override fun definition(): Definition? = unwrap(this).getDefinition()?.let(Definition::wrap)

    /**
     * The domain name configuration for the GraphQL API.
     *
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     *
     * Default: - no domain name
     */
    override fun domainName(): DomainOptions? =
        unwrap(this).getDomainName()?.let(DomainOptions::wrap)

    /**
     * A map containing the list of resources with their properties and environment variables.
     *
     * There are a few rules you must follow when creating keys and values:
     *
     * * Keys must begin with a letter.
     * * Keys must be between 2 and 64 characters long.
     * * Keys can only contain letters, numbers, and the underscore character (_).
     * * Values can be up to 512 characters long.
     * * You can configure up to 50 key-value pairs in a GraphQL API.
     *
     * Default: - No environment variables.
     */
    override fun environmentVariables(): Map<String, String> =
        unwrap(this).getEnvironmentVariables() ?: emptyMap()

    /**
     * A value indicating whether the API to enable (ENABLED) or disable (DISABLED) introspection.
     *
     * Default: IntrospectionConfig.ENABLED
     */
    override fun introspectionConfig(): IntrospectionConfig? =
        unwrap(this).getIntrospectionConfig()?.let(IntrospectionConfig::wrap)

    /**
     * Logging configuration for this api.
     *
     * Default: - None
     */
    override fun logConfig(): LogConfig? = unwrap(this).getLogConfig()?.let(LogConfig::wrap)

    /**
     * the name of the GraphQL API.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A number indicating the maximum depth resolvers should be accepted when handling queries.
     *
     * Value must be withing range of 0 to 75
     *
     * Default: - The default value is 0 (or unspecified) which indicates no maximum depth.
     */
    override fun queryDepthLimit(): Number? = unwrap(this).getQueryDepthLimit()

    /**
     * A number indicating the maximum number of resolvers that should be accepted when handling
     * queries.
     *
     * Value must be withing range of 0 to 10000
     *
     * Default: - The default value is 0 (or unspecified), which will set the limit to 10000
     */
    override fun resolverCountLimit(): Number? = unwrap(this).getResolverCountLimit()

    /**
     * (deprecated) GraphQL schema definition. Specify how you want to define your schema.
     *
     * SchemaFile.fromAsset(filePath: string) allows schema definition through schema.graphql file
     *
     * Default: - schema will be generated code-first (i.e. addType, addObjectType, etc.)
     *
     * @deprecated use Definition.schema instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun schema(): ISchema? = unwrap(this).getSchema()?.let(ISchema::wrap)

    /**
     * A value indicating whether the API is accessible from anywhere (GLOBAL) or can only be access
     * from a VPC (PRIVATE).
     *
     * Default: - GLOBAL
     */
    override fun visibility(): Visibility? = unwrap(this).getVisibility()?.let(Visibility::wrap)

    /**
     * A flag indicating whether or not X-Ray tracing is enabled for the GraphQL API.
     *
     * Default: - false
     */
    override fun xrayEnabled(): Boolean? = unwrap(this).getXrayEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GraphqlApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.GraphqlApiProps):
        GraphqlApiProps = CdkObjectWrappers.wrap(cdkObject) as? GraphqlApiProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GraphqlApiProps):
        software.amazon.awscdk.services.appsync.GraphqlApiProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.GraphqlApiProps
  }
}
