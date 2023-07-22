@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps

/**
 * Properties for defining a `CfnVpcIngressConnection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * CfnVpcIngressConnectionProps cfnVpcIngressConnectionProps =
 * CfnVpcIngressConnectionProps.builder()
 * .ingressVpcConfiguration(IngressVpcConfigurationProperty.builder()
 * .vpcEndpointId("vpcEndpointId")
 * .vpcId("vpcId")
 * .build())
 * .serviceArn("serviceArn")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcIngressConnectionName("vpcIngressConnectionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html)
 */
@CdkDslMarker
public class CfnVpcIngressConnectionPropsDsl {
  private val cdkBuilder: CfnVpcIngressConnectionProps.Builder =
      CfnVpcIngressConnectionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param ingressVpcConfiguration Specifications for the customer’s Amazon VPC and the related AWS
   * PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. 
   */
  public fun ingressVpcConfiguration(ingressVpcConfiguration: IResolvable) {
    cdkBuilder.ingressVpcConfiguration(ingressVpcConfiguration)
  }

  /**
   * @param ingressVpcConfiguration Specifications for the customer’s Amazon VPC and the related AWS
   * PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. 
   */
  public
      fun ingressVpcConfiguration(ingressVpcConfiguration: CfnVpcIngressConnection.IngressVpcConfigurationProperty) {
    cdkBuilder.ingressVpcConfiguration(ingressVpcConfiguration)
  }

  /**
   * @param serviceArn The Amazon Resource Name (ARN) for this App Runner service that is used to
   * create the VPC Ingress Connection resource. 
   */
  public fun serviceArn(serviceArn: String) {
    cdkBuilder.serviceArn(serviceArn)
  }

  /**
   * @param tags An optional list of metadata items that you can associate with the VPC Ingress
   * Connection resource.
   * A tag is a key-value pair.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An optional list of metadata items that you can associate with the VPC Ingress
   * Connection resource.
   * A tag is a key-value pair.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param vpcIngressConnectionName The customer-provided VPC Ingress Connection name.
   */
  public fun vpcIngressConnectionName(vpcIngressConnectionName: String) {
    cdkBuilder.vpcIngressConnectionName(vpcIngressConnectionName)
  }

  public fun build(): CfnVpcIngressConnectionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
