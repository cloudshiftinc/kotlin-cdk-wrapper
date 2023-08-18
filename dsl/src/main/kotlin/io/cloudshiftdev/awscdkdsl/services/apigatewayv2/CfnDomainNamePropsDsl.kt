@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnDomainName
import software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps

/**
 * Properties for defining a `CfnDomainName`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * Object tags;
 * CfnDomainNameProps cfnDomainNameProps = CfnDomainNameProps.builder()
 * .domainName("domainName")
 * // the properties below are optional
 * .domainNameConfigurations(List.of(DomainNameConfigurationProperty.builder()
 * .certificateArn("certificateArn")
 * .certificateName("certificateName")
 * .endpointType("endpointType")
 * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
 * .securityPolicy("securityPolicy")
 * .build()))
 * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
 * .truststoreUri("truststoreUri")
 * .truststoreVersion("truststoreVersion")
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html)
 */
@CdkDslMarker
public class CfnDomainNamePropsDsl {
    private val cdkBuilder: CfnDomainNameProps.Builder = CfnDomainNameProps.builder()

    private val _domainNameConfigurations: MutableList<Any> = mutableListOf()

    /**
     * @param domainName The custom domain name for your API in Amazon API Gateway. Uppercase
     *   letters are not supported.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /** @param domainNameConfigurations The domain name configurations. */
    public fun domainNameConfigurations(vararg domainNameConfigurations: Any) {
        _domainNameConfigurations.addAll(listOf(*domainNameConfigurations))
    }

    /** @param domainNameConfigurations The domain name configurations. */
    public fun domainNameConfigurations(domainNameConfigurations: Collection<Any>) {
        _domainNameConfigurations.addAll(domainNameConfigurations)
    }

    /** @param domainNameConfigurations The domain name configurations. */
    public fun domainNameConfigurations(domainNameConfigurations: IResolvable) {
        cdkBuilder.domainNameConfigurations(domainNameConfigurations)
    }

    /**
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     *   domain name.
     */
    public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
        cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
    }

    /**
     * @param mutualTlsAuthentication The mutual TLS authentication configuration for a custom
     *   domain name.
     */
    public fun mutualTlsAuthentication(
        mutualTlsAuthentication: CfnDomainName.MutualTlsAuthenticationProperty
    ) {
        cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
    }

    /** @param tags The collection of tags associated with a domain name. */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /** @param tags The collection of tags associated with a domain name. */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnDomainNameProps {
        if (_domainNameConfigurations.isNotEmpty())
            cdkBuilder.domainNameConfigurations(_domainNameConfigurations)
        return cdkBuilder.build()
    }
}
