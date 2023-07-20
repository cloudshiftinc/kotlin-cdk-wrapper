@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACLAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnWebACLAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWebACLAssociation.Builder = CfnWebACLAssociation.Builder.create(scope,
      id)

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun webAclArn(webAclArn: String) {
    cdkBuilder.webAclArn(webAclArn)
  }

  public fun build(): CfnWebACLAssociation = cdkBuilder.build()
}
