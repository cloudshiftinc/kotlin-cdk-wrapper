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
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

/**
 * The `ComponentVariant` property specifies the style configuration of a unique variation of a main
 * component.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * Object overrides;
 * ComponentVariantProperty componentVariantProperty = ComponentVariantProperty.builder()
 * .overrides(overrides)
 * .variantValues(Map.of(
 * "variantValuesKey", "variantValues"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentvariant.html)
 */
@CdkDslMarker
public class CfnComponentComponentVariantPropertyDsl {
    private val cdkBuilder: CfnComponent.ComponentVariantProperty.Builder =
        CfnComponent.ComponentVariantProperty.builder()

    /**
     * @param overrides The properties of the component variant that can be overriden when
     *   customizing an instance of the component. You can't specify `tags` as a valid property for
     *   `overrides` .
     */
    public fun overrides(overrides: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(overrides)
        cdkBuilder.overrides(builder.map)
    }

    /**
     * @param overrides The properties of the component variant that can be overriden when
     *   customizing an instance of the component. You can't specify `tags` as a valid property for
     *   `overrides` .
     */
    public fun overrides(overrides: Any) {
        cdkBuilder.overrides(overrides)
    }

    /** @param variantValues The combination of variants that comprise this variant. */
    public fun variantValues(variantValues: Map<String, String>) {
        cdkBuilder.variantValues(variantValues)
    }

    /** @param variantValues The combination of variants that comprise this variant. */
    public fun variantValues(variantValues: IResolvable) {
        cdkBuilder.variantValues(variantValues)
    }

    public fun build(): CfnComponent.ComponentVariantProperty = cdkBuilder.build()
}
