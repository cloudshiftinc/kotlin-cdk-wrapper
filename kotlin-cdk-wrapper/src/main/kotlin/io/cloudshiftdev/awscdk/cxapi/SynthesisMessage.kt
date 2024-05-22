@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloudassembly.schema.MetadataEntry
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * SynthesisMessage synthesisMessage = SynthesisMessage.builder()
 * .entry(MetadataEntry.builder()
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .trace(List.of("trace"))
 * .build())
 * .id("id")
 * .level(SynthesisMessageLevel.INFO)
 * .build();
 * ```
 */
public interface SynthesisMessage {
  /**
   *
   */
  public fun entry(): MetadataEntry

  /**
   *
   */
  public fun id(): String

  /**
   *
   */
  public fun level(): SynthesisMessageLevel

  /**
   * A builder for [SynthesisMessage]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param entry the value to be set. 
     */
    public fun entry(entry: MetadataEntry)

    /**
     * @param entry the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9632d9a77fd16530e6e62a4bc87651a80c1d90b0739b16bdf07edfbaf8de3dc8")
    public fun entry(entry: MetadataEntry.Builder.() -> Unit)

    /**
     * @param id the value to be set. 
     */
    public fun id(id: String)

    /**
     * @param level the value to be set. 
     */
    public fun level(level: SynthesisMessageLevel)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.SynthesisMessage.Builder =
        software.amazon.awscdk.cxapi.SynthesisMessage.builder()

    /**
     * @param entry the value to be set. 
     */
    override fun entry(entry: MetadataEntry) {
      cdkBuilder.entry(entry.let(MetadataEntry.Companion::unwrap))
    }

    /**
     * @param entry the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9632d9a77fd16530e6e62a4bc87651a80c1d90b0739b16bdf07edfbaf8de3dc8")
    override fun entry(entry: MetadataEntry.Builder.() -> Unit): Unit = entry(MetadataEntry(entry))

    /**
     * @param id the value to be set. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param level the value to be set. 
     */
    override fun level(level: SynthesisMessageLevel) {
      cdkBuilder.level(level.let(SynthesisMessageLevel.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.cxapi.SynthesisMessage = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cxapi.SynthesisMessage,
  ) : CdkObject(cdkObject), SynthesisMessage {
    /**
     *
     */
    override fun entry(): MetadataEntry = unwrap(this).getEntry().let(MetadataEntry::wrap)

    /**
     *
     */
    override fun id(): String = unwrap(this).getId()

    /**
     *
     */
    override fun level(): SynthesisMessageLevel =
        unwrap(this).getLevel().let(SynthesisMessageLevel::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SynthesisMessage {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.SynthesisMessage): SynthesisMessage =
        CdkObjectWrappers.wrap(cdkObject) as? SynthesisMessage ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SynthesisMessage): software.amazon.awscdk.cxapi.SynthesisMessage =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.cxapi.SynthesisMessage
  }
}
