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
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable
import kotlin.String

@CdkDslMarker
public class CfnGlobalTableAttributeDefinitionPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.AttributeDefinitionProperty.Builder =
        CfnGlobalTable.AttributeDefinitionProperty.builder()

    public fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
    }

    public fun attributeType(attributeType: String) {
        cdkBuilder.attributeType(attributeType)
    }

    public fun build(): CfnGlobalTable.AttributeDefinitionProperty = cdkBuilder.build()
}
