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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lightsail.CfnContainer
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnContainerPublicDomainNamePropertyDsl {
    private val cdkBuilder: CfnContainer.PublicDomainNameProperty.Builder =
        CfnContainer.PublicDomainNameProperty.builder()

    private val _domainNames: MutableList<String> = mutableListOf()

    public fun certificateName(certificateName: String) {
        cdkBuilder.certificateName(certificateName)
    }

    public fun domainNames(vararg domainNames: String) {
        _domainNames.addAll(listOf(*domainNames))
    }

    public fun domainNames(domainNames: Collection<String>) {
        _domainNames.addAll(domainNames)
    }

    public fun build(): CfnContainer.PublicDomainNameProperty {
        if (_domainNames.isNotEmpty()) cdkBuilder.domainNames(_domainNames)
        return cdkBuilder.build()
    }
}
