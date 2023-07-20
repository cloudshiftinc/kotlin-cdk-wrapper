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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.CfnFunctionConfiguration
import kotlin.String

@CdkDslMarker
public class CfnFunctionConfigurationAppSyncRuntimePropertyDsl {
    private val cdkBuilder: CfnFunctionConfiguration.AppSyncRuntimeProperty.Builder =
        CfnFunctionConfiguration.AppSyncRuntimeProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun runtimeVersion(runtimeVersion: String) {
        cdkBuilder.runtimeVersion(runtimeVersion)
    }

    public fun build(): CfnFunctionConfiguration.AppSyncRuntimeProperty = cdkBuilder.build()
}
