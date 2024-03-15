@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface EcrSourceVariables {
  public fun imageDigest(): String

  public fun imageTag(): String

  public fun imageUri(): String

  public fun registryId(): String

  public fun repositoryName(): String

  @CdkDslMarker
  public interface Builder {
    public fun imageDigest(imageDigest: String)

    public fun imageTag(imageTag: String)

    public fun imageUri(imageUri: String)

    public fun registryId(registryId: String)

    public fun repositoryName(repositoryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables.Builder =
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables.builder()

    override fun imageDigest(imageDigest: String) {
      cdkBuilder.imageDigest(imageDigest)
    }

    override fun imageTag(imageTag: String) {
      cdkBuilder.imageTag(imageTag)
    }

    override fun imageUri(imageUri: String) {
      cdkBuilder.imageUri(imageUri)
    }

    override fun registryId(registryId: String) {
      cdkBuilder.registryId(registryId)
    }

    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables,
  ) : CdkObject(cdkObject), EcrSourceVariables {
    override fun imageDigest(): String = unwrap(this).getImageDigest()

    override fun imageTag(): String = unwrap(this).getImageTag()

    override fun imageUri(): String = unwrap(this).getImageUri()

    override fun registryId(): String = unwrap(this).getRegistryId()

    override fun repositoryName(): String = unwrap(this).getRepositoryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcrSourceVariables {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables):
        EcrSourceVariables = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcrSourceVariables):
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables
  }
}
