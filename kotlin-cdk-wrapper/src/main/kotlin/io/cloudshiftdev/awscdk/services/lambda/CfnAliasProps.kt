@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnAliasProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun functionName(): String

  public fun functionVersion(): String

  public fun name(): String

  public fun provisionedConcurrencyConfig(): Any? = unwrap(this).getProvisionedConcurrencyConfig()

  public fun routingConfig(): Any? = unwrap(this).getRoutingConfig()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun functionName(functionName: String)

    public fun functionVersion(functionVersion: String)

    public fun name(name: String)

    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable)

    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnAlias.ProvisionedConcurrencyConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eaa1b0fad1dc921f1f33428f8812aafc460d1cc2785a7d649dffe79068b4ba08")
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnAlias.ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit)

    public fun routingConfig(routingConfig: IResolvable)

    public fun routingConfig(routingConfig: CfnAlias.AliasRoutingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c66bef2b6f7628495d7e3669fb8effa5e46231302d06fef8c3701f6cc9a97d42")
    public
        fun routingConfig(routingConfig: CfnAlias.AliasRoutingConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnAliasProps.Builder =
        software.amazon.awscdk.services.lambda.CfnAliasProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun functionVersion(functionVersion: String) {
      cdkBuilder.functionVersion(functionVersion)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(IResolvable::unwrap))
    }

    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnAlias.ProvisionedConcurrencyConfigurationProperty) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(CfnAlias.ProvisionedConcurrencyConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eaa1b0fad1dc921f1f33428f8812aafc460d1cc2785a7d649dffe79068b4ba08")
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnAlias.ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit):
        Unit =
        provisionedConcurrencyConfig(CfnAlias.ProvisionedConcurrencyConfigurationProperty(provisionedConcurrencyConfig))

    override fun routingConfig(routingConfig: IResolvable) {
      cdkBuilder.routingConfig(routingConfig.let(IResolvable::unwrap))
    }

    override fun routingConfig(routingConfig: CfnAlias.AliasRoutingConfigurationProperty) {
      cdkBuilder.routingConfig(routingConfig.let(CfnAlias.AliasRoutingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c66bef2b6f7628495d7e3669fb8effa5e46231302d06fef8c3701f6cc9a97d42")
    override
        fun routingConfig(routingConfig: CfnAlias.AliasRoutingConfigurationProperty.Builder.() -> Unit):
        Unit = routingConfig(CfnAlias.AliasRoutingConfigurationProperty(routingConfig))

    public fun build(): software.amazon.awscdk.services.lambda.CfnAliasProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CfnAliasProps,
  ) : CdkObject(cdkObject), CfnAliasProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun functionName(): String = unwrap(this).getFunctionName()

    override fun functionVersion(): String = unwrap(this).getFunctionVersion()

    override fun name(): String = unwrap(this).getName()

    override fun provisionedConcurrencyConfig(): Any? =
        unwrap(this).getProvisionedConcurrencyConfig()

    override fun routingConfig(): Any? = unwrap(this).getRoutingConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnAliasProps):
        CfnAliasProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAliasProps):
        software.amazon.awscdk.services.lambda.CfnAliasProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.CfnAliasProps
  }
}
