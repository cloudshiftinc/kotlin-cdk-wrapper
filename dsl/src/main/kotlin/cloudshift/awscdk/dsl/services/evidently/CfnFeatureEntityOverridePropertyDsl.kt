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

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.evidently.CfnFeature
import kotlin.String

@CdkDslMarker
public class CfnFeatureEntityOverridePropertyDsl {
    private val cdkBuilder: CfnFeature.EntityOverrideProperty.Builder =
        CfnFeature.EntityOverrideProperty.builder()

    public fun entityId(entityId: String) {
        cdkBuilder.entityId(entityId)
    }

    public fun variation(variation: String) {
        cdkBuilder.variation(variation)
    }

    public fun build(): CfnFeature.EntityOverrideProperty = cdkBuilder.build()
}
