@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApiGatewayV2::VpcLink` resource creates a VPC link.
 *
 * Supported only for HTTP APIs. The VPC link status must transition from `PENDING` to `AVAILABLE`
 * to successfully create a VPC link, which can take up to 10 minutes. To learn more, see [Working with
 * VPC Links for HTTP
 * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-vpc-links.html) in the
 * *API Gateway Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * CfnVpcLink cfnVpcLink = CfnVpcLink.Builder.create(this, "MyCfnVpcLink")
 * .name("name")
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .securityGroupIds(List.of("securityGroupIds"))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html)
 */
public open class CfnVpcLink(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnVpcLink,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVpcLinkProps,
  ) :
      this(software.amazon.awscdk.services.apigatewayv2.CfnVpcLink(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVpcLinkProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVpcLinkProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVpcLinkProps(props)
  )

  /**
   * The VPC link ID.
   */
  public open fun attrVpcLinkId(): String = unwrap(this).getAttrVpcLinkId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the VPC link.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the VPC link.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A list of security group IDs for the VPC link.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * A list of security group IDs for the VPC link.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * A list of security group IDs for the VPC link.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * A list of subnet IDs to include in the VPC link.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * A list of subnet IDs to include in the VPC link.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * A list of subnet IDs to include in the VPC link.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The collection of tags.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * The collection of tags.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.CfnVpcLink].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-name)
     * @param name The name of the VPC link. 
     */
    public fun name(name: String)

    /**
     * A list of security group IDs for the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-securitygroupids)
     * @param securityGroupIds A list of security group IDs for the VPC link. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * A list of security group IDs for the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-securitygroupids)
     * @param securityGroupIds A list of security group IDs for the VPC link. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * A list of subnet IDs to include in the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-subnetids)
     * @param subnetIds A list of subnet IDs to include in the VPC link. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * A list of subnet IDs to include in the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-subnetids)
     * @param subnetIds A list of subnet IDs to include in the VPC link. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-tags)
     * @param tags The collection of tags. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnVpcLink.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnVpcLink.Builder.create(scope, id)

    /**
     * The name of the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-name)
     * @param name The name of the VPC link. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of security group IDs for the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-securitygroupids)
     * @param securityGroupIds A list of security group IDs for the VPC link. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * A list of security group IDs for the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-securitygroupids)
     * @param securityGroupIds A list of security group IDs for the VPC link. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * A list of subnet IDs to include in the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-subnetids)
     * @param subnetIds A list of subnet IDs to include in the VPC link. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * A list of subnet IDs to include in the VPC link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-subnetids)
     * @param subnetIds A list of subnet IDs to include in the VPC link. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html#cfn-apigatewayv2-vpclink-tags)
     * @param tags The collection of tags. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnVpcLink = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigatewayv2.CfnVpcLink.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVpcLink {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVpcLink(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnVpcLink):
        CfnVpcLink = CfnVpcLink(cdkObject)

    internal fun unwrap(wrapped: CfnVpcLink):
        software.amazon.awscdk.services.apigatewayv2.CfnVpcLink = wrapped.cdkObject as
        software.amazon.awscdk.services.apigatewayv2.CfnVpcLink
  }
}
