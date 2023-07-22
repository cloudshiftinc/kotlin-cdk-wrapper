@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig
import software.constructs.Construct

/**
 * Creates a configuration for running a SageMaker image as a KernelGateway app.
 *
 * The configuration specifies the Amazon Elastic File System (EFS) storage volume on the image, and
 * a list of the kernels in the image.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnAppImageConfig cfnAppImageConfig = CfnAppImageConfig.Builder.create(this,
 * "MyCfnAppImageConfig")
 * .appImageConfigName("appImageConfigName")
 * // the properties below are optional
 * .kernelGatewayImageConfig(KernelGatewayImageConfigProperty.builder()
 * .kernelSpecs(List.of(KernelSpecProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .displayName("displayName")
 * .build()))
 * // the properties below are optional
 * .fileSystemConfig(FileSystemConfigProperty.builder()
 * .defaultGid(123)
 * .defaultUid(123)
 * .mountPath("mountPath")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html)
 */
@CdkDslMarker
public class CfnAppImageConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAppImageConfig.Builder = CfnAppImageConfig.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The name of the AppImageConfig.
   *
   * Must be unique to your account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-appimageconfigname)
   * @param appImageConfigName The name of the AppImageConfig. 
   */
  public fun appImageConfigName(appImageConfigName: String) {
    cdkBuilder.appImageConfigName(appImageConfigName)
  }

  /**
   * The configuration for the file system and kernels in the SageMaker image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-kernelgatewayimageconfig)
   * @param kernelGatewayImageConfig The configuration for the file system and kernels in the
   * SageMaker image. 
   */
  public fun kernelGatewayImageConfig(kernelGatewayImageConfig: IResolvable) {
    cdkBuilder.kernelGatewayImageConfig(kernelGatewayImageConfig)
  }

  /**
   * The configuration for the file system and kernels in the SageMaker image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-kernelgatewayimageconfig)
   * @param kernelGatewayImageConfig The configuration for the file system and kernels in the
   * SageMaker image. 
   */
  public
      fun kernelGatewayImageConfig(kernelGatewayImageConfig: CfnAppImageConfig.KernelGatewayImageConfigProperty) {
    cdkBuilder.kernelGatewayImageConfig(kernelGatewayImageConfig)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-appimageconfig.html#cfn-sagemaker-appimageconfig-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAppImageConfig {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
