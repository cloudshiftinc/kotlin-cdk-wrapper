@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mpa

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new approval team.
 *
 * For more information, see [Approval
 * team](https://docs.aws.amazon.com/mpa/latest/userguide/mpa-concepts.html) in the *Multi-party
 * approval User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mpa.*;
 * CfnApprovalTeam cfnApprovalTeam = CfnApprovalTeam.Builder.create(this, "MyCfnApprovalTeam")
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
public open class CfnApprovalTeam(
  cdkObject: software.amazon.awscdk.services.mpa.CfnApprovalTeam,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApprovalTeamProps,
  ) :
      this(software.amazon.awscdk.services.mpa.CfnApprovalTeam(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApprovalTeamProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApprovalTeamProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApprovalTeamProps(props)
  )

  /**
   * Contains details for how an approval team grants approval.
   */
  public open fun approvalStrategy(): Any = unwrap(this).getApprovalStrategy()

  /**
   * Contains details for how an approval team grants approval.
   */
  public open fun approvalStrategy(`value`: IResolvable) {
    unwrap(this).setApprovalStrategy(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains details for how an approval team grants approval.
   */
  public open fun approvalStrategy(`value`: ApprovalStrategyProperty) {
    unwrap(this).setApprovalStrategy(`value`.let(ApprovalStrategyProperty.Companion::unwrap))
  }

  /**
   * Contains details for how an approval team grants approval.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9e85cfaef3b10fae84b6e170b4f8c15d866b93dae5eea2ed52389fc7b06238f7")
  public open fun approvalStrategy(`value`: ApprovalStrategyProperty.Builder.() -> Unit): Unit =
      approvalStrategy(ApprovalStrategyProperty(`value`))

  /**
   * Contains details for an approver.
   */
  public open fun approvers(): Any = unwrap(this).getApprovers()

  /**
   * Contains details for an approver.
   */
  public open fun approvers(`value`: IResolvable) {
    unwrap(this).setApprovers(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains details for an approver.
   */
  public open fun approvers(`value`: List<Any>) {
    unwrap(this).setApprovers(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Contains details for an approver.
   */
  public open fun approvers(vararg `value`: Any): Unit = approvers(`value`.toList())

  /**
   * Amazon Resource Name (ARN) for the team.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Timestamp when the team was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * Timestamp when the team was last updated.
   */
  public open fun attrLastUpdateTime(): String = unwrap(this).getAttrLastUpdateTime()

  /**
   * Total number of approvers in the team.
   */
  public open fun attrNumberOfApprovers(): Number = unwrap(this).getAttrNumberOfApprovers()

  /**
   * Status for the team.
   *
   * For more information, see [Team
   * health](https://docs.aws.amazon.com/mpa/latest/userguide/mpa-health.html) in the *Multi-party
   * approval User Guide* .
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Status code for the team.
   *
   * For more information, see [Team
   * health](https://docs.aws.amazon.com/mpa/latest/userguide/mpa-health.html) in the *Multi-party
   * approval User Guide* .
   */
  public open fun attrStatusCode(): String = unwrap(this).getAttrStatusCode()

  /**
   * Message describing the status for the team.
   */
  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  /**
   * Timestamp when the team was last updated.
   */
  public open fun attrUpdateSessionArn(): String = unwrap(this).getAttrUpdateSessionArn()

  /**
   * Version ID for the team.
   */
  public open fun attrVersionId(): String = unwrap(this).getAttrVersionId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Description for the team.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * Description for the team.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Name of the team.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Name of the team.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Contains details for a policy.
   */
  public open fun policies(): Any = unwrap(this).getPolicies()

  /**
   * Contains details for a policy.
   */
  public open fun policies(`value`: IResolvable) {
    unwrap(this).setPolicies(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains details for a policy.
   */
  public open fun policies(`value`: List<Any>) {
    unwrap(this).setPolicies(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Contains details for a policy.
   */
  public open fun policies(vararg `value`: Any): Unit = policies(`value`.toList())

  /**
   * Tags that you have added to the specified resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Tags that you have added to the specified resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Tags that you have added to the specified resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mpa.CfnApprovalTeam].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Contains details for how an approval team grants approval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-approvalstrategy)
     * @param approvalStrategy Contains details for how an approval team grants approval. 
     */
    public fun approvalStrategy(approvalStrategy: IResolvable)

    /**
     * Contains details for how an approval team grants approval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-approvalstrategy)
     * @param approvalStrategy Contains details for how an approval team grants approval. 
     */
    public fun approvalStrategy(approvalStrategy: ApprovalStrategyProperty)

    /**
     * Contains details for how an approval team grants approval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-approvalstrategy)
     * @param approvalStrategy Contains details for how an approval team grants approval. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d3988c45c3278c07c523a40140f4070b2bb0e21dc375ce35d20fed79621c330")
    public fun approvalStrategy(approvalStrategy: ApprovalStrategyProperty.Builder.() -> Unit)

    /**
     * Contains details for an approver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-approvers)
     * @param approvers Contains details for an approver. 
     */
    public fun approvers(approvers: IResolvable)

    /**
     * Contains details for an approver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-approvers)
     * @param approvers Contains details for an approver. 
     */
    public fun approvers(approvers: List<Any>)

    /**
     * Contains details for an approver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-approvers)
     * @param approvers Contains details for an approver. 
     */
    public fun approvers(vararg approvers: Any)

    /**
     * Description for the team.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-description)
     * @param description Description for the team. 
     */
    public fun description(description: String)

    /**
     * Name of the team.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-name)
     * @param name Name of the team. 
     */
    public fun name(name: String)

    /**
     * Contains details for a policy.
     *
     * Policies define what operations a team that define the permissions for team resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-policies)
     * @param policies Contains details for a policy. 
     */
    public fun policies(policies: IResolvable)

    /**
     * Contains details for a policy.
     *
     * Policies define what operations a team that define the permissions for team resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-policies)
     * @param policies Contains details for a policy. 
     */
    public fun policies(policies: List<Any>)

    /**
     * Contains details for a policy.
     *
     * Policies define what operations a team that define the permissions for team resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-policies)
     * @param policies Contains details for a policy. 
     */
    public fun policies(vararg policies: Any)

    /**
     * Tags that you have added to the specified resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-tags)
     * @param tags Tags that you have added to the specified resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags that you have added to the specified resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-tags)
     * @param tags Tags that you have added to the specified resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mpa.CfnApprovalTeam.Builder =
        software.amazon.awscdk.services.mpa.CfnApprovalTeam.Builder.create(scope, id)

    /**
     * Contains details for how an approval team grants approval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-approvalstrategy)
     * @param approvalStrategy Contains details for how an approval team grants approval. 
     */
    override fun approvalStrategy(approvalStrategy: IResolvable) {
      cdkBuilder.approvalStrategy(approvalStrategy.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains details for how an approval team grants approval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-approvalstrategy)
     * @param approvalStrategy Contains details for how an approval team grants approval. 
     */
    override fun approvalStrategy(approvalStrategy: ApprovalStrategyProperty) {
      cdkBuilder.approvalStrategy(approvalStrategy.let(ApprovalStrategyProperty.Companion::unwrap))
    }

    /**
     * Contains details for how an approval team grants approval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-approvalstrategy)
     * @param approvalStrategy Contains details for how an approval team grants approval. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d3988c45c3278c07c523a40140f4070b2bb0e21dc375ce35d20fed79621c330")
    override fun approvalStrategy(approvalStrategy: ApprovalStrategyProperty.Builder.() -> Unit):
        Unit = approvalStrategy(ApprovalStrategyProperty(approvalStrategy))

    /**
     * Contains details for an approver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-approvers)
     * @param approvers Contains details for an approver. 
     */
    override fun approvers(approvers: IResolvable) {
      cdkBuilder.approvers(approvers.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains details for an approver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-approvers)
     * @param approvers Contains details for an approver. 
     */
    override fun approvers(approvers: List<Any>) {
      cdkBuilder.approvers(approvers.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Contains details for an approver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-approvers)
     * @param approvers Contains details for an approver. 
     */
    override fun approvers(vararg approvers: Any): Unit = approvers(approvers.toList())

    /**
     * Description for the team.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-description)
     * @param description Description for the team. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Name of the team.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-name)
     * @param name Name of the team. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Contains details for a policy.
     *
     * Policies define what operations a team that define the permissions for team resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-policies)
     * @param policies Contains details for a policy. 
     */
    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains details for a policy.
     *
     * Policies define what operations a team that define the permissions for team resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-policies)
     * @param policies Contains details for a policy. 
     */
    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Contains details for a policy.
     *
     * Policies define what operations a team that define the permissions for team resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-policies)
     * @param policies Contains details for a policy. 
     */
    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    /**
     * Tags that you have added to the specified resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-tags)
     * @param tags Tags that you have added to the specified resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Tags that you have added to the specified resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mpa-approvalteam.html#cfn-mpa-approvalteam-tags)
     * @param tags Tags that you have added to the specified resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mpa.CfnApprovalTeam = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mpa.CfnApprovalTeam.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApprovalTeam {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApprovalTeam(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mpa.CfnApprovalTeam):
        CfnApprovalTeam = CfnApprovalTeam(cdkObject)

    internal fun unwrap(wrapped: CfnApprovalTeam):
        software.amazon.awscdk.services.mpa.CfnApprovalTeam = wrapped.cdkObject as
        software.amazon.awscdk.services.mpa.CfnApprovalTeam
  }

  /**
   * Strategy for how an approval team grants approval.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mpa.*;
   * ApprovalStrategyProperty approvalStrategyProperty = ApprovalStrategyProperty.builder()
   * .mofN(MofNApprovalStrategyProperty.builder()
   * .minApprovalsRequired(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-approvalstrategy.html)
   */
  public interface ApprovalStrategyProperty {
    /**
     * Minimum number of approvals (M) required for a total number of approvers (N).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-approvalstrategy.html#cfn-mpa-approvalteam-approvalstrategy-mofn)
     */
    public fun mofN(): Any

    /**
     * A builder for [ApprovalStrategyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mofN Minimum number of approvals (M) required for a total number of approvers (N). 
       */
      public fun mofN(mofN: IResolvable)

      /**
       * @param mofN Minimum number of approvals (M) required for a total number of approvers (N). 
       */
      public fun mofN(mofN: MofNApprovalStrategyProperty)

      /**
       * @param mofN Minimum number of approvals (M) required for a total number of approvers (N). 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7c0c323082fa89cf5bee59db2442ec7b96e44bb456c698e7c7c4fab8185ff24b")
      public fun mofN(mofN: MofNApprovalStrategyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.ApprovalStrategyProperty.Builder =
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.ApprovalStrategyProperty.builder()

      /**
       * @param mofN Minimum number of approvals (M) required for a total number of approvers (N). 
       */
      override fun mofN(mofN: IResolvable) {
        cdkBuilder.mofN(mofN.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mofN Minimum number of approvals (M) required for a total number of approvers (N). 
       */
      override fun mofN(mofN: MofNApprovalStrategyProperty) {
        cdkBuilder.mofN(mofN.let(MofNApprovalStrategyProperty.Companion::unwrap))
      }

      /**
       * @param mofN Minimum number of approvals (M) required for a total number of approvers (N). 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7c0c323082fa89cf5bee59db2442ec7b96e44bb456c698e7c7c4fab8185ff24b")
      override fun mofN(mofN: MofNApprovalStrategyProperty.Builder.() -> Unit): Unit =
          mofN(MofNApprovalStrategyProperty(mofN))

      public fun build():
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.ApprovalStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mpa.CfnApprovalTeam.ApprovalStrategyProperty,
    ) : CdkObject(cdkObject),
        ApprovalStrategyProperty {
      /**
       * Minimum number of approvals (M) required for a total number of approvers (N).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-approvalstrategy.html#cfn-mpa-approvalteam-approvalstrategy-mofn)
       */
      override fun mofN(): Any = unwrap(this).getMofN()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApprovalStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mpa.CfnApprovalTeam.ApprovalStrategyProperty):
          ApprovalStrategyProperty = CdkObjectWrappers.wrap(cdkObject) as? ApprovalStrategyProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApprovalStrategyProperty):
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.ApprovalStrategyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.ApprovalStrategyProperty
    }
  }

  /**
   * Contains details for an approver.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mpa.*;
   * ApproverProperty approverProperty = ApproverProperty.builder()
   * .primaryIdentityId("primaryIdentityId")
   * .primaryIdentitySourceArn("primaryIdentitySourceArn")
   * // the properties below are optional
   * .approverId("approverId")
   * .primaryIdentityStatus("primaryIdentityStatus")
   * .responseTime("responseTime")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-approver.html)
   */
  public interface ApproverProperty {
    /**
     * ID for the approver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-approver.html#cfn-mpa-approvalteam-approver-approverid)
     */
    public fun approverId(): String? = unwrap(this).getApproverId()

    /**
     * ID for the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-approver.html#cfn-mpa-approvalteam-approver-primaryidentityid)
     */
    public fun primaryIdentityId(): String

    /**
     * Amazon Resource Name (ARN) for the identity source.
     *
     * The identity source manages the user authentication for approvers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-approver.html#cfn-mpa-approvalteam-approver-primaryidentitysourcearn)
     */
    public fun primaryIdentitySourceArn(): String

    /**
     * Status for the identity source.
     *
     * For example, if an approver has accepted a team invitation with a user authentication method
     * managed by the identity source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-approver.html#cfn-mpa-approvalteam-approver-primaryidentitystatus)
     */
    public fun primaryIdentityStatus(): String? = unwrap(this).getPrimaryIdentityStatus()

    /**
     * Timestamp when the approver responded to an approval team invitation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-approver.html#cfn-mpa-approvalteam-approver-responsetime)
     */
    public fun responseTime(): String? = unwrap(this).getResponseTime()

    /**
     * A builder for [ApproverProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param approverId ID for the approver.
       */
      public fun approverId(approverId: String)

      /**
       * @param primaryIdentityId ID for the user. 
       */
      public fun primaryIdentityId(primaryIdentityId: String)

      /**
       * @param primaryIdentitySourceArn Amazon Resource Name (ARN) for the identity source. 
       * The identity source manages the user authentication for approvers.
       */
      public fun primaryIdentitySourceArn(primaryIdentitySourceArn: String)

      /**
       * @param primaryIdentityStatus Status for the identity source.
       * For example, if an approver has accepted a team invitation with a user authentication
       * method managed by the identity source.
       */
      public fun primaryIdentityStatus(primaryIdentityStatus: String)

      /**
       * @param responseTime Timestamp when the approver responded to an approval team invitation.
       */
      public fun responseTime(responseTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.ApproverProperty.Builder =
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.ApproverProperty.builder()

      /**
       * @param approverId ID for the approver.
       */
      override fun approverId(approverId: String) {
        cdkBuilder.approverId(approverId)
      }

      /**
       * @param primaryIdentityId ID for the user. 
       */
      override fun primaryIdentityId(primaryIdentityId: String) {
        cdkBuilder.primaryIdentityId(primaryIdentityId)
      }

      /**
       * @param primaryIdentitySourceArn Amazon Resource Name (ARN) for the identity source. 
       * The identity source manages the user authentication for approvers.
       */
      override fun primaryIdentitySourceArn(primaryIdentitySourceArn: String) {
        cdkBuilder.primaryIdentitySourceArn(primaryIdentitySourceArn)
      }

      /**
       * @param primaryIdentityStatus Status for the identity source.
       * For example, if an approver has accepted a team invitation with a user authentication
       * method managed by the identity source.
       */
      override fun primaryIdentityStatus(primaryIdentityStatus: String) {
        cdkBuilder.primaryIdentityStatus(primaryIdentityStatus)
      }

      /**
       * @param responseTime Timestamp when the approver responded to an approval team invitation.
       */
      override fun responseTime(responseTime: String) {
        cdkBuilder.responseTime(responseTime)
      }

      public fun build(): software.amazon.awscdk.services.mpa.CfnApprovalTeam.ApproverProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mpa.CfnApprovalTeam.ApproverProperty,
    ) : CdkObject(cdkObject),
        ApproverProperty {
      /**
       * ID for the approver.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-approver.html#cfn-mpa-approvalteam-approver-approverid)
       */
      override fun approverId(): String? = unwrap(this).getApproverId()

      /**
       * ID for the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-approver.html#cfn-mpa-approvalteam-approver-primaryidentityid)
       */
      override fun primaryIdentityId(): String = unwrap(this).getPrimaryIdentityId()

      /**
       * Amazon Resource Name (ARN) for the identity source.
       *
       * The identity source manages the user authentication for approvers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-approver.html#cfn-mpa-approvalteam-approver-primaryidentitysourcearn)
       */
      override fun primaryIdentitySourceArn(): String = unwrap(this).getPrimaryIdentitySourceArn()

      /**
       * Status for the identity source.
       *
       * For example, if an approver has accepted a team invitation with a user authentication
       * method managed by the identity source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-approver.html#cfn-mpa-approvalteam-approver-primaryidentitystatus)
       */
      override fun primaryIdentityStatus(): String? = unwrap(this).getPrimaryIdentityStatus()

      /**
       * Timestamp when the approver responded to an approval team invitation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-approver.html#cfn-mpa-approvalteam-approver-responsetime)
       */
      override fun responseTime(): String? = unwrap(this).getResponseTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApproverProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mpa.CfnApprovalTeam.ApproverProperty):
          ApproverProperty = CdkObjectWrappers.wrap(cdkObject) as? ApproverProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApproverProperty):
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.ApproverProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.ApproverProperty
    }
  }

  /**
   * Strategy for how an approval team grants approval.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mpa.*;
   * MofNApprovalStrategyProperty mofNApprovalStrategyProperty =
   * MofNApprovalStrategyProperty.builder()
   * .minApprovalsRequired(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-mofnapprovalstrategy.html)
   */
  public interface MofNApprovalStrategyProperty {
    /**
     * Minimum number of approvals (M) required for a total number of approvers (N).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-mofnapprovalstrategy.html#cfn-mpa-approvalteam-mofnapprovalstrategy-minapprovalsrequired)
     */
    public fun minApprovalsRequired(): Number

    /**
     * A builder for [MofNApprovalStrategyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param minApprovalsRequired Minimum number of approvals (M) required for a total number of
       * approvers (N). 
       */
      public fun minApprovalsRequired(minApprovalsRequired: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.MofNApprovalStrategyProperty.Builder =
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.MofNApprovalStrategyProperty.builder()

      /**
       * @param minApprovalsRequired Minimum number of approvals (M) required for a total number of
       * approvers (N). 
       */
      override fun minApprovalsRequired(minApprovalsRequired: Number) {
        cdkBuilder.minApprovalsRequired(minApprovalsRequired)
      }

      public fun build():
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.MofNApprovalStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mpa.CfnApprovalTeam.MofNApprovalStrategyProperty,
    ) : CdkObject(cdkObject),
        MofNApprovalStrategyProperty {
      /**
       * Minimum number of approvals (M) required for a total number of approvers (N).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-mofnapprovalstrategy.html#cfn-mpa-approvalteam-mofnapprovalstrategy-minapprovalsrequired)
       */
      override fun minApprovalsRequired(): Number = unwrap(this).getMinApprovalsRequired()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MofNApprovalStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mpa.CfnApprovalTeam.MofNApprovalStrategyProperty):
          MofNApprovalStrategyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MofNApprovalStrategyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MofNApprovalStrategyProperty):
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.MofNApprovalStrategyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.MofNApprovalStrategyProperty
    }
  }

  /**
   * Contains details for a policy.
   *
   * Policies define what operations a team that define the permissions for team resources.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mpa.*;
   * PolicyProperty policyProperty = PolicyProperty.builder()
   * .policyArn("policyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-policy.html)
   */
  public interface PolicyProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-policy.html#cfn-mpa-approvalteam-policy-policyarn)
     */
    public fun policyArn(): String

    /**
     * A builder for [PolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param policyArn the value to be set. 
       */
      public fun policyArn(policyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.PolicyProperty.Builder =
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.PolicyProperty.builder()

      /**
       * @param policyArn the value to be set. 
       */
      override fun policyArn(policyArn: String) {
        cdkBuilder.policyArn(policyArn)
      }

      public fun build(): software.amazon.awscdk.services.mpa.CfnApprovalTeam.PolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mpa.CfnApprovalTeam.PolicyProperty,
    ) : CdkObject(cdkObject),
        PolicyProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mpa-approvalteam-policy.html#cfn-mpa-approvalteam-policy-policyarn)
       */
      override fun policyArn(): String = unwrap(this).getPolicyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mpa.CfnApprovalTeam.PolicyProperty):
          PolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? PolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyProperty):
          software.amazon.awscdk.services.mpa.CfnApprovalTeam.PolicyProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.mpa.CfnApprovalTeam.PolicyProperty
    }
  }
}
