@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterKerberosAttributesPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.KerberosAttributesProperty.Builder =
      EmrCreateCluster.KerberosAttributesProperty.builder()

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

  public fun build(): EmrCreateCluster.KerberosAttributesProperty = cdkBuilder.build()
}
