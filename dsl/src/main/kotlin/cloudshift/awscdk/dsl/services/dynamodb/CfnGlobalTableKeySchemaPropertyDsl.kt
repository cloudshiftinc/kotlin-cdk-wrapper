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
public class CfnGlobalTableKeySchemaPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.KeySchemaProperty.Builder =
        CfnGlobalTable.KeySchemaProperty.builder()

    public fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
    }

    public fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
    }

    public fun build(): CfnGlobalTable.KeySchemaProperty = cdkBuilder.build()
}
