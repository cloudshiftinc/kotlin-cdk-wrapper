@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.route53.AliasRecordTargetConfig
import io.cloudshiftdev.awscdk.services.route53.IAliasRecordTarget
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import io.cloudshiftdev.awscdk.services.route53.IRecordSet

/**
 * Use another Route 53 record as an alias record target.
 *
 * Example:
 *
 * ```
 * HostedZone zone;
 * ARecord record;
 * ARecord.Builder.create(this, "AliasRecord")
 * .zone(zone)
 * .target(RecordTarget.fromAlias(new Route53RecordTarget(record)))
 * .build();
 * ```
 */
public open class Route53RecordTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53.targets.Route53RecordTarget,
) : CdkObject(cdkObject), IAliasRecordTarget {
  public constructor(record: IRecordSet) :
      this(software.amazon.awscdk.services.route53.targets.Route53RecordTarget(record.let(IRecordSet::unwrap))
  )

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param zone
   */
  public override fun bind(record: IRecordSet): AliasRecordTargetConfig =
      unwrap(this).bind(record.let(IRecordSet::unwrap)).let(AliasRecordTargetConfig::wrap)

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param zone
   */
  public override fun bind(record: IRecordSet, zone: IHostedZone): AliasRecordTargetConfig =
      unwrap(this).bind(record.let(IRecordSet::unwrap),
      zone.let(IHostedZone::unwrap)).let(AliasRecordTargetConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.Route53RecordTarget):
        Route53RecordTarget = Route53RecordTarget(cdkObject)

    internal fun unwrap(wrapped: Route53RecordTarget):
        software.amazon.awscdk.services.route53.targets.Route53RecordTarget = wrapped.cdkObject
  }
}
