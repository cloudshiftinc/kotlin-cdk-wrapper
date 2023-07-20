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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.apigateway.ApiDefinitionConfig
import software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class ApiDefinitionConfigDsl {
    private val cdkBuilder: ApiDefinitionConfig.Builder = ApiDefinitionConfig.builder()

    public fun inlineDefinition(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.inlineDefinition(builder.map)
    }

    public fun inlineDefinition(inlineDefinition: Any) {
        cdkBuilder.inlineDefinition(inlineDefinition)
    }

    public fun s3Location(block: ApiDefinitionS3LocationDsl.() -> Unit = {}) {
        val builder = ApiDefinitionS3LocationDsl()
        builder.apply(block)
        cdkBuilder.s3Location(builder.build())
    }

    public fun s3Location(s3Location: ApiDefinitionS3Location) {
        cdkBuilder.s3Location(s3Location)
    }

    public fun build(): ApiDefinitionConfig = cdkBuilder.build()
}
