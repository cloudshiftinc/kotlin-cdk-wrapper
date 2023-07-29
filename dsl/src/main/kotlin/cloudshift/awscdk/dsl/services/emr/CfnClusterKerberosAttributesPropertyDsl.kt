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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emr.CfnCluster

/**
 * `KerberosAttributes` is a property of the `AWS::EMR::Cluster` resource.
 *
 * `KerberosAttributes` define the cluster-specific Kerberos configuration when Kerberos
 * authentication is enabled using a security configuration. The cluster-specific configuration must
 * be compatible with the security configuration. For more information see
 * [Use Kerberos Authentication](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html)
 * in the *EMR Management Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * KerberosAttributesProperty kerberosAttributesProperty = KerberosAttributesProperty.builder()
 * .kdcAdminPassword("kdcAdminPassword")
 * .realm("realm")
 * // the properties below are optional
 * .adDomainJoinPassword("adDomainJoinPassword")
 * .adDomainJoinUser("adDomainJoinUser")
 * .crossRealmTrustPrincipalPassword("crossRealmTrustPrincipalPassword")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-kerberosattributes.html)
 */
@CdkDslMarker
public class CfnClusterKerberosAttributesPropertyDsl {
    private val cdkBuilder: CfnCluster.KerberosAttributesProperty.Builder =
        CfnCluster.KerberosAttributesProperty.builder()

    /** @param adDomainJoinPassword The Active Directory password for `ADDomainJoinUser` . */
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
     *   example, `EC2.INTERNAL` .
     */
    public fun realm(realm: String) {
        cdkBuilder.realm(realm)
    }

    public fun build(): CfnCluster.KerberosAttributesProperty = cdkBuilder.build()
}
