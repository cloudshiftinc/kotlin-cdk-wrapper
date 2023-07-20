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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnApi
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnApiCanarySettingPropertyDsl {
    private val cdkBuilder: CfnApi.CanarySettingProperty.Builder =
        CfnApi.CanarySettingProperty.builder()

    public fun deploymentId(deploymentId: String) {
        cdkBuilder.deploymentId(deploymentId)
    }

    public fun percentTraffic(percentTraffic: Number) {
        cdkBuilder.percentTraffic(percentTraffic)
    }

    public fun stageVariableOverrides(stageVariableOverrides: Map<String, String>) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides)
    }

    public fun stageVariableOverrides(stageVariableOverrides: IResolvable) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides)
    }

    public fun useStageCache(useStageCache: Boolean) {
        cdkBuilder.useStageCache(useStageCache)
    }

    public fun useStageCache(useStageCache: IResolvable) {
        cdkBuilder.useStageCache(useStageCache)
    }

    public fun build(): CfnApi.CanarySettingProperty = cdkBuilder.build()
}
