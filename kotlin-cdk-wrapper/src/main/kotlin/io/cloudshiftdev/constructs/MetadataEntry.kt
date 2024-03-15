@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.constructs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface MetadataEntry {
  public fun `data`(): Any

  public fun trace(): List<String> = unwrap(this).getTrace() ?: emptyList()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun `data`(`data`: Any)

    public fun trace(trace: List<String>)

    public fun trace(vararg trace: String)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.constructs.MetadataEntry.Builder =
        software.constructs.MetadataEntry.builder()

    override fun `data`(`data`: Any) {
      cdkBuilder.`data`(`data`)
    }

    override fun trace(trace: List<String>) {
      cdkBuilder.trace(trace)
    }

    override fun trace(vararg trace: String): Unit = trace(trace.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.constructs.MetadataEntry = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.constructs.MetadataEntry,
  ) : CdkObject(cdkObject), MetadataEntry {
    override fun `data`(): Any = unwrap(this).getData()

    override fun trace(): List<String> = unwrap(this).getTrace() ?: emptyList()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MetadataEntry {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.constructs.MetadataEntry): MetadataEntry =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetadataEntry): software.constructs.MetadataEntry = (wrapped as
        CdkObject).cdkObject as software.constructs.MetadataEntry
  }
}
