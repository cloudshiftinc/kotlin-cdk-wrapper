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

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

@CdkDslMarker
public class CfnFormFormStylePropertyDsl {
    private val cdkBuilder: CfnForm.FormStyleProperty.Builder = CfnForm.FormStyleProperty.builder()

    public fun horizontalGap(horizontalGap: IResolvable) {
        cdkBuilder.horizontalGap(horizontalGap)
    }

    public fun horizontalGap(horizontalGap: CfnForm.FormStyleConfigProperty) {
        cdkBuilder.horizontalGap(horizontalGap)
    }

    public fun outerPadding(outerPadding: IResolvable) {
        cdkBuilder.outerPadding(outerPadding)
    }

    public fun outerPadding(outerPadding: CfnForm.FormStyleConfigProperty) {
        cdkBuilder.outerPadding(outerPadding)
    }

    public fun verticalGap(verticalGap: IResolvable) {
        cdkBuilder.verticalGap(verticalGap)
    }

    public fun verticalGap(verticalGap: CfnForm.FormStyleConfigProperty) {
        cdkBuilder.verticalGap(verticalGap)
    }

    public fun build(): CfnForm.FormStyleProperty = cdkBuilder.build()
}
