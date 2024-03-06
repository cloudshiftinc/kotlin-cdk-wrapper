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
import software.amazon.awscdk.services.fsx.CfnFileSystem

/**
 * Used to configure quotas that define how much storage a user or group can use on an FSx for
 * OpenZFS volume.
 *
 * For more information, see
 * [Volume properties](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties)
 * in the FSx for OpenZFS User Guide.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-userandgroupquotas.html)
 */
@CdkDslMarker
public class CfnFileSystemUserAndGroupQuotasPropertyDsl {
    private val cdkBuilder: CfnFileSystem.UserAndGroupQuotasProperty.Builder =
        CfnFileSystem.UserAndGroupQuotasProperty.builder()

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

    public fun build(): CfnFileSystem.UserAndGroupQuotasProperty = cdkBuilder.build()
}
