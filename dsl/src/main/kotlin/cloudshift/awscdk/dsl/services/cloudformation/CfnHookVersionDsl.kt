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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudformation.CfnHookVersion
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnHookVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnHookVersion.Builder = CfnHookVersion.Builder.create(scope, id)

    public fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
    }

    public fun loggingConfig(loggingConfig: IResolvable) {
        cdkBuilder.loggingConfig(loggingConfig)
    }

    public fun loggingConfig(loggingConfig: CfnHookVersion.LoggingConfigProperty) {
        cdkBuilder.loggingConfig(loggingConfig)
    }

    public fun schemaHandlerPackage(schemaHandlerPackage: String) {
        cdkBuilder.schemaHandlerPackage(schemaHandlerPackage)
    }

    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    public fun build(): CfnHookVersion = cdkBuilder.build()
}
