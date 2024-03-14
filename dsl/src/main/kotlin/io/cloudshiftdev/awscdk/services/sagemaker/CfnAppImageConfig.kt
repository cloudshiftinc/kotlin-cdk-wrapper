package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAppImageConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfig,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The name of the AppImageConfig.
   */
  public open fun appImageConfigName(): String = unwrap(this).getAppImageConfigName()

  /**
   * The name of the AppImageConfig.
   */
  public open fun appImageConfigName(`value`: String) {
    unwrap(this).setAppImageConfigName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the AppImageConfig, such as
   * `arn:aws:sagemaker:us-west-2:account-id:app-image-config/my-app-image-config-name` .
   */
  public open fun attrAppImageConfigArn(): String = unwrap(this).getAttrAppImageConfigArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The configuration for the file system and the runtime, such as the environment variables and
   * entry point.
   */
  public open fun jupyterLabAppImageConfig(): Any? = unwrap(this).getJupyterLabAppImageConfig()

  /**
   * The configuration for the file system and the runtime, such as the environment variables and
   * entry point.
   */
  public open fun jupyterLabAppImageConfig(`value`: IResolvable) {
    unwrap(this).setJupyterLabAppImageConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration for the file system and the runtime, such as the environment variables and
   * entry point.
   */
  public open fun jupyterLabAppImageConfig(`value`: JupyterLabAppImageConfigProperty) {
    unwrap(this).setJupyterLabAppImageConfig(`value`.let(JupyterLabAppImageConfigProperty::unwrap))
  }

  /**
   * The configuration for the file system and the runtime, such as the environment variables and
   * entry point.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("56345bc5cc53d2bb3f73146fa390f2c29c3452ed8532c24c5f6d1d03d3233d96")
  public open
      fun jupyterLabAppImageConfig(`value`: JupyterLabAppImageConfigProperty.Builder.() -> Unit):
      Unit = jupyterLabAppImageConfig(JupyterLabAppImageConfigProperty(`value`))

  /**
   * The configuration for the file system and kernels in the SageMaker image.
   */
  public open fun kernelGatewayImageConfig(): Any? = unwrap(this).getKernelGatewayImageConfig()

  /**
   * The configuration for the file system and kernels in the SageMaker image.
   */
  public open fun kernelGatewayImageConfig(`value`: IResolvable) {
    unwrap(this).setKernelGatewayImageConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration for the file system and kernels in the SageMaker image.
   */
  public open fun kernelGatewayImageConfig(`value`: KernelGatewayImageConfigProperty) {
    unwrap(this).setKernelGatewayImageConfig(`value`.let(KernelGatewayImageConfigProperty::unwrap))
  }

  /**
   * The configuration for the file system and kernels in the SageMaker image.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("95f670060a6826c4ddd58e4986bda60e40b9e0d74a4e45ed27746e6e44271f54")
  public open
      fun kernelGatewayImageConfig(`value`: KernelGatewayImageConfigProperty.Builder.() -> Unit):
      Unit = kernelGatewayImageConfig(KernelGatewayImageConfigProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnAppImageConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the AppImageConfig.
     *
     * Must be unique to your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-appimageconfigname)
     * @param appImageConfigName The name of the AppImageConfig. 
     */
    public fun appImageConfigName(appImageConfigName: String)

    /**
     * The configuration for the file system and the runtime, such as the environment variables and
     * entry point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-jupyterlabappimageconfig)
     * @param jupyterLabAppImageConfig The configuration for the file system and the runtime, such
     * as the environment variables and entry point. 
     */
    public fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: IResolvable)

    /**
     * The configuration for the file system and the runtime, such as the environment variables and
     * entry point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-jupyterlabappimageconfig)
     * @param jupyterLabAppImageConfig The configuration for the file system and the runtime, such
     * as the environment variables and entry point. 
     */
    public fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: JupyterLabAppImageConfigProperty)

    /**
     * The configuration for the file system and the runtime, such as the environment variables and
     * entry point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-jupyterlabappimageconfig)
     * @param jupyterLabAppImageConfig The configuration for the file system and the runtime, such
     * as the environment variables and entry point. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3182dfdc5debf396862f1319a1415f1e0a69eba5d42993b83a608bd841e71a6")
    public
        fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: JupyterLabAppImageConfigProperty.Builder.() -> Unit)

    /**
     * The configuration for the file system and kernels in the SageMaker image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-kernelgatewayimageconfig)
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in the
     * SageMaker image. 
     */
    public fun kernelGatewayImageConfig(kernelGatewayImageConfig: IResolvable)

    /**
     * The configuration for the file system and kernels in the SageMaker image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-kernelgatewayimageconfig)
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in the
     * SageMaker image. 
     */
    public fun kernelGatewayImageConfig(kernelGatewayImageConfig: KernelGatewayImageConfigProperty)

    /**
     * The configuration for the file system and kernels in the SageMaker image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-kernelgatewayimageconfig)
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in the
     * SageMaker image. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48dd6586d112ce707aa713b8ce6dc56a8bffb85dc1e0d37e9f79481f6533f76b")
    public
        fun kernelGatewayImageConfig(kernelGatewayImageConfig: KernelGatewayImageConfigProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.Builder =
        software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.Builder.create(scope, id)

    /**
     * The name of the AppImageConfig.
     *
     * Must be unique to your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-appimageconfigname)
     * @param appImageConfigName The name of the AppImageConfig. 
     */
    override fun appImageConfigName(appImageConfigName: String) {
      cdkBuilder.appImageConfigName(appImageConfigName)
    }

    /**
     * The configuration for the file system and the runtime, such as the environment variables and
     * entry point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-jupyterlabappimageconfig)
     * @param jupyterLabAppImageConfig The configuration for the file system and the runtime, such
     * as the environment variables and entry point. 
     */
    override fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: IResolvable) {
      cdkBuilder.jupyterLabAppImageConfig(jupyterLabAppImageConfig.let(IResolvable::unwrap))
    }

    /**
     * The configuration for the file system and the runtime, such as the environment variables and
     * entry point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-jupyterlabappimageconfig)
     * @param jupyterLabAppImageConfig The configuration for the file system and the runtime, such
     * as the environment variables and entry point. 
     */
    override
        fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: JupyterLabAppImageConfigProperty) {
      cdkBuilder.jupyterLabAppImageConfig(jupyterLabAppImageConfig.let(JupyterLabAppImageConfigProperty::unwrap))
    }

    /**
     * The configuration for the file system and the runtime, such as the environment variables and
     * entry point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-jupyterlabappimageconfig)
     * @param jupyterLabAppImageConfig The configuration for the file system and the runtime, such
     * as the environment variables and entry point. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3182dfdc5debf396862f1319a1415f1e0a69eba5d42993b83a608bd841e71a6")
    override
        fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: JupyterLabAppImageConfigProperty.Builder.() -> Unit):
        Unit = jupyterLabAppImageConfig(JupyterLabAppImageConfigProperty(jupyterLabAppImageConfig))

    /**
     * The configuration for the file system and kernels in the SageMaker image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-kernelgatewayimageconfig)
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in the
     * SageMaker image. 
     */
    override fun kernelGatewayImageConfig(kernelGatewayImageConfig: IResolvable) {
      cdkBuilder.kernelGatewayImageConfig(kernelGatewayImageConfig.let(IResolvable::unwrap))
    }

    /**
     * The configuration for the file system and kernels in the SageMaker image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-kernelgatewayimageconfig)
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in the
     * SageMaker image. 
     */
    override
        fun kernelGatewayImageConfig(kernelGatewayImageConfig: KernelGatewayImageConfigProperty) {
      cdkBuilder.kernelGatewayImageConfig(kernelGatewayImageConfig.let(KernelGatewayImageConfigProperty::unwrap))
    }

    /**
     * The configuration for the file system and kernels in the SageMaker image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-kernelgatewayimageconfig)
     * @param kernelGatewayImageConfig The configuration for the file system and kernels in the
     * SageMaker image. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48dd6586d112ce707aa713b8ce6dc56a8bffb85dc1e0d37e9f79481f6533f76b")
    override
        fun kernelGatewayImageConfig(kernelGatewayImageConfig: KernelGatewayImageConfigProperty.Builder.() -> Unit):
        Unit = kernelGatewayImageConfig(KernelGatewayImageConfigProperty(kernelGatewayImageConfig))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnAppImageConfig =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAppImageConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAppImageConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfig):
        CfnAppImageConfig = CfnAppImageConfig(cdkObject)

    internal fun unwrap(wrapped: CfnAppImageConfig):
        software.amazon.awscdk.services.sagemaker.CfnAppImageConfig = wrapped.cdkObject
  }

  public interface JupyterLabAppImageConfigProperty {
    /**
     * The configuration used to run the application image container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-jupyterlabappimageconfig.html#cfn-sagemaker-appimageconfig-jupyterlabappimageconfig-containerconfig)
     */
    public fun containerConfig(): Any? = unwrap(this).getContainerConfig()

    /**
     * A builder for [JupyterLabAppImageConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerConfig The configuration used to run the application image container.
       */
      public fun containerConfig(containerConfig: IResolvable)

      /**
       * @param containerConfig The configuration used to run the application image container.
       */
      public fun containerConfig(containerConfig: ContainerConfigProperty)

      /**
       * @param containerConfig The configuration used to run the application image container.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1aebf9fe4a21aa96b51896243d92e93f2bcd5d3a552db1c9e582002bc4cd71a")
      public fun containerConfig(containerConfig: ContainerConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.JupyterLabAppImageConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.JupyterLabAppImageConfigProperty.builder()

      /**
       * @param containerConfig The configuration used to run the application image container.
       */
      override fun containerConfig(containerConfig: IResolvable) {
        cdkBuilder.containerConfig(containerConfig.let(IResolvable::unwrap))
      }

      /**
       * @param containerConfig The configuration used to run the application image container.
       */
      override fun containerConfig(containerConfig: ContainerConfigProperty) {
        cdkBuilder.containerConfig(containerConfig.let(ContainerConfigProperty::unwrap))
      }

      /**
       * @param containerConfig The configuration used to run the application image container.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1aebf9fe4a21aa96b51896243d92e93f2bcd5d3a552db1c9e582002bc4cd71a")
      override fun containerConfig(containerConfig: ContainerConfigProperty.Builder.() -> Unit):
          Unit = containerConfig(ContainerConfigProperty(containerConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.JupyterLabAppImageConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.JupyterLabAppImageConfigProperty,
    ) : CdkObject(cdkObject), JupyterLabAppImageConfigProperty {
      /**
       * The configuration used to run the application image container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-jupyterlabappimageconfig.html#cfn-sagemaker-appimageconfig-jupyterlabappimageconfig-containerconfig)
       */
      override fun containerConfig(): Any? = unwrap(this).getContainerConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JupyterLabAppImageConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.JupyterLabAppImageConfigProperty):
          JupyterLabAppImageConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JupyterLabAppImageConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.JupyterLabAppImageConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.JupyterLabAppImageConfigProperty
    }
  }

  public interface KernelSpecProperty {
    /**
     * The display name of the kernel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-kernelspec.html#cfn-sagemaker-appimageconfig-kernelspec-displayname)
     */
    public fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The name of the Jupyter kernel in the image.
     *
     * This value is case sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-kernelspec.html#cfn-sagemaker-appimageconfig-kernelspec-name)
     */
    public fun name(): String

    /**
     * A builder for [KernelSpecProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param displayName The display name of the kernel.
       */
      public fun displayName(displayName: String)

      /**
       * @param name The name of the Jupyter kernel in the image. 
       * This value is case sensitive.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty.builder()

      /**
       * @param displayName The display name of the kernel.
       */
      override fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
      }

      /**
       * @param name The name of the Jupyter kernel in the image. 
       * This value is case sensitive.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty,
    ) : CdkObject(cdkObject), KernelSpecProperty {
      /**
       * The display name of the kernel.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-kernelspec.html#cfn-sagemaker-appimageconfig-kernelspec-displayname)
       */
      override fun displayName(): String? = unwrap(this).getDisplayName()

      /**
       * The name of the Jupyter kernel in the image.
       *
       * This value is case sensitive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-kernelspec.html#cfn-sagemaker-appimageconfig-kernelspec-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KernelSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty):
          KernelSpecProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KernelSpecProperty):
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty
    }
  }

  public interface ContainerConfigProperty {
    /**
     * The arguments for the container when you're running the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-containerconfig.html#cfn-sagemaker-appimageconfig-containerconfig-containerarguments)
     */
    public fun containerArguments(): List<String> = unwrap(this).getContainerArguments() ?:
        emptyList()

    /**
     * The entrypoint used to run the application in the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-containerconfig.html#cfn-sagemaker-appimageconfig-containerconfig-containerentrypoint)
     */
    public fun containerEntrypoint(): List<String> = unwrap(this).getContainerEntrypoint() ?:
        emptyList()

    /**
     * The environment variables to set in the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-containerconfig.html#cfn-sagemaker-appimageconfig-containerconfig-containerenvironmentvariables)
     */
    public fun containerEnvironmentVariables(): Any? =
        unwrap(this).getContainerEnvironmentVariables()

    /**
     * A builder for [ContainerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerArguments The arguments for the container when you're running the
       * application.
       */
      public fun containerArguments(containerArguments: List<String>)

      /**
       * @param containerArguments The arguments for the container when you're running the
       * application.
       */
      public fun containerArguments(vararg containerArguments: String)

      /**
       * @param containerEntrypoint The entrypoint used to run the application in the container.
       */
      public fun containerEntrypoint(containerEntrypoint: List<String>)

      /**
       * @param containerEntrypoint The entrypoint used to run the application in the container.
       */
      public fun containerEntrypoint(vararg containerEntrypoint: String)

      /**
       * @param containerEnvironmentVariables The environment variables to set in the container.
       */
      public fun containerEnvironmentVariables(containerEnvironmentVariables: IResolvable)

      /**
       * @param containerEnvironmentVariables The environment variables to set in the container.
       */
      public fun containerEnvironmentVariables(containerEnvironmentVariables: List<Any>)

      /**
       * @param containerEnvironmentVariables The environment variables to set in the container.
       */
      public fun containerEnvironmentVariables(vararg containerEnvironmentVariables: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.ContainerConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.ContainerConfigProperty.builder()

      /**
       * @param containerArguments The arguments for the container when you're running the
       * application.
       */
      override fun containerArguments(containerArguments: List<String>) {
        cdkBuilder.containerArguments(containerArguments)
      }

      /**
       * @param containerArguments The arguments for the container when you're running the
       * application.
       */
      override fun containerArguments(vararg containerArguments: String): Unit =
          containerArguments(containerArguments.toList())

      /**
       * @param containerEntrypoint The entrypoint used to run the application in the container.
       */
      override fun containerEntrypoint(containerEntrypoint: List<String>) {
        cdkBuilder.containerEntrypoint(containerEntrypoint)
      }

      /**
       * @param containerEntrypoint The entrypoint used to run the application in the container.
       */
      override fun containerEntrypoint(vararg containerEntrypoint: String): Unit =
          containerEntrypoint(containerEntrypoint.toList())

      /**
       * @param containerEnvironmentVariables The environment variables to set in the container.
       */
      override fun containerEnvironmentVariables(containerEnvironmentVariables: IResolvable) {
        cdkBuilder.containerEnvironmentVariables(containerEnvironmentVariables.let(IResolvable::unwrap))
      }

      /**
       * @param containerEnvironmentVariables The environment variables to set in the container.
       */
      override fun containerEnvironmentVariables(containerEnvironmentVariables: List<Any>) {
        cdkBuilder.containerEnvironmentVariables(containerEnvironmentVariables)
      }

      /**
       * @param containerEnvironmentVariables The environment variables to set in the container.
       */
      override fun containerEnvironmentVariables(vararg containerEnvironmentVariables: Any): Unit =
          containerEnvironmentVariables(containerEnvironmentVariables.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.ContainerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.ContainerConfigProperty,
    ) : CdkObject(cdkObject), ContainerConfigProperty {
      /**
       * The arguments for the container when you're running the application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-containerconfig.html#cfn-sagemaker-appimageconfig-containerconfig-containerarguments)
       */
      override fun containerArguments(): List<String> = unwrap(this).getContainerArguments() ?:
          emptyList()

      /**
       * The entrypoint used to run the application in the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-containerconfig.html#cfn-sagemaker-appimageconfig-containerconfig-containerentrypoint)
       */
      override fun containerEntrypoint(): List<String> = unwrap(this).getContainerEntrypoint() ?:
          emptyList()

      /**
       * The environment variables to set in the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-containerconfig.html#cfn-sagemaker-appimageconfig-containerconfig-containerenvironmentvariables)
       */
      override fun containerEnvironmentVariables(): Any? =
          unwrap(this).getContainerEnvironmentVariables()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.ContainerConfigProperty):
          ContainerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.ContainerConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.ContainerConfigProperty
    }
  }

  public interface KernelGatewayImageConfigProperty {
    /**
     * The Amazon Elastic File System storage configuration for a SageMaker image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-kernelgatewayimageconfig.html#cfn-sagemaker-appimageconfig-kernelgatewayimageconfig-filesystemconfig)
     */
    public fun fileSystemConfig(): Any? = unwrap(this).getFileSystemConfig()

    /**
     * The specification of the Jupyter kernels in the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-kernelgatewayimageconfig.html#cfn-sagemaker-appimageconfig-kernelgatewayimageconfig-kernelspecs)
     */
    public fun kernelSpecs(): Any

    /**
     * A builder for [KernelGatewayImageConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fileSystemConfig The Amazon Elastic File System storage configuration for a
       * SageMaker image.
       */
      public fun fileSystemConfig(fileSystemConfig: IResolvable)

      /**
       * @param fileSystemConfig The Amazon Elastic File System storage configuration for a
       * SageMaker image.
       */
      public fun fileSystemConfig(fileSystemConfig: FileSystemConfigProperty)

      /**
       * @param fileSystemConfig The Amazon Elastic File System storage configuration for a
       * SageMaker image.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28df5b17febe71ee76595a70da8e1da758c6b9bcb73a6c4dd93f394d942cb261")
      public fun fileSystemConfig(fileSystemConfig: FileSystemConfigProperty.Builder.() -> Unit)

      /**
       * @param kernelSpecs The specification of the Jupyter kernels in the image. 
       */
      public fun kernelSpecs(kernelSpecs: IResolvable)

      /**
       * @param kernelSpecs The specification of the Jupyter kernels in the image. 
       */
      public fun kernelSpecs(kernelSpecs: List<Any>)

      /**
       * @param kernelSpecs The specification of the Jupyter kernels in the image. 
       */
      public fun kernelSpecs(vararg kernelSpecs: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty.builder()

      /**
       * @param fileSystemConfig The Amazon Elastic File System storage configuration for a
       * SageMaker image.
       */
      override fun fileSystemConfig(fileSystemConfig: IResolvable) {
        cdkBuilder.fileSystemConfig(fileSystemConfig.let(IResolvable::unwrap))
      }

      /**
       * @param fileSystemConfig The Amazon Elastic File System storage configuration for a
       * SageMaker image.
       */
      override fun fileSystemConfig(fileSystemConfig: FileSystemConfigProperty) {
        cdkBuilder.fileSystemConfig(fileSystemConfig.let(FileSystemConfigProperty::unwrap))
      }

      /**
       * @param fileSystemConfig The Amazon Elastic File System storage configuration for a
       * SageMaker image.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28df5b17febe71ee76595a70da8e1da758c6b9bcb73a6c4dd93f394d942cb261")
      override fun fileSystemConfig(fileSystemConfig: FileSystemConfigProperty.Builder.() -> Unit):
          Unit = fileSystemConfig(FileSystemConfigProperty(fileSystemConfig))

      /**
       * @param kernelSpecs The specification of the Jupyter kernels in the image. 
       */
      override fun kernelSpecs(kernelSpecs: IResolvable) {
        cdkBuilder.kernelSpecs(kernelSpecs.let(IResolvable::unwrap))
      }

      /**
       * @param kernelSpecs The specification of the Jupyter kernels in the image. 
       */
      override fun kernelSpecs(kernelSpecs: List<Any>) {
        cdkBuilder.kernelSpecs(kernelSpecs)
      }

      /**
       * @param kernelSpecs The specification of the Jupyter kernels in the image. 
       */
      override fun kernelSpecs(vararg kernelSpecs: Any): Unit = kernelSpecs(kernelSpecs.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty,
    ) : CdkObject(cdkObject), KernelGatewayImageConfigProperty {
      /**
       * The Amazon Elastic File System storage configuration for a SageMaker image.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-kernelgatewayimageconfig.html#cfn-sagemaker-appimageconfig-kernelgatewayimageconfig-filesystemconfig)
       */
      override fun fileSystemConfig(): Any? = unwrap(this).getFileSystemConfig()

      /**
       * The specification of the Jupyter kernels in the image.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-kernelgatewayimageconfig.html#cfn-sagemaker-appimageconfig-kernelgatewayimageconfig-kernelspecs)
       */
      override fun kernelSpecs(): Any = unwrap(this).getKernelSpecs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KernelGatewayImageConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty):
          KernelGatewayImageConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KernelGatewayImageConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty
    }
  }

  public interface FileSystemConfigProperty {
    /**
     * The default POSIX group ID (GID).
     *
     * If not specified, defaults to `100` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-filesystemconfig.html#cfn-sagemaker-appimageconfig-filesystemconfig-defaultgid)
     */
    public fun defaultGid(): Number? = unwrap(this).getDefaultGid()

    /**
     * The default POSIX user ID (UID).
     *
     * If not specified, defaults to `1000` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-filesystemconfig.html#cfn-sagemaker-appimageconfig-filesystemconfig-defaultuid)
     */
    public fun defaultUid(): Number? = unwrap(this).getDefaultUid()

    /**
     * The path within the image to mount the user's EFS home directory.
     *
     * The directory should be empty. If not specified, defaults to * /home/sagemaker-user* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-filesystemconfig.html#cfn-sagemaker-appimageconfig-filesystemconfig-mountpath)
     */
    public fun mountPath(): String? = unwrap(this).getMountPath()

    /**
     * A builder for [FileSystemConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultGid The default POSIX group ID (GID).
       * If not specified, defaults to `100` .
       */
      public fun defaultGid(defaultGid: Number)

      /**
       * @param defaultUid The default POSIX user ID (UID).
       * If not specified, defaults to `1000` .
       */
      public fun defaultUid(defaultUid: Number)

      /**
       * @param mountPath The path within the image to mount the user's EFS home directory.
       * The directory should be empty. If not specified, defaults to * /home/sagemaker-user* .
       */
      public fun mountPath(mountPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.FileSystemConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.FileSystemConfigProperty.builder()

      /**
       * @param defaultGid The default POSIX group ID (GID).
       * If not specified, defaults to `100` .
       */
      override fun defaultGid(defaultGid: Number) {
        cdkBuilder.defaultGid(defaultGid)
      }

      /**
       * @param defaultUid The default POSIX user ID (UID).
       * If not specified, defaults to `1000` .
       */
      override fun defaultUid(defaultUid: Number) {
        cdkBuilder.defaultUid(defaultUid)
      }

      /**
       * @param mountPath The path within the image to mount the user's EFS home directory.
       * The directory should be empty. If not specified, defaults to * /home/sagemaker-user* .
       */
      override fun mountPath(mountPath: String) {
        cdkBuilder.mountPath(mountPath)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.FileSystemConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.FileSystemConfigProperty,
    ) : CdkObject(cdkObject), FileSystemConfigProperty {
      /**
       * The default POSIX group ID (GID).
       *
       * If not specified, defaults to `100` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-filesystemconfig.html#cfn-sagemaker-appimageconfig-filesystemconfig-defaultgid)
       */
      override fun defaultGid(): Number? = unwrap(this).getDefaultGid()

      /**
       * The default POSIX user ID (UID).
       *
       * If not specified, defaults to `1000` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-filesystemconfig.html#cfn-sagemaker-appimageconfig-filesystemconfig-defaultuid)
       */
      override fun defaultUid(): Number? = unwrap(this).getDefaultUid()

      /**
       * The path within the image to mount the user's EFS home directory.
       *
       * The directory should be empty. If not specified, defaults to * /home/sagemaker-user* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-filesystemconfig.html#cfn-sagemaker-appimageconfig-filesystemconfig-mountpath)
       */
      override fun mountPath(): String? = unwrap(this).getMountPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.FileSystemConfigProperty):
          FileSystemConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileSystemConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.FileSystemConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.FileSystemConfigProperty
    }
  }

  public interface CustomImageContainerEnvironmentVariableProperty {
    /**
     * The key that identifies a container environment variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-customimagecontainerenvironmentvariable.html#cfn-sagemaker-appimageconfig-customimagecontainerenvironmentvariable-key)
     */
    public fun key(): String

    /**
     * The value of the container environment variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-customimagecontainerenvironmentvariable.html#cfn-sagemaker-appimageconfig-customimagecontainerenvironmentvariable-value)
     */
    public fun `value`(): String

    /**
     * A builder for [CustomImageContainerEnvironmentVariableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key that identifies a container environment variable. 
       */
      public fun key(key: String)

      /**
       * @param value The value of the container environment variable. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.CustomImageContainerEnvironmentVariableProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.CustomImageContainerEnvironmentVariableProperty.builder()

      /**
       * @param key The key that identifies a container environment variable. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of the container environment variable. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.CustomImageContainerEnvironmentVariableProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.CustomImageContainerEnvironmentVariableProperty,
    ) : CdkObject(cdkObject), CustomImageContainerEnvironmentVariableProperty {
      /**
       * The key that identifies a container environment variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-customimagecontainerenvironmentvariable.html#cfn-sagemaker-appimageconfig-customimagecontainerenvironmentvariable-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value of the container environment variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-customimagecontainerenvironmentvariable.html#cfn-sagemaker-appimageconfig-customimagecontainerenvironmentvariable-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomImageContainerEnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.CustomImageContainerEnvironmentVariableProperty):
          CustomImageContainerEnvironmentVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomImageContainerEnvironmentVariableProperty):
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.CustomImageContainerEnvironmentVariableProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.CustomImageContainerEnvironmentVariableProperty
    }
  }
}
