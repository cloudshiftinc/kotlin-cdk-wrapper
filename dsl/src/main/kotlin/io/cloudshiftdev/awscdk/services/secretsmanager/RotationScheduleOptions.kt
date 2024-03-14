package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Boolean
import kotlin.Unit

public interface RotationScheduleOptions {
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
  public fun automaticallyAfter(): Duration? =
      unwrap(this).getAutomaticallyAfter()?.let(Duration::wrap)

  /**
   * Hosted rotation.
   *
   * Default: - either `rotationLambda` or `hostedRotation` must be specified
   */
  public fun hostedRotation(): HostedRotation? =
      unwrap(this).getHostedRotation()?.let(HostedRotation::wrap)

  /**
   * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
   * window.
   *
   * Default: true
   */
  public fun rotateImmediatelyOnUpdate(): Boolean? = unwrap(this).getRotateImmediatelyOnUpdate()

  /**
   * A Lambda function that can rotate the secret.
   *
   * Default: - either `rotationLambda` or `hostedRotation` must be specified
   */
  public fun rotationLambda(): IFunction? = unwrap(this).getRotationLambda()?.let(IFunction::wrap)

  /**
   * A builder for [RotationScheduleOptions]
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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions.Builder =
        software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions,
  ) : CdkObject(cdkObject), RotationScheduleOptions {
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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RotationScheduleOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions):
        RotationScheduleOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RotationScheduleOptions):
        software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions
  }
}
