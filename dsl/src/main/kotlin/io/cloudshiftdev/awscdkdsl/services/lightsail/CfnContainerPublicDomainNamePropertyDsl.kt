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

package io.cloudshiftdev.awscdkdsl.services.lightsail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lightsail.CfnContainer

/**
 * `PublicDomainName` is a property of the
 * [AWS::Lightsail::Container](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html)
 * resource. It describes the public domain names to use with a container service, such as
 * `example.com` and `www.example.com` . It also describes the certificates to use with a container
 * service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * PublicDomainNameProperty publicDomainNameProperty = PublicDomainNameProperty.builder()
 * .certificateName("certificateName")
 * .domainNames(List.of("domainNames"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicdomainname.html)
 */
@CdkDslMarker
public class CfnContainerPublicDomainNamePropertyDsl {
    private val cdkBuilder: CfnContainer.PublicDomainNameProperty.Builder =
        CfnContainer.PublicDomainNameProperty.builder()

    private val _domainNames: MutableList<String> = mutableListOf()

    /** @param certificateName The name of the certificate for the public domains. */
    public fun certificateName(certificateName: String) {
        cdkBuilder.certificateName(certificateName)
    }

    /** @param domainNames The public domain names to use with the container service. */
    public fun domainNames(vararg domainNames: String) {
        _domainNames.addAll(listOf(*domainNames))
    }

    /** @param domainNames The public domain names to use with the container service. */
    public fun domainNames(domainNames: Collection<String>) {
        _domainNames.addAll(domainNames)
    }

    public fun build(): CfnContainer.PublicDomainNameProperty {
        if (_domainNames.isNotEmpty()) cdkBuilder.domainNames(_domainNames)
        return cdkBuilder.build()
    }
}
