@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * You can use the `AWS::GuardDuty::Master` resource in a GuardDuty member account to accept an
 * invitation from a GuardDuty administrator account.
 *
 * The invitation to the member account must be sent prior to using the `AWS::GuardDuty::Master`
 * resource to accept the administrator account's invitation. You can invite a member account by using
 * the `InviteMembers` operation of the GuardDuty API, or by creating an `AWS::GuardDuty::Member`
 * resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.guardduty.*;
 * CfnMaster cfnMaster = CfnMaster.Builder.create(this, "MyCfnMaster")
 * .detectorId("detectorId")
 * .masterId("masterId")
 * // the properties below are optional
 * .invitationId("invitationId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html)
 */
public open class CfnMaster(
  cdkObject: software.amazon.awscdk.services.guardduty.CfnMaster,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMasterProps,
  ) :
      this(software.amazon.awscdk.services.guardduty.CfnMaster(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnMasterProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMasterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMasterProps(props)
  )

  /**
   * The unique ID of the detector of the GuardDuty member account.
   */
  public open fun detectorId(): String = unwrap(this).getDetectorId()

  /**
   * The unique ID of the detector of the GuardDuty member account.
   */
  public open fun detectorId(`value`: String) {
    unwrap(this).setDetectorId(`value`)
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
   * The ID of the invitation that is sent to the account designated as a member account.
   */
  public open fun invitationId(): String? = unwrap(this).getInvitationId()

  /**
   * The ID of the invitation that is sent to the account designated as a member account.
   */
  public open fun invitationId(`value`: String) {
    unwrap(this).setInvitationId(`value`)
  }

  /**
   * The AWS account ID of the account designated as the GuardDuty administrator account.
   */
  public open fun masterId(): String = unwrap(this).getMasterId()

  /**
   * The AWS account ID of the account designated as the GuardDuty administrator account.
   */
  public open fun masterId(`value`: String) {
    unwrap(this).setMasterId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.guardduty.CfnMaster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique ID of the detector of the GuardDuty member account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-detectorid)
     * @param detectorId The unique ID of the detector of the GuardDuty member account. 
     */
    public fun detectorId(detectorId: String)

    /**
     * The ID of the invitation that is sent to the account designated as a member account.
     *
     * You can find the invitation ID by using the ListInvitation action of the GuardDuty API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-invitationid)
     * @param invitationId The ID of the invitation that is sent to the account designated as a
     * member account. 
     */
    public fun invitationId(invitationId: String)

    /**
     * The AWS account ID of the account designated as the GuardDuty administrator account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-masterid)
     * @param masterId The AWS account ID of the account designated as the GuardDuty administrator
     * account. 
     */
    public fun masterId(masterId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnMaster.Builder =
        software.amazon.awscdk.services.guardduty.CfnMaster.Builder.create(scope, id)

    /**
     * The unique ID of the detector of the GuardDuty member account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-detectorid)
     * @param detectorId The unique ID of the detector of the GuardDuty member account. 
     */
    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    /**
     * The ID of the invitation that is sent to the account designated as a member account.
     *
     * You can find the invitation ID by using the ListInvitation action of the GuardDuty API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-invitationid)
     * @param invitationId The ID of the invitation that is sent to the account designated as a
     * member account. 
     */
    override fun invitationId(invitationId: String) {
      cdkBuilder.invitationId(invitationId)
    }

    /**
     * The AWS account ID of the account designated as the GuardDuty administrator account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-masterid)
     * @param masterId The AWS account ID of the account designated as the GuardDuty administrator
     * account. 
     */
    override fun masterId(masterId: String) {
      cdkBuilder.masterId(masterId)
    }

    public fun build(): software.amazon.awscdk.services.guardduty.CfnMaster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.guardduty.CfnMaster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMaster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMaster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnMaster): CfnMaster =
        CfnMaster(cdkObject)

    internal fun unwrap(wrapped: CfnMaster): software.amazon.awscdk.services.guardduty.CfnMaster =
        wrapped.cdkObject as software.amazon.awscdk.services.guardduty.CfnMaster
  }
}
