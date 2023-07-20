@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.DomainNameAttributes

@CdkDslMarker
public class DomainNameAttributesDsl {
  private val cdkBuilder: DomainNameAttributes.Builder = DomainNameAttributes.builder()

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun domainNameAliasHostedZoneId(domainNameAliasHostedZoneId: String) {
    cdkBuilder.domainNameAliasHostedZoneId(domainNameAliasHostedZoneId)
  }

  public fun domainNameAliasTarget(domainNameAliasTarget: String) {
    cdkBuilder.domainNameAliasTarget(domainNameAliasTarget)
  }

  public fun build(): DomainNameAttributes = cdkBuilder.build()
}
