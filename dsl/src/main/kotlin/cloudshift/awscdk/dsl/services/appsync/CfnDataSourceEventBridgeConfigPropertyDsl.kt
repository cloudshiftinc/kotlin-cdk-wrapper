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
import software.amazon.awscdk.services.appsync.CfnDataSource
import kotlin.String

@CdkDslMarker
public class CfnDataSourceEventBridgeConfigPropertyDsl {
    private val cdkBuilder: CfnDataSource.EventBridgeConfigProperty.Builder =
        CfnDataSource.EventBridgeConfigProperty.builder()

    public fun eventBusArn(eventBusArn: String) {
        cdkBuilder.eventBusArn(eventBusArn)
    }

    public fun build(): CfnDataSource.EventBridgeConfigProperty = cdkBuilder.build()
}
