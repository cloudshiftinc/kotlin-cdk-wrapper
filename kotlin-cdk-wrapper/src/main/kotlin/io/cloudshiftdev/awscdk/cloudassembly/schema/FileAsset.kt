@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * A file asset.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * FileAsset fileAsset = FileAsset.builder()
 * .destinations(Map.of(
 * "destinationsKey", FileDestination.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * // the properties below are optional
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .region("region")
 * .build()))
 * .source(FileSource.builder()
 * .executable(List.of("executable"))
 * .packaging(FileAssetPackaging.FILE)
 * .path("path")
 * .build())
 * .build();
 * ```
 */
public interface FileAsset {
  /**
   * Destinations for this file asset.
   */
  public fun destinations(): Map<String, FileDestination>

  /**
   * Source description for file assets.
   */
  public fun source(): FileSource

  /**
   * A builder for [FileAsset]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinations Destinations for this file asset. 
     */
    public fun destinations(destinations: Map<String, FileDestination>)

    /**
     * @param source Source description for file assets. 
     */
    public fun source(source: FileSource)

    /**
     * @param source Source description for file assets. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19d0ad16d7c314e6badf5fb4fef6a0ff156788b27b128f2855b3050ef7bd9afe")
    public fun source(source: FileSource.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.FileAsset.Builder =
        software.amazon.awscdk.cloudassembly.schema.FileAsset.builder()

    /**
     * @param destinations Destinations for this file asset. 
     */
    override fun destinations(destinations: Map<String, FileDestination>) {
      cdkBuilder.destinations(destinations.mapValues{FileDestination.unwrap(it.value)})
    }

    /**
     * @param source Source description for file assets. 
     */
    override fun source(source: FileSource) {
      cdkBuilder.source(source.let(FileSource::unwrap))
    }

    /**
     * @param source Source description for file assets. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19d0ad16d7c314e6badf5fb4fef6a0ff156788b27b128f2855b3050ef7bd9afe")
    override fun source(source: FileSource.Builder.() -> Unit): Unit = source(FileSource(source))

    public fun build(): software.amazon.awscdk.cloudassembly.schema.FileAsset = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.FileAsset,
  ) : CdkObject(cdkObject), FileAsset {
    /**
     * Destinations for this file asset.
     */
    override fun destinations(): Map<String, FileDestination> =
        unwrap(this).getDestinations().mapValues{FileDestination.wrap(it.value)}

    /**
     * Source description for file assets.
     */
    override fun source(): FileSource = unwrap(this).getSource().let(FileSource::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileAsset {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.FileAsset): FileAsset =
        CdkObjectWrappers.wrap(cdkObject) as FileAsset

    internal fun unwrap(wrapped: FileAsset): software.amazon.awscdk.cloudassembly.schema.FileAsset =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.FileAsset
  }
}
