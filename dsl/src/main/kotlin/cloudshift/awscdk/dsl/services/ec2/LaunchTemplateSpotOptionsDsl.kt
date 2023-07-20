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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.Expiration
import software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions
import software.amazon.awscdk.services.ec2.SpotInstanceInterruption
import software.amazon.awscdk.services.ec2.SpotRequestType
import kotlin.Number

@CdkDslMarker
public class LaunchTemplateSpotOptionsDsl {
    private val cdkBuilder: LaunchTemplateSpotOptions.Builder = LaunchTemplateSpotOptions.builder()

    public fun blockDuration(blockDuration: Duration) {
        cdkBuilder.blockDuration(blockDuration)
    }

    public fun interruptionBehavior(interruptionBehavior: SpotInstanceInterruption) {
        cdkBuilder.interruptionBehavior(interruptionBehavior)
    }

    public fun maxPrice(maxPrice: Number) {
        cdkBuilder.maxPrice(maxPrice)
    }

    public fun requestType(requestType: SpotRequestType) {
        cdkBuilder.requestType(requestType)
    }

    public fun validUntil(validUntil: Expiration) {
        cdkBuilder.validUntil(validUntil)
    }

    public fun build(): LaunchTemplateSpotOptions = cdkBuilder.build()
}
