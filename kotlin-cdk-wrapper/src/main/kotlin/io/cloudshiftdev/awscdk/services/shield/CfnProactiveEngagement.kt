@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.shield

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Authorizes the Shield Response Team (SRT) to use email and phone to notify contacts about
 * escalations to the SRT and to initiate proactive customer support.
 *
 * To enable proactive engagement, you must be subscribed to the [Business Support
 * plan](https://docs.aws.amazon.com/premiumsupport/business-support/) or the [Enterprise Support
 * plan](https://docs.aws.amazon.com/premiumsupport/enterprise-support/) .
 *
 * *Configure `AWS::Shield::ProactiveEngagement` for one account*
 *
 * To configure this resource through AWS CloudFormation , you must be subscribed to AWS Shield
 * Advanced . You can subscribe through the [Shield Advanced
 * console](https://docs.aws.amazon.com/wafv2/shieldv2#/) and through the APIs. For more information,
 * see [Subscribe to AWS Shield
 * Advanced](https://docs.aws.amazon.com/waf/latest/developerguide/enable-ddos-prem.html) .
 *
 * See example templates for Shield Advanced in AWS CloudFormation at
 * [aws-samples/aws-shield-advanced-examples](https://docs.aws.amazon.com/https://github.com/aws-samples/aws-shield-advanced-examples)
 * .
 *
 * *Configure Shield Advanced using AWS CloudFormation and AWS Firewall Manager*
 *
 * You might be able to use Firewall Manager with AWS CloudFormation to configure Shield Advanced
 * across multiple accounts and protected resources. To do this, your accounts must be part of an
 * organization in AWS Organizations . You can use Firewall Manager to configure Shield Advanced
 * protections for any resource types except for Amazon Route 53 or AWS Global Accelerator .
 *
 * For an example of this, see the one-click configuration guidance published by the AWS technical
 * community at [One-click deployment of Shield
 * Advanced](https://docs.aws.amazon.com/https://youtu.be/LCA3FwMk_QE) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.shield.*;
 * CfnProactiveEngagement cfnProactiveEngagement = CfnProactiveEngagement.Builder.create(this,
 * "MyCfnProactiveEngagement")
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
public open class CfnProactiveEngagement internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.shield.CfnProactiveEngagement,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProactiveEngagementProps,
  ) :
      this(software.amazon.awscdk.services.shield.CfnProactiveEngagement(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnProactiveEngagementProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProactiveEngagementProps.Builder.() -> Unit,
  ) : this(scope, id, CfnProactiveEngagementProps(props)
  )

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
  public open fun emergencyContactList(`value`: List<Any>) {
    unwrap(this).setEmergencyContactList(`value`)
  }

  /**
   * The list of email addresses and phone numbers that the Shield Response Team (SRT) can use to
   * contact you for escalations to the SRT and to initiate proactive customer support, plus any
   * relevant notes.
   */
  public open fun emergencyContactList(vararg `value`: Any): Unit =
      emergencyContactList(`value`.toList())

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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.shield.CfnProactiveEngagement.CFN_RESOURCE_TYPE_NAME

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

  /**
   * Contact information that the SRT can use to contact you if you have proactive engagement
   * enabled, for escalations to the SRT and to initiate proactive customer support.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.shield.*;
   * EmergencyContactProperty emergencyContactProperty = EmergencyContactProperty.builder()
   * .emailAddress("emailAddress")
   * // the properties below are optional
   * .contactNotes("contactNotes")
   * .phoneNumber("phoneNumber")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-proactiveengagement-emergencycontact.html)
   */
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.shield.CfnProactiveEngagement.EmergencyContactProperty,
    ) : CdkObject(cdkObject), EmergencyContactProperty {
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
      public operator fun invoke(block: Builder.() -> Unit = {}): EmergencyContactProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnProactiveEngagement.EmergencyContactProperty):
          EmergencyContactProperty = CdkObjectWrappers.wrap(cdkObject) as? EmergencyContactProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmergencyContactProperty):
          software.amazon.awscdk.services.shield.CfnProactiveEngagement.EmergencyContactProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.shield.CfnProactiveEngagement.EmergencyContactProperty
    }
  }
}
