package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloudassembly.schema.MetadataEntry
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface SynthesisMessage {
  public fun entry(): MetadataEntry

  public fun id(): String

  public fun level(): SynthesisMessageLevel

  public interface Builder {
    public fun entry(entry: MetadataEntry) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9632d9a77fd16530e6e62a4bc87651a80c1d90b0739b16bdf07edfbaf8de3dc8")
    public fun entry(entry: MetadataEntry.Builder.() -> Unit) {
    }

    public fun id(id: String) {
    }

    public fun level(level: SynthesisMessageLevel) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.SynthesisMessage.Builder =
        software.amazon.awscdk.cxapi.SynthesisMessage.builder()

    public override fun entry(entry: MetadataEntry) {
      cdkBuilder.entry(entry.let(MetadataEntry::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9632d9a77fd16530e6e62a4bc87651a80c1d90b0739b16bdf07edfbaf8de3dc8")
    public override fun entry(entry: MetadataEntry.Builder.() -> Unit): Unit =
        entry(MetadataEntry(entry))

    public override fun id(id: String) {
      cdkBuilder.id(id)
    }

    public override fun level(level: SynthesisMessageLevel) {
      cdkBuilder.level(level.let(SynthesisMessageLevel::unwrap))
    }

    public fun build(): software.amazon.awscdk.cxapi.SynthesisMessage = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cxapi.SynthesisMessage,
  ) : SynthesisMessage {
    public override fun entry(): MetadataEntry = unwrap(this).getEntry().let(MetadataEntry::wrap)

    public override fun id(): String = unwrap(this).getId()

    public override fun level(): SynthesisMessageLevel =
        unwrap(this).getLevel().let(SynthesisMessageLevel::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SynthesisMessage {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.SynthesisMessage): SynthesisMessage =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SynthesisMessage): software.amazon.awscdk.cxapi.SynthesisMessage =
        (wrapped as Wrapper).cdkObject
  }
}
