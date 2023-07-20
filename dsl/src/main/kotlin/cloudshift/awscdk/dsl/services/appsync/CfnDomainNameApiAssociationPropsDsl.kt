@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps

@CdkDslMarker
public class CfnDomainNameApiAssociationPropsDsl {
  private val cdkBuilder: CfnDomainNameApiAssociationProps.Builder =
      CfnDomainNameApiAssociationProps.builder()

  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun build(): CfnDomainNameApiAssociationProps = cdkBuilder.build()
}
