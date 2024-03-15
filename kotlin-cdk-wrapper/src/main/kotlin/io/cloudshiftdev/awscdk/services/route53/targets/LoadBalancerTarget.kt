@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2
import io.cloudshiftdev.awscdk.services.route53.AliasRecordTargetConfig
import io.cloudshiftdev.awscdk.services.route53.IAliasRecordTarget
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import io.cloudshiftdev.awscdk.services.route53.IRecordSet

/**
 * Use an ELBv2 as an alias record target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * HostedZone zone;
 * ApplicationLoadBalancer lb;
 * ARecord.Builder.create(this, "AliasRecord")
 * .zone(zone)
 * .target(RecordTarget.fromAlias(new LoadBalancerTarget(lb)))
 * .build();
 * ```
 */
public open class LoadBalancerTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53.targets.LoadBalancerTarget,
) : CdkObject(cdkObject), IAliasRecordTarget {
  public constructor(loadBalancer: ILoadBalancerV2) :
      this(software.amazon.awscdk.services.route53.targets.LoadBalancerTarget(ILoadBalancerV2.unwrap(loadBalancer)))

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
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.LoadBalancerTarget):
        LoadBalancerTarget = LoadBalancerTarget(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerTarget):
        software.amazon.awscdk.services.route53.targets.LoadBalancerTarget = wrapped.cdkObject
  }
}
