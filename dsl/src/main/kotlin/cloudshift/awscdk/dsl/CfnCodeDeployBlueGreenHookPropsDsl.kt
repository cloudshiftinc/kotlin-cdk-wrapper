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
import software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions
import software.amazon.awscdk.CfnCodeDeployBlueGreenApplication
import software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps
import software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks
import software.amazon.awscdk.CfnTrafficRoutingConfig
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCodeDeployBlueGreenHookPropsDsl {
    private val cdkBuilder: CfnCodeDeployBlueGreenHookProps.Builder =
        CfnCodeDeployBlueGreenHookProps.builder()

    private val _applications: MutableList<CfnCodeDeployBlueGreenApplication> = mutableListOf()

    public fun additionalOptions(block: CfnCodeDeployBlueGreenAdditionalOptionsDsl.() -> Unit = {}) {
        val builder = CfnCodeDeployBlueGreenAdditionalOptionsDsl()
        builder.apply(block)
        cdkBuilder.additionalOptions(builder.build())
    }

    public fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions) {
        cdkBuilder.additionalOptions(additionalOptions)
    }

    public fun applications(applications: CfnCodeDeployBlueGreenApplicationDsl.() -> Unit) {
        _applications.add(CfnCodeDeployBlueGreenApplicationDsl().apply(applications).build())
    }

    public fun applications(applications: Collection<CfnCodeDeployBlueGreenApplication>) {
        _applications.addAll(applications)
    }

    public fun lifecycleEventHooks(
        block: CfnCodeDeployBlueGreenLifecycleEventHooksDsl.() -> Unit =
            {},
    ) {
        val builder = CfnCodeDeployBlueGreenLifecycleEventHooksDsl()
        builder.apply(block)
        cdkBuilder.lifecycleEventHooks(builder.build())
    }

    public fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks) {
        cdkBuilder.lifecycleEventHooks(lifecycleEventHooks)
    }

    public fun serviceRole(serviceRole: String) {
        cdkBuilder.serviceRole(serviceRole)
    }

    public fun trafficRoutingConfig(block: CfnTrafficRoutingConfigDsl.() -> Unit = {}) {
        val builder = CfnTrafficRoutingConfigDsl()
        builder.apply(block)
        cdkBuilder.trafficRoutingConfig(builder.build())
    }

    public fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig) {
        cdkBuilder.trafficRoutingConfig(trafficRoutingConfig)
    }

    public fun build(): CfnCodeDeployBlueGreenHookProps {
        if (_applications.isNotEmpty()) cdkBuilder.applications(_applications)
        return cdkBuilder.build()
    }
}
