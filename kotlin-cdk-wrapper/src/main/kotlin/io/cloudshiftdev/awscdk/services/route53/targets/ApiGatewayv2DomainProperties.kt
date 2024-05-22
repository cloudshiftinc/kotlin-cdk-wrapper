@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.route53.AliasRecordTargetConfig
import io.cloudshiftdev.awscdk.services.route53.IAliasRecordTarget
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import io.cloudshiftdev.awscdk.services.route53.IRecordSet
import kotlin.String

/**
 * Defines an API Gateway V2 domain name as the alias target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * HostedZone zone;
 * DomainName domainName;
 * ARecord.Builder.create(this, "AliasRecord")
 * .zone(zone)
 * .target(RecordTarget.fromAlias(new
 * ApiGatewayv2DomainProperties(domainName.getRegionalDomainName(),
 * domainName.getRegionalHostedZoneId())))
 * .build();
 * ```
 */
public open class ApiGatewayv2DomainProperties(
  cdkObject: software.amazon.awscdk.services.route53.targets.ApiGatewayv2DomainProperties,
) : CdkObject(cdkObject), IAliasRecordTarget {
  public constructor(regionalDomainName: String, regionalHostedZoneId: String) :
      this(software.amazon.awscdk.services.route53.targets.ApiGatewayv2DomainProperties(regionalDomainName,
      regionalHostedZoneId)
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
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.ApiGatewayv2DomainProperties):
        ApiGatewayv2DomainProperties = ApiGatewayv2DomainProperties(cdkObject)

    internal fun unwrap(wrapped: ApiGatewayv2DomainProperties):
        software.amazon.awscdk.services.route53.targets.ApiGatewayv2DomainProperties =
        wrapped.cdkObject as
        software.amazon.awscdk.services.route53.targets.ApiGatewayv2DomainProperties
  }
}
