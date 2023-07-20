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
import software.amazon.awscdk.services.appsync.CfnResolver
import kotlin.String

@CdkDslMarker
public class CfnResolverAppSyncRuntimePropertyDsl {
    private val cdkBuilder: CfnResolver.AppSyncRuntimeProperty.Builder =
        CfnResolver.AppSyncRuntimeProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun runtimeVersion(runtimeVersion: String) {
        cdkBuilder.runtimeVersion(runtimeVersion)
    }

    public fun build(): CfnResolver.AppSyncRuntimeProperty = cdkBuilder.build()
}
