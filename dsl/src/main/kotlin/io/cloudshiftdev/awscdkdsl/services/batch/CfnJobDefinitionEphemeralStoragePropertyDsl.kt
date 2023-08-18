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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * The amount of ephemeral storage to allocate for the task.
 *
 * This parameter is used to expand the total amount of ephemeral storage available, beyond the
 * default amount, for tasks hosted on AWS Fargate .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * EphemeralStorageProperty ephemeralStorageProperty = EphemeralStorageProperty.builder()
 * .sizeInGiB(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ephemeralstorage.html)
 */
@CdkDslMarker
public class CfnJobDefinitionEphemeralStoragePropertyDsl {
    private val cdkBuilder: CfnJobDefinition.EphemeralStorageProperty.Builder =
        CfnJobDefinition.EphemeralStorageProperty.builder()

    /**
     * @param sizeInGiB The total amount, in GiB, of ephemeral storage to set for the task. The
     *   minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
     */
    public fun sizeInGiB(sizeInGiB: Number) {
        cdkBuilder.sizeInGiB(sizeInGiB)
    }

    public fun build(): CfnJobDefinition.EphemeralStorageProperty = cdkBuilder.build()
}
