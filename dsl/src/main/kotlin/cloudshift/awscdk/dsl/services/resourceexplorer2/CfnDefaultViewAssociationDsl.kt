@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourceexplorer2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnDefaultViewAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDefaultViewAssociation.Builder =
      CfnDefaultViewAssociation.Builder.create(scope, id)

  /**
   * The ARN of the view to set as the default for the AWS Region and AWS account in which you call
   * this operation.
   *
   * The specified view must already exist in the specified Region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-defaultviewassociation.html#cfn-resourceexplorer2-defaultviewassociation-viewarn)
   * @param viewArn The ARN of the view to set as the default for the AWS Region and AWS account in
   * which you call this operation. 
   */
  public fun viewArn(viewArn: String) {
    cdkBuilder.viewArn(viewArn)
  }

  public fun build(): CfnDefaultViewAssociation = cdkBuilder.build()
}
