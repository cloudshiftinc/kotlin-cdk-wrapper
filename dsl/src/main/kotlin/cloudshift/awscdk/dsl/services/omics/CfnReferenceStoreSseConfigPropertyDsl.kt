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
import software.amazon.awscdk.services.omics.CfnReferenceStore
import kotlin.String

@CdkDslMarker
public class CfnReferenceStoreSseConfigPropertyDsl {
    private val cdkBuilder: CfnReferenceStore.SseConfigProperty.Builder =
        CfnReferenceStore.SseConfigProperty.builder()

    public fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnReferenceStore.SseConfigProperty = cdkBuilder.build()
}
