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

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet
import kotlin.String

@CdkDslMarker
public class CfnGeoMatchSetGeoMatchConstraintPropertyDsl {
    private val cdkBuilder: CfnGeoMatchSet.GeoMatchConstraintProperty.Builder =
        CfnGeoMatchSet.GeoMatchConstraintProperty.builder()

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnGeoMatchSet.GeoMatchConstraintProperty = cdkBuilder.build()
}
