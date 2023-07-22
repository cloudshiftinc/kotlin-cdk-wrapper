@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnDedicatedIpPool
import software.constructs.Construct

@CdkDslMarker
public class CfnDedicatedIpPoolDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDedicatedIpPool.Builder = CfnDedicatedIpPool.Builder.create(scope, id)

  /**
   * The name of the dedicated IP pool that the IP address is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-dedicatedippool.html#cfn-ses-dedicatedippool-poolname)
   * @param poolName The name of the dedicated IP pool that the IP address is associated with. 
   */
  public fun poolName(poolName: String) {
    cdkBuilder.poolName(poolName)
  }

  /**
   * The type of scaling mode.
   *
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
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-dedicatedippool.html#cfn-ses-dedicatedippool-scalingmode)
   * @param scalingMode The type of scaling mode. 
   */
  public fun scalingMode(scalingMode: String) {
    cdkBuilder.scalingMode(scalingMode)
  }

  public fun build(): CfnDedicatedIpPool = cdkBuilder.build()
}
