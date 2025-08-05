@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * This object defines one key that will be renamed with the renameKey processor.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * RenameKeyEntryProperty renameKeyEntryProperty = RenameKeyEntryProperty.builder()
 * .key("key")
 * .renameTo("renameTo")
 * // the properties below are optional
 * .overwriteIfExists(false)
 * .build();
 * ```
 */
public interface RenameKeyEntryProperty {
  /**
   * The key to rename.
   */
  public fun key(): String

  /**
   * Whether to overwrite the target key if it already exists.
   *
   * Default: false
   */
  public fun overwriteIfExists(): Boolean? = unwrap(this).getOverwriteIfExists()

  /**
   * The string to use for the new key name.
   */
  public fun renameTo(): String

  /**
   * A builder for [RenameKeyEntryProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param key The key to rename. 
     */
    public fun key(key: String)

    /**
     * @param overwriteIfExists Whether to overwrite the target key if it already exists.
     */
    public fun overwriteIfExists(overwriteIfExists: Boolean)

    /**
     * @param renameTo The string to use for the new key name. 
     */
    public fun renameTo(renameTo: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.RenameKeyEntryProperty.Builder =
        software.amazon.awscdk.services.logs.RenameKeyEntryProperty.builder()

    /**
     * @param key The key to rename. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param overwriteIfExists Whether to overwrite the target key if it already exists.
     */
    override fun overwriteIfExists(overwriteIfExists: Boolean) {
      cdkBuilder.overwriteIfExists(overwriteIfExists)
    }

    /**
     * @param renameTo The string to use for the new key name. 
     */
    override fun renameTo(renameTo: String) {
      cdkBuilder.renameTo(renameTo)
    }

    public fun build(): software.amazon.awscdk.services.logs.RenameKeyEntryProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.RenameKeyEntryProperty,
  ) : CdkObject(cdkObject),
      RenameKeyEntryProperty {
    /**
     * The key to rename.
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * Whether to overwrite the target key if it already exists.
     *
     * Default: false
     */
    override fun overwriteIfExists(): Boolean? = unwrap(this).getOverwriteIfExists()

    /**
     * The string to use for the new key name.
     */
    override fun renameTo(): String = unwrap(this).getRenameTo()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RenameKeyEntryProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.RenameKeyEntryProperty):
        RenameKeyEntryProperty = CdkObjectWrappers.wrap(cdkObject) as? RenameKeyEntryProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RenameKeyEntryProperty):
        software.amazon.awscdk.services.logs.RenameKeyEntryProperty = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.RenameKeyEntryProperty
  }
}
