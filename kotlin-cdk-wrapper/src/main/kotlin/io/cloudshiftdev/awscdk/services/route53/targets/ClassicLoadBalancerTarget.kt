@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.route53.AliasRecordTargetConfig
import io.cloudshiftdev.awscdk.services.route53.IAliasRecordTarget
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import io.cloudshiftdev.awscdk.services.route53.IRecordSet

/**
 * Use a classic ELB as an alias record target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancing.*;
 * HostedZone zone;
 * LoadBalancer lb;
 * ARecord.Builder.create(this, "AliasRecord")
 * .zone(zone)
 * .target(RecordTarget.fromAlias(new ClassicLoadBalancerTarget(lb)))
 * .build();
 * ```
 */
public open class ClassicLoadBalancerTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53.targets.ClassicLoadBalancerTarget,
) : CdkObject(cdkObject), IAliasRecordTarget {
  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param _zone
   */
  public override fun bind(_record: IRecordSet): AliasRecordTargetConfig =
      unwrap(this).bind(_record.let(IRecordSet::unwrap)).let(AliasRecordTargetConfig::wrap)

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param _zone
   */
  public override fun bind(_record: IRecordSet, _zone: IHostedZone): AliasRecordTargetConfig =
      unwrap(this).bind(_record.let(IRecordSet::unwrap),
      _zone.let(IHostedZone::unwrap)).let(AliasRecordTargetConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.ClassicLoadBalancerTarget):
        ClassicLoadBalancerTarget = ClassicLoadBalancerTarget(cdkObject)

    internal fun unwrap(wrapped: ClassicLoadBalancerTarget):
        software.amazon.awscdk.services.route53.targets.ClassicLoadBalancerTarget =
        wrapped.cdkObject
  }
}
