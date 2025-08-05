@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for applying a removal policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * RemovalPolicyProps removalPolicyProps = RemovalPolicyProps.builder()
 * .applyToResourceTypes(List.of("applyToResourceTypes"))
 * .excludeResourceTypes(List.of("excludeResourceTypes"))
 * .priority(123)
 * .build();
 * ```
 */
public interface RemovalPolicyProps {
  /**
   * Apply the removal policy only to specific resource types.
   *
   * Can be a CloudFormation resource type string (e.g., 'AWS::S3::Bucket').
   *
   * Default: - apply to all resources
   */
  public fun applyToResourceTypes(): List<String> = unwrap(this).getApplyToResourceTypes() ?:
      emptyList()

  /**
   * Exclude specific resource types from the removal policy.
   *
   * Can be a CloudFormation resource type string (e.g., 'AWS::S3::Bucket').
   *
   * Default: - no exclusions
   */
  public fun excludeResourceTypes(): List<String> = unwrap(this).getExcludeResourceTypes() ?:
      emptyList()

  /**
   * The priority to use when applying this policy.
   *
   * The priority affects only the order in which aspects are applied during synthesis.
   * For RemovalPolicies, the last applied policy will override previous ones.
   *
   * NOTE: Priority does NOT determine which policy "wins" when there are conflicts.
   * The order of application determines the final policy, with later policies
   * overriding earlier ones.
   *
   * Default: - AspectPriority.MUTATING
   */
  public fun priority(): Number? = unwrap(this).getPriority()

  /**
   * A builder for [RemovalPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applyToResourceTypes Apply the removal policy only to specific resource types.
     * Can be a CloudFormation resource type string (e.g., 'AWS::S3::Bucket').
     */
    public fun applyToResourceTypes(applyToResourceTypes: List<String>)

    /**
     * @param applyToResourceTypes Apply the removal policy only to specific resource types.
     * Can be a CloudFormation resource type string (e.g., 'AWS::S3::Bucket').
     */
    public fun applyToResourceTypes(vararg applyToResourceTypes: String)

    /**
     * @param excludeResourceTypes Exclude specific resource types from the removal policy.
     * Can be a CloudFormation resource type string (e.g., 'AWS::S3::Bucket').
     */
    public fun excludeResourceTypes(excludeResourceTypes: List<String>)

    /**
     * @param excludeResourceTypes Exclude specific resource types from the removal policy.
     * Can be a CloudFormation resource type string (e.g., 'AWS::S3::Bucket').
     */
    public fun excludeResourceTypes(vararg excludeResourceTypes: String)

    /**
     * @param priority The priority to use when applying this policy.
     * The priority affects only the order in which aspects are applied during synthesis.
     * For RemovalPolicies, the last applied policy will override previous ones.
     *
     * NOTE: Priority does NOT determine which policy "wins" when there are conflicts.
     * The order of application determines the final policy, with later policies
     * overriding earlier ones.
     */
    public fun priority(priority: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.RemovalPolicyProps.Builder =
        software.amazon.awscdk.RemovalPolicyProps.builder()

    /**
     * @param applyToResourceTypes Apply the removal policy only to specific resource types.
     * Can be a CloudFormation resource type string (e.g., 'AWS::S3::Bucket').
     */
    override fun applyToResourceTypes(applyToResourceTypes: List<String>) {
      cdkBuilder.applyToResourceTypes(applyToResourceTypes)
    }

    /**
     * @param applyToResourceTypes Apply the removal policy only to specific resource types.
     * Can be a CloudFormation resource type string (e.g., 'AWS::S3::Bucket').
     */
    override fun applyToResourceTypes(vararg applyToResourceTypes: String): Unit =
        applyToResourceTypes(applyToResourceTypes.toList())

    /**
     * @param excludeResourceTypes Exclude specific resource types from the removal policy.
     * Can be a CloudFormation resource type string (e.g., 'AWS::S3::Bucket').
     */
    override fun excludeResourceTypes(excludeResourceTypes: List<String>) {
      cdkBuilder.excludeResourceTypes(excludeResourceTypes)
    }

    /**
     * @param excludeResourceTypes Exclude specific resource types from the removal policy.
     * Can be a CloudFormation resource type string (e.g., 'AWS::S3::Bucket').
     */
    override fun excludeResourceTypes(vararg excludeResourceTypes: String): Unit =
        excludeResourceTypes(excludeResourceTypes.toList())

    /**
     * @param priority The priority to use when applying this policy.
     * The priority affects only the order in which aspects are applied during synthesis.
     * For RemovalPolicies, the last applied policy will override previous ones.
     *
     * NOTE: Priority does NOT determine which policy "wins" when there are conflicts.
     * The order of application determines the final policy, with later policies
     * overriding earlier ones.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.RemovalPolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.RemovalPolicyProps,
  ) : CdkObject(cdkObject),
      RemovalPolicyProps {
    /**
     * Apply the removal policy only to specific resource types.
     *
     * Can be a CloudFormation resource type string (e.g., 'AWS::S3::Bucket').
     *
     * Default: - apply to all resources
     */
    override fun applyToResourceTypes(): List<String> = unwrap(this).getApplyToResourceTypes() ?:
        emptyList()

    /**
     * Exclude specific resource types from the removal policy.
     *
     * Can be a CloudFormation resource type string (e.g., 'AWS::S3::Bucket').
     *
     * Default: - no exclusions
     */
    override fun excludeResourceTypes(): List<String> = unwrap(this).getExcludeResourceTypes() ?:
        emptyList()

    /**
     * The priority to use when applying this policy.
     *
     * The priority affects only the order in which aspects are applied during synthesis.
     * For RemovalPolicies, the last applied policy will override previous ones.
     *
     * NOTE: Priority does NOT determine which policy "wins" when there are conflicts.
     * The order of application determines the final policy, with later policies
     * overriding earlier ones.
     *
     * Default: - AspectPriority.MUTATING
     */
    override fun priority(): Number? = unwrap(this).getPriority()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RemovalPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.RemovalPolicyProps): RemovalPolicyProps =
        CdkObjectWrappers.wrap(cdkObject) as? RemovalPolicyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: RemovalPolicyProps): software.amazon.awscdk.RemovalPolicyProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.RemovalPolicyProps
  }
}
