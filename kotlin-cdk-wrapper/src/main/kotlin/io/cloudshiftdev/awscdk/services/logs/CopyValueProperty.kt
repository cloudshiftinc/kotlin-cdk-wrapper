@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Copy Value processor, copies values from source to target for each entry.
 *
 * This processor copies values within a log event.
 * You can also use this processor to add metadata to log events by copying values from metadata
 * keys.
 * For more information about this processor including examples, see copyValue in the CloudWatch
 * Logs User Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CopyValueProperty copyValueProperty = CopyValueProperty.builder()
 * .entries(List.of(CopyValueEntryProperty.builder()
 * .source("source")
 * .target("target")
 * // the properties below are optional
 * .overwriteIfExists(false)
 * .build()))
 * .build();
 * ```
 */
public interface CopyValueProperty {
  /**
   * List of sources and target to copy.
   *
   * An array of CopyValueEntry objects, where each object contains information about one field
   * value to copy.
   */
  public fun entries(): List<CopyValueEntryProperty>

  /**
   * A builder for [CopyValueProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param entries List of sources and target to copy. 
     * An array of CopyValueEntry objects, where each object contains information about one field
     * value to copy.
     */
    public fun entries(entries: List<CopyValueEntryProperty>)

    /**
     * @param entries List of sources and target to copy. 
     * An array of CopyValueEntry objects, where each object contains information about one field
     * value to copy.
     */
    public fun entries(vararg entries: CopyValueEntryProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CopyValueProperty.Builder =
        software.amazon.awscdk.services.logs.CopyValueProperty.builder()

    /**
     * @param entries List of sources and target to copy. 
     * An array of CopyValueEntry objects, where each object contains information about one field
     * value to copy.
     */
    override fun entries(entries: List<CopyValueEntryProperty>) {
      cdkBuilder.entries(entries.map(CopyValueEntryProperty.Companion::unwrap))
    }

    /**
     * @param entries List of sources and target to copy. 
     * An array of CopyValueEntry objects, where each object contains information about one field
     * value to copy.
     */
    override fun entries(vararg entries: CopyValueEntryProperty): Unit = entries(entries.toList())

    public fun build(): software.amazon.awscdk.services.logs.CopyValueProperty = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.CopyValueProperty,
  ) : CdkObject(cdkObject),
      CopyValueProperty {
    /**
     * List of sources and target to copy.
     *
     * An array of CopyValueEntry objects, where each object contains information about one field
     * value to copy.
     */
    override fun entries(): List<CopyValueEntryProperty> =
        unwrap(this).getEntries().map(CopyValueEntryProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CopyValueProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CopyValueProperty):
        CopyValueProperty = CdkObjectWrappers.wrap(cdkObject) as? CopyValueProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CopyValueProperty):
        software.amazon.awscdk.services.logs.CopyValueProperty = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.CopyValueProperty
  }
}
