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

package io.cloudshiftdev.awscdkdsl.services.arczonalshift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration

/**
 * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
 * specified for a practice run, as well as any blocked dates or blocked windows for the practice
 * run.
 *
 * When a resource has a practice run configuation, Route 53 ARC starts weekly zonal shifts for the
 * resource, to shift traffic away from an Availability Zone. Weekly practice runs help you to make
 * sure that your application can continue to operate normally with the loss of one Availability
 * Zone.
 *
 * You can update or delete a practice run configuration. When you delete a practice run
 * configuration, zonal autoshift is disabled for the resource. A practice run configuration is
 * required when zonal autoshift is enabled.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.arczonalshift.*;
 * PracticeRunConfigurationProperty practiceRunConfigurationProperty =
 * PracticeRunConfigurationProperty.builder()
 * .outcomeAlarms(List.of(ControlConditionProperty.builder()
 * .alarmIdentifier("alarmIdentifier")
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .blockedDates(List.of("blockedDates"))
 * .blockedWindows(List.of("blockedWindows"))
 * .blockingAlarms(List.of(ControlConditionProperty.builder()
 * .alarmIdentifier("alarmIdentifier")
 * .type("type")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration.html)
 */
@CdkDslMarker
public class CfnZonalAutoshiftConfigurationPracticeRunConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty.Builder =
        CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty.builder()

    private val _blockedDates: MutableList<String> = mutableListOf()

    private val _blockedWindows: MutableList<String> = mutableListOf()

    private val _blockingAlarms: MutableList<Any> = mutableListOf()

    private val _outcomeAlarms: MutableList<Any> = mutableListOf()

    /**
     * @param blockedDates An array of one or more dates that you can specify when AWS does not
     *   start practice runs for a resource. Dates are in UTC.
     *
     * Specify blocked dates in the format `YYYY-MM-DD` , separated by spaces.
     */
    public fun blockedDates(vararg blockedDates: String) {
        _blockedDates.addAll(listOf(*blockedDates))
    }

    /**
     * @param blockedDates An array of one or more dates that you can specify when AWS does not
     *   start practice runs for a resource. Dates are in UTC.
     *
     * Specify blocked dates in the format `YYYY-MM-DD` , separated by spaces.
     */
    public fun blockedDates(blockedDates: Collection<String>) {
        _blockedDates.addAll(blockedDates)
    }

    /**
     * @param blockedWindows An array of one or more days and times that you can specify when Route
     *   53 ARC does not start practice runs for a resource. Days and times are in UTC.
     *
     * Specify blocked windows in the format `DAY:HH:MM-DAY:HH:MM` , separated by spaces. For
     * example, `MON:18:30-MON:19:30 TUE:18:30-TUE:19:30` .
     */
    public fun blockedWindows(vararg blockedWindows: String) {
        _blockedWindows.addAll(listOf(*blockedWindows))
    }

    /**
     * @param blockedWindows An array of one or more days and times that you can specify when Route
     *   53 ARC does not start practice runs for a resource. Days and times are in UTC.
     *
     * Specify blocked windows in the format `DAY:HH:MM-DAY:HH:MM` , separated by spaces. For
     * example, `MON:18:30-MON:19:30 TUE:18:30-TUE:19:30` .
     */
    public fun blockedWindows(blockedWindows: Collection<String>) {
        _blockedWindows.addAll(blockedWindows)
    }

    /**
     * @param blockingAlarms An optional alarm that you can specify that blocks practice runs when
     *   the alarm is in an `ALARM` state. When a blocking alarm goes into an `ALARM` state, it
     *   prevents practice runs from being started, and ends practice runs that are in progress.
     */
    public fun blockingAlarms(vararg blockingAlarms: Any) {
        _blockingAlarms.addAll(listOf(*blockingAlarms))
    }

    /**
     * @param blockingAlarms An optional alarm that you can specify that blocks practice runs when
     *   the alarm is in an `ALARM` state. When a blocking alarm goes into an `ALARM` state, it
     *   prevents practice runs from being started, and ends practice runs that are in progress.
     */
    public fun blockingAlarms(blockingAlarms: Collection<Any>) {
        _blockingAlarms.addAll(blockingAlarms)
    }

    /**
     * @param blockingAlarms An optional alarm that you can specify that blocks practice runs when
     *   the alarm is in an `ALARM` state. When a blocking alarm goes into an `ALARM` state, it
     *   prevents practice runs from being started, and ends practice runs that are in progress.
     */
    public fun blockingAlarms(blockingAlarms: IResolvable) {
        cdkBuilder.blockingAlarms(blockingAlarms)
    }

    /**
     * @param outcomeAlarms The alarm that you specify to monitor the health of your application
     *   during practice runs. When the outcome alarm goes into an `ALARM` state, the practice run
     *   is ended and the outcome is set to `FAILED` .
     */
    public fun outcomeAlarms(vararg outcomeAlarms: Any) {
        _outcomeAlarms.addAll(listOf(*outcomeAlarms))
    }

    /**
     * @param outcomeAlarms The alarm that you specify to monitor the health of your application
     *   during practice runs. When the outcome alarm goes into an `ALARM` state, the practice run
     *   is ended and the outcome is set to `FAILED` .
     */
    public fun outcomeAlarms(outcomeAlarms: Collection<Any>) {
        _outcomeAlarms.addAll(outcomeAlarms)
    }

    /**
     * @param outcomeAlarms The alarm that you specify to monitor the health of your application
     *   during practice runs. When the outcome alarm goes into an `ALARM` state, the practice run
     *   is ended and the outcome is set to `FAILED` .
     */
    public fun outcomeAlarms(outcomeAlarms: IResolvable) {
        cdkBuilder.outcomeAlarms(outcomeAlarms)
    }

    public fun build(): CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty {
        if (_blockedDates.isNotEmpty()) cdkBuilder.blockedDates(_blockedDates)
        if (_blockedWindows.isNotEmpty()) cdkBuilder.blockedWindows(_blockedWindows)
        if (_blockingAlarms.isNotEmpty()) cdkBuilder.blockingAlarms(_blockingAlarms)
        if (_outcomeAlarms.isNotEmpty()) cdkBuilder.outcomeAlarms(_outcomeAlarms)
        return cdkBuilder.build()
    }
}
