@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry
import io.cloudshiftdev.awscdk.cloudassembly.schema.FileAssetMetadataEntry
import io.cloudshiftdev.awscdk.cloudassembly.schema.MetadataEntry
import io.cloudshiftdev.awscdk.cloudassembly.schema.Tag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * MetadataEntryResult metadataEntryResult = MetadataEntryResult.builder()
 * .path("path")
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .trace(List.of("trace"))
 * .build();
 * ```
 */
public interface MetadataEntryResult : MetadataEntry {
  /**
   * The path in which this entry was defined.
   */
  public fun path(): String

  /**
   * A builder for [MetadataEntryResult]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param data The data.
     */
    public fun `data`(`data`: String)

    /**
     * @param data The data.
     */
    public fun `data`(`data`: FileAssetMetadataEntry)

    /**
     * @param data The data.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21032671b9fd8716bfa04fb75b91a465e21e525e6bd0142e4ec3f68c59add044")
    public fun `data`(`data`: FileAssetMetadataEntry.Builder.() -> Unit)

    /**
     * @param data The data.
     */
    public fun `data`(`data`: ContainerImageAssetMetadataEntry)

    /**
     * @param data The data.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f31e5c47b3e381ad8ea96d00aab02e299b353aa9c5ef9bfb5c2e428b3578437")
    public fun `data`(`data`: ContainerImageAssetMetadataEntry.Builder.() -> Unit)

    /**
     * @param data The data.
     */
    public fun `data`(`data`: List<Tag>)

    /**
     * @param data The data.
     */
    public fun `data`(vararg `data`: Tag)

    /**
     * @param path The path in which this entry was defined. 
     */
    public fun path(path: String)

    /**
     * @param trace A stack trace for when the entry was created.
     */
    public fun trace(trace: List<String>)

    /**
     * @param trace A stack trace for when the entry was created.
     */
    public fun trace(vararg trace: String)

    /**
     * @param type The type of the metadata entry. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.MetadataEntryResult.Builder =
        software.amazon.awscdk.cxapi.MetadataEntryResult.builder()

    /**
     * @param data The data.
     */
    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    /**
     * @param data The data.
     */
    override fun `data`(`data`: FileAssetMetadataEntry) {
      cdkBuilder.`data`(`data`.let(FileAssetMetadataEntry::unwrap))
    }

    /**
     * @param data The data.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21032671b9fd8716bfa04fb75b91a465e21e525e6bd0142e4ec3f68c59add044")
    override fun `data`(`data`: FileAssetMetadataEntry.Builder.() -> Unit): Unit =
        `data`(FileAssetMetadataEntry(`data`))

    /**
     * @param data The data.
     */
    override fun `data`(`data`: ContainerImageAssetMetadataEntry) {
      cdkBuilder.`data`(`data`.let(ContainerImageAssetMetadataEntry::unwrap))
    }

    /**
     * @param data The data.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f31e5c47b3e381ad8ea96d00aab02e299b353aa9c5ef9bfb5c2e428b3578437")
    override fun `data`(`data`: ContainerImageAssetMetadataEntry.Builder.() -> Unit): Unit =
        `data`(ContainerImageAssetMetadataEntry(`data`))

    /**
     * @param data The data.
     */
    override fun `data`(`data`: List<Tag>) {
      cdkBuilder.`data`(`data`.map(Tag::unwrap))
    }

    /**
     * @param data The data.
     */
    override fun `data`(vararg `data`: Tag): Unit = `data`(`data`.toList())

    /**
     * @param path The path in which this entry was defined. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param trace A stack trace for when the entry was created.
     */
    override fun trace(trace: List<String>) {
      cdkBuilder.trace(trace)
    }

    /**
     * @param trace A stack trace for when the entry was created.
     */
    override fun trace(vararg trace: String): Unit = trace(trace.toList())

    /**
     * @param type The type of the metadata entry. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.cxapi.MetadataEntryResult = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.MetadataEntryResult,
  ) : CdkObject(cdkObject), MetadataEntryResult {
    /**
     * The data.
     *
     * Default: - no data.
     */
    override fun `data`(): Any? = unwrap(this).getData()

    /**
     * The path in which this entry was defined.
     */
    override fun path(): String = unwrap(this).getPath()

    /**
     * A stack trace for when the entry was created.
     *
     * Default: - no trace.
     */
    override fun trace(): List<String> = unwrap(this).getTrace() ?: emptyList()

    /**
     * The type of the metadata entry.
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MetadataEntryResult {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.MetadataEntryResult):
        MetadataEntryResult = CdkObjectWrappers.wrap(cdkObject) as? MetadataEntryResult ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetadataEntryResult):
        software.amazon.awscdk.cxapi.MetadataEntryResult = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.cxapi.MetadataEntryResult
  }
}
