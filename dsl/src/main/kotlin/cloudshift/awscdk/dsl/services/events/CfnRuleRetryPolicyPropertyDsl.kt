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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.events.CfnRule

/**
 * A `RetryPolicy` object that includes information about the retry policy settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * RetryPolicyProperty retryPolicyProperty = RetryPolicyProperty.builder()
 * .maximumEventAgeInSeconds(123)
 * .maximumRetryAttempts(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-retrypolicy.html)
 */
@CdkDslMarker
public class CfnRuleRetryPolicyPropertyDsl {
    private val cdkBuilder: CfnRule.RetryPolicyProperty.Builder =
        CfnRule.RetryPolicyProperty.builder()

    /**
     * @param maximumEventAgeInSeconds The maximum amount of time, in seconds, to continue to make
     *   retry attempts.
     */
    public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
        cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
    }

    /**
     * @param maximumRetryAttempts The maximum number of retry attempts to make before the request
     *   fails. Retry attempts continue until either the maximum number of attempts is made or until
     *   the duration of the `MaximumEventAgeInSeconds` is met.
     */
    public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    public fun build(): CfnRule.RetryPolicyProperty = cdkBuilder.build()
}
