@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnVersionProps {
  public fun codeSha256(): String? = unwrap(this).getCodeSha256()

  public fun description(): String? = unwrap(this).getDescription()

  public fun functionName(): String

  public fun provisionedConcurrencyConfig(): Any? = unwrap(this).getProvisionedConcurrencyConfig()

  public fun runtimePolicy(): Any? = unwrap(this).getRuntimePolicy()

  @CdkDslMarker
  public interface Builder {
    public fun codeSha256(codeSha256: String)

    public fun description(description: String)

    public fun functionName(functionName: String)

    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable)

    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnVersion.ProvisionedConcurrencyConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1e8e1eecb08692ac05d0620885866a00c9d01a1068b92ba5647c926aaa78fbd")
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnVersion.ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit)

    public fun runtimePolicy(runtimePolicy: IResolvable)

    public fun runtimePolicy(runtimePolicy: CfnVersion.RuntimePolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f9b1cb19ca34f521f1fc27fc21c0b8f93cd0425a8cca90b0bd665f1391af59f")
    public fun runtimePolicy(runtimePolicy: CfnVersion.RuntimePolicyProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnVersionProps.Builder =
        software.amazon.awscdk.services.lambda.CfnVersionProps.builder()

    override fun codeSha256(codeSha256: String) {
      cdkBuilder.codeSha256(codeSha256)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(IResolvable::unwrap))
    }

    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnVersion.ProvisionedConcurrencyConfigurationProperty) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(CfnVersion.ProvisionedConcurrencyConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1e8e1eecb08692ac05d0620885866a00c9d01a1068b92ba5647c926aaa78fbd")
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnVersion.ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit):
        Unit =
        provisionedConcurrencyConfig(CfnVersion.ProvisionedConcurrencyConfigurationProperty(provisionedConcurrencyConfig))

    override fun runtimePolicy(runtimePolicy: IResolvable) {
      cdkBuilder.runtimePolicy(runtimePolicy.let(IResolvable::unwrap))
    }

    override fun runtimePolicy(runtimePolicy: CfnVersion.RuntimePolicyProperty) {
      cdkBuilder.runtimePolicy(runtimePolicy.let(CfnVersion.RuntimePolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f9b1cb19ca34f521f1fc27fc21c0b8f93cd0425a8cca90b0bd665f1391af59f")
    override fun runtimePolicy(runtimePolicy: CfnVersion.RuntimePolicyProperty.Builder.() -> Unit):
        Unit = runtimePolicy(CfnVersion.RuntimePolicyProperty(runtimePolicy))

    public fun build(): software.amazon.awscdk.services.lambda.CfnVersionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CfnVersionProps,
  ) : CdkObject(cdkObject), CfnVersionProps {
    override fun codeSha256(): String? = unwrap(this).getCodeSha256()

    override fun description(): String? = unwrap(this).getDescription()

    override fun functionName(): String = unwrap(this).getFunctionName()

    override fun provisionedConcurrencyConfig(): Any? =
        unwrap(this).getProvisionedConcurrencyConfig()

    override fun runtimePolicy(): Any? = unwrap(this).getRuntimePolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnVersionProps):
        CfnVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVersionProps):
        software.amazon.awscdk.services.lambda.CfnVersionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.CfnVersionProps
  }
}
