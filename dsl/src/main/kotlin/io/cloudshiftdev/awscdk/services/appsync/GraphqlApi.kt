package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class GraphqlApi internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.GraphqlApi,
) : GraphqlApiBase(cdkObject) {
  public open fun addEnvironmentVariable(key: String, `value`: String) {
    unwrap(this).addEnvironmentVariable(key, `value`)
  }

  public override fun addSchemaDependency(construct: CfnResource): Boolean =
      unwrap(this).addSchemaDependency(construct.let(CfnResource::unwrap))

  public override fun apiId(): String = unwrap(this).getApiId()

  public open fun apiKey(): String? = unwrap(this).getApiKey()

  public open fun appSyncDomainName(): String = unwrap(this).getAppSyncDomainName()

  public override fun arn(): String = unwrap(this).getArn()

  public open fun graphqlUrl(): String = unwrap(this).getGraphqlUrl()

  public open fun logGroup(): ILogGroup = unwrap(this).getLogGroup().let(ILogGroup::wrap)

  public open fun modes(): List<AuthorizationType> =
      unwrap(this).getModes().map(AuthorizationType::wrap)

  public open fun name(): String = unwrap(this).getName()

  public open fun schema(): ISchema = unwrap(this).getSchema().let(ISchema::wrap)

  public interface Builder {
    public fun authorizationConfig(authorizationConfig: AuthorizationConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("728b038769468eb7522cd46a6c98c1ca465e3f1d400434787ca2e7d4f1a703d1")
    public fun authorizationConfig(authorizationConfig: AuthorizationConfig.Builder.() -> Unit) {
    }

    public fun definition(definition: Definition) {
    }

    public fun domainName(domainName: DomainOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("112f24ca464657005f209da77eb7883a8b92773093491c66f7058148699dbf5a")
    public fun domainName(domainName: DomainOptions.Builder.() -> Unit) {
    }

    public fun environmentVariables(environmentVariables: Map<String, String>) {
    }

    public fun introspectionConfig(introspectionConfig: IntrospectionConfig) {
    }

    public fun logConfig(logConfig: LogConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b86a872e41c66530612eeb5cacdb6aba12033e3d9dfc0fd86115b1e0246658b")
    public fun logConfig(logConfig: LogConfig.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun schema(schema: ISchema) {
    }

    public fun visibility(visibility: Visibility) {
    }

    public fun xrayEnabled(xrayEnabled: Boolean) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.GraphqlApi.Builder =
        software.amazon.awscdk.services.appsync.GraphqlApi.Builder.create(scope, id)

    public override fun authorizationConfig(authorizationConfig: AuthorizationConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(AuthorizationConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("728b038769468eb7522cd46a6c98c1ca465e3f1d400434787ca2e7d4f1a703d1")
    public override
        fun authorizationConfig(authorizationConfig: AuthorizationConfig.Builder.() -> Unit): Unit =
        authorizationConfig(AuthorizationConfig(authorizationConfig))

    public override fun definition(definition: Definition) {
      cdkBuilder.definition(definition.let(Definition::unwrap))
    }

    public override fun domainName(domainName: DomainOptions) {
      cdkBuilder.domainName(domainName.let(DomainOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("112f24ca464657005f209da77eb7883a8b92773093491c66f7058148699dbf5a")
    public override fun domainName(domainName: DomainOptions.Builder.() -> Unit): Unit =
        domainName(DomainOptions(domainName))

    public override fun environmentVariables(environmentVariables: Map<String, String>) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    public override fun introspectionConfig(introspectionConfig: IntrospectionConfig) {
      cdkBuilder.introspectionConfig(introspectionConfig.let(IntrospectionConfig::unwrap))
    }

    public override fun logConfig(logConfig: LogConfig) {
      cdkBuilder.logConfig(logConfig.let(LogConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b86a872e41c66530612eeb5cacdb6aba12033e3d9dfc0fd86115b1e0246658b")
    public override fun logConfig(logConfig: LogConfig.Builder.() -> Unit): Unit =
        logConfig(LogConfig(logConfig))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun schema(schema: ISchema) {
      cdkBuilder.schema(schema.let(ISchema::unwrap))
    }

    public override fun visibility(visibility: Visibility) {
      cdkBuilder.visibility(visibility.let(Visibility::unwrap))
    }

    public override fun xrayEnabled(xrayEnabled: Boolean) {
      cdkBuilder.xrayEnabled(xrayEnabled)
    }

    public fun build(): software.amazon.awscdk.services.appsync.GraphqlApi = cdkBuilder.build()
  }

  public companion object {
    public open fun fromGraphqlApiAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: GraphqlApiAttributes,
    ): IGraphqlApi =
        software.amazon.awscdk.services.appsync.GraphqlApi.fromGraphqlApiAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(GraphqlApiAttributes::unwrap)).let(IGraphqlApi::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a7a086d289e85cbe58a544f38e35ac10906749dadb33dde67fec9359500d7f3")
    public open fun fromGraphqlApiAttributes(
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
