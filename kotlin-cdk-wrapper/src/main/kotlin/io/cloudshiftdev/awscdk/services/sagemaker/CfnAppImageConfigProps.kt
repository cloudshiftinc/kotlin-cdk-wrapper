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

/**
 * Properties for defining a `CfnAppImageConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnAppImageConfigProps cfnAppImageConfigProps = CfnAppImageConfigProps.builder()
 * .appImageConfigName("appImageConfigName")
 * // the properties below are optional
 * .jupyterLabAppImageConfig(JupyterLabAppImageConfigProperty.builder()
 * .containerConfig(ContainerConfigProperty.builder()
 * .containerArguments(List.of("containerArguments"))
 * .containerEntrypoint(List.of("containerEntrypoint"))
 * .containerEnvironmentVariables(List.of(CustomImageContainerEnvironmentVariableProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .kernelGatewayImageConfig(KernelGatewayImageConfigProperty.builder()
 * .kernelSpecs(List.of(KernelSpecProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .displayName("displayName")
 * .build()))
 * // the properties below are optional
 * .fileSystemConfig(FileSystemConfigProperty.builder()
 * .defaultGid(123)
 * .defaultUid(123)
 * .mountPath("mountPath")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html)
 */
public interface CfnAppImageConfigProps {
  /**
   * The name of the AppImageConfig.
   *
   * Must be unique to your account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-appimageconfigname)
   */
  public fun appImageConfigName(): String

  /**
   * The configuration for the file system and the runtime, such as the environment variables and
   * entry point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-jupyterlabappimageconfig)
   */
  public fun jupyterLabAppImageConfig(): Any? = unwrap(this).getJupyterLabAppImageConfig()

  /**
   * The configuration for the file system and kernels in the SageMaker image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-kernelgatewayimageconfig)
   */
  public fun kernelGatewayImageConfig(): Any? = unwrap(this).getKernelGatewayImageConfig()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAppImageConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appImageConfigName The name of the AppImageConfig. 
     * Must be unique to your account.
     */
    public fun appImageConfigName(appImageConfigName: String)

    /**
     * @param jupyterLabAppImageConfig The configuration for the file system and the runtime, such
     * as the environment variables and entry point.
     */
    public fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: IResolvable)

    /**
     * @param jupyterLabAppImageConfig The configuration for the file system and the runtime, such
     * as the environment variables and entry point.
     */
    public
        fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: CfnAppImageConfig.JupyterLabAppImageConfigProperty)

    /**
     * @param jupyterLabAppImageConfig The configuration for the file system and the runtime, such
     * as the environment variables and entry point.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00f4c61cd48cf0f3be76e482f74c8dd5a065e2178680052076f522e279e7837d")
    public
        fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: CfnAppImageConfig.JupyterLabAppImageConfigProperty.Builder.() -> Unit)

    /**
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in the
     * SageMaker image.
     */
    public fun kernelGatewayImageConfig(kernelGatewayImageConfig: IResolvable)

    /**
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in the
     * SageMaker image.
     */
    public
        fun kernelGatewayImageConfig(kernelGatewayImageConfig: CfnAppImageConfig.KernelGatewayImageConfigProperty)

    /**
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in the
     * SageMaker image.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("357470f97bdee8f6eecaffdafe93e2b08713c6e91528d4b0c9c023e1fc1f7331")
    public
        fun kernelGatewayImageConfig(kernelGatewayImageConfig: CfnAppImageConfig.KernelGatewayImageConfigProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps.Builder
        = software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps.builder()

    /**
     * @param appImageConfigName The name of the AppImageConfig. 
     * Must be unique to your account.
     */
    override fun appImageConfigName(appImageConfigName: String) {
      cdkBuilder.appImageConfigName(appImageConfigName)
    }

    /**
     * @param jupyterLabAppImageConfig The configuration for the file system and the runtime, such
     * as the environment variables and entry point.
     */
    override fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: IResolvable) {
      cdkBuilder.jupyterLabAppImageConfig(jupyterLabAppImageConfig.let(IResolvable::unwrap))
    }

    /**
     * @param jupyterLabAppImageConfig The configuration for the file system and the runtime, such
     * as the environment variables and entry point.
     */
    override
        fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: CfnAppImageConfig.JupyterLabAppImageConfigProperty) {
      cdkBuilder.jupyterLabAppImageConfig(jupyterLabAppImageConfig.let(CfnAppImageConfig.JupyterLabAppImageConfigProperty::unwrap))
    }

    /**
     * @param jupyterLabAppImageConfig The configuration for the file system and the runtime, such
     * as the environment variables and entry point.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00f4c61cd48cf0f3be76e482f74c8dd5a065e2178680052076f522e279e7837d")
    override
        fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: CfnAppImageConfig.JupyterLabAppImageConfigProperty.Builder.() -> Unit):
        Unit =
        jupyterLabAppImageConfig(CfnAppImageConfig.JupyterLabAppImageConfigProperty(jupyterLabAppImageConfig))

    /**
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in the
     * SageMaker image.
     */
    override fun kernelGatewayImageConfig(kernelGatewayImageConfig: IResolvable) {
      cdkBuilder.kernelGatewayImageConfig(kernelGatewayImageConfig.let(IResolvable::unwrap))
    }

    /**
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in the
     * SageMaker image.
     */
    override
        fun kernelGatewayImageConfig(kernelGatewayImageConfig: CfnAppImageConfig.KernelGatewayImageConfigProperty) {
      cdkBuilder.kernelGatewayImageConfig(kernelGatewayImageConfig.let(CfnAppImageConfig.KernelGatewayImageConfigProperty::unwrap))
    }

    /**
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in the
     * SageMaker image.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("357470f97bdee8f6eecaffdafe93e2b08713c6e91528d4b0c9c023e1fc1f7331")
    override
        fun kernelGatewayImageConfig(kernelGatewayImageConfig: CfnAppImageConfig.KernelGatewayImageConfigProperty.Builder.() -> Unit):
        Unit =
        kernelGatewayImageConfig(CfnAppImageConfig.KernelGatewayImageConfigProperty(kernelGatewayImageConfig))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps,
  ) : CdkObject(cdkObject), CfnAppImageConfigProps {
    /**
     * The name of the AppImageConfig.
     *
     * Must be unique to your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-appimageconfigname)
     */
    override fun appImageConfigName(): String = unwrap(this).getAppImageConfigName()

    /**
     * The configuration for the file system and the runtime, such as the environment variables and
     * entry point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-jupyterlabappimageconfig)
     */
    override fun jupyterLabAppImageConfig(): Any? = unwrap(this).getJupyterLabAppImageConfig()

    /**
     * The configuration for the file system and kernels in the SageMaker image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-kernelgatewayimageconfig)
     */
    override fun kernelGatewayImageConfig(): Any? = unwrap(this).getKernelGatewayImageConfig()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-tags)
     */
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
