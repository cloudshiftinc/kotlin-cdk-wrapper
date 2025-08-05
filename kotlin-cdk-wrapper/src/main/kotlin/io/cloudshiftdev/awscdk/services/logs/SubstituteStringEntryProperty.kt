@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * This object defines one log field key that will be replaced using the substituteString processor.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * SubstituteStringEntryProperty substituteStringEntryProperty =
 * SubstituteStringEntryProperty.builder()
 * .from("from")
 * .source("source")
 * .to("to")
 * .build();
 * ```
 */
public interface SubstituteStringEntryProperty {
  /**
   * The regular expression string to be replaced.
   */
  public fun from(): String

  /**
   * The key to modify.
   */
  public fun source(): String

  /**
   * The string to be substituted for each match of from.
   */
  public fun to(): String

  /**
   * A builder for [SubstituteStringEntryProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param from The regular expression string to be replaced. 
     */
    public fun from(from: String)

    /**
     * @param source The key to modify. 
     */
    public fun source(source: String)

    /**
     * @param to The string to be substituted for each match of from. 
     */
    public fun to(to: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.logs.SubstituteStringEntryProperty.Builder =
        software.amazon.awscdk.services.logs.SubstituteStringEntryProperty.builder()

    /**
     * @param from The regular expression string to be replaced. 
     */
    override fun from(from: String) {
      cdkBuilder.from(from)
    }

    /**
     * @param source The key to modify. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * @param to The string to be substituted for each match of from. 
     */
    override fun to(to: String) {
      cdkBuilder.to(to)
    }

    public fun build(): software.amazon.awscdk.services.logs.SubstituteStringEntryProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.SubstituteStringEntryProperty,
  ) : CdkObject(cdkObject),
      SubstituteStringEntryProperty {
    /**
     * The regular expression string to be replaced.
     */
    override fun from(): String = unwrap(this).getFrom()

    /**
     * The key to modify.
     */
    override fun source(): String = unwrap(this).getSource()

    /**
     * The string to be substituted for each match of from.
     */
    override fun to(): String = unwrap(this).getTo()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SubstituteStringEntryProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.logs.SubstituteStringEntryProperty):
        SubstituteStringEntryProperty = CdkObjectWrappers.wrap(cdkObject) as?
        SubstituteStringEntryProperty ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubstituteStringEntryProperty):
        software.amazon.awscdk.services.logs.SubstituteStringEntryProperty = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.SubstituteStringEntryProperty
  }
}
