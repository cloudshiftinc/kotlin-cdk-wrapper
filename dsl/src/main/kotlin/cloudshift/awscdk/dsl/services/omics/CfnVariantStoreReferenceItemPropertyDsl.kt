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

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.omics.CfnVariantStore
import kotlin.String

@CdkDslMarker
public class CfnVariantStoreReferenceItemPropertyDsl {
    private val cdkBuilder: CfnVariantStore.ReferenceItemProperty.Builder =
        CfnVariantStore.ReferenceItemProperty.builder()

    public fun referenceArn(referenceArn: String) {
        cdkBuilder.referenceArn(referenceArn)
    }

    public fun build(): CfnVariantStore.ReferenceItemProperty = cdkBuilder.build()
}
