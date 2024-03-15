@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CustomActionRegistration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.CustomActionRegistration,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun actionProperties(actionProperties: List<CustomActionProperty>)

    public fun actionProperties(vararg actionProperties: CustomActionProperty)

    public fun artifactBounds(artifactBounds: ActionArtifactBounds)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc269e49c8c05daaa3d41a643e5cf8f4e67fcf2394cf1e8ea218553bb25d9f4d")
    public fun artifactBounds(artifactBounds: ActionArtifactBounds.Builder.() -> Unit)

    public fun category(category: ActionCategory)

    public fun entityUrl(entityUrl: String)

    public fun executionUrl(executionUrl: String)

    public fun provider(provider: String)

    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.CustomActionRegistration.Builder =
        software.amazon.awscdk.services.codepipeline.CustomActionRegistration.Builder.create(scope,
        id)

    override fun actionProperties(actionProperties: List<CustomActionProperty>) {
      cdkBuilder.actionProperties(actionProperties.map(CustomActionProperty::unwrap))
    }

    override fun actionProperties(vararg actionProperties: CustomActionProperty): Unit =
        actionProperties(actionProperties.toList())

    override fun artifactBounds(artifactBounds: ActionArtifactBounds) {
      cdkBuilder.artifactBounds(artifactBounds.let(ActionArtifactBounds::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc269e49c8c05daaa3d41a643e5cf8f4e67fcf2394cf1e8ea218553bb25d9f4d")
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

    public fun build(): software.amazon.awscdk.services.codepipeline.CustomActionRegistration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CustomActionRegistration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CustomActionRegistration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CustomActionRegistration):
        CustomActionRegistration = CustomActionRegistration(cdkObject)

    internal fun unwrap(wrapped: CustomActionRegistration):
        software.amazon.awscdk.services.codepipeline.CustomActionRegistration = wrapped.cdkObject
  }
}
