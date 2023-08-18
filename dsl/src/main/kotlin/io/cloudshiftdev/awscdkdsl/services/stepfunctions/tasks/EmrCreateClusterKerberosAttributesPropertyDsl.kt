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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security
 * configuration.
 *
 * See the RunJobFlow API for complete documentation on input parameters
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * KerberosAttributesProperty kerberosAttributesProperty = KerberosAttributesProperty.builder()
 * .realm("realm")
 * // the properties below are optional
 * .adDomainJoinPassword("adDomainJoinPassword")
 * .adDomainJoinUser("adDomainJoinUser")
 * .crossRealmTrustPrincipalPassword("crossRealmTrustPrincipalPassword")
 * .kdcAdminPassword("kdcAdminPassword")
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_KerberosAttributes.html)
 */
@CdkDslMarker
public class EmrCreateClusterKerberosAttributesPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.KerberosAttributesProperty.Builder =
        EmrCreateCluster.KerberosAttributesProperty.builder()

    /** @param adDomainJoinPassword The Active Directory password for ADDomainJoinUser. */
    public fun adDomainJoinPassword(adDomainJoinPassword: String) {
        cdkBuilder.adDomainJoinPassword(adDomainJoinPassword)
    }

    /**
     * @param adDomainJoinUser Required only when establishing a cross-realm trust with an Active
     *   Directory domain. A user with sufficient privileges to join resources to the domain.
     */
    public fun adDomainJoinUser(adDomainJoinUser: String) {
        cdkBuilder.adDomainJoinUser(adDomainJoinUser)
    }

    /**
     * @param crossRealmTrustPrincipalPassword Required only when establishing a cross-realm trust
     *   with a KDC in a different realm. The cross-realm principal password, which must be
     *   identical across realms.
     */
    public fun crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword: String) {
        cdkBuilder.crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword)
    }

    /**
     * @param kdcAdminPassword The password used within the cluster for the kadmin service on the
     *   cluster-dedicated KDC, which maintains Kerberos principals, password policies, and keytabs
     *   for the cluster.
     */
    public fun kdcAdminPassword(kdcAdminPassword: String) {
        cdkBuilder.kdcAdminPassword(kdcAdminPassword)
    }

    /**
     * @param realm The name of the Kerberos realm to which all nodes in a cluster belong. For
     *   example, EC2.INTERNAL.
     */
    public fun realm(realm: String) {
        cdkBuilder.realm(realm)
    }

    public fun build(): EmrCreateCluster.KerberosAttributesProperty = cdkBuilder.build()
}
