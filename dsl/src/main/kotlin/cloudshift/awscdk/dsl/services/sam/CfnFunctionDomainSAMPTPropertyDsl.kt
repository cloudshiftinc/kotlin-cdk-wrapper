@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionDomainSAMPTPropertyDsl {
  private val cdkBuilder: CfnFunction.DomainSAMPTProperty.Builder =
      CfnFunction.DomainSAMPTProperty.builder()

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun build(): CfnFunction.DomainSAMPTProperty = cdkBuilder.build()
}
