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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob

/**
 * Configuration of evaluations for a profile job.
 *
 * This configuration can be used to select evaluations and override the parameters of selected
 * evaluations.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * StatisticsConfigurationProperty statisticsConfigurationProperty =
 * StatisticsConfigurationProperty.builder()
 * .includedStatistics(List.of("includedStatistics"))
 * .overrides(List.of(StatisticOverrideProperty.builder()
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .statistic("statistic")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-statisticsconfiguration.html)
 */
@CdkDslMarker
public class CfnJobStatisticsConfigurationPropertyDsl {
    private val cdkBuilder: CfnJob.StatisticsConfigurationProperty.Builder =
        CfnJob.StatisticsConfigurationProperty.builder()

    private val _includedStatistics: MutableList<String> = mutableListOf()

    private val _overrides: MutableList<Any> = mutableListOf()

    /**
     * @param includedStatistics List of included evaluations. When the list is undefined, all
     *   supported evaluations will be included.
     */
    public fun includedStatistics(vararg includedStatistics: String) {
        _includedStatistics.addAll(listOf(*includedStatistics))
    }

    /**
     * @param includedStatistics List of included evaluations. When the list is undefined, all
     *   supported evaluations will be included.
     */
    public fun includedStatistics(includedStatistics: Collection<String>) {
        _includedStatistics.addAll(includedStatistics)
    }

    /** @param overrides List of overrides for evaluations. */
    public fun overrides(vararg overrides: Any) {
        _overrides.addAll(listOf(*overrides))
    }

    /** @param overrides List of overrides for evaluations. */
    public fun overrides(overrides: Collection<Any>) {
        _overrides.addAll(overrides)
    }

    /** @param overrides List of overrides for evaluations. */
    public fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides)
    }

    public fun build(): CfnJob.StatisticsConfigurationProperty {
        if (_includedStatistics.isNotEmpty()) cdkBuilder.includedStatistics(_includedStatistics)
        if (_overrides.isNotEmpty()) cdkBuilder.overrides(_overrides)
        return cdkBuilder.build()
    }
}
