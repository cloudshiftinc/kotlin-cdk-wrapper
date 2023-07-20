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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDomainSAMLOptionsPropertyDsl {
    private val cdkBuilder: CfnDomain.SAMLOptionsProperty.Builder =
        CfnDomain.SAMLOptionsProperty.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun idp(idp: IResolvable) {
        cdkBuilder.idp(idp)
    }

    public fun idp(idp: CfnDomain.IdpProperty) {
        cdkBuilder.idp(idp)
    }

    public fun masterBackendRole(masterBackendRole: String) {
        cdkBuilder.masterBackendRole(masterBackendRole)
    }

    public fun masterUserName(masterUserName: String) {
        cdkBuilder.masterUserName(masterUserName)
    }

    public fun rolesKey(rolesKey: String) {
        cdkBuilder.rolesKey(rolesKey)
    }

    public fun sessionTimeoutMinutes(sessionTimeoutMinutes: Number) {
        cdkBuilder.sessionTimeoutMinutes(sessionTimeoutMinutes)
    }

    public fun subjectKey(subjectKey: String) {
        cdkBuilder.subjectKey(subjectKey)
    }

    public fun build(): CfnDomain.SAMLOptionsProperty = cdkBuilder.build()
}
