package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfig,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun appImageConfigName(): String = unwrap(this).getAppImageConfigName()

  public open fun appImageConfigName(`value`: String) {
    unwrap(this).setAppImageConfigName(`value`)
  }

  public open fun attrAppImageConfigArn(): String = unwrap(this).getAttrAppImageConfigArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun jupyterLabAppImageConfig(): Any? = unwrap(this).getJupyterLabAppImageConfig()

  public open fun jupyterLabAppImageConfig(`value`: IResolvable) {
    unwrap(this).setJupyterLabAppImageConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun jupyterLabAppImageConfig(`value`: JupyterLabAppImageConfigProperty) {
    unwrap(this).setJupyterLabAppImageConfig(`value`.let(JupyterLabAppImageConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("56345bc5cc53d2bb3f73146fa390f2c29c3452ed8532c24c5f6d1d03d3233d96")
  public open
      fun jupyterLabAppImageConfig(`value`: JupyterLabAppImageConfigProperty.Builder.() -> Unit):
      Unit = jupyterLabAppImageConfig(JupyterLabAppImageConfigProperty(`value`))

  public open fun kernelGatewayImageConfig(): Any? = unwrap(this).getKernelGatewayImageConfig()

  public open fun kernelGatewayImageConfig(`value`: IResolvable) {
    unwrap(this).setKernelGatewayImageConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun kernelGatewayImageConfig(`value`: KernelGatewayImageConfigProperty) {
    unwrap(this).setKernelGatewayImageConfig(`value`.let(KernelGatewayImageConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("95f670060a6826c4ddd58e4986bda60e40b9e0d74a4e45ed27746e6e44271f54")
  public open
      fun kernelGatewayImageConfig(`value`: KernelGatewayImageConfigProperty.Builder.() -> Unit):
      Unit = kernelGatewayImageConfig(KernelGatewayImageConfigProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun appImageConfigName(appImageConfigName: String)

    public fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: IResolvable)

    public fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: JupyterLabAppImageConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3182dfdc5debf396862f1319a1415f1e0a69eba5d42993b83a608bd841e71a6")
    public
        fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: JupyterLabAppImageConfigProperty.Builder.() -> Unit)

    public fun kernelGatewayImageConfig(kernelGatewayImageConfig: IResolvable)

    public fun kernelGatewayImageConfig(kernelGatewayImageConfig: KernelGatewayImageConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48dd6586d112ce707aa713b8ce6dc56a8bffb85dc1e0d37e9f79481f6533f76b")
    public
        fun kernelGatewayImageConfig(kernelGatewayImageConfig: KernelGatewayImageConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.Builder =
        software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.Builder.create(scope, id)

    override fun appImageConfigName(appImageConfigName: String) {
      cdkBuilder.appImageConfigName(appImageConfigName)
    }

    override fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: IResolvable) {
      cdkBuilder.jupyterLabAppImageConfig(jupyterLabAppImageConfig.let(IResolvable::unwrap))
    }

    override
        fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: JupyterLabAppImageConfigProperty) {
      cdkBuilder.jupyterLabAppImageConfig(jupyterLabAppImageConfig.let(JupyterLabAppImageConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3182dfdc5debf396862f1319a1415f1e0a69eba5d42993b83a608bd841e71a6")
    override
        fun jupyterLabAppImageConfig(jupyterLabAppImageConfig: JupyterLabAppImageConfigProperty.Builder.() -> Unit):
        Unit = jupyterLabAppImageConfig(JupyterLabAppImageConfigProperty(jupyterLabAppImageConfig))

    override fun kernelGatewayImageConfig(kernelGatewayImageConfig: IResolvable) {
      cdkBuilder.kernelGatewayImageConfig(kernelGatewayImageConfig.let(IResolvable::unwrap))
    }

    override
        fun kernelGatewayImageConfig(kernelGatewayImageConfig: KernelGatewayImageConfigProperty) {
      cdkBuilder.kernelGatewayImageConfig(kernelGatewayImageConfig.let(KernelGatewayImageConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48dd6586d112ce707aa713b8ce6dc56a8bffb85dc1e0d37e9f79481f6533f76b")
    override
        fun kernelGatewayImageConfig(kernelGatewayImageConfig: KernelGatewayImageConfigProperty.Builder.() -> Unit):
        Unit = kernelGatewayImageConfig(KernelGatewayImageConfigProperty(kernelGatewayImageConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnAppImageConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
    public fun containerConfig(): Any? = unwrap(this).getContainerConfig()

    public interface Builder {
      public fun containerConfig(containerConfig: IResolvable)

      public fun containerConfig(containerConfig: ContainerConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1aebf9fe4a21aa96b51896243d92e93f2bcd5d3a552db1c9e582002bc4cd71a")
      public fun containerConfig(containerConfig: ContainerConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.JupyterLabAppImageConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.JupyterLabAppImageConfigProperty.builder()

      override fun containerConfig(containerConfig: IResolvable) {
        cdkBuilder.containerConfig(containerConfig.let(IResolvable::unwrap))
      }

      override fun containerConfig(containerConfig: ContainerConfigProperty) {
        cdkBuilder.containerConfig(containerConfig.let(ContainerConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1aebf9fe4a21aa96b51896243d92e93f2bcd5d3a552db1c9e582002bc4cd71a")
      override fun containerConfig(containerConfig: ContainerConfigProperty.Builder.() -> Unit):
          Unit = containerConfig(ContainerConfigProperty(containerConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.JupyterLabAppImageConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.JupyterLabAppImageConfigProperty,
    ) : JupyterLabAppImageConfigProperty {
      override fun containerConfig(): Any? = unwrap(this).getContainerConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JupyterLabAppImageConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.JupyterLabAppImageConfigProperty):
          JupyterLabAppImageConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JupyterLabAppImageConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.JupyterLabAppImageConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface KernelSpecProperty {
    public fun displayName(): String? = unwrap(this).getDisplayName()

    public fun name(): String

    public interface Builder {
      public fun displayName(displayName: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty.builder()

      override fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty,
    ) : KernelSpecProperty {
      override fun displayName(): String? = unwrap(this).getDisplayName()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KernelSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty):
          KernelSpecProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KernelSpecProperty):
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelSpecProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ContainerConfigProperty {
    public fun containerArguments(): List<String> = unwrap(this).getContainerArguments() ?:
        emptyList()

    public fun containerEntrypoint(): List<String> = unwrap(this).getContainerEntrypoint() ?:
        emptyList()

    public fun containerEnvironmentVariables(): Any? =
        unwrap(this).getContainerEnvironmentVariables()

    public interface Builder {
      public fun containerArguments(containerArguments: List<String>)

      public fun containerEntrypoint(containerEntrypoint: List<String>)

      public fun containerEnvironmentVariables(containerEnvironmentVariables: IResolvable)

      public fun containerEnvironmentVariables(containerEnvironmentVariables: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.ContainerConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.ContainerConfigProperty.builder()

      override fun containerArguments(containerArguments: List<String>) {
        cdkBuilder.containerArguments(containerArguments)
      }

      override fun containerEntrypoint(containerEntrypoint: List<String>) {
        cdkBuilder.containerEntrypoint(containerEntrypoint)
      }

      override fun containerEnvironmentVariables(containerEnvironmentVariables: IResolvable) {
        cdkBuilder.containerEnvironmentVariables(containerEnvironmentVariables.let(IResolvable::unwrap))
      }

      override fun containerEnvironmentVariables(containerEnvironmentVariables: List<Any>) {
        cdkBuilder.containerEnvironmentVariables(containerEnvironmentVariables)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.ContainerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.ContainerConfigProperty,
    ) : ContainerConfigProperty {
      override fun containerArguments(): List<String> = unwrap(this).getContainerArguments() ?:
          emptyList()

      override fun containerEntrypoint(): List<String> = unwrap(this).getContainerEntrypoint() ?:
          emptyList()

      override fun containerEnvironmentVariables(): Any? =
          unwrap(this).getContainerEnvironmentVariables()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.ContainerConfigProperty):
          ContainerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.ContainerConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface KernelGatewayImageConfigProperty {
    public fun fileSystemConfig(): Any? = unwrap(this).getFileSystemConfig()

    public fun kernelSpecs(): Any

    public interface Builder {
      public fun fileSystemConfig(fileSystemConfig: IResolvable)

      public fun fileSystemConfig(fileSystemConfig: FileSystemConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28df5b17febe71ee76595a70da8e1da758c6b9bcb73a6c4dd93f394d942cb261")
      public fun fileSystemConfig(fileSystemConfig: FileSystemConfigProperty.Builder.() -> Unit)

      public fun kernelSpecs(kernelSpecs: IResolvable)

      public fun kernelSpecs(kernelSpecs: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty.builder()

      override fun fileSystemConfig(fileSystemConfig: IResolvable) {
        cdkBuilder.fileSystemConfig(fileSystemConfig.let(IResolvable::unwrap))
      }

      override fun fileSystemConfig(fileSystemConfig: FileSystemConfigProperty) {
        cdkBuilder.fileSystemConfig(fileSystemConfig.let(FileSystemConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28df5b17febe71ee76595a70da8e1da758c6b9bcb73a6c4dd93f394d942cb261")
      override fun fileSystemConfig(fileSystemConfig: FileSystemConfigProperty.Builder.() -> Unit):
          Unit = fileSystemConfig(FileSystemConfigProperty(fileSystemConfig))

      override fun kernelSpecs(kernelSpecs: IResolvable) {
        cdkBuilder.kernelSpecs(kernelSpecs.let(IResolvable::unwrap))
      }

      override fun kernelSpecs(kernelSpecs: List<Any>) {
        cdkBuilder.kernelSpecs(kernelSpecs)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty,
    ) : KernelGatewayImageConfigProperty {
      override fun fileSystemConfig(): Any? = unwrap(this).getFileSystemConfig()

      override fun kernelSpecs(): Any = unwrap(this).getKernelSpecs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KernelGatewayImageConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty):
          KernelGatewayImageConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KernelGatewayImageConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FileSystemConfigProperty {
    public fun defaultGid(): Number? = unwrap(this).getDefaultGid()

    public fun defaultUid(): Number? = unwrap(this).getDefaultUid()

    public fun mountPath(): String? = unwrap(this).getMountPath()

    public interface Builder {
      public fun defaultGid(defaultGid: Number)

      public fun defaultUid(defaultUid: Number)

      public fun mountPath(mountPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.FileSystemConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.FileSystemConfigProperty.builder()

      override fun defaultGid(defaultGid: Number) {
        cdkBuilder.defaultGid(defaultGid)
      }

      override fun defaultUid(defaultUid: Number) {
        cdkBuilder.defaultUid(defaultUid)
      }

      override fun mountPath(mountPath: String) {
        cdkBuilder.mountPath(mountPath)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.FileSystemConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.FileSystemConfigProperty,
    ) : FileSystemConfigProperty {
      override fun defaultGid(): Number? = unwrap(this).getDefaultGid()

      override fun defaultUid(): Number? = unwrap(this).getDefaultUid()

      override fun mountPath(): String? = unwrap(this).getMountPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.FileSystemConfigProperty):
          FileSystemConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileSystemConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.FileSystemConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomImageContainerEnvironmentVariableProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.CustomImageContainerEnvironmentVariableProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.CustomImageContainerEnvironmentVariableProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.CustomImageContainerEnvironmentVariableProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.CustomImageContainerEnvironmentVariableProperty,
    ) : CustomImageContainerEnvironmentVariableProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }
}
