@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAppImageConfigProps {
  public fun appImageConfigName(): String

  public fun jupyterLabAppImageConfig(): Any? = unwrap(this).getJupyterLabAppImageConfig()

  public fun kernelGatewayImageConfig(): Any? = unwrap(this).getKernelGatewayImageConfig()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun appImageConfigName(appImageConfigName: String)

    public fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: IResolvable)

    public
        fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: CfnAppImageConfig.JupyterLabAppImageConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00f4c61cd48cf0f3be76e482f74c8dd5a065e2178680052076f522e279e7837d")
    public
        fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: CfnAppImageConfig.JupyterLabAppImageConfigProperty.Builder.() -> Unit)

    public fun kernelGatewayImageConfig(kernelGatewayImageConfig: IResolvable)

    public
        fun kernelGatewayImageConfig(kernelGatewayImageConfig: CfnAppImageConfig.KernelGatewayImageConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("357470f97bdee8f6eecaffdafe93e2b08713c6e91528d4b0c9c023e1fc1f7331")
    public
        fun kernelGatewayImageConfig(kernelGatewayImageConfig: CfnAppImageConfig.KernelGatewayImageConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps.Builder
        = software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps.builder()

    override fun appImageConfigName(appImageConfigName: String) {
      cdkBuilder.appImageConfigName(appImageConfigName)
    }

    override fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: IResolvable) {
      cdkBuilder.jupyterLabAppImageConfig(jupyterLabAppImageConfig.let(IResolvable::unwrap))
    }

    override
        fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: CfnAppImageConfig.JupyterLabAppImageConfigProperty) {
      cdkBuilder.jupyterLabAppImageConfig(jupyterLabAppImageConfig.let(CfnAppImageConfig.JupyterLabAppImageConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00f4c61cd48cf0f3be76e482f74c8dd5a065e2178680052076f522e279e7837d")
    override
        fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: CfnAppImageConfig.JupyterLabAppImageConfigProperty.Builder.() -> Unit):
        Unit =
        jupyterLabAppImageConfig(CfnAppImageConfig.JupyterLabAppImageConfigProperty(jupyterLabAppImageConfig))

    override fun kernelGatewayImageConfig(kernelGatewayImageConfig: IResolvable) {
      cdkBuilder.kernelGatewayImageConfig(kernelGatewayImageConfig.let(IResolvable::unwrap))
    }

    override
        fun kernelGatewayImageConfig(kernelGatewayImageConfig: CfnAppImageConfig.KernelGatewayImageConfigProperty) {
      cdkBuilder.kernelGatewayImageConfig(kernelGatewayImageConfig.let(CfnAppImageConfig.KernelGatewayImageConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("357470f97bdee8f6eecaffdafe93e2b08713c6e91528d4b0c9c023e1fc1f7331")
    override
        fun kernelGatewayImageConfig(kernelGatewayImageConfig: CfnAppImageConfig.KernelGatewayImageConfigProperty.Builder.() -> Unit):
        Unit =
        kernelGatewayImageConfig(CfnAppImageConfig.KernelGatewayImageConfigProperty(kernelGatewayImageConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps,
  ) : CdkObject(cdkObject), CfnAppImageConfigProps {
    override fun appImageConfigName(): String = unwrap(this).getAppImageConfigName()

    override fun jupyterLabAppImageConfig(): Any? = unwrap(this).getJupyterLabAppImageConfig()

    override fun kernelGatewayImageConfig(): Any? = unwrap(this).getKernelGatewayImageConfig()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAppImageConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps):
        CfnAppImageConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAppImageConfigProps):
        software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps
  }
}
