@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface FileAsset {
  public fun destinations(): Map<String, FileDestination>

  public fun source(): FileSource

  @CdkDslMarker
  public interface Builder {
    public fun destinations(destinations: Map<String, FileDestination>)

    public fun source(source: FileSource)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19d0ad16d7c314e6badf5fb4fef6a0ff156788b27b128f2855b3050ef7bd9afe")
    public fun source(source: FileSource.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.FileAsset.Builder =
        software.amazon.awscdk.cloudassembly.schema.FileAsset.builder()

    override fun destinations(destinations: Map<String, FileDestination>) {
      cdkBuilder.destinations(destinations.mapValues{FileDestination.unwrap(it.value)})
    }

    override fun source(source: FileSource) {
      cdkBuilder.source(source.let(FileSource.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19d0ad16d7c314e6badf5fb4fef6a0ff156788b27b128f2855b3050ef7bd9afe")
    override fun source(source: FileSource.Builder.() -> Unit): Unit = source(FileSource(source))

    public fun build(): software.amazon.awscdk.cloudassembly.schema.FileAsset = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.FileAsset,
  ) : CdkObject(cdkObject),
      FileAsset {
    override fun destinations(): Map<String, FileDestination> =
        unwrap(this).getDestinations().mapValues{FileDestination.wrap(it.value)}

    override fun source(): FileSource = unwrap(this).getSource().let(FileSource::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileAsset {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.FileAsset): FileAsset =
        CdkObjectWrappers.wrap(cdkObject) as? FileAsset ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileAsset): software.amazon.awscdk.cloudassembly.schema.FileAsset =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.FileAsset
  }
}
