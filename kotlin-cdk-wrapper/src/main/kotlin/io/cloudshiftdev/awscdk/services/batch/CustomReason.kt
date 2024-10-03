@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The corresponding Action will only be taken if *all* of the conditions specified here are met.
 *
 * Example:
 *
 * ```
 * EcsJobDefinition jobDefn = EcsJobDefinition.Builder.create(this, "JobDefn")
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
 * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
 * .memory(Size.mebibytes(2048))
 * .cpu(256)
 * .build())
 * .retryAttempts(5)
 * .retryStrategies(List.of(RetryStrategy.of(Action.EXIT, Reason.CANNOT_PULL_CONTAINER)))
 * .build();
 * jobDefn.addRetryStrategy(RetryStrategy.of(Action.EXIT, Reason.SPOT_INSTANCE_RECLAIMED));
 * jobDefn.addRetryStrategy(RetryStrategy.of(Action.EXIT, Reason.CANNOT_PULL_CONTAINER));
 * jobDefn.addRetryStrategy(RetryStrategy.of(Action.EXIT, Reason.custom(CustomReason.builder()
 * .onExitCode("40*")
 * .onReason("some reason")
 * .build())));
 * ```
 */
public interface CustomReason {
  /**
   * A glob string that will match on the job exit code.
   *
   * For example, `'40*'` will match 400, 404, 40123456789012
   *
   * Default: - will not match on the exit code
   */
  public fun onExitCode(): String? = unwrap(this).getOnExitCode()

  /**
   * A glob string that will match on the reason returned by the exiting job For example,
   * `'CannotPullContainerError*'` indicates that container needed to start the job could not be
   * pulled.
   *
   * Default: - will not match on the reason
   */
  public fun onReason(): String? = unwrap(this).getOnReason()

  /**
   * A glob string that will match on the statusReason returned by the exiting job.
   *
   * For example, `'Host EC2*'` indicates that the spot instance has been reclaimed.
   *
   * Default: - will not match on the status reason
   */
  public fun onStatusReason(): String? = unwrap(this).getOnStatusReason()

  /**
   * A builder for [CustomReason]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param onExitCode A glob string that will match on the job exit code.
     * For example, `'40*'` will match 400, 404, 40123456789012
     */
    public fun onExitCode(onExitCode: String)

    /**
     * @param onReason A glob string that will match on the reason returned by the exiting job For
     * example, `'CannotPullContainerError*'` indicates that container needed to start the job could
     * not be pulled.
     */
    public fun onReason(onReason: String)

    /**
     * @param onStatusReason A glob string that will match on the statusReason returned by the
     * exiting job.
     * For example, `'Host EC2*'` indicates that the spot instance has been reclaimed.
     */
    public fun onStatusReason(onStatusReason: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CustomReason.Builder =
        software.amazon.awscdk.services.batch.CustomReason.builder()

    /**
     * @param onExitCode A glob string that will match on the job exit code.
     * For example, `'40*'` will match 400, 404, 40123456789012
     */
    override fun onExitCode(onExitCode: String) {
      cdkBuilder.onExitCode(onExitCode)
    }

    /**
     * @param onReason A glob string that will match on the reason returned by the exiting job For
     * example, `'CannotPullContainerError*'` indicates that container needed to start the job could
     * not be pulled.
     */
    override fun onReason(onReason: String) {
      cdkBuilder.onReason(onReason)
    }

    /**
     * @param onStatusReason A glob string that will match on the statusReason returned by the
     * exiting job.
     * For example, `'Host EC2*'` indicates that the spot instance has been reclaimed.
     */
    override fun onStatusReason(onStatusReason: String) {
      cdkBuilder.onStatusReason(onStatusReason)
    }

    public fun build(): software.amazon.awscdk.services.batch.CustomReason = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.CustomReason,
  ) : CdkObject(cdkObject),
      CustomReason {
    /**
     * A glob string that will match on the job exit code.
     *
     * For example, `'40*'` will match 400, 404, 40123456789012
     *
     * Default: - will not match on the exit code
     */
    override fun onExitCode(): String? = unwrap(this).getOnExitCode()

    /**
     * A glob string that will match on the reason returned by the exiting job For example,
     * `'CannotPullContainerError*'` indicates that container needed to start the job could not be
     * pulled.
     *
     * Default: - will not match on the reason
     */
    override fun onReason(): String? = unwrap(this).getOnReason()

    /**
     * A glob string that will match on the statusReason returned by the exiting job.
     *
     * For example, `'Host EC2*'` indicates that the spot instance has been reclaimed.
     *
     * Default: - will not match on the status reason
     */
    override fun onStatusReason(): String? = unwrap(this).getOnStatusReason()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomReason {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CustomReason): CustomReason =
        CdkObjectWrappers.wrap(cdkObject) as? CustomReason ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomReason): software.amazon.awscdk.services.batch.CustomReason =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.batch.CustomReason
  }
}
