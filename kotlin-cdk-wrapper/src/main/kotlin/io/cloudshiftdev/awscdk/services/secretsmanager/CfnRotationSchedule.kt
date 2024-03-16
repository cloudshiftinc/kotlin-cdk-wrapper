@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Sets the rotation schedule and Lambda rotation function for a secret. For more information, see
 * [How rotation
 * works](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html) .
 *
 * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
 * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
 * .
 *
 * For the rotation function, you have two options:
 *
 * * You can create a new rotation function based on one of the [Secrets Manager rotation function
 * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
 * by using `HostedRotationLambda` .
 * * You can choose an existing rotation function by using `RotationLambdaARN` .
 *
 * For database secrets, if you define both the secret and the database or service in the AWS
 * CloudFormation template, then you need to define the
 * [AWS::SecretsManager::SecretTargetAttachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html)
 * resource to populate the secret with the connection details of the database or service before you
 * attempt to configure rotation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
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
public open class CfnRotationSchedule internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Creates a new Lambda rotation function based on one of the [Secrets Manager rotation function
   * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
   * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
   */
  public open fun hostedRotationLambda(): Any? = unwrap(this).getHostedRotationLambda()

  /**
   * Creates a new Lambda rotation function based on one of the [Secrets Manager rotation function
   * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
   * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
   */
  public open fun hostedRotationLambda(`value`: IResolvable) {
    unwrap(this).setHostedRotationLambda(`value`.let(IResolvable::unwrap))
  }

  /**
   * Creates a new Lambda rotation function based on one of the [Secrets Manager rotation function
   * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
   * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
   */
  public open fun hostedRotationLambda(`value`: HostedRotationLambdaProperty) {
    unwrap(this).setHostedRotationLambda(`value`.let(HostedRotationLambdaProperty::unwrap))
  }

  /**
   * Creates a new Lambda rotation function based on one of the [Secrets Manager rotation function
   * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
   * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e4f3b5001e8038bcf98afa77cf69b54a6f65534ec9115ffbf47edd7714ddbd79")
  public open fun hostedRotationLambda(`value`: HostedRotationLambdaProperty.Builder.() -> Unit):
      Unit = hostedRotationLambda(HostedRotationLambdaProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
   * window.
   */
  public open fun rotateImmediatelyOnUpdate(): Any? = unwrap(this).getRotateImmediatelyOnUpdate()

  /**
   * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
   * window.
   */
  public open fun rotateImmediatelyOnUpdate(`value`: Boolean) {
    unwrap(this).setRotateImmediatelyOnUpdate(`value`)
  }

  /**
   * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
   * window.
   */
  public open fun rotateImmediatelyOnUpdate(`value`: IResolvable) {
    unwrap(this).setRotateImmediatelyOnUpdate(`value`.let(IResolvable::unwrap))
  }

  /**
   * The ARN of an existing Lambda rotation function.
   */
  public open fun rotationLambdaArn(): String? = unwrap(this).getRotationLambdaArn()

  /**
   * The ARN of an existing Lambda rotation function.
   */
  public open fun rotationLambdaArn(`value`: String) {
    unwrap(this).setRotationLambdaArn(`value`)
  }

  /**
   * A structure that defines the rotation configuration for this secret.
   */
  public open fun rotationRules(): Any? = unwrap(this).getRotationRules()

  /**
   * A structure that defines the rotation configuration for this secret.
   */
  public open fun rotationRules(`value`: IResolvable) {
    unwrap(this).setRotationRules(`value`.let(IResolvable::unwrap))
  }

  /**
   * A structure that defines the rotation configuration for this secret.
   */
  public open fun rotationRules(`value`: RotationRulesProperty) {
    unwrap(this).setRotationRules(`value`.let(RotationRulesProperty::unwrap))
  }

  /**
   * A structure that defines the rotation configuration for this secret.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a70141c33b81c9f1f3c80105794d18bba3b5e49d3227fa6395c01631f49521ec")
  public open fun rotationRules(`value`: RotationRulesProperty.Builder.() -> Unit): Unit =
      rotationRules(RotationRulesProperty(`value`))

  /**
   * The ARN or name of the secret to rotate.
   */
  public open fun secretId(): String = unwrap(this).getSecretId()

  /**
   * The ARN or name of the secret to rotate.
   */
  public open fun secretId(`value`: String) {
    unwrap(this).setSecretId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.secretsmanager.CfnRotationSchedule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Creates a new Lambda rotation function based on one of the [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     *
     * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
     * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda)
     * @param hostedRotationLambda Creates a new Lambda rotation function based on one of the
     * [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead. 
     */
    public fun hostedRotationLambda(hostedRotationLambda: IResolvable)

    /**
     * Creates a new Lambda rotation function based on one of the [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     *
     * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
     * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda)
     * @param hostedRotationLambda Creates a new Lambda rotation function based on one of the
     * [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead. 
     */
    public fun hostedRotationLambda(hostedRotationLambda: HostedRotationLambdaProperty)

    /**
     * Creates a new Lambda rotation function based on one of the [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     *
     * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
     * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda)
     * @param hostedRotationLambda Creates a new Lambda rotation function based on one of the
     * [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b06afb51ad3d8bac88363cde0f16d9b4bed6cf5832a421d68e17a00fd2a7087e")
    public
        fun hostedRotationLambda(hostedRotationLambda: HostedRotationLambdaProperty.Builder.() -> Unit)

    /**
     * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
     * window.
     *
     * The rotation schedule is defined in `RotationRules` .
     *
     * If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration
     * by running the [`testSecret`
     * step](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html) of
     * the Lambda rotation function. The test creates an `AWSPENDING` version of the secret and then
     * removes it.
     *
     * If you don't specify this value, then by default, Secrets Manager rotates the secret
     * immediately.
     *
     * Rotation is an asynchronous process. For more information, see [How rotation
     * works](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotateimmediatelyonupdate)
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window. 
     */
    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean)

    /**
     * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
     * window.
     *
     * The rotation schedule is defined in `RotationRules` .
     *
     * If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration
     * by running the [`testSecret`
     * step](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html) of
     * the Lambda rotation function. The test creates an `AWSPENDING` version of the secret and then
     * removes it.
     *
     * If you don't specify this value, then by default, Secrets Manager rotates the secret
     * immediately.
     *
     * Rotation is an asynchronous process. For more information, see [How rotation
     * works](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotateimmediatelyonupdate)
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window. 
     */
    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: IResolvable)

    /**
     * The ARN of an existing Lambda rotation function.
     *
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
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationlambdaarn)
     * @param rotationLambdaArn The ARN of an existing Lambda rotation function. 
     */
    public fun rotationLambdaArn(rotationLambdaArn: String)

    /**
     * A structure that defines the rotation configuration for this secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationrules)
     * @param rotationRules A structure that defines the rotation configuration for this secret. 
     */
    public fun rotationRules(rotationRules: IResolvable)

    /**
     * A structure that defines the rotation configuration for this secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationrules)
     * @param rotationRules A structure that defines the rotation configuration for this secret. 
     */
    public fun rotationRules(rotationRules: RotationRulesProperty)

    /**
     * A structure that defines the rotation configuration for this secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationrules)
     * @param rotationRules A structure that defines the rotation configuration for this secret. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0cec0ec9407190091306425f081b8377f2ea12f89e11fbcad0fc6ea1075493b")
    public fun rotationRules(rotationRules: RotationRulesProperty.Builder.() -> Unit)

    /**
     * The ARN or name of the secret to rotate.
     *
     * To reference a secret also created in this template, use the
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
     * function with the secret's logical ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-secretid)
     * @param secretId The ARN or name of the secret to rotate. 
     */
    public fun secretId(secretId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.Builder =
        software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.Builder.create(scope, id)

    /**
     * Creates a new Lambda rotation function based on one of the [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     *
     * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
     * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda)
     * @param hostedRotationLambda Creates a new Lambda rotation function based on one of the
     * [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead. 
     */
    override fun hostedRotationLambda(hostedRotationLambda: IResolvable) {
      cdkBuilder.hostedRotationLambda(hostedRotationLambda.let(IResolvable::unwrap))
    }

    /**
     * Creates a new Lambda rotation function based on one of the [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     *
     * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
     * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda)
     * @param hostedRotationLambda Creates a new Lambda rotation function based on one of the
     * [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead. 
     */
    override fun hostedRotationLambda(hostedRotationLambda: HostedRotationLambdaProperty) {
      cdkBuilder.hostedRotationLambda(hostedRotationLambda.let(HostedRotationLambdaProperty::unwrap))
    }

    /**
     * Creates a new Lambda rotation function based on one of the [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     *
     * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
     * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda)
     * @param hostedRotationLambda Creates a new Lambda rotation function based on one of the
     * [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b06afb51ad3d8bac88363cde0f16d9b4bed6cf5832a421d68e17a00fd2a7087e")
    override
        fun hostedRotationLambda(hostedRotationLambda: HostedRotationLambdaProperty.Builder.() -> Unit):
        Unit = hostedRotationLambda(HostedRotationLambdaProperty(hostedRotationLambda))

    /**
     * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
     * window.
     *
     * The rotation schedule is defined in `RotationRules` .
     *
     * If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration
     * by running the [`testSecret`
     * step](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html) of
     * the Lambda rotation function. The test creates an `AWSPENDING` version of the secret and then
     * removes it.
     *
     * If you don't specify this value, then by default, Secrets Manager rotates the secret
     * immediately.
     *
     * Rotation is an asynchronous process. For more information, see [How rotation
     * works](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotateimmediatelyonupdate)
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window. 
     */
    override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    /**
     * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
     * window.
     *
     * The rotation schedule is defined in `RotationRules` .
     *
     * If you don't immediately rotate the secret, Secrets Manager tests the rotation configuration
     * by running the [`testSecret`
     * step](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html) of
     * the Lambda rotation function. The test creates an `AWSPENDING` version of the secret and then
     * removes it.
     *
     * If you don't specify this value, then by default, Secrets Manager rotates the secret
     * immediately.
     *
     * Rotation is an asynchronous process. For more information, see [How rotation
     * works](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotateimmediatelyonupdate)
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window. 
     */
    override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: IResolvable) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate.let(IResolvable::unwrap))
    }

    /**
     * The ARN of an existing Lambda rotation function.
     *
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
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationlambdaarn)
     * @param rotationLambdaArn The ARN of an existing Lambda rotation function. 
     */
    override fun rotationLambdaArn(rotationLambdaArn: String) {
      cdkBuilder.rotationLambdaArn(rotationLambdaArn)
    }

    /**
     * A structure that defines the rotation configuration for this secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationrules)
     * @param rotationRules A structure that defines the rotation configuration for this secret. 
     */
    override fun rotationRules(rotationRules: IResolvable) {
      cdkBuilder.rotationRules(rotationRules.let(IResolvable::unwrap))
    }

    /**
     * A structure that defines the rotation configuration for this secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationrules)
     * @param rotationRules A structure that defines the rotation configuration for this secret. 
     */
    override fun rotationRules(rotationRules: RotationRulesProperty) {
      cdkBuilder.rotationRules(rotationRules.let(RotationRulesProperty::unwrap))
    }

    /**
     * A structure that defines the rotation configuration for this secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationrules)
     * @param rotationRules A structure that defines the rotation configuration for this secret. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0cec0ec9407190091306425f081b8377f2ea12f89e11fbcad0fc6ea1075493b")
    override fun rotationRules(rotationRules: RotationRulesProperty.Builder.() -> Unit): Unit =
        rotationRules(RotationRulesProperty(rotationRules))

    /**
     * The ARN or name of the secret to rotate.
     *
     * To reference a secret also created in this template, use the
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
     * function with the secret's logical ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-secretid)
     * @param secretId The ARN or name of the secret to rotate. 
     */
    override fun secretId(secretId: String) {
      cdkBuilder.secretId(secretId)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRotationSchedule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRotationSchedule(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule):
        CfnRotationSchedule = CfnRotationSchedule(cdkObject)

    internal fun unwrap(wrapped: CfnRotationSchedule):
        software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule = wrapped.cdkObject
  }

  /**
   * The rotation schedule and window.
   *
   * We recommend you use `ScheduleExpression` to set a cron or rate expression for the schedule and
   * `Duration` to set the length of the rotation window.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
   * RotationRulesProperty rotationRulesProperty = RotationRulesProperty.builder()
   * .automaticallyAfterDays(123)
   * .duration("duration")
   * .scheduleExpression("scheduleExpression")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html)
   */
  public interface RotationRulesProperty {
    /**
     * The number of days between automatic scheduled rotations of the secret.
     *
     * You can use this value to check that your secret meets your compliance guidelines for how
     * often secrets must be rotated.
     *
     * In `DescribeSecret` and `ListSecrets` , this value is calculated from the rotation schedule
     * after every successful rotation. In `RotateSecret` , you can set the rotation schedule in
     * `RotationRules` with `AutomaticallyAfterDays` or `ScheduleExpression` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html#cfn-secretsmanager-rotationschedule-rotationrules-automaticallyafterdays)
     */
    public fun automaticallyAfterDays(): Number? = unwrap(this).getAutomaticallyAfterDays()

    /**
     * The length of the rotation window in hours, for example `3h` for a three hour window.
     *
     * Secrets Manager rotates your secret at any time during this window. The window must not
     * extend into the next rotation window or the next UTC day. The window starts according to the
     * `ScheduleExpression` . If you don't specify a `Duration` , for a `ScheduleExpression` in hours,
     * the window automatically closes after one hour. For a `ScheduleExpression` in days, the window
     * automatically closes at the end of the UTC day. For more information, including examples, see
     * [Schedule expressions in Secrets Manager
     * rotation](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html)
     * in the *Secrets Manager Users Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html#cfn-secretsmanager-rotationschedule-rotationrules-duration)
     */
    public fun duration(): String? = unwrap(this).getDuration()

    /**
     * A `cron()` or `rate()` expression that defines the schedule for rotating your secret.
     *
     * Secrets Manager rotation schedules use UTC time zone. Secrets Manager rotates your secret any
     * time during a rotation window.
     *
     * Secrets Manager `rate()` expressions represent the interval in hours or days that you want to
     * rotate your secret, for example `rate(12 hours)` or `rate(10 days)` . You can rotate a secret as
     * often as every four hours. If you use a `rate()` expression, the rotation window starts at
     * midnight. For a rate in hours, the default rotation window closes after one hour. For a rate in
     * days, the default rotation window closes at the end of the day. You can set the `Duration` to
     * change the rotation window. The rotation window must not extend into the next UTC day or into
     * the next rotation window.
     *
     * You can use a `cron()` expression to create a rotation schedule that is more detailed than a
     * rotation interval. For more information, including examples, see [Schedule expressions in
     * Secrets Manager
     * rotation](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html)
     * in the *Secrets Manager Users Guide* . For a cron expression that represents a schedule in
     * hours, the default rotation window closes after one hour. For a cron expression that represents
     * a schedule in days, the default rotation window closes at the end of the day. You can set the
     * `Duration` to change the rotation window. The rotation window must not extend into the next UTC
     * day or into the next rotation window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html#cfn-secretsmanager-rotationschedule-rotationrules-scheduleexpression)
     */
    public fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

    /**
     * A builder for [RotationRulesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param automaticallyAfterDays The number of days between automatic scheduled rotations of
       * the secret.
       * You can use this value to check that your secret meets your compliance guidelines for how
       * often secrets must be rotated.
       *
       * In `DescribeSecret` and `ListSecrets` , this value is calculated from the rotation schedule
       * after every successful rotation. In `RotateSecret` , you can set the rotation schedule in
       * `RotationRules` with `AutomaticallyAfterDays` or `ScheduleExpression` , but not both.
       */
      public fun automaticallyAfterDays(automaticallyAfterDays: Number)

      /**
       * @param duration The length of the rotation window in hours, for example `3h` for a three
       * hour window.
       * Secrets Manager rotates your secret at any time during this window. The window must not
       * extend into the next rotation window or the next UTC day. The window starts according to the
       * `ScheduleExpression` . If you don't specify a `Duration` , for a `ScheduleExpression` in
       * hours, the window automatically closes after one hour. For a `ScheduleExpression` in days, the
       * window automatically closes at the end of the UTC day. For more information, including
       * examples, see [Schedule expressions in Secrets Manager
       * rotation](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html)
       * in the *Secrets Manager Users Guide* .
       */
      public fun duration(duration: String)

      /**
       * @param scheduleExpression A `cron()` or `rate()` expression that defines the schedule for
       * rotating your secret.
       * Secrets Manager rotation schedules use UTC time zone. Secrets Manager rotates your secret
       * any time during a rotation window.
       *
       * Secrets Manager `rate()` expressions represent the interval in hours or days that you want
       * to rotate your secret, for example `rate(12 hours)` or `rate(10 days)` . You can rotate a
       * secret as often as every four hours. If you use a `rate()` expression, the rotation window
       * starts at midnight. For a rate in hours, the default rotation window closes after one hour.
       * For a rate in days, the default rotation window closes at the end of the day. You can set the
       * `Duration` to change the rotation window. The rotation window must not extend into the next
       * UTC day or into the next rotation window.
       *
       * You can use a `cron()` expression to create a rotation schedule that is more detailed than
       * a rotation interval. For more information, including examples, see [Schedule expressions in
       * Secrets Manager
       * rotation](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html)
       * in the *Secrets Manager Users Guide* . For a cron expression that represents a schedule in
       * hours, the default rotation window closes after one hour. For a cron expression that
       * represents a schedule in days, the default rotation window closes at the end of the day. You
       * can set the `Duration` to change the rotation window. The rotation window must not extend into
       * the next UTC day or into the next rotation window.
       */
      public fun scheduleExpression(scheduleExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty.Builder
          =
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty.builder()

      /**
       * @param automaticallyAfterDays The number of days between automatic scheduled rotations of
       * the secret.
       * You can use this value to check that your secret meets your compliance guidelines for how
       * often secrets must be rotated.
       *
       * In `DescribeSecret` and `ListSecrets` , this value is calculated from the rotation schedule
       * after every successful rotation. In `RotateSecret` , you can set the rotation schedule in
       * `RotationRules` with `AutomaticallyAfterDays` or `ScheduleExpression` , but not both.
       */
      override fun automaticallyAfterDays(automaticallyAfterDays: Number) {
        cdkBuilder.automaticallyAfterDays(automaticallyAfterDays)
      }

      /**
       * @param duration The length of the rotation window in hours, for example `3h` for a three
       * hour window.
       * Secrets Manager rotates your secret at any time during this window. The window must not
       * extend into the next rotation window or the next UTC day. The window starts according to the
       * `ScheduleExpression` . If you don't specify a `Duration` , for a `ScheduleExpression` in
       * hours, the window automatically closes after one hour. For a `ScheduleExpression` in days, the
       * window automatically closes at the end of the UTC day. For more information, including
       * examples, see [Schedule expressions in Secrets Manager
       * rotation](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html)
       * in the *Secrets Manager Users Guide* .
       */
      override fun duration(duration: String) {
        cdkBuilder.duration(duration)
      }

      /**
       * @param scheduleExpression A `cron()` or `rate()` expression that defines the schedule for
       * rotating your secret.
       * Secrets Manager rotation schedules use UTC time zone. Secrets Manager rotates your secret
       * any time during a rotation window.
       *
       * Secrets Manager `rate()` expressions represent the interval in hours or days that you want
       * to rotate your secret, for example `rate(12 hours)` or `rate(10 days)` . You can rotate a
       * secret as often as every four hours. If you use a `rate()` expression, the rotation window
       * starts at midnight. For a rate in hours, the default rotation window closes after one hour.
       * For a rate in days, the default rotation window closes at the end of the day. You can set the
       * `Duration` to change the rotation window. The rotation window must not extend into the next
       * UTC day or into the next rotation window.
       *
       * You can use a `cron()` expression to create a rotation schedule that is more detailed than
       * a rotation interval. For more information, including examples, see [Schedule expressions in
       * Secrets Manager
       * rotation](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html)
       * in the *Secrets Manager Users Guide* . For a cron expression that represents a schedule in
       * hours, the default rotation window closes after one hour. For a cron expression that
       * represents a schedule in days, the default rotation window closes at the end of the day. You
       * can set the `Duration` to change the rotation window. The rotation window must not extend into
       * the next UTC day or into the next rotation window.
       */
      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      public fun build():
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty,
    ) : CdkObject(cdkObject), RotationRulesProperty {
      /**
       * The number of days between automatic scheduled rotations of the secret.
       *
       * You can use this value to check that your secret meets your compliance guidelines for how
       * often secrets must be rotated.
       *
       * In `DescribeSecret` and `ListSecrets` , this value is calculated from the rotation schedule
       * after every successful rotation. In `RotateSecret` , you can set the rotation schedule in
       * `RotationRules` with `AutomaticallyAfterDays` or `ScheduleExpression` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html#cfn-secretsmanager-rotationschedule-rotationrules-automaticallyafterdays)
       */
      override fun automaticallyAfterDays(): Number? = unwrap(this).getAutomaticallyAfterDays()

      /**
       * The length of the rotation window in hours, for example `3h` for a three hour window.
       *
       * Secrets Manager rotates your secret at any time during this window. The window must not
       * extend into the next rotation window or the next UTC day. The window starts according to the
       * `ScheduleExpression` . If you don't specify a `Duration` , for a `ScheduleExpression` in
       * hours, the window automatically closes after one hour. For a `ScheduleExpression` in days, the
       * window automatically closes at the end of the UTC day. For more information, including
       * examples, see [Schedule expressions in Secrets Manager
       * rotation](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html)
       * in the *Secrets Manager Users Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html#cfn-secretsmanager-rotationschedule-rotationrules-duration)
       */
      override fun duration(): String? = unwrap(this).getDuration()

      /**
       * A `cron()` or `rate()` expression that defines the schedule for rotating your secret.
       *
       * Secrets Manager rotation schedules use UTC time zone. Secrets Manager rotates your secret
       * any time during a rotation window.
       *
       * Secrets Manager `rate()` expressions represent the interval in hours or days that you want
       * to rotate your secret, for example `rate(12 hours)` or `rate(10 days)` . You can rotate a
       * secret as often as every four hours. If you use a `rate()` expression, the rotation window
       * starts at midnight. For a rate in hours, the default rotation window closes after one hour.
       * For a rate in days, the default rotation window closes at the end of the day. You can set the
       * `Duration` to change the rotation window. The rotation window must not extend into the next
       * UTC day or into the next rotation window.
       *
       * You can use a `cron()` expression to create a rotation schedule that is more detailed than
       * a rotation interval. For more information, including examples, see [Schedule expressions in
       * Secrets Manager
       * rotation](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_schedule.html)
       * in the *Secrets Manager Users Guide* . For a cron expression that represents a schedule in
       * hours, the default rotation window closes after one hour. For a cron expression that
       * represents a schedule in days, the default rotation window closes at the end of the day. You
       * can set the `Duration` to change the rotation window. The rotation window must not extend into
       * the next UTC day or into the next rotation window.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-rotationrules.html#cfn-secretsmanager-rotationschedule-rotationrules-scheduleexpression)
       */
      override fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RotationRulesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty):
          RotationRulesProperty = CdkObjectWrappers.wrap(cdkObject) as RotationRulesProperty

      internal fun unwrap(wrapped: RotationRulesProperty):
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty
    }
  }

  /**
   * Creates a new Lambda rotation function based on one of the [Secrets Manager rotation function
   * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
   * .
   *
   * You must specify `Transform: AWS::SecretsManager-2020-07-23` at the beginning of the
   * CloudFormation template.
   *
   * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
   * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
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
  public interface HostedRotationLambdaProperty {
    /**
     * A string of the characters that you don't want in the password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-excludecharacters)
     */
    public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    /**
     * The ARN of the KMS key that Secrets Manager uses to encrypt the secret.
     *
     * If you don't specify this value, then Secrets Manager uses the key `aws/secretsmanager` . If
     * `aws/secretsmanager` doesn't yet exist, then Secrets Manager creates it for you automatically
     * the first time it encrypts the secret value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The ARN of the secret that contains superuser credentials, if you use the [Alternating users
     * rotation
     * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
     * . CloudFormation grants the execution role for the Lambda rotation function `GetSecretValue`
     * permission to the secret in this property. For more information, see [Lambda rotation function
     * execution role permissions for Secrets
     * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
     * .
     *
     * You must create the superuser secret before you can set this property.
     *
     * You must also include the superuser secret ARN as a key in the JSON of the rotating secret so
     * that the Lambda rotation function can find it. CloudFormation does not hardcode secret ARNs in
     * the Lambda rotation function, so you can use the function to rotate multiple secrets. For more
     * information, see [JSON structure of Secrets Manager
     * secrets](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_secret_json_structure.html)
     * .
     *
     * You can specify `MasterSecretArn` or `SuperuserSecretArn` but not both. They represent the
     * same superuser secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-mastersecretarn)
     */
    public fun masterSecretArn(): String? = unwrap(this).getMasterSecretArn()

    /**
     * The ARN of the KMS key that Secrets Manager used to encrypt the superuser secret, if you use
     * the [alternating users
     * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
     * and the superuser secret is encrypted with a customer managed key. You don't need to specify
     * this property if the superuser secret is encrypted using the key `aws/secretsmanager` .
     * CloudFormation grants the execution role for the Lambda rotation function `Decrypt` ,
     * `DescribeKey` , and `GenerateDataKey` permission to the key in this property. For more
     * information, see [Lambda rotation function execution role permissions for Secrets
     * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
     * .
     *
     * You can specify `MasterSecretKmsKeyArn` or `SuperuserSecretKmsKeyArn` but not both. They
     * represent the same superuser secret KMS key .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-mastersecretkmskeyarn)
     */
    public fun masterSecretKmsKeyArn(): String? = unwrap(this).getMasterSecretKmsKeyArn()

    /**
     * The name of the Lambda rotation function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-rotationlambdaname)
     */
    public fun rotationLambdaName(): String? = unwrap(this).getRotationLambdaName()

    /**
     * The rotation template to base the rotation function on, one of the following:.
     *
     * * `Db2SingleUser` to use the template
     * [SecretsManagerRDSDb2RotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-db2-singleuser)
     * .
     * * `Db2MultiUser` to use the template
     * [SecretsManagerRDSDb2RotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-db2-multiuser)
     * .
     * * `MySQLSingleUser` to use the template
     * [SecretsManagerRDSMySQLRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mysql-singleuser)
     * .
     * * `MySQLMultiUser` to use the template
     * [SecretsManagerRDSMySQLRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mysql-multiuser)
     * .
     * * `PostgreSQLSingleUser` to use the template
     * [SecretsManagerRDSPostgreSQLRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-postgre-singleuser)
     * * `PostgreSQLMultiUser` to use the template
     * [SecretsManagerRDSPostgreSQLRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-postgre-multiuser)
     * .
     * * `OracleSingleUser` to use the template
     * [SecretsManagerRDSOracleRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-oracle-singleuser)
     * .
     * * `OracleMultiUser` to use the template
     * [SecretsManagerRDSOracleRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-oracle-multiuser)
     * .
     * * `MariaDBSingleUser` to use the template
     * [SecretsManagerRDSMariaDBRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mariadb-singleuser)
     * .
     * * `MariaDBMultiUser` to use the template
     * [SecretsManagerRDSMariaDBRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mariadb-multiuser)
     * .
     * * `SQLServerSingleUser` to use the template
     * [SecretsManagerRDSSQLServerRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-sqlserver-singleuser)
     * .
     * * `SQLServerMultiUser` to use the template
     * [SecretsManagerRDSSQLServerRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-sqlserver-multiuser)
     * .
     * * `RedshiftSingleUser` to use the template
     * [SecretsManagerRedshiftRotationSingleUsr](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-redshift-singleuser)
     * .
     * * `RedshiftMultiUser` to use the template
     * [SecretsManagerRedshiftRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-redshift-multiuser)
     * .
     * * `MongoDBSingleUser` to use the template
     * [SecretsManagerMongoDBRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mongodb-singleuser)
     * .
     * * `MongoDBMultiUser` to use the template
     * [SecretsManagerMongoDBRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mongodb-multiuser)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-rotationtype)
     */
    public fun rotationType(): String

    /**
     * By default, CloudFormation deploys Python 3.9 binaries for the rotation function. To use a
     * different version of Python, you must do the following two steps:.
     *
     * * Deploy the matching version Python binaries with your rotation function.
     * * Set the version number in this field. For example, for Python 3.7, enter *python3.7*
     *
     * If you only do one of the steps, your rotation function will be incompatible with the
     * binaries. For more information, see [Why did my Lambda rotation function fail with a "pg module
     * not found"
     * error](https://docs.aws.amazon.com/https://repost.aws/knowledge-center/secrets-manager-lambda-rotation)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-runtime)
     */
    public fun runtime(): String? = unwrap(this).getRuntime()

    /**
     * The ARN of the secret that contains superuser credentials, if you use the [Alternating users
     * rotation
     * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
     * . CloudFormation grants the execution role for the Lambda rotation function `GetSecretValue`
     * permission to the secret in this property. For more information, see [Lambda rotation function
     * execution role permissions for Secrets
     * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
     * .
     *
     * You must create the superuser secret before you can set this property.
     *
     * You must also include the superuser secret ARN as a key in the JSON of the rotating secret so
     * that the Lambda rotation function can find it. CloudFormation does not hardcode secret ARNs in
     * the Lambda rotation function, so you can use the function to rotate multiple secrets. For more
     * information, see [JSON structure of Secrets Manager
     * secrets](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_secret_json_structure.html)
     * .
     *
     * You can specify `MasterSecretArn` or `SuperuserSecretArn` but not both. They represent the
     * same superuser secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-superusersecretarn)
     */
    public fun superuserSecretArn(): String? = unwrap(this).getSuperuserSecretArn()

    /**
     * The ARN of the KMS key that Secrets Manager used to encrypt the superuser secret, if you use
     * the [alternating users
     * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
     * and the superuser secret is encrypted with a customer managed key. You don't need to specify
     * this property if the superuser secret is encrypted using the key `aws/secretsmanager` .
     * CloudFormation grants the execution role for the Lambda rotation function `Decrypt` ,
     * `DescribeKey` , and `GenerateDataKey` permission to the key in this property. For more
     * information, see [Lambda rotation function execution role permissions for Secrets
     * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
     * .
     *
     * You can specify `MasterSecretKmsKeyArn` or `SuperuserSecretKmsKeyArn` but not both. They
     * represent the same superuser secret KMS key .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-superusersecretkmskeyarn)
     */
    public fun superuserSecretKmsKeyArn(): String? = unwrap(this).getSuperuserSecretKmsKeyArn()

    /**
     * A comma-separated list of security group IDs applied to the target database.
     *
     * The template applies the same security groups as on the Lambda rotation function that is
     * created as part of this stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-vpcsecuritygroupids)
     */
    public fun vpcSecurityGroupIds(): String? = unwrap(this).getVpcSecurityGroupIds()

    /**
     * A comma separated list of VPC subnet IDs of the target database network.
     *
     * The Lambda rotation function is in the same subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-vpcsubnetids)
     */
    public fun vpcSubnetIds(): String? = unwrap(this).getVpcSubnetIds()

    /**
     * A builder for [HostedRotationLambdaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param excludeCharacters A string of the characters that you don't want in the password.
       */
      public fun excludeCharacters(excludeCharacters: String)

      /**
       * @param kmsKeyArn The ARN of the KMS key that Secrets Manager uses to encrypt the secret.
       * If you don't specify this value, then Secrets Manager uses the key `aws/secretsmanager` .
       * If `aws/secretsmanager` doesn't yet exist, then Secrets Manager creates it for you
       * automatically the first time it encrypts the secret value.
       */
      public fun kmsKeyArn(kmsKeyArn: String)

      /**
       * @param masterSecretArn The ARN of the secret that contains superuser credentials, if you
       * use the [Alternating users rotation
       * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
       * . CloudFormation grants the execution role for the Lambda rotation function `GetSecretValue`
       * permission to the secret in this property. For more information, see [Lambda rotation function
       * execution role permissions for Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
       * .
       * You must create the superuser secret before you can set this property.
       *
       * You must also include the superuser secret ARN as a key in the JSON of the rotating secret
       * so that the Lambda rotation function can find it. CloudFormation does not hardcode secret ARNs
       * in the Lambda rotation function, so you can use the function to rotate multiple secrets. For
       * more information, see [JSON structure of Secrets Manager
       * secrets](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_secret_json_structure.html)
       * .
       *
       * You can specify `MasterSecretArn` or `SuperuserSecretArn` but not both. They represent the
       * same superuser secret.
       */
      public fun masterSecretArn(masterSecretArn: String)

      /**
       * @param masterSecretKmsKeyArn The ARN of the KMS key that Secrets Manager used to encrypt
       * the superuser secret, if you use the [alternating users
       * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
       * and the superuser secret is encrypted with a customer managed key. You don't need to specify
       * this property if the superuser secret is encrypted using the key `aws/secretsmanager` .
       * CloudFormation grants the execution role for the Lambda rotation function `Decrypt` ,
       * `DescribeKey` , and `GenerateDataKey` permission to the key in this property. For more
       * information, see [Lambda rotation function execution role permissions for Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
       * .
       * You can specify `MasterSecretKmsKeyArn` or `SuperuserSecretKmsKeyArn` but not both. They
       * represent the same superuser secret KMS key .
       */
      public fun masterSecretKmsKeyArn(masterSecretKmsKeyArn: String)

      /**
       * @param rotationLambdaName The name of the Lambda rotation function.
       */
      public fun rotationLambdaName(rotationLambdaName: String)

      /**
       * @param rotationType The rotation template to base the rotation function on, one of the
       * following:. 
       * * `Db2SingleUser` to use the template
       * [SecretsManagerRDSDb2RotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-db2-singleuser)
       * .
       * * `Db2MultiUser` to use the template
       * [SecretsManagerRDSDb2RotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-db2-multiuser)
       * .
       * * `MySQLSingleUser` to use the template
       * [SecretsManagerRDSMySQLRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mysql-singleuser)
       * .
       * * `MySQLMultiUser` to use the template
       * [SecretsManagerRDSMySQLRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mysql-multiuser)
       * .
       * * `PostgreSQLSingleUser` to use the template
       * [SecretsManagerRDSPostgreSQLRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-postgre-singleuser)
       * * `PostgreSQLMultiUser` to use the template
       * [SecretsManagerRDSPostgreSQLRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-postgre-multiuser)
       * .
       * * `OracleSingleUser` to use the template
       * [SecretsManagerRDSOracleRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-oracle-singleuser)
       * .
       * * `OracleMultiUser` to use the template
       * [SecretsManagerRDSOracleRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-oracle-multiuser)
       * .
       * * `MariaDBSingleUser` to use the template
       * [SecretsManagerRDSMariaDBRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mariadb-singleuser)
       * .
       * * `MariaDBMultiUser` to use the template
       * [SecretsManagerRDSMariaDBRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mariadb-multiuser)
       * .
       * * `SQLServerSingleUser` to use the template
       * [SecretsManagerRDSSQLServerRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-sqlserver-singleuser)
       * .
       * * `SQLServerMultiUser` to use the template
       * [SecretsManagerRDSSQLServerRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-sqlserver-multiuser)
       * .
       * * `RedshiftSingleUser` to use the template
       * [SecretsManagerRedshiftRotationSingleUsr](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-redshift-singleuser)
       * .
       * * `RedshiftMultiUser` to use the template
       * [SecretsManagerRedshiftRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-redshift-multiuser)
       * .
       * * `MongoDBSingleUser` to use the template
       * [SecretsManagerMongoDBRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mongodb-singleuser)
       * .
       * * `MongoDBMultiUser` to use the template
       * [SecretsManagerMongoDBRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mongodb-multiuser)
       * .
       */
      public fun rotationType(rotationType: String)

      /**
       * @param runtime By default, CloudFormation deploys Python 3.9 binaries for the rotation
       * function. To use a different version of Python, you must do the following two steps:.
       * * Deploy the matching version Python binaries with your rotation function.
       * * Set the version number in this field. For example, for Python 3.7, enter *python3.7*
       *
       * If you only do one of the steps, your rotation function will be incompatible with the
       * binaries. For more information, see [Why did my Lambda rotation function fail with a "pg
       * module not found"
       * error](https://docs.aws.amazon.com/https://repost.aws/knowledge-center/secrets-manager-lambda-rotation)
       * .
       */
      public fun runtime(runtime: String)

      /**
       * @param superuserSecretArn The ARN of the secret that contains superuser credentials, if you
       * use the [Alternating users rotation
       * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
       * . CloudFormation grants the execution role for the Lambda rotation function `GetSecretValue`
       * permission to the secret in this property. For more information, see [Lambda rotation function
       * execution role permissions for Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
       * .
       * You must create the superuser secret before you can set this property.
       *
       * You must also include the superuser secret ARN as a key in the JSON of the rotating secret
       * so that the Lambda rotation function can find it. CloudFormation does not hardcode secret ARNs
       * in the Lambda rotation function, so you can use the function to rotate multiple secrets. For
       * more information, see [JSON structure of Secrets Manager
       * secrets](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_secret_json_structure.html)
       * .
       *
       * You can specify `MasterSecretArn` or `SuperuserSecretArn` but not both. They represent the
       * same superuser secret.
       */
      public fun superuserSecretArn(superuserSecretArn: String)

      /**
       * @param superuserSecretKmsKeyArn The ARN of the KMS key that Secrets Manager used to encrypt
       * the superuser secret, if you use the [alternating users
       * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
       * and the superuser secret is encrypted with a customer managed key. You don't need to specify
       * this property if the superuser secret is encrypted using the key `aws/secretsmanager` .
       * CloudFormation grants the execution role for the Lambda rotation function `Decrypt` ,
       * `DescribeKey` , and `GenerateDataKey` permission to the key in this property. For more
       * information, see [Lambda rotation function execution role permissions for Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
       * .
       * You can specify `MasterSecretKmsKeyArn` or `SuperuserSecretKmsKeyArn` but not both. They
       * represent the same superuser secret KMS key .
       */
      public fun superuserSecretKmsKeyArn(superuserSecretKmsKeyArn: String)

      /**
       * @param vpcSecurityGroupIds A comma-separated list of security group IDs applied to the
       * target database.
       * The template applies the same security groups as on the Lambda rotation function that is
       * created as part of this stack.
       */
      public fun vpcSecurityGroupIds(vpcSecurityGroupIds: String)

      /**
       * @param vpcSubnetIds A comma separated list of VPC subnet IDs of the target database
       * network.
       * The Lambda rotation function is in the same subnet group.
       */
      public fun vpcSubnetIds(vpcSubnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty.Builder
          =
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty.builder()

      /**
       * @param excludeCharacters A string of the characters that you don't want in the password.
       */
      override fun excludeCharacters(excludeCharacters: String) {
        cdkBuilder.excludeCharacters(excludeCharacters)
      }

      /**
       * @param kmsKeyArn The ARN of the KMS key that Secrets Manager uses to encrypt the secret.
       * If you don't specify this value, then Secrets Manager uses the key `aws/secretsmanager` .
       * If `aws/secretsmanager` doesn't yet exist, then Secrets Manager creates it for you
       * automatically the first time it encrypts the secret value.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      /**
       * @param masterSecretArn The ARN of the secret that contains superuser credentials, if you
       * use the [Alternating users rotation
       * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
       * . CloudFormation grants the execution role for the Lambda rotation function `GetSecretValue`
       * permission to the secret in this property. For more information, see [Lambda rotation function
       * execution role permissions for Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
       * .
       * You must create the superuser secret before you can set this property.
       *
       * You must also include the superuser secret ARN as a key in the JSON of the rotating secret
       * so that the Lambda rotation function can find it. CloudFormation does not hardcode secret ARNs
       * in the Lambda rotation function, so you can use the function to rotate multiple secrets. For
       * more information, see [JSON structure of Secrets Manager
       * secrets](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_secret_json_structure.html)
       * .
       *
       * You can specify `MasterSecretArn` or `SuperuserSecretArn` but not both. They represent the
       * same superuser secret.
       */
      override fun masterSecretArn(masterSecretArn: String) {
        cdkBuilder.masterSecretArn(masterSecretArn)
      }

      /**
       * @param masterSecretKmsKeyArn The ARN of the KMS key that Secrets Manager used to encrypt
       * the superuser secret, if you use the [alternating users
       * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
       * and the superuser secret is encrypted with a customer managed key. You don't need to specify
       * this property if the superuser secret is encrypted using the key `aws/secretsmanager` .
       * CloudFormation grants the execution role for the Lambda rotation function `Decrypt` ,
       * `DescribeKey` , and `GenerateDataKey` permission to the key in this property. For more
       * information, see [Lambda rotation function execution role permissions for Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
       * .
       * You can specify `MasterSecretKmsKeyArn` or `SuperuserSecretKmsKeyArn` but not both. They
       * represent the same superuser secret KMS key .
       */
      override fun masterSecretKmsKeyArn(masterSecretKmsKeyArn: String) {
        cdkBuilder.masterSecretKmsKeyArn(masterSecretKmsKeyArn)
      }

      /**
       * @param rotationLambdaName The name of the Lambda rotation function.
       */
      override fun rotationLambdaName(rotationLambdaName: String) {
        cdkBuilder.rotationLambdaName(rotationLambdaName)
      }

      /**
       * @param rotationType The rotation template to base the rotation function on, one of the
       * following:. 
       * * `Db2SingleUser` to use the template
       * [SecretsManagerRDSDb2RotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-db2-singleuser)
       * .
       * * `Db2MultiUser` to use the template
       * [SecretsManagerRDSDb2RotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-db2-multiuser)
       * .
       * * `MySQLSingleUser` to use the template
       * [SecretsManagerRDSMySQLRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mysql-singleuser)
       * .
       * * `MySQLMultiUser` to use the template
       * [SecretsManagerRDSMySQLRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mysql-multiuser)
       * .
       * * `PostgreSQLSingleUser` to use the template
       * [SecretsManagerRDSPostgreSQLRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-postgre-singleuser)
       * * `PostgreSQLMultiUser` to use the template
       * [SecretsManagerRDSPostgreSQLRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-postgre-multiuser)
       * .
       * * `OracleSingleUser` to use the template
       * [SecretsManagerRDSOracleRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-oracle-singleuser)
       * .
       * * `OracleMultiUser` to use the template
       * [SecretsManagerRDSOracleRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-oracle-multiuser)
       * .
       * * `MariaDBSingleUser` to use the template
       * [SecretsManagerRDSMariaDBRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mariadb-singleuser)
       * .
       * * `MariaDBMultiUser` to use the template
       * [SecretsManagerRDSMariaDBRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mariadb-multiuser)
       * .
       * * `SQLServerSingleUser` to use the template
       * [SecretsManagerRDSSQLServerRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-sqlserver-singleuser)
       * .
       * * `SQLServerMultiUser` to use the template
       * [SecretsManagerRDSSQLServerRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-sqlserver-multiuser)
       * .
       * * `RedshiftSingleUser` to use the template
       * [SecretsManagerRedshiftRotationSingleUsr](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-redshift-singleuser)
       * .
       * * `RedshiftMultiUser` to use the template
       * [SecretsManagerRedshiftRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-redshift-multiuser)
       * .
       * * `MongoDBSingleUser` to use the template
       * [SecretsManagerMongoDBRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mongodb-singleuser)
       * .
       * * `MongoDBMultiUser` to use the template
       * [SecretsManagerMongoDBRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mongodb-multiuser)
       * .
       */
      override fun rotationType(rotationType: String) {
        cdkBuilder.rotationType(rotationType)
      }

      /**
       * @param runtime By default, CloudFormation deploys Python 3.9 binaries for the rotation
       * function. To use a different version of Python, you must do the following two steps:.
       * * Deploy the matching version Python binaries with your rotation function.
       * * Set the version number in this field. For example, for Python 3.7, enter *python3.7*
       *
       * If you only do one of the steps, your rotation function will be incompatible with the
       * binaries. For more information, see [Why did my Lambda rotation function fail with a "pg
       * module not found"
       * error](https://docs.aws.amazon.com/https://repost.aws/knowledge-center/secrets-manager-lambda-rotation)
       * .
       */
      override fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
      }

      /**
       * @param superuserSecretArn The ARN of the secret that contains superuser credentials, if you
       * use the [Alternating users rotation
       * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
       * . CloudFormation grants the execution role for the Lambda rotation function `GetSecretValue`
       * permission to the secret in this property. For more information, see [Lambda rotation function
       * execution role permissions for Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
       * .
       * You must create the superuser secret before you can set this property.
       *
       * You must also include the superuser secret ARN as a key in the JSON of the rotating secret
       * so that the Lambda rotation function can find it. CloudFormation does not hardcode secret ARNs
       * in the Lambda rotation function, so you can use the function to rotate multiple secrets. For
       * more information, see [JSON structure of Secrets Manager
       * secrets](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_secret_json_structure.html)
       * .
       *
       * You can specify `MasterSecretArn` or `SuperuserSecretArn` but not both. They represent the
       * same superuser secret.
       */
      override fun superuserSecretArn(superuserSecretArn: String) {
        cdkBuilder.superuserSecretArn(superuserSecretArn)
      }

      /**
       * @param superuserSecretKmsKeyArn The ARN of the KMS key that Secrets Manager used to encrypt
       * the superuser secret, if you use the [alternating users
       * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
       * and the superuser secret is encrypted with a customer managed key. You don't need to specify
       * this property if the superuser secret is encrypted using the key `aws/secretsmanager` .
       * CloudFormation grants the execution role for the Lambda rotation function `Decrypt` ,
       * `DescribeKey` , and `GenerateDataKey` permission to the key in this property. For more
       * information, see [Lambda rotation function execution role permissions for Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
       * .
       * You can specify `MasterSecretKmsKeyArn` or `SuperuserSecretKmsKeyArn` but not both. They
       * represent the same superuser secret KMS key .
       */
      override fun superuserSecretKmsKeyArn(superuserSecretKmsKeyArn: String) {
        cdkBuilder.superuserSecretKmsKeyArn(superuserSecretKmsKeyArn)
      }

      /**
       * @param vpcSecurityGroupIds A comma-separated list of security group IDs applied to the
       * target database.
       * The template applies the same security groups as on the Lambda rotation function that is
       * created as part of this stack.
       */
      override fun vpcSecurityGroupIds(vpcSecurityGroupIds: String) {
        cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
      }

      /**
       * @param vpcSubnetIds A comma separated list of VPC subnet IDs of the target database
       * network.
       * The Lambda rotation function is in the same subnet group.
       */
      override fun vpcSubnetIds(vpcSubnetIds: String) {
        cdkBuilder.vpcSubnetIds(vpcSubnetIds)
      }

      public fun build():
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty,
    ) : CdkObject(cdkObject), HostedRotationLambdaProperty {
      /**
       * A string of the characters that you don't want in the password.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-excludecharacters)
       */
      override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

      /**
       * The ARN of the KMS key that Secrets Manager uses to encrypt the secret.
       *
       * If you don't specify this value, then Secrets Manager uses the key `aws/secretsmanager` .
       * If `aws/secretsmanager` doesn't yet exist, then Secrets Manager creates it for you
       * automatically the first time it encrypts the secret value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      /**
       * The ARN of the secret that contains superuser credentials, if you use the [Alternating
       * users rotation
       * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
       * . CloudFormation grants the execution role for the Lambda rotation function `GetSecretValue`
       * permission to the secret in this property. For more information, see [Lambda rotation function
       * execution role permissions for Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
       * .
       *
       * You must create the superuser secret before you can set this property.
       *
       * You must also include the superuser secret ARN as a key in the JSON of the rotating secret
       * so that the Lambda rotation function can find it. CloudFormation does not hardcode secret ARNs
       * in the Lambda rotation function, so you can use the function to rotate multiple secrets. For
       * more information, see [JSON structure of Secrets Manager
       * secrets](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_secret_json_structure.html)
       * .
       *
       * You can specify `MasterSecretArn` or `SuperuserSecretArn` but not both. They represent the
       * same superuser secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-mastersecretarn)
       */
      override fun masterSecretArn(): String? = unwrap(this).getMasterSecretArn()

      /**
       * The ARN of the KMS key that Secrets Manager used to encrypt the superuser secret, if you
       * use the [alternating users
       * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
       * and the superuser secret is encrypted with a customer managed key. You don't need to specify
       * this property if the superuser secret is encrypted using the key `aws/secretsmanager` .
       * CloudFormation grants the execution role for the Lambda rotation function `Decrypt` ,
       * `DescribeKey` , and `GenerateDataKey` permission to the key in this property. For more
       * information, see [Lambda rotation function execution role permissions for Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
       * .
       *
       * You can specify `MasterSecretKmsKeyArn` or `SuperuserSecretKmsKeyArn` but not both. They
       * represent the same superuser secret KMS key .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-mastersecretkmskeyarn)
       */
      override fun masterSecretKmsKeyArn(): String? = unwrap(this).getMasterSecretKmsKeyArn()

      /**
       * The name of the Lambda rotation function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-rotationlambdaname)
       */
      override fun rotationLambdaName(): String? = unwrap(this).getRotationLambdaName()

      /**
       * The rotation template to base the rotation function on, one of the following:.
       *
       * * `Db2SingleUser` to use the template
       * [SecretsManagerRDSDb2RotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-db2-singleuser)
       * .
       * * `Db2MultiUser` to use the template
       * [SecretsManagerRDSDb2RotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-db2-multiuser)
       * .
       * * `MySQLSingleUser` to use the template
       * [SecretsManagerRDSMySQLRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mysql-singleuser)
       * .
       * * `MySQLMultiUser` to use the template
       * [SecretsManagerRDSMySQLRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mysql-multiuser)
       * .
       * * `PostgreSQLSingleUser` to use the template
       * [SecretsManagerRDSPostgreSQLRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-postgre-singleuser)
       * * `PostgreSQLMultiUser` to use the template
       * [SecretsManagerRDSPostgreSQLRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-postgre-multiuser)
       * .
       * * `OracleSingleUser` to use the template
       * [SecretsManagerRDSOracleRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-oracle-singleuser)
       * .
       * * `OracleMultiUser` to use the template
       * [SecretsManagerRDSOracleRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-oracle-multiuser)
       * .
       * * `MariaDBSingleUser` to use the template
       * [SecretsManagerRDSMariaDBRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mariadb-singleuser)
       * .
       * * `MariaDBMultiUser` to use the template
       * [SecretsManagerRDSMariaDBRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mariadb-multiuser)
       * .
       * * `SQLServerSingleUser` to use the template
       * [SecretsManagerRDSSQLServerRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-sqlserver-singleuser)
       * .
       * * `SQLServerMultiUser` to use the template
       * [SecretsManagerRDSSQLServerRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-sqlserver-multiuser)
       * .
       * * `RedshiftSingleUser` to use the template
       * [SecretsManagerRedshiftRotationSingleUsr](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-redshift-singleuser)
       * .
       * * `RedshiftMultiUser` to use the template
       * [SecretsManagerRedshiftRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-redshift-multiuser)
       * .
       * * `MongoDBSingleUser` to use the template
       * [SecretsManagerMongoDBRotationSingleUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mongodb-singleuser)
       * .
       * * `MongoDBMultiUser` to use the template
       * [SecretsManagerMongoDBRotationMultiUser](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html#sar-template-mongodb-multiuser)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-rotationtype)
       */
      override fun rotationType(): String = unwrap(this).getRotationType()

      /**
       * By default, CloudFormation deploys Python 3.9 binaries for the rotation function. To use a
       * different version of Python, you must do the following two steps:.
       *
       * * Deploy the matching version Python binaries with your rotation function.
       * * Set the version number in this field. For example, for Python 3.7, enter *python3.7*
       *
       * If you only do one of the steps, your rotation function will be incompatible with the
       * binaries. For more information, see [Why did my Lambda rotation function fail with a "pg
       * module not found"
       * error](https://docs.aws.amazon.com/https://repost.aws/knowledge-center/secrets-manager-lambda-rotation)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-runtime)
       */
      override fun runtime(): String? = unwrap(this).getRuntime()

      /**
       * The ARN of the secret that contains superuser credentials, if you use the [Alternating
       * users rotation
       * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
       * . CloudFormation grants the execution role for the Lambda rotation function `GetSecretValue`
       * permission to the secret in this property. For more information, see [Lambda rotation function
       * execution role permissions for Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
       * .
       *
       * You must create the superuser secret before you can set this property.
       *
       * You must also include the superuser secret ARN as a key in the JSON of the rotating secret
       * so that the Lambda rotation function can find it. CloudFormation does not hardcode secret ARNs
       * in the Lambda rotation function, so you can use the function to rotate multiple secrets. For
       * more information, see [JSON structure of Secrets Manager
       * secrets](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_secret_json_structure.html)
       * .
       *
       * You can specify `MasterSecretArn` or `SuperuserSecretArn` but not both. They represent the
       * same superuser secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-superusersecretarn)
       */
      override fun superuserSecretArn(): String? = unwrap(this).getSuperuserSecretArn()

      /**
       * The ARN of the KMS key that Secrets Manager used to encrypt the superuser secret, if you
       * use the [alternating users
       * strategy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets_strategies.html#rotating-secrets-two-users)
       * and the superuser secret is encrypted with a customer managed key. You don't need to specify
       * this property if the superuser secret is encrypted using the key `aws/secretsmanager` .
       * CloudFormation grants the execution role for the Lambda rotation function `Decrypt` ,
       * `DescribeKey` , and `GenerateDataKey` permission to the key in this property. For more
       * information, see [Lambda rotation function execution role permissions for Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets-required-permissions-function.html)
       * .
       *
       * You can specify `MasterSecretKmsKeyArn` or `SuperuserSecretKmsKeyArn` but not both. They
       * represent the same superuser secret KMS key .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-superusersecretkmskeyarn)
       */
      override fun superuserSecretKmsKeyArn(): String? = unwrap(this).getSuperuserSecretKmsKeyArn()

      /**
       * A comma-separated list of security group IDs applied to the target database.
       *
       * The template applies the same security groups as on the Lambda rotation function that is
       * created as part of this stack.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-vpcsecuritygroupids)
       */
      override fun vpcSecurityGroupIds(): String? = unwrap(this).getVpcSecurityGroupIds()

      /**
       * A comma separated list of VPC subnet IDs of the target database network.
       *
       * The Lambda rotation function is in the same subnet group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-rotationschedule-hostedrotationlambda.html#cfn-secretsmanager-rotationschedule-hostedrotationlambda-vpcsubnetids)
       */
      override fun vpcSubnetIds(): String? = unwrap(this).getVpcSubnetIds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HostedRotationLambdaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty):
          HostedRotationLambdaProperty = CdkObjectWrappers.wrap(cdkObject) as
          HostedRotationLambdaProperty

      internal fun unwrap(wrapped: HostedRotationLambdaProperty):
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty
    }
  }
}
