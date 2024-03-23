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
 * Allocates an internet gateway for use with a VPC.
 *
 * After creating the Internet gateway, you then attach it to a VPC.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnInternetGateway cfnInternetGateway = CfnInternetGateway.Builder.create(this,
 * "MyCfnInternetGateway")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-internetgateway.html)
 */
public open class CfnInternetGateway(
  cdkObject: software.amazon.awscdk.services.ec2.CfnInternetGateway,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ec2.CfnInternetGateway(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInternetGatewayProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnInternetGateway(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnInternetGatewayProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInternetGatewayProps.Builder.() -> Unit,
  ) : this(scope, id, CfnInternetGatewayProps(props)
  )

  /**
   * The ID of the internet gateway.
   */
  public open fun attrInternetGatewayId(): String = unwrap(this).getAttrInternetGatewayId()

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
   * Any tags to assign to the internet gateway.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Any tags to assign to the internet gateway.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Any tags to assign to the internet gateway.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnInternetGateway].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Any tags to assign to the internet gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-internetgateway.html#cfn-ec2-internetgateway-tags)
     * @param tags Any tags to assign to the internet gateway. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Any tags to assign to the internet gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-internetgateway.html#cfn-ec2-internetgateway-tags)
     * @param tags Any tags to assign to the internet gateway. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnInternetGateway.Builder =
        software.amazon.awscdk.services.ec2.CfnInternetGateway.Builder.create(scope, id)

    /**
     * Any tags to assign to the internet gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-internetgateway.html#cfn-ec2-internetgateway-tags)
     * @param tags Any tags to assign to the internet gateway. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Any tags to assign to the internet gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-internetgateway.html#cfn-ec2-internetgateway-tags)
     * @param tags Any tags to assign to the internet gateway. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnInternetGateway = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnInternetGateway.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInternetGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInternetGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInternetGateway):
        CfnInternetGateway = CfnInternetGateway(cdkObject)

    internal fun unwrap(wrapped: CfnInternetGateway):
        software.amazon.awscdk.services.ec2.CfnInternetGateway = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnInternetGateway
  }
}
