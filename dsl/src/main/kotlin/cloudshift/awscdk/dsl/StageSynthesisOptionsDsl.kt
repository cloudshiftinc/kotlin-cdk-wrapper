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
import software.amazon.awscdk.StageSynthesisOptions
import kotlin.Boolean

@CdkDslMarker
public class StageSynthesisOptionsDsl {
    private val cdkBuilder: StageSynthesisOptions.Builder = StageSynthesisOptions.builder()

    public fun force(force: Boolean) {
        cdkBuilder.force(force)
    }

    public fun skipValidation(skipValidation: Boolean) {
        cdkBuilder.skipValidation(skipValidation)
    }

    public fun validateOnSynthesis(validateOnSynthesis: Boolean) {
        cdkBuilder.validateOnSynthesis(validateOnSynthesis)
    }

    public fun build(): StageSynthesisOptions = cdkBuilder.build()
}
