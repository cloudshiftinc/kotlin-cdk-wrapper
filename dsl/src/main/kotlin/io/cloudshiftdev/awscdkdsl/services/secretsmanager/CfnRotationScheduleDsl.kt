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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule
import software.constructs.Construct

/**
 * Sets the rotation schedule and Lambda rotation function for a secret. For more information, see
 * [How rotation works](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html)
 * .
 *
 * For Amazon RDS master user credentials, see
 * [AWS::RDS::DBCluster MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
 * .
 *
 * For the rotation function, you have two options:
 * * You can create a new rotation function based on one of the
 *   [Secrets Manager rotation function templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
 *   by using `HostedRotationLambda` .
 * * You can choose an existing rotation function by using `RotationLambdaARN` .
 *
 * For database secrets, if you define both the secret and the database or service in the AWS
 * CloudFormation template, then you need to define the
 * [AWS::SecretsManager::SecretTargetAttachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html)
 * resource to populate the secret with the connection details of the database or service before you
 * attempt to configure rotation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.secretsmanager.*;
 * CfnRotationSchedule cfnRotationSchedule = CfnRotationSchedule.Builder.create(this,
 * "MyCfnRotationSchedule")
 * .secretId("secretId")
 * // the properties below are optional
 * .hostedRotationLambda(HostedRotationLambdaProperty.builder()
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
 * .build())
 * .rotateImmediatelyOnUpdate(false)
 * .rotationLambdaArn("rotationLambdaArn")
 * .rotationRules(RotationRulesProperty.builder()
 * .automaticallyAfterDays(123)
 * .duration("duration")
 * .scheduleExpression("scheduleExpression")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html)
 */
@CdkDslMarker
public class CfnRotationScheduleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRotationSchedule.Builder =
        CfnRotationSchedule.Builder.create(scope, id)

    /**
     * Creates a new Lambda rotation function based on one of the
     * [Secrets Manager rotation function templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     *
     * For Amazon RDS master user credentials, see
     * [AWS::RDS::DBCluster MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda)
     *
     * @param hostedRotationLambda Creates a new Lambda rotation function based on one of the
     *   [Secrets Manager rotation function templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     *   . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     */
    public fun hostedRotationLambda(hostedRotationLambda: IResolvable) {
        cdkBuilder.hostedRotationLambda(hostedRotationLambda)
    }

    /**
     * Creates a new Lambda rotation function based on one of the
     * [Secrets Manager rotation function templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     *
     * For Amazon RDS master user credentials, see
     * [AWS::RDS::DBCluster MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda)
     *
     * @param hostedRotationLambda Creates a new Lambda rotation function based on one of the
     *   [Secrets Manager rotation function templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     *   . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     */
    public fun hostedRotationLambda(
        hostedRotationLambda: CfnRotationSchedule.HostedRotationLambdaProperty
    ) {
        cdkBuilder.hostedRotationLambda(hostedRotationLambda)
    }

    /**
     * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
     * window.
     *
     * The rotation schedule is defined in `RotationRules` .
     *
     * If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration
     * by running the
     * [`testSecret` step](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html)
     * of the Lambda rotation function. The test creates an `AWSPENDING` version of the secret and
     * then removes it.
     *
     * If you don't specify this value, then by default, Secrets Manager rotates the secret
     * immediately.
     *
     * Rotation is an asynchronous process. For more information, see
     * [How rotation works](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotateimmediatelyonupdate)
     *
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     *   until the next scheduled rotation window.
     */
    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
        cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    /**
     * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
     * window.
     *
     * The rotation schedule is defined in `RotationRules` .
     *
     * If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration
     * by running the
     * [`testSecret` step](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html)
     * of the Lambda rotation function. The test creates an `AWSPENDING` version of the secret and
     * then removes it.
     *
     * If you don't specify this value, then by default, Secrets Manager rotates the secret
     * immediately.
     *
     * Rotation is an asynchronous process. For more information, see
     * [How rotation works](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotateimmediatelyonupdate)
     *
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     *   until the next scheduled rotation window.
     */
    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: IResolvable) {
        cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    /**
     * The ARN of an existing Lambda rotation function.
     *
     * To specify a rotation function that is also defined in this template, use the
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
     * function.
     *
     * For Amazon RDS master user credentials, see
     * [AWS::RDS::DBCluster MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     *
     * To create a new rotation function based on one of the
     * [Secrets Manager rotation function templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * , specify `HostedRotationLambda` instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationlambdaarn)
     *
     * @param rotationLambdaArn The ARN of an existing Lambda rotation function.
     */
    public fun rotationLambdaArn(rotationLambdaArn: String) {
        cdkBuilder.rotationLambdaArn(rotationLambdaArn)
    }

    /**
     * A structure that defines the rotation configuration for this secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationrules)
     *
     * @param rotationRules A structure that defines the rotation configuration for this secret.
     */
    public fun rotationRules(rotationRules: IResolvable) {
        cdkBuilder.rotationRules(rotationRules)
    }

    /**
     * A structure that defines the rotation configuration for this secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationrules)
     *
     * @param rotationRules A structure that defines the rotation configuration for this secret.
     */
    public fun rotationRules(rotationRules: CfnRotationSchedule.RotationRulesProperty) {
        cdkBuilder.rotationRules(rotationRules)
    }

    /**
     * The ARN or name of the secret to rotate.
     *
     * To reference a secret also created in this template, use the
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
     * function with the secret's logical ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-secretid)
     *
     * @param secretId The ARN or name of the secret to rotate.
     */
    public fun secretId(secretId: String) {
        cdkBuilder.secretId(secretId)
    }

    public fun build(): CfnRotationSchedule = cdkBuilder.build()
}
