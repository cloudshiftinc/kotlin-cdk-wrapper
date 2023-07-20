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

package cloudshift.awscdk.dsl.services.healthlake

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnFHIRDatastoreCreatedAtPropertyDsl {
    private val cdkBuilder: CfnFHIRDatastore.CreatedAtProperty.Builder =
        CfnFHIRDatastore.CreatedAtProperty.builder()

    public fun nanos(nanos: Number) {
        cdkBuilder.nanos(nanos)
    }

    public fun seconds(seconds: String) {
        cdkBuilder.seconds(seconds)
    }

    public fun build(): CfnFHIRDatastore.CreatedAtProperty = cdkBuilder.build()
}
