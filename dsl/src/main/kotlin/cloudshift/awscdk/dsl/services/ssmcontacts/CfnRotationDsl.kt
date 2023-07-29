@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnRotation
import software.constructs.Construct

/**
 * Specifies a rotation in an on-call schedule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmcontacts.*;
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
@CdkDslMarker
public class CfnRotationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRotation.Builder = CfnRotation.Builder.create(scope, id)

    private val _contactIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
     *
     * The order in which you list the contacts is their shift order in the rotation schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-contactids)
     *
     * @param contactIds The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
     */
    public fun contactIds(vararg contactIds: String) {
        _contactIds.addAll(listOf(*contactIds))
    }

    /**
     * The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
     *
     * The order in which you list the contacts is their shift order in the rotation schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-contactids)
     *
     * @param contactIds The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
     */
    public fun contactIds(contactIds: Collection<String>) {
        _contactIds.addAll(contactIds)
    }

    /**
     * The name for the rotation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-name)
     *
     * @param name The name for the rotation.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Information about the rule that specifies when shift team members rotate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-recurrence)
     *
     * @param recurrence Information about the rule that specifies when shift team members rotate.
     */
    public fun recurrence(recurrence: IResolvable) {
        cdkBuilder.recurrence(recurrence)
    }

    /**
     * Information about the rule that specifies when shift team members rotate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-recurrence)
     *
     * @param recurrence Information about the rule that specifies when shift team members rotate.
     */
    public fun recurrence(recurrence: CfnRotation.RecurrenceSettingsProperty) {
        cdkBuilder.recurrence(recurrence)
    }

    /**
     * The date and time the rotation goes into effect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-starttime)
     *
     * @param startTime The date and time the rotation goes into effect.
     */
    public fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
    }

    /**
     * Optional metadata to assign to the rotation.
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For more information, see
     * [Tagging Incident Manager resources](https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html)
     * in the *Incident Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-tags)
     *
     * @param tags Optional metadata to assign to the rotation.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Optional metadata to assign to the rotation.
     *
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     * environment. For more information, see
     * [Tagging Incident Manager resources](https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html)
     * in the *Incident Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-tags)
     *
     * @param tags Optional metadata to assign to the rotation.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The time zone to base the rotation’s activity on, in Internet Assigned Numbers Authority
     * (IANA) format.
     *
     * For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the
     * [Time Zone Database](https://docs.aws.amazon.com/https://www.iana.org/time-zones) on the IANA
     * website.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-rotation.html#cfn-ssmcontacts-rotation-timezoneid)
     *
     * @param timeZoneId The time zone to base the rotation’s activity on, in Internet Assigned
     *   Numbers Authority (IANA) format.
     */
    public fun timeZoneId(timeZoneId: String) {
        cdkBuilder.timeZoneId(timeZoneId)
    }

    public fun build(): CfnRotation {
        if (_contactIds.isNotEmpty()) cdkBuilder.contactIds(_contactIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
