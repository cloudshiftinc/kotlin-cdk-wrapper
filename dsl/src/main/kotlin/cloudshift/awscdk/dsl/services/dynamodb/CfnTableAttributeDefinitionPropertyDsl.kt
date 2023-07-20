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
import software.amazon.awscdk.services.dynamodb.CfnTable
import kotlin.String

@CdkDslMarker
public class CfnTableAttributeDefinitionPropertyDsl {
    private val cdkBuilder: CfnTable.AttributeDefinitionProperty.Builder =
        CfnTable.AttributeDefinitionProperty.builder()

    public fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
    }

    public fun attributeType(attributeType: String) {
        cdkBuilder.attributeType(attributeType)
    }

    public fun build(): CfnTable.AttributeDefinitionProperty = cdkBuilder.build()
}
