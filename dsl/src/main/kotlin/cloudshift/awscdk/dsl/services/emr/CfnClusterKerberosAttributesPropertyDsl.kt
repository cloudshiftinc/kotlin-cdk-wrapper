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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.emr.CfnCluster
import kotlin.String

@CdkDslMarker
public class CfnClusterKerberosAttributesPropertyDsl {
    private val cdkBuilder: CfnCluster.KerberosAttributesProperty.Builder =
        CfnCluster.KerberosAttributesProperty.builder()

    public fun adDomainJoinPassword(adDomainJoinPassword: String) {
        cdkBuilder.adDomainJoinPassword(adDomainJoinPassword)
    }

    public fun adDomainJoinUser(adDomainJoinUser: String) {
        cdkBuilder.adDomainJoinUser(adDomainJoinUser)
    }

    public fun crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword: String) {
        cdkBuilder.crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword)
    }

    public fun kdcAdminPassword(kdcAdminPassword: String) {
        cdkBuilder.kdcAdminPassword(kdcAdminPassword)
    }

    public fun realm(realm: String) {
        cdkBuilder.realm(realm)
    }

    public fun build(): CfnCluster.KerberosAttributesProperty = cdkBuilder.build()
}
