@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps

@CdkDslMarker
public class CfnWebACLAssociationPropsDsl {
  private val cdkBuilder: CfnWebACLAssociationProps.Builder = CfnWebACLAssociationProps.builder()

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun webAclId(webAclId: String) {
    cdkBuilder.webAclId(webAclId)
  }

  public fun build(): CfnWebACLAssociationProps = cdkBuilder.build()
}
