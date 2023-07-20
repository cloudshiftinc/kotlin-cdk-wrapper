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
public class CfnFormValueMappingPropertyDsl {
    private val cdkBuilder: CfnForm.ValueMappingProperty.Builder =
        CfnForm.ValueMappingProperty.builder()

    public fun displayValue(displayValue: IResolvable) {
        cdkBuilder.displayValue(displayValue)
    }

    public fun displayValue(displayValue: CfnForm.FormInputValuePropertyProperty) {
        cdkBuilder.displayValue(displayValue)
    }

    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    public fun `value`(`value`: CfnForm.FormInputValuePropertyProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnForm.ValueMappingProperty = cdkBuilder.build()
}
