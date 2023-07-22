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
import software.amazon.awscdk.services.sagemaker.CfnApp
import software.amazon.awscdk.services.sagemaker.CfnAppProps

/**
 * Properties for defining a `CfnApp`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnAppProps cfnAppProps = CfnAppProps.builder()
 * .appName("appName")
 * .appType("appType")
 * .domainId("domainId")
 * .userProfileName("userProfileName")
 * // the properties below are optional
 * .resourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html)
 */
@CdkDslMarker
public class CfnAppPropsDsl {
  private val cdkBuilder: CfnAppProps.Builder = CfnAppProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param appName The name of the app. 
   */
  public fun appName(appName: String) {
    cdkBuilder.appName(appName)
  }

  /**
   * @param appType The type of app. 
   * *Allowed Values* : `JupyterServer | KernelGateway | RSessionGateway | RStudioServerPro |
   * TensorBoard | Canvas`
   */
  public fun appType(appType: String) {
    cdkBuilder.appType(appType)
  }

  /**
   * @param domainId The domain ID. 
   */
  public fun domainId(domainId: String) {
    cdkBuilder.domainId(domainId)
  }

  /**
   * @param resourceSpec Specifies the ARNs of a SageMaker image and SageMaker image version, and
   * the instance type that the version runs on.
   */
  public fun resourceSpec(resourceSpec: IResolvable) {
    cdkBuilder.resourceSpec(resourceSpec)
  }

  /**
   * @param resourceSpec Specifies the ARNs of a SageMaker image and SageMaker image version, and
   * the instance type that the version runs on.
   */
  public fun resourceSpec(resourceSpec: CfnApp.ResourceSpecProperty) {
    cdkBuilder.resourceSpec(resourceSpec)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param userProfileName The user profile name. 
   */
  public fun userProfileName(userProfileName: String) {
    cdkBuilder.userProfileName(userProfileName)
  }

  public fun build(): CfnAppProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
