@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Metadata that you apply to a resource to help categorize and organize the resource.
 *
 * Each tag consists of a key and an optional value, both of which you define.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.targets.*;
 * Tag tag = Tag.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 */
public interface Tag {
  /**
   * Key is the name of the tag.
   */
  public fun key(): String

  /**
   * Value is the metadata contents of the tag.
   */
  public fun `value`(): String

  /**
   * A builder for [Tag]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param key Key is the name of the tag. 
     */
    public fun key(key: String)

    /**
     * @param value Value is the metadata contents of the tag. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.Tag.Builder =
        software.amazon.awscdk.services.events.targets.Tag.builder()

    /**
     * @param key Key is the name of the tag. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param value Value is the metadata contents of the tag. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.Tag = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.Tag,
  ) : CdkObject(cdkObject), Tag {
    /**
     * Key is the name of the tag.
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * Value is the metadata contents of the tag.
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Tag {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.Tag): Tag =
        CdkObjectWrappers.wrap(cdkObject) as? Tag ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Tag): software.amazon.awscdk.services.events.targets.Tag = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.Tag
  }
}
