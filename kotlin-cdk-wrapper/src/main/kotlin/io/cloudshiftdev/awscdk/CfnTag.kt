@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnTag cfnTag = CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 */
public interface CfnTag {
  /**
   *
   */
  public fun key(): String

  /**
   *
   */
  public fun `value`(): String

  /**
   * A builder for [CfnTag]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param key the value to be set. 
     */
    public fun key(key: String)

    /**
     * @param value the value to be set. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTag.Builder =
        software.amazon.awscdk.CfnTag.builder()

    /**
     * @param key the value to be set. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param value the value to be set. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.CfnTag = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnTag,
  ) : CdkObject(cdkObject), CfnTag {
    /**
     *
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     *
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTag {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTag): CfnTag =
        CdkObjectWrappers.wrap(cdkObject) as? CfnTag ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTag): software.amazon.awscdk.CfnTag = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnTag
  }
}
