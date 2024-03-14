package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry
import io.cloudshiftdev.awscdk.cloudassembly.schema.FileAssetMetadataEntry
import io.cloudshiftdev.awscdk.cloudassembly.schema.MetadataEntry
import io.cloudshiftdev.awscdk.cloudassembly.schema.Tag
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface MetadataEntryResult : MetadataEntry {
  public fun path(): String

  public interface Builder {
    public fun `data`(`data`: String)

    public fun `data`(`data`: FileAssetMetadataEntry)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21032671b9fd8716bfa04fb75b91a465e21e525e6bd0142e4ec3f68c59add044")
    public fun `data`(`data`: FileAssetMetadataEntry.Builder.() -> Unit)

    public fun `data`(`data`: ContainerImageAssetMetadataEntry)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f31e5c47b3e381ad8ea96d00aab02e299b353aa9c5ef9bfb5c2e428b3578437")
    public fun `data`(`data`: ContainerImageAssetMetadataEntry.Builder.() -> Unit)

    public fun `data`(`data`: List<Tag>)

    public fun `data`(vararg `data`: Tag)

    public fun path(path: String)

    public fun trace(trace: List<String>)

    public fun trace(vararg trace: String)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.MetadataEntryResult.Builder =
        software.amazon.awscdk.cxapi.MetadataEntryResult.builder()

    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    override fun `data`(`data`: FileAssetMetadataEntry) {
      cdkBuilder.`data`(`data`.let(FileAssetMetadataEntry::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21032671b9fd8716bfa04fb75b91a465e21e525e6bd0142e4ec3f68c59add044")
    override fun `data`(`data`: FileAssetMetadataEntry.Builder.() -> Unit): Unit =
        `data`(FileAssetMetadataEntry(`data`))

    override fun `data`(`data`: ContainerImageAssetMetadataEntry) {
      cdkBuilder.`data`(`data`.let(ContainerImageAssetMetadataEntry::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f31e5c47b3e381ad8ea96d00aab02e299b353aa9c5ef9bfb5c2e428b3578437")
    override fun `data`(`data`: ContainerImageAssetMetadataEntry.Builder.() -> Unit): Unit =
        `data`(ContainerImageAssetMetadataEntry(`data`))

    override fun `data`(`data`: List<Tag>) {
      cdkBuilder.`data`(`data`.map(Tag::unwrap))
    }

    override fun `data`(vararg `data`: Tag): Unit = `data`(`data`.toList())

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun trace(trace: List<String>) {
      cdkBuilder.trace(trace)
    }

    override fun trace(vararg trace: String): Unit = trace(trace.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.cxapi.MetadataEntryResult = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cxapi.MetadataEntryResult,
  ) : MetadataEntryResult {
    override fun `data`(): Any? = unwrap(this).getData()

    override fun path(): String = unwrap(this).getPath()

    override fun trace(): List<String> = unwrap(this).getTrace() ?: emptyList()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): MetadataEntryResult {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.MetadataEntryResult):
        MetadataEntryResult = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetadataEntryResult):
        software.amazon.awscdk.cxapi.MetadataEntryResult = (wrapped as Wrapper).cdkObject
  }
}
