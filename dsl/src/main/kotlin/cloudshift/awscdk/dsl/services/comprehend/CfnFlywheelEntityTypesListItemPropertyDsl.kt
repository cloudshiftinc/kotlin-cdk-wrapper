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

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.comprehend.CfnFlywheel
import kotlin.String

@CdkDslMarker
public class CfnFlywheelEntityTypesListItemPropertyDsl {
    private val cdkBuilder: CfnFlywheel.EntityTypesListItemProperty.Builder =
        CfnFlywheel.EntityTypesListItemProperty.builder()

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnFlywheel.EntityTypesListItemProperty = cdkBuilder.build()
}
