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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigurationRecorder
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnConfigurationRecorderDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConfigurationRecorder.Builder =
        CfnConfigurationRecorder.Builder.create(scope, id)

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun recordingGroup(recordingGroup: IResolvable) {
        cdkBuilder.recordingGroup(recordingGroup)
    }

    public fun recordingGroup(recordingGroup: CfnConfigurationRecorder.RecordingGroupProperty) {
        cdkBuilder.recordingGroup(recordingGroup)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnConfigurationRecorder = cdkBuilder.build()
}
