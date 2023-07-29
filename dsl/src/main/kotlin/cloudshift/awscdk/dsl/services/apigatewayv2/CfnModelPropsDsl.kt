@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnModelProps

/**
 * Properties for defining a `CfnModel`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * Object schema;
 * CfnModelProps cfnModelProps = CfnModelProps.builder()
 * .apiId("apiId")
 * .name("name")
 * .schema(schema)
 * // the properties below are optional
 * .contentType("contentType")
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html)
 */
@CdkDslMarker
public class CfnModelPropsDsl {
    private val cdkBuilder: CfnModelProps.Builder = CfnModelProps.builder()

    /** @param apiId The API identifier. */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /** @param contentType The content-type for the model, for example, "application/json". */
    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    /** @param description The description of the model. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of the model. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param schema The schema for the model. For application/json models, this should be JSON
     *   schema draft 4 model.
     */
    public fun schema(schema: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(schema)
        cdkBuilder.schema(builder.map)
    }

    /**
     * @param schema The schema for the model. For application/json models, this should be JSON
     *   schema draft 4 model.
     */
    public fun schema(schema: Any) {
        cdkBuilder.schema(schema)
    }

    public fun build(): CfnModelProps = cdkBuilder.build()
}
