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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion
import kotlin.String

@CdkDslMarker
public class CfnFunctionDefinitionVersionExecutionPropertyDsl {
    private val cdkBuilder: CfnFunctionDefinitionVersion.ExecutionProperty.Builder =
        CfnFunctionDefinitionVersion.ExecutionProperty.builder()

    public fun isolationMode(isolationMode: String) {
        cdkBuilder.isolationMode(isolationMode)
    }

    public fun runAs(runAs: IResolvable) {
        cdkBuilder.runAs(runAs)
    }

    public fun runAs(runAs: CfnFunctionDefinitionVersion.RunAsProperty) {
        cdkBuilder.runAs(runAs)
    }

    public fun build(): CfnFunctionDefinitionVersion.ExecutionProperty = cdkBuilder.build()
}
