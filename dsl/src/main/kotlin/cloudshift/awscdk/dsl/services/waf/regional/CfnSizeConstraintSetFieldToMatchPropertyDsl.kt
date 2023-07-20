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
import software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet
import kotlin.String

@CdkDslMarker
public class CfnSizeConstraintSetFieldToMatchPropertyDsl {
    private val cdkBuilder: CfnSizeConstraintSet.FieldToMatchProperty.Builder =
        CfnSizeConstraintSet.FieldToMatchProperty.builder()

    public fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSizeConstraintSet.FieldToMatchProperty = cdkBuilder.build()
}
