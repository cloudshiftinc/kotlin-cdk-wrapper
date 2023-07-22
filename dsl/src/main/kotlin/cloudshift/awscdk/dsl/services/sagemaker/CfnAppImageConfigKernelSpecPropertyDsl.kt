@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig

@CdkDslMarker
public class CfnAppImageConfigKernelSpecPropertyDsl {
  private val cdkBuilder: CfnAppImageConfig.KernelSpecProperty.Builder =
      CfnAppImageConfig.KernelSpecProperty.builder()

  /**
   * @param displayName The display name of the kernel.
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  /**
   * @param name The name of the Jupyter kernel in the image. 
   * This value is case sensitive.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnAppImageConfig.KernelSpecProperty = cdkBuilder.build()
}
