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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.DomainOptions
import software.amazon.awscdk.services.certificatemanager.ICertificate
import kotlin.String

@CdkDslMarker
public class DomainOptionsDsl {
    private val cdkBuilder: DomainOptions.Builder = DomainOptions.builder()

    public fun certificate(certificate: ICertificate) {
        cdkBuilder.certificate(certificate)
    }

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun build(): DomainOptions = cdkBuilder.build()
}
