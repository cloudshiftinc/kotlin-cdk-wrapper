package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVpcLink internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.CfnVpcLink,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ID for the VPC link.
   *
   * For example: `abc123` .
   */
  public open fun attrVpcLinkId(): String = unwrap(this).getAttrVpcLinkId()

  /**
   * The description of the VPC link.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the VPC link.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name used to label and identify the VPC link.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name used to label and identify the VPC link.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of arbitrary tags (key-value pairs) to associate with the VPC link.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of arbitrary tags (key-value pairs) to associate with the VPC link.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of arbitrary tags (key-value pairs) to associate with the VPC link.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ARN of the network load balancer of the VPC targeted by the VPC link.
   */
  public open fun targetArns(): List<String> = unwrap(this).getTargetArns()

  /**
   * The ARN of the network load balancer of the VPC targeted by the VPC link.
   */
  public open fun targetArns(`value`: List<String>) {
    unwrap(this).setTargetArns(`value`)
  }

  /**
   * The ARN of the network load balancer of the VPC targeted by the VPC link.
   */
  public open fun targetArns(vararg `value`: String): Unit = targetArns(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnVpcLink].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-description)
     * @param description The description of the VPC link. 
     */
    public fun description(description: String)

    /**
     * The name used to label and identify the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-name)
     * @param name The name used to label and identify the VPC link. 
     */
    public fun name(name: String)

    /**
     * An array of arbitrary tags (key-value pairs) to associate with the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-tags)
     * @param tags An array of arbitrary tags (key-value pairs) to associate with the VPC link. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of arbitrary tags (key-value pairs) to associate with the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-tags)
     * @param tags An array of arbitrary tags (key-value pairs) to associate with the VPC link. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ARN of the network load balancer of the VPC targeted by the VPC link.
     *
     * The network load balancer must be owned by the same AWS account of the API owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-targetarns)
     * @param targetArns The ARN of the network load balancer of the VPC targeted by the VPC link. 
     */
    public fun targetArns(targetArns: List<String>)

    /**
     * The ARN of the network load balancer of the VPC targeted by the VPC link.
     *
     * The network load balancer must be owned by the same AWS account of the API owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-targetarns)
     * @param targetArns The ARN of the network load balancer of the VPC targeted by the VPC link. 
     */
    public fun targetArns(vararg targetArns: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnVpcLink.Builder =
        software.amazon.awscdk.services.apigateway.CfnVpcLink.Builder.create(scope, id)

    /**
     * The description of the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-description)
     * @param description The description of the VPC link. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name used to label and identify the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-name)
     * @param name The name used to label and identify the VPC link. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of arbitrary tags (key-value pairs) to associate with the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-tags)
     * @param tags An array of arbitrary tags (key-value pairs) to associate with the VPC link. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of arbitrary tags (key-value pairs) to associate with the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-tags)
     * @param tags An array of arbitrary tags (key-value pairs) to associate with the VPC link. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ARN of the network load balancer of the VPC targeted by the VPC link.
     *
     * The network load balancer must be owned by the same AWS account of the API owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-targetarns)
     * @param targetArns The ARN of the network load balancer of the VPC targeted by the VPC link. 
     */
    override fun targetArns(targetArns: List<String>) {
      cdkBuilder.targetArns(targetArns)
    }

    /**
     * The ARN of the network load balancer of the VPC targeted by the VPC link.
     *
     * The network load balancer must be owned by the same AWS account of the API owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-vpclink.html#cfn-apigateway-vpclink-targetarns)
     * @param targetArns The ARN of the network load balancer of the VPC targeted by the VPC link. 
     */
    override fun targetArns(vararg targetArns: String): Unit = targetArns(targetArns.toList())

    public fun build(): software.amazon.awscdk.services.apigateway.CfnVpcLink = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVpcLink {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVpcLink(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnVpcLink): CfnVpcLink
        = CfnVpcLink(cdkObject)

    internal fun unwrap(wrapped: CfnVpcLink): software.amazon.awscdk.services.apigateway.CfnVpcLink
        = wrapped.cdkObject
  }
}
