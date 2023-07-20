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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnChannel
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class CfnChannelRetentionPeriodPropertyDsl {
    private val cdkBuilder: CfnChannel.RetentionPeriodProperty.Builder =
        CfnChannel.RetentionPeriodProperty.builder()

    public fun numberOfDays(numberOfDays: Number) {
        cdkBuilder.numberOfDays(numberOfDays)
    }

    public fun unlimited(unlimited: Boolean) {
        cdkBuilder.unlimited(unlimited)
    }

    public fun unlimited(unlimited: IResolvable) {
        cdkBuilder.unlimited(unlimited)
    }

    public fun build(): CfnChannel.RetentionPeriodProperty = cdkBuilder.build()
}
