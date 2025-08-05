@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Use this processor to split a field into an array of strings using a delimiting character.
 *
 * For more information about this processor including examples, see splitString in the CloudWatch
 * Logs User Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * SplitStringProperty splitStringProperty = SplitStringProperty.builder()
 * .entries(List.of(SplitStringEntryProperty.builder()
 * .delimiter(DelimiterCharacter.COMMA)
 * .source("source")
 * .build()))
 * .build();
 * ```
 */
public interface SplitStringProperty {
  /**
   * An array of SplitStringEntry objects, where each object contains information about one field to
   * split.
   */
  public fun entries(): List<SplitStringEntryProperty>

  /**
   * A builder for [SplitStringProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param entries An array of SplitStringEntry objects, where each object contains information
     * about one field to split. 
     */
    public fun entries(entries: List<SplitStringEntryProperty>)

    /**
     * @param entries An array of SplitStringEntry objects, where each object contains information
     * about one field to split. 
     */
    public fun entries(vararg entries: SplitStringEntryProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.SplitStringProperty.Builder =
        software.amazon.awscdk.services.logs.SplitStringProperty.builder()

    /**
     * @param entries An array of SplitStringEntry objects, where each object contains information
     * about one field to split. 
     */
    override fun entries(entries: List<SplitStringEntryProperty>) {
      cdkBuilder.entries(entries.map(SplitStringEntryProperty.Companion::unwrap))
    }

    /**
     * @param entries An array of SplitStringEntry objects, where each object contains information
     * about one field to split. 
     */
    override fun entries(vararg entries: SplitStringEntryProperty): Unit = entries(entries.toList())

    public fun build(): software.amazon.awscdk.services.logs.SplitStringProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.SplitStringProperty,
  ) : CdkObject(cdkObject),
      SplitStringProperty {
    /**
     * An array of SplitStringEntry objects, where each object contains information about one field
     * to split.
     */
    override fun entries(): List<SplitStringEntryProperty> =
        unwrap(this).getEntries().map(SplitStringEntryProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SplitStringProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.SplitStringProperty):
        SplitStringProperty = CdkObjectWrappers.wrap(cdkObject) as? SplitStringProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SplitStringProperty):
        software.amazon.awscdk.services.logs.SplitStringProperty = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.SplitStringProperty
  }
}
