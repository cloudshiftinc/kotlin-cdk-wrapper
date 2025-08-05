@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mpa

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApprovalTeam`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mpa.*;
 * CfnApprovalTeamProps cfnApprovalTeamProps = CfnApprovalTeamProps.builder()
 * .approvalStrategy(ApprovalStrategyProperty.builder()
 * .mofN(MofNApprovalStrategyProperty.builder()
 * .minApprovalsRequired(123)
 * .build())
 * .build())
 * .approvers(List.of(ApproverProperty.builder()
 * .primaryIdentityId("primaryIdentityId")
 * .primaryIdentitySourceArn("primaryIdentitySourceArn")
 * // the properties below are optional
 * .approverId("approverId")
 * .primaryIdentityStatus("primaryIdentityStatus")
 * .responseTime("responseTime")
 * .build()))
 * .description("description")
 * .name("name")
 * .policies(List.of(PolicyProperty.builder()
 * .policyArn("policyArn")
 * .build()))
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html)
 */
public interface CfnApprovalTeamProps {
  /**
   * Contains details for how an approval team grants approval.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-approvalstrategy)
   */
  public fun approvalStrategy(): Any

  /**
   * Contains details for an approver.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-approvers)
   */
  public fun approvers(): Any

  /**
   * Description for the team.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-description)
   */
  public fun description(): String

  /**
   * Name of the team.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-name)
   */
  public fun name(): String

  /**
   * Contains details for a policy.
   *
   * Policies define what operations a team that define the permissions for team resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-policies)
   */
  public fun policies(): Any

  /**
   * Tags that you have added to the specified resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnApprovalTeamProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param approvalStrategy Contains details for how an approval team grants approval. 
     */
    public fun approvalStrategy(approvalStrategy: IResolvable)

    /**
     * @param approvalStrategy Contains details for how an approval team grants approval. 
     */
    public fun approvalStrategy(approvalStrategy: CfnApprovalTeam.ApprovalStrategyProperty)

    /**
     * @param approvalStrategy Contains details for how an approval team grants approval. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52b5aefd0429086251110b9b9895942014bf4c45bd91caf8f24f1aa89dab61a7")
    public
        fun approvalStrategy(approvalStrategy: CfnApprovalTeam.ApprovalStrategyProperty.Builder.() -> Unit)

    /**
     * @param approvers Contains details for an approver. 
     */
    public fun approvers(approvers: IResolvable)

    /**
     * @param approvers Contains details for an approver. 
     */
    public fun approvers(approvers: List<Any>)

    /**
     * @param approvers Contains details for an approver. 
     */
    public fun approvers(vararg approvers: Any)

    /**
     * @param description Description for the team. 
     */
    public fun description(description: String)

    /**
     * @param name Name of the team. 
     */
    public fun name(name: String)

    /**
     * @param policies Contains details for a policy. 
     * Policies define what operations a team that define the permissions for team resources.
     */
    public fun policies(policies: IResolvable)

    /**
     * @param policies Contains details for a policy. 
     * Policies define what operations a team that define the permissions for team resources.
     */
    public fun policies(policies: List<Any>)

    /**
     * @param policies Contains details for a policy. 
     * Policies define what operations a team that define the permissions for team resources.
     */
    public fun policies(vararg policies: Any)

    /**
     * @param tags Tags that you have added to the specified resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags that you have added to the specified resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mpa.CfnApprovalTeamProps.Builder =
        software.amazon.awscdk.services.mpa.CfnApprovalTeamProps.builder()

    /**
     * @param approvalStrategy Contains details for how an approval team grants approval. 
     */
    override fun approvalStrategy(approvalStrategy: IResolvable) {
      cdkBuilder.approvalStrategy(approvalStrategy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param approvalStrategy Contains details for how an approval team grants approval. 
     */
    override fun approvalStrategy(approvalStrategy: CfnApprovalTeam.ApprovalStrategyProperty) {
      cdkBuilder.approvalStrategy(approvalStrategy.let(CfnApprovalTeam.ApprovalStrategyProperty.Companion::unwrap))
    }

    /**
     * @param approvalStrategy Contains details for how an approval team grants approval. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52b5aefd0429086251110b9b9895942014bf4c45bd91caf8f24f1aa89dab61a7")
    override
        fun approvalStrategy(approvalStrategy: CfnApprovalTeam.ApprovalStrategyProperty.Builder.() -> Unit):
        Unit = approvalStrategy(CfnApprovalTeam.ApprovalStrategyProperty(approvalStrategy))

    /**
     * @param approvers Contains details for an approver. 
     */
    override fun approvers(approvers: IResolvable) {
      cdkBuilder.approvers(approvers.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param approvers Contains details for an approver. 
     */
    override fun approvers(approvers: List<Any>) {
      cdkBuilder.approvers(approvers.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param approvers Contains details for an approver. 
     */
    override fun approvers(vararg approvers: Any): Unit = approvers(approvers.toList())

    /**
     * @param description Description for the team. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name Name of the team. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param policies Contains details for a policy. 
     * Policies define what operations a team that define the permissions for team resources.
     */
    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param policies Contains details for a policy. 
     * Policies define what operations a team that define the permissions for team resources.
     */
    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param policies Contains details for a policy. 
     * Policies define what operations a team that define the permissions for team resources.
     */
    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    /**
     * @param tags Tags that you have added to the specified resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags that you have added to the specified resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mpa.CfnApprovalTeamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mpa.CfnApprovalTeamProps,
  ) : CdkObject(cdkObject),
      CfnApprovalTeamProps {
    /**
     * Contains details for how an approval team grants approval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-approvalstrategy)
     */
    override fun approvalStrategy(): Any = unwrap(this).getApprovalStrategy()

    /**
     * Contains details for an approver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-approvers)
     */
    override fun approvers(): Any = unwrap(this).getApprovers()

    /**
     * Description for the team.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * Name of the team.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Contains details for a policy.
     *
     * Policies define what operations a team that define the permissions for team resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-policies)
     */
    override fun policies(): Any = unwrap(this).getPolicies()

    /**
     * Tags that you have added to the specified resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApprovalTeamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mpa.CfnApprovalTeamProps):
        CfnApprovalTeamProps = CdkObjectWrappers.wrap(cdkObject) as? CfnApprovalTeamProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApprovalTeamProps):
        software.amazon.awscdk.services.mpa.CfnApprovalTeamProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.mpa.CfnApprovalTeamProps
  }
}
