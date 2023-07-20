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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnApplicationCheckpointConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.CheckpointConfigurationProperty.Builder =
        CfnApplication.CheckpointConfigurationProperty.builder()

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

    public fun build(): CfnApplication.CheckpointConfigurationProperty = cdkBuilder.build()
}
