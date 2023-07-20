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
import software.amazon.awscdk.CfnHookVersion
import software.amazon.awscdk.CfnHookVersionProps
import software.amazon.awscdk.IResolvable
import kotlin.String

@CdkDslMarker
public class CfnHookVersionPropsDsl {
    private val cdkBuilder: CfnHookVersionProps.Builder = CfnHookVersionProps.builder()

    public fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
    }

    public fun loggingConfig(loggingConfig: CfnHookVersion.LoggingConfigProperty) {
        cdkBuilder.loggingConfig(loggingConfig)
    }

    public fun loggingConfig(loggingConfig: IResolvable) {
        cdkBuilder.loggingConfig(loggingConfig)
    }

    public fun schemaHandlerPackage(schemaHandlerPackage: String) {
        cdkBuilder.schemaHandlerPackage(schemaHandlerPackage)
    }

    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    public fun build(): CfnHookVersionProps = cdkBuilder.build()
}
