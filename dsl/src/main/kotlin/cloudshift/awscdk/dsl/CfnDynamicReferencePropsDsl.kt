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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnDynamicReferenceProps
import software.amazon.awscdk.CfnDynamicReferenceService
import kotlin.String

@CdkDslMarker
public class CfnDynamicReferencePropsDsl {
    private val cdkBuilder: CfnDynamicReferenceProps.Builder = CfnDynamicReferenceProps.builder()

    public fun referenceKey(referenceKey: String) {
        cdkBuilder.referenceKey(referenceKey)
    }

    public fun service(service: CfnDynamicReferenceService) {
        cdkBuilder.service(service)
    }

    public fun build(): CfnDynamicReferenceProps = cdkBuilder.build()
}
