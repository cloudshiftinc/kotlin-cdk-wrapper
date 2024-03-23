@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.route53.AliasRecordTargetConfig
import io.cloudshiftdev.awscdk.services.route53.IAliasRecordTarget
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import io.cloudshiftdev.awscdk.services.route53.IRecordSet
import kotlin.String

/**
 * Use a Global Accelerator domain name as an alias record target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.targets.*;
 * GlobalAcceleratorDomainTarget globalAcceleratorDomainTarget = new
 * GlobalAcceleratorDomainTarget("acceleratorDomainName");
 * ```
 */
public open class GlobalAcceleratorDomainTarget(
  cdkObject: software.amazon.awscdk.services.route53.targets.GlobalAcceleratorDomainTarget,
) : CdkObject(cdkObject), IAliasRecordTarget {
  public constructor(acceleratorDomainName: String) :
      this(software.amazon.awscdk.services.route53.targets.GlobalAcceleratorDomainTarget(acceleratorDomainName)
  )

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param _zone
   */
  public override fun bind(record: IRecordSet): AliasRecordTargetConfig =
      unwrap(this).bind(record.let(IRecordSet::unwrap)).let(AliasRecordTargetConfig::wrap)

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param _zone
   */
  public override fun bind(record: IRecordSet, zone: IHostedZone): AliasRecordTargetConfig =
      unwrap(this).bind(record.let(IRecordSet::unwrap),
      zone.let(IHostedZone::unwrap)).let(AliasRecordTargetConfig::wrap)

  public companion object {
    public val GLOBAL_ACCELERATOR_ZONE_ID: String =
        software.amazon.awscdk.services.route53.targets.GlobalAcceleratorDomainTarget.GLOBAL_ACCELERATOR_ZONE_ID

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.GlobalAcceleratorDomainTarget):
        GlobalAcceleratorDomainTarget = GlobalAcceleratorDomainTarget(cdkObject)

    internal fun unwrap(wrapped: GlobalAcceleratorDomainTarget):
        software.amazon.awscdk.services.route53.targets.GlobalAcceleratorDomainTarget =
        wrapped.cdkObject as
        software.amazon.awscdk.services.route53.targets.GlobalAcceleratorDomainTarget
  }
}
