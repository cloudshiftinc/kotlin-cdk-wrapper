@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps

@CdkDslMarker
public class CfnDedicatedIpPoolPropsDsl {
  private val cdkBuilder: CfnDedicatedIpPoolProps.Builder = CfnDedicatedIpPoolProps.builder()

  /**
   * @param poolName The name of the dedicated IP pool that the IP address is associated with.
   */
  public fun poolName(poolName: String) {
    cdkBuilder.poolName(poolName)
  }

  /**
   * @param scalingMode The type of scaling mode.
   * The following options are available:
   *
   * * `STANDARD` - The customer controls which IPs are part of the dedicated IP pool.
   * * `MANAGED` - The reputation and number of IPs are automatically managed by Amazon SES .
   *
   * The `STANDARD` option is selected by default if no value is specified.
   *
   *
   * Updating *ScalingMode* doesn't require a replacement if you're updating its value from
   * `STANDARD` to `MANAGED` . However, updating *ScalingMode* from `MANAGED` to `STANDARD` is not
   * supported.
   */
  public fun scalingMode(scalingMode: String) {
    cdkBuilder.scalingMode(scalingMode)
  }

  public fun build(): CfnDedicatedIpPoolProps = cdkBuilder.build()
}
