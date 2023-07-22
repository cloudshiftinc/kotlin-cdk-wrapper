@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecr.LifecycleRule
import software.amazon.awscdk.services.ecr.TagStatus

@CdkDslMarker
public class LifecycleRuleDsl {
  private val cdkBuilder: LifecycleRule.Builder = LifecycleRule.builder()

  private val _tagPrefixList: MutableList<String> = mutableListOf()

  /**
   * @param description Describes the purpose of the rule.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param maxImageAge The maximum age of images to retain. The value must represent a number of
   * days.
   * Specify exactly one of maxImageCount and maxImageAge.
   */
  public fun maxImageAge(maxImageAge: Duration) {
    cdkBuilder.maxImageAge(maxImageAge)
  }

  /**
   * @param maxImageCount The maximum number of images to retain.
   * Specify exactly one of maxImageCount and maxImageAge.
   */
  public fun maxImageCount(maxImageCount: Number) {
    cdkBuilder.maxImageCount(maxImageCount)
  }

  /**
   * @param rulePriority Controls the order in which rules are evaluated (low to high).
   * All rules must have a unique priority, where lower numbers have
   * higher precedence. The first rule that matches is applied to an image.
   *
   * There can only be one rule with a tagStatus of Any, and it must have
   * the highest rulePriority.
   *
   * All rules without a specified priority will have incrementing priorities
   * automatically assigned to them, higher than any rules that DO have priorities.
   */
  public fun rulePriority(rulePriority: Number) {
    cdkBuilder.rulePriority(rulePriority)
  }

  /**
   * @param tagPrefixList Select images that have ALL the given prefixes in their tag.
   * Only if tagStatus == TagStatus.Tagged
   */
  public fun tagPrefixList(vararg tagPrefixList: String) {
    _tagPrefixList.addAll(listOf(*tagPrefixList))
  }

  /**
   * @param tagPrefixList Select images that have ALL the given prefixes in their tag.
   * Only if tagStatus == TagStatus.Tagged
   */
  public fun tagPrefixList(tagPrefixList: Collection<String>) {
    _tagPrefixList.addAll(tagPrefixList)
  }

  /**
   * @param tagStatus Select images based on tags.
   * Only one rule is allowed to select untagged images, and it must
   * have the highest rulePriority.
   */
  public fun tagStatus(tagStatus: TagStatus) {
    cdkBuilder.tagStatus(tagStatus)
  }

  public fun build(): LifecycleRule {
    if(_tagPrefixList.isNotEmpty()) cdkBuilder.tagPrefixList(_tagPrefixList)
    return cdkBuilder.build()
  }
}
