@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDomainName
import software.constructs.Construct

@CdkDslMarker
public class CfnDomainNameDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDomainName.Builder = CfnDomainName.Builder.create(scope, id)

  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun build(): CfnDomainName = cdkBuilder.build()
}
