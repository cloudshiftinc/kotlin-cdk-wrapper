@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.detective

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Detective::MemberInvitation` resource is an Amazon Detective resource type that creates
 * an invitation to join a Detective behavior graph.
 *
 * The administrator account can choose whether to send an email notification of the invitation to
 * the root user email address of the AWS account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.detective.*;
 * CfnMemberInvitation cfnMemberInvitation = CfnMemberInvitation.Builder.create(this,
 * "MyCfnMemberInvitation")
 * .graphArn("graphArn")
 * .memberEmailAddress("memberEmailAddress")
 * .memberId("memberId")
 * // the properties below are optional
 * .disableEmailNotification(false)
 * .message("message")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html)
 */
public open class CfnMemberInvitation(
  cdkObject: software.amazon.awscdk.services.detective.CfnMemberInvitation,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMemberInvitationProps,
  ) :
      this(software.amazon.awscdk.services.detective.CfnMemberInvitation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnMemberInvitationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMemberInvitationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMemberInvitationProps(props)
  )

  /**
   * Whether to send an invitation email to the member account.
   */
  public open fun disableEmailNotification(): Any? = unwrap(this).getDisableEmailNotification()

  /**
   * Whether to send an invitation email to the member account.
   */
  public open fun disableEmailNotification(`value`: Boolean) {
    unwrap(this).setDisableEmailNotification(`value`)
  }

  /**
   * Whether to send an invitation email to the member account.
   */
  public open fun disableEmailNotification(`value`: IResolvable) {
    unwrap(this).setDisableEmailNotification(`value`.let(IResolvable::unwrap))
  }

  /**
   * The ARN of the behavior graph to invite the account to contribute data to.
   */
  public open fun graphArn(): String = unwrap(this).getGraphArn()

  /**
   * The ARN of the behavior graph to invite the account to contribute data to.
   */
  public open fun graphArn(`value`: String) {
    unwrap(this).setGraphArn(`value`)
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
   * The root user email address of the invited account.
   */
  public open fun memberEmailAddress(): String = unwrap(this).getMemberEmailAddress()

  /**
   * The root user email address of the invited account.
   */
  public open fun memberEmailAddress(`value`: String) {
    unwrap(this).setMemberEmailAddress(`value`)
  }

  /**
   * The AWS account identifier of the invited account.
   */
  public open fun memberId(): String = unwrap(this).getMemberId()

  /**
   * The AWS account identifier of the invited account.
   */
  public open fun memberId(`value`: String) {
    unwrap(this).setMemberId(`value`)
  }

  /**
   * Customized text to include in the invitation email message.
   */
  public open fun message(): String? = unwrap(this).getMessage()

  /**
   * Customized text to include in the invitation email message.
   */
  public open fun message(`value`: String) {
    unwrap(this).setMessage(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.detective.CfnMemberInvitation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether to send an invitation email to the member account.
     *
     * If set to true, the member account does not receive an invitation email.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-disableemailnotification)
     * @param disableEmailNotification Whether to send an invitation email to the member account. 
     */
    public fun disableEmailNotification(disableEmailNotification: Boolean)

    /**
     * Whether to send an invitation email to the member account.
     *
     * If set to true, the member account does not receive an invitation email.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-disableemailnotification)
     * @param disableEmailNotification Whether to send an invitation email to the member account. 
     */
    public fun disableEmailNotification(disableEmailNotification: IResolvable)

    /**
     * The ARN of the behavior graph to invite the account to contribute data to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-grapharn)
     * @param graphArn The ARN of the behavior graph to invite the account to contribute data to. 
     */
    public fun graphArn(graphArn: String)

    /**
     * The root user email address of the invited account.
     *
     * If the email address provided is not the root user email address for the provided account,
     * the invitation creation fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberemailaddress)
     * @param memberEmailAddress The root user email address of the invited account. 
     */
    public fun memberEmailAddress(memberEmailAddress: String)

    /**
     * The AWS account identifier of the invited account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberid)
     * @param memberId The AWS account identifier of the invited account. 
     */
    public fun memberId(memberId: String)

    /**
     * Customized text to include in the invitation email message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-message)
     * @param message Customized text to include in the invitation email message. 
     */
    public fun message(message: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.detective.CfnMemberInvitation.Builder =
        software.amazon.awscdk.services.detective.CfnMemberInvitation.Builder.create(scope, id)

    /**
     * Whether to send an invitation email to the member account.
     *
     * If set to true, the member account does not receive an invitation email.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-disableemailnotification)
     * @param disableEmailNotification Whether to send an invitation email to the member account. 
     */
    override fun disableEmailNotification(disableEmailNotification: Boolean) {
      cdkBuilder.disableEmailNotification(disableEmailNotification)
    }

    /**
     * Whether to send an invitation email to the member account.
     *
     * If set to true, the member account does not receive an invitation email.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-disableemailnotification)
     * @param disableEmailNotification Whether to send an invitation email to the member account. 
     */
    override fun disableEmailNotification(disableEmailNotification: IResolvable) {
      cdkBuilder.disableEmailNotification(disableEmailNotification.let(IResolvable::unwrap))
    }

    /**
     * The ARN of the behavior graph to invite the account to contribute data to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-grapharn)
     * @param graphArn The ARN of the behavior graph to invite the account to contribute data to. 
     */
    override fun graphArn(graphArn: String) {
      cdkBuilder.graphArn(graphArn)
    }

    /**
     * The root user email address of the invited account.
     *
     * If the email address provided is not the root user email address for the provided account,
     * the invitation creation fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberemailaddress)
     * @param memberEmailAddress The root user email address of the invited account. 
     */
    override fun memberEmailAddress(memberEmailAddress: String) {
      cdkBuilder.memberEmailAddress(memberEmailAddress)
    }

    /**
     * The AWS account identifier of the invited account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberid)
     * @param memberId The AWS account identifier of the invited account. 
     */
    override fun memberId(memberId: String) {
      cdkBuilder.memberId(memberId)
    }

    /**
     * Customized text to include in the invitation email message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-message)
     * @param message Customized text to include in the invitation email message. 
     */
    override fun message(message: String) {
      cdkBuilder.message(message)
    }

    public fun build(): software.amazon.awscdk.services.detective.CfnMemberInvitation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.detective.CfnMemberInvitation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMemberInvitation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMemberInvitation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.detective.CfnMemberInvitation):
        CfnMemberInvitation = CfnMemberInvitation(cdkObject)

    internal fun unwrap(wrapped: CfnMemberInvitation):
        software.amazon.awscdk.services.detective.CfnMemberInvitation = wrapped.cdkObject as
        software.amazon.awscdk.services.detective.CfnMemberInvitation
  }
}
