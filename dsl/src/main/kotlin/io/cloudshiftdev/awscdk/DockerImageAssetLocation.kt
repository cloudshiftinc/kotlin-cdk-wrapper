package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit

public interface DockerImageAssetLocation {
  public fun imageTag(): String? = unwrap(this).getImageTag()

  public fun imageUri(): String

  public fun repositoryName(): String

  public interface Builder {
    public fun imageTag(imageTag: String) {
    }

    public fun imageUri(imageUri: String) {
    }

    public fun repositoryName(repositoryName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.DockerImageAssetLocation.Builder =
        software.amazon.awscdk.DockerImageAssetLocation.builder()

    public override fun imageTag(imageTag: String) {
      cdkBuilder.imageTag(imageTag)
    }

    public override fun imageUri(imageUri: String) {
      cdkBuilder.imageUri(imageUri)
    }

    public override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): software.amazon.awscdk.DockerImageAssetLocation = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.DockerImageAssetLocation,
  ) : DockerImageAssetLocation {
    public override fun imageTag(): String? = unwrap(this).getImageTag()

    public override fun imageUri(): String = unwrap(this).getImageUri()

    public override fun repositoryName(): String = unwrap(this).getRepositoryName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageAssetLocation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerImageAssetLocation):
        DockerImageAssetLocation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageAssetLocation):
        software.amazon.awscdk.DockerImageAssetLocation = (wrapped as Wrapper).cdkObject
  }
}
