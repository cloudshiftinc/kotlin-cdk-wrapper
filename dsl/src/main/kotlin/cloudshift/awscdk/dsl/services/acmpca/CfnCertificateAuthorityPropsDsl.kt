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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCertificateAuthorityPropsDsl {
    private val cdkBuilder: CfnCertificateAuthorityProps.Builder =
        CfnCertificateAuthorityProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun csrExtensions(csrExtensions: IResolvable) {
        cdkBuilder.csrExtensions(csrExtensions)
    }

    public fun csrExtensions(csrExtensions: CfnCertificateAuthority.CsrExtensionsProperty) {
        cdkBuilder.csrExtensions(csrExtensions)
    }

    public fun keyAlgorithm(keyAlgorithm: String) {
        cdkBuilder.keyAlgorithm(keyAlgorithm)
    }

    public fun keyStorageSecurityStandard(keyStorageSecurityStandard: String) {
        cdkBuilder.keyStorageSecurityStandard(keyStorageSecurityStandard)
    }

    public fun revocationConfiguration(revocationConfiguration: IResolvable) {
        cdkBuilder.revocationConfiguration(revocationConfiguration)
    }

    public fun revocationConfiguration(revocationConfiguration: CfnCertificateAuthority.RevocationConfigurationProperty) {
        cdkBuilder.revocationConfiguration(revocationConfiguration)
    }

    public fun signingAlgorithm(signingAlgorithm: String) {
        cdkBuilder.signingAlgorithm(signingAlgorithm)
    }

    public fun subject(subject: IResolvable) {
        cdkBuilder.subject(subject)
    }

    public fun subject(subject: CfnCertificateAuthority.SubjectProperty) {
        cdkBuilder.subject(subject)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun usageMode(usageMode: String) {
        cdkBuilder.usageMode(usageMode)
    }

    public fun build(): CfnCertificateAuthorityProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
