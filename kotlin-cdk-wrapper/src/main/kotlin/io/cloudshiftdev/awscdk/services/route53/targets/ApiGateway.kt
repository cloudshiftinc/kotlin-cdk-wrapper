@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.services.apigateway.RestApiBase

/**
 * Defines an API Gateway REST API as the alias target. Requires that the domain name will be
 * defined through `RestApiProps.domainName`.
 *
 * You can direct the alias to any `apigateway.DomainName` resource through the
 * `ApiGatewayDomain` class.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * import io.cloudshiftdev.awscdk.services.route53.targets.*;
 * RestApi api;
 * Object hostedZoneForExampleCom;
 * ARecord.Builder.create(this, "CustomDomainAliasRecord")
 * .zone(hostedZoneForExampleCom)
 * .target(RecordTarget.fromAlias(new ApiGateway(api)))
 * .build();
 * ```
 */
public open class ApiGateway internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.route53.targets.ApiGateway,
) : ApiGatewayDomain(cdkObject) {
  public constructor(api: RestApiBase) :
      this(software.amazon.awscdk.services.route53.targets.ApiGateway(RestApiBase.unwrap(api)))

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.ApiGateway):
        ApiGateway = ApiGateway(cdkObject)

    internal fun unwrap(wrapped: ApiGateway):
        software.amazon.awscdk.services.route53.targets.ApiGateway = wrapped.cdkObject
  }
}
