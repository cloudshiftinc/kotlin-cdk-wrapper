package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnRotationScheduleProps {
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
   */
  public fun hostedRotationLambda(): Any? = unwrap(this).getHostedRotationLambda()

  /**
   * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
   * window.
   *
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
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotateimmediatelyonupdate)
   */
  public fun rotateImmediatelyOnUpdate(): Any? = unwrap(this).getRotateImmediatelyOnUpdate()

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
   */
  public fun rotationLambdaArn(): String? = unwrap(this).getRotationLambdaArn()

  /**
   * A structure that defines the rotation configuration for this secret.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationrules)
   */
  public fun rotationRules(): Any? = unwrap(this).getRotationRules()

  /**
   * The ARN or name of the secret to rotate.
   *
   * To reference a secret also created in this template, use the
   * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
   * function with the secret's logical ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-secretid)
   */
  public fun secretId(): String

  /**
   * A builder for [CfnRotationScheduleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param hostedRotationLambda Creates a new Lambda rotation function based on one of the
     * [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
     * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     */
    public fun hostedRotationLambda(hostedRotationLambda: IResolvable)

    /**
     * @param hostedRotationLambda Creates a new Lambda rotation function based on one of the
     * [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
     * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     */
    public
        fun hostedRotationLambda(hostedRotationLambda: CfnRotationSchedule.HostedRotationLambdaProperty)

    /**
     * @param hostedRotationLambda Creates a new Lambda rotation function based on one of the
     * [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
     * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fefc0177980977567cd24d7fe070e3c5ef0a0a7bb6703268147adbb62f31acbb")
    public
        fun hostedRotationLambda(hostedRotationLambda: CfnRotationSchedule.HostedRotationLambdaProperty.Builder.() -> Unit)

    /**
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window.
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
     */
    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean)

    /**
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window.
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
     */
    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: IResolvable)

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
    public fun rotationLambdaArn(rotationLambdaArn: String)

    /**
     * @param rotationRules A structure that defines the rotation configuration for this secret.
     */
    public fun rotationRules(rotationRules: IResolvable)

    /**
     * @param rotationRules A structure that defines the rotation configuration for this secret.
     */
    public fun rotationRules(rotationRules: CfnRotationSchedule.RotationRulesProperty)

    /**
     * @param rotationRules A structure that defines the rotation configuration for this secret.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d31d4f53800c44d4c988878c5fea3c428f9042adcf58bf52672e481da8dbf438")
    public
        fun rotationRules(rotationRules: CfnRotationSchedule.RotationRulesProperty.Builder.() -> Unit)

    /**
     * @param secretId The ARN or name of the secret to rotate. 
     * To reference a secret also created in this template, use the
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
     * function with the secret's logical ID.
     */
    public fun secretId(secretId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps.Builder =
        software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps.builder()

    /**
     * @param hostedRotationLambda Creates a new Lambda rotation function based on one of the
     * [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
     * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     */
    override fun hostedRotationLambda(hostedRotationLambda: IResolvable) {
      cdkBuilder.hostedRotationLambda(hostedRotationLambda.let(IResolvable::unwrap))
    }

    /**
     * @param hostedRotationLambda Creates a new Lambda rotation function based on one of the
     * [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
     * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     */
    override
        fun hostedRotationLambda(hostedRotationLambda: CfnRotationSchedule.HostedRotationLambdaProperty) {
      cdkBuilder.hostedRotationLambda(hostedRotationLambda.let(CfnRotationSchedule.HostedRotationLambdaProperty::unwrap))
    }

    /**
     * @param hostedRotationLambda Creates a new Lambda rotation function based on one of the
     * [Secrets Manager rotation function
     * templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
     * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
     * For Amazon RDS master user credentials, see [AWS::RDS::DBCluster
     * MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
     * .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fefc0177980977567cd24d7fe070e3c5ef0a0a7bb6703268147adbb62f31acbb")
    override
        fun hostedRotationLambda(hostedRotationLambda: CfnRotationSchedule.HostedRotationLambdaProperty.Builder.() -> Unit):
        Unit =
        hostedRotationLambda(CfnRotationSchedule.HostedRotationLambdaProperty(hostedRotationLambda))

    /**
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window.
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
     */
    override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    /**
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window.
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
     */
    override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: IResolvable) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate.let(IResolvable::unwrap))
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
    override fun rotationLambdaArn(rotationLambdaArn: String) {
      cdkBuilder.rotationLambdaArn(rotationLambdaArn)
    }

    /**
     * @param rotationRules A structure that defines the rotation configuration for this secret.
     */
    override fun rotationRules(rotationRules: IResolvable) {
      cdkBuilder.rotationRules(rotationRules.let(IResolvable::unwrap))
    }

    /**
     * @param rotationRules A structure that defines the rotation configuration for this secret.
     */
    override fun rotationRules(rotationRules: CfnRotationSchedule.RotationRulesProperty) {
      cdkBuilder.rotationRules(rotationRules.let(CfnRotationSchedule.RotationRulesProperty::unwrap))
    }

    /**
     * @param rotationRules A structure that defines the rotation configuration for this secret.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d31d4f53800c44d4c988878c5fea3c428f9042adcf58bf52672e481da8dbf438")
    override
        fun rotationRules(rotationRules: CfnRotationSchedule.RotationRulesProperty.Builder.() -> Unit):
        Unit = rotationRules(CfnRotationSchedule.RotationRulesProperty(rotationRules))

    /**
     * @param secretId The ARN or name of the secret to rotate. 
     * To reference a secret also created in this template, use the
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
     * function with the secret's logical ID.
     */
    override fun secretId(secretId: String) {
      cdkBuilder.secretId(secretId)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps,
  ) : CdkObject(cdkObject), CfnRotationScheduleProps {
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
     */
    override fun hostedRotationLambda(): Any? = unwrap(this).getHostedRotationLambda()

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
     */
    override fun rotateImmediatelyOnUpdate(): Any? = unwrap(this).getRotateImmediatelyOnUpdate()

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
     */
    override fun rotationLambdaArn(): String? = unwrap(this).getRotationLambdaArn()

    /**
     * A structure that defines the rotation configuration for this secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-rotationrules)
     */
    override fun rotationRules(): Any? = unwrap(this).getRotationRules()

    /**
     * The ARN or name of the secret to rotate.
     *
     * To reference a secret also created in this template, use the
     * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
     * function with the secret's logical ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-rotationschedule.html#cfn-secretsmanager-rotationschedule-secretid)
     */
    override fun secretId(): String = unwrap(this).getSecretId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRotationScheduleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps):
        CfnRotationScheduleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRotationScheduleProps):
        software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps
  }
}
