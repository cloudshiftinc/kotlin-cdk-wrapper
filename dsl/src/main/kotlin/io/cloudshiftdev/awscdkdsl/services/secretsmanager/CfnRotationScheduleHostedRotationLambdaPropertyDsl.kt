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
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule

/**
 * Creates a new Lambda rotation function based on one of the
 * [Secrets Manager rotation function templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
 * .
 *
 * You must specify `Transform: AWS::SecretsManager-2020-07-23` at the beginning of the
 * CloudFormation template.
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
 * HostedRotationLambdaProperty hostedRotationLambdaProperty =
 * HostedRotationLambdaProperty.builder()
 * .rotationType("rotationType")
 * // the properties below are optional
 * .excludeCharacters("excludeCharacters")
 * .kmsKeyArn("kmsKeyArn")
 * .masterSecretArn("masterSecretArn")
 * .masterSecretKmsKeyArn("masterSecretKmsKeyArn")
 * .rotationLambdaName("rotationLambdaName")
 * .runtime("runtime")
 * .superuserSecretArn("superuserSecretArn")
 * .superuserSecretKmsKeyArn("superuserSecretKmsKeyArn")
 * .vpcSecurityGroupIds("vpcSecurityGroupIds")
 * .vpcSubnetIds("vpcSubnetIds")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html)
 */
@CdkDslMarker
public class CfnRotationScheduleHostedRotationLambdaPropertyDsl {
    private val cdkBuilder: CfnRotationSchedule.HostedRotationLambdaProperty.Builder =
        CfnRotationSchedule.HostedRotationLambdaProperty.builder()

    /** @param excludeCharacters A string of the characters that you don't want in the password. */
    public fun excludeCharacters(excludeCharacters: String) {
        cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * @param kmsKeyArn The ARN of the KMS key that Secrets Manager uses to encrypt the secret. If
     *   you don't specify this value, then Secrets Manager uses the key `aws/secretsmanager` . If
     *   `aws/secretsmanager` doesn't yet exist, then Secrets Manager creates it for you
     *   automatically the first time it encrypts the secret value.
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param masterSecretArn The ARN of the secret that contains superuser credentials, if you use
     *   the
     *   [Alternating users rotation strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
     *   . CloudFormation grants the execution role for the Lambda rotation function
     *   `GetSecretValue` permission to the secret in this property. For more information, see
     *   [Lambda rotation function execution role permissions for Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
     *   . You must create the superuser secret before you can set this property.
     *
     * You must also include the superuser secret ARN as a key in the JSON of the rotating secret so
     * that the Lambda rotation function can find it. CloudFormation does not hardcode secret ARNs
     * in the Lambda rotation function, so you can use the function to rotate multiple secrets. For
     * more information, see
     * [JSON structure of Secrets Manager secrets](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_secret_json_structure.html)
     * .
     *
     * You can specify `MasterSecretArn` or `SuperuserSecretArn` but not both. They represent the
     * same superuser secret.
     */
    public fun masterSecretArn(masterSecretArn: String) {
        cdkBuilder.masterSecretArn(masterSecretArn)
    }

    /**
     * @param masterSecretKmsKeyArn The ARN of the KMS key that Secrets Manager used to encrypt the
     *   superuser secret, if you use the
     *   [alternating users strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
     *   and the superuser secret is encrypted with a customer managed key. You don't need to
     *   specify this property if the superuser secret is encrypted using the key
     *   `aws/secretsmanager` . CloudFormation grants the execution role for the Lambda rotation
     *   function `Decrypt` , `DescribeKey` , and `GenerateDataKey` permission to the key in this
     *   property. For more information, see
     *   [Lambda rotation function execution role permissions for Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
     *   . You can specify `MasterSecretKmsKeyArn` or `SuperuserSecretKmsKeyArn` but not both. They
     *   represent the same superuser secret KMS key .
     */
    public fun masterSecretKmsKeyArn(masterSecretKmsKeyArn: String) {
        cdkBuilder.masterSecretKmsKeyArn(masterSecretKmsKeyArn)
    }

    /** @param rotationLambdaName The name of the Lambda rotation function. */
    public fun rotationLambdaName(rotationLambdaName: String) {
        cdkBuilder.rotationLambdaName(rotationLambdaName)
    }

    /**
     * @param rotationType The rotation template to base the rotation function on, one of the
     *   following:.
     * * `MySQLSingleUser` to use the template
     *   [SecretsManagerRDSMySQLRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mysql-singleuser)
     *   .
     * * `MySQLMultiUser` to use the template
     *   [SecretsManagerRDSMySQLRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mysql-multiuser)
     *   .
     * * `PostgreSQLSingleUser` to use the template
     *   [SecretsManagerRDSPostgreSQLRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-postgre-singleuser)
     * * `PostgreSQLMultiUser` to use the template
     *   [SecretsManagerRDSPostgreSQLRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-postgre-multiuser)
     *   .
     * * `OracleSingleUser` to use the template
     *   [SecretsManagerRDSOracleRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-oracle-singleuser)
     *   .
     * * `OracleMultiUser` to use the template
     *   [SecretsManagerRDSOracleRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-oracle-multiuser)
     *   .
     * * `MariaDBSingleUser` to use the template
     *   [SecretsManagerRDSMariaDBRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mariadb-singleuser)
     *   .
     * * `MariaDBMultiUser` to use the template
     *   [SecretsManagerRDSMariaDBRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mariadb-multiuser)
     *   .
     * * `SQLServerSingleUser` to use the template
     *   [SecretsManagerRDSSQLServerRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-sqlserver-singleuser)
     *   .
     * * `SQLServerMultiUser` to use the template
     *   [SecretsManagerRDSSQLServerRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-sqlserver-multiuser)
     *   .
     * * `RedshiftSingleUser` to use the template
     *   [SecretsManagerRedshiftRotationSingleUsr](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-redshift-singleuser)
     *   .
     * * `RedshiftMultiUser` to use the template
     *   [SecretsManagerRedshiftRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-redshift-multiuser)
     *   .
     * * `MongoDBSingleUser` to use the template
     *   [SecretsManagerMongoDBRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mongodb-singleuser)
     *   .
     * * `MongoDBMultiUser` to use the template
     *   [SecretsManagerMongoDBRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mongodb-multiuser)
     *   .
     */
    public fun rotationType(rotationType: String) {
        cdkBuilder.rotationType(rotationType)
    }

    /**
     * @param runtime By default, CloudFormation deploys Python 3.9 binaries for the rotation
     *   function. To use a different version of Python, you must do the following two steps:.
     * * Deploy the matching version Python binaries with your rotation function.
     * * Set the version number in this field. For example, for Python 3.7, enter *python3.7*
     *
     * If you only do one of the steps, your rotation function will be incompatible with the
     * binaries. For more information, see
     * [Why did my Lambda rotation function fail with a "pg module not found" error](https://docs.aws.amazon.com/https://repost.aws/knowledge-center/secrets-manager-lambda-rotation)
     * .
     */
    public fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
    }

    /**
     * @param superuserSecretArn The ARN of the secret that contains superuser credentials, if you
     *   use the
     *   [Alternating users rotation strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
     *   . CloudFormation grants the execution role for the Lambda rotation function
     *   `GetSecretValue` permission to the secret in this property. For more information, see
     *   [Lambda rotation function execution role permissions for Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
     *   . You must create the superuser secret before you can set this property.
     *
     * You must also include the superuser secret ARN as a key in the JSON of the rotating secret so
     * that the Lambda rotation function can find it. CloudFormation does not hardcode secret ARNs
     * in the Lambda rotation function, so you can use the function to rotate multiple secrets. For
     * more information, see
     * [JSON structure of Secrets Manager secrets](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_secret_json_structure.html)
     * .
     *
     * You can specify `MasterSecretArn` or `SuperuserSecretArn` but not both. They represent the
     * same superuser secret.
     */
    public fun superuserSecretArn(superuserSecretArn: String) {
        cdkBuilder.superuserSecretArn(superuserSecretArn)
    }

    /**
     * @param superuserSecretKmsKeyArn The ARN of the KMS key that Secrets Manager used to encrypt
     *   the superuser secret, if you use the
     *   [alternating users strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
     *   and the superuser secret is encrypted with a customer managed key. You don't need to
     *   specify this property if the superuser secret is encrypted using the key
     *   `aws/secretsmanager` . CloudFormation grants the execution role for the Lambda rotation
     *   function `Decrypt` , `DescribeKey` , and `GenerateDataKey` permission to the key in this
     *   property. For more information, see
     *   [Lambda rotation function execution role permissions for Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
     *   . You can specify `MasterSecretKmsKeyArn` or `SuperuserSecretKmsKeyArn` but not both. They
     *   represent the same superuser secret KMS key .
     */
    public fun superuserSecretKmsKeyArn(superuserSecretKmsKeyArn: String) {
        cdkBuilder.superuserSecretKmsKeyArn(superuserSecretKmsKeyArn)
    }

    /**
     * @param vpcSecurityGroupIds A comma-separated list of security group IDs applied to the target
     *   database. The template applies the same security groups as on the Lambda rotation function
     *   that is created as part of this stack.
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: String) {
        cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * @param vpcSubnetIds A comma separated list of VPC subnet IDs of the target database network.
     *   The Lambda rotation function is in the same subnet group.
     */
    public fun vpcSubnetIds(vpcSubnetIds: String) {
        cdkBuilder.vpcSubnetIds(vpcSubnetIds)
    }

    public fun build(): CfnRotationSchedule.HostedRotationLambdaProperty = cdkBuilder.build()
}
