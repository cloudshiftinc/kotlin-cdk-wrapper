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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob

/**
 * Override of a particular evaluation for a profile job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * StatisticOverrideProperty statisticOverrideProperty = StatisticOverrideProperty.builder()
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .statistic("statistic")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-statisticoverride.html)
 */
@CdkDslMarker
public class CfnJobStatisticOverridePropertyDsl {
    private val cdkBuilder: CfnJob.StatisticOverrideProperty.Builder =
        CfnJob.StatisticOverrideProperty.builder()

    /** @param parameters A map that includes overrides of an evaluation’s parameters. */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /** @param parameters A map that includes overrides of an evaluation’s parameters. */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /** @param statistic The name of an evaluation. */
    public fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
    }

    public fun build(): CfnJob.StatisticOverrideProperty = cdkBuilder.build()
}
