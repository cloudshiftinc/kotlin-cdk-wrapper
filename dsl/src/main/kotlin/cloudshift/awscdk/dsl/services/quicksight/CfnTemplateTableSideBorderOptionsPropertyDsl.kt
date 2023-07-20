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
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTableSideBorderOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.TableSideBorderOptionsProperty.Builder =
        CfnTemplate.TableSideBorderOptionsProperty.builder()

    public fun bottom(bottom: IResolvable) {
        cdkBuilder.bottom(bottom)
    }

    public fun bottom(bottom: CfnTemplate.TableBorderOptionsProperty) {
        cdkBuilder.bottom(bottom)
    }

    public fun innerHorizontal(innerHorizontal: IResolvable) {
        cdkBuilder.innerHorizontal(innerHorizontal)
    }

    public fun innerHorizontal(innerHorizontal: CfnTemplate.TableBorderOptionsProperty) {
        cdkBuilder.innerHorizontal(innerHorizontal)
    }

    public fun innerVertical(innerVertical: IResolvable) {
        cdkBuilder.innerVertical(innerVertical)
    }

    public fun innerVertical(innerVertical: CfnTemplate.TableBorderOptionsProperty) {
        cdkBuilder.innerVertical(innerVertical)
    }

    public fun left(left: IResolvable) {
        cdkBuilder.left(left)
    }

    public fun left(left: CfnTemplate.TableBorderOptionsProperty) {
        cdkBuilder.left(left)
    }

    public fun right(right: IResolvable) {
        cdkBuilder.right(right)
    }

    public fun right(right: CfnTemplate.TableBorderOptionsProperty) {
        cdkBuilder.right(right)
    }

    public fun top(top: IResolvable) {
        cdkBuilder.top(top)
    }

    public fun top(top: CfnTemplate.TableBorderOptionsProperty) {
        cdkBuilder.top(top)
    }

    public fun build(): CfnTemplate.TableSideBorderOptionsProperty = cdkBuilder.build()
}
