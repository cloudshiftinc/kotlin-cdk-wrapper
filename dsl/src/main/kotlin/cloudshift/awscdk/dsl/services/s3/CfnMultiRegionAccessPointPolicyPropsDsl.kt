@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps

@CdkDslMarker
public class CfnMultiRegionAccessPointPolicyPropsDsl {
  private val cdkBuilder: CfnMultiRegionAccessPointPolicyProps.Builder =
      CfnMultiRegionAccessPointPolicyProps.builder()

  /**
   * @param mrapName The name of the Multi-Region Access Point. 
   */
  public fun mrapName(mrapName: String) {
    cdkBuilder.mrapName(mrapName)
  }

  /**
   * @param policy The access policy associated with the Multi-Region Access Point. 
   */
  public fun policy(policy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policy)
    cdkBuilder.policy(builder.map)
  }

  /**
   * @param policy The access policy associated with the Multi-Region Access Point. 
   */
  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  public fun build(): CfnMultiRegionAccessPointPolicyProps = cdkBuilder.build()
}
