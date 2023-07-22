@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

/**
 * The JupyterServer app settings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * JupyterServerAppSettingsProperty jupyterServerAppSettingsProperty =
 * JupyterServerAppSettingsProperty.builder()
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-jupyterserverappsettings.html)
 */
@CdkDslMarker
public class CfnUserProfileJupyterServerAppSettingsPropertyDsl {
  private val cdkBuilder: CfnUserProfile.JupyterServerAppSettingsProperty.Builder =
      CfnUserProfile.JupyterServerAppSettingsProperty.builder()

  /**
   * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the
   * default SageMaker image used by the JupyterServer app.
   */
  public fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
    cdkBuilder.defaultResourceSpec(defaultResourceSpec)
  }

  /**
   * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the
   * default SageMaker image used by the JupyterServer app.
   */
  public fun defaultResourceSpec(defaultResourceSpec: CfnUserProfile.ResourceSpecProperty) {
    cdkBuilder.defaultResourceSpec(defaultResourceSpec)
  }

  public fun build(): CfnUserProfile.JupyterServerAppSettingsProperty = cdkBuilder.build()
}
