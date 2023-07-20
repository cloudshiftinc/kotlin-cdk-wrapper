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
import software.amazon.awscdk.CfnMacroProps
import kotlin.String

@CdkDslMarker
public class CfnMacroPropsDsl {
    private val cdkBuilder: CfnMacroProps.Builder = CfnMacroProps.builder()

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

    public fun build(): CfnMacroProps = cdkBuilder.build()
}
