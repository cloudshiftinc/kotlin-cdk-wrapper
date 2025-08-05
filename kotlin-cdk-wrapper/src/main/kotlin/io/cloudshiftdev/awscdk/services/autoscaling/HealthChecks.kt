@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Health check settings for multiple types.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.MICRO))
 * .machineImage(MachineImage.latestAmazonLinux2())
 * .healthChecks(HealthChecks.ec2(Ec2HealthChecksOptions.builder()
 * .gracePeriod(Duration.seconds(100))
 * .build()))
 * .build();
 * ```
 */
public open class HealthChecks(
  cdkObject: software.amazon.awscdk.services.autoscaling.HealthChecks,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun gracePeriod(): Duration? = unwrap(this).getGracePeriod()?.let(Duration::wrap)

  /**
   *
   */
  public open fun types(): List<String> = unwrap(this).getTypes()

  public companion object {
    public fun ec2(): HealthChecks =
        software.amazon.awscdk.services.autoscaling.HealthChecks.ec2().let(HealthChecks::wrap)

    public fun ec2(options: Ec2HealthChecksOptions): HealthChecks =
        software.amazon.awscdk.services.autoscaling.HealthChecks.ec2(options.let(Ec2HealthChecksOptions.Companion::unwrap)).let(HealthChecks::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ce66deeca41bf8329ac195052d38ba48def8f9eb3b33d299e5aa97283355b94")
    public fun ec2(options: Ec2HealthChecksOptions.Builder.() -> Unit): HealthChecks =
        ec2(Ec2HealthChecksOptions(options))

    public fun withAdditionalChecks(options: AdditionalHealthChecksOptions): HealthChecks =
        software.amazon.awscdk.services.autoscaling.HealthChecks.withAdditionalChecks(options.let(AdditionalHealthChecksOptions.Companion::unwrap)).let(HealthChecks::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e9dbd8a86a441ca5d7ed495aa90f68643256b532e48a20ae4da87d847ad0cc6")
    public fun withAdditionalChecks(options: AdditionalHealthChecksOptions.Builder.() -> Unit):
        HealthChecks = withAdditionalChecks(AdditionalHealthChecksOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.HealthChecks):
        HealthChecks = HealthChecks(cdkObject)

    internal fun unwrap(wrapped: HealthChecks):
        software.amazon.awscdk.services.autoscaling.HealthChecks = wrapped.cdkObject as
        software.amazon.awscdk.services.autoscaling.HealthChecks
  }
}
