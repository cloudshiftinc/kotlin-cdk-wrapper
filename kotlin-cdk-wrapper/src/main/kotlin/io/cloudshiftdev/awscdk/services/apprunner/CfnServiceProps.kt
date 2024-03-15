@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnServiceProps {
  public fun autoScalingConfigurationArn(): String? = unwrap(this).getAutoScalingConfigurationArn()

  public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  public fun healthCheckConfiguration(): Any? = unwrap(this).getHealthCheckConfiguration()

  public fun instanceConfiguration(): Any? = unwrap(this).getInstanceConfiguration()

  public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  public fun observabilityConfiguration(): Any? = unwrap(this).getObservabilityConfiguration()

  public fun serviceName(): String? = unwrap(this).getServiceName()

  public fun sourceConfiguration(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun autoScalingConfigurationArn(autoScalingConfigurationArn: String)

    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    public
        fun encryptionConfiguration(encryptionConfiguration: CfnService.EncryptionConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea63b48209c6f49c89a028278e1a828ea9dd11c65bcab8ca75ed1e4e82fe0d5b")
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnService.EncryptionConfigurationProperty.Builder.() -> Unit)

    public fun healthCheckConfiguration(healthCheckConfiguration: IResolvable)

    public
        fun healthCheckConfiguration(healthCheckConfiguration: CfnService.HealthCheckConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c729b4a0859cc2e637e97493b6202143875d5df1e412bfe0f1bb0947c25a787")
    public
        fun healthCheckConfiguration(healthCheckConfiguration: CfnService.HealthCheckConfigurationProperty.Builder.() -> Unit)

    public fun instanceConfiguration(instanceConfiguration: IResolvable)

    public
        fun instanceConfiguration(instanceConfiguration: CfnService.InstanceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf7188751cde7d7668c70bddfe8a94993eaa1af1e678d4dc57b23d216ac4be64")
    public
        fun instanceConfiguration(instanceConfiguration: CfnService.InstanceConfigurationProperty.Builder.() -> Unit)

    public fun networkConfiguration(networkConfiguration: IResolvable)

    public fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b418e47fe08f5290b0f1a068b27337650fb141bd52d38352cecad086c72c1366")
    public
        fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty.Builder.() -> Unit)

    public fun observabilityConfiguration(observabilityConfiguration: IResolvable)

    public
        fun observabilityConfiguration(observabilityConfiguration: CfnService.ServiceObservabilityConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3273b9f90fc0c47f878a26bbb7513b8d2b58f35e71c5b830049d9cedff1dc752")
    public
        fun observabilityConfiguration(observabilityConfiguration: CfnService.ServiceObservabilityConfigurationProperty.Builder.() -> Unit)

    public fun serviceName(serviceName: String)

    public fun sourceConfiguration(sourceConfiguration: IResolvable)

    public fun sourceConfiguration(sourceConfiguration: CfnService.SourceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73f41b00a3b85c7ed2a39f1c1226fe1e759ad85ea56b1174bfaadd49a71e5941")
    public
        fun sourceConfiguration(sourceConfiguration: CfnService.SourceConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apprunner.CfnServiceProps.Builder =
        software.amazon.awscdk.services.apprunner.CfnServiceProps.builder()

    override fun autoScalingConfigurationArn(autoScalingConfigurationArn: String) {
      cdkBuilder.autoScalingConfigurationArn(autoScalingConfigurationArn)
    }

    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
    }

    override
        fun encryptionConfiguration(encryptionConfiguration: CfnService.EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(CfnService.EncryptionConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea63b48209c6f49c89a028278e1a828ea9dd11c65bcab8ca75ed1e4e82fe0d5b")
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnService.EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        encryptionConfiguration(CfnService.EncryptionConfigurationProperty(encryptionConfiguration))

    override fun healthCheckConfiguration(healthCheckConfiguration: IResolvable) {
      cdkBuilder.healthCheckConfiguration(healthCheckConfiguration.let(IResolvable::unwrap))
    }

    override
        fun healthCheckConfiguration(healthCheckConfiguration: CfnService.HealthCheckConfigurationProperty) {
      cdkBuilder.healthCheckConfiguration(healthCheckConfiguration.let(CfnService.HealthCheckConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c729b4a0859cc2e637e97493b6202143875d5df1e412bfe0f1bb0947c25a787")
    override
        fun healthCheckConfiguration(healthCheckConfiguration: CfnService.HealthCheckConfigurationProperty.Builder.() -> Unit):
        Unit =
        healthCheckConfiguration(CfnService.HealthCheckConfigurationProperty(healthCheckConfiguration))

    override fun instanceConfiguration(instanceConfiguration: IResolvable) {
      cdkBuilder.instanceConfiguration(instanceConfiguration.let(IResolvable::unwrap))
    }

    override
        fun instanceConfiguration(instanceConfiguration: CfnService.InstanceConfigurationProperty) {
      cdkBuilder.instanceConfiguration(instanceConfiguration.let(CfnService.InstanceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf7188751cde7d7668c70bddfe8a94993eaa1af1e678d4dc57b23d216ac4be64")
    override
        fun instanceConfiguration(instanceConfiguration: CfnService.InstanceConfigurationProperty.Builder.() -> Unit):
        Unit =
        instanceConfiguration(CfnService.InstanceConfigurationProperty(instanceConfiguration))

    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    override
        fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(CfnService.NetworkConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b418e47fe08f5290b0f1a068b27337650fb141bd52d38352cecad086c72c1366")
    override
        fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(CfnService.NetworkConfigurationProperty(networkConfiguration))

    override fun observabilityConfiguration(observabilityConfiguration: IResolvable) {
      cdkBuilder.observabilityConfiguration(observabilityConfiguration.let(IResolvable::unwrap))
    }

    override
        fun observabilityConfiguration(observabilityConfiguration: CfnService.ServiceObservabilityConfigurationProperty) {
      cdkBuilder.observabilityConfiguration(observabilityConfiguration.let(CfnService.ServiceObservabilityConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3273b9f90fc0c47f878a26bbb7513b8d2b58f35e71c5b830049d9cedff1dc752")
    override
        fun observabilityConfiguration(observabilityConfiguration: CfnService.ServiceObservabilityConfigurationProperty.Builder.() -> Unit):
        Unit =
        observabilityConfiguration(CfnService.ServiceObservabilityConfigurationProperty(observabilityConfiguration))

    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    override fun sourceConfiguration(sourceConfiguration: IResolvable) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable::unwrap))
    }

    override fun sourceConfiguration(sourceConfiguration: CfnService.SourceConfigurationProperty) {
      cdkBuilder.sourceConfiguration(sourceConfiguration.let(CfnService.SourceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73f41b00a3b85c7ed2a39f1c1226fe1e759ad85ea56b1174bfaadd49a71e5941")
    override
        fun sourceConfiguration(sourceConfiguration: CfnService.SourceConfigurationProperty.Builder.() -> Unit):
        Unit = sourceConfiguration(CfnService.SourceConfigurationProperty(sourceConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.apprunner.CfnServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apprunner.CfnServiceProps,
  ) : CdkObject(cdkObject), CfnServiceProps {
    override fun autoScalingConfigurationArn(): String? =
        unwrap(this).getAutoScalingConfigurationArn()

    override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    override fun healthCheckConfiguration(): Any? = unwrap(this).getHealthCheckConfiguration()

    override fun instanceConfiguration(): Any? = unwrap(this).getInstanceConfiguration()

    override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    override fun observabilityConfiguration(): Any? = unwrap(this).getObservabilityConfiguration()

    override fun serviceName(): String? = unwrap(this).getServiceName()

    override fun sourceConfiguration(): Any = unwrap(this).getSourceConfiguration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnServiceProps):
        CfnServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceProps):
        software.amazon.awscdk.services.apprunner.CfnServiceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apprunner.CfnServiceProps
  }
}
