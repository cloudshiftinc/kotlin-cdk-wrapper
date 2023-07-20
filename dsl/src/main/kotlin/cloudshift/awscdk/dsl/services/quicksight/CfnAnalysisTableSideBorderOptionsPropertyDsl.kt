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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableSideBorderOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableSideBorderOptionsProperty.Builder =
        CfnAnalysis.TableSideBorderOptionsProperty.builder()

    public fun bottom(bottom: IResolvable) {
        cdkBuilder.bottom(bottom)
    }

    public fun bottom(bottom: CfnAnalysis.TableBorderOptionsProperty) {
        cdkBuilder.bottom(bottom)
    }

    public fun innerHorizontal(innerHorizontal: IResolvable) {
        cdkBuilder.innerHorizontal(innerHorizontal)
    }

    public fun innerHorizontal(innerHorizontal: CfnAnalysis.TableBorderOptionsProperty) {
        cdkBuilder.innerHorizontal(innerHorizontal)
    }

    public fun innerVertical(innerVertical: IResolvable) {
        cdkBuilder.innerVertical(innerVertical)
    }

    public fun innerVertical(innerVertical: CfnAnalysis.TableBorderOptionsProperty) {
        cdkBuilder.innerVertical(innerVertical)
    }

    public fun left(left: IResolvable) {
        cdkBuilder.left(left)
    }

    public fun left(left: CfnAnalysis.TableBorderOptionsProperty) {
        cdkBuilder.left(left)
    }

    public fun right(right: IResolvable) {
        cdkBuilder.right(right)
    }

    public fun right(right: CfnAnalysis.TableBorderOptionsProperty) {
        cdkBuilder.right(right)
    }

    public fun top(top: IResolvable) {
        cdkBuilder.top(top)
    }

    public fun top(top: CfnAnalysis.TableBorderOptionsProperty) {
        cdkBuilder.top(top)
    }

    public fun build(): CfnAnalysis.TableSideBorderOptionsProperty = cdkBuilder.build()
}
