@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps

@CdkDslMarker
public class CfnWebACLAssociationPropsDsl {
  private val cdkBuilder: CfnWebACLAssociationProps.Builder = CfnWebACLAssociationProps.builder()

  /**
   * @param resourceArn The Amazon Resource Name (ARN) of the resource to protect with the web ACL. 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  /**
   * @param webAclId A unique identifier (ID) for the web ACL. 
   */
  public fun webAclId(webAclId: String) {
    cdkBuilder.webAclId(webAclId)
  }

  public fun build(): CfnWebACLAssociationProps = cdkBuilder.build()
}
