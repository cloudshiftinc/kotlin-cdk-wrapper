@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.apigateway.CfnVpcLinkProps

/**
 * Properties for defining a `CfnVpcLink`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CfnVpcLinkProps cfnVpcLinkProps = CfnVpcLinkProps.builder()
 * .name("name")
 * .targetArns(List.of("targetArns"))
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html)
 */
@CdkDslMarker
public class CfnVpcLinkPropsDsl {
  private val cdkBuilder: CfnVpcLinkProps.Builder = CfnVpcLinkProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _targetArns: MutableList<String> = mutableListOf()

  /**
   * @param description The description of the VPC link.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name used to label and identify the VPC link. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags An array of arbitrary tags (key-value pairs) to associate with the VPC link.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of arbitrary tags (key-value pairs) to associate with the VPC link.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param targetArns The ARN of the network load balancer of the VPC targeted by the VPC link. 
   * The network load balancer must be owned by the same AWS account of the API owner.
   */
  public fun targetArns(vararg targetArns: String) {
    _targetArns.addAll(listOf(*targetArns))
  }

  /**
   * @param targetArns The ARN of the network load balancer of the VPC targeted by the VPC link. 
   * The network load balancer must be owned by the same AWS account of the API owner.
   */
  public fun targetArns(targetArns: Collection<String>) {
    _targetArns.addAll(targetArns)
  }

  public fun build(): CfnVpcLinkProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_targetArns.isNotEmpty()) cdkBuilder.targetArns(_targetArns)
    return cdkBuilder.build()
  }
}
