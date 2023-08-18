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

package io.cloudshiftdev.awscdkdsl.services.amplifyuibuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

/**
 * The `ComponentPropertyBindingProperties` property specifies a component property to associate
 * with a binding property.
 *
 * This enables exposed properties on the top level component to propagate data to the component's
 * property values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * ComponentPropertyBindingPropertiesProperty componentPropertyBindingPropertiesProperty =
 * ComponentPropertyBindingPropertiesProperty.builder()
 * .property("property")
 * // the properties below are optional
 * .field("field")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentpropertybindingproperties.html)
 */
@CdkDslMarker
public class CfnComponentComponentPropertyBindingPropertiesPropertyDsl {
    private val cdkBuilder: CfnComponent.ComponentPropertyBindingPropertiesProperty.Builder =
        CfnComponent.ComponentPropertyBindingPropertiesProperty.builder()

    /** @param field The data field to bind the property to. */
    public fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
    }

    /** @param property The component property to bind to the data field. */
    public fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
    }

    public fun build(): CfnComponent.ComponentPropertyBindingPropertiesProperty = cdkBuilder.build()
}
