@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnApprovedOrigin
import software.constructs.Construct

@CdkDslMarker
public class CfnApprovedOriginDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApprovedOrigin.Builder = CfnApprovedOrigin.Builder.create(scope, id)

  /**
   * The Amazon Resource Name (ARN) of the instance.
   *
   * *Minimum* : `1`
   *
   * *Maximum* : `100`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html#cfn-connect-approvedorigin-instanceid)
   * @param instanceId The Amazon Resource Name (ARN) of the instance. 
   */
  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  /**
   * Domain name to be added to the allow-list of the instance.
   *
   * *Maximum* : `267`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html#cfn-connect-approvedorigin-origin)
   * @param origin Domain name to be added to the allow-list of the instance. 
   */
  public fun origin(origin: String) {
    cdkBuilder.origin(origin)
  }

  public fun build(): CfnApprovedOrigin = cdkBuilder.build()
}
