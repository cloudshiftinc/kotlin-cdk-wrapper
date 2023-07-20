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

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnCertificateAuthorityCrlConfigurationPropertyDsl {
    private val cdkBuilder: CfnCertificateAuthority.CrlConfigurationProperty.Builder =
        CfnCertificateAuthority.CrlConfigurationProperty.builder()

    public fun customCname(customCname: String) {
        cdkBuilder.customCname(customCname)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun expirationInDays(expirationInDays: Number) {
        cdkBuilder.expirationInDays(expirationInDays)
    }

    public fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
    }

    public fun s3ObjectAcl(s3ObjectAcl: String) {
        cdkBuilder.s3ObjectAcl(s3ObjectAcl)
    }

    public fun build(): CfnCertificateAuthority.CrlConfigurationProperty = cdkBuilder.build()
}
