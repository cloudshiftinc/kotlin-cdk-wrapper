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
 * The configuration for how much storage a user or group can use on the volume.
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

    /** @param id The ID of the user or group. */
    public fun id(id: Number) {
        cdkBuilder.id(id)
    }

    /**
     * @param storageCapacityQuotaGiB The amount of storage that the user or group can use in
     *   gibibytes (GiB).
     */
    public fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
        cdkBuilder.storageCapacityQuotaGiB(storageCapacityQuotaGiB)
    }

    /** @param type A value that specifies whether the quota applies to a user or group. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnFileSystem.UserAndGroupQuotasProperty = cdkBuilder.build()
}
