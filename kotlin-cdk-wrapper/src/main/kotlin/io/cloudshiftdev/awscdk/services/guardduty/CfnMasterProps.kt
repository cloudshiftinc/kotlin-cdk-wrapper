@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnMaster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.guardduty.*;
 * CfnMasterProps cfnMasterProps = CfnMasterProps.builder()
 * .detectorId("detectorId")
 * .masterId("masterId")
 * // the properties below are optional
 * .invitationId("invitationId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html)
 */
public interface CfnMasterProps {
  /**
   * The unique ID of the detector of the GuardDuty member account.
   *
   * To find the `detectorId` in the current Region, see the
   * Settings page in the GuardDuty console, or run the
   * [ListDetectors](https://docs.aws.amazon.com/guardduty/latest/APIReference/API_ListDetectors.html)
   * API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-detectorid)
   */
  public fun detectorId(): String

  /**
   * The ID of the invitation that is sent to the account designated as a member account.
   *
   * You can find the invitation ID by running the
   * [ListInvitations](https://docs.aws.amazon.com/guardduty/latest/APIReference/API_ListInvitations.html)
   * in the *GuardDuty API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-invitationid)
   */
  public fun invitationId(): String? = unwrap(this).getInvitationId()

  /**
   * The AWS account ID of the account designated as the GuardDuty administrator account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-masterid)
   */
  public fun masterId(): String

  /**
   * A builder for [CfnMasterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param detectorId The unique ID of the detector of the GuardDuty member account. 
     * To find the `detectorId` in the current Region, see the
     * Settings page in the GuardDuty console, or run the
     * [ListDetectors](https://docs.aws.amazon.com/guardduty/latest/APIReference/API_ListDetectors.html)
     * API.
     */
    public fun detectorId(detectorId: String)

    /**
     * @param invitationId The ID of the invitation that is sent to the account designated as a
     * member account.
     * You can find the invitation ID by running the
     * [ListInvitations](https://docs.aws.amazon.com/guardduty/latest/APIReference/API_ListInvitations.html)
     * in the *GuardDuty API Reference* .
     */
    public fun invitationId(invitationId: String)

    /**
     * @param masterId The AWS account ID of the account designated as the GuardDuty administrator
     * account. 
     */
    public fun masterId(masterId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnMasterProps.Builder =
        software.amazon.awscdk.services.guardduty.CfnMasterProps.builder()

    /**
     * @param detectorId The unique ID of the detector of the GuardDuty member account. 
     * To find the `detectorId` in the current Region, see the
     * Settings page in the GuardDuty console, or run the
     * [ListDetectors](https://docs.aws.amazon.com/guardduty/latest/APIReference/API_ListDetectors.html)
     * API.
     */
    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    /**
     * @param invitationId The ID of the invitation that is sent to the account designated as a
     * member account.
     * You can find the invitation ID by running the
     * [ListInvitations](https://docs.aws.amazon.com/guardduty/latest/APIReference/API_ListInvitations.html)
     * in the *GuardDuty API Reference* .
     */
    override fun invitationId(invitationId: String) {
      cdkBuilder.invitationId(invitationId)
    }

    /**
     * @param masterId The AWS account ID of the account designated as the GuardDuty administrator
     * account. 
     */
    override fun masterId(masterId: String) {
      cdkBuilder.masterId(masterId)
    }

    public fun build(): software.amazon.awscdk.services.guardduty.CfnMasterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.guardduty.CfnMasterProps,
  ) : CdkObject(cdkObject),
      CfnMasterProps {
    /**
     * The unique ID of the detector of the GuardDuty member account.
     *
     * To find the `detectorId` in the current Region, see the
     * Settings page in the GuardDuty console, or run the
     * [ListDetectors](https://docs.aws.amazon.com/guardduty/latest/APIReference/API_ListDetectors.html)
     * API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-detectorid)
     */
    override fun detectorId(): String = unwrap(this).getDetectorId()

    /**
     * The ID of the invitation that is sent to the account designated as a member account.
     *
     * You can find the invitation ID by running the
     * [ListInvitations](https://docs.aws.amazon.com/guardduty/latest/APIReference/API_ListInvitations.html)
     * in the *GuardDuty API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-invitationid)
     */
    override fun invitationId(): String? = unwrap(this).getInvitationId()

    /**
     * The AWS account ID of the account designated as the GuardDuty administrator account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-masterid)
     */
    override fun masterId(): String = unwrap(this).getMasterId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMasterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnMasterProps):
        CfnMasterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnMasterProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMasterProps):
        software.amazon.awscdk.services.guardduty.CfnMasterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.guardduty.CfnMasterProps
  }
}
