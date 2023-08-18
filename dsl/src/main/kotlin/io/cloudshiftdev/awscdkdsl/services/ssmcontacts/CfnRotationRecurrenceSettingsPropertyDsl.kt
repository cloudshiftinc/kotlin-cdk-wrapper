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

package io.cloudshiftdev.awscdkdsl.services.ssmcontacts

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnRotation

/**
 * Information about when an on-call rotation is in effect and how long the rotation period lasts.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmcontacts.*;
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
@CdkDslMarker
public class CfnRotationRecurrenceSettingsPropertyDsl {
    private val cdkBuilder: CfnRotation.RecurrenceSettingsProperty.Builder =
        CfnRotation.RecurrenceSettingsProperty.builder()

    private val _dailySettings: MutableList<String> = mutableListOf()

    private val _monthlySettings: MutableList<Any> = mutableListOf()

    private val _shiftCoverages: MutableList<Any> = mutableListOf()

    private val _weeklySettings: MutableList<Any> = mutableListOf()

    /** @param dailySettings Information about on-call rotations that recur daily. */
    public fun dailySettings(vararg dailySettings: String) {
        _dailySettings.addAll(listOf(*dailySettings))
    }

    /** @param dailySettings Information about on-call rotations that recur daily. */
    public fun dailySettings(dailySettings: Collection<String>) {
        _dailySettings.addAll(dailySettings)
    }

    /** @param monthlySettings Information about on-call rotations that recur monthly. */
    public fun monthlySettings(vararg monthlySettings: Any) {
        _monthlySettings.addAll(listOf(*monthlySettings))
    }

    /** @param monthlySettings Information about on-call rotations that recur monthly. */
    public fun monthlySettings(monthlySettings: Collection<Any>) {
        _monthlySettings.addAll(monthlySettings)
    }

    /** @param monthlySettings Information about on-call rotations that recur monthly. */
    public fun monthlySettings(monthlySettings: IResolvable) {
        cdkBuilder.monthlySettings(monthlySettings)
    }

    /**
     * @param numberOfOnCalls The number of contacts, or shift team members designated to be on call
     *   concurrently during a shift. For example, in an on-call schedule that contains ten
     *   contacts, a value of `2` designates that two of them are on call at any given time.
     */
    public fun numberOfOnCalls(numberOfOnCalls: Number) {
        cdkBuilder.numberOfOnCalls(numberOfOnCalls)
    }

    /** @param recurrenceMultiplier The number of days, weeks, or months a single rotation lasts. */
    public fun recurrenceMultiplier(recurrenceMultiplier: Number) {
        cdkBuilder.recurrenceMultiplier(recurrenceMultiplier)
    }

    /**
     * @param shiftCoverages Information about the days of the week included in on-call rotation
     *   coverage.
     */
    public fun shiftCoverages(vararg shiftCoverages: Any) {
        _shiftCoverages.addAll(listOf(*shiftCoverages))
    }

    /**
     * @param shiftCoverages Information about the days of the week included in on-call rotation
     *   coverage.
     */
    public fun shiftCoverages(shiftCoverages: Collection<Any>) {
        _shiftCoverages.addAll(shiftCoverages)
    }

    /**
     * @param shiftCoverages Information about the days of the week included in on-call rotation
     *   coverage.
     */
    public fun shiftCoverages(shiftCoverages: IResolvable) {
        cdkBuilder.shiftCoverages(shiftCoverages)
    }

    /** @param weeklySettings Information about on-call rotations that recur weekly. */
    public fun weeklySettings(vararg weeklySettings: Any) {
        _weeklySettings.addAll(listOf(*weeklySettings))
    }

    /** @param weeklySettings Information about on-call rotations that recur weekly. */
    public fun weeklySettings(weeklySettings: Collection<Any>) {
        _weeklySettings.addAll(weeklySettings)
    }

    /** @param weeklySettings Information about on-call rotations that recur weekly. */
    public fun weeklySettings(weeklySettings: IResolvable) {
        cdkBuilder.weeklySettings(weeklySettings)
    }

    public fun build(): CfnRotation.RecurrenceSettingsProperty {
        if (_dailySettings.isNotEmpty()) cdkBuilder.dailySettings(_dailySettings)
        if (_monthlySettings.isNotEmpty()) cdkBuilder.monthlySettings(_monthlySettings)
        if (_shiftCoverages.isNotEmpty()) cdkBuilder.shiftCoverages(_shiftCoverages)
        if (_weeklySettings.isNotEmpty()) cdkBuilder.weeklySettings(_weeklySettings)
        return cdkBuilder.build()
    }
}
