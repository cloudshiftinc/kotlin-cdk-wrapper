@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnServerlessCluster

@CdkDslMarker
public class CfnServerlessClusterIamPropertyDsl {
  private val cdkBuilder: CfnServerlessCluster.IamProperty.Builder =
      CfnServerlessCluster.IamProperty.builder()

  /**
   * @param enabled SASL/IAM authentication is enabled or not. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled SASL/IAM authentication is enabled or not. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnServerlessCluster.IamProperty = cdkBuilder.build()
}
