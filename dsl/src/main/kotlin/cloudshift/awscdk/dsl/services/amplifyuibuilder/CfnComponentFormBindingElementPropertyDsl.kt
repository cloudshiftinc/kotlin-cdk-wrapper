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

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

/**
 * Describes how to bind a component property to form data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * FormBindingElementProperty formBindingElementProperty = FormBindingElementProperty.builder()
 * .element("element")
 * .property("property")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-formbindingelement.html)
 */
@CdkDslMarker
public class CfnComponentFormBindingElementPropertyDsl {
    private val cdkBuilder: CfnComponent.FormBindingElementProperty.Builder =
        CfnComponent.FormBindingElementProperty.builder()

    /** @param element The name of the component to retrieve a value from. */
    public fun element(element: String) {
        cdkBuilder.element(element)
    }

    /** @param property The property to retrieve a value from. */
    public fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
    }

    public fun build(): CfnComponent.FormBindingElementProperty = cdkBuilder.build()
}
