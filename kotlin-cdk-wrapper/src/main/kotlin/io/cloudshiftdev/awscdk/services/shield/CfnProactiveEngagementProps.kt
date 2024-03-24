@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.shield

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnProactiveEngagement`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.shield.*;
 * CfnProactiveEngagementProps cfnProactiveEngagementProps = CfnProactiveEngagementProps.builder()
 * .emergencyContactList(List.of(EmergencyContactProperty.builder()
 * .emailAddress("emailAddress")
 * // the properties below are optional
 * .contactNotes("contactNotes")
 * .phoneNumber("phoneNumber")
 * .build()))
 * .proactiveEngagementStatus("proactiveEngagementStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-proactiveengagement.html)
 */
public interface CfnProactiveEngagementProps {
  /**
   * The list of email addresses and phone numbers that the Shield Response Team (SRT) can use to
   * contact you for escalations to the SRT and to initiate proactive customer support, plus any
   * relevant notes.
   *
   * To enable proactive engagement, the contact list must include at least one phone number.
   *
   * If you provide more than one contact, in the notes, indicate the circumstances under which each
   * contact should be used. Include primary and secondary contact designations, and provide the hours
   * of availability and time zones for each contact.
   *
   * Example contact notes:
   *
   * * This is a hotline that's staffed 24x7x365. Please work with the responding analyst and they
   * will get the appropriate person on the call.
   * * Please contact the secondary phone number if the hotline doesn't respond within 5 minutes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-proactiveengagement.html#cfn-shield-proactiveengagement-emergencycontactlist)
   */
  public fun emergencyContactList(): Any

  /**
   * Specifies whether proactive engagement is enabled or disabled.
   *
   * Valid values:
   *
   * `ENABLED` - The Shield Response Team (SRT) will use email and phone to notify contacts about
   * escalations to the SRT and to initiate proactive customer support.
   *
   * `DISABLED` - The SRT will not proactively notify contacts about escalations or to initiate
   * proactive customer support.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-proactiveengagement.html#cfn-shield-proactiveengagement-proactiveengagementstatus)
   */
  public fun proactiveEngagementStatus(): String

  /**
   * A builder for [CfnProactiveEngagementProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     * Response Team (SRT) can use to contact you for escalations to the SRT and to initiate proactive
     * customer support, plus any relevant notes. 
     * To enable proactive engagement, the contact list must include at least one phone number.
     *
     * If you provide more than one contact, in the notes, indicate the circumstances under which
     * each contact should be used. Include primary and secondary contact designations, and provide the
     * hours of availability and time zones for each contact.
     *
     * Example contact notes:
     *
     * * This is a hotline that's staffed 24x7x365. Please work with the responding analyst and they
     * will get the appropriate person on the call.
     * * Please contact the secondary phone number if the hotline doesn't respond within 5 minutes.
     */
    public fun emergencyContactList(emergencyContactList: IResolvable)

    /**
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     * Response Team (SRT) can use to contact you for escalations to the SRT and to initiate proactive
     * customer support, plus any relevant notes. 
     * To enable proactive engagement, the contact list must include at least one phone number.
     *
     * If you provide more than one contact, in the notes, indicate the circumstances under which
     * each contact should be used. Include primary and secondary contact designations, and provide the
     * hours of availability and time zones for each contact.
     *
     * Example contact notes:
     *
     * * This is a hotline that's staffed 24x7x365. Please work with the responding analyst and they
     * will get the appropriate person on the call.
     * * Please contact the secondary phone number if the hotline doesn't respond within 5 minutes.
     */
    public fun emergencyContactList(emergencyContactList: List<Any>)

    /**
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     * Response Team (SRT) can use to contact you for escalations to the SRT and to initiate proactive
     * customer support, plus any relevant notes. 
     * To enable proactive engagement, the contact list must include at least one phone number.
     *
     * If you provide more than one contact, in the notes, indicate the circumstances under which
     * each contact should be used. Include primary and secondary contact designations, and provide the
     * hours of availability and time zones for each contact.
     *
     * Example contact notes:
     *
     * * This is a hotline that's staffed 24x7x365. Please work with the responding analyst and they
     * will get the appropriate person on the call.
     * * Please contact the secondary phone number if the hotline doesn't respond within 5 minutes.
     */
    public fun emergencyContactList(vararg emergencyContactList: Any)

    /**
     * @param proactiveEngagementStatus Specifies whether proactive engagement is enabled or
     * disabled. 
     * Valid values:
     *
     * `ENABLED` - The Shield Response Team (SRT) will use email and phone to notify contacts about
     * escalations to the SRT and to initiate proactive customer support.
     *
     * `DISABLED` - The SRT will not proactively notify contacts about escalations or to initiate
     * proactive customer support.
     */
    public fun proactiveEngagementStatus(proactiveEngagementStatus: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.shield.CfnProactiveEngagementProps.Builder =
        software.amazon.awscdk.services.shield.CfnProactiveEngagementProps.builder()

    /**
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     * Response Team (SRT) can use to contact you for escalations to the SRT and to initiate proactive
     * customer support, plus any relevant notes. 
     * To enable proactive engagement, the contact list must include at least one phone number.
     *
     * If you provide more than one contact, in the notes, indicate the circumstances under which
     * each contact should be used. Include primary and secondary contact designations, and provide the
     * hours of availability and time zones for each contact.
     *
     * Example contact notes:
     *
     * * This is a hotline that's staffed 24x7x365. Please work with the responding analyst and they
     * will get the appropriate person on the call.
     * * Please contact the secondary phone number if the hotline doesn't respond within 5 minutes.
     */
    override fun emergencyContactList(emergencyContactList: IResolvable) {
      cdkBuilder.emergencyContactList(emergencyContactList.let(IResolvable::unwrap))
    }

    /**
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     * Response Team (SRT) can use to contact you for escalations to the SRT and to initiate proactive
     * customer support, plus any relevant notes. 
     * To enable proactive engagement, the contact list must include at least one phone number.
     *
     * If you provide more than one contact, in the notes, indicate the circumstances under which
     * each contact should be used. Include primary and secondary contact designations, and provide the
     * hours of availability and time zones for each contact.
     *
     * Example contact notes:
     *
     * * This is a hotline that's staffed 24x7x365. Please work with the responding analyst and they
     * will get the appropriate person on the call.
     * * Please contact the secondary phone number if the hotline doesn't respond within 5 minutes.
     */
    override fun emergencyContactList(emergencyContactList: List<Any>) {
      cdkBuilder.emergencyContactList(emergencyContactList.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     * Response Team (SRT) can use to contact you for escalations to the SRT and to initiate proactive
     * customer support, plus any relevant notes. 
     * To enable proactive engagement, the contact list must include at least one phone number.
     *
     * If you provide more than one contact, in the notes, indicate the circumstances under which
     * each contact should be used. Include primary and secondary contact designations, and provide the
     * hours of availability and time zones for each contact.
     *
     * Example contact notes:
     *
     * * This is a hotline that's staffed 24x7x365. Please work with the responding analyst and they
     * will get the appropriate person on the call.
     * * Please contact the secondary phone number if the hotline doesn't respond within 5 minutes.
     */
    override fun emergencyContactList(vararg emergencyContactList: Any): Unit =
        emergencyContactList(emergencyContactList.toList())

    /**
     * @param proactiveEngagementStatus Specifies whether proactive engagement is enabled or
     * disabled. 
     * Valid values:
     *
     * `ENABLED` - The Shield Response Team (SRT) will use email and phone to notify contacts about
     * escalations to the SRT and to initiate proactive customer support.
     *
     * `DISABLED` - The SRT will not proactively notify contacts about escalations or to initiate
     * proactive customer support.
     */
    override fun proactiveEngagementStatus(proactiveEngagementStatus: String) {
      cdkBuilder.proactiveEngagementStatus(proactiveEngagementStatus)
    }

    public fun build(): software.amazon.awscdk.services.shield.CfnProactiveEngagementProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.shield.CfnProactiveEngagementProps,
  ) : CdkObject(cdkObject), CfnProactiveEngagementProps {
    /**
     * The list of email addresses and phone numbers that the Shield Response Team (SRT) can use to
     * contact you for escalations to the SRT and to initiate proactive customer support, plus any
     * relevant notes.
     *
     * To enable proactive engagement, the contact list must include at least one phone number.
     *
     * If you provide more than one contact, in the notes, indicate the circumstances under which
     * each contact should be used. Include primary and secondary contact designations, and provide the
     * hours of availability and time zones for each contact.
     *
     * Example contact notes:
     *
     * * This is a hotline that's staffed 24x7x365. Please work with the responding analyst and they
     * will get the appropriate person on the call.
     * * Please contact the secondary phone number if the hotline doesn't respond within 5 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-proactiveengagement.html#cfn-shield-proactiveengagement-emergencycontactlist)
     */
    override fun emergencyContactList(): Any = unwrap(this).getEmergencyContactList()

    /**
     * Specifies whether proactive engagement is enabled or disabled.
     *
     * Valid values:
     *
     * `ENABLED` - The Shield Response Team (SRT) will use email and phone to notify contacts about
     * escalations to the SRT and to initiate proactive customer support.
     *
     * `DISABLED` - The SRT will not proactively notify contacts about escalations or to initiate
     * proactive customer support.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-proactiveengagement.html#cfn-shield-proactiveengagement-proactiveengagementstatus)
     */
    override fun proactiveEngagementStatus(): String = unwrap(this).getProactiveEngagementStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProactiveEngagementProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnProactiveEngagementProps):
        CfnProactiveEngagementProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnProactiveEngagementProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProactiveEngagementProps):
        software.amazon.awscdk.services.shield.CfnProactiveEngagementProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.shield.CfnProactiveEngagementProps
  }
}
