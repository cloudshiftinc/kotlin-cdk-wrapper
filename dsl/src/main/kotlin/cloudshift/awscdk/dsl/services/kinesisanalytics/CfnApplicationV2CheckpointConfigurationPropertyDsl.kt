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
public class CfnApplicationV2CheckpointConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.CheckpointConfigurationProperty.Builder =
        CfnApplicationV2.CheckpointConfigurationProperty.builder()

    public fun checkpointInterval(checkpointInterval: Number) {
        cdkBuilder.checkpointInterval(checkpointInterval)
    }

    public fun checkpointingEnabled(checkpointingEnabled: Boolean) {
        cdkBuilder.checkpointingEnabled(checkpointingEnabled)
    }

    public fun checkpointingEnabled(checkpointingEnabled: IResolvable) {
        cdkBuilder.checkpointingEnabled(checkpointingEnabled)
    }

    public fun configurationType(configurationType: String) {
        cdkBuilder.configurationType(configurationType)
    }

    public fun minPauseBetweenCheckpoints(minPauseBetweenCheckpoints: Number) {
        cdkBuilder.minPauseBetweenCheckpoints(minPauseBetweenCheckpoints)
    }

    public fun build(): CfnApplicationV2.CheckpointConfigurationProperty = cdkBuilder.build()
}
