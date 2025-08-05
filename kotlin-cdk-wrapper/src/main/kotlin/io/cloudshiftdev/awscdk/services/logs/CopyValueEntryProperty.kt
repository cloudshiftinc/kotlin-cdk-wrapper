@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * This object defines one value to be copied with the copyValue processor.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CopyValueEntryProperty copyValueEntryProperty = CopyValueEntryProperty.builder()
 * .source("source")
 * .target("target")
 * // the properties below are optional
 * .overwriteIfExists(false)
 * .build();
 * ```
 */
public interface CopyValueEntryProperty {
  /**
   * Specifies whether to overwrite the value if the target key already exists.
   *
   * Default: false
   */
  public fun overwriteIfExists(): Boolean? = unwrap(this).getOverwriteIfExists()

  /**
   * The key to copy.
   */
  public fun source(): String

  /**
   * The key of the field to copy the value to.
   */
  public fun target(): String

  /**
   * A builder for [CopyValueEntryProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param overwriteIfExists Specifies whether to overwrite the value if the target key already
     * exists.
     */
    public fun overwriteIfExists(overwriteIfExists: Boolean)

    /**
     * @param source The key to copy. 
     */
    public fun source(source: String)

    /**
     * @param target The key of the field to copy the value to. 
     */
    public fun target(target: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CopyValueEntryProperty.Builder =
        software.amazon.awscdk.services.logs.CopyValueEntryProperty.builder()

    /**
     * @param overwriteIfExists Specifies whether to overwrite the value if the target key already
     * exists.
     */
    override fun overwriteIfExists(overwriteIfExists: Boolean) {
      cdkBuilder.overwriteIfExists(overwriteIfExists)
    }

    /**
     * @param source The key to copy. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * @param target The key of the field to copy the value to. 
     */
    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    public fun build(): software.amazon.awscdk.services.logs.CopyValueEntryProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.CopyValueEntryProperty,
  ) : CdkObject(cdkObject),
      CopyValueEntryProperty {
    /**
     * Specifies whether to overwrite the value if the target key already exists.
     *
     * Default: false
     */
    override fun overwriteIfExists(): Boolean? = unwrap(this).getOverwriteIfExists()

    /**
     * The key to copy.
     */
    override fun source(): String = unwrap(this).getSource()

    /**
     * The key of the field to copy the value to.
     */
    override fun target(): String = unwrap(this).getTarget()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CopyValueEntryProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CopyValueEntryProperty):
        CopyValueEntryProperty = CdkObjectWrappers.wrap(cdkObject) as? CopyValueEntryProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CopyValueEntryProperty):
        software.amazon.awscdk.services.logs.CopyValueEntryProperty = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.CopyValueEntryProperty
  }
}
