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

package io.cloudshiftdev.awscdkdsl.services.applicationinsights

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.applicationinsights.CfnApplication

/**
 * The `AWS::ApplicationInsights::Application WindowsEvent` property type specifies a Windows Event
 * to monitor for the component.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationinsights.*;
 * WindowsEventProperty windowsEventProperty = WindowsEventProperty.builder()
 * .eventLevels(List.of("eventLevels"))
 * .eventName("eventName")
 * .logGroupName("logGroupName")
 * // the properties below are optional
 * .patternSet("patternSet")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-windowsevent.html)
 */
@CdkDslMarker
public class CfnApplicationWindowsEventPropertyDsl {
    private val cdkBuilder: CfnApplication.WindowsEventProperty.Builder =
        CfnApplication.WindowsEventProperty.builder()

    private val _eventLevels: MutableList<String> = mutableListOf()

    /**
     * @param eventLevels The levels of event to log. You must specify each level to log. Possible
     *   values include `INFORMATION` , `WARNING` , `ERROR` , `CRITICAL` , and `VERBOSE` . This
     *   field is required for each type of Windows Event to log.
     */
    public fun eventLevels(vararg eventLevels: String) {
        _eventLevels.addAll(listOf(*eventLevels))
    }

    /**
     * @param eventLevels The levels of event to log. You must specify each level to log. Possible
     *   values include `INFORMATION` , `WARNING` , `ERROR` , `CRITICAL` , and `VERBOSE` . This
     *   field is required for each type of Windows Event to log.
     */
    public fun eventLevels(eventLevels: Collection<String>) {
        _eventLevels.addAll(eventLevels)
    }

    /**
     * @param eventName The type of Windows Events to log, equivalent to the Windows Event log
     *   channel name. For example, System, Security, CustomEventName, and so on. This field is
     *   required for each type of Windows event to log.
     */
    public fun eventName(eventName: String) {
        cdkBuilder.eventName(eventName)
    }

    /**
     * @param logGroupName The CloudWatch log group name to be associated with the monitored log.
     */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    /** @param patternSet The log pattern set. */
    public fun patternSet(patternSet: String) {
        cdkBuilder.patternSet(patternSet)
    }

    public fun build(): CfnApplication.WindowsEventProperty {
        if (_eventLevels.isNotEmpty()) cdkBuilder.eventLevels(_eventLevels)
        return cdkBuilder.build()
    }
}
