@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnImageRecipeProps {
  public fun additionalInstanceConfiguration(): Any? =
      unwrap(this).getAdditionalInstanceConfiguration()

  public fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

  public fun components(): Any

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun parentImage(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun version(): String

  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  @CdkDslMarker
  public interface Builder {
    public fun additionalInstanceConfiguration(additionalInstanceConfiguration: IResolvable)

    public
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: CfnImageRecipe.AdditionalInstanceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f26861944211ab6ad13358f80277d4d681bfe1107e0fde705d6715f76bb9dc9")
    public
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: CfnImageRecipe.AdditionalInstanceConfigurationProperty.Builder.() -> Unit)

    public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

    public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

    public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

    public fun components(components: IResolvable)

    public fun components(components: List<Any>)

    public fun components(vararg components: Any)

    public fun description(description: String)

    public fun name(name: String)

    public fun parentImage(parentImage: String)

    public fun tags(tags: Map<String, String>)

    public fun version(version: String)

    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps.Builder
        = software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps.builder()

    override fun additionalInstanceConfiguration(additionalInstanceConfiguration: IResolvable) {
      cdkBuilder.additionalInstanceConfiguration(additionalInstanceConfiguration.let(IResolvable::unwrap))
    }

    override
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: CfnImageRecipe.AdditionalInstanceConfigurationProperty) {
      cdkBuilder.additionalInstanceConfiguration(additionalInstanceConfiguration.let(CfnImageRecipe.AdditionalInstanceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f26861944211ab6ad13358f80277d4d681bfe1107e0fde705d6715f76bb9dc9")
    override
        fun additionalInstanceConfiguration(additionalInstanceConfiguration: CfnImageRecipe.AdditionalInstanceConfigurationProperty.Builder.() -> Unit):
        Unit =
        additionalInstanceConfiguration(CfnImageRecipe.AdditionalInstanceConfigurationProperty(additionalInstanceConfiguration))

    override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable::unwrap))
    }

    override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    override fun blockDeviceMappings(vararg blockDeviceMappings: Any): Unit =
        blockDeviceMappings(blockDeviceMappings.toList())

    override fun components(components: IResolvable) {
      cdkBuilder.components(components.let(IResolvable::unwrap))
    }

    override fun components(components: List<Any>) {
      cdkBuilder.components(components)
    }

    override fun components(vararg components: Any): Unit = components(components.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun parentImage(parentImage: String) {
      cdkBuilder.parentImage(parentImage)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps,
  ) : CdkObject(cdkObject), CfnImageRecipeProps {
    override fun additionalInstanceConfiguration(): Any? =
        unwrap(this).getAdditionalInstanceConfiguration()

    override fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

    override fun components(): Any = unwrap(this).getComponents()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun parentImage(): String = unwrap(this).getParentImage()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun version(): String = unwrap(this).getVersion()

    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnImageRecipeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps):
        CfnImageRecipeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnImageRecipeProps):
        software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps
  }
}
