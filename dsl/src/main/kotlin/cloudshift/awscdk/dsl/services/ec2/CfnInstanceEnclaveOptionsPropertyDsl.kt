@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnInstance

/**
 * Indicates whether the instance is enabled for AWS Nitro Enclaves.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * EnclaveOptionsProperty enclaveOptionsProperty = EnclaveOptionsProperty.builder()
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-enclaveoptions.html)
 */
@CdkDslMarker
public class CfnInstanceEnclaveOptionsPropertyDsl {
  private val cdkBuilder: CfnInstance.EnclaveOptionsProperty.Builder =
      CfnInstance.EnclaveOptionsProperty.builder()

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

  public fun build(): CfnInstance.EnclaveOptionsProperty = cdkBuilder.build()
}
