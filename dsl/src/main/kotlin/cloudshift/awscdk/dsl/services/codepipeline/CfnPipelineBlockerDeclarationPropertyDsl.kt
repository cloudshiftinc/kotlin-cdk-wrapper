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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.CfnPipeline
import kotlin.String

@CdkDslMarker
public class CfnPipelineBlockerDeclarationPropertyDsl {
    private val cdkBuilder: CfnPipeline.BlockerDeclarationProperty.Builder =
        CfnPipeline.BlockerDeclarationProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnPipeline.BlockerDeclarationProperty = cdkBuilder.build()
}
