@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An AppSync GraphQL API.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.events.*;
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
public open class GraphqlApi internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.GraphqlApi,
) : GraphqlApiBase(cdkObject) {
  /**
   * Add an environment variable to the construct.
   *
   * @param key 
   * @param value 
   */
  public open fun addEnvironmentVariable(key: String, `value`: String) {
    unwrap(this).addEnvironmentVariable(key, `value`)
  }

  /**
   * Add schema dependency to a given construct.
   *
   * @param construct the dependee. 
   */
  public override fun addSchemaDependency(construct: CfnResource): Boolean =
      unwrap(this).addSchemaDependency(construct.let(CfnResource::unwrap))

  /**
   * an unique AWS AppSync GraphQL API identifier i.e. 'lxz775lwdrgcndgz3nurvac7oa'.
   */
  public override fun apiId(): String = unwrap(this).getApiId()

  /**
   * the configured API key, if present.
   *
   * Default: - no api key
   */
  public open fun apiKey(): String? = unwrap(this).getApiKey()

  /**
   * The AppSyncDomainName of the associated custom domain.
   */
  public open fun appSyncDomainName(): String = unwrap(this).getAppSyncDomainName()

  /**
   * the ARN of the API.
   */
  public override fun arn(): String = unwrap(this).getArn()

  /**
   * the URL of the endpoint created by AppSync.
   */
  public open fun graphqlUrl(): String = unwrap(this).getGraphqlUrl()

  /**
   * the CloudWatch Log Group for this API.
   */
  public open fun logGroup(): ILogGroup = unwrap(this).getLogGroup().let(ILogGroup::wrap)

  /**
   * The Authorization Types for this GraphQL Api.
   */
  public open fun modes(): List<AuthorizationType> =
      unwrap(this).getModes().map(AuthorizationType::wrap)

  /**
   * the name of the API.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * the schema attached to this api (only available for GraphQL APIs, not available for merged
   * APIs).
   */
  public open fun schema(): ISchema = unwrap(this).getSchema().let(ISchema::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.GraphqlApi].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Optional authorization configuration.
     *
     * Default: - API Key authorization
     *
     * @param authorizationConfig Optional authorization configuration. 
     */
    public fun authorizationConfig(authorizationConfig: AuthorizationConfig)

    /**
     * Optional authorization configuration.
     *
     * Default: - API Key authorization
     *
     * @param authorizationConfig Optional authorization configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("728b038769468eb7522cd46a6c98c1ca465e3f1d400434787ca2e7d4f1a703d1")
    public fun authorizationConfig(authorizationConfig: AuthorizationConfig.Builder.() -> Unit)

    /**
     * Definition (schema file or source APIs) for this GraphQL Api.
     *
     * @param definition Definition (schema file or source APIs) for this GraphQL Api. 
     */
    public fun definition(definition: Definition)

    /**
     * The domain name configuration for the GraphQL API.
     *
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     *
     * Default: - no domain name
     *
     * @param domainName The domain name configuration for the GraphQL API. 
     */
    public fun domainName(domainName: DomainOptions)

    /**
     * The domain name configuration for the GraphQL API.
     *
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     *
     * Default: - no domain name
     *
     * @param domainName The domain name configuration for the GraphQL API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("112f24ca464657005f209da77eb7883a8b92773093491c66f7058148699dbf5a")
    public fun domainName(domainName: DomainOptions.Builder.() -> Unit)

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
     *
     * @param environmentVariables A map containing the list of resources with their properties and
     * environment variables. 
     */
    public fun environmentVariables(environmentVariables: Map<String, String>)

    /**
     * A value indicating whether the API to enable (ENABLED) or disable (DISABLED) introspection.
     *
     * Default: IntrospectionConfig.ENABLED
     *
     * @param introspectionConfig A value indicating whether the API to enable (ENABLED) or disable
     * (DISABLED) introspection. 
     */
    public fun introspectionConfig(introspectionConfig: IntrospectionConfig)

    /**
     * Logging configuration for this api.
     *
     * Default: - None
     *
     * @param logConfig Logging configuration for this api. 
     */
    public fun logConfig(logConfig: LogConfig)

    /**
     * Logging configuration for this api.
     *
     * Default: - None
     *
     * @param logConfig Logging configuration for this api. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b86a872e41c66530612eeb5cacdb6aba12033e3d9dfc0fd86115b1e0246658b")
    public fun logConfig(logConfig: LogConfig.Builder.() -> Unit)

    /**
     * the name of the GraphQL API.
     *
     * @param name the name of the GraphQL API. 
     */
    public fun name(name: String)

    /**
     * (deprecated) GraphQL schema definition. Specify how you want to define your schema.
     *
     * SchemaFile.fromAsset(filePath: string) allows schema definition through schema.graphql file
     *
     * Default: - schema will be generated code-first (i.e. addType, addObjectType, etc.)
     *
     * @deprecated use Definition.schema instead
     * @param schema GraphQL schema definition. Specify how you want to define your schema. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun schema(schema: ISchema)

    /**
     * A value indicating whether the API is accessible from anywhere (GLOBAL) or can only be access
     * from a VPC (PRIVATE).
     *
     * Default: - GLOBAL
     *
     * @param visibility A value indicating whether the API is accessible from anywhere (GLOBAL) or
     * can only be access from a VPC (PRIVATE). 
     */
    public fun visibility(visibility: Visibility)

    /**
     * A flag indicating whether or not X-Ray tracing is enabled for the GraphQL API.
     *
     * Default: - false
     *
     * @param xrayEnabled A flag indicating whether or not X-Ray tracing is enabled for the GraphQL
     * API. 
     */
    public fun xrayEnabled(xrayEnabled: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.GraphqlApi.Builder =
        software.amazon.awscdk.services.appsync.GraphqlApi.Builder.create(scope, id)

    /**
     * Optional authorization configuration.
     *
     * Default: - API Key authorization
     *
     * @param authorizationConfig Optional authorization configuration. 
     */
    override fun authorizationConfig(authorizationConfig: AuthorizationConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(AuthorizationConfig::unwrap))
    }

    /**
     * Optional authorization configuration.
     *
     * Default: - API Key authorization
     *
     * @param authorizationConfig Optional authorization configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("728b038769468eb7522cd46a6c98c1ca465e3f1d400434787ca2e7d4f1a703d1")
    override fun authorizationConfig(authorizationConfig: AuthorizationConfig.Builder.() -> Unit):
        Unit = authorizationConfig(AuthorizationConfig(authorizationConfig))

    /**
     * Definition (schema file or source APIs) for this GraphQL Api.
     *
     * @param definition Definition (schema file or source APIs) for this GraphQL Api. 
     */
    override fun definition(definition: Definition) {
      cdkBuilder.definition(definition.let(Definition::unwrap))
    }

    /**
     * The domain name configuration for the GraphQL API.
     *
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     *
     * Default: - no domain name
     *
     * @param domainName The domain name configuration for the GraphQL API. 
     */
    override fun domainName(domainName: DomainOptions) {
      cdkBuilder.domainName(domainName.let(DomainOptions::unwrap))
    }

    /**
     * The domain name configuration for the GraphQL API.
     *
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     *
     * Default: - no domain name
     *
     * @param domainName The domain name configuration for the GraphQL API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("112f24ca464657005f209da77eb7883a8b92773093491c66f7058148699dbf5a")
    override fun domainName(domainName: DomainOptions.Builder.() -> Unit): Unit =
        domainName(DomainOptions(domainName))

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
     *
     * @param environmentVariables A map containing the list of resources with their properties and
     * environment variables. 
     */
    override fun environmentVariables(environmentVariables: Map<String, String>) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * A value indicating whether the API to enable (ENABLED) or disable (DISABLED) introspection.
     *
     * Default: IntrospectionConfig.ENABLED
     *
     * @param introspectionConfig A value indicating whether the API to enable (ENABLED) or disable
     * (DISABLED) introspection. 
     */
    override fun introspectionConfig(introspectionConfig: IntrospectionConfig) {
      cdkBuilder.introspectionConfig(introspectionConfig.let(IntrospectionConfig::unwrap))
    }

    /**
     * Logging configuration for this api.
     *
     * Default: - None
     *
     * @param logConfig Logging configuration for this api. 
     */
    override fun logConfig(logConfig: LogConfig) {
      cdkBuilder.logConfig(logConfig.let(LogConfig::unwrap))
    }

    /**
     * Logging configuration for this api.
     *
     * Default: - None
     *
     * @param logConfig Logging configuration for this api. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b86a872e41c66530612eeb5cacdb6aba12033e3d9dfc0fd86115b1e0246658b")
    override fun logConfig(logConfig: LogConfig.Builder.() -> Unit): Unit =
        logConfig(LogConfig(logConfig))

    /**
     * the name of the GraphQL API.
     *
     * @param name the name of the GraphQL API. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * (deprecated) GraphQL schema definition. Specify how you want to define your schema.
     *
     * SchemaFile.fromAsset(filePath: string) allows schema definition through schema.graphql file
     *
     * Default: - schema will be generated code-first (i.e. addType, addObjectType, etc.)
     *
     * @deprecated use Definition.schema instead
     * @param schema GraphQL schema definition. Specify how you want to define your schema. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun schema(schema: ISchema) {
      cdkBuilder.schema(schema.let(ISchema::unwrap))
    }

    /**
     * A value indicating whether the API is accessible from anywhere (GLOBAL) or can only be access
     * from a VPC (PRIVATE).
     *
     * Default: - GLOBAL
     *
     * @param visibility A value indicating whether the API is accessible from anywhere (GLOBAL) or
     * can only be access from a VPC (PRIVATE). 
     */
    override fun visibility(visibility: Visibility) {
      cdkBuilder.visibility(visibility.let(Visibility::unwrap))
    }

    /**
     * A flag indicating whether or not X-Ray tracing is enabled for the GraphQL API.
     *
     * Default: - false
     *
     * @param xrayEnabled A flag indicating whether or not X-Ray tracing is enabled for the GraphQL
     * API. 
     */
    override fun xrayEnabled(xrayEnabled: Boolean) {
      cdkBuilder.xrayEnabled(xrayEnabled)
    }

    public fun build(): software.amazon.awscdk.services.appsync.GraphqlApi = cdkBuilder.build()
  }

  public companion object {
    public fun fromGraphqlApiAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: GraphqlApiAttributes,
    ): IGraphqlApi =
        software.amazon.awscdk.services.appsync.GraphqlApi.fromGraphqlApiAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(GraphqlApiAttributes::unwrap)).let(IGraphqlApi::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a7a086d289e85cbe58a544f38e35ac10906749dadb33dde67fec9359500d7f3")
    public fun fromGraphqlApiAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: GraphqlApiAttributes.Builder.() -> Unit,
    ): IGraphqlApi = fromGraphqlApiAttributes(scope, id, GraphqlApiAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): GraphqlApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return GraphqlApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.GraphqlApi): GraphqlApi =
        GraphqlApi(cdkObject)

    internal fun unwrap(wrapped: GraphqlApi): software.amazon.awscdk.services.appsync.GraphqlApi =
        wrapped.cdkObject
  }
}
