@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnWebACLAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWebACLAssociation.Builder = CfnWebACLAssociation.Builder.create(scope,
      id)

  /**
   * The Amazon Resource Name (ARN) of the resource to protect with the web ACL.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-resourcearn)
   * @param resourceArn The Amazon Resource Name (ARN) of the resource to protect with the web ACL. 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  /**
   * A unique identifier (ID) for the web ACL.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webaclassociation.html#cfn-wafregional-webaclassociation-webaclid)
   * @param webAclId A unique identifier (ID) for the web ACL. 
   */
  public fun webAclId(webAclId: String) {
    cdkBuilder.webAclId(webAclId)
  }

  public fun build(): CfnWebACLAssociation = cdkBuilder.build()
}
