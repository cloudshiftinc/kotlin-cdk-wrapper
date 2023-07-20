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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.AttributeType
import kotlin.String

@CdkDslMarker
public class AttributeDsl {
    private val cdkBuilder: Attribute.Builder = Attribute.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun type(type: AttributeType) {
        cdkBuilder.type(type)
    }

    public fun build(): Attribute = cdkBuilder.build()
}
