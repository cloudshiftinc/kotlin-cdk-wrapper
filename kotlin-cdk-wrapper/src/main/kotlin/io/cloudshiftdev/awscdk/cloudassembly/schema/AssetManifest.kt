@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface AssetManifest {
  public fun dockerImages(): Map<String, DockerImageAsset> =
      unwrap(this).getDockerImages()?.mapValues{DockerImageAsset.wrap(it.value)} ?: emptyMap()

  public fun files(): Map<String, FileAsset> =
      unwrap(this).getFiles()?.mapValues{FileAsset.wrap(it.value)} ?: emptyMap()

  public fun version(): String

  @CdkDslMarker
  public interface Builder {
    public fun dockerImages(dockerImages: Map<String, DockerImageAsset>)

    public fun files(files: Map<String, FileAsset>)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.AssetManifest.Builder =
        software.amazon.awscdk.cloudassembly.schema.AssetManifest.builder()

    override fun dockerImages(dockerImages: Map<String, DockerImageAsset>) {
      cdkBuilder.dockerImages(dockerImages.mapValues{DockerImageAsset.unwrap(it.value)})
    }

    override fun files(files: Map<String, FileAsset>) {
      cdkBuilder.files(files.mapValues{FileAsset.unwrap(it.value)})
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AssetManifest =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.AssetManifest,
  ) : CdkObject(cdkObject),
      AssetManifest {
    override fun dockerImages(): Map<String, DockerImageAsset> =
        unwrap(this).getDockerImages()?.mapValues{DockerImageAsset.wrap(it.value)} ?: emptyMap()

    override fun files(): Map<String, FileAsset> =
        unwrap(this).getFiles()?.mapValues{FileAsset.wrap(it.value)} ?: emptyMap()

    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AssetManifest {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AssetManifest):
        AssetManifest = CdkObjectWrappers.wrap(cdkObject) as? AssetManifest ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetManifest):
        software.amazon.awscdk.cloudassembly.schema.AssetManifest = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cloudassembly.schema.AssetManifest
  }
}
