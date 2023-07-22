@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourceexplorer2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps

@CdkDslMarker
public class CfnDefaultViewAssociationPropsDsl {
  private val cdkBuilder: CfnDefaultViewAssociationProps.Builder =
      CfnDefaultViewAssociationProps.builder()

  /**
   * @param viewArn The ARN of the view to set as the default for the AWS Region and AWS account in
   * which you call this operation. 
   * The specified view must already exist in the specified Region.
   */
  public fun viewArn(viewArn: String) {
    cdkBuilder.viewArn(viewArn)
  }

  public fun build(): CfnDefaultViewAssociationProps = cdkBuilder.build()
}
