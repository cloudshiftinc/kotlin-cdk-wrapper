@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDomainNameProps

@CdkDslMarker
public class CfnDomainNamePropsDsl {
  private val cdkBuilder: CfnDomainNameProps.Builder = CfnDomainNameProps.builder()

  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun build(): CfnDomainNameProps = cdkBuilder.build()
}
