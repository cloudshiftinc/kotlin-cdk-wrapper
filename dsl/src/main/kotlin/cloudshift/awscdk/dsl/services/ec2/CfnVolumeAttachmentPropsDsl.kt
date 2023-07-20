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
import software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps
import kotlin.String

@CdkDslMarker
public class CfnVolumeAttachmentPropsDsl {
    private val cdkBuilder: CfnVolumeAttachmentProps.Builder = CfnVolumeAttachmentProps.builder()

    public fun device(device: String) {
        cdkBuilder.device(device)
    }

    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    public fun volumeId(volumeId: String) {
        cdkBuilder.volumeId(volumeId)
    }

    public fun build(): CfnVolumeAttachmentProps = cdkBuilder.build()
}
