@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.assertions

import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.Map

/**
 * Allows assertions on the tags associated with a synthesized CDK stack's manifest.
 *
 * Stack tags are not part of the synthesized template, so can only be
 * checked from the manifest in this manner.
 *
 * Example:
 *
 * ```
 * Tags tags = Tags.fromStack(stack);
 * // using a default 'objectLike' Matcher
 * tags.hasValues(Map.of(
 * "tag-name", "tag-value"));
 * // ... with Matchers embedded
 * tags.hasValues(Map.of(
 * "tag-name", Match.stringLikeRegexp("value")));
 * // or another object Matcher at the top level
 * tags.hasValues(Match.objectEquals(Map.of(
 * "tag-name", Match.anyValue())));
 * ```
 */
public open class Tags(
  cdkObject: software.amazon.awscdk.assertions.Tags,
) : CdkObject(cdkObject) {
  /**
   * Get the tags associated with the manifest.
   *
   * This will be an empty object if
   * no tags were supplied.
   *
   * @return The tags associated with the stack's synthesized manifest.
   */
  public open fun all(): Map<String, String> = unwrap(this).all() ?: emptyMap()

  /**
   * Assert that the there are no tags associated with the synthesized CDK Stack's manifest.
   *
   * This is a convenience method over `hasValues(Match.exact({}))`, and is
   * present because the more obvious method of detecting no tags
   * (`Match.absent()`) will not work. Manifests default the tag set to an empty
   * object.
   */
  public open fun hasNone() {
    unwrap(this).hasNone()
  }

  /**
   * Assert that the given Matcher or object matches the tags associated with the synthesized CDK
   * Stack's manifest.
   *
   * @param tags the expected set of tags. 
   */
  public open fun hasValues(tags: Any) {
    unwrap(this).hasValues(tags)
  }

  public companion object {
    public fun fromStack(stack: Stack): Tags =
        software.amazon.awscdk.assertions.Tags.fromStack(stack.let(Stack::unwrap)).let(Tags::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.Tags): Tags = Tags(cdkObject)

    internal fun unwrap(wrapped: Tags): software.amazon.awscdk.assertions.Tags = wrapped.cdkObject
        as software.amazon.awscdk.assertions.Tags
  }
}
