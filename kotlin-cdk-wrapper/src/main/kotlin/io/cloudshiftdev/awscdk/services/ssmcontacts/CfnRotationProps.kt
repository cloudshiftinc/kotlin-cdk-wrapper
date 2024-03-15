@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmcontacts

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnRotation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
 * CfnRotationProps cfnRotationProps = CfnRotationProps.builder()
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
public interface CfnRotationProps {
  /**
   * The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
   *
   * The order in which you list the contacts is their shift order in the rotation schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-contactids)
   */
  public fun contactIds(): List<String>

  /**
   * The name for the rotation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-name)
   */
  public fun name(): String

  /**
   * Information about the rule that specifies when shift team members rotate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-recurrence)
   */
  public fun recurrence(): Any

  /**
   * The date and time the rotation goes into effect.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-starttime)
   */
  public fun startTime(): String

  /**
   * Optional metadata to assign to the rotation.
   *
   * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
   * environment. For more information, see [Tagging Incident Manager
   * resources](https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html) in the
   * *Incident Manager User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The time zone to base the rotation’s activity on, in Internet Assigned Numbers Authority (IANA)
   * format.
   *
   * For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the [Time
   * Zone Database](https://docs.aws.amazon.com/https://www.iana.org/time-zones) on the IANA website.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-timezoneid)
   */
  public fun timeZoneId(): String

  /**
   * A builder for [CfnRotationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contactIds The Amazon Resource Names (ARNs) of the contacts to add to the rotation. 
     * The order in which you list the contacts is their shift order in the rotation schedule.
     */
    public fun contactIds(contactIds: List<String>)

    /**
     * @param contactIds The Amazon Resource Names (ARNs) of the contacts to add to the rotation. 
     * The order in which you list the contacts is their shift order in the rotation schedule.
     */
    public fun contactIds(vararg contactIds: String)

    /**
     * @param name The name for the rotation. 
     */
    public fun name(name: String)

    /**
     * @param recurrence Information about the rule that specifies when shift team members rotate. 
     */
    public fun recurrence(recurrence: IResolvable)

    /**
     * @param recurrence Information about the rule that specifies when shift team members rotate. 
     */
    public fun recurrence(recurrence: CfnRotation.RecurrenceSettingsProperty)

    /**
     * @param recurrence Information about the rule that specifies when shift team members rotate. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("150001fcccc1f907929bee804ff7e0ffc4a525debc807d256dac3114b206b53e")
    public fun recurrence(recurrence: CfnRotation.RecurrenceSettingsProperty.Builder.() -> Unit)

    /**
     * @param startTime The date and time the rotation goes into effect. 
     */
    public fun startTime(startTime: String)

    /**
     * @param tags Optional metadata to assign to the rotation.
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For more information, see [Tagging Incident Manager
     * resources](https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html) in the
     * *Incident Manager User Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Optional metadata to assign to the rotation.
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For more information, see [Tagging Incident Manager
     * resources](https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html) in the
     * *Incident Manager User Guide* .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param timeZoneId The time zone to base the rotation’s activity on, in Internet Assigned
     * Numbers Authority (IANA) format. 
     * For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the
     * [Time Zone Database](https://docs.aws.amazon.com/https://www.iana.org/time-zones) on the IANA
     * website.
     */
    public fun timeZoneId(timeZoneId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmcontacts.CfnRotationProps.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnRotationProps.builder()

    /**
     * @param contactIds The Amazon Resource Names (ARNs) of the contacts to add to the rotation. 
     * The order in which you list the contacts is their shift order in the rotation schedule.
     */
    override fun contactIds(contactIds: List<String>) {
      cdkBuilder.contactIds(contactIds)
    }

    /**
     * @param contactIds The Amazon Resource Names (ARNs) of the contacts to add to the rotation. 
     * The order in which you list the contacts is their shift order in the rotation schedule.
     */
    override fun contactIds(vararg contactIds: String): Unit = contactIds(contactIds.toList())

    /**
     * @param name The name for the rotation. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param recurrence Information about the rule that specifies when shift team members rotate. 
     */
    override fun recurrence(recurrence: IResolvable) {
      cdkBuilder.recurrence(recurrence.let(IResolvable::unwrap))
    }

    /**
     * @param recurrence Information about the rule that specifies when shift team members rotate. 
     */
    override fun recurrence(recurrence: CfnRotation.RecurrenceSettingsProperty) {
      cdkBuilder.recurrence(recurrence.let(CfnRotation.RecurrenceSettingsProperty::unwrap))
    }

    /**
     * @param recurrence Information about the rule that specifies when shift team members rotate. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("150001fcccc1f907929bee804ff7e0ffc4a525debc807d256dac3114b206b53e")
    override fun recurrence(recurrence: CfnRotation.RecurrenceSettingsProperty.Builder.() -> Unit):
        Unit = recurrence(CfnRotation.RecurrenceSettingsProperty(recurrence))

    /**
     * @param startTime The date and time the rotation goes into effect. 
     */
    override fun startTime(startTime: String) {
      cdkBuilder.startTime(startTime)
    }

    /**
     * @param tags Optional metadata to assign to the rotation.
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For more information, see [Tagging Incident Manager
     * resources](https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html) in the
     * *Incident Manager User Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Optional metadata to assign to the rotation.
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For more information, see [Tagging Incident Manager
     * resources](https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html) in the
     * *Incident Manager User Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param timeZoneId The time zone to base the rotation’s activity on, in Internet Assigned
     * Numbers Authority (IANA) format. 
     * For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the
     * [Time Zone Database](https://docs.aws.amazon.com/https://www.iana.org/time-zones) on the IANA
     * website.
     */
    override fun timeZoneId(timeZoneId: String) {
      cdkBuilder.timeZoneId(timeZoneId)
    }

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnRotationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotationProps,
  ) : CdkObject(cdkObject), CfnRotationProps {
    /**
     * The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
     *
     * The order in which you list the contacts is their shift order in the rotation schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-contactids)
     */
    override fun contactIds(): List<String> = unwrap(this).getContactIds()

    /**
     * The name for the rotation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Information about the rule that specifies when shift team members rotate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-recurrence)
     */
    override fun recurrence(): Any = unwrap(this).getRecurrence()

    /**
     * The date and time the rotation goes into effect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-starttime)
     */
    override fun startTime(): String = unwrap(this).getStartTime()

    /**
     * Optional metadata to assign to the rotation.
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For more information, see [Tagging Incident Manager
     * resources](https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html) in the
     * *Incident Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The time zone to base the rotation’s activity on, in Internet Assigned Numbers Authority
     * (IANA) format.
     *
     * For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the
     * [Time Zone Database](https://docs.aws.amazon.com/https://www.iana.org/time-zones) on the IANA
     * website.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-timezoneid)
     */
    override fun timeZoneId(): String = unwrap(this).getTimeZoneId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRotationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnRotationProps):
        CfnRotationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRotationProps):
        software.amazon.awscdk.services.ssmcontacts.CfnRotationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssmcontacts.CfnRotationProps
  }
}
