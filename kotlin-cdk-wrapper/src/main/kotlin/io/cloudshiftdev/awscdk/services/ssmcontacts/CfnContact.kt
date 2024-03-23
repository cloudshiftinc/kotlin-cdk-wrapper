@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmcontacts

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SSMContacts::Contact` resource specifies a contact or escalation plan.
 *
 * Incident Manager contacts are a subset of actions and data types that you can use for managing
 * responder engagement and interaction.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
 * CfnContact cfnContact = CfnContact.Builder.create(this, "MyCfnContact")
 * .alias("alias")
 * .displayName("displayName")
 * .type("type")
 * // the properties below are optional
 * .plan(List.of(StageProperty.builder()
 * .durationInMinutes(123)
 * .rotationIds(List.of("rotationIds"))
 * .targets(List.of(TargetsProperty.builder()
 * .channelTargetInfo(ChannelTargetInfoProperty.builder()
 * .channelId("channelId")
 * .retryIntervalInMinutes(123)
 * .build())
 * .contactTargetInfo(ContactTargetInfoProperty.builder()
 * .contactId("contactId")
 * .isEssential(false)
 * .build())
 * .build()))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html)
 */
public open class CfnContact(
  cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContactProps,
  ) :
      this(software.amazon.awscdk.services.ssmcontacts.CfnContact(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnContactProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContactProps.Builder.() -> Unit,
  ) : this(scope, id, CfnContactProps(props)
  )

  /**
   * The unique and identifiable alias of the contact or escalation plan.
   */
  public open fun alias(): String = unwrap(this).getAlias()

  /**
   * The unique and identifiable alias of the contact or escalation plan.
   */
  public open fun alias(`value`: String) {
    unwrap(this).setAlias(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the `Contact` resource, such as
   * `arn:aws:ssm-contacts:us-west-2:123456789012:contact/contactalias` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The full name of the contact or escalation plan.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * The full name of the contact or escalation plan.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
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
   * A list of stages.
   */
  public open fun plan(): Any? = unwrap(this).getPlan()

  /**
   * A list of stages.
   */
  public open fun plan(`value`: IResolvable) {
    unwrap(this).setPlan(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of stages.
   */
  public open fun plan(`value`: List<Any>) {
    unwrap(this).setPlan(`value`)
  }

  /**
   * A list of stages.
   */
  public open fun plan(vararg `value`: Any): Unit = plan(`value`.toList())

  /**
   * The type of contact.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of contact.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssmcontacts.CfnContact].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique and identifiable alias of the contact or escalation plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-alias)
     * @param alias The unique and identifiable alias of the contact or escalation plan. 
     */
    public fun alias(alias: String)

    /**
     * The full name of the contact or escalation plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-displayname)
     * @param displayName The full name of the contact or escalation plan. 
     */
    public fun displayName(displayName: String)

    /**
     * A list of stages.
     *
     * A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-plan)
     * @param plan A list of stages. 
     */
    public fun plan(plan: IResolvable)

    /**
     * A list of stages.
     *
     * A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-plan)
     * @param plan A list of stages. 
     */
    public fun plan(plan: List<Any>)

    /**
     * A list of stages.
     *
     * A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-plan)
     * @param plan A list of stages. 
     */
    public fun plan(vararg plan: Any)

    /**
     * The type of contact.
     *
     * * `PERSONAL` : A single, individual contact.
     * * `ESCALATION` : An escalation plan.
     * * `ONCALL_SCHEDULE` : An on-call schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-type)
     * @param type The type of contact. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmcontacts.CfnContact.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnContact.Builder.create(scope, id)

    /**
     * The unique and identifiable alias of the contact or escalation plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-alias)
     * @param alias The unique and identifiable alias of the contact or escalation plan. 
     */
    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    /**
     * The full name of the contact or escalation plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-displayname)
     * @param displayName The full name of the contact or escalation plan. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * A list of stages.
     *
     * A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-plan)
     * @param plan A list of stages. 
     */
    override fun plan(plan: IResolvable) {
      cdkBuilder.plan(plan.let(IResolvable::unwrap))
    }

    /**
     * A list of stages.
     *
     * A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-plan)
     * @param plan A list of stages. 
     */
    override fun plan(plan: List<Any>) {
      cdkBuilder.plan(plan)
    }

    /**
     * A list of stages.
     *
     * A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-plan)
     * @param plan A list of stages. 
     */
    override fun plan(vararg plan: Any): Unit = plan(plan.toList())

    /**
     * The type of contact.
     *
     * * `PERSONAL` : A single, individual contact.
     * * `ESCALATION` : An escalation plan.
     * * `ONCALL_SCHEDULE` : An on-call schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contact.html#cfn-ssmcontacts-contact-type)
     * @param type The type of contact. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnContact = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssmcontacts.CfnContact.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContact {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContact(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact): CfnContact
        = CfnContact(cdkObject)

    internal fun unwrap(wrapped: CfnContact): software.amazon.awscdk.services.ssmcontacts.CfnContact
        = wrapped.cdkObject as software.amazon.awscdk.services.ssmcontacts.CfnContact
  }

  /**
   * Information about the contact channel that Incident Manager uses to engage the contact.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
   * ChannelTargetInfoProperty channelTargetInfoProperty = ChannelTargetInfoProperty.builder()
   * .channelId("channelId")
   * .retryIntervalInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-channeltargetinfo.html)
   */
  public interface ChannelTargetInfoProperty {
    /**
     * The Amazon Resource Name (ARN) of the contact channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-channeltargetinfo.html#cfn-ssmcontacts-contact-channeltargetinfo-channelid)
     */
    public fun channelId(): String

    /**
     * The number of minutes to wait before retrying to send engagement if the engagement initially
     * failed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-channeltargetinfo.html#cfn-ssmcontacts-contact-channeltargetinfo-retryintervalinminutes)
     */
    public fun retryIntervalInMinutes(): Number

    /**
     * A builder for [ChannelTargetInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param channelId The Amazon Resource Name (ARN) of the contact channel. 
       */
      public fun channelId(channelId: String)

      /**
       * @param retryIntervalInMinutes The number of minutes to wait before retrying to send
       * engagement if the engagement initially failed. 
       */
      public fun retryIntervalInMinutes(retryIntervalInMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty.builder()

      /**
       * @param channelId The Amazon Resource Name (ARN) of the contact channel. 
       */
      override fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
      }

      /**
       * @param retryIntervalInMinutes The number of minutes to wait before retrying to send
       * engagement if the engagement initially failed. 
       */
      override fun retryIntervalInMinutes(retryIntervalInMinutes: Number) {
        cdkBuilder.retryIntervalInMinutes(retryIntervalInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty,
    ) : CdkObject(cdkObject), ChannelTargetInfoProperty {
      /**
       * The Amazon Resource Name (ARN) of the contact channel.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-channeltargetinfo.html#cfn-ssmcontacts-contact-channeltargetinfo-channelid)
       */
      override fun channelId(): String = unwrap(this).getChannelId()

      /**
       * The number of minutes to wait before retrying to send engagement if the engagement
       * initially failed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-channeltargetinfo.html#cfn-ssmcontacts-contact-channeltargetinfo-retryintervalinminutes)
       */
      override fun retryIntervalInMinutes(): Number = unwrap(this).getRetryIntervalInMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ChannelTargetInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty):
          ChannelTargetInfoProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ChannelTargetInfoProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChannelTargetInfoProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ChannelTargetInfoProperty
    }
  }

  /**
   * The contact that Incident Manager is engaging during an incident.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
   * ContactTargetInfoProperty contactTargetInfoProperty = ContactTargetInfoProperty.builder()
   * .contactId("contactId")
   * .isEssential(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-contacttargetinfo.html)
   */
  public interface ContactTargetInfoProperty {
    /**
     * The Amazon Resource Name (ARN) of the contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-contacttargetinfo.html#cfn-ssmcontacts-contact-contacttargetinfo-contactid)
     */
    public fun contactId(): String

    /**
     * A Boolean value determining if the contact's acknowledgement stops the progress of stages in
     * the plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-contacttargetinfo.html#cfn-ssmcontacts-contact-contacttargetinfo-isessential)
     */
    public fun isEssential(): Any

    /**
     * A builder for [ContactTargetInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contactId The Amazon Resource Name (ARN) of the contact. 
       */
      public fun contactId(contactId: String)

      /**
       * @param isEssential A Boolean value determining if the contact's acknowledgement stops the
       * progress of stages in the plan. 
       */
      public fun isEssential(isEssential: Boolean)

      /**
       * @param isEssential A Boolean value determining if the contact's acknowledgement stops the
       * progress of stages in the plan. 
       */
      public fun isEssential(isEssential: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty.builder()

      /**
       * @param contactId The Amazon Resource Name (ARN) of the contact. 
       */
      override fun contactId(contactId: String) {
        cdkBuilder.contactId(contactId)
      }

      /**
       * @param isEssential A Boolean value determining if the contact's acknowledgement stops the
       * progress of stages in the plan. 
       */
      override fun isEssential(isEssential: Boolean) {
        cdkBuilder.isEssential(isEssential)
      }

      /**
       * @param isEssential A Boolean value determining if the contact's acknowledgement stops the
       * progress of stages in the plan. 
       */
      override fun isEssential(isEssential: IResolvable) {
        cdkBuilder.isEssential(isEssential.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty,
    ) : CdkObject(cdkObject), ContactTargetInfoProperty {
      /**
       * The Amazon Resource Name (ARN) of the contact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-contacttargetinfo.html#cfn-ssmcontacts-contact-contacttargetinfo-contactid)
       */
      override fun contactId(): String = unwrap(this).getContactId()

      /**
       * A Boolean value determining if the contact's acknowledgement stops the progress of stages
       * in the plan.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-contacttargetinfo.html#cfn-ssmcontacts-contact-contacttargetinfo-isessential)
       */
      override fun isEssential(): Any = unwrap(this).getIsEssential()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContactTargetInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty):
          ContactTargetInfoProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContactTargetInfoProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContactTargetInfoProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty
    }
  }

  /**
   * The `Stage` property type specifies a set amount of time that an escalation plan or engagement
   * plan engages the specified contacts or contact methods.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
   * StageProperty stageProperty = StageProperty.builder()
   * .durationInMinutes(123)
   * .rotationIds(List.of("rotationIds"))
   * .targets(List.of(TargetsProperty.builder()
   * .channelTargetInfo(ChannelTargetInfoProperty.builder()
   * .channelId("channelId")
   * .retryIntervalInMinutes(123)
   * .build())
   * .contactTargetInfo(ContactTargetInfoProperty.builder()
   * .contactId("contactId")
   * .isEssential(false)
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-stage.html)
   */
  public interface StageProperty {
    /**
     * The time to wait until beginning the next stage.
     *
     * The duration can only be set to 0 if a target is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-stage.html#cfn-ssmcontacts-contact-stage-durationinminutes)
     */
    public fun durationInMinutes(): Number? = unwrap(this).getDurationInMinutes()

    /**
     * The Amazon Resource Names (ARNs) of the on-call rotations associated with the plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-stage.html#cfn-ssmcontacts-contact-stage-rotationids)
     */
    public fun rotationIds(): List<String> = unwrap(this).getRotationIds() ?: emptyList()

    /**
     * The contacts or contact methods that the escalation plan or engagement plan is engaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-stage.html#cfn-ssmcontacts-contact-stage-targets)
     */
    public fun targets(): Any? = unwrap(this).getTargets()

    /**
     * A builder for [StageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param durationInMinutes The time to wait until beginning the next stage.
       * The duration can only be set to 0 if a target is specified.
       */
      public fun durationInMinutes(durationInMinutes: Number)

      /**
       * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated
       * with the plan.
       */
      public fun rotationIds(rotationIds: List<String>)

      /**
       * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated
       * with the plan.
       */
      public fun rotationIds(vararg rotationIds: String)

      /**
       * @param targets The contacts or contact methods that the escalation plan or engagement plan
       * is engaging.
       */
      public fun targets(targets: IResolvable)

      /**
       * @param targets The contacts or contact methods that the escalation plan or engagement plan
       * is engaging.
       */
      public fun targets(targets: List<Any>)

      /**
       * @param targets The contacts or contact methods that the escalation plan or engagement plan
       * is engaging.
       */
      public fun targets(vararg targets: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty.builder()

      /**
       * @param durationInMinutes The time to wait until beginning the next stage.
       * The duration can only be set to 0 if a target is specified.
       */
      override fun durationInMinutes(durationInMinutes: Number) {
        cdkBuilder.durationInMinutes(durationInMinutes)
      }

      /**
       * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated
       * with the plan.
       */
      override fun rotationIds(rotationIds: List<String>) {
        cdkBuilder.rotationIds(rotationIds)
      }

      /**
       * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated
       * with the plan.
       */
      override fun rotationIds(vararg rotationIds: String): Unit = rotationIds(rotationIds.toList())

      /**
       * @param targets The contacts or contact methods that the escalation plan or engagement plan
       * is engaging.
       */
      override fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets.let(IResolvable::unwrap))
      }

      /**
       * @param targets The contacts or contact methods that the escalation plan or engagement plan
       * is engaging.
       */
      override fun targets(targets: List<Any>) {
        cdkBuilder.targets(targets)
      }

      /**
       * @param targets The contacts or contact methods that the escalation plan or engagement plan
       * is engaging.
       */
      override fun targets(vararg targets: Any): Unit = targets(targets.toList())

      public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty,
    ) : CdkObject(cdkObject), StageProperty {
      /**
       * The time to wait until beginning the next stage.
       *
       * The duration can only be set to 0 if a target is specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-stage.html#cfn-ssmcontacts-contact-stage-durationinminutes)
       */
      override fun durationInMinutes(): Number? = unwrap(this).getDurationInMinutes()

      /**
       * The Amazon Resource Names (ARNs) of the on-call rotations associated with the plan.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-stage.html#cfn-ssmcontacts-contact-stage-rotationids)
       */
      override fun rotationIds(): List<String> = unwrap(this).getRotationIds() ?: emptyList()

      /**
       * The contacts or contact methods that the escalation plan or engagement plan is engaging.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-stage.html#cfn-ssmcontacts-contact-stage-targets)
       */
      override fun targets(): Any? = unwrap(this).getTargets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty):
          StageProperty = CdkObjectWrappers.wrap(cdkObject) as? StageProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StageProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty
    }
  }

  /**
   * The contact or contact channel that's being engaged.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
   * TargetsProperty targetsProperty = TargetsProperty.builder()
   * .channelTargetInfo(ChannelTargetInfoProperty.builder()
   * .channelId("channelId")
   * .retryIntervalInMinutes(123)
   * .build())
   * .contactTargetInfo(ContactTargetInfoProperty.builder()
   * .contactId("contactId")
   * .isEssential(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-targets.html)
   */
  public interface TargetsProperty {
    /**
     * Information about the contact channel that Incident Manager engages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-targets.html#cfn-ssmcontacts-contact-targets-channeltargetinfo)
     */
    public fun channelTargetInfo(): Any? = unwrap(this).getChannelTargetInfo()

    /**
     * The contact that Incident Manager is engaging during an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-targets.html#cfn-ssmcontacts-contact-targets-contacttargetinfo)
     */
    public fun contactTargetInfo(): Any? = unwrap(this).getContactTargetInfo()

    /**
     * A builder for [TargetsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param channelTargetInfo Information about the contact channel that Incident Manager
       * engages.
       */
      public fun channelTargetInfo(channelTargetInfo: IResolvable)

      /**
       * @param channelTargetInfo Information about the contact channel that Incident Manager
       * engages.
       */
      public fun channelTargetInfo(channelTargetInfo: ChannelTargetInfoProperty)

      /**
       * @param channelTargetInfo Information about the contact channel that Incident Manager
       * engages.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29d09db8273549d79e0633f214d08200e579b7d9337a6f78508bbac922b90efc")
      public fun channelTargetInfo(channelTargetInfo: ChannelTargetInfoProperty.Builder.() -> Unit)

      /**
       * @param contactTargetInfo The contact that Incident Manager is engaging during an incident.
       */
      public fun contactTargetInfo(contactTargetInfo: IResolvable)

      /**
       * @param contactTargetInfo The contact that Incident Manager is engaging during an incident.
       */
      public fun contactTargetInfo(contactTargetInfo: ContactTargetInfoProperty)

      /**
       * @param contactTargetInfo The contact that Incident Manager is engaging during an incident.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c3361af6b198f0ec3cd7e76ac13b8a39a3214c6fc8e33f79f59039cb4015cce2")
      public fun contactTargetInfo(contactTargetInfo: ContactTargetInfoProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnContact.TargetsProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnContact.TargetsProperty.builder()

      /**
       * @param channelTargetInfo Information about the contact channel that Incident Manager
       * engages.
       */
      override fun channelTargetInfo(channelTargetInfo: IResolvable) {
        cdkBuilder.channelTargetInfo(channelTargetInfo.let(IResolvable::unwrap))
      }

      /**
       * @param channelTargetInfo Information about the contact channel that Incident Manager
       * engages.
       */
      override fun channelTargetInfo(channelTargetInfo: ChannelTargetInfoProperty) {
        cdkBuilder.channelTargetInfo(channelTargetInfo.let(ChannelTargetInfoProperty::unwrap))
      }

      /**
       * @param channelTargetInfo Information about the contact channel that Incident Manager
       * engages.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29d09db8273549d79e0633f214d08200e579b7d9337a6f78508bbac922b90efc")
      override
          fun channelTargetInfo(channelTargetInfo: ChannelTargetInfoProperty.Builder.() -> Unit):
          Unit = channelTargetInfo(ChannelTargetInfoProperty(channelTargetInfo))

      /**
       * @param contactTargetInfo The contact that Incident Manager is engaging during an incident.
       */
      override fun contactTargetInfo(contactTargetInfo: IResolvable) {
        cdkBuilder.contactTargetInfo(contactTargetInfo.let(IResolvable::unwrap))
      }

      /**
       * @param contactTargetInfo The contact that Incident Manager is engaging during an incident.
       */
      override fun contactTargetInfo(contactTargetInfo: ContactTargetInfoProperty) {
        cdkBuilder.contactTargetInfo(contactTargetInfo.let(ContactTargetInfoProperty::unwrap))
      }

      /**
       * @param contactTargetInfo The contact that Incident Manager is engaging during an incident.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c3361af6b198f0ec3cd7e76ac13b8a39a3214c6fc8e33f79f59039cb4015cce2")
      override
          fun contactTargetInfo(contactTargetInfo: ContactTargetInfoProperty.Builder.() -> Unit):
          Unit = contactTargetInfo(ContactTargetInfoProperty(contactTargetInfo))

      public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnContact.TargetsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact.TargetsProperty,
    ) : CdkObject(cdkObject), TargetsProperty {
      /**
       * Information about the contact channel that Incident Manager engages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-targets.html#cfn-ssmcontacts-contact-targets-channeltargetinfo)
       */
      override fun channelTargetInfo(): Any? = unwrap(this).getChannelTargetInfo()

      /**
       * The contact that Incident Manager is engaging during an incident.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-targets.html#cfn-ssmcontacts-contact-targets-contacttargetinfo)
       */
      override fun contactTargetInfo(): Any? = unwrap(this).getContactTargetInfo()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContact.TargetsProperty):
          TargetsProperty = CdkObjectWrappers.wrap(cdkObject) as? TargetsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetsProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnContact.TargetsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnContact.TargetsProperty
    }
  }
}
