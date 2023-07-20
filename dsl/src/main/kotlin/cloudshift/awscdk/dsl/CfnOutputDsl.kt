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
import software.amazon.awscdk.CfnCondition
import software.amazon.awscdk.CfnOutput
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnOutputDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnOutput.Builder = CfnOutput.Builder.create(scope, id)

    public fun condition(condition: CfnCondition) {
        cdkBuilder.condition(condition)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun exportName(exportName: String) {
        cdkBuilder.exportName(exportName)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnOutput = cdkBuilder.build()
}
