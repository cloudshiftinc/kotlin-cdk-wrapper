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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnFunctionIAMPolicyDocumentPropertyDsl {
    private val cdkBuilder: CfnFunction.IAMPolicyDocumentProperty.Builder =
        CfnFunction.IAMPolicyDocumentProperty.builder()

    public fun statement(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.statement(builder.map)
    }

    public fun statement(statement: Any) {
        cdkBuilder.statement(statement)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnFunction.IAMPolicyDocumentProperty = cdkBuilder.build()
}
