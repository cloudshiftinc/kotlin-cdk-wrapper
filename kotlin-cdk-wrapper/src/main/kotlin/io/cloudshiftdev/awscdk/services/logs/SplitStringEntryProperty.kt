@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * This object defines one log field that will be split with the splitString processor.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * SplitStringEntryProperty splitStringEntryProperty = SplitStringEntryProperty.builder()
 * .delimiter(DelimiterCharacter.COMMA)
 * .source("source")
 * .build();
 * ```
 */
public interface SplitStringEntryProperty {
  /**
   * The separator character to split the string on.
   */
  public fun delimiter(): DelimiterCharacter

  /**
   * The key of the field to split.
   */
  public fun source(): String

  /**
   * A builder for [SplitStringEntryProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param delimiter The separator character to split the string on. 
     */
    public fun delimiter(delimiter: DelimiterCharacter)

    /**
     * @param source The key of the field to split. 
     */
    public fun source(source: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.SplitStringEntryProperty.Builder =
        software.amazon.awscdk.services.logs.SplitStringEntryProperty.builder()

    /**
     * @param delimiter The separator character to split the string on. 
     */
    override fun delimiter(delimiter: DelimiterCharacter) {
      cdkBuilder.delimiter(delimiter.let(DelimiterCharacter.Companion::unwrap))
    }

    /**
     * @param source The key of the field to split. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    public fun build(): software.amazon.awscdk.services.logs.SplitStringEntryProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.SplitStringEntryProperty,
  ) : CdkObject(cdkObject),
      SplitStringEntryProperty {
    /**
     * The separator character to split the string on.
     */
    override fun delimiter(): DelimiterCharacter =
        unwrap(this).getDelimiter().let(DelimiterCharacter::wrap)

    /**
     * The key of the field to split.
     */
    override fun source(): String = unwrap(this).getSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SplitStringEntryProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.SplitStringEntryProperty):
        SplitStringEntryProperty = CdkObjectWrappers.wrap(cdkObject) as? SplitStringEntryProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SplitStringEntryProperty):
        software.amazon.awscdk.services.logs.SplitStringEntryProperty = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.SplitStringEntryProperty
  }
}
