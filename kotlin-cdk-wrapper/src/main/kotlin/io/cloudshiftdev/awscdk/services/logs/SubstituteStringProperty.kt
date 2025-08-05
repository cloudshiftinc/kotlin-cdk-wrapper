@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * This processor matches a key's value against a regular expression and replaces all matches with a
 * replacement string.
 *
 * For more information about this processor including examples, see substituteString in the
 * CloudWatch Logs User Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * SubstituteStringProperty substituteStringProperty = SubstituteStringProperty.builder()
 * .entries(List.of(SubstituteStringEntryProperty.builder()
 * .from("from")
 * .source("source")
 * .to("to")
 * .build()))
 * .build();
 * ```
 */
public interface SubstituteStringProperty {
  /**
   * An array of objects, where each object contains information about one key to match and replace.
   */
  public fun entries(): List<SubstituteStringEntryProperty>

  /**
   * A builder for [SubstituteStringProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param entries An array of objects, where each object contains information about one key to
     * match and replace. 
     */
    public fun entries(entries: List<SubstituteStringEntryProperty>)

    /**
     * @param entries An array of objects, where each object contains information about one key to
     * match and replace. 
     */
    public fun entries(vararg entries: SubstituteStringEntryProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.SubstituteStringProperty.Builder =
        software.amazon.awscdk.services.logs.SubstituteStringProperty.builder()

    /**
     * @param entries An array of objects, where each object contains information about one key to
     * match and replace. 
     */
    override fun entries(entries: List<SubstituteStringEntryProperty>) {
      cdkBuilder.entries(entries.map(SubstituteStringEntryProperty.Companion::unwrap))
    }

    /**
     * @param entries An array of objects, where each object contains information about one key to
     * match and replace. 
     */
    override fun entries(vararg entries: SubstituteStringEntryProperty): Unit =
        entries(entries.toList())

    public fun build(): software.amazon.awscdk.services.logs.SubstituteStringProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.SubstituteStringProperty,
  ) : CdkObject(cdkObject),
      SubstituteStringProperty {
    /**
     * An array of objects, where each object contains information about one key to match and
     * replace.
     */
    override fun entries(): List<SubstituteStringEntryProperty> =
        unwrap(this).getEntries().map(SubstituteStringEntryProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SubstituteStringProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.SubstituteStringProperty):
        SubstituteStringProperty = CdkObjectWrappers.wrap(cdkObject) as? SubstituteStringProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubstituteStringProperty):
        software.amazon.awscdk.services.logs.SubstituteStringProperty = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.SubstituteStringProperty
  }
}
