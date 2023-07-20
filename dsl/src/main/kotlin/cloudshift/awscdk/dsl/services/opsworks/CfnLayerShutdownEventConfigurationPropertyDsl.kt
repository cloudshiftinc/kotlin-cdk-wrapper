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

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnLayer
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class CfnLayerShutdownEventConfigurationPropertyDsl {
    private val cdkBuilder: CfnLayer.ShutdownEventConfigurationProperty.Builder =
        CfnLayer.ShutdownEventConfigurationProperty.builder()

    public fun delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained: Boolean) {
        cdkBuilder.delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained)
    }

    public fun delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained: IResolvable) {
        cdkBuilder.delayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained)
    }

    public fun executionTimeout(executionTimeout: Number) {
        cdkBuilder.executionTimeout(executionTimeout)
    }

    public fun build(): CfnLayer.ShutdownEventConfigurationProperty = cdkBuilder.build()
}
