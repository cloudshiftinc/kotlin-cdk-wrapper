@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmcontacts

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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
 * Information about the stages and on-call rotation teams associated with an escalation plan or
 * engagement plan.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
 * CfnPlan cfnPlan = CfnPlan.Builder.create(this, "MyCfnPlan")
 * .contactId("contactId")
 * // the properties below are optional
 * .rotationIds(List.of("rotationIds"))
 * .stages(List.of(StageProperty.builder()
 * .durationInMinutes(123)
 * // the properties below are optional
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html)
 */
public open class CfnPlan internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlan,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Name (ARN) of the `Plan` resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Amazon Resource Name (ARN) of the contact.
   */
  public open fun contactId(): String = unwrap(this).getContactId()

  /**
   * The Amazon Resource Name (ARN) of the contact.
   */
  public open fun contactId(`value`: String) {
    unwrap(this).setContactId(`value`)
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
   * The Amazon Resource Names (ARNs) of the on-call rotations associated with the plan.
   */
  public open fun rotationIds(): List<String> = unwrap(this).getRotationIds() ?: emptyList()

  /**
   * The Amazon Resource Names (ARNs) of the on-call rotations associated with the plan.
   */
  public open fun rotationIds(`value`: List<String>) {
    unwrap(this).setRotationIds(`value`)
  }

  /**
   * The Amazon Resource Names (ARNs) of the on-call rotations associated with the plan.
   */
  public open fun rotationIds(vararg `value`: String): Unit = rotationIds(`value`.toList())

  /**
   * A list of stages that the escalation plan or engagement plan uses to engage contacts and
   * contact methods.
   */
  public open fun stages(): Any? = unwrap(this).getStages()

  /**
   * A list of stages that the escalation plan or engagement plan uses to engage contacts and
   * contact methods.
   */
  public open fun stages(`value`: IResolvable) {
    unwrap(this).setStages(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of stages that the escalation plan or engagement plan uses to engage contacts and
   * contact methods.
   */
  public open fun stages(`value`: List<Any>) {
    unwrap(this).setStages(`value`)
  }

  /**
   * A list of stages that the escalation plan or engagement plan uses to engage contacts and
   * contact methods.
   */
  public open fun stages(vararg `value`: Any): Unit = stages(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssmcontacts.CfnPlan].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-contactid)
     * @param contactId The Amazon Resource Name (ARN) of the contact. 
     */
    public fun contactId(contactId: String)

    /**
     * The Amazon Resource Names (ARNs) of the on-call rotations associated with the plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-rotationids)
     * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated with
     * the plan. 
     */
    public fun rotationIds(rotationIds: List<String>)

    /**
     * The Amazon Resource Names (ARNs) of the on-call rotations associated with the plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-rotationids)
     * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated with
     * the plan. 
     */
    public fun rotationIds(vararg rotationIds: String)

    /**
     * A list of stages that the escalation plan or engagement plan uses to engage contacts and
     * contact methods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-stages)
     * @param stages A list of stages that the escalation plan or engagement plan uses to engage
     * contacts and contact methods. 
     */
    public fun stages(stages: IResolvable)

    /**
     * A list of stages that the escalation plan or engagement plan uses to engage contacts and
     * contact methods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-stages)
     * @param stages A list of stages that the escalation plan or engagement plan uses to engage
     * contacts and contact methods. 
     */
    public fun stages(stages: List<Any>)

    /**
     * A list of stages that the escalation plan or engagement plan uses to engage contacts and
     * contact methods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-stages)
     * @param stages A list of stages that the escalation plan or engagement plan uses to engage
     * contacts and contact methods. 
     */
    public fun stages(vararg stages: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmcontacts.CfnPlan.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnPlan.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-contactid)
     * @param contactId The Amazon Resource Name (ARN) of the contact. 
     */
    override fun contactId(contactId: String) {
      cdkBuilder.contactId(contactId)
    }

    /**
     * The Amazon Resource Names (ARNs) of the on-call rotations associated with the plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-rotationids)
     * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated with
     * the plan. 
     */
    override fun rotationIds(rotationIds: List<String>) {
      cdkBuilder.rotationIds(rotationIds)
    }

    /**
     * The Amazon Resource Names (ARNs) of the on-call rotations associated with the plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-rotationids)
     * @param rotationIds The Amazon Resource Names (ARNs) of the on-call rotations associated with
     * the plan. 
     */
    override fun rotationIds(vararg rotationIds: String): Unit = rotationIds(rotationIds.toList())

    /**
     * A list of stages that the escalation plan or engagement plan uses to engage contacts and
     * contact methods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-stages)
     * @param stages A list of stages that the escalation plan or engagement plan uses to engage
     * contacts and contact methods. 
     */
    override fun stages(stages: IResolvable) {
      cdkBuilder.stages(stages.let(IResolvable::unwrap))
    }

    /**
     * A list of stages that the escalation plan or engagement plan uses to engage contacts and
     * contact methods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-stages)
     * @param stages A list of stages that the escalation plan or engagement plan uses to engage
     * contacts and contact methods. 
     */
    override fun stages(stages: List<Any>) {
      cdkBuilder.stages(stages)
    }

    /**
     * A list of stages that the escalation plan or engagement plan uses to engage contacts and
     * contact methods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-plan.html#cfn-ssmcontacts-plan-stages)
     * @param stages A list of stages that the escalation plan or engagement plan uses to engage
     * contacts and contact methods. 
     */
    override fun stages(vararg stages: Any): Unit = stages(stages.toList())

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnPlan = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssmcontacts.CfnPlan.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlan): CfnPlan =
        CfnPlan(cdkObject)

    internal fun unwrap(wrapped: CfnPlan): software.amazon.awscdk.services.ssmcontacts.CfnPlan =
        wrapped.cdkObject
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-channeltargetinfo.html)
   */
  public interface ChannelTargetInfoProperty {
    /**
     * The Amazon Resource Name (ARN) of the contact channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-channeltargetinfo.html#cfn-ssmcontacts-plan-channeltargetinfo-channelid)
     */
    public fun channelId(): String

    /**
     * The number of minutes to wait before retrying to send engagement if the engagement initially
     * failed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-channeltargetinfo.html#cfn-ssmcontacts-plan-channeltargetinfo-retryintervalinminutes)
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
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ChannelTargetInfoProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ChannelTargetInfoProperty.builder()

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
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ChannelTargetInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ChannelTargetInfoProperty,
    ) : CdkObject(cdkObject), ChannelTargetInfoProperty {
      /**
       * The Amazon Resource Name (ARN) of the contact channel.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-channeltargetinfo.html#cfn-ssmcontacts-plan-channeltargetinfo-channelid)
       */
      override fun channelId(): String = unwrap(this).getChannelId()

      /**
       * The number of minutes to wait before retrying to send engagement if the engagement
       * initially failed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-channeltargetinfo.html#cfn-ssmcontacts-plan-channeltargetinfo-retryintervalinminutes)
       */
      override fun retryIntervalInMinutes(): Number = unwrap(this).getRetryIntervalInMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ChannelTargetInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlan.ChannelTargetInfoProperty):
          ChannelTargetInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChannelTargetInfoProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ChannelTargetInfoProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ChannelTargetInfoProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-targets.html)
   */
  public interface TargetsProperty {
    /**
     * Information about the contact channel that Incident Manager engages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-targets.html#cfn-ssmcontacts-plan-targets-channeltargetinfo)
     */
    public fun channelTargetInfo(): Any? = unwrap(this).getChannelTargetInfo()

    /**
     * Information about the contact that Incident Manager engages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-targets.html#cfn-ssmcontacts-plan-targets-contacttargetinfo)
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
      @JvmName("5e71becc743875d6062f09190ed71b0cc7036598b981ca96b066ae6778c1c94f")
      public fun channelTargetInfo(channelTargetInfo: ChannelTargetInfoProperty.Builder.() -> Unit)

      /**
       * @param contactTargetInfo Information about the contact that Incident Manager engages.
       */
      public fun contactTargetInfo(contactTargetInfo: IResolvable)

      /**
       * @param contactTargetInfo Information about the contact that Incident Manager engages.
       */
      public fun contactTargetInfo(contactTargetInfo: ContactTargetInfoProperty)

      /**
       * @param contactTargetInfo Information about the contact that Incident Manager engages.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("117105694507bf7d70016ab178c9333de2b3a6a01ed47a06890d9f3ff81c73eb")
      public fun contactTargetInfo(contactTargetInfo: ContactTargetInfoProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.TargetsProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.TargetsProperty.builder()

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
      @JvmName("5e71becc743875d6062f09190ed71b0cc7036598b981ca96b066ae6778c1c94f")
      override
          fun channelTargetInfo(channelTargetInfo: ChannelTargetInfoProperty.Builder.() -> Unit):
          Unit = channelTargetInfo(ChannelTargetInfoProperty(channelTargetInfo))

      /**
       * @param contactTargetInfo Information about the contact that Incident Manager engages.
       */
      override fun contactTargetInfo(contactTargetInfo: IResolvable) {
        cdkBuilder.contactTargetInfo(contactTargetInfo.let(IResolvable::unwrap))
      }

      /**
       * @param contactTargetInfo Information about the contact that Incident Manager engages.
       */
      override fun contactTargetInfo(contactTargetInfo: ContactTargetInfoProperty) {
        cdkBuilder.contactTargetInfo(contactTargetInfo.let(ContactTargetInfoProperty::unwrap))
      }

      /**
       * @param contactTargetInfo Information about the contact that Incident Manager engages.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("117105694507bf7d70016ab178c9333de2b3a6a01ed47a06890d9f3ff81c73eb")
      override
          fun contactTargetInfo(contactTargetInfo: ContactTargetInfoProperty.Builder.() -> Unit):
          Unit = contactTargetInfo(ContactTargetInfoProperty(contactTargetInfo))

      public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnPlan.TargetsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlan.TargetsProperty,
    ) : CdkObject(cdkObject), TargetsProperty {
      /**
       * Information about the contact channel that Incident Manager engages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-targets.html#cfn-ssmcontacts-plan-targets-channeltargetinfo)
       */
      override fun channelTargetInfo(): Any? = unwrap(this).getChannelTargetInfo()

      /**
       * Information about the contact that Incident Manager engages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-targets.html#cfn-ssmcontacts-plan-targets-contacttargetinfo)
       */
      override fun contactTargetInfo(): Any? = unwrap(this).getContactTargetInfo()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlan.TargetsProperty):
          TargetsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetsProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.TargetsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.TargetsProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-contacttargetinfo.html)
   */
  public interface ContactTargetInfoProperty {
    /**
     * The Amazon Resource Name (ARN) of the contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-contacttargetinfo.html#cfn-ssmcontacts-plan-contacttargetinfo-contactid)
     */
    public fun contactId(): String

    /**
     * A Boolean value determining if the contact's acknowledgement stops the progress of stages in
     * the plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-contacttargetinfo.html#cfn-ssmcontacts-plan-contacttargetinfo-isessential)
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
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ContactTargetInfoProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ContactTargetInfoProperty.builder()

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
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ContactTargetInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ContactTargetInfoProperty,
    ) : CdkObject(cdkObject), ContactTargetInfoProperty {
      /**
       * The Amazon Resource Name (ARN) of the contact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-contacttargetinfo.html#cfn-ssmcontacts-plan-contacttargetinfo-contactid)
       */
      override fun contactId(): String = unwrap(this).getContactId()

      /**
       * A Boolean value determining if the contact's acknowledgement stops the progress of stages
       * in the plan.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-contacttargetinfo.html#cfn-ssmcontacts-plan-contacttargetinfo-isessential)
       */
      override fun isEssential(): Any = unwrap(this).getIsEssential()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContactTargetInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlan.ContactTargetInfoProperty):
          ContactTargetInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContactTargetInfoProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ContactTargetInfoProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.ContactTargetInfoProperty
    }
  }

  /**
   * A set amount of time that an escalation plan or engagement plan engages the specified contacts
   * or contact methods.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
   * StageProperty stageProperty = StageProperty.builder()
   * .durationInMinutes(123)
   * // the properties below are optional
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-stage.html)
   */
  public interface StageProperty {
    /**
     * The time to wait until beginning the next stage.
     *
     * The duration can only be set to 0 if a target is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-stage.html#cfn-ssmcontacts-plan-stage-durationinminutes)
     */
    public fun durationInMinutes(): Number

    /**
     * The contacts or contact methods that the escalation plan or engagement plan is engaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-stage.html#cfn-ssmcontacts-plan-stage-targets)
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
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.StageProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.StageProperty.builder()

      /**
       * @param durationInMinutes The time to wait until beginning the next stage. 
       * The duration can only be set to 0 if a target is specified.
       */
      override fun durationInMinutes(durationInMinutes: Number) {
        cdkBuilder.durationInMinutes(durationInMinutes)
      }

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

      public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnPlan.StageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlan.StageProperty,
    ) : CdkObject(cdkObject), StageProperty {
      /**
       * The time to wait until beginning the next stage.
       *
       * The duration can only be set to 0 if a target is specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-stage.html#cfn-ssmcontacts-plan-stage-durationinminutes)
       */
      override fun durationInMinutes(): Number = unwrap(this).getDurationInMinutes()

      /**
       * The contacts or contact methods that the escalation plan or engagement plan is engaging.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-stage.html#cfn-ssmcontacts-plan-stage-targets)
       */
      override fun targets(): Any? = unwrap(this).getTargets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnPlan.StageProperty):
          StageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StageProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnPlan.StageProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ssmcontacts.CfnPlan.StageProperty
    }
  }
}
