@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.InterfaceVpcEndpoint
import io.cloudshiftdev.awscdk.services.route53.AliasRecordTargetConfig
import io.cloudshiftdev.awscdk.services.route53.IAliasRecordTarget
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import io.cloudshiftdev.awscdk.services.route53.IRecordSet

/**
 * Set an InterfaceVpcEndpoint as a target for an ARecord.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * HostedZone zone;
 * InterfaceVpcEndpoint interfaceVpcEndpoint;
 * ARecord.Builder.create(this, "AliasRecord")
 * .zone(zone)
 * .target(RecordTarget.fromAlias(new InterfaceVpcEndpointTarget(interfaceVpcEndpoint)))
 * .build();
 * ```
 */
public open class InterfaceVpcEndpointTarget(
  cdkObject: software.amazon.awscdk.services.route53.targets.InterfaceVpcEndpointTarget,
) : CdkObject(cdkObject),
    IAliasRecordTarget {
  public constructor(vpcEndpoint: InterfaceVpcEndpoint) :
      this(software.amazon.awscdk.services.route53.targets.InterfaceVpcEndpointTarget(vpcEndpoint.let(InterfaceVpcEndpoint.Companion::unwrap))
  )

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param _zone
   */
  public override fun bind(record: IRecordSet): AliasRecordTargetConfig =
      unwrap(this).bind(record.let(IRecordSet.Companion::unwrap)).let(AliasRecordTargetConfig::wrap)

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param _zone
   */
  public override fun bind(record: IRecordSet, zone: IHostedZone): AliasRecordTargetConfig =
      unwrap(this).bind(record.let(IRecordSet.Companion::unwrap),
      zone.let(IHostedZone.Companion::unwrap)).let(AliasRecordTargetConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.InterfaceVpcEndpointTarget):
        InterfaceVpcEndpointTarget = InterfaceVpcEndpointTarget(cdkObject)

    internal fun unwrap(wrapped: InterfaceVpcEndpointTarget):
        software.amazon.awscdk.services.route53.targets.InterfaceVpcEndpointTarget =
        wrapped.cdkObject as
        software.amazon.awscdk.services.route53.targets.InterfaceVpcEndpointTarget
  }
}
