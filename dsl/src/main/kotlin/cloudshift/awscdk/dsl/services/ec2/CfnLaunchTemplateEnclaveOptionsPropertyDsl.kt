@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateEnclaveOptionsPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.EnclaveOptionsProperty.Builder =
      CfnLaunchTemplate.EnclaveOptionsProperty.builder()

  /**
   * @param enabled If this parameter is set to `true` , the instance is enabled for AWS Nitro
   * Enclaves;.
   * otherwise, it is not enabled for AWS Nitro Enclaves.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled If this parameter is set to `true` , the instance is enabled for AWS Nitro
   * Enclaves;.
   * otherwise, it is not enabled for AWS Nitro Enclaves.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnLaunchTemplate.EnclaveOptionsProperty = cdkBuilder.build()
}
