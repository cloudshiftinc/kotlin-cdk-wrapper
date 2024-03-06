@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.fsx

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.fsx.CfnVolume

/**
 * Configures how much storage users and groups can use on the volume.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * UserAndGroupQuotasProperty userAndGroupQuotasProperty = UserAndGroupQuotasProperty.builder()
 * .id(123)
 * .storageCapacityQuotaGiB(123)
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-userandgroupquotas.html)
 */
@CdkDslMarker
public class CfnVolumeUserAndGroupQuotasPropertyDsl {
    private val cdkBuilder: CfnVolume.UserAndGroupQuotasProperty.Builder =
        CfnVolume.UserAndGroupQuotasProperty.builder()

    /** @param id The ID of the user or group that the quota applies to. */
    public fun id(id: Number) {
        cdkBuilder.id(id)
    }

    /** @param storageCapacityQuotaGiB The user or group's storage quota, in gibibytes (GiB). */
    public fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
        cdkBuilder.storageCapacityQuotaGiB(storageCapacityQuotaGiB)
    }

    /** @param type Specifies whether the quota applies to a user or group. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnVolume.UserAndGroupQuotasProperty = cdkBuilder.build()
}
