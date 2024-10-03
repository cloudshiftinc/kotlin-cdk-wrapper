@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for a tag.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * TagProps tagProps = TagProps.builder()
 * .applyToLaunchedInstances(false)
 * .excludeResourceTypes(List.of("excludeResourceTypes"))
 * .includeResourceTypes(List.of("includeResourceTypes"))
 * .priority(123)
 * .build();
 * ```
 */
public interface TagProps {
  /**
   * Whether the tag should be applied to instances in an AutoScalingGroup.
   *
   * Default: true
   */
  public fun applyToLaunchedInstances(): Boolean? = unwrap(this).getApplyToLaunchedInstances()

  /**
   * An array of Resource Types that will not receive this tag.
   *
   * An empty array will allow this tag to be applied to all resources. A
   * non-empty array will apply this tag only if the Resource type is not in
   * this array.
   *
   * Default: []
   */
  public fun excludeResourceTypes(): List<String> = unwrap(this).getExcludeResourceTypes() ?:
      emptyList()

  /**
   * An array of Resource Types that will receive this tag.
   *
   * An empty array will match any Resource. A non-empty array will apply this
   * tag only to Resource types that are included in this array.
   *
   * Default: []
   */
  public fun includeResourceTypes(): List<String> = unwrap(this).getIncludeResourceTypes() ?:
      emptyList()

  /**
   * Priority of the tag operation.
   *
   * Higher or equal priority tags will take precedence.
   *
   * Setting priority will enable the user to control tags when they need to not
   * follow the default precedence pattern of last applied and closest to the
   * construct in the tree.
   *
   * Default: Default priorities:
   * - 100 for `SetTag`
   * - 200 for `RemoveTag`
   * - 50 for tags added directly to CloudFormation resources
   */
  public fun priority(): Number? = unwrap(this).getPriority()

  /**
   * A builder for [TagProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applyToLaunchedInstances Whether the tag should be applied to instances in an
     * AutoScalingGroup.
     */
    public fun applyToLaunchedInstances(applyToLaunchedInstances: Boolean)

    /**
     * @param excludeResourceTypes An array of Resource Types that will not receive this tag.
     * An empty array will allow this tag to be applied to all resources. A
     * non-empty array will apply this tag only if the Resource type is not in
     * this array.
     */
    public fun excludeResourceTypes(excludeResourceTypes: List<String>)

    /**
     * @param excludeResourceTypes An array of Resource Types that will not receive this tag.
     * An empty array will allow this tag to be applied to all resources. A
     * non-empty array will apply this tag only if the Resource type is not in
     * this array.
     */
    public fun excludeResourceTypes(vararg excludeResourceTypes: String)

    /**
     * @param includeResourceTypes An array of Resource Types that will receive this tag.
     * An empty array will match any Resource. A non-empty array will apply this
     * tag only to Resource types that are included in this array.
     */
    public fun includeResourceTypes(includeResourceTypes: List<String>)

    /**
     * @param includeResourceTypes An array of Resource Types that will receive this tag.
     * An empty array will match any Resource. A non-empty array will apply this
     * tag only to Resource types that are included in this array.
     */
    public fun includeResourceTypes(vararg includeResourceTypes: String)

    /**
     * @param priority Priority of the tag operation.
     * Higher or equal priority tags will take precedence.
     *
     * Setting priority will enable the user to control tags when they need to not
     * follow the default precedence pattern of last applied and closest to the
     * construct in the tree.
     */
    public fun priority(priority: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.TagProps.Builder =
        software.amazon.awscdk.TagProps.builder()

    /**
     * @param applyToLaunchedInstances Whether the tag should be applied to instances in an
     * AutoScalingGroup.
     */
    override fun applyToLaunchedInstances(applyToLaunchedInstances: Boolean) {
      cdkBuilder.applyToLaunchedInstances(applyToLaunchedInstances)
    }

    /**
     * @param excludeResourceTypes An array of Resource Types that will not receive this tag.
     * An empty array will allow this tag to be applied to all resources. A
     * non-empty array will apply this tag only if the Resource type is not in
     * this array.
     */
    override fun excludeResourceTypes(excludeResourceTypes: List<String>) {
      cdkBuilder.excludeResourceTypes(excludeResourceTypes)
    }

    /**
     * @param excludeResourceTypes An array of Resource Types that will not receive this tag.
     * An empty array will allow this tag to be applied to all resources. A
     * non-empty array will apply this tag only if the Resource type is not in
     * this array.
     */
    override fun excludeResourceTypes(vararg excludeResourceTypes: String): Unit =
        excludeResourceTypes(excludeResourceTypes.toList())

    /**
     * @param includeResourceTypes An array of Resource Types that will receive this tag.
     * An empty array will match any Resource. A non-empty array will apply this
     * tag only to Resource types that are included in this array.
     */
    override fun includeResourceTypes(includeResourceTypes: List<String>) {
      cdkBuilder.includeResourceTypes(includeResourceTypes)
    }

    /**
     * @param includeResourceTypes An array of Resource Types that will receive this tag.
     * An empty array will match any Resource. A non-empty array will apply this
     * tag only to Resource types that are included in this array.
     */
    override fun includeResourceTypes(vararg includeResourceTypes: String): Unit =
        includeResourceTypes(includeResourceTypes.toList())

    /**
     * @param priority Priority of the tag operation.
     * Higher or equal priority tags will take precedence.
     *
     * Setting priority will enable the user to control tags when they need to not
     * follow the default precedence pattern of last applied and closest to the
     * construct in the tree.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.TagProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.TagProps,
  ) : CdkObject(cdkObject),
      TagProps {
    /**
     * Whether the tag should be applied to instances in an AutoScalingGroup.
     *
     * Default: true
     */
    override fun applyToLaunchedInstances(): Boolean? = unwrap(this).getApplyToLaunchedInstances()

    /**
     * An array of Resource Types that will not receive this tag.
     *
     * An empty array will allow this tag to be applied to all resources. A
     * non-empty array will apply this tag only if the Resource type is not in
     * this array.
     *
     * Default: []
     */
    override fun excludeResourceTypes(): List<String> = unwrap(this).getExcludeResourceTypes() ?:
        emptyList()

    /**
     * An array of Resource Types that will receive this tag.
     *
     * An empty array will match any Resource. A non-empty array will apply this
     * tag only to Resource types that are included in this array.
     *
     * Default: []
     */
    override fun includeResourceTypes(): List<String> = unwrap(this).getIncludeResourceTypes() ?:
        emptyList()

    /**
     * Priority of the tag operation.
     *
     * Higher or equal priority tags will take precedence.
     *
     * Setting priority will enable the user to control tags when they need to not
     * follow the default precedence pattern of last applied and closest to the
     * construct in the tree.
     *
     * Default: Default priorities:
     * - 100 for `SetTag`
     * - 200 for `RemoveTag`
     * - 50 for tags added directly to CloudFormation resources
     */
    override fun priority(): Number? = unwrap(this).getPriority()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TagProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.TagProps): TagProps =
        CdkObjectWrappers.wrap(cdkObject) as? TagProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TagProps): software.amazon.awscdk.TagProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.TagProps
  }
}
