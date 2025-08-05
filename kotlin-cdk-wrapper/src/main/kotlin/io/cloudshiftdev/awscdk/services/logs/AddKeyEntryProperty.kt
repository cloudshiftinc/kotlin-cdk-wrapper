@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * This object defines one key that will be added with the addKeys processor.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * AddKeyEntryProperty addKeyEntryProperty = AddKeyEntryProperty.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .overwriteIfExists(false)
 * .build();
 * ```
 */
public interface AddKeyEntryProperty {
  /**
   * The key of the new entry to be added to the log event.
   */
  public fun key(): String

  /**
   * Specifies whether to overwrite the value if the key already exists.
   *
   * Default: false
   */
  public fun overwriteIfExists(): Boolean? = unwrap(this).getOverwriteIfExists()

  /**
   * The value of the new entry to be added to the log event.
   */
  public fun `value`(): String

  /**
   * A builder for [AddKeyEntryProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param key The key of the new entry to be added to the log event. 
     */
    public fun key(key: String)

    /**
     * @param overwriteIfExists Specifies whether to overwrite the value if the key already exists.
     */
    public fun overwriteIfExists(overwriteIfExists: Boolean)

    /**
     * @param value The value of the new entry to be added to the log event. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.AddKeyEntryProperty.Builder =
        software.amazon.awscdk.services.logs.AddKeyEntryProperty.builder()

    /**
     * @param key The key of the new entry to be added to the log event. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param overwriteIfExists Specifies whether to overwrite the value if the key already exists.
     */
    override fun overwriteIfExists(overwriteIfExists: Boolean) {
      cdkBuilder.overwriteIfExists(overwriteIfExists)
    }

    /**
     * @param value The value of the new entry to be added to the log event. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.logs.AddKeyEntryProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.AddKeyEntryProperty,
  ) : CdkObject(cdkObject),
      AddKeyEntryProperty {
    /**
     * The key of the new entry to be added to the log event.
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * Specifies whether to overwrite the value if the key already exists.
     *
     * Default: false
     */
    override fun overwriteIfExists(): Boolean? = unwrap(this).getOverwriteIfExists()

    /**
     * The value of the new entry to be added to the log event.
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddKeyEntryProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.AddKeyEntryProperty):
        AddKeyEntryProperty = CdkObjectWrappers.wrap(cdkObject) as? AddKeyEntryProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddKeyEntryProperty):
        software.amazon.awscdk.services.logs.AddKeyEntryProperty = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.AddKeyEntryProperty
  }
}
