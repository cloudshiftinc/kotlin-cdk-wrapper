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

public interface CfnContainerRecipeProps {
  public fun components(): Any

  public fun containerType(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun dockerfileTemplateData(): String? = unwrap(this).getDockerfileTemplateData()

  public fun dockerfileTemplateUri(): String? = unwrap(this).getDockerfileTemplateUri()

  public fun imageOsVersionOverride(): String? = unwrap(this).getImageOsVersionOverride()

  public fun instanceConfiguration(): Any? = unwrap(this).getInstanceConfiguration()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun name(): String

  public fun parentImage(): String

  public fun platformOverride(): String? = unwrap(this).getPlatformOverride()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun targetRepository(): Any

  public fun version(): String

  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  @CdkDslMarker
  public interface Builder {
    public fun components(components: IResolvable)

    public fun components(components: List<Any>)

    public fun components(vararg components: Any)

    public fun containerType(containerType: String)

    public fun description(description: String)

    public fun dockerfileTemplateData(dockerfileTemplateData: String)

    public fun dockerfileTemplateUri(dockerfileTemplateUri: String)

    public fun imageOsVersionOverride(imageOsVersionOverride: String)

    public fun instanceConfiguration(instanceConfiguration: IResolvable)

    public
        fun instanceConfiguration(instanceConfiguration: CfnContainerRecipe.InstanceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c363443f4c5d190590bb268b8cb166282a592ababc53d05e1f5d8c1003fc34d4")
    public
        fun instanceConfiguration(instanceConfiguration: CfnContainerRecipe.InstanceConfigurationProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun name(name: String)

    public fun parentImage(parentImage: String)

    public fun platformOverride(platformOverride: String)

    public fun tags(tags: Map<String, String>)

    public fun targetRepository(targetRepository: IResolvable)

    public
        fun targetRepository(targetRepository: CfnContainerRecipe.TargetContainerRepositoryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46103ec57bebb1c59f28d3780e9eca353223a04ba2896eb2016694a825a86fa3")
    public
        fun targetRepository(targetRepository: CfnContainerRecipe.TargetContainerRepositoryProperty.Builder.() -> Unit)

    public fun version(version: String)

    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps.builder()

    override fun components(components: IResolvable) {
      cdkBuilder.components(components.let(IResolvable::unwrap))
    }

    override fun components(components: List<Any>) {
      cdkBuilder.components(components)
    }

    override fun components(vararg components: Any): Unit = components(components.toList())

    override fun containerType(containerType: String) {
      cdkBuilder.containerType(containerType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun dockerfileTemplateData(dockerfileTemplateData: String) {
      cdkBuilder.dockerfileTemplateData(dockerfileTemplateData)
    }

    override fun dockerfileTemplateUri(dockerfileTemplateUri: String) {
      cdkBuilder.dockerfileTemplateUri(dockerfileTemplateUri)
    }

    override fun imageOsVersionOverride(imageOsVersionOverride: String) {
      cdkBuilder.imageOsVersionOverride(imageOsVersionOverride)
    }

    override fun instanceConfiguration(instanceConfiguration: IResolvable) {
      cdkBuilder.instanceConfiguration(instanceConfiguration.let(IResolvable::unwrap))
    }

    override
        fun instanceConfiguration(instanceConfiguration: CfnContainerRecipe.InstanceConfigurationProperty) {
      cdkBuilder.instanceConfiguration(instanceConfiguration.let(CfnContainerRecipe.InstanceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c363443f4c5d190590bb268b8cb166282a592ababc53d05e1f5d8c1003fc34d4")
    override
        fun instanceConfiguration(instanceConfiguration: CfnContainerRecipe.InstanceConfigurationProperty.Builder.() -> Unit):
        Unit =
        instanceConfiguration(CfnContainerRecipe.InstanceConfigurationProperty(instanceConfiguration))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun parentImage(parentImage: String) {
      cdkBuilder.parentImage(parentImage)
    }

    override fun platformOverride(platformOverride: String) {
      cdkBuilder.platformOverride(platformOverride)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun targetRepository(targetRepository: IResolvable) {
      cdkBuilder.targetRepository(targetRepository.let(IResolvable::unwrap))
    }

    override
        fun targetRepository(targetRepository: CfnContainerRecipe.TargetContainerRepositoryProperty) {
      cdkBuilder.targetRepository(targetRepository.let(CfnContainerRecipe.TargetContainerRepositoryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46103ec57bebb1c59f28d3780e9eca353223a04ba2896eb2016694a825a86fa3")
    override
        fun targetRepository(targetRepository: CfnContainerRecipe.TargetContainerRepositoryProperty.Builder.() -> Unit):
        Unit =
        targetRepository(CfnContainerRecipe.TargetContainerRepositoryProperty(targetRepository))

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps,
  ) : CdkObject(cdkObject), CfnContainerRecipeProps {
    override fun components(): Any = unwrap(this).getComponents()

    override fun containerType(): String = unwrap(this).getContainerType()

    override fun description(): String? = unwrap(this).getDescription()

    override fun dockerfileTemplateData(): String? = unwrap(this).getDockerfileTemplateData()

    override fun dockerfileTemplateUri(): String? = unwrap(this).getDockerfileTemplateUri()

    override fun imageOsVersionOverride(): String? = unwrap(this).getImageOsVersionOverride()

    override fun instanceConfiguration(): Any? = unwrap(this).getInstanceConfiguration()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun name(): String = unwrap(this).getName()

    override fun parentImage(): String = unwrap(this).getParentImage()

    override fun platformOverride(): String? = unwrap(this).getPlatformOverride()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun targetRepository(): Any = unwrap(this).getTargetRepository()

    override fun version(): String = unwrap(this).getVersion()

    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContainerRecipeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps):
        CfnContainerRecipeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContainerRecipeProps):
        software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps
  }
}
