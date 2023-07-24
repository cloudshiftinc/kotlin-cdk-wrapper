@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * Determines the border options for a table visual.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GlobalTableBorderOptionsProperty globalTableBorderOptionsProperty =
 * GlobalTableBorderOptionsProperty.builder()
 * .sideSpecificBorder(TableSideBorderOptionsProperty.builder()
 * .bottom(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerHorizontal(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerVertical(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .left(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .right(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .top(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build())
 * .uniformBorder(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-globaltableborderoptions.html)
 */
@CdkDslMarker
public class CfnDashboardGlobalTableBorderOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.GlobalTableBorderOptionsProperty.Builder =
        CfnDashboard.GlobalTableBorderOptionsProperty.builder()

    /**
     * @param sideSpecificBorder Determines the options for side specific border.
     */
    public fun sideSpecificBorder(sideSpecificBorder: IResolvable) {
        cdkBuilder.sideSpecificBorder(sideSpecificBorder)
    }

    /**
     * @param sideSpecificBorder Determines the options for side specific border.
     */
    public fun sideSpecificBorder(sideSpecificBorder: CfnDashboard.TableSideBorderOptionsProperty) {
        cdkBuilder.sideSpecificBorder(sideSpecificBorder)
    }

    /**
     * @param uniformBorder Determines the options for uniform border.
     */
    public fun uniformBorder(uniformBorder: IResolvable) {
        cdkBuilder.uniformBorder(uniformBorder)
    }

    /**
     * @param uniformBorder Determines the options for uniform border.
     */
    public fun uniformBorder(uniformBorder: CfnDashboard.TableBorderOptionsProperty) {
        cdkBuilder.uniformBorder(uniformBorder)
    }

    public fun build(): CfnDashboard.GlobalTableBorderOptionsProperty = cdkBuilder.build()
}
