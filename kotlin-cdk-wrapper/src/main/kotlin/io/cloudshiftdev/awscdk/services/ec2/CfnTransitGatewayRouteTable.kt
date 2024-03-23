@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

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

/**
 * Specifies a route table for a transit gateway.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTransitGatewayRouteTable cfnTransitGatewayRouteTable =
 * CfnTransitGatewayRouteTable.Builder.create(this, "MyCfnTransitGatewayRouteTable")
 * .transitGatewayId("transitGatewayId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetable.html)
 */
public open class CfnTransitGatewayRouteTable(
  cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTable,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransitGatewayRouteTableProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTable(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTransitGatewayRouteTableProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransitGatewayRouteTableProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTransitGatewayRouteTableProps(props)
  )

  /**
   * The ID of the transit gateway route table.
   */
  public open fun attrTransitGatewayRouteTableId(): String =
      unwrap(this).getAttrTransitGatewayRouteTableId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Any tags assigned to the route table.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Any tags assigned to the route table.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Any tags assigned to the route table.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the transit gateway.
   */
  public open fun transitGatewayId(): String = unwrap(this).getTransitGatewayId()

  /**
   * The ID of the transit gateway.
   */
  public open fun transitGatewayId(`value`: String) {
    unwrap(this).setTransitGatewayId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnTransitGatewayRouteTable].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Any tags assigned to the route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetable.html#cfn-ec2-transitgatewayroutetable-tags)
     * @param tags Any tags assigned to the route table. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Any tags assigned to the route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetable.html#cfn-ec2-transitgatewayroutetable-tags)
     * @param tags Any tags assigned to the route table. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetable.html#cfn-ec2-transitgatewayroutetable-transitgatewayid)
     * @param transitGatewayId The ID of the transit gateway. 
     */
    public fun transitGatewayId(transitGatewayId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTable.Builder
        = software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTable.Builder.create(scope, id)

    /**
     * Any tags assigned to the route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetable.html#cfn-ec2-transitgatewayroutetable-tags)
     * @param tags Any tags assigned to the route table. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Any tags assigned to the route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetable.html#cfn-ec2-transitgatewayroutetable-tags)
     * @param tags Any tags assigned to the route table. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetable.html#cfn-ec2-transitgatewayroutetable-transitgatewayid)
     * @param transitGatewayId The ID of the transit gateway. 
     */
    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTable =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTable.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayRouteTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayRouteTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTable):
        CfnTransitGatewayRouteTable = CfnTransitGatewayRouteTable(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRouteTable):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTable = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTable
  }
}
