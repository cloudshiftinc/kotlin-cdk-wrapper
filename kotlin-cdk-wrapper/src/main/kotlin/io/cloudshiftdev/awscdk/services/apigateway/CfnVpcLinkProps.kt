@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnVpcLink`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
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
public interface CfnVpcLinkProps {
  /**
   * The description of the VPC link.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name used to label and identify the VPC link.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-name)
   */
  public fun name(): String

  /**
   * An array of arbitrary tags (key-value pairs) to associate with the VPC link.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ARN of the network load balancer of the VPC targeted by the VPC link.
   *
   * The network load balancer must be owned by the same AWS account of the API owner.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-targetarns)
   */
  public fun targetArns(): List<String>

  /**
   * A builder for [CfnVpcLinkProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the VPC link.
     */
    public fun description(description: String)

    /**
     * @param name The name used to label and identify the VPC link. 
     */
    public fun name(name: String)

    /**
     * @param tags An array of arbitrary tags (key-value pairs) to associate with the VPC link.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of arbitrary tags (key-value pairs) to associate with the VPC link.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetArns The ARN of the network load balancer of the VPC targeted by the VPC link. 
     * The network load balancer must be owned by the same AWS account of the API owner.
     */
    public fun targetArns(targetArns: List<String>)

    /**
     * @param targetArns The ARN of the network load balancer of the VPC targeted by the VPC link. 
     * The network load balancer must be owned by the same AWS account of the API owner.
     */
    public fun targetArns(vararg targetArns: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnVpcLinkProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnVpcLinkProps.builder()

    /**
     * @param description The description of the VPC link.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name used to label and identify the VPC link. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of arbitrary tags (key-value pairs) to associate with the VPC link.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of arbitrary tags (key-value pairs) to associate with the VPC link.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetArns The ARN of the network load balancer of the VPC targeted by the VPC link. 
     * The network load balancer must be owned by the same AWS account of the API owner.
     */
    override fun targetArns(targetArns: List<String>) {
      cdkBuilder.targetArns(targetArns)
    }

    /**
     * @param targetArns The ARN of the network load balancer of the VPC targeted by the VPC link. 
     * The network load balancer must be owned by the same AWS account of the API owner.
     */
    override fun targetArns(vararg targetArns: String): Unit = targetArns(targetArns.toList())

    public fun build(): software.amazon.awscdk.services.apigateway.CfnVpcLinkProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnVpcLinkProps,
  ) : CdkObject(cdkObject), CfnVpcLinkProps {
    /**
     * The description of the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name used to label and identify the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An array of arbitrary tags (key-value pairs) to associate with the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ARN of the network load balancer of the VPC targeted by the VPC link.
     *
     * The network load balancer must be owned by the same AWS account of the API owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-targetarns)
     */
    override fun targetArns(): List<String> = unwrap(this).getTargetArns()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVpcLinkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnVpcLinkProps):
        CfnVpcLinkProps = CdkObjectWrappers.wrap(cdkObject) as CfnVpcLinkProps

    internal fun unwrap(wrapped: CfnVpcLinkProps):
        software.amazon.awscdk.services.apigateway.CfnVpcLinkProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnVpcLinkProps
  }
}
