@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCustomActionTypeProps {
  public fun category(): String

  public fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

  public fun inputArtifactDetails(): Any

  public fun outputArtifactDetails(): Any

  public fun provider(): String

  public fun settings(): Any? = unwrap(this).getSettings()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun version(): String

  @CdkDslMarker
  public interface Builder {
    public fun category(category: String)

    public fun configurationProperties(configurationProperties: IResolvable)

    public fun configurationProperties(configurationProperties: List<Any>)

    public fun configurationProperties(vararg configurationProperties: Any)

    public fun inputArtifactDetails(inputArtifactDetails: IResolvable)

    public
        fun inputArtifactDetails(inputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96f84e8cf236d8310af7ea8f4b3b2b68a9416a764f898131998f1424385f6219")
    public
        fun inputArtifactDetails(inputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty.Builder.() -> Unit)

    public fun outputArtifactDetails(outputArtifactDetails: IResolvable)

    public
        fun outputArtifactDetails(outputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef1b8dd7bd6bf87a1c00cb7572423f40f49007c3e3fdb96fc02bd89462e1844c")
    public
        fun outputArtifactDetails(outputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty.Builder.() -> Unit)

    public fun provider(provider: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tings(settings: IResolvable)

    public fun tings(settings: CfnCustomActionType.SettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5dad734a778bd8f7c0451e773d7159ec6f4e3d028fe71958bfd43ec648fb9d3")
    public fun tings(settings: CfnCustomActionType.SettingsProperty.Builder.() -> Unit)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder =
        software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.builder()

    override fun category(category: String) {
      cdkBuilder.category(category)
    }

    override fun configurationProperties(configurationProperties: IResolvable) {
      cdkBuilder.configurationProperties(configurationProperties.let(IResolvable::unwrap))
    }

    override fun configurationProperties(configurationProperties: List<Any>) {
      cdkBuilder.configurationProperties(configurationProperties)
    }

    override fun configurationProperties(vararg configurationProperties: Any): Unit =
        configurationProperties(configurationProperties.toList())

    override fun inputArtifactDetails(inputArtifactDetails: IResolvable) {
      cdkBuilder.inputArtifactDetails(inputArtifactDetails.let(IResolvable::unwrap))
    }

    override
        fun inputArtifactDetails(inputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty) {
      cdkBuilder.inputArtifactDetails(inputArtifactDetails.let(CfnCustomActionType.ArtifactDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96f84e8cf236d8310af7ea8f4b3b2b68a9416a764f898131998f1424385f6219")
    override
        fun inputArtifactDetails(inputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty.Builder.() -> Unit):
        Unit =
        inputArtifactDetails(CfnCustomActionType.ArtifactDetailsProperty(inputArtifactDetails))

    override fun outputArtifactDetails(outputArtifactDetails: IResolvable) {
      cdkBuilder.outputArtifactDetails(outputArtifactDetails.let(IResolvable::unwrap))
    }

    override
        fun outputArtifactDetails(outputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty) {
      cdkBuilder.outputArtifactDetails(outputArtifactDetails.let(CfnCustomActionType.ArtifactDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef1b8dd7bd6bf87a1c00cb7572423f40f49007c3e3fdb96fc02bd89462e1844c")
    override
        fun outputArtifactDetails(outputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty.Builder.() -> Unit):
        Unit =
        outputArtifactDetails(CfnCustomActionType.ArtifactDetailsProperty(outputArtifactDetails))

    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun tings(settings: IResolvable) {
      cdkBuilder.settings(settings.let(IResolvable::unwrap))
    }

    override fun tings(settings: CfnCustomActionType.SettingsProperty) {
      cdkBuilder.settings(settings.let(CfnCustomActionType.SettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5dad734a778bd8f7c0451e773d7159ec6f4e3d028fe71958bfd43ec648fb9d3")
    override fun tings(settings: CfnCustomActionType.SettingsProperty.Builder.() -> Unit): Unit =
        tings(CfnCustomActionType.SettingsProperty(settings))

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps,
  ) : CdkObject(cdkObject), CfnCustomActionTypeProps {
    override fun category(): String = unwrap(this).getCategory()

    override fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

    override fun inputArtifactDetails(): Any = unwrap(this).getInputArtifactDetails()

    override fun outputArtifactDetails(): Any = unwrap(this).getOutputArtifactDetails()

    override fun provider(): String = unwrap(this).getProvider()

    override fun settings(): Any? = unwrap(this).getSettings()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomActionTypeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps):
        CfnCustomActionTypeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomActionTypeProps):
        software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps
  }
}
