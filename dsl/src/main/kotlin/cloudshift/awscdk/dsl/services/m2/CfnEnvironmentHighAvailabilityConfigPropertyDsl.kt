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

package cloudshift.awscdk.dsl.services.m2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.m2.CfnEnvironment
import kotlin.Number

@CdkDslMarker
public class CfnEnvironmentHighAvailabilityConfigPropertyDsl {
    private val cdkBuilder: CfnEnvironment.HighAvailabilityConfigProperty.Builder =
        CfnEnvironment.HighAvailabilityConfigProperty.builder()

    public fun desiredCapacity(desiredCapacity: Number) {
        cdkBuilder.desiredCapacity(desiredCapacity)
    }

    public fun build(): CfnEnvironment.HighAvailabilityConfigProperty = cdkBuilder.build()
}
