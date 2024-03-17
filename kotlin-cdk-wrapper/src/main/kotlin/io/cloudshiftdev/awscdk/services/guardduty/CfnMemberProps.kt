@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnMember`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.guardduty.*;
 * CfnMemberProps cfnMemberProps = CfnMemberProps.builder()
 * .email("email")
 * // the properties below are optional
 * .detectorId("detectorId")
 * .disableEmailNotification(false)
 * .memberId("memberId")
 * .message("message")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html)
 */
public interface CfnMemberProps {
  /**
   * The ID of the detector associated with the GuardDuty service to add the member to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-detectorid)
   */
  public fun detectorId(): String? = unwrap(this).getDetectorId()

  /**
   * Specifies whether or not to disable email notification for the member account that you invite.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-disableemailnotification)
   */
  public fun disableEmailNotification(): Any? = unwrap(this).getDisableEmailNotification()

  /**
   * The email address associated with the member account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-email)
   */
  public fun email(): String

  /**
   * The AWS account ID of the account to designate as a member.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-memberid)
   */
  public fun memberId(): String? = unwrap(this).getMemberId()

  /**
   * The invitation message that you want to send to the accounts that you're inviting to GuardDuty
   * as members.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-message)
   */
  public fun message(): String? = unwrap(this).getMessage()

  /**
   * You can use the `Status` property to update the status of the relationship between the member
   * account and its administrator account.
   *
   * Valid values are `Created` and `Invited` when using an `AWS::GuardDuty::Member` resource. If
   * the value for this property is not provided or set to `Created` , a member account is created but
   * not invited. If the value of this property is set to `Invited` , a member account is created and
   * invited.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * A builder for [CfnMemberProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param detectorId The ID of the detector associated with the GuardDuty service to add the
     * member to.
     */
    public fun detectorId(detectorId: String)

    /**
     * @param disableEmailNotification Specifies whether or not to disable email notification for
     * the member account that you invite.
     */
    public fun disableEmailNotification(disableEmailNotification: Boolean)

    /**
     * @param disableEmailNotification Specifies whether or not to disable email notification for
     * the member account that you invite.
     */
    public fun disableEmailNotification(disableEmailNotification: IResolvable)

    /**
     * @param email The email address associated with the member account. 
     */
    public fun email(email: String)

    /**
     * @param memberId The AWS account ID of the account to designate as a member.
     */
    public fun memberId(memberId: String)

    /**
     * @param message The invitation message that you want to send to the accounts that you're
     * inviting to GuardDuty as members.
     */
    public fun message(message: String)

    /**
     * @param status You can use the `Status` property to update the status of the relationship
     * between the member account and its administrator account.
     * Valid values are `Created` and `Invited` when using an `AWS::GuardDuty::Member` resource. If
     * the value for this property is not provided or set to `Created` , a member account is created
     * but not invited. If the value of this property is set to `Invited` , a member account is created
     * and invited.
     */
    public fun status(status: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder =
        software.amazon.awscdk.services.guardduty.CfnMemberProps.builder()

    /**
     * @param detectorId The ID of the detector associated with the GuardDuty service to add the
     * member to.
     */
    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    /**
     * @param disableEmailNotification Specifies whether or not to disable email notification for
     * the member account that you invite.
     */
    override fun disableEmailNotification(disableEmailNotification: Boolean) {
      cdkBuilder.disableEmailNotification(disableEmailNotification)
    }

    /**
     * @param disableEmailNotification Specifies whether or not to disable email notification for
     * the member account that you invite.
     */
    override fun disableEmailNotification(disableEmailNotification: IResolvable) {
      cdkBuilder.disableEmailNotification(disableEmailNotification.let(IResolvable::unwrap))
    }

    /**
     * @param email The email address associated with the member account. 
     */
    override fun email(email: String) {
      cdkBuilder.email(email)
    }

    /**
     * @param memberId The AWS account ID of the account to designate as a member.
     */
    override fun memberId(memberId: String) {
      cdkBuilder.memberId(memberId)
    }

    /**
     * @param message The invitation message that you want to send to the accounts that you're
     * inviting to GuardDuty as members.
     */
    override fun message(message: String) {
      cdkBuilder.message(message)
    }

    /**
     * @param status You can use the `Status` property to update the status of the relationship
     * between the member account and its administrator account.
     * Valid values are `Created` and `Invited` when using an `AWS::GuardDuty::Member` resource. If
     * the value for this property is not provided or set to `Created` , a member account is created
     * but not invited. If the value of this property is set to `Invited` , a member account is created
     * and invited.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.guardduty.CfnMemberProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.guardduty.CfnMemberProps,
  ) : CdkObject(cdkObject), CfnMemberProps {
    /**
     * The ID of the detector associated with the GuardDuty service to add the member to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-detectorid)
     */
    override fun detectorId(): String? = unwrap(this).getDetectorId()

    /**
     * Specifies whether or not to disable email notification for the member account that you
     * invite.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-disableemailnotification)
     */
    override fun disableEmailNotification(): Any? = unwrap(this).getDisableEmailNotification()

    /**
     * The email address associated with the member account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-email)
     */
    override fun email(): String = unwrap(this).getEmail()

    /**
     * The AWS account ID of the account to designate as a member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-memberid)
     */
    override fun memberId(): String? = unwrap(this).getMemberId()

    /**
     * The invitation message that you want to send to the accounts that you're inviting to
     * GuardDuty as members.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-message)
     */
    override fun message(): String? = unwrap(this).getMessage()

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
     */
    override fun status(): String? = unwrap(this).getStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMemberProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnMemberProps):
        CfnMemberProps = CdkObjectWrappers.wrap(cdkObject) as? CfnMemberProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMemberProps):
        software.amazon.awscdk.services.guardduty.CfnMemberProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.guardduty.CfnMemberProps
  }
}
