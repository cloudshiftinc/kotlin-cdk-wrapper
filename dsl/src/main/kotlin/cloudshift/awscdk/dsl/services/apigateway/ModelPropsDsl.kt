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
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.JsonSchema
import software.amazon.awscdk.services.apigateway.ModelProps
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class ModelPropsDsl {
    private val cdkBuilder: ModelProps.Builder = ModelProps.builder()

    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
    }

    public fun restApi(restApi: IRestApi) {
        cdkBuilder.restApi(restApi)
    }

    public fun schema(block: JsonSchemaDsl.() -> Unit = {}) {
        val builder = JsonSchemaDsl()
        builder.apply(block)
        cdkBuilder.schema(builder.build())
    }

    public fun schema(schema: JsonSchema) {
        cdkBuilder.schema(schema)
    }

    public fun build(): ModelProps = cdkBuilder.build()
}
