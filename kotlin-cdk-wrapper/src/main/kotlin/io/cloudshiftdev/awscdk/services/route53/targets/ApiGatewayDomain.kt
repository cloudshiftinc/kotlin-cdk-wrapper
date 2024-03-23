@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.apigateway.IDomainName
import io.cloudshiftdev.awscdk.services.route53.AliasRecordTargetConfig
import io.cloudshiftdev.awscdk.services.route53.IAliasRecordTarget
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import io.cloudshiftdev.awscdk.services.route53.IRecordSet

/**
 * Defines an API Gateway domain name as the alias target.
 *
 * Use the `ApiGateway` class if you wish to map the alias to an REST API with a
 * domain name defined through the `RestApiProps.domainName` prop.
 *
 * Example:
 *
 * ```
 * Object hostedZoneForExampleCom;
 * DomainName domainName;
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * import io.cloudshiftdev.awscdk.services.route53.targets.*;
 * ARecord.Builder.create(this, "CustomDomainAliasRecord")
 * .zone(hostedZoneForExampleCom)
 * .target(RecordTarget.fromAlias(new ApiGatewayDomain(domainName)))
 * .build();
 * ```
 */
public open class ApiGatewayDomain(
  cdkObject: software.amazon.awscdk.services.route53.targets.ApiGatewayDomain,
) : CdkObject(cdkObject), IAliasRecordTarget {
  public constructor(domainName: IDomainName) :
      this(software.amazon.awscdk.services.route53.targets.ApiGatewayDomain(domainName.let(IDomainName::unwrap))
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
    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.ApiGatewayDomain):
        ApiGatewayDomain = ApiGatewayDomain(cdkObject)

    internal fun unwrap(wrapped: ApiGatewayDomain):
        software.amazon.awscdk.services.route53.targets.ApiGatewayDomain = wrapped.cdkObject as
        software.amazon.awscdk.services.route53.targets.ApiGatewayDomain
  }
}
