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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The pagination configuration for a table visual or boxplot.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PaginationConfigurationProperty paginationConfigurationProperty =
 * PaginationConfigurationProperty.builder()
 * .pageNumber(123)
 * .pageSize(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-paginationconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardPaginationConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.PaginationConfigurationProperty.Builder =
        CfnDashboard.PaginationConfigurationProperty.builder()

    /** @param pageNumber Indicates the page number. */
    public fun pageNumber(pageNumber: Number) {
        cdkBuilder.pageNumber(pageNumber)
    }

    /** @param pageSize Indicates how many items render in one page. */
    public fun pageSize(pageSize: Number) {
        cdkBuilder.pageSize(pageSize)
    }

    public fun build(): CfnDashboard.PaginationConfigurationProperty = cdkBuilder.build()
}
