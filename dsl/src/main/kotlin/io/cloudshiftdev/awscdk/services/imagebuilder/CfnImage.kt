package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnImage internal constructor(
  private val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImage,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrImageId(): String = unwrap(this).getAttrImageId()

  public open fun attrImageUri(): String = unwrap(this).getAttrImageUri()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun containerRecipeArn(): String? = unwrap(this).getContainerRecipeArn()

  public open fun containerRecipeArn(`value`: String) {
    unwrap(this).setContainerRecipeArn(`value`)
  }

  public open fun distributionConfigurationArn(): String? =
      unwrap(this).getDistributionConfigurationArn()

  public open fun distributionConfigurationArn(`value`: String) {
    unwrap(this).setDistributionConfigurationArn(`value`)
  }

  public open fun enhancedImageMetadataEnabled(): Any? =
      unwrap(this).getEnhancedImageMetadataEnabled()

  public open fun enhancedImageMetadataEnabled(`value`: Boolean) {
    unwrap(this).setEnhancedImageMetadataEnabled(`value`)
  }

  public open fun enhancedImageMetadataEnabled(`value`: IResolvable) {
    unwrap(this).setEnhancedImageMetadataEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun executionRole(): String? = unwrap(this).getExecutionRole()

  public open fun executionRole(`value`: String) {
    unwrap(this).setExecutionRole(`value`)
  }

  public open fun imageRecipeArn(): String? = unwrap(this).getImageRecipeArn()

  public open fun imageRecipeArn(`value`: String) {
    unwrap(this).setImageRecipeArn(`value`)
  }

  public open fun imageScanningConfiguration(): Any? = unwrap(this).getImageScanningConfiguration()

  public open fun imageScanningConfiguration(`value`: IResolvable) {
    unwrap(this).setImageScanningConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun imageScanningConfiguration(`value`: ImageScanningConfigurationProperty) {
    unwrap(this).setImageScanningConfiguration(`value`.let(ImageScanningConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("49c41172dfac75d33b363efc8e73d281e84c30b5574fae2c4f73d3205e79801e")
  public open
      fun imageScanningConfiguration(`value`: ImageScanningConfigurationProperty.Builder.() -> Unit):
      Unit = imageScanningConfiguration(ImageScanningConfigurationProperty(`value`))

  public open fun imageTestsConfiguration(): Any? = unwrap(this).getImageTestsConfiguration()

  public open fun imageTestsConfiguration(`value`: IResolvable) {
    unwrap(this).setImageTestsConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun imageTestsConfiguration(`value`: ImageTestsConfigurationProperty) {
    unwrap(this).setImageTestsConfiguration(`value`.let(ImageTestsConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("37aad46d28eae7e77976ac8dce0989e35a0f8f27d1fcb12181b299cb0ecbbc04")
  public open
      fun imageTestsConfiguration(`value`: ImageTestsConfigurationProperty.Builder.() -> Unit): Unit
      = imageTestsConfiguration(ImageTestsConfigurationProperty(`value`))

  public open fun infrastructureConfigurationArn(): String =
      unwrap(this).getInfrastructureConfigurationArn()

  public open fun infrastructureConfigurationArn(`value`: String) {
    unwrap(this).setInfrastructureConfigurationArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun workflows(): Any? = unwrap(this).getWorkflows()

  public open fun workflows(`value`: IResolvable) {
    unwrap(this).setWorkflows(`value`.let(IResolvable::unwrap))
  }

  public open fun workflows(__idx_ac66f0: List<Any>) {
    unwrap(this).setWorkflows(__idx_ac66f0)
  }

  public open fun workflows(vararg __idx_ac66f0: Any): Unit = workflows(__idx_ac66f0.toList())

  public interface Builder {
    public fun containerRecipeArn(containerRecipeArn: String)

    public fun distributionConfigurationArn(distributionConfigurationArn: String)

    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: Boolean)

    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: IResolvable)

    public fun executionRole(executionRole: String)

    public fun imageRecipeArn(imageRecipeArn: String)

    public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable)

    public
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25ae17270e9cae59300d22e1dd362e82effd3ce24b1844ced919034e09b79aa7")
    public
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty.Builder.() -> Unit)

    public fun imageTestsConfiguration(imageTestsConfiguration: IResolvable)

    public fun imageTestsConfiguration(imageTestsConfiguration: ImageTestsConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7232d3bbdd55fc33682975b8926c2f718b84b7a7d6c04a08c3c7ba49be24769")
    public
        fun imageTestsConfiguration(imageTestsConfiguration: ImageTestsConfigurationProperty.Builder.() -> Unit)

    public fun infrastructureConfigurationArn(infrastructureConfigurationArn: String)

    public fun tags(tags: Map<String, String>)

    public fun workflows(workflows: IResolvable)

    public fun workflows(workflows: List<Any>)

    public fun workflows(vararg workflows: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnImage.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnImage.Builder.create(scope, id)

    override fun containerRecipeArn(containerRecipeArn: String) {
      cdkBuilder.containerRecipeArn(containerRecipeArn)
    }

    override fun distributionConfigurationArn(distributionConfigurationArn: String) {
      cdkBuilder.distributionConfigurationArn(distributionConfigurationArn)
    }

    override fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: Boolean) {
      cdkBuilder.enhancedImageMetadataEnabled(enhancedImageMetadataEnabled)
    }

    override fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: IResolvable) {
      cdkBuilder.enhancedImageMetadataEnabled(enhancedImageMetadataEnabled.let(IResolvable::unwrap))
    }

    override fun executionRole(executionRole: String) {
      cdkBuilder.executionRole(executionRole)
    }

    override fun imageRecipeArn(imageRecipeArn: String) {
      cdkBuilder.imageRecipeArn(imageRecipeArn)
    }

    override fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(IResolvable::unwrap))
    }

    override
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(ImageScanningConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25ae17270e9cae59300d22e1dd362e82effd3ce24b1844ced919034e09b79aa7")
    override
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty.Builder.() -> Unit):
        Unit =
        imageScanningConfiguration(ImageScanningConfigurationProperty(imageScanningConfiguration))

    override fun imageTestsConfiguration(imageTestsConfiguration: IResolvable) {
      cdkBuilder.imageTestsConfiguration(imageTestsConfiguration.let(IResolvable::unwrap))
    }

    override fun imageTestsConfiguration(imageTestsConfiguration: ImageTestsConfigurationProperty) {
      cdkBuilder.imageTestsConfiguration(imageTestsConfiguration.let(ImageTestsConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7232d3bbdd55fc33682975b8926c2f718b84b7a7d6c04a08c3c7ba49be24769")
    override
        fun imageTestsConfiguration(imageTestsConfiguration: ImageTestsConfigurationProperty.Builder.() -> Unit):
        Unit = imageTestsConfiguration(ImageTestsConfigurationProperty(imageTestsConfiguration))

    override fun infrastructureConfigurationArn(infrastructureConfigurationArn: String) {
      cdkBuilder.infrastructureConfigurationArn(infrastructureConfigurationArn)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun workflows(workflows: IResolvable) {
      cdkBuilder.workflows(workflows.let(IResolvable::unwrap))
    }

    override fun workflows(workflows: List<Any>) {
      cdkBuilder.workflows(workflows)
    }

    override fun workflows(vararg workflows: Any): Unit = workflows(workflows.toList())

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnImage = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnImage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImage): CfnImage =
        CfnImage(cdkObject)

    internal fun unwrap(wrapped: CfnImage): software.amazon.awscdk.services.imagebuilder.CfnImage =
        wrapped.cdkObject
  }

  public interface ImageScanningConfigurationProperty {
    public fun ecrConfiguration(): Any? = unwrap(this).getEcrConfiguration()

    public fun imageScanningEnabled(): Any? = unwrap(this).getImageScanningEnabled()

    public interface Builder {
      public fun ecrConfiguration(ecrConfiguration: IResolvable)

      public fun ecrConfiguration(ecrConfiguration: EcrConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91dea047b81973fc82ef0372c3292754cedee37b3f91296710018e95394d6713")
      public fun ecrConfiguration(ecrConfiguration: EcrConfigurationProperty.Builder.() -> Unit)

      public fun imageScanningEnabled(imageScanningEnabled: Boolean)

      public fun imageScanningEnabled(imageScanningEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageScanningConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageScanningConfigurationProperty.builder()

      override fun ecrConfiguration(ecrConfiguration: IResolvable) {
        cdkBuilder.ecrConfiguration(ecrConfiguration.let(IResolvable::unwrap))
      }

      override fun ecrConfiguration(ecrConfiguration: EcrConfigurationProperty) {
        cdkBuilder.ecrConfiguration(ecrConfiguration.let(EcrConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91dea047b81973fc82ef0372c3292754cedee37b3f91296710018e95394d6713")
      override fun ecrConfiguration(ecrConfiguration: EcrConfigurationProperty.Builder.() -> Unit):
          Unit = ecrConfiguration(EcrConfigurationProperty(ecrConfiguration))

      override fun imageScanningEnabled(imageScanningEnabled: Boolean) {
        cdkBuilder.imageScanningEnabled(imageScanningEnabled)
      }

      override fun imageScanningEnabled(imageScanningEnabled: IResolvable) {
        cdkBuilder.imageScanningEnabled(imageScanningEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageScanningConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageScanningConfigurationProperty,
    ) : ImageScanningConfigurationProperty {
      override fun ecrConfiguration(): Any? = unwrap(this).getEcrConfiguration()

      override fun imageScanningEnabled(): Any? = unwrap(this).getImageScanningEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ImageScanningConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImage.ImageScanningConfigurationProperty):
          ImageScanningConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageScanningConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageScanningConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface WorkflowParameterProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): List<String> = unwrap(this).getValue() ?: emptyList()

    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: List<String>)

      public fun `value`(vararg `value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowParameterProperty.Builder =
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowParameterProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: List<String>) {
        cdkBuilder.`value`(`value`)
      }

      override fun `value`(vararg `value`: String): Unit = `value`(`value`.toList())

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowParameterProperty,
    ) : WorkflowParameterProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun `value`(): List<String> = unwrap(this).getValue() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowParameterProperty):
          WorkflowParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowParameterProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowParameterProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EcrConfigurationProperty {
    public fun containerTags(): List<String> = unwrap(this).getContainerTags() ?: emptyList()

    public fun repositoryName(): String? = unwrap(this).getRepositoryName()

    public interface Builder {
      public fun containerTags(containerTags: List<String>)

      public fun containerTags(vararg containerTags: String)

      public fun repositoryName(repositoryName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImage.EcrConfigurationProperty.Builder =
          software.amazon.awscdk.services.imagebuilder.CfnImage.EcrConfigurationProperty.builder()

      override fun containerTags(containerTags: List<String>) {
        cdkBuilder.containerTags(containerTags)
      }

      override fun containerTags(vararg containerTags: String): Unit =
          containerTags(containerTags.toList())

      override fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImage.EcrConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImage.EcrConfigurationProperty,
    ) : EcrConfigurationProperty {
      override fun containerTags(): List<String> = unwrap(this).getContainerTags() ?: emptyList()

      override fun repositoryName(): String? = unwrap(this).getRepositoryName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EcrConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImage.EcrConfigurationProperty):
          EcrConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcrConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImage.EcrConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface WorkflowConfigurationProperty {
    public fun onFailure(): String? = unwrap(this).getOnFailure()

    public fun parallelGroup(): String? = unwrap(this).getParallelGroup()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun workflowArn(): String? = unwrap(this).getWorkflowArn()

    public interface Builder {
      public fun onFailure(onFailure: String)

      public fun parallelGroup(parallelGroup: String)

      public fun parameters(parameters: IResolvable)

      public fun parameters(parameters: List<Any>)

      public fun parameters(vararg parameters: Any)

      public fun workflowArn(workflowArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowConfigurationProperty.builder()

      override fun onFailure(onFailure: String) {
        cdkBuilder.onFailure(onFailure)
      }

      override fun parallelGroup(parallelGroup: String) {
        cdkBuilder.parallelGroup(parallelGroup)
      }

      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      override fun parameters(parameters: List<Any>) {
        cdkBuilder.parameters(parameters)
      }

      override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

      override fun workflowArn(workflowArn: String) {
        cdkBuilder.workflowArn(workflowArn)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowConfigurationProperty,
    ) : WorkflowConfigurationProperty {
      override fun onFailure(): String? = unwrap(this).getOnFailure()

      override fun parallelGroup(): String? = unwrap(this).getParallelGroup()

      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun workflowArn(): String? = unwrap(this).getWorkflowArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowConfigurationProperty):
          WorkflowConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ImageTestsConfigurationProperty {
    public fun imageTestsEnabled(): Any? = unwrap(this).getImageTestsEnabled()

    public fun timeoutMinutes(): Number? = unwrap(this).getTimeoutMinutes()

    public interface Builder {
      public fun imageTestsEnabled(imageTestsEnabled: Boolean)

      public fun imageTestsEnabled(imageTestsEnabled: IResolvable)

      public fun timeoutMinutes(timeoutMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty.builder()

      override fun imageTestsEnabled(imageTestsEnabled: Boolean) {
        cdkBuilder.imageTestsEnabled(imageTestsEnabled)
      }

      override fun imageTestsEnabled(imageTestsEnabled: IResolvable) {
        cdkBuilder.imageTestsEnabled(imageTestsEnabled.let(IResolvable::unwrap))
      }

      override fun timeoutMinutes(timeoutMinutes: Number) {
        cdkBuilder.timeoutMinutes(timeoutMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty,
    ) : ImageTestsConfigurationProperty {
      override fun imageTestsEnabled(): Any? = unwrap(this).getImageTestsEnabled()

      override fun timeoutMinutes(): Number? = unwrap(this).getTimeoutMinutes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ImageTestsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty):
          ImageTestsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageTestsConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
