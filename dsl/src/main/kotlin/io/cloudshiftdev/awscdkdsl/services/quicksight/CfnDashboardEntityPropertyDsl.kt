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
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * An object, structure, or sub-structure of an analysis, template, or dashboard.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * EntityProperty entityProperty = EntityProperty.builder()
 * .path("path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-entity.html)
 */
@CdkDslMarker
public class CfnDashboardEntityPropertyDsl {
    private val cdkBuilder: CfnDashboard.EntityProperty.Builder =
        CfnDashboard.EntityProperty.builder()

    /**
     * @param path The hierarchical path of the entity within the analysis, template, or dashboard
     *   definition tree.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnDashboard.EntityProperty = cdkBuilder.build()
}
