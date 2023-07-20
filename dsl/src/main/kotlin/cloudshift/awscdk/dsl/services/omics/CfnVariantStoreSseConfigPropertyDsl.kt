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
public class CfnVariantStoreSseConfigPropertyDsl {
    private val cdkBuilder: CfnVariantStore.SseConfigProperty.Builder =
        CfnVariantStore.SseConfigProperty.builder()

    public fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnVariantStore.SseConfigProperty = cdkBuilder.build()
}
