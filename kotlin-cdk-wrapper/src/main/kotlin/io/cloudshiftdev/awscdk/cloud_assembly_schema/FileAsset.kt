@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

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
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * Object assumeRoleAdditionalOptions;
 * FileAsset fileAsset = FileAsset.builder()
 * .destinations(Map.of(
 * "destinationsKey", FileDestination.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .region("region")
 * .build()))
 * .source(FileSource.builder()
 * .executable(List.of("executable"))
 * .packaging(FileAssetPackaging.FILE)
 * .path("path")
 * .build())
 * // the properties below are optional
 * .displayName("displayName")
 * .build();
 * ```
 */
public interface FileAsset {
  /**
   * Destinations for this file asset.
   */
  public fun destinations(): Map<String, FileDestination>

  /**
   * A display name for this asset.
   *
   * Default: - The identifier will be used as the display name
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

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
     * @param displayName A display name for this asset.
     */
    public fun displayName(displayName: String)

    /**
     * @param source Source description for file assets. 
     */
    public fun source(source: FileSource)

    /**
     * @param source Source description for file assets. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b90eed0812c8402390ad71c61f4a9fc46bde0597a6d2a4278da7cb3c6b912434")
    public fun source(source: FileSource.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.FileAsset.Builder =
        software.amazon.awscdk.cloud_assembly_schema.FileAsset.builder()

    /**
     * @param destinations Destinations for this file asset. 
     */
    override fun destinations(destinations: Map<String, FileDestination>) {
      cdkBuilder.destinations(destinations.mapValues{FileDestination.unwrap(it.value)})
    }

    /**
     * @param displayName A display name for this asset.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param source Source description for file assets. 
     */
    override fun source(source: FileSource) {
      cdkBuilder.source(source.let(FileSource.Companion::unwrap))
    }

    /**
     * @param source Source description for file assets. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b90eed0812c8402390ad71c61f4a9fc46bde0597a6d2a4278da7cb3c6b912434")
    override fun source(source: FileSource.Builder.() -> Unit): Unit = source(FileSource(source))

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.FileAsset = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.FileAsset,
  ) : CdkObject(cdkObject),
      FileAsset {
    /**
     * Destinations for this file asset.
     */
    override fun destinations(): Map<String, FileDestination> =
        unwrap(this).getDestinations().mapValues{FileDestination.wrap(it.value)}

    /**
     * A display name for this asset.
     *
     * Default: - The identifier will be used as the display name
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

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

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.FileAsset): FileAsset
        = CdkObjectWrappers.wrap(cdkObject) as? FileAsset ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileAsset): software.amazon.awscdk.cloud_assembly_schema.FileAsset
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.FileAsset
  }
}
