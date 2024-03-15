@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnImagePipeline internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun containerRecipeArn(): String? = unwrap(this).getContainerRecipeArn()

  public open fun containerRecipeArn(`value`: String) {
    unwrap(this).setContainerRecipeArn(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d1dc9480574129aeb5d80a0e2644b4b55f20d7cd6c68c602eec5d23d30c3a3f2")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("73ee540abca0bb1ad2253bdcae1b1edad10620b129dd0026bab7f13eaee7fdc5")
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

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun schedule(): Any? = unwrap(this).getSchedule()

  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable::unwrap))
  }

  public open fun schedule(`value`: ScheduleProperty) {
    unwrap(this).setSchedule(`value`.let(ScheduleProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45c64fb42d4a83f601dde9d46e4b6909ac486cf84150a1ac3cecf0ef045a1624")
  public open fun schedule(`value`: ScheduleProperty.Builder.() -> Unit): Unit =
      schedule(ScheduleProperty(`value`))

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
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

  @CdkDslMarker
  public interface Builder {
    public fun containerRecipeArn(containerRecipeArn: String)

    public fun description(description: String)

    public fun distributionConfigurationArn(distributionConfigurationArn: String)

    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: Boolean)

    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: IResolvable)

    public fun executionRole(executionRole: String)

    public fun imageRecipeArn(imageRecipeArn: String)

    public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable)

    public
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11442dfdc4183acd29e5f0fccdd4e704774642ac47dfbfec821b7c2dfd34783f")
    public
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty.Builder.() -> Unit)

    public fun imageTestsConfiguration(imageTestsConfiguration: IResolvable)

    public fun imageTestsConfiguration(imageTestsConfiguration: ImageTestsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f06bc5e0172e4692aaf1f8e8fb4491d0621c4914b86ffb88b48fbaeed88d373")
    public
        fun imageTestsConfiguration(imageTestsConfiguration: ImageTestsConfigurationProperty.Builder.() -> Unit)

    public fun infrastructureConfigurationArn(infrastructureConfigurationArn: String)

    public fun name(name: String)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: ScheduleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("550c02478abf4b076ba196d92ce7c38ea5f12a9dc60f9c8ff990319790c07569")
    public fun schedule(schedule: ScheduleProperty.Builder.() -> Unit)

    public fun status(status: String)

    public fun tags(tags: Map<String, String>)

    public fun workflows(workflows: IResolvable)

    public fun workflows(workflows: List<Any>)

    public fun workflows(vararg workflows: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.Builder.create(scope, id)

    override fun containerRecipeArn(containerRecipeArn: String) {
      cdkBuilder.containerRecipeArn(containerRecipeArn)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11442dfdc4183acd29e5f0fccdd4e704774642ac47dfbfec821b7c2dfd34783f")
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f06bc5e0172e4692aaf1f8e8fb4491d0621c4914b86ffb88b48fbaeed88d373")
    override
        fun imageTestsConfiguration(imageTestsConfiguration: ImageTestsConfigurationProperty.Builder.() -> Unit):
        Unit = imageTestsConfiguration(ImageTestsConfigurationProperty(imageTestsConfiguration))

    override fun infrastructureConfigurationArn(infrastructureConfigurationArn: String) {
      cdkBuilder.infrastructureConfigurationArn(infrastructureConfigurationArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(ScheduleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("550c02478abf4b076ba196d92ce7c38ea5f12a9dc60f9c8ff990319790c07569")
    override fun schedule(schedule: ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(ScheduleProperty(schedule))

    override fun status(status: String) {
      cdkBuilder.status(status)
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

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnImagePipeline =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnImagePipeline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnImagePipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline):
        CfnImagePipeline = CfnImagePipeline(cdkObject)

    internal fun unwrap(wrapped: CfnImagePipeline):
        software.amazon.awscdk.services.imagebuilder.CfnImagePipeline = wrapped.cdkObject
  }

  public interface WorkflowParameterProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): List<String> = unwrap(this).getValue() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: List<String>)

      public fun `value`(vararg `value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowParameterProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowParameterProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: List<String>) {
        cdkBuilder.`value`(`value`)
      }

      override fun `value`(vararg `value`: String): Unit = `value`(`value`.toList())

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowParameterProperty,
    ) : CdkObject(cdkObject), WorkflowParameterProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun `value`(): List<String> = unwrap(this).getValue() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowParameterProperty):
          WorkflowParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowParameterProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowParameterProperty
    }
  }

  public interface WorkflowConfigurationProperty {
    public fun onFailure(): String? = unwrap(this).getOnFailure()

    public fun parallelGroup(): String? = unwrap(this).getParallelGroup()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun workflowArn(): String? = unwrap(this).getWorkflowArn()

    @CdkDslMarker
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
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowConfigurationProperty.builder()

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
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowConfigurationProperty,
    ) : CdkObject(cdkObject), WorkflowConfigurationProperty {
      override fun onFailure(): String? = unwrap(this).getOnFailure()

      override fun parallelGroup(): String? = unwrap(this).getParallelGroup()

      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun workflowArn(): String? = unwrap(this).getWorkflowArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowConfigurationProperty):
          WorkflowConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowConfigurationProperty
    }
  }

  public interface ImageTestsConfigurationProperty {
    public fun imageTestsEnabled(): Any? = unwrap(this).getImageTestsEnabled()

    public fun timeoutMinutes(): Number? = unwrap(this).getTimeoutMinutes()

    @CdkDslMarker
    public interface Builder {
      public fun imageTestsEnabled(imageTestsEnabled: Boolean)

      public fun imageTestsEnabled(imageTestsEnabled: IResolvable)

      public fun timeoutMinutes(timeoutMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty.builder()

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
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty,
    ) : CdkObject(cdkObject), ImageTestsConfigurationProperty {
      override fun imageTestsEnabled(): Any? = unwrap(this).getImageTestsEnabled()

      override fun timeoutMinutes(): Number? = unwrap(this).getTimeoutMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ImageTestsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty):
          ImageTestsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageTestsConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty
    }
  }

  public interface EcrConfigurationProperty {
    public fun containerTags(): List<String> = unwrap(this).getContainerTags() ?: emptyList()

    public fun repositoryName(): String? = unwrap(this).getRepositoryName()

    @CdkDslMarker
    public interface Builder {
      public fun containerTags(containerTags: List<String>)

      public fun containerTags(vararg containerTags: String)

      public fun repositoryName(repositoryName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.EcrConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.EcrConfigurationProperty.builder()

      override fun containerTags(containerTags: List<String>) {
        cdkBuilder.containerTags(containerTags)
      }

      override fun containerTags(vararg containerTags: String): Unit =
          containerTags(containerTags.toList())

      override fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.EcrConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.EcrConfigurationProperty,
    ) : CdkObject(cdkObject), EcrConfigurationProperty {
      override fun containerTags(): List<String> = unwrap(this).getContainerTags() ?: emptyList()

      override fun repositoryName(): String? = unwrap(this).getRepositoryName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcrConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.EcrConfigurationProperty):
          EcrConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcrConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.EcrConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.EcrConfigurationProperty
    }
  }

  public interface ScheduleProperty {
    public fun pipelineExecutionStartCondition(): String? =
        unwrap(this).getPipelineExecutionStartCondition()

    public fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

    @CdkDslMarker
    public interface Builder {
      public fun pipelineExecutionStartCondition(pipelineExecutionStartCondition: String)

      public fun scheduleExpression(scheduleExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty.Builder =
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty.builder()

      override fun pipelineExecutionStartCondition(pipelineExecutionStartCondition: String) {
        cdkBuilder.pipelineExecutionStartCondition(pipelineExecutionStartCondition)
      }

      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty,
    ) : CdkObject(cdkObject), ScheduleProperty {
      override fun pipelineExecutionStartCondition(): String? =
          unwrap(this).getPipelineExecutionStartCondition()

      override fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty):
          ScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty
    }
  }

  public interface ImageScanningConfigurationProperty {
    public fun ecrConfiguration(): Any? = unwrap(this).getEcrConfiguration()

    public fun imageScanningEnabled(): Any? = unwrap(this).getImageScanningEnabled()

    @CdkDslMarker
    public interface Builder {
      public fun ecrConfiguration(ecrConfiguration: IResolvable)

      public fun ecrConfiguration(ecrConfiguration: EcrConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a59d1a658ca357e27cecfc747c2a97b351b22f1eebc075e1fcf2258b78a0a8bd")
      public fun ecrConfiguration(ecrConfiguration: EcrConfigurationProperty.Builder.() -> Unit)

      public fun imageScanningEnabled(imageScanningEnabled: Boolean)

      public fun imageScanningEnabled(imageScanningEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageScanningConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageScanningConfigurationProperty.builder()

      override fun ecrConfiguration(ecrConfiguration: IResolvable) {
        cdkBuilder.ecrConfiguration(ecrConfiguration.let(IResolvable::unwrap))
      }

      override fun ecrConfiguration(ecrConfiguration: EcrConfigurationProperty) {
        cdkBuilder.ecrConfiguration(ecrConfiguration.let(EcrConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a59d1a658ca357e27cecfc747c2a97b351b22f1eebc075e1fcf2258b78a0a8bd")
      override fun ecrConfiguration(ecrConfiguration: EcrConfigurationProperty.Builder.() -> Unit):
          Unit = ecrConfiguration(EcrConfigurationProperty(ecrConfiguration))

      override fun imageScanningEnabled(imageScanningEnabled: Boolean) {
        cdkBuilder.imageScanningEnabled(imageScanningEnabled)
      }

      override fun imageScanningEnabled(imageScanningEnabled: IResolvable) {
        cdkBuilder.imageScanningEnabled(imageScanningEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageScanningConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageScanningConfigurationProperty,
    ) : CdkObject(cdkObject), ImageScanningConfigurationProperty {
      override fun ecrConfiguration(): Any? = unwrap(this).getEcrConfiguration()

      override fun imageScanningEnabled(): Any? = unwrap(this).getImageScanningEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ImageScanningConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageScanningConfigurationProperty):
          ImageScanningConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageScanningConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageScanningConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageScanningConfigurationProperty
    }
  }
}
