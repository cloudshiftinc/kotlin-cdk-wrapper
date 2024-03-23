@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmcontacts

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a rotation in an on-call schedule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
 * CfnRotation cfnRotation = CfnRotation.Builder.create(this, "MyCfnRotation")
 * .contactIds(List.of("contactIds"))
 * .name("name")
 * .recurrence(RecurrenceSettingsProperty.builder()
 * .numberOfOnCalls(123)
 * .recurrenceMultiplier(123)
 * // the properties below are optional
 * .dailySettings(List.of("dailySettings"))
 * .monthlySettings(List.of(MonthlySettingProperty.builder()
 * .dayOfMonth(123)
 * .handOffTime("handOffTime")
 * .build()))
 * .shiftCoverages(List.of(ShiftCoverageProperty.builder()
 * .coverageTimes(List.of(CoverageTimeProperty.builder()
 * .endTime("endTime")
 * .startTime("startTime")
 * .build()))
 * .dayOfWeek("dayOfWeek")
 * .build()))
 * .weeklySettings(List.of(WeeklySettingProperty.builder()
 * .dayOfWeek("dayOfWeek")
 * .handOffTime("handOffTime")
 * .build()))
 * .build())
 * .startTime("startTime")
 * .timeZoneId("timeZoneId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html)
 */
public open class CfnRotation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRotationProps,
  ) :
      this(software.amazon.awscdk.services.ssmcontacts.CfnRotation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnRotationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRotationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRotationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the `Rotation` resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
   */
  public open fun contactIds(): List<String> = unwrap(this).getContactIds()

  /**
   * The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
   */
  public open fun contactIds(`value`: List<String>) {
    unwrap(this).setContactIds(`value`)
  }

  /**
   * The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
   */
  public open fun contactIds(vararg `value`: String): Unit = contactIds(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name for the rotation.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name for the rotation.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Information about the rule that specifies when shift team members rotate.
   */
  public open fun recurrence(): Any = unwrap(this).getRecurrence()

  /**
   * Information about the rule that specifies when shift team members rotate.
   */
  public open fun recurrence(`value`: IResolvable) {
    unwrap(this).setRecurrence(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the rule that specifies when shift team members rotate.
   */
  public open fun recurrence(`value`: RecurrenceSettingsProperty) {
    unwrap(this).setRecurrence(`value`.let(RecurrenceSettingsProperty::unwrap))
  }

  /**
   * Information about the rule that specifies when shift team members rotate.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cd9e59445e8a5fdfb0b4ca205908549790e053d0a0b7243569cda6fc1ba89631")
  public open fun recurrence(`value`: RecurrenceSettingsProperty.Builder.() -> Unit): Unit =
      recurrence(RecurrenceSettingsProperty(`value`))

  /**
   * The date and time the rotation goes into effect.
   */
  public open fun startTime(): String = unwrap(this).getStartTime()

  /**
   * The date and time the rotation goes into effect.
   */
  public open fun startTime(`value`: String) {
    unwrap(this).setStartTime(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Optional metadata to assign to the rotation.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Optional metadata to assign to the rotation.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Optional metadata to assign to the rotation.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The time zone to base the rotation’s activity on, in Internet Assigned Numbers Authority (IANA)
   * format.
   */
  public open fun timeZoneId(): String = unwrap(this).getTimeZoneId()

  /**
   * The time zone to base the rotation’s activity on, in Internet Assigned Numbers Authority (IANA)
   * format.
   */
  public open fun timeZoneId(`value`: String) {
    unwrap(this).setTimeZoneId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssmcontacts.CfnRotation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
     *
     * The order in which you list the contacts is their shift order in the rotation schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-contactids)
     * @param contactIds The Amazon Resource Names (ARNs) of the contacts to add to the rotation. 
     */
    public fun contactIds(contactIds: List<String>)

    /**
     * The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
     *
     * The order in which you list the contacts is their shift order in the rotation schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-contactids)
     * @param contactIds The Amazon Resource Names (ARNs) of the contacts to add to the rotation. 
     */
    public fun contactIds(vararg contactIds: String)

    /**
     * The name for the rotation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-name)
     * @param name The name for the rotation. 
     */
    public fun name(name: String)

    /**
     * Information about the rule that specifies when shift team members rotate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-recurrence)
     * @param recurrence Information about the rule that specifies when shift team members rotate. 
     */
    public fun recurrence(recurrence: IResolvable)

    /**
     * Information about the rule that specifies when shift team members rotate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-recurrence)
     * @param recurrence Information about the rule that specifies when shift team members rotate. 
     */
    public fun recurrence(recurrence: RecurrenceSettingsProperty)

    /**
     * Information about the rule that specifies when shift team members rotate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-recurrence)
     * @param recurrence Information about the rule that specifies when shift team members rotate. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a473203a88f63c44ef343838ca601eec3316185ba1b92295a7163e73dab0fed3")
    public fun recurrence(recurrence: RecurrenceSettingsProperty.Builder.() -> Unit)

    /**
     * The date and time the rotation goes into effect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-starttime)
     * @param startTime The date and time the rotation goes into effect. 
     */
    public fun startTime(startTime: String)

    /**
     * Optional metadata to assign to the rotation.
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For more information, see [Tagging Incident Manager
     * resources](https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html) in the
     * *Incident Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-tags)
     * @param tags Optional metadata to assign to the rotation. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Optional metadata to assign to the rotation.
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For more information, see [Tagging Incident Manager
     * resources](https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html) in the
     * *Incident Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-tags)
     * @param tags Optional metadata to assign to the rotation. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The time zone to base the rotation’s activity on, in Internet Assigned Numbers Authority
     * (IANA) format.
     *
     * For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the
     * [Time Zone Database](https://docs.aws.amazon.com/https://www.iana.org/time-zones) on the IANA
     * website.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-timezoneid)
     * @param timeZoneId The time zone to base the rotation’s activity on, in Internet Assigned
     * Numbers Authority (IANA) format. 
     */
    public fun timeZoneId(timeZoneId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmcontacts.CfnRotation.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnRotation.Builder.create(scope, id)

    /**
     * The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
     *
     * The order in which you list the contacts is their shift order in the rotation schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-contactids)
     * @param contactIds The Amazon Resource Names (ARNs) of the contacts to add to the rotation. 
     */
    override fun contactIds(contactIds: List<String>) {
      cdkBuilder.contactIds(contactIds)
    }

    /**
     * The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
     *
     * The order in which you list the contacts is their shift order in the rotation schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-contactids)
     * @param contactIds The Amazon Resource Names (ARNs) of the contacts to add to the rotation. 
     */
    override fun contactIds(vararg contactIds: String): Unit = contactIds(contactIds.toList())

    /**
     * The name for the rotation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-name)
     * @param name The name for the rotation. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Information about the rule that specifies when shift team members rotate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-recurrence)
     * @param recurrence Information about the rule that specifies when shift team members rotate. 
     */
    override fun recurrence(recurrence: IResolvable) {
      cdkBuilder.recurrence(recurrence.let(IResolvable::unwrap))
    }

    /**
     * Information about the rule that specifies when shift team members rotate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-recurrence)
     * @param recurrence Information about the rule that specifies when shift team members rotate. 
     */
    override fun recurrence(recurrence: RecurrenceSettingsProperty) {
      cdkBuilder.recurrence(recurrence.let(RecurrenceSettingsProperty::unwrap))
    }

    /**
     * Information about the rule that specifies when shift team members rotate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-recurrence)
     * @param recurrence Information about the rule that specifies when shift team members rotate. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a473203a88f63c44ef343838ca601eec3316185ba1b92295a7163e73dab0fed3")
    override fun recurrence(recurrence: RecurrenceSettingsProperty.Builder.() -> Unit): Unit =
        recurrence(RecurrenceSettingsProperty(recurrence))

    /**
     * The date and time the rotation goes into effect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-starttime)
     * @param startTime The date and time the rotation goes into effect. 
     */
    override fun startTime(startTime: String) {
      cdkBuilder.startTime(startTime)
    }

    /**
     * Optional metadata to assign to the rotation.
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For more information, see [Tagging Incident Manager
     * resources](https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html) in the
     * *Incident Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-tags)
     * @param tags Optional metadata to assign to the rotation. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Optional metadata to assign to the rotation.
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For more information, see [Tagging Incident Manager
     * resources](https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html) in the
     * *Incident Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-tags)
     * @param tags Optional metadata to assign to the rotation. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The time zone to base the rotation’s activity on, in Internet Assigned Numbers Authority
     * (IANA) format.
     *
     * For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the
     * [Time Zone Database](https://docs.aws.amazon.com/https://www.iana.org/time-zones) on the IANA
     * website.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-timezoneid)
     * @param timeZoneId The time zone to base the rotation’s activity on, in Internet Assigned
     * Numbers Authority (IANA) format. 
     */
    override fun timeZoneId(timeZoneId: String) {
      cdkBuilder.timeZoneId(timeZoneId)
    }

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnRotation = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssmcontacts.CfnRotation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRotation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRotation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation):
        CfnRotation = CfnRotation(cdkObject)

    internal fun unwrap(wrapped: CfnRotation):
        software.amazon.awscdk.services.ssmcontacts.CfnRotation = wrapped.cdkObject
  }

  /**
   * Information about when an on-call shift begins and ends.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
   * CoverageTimeProperty coverageTimeProperty = CoverageTimeProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-coveragetime.html)
   */
  public interface CoverageTimeProperty {
    /**
     * Information about when an on-call rotation shift ends.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-coveragetime.html#cfn-ssmcontacts-rotation-coveragetime-endtime)
     */
    public fun endTime(): String

    /**
     * Information about when an on-call rotation shift begins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-coveragetime.html#cfn-ssmcontacts-rotation-coveragetime-starttime)
     */
    public fun startTime(): String

    /**
     * A builder for [CoverageTimeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endTime Information about when an on-call rotation shift ends. 
       */
      public fun endTime(endTime: String)

      /**
       * @param startTime Information about when an on-call rotation shift begins. 
       */
      public fun startTime(startTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty.builder()

      /**
       * @param endTime Information about when an on-call rotation shift ends. 
       */
      override fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
      }

      /**
       * @param startTime Information about when an on-call rotation shift begins. 
       */
      override fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty,
    ) : CdkObject(cdkObject), CoverageTimeProperty {
      /**
       * Information about when an on-call rotation shift ends.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-coveragetime.html#cfn-ssmcontacts-rotation-coveragetime-endtime)
       */
      override fun endTime(): String = unwrap(this).getEndTime()

      /**
       * Information about when an on-call rotation shift begins.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-coveragetime.html#cfn-ssmcontacts-rotation-coveragetime-starttime)
       */
      override fun startTime(): String = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CoverageTimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty):
          CoverageTimeProperty = CdkObjectWrappers.wrap(cdkObject) as? CoverageTimeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoverageTimeProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.CoverageTimeProperty
    }
  }

  /**
   * Information about on-call rotations that recur monthly.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
   * MonthlySettingProperty monthlySettingProperty = MonthlySettingProperty.builder()
   * .dayOfMonth(123)
   * .handOffTime("handOffTime")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-monthlysetting.html)
   */
  public interface MonthlySettingProperty {
    /**
     * The day of the month when monthly recurring on-call rotations begin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-monthlysetting.html#cfn-ssmcontacts-rotation-monthlysetting-dayofmonth)
     */
    public fun dayOfMonth(): Number

    /**
     * The time of day when a monthly recurring on-call shift rotation begins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-monthlysetting.html#cfn-ssmcontacts-rotation-monthlysetting-handofftime)
     */
    public fun handOffTime(): String

    /**
     * A builder for [MonthlySettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dayOfMonth The day of the month when monthly recurring on-call rotations begin. 
       */
      public fun dayOfMonth(dayOfMonth: Number)

      /**
       * @param handOffTime The time of day when a monthly recurring on-call shift rotation begins. 
       */
      public fun handOffTime(handOffTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty.builder()

      /**
       * @param dayOfMonth The day of the month when monthly recurring on-call rotations begin. 
       */
      override fun dayOfMonth(dayOfMonth: Number) {
        cdkBuilder.dayOfMonth(dayOfMonth)
      }

      /**
       * @param handOffTime The time of day when a monthly recurring on-call shift rotation begins. 
       */
      override fun handOffTime(handOffTime: String) {
        cdkBuilder.handOffTime(handOffTime)
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty,
    ) : CdkObject(cdkObject), MonthlySettingProperty {
      /**
       * The day of the month when monthly recurring on-call rotations begin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-monthlysetting.html#cfn-ssmcontacts-rotation-monthlysetting-dayofmonth)
       */
      override fun dayOfMonth(): Number = unwrap(this).getDayOfMonth()

      /**
       * The time of day when a monthly recurring on-call shift rotation begins.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-monthlysetting.html#cfn-ssmcontacts-rotation-monthlysetting-handofftime)
       */
      override fun handOffTime(): String = unwrap(this).getHandOffTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonthlySettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty):
          MonthlySettingProperty = CdkObjectWrappers.wrap(cdkObject) as? MonthlySettingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonthlySettingProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.MonthlySettingProperty
    }
  }

  /**
   * Information about when an on-call rotation is in effect and how long the rotation period lasts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
   * RecurrenceSettingsProperty recurrenceSettingsProperty = RecurrenceSettingsProperty.builder()
   * .numberOfOnCalls(123)
   * .recurrenceMultiplier(123)
   * // the properties below are optional
   * .dailySettings(List.of("dailySettings"))
   * .monthlySettings(List.of(MonthlySettingProperty.builder()
   * .dayOfMonth(123)
   * .handOffTime("handOffTime")
   * .build()))
   * .shiftCoverages(List.of(ShiftCoverageProperty.builder()
   * .coverageTimes(List.of(CoverageTimeProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * .build()))
   * .dayOfWeek("dayOfWeek")
   * .build()))
   * .weeklySettings(List.of(WeeklySettingProperty.builder()
   * .dayOfWeek("dayOfWeek")
   * .handOffTime("handOffTime")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-recurrencesettings.html)
   */
  public interface RecurrenceSettingsProperty {
    /**
     * Information about on-call rotations that recur daily.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-recurrencesettings.html#cfn-ssmcontacts-rotation-recurrencesettings-dailysettings)
     */
    public fun dailySettings(): List<String> = unwrap(this).getDailySettings() ?: emptyList()

    /**
     * Information about on-call rotations that recur monthly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-recurrencesettings.html#cfn-ssmcontacts-rotation-recurrencesettings-monthlysettings)
     */
    public fun monthlySettings(): Any? = unwrap(this).getMonthlySettings()

    /**
     * The number of contacts, or shift team members designated to be on call concurrently during a
     * shift.
     *
     * For example, in an on-call schedule that contains ten contacts, a value of `2` designates
     * that two of them are on call at any given time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-recurrencesettings.html#cfn-ssmcontacts-rotation-recurrencesettings-numberofoncalls)
     */
    public fun numberOfOnCalls(): Number

    /**
     * The number of days, weeks, or months a single rotation lasts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-recurrencesettings.html#cfn-ssmcontacts-rotation-recurrencesettings-recurrencemultiplier)
     */
    public fun recurrenceMultiplier(): Number

    /**
     * Information about the days of the week included in on-call rotation coverage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-recurrencesettings.html#cfn-ssmcontacts-rotation-recurrencesettings-shiftcoverages)
     */
    public fun shiftCoverages(): Any? = unwrap(this).getShiftCoverages()

    /**
     * Information about on-call rotations that recur weekly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-recurrencesettings.html#cfn-ssmcontacts-rotation-recurrencesettings-weeklysettings)
     */
    public fun weeklySettings(): Any? = unwrap(this).getWeeklySettings()

    /**
     * A builder for [RecurrenceSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dailySettings Information about on-call rotations that recur daily.
       */
      public fun dailySettings(dailySettings: List<String>)

      /**
       * @param dailySettings Information about on-call rotations that recur daily.
       */
      public fun dailySettings(vararg dailySettings: String)

      /**
       * @param monthlySettings Information about on-call rotations that recur monthly.
       */
      public fun monthlySettings(monthlySettings: IResolvable)

      /**
       * @param monthlySettings Information about on-call rotations that recur monthly.
       */
      public fun monthlySettings(monthlySettings: List<Any>)

      /**
       * @param monthlySettings Information about on-call rotations that recur monthly.
       */
      public fun monthlySettings(vararg monthlySettings: Any)

      /**
       * @param numberOfOnCalls The number of contacts, or shift team members designated to be on
       * call concurrently during a shift. 
       * For example, in an on-call schedule that contains ten contacts, a value of `2` designates
       * that two of them are on call at any given time.
       */
      public fun numberOfOnCalls(numberOfOnCalls: Number)

      /**
       * @param recurrenceMultiplier The number of days, weeks, or months a single rotation lasts. 
       */
      public fun recurrenceMultiplier(recurrenceMultiplier: Number)

      /**
       * @param shiftCoverages Information about the days of the week included in on-call rotation
       * coverage.
       */
      public fun shiftCoverages(shiftCoverages: IResolvable)

      /**
       * @param shiftCoverages Information about the days of the week included in on-call rotation
       * coverage.
       */
      public fun shiftCoverages(shiftCoverages: List<Any>)

      /**
       * @param shiftCoverages Information about the days of the week included in on-call rotation
       * coverage.
       */
      public fun shiftCoverages(vararg shiftCoverages: Any)

      /**
       * @param weeklySettings Information about on-call rotations that recur weekly.
       */
      public fun weeklySettings(weeklySettings: IResolvable)

      /**
       * @param weeklySettings Information about on-call rotations that recur weekly.
       */
      public fun weeklySettings(weeklySettings: List<Any>)

      /**
       * @param weeklySettings Information about on-call rotations that recur weekly.
       */
      public fun weeklySettings(vararg weeklySettings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty.builder()

      /**
       * @param dailySettings Information about on-call rotations that recur daily.
       */
      override fun dailySettings(dailySettings: List<String>) {
        cdkBuilder.dailySettings(dailySettings)
      }

      /**
       * @param dailySettings Information about on-call rotations that recur daily.
       */
      override fun dailySettings(vararg dailySettings: String): Unit =
          dailySettings(dailySettings.toList())

      /**
       * @param monthlySettings Information about on-call rotations that recur monthly.
       */
      override fun monthlySettings(monthlySettings: IResolvable) {
        cdkBuilder.monthlySettings(monthlySettings.let(IResolvable::unwrap))
      }

      /**
       * @param monthlySettings Information about on-call rotations that recur monthly.
       */
      override fun monthlySettings(monthlySettings: List<Any>) {
        cdkBuilder.monthlySettings(monthlySettings)
      }

      /**
       * @param monthlySettings Information about on-call rotations that recur monthly.
       */
      override fun monthlySettings(vararg monthlySettings: Any): Unit =
          monthlySettings(monthlySettings.toList())

      /**
       * @param numberOfOnCalls The number of contacts, or shift team members designated to be on
       * call concurrently during a shift. 
       * For example, in an on-call schedule that contains ten contacts, a value of `2` designates
       * that two of them are on call at any given time.
       */
      override fun numberOfOnCalls(numberOfOnCalls: Number) {
        cdkBuilder.numberOfOnCalls(numberOfOnCalls)
      }

      /**
       * @param recurrenceMultiplier The number of days, weeks, or months a single rotation lasts. 
       */
      override fun recurrenceMultiplier(recurrenceMultiplier: Number) {
        cdkBuilder.recurrenceMultiplier(recurrenceMultiplier)
      }

      /**
       * @param shiftCoverages Information about the days of the week included in on-call rotation
       * coverage.
       */
      override fun shiftCoverages(shiftCoverages: IResolvable) {
        cdkBuilder.shiftCoverages(shiftCoverages.let(IResolvable::unwrap))
      }

      /**
       * @param shiftCoverages Information about the days of the week included in on-call rotation
       * coverage.
       */
      override fun shiftCoverages(shiftCoverages: List<Any>) {
        cdkBuilder.shiftCoverages(shiftCoverages)
      }

      /**
       * @param shiftCoverages Information about the days of the week included in on-call rotation
       * coverage.
       */
      override fun shiftCoverages(vararg shiftCoverages: Any): Unit =
          shiftCoverages(shiftCoverages.toList())

      /**
       * @param weeklySettings Information about on-call rotations that recur weekly.
       */
      override fun weeklySettings(weeklySettings: IResolvable) {
        cdkBuilder.weeklySettings(weeklySettings.let(IResolvable::unwrap))
      }

      /**
       * @param weeklySettings Information about on-call rotations that recur weekly.
       */
      override fun weeklySettings(weeklySettings: List<Any>) {
        cdkBuilder.weeklySettings(weeklySettings)
      }

      /**
       * @param weeklySettings Information about on-call rotations that recur weekly.
       */
      override fun weeklySettings(vararg weeklySettings: Any): Unit =
          weeklySettings(weeklySettings.toList())

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty,
    ) : CdkObject(cdkObject), RecurrenceSettingsProperty {
      /**
       * Information about on-call rotations that recur daily.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-recurrencesettings.html#cfn-ssmcontacts-rotation-recurrencesettings-dailysettings)
       */
      override fun dailySettings(): List<String> = unwrap(this).getDailySettings() ?: emptyList()

      /**
       * Information about on-call rotations that recur monthly.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-recurrencesettings.html#cfn-ssmcontacts-rotation-recurrencesettings-monthlysettings)
       */
      override fun monthlySettings(): Any? = unwrap(this).getMonthlySettings()

      /**
       * The number of contacts, or shift team members designated to be on call concurrently during
       * a shift.
       *
       * For example, in an on-call schedule that contains ten contacts, a value of `2` designates
       * that two of them are on call at any given time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-recurrencesettings.html#cfn-ssmcontacts-rotation-recurrencesettings-numberofoncalls)
       */
      override fun numberOfOnCalls(): Number = unwrap(this).getNumberOfOnCalls()

      /**
       * The number of days, weeks, or months a single rotation lasts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-recurrencesettings.html#cfn-ssmcontacts-rotation-recurrencesettings-recurrencemultiplier)
       */
      override fun recurrenceMultiplier(): Number = unwrap(this).getRecurrenceMultiplier()

      /**
       * Information about the days of the week included in on-call rotation coverage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-recurrencesettings.html#cfn-ssmcontacts-rotation-recurrencesettings-shiftcoverages)
       */
      override fun shiftCoverages(): Any? = unwrap(this).getShiftCoverages()

      /**
       * Information about on-call rotations that recur weekly.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-recurrencesettings.html#cfn-ssmcontacts-rotation-recurrencesettings-weeklysettings)
       */
      override fun weeklySettings(): Any? = unwrap(this).getWeeklySettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecurrenceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty):
          RecurrenceSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RecurrenceSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecurrenceSettingsProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.RecurrenceSettingsProperty
    }
  }

  /**
   * Information about the days of the week that the on-call rotation coverage includes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
   * ShiftCoverageProperty shiftCoverageProperty = ShiftCoverageProperty.builder()
   * .coverageTimes(List.of(CoverageTimeProperty.builder()
   * .endTime("endTime")
   * .startTime("startTime")
   * .build()))
   * .dayOfWeek("dayOfWeek")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-shiftcoverage.html)
   */
  public interface ShiftCoverageProperty {
    /**
     * The start and end times of the shift.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-shiftcoverage.html#cfn-ssmcontacts-rotation-shiftcoverage-coveragetimes)
     */
    public fun coverageTimes(): Any

    /**
     * A list of days on which the schedule is active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-shiftcoverage.html#cfn-ssmcontacts-rotation-shiftcoverage-dayofweek)
     */
    public fun dayOfWeek(): String

    /**
     * A builder for [ShiftCoverageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param coverageTimes The start and end times of the shift. 
       */
      public fun coverageTimes(coverageTimes: IResolvable)

      /**
       * @param coverageTimes The start and end times of the shift. 
       */
      public fun coverageTimes(coverageTimes: List<Any>)

      /**
       * @param coverageTimes The start and end times of the shift. 
       */
      public fun coverageTimes(vararg coverageTimes: Any)

      /**
       * @param dayOfWeek A list of days on which the schedule is active. 
       */
      public fun dayOfWeek(dayOfWeek: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty.builder()

      /**
       * @param coverageTimes The start and end times of the shift. 
       */
      override fun coverageTimes(coverageTimes: IResolvable) {
        cdkBuilder.coverageTimes(coverageTimes.let(IResolvable::unwrap))
      }

      /**
       * @param coverageTimes The start and end times of the shift. 
       */
      override fun coverageTimes(coverageTimes: List<Any>) {
        cdkBuilder.coverageTimes(coverageTimes)
      }

      /**
       * @param coverageTimes The start and end times of the shift. 
       */
      override fun coverageTimes(vararg coverageTimes: Any): Unit =
          coverageTimes(coverageTimes.toList())

      /**
       * @param dayOfWeek A list of days on which the schedule is active. 
       */
      override fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty,
    ) : CdkObject(cdkObject), ShiftCoverageProperty {
      /**
       * The start and end times of the shift.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-shiftcoverage.html#cfn-ssmcontacts-rotation-shiftcoverage-coveragetimes)
       */
      override fun coverageTimes(): Any = unwrap(this).getCoverageTimes()

      /**
       * A list of days on which the schedule is active.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-shiftcoverage.html#cfn-ssmcontacts-rotation-shiftcoverage-dayofweek)
       */
      override fun dayOfWeek(): String = unwrap(this).getDayOfWeek()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ShiftCoverageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty):
          ShiftCoverageProperty = CdkObjectWrappers.wrap(cdkObject) as? ShiftCoverageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShiftCoverageProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.ShiftCoverageProperty
    }
  }

  /**
   * Information about rotations that recur weekly.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
   * WeeklySettingProperty weeklySettingProperty = WeeklySettingProperty.builder()
   * .dayOfWeek("dayOfWeek")
   * .handOffTime("handOffTime")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-weeklysetting.html)
   */
  public interface WeeklySettingProperty {
    /**
     * The day of the week when weekly recurring on-call shift rotations begins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-weeklysetting.html#cfn-ssmcontacts-rotation-weeklysetting-dayofweek)
     */
    public fun dayOfWeek(): String

    /**
     * The time of day when a weekly recurring on-call shift rotation begins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-weeklysetting.html#cfn-ssmcontacts-rotation-weeklysetting-handofftime)
     */
    public fun handOffTime(): String

    /**
     * A builder for [WeeklySettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dayOfWeek The day of the week when weekly recurring on-call shift rotations begins. 
       */
      public fun dayOfWeek(dayOfWeek: String)

      /**
       * @param handOffTime The time of day when a weekly recurring on-call shift rotation begins. 
       */
      public fun handOffTime(handOffTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty.Builder =
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty.builder()

      /**
       * @param dayOfWeek The day of the week when weekly recurring on-call shift rotations begins. 
       */
      override fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
      }

      /**
       * @param handOffTime The time of day when a weekly recurring on-call shift rotation begins. 
       */
      override fun handOffTime(handOffTime: String) {
        cdkBuilder.handOffTime(handOffTime)
      }

      public fun build():
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty,
    ) : CdkObject(cdkObject), WeeklySettingProperty {
      /**
       * The day of the week when weekly recurring on-call shift rotations begins.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-weeklysetting.html#cfn-ssmcontacts-rotation-weeklysetting-dayofweek)
       */
      override fun dayOfWeek(): String = unwrap(this).getDayOfWeek()

      /**
       * The time of day when a weekly recurring on-call shift rotation begins.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-weeklysetting.html#cfn-ssmcontacts-rotation-weeklysetting-handofftime)
       */
      override fun handOffTime(): String = unwrap(this).getHandOffTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WeeklySettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty):
          WeeklySettingProperty = CdkObjectWrappers.wrap(cdkObject) as? WeeklySettingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: WeeklySettingProperty):
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmcontacts.CfnRotation.WeeklySettingProperty
    }
  }
}
