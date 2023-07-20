@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableSideBorderOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.TableSideBorderOptionsProperty.Builder =
        CfnDashboard.TableSideBorderOptionsProperty.builder()

    public fun bottom(bottom: IResolvable) {
        cdkBuilder.bottom(bottom)
    }

    public fun bottom(bottom: CfnDashboard.TableBorderOptionsProperty) {
        cdkBuilder.bottom(bottom)
    }

    public fun innerHorizontal(innerHorizontal: IResolvable) {
        cdkBuilder.innerHorizontal(innerHorizontal)
    }

    public fun innerHorizontal(innerHorizontal: CfnDashboard.TableBorderOptionsProperty) {
        cdkBuilder.innerHorizontal(innerHorizontal)
    }

    public fun innerVertical(innerVertical: IResolvable) {
        cdkBuilder.innerVertical(innerVertical)
    }

    public fun innerVertical(innerVertical: CfnDashboard.TableBorderOptionsProperty) {
        cdkBuilder.innerVertical(innerVertical)
    }

    public fun left(left: IResolvable) {
        cdkBuilder.left(left)
    }

    public fun left(left: CfnDashboard.TableBorderOptionsProperty) {
        cdkBuilder.left(left)
    }

    public fun right(right: IResolvable) {
        cdkBuilder.right(right)
    }

    public fun right(right: CfnDashboard.TableBorderOptionsProperty) {
        cdkBuilder.right(right)
    }

    public fun top(top: IResolvable) {
        cdkBuilder.top(top)
    }

    public fun top(top: CfnDashboard.TableBorderOptionsProperty) {
        cdkBuilder.top(top)
    }

    public fun build(): CfnDashboard.TableSideBorderOptionsProperty = cdkBuilder.build()
}
