@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resiliencehub

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnResiliencyPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.resiliencehub.*;
 * CfnResiliencyPolicyProps cfnResiliencyPolicyProps = CfnResiliencyPolicyProps.builder()
 * .policy(Map.of(
 * "policyKey", FailurePolicyProperty.builder()
 * .rpoInSecs(123)
 * .rtoInSecs(123)
 * .build()))
 * .policyName("policyName")
 * .tier("tier")
 * // the properties below are optional
 * .dataLocationConstraint("dataLocationConstraint")
 * .policyDescription("policyDescription")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html)
 */
public interface CfnResiliencyPolicyProps {
  /**
   * Specifies a high-level geographical location constraint for where your resilience policy data
   * can be stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-datalocationconstraint)
   */
  public fun dataLocationConstraint(): String? = unwrap(this).getDataLocationConstraint()

  /**
   * The resiliency policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policy)
   */
  public fun policy(): Any

  /**
   * The description for the policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policydescription)
   */
  public fun policyDescription(): String? = unwrap(this).getPolicyDescription()

  /**
   * The name of the policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policyname)
   */
  public fun policyName(): String

  /**
   * Tags assigned to the resource.
   *
   * A tag is a label that you assign to an AWS resource. Each tag consists of a key/value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The tier for this resiliency policy, ranging from the highest severity ( `MissionCritical` ) to
   * lowest ( `NonCritical` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-tier)
   */
  public fun tier(): String

  /**
   * A builder for [CfnResiliencyPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataLocationConstraint Specifies a high-level geographical location constraint for
     * where your resilience policy data can be stored.
     */
    public fun dataLocationConstraint(dataLocationConstraint: String)

    /**
     * @param policy The resiliency policy. 
     */
    public fun policy(policy: IResolvable)

    /**
     * @param policy The resiliency policy. 
     */
    public fun policy(policy: Map<String, Any>)

    /**
     * @param policyDescription The description for the policy.
     */
    public fun policyDescription(policyDescription: String)

    /**
     * @param policyName The name of the policy. 
     */
    public fun policyName(policyName: String)

    /**
     * @param tags Tags assigned to the resource.
     * A tag is a label that you assign to an AWS resource. Each tag consists of a key/value pair.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param tier The tier for this resiliency policy, ranging from the highest severity (
     * `MissionCritical` ) to lowest ( `NonCritical` ). 
     */
    public fun tier(tier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps.Builder =
        software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps.builder()

    /**
     * @param dataLocationConstraint Specifies a high-level geographical location constraint for
     * where your resilience policy data can be stored.
     */
    override fun dataLocationConstraint(dataLocationConstraint: String) {
      cdkBuilder.dataLocationConstraint(dataLocationConstraint)
    }

    /**
     * @param policy The resiliency policy. 
     */
    override fun policy(policy: IResolvable) {
      cdkBuilder.policy(policy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param policy The resiliency policy. 
     */
    override fun policy(policy: Map<String, Any>) {
      cdkBuilder.policy(policy.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param policyDescription The description for the policy.
     */
    override fun policyDescription(policyDescription: String) {
      cdkBuilder.policyDescription(policyDescription)
    }

    /**
     * @param policyName The name of the policy. 
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * @param tags Tags assigned to the resource.
     * A tag is a label that you assign to an AWS resource. Each tag consists of a key/value pair.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param tier The tier for this resiliency policy, ranging from the highest severity (
     * `MissionCritical` ) to lowest ( `NonCritical` ). 
     */
    override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    public fun build(): software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps,
  ) : CdkObject(cdkObject),
      CfnResiliencyPolicyProps {
    /**
     * Specifies a high-level geographical location constraint for where your resilience policy data
     * can be stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-datalocationconstraint)
     */
    override fun dataLocationConstraint(): String? = unwrap(this).getDataLocationConstraint()

    /**
     * The resiliency policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policy)
     */
    override fun policy(): Any = unwrap(this).getPolicy()

    /**
     * The description for the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policydescription)
     */
    override fun policyDescription(): String? = unwrap(this).getPolicyDescription()

    /**
     * The name of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policyname)
     */
    override fun policyName(): String = unwrap(this).getPolicyName()

    /**
     * Tags assigned to the resource.
     *
     * A tag is a label that you assign to an AWS resource. Each tag consists of a key/value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The tier for this resiliency policy, ranging from the highest severity ( `MissionCritical` )
     * to lowest ( `NonCritical` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-tier)
     */
    override fun tier(): String = unwrap(this).getTier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResiliencyPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps):
        CfnResiliencyPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnResiliencyPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResiliencyPolicyProps):
        software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps
  }
}
