@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnMultiRegionAccessPointPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMultiRegionAccessPointPolicy.Builder =
      CfnMultiRegionAccessPointPolicy.Builder.create(scope, id)

  /**
   * The name of the Multi-Region Access Point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html#cfn-s3-multiregionaccesspointpolicy-mrapname)
   * @param mrapName The name of the Multi-Region Access Point. 
   */
  public fun mrapName(mrapName: String) {
    cdkBuilder.mrapName(mrapName)
  }

  /**
   * The access policy associated with the Multi-Region Access Point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html#cfn-s3-multiregionaccesspointpolicy-policy)
   * @param policy The access policy associated with the Multi-Region Access Point. 
   */
  public fun policy(policy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policy)
    cdkBuilder.policy(builder.map)
  }

  /**
   * The access policy associated with the Multi-Region Access Point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html#cfn-s3-multiregionaccesspointpolicy-policy)
   * @param policy The access policy associated with the Multi-Region Access Point. 
   */
  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  public fun build(): CfnMultiRegionAccessPointPolicy = cdkBuilder.build()
}
