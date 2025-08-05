@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * This processor moves a key from one field to another.
 *
 * The original key is deleted.
 * For more information about this processor including examples, see moveKeys in the CloudWatch Logs
 * User Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * MoveKeysProperty moveKeysProperty = MoveKeysProperty.builder()
 * .entries(List.of(MoveKeyEntryProperty.builder()
 * .source("source")
 * .target("target")
 * // the properties below are optional
 * .overwriteIfExists(false)
 * .build()))
 * .build();
 * ```
 */
public interface MoveKeysProperty {
  /**
   * An array of objects, where each object contains information about one key to move.
   */
  public fun entries(): List<MoveKeyEntryProperty>

  /**
   * A builder for [MoveKeysProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param entries An array of objects, where each object contains information about one key to
     * move. 
     */
    public fun entries(entries: List<MoveKeyEntryProperty>)

    /**
     * @param entries An array of objects, where each object contains information about one key to
     * move. 
     */
    public fun entries(vararg entries: MoveKeyEntryProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.MoveKeysProperty.Builder =
        software.amazon.awscdk.services.logs.MoveKeysProperty.builder()

    /**
     * @param entries An array of objects, where each object contains information about one key to
     * move. 
     */
    override fun entries(entries: List<MoveKeyEntryProperty>) {
      cdkBuilder.entries(entries.map(MoveKeyEntryProperty.Companion::unwrap))
    }

    /**
     * @param entries An array of objects, where each object contains information about one key to
     * move. 
     */
    override fun entries(vararg entries: MoveKeyEntryProperty): Unit = entries(entries.toList())

    public fun build(): software.amazon.awscdk.services.logs.MoveKeysProperty = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.MoveKeysProperty,
  ) : CdkObject(cdkObject),
      MoveKeysProperty {
    /**
     * An array of objects, where each object contains information about one key to move.
     */
    override fun entries(): List<MoveKeyEntryProperty> =
        unwrap(this).getEntries().map(MoveKeyEntryProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MoveKeysProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.MoveKeysProperty):
        MoveKeysProperty = CdkObjectWrappers.wrap(cdkObject) as? MoveKeysProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MoveKeysProperty):
        software.amazon.awscdk.services.logs.MoveKeysProperty = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.MoveKeysProperty
  }
}
