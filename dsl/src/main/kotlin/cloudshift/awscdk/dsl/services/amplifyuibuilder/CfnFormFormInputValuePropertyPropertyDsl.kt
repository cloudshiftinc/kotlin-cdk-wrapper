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
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm
import kotlin.String

@CdkDslMarker
public class CfnFormFormInputValuePropertyPropertyDsl {
    private val cdkBuilder: CfnForm.FormInputValuePropertyProperty.Builder =
        CfnForm.FormInputValuePropertyProperty.builder()

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnForm.FormInputValuePropertyProperty = cdkBuilder.build()
}
