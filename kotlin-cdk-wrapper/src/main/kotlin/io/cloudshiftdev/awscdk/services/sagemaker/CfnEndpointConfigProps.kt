@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnEndpointConfigProps {
  public fun asyncInferenceConfig(): Any? = unwrap(this).getAsyncInferenceConfig()

  public fun dataCaptureConfig(): Any? = unwrap(this).getDataCaptureConfig()

  public fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

  public fun endpointConfigName(): String? = unwrap(this).getEndpointConfigName()

  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public fun explainerConfig(): Any? = unwrap(this).getExplainerConfig()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun productionVariants(): Any

  public fun shadowProductionVariants(): Any? = unwrap(this).getShadowProductionVariants()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  @CdkDslMarker
  public interface Builder {
    public fun asyncInferenceConfig(asyncInferenceConfig: IResolvable)

    public
        fun asyncInferenceConfig(asyncInferenceConfig: CfnEndpointConfig.AsyncInferenceConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e64e5623831debfb163b584a19ce54b2d2c625f1ef7118f02bf5f2bc9fa1062")
    public
        fun asyncInferenceConfig(asyncInferenceConfig: CfnEndpointConfig.AsyncInferenceConfigProperty.Builder.() -> Unit)

    public fun dataCaptureConfig(dataCaptureConfig: IResolvable)

    public fun dataCaptureConfig(dataCaptureConfig: CfnEndpointConfig.DataCaptureConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d54ba33b4fc0a9e7e611d30949571c00d4eb51726524dcb9572bcbd196468e3")
    public
        fun dataCaptureConfig(dataCaptureConfig: CfnEndpointConfig.DataCaptureConfigProperty.Builder.() -> Unit)

    public fun enableNetworkIsolation(enableNetworkIsolation: Boolean)

    public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable)

    public fun endpointConfigName(endpointConfigName: String)

    public fun executionRoleArn(executionRoleArn: String)

    public fun explainerConfig(explainerConfig: IResolvable)

    public fun explainerConfig(explainerConfig: CfnEndpointConfig.ExplainerConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b32626afe90ebc00de45f64188881a0114b93fe414a65ed55705c0e1797670b4")
    public
        fun explainerConfig(explainerConfig: CfnEndpointConfig.ExplainerConfigProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun productionVariants(productionVariants: IResolvable)

    public fun productionVariants(productionVariants: List<Any>)

    public fun productionVariants(vararg productionVariants: Any)

    public fun shadowProductionVariants(shadowProductionVariants: IResolvable)

    public fun shadowProductionVariants(shadowProductionVariants: List<Any>)

    public fun shadowProductionVariants(vararg shadowProductionVariants: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: CfnEndpointConfig.VpcConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("504a7ba8dd06581c27b35e06debcbd2c5f80e54aa90453bd2d0ca59e0bf78a2c")
    public fun vpcConfig(vpcConfig: CfnEndpointConfig.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps.Builder
        = software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps.builder()

    override fun asyncInferenceConfig(asyncInferenceConfig: IResolvable) {
      cdkBuilder.asyncInferenceConfig(asyncInferenceConfig.let(IResolvable::unwrap))
    }

    override
        fun asyncInferenceConfig(asyncInferenceConfig: CfnEndpointConfig.AsyncInferenceConfigProperty) {
      cdkBuilder.asyncInferenceConfig(asyncInferenceConfig.let(CfnEndpointConfig.AsyncInferenceConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e64e5623831debfb163b584a19ce54b2d2c625f1ef7118f02bf5f2bc9fa1062")
    override
        fun asyncInferenceConfig(asyncInferenceConfig: CfnEndpointConfig.AsyncInferenceConfigProperty.Builder.() -> Unit):
        Unit =
        asyncInferenceConfig(CfnEndpointConfig.AsyncInferenceConfigProperty(asyncInferenceConfig))

    override fun dataCaptureConfig(dataCaptureConfig: IResolvable) {
      cdkBuilder.dataCaptureConfig(dataCaptureConfig.let(IResolvable::unwrap))
    }

    override fun dataCaptureConfig(dataCaptureConfig: CfnEndpointConfig.DataCaptureConfigProperty) {
      cdkBuilder.dataCaptureConfig(dataCaptureConfig.let(CfnEndpointConfig.DataCaptureConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d54ba33b4fc0a9e7e611d30949571c00d4eb51726524dcb9572bcbd196468e3")
    override
        fun dataCaptureConfig(dataCaptureConfig: CfnEndpointConfig.DataCaptureConfigProperty.Builder.() -> Unit):
        Unit = dataCaptureConfig(CfnEndpointConfig.DataCaptureConfigProperty(dataCaptureConfig))

    override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
    }

    override fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
      cdkBuilder.enableNetworkIsolation(enableNetworkIsolation.let(IResolvable::unwrap))
    }

    override fun endpointConfigName(endpointConfigName: String) {
      cdkBuilder.endpointConfigName(endpointConfigName)
    }

    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    override fun explainerConfig(explainerConfig: IResolvable) {
      cdkBuilder.explainerConfig(explainerConfig.let(IResolvable::unwrap))
    }

    override fun explainerConfig(explainerConfig: CfnEndpointConfig.ExplainerConfigProperty) {
      cdkBuilder.explainerConfig(explainerConfig.let(CfnEndpointConfig.ExplainerConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b32626afe90ebc00de45f64188881a0114b93fe414a65ed55705c0e1797670b4")
    override
        fun explainerConfig(explainerConfig: CfnEndpointConfig.ExplainerConfigProperty.Builder.() -> Unit):
        Unit = explainerConfig(CfnEndpointConfig.ExplainerConfigProperty(explainerConfig))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun productionVariants(productionVariants: IResolvable) {
      cdkBuilder.productionVariants(productionVariants.let(IResolvable::unwrap))
    }

    override fun productionVariants(productionVariants: List<Any>) {
      cdkBuilder.productionVariants(productionVariants)
    }

    override fun productionVariants(vararg productionVariants: Any): Unit =
        productionVariants(productionVariants.toList())

    override fun shadowProductionVariants(shadowProductionVariants: IResolvable) {
      cdkBuilder.shadowProductionVariants(shadowProductionVariants.let(IResolvable::unwrap))
    }

    override fun shadowProductionVariants(shadowProductionVariants: List<Any>) {
      cdkBuilder.shadowProductionVariants(shadowProductionVariants)
    }

    override fun shadowProductionVariants(vararg shadowProductionVariants: Any): Unit =
        shadowProductionVariants(shadowProductionVariants.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    override fun vpcConfig(vpcConfig: CfnEndpointConfig.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnEndpointConfig.VpcConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("504a7ba8dd06581c27b35e06debcbd2c5f80e54aa90453bd2d0ca59e0bf78a2c")
    override fun vpcConfig(vpcConfig: CfnEndpointConfig.VpcConfigProperty.Builder.() -> Unit): Unit
        = vpcConfig(CfnEndpointConfig.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps,
  ) : CdkObject(cdkObject), CfnEndpointConfigProps {
    override fun asyncInferenceConfig(): Any? = unwrap(this).getAsyncInferenceConfig()

    override fun dataCaptureConfig(): Any? = unwrap(this).getDataCaptureConfig()

    override fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

    override fun endpointConfigName(): String? = unwrap(this).getEndpointConfigName()

    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    override fun explainerConfig(): Any? = unwrap(this).getExplainerConfig()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun productionVariants(): Any = unwrap(this).getProductionVariants()

    override fun shadowProductionVariants(): Any? = unwrap(this).getShadowProductionVariants()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEndpointConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps):
        CfnEndpointConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointConfigProps):
        software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps
  }
}
