@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Use this processor to rename keys in a log event.
 *
 * For more information about this processor including examples, see renameKeys in the CloudWatch
 * Logs User Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * RenameKeysProperty renameKeysProperty = RenameKeysProperty.builder()
 * .entries(List.of(RenameKeyEntryProperty.builder()
 * .key("key")
 * .renameTo("renameTo")
 * // the properties below are optional
 * .overwriteIfExists(false)
 * .build()))
 * .build();
 * ```
 */
public interface RenameKeysProperty {
  /**
   * An array of RenameKeyEntry objects, where each object contains information about one key to
   * rename.
   */
  public fun entries(): List<RenameKeyEntryProperty>

  /**
   * A builder for [RenameKeysProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param entries An array of RenameKeyEntry objects, where each object contains information
     * about one key to rename. 
     */
    public fun entries(entries: List<RenameKeyEntryProperty>)

    /**
     * @param entries An array of RenameKeyEntry objects, where each object contains information
     * about one key to rename. 
     */
    public fun entries(vararg entries: RenameKeyEntryProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.RenameKeysProperty.Builder =
        software.amazon.awscdk.services.logs.RenameKeysProperty.builder()

    /**
     * @param entries An array of RenameKeyEntry objects, where each object contains information
     * about one key to rename. 
     */
    override fun entries(entries: List<RenameKeyEntryProperty>) {
      cdkBuilder.entries(entries.map(RenameKeyEntryProperty.Companion::unwrap))
    }

    /**
     * @param entries An array of RenameKeyEntry objects, where each object contains information
     * about one key to rename. 
     */
    override fun entries(vararg entries: RenameKeyEntryProperty): Unit = entries(entries.toList())

    public fun build(): software.amazon.awscdk.services.logs.RenameKeysProperty = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.RenameKeysProperty,
  ) : CdkObject(cdkObject),
      RenameKeysProperty {
    /**
     * An array of RenameKeyEntry objects, where each object contains information about one key to
     * rename.
     */
    override fun entries(): List<RenameKeyEntryProperty> =
        unwrap(this).getEntries().map(RenameKeyEntryProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RenameKeysProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.RenameKeysProperty):
        RenameKeysProperty = CdkObjectWrappers.wrap(cdkObject) as? RenameKeysProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RenameKeysProperty):
        software.amazon.awscdk.services.logs.RenameKeysProperty = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.RenameKeysProperty
  }
}
