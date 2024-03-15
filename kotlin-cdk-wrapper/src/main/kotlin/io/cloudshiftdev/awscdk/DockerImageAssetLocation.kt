@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface DockerImageAssetLocation {
  public fun imageTag(): String? = unwrap(this).getImageTag()

  public fun imageUri(): String

  public fun repositoryName(): String

  @CdkDslMarker
  public interface Builder {
    public fun imageTag(imageTag: String)

    public fun imageUri(imageUri: String)

    public fun repositoryName(repositoryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.DockerImageAssetLocation.Builder =
        software.amazon.awscdk.DockerImageAssetLocation.builder()

    override fun imageTag(imageTag: String) {
      cdkBuilder.imageTag(imageTag)
    }

    override fun imageUri(imageUri: String) {
      cdkBuilder.imageUri(imageUri)
    }

    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): software.amazon.awscdk.DockerImageAssetLocation = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.DockerImageAssetLocation,
  ) : CdkObject(cdkObject), DockerImageAssetLocation {
    override fun imageTag(): String? = unwrap(this).getImageTag()

    override fun imageUri(): String = unwrap(this).getImageUri()

    override fun repositoryName(): String = unwrap(this).getRepositoryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageAssetLocation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerImageAssetLocation):
        DockerImageAssetLocation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageAssetLocation):
        software.amazon.awscdk.DockerImageAssetLocation = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.DockerImageAssetLocation
  }
}
