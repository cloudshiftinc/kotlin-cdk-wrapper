@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

/**
 * Type union for a record that accepts multiple types of target.
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
public open class RecordTarget(
  cdkObject: software.amazon.awscdk.services.route53.RecordTarget,
) : CdkObject(cdkObject) {
  /**
   * alias for targets such as CloudFront distribution to route traffic to.
   */
  public open fun aliasTarget(): IAliasRecordTarget? =
      unwrap(this).getAliasTarget()?.let(IAliasRecordTarget::wrap)

  /**
   * correspond with the chosen record type (e.g. for 'A' Type, specify one or more IP addresses).
   */
  public open fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

  public companion object {
    public fun fromAlias(aliasTarget: IAliasRecordTarget): RecordTarget =
        software.amazon.awscdk.services.route53.RecordTarget.fromAlias(aliasTarget.let(IAliasRecordTarget.Companion::unwrap)).let(RecordTarget::wrap)

    public fun fromIpAddresses(ipAddresses: String): RecordTarget =
        software.amazon.awscdk.services.route53.RecordTarget.fromIpAddresses(ipAddresses).let(RecordTarget::wrap)

    public fun fromValues(values: String): RecordTarget =
        software.amazon.awscdk.services.route53.RecordTarget.fromValues(values).let(RecordTarget::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.RecordTarget): RecordTarget
        = RecordTarget(cdkObject)

    internal fun unwrap(wrapped: RecordTarget): software.amazon.awscdk.services.route53.RecordTarget
        = wrapped.cdkObject as software.amazon.awscdk.services.route53.RecordTarget
  }
}
