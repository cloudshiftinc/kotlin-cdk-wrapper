@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface MetadataEntry {
  public fun `data`(): Any? = unwrap(this).getData()

  public fun trace(): List<String> = unwrap(this).getTrace() ?: emptyList()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun `data`(`data`: String)

    public fun `data`(`data`: FileAssetMetadataEntry)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86b8f208b857e88412d1359f38853c3ae5d661b06abdaacd0549a45609abddb0")
    public fun `data`(`data`: FileAssetMetadataEntry.Builder.() -> Unit)

    public fun `data`(`data`: ContainerImageAssetMetadataEntry)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("79a698355e266cc87029a7d07643320124b56005af8389155d624f552e106c4f")
    public fun `data`(`data`: ContainerImageAssetMetadataEntry.Builder.() -> Unit)

    public fun `data`(`data`: List<Tag>)

    public fun `data`(vararg `data`: Tag)

    public fun trace(trace: List<String>)

    public fun trace(vararg trace: String)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.MetadataEntry.Builder =
        software.amazon.awscdk.cloudassembly.schema.MetadataEntry.builder()

    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    override fun `data`(`data`: FileAssetMetadataEntry) {
      cdkBuilder.`data`(`data`.let(FileAssetMetadataEntry::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86b8f208b857e88412d1359f38853c3ae5d661b06abdaacd0549a45609abddb0")
    override fun `data`(`data`: FileAssetMetadataEntry.Builder.() -> Unit): Unit =
        `data`(FileAssetMetadataEntry(`data`))

    override fun `data`(`data`: ContainerImageAssetMetadataEntry) {
      cdkBuilder.`data`(`data`.let(ContainerImageAssetMetadataEntry::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("79a698355e266cc87029a7d07643320124b56005af8389155d624f552e106c4f")
    override fun `data`(`data`: ContainerImageAssetMetadataEntry.Builder.() -> Unit): Unit =
        `data`(ContainerImageAssetMetadataEntry(`data`))

    override fun `data`(`data`: List<Tag>) {
      cdkBuilder.`data`(`data`.map(Tag::unwrap))
    }

    override fun `data`(vararg `data`: Tag): Unit = `data`(`data`.toList())

    override fun trace(trace: List<String>) {
      cdkBuilder.trace(trace)
    }

    override fun trace(vararg trace: String): Unit = trace(trace.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.MetadataEntry =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.MetadataEntry,
  ) : CdkObject(cdkObject), MetadataEntry {
    override fun `data`(): Any? = unwrap(this).getData()

    override fun trace(): List<String> = unwrap(this).getTrace() ?: emptyList()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MetadataEntry {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.MetadataEntry):
        MetadataEntry = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetadataEntry):
        software.amazon.awscdk.cloudassembly.schema.MetadataEntry = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cloudassembly.schema.MetadataEntry
  }
}
