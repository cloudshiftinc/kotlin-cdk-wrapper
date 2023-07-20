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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.CustomResource
import software.amazon.awscdk.RemovalPolicy
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class CustomResourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CustomResource.Builder = CustomResource.Builder.create(scope, id)

    public fun pascalCaseProperties(pascalCaseProperties: Boolean) {
        cdkBuilder.pascalCaseProperties(pascalCaseProperties)
    }

    public fun properties(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.properties(builder.map)
    }

    public fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    public fun serviceToken(serviceToken: String) {
        cdkBuilder.serviceToken(serviceToken)
    }

    public fun build(): CustomResource = cdkBuilder.build()
}
