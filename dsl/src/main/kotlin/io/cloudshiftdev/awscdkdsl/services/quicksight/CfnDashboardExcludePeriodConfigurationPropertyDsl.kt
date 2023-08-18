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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The exclude period of `TimeRangeFilter` or `RelativeDatesFilter` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ExcludePeriodConfigurationProperty excludePeriodConfigurationProperty =
 * ExcludePeriodConfigurationProperty.builder()
 * .amount(123)
 * .granularity("granularity")
 * // the properties below are optional
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-excludeperiodconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardExcludePeriodConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.ExcludePeriodConfigurationProperty.Builder =
        CfnDashboard.ExcludePeriodConfigurationProperty.builder()

    /** @param amount The amount or number of the exclude period. */
    public fun amount(amount: Number) {
        cdkBuilder.amount(amount)
    }

    /** @param granularity The granularity or unit (day, month, year) of the exclude period. */
    public fun granularity(granularity: String) {
        cdkBuilder.granularity(granularity)
    }

    /**
     * @param status The status of the exclude period. Choose from the following options:.
     * * `ENABLED`
     * * `DISABLED`
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnDashboard.ExcludePeriodConfigurationProperty = cdkBuilder.build()
}
