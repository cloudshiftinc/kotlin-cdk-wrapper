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
import software.amazon.awscdk.services.apigateway.JsonSchema
import software.amazon.awscdk.services.apigateway.ModelOptions
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class ModelOptionsDsl {
    private val cdkBuilder: ModelOptions.Builder = ModelOptions.builder()

    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
    }

    public fun schema(block: JsonSchemaDsl.() -> Unit = {}) {
        val builder = JsonSchemaDsl()
        builder.apply(block)
        cdkBuilder.schema(builder.build())
    }

    public fun schema(schema: JsonSchema) {
        cdkBuilder.schema(schema)
    }

    public fun build(): ModelOptions = cdkBuilder.build()
}
