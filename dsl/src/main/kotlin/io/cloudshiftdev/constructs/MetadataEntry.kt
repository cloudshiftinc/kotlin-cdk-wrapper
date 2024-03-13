package io.cloudshiftdev.constructs

import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface MetadataEntry {
  public fun `data`(): Any

  public fun trace(): List<String> = unwrap(this).getTrace() ?: emptyList()

  public fun type(): String

  public interface Builder {
    public fun `data`(`data`: Any) {
    }

    public fun trace(trace: List<String>) {
    }

    public fun type(type: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.constructs.MetadataEntry.Builder =
        software.constructs.MetadataEntry.builder()

    public override fun `data`(`data`: Any) {
      cdkBuilder.`data`(`data`)
    }

    public override fun trace(trace: List<String>) {
      cdkBuilder.trace(trace)
    }

    public override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.constructs.MetadataEntry = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.constructs.MetadataEntry,
  ) : MetadataEntry {
    public override fun `data`(): Any = unwrap(this).getData()

    public override fun trace(): List<String> = unwrap(this).getTrace() ?: emptyList()

    public override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): MetadataEntry {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.constructs.MetadataEntry): MetadataEntry =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetadataEntry): software.constructs.MetadataEntry = (wrapped as
        Wrapper).cdkObject
  }
}
