@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CustomActionRegistrationProps {
  public fun actionProperties(): List<CustomActionProperty> =
      unwrap(this).getActionProperties()?.map(CustomActionProperty::wrap) ?: emptyList()

  public fun artifactBounds(): ActionArtifactBounds

  public fun category(): ActionCategory

  public fun entityUrl(): String? = unwrap(this).getEntityUrl()

  public fun executionUrl(): String? = unwrap(this).getExecutionUrl()

  public fun provider(): String

  public fun version(): String? = unwrap(this).getVersion()

  @CdkDslMarker
  public interface Builder {
    public fun actionProperties(actionProperties: List<CustomActionProperty>)

    public fun actionProperties(vararg actionProperties: CustomActionProperty)

    public fun artifactBounds(artifactBounds: ActionArtifactBounds)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98cc6e48805fc09c222ac522a91a39441dd181481079a4e58818fcb7d2600eee")
    public fun artifactBounds(artifactBounds: ActionArtifactBounds.Builder.() -> Unit)

    public fun category(category: ActionCategory)

    public fun entityUrl(entityUrl: String)

    public fun executionUrl(executionUrl: String)

    public fun provider(provider: String)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps.Builder =
        software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps.builder()

    override fun actionProperties(actionProperties: List<CustomActionProperty>) {
      cdkBuilder.actionProperties(actionProperties.map(CustomActionProperty::unwrap))
    }

    override fun actionProperties(vararg actionProperties: CustomActionProperty): Unit =
        actionProperties(actionProperties.toList())

    override fun artifactBounds(artifactBounds: ActionArtifactBounds) {
      cdkBuilder.artifactBounds(artifactBounds.let(ActionArtifactBounds::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98cc6e48805fc09c222ac522a91a39441dd181481079a4e58818fcb7d2600eee")
    override fun artifactBounds(artifactBounds: ActionArtifactBounds.Builder.() -> Unit): Unit =
        artifactBounds(ActionArtifactBounds(artifactBounds))

    override fun category(category: ActionCategory) {
      cdkBuilder.category(category.let(ActionCategory::unwrap))
    }

    override fun entityUrl(entityUrl: String) {
      cdkBuilder.entityUrl(entityUrl)
    }

    override fun executionUrl(executionUrl: String) {
      cdkBuilder.executionUrl(executionUrl)
    }

    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps,
  ) : CdkObject(cdkObject), CustomActionRegistrationProps {
    override fun actionProperties(): List<CustomActionProperty> =
        unwrap(this).getActionProperties()?.map(CustomActionProperty::wrap) ?: emptyList()

    override fun artifactBounds(): ActionArtifactBounds =
        unwrap(this).getArtifactBounds().let(ActionArtifactBounds::wrap)

    override fun category(): ActionCategory = unwrap(this).getCategory().let(ActionCategory::wrap)

    override fun entityUrl(): String? = unwrap(this).getEntityUrl()

    override fun executionUrl(): String? = unwrap(this).getExecutionUrl()

    override fun provider(): String = unwrap(this).getProvider()

    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomActionRegistrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps):
        CustomActionRegistrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomActionRegistrationProps):
        software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps
  }
}
