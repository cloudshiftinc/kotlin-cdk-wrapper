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
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * The authorization configuration details for the Amazon EFS file system.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * AuthorizationConfigProperty authorizationConfigProperty = AuthorizationConfigProperty.builder()
 * .accessPointId("accessPointId")
 * .iam("iam")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-authorizationconfig.html)
 */
@CdkDslMarker
public class CfnJobDefinitionAuthorizationConfigPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.AuthorizationConfigProperty.Builder =
        CfnJobDefinition.AuthorizationConfigProperty.builder()

    /**
     * @param accessPointId The Amazon EFS access point ID to use. If an access point is specified,
     *   the root directory value specified in the `EFSVolumeConfiguration` must either be omitted
     *   or set to `/` which enforces the path set on the EFS access point. If an access point is
     *   used, transit encryption must be enabled in the `EFSVolumeConfiguration` . For more
     *   information, see
     *   [Working with Amazon EFS access points](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html)
     *   in the *Amazon Elastic File System User Guide* .
     */
    public fun accessPointId(accessPointId: String) {
        cdkBuilder.accessPointId(accessPointId)
    }

    /**
     * @param iam Whether or not to use the AWS Batch job IAM role defined in a job definition when
     *   mounting the Amazon EFS file system. If enabled, transit encryption must be enabled in the
     *   `EFSVolumeConfiguration` . If this parameter is omitted, the default value of `DISABLED` is
     *   used. For more information, see
     *   [Using Amazon EFS access points](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html#efs-volume-accesspoints)
     *   in the *AWS Batch User Guide* . EFS IAM authorization requires that `TransitEncryption` be
     *   `ENABLED` and that a `JobRoleArn` is specified.
     */
    public fun iam(iam: String) {
        cdkBuilder.iam(iam)
    }

    public fun build(): CfnJobDefinition.AuthorizationConfigProperty = cdkBuilder.build()
}
