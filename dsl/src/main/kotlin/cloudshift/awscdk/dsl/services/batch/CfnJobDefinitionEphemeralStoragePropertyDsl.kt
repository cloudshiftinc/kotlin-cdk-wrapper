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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.batch.CfnJobDefinition
import kotlin.Number

@CdkDslMarker
public class CfnJobDefinitionEphemeralStoragePropertyDsl {
    private val cdkBuilder: CfnJobDefinition.EphemeralStorageProperty.Builder =
        CfnJobDefinition.EphemeralStorageProperty.builder()

    public fun sizeInGiB(sizeInGiB: Number) {
        cdkBuilder.sizeInGiB(sizeInGiB)
    }

    public fun build(): CfnJobDefinition.EphemeralStorageProperty = cdkBuilder.build()
}
