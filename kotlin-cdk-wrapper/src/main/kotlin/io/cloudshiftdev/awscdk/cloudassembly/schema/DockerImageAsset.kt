@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface DockerImageAsset {
  public fun destinations(): Map<String, DockerImageDestination>

  public fun displayName(): String? = unwrap(this).getDisplayName()

  public fun source(): DockerImageSource

  @CdkDslMarker
  public interface Builder {
    public fun destinations(destinations: Map<String, DockerImageDestination>)

    public fun displayName(displayName: String)

    public fun source(source: DockerImageSource)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("756babc8208a90f8ddf71a14f0b4381b6874e4c9ebd4c792ae2c30fd7b04dc62")
    public fun source(source: DockerImageSource.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.DockerImageAsset.Builder =
        software.amazon.awscdk.cloudassembly.schema.DockerImageAsset.builder()

    override fun destinations(destinations: Map<String, DockerImageDestination>) {
      cdkBuilder.destinations(destinations.mapValues{DockerImageDestination.unwrap(it.value)})
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun source(source: DockerImageSource) {
      cdkBuilder.source(source.let(DockerImageSource.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("756babc8208a90f8ddf71a14f0b4381b6874e4c9ebd4c792ae2c30fd7b04dc62")
    override fun source(source: DockerImageSource.Builder.() -> Unit): Unit =
        source(DockerImageSource(source))

    public fun build(): software.amazon.awscdk.cloudassembly.schema.DockerImageAsset =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.DockerImageAsset,
  ) : CdkObject(cdkObject),
      DockerImageAsset {
    override fun destinations(): Map<String, DockerImageDestination> =
        unwrap(this).getDestinations().mapValues{DockerImageDestination.wrap(it.value)}

    override fun displayName(): String? = unwrap(this).getDisplayName()

    override fun source(): DockerImageSource = unwrap(this).getSource().let(DockerImageSource::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageAsset {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.DockerImageAsset):
        DockerImageAsset = CdkObjectWrappers.wrap(cdkObject) as? DockerImageAsset ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageAsset):
        software.amazon.awscdk.cloudassembly.schema.DockerImageAsset = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.DockerImageAsset
  }
}
