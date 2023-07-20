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
import software.amazon.awscdk.services.appstream.CfnDirectoryConfig
import kotlin.String

@CdkDslMarker
public class CfnDirectoryConfigCertificateBasedAuthPropertiesPropertyDsl {
    private val cdkBuilder: CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty.Builder =
        CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty.builder()

    public fun certificateAuthorityArn(certificateAuthorityArn: String) {
        cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty = cdkBuilder.build()
}
