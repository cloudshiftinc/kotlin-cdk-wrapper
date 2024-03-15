@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnImagePipelineProps {
  public fun containerRecipeArn(): String? = unwrap(this).getContainerRecipeArn()

  public fun description(): String? = unwrap(this).getDescription()

  public fun distributionConfigurationArn(): String? =
      unwrap(this).getDistributionConfigurationArn()

  public fun enhancedImageMetadataEnabled(): Any? = unwrap(this).getEnhancedImageMetadataEnabled()

  public fun executionRole(): String? = unwrap(this).getExecutionRole()

  public fun imageRecipeArn(): String? = unwrap(this).getImageRecipeArn()

  public fun imageScanningConfiguration(): Any? = unwrap(this).getImageScanningConfiguration()

  public fun imageTestsConfiguration(): Any? = unwrap(this).getImageTestsConfiguration()

  public fun infrastructureConfigurationArn(): String

  public fun name(): String

  public fun schedule(): Any? = unwrap(this).getSchedule()

  public fun status(): String? = unwrap(this).getStatus()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun workflows(): Any? = unwrap(this).getWorkflows()

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
        fun imageScanningConfiguration(imageScanningConfiguration: CfnImagePipeline.ImageScanningConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01575e6db59a5c41c439638cd1e395d120a8ed816f1694668f6f8068f7226f29")
    public
        fun imageScanningConfiguration(imageScanningConfiguration: CfnImagePipeline.ImageScanningConfigurationProperty.Builder.() -> Unit)

    public fun imageTestsConfiguration(imageTestsConfiguration: IResolvable)

    public
        fun imageTestsConfiguration(imageTestsConfiguration: CfnImagePipeline.ImageTestsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0535aba38d68e141fd6030b5efe1f84a47b1a1c3c5cda46c45fa231cd8272bd9")
    public
        fun imageTestsConfiguration(imageTestsConfiguration: CfnImagePipeline.ImageTestsConfigurationProperty.Builder.() -> Unit)

    public fun infrastructureConfigurationArn(infrastructureConfigurationArn: String)

    public fun name(name: String)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: CfnImagePipeline.ScheduleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c1a93b050f45e235d806569abacad74d044c27e770b80f315e79da2f45ce3e4")
    public fun schedule(schedule: CfnImagePipeline.ScheduleProperty.Builder.() -> Unit)

    public fun status(status: String)

    public fun tags(tags: Map<String, String>)

    public fun workflows(workflows: IResolvable)

    public fun workflows(workflows: List<Any>)

    public fun workflows(vararg workflows: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps.builder()

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
        fun imageScanningConfiguration(imageScanningConfiguration: CfnImagePipeline.ImageScanningConfigurationProperty) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(CfnImagePipeline.ImageScanningConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01575e6db59a5c41c439638cd1e395d120a8ed816f1694668f6f8068f7226f29")
    override
        fun imageScanningConfiguration(imageScanningConfiguration: CfnImagePipeline.ImageScanningConfigurationProperty.Builder.() -> Unit):
        Unit =
        imageScanningConfiguration(CfnImagePipeline.ImageScanningConfigurationProperty(imageScanningConfiguration))

    override fun imageTestsConfiguration(imageTestsConfiguration: IResolvable) {
      cdkBuilder.imageTestsConfiguration(imageTestsConfiguration.let(IResolvable::unwrap))
    }

    override
        fun imageTestsConfiguration(imageTestsConfiguration: CfnImagePipeline.ImageTestsConfigurationProperty) {
      cdkBuilder.imageTestsConfiguration(imageTestsConfiguration.let(CfnImagePipeline.ImageTestsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0535aba38d68e141fd6030b5efe1f84a47b1a1c3c5cda46c45fa231cd8272bd9")
    override
        fun imageTestsConfiguration(imageTestsConfiguration: CfnImagePipeline.ImageTestsConfigurationProperty.Builder.() -> Unit):
        Unit =
        imageTestsConfiguration(CfnImagePipeline.ImageTestsConfigurationProperty(imageTestsConfiguration))

    override fun infrastructureConfigurationArn(infrastructureConfigurationArn: String) {
      cdkBuilder.infrastructureConfigurationArn(infrastructureConfigurationArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: CfnImagePipeline.ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(CfnImagePipeline.ScheduleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c1a93b050f45e235d806569abacad74d044c27e770b80f315e79da2f45ce3e4")
    override fun schedule(schedule: CfnImagePipeline.ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(CfnImagePipeline.ScheduleProperty(schedule))

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

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps,
  ) : CdkObject(cdkObject), CfnImagePipelineProps {
    override fun containerRecipeArn(): String? = unwrap(this).getContainerRecipeArn()

    override fun description(): String? = unwrap(this).getDescription()

    override fun distributionConfigurationArn(): String? =
        unwrap(this).getDistributionConfigurationArn()

    override fun enhancedImageMetadataEnabled(): Any? =
        unwrap(this).getEnhancedImageMetadataEnabled()

    override fun executionRole(): String? = unwrap(this).getExecutionRole()

    override fun imageRecipeArn(): String? = unwrap(this).getImageRecipeArn()

    override fun imageScanningConfiguration(): Any? = unwrap(this).getImageScanningConfiguration()

    override fun imageTestsConfiguration(): Any? = unwrap(this).getImageTestsConfiguration()

    override fun infrastructureConfigurationArn(): String =
        unwrap(this).getInfrastructureConfigurationArn()

    override fun name(): String = unwrap(this).getName()

    override fun schedule(): Any? = unwrap(this).getSchedule()

    override fun status(): String? = unwrap(this).getStatus()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun workflows(): Any? = unwrap(this).getWorkflows()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnImagePipelineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps):
        CfnImagePipelineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnImagePipelineProps):
        software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps
  }
}
