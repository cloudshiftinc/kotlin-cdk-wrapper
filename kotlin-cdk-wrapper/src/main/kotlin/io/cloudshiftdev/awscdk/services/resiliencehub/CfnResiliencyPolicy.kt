@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resiliencehub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Defines a resiliency policy.
 *
 *
 * AWS Resilience Hub allows you to provide a value of zero for `rtoInSecs` and `rpoInSecs` of your
 * resiliency policy. But, while assessing your application, the lowest possible assessment result is
 * near zero. Hence, if you provide value zero for `rtoInSecs` and `rpoInSecs` , the estimated workload
 * RTO and estimated workload RPO result will be near zero and the *Compliance status* for your
 * application will be set to *Policy breached* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.resiliencehub.*;
 * CfnResiliencyPolicy cfnResiliencyPolicy = CfnResiliencyPolicy.Builder.create(this,
 * "MyCfnResiliencyPolicy")
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
public open class CfnResiliencyPolicy internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Amazon Resource Name (ARN) of the resiliency policy.
   */
  public open fun attrPolicyArn(): String = unwrap(this).getAttrPolicyArn()

  /**
   * Specifies a high-level geographical location constraint for where your resilience policy data
   * can be stored.
   */
  public open fun dataLocationConstraint(): String? = unwrap(this).getDataLocationConstraint()

  /**
   * Specifies a high-level geographical location constraint for where your resilience policy data
   * can be stored.
   */
  public open fun dataLocationConstraint(`value`: String) {
    unwrap(this).setDataLocationConstraint(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The resiliency policy.
   */
  public open fun policy(): Any = unwrap(this).getPolicy()

  /**
   * The resiliency policy.
   */
  public open fun policy(`value`: IResolvable) {
    unwrap(this).setPolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * The resiliency policy.
   */
  public open fun policy(`value`: Map<String, Any>) {
    unwrap(this).setPolicy(`value`)
  }

  /**
   * The description for the policy.
   */
  public open fun policyDescription(): String? = unwrap(this).getPolicyDescription()

  /**
   * The description for the policy.
   */
  public open fun policyDescription(`value`: String) {
    unwrap(this).setPolicyDescription(`value`)
  }

  /**
   * The name of the policy.
   */
  public open fun policyName(): String = unwrap(this).getPolicyName()

  /**
   * The name of the policy.
   */
  public open fun policyName(`value`: String) {
    unwrap(this).setPolicyName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags assigned to the resource.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * Tags assigned to the resource.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The tier for this resiliency policy, ranging from the highest severity ( `MissionCritical` ) to
   * lowest ( `NonCritical` ).
   */
  public open fun tier(): String = unwrap(this).getTier()

  /**
   * The tier for this resiliency policy, ranging from the highest severity ( `MissionCritical` ) to
   * lowest ( `NonCritical` ).
   */
  public open fun tier(`value`: String) {
    unwrap(this).setTier(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.resiliencehub.CfnResiliencyPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies a high-level geographical location constraint for where your resilience policy data
     * can be stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-datalocationconstraint)
     * @param dataLocationConstraint Specifies a high-level geographical location constraint for
     * where your resilience policy data can be stored. 
     */
    public fun dataLocationConstraint(dataLocationConstraint: String)

    /**
     * The resiliency policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policy)
     * @param policy The resiliency policy. 
     */
    public fun policy(policy: IResolvable)

    /**
     * The resiliency policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policy)
     * @param policy The resiliency policy. 
     */
    public fun policy(policy: Map<String, Any>)

    /**
     * The description for the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policydescription)
     * @param policyDescription The description for the policy. 
     */
    public fun policyDescription(policyDescription: String)

    /**
     * The name of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policyname)
     * @param policyName The name of the policy. 
     */
    public fun policyName(policyName: String)

    /**
     * Tags assigned to the resource.
     *
     * A tag is a label that you assign to an AWS resource. Each tag consists of a key/value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-tags)
     * @param tags Tags assigned to the resource. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The tier for this resiliency policy, ranging from the highest severity ( `MissionCritical` )
     * to lowest ( `NonCritical` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-tier)
     * @param tier The tier for this resiliency policy, ranging from the highest severity (
     * `MissionCritical` ) to lowest ( `NonCritical` ). 
     */
    public fun tier(tier: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.Builder =
        software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.Builder.create(scope, id)

    /**
     * Specifies a high-level geographical location constraint for where your resilience policy data
     * can be stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-datalocationconstraint)
     * @param dataLocationConstraint Specifies a high-level geographical location constraint for
     * where your resilience policy data can be stored. 
     */
    override fun dataLocationConstraint(dataLocationConstraint: String) {
      cdkBuilder.dataLocationConstraint(dataLocationConstraint)
    }

    /**
     * The resiliency policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policy)
     * @param policy The resiliency policy. 
     */
    override fun policy(policy: IResolvable) {
      cdkBuilder.policy(policy.let(IResolvable::unwrap))
    }

    /**
     * The resiliency policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policy)
     * @param policy The resiliency policy. 
     */
    override fun policy(policy: Map<String, Any>) {
      cdkBuilder.policy(policy)
    }

    /**
     * The description for the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policydescription)
     * @param policyDescription The description for the policy. 
     */
    override fun policyDescription(policyDescription: String) {
      cdkBuilder.policyDescription(policyDescription)
    }

    /**
     * The name of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-policyname)
     * @param policyName The name of the policy. 
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * Tags assigned to the resource.
     *
     * A tag is a label that you assign to an AWS resource. Each tag consists of a key/value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-tags)
     * @param tags Tags assigned to the resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The tier for this resiliency policy, ranging from the highest severity ( `MissionCritical` )
     * to lowest ( `NonCritical` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resiliencehub-resiliencypolicy.html#cfn-resiliencehub-resiliencypolicy-tier)
     * @param tier The tier for this resiliency policy, ranging from the highest severity (
     * `MissionCritical` ) to lowest ( `NonCritical` ). 
     */
    override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    public fun build(): software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResiliencyPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResiliencyPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy):
        CfnResiliencyPolicy = CfnResiliencyPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnResiliencyPolicy):
        software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy = wrapped.cdkObject
  }

  /**
   * Defines a failure policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.resiliencehub.*;
   * FailurePolicyProperty failurePolicyProperty = FailurePolicyProperty.builder()
   * .rpoInSecs(123)
   * .rtoInSecs(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-resiliencypolicy-failurepolicy.html)
   */
  public interface FailurePolicyProperty {
    /**
     * Recovery Point Objective (RPO) in seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-resiliencypolicy-failurepolicy.html#cfn-resiliencehub-resiliencypolicy-failurepolicy-rpoinsecs)
     */
    public fun rpoInSecs(): Number

    /**
     * Recovery Time Objective (RTO) in seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-resiliencypolicy-failurepolicy.html#cfn-resiliencehub-resiliencypolicy-failurepolicy-rtoinsecs)
     */
    public fun rtoInSecs(): Number

    /**
     * A builder for [FailurePolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rpoInSecs Recovery Point Objective (RPO) in seconds. 
       */
      public fun rpoInSecs(rpoInSecs: Number)

      /**
       * @param rtoInSecs Recovery Time Objective (RTO) in seconds. 
       */
      public fun rtoInSecs(rtoInSecs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.FailurePolicyProperty.Builder
          =
          software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.FailurePolicyProperty.builder()

      /**
       * @param rpoInSecs Recovery Point Objective (RPO) in seconds. 
       */
      override fun rpoInSecs(rpoInSecs: Number) {
        cdkBuilder.rpoInSecs(rpoInSecs)
      }

      /**
       * @param rtoInSecs Recovery Time Objective (RTO) in seconds. 
       */
      override fun rtoInSecs(rtoInSecs: Number) {
        cdkBuilder.rtoInSecs(rtoInSecs)
      }

      public fun build():
          software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.FailurePolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.FailurePolicyProperty,
    ) : CdkObject(cdkObject), FailurePolicyProperty {
      /**
       * Recovery Point Objective (RPO) in seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-resiliencypolicy-failurepolicy.html#cfn-resiliencehub-resiliencypolicy-failurepolicy-rpoinsecs)
       */
      override fun rpoInSecs(): Number = unwrap(this).getRpoInSecs()

      /**
       * Recovery Time Objective (RTO) in seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-resiliencypolicy-failurepolicy.html#cfn-resiliencehub-resiliencypolicy-failurepolicy-rtoinsecs)
       */
      override fun rtoInSecs(): Number = unwrap(this).getRtoInSecs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FailurePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.FailurePolicyProperty):
          FailurePolicyProperty = CdkObjectWrappers.wrap(cdkObject) as FailurePolicyProperty

      internal fun unwrap(wrapped: FailurePolicyProperty):
          software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.FailurePolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.FailurePolicyProperty
    }
  }
}
