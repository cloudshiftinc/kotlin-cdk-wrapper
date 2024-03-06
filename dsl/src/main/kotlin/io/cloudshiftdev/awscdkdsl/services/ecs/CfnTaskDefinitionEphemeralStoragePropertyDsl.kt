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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * The amount of ephemeral storage to allocate for the task.
 *
 * This parameter is used to expand the total amount of ephemeral storage available, beyond the
 * default amount, for tasks hosted on AWS Fargate . For more information, see
 * [Using data volumes in tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html)
 * in the *Amazon ECS Developer Guide;* .
 *
 * For tasks using the Fargate launch type, the task requires the following platforms:
 * * Linux platform version `1.4.0` or later.
 * * Windows platform version `1.0.0` or later.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * EphemeralStorageProperty ephemeralStorageProperty = EphemeralStorageProperty.builder()
 * .sizeInGiB(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-ephemeralstorage.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionEphemeralStoragePropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.EphemeralStorageProperty.Builder =
        CfnTaskDefinition.EphemeralStorageProperty.builder()

    /**
     * @param sizeInGiB The total amount, in GiB, of ephemeral storage to set for the task. The
     *   minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
     */
    public fun sizeInGiB(sizeInGiB: Number) {
        cdkBuilder.sizeInGiB(sizeInGiB)
    }

    public fun build(): CfnTaskDefinition.EphemeralStorageProperty = cdkBuilder.build()
}
