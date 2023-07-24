@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule
import software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps
import kotlin.Boolean
import kotlin.String

/**
 * Properties for defining a `CfnRotationSchedule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.secretsmanager.*;
 * CfnRotationScheduleProps cfnRotationScheduleProps = CfnRotationScheduleProps.builder()
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
public class CfnRotationSchedulePropsDsl {
    private val cdkBuilder: CfnRotationScheduleProps.Builder = CfnRotationScheduleProps.builder()

    /**
     * @param hostedRotationLambda Creates a new Lambda rotation function based on one of the [Secrets
   * Manager rotation function
   * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
   * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     */
    public fun hostedRotationLambda(hostedRotationLambda: IResolvable) {
        cdkBuilder.hostedRotationLambda(hostedRotationLambda)
    }

    /**
     * @param hostedRotationLambda Creates a new Lambda rotation function based on one of the [Secrets
   * Manager rotation function
   * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
   * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     */
    public fun hostedRotationLambda(hostedRotationLambda: CfnRotationSchedule.HostedRotationLambdaProperty) {
        cdkBuilder.hostedRotationLambda(hostedRotationLambda)
    }

    /**
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window.
     * The rotation schedule is defined in `RotationRules` .
     *
     * If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration by
     * running the [`testSecret`
   * step](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html) of the
     * Lambda rotation function. The test creates an `AWSPENDING` version of the secret and then removes
     * it.
     *
     * If you don't specify this value, then by default, Secrets Manager rotates the secret
     * immediately.
     *
     * Rotation is an asynchronous process. For more information, see [How rotation
   * works](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html) .
     */
    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
        cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    /**
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window.
     * The rotation schedule is defined in `RotationRules` .
     *
     * If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration by
     * running the [`testSecret`
   * step](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html) of the
     * Lambda rotation function. The test creates an `AWSPENDING` version of the secret and then removes
     * it.
     *
     * If you don't specify this value, then by default, Secrets Manager rotates the secret
     * immediately.
     *
     * Rotation is an asynchronous process. For more information, see [How rotation
   * works](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html) .
     */
    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: IResolvable) {
        cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    /**
     * @param rotationLambdaArn The ARN of an existing Lambda rotation function.
     * To specify a rotation function that is also defined in this template, use the
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
     * function.
     *
     * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
   * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     *
     * To create a new rotation function based on one of the [Secrets Manager rotation function
   * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * , specify `HostedRotationLambda` instead.
     */
    public fun rotationLambdaArn(rotationLambdaArn: String) {
        cdkBuilder.rotationLambdaArn(rotationLambdaArn)
    }

    /**
     * @param rotationRules A structure that defines the rotation configuration for this secret.
     */
    public fun rotationRules(rotationRules: IResolvable) {
        cdkBuilder.rotationRules(rotationRules)
    }

    /**
     * @param rotationRules A structure that defines the rotation configuration for this secret.
     */
    public fun rotationRules(rotationRules: CfnRotationSchedule.RotationRulesProperty) {
        cdkBuilder.rotationRules(rotationRules)
    }

    /**
     * @param secretId The ARN or name of the secret to rotate.
     * To reference a secret also created in this template, use the
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
     * function with the secret's logical ID.
     */
    public fun secretId(secretId: String) {
        cdkBuilder.secretId(secretId)
    }

    public fun build(): CfnRotationScheduleProps = cdkBuilder.build()
}
