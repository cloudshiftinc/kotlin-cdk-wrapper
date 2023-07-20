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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.eks.TaintEffect
import software.amazon.awscdk.services.eks.TaintSpec
import kotlin.String

@CdkDslMarker
public class TaintSpecDsl {
    private val cdkBuilder: TaintSpec.Builder = TaintSpec.builder()

    public fun effect(effect: TaintEffect) {
        cdkBuilder.effect(effect)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): TaintSpec = cdkBuilder.build()
}
