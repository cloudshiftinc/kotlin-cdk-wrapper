package io.cloudshiftdev.awscdk.services.shield

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProactiveEngagement internal constructor(
  private val cdkObject: software.amazon.awscdk.services.shield.CfnProactiveEngagement,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ID of the account that submitted the template.
   */
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  /**
   * The list of email addresses and phone numbers that the Shield Response Team (SRT) can use to
   * contact you for escalations to the SRT and to initiate proactive customer support, plus any
   * relevant notes.
   */
  public open fun emergencyContactList(): Any = unwrap(this).getEmergencyContactList()

  /**
   * The list of email addresses and phone numbers that the Shield Response Team (SRT) can use to
   * contact you for escalations to the SRT and to initiate proactive customer support, plus any
   * relevant notes.
   */
  public open fun emergencyContactList(`value`: IResolvable) {
    unwrap(this).setEmergencyContactList(`value`.let(IResolvable::unwrap))
  }

  /**
   * The list of email addresses and phone numbers that the Shield Response Team (SRT) can use to
   * contact you for escalations to the SRT and to initiate proactive customer support, plus any
   * relevant notes.
   */
  public open fun emergencyContactList(__idx_ac66f0: List<Any>) {
    unwrap(this).setEmergencyContactList(__idx_ac66f0)
  }

  /**
   * The list of email addresses and phone numbers that the Shield Response Team (SRT) can use to
   * contact you for escalations to the SRT and to initiate proactive customer support, plus any
   * relevant notes.
   */
  public open fun emergencyContactList(vararg __idx_ac66f0: Any): Unit =
      emergencyContactList(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies whether proactive engagement is enabled or disabled.
   */
  public open fun proactiveEngagementStatus(): String = unwrap(this).getProactiveEngagementStatus()

  /**
   * Specifies whether proactive engagement is enabled or disabled.
   */
  public open fun proactiveEngagementStatus(`value`: String) {
    unwrap(this).setProactiveEngagementStatus(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.shield.CfnProactiveEngagement].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     * Response Team (SRT) can use to contact you for escalations to the SRT and to initiate proactive
     * customer support, plus any relevant notes. 
     */
    public fun emergencyContactList(emergencyContactList: IResolvable)

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
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     * Response Team (SRT) can use to contact you for escalations to the SRT and to initiate proactive
     * customer support, plus any relevant notes. 
     */
    public fun emergencyContactList(emergencyContactList: List<Any>)

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
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     * Response Team (SRT) can use to contact you for escalations to the SRT and to initiate proactive
     * customer support, plus any relevant notes. 
     */
    public fun emergencyContactList(vararg emergencyContactList: Any)

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
     * @param proactiveEngagementStatus Specifies whether proactive engagement is enabled or
     * disabled. 
     */
    public fun proactiveEngagementStatus(proactiveEngagementStatus: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.shield.CfnProactiveEngagement.Builder =
        software.amazon.awscdk.services.shield.CfnProactiveEngagement.Builder.create(scope, id)

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
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     * Response Team (SRT) can use to contact you for escalations to the SRT and to initiate proactive
     * customer support, plus any relevant notes. 
     */
    override fun emergencyContactList(emergencyContactList: IResolvable) {
      cdkBuilder.emergencyContactList(emergencyContactList.let(IResolvable::unwrap))
    }

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
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     * Response Team (SRT) can use to contact you for escalations to the SRT and to initiate proactive
     * customer support, plus any relevant notes. 
     */
    override fun emergencyContactList(emergencyContactList: List<Any>) {
      cdkBuilder.emergencyContactList(emergencyContactList)
    }

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
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     * Response Team (SRT) can use to contact you for escalations to the SRT and to initiate proactive
     * customer support, plus any relevant notes. 
     */
    override fun emergencyContactList(vararg emergencyContactList: Any): Unit =
        emergencyContactList(emergencyContactList.toList())

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
     * @param proactiveEngagementStatus Specifies whether proactive engagement is enabled or
     * disabled. 
     */
    override fun proactiveEngagementStatus(proactiveEngagementStatus: String) {
      cdkBuilder.proactiveEngagementStatus(proactiveEngagementStatus)
    }

    public fun build(): software.amazon.awscdk.services.shield.CfnProactiveEngagement =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProactiveEngagement {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProactiveEngagement(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnProactiveEngagement):
        CfnProactiveEngagement = CfnProactiveEngagement(cdkObject)

    internal fun unwrap(wrapped: CfnProactiveEngagement):
        software.amazon.awscdk.services.shield.CfnProactiveEngagement = wrapped.cdkObject
  }

  public interface EmergencyContactProperty {
    /**
     * Additional notes regarding the contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-proactiveengagement-emergencycontact.html#cfn-shield-proactiveengagement-emergencycontact-contactnotes)
     */
    public fun contactNotes(): String? = unwrap(this).getContactNotes()

    /**
     * The email address for the contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-proactiveengagement-emergencycontact.html#cfn-shield-proactiveengagement-emergencycontact-emailaddress)
     */
    public fun emailAddress(): String

    /**
     * The phone number for the contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-proactiveengagement-emergencycontact.html#cfn-shield-proactiveengagement-emergencycontact-phonenumber)
     */
    public fun phoneNumber(): String? = unwrap(this).getPhoneNumber()

    /**
     * A builder for [EmergencyContactProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contactNotes Additional notes regarding the contact.
       */
      public fun contactNotes(contactNotes: String)

      /**
       * @param emailAddress The email address for the contact. 
       */
      public fun emailAddress(emailAddress: String)

      /**
       * @param phoneNumber The phone number for the contact.
       */
      public fun phoneNumber(phoneNumber: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.shield.CfnProactiveEngagement.EmergencyContactProperty.Builder
          =
          software.amazon.awscdk.services.shield.CfnProactiveEngagement.EmergencyContactProperty.builder()

      /**
       * @param contactNotes Additional notes regarding the contact.
       */
      override fun contactNotes(contactNotes: String) {
        cdkBuilder.contactNotes(contactNotes)
      }

      /**
       * @param emailAddress The email address for the contact. 
       */
      override fun emailAddress(emailAddress: String) {
        cdkBuilder.emailAddress(emailAddress)
      }

      /**
       * @param phoneNumber The phone number for the contact.
       */
      override fun phoneNumber(phoneNumber: String) {
        cdkBuilder.phoneNumber(phoneNumber)
      }

      public fun build():
          software.amazon.awscdk.services.shield.CfnProactiveEngagement.EmergencyContactProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.shield.CfnProactiveEngagement.EmergencyContactProperty,
    ) : EmergencyContactProperty {
      /**
       * Additional notes regarding the contact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-proactiveengagement-emergencycontact.html#cfn-shield-proactiveengagement-emergencycontact-contactnotes)
       */
      override fun contactNotes(): String? = unwrap(this).getContactNotes()

      /**
       * The email address for the contact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-proactiveengagement-emergencycontact.html#cfn-shield-proactiveengagement-emergencycontact-emailaddress)
       */
      override fun emailAddress(): String = unwrap(this).getEmailAddress()

      /**
       * The phone number for the contact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-proactiveengagement-emergencycontact.html#cfn-shield-proactiveengagement-emergencycontact-phonenumber)
       */
      override fun phoneNumber(): String? = unwrap(this).getPhoneNumber()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EmergencyContactProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnProactiveEngagement.EmergencyContactProperty):
          EmergencyContactProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmergencyContactProperty):
          software.amazon.awscdk.services.shield.CfnProactiveEngagement.EmergencyContactProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
