@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnContainer
import software.constructs.Construct

@CdkDslMarker
public class CfnContainerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnContainer.Builder = CfnContainer.Builder.create(scope, id)

  private val _publicDomainNames: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * An object that describes the current container deployment of the container service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-containerservicedeployment)
   * @param containerServiceDeployment An object that describes the current container deployment of
   * the container service. 
   */
  public fun containerServiceDeployment(containerServiceDeployment: IResolvable) {
    cdkBuilder.containerServiceDeployment(containerServiceDeployment)
  }

  /**
   * An object that describes the current container deployment of the container service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-containerservicedeployment)
   * @param containerServiceDeployment An object that describes the current container deployment of
   * the container service. 
   */
  public
      fun containerServiceDeployment(containerServiceDeployment: CfnContainer.ContainerServiceDeploymentProperty) {
    cdkBuilder.containerServiceDeployment(containerServiceDeployment)
  }

  /**
   * A Boolean value indicating whether the container service is disabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-isdisabled)
   * @param isDisabled A Boolean value indicating whether the container service is disabled. 
   */
  public fun isDisabled(isDisabled: Boolean) {
    cdkBuilder.isDisabled(isDisabled)
  }

  /**
   * A Boolean value indicating whether the container service is disabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-isdisabled)
   * @param isDisabled A Boolean value indicating whether the container service is disabled. 
   */
  public fun isDisabled(isDisabled: IResolvable) {
    cdkBuilder.isDisabled(isDisabled)
  }

  /**
   * The power specification of the container service.
   *
   * The power specifies the amount of RAM, the number of vCPUs, and the base price of the container
   * service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-power)
   * @param power The power specification of the container service. 
   */
  public fun power(power: String) {
    cdkBuilder.power(power)
  }

  /**
   * The public domain name of the container service, such as `example.com` and `www.example.com` .
   *
   * You can specify up to four public domain names for a container service. The domain names that
   * you specify are used when you create a deployment with a container that is configured as the
   * public endpoint of your container service.
   *
   * If you don't specify public domain names, then you can use the default domain of the container
   * service.
   *
   *
   * You must create and validate an SSL/TLS certificate before you can use public domain names with
   * your container service. Use the
   * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
   * resource to create a certificate for the public domain names that you want to use with your
   * container service.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-publicdomainnames)
   * @param publicDomainNames The public domain name of the container service, such as `example.com`
   * and `www.example.com` . 
   */
  public fun publicDomainNames(vararg publicDomainNames: Any) {
    _publicDomainNames.addAll(listOf(*publicDomainNames))
  }

  /**
   * The public domain name of the container service, such as `example.com` and `www.example.com` .
   *
   * You can specify up to four public domain names for a container service. The domain names that
   * you specify are used when you create a deployment with a container that is configured as the
   * public endpoint of your container service.
   *
   * If you don't specify public domain names, then you can use the default domain of the container
   * service.
   *
   *
   * You must create and validate an SSL/TLS certificate before you can use public domain names with
   * your container service. Use the
   * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
   * resource to create a certificate for the public domain names that you want to use with your
   * container service.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-publicdomainnames)
   * @param publicDomainNames The public domain name of the container service, such as `example.com`
   * and `www.example.com` . 
   */
  public fun publicDomainNames(publicDomainNames: Collection<Any>) {
    _publicDomainNames.addAll(publicDomainNames)
  }

  /**
   * The public domain name of the container service, such as `example.com` and `www.example.com` .
   *
   * You can specify up to four public domain names for a container service. The domain names that
   * you specify are used when you create a deployment with a container that is configured as the
   * public endpoint of your container service.
   *
   * If you don't specify public domain names, then you can use the default domain of the container
   * service.
   *
   *
   * You must create and validate an SSL/TLS certificate before you can use public domain names with
   * your container service. Use the
   * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
   * resource to create a certificate for the public domain names that you want to use with your
   * container service.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-publicdomainnames)
   * @param publicDomainNames The public domain name of the container service, such as `example.com`
   * and `www.example.com` . 
   */
  public fun publicDomainNames(publicDomainNames: IResolvable) {
    cdkBuilder.publicDomainNames(publicDomainNames)
  }

  /**
   * The scale specification of the container service.
   *
   * The scale specifies the allocated compute nodes of the container service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-scale)
   * @param scale The scale specification of the container service. 
   */
  public fun scale(scale: Number) {
    cdkBuilder.scale(scale)
  }

  /**
   * The name of the container service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-servicename)
   * @param serviceName The name of the container service. 
   */
  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *AWS CloudFormation User Guide* .
   *
   *
   * The `Value` of `Tags` is optional for Lightsail resources.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-tags)
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
   * in the *AWS CloudFormation User Guide* .
   *
   *
   * The `Value` of `Tags` is optional for Lightsail resources.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnContainer {
    if(_publicDomainNames.isNotEmpty()) cdkBuilder.publicDomainNames(_publicDomainNames)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
