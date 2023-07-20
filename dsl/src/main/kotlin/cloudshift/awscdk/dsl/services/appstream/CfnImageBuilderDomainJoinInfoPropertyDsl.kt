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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appstream.CfnImageBuilder
import kotlin.String

@CdkDslMarker
public class CfnImageBuilderDomainJoinInfoPropertyDsl {
    private val cdkBuilder: CfnImageBuilder.DomainJoinInfoProperty.Builder =
        CfnImageBuilder.DomainJoinInfoProperty.builder()

    public fun directoryName(directoryName: String) {
        cdkBuilder.directoryName(directoryName)
    }

    public fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String) {
        cdkBuilder.organizationalUnitDistinguishedName(organizationalUnitDistinguishedName)
    }

    public fun build(): CfnImageBuilder.DomainJoinInfoProperty = cdkBuilder.build()
}
