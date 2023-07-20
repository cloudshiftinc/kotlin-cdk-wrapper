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

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.efs.AccessPointAttributes
import software.amazon.awscdk.services.efs.IFileSystem
import kotlin.String

@CdkDslMarker
public class AccessPointAttributesDsl {
    private val cdkBuilder: AccessPointAttributes.Builder = AccessPointAttributes.builder()

    public fun accessPointArn(accessPointArn: String) {
        cdkBuilder.accessPointArn(accessPointArn)
    }

    public fun accessPointId(accessPointId: String) {
        cdkBuilder.accessPointId(accessPointId)
    }

    public fun fileSystem(fileSystem: IFileSystem) {
        cdkBuilder.fileSystem(fileSystem)
    }

    public fun build(): AccessPointAttributes = cdkBuilder.build()
}
