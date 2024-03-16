@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options to configure TagManager behavior.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * TagManagerOptions tagManagerOptions = TagManagerOptions.builder()
 * .tagPropertyName("tagPropertyName")
 * .build();
 * ```
 */
public interface TagManagerOptions {
  /**
   * The name of the property in CloudFormation for these tags.
   *
   * Normally this is `tags`, but Cognito UserPool uses UserPoolTags
   *
   * Default: "tags"
   */
  public fun tagPropertyName(): String? = unwrap(this).getTagPropertyName()

  /**
   * A builder for [TagManagerOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param tagPropertyName The name of the property in CloudFormation for these tags.
     * Normally this is `tags`, but Cognito UserPool uses UserPoolTags
     */
    public fun tagPropertyName(tagPropertyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.TagManagerOptions.Builder =
        software.amazon.awscdk.TagManagerOptions.builder()

    /**
     * @param tagPropertyName The name of the property in CloudFormation for these tags.
     * Normally this is `tags`, but Cognito UserPool uses UserPoolTags
     */
    override fun tagPropertyName(tagPropertyName: String) {
      cdkBuilder.tagPropertyName(tagPropertyName)
    }

    public fun build(): software.amazon.awscdk.TagManagerOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.TagManagerOptions,
  ) : CdkObject(cdkObject), TagManagerOptions {
    /**
     * The name of the property in CloudFormation for these tags.
     *
     * Normally this is `tags`, but Cognito UserPool uses UserPoolTags
     *
     * Default: "tags"
     */
    override fun tagPropertyName(): String? = unwrap(this).getTagPropertyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TagManagerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.TagManagerOptions): TagManagerOptions =
        CdkObjectWrappers.wrap(cdkObject) as TagManagerOptions

    internal fun unwrap(wrapped: TagManagerOptions): software.amazon.awscdk.TagManagerOptions =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.TagManagerOptions
  }
}
