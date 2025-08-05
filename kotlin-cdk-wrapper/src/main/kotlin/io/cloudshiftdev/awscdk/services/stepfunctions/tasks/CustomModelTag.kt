@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The key/value pair for a tag.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * CustomModelTag customModelTag = CustomModelTag.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 */
public interface CustomModelTag {
  /**
   * Key for the tag.
   */
  public fun key(): String

  /**
   * Value for the tag.
   */
  public fun `value`(): String

  /**
   * A builder for [CustomModelTag]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param key Key for the tag. 
     */
    public fun key(key: String)

    /**
     * @param value Value for the tag. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.CustomModelTag.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.CustomModelTag.builder()

    /**
     * @param key Key for the tag. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param value Value for the tag. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.CustomModelTag =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CustomModelTag,
  ) : CdkObject(cdkObject),
      CustomModelTag {
    /**
     * Key for the tag.
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * Value for the tag.
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomModelTag {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CustomModelTag):
        CustomModelTag = CdkObjectWrappers.wrap(cdkObject) as? CustomModelTag ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomModelTag):
        software.amazon.awscdk.services.stepfunctions.tasks.CustomModelTag = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.CustomModelTag
  }
}
