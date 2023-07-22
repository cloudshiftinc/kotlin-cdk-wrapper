@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnSpace

@CdkDslMarker
public class CfnSpaceJupyterServerAppSettingsPropertyDsl {
  private val cdkBuilder: CfnSpace.JupyterServerAppSettingsProperty.Builder =
      CfnSpace.JupyterServerAppSettingsProperty.builder()

  /**
   * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the
   * default SageMaker image used by the JupyterServer app.
   * If you use the `LifecycleConfigArns` parameter, then this parameter is also required.
   */
  public fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
    cdkBuilder.defaultResourceSpec(defaultResourceSpec)
  }

  /**
   * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the
   * default SageMaker image used by the JupyterServer app.
   * If you use the `LifecycleConfigArns` parameter, then this parameter is also required.
   */
  public fun defaultResourceSpec(defaultResourceSpec: CfnSpace.ResourceSpecProperty) {
    cdkBuilder.defaultResourceSpec(defaultResourceSpec)
  }

  public fun build(): CfnSpace.JupyterServerAppSettingsProperty = cdkBuilder.build()
}
