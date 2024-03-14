package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIPAMScope internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMScope,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the scope.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ARN of an IPAM.
   */
  public open fun attrIpamArn(): String = unwrap(this).getAttrIpamArn()

  /**
   * The ID of an IPAM scope.
   */
  public open fun attrIpamScopeId(): String = unwrap(this).getAttrIpamScopeId()

  /**
   * The type of the scope.
   */
  public open fun attrIpamScopeType(): String = unwrap(this).getAttrIpamScopeType()

  /**
   * Defines if the scope is the default scope or not.
   */
  public open fun attrIsDefault(): IResolvable =
      unwrap(this).getAttrIsDefault().let(IResolvable::wrap)

  /**
   * The number of pools in a scope.
   */
  public open fun attrPoolCount(): Number = unwrap(this).getAttrPoolCount()

  /**
   * The description of the scope.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the scope.
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
   * The ID of the IPAM for which you're creating this scope.
   */
  public open fun ipamId(): String = unwrap(this).getIpamId()

  /**
   * The ID of the IPAM for which you're creating this scope.
   */
  public open fun ipamId(`value`: String) {
    unwrap(this).setIpamId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The key/value combination of a tag assigned to the resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The key/value combination of a tag assigned to the resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The key/value combination of a tag assigned to the resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnIPAMScope].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the scope.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html#cfn-ec2-ipamscope-description)
     * @param description The description of the scope. 
     */
    public fun description(description: String)

    /**
     * The ID of the IPAM for which you're creating this scope.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html#cfn-ec2-ipamscope-ipamid)
     * @param ipamId The ID of the IPAM for which you're creating this scope. 
     */
    public fun ipamId(ipamId: String)

    /**
     * The key/value combination of a tag assigned to the resource.
     *
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html#cfn-ec2-ipamscope-tags)
     * @param tags The key/value combination of a tag assigned to the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The key/value combination of a tag assigned to the resource.
     *
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html#cfn-ec2-ipamscope-tags)
     * @param tags The key/value combination of a tag assigned to the resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMScope.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMScope.Builder.create(scope, id)

    /**
     * The description of the scope.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html#cfn-ec2-ipamscope-description)
     * @param description The description of the scope. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the IPAM for which you're creating this scope.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html#cfn-ec2-ipamscope-ipamid)
     * @param ipamId The ID of the IPAM for which you're creating this scope. 
     */
    override fun ipamId(ipamId: String) {
      cdkBuilder.ipamId(ipamId)
    }

    /**
     * The key/value combination of a tag assigned to the resource.
     *
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html#cfn-ec2-ipamscope-tags)
     * @param tags The key/value combination of a tag assigned to the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The key/value combination of a tag assigned to the resource.
     *
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html#cfn-ec2-ipamscope-tags)
     * @param tags The key/value combination of a tag assigned to the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMScope = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnIPAMScope.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPAMScope {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPAMScope(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMScope): CfnIPAMScope =
        CfnIPAMScope(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMScope): software.amazon.awscdk.services.ec2.CfnIPAMScope =
        wrapped.cdkObject
  }
}
