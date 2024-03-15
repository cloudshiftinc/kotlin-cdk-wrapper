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

public interface CfnImageProps {
  public fun containerRecipeArn(): String? = unwrap(this).getContainerRecipeArn()

  public fun distributionConfigurationArn(): String? =
      unwrap(this).getDistributionConfigurationArn()

  public fun enhancedImageMetadataEnabled(): Any? = unwrap(this).getEnhancedImageMetadataEnabled()

  public fun executionRole(): String? = unwrap(this).getExecutionRole()

  public fun imageRecipeArn(): String? = unwrap(this).getImageRecipeArn()

  public fun imageScanningConfiguration(): Any? = unwrap(this).getImageScanningConfiguration()

  public fun imageTestsConfiguration(): Any? = unwrap(this).getImageTestsConfiguration()

  public fun infrastructureConfigurationArn(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun workflows(): Any? = unwrap(this).getWorkflows()

  @CdkDslMarker
  public interface Builder {
    public fun containerRecipeArn(containerRecipeArn: String)

    public fun distributionConfigurationArn(distributionConfigurationArn: String)

    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: Boolean)

    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: IResolvable)

    public fun executionRole(executionRole: String)

    public fun imageRecipeArn(imageRecipeArn: String)

    public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable)

    public
        fun imageScanningConfiguration(imageScanningConfiguration: CfnImage.ImageScanningConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a724bb4c00e7637af5d3dc480b2b555d359df5624afb5f22b61ec1ac4ab683f7")
    public
        fun imageScanningConfiguration(imageScanningConfiguration: CfnImage.ImageScanningConfigurationProperty.Builder.() -> Unit)

    public fun imageTestsConfiguration(imageTestsConfiguration: IResolvable)

    public
        fun imageTestsConfiguration(imageTestsConfiguration: CfnImage.ImageTestsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("941d7516ffaaa630c5054110e10d0ea7d989a4a4195c65b6a3bcddbe2af78d03")
    public
        fun imageTestsConfiguration(imageTestsConfiguration: CfnImage.ImageTestsConfigurationProperty.Builder.() -> Unit)

    public fun infrastructureConfigurationArn(infrastructureConfigurationArn: String)

    public fun tags(tags: Map<String, String>)

    public fun workflows(workflows: IResolvable)

    public fun workflows(workflows: List<Any>)

    public fun workflows(vararg workflows: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnImageProps.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnImageProps.builder()

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
        fun imageScanningConfiguration(imageScanningConfiguration: CfnImage.ImageScanningConfigurationProperty) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(CfnImage.ImageScanningConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a724bb4c00e7637af5d3dc480b2b555d359df5624afb5f22b61ec1ac4ab683f7")
    override
        fun imageScanningConfiguration(imageScanningConfiguration: CfnImage.ImageScanningConfigurationProperty.Builder.() -> Unit):
        Unit =
        imageScanningConfiguration(CfnImage.ImageScanningConfigurationProperty(imageScanningConfiguration))

    override fun imageTestsConfiguration(imageTestsConfiguration: IResolvable) {
      cdkBuilder.imageTestsConfiguration(imageTestsConfiguration.let(IResolvable::unwrap))
    }

    override
        fun imageTestsConfiguration(imageTestsConfiguration: CfnImage.ImageTestsConfigurationProperty) {
      cdkBuilder.imageTestsConfiguration(imageTestsConfiguration.let(CfnImage.ImageTestsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("941d7516ffaaa630c5054110e10d0ea7d989a4a4195c65b6a3bcddbe2af78d03")
    override
        fun imageTestsConfiguration(imageTestsConfiguration: CfnImage.ImageTestsConfigurationProperty.Builder.() -> Unit):
        Unit =
        imageTestsConfiguration(CfnImage.ImageTestsConfigurationProperty(imageTestsConfiguration))

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

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageProps,
  ) : CdkObject(cdkObject), CfnImageProps {
    override fun containerRecipeArn(): String? = unwrap(this).getContainerRecipeArn()

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

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun workflows(): Any? = unwrap(this).getWorkflows()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageProps):
        CfnImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnImageProps):
        software.amazon.awscdk.services.imagebuilder.CfnImageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.imagebuilder.CfnImageProps
  }
}
