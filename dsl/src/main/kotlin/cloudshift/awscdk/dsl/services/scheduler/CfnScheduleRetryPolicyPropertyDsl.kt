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

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.scheduler.CfnSchedule

/**
 * A `RetryPolicy` object that includes information about the retry policy settings, including the
 * maximum age of an event, and the maximum number of times EventBridge Scheduler will try to
 * deliver the event to a target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.scheduler.*;
 * RetryPolicyProperty retryPolicyProperty = RetryPolicyProperty.builder()
 * .maximumEventAgeInSeconds(123)
 * .maximumRetryAttempts(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-retrypolicy.html)
 */
@CdkDslMarker
public class CfnScheduleRetryPolicyPropertyDsl {
    private val cdkBuilder: CfnSchedule.RetryPolicyProperty.Builder =
        CfnSchedule.RetryPolicyProperty.builder()

    /**
     * @param maximumEventAgeInSeconds The maximum amount of time, in seconds, to continue to make
     *   retry attempts.
     */
    public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
        cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
    }

    /**
     * @param maximumRetryAttempts The maximum number of retry attempts to make before the request
     *   fails. Retry attempts with exponential backoff continue until either the maximum number of
     *   attempts is made or until the duration of the `MaximumEventAgeInSeconds` is reached.
     */
    public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    public fun build(): CfnSchedule.RetryPolicyProperty = cdkBuilder.build()
}
