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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnApplicationV2ParallelismConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.ParallelismConfigurationProperty.Builder =
        CfnApplicationV2.ParallelismConfigurationProperty.builder()

    public fun autoScalingEnabled(autoScalingEnabled: Boolean) {
        cdkBuilder.autoScalingEnabled(autoScalingEnabled)
    }

    public fun autoScalingEnabled(autoScalingEnabled: IResolvable) {
        cdkBuilder.autoScalingEnabled(autoScalingEnabled)
    }

    public fun configurationType(configurationType: String) {
        cdkBuilder.configurationType(configurationType)
    }

    public fun parallelism(parallelism: Number) {
        cdkBuilder.parallelism(parallelism)
    }

    public fun parallelismPerKpu(parallelismPerKpu: Number) {
        cdkBuilder.parallelismPerKpu(parallelismPerKpu)
    }

    public fun build(): CfnApplicationV2.ParallelismConfigurationProperty = cdkBuilder.build()
}
