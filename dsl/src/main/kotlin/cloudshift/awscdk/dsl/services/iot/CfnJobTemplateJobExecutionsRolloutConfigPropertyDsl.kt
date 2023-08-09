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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnJobTemplate

/**
 * Allows you to create a staged rollout of a job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * JobExecutionsRolloutConfigProperty jobExecutionsRolloutConfigProperty =
 * JobExecutionsRolloutConfigProperty.builder()
 * .exponentialRolloutRate(ExponentialRolloutRateProperty.builder()
 * .baseRatePerMinute(123)
 * .incrementFactor(123)
 * .rateIncreaseCriteria(RateIncreaseCriteriaProperty.builder()
 * .numberOfNotifiedThings(123)
 * .numberOfSucceededThings(123)
 * .build())
 * .build())
 * .maximumPerMinute(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-jobexecutionsrolloutconfig.html)
 */
@CdkDslMarker
public class CfnJobTemplateJobExecutionsRolloutConfigPropertyDsl {
    private val cdkBuilder: CfnJobTemplate.JobExecutionsRolloutConfigProperty.Builder =
        CfnJobTemplate.JobExecutionsRolloutConfigProperty.builder()

    /**
     * @param exponentialRolloutRate The rate of increase for a job rollout. This parameter allows
     *   you to define an exponential rate for a job rollout.
     */
    public fun exponentialRolloutRate(exponentialRolloutRate: IResolvable) {
        cdkBuilder.exponentialRolloutRate(exponentialRolloutRate)
    }

    /**
     * @param exponentialRolloutRate The rate of increase for a job rollout. This parameter allows
     *   you to define an exponential rate for a job rollout.
     */
    public fun exponentialRolloutRate(
        exponentialRolloutRate: CfnJobTemplate.ExponentialRolloutRateProperty
    ) {
        cdkBuilder.exponentialRolloutRate(exponentialRolloutRate)
    }

    /**
     * @param maximumPerMinute The maximum number of things that will be notified of a pending job,
     *   per minute. This parameter allows you to create a staged rollout.
     */
    public fun maximumPerMinute(maximumPerMinute: Number) {
        cdkBuilder.maximumPerMinute(maximumPerMinute)
    }

    public fun build(): CfnJobTemplate.JobExecutionsRolloutConfigProperty = cdkBuilder.build()
}
