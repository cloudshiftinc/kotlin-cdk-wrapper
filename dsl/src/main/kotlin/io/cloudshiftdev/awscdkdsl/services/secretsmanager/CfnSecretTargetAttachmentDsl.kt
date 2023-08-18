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

package io.cloudshiftdev.awscdkdsl.services.secretsmanager

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment
import software.constructs.Construct

/**
 * The `AWS::SecretsManager::SecretTargetAttachment` resource completes the final link between a
 * Secrets Manager secret and the associated database by adding the database connection information
 * to the secret JSON.
 *
 * If you want to turn on automatic rotation for a database credential secret, the secret must
 * contain the database connection information. For more information, see
 * [JSON structure of Secrets Manager database credential secrets](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_secret_json_structure.html)
 * .
 *
 * For Amazon RDS master user credentials, see
 * [AWS::RDS::DBCluster MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.secretsmanager.*;
 * CfnSecretTargetAttachment cfnSecretTargetAttachment =
 * CfnSecretTargetAttachment.Builder.create(this, "MyCfnSecretTargetAttachment")
 * .secretId("secretId")
 * .targetId("targetId")
 * .targetType("targetType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html)
 */
@CdkDslMarker
public class CfnSecretTargetAttachmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSecretTargetAttachment.Builder =
        CfnSecretTargetAttachment.Builder.create(scope, id)

    /**
     * The ARN or name of the secret.
     *
     * To reference a secret also created in this template, use the see
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
     * function with the secret's logical ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html#cfn-secretsmanager-secrettargetattachment-secretid)
     *
     * @param secretId The ARN or name of the secret.
     */
    public fun secretId(secretId: String) {
        cdkBuilder.secretId(secretId)
    }

    /**
     * The ID of the database or cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html#cfn-secretsmanager-secrettargetattachment-targetid)
     *
     * @param targetId The ID of the database or cluster.
     */
    public fun targetId(targetId: String) {
        cdkBuilder.targetId(targetId)
    }

    /**
     * A string that defines the type of service or database associated with the secret.
     *
     * This value instructs Secrets Manager how to update the secret with the details of the service
     * or database. This value must be one of the following:
     * * AWS::RDS::DBInstance
     * * AWS::RDS::DBCluster
     * * AWS::Redshift::Cluster
     * * AWS::DocDB::DBInstance
     * * AWS::DocDB::DBCluster
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html#cfn-secretsmanager-secrettargetattachment-targettype)
     *
     * @param targetType A string that defines the type of service or database associated with the
     *   secret.
     */
    public fun targetType(targetType: String) {
        cdkBuilder.targetType(targetType)
    }

    public fun build(): CfnSecretTargetAttachment = cdkBuilder.build()
}
