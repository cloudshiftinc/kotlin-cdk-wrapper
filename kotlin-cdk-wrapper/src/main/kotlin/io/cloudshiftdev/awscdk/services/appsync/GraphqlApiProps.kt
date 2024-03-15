@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface GraphqlApiProps {
  public fun authorizationConfig(): AuthorizationConfig? =
      unwrap(this).getAuthorizationConfig()?.let(AuthorizationConfig::wrap)

  public fun definition(): Definition? = unwrap(this).getDefinition()?.let(Definition::wrap)

  public fun domainName(): DomainOptions? = unwrap(this).getDomainName()?.let(DomainOptions::wrap)

  public fun environmentVariables(): Map<String, String> = unwrap(this).getEnvironmentVariables() ?:
      emptyMap()

  public fun introspectionConfig(): IntrospectionConfig? =
      unwrap(this).getIntrospectionConfig()?.let(IntrospectionConfig::wrap)

  public fun logConfig(): LogConfig? = unwrap(this).getLogConfig()?.let(LogConfig::wrap)

  public fun name(): String

  @Deprecated(message = "deprecated in CDK")
  public fun schema(): ISchema? = unwrap(this).getSchema()?.let(ISchema::wrap)

  public fun visibility(): Visibility? = unwrap(this).getVisibility()?.let(Visibility::wrap)

  public fun xrayEnabled(): Boolean? = unwrap(this).getXrayEnabled()

  @CdkDslMarker
  public interface Builder {
    public fun authorizationConfig(authorizationConfig: AuthorizationConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32a5e3b21041e643077a244f7700162af9cc348e0dbe1eb9eec0bbb83b9b4f74")
    public fun authorizationConfig(authorizationConfig: AuthorizationConfig.Builder.() -> Unit)

    public fun definition(definition: Definition)

    public fun domainName(domainName: DomainOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffb20b334b51034ffe0a8a879ec04bca60780ff1b6832593c55b196591bebef7")
    public fun domainName(domainName: DomainOptions.Builder.() -> Unit)

    public fun environmentVariables(environmentVariables: Map<String, String>)

    public fun introspectionConfig(introspectionConfig: IntrospectionConfig)

    public fun logConfig(logConfig: LogConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2eb295cdf4d6f64a8719d107e92a427cea263d990fdc1a0e0630dd572aabf89")
    public fun logConfig(logConfig: LogConfig.Builder.() -> Unit)

    public fun name(name: String)

    @Deprecated(message = "deprecated in CDK")
    public fun schema(schema: ISchema)

    public fun visibility(visibility: Visibility)

    public fun xrayEnabled(xrayEnabled: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.GraphqlApiProps.Builder =
        software.amazon.awscdk.services.appsync.GraphqlApiProps.builder()

    override fun authorizationConfig(authorizationConfig: AuthorizationConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(AuthorizationConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32a5e3b21041e643077a244f7700162af9cc348e0dbe1eb9eec0bbb83b9b4f74")
    override fun authorizationConfig(authorizationConfig: AuthorizationConfig.Builder.() -> Unit):
        Unit = authorizationConfig(AuthorizationConfig(authorizationConfig))

    override fun definition(definition: Definition) {
      cdkBuilder.definition(definition.let(Definition::unwrap))
    }

    override fun domainName(domainName: DomainOptions) {
      cdkBuilder.domainName(domainName.let(DomainOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffb20b334b51034ffe0a8a879ec04bca60780ff1b6832593c55b196591bebef7")
    override fun domainName(domainName: DomainOptions.Builder.() -> Unit): Unit =
        domainName(DomainOptions(domainName))

    override fun environmentVariables(environmentVariables: Map<String, String>) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    override fun introspectionConfig(introspectionConfig: IntrospectionConfig) {
      cdkBuilder.introspectionConfig(introspectionConfig.let(IntrospectionConfig::unwrap))
    }

    override fun logConfig(logConfig: LogConfig) {
      cdkBuilder.logConfig(logConfig.let(LogConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2eb295cdf4d6f64a8719d107e92a427cea263d990fdc1a0e0630dd572aabf89")
    override fun logConfig(logConfig: LogConfig.Builder.() -> Unit): Unit =
        logConfig(LogConfig(logConfig))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun schema(schema: ISchema) {
      cdkBuilder.schema(schema.let(ISchema::unwrap))
    }

    override fun visibility(visibility: Visibility) {
      cdkBuilder.visibility(visibility.let(Visibility::unwrap))
    }

    override fun xrayEnabled(xrayEnabled: Boolean) {
      cdkBuilder.xrayEnabled(xrayEnabled)
    }

    public fun build(): software.amazon.awscdk.services.appsync.GraphqlApiProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.GraphqlApiProps,
  ) : CdkObject(cdkObject), GraphqlApiProps {
    override fun authorizationConfig(): AuthorizationConfig? =
        unwrap(this).getAuthorizationConfig()?.let(AuthorizationConfig::wrap)

    override fun definition(): Definition? = unwrap(this).getDefinition()?.let(Definition::wrap)

    override fun domainName(): DomainOptions? =
        unwrap(this).getDomainName()?.let(DomainOptions::wrap)

    override fun environmentVariables(): Map<String, String> =
        unwrap(this).getEnvironmentVariables() ?: emptyMap()

    override fun introspectionConfig(): IntrospectionConfig? =
        unwrap(this).getIntrospectionConfig()?.let(IntrospectionConfig::wrap)

    override fun logConfig(): LogConfig? = unwrap(this).getLogConfig()?.let(LogConfig::wrap)

    override fun name(): String = unwrap(this).getName()

    @Deprecated(message = "deprecated in CDK")
    override fun schema(): ISchema? = unwrap(this).getSchema()?.let(ISchema::wrap)

    override fun visibility(): Visibility? = unwrap(this).getVisibility()?.let(Visibility::wrap)

    override fun xrayEnabled(): Boolean? = unwrap(this).getXrayEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GraphqlApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.GraphqlApiProps):
        GraphqlApiProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GraphqlApiProps):
        software.amazon.awscdk.services.appsync.GraphqlApiProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.GraphqlApiProps
  }
}
