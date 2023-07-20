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
import software.amazon.awscdk.services.sam.CfnApi
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApiDomainConfigurationPropertyDsl {
    private val cdkBuilder: CfnApi.DomainConfigurationProperty.Builder =
        CfnApi.DomainConfigurationProperty.builder()

    private val _basePath: MutableList<String> = mutableListOf()

    public fun basePath(vararg basePath: String) {
        _basePath.addAll(listOf(*basePath))
    }

    public fun basePath(basePath: Collection<String>) {
        _basePath.addAll(basePath)
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

    public fun mutualTlsAuthentication(mutualTlsAuthentication: CfnApi.MutualTlsAuthenticationProperty) {
        cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
    }

    public fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String) {
        cdkBuilder.ownershipVerificationCertificateArn(ownershipVerificationCertificateArn)
    }

    public fun route53(route53: IResolvable) {
        cdkBuilder.route53(route53)
    }

    public fun route53(route53: CfnApi.Route53ConfigurationProperty) {
        cdkBuilder.route53(route53)
    }

    public fun securityPolicy(securityPolicy: String) {
        cdkBuilder.securityPolicy(securityPolicy)
    }

    public fun build(): CfnApi.DomainConfigurationProperty {
        if (_basePath.isNotEmpty()) cdkBuilder.basePath(_basePath)
        return cdkBuilder.build()
    }
}
