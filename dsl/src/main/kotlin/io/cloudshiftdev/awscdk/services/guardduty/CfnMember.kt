package io.cloudshiftdev.awscdk.services.guardduty

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

public open class CfnMember internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.guardduty.CfnMember,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ID of the detector associated with the GuardDuty service to add the member to.
   */
  public open fun detectorId(): String? = unwrap(this).getDetectorId()

  /**
   * The ID of the detector associated with the GuardDuty service to add the member to.
   */
  public open fun detectorId(`value`: String) {
    unwrap(this).setDetectorId(`value`)
  }

  /**
   * Specifies whether or not to disable email notification for the member account that you invite.
   */
  public open fun disableEmailNotification(): Any? = unwrap(this).getDisableEmailNotification()

  /**
   * Specifies whether or not to disable email notification for the member account that you invite.
   */
  public open fun disableEmailNotification(`value`: Boolean) {
    unwrap(this).setDisableEmailNotification(`value`)
  }

  /**
   * Specifies whether or not to disable email notification for the member account that you invite.
   */
  public open fun disableEmailNotification(`value`: IResolvable) {
    unwrap(this).setDisableEmailNotification(`value`.let(IResolvable::unwrap))
  }

  /**
   * The email address associated with the member account.
   */
  public open fun email(): String = unwrap(this).getEmail()

  /**
   * The email address associated with the member account.
   */
  public open fun email(`value`: String) {
    unwrap(this).setEmail(`value`)
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
   * The AWS account ID of the account to designate as a member.
   */
  public open fun memberId(): String? = unwrap(this).getMemberId()

  /**
   * The AWS account ID of the account to designate as a member.
   */
  public open fun memberId(`value`: String) {
    unwrap(this).setMemberId(`value`)
  }

  /**
   * The invitation message that you want to send to the accounts that you're inviting to GuardDuty
   * as members.
   */
  public open fun message(): String? = unwrap(this).getMessage()

  /**
   * The invitation message that you want to send to the accounts that you're inviting to GuardDuty
   * as members.
   */
  public open fun message(`value`: String) {
    unwrap(this).setMessage(`value`)
  }

  /**
   * You can use the `Status` property to update the status of the relationship between the member
   * account and its administrator account.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * You can use the `Status` property to update the status of the relationship between the member
   * account and its administrator account.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.guardduty.CfnMember].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the detector associated with the GuardDuty service to add the member to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-detectorid)
     * @param detectorId The ID of the detector associated with the GuardDuty service to add the
     * member to. 
     */
    public fun detectorId(detectorId: String)

    /**
     * Specifies whether or not to disable email notification for the member account that you
     * invite.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-disableemailnotification)
     * @param disableEmailNotification Specifies whether or not to disable email notification for
     * the member account that you invite. 
     */
    public fun disableEmailNotification(disableEmailNotification: Boolean)

    /**
     * Specifies whether or not to disable email notification for the member account that you
     * invite.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-disableemailnotification)
     * @param disableEmailNotification Specifies whether or not to disable email notification for
     * the member account that you invite. 
     */
    public fun disableEmailNotification(disableEmailNotification: IResolvable)

    /**
     * The email address associated with the member account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-email)
     * @param email The email address associated with the member account. 
     */
    public fun email(email: String)

    /**
     * The AWS account ID of the account to designate as a member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-memberid)
     * @param memberId The AWS account ID of the account to designate as a member. 
     */
    public fun memberId(memberId: String)

    /**
     * The invitation message that you want to send to the accounts that you're inviting to
     * GuardDuty as members.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-message)
     * @param message The invitation message that you want to send to the accounts that you're
     * inviting to GuardDuty as members. 
     */
    public fun message(message: String)

    /**
     * You can use the `Status` property to update the status of the relationship between the member
     * account and its administrator account.
     *
     * Valid values are `Created` and `Invited` when using an `AWS::GuardDuty::Member` resource. If
     * the value for this property is not provided or set to `Created` , a member account is created
     * but not invited. If the value of this property is set to `Invited` , a member account is created
     * and invited.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-status)
     * @param status You can use the `Status` property to update the status of the relationship
     * between the member account and its administrator account. 
     */
    public fun status(status: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnMember.Builder =
        software.amazon.awscdk.services.guardduty.CfnMember.Builder.create(scope, id)

    /**
     * The ID of the detector associated with the GuardDuty service to add the member to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-detectorid)
     * @param detectorId The ID of the detector associated with the GuardDuty service to add the
     * member to. 
     */
    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    /**
     * Specifies whether or not to disable email notification for the member account that you
     * invite.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-disableemailnotification)
     * @param disableEmailNotification Specifies whether or not to disable email notification for
     * the member account that you invite. 
     */
    override fun disableEmailNotification(disableEmailNotification: Boolean) {
      cdkBuilder.disableEmailNotification(disableEmailNotification)
    }

    /**
     * Specifies whether or not to disable email notification for the member account that you
     * invite.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-disableemailnotification)
     * @param disableEmailNotification Specifies whether or not to disable email notification for
     * the member account that you invite. 
     */
    override fun disableEmailNotification(disableEmailNotification: IResolvable) {
      cdkBuilder.disableEmailNotification(disableEmailNotification.let(IResolvable::unwrap))
    }

    /**
     * The email address associated with the member account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-email)
     * @param email The email address associated with the member account. 
     */
    override fun email(email: String) {
      cdkBuilder.email(email)
    }

    /**
     * The AWS account ID of the account to designate as a member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-memberid)
     * @param memberId The AWS account ID of the account to designate as a member. 
     */
    override fun memberId(memberId: String) {
      cdkBuilder.memberId(memberId)
    }

    /**
     * The invitation message that you want to send to the accounts that you're inviting to
     * GuardDuty as members.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-message)
     * @param message The invitation message that you want to send to the accounts that you're
     * inviting to GuardDuty as members. 
     */
    override fun message(message: String) {
      cdkBuilder.message(message)
    }

    /**
     * You can use the `Status` property to update the status of the relationship between the member
     * account and its administrator account.
     *
     * Valid values are `Created` and `Invited` when using an `AWS::GuardDuty::Member` resource. If
     * the value for this property is not provided or set to `Created` , a member account is created
     * but not invited. If the value of this property is set to `Invited` , a member account is created
     * and invited.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-status)
     * @param status You can use the `Status` property to update the status of the relationship
     * between the member account and its administrator account. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.guardduty.CfnMember = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMember {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMember(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnMember): CfnMember =
        CfnMember(cdkObject)

    internal fun unwrap(wrapped: CfnMember): software.amazon.awscdk.services.guardduty.CfnMember =
        wrapped.cdkObject
  }
}
