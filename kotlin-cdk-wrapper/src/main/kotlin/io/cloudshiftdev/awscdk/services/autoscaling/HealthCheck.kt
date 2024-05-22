@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Health check settings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * HealthCheck healthCheck = HealthCheck.ec2(Ec2HealthCheckOptions.builder()
 * .grace(Duration.minutes(30))
 * .build());
 * ```
 */
public open class HealthCheck(
  cdkObject: software.amazon.awscdk.services.autoscaling.HealthCheck,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun gracePeriod(): Duration? = unwrap(this).getGracePeriod()?.let(Duration::wrap)

  /**
   *
   */
  public open fun type(): String = unwrap(this).getType()

  public companion object {
    public fun ec2(): HealthCheck =
        software.amazon.awscdk.services.autoscaling.HealthCheck.ec2().let(HealthCheck::wrap)

    public fun ec2(options: Ec2HealthCheckOptions): HealthCheck =
        software.amazon.awscdk.services.autoscaling.HealthCheck.ec2(options.let(Ec2HealthCheckOptions.Companion::unwrap)).let(HealthCheck::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54c9b602a97c6a292e4db6e2877a5d704f1d7da99447038738708c63395f8b8f")
    public fun ec2(options: Ec2HealthCheckOptions.Builder.() -> Unit): HealthCheck =
        ec2(Ec2HealthCheckOptions(options))

    public fun elb(options: ElbHealthCheckOptions): HealthCheck =
        software.amazon.awscdk.services.autoscaling.HealthCheck.elb(options.let(ElbHealthCheckOptions.Companion::unwrap)).let(HealthCheck::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("556e456de2ad17d0ccbb8ab5ed1e8ac5ce2c6d126423e9ce8c6be8cf072b21f1")
    public fun elb(options: ElbHealthCheckOptions.Builder.() -> Unit): HealthCheck =
        elb(ElbHealthCheckOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.HealthCheck):
        HealthCheck = HealthCheck(cdkObject)

    internal fun unwrap(wrapped: HealthCheck):
        software.amazon.awscdk.services.autoscaling.HealthCheck = wrapped.cdkObject as
        software.amazon.awscdk.services.autoscaling.HealthCheck
  }
}
