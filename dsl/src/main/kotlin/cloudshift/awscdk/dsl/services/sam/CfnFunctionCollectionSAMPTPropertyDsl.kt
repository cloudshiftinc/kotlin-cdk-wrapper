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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionCollectionSAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.CollectionSAMPTProperty.Builder =
        CfnFunction.CollectionSAMPTProperty.builder()

    public fun collectionId(collectionId: String) {
        cdkBuilder.collectionId(collectionId)
    }

    public fun build(): CfnFunction.CollectionSAMPTProperty = cdkBuilder.build()
}
