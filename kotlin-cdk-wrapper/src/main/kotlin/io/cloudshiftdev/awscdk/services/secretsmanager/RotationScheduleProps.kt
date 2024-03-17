@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Boolean
import kotlin.Unit

/**
 * Construction properties for a RotationSchedule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
 * Function function_;
 * HostedRotation hostedRotation;
 * Secret secret;
 * RotationScheduleProps rotationScheduleProps = RotationScheduleProps.builder()
 * .secret(secret)
 * // the properties below are optional
 * .automaticallyAfter(Duration.minutes(30))
 * .hostedRotation(hostedRotation)
 * .rotateImmediatelyOnUpdate(false)
 * .rotationLambda(function_)
 * .build();
 * ```
 */
public interface RotationScheduleProps : RotationScheduleOptions {
  /**
   * The secret to rotate.
   *
   * If hosted rotation is used, this must be a JSON string with the following format:
   *
   * ```
   * {
   * "engine": &lt;required: database engine&gt;,
   * "host": &lt;required: instance host name&gt;,
   * "username": &lt;required: username&gt;,
   * "password": &lt;required: password&gt;,
   * "dbname": &lt;optional: database name&gt;,
   * "port": &lt;optional: if not specified, default port will be used&gt;,
   * "masterarn": &lt;required for multi user rotation: the arn of the master secret which will be
   * used to create users/change passwords&gt;
   * }
   * ```
   *
   * This is typically the case for a secret referenced from an
   * `AWS::SecretsManager::SecretTargetAttachment`
   * or an `ISecret` returned by the `attach()` method of `Secret`.
   */
  public fun secret(): ISecret

  /**
   * A builder for [RotationScheduleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param automaticallyAfter Specifies the number of days after the previous rotation before
     * Secrets Manager triggers the next automatic rotation.
     * The minimum value is 4 hours.
     * The maximum value is 1000 days.
     *
     * A value of zero (`Duration.days(0)`) will not create RotationRules.
     */
    public fun automaticallyAfter(automaticallyAfter: Duration)

    /**
     * @param hostedRotation Hosted rotation.
     */
    public fun hostedRotation(hostedRotation: HostedRotation)

    /**
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window.
     */
    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean)

    /**
     * @param rotationLambda A Lambda function that can rotate the secret.
     */
    public fun rotationLambda(rotationLambda: IFunction)

    /**
     * @param secret The secret to rotate. 
     * If hosted rotation is used, this must be a JSON string with the following format:
     *
     * ```
     * {
     * "engine": &lt;required: database engine&gt;,
     * "host": &lt;required: instance host name&gt;,
     * "username": &lt;required: username&gt;,
     * "password": &lt;required: password&gt;,
     * "dbname": &lt;optional: database name&gt;,
     * "port": &lt;optional: if not specified, default port will be used&gt;,
     * "masterarn": &lt;required for multi user rotation: the arn of the master secret which will be
     * used to create users/change passwords&gt;
     * }
     * ```
     *
     * This is typically the case for a secret referenced from an
     * `AWS::SecretsManager::SecretTargetAttachment`
     * or an `ISecret` returned by the `attach()` method of `Secret`.
     */
    public fun secret(secret: ISecret)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.RotationScheduleProps.Builder =
        software.amazon.awscdk.services.secretsmanager.RotationScheduleProps.builder()

    /**
     * @param automaticallyAfter Specifies the number of days after the previous rotation before
     * Secrets Manager triggers the next automatic rotation.
     * The minimum value is 4 hours.
     * The maximum value is 1000 days.
     *
     * A value of zero (`Duration.days(0)`) will not create RotationRules.
     */
    override fun automaticallyAfter(automaticallyAfter: Duration) {
      cdkBuilder.automaticallyAfter(automaticallyAfter.let(Duration::unwrap))
    }

    /**
     * @param hostedRotation Hosted rotation.
     */
    override fun hostedRotation(hostedRotation: HostedRotation) {
      cdkBuilder.hostedRotation(hostedRotation.let(HostedRotation::unwrap))
    }

    /**
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window.
     */
    override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    /**
     * @param rotationLambda A Lambda function that can rotate the secret.
     */
    override fun rotationLambda(rotationLambda: IFunction) {
      cdkBuilder.rotationLambda(rotationLambda.let(IFunction::unwrap))
    }

    /**
     * @param secret The secret to rotate. 
     * If hosted rotation is used, this must be a JSON string with the following format:
     *
     * ```
     * {
     * "engine": &lt;required: database engine&gt;,
     * "host": &lt;required: instance host name&gt;,
     * "username": &lt;required: username&gt;,
     * "password": &lt;required: password&gt;,
     * "dbname": &lt;optional: database name&gt;,
     * "port": &lt;optional: if not specified, default port will be used&gt;,
     * "masterarn": &lt;required for multi user rotation: the arn of the master secret which will be
     * used to create users/change passwords&gt;
     * }
     * ```
     *
     * This is typically the case for a secret referenced from an
     * `AWS::SecretsManager::SecretTargetAttachment`
     * or an `ISecret` returned by the `attach()` method of `Secret`.
     */
    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.RotationScheduleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.RotationScheduleProps,
  ) : CdkObject(cdkObject), RotationScheduleProps {
    /**
     * Specifies the number of days after the previous rotation before Secrets Manager triggers the
     * next automatic rotation.
     *
     * The minimum value is 4 hours.
     * The maximum value is 1000 days.
     *
     * A value of zero (`Duration.days(0)`) will not create RotationRules.
     *
     * Default: Duration.days(30)
     */
    override fun automaticallyAfter(): Duration? =
        unwrap(this).getAutomaticallyAfter()?.let(Duration::wrap)

    /**
     * Hosted rotation.
     *
     * Default: - either `rotationLambda` or `hostedRotation` must be specified
     */
    override fun hostedRotation(): HostedRotation? =
        unwrap(this).getHostedRotation()?.let(HostedRotation::wrap)

    /**
     * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
     * window.
     *
     * Default: true
     */
    override fun rotateImmediatelyOnUpdate(): Boolean? = unwrap(this).getRotateImmediatelyOnUpdate()

    /**
     * A Lambda function that can rotate the secret.
     *
     * Default: - either `rotationLambda` or `hostedRotation` must be specified
     */
    override fun rotationLambda(): IFunction? =
        unwrap(this).getRotationLambda()?.let(IFunction::wrap)

    /**
     * The secret to rotate.
     *
     * If hosted rotation is used, this must be a JSON string with the following format:
     *
     * ```
     * {
     * "engine": &lt;required: database engine&gt;,
     * "host": &lt;required: instance host name&gt;,
     * "username": &lt;required: username&gt;,
     * "password": &lt;required: password&gt;,
     * "dbname": &lt;optional: database name&gt;,
     * "port": &lt;optional: if not specified, default port will be used&gt;,
     * "masterarn": &lt;required for multi user rotation: the arn of the master secret which will be
     * used to create users/change passwords&gt;
     * }
     * ```
     *
     * This is typically the case for a secret referenced from an
     * `AWS::SecretsManager::SecretTargetAttachment`
     * or an `ISecret` returned by the `attach()` method of `Secret`.
     */
    override fun secret(): ISecret = unwrap(this).getSecret().let(ISecret::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RotationScheduleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.RotationScheduleProps):
        RotationScheduleProps = CdkObjectWrappers.wrap(cdkObject) as? RotationScheduleProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RotationScheduleProps):
        software.amazon.awscdk.services.secretsmanager.RotationScheduleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.secretsmanager.RotationScheduleProps
  }
}
