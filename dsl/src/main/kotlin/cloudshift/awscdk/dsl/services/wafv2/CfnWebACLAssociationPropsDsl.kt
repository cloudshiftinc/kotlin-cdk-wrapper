@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps

@CdkDslMarker
public class CfnWebACLAssociationPropsDsl {
  private val cdkBuilder: CfnWebACLAssociationProps.Builder = CfnWebACLAssociationProps.builder()

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun webAclArn(webAclArn: String) {
    cdkBuilder.webAclArn(webAclArn)
  }

  public fun build(): CfnWebACLAssociationProps = cdkBuilder.build()
}
