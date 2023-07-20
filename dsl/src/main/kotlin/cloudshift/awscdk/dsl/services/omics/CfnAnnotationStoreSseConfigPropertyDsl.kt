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
import software.amazon.awscdk.services.omics.CfnAnnotationStore
import kotlin.String

@CdkDslMarker
public class CfnAnnotationStoreSseConfigPropertyDsl {
    private val cdkBuilder: CfnAnnotationStore.SseConfigProperty.Builder =
        CfnAnnotationStore.SseConfigProperty.builder()

    public fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnAnnotationStore.SseConfigProperty = cdkBuilder.build()
}
