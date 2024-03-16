@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Tag.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Tag tag = Tag.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 */
public interface Tag {
  /**
   * key to e tagged.
   */
  public fun key(): String

  /**
   * additional value.
   */
  public fun `value`(): String

  /**
   * A builder for [Tag]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param key key to e tagged. 
     */
    public fun key(key: String)

    /**
     * @param value additional value. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.Tag.Builder =
        software.amazon.awscdk.services.s3.Tag.builder()

    /**
     * @param key key to e tagged. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param value additional value. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.s3.Tag = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.Tag,
  ) : CdkObject(cdkObject), Tag {
    /**
     * key to e tagged.
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * additional value.
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Tag {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.Tag): Tag =
        CdkObjectWrappers.wrap(cdkObject) as Tag

    internal fun unwrap(wrapped: Tag): software.amazon.awscdk.services.s3.Tag = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.Tag
  }
}
