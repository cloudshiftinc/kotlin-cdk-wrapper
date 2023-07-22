@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

/**
 * The KernelGateway app settings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * KernelGatewayAppSettingsProperty kernelGatewayAppSettingsProperty =
 * KernelGatewayAppSettingsProperty.builder()
 * .customImages(List.of(CustomImageProperty.builder()
 * .appImageConfigName("appImageConfigName")
 * .imageName("imageName")
 * // the properties below are optional
 * .imageVersionNumber(123)
 * .build()))
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-kernelgatewayappsettings.html)
 */
@CdkDslMarker
public class CfnUserProfileKernelGatewayAppSettingsPropertyDsl {
  private val cdkBuilder: CfnUserProfile.KernelGatewayAppSettingsProperty.Builder =
      CfnUserProfile.KernelGatewayAppSettingsProperty.builder()

  private val _customImages: MutableList<Any> = mutableListOf()

  /**
   * @param customImages A list of custom SageMaker images that are configured to run as a
   * KernelGateway app.
   */
  public fun customImages(vararg customImages: Any) {
    _customImages.addAll(listOf(*customImages))
  }

  /**
   * @param customImages A list of custom SageMaker images that are configured to run as a
   * KernelGateway app.
   */
  public fun customImages(customImages: Collection<Any>) {
    _customImages.addAll(customImages)
  }

  /**
   * @param customImages A list of custom SageMaker images that are configured to run as a
   * KernelGateway app.
   */
  public fun customImages(customImages: IResolvable) {
    cdkBuilder.customImages(customImages)
  }

  /**
   * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the
   * default SageMaker image used by the KernelGateway app.
   *
   * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
   * default instance type set here is used when Apps are created using the AWS Command Line Interface
   * or AWS CloudFormation and the instance type parameter value is not passed.
   */
  public fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
    cdkBuilder.defaultResourceSpec(defaultResourceSpec)
  }

  /**
   * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the
   * default SageMaker image used by the KernelGateway app.
   *
   * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
   * default instance type set here is used when Apps are created using the AWS Command Line Interface
   * or AWS CloudFormation and the instance type parameter value is not passed.
   */
  public fun defaultResourceSpec(defaultResourceSpec: CfnUserProfile.ResourceSpecProperty) {
    cdkBuilder.defaultResourceSpec(defaultResourceSpec)
  }

  public fun build(): CfnUserProfile.KernelGatewayAppSettingsProperty {
    if(_customImages.isNotEmpty()) cdkBuilder.customImages(_customImages)
    return cdkBuilder.build()
  }
}
