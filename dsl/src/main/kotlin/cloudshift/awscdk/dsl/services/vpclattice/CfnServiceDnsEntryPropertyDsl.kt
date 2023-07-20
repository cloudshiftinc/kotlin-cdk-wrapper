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

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.vpclattice.CfnService
import kotlin.String

@CdkDslMarker
public class CfnServiceDnsEntryPropertyDsl {
    private val cdkBuilder: CfnService.DnsEntryProperty.Builder =
        CfnService.DnsEntryProperty.builder()

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun build(): CfnService.DnsEntryProperty = cdkBuilder.build()
}
