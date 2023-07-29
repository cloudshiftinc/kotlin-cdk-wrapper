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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iot.CfnJobTemplate

/**
 * The criteria that determine when and how a job abort takes place.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * AbortCriteriaProperty abortCriteriaProperty = AbortCriteriaProperty.builder()
 * .action("action")
 * .failureType("failureType")
 * .minNumberOfExecutedThings(123)
 * .thresholdPercentage(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-abortcriteria.html)
 */
@CdkDslMarker
public class CfnJobTemplateAbortCriteriaPropertyDsl {
    private val cdkBuilder: CfnJobTemplate.AbortCriteriaProperty.Builder =
        CfnJobTemplate.AbortCriteriaProperty.builder()

    /** @param action The type of job action to take to initiate the job abort. */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /** @param failureType The type of job execution failures that can initiate a job abort. */
    public fun failureType(failureType: String) {
        cdkBuilder.failureType(failureType)
    }

    /**
     * @param minNumberOfExecutedThings The minimum number of things which must receive job
     *   execution notifications before the job can be aborted.
     */
    public fun minNumberOfExecutedThings(minNumberOfExecutedThings: Number) {
        cdkBuilder.minNumberOfExecutedThings(minNumberOfExecutedThings)
    }

    /**
     * @param thresholdPercentage The minimum percentage of job execution failures that must occur
     *   to initiate the job abort. AWS IoT Core supports up to two digits after the decimal (for
     *   example, 10.9 and 10.99, but not 10.999).
     */
    public fun thresholdPercentage(thresholdPercentage: Number) {
        cdkBuilder.thresholdPercentage(thresholdPercentage)
    }

    public fun build(): CfnJobTemplate.AbortCriteriaProperty = cdkBuilder.build()
}
