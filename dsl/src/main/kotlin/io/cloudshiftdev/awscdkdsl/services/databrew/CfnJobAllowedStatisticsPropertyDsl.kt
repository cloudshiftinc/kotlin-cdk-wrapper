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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.databrew.CfnJob

/**
 * Configuration of statistics that are allowed to be run on columns that contain detected entities.
 *
 * When undefined, no statistics will be computed on columns that contain detected entities.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * AllowedStatisticsProperty allowedStatisticsProperty = AllowedStatisticsProperty.builder()
 * .statistics(List.of("statistics"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-allowedstatistics.html)
 */
@CdkDslMarker
public class CfnJobAllowedStatisticsPropertyDsl {
    private val cdkBuilder: CfnJob.AllowedStatisticsProperty.Builder =
        CfnJob.AllowedStatisticsProperty.builder()

    private val _statistics: MutableList<String> = mutableListOf()

    /**
     * @param statistics One or more column statistics to allow for columns that contain detected
     *   entities.
     */
    public fun statistics(vararg statistics: String) {
        _statistics.addAll(listOf(*statistics))
    }

    /**
     * @param statistics One or more column statistics to allow for columns that contain detected
     *   entities.
     */
    public fun statistics(statistics: Collection<String>) {
        _statistics.addAll(statistics)
    }

    public fun build(): CfnJob.AllowedStatisticsProperty {
        if (_statistics.isNotEmpty()) cdkBuilder.statistics(_statistics)
        return cdkBuilder.build()
    }
}
