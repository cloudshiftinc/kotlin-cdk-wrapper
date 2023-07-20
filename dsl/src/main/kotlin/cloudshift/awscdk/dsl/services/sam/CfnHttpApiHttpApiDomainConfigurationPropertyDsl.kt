@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnHttpApi
import kotlin.String

@CdkDslMarker
public class CfnHttpApiHttpApiDomainConfigurationPropertyDsl {
    private val cdkBuilder: CfnHttpApi.HttpApiDomainConfigurationProperty.Builder =
        CfnHttpApi.HttpApiDomainConfigurationProperty.builder()

    public fun basePath(basePath: String) {
        cdkBuilder.basePath(basePath)
    }

    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun endpointConfiguration(endpointConfiguration: String) {
        cdkBuilder.endpointConfiguration(endpointConfiguration)
    }

    public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
        cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
    }

    public fun mutualTlsAuthentication(mutualTlsAuthentication: CfnHttpApi.MutualTlsAuthenticationProperty) {
        cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
    }

    public fun route53(route53: IResolvable) {
        cdkBuilder.route53(route53)
    }

    public fun route53(route53: CfnHttpApi.Route53ConfigurationProperty) {
        cdkBuilder.route53(route53)
    }

    public fun securityPolicy(securityPolicy: String) {
        cdkBuilder.securityPolicy(securityPolicy)
    }

    public fun build(): CfnHttpApi.HttpApiDomainConfigurationProperty = cdkBuilder.build()
}
