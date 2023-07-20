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
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent
import kotlin.String

@CdkDslMarker
public class CfnComponentComponentBindingPropertiesValuePropertyDsl {
    private val cdkBuilder: CfnComponent.ComponentBindingPropertiesValueProperty.Builder =
        CfnComponent.ComponentBindingPropertiesValueProperty.builder()

    public fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties)
    }

    public fun bindingProperties(bindingProperties: CfnComponent.ComponentBindingPropertiesValuePropertiesProperty) {
        cdkBuilder.bindingProperties(bindingProperties)
    }

    public fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnComponent.ComponentBindingPropertiesValueProperty = cdkBuilder.build()
}
