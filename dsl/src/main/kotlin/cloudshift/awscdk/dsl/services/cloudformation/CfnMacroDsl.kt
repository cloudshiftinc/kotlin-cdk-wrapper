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

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudformation.CfnMacro
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnMacroDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMacro.Builder = CfnMacro.Builder.create(scope, id)

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    public fun logRoleArn(logRoleArn: String) {
        cdkBuilder.logRoleArn(logRoleArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnMacro = cdkBuilder.build()
}
