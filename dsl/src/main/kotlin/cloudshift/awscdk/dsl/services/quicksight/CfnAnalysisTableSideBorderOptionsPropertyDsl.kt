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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The side border options for a table.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableSideBorderOptionsProperty tableSideBorderOptionsProperty =
 * TableSideBorderOptionsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-tablesideborderoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisTableSideBorderOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableSideBorderOptionsProperty.Builder =
        CfnAnalysis.TableSideBorderOptionsProperty.builder()

    /** @param bottom The table border options of the bottom border. */
    public fun bottom(bottom: IResolvable) {
        cdkBuilder.bottom(bottom)
    }

    /** @param bottom The table border options of the bottom border. */
    public fun bottom(bottom: CfnAnalysis.TableBorderOptionsProperty) {
        cdkBuilder.bottom(bottom)
    }

    /** @param innerHorizontal The table border options of the inner horizontal border. */
    public fun innerHorizontal(innerHorizontal: IResolvable) {
        cdkBuilder.innerHorizontal(innerHorizontal)
    }

    /** @param innerHorizontal The table border options of the inner horizontal border. */
    public fun innerHorizontal(innerHorizontal: CfnAnalysis.TableBorderOptionsProperty) {
        cdkBuilder.innerHorizontal(innerHorizontal)
    }

    /** @param innerVertical The table border options of the inner vertical border. */
    public fun innerVertical(innerVertical: IResolvable) {
        cdkBuilder.innerVertical(innerVertical)
    }

    /** @param innerVertical The table border options of the inner vertical border. */
    public fun innerVertical(innerVertical: CfnAnalysis.TableBorderOptionsProperty) {
        cdkBuilder.innerVertical(innerVertical)
    }

    /** @param left The table border options of the left border. */
    public fun left(left: IResolvable) {
        cdkBuilder.left(left)
    }

    /** @param left The table border options of the left border. */
    public fun left(left: CfnAnalysis.TableBorderOptionsProperty) {
        cdkBuilder.left(left)
    }

    /** @param right The table border options of the right border. */
    public fun right(right: IResolvable) {
        cdkBuilder.right(right)
    }

    /** @param right The table border options of the right border. */
    public fun right(right: CfnAnalysis.TableBorderOptionsProperty) {
        cdkBuilder.right(right)
    }

    /** @param top The table border options of the top border. */
    public fun top(top: IResolvable) {
        cdkBuilder.top(top)
    }

    /** @param top The table border options of the top border. */
    public fun top(top: CfnAnalysis.TableBorderOptionsProperty) {
        cdkBuilder.top(top)
    }

    public fun build(): CfnAnalysis.TableSideBorderOptionsProperty = cdkBuilder.build()
}
