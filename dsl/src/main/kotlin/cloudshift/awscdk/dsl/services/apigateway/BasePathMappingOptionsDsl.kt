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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.BasePathMappingOptions
import software.amazon.awscdk.services.apigateway.Stage
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class BasePathMappingOptionsDsl {
    private val cdkBuilder: BasePathMappingOptions.Builder = BasePathMappingOptions.builder()

    public fun attachToStage(attachToStage: Boolean) {
        cdkBuilder.attachToStage(attachToStage)
    }

    public fun basePath(basePath: String) {
        cdkBuilder.basePath(basePath)
    }

    public fun stage(stage: Stage) {
        cdkBuilder.stage(stage)
    }

    public fun build(): BasePathMappingOptions = cdkBuilder.build()
}
