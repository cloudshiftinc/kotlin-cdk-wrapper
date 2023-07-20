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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnDomainConfiguration
import software.amazon.awscdk.services.iot.CfnDomainConfigurationProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDomainConfigurationPropsDsl {
    private val cdkBuilder: CfnDomainConfigurationProps.Builder =
        CfnDomainConfigurationProps.builder()

    private val _serverCertificateArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun authorizerConfig(authorizerConfig: IResolvable) {
        cdkBuilder.authorizerConfig(authorizerConfig)
    }

    public fun authorizerConfig(authorizerConfig: CfnDomainConfiguration.AuthorizerConfigProperty) {
        cdkBuilder.authorizerConfig(authorizerConfig)
    }

    public fun domainConfigurationName(domainConfigurationName: String) {
        cdkBuilder.domainConfigurationName(domainConfigurationName)
    }

    public fun domainConfigurationStatus(domainConfigurationStatus: String) {
        cdkBuilder.domainConfigurationStatus(domainConfigurationStatus)
    }

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun serverCertificateArns(vararg serverCertificateArns: String) {
        _serverCertificateArns.addAll(listOf(*serverCertificateArns))
    }

    public fun serverCertificateArns(serverCertificateArns: Collection<String>) {
        _serverCertificateArns.addAll(serverCertificateArns)
    }

    public fun serviceType(serviceType: String) {
        cdkBuilder.serviceType(serviceType)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun tlsConfig(tlsConfig: IResolvable) {
        cdkBuilder.tlsConfig(tlsConfig)
    }

    public fun tlsConfig(tlsConfig: CfnDomainConfiguration.TlsConfigProperty) {
        cdkBuilder.tlsConfig(tlsConfig)
    }

    public fun validationCertificateArn(validationCertificateArn: String) {
        cdkBuilder.validationCertificateArn(validationCertificateArn)
    }

    public fun build(): CfnDomainConfigurationProps {
        if (_serverCertificateArns.isNotEmpty()) cdkBuilder.serverCertificateArns(_serverCertificateArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
