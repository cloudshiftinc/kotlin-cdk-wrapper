package io.cloudshiftdev.awscdk.services.redshift

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

public open class CfnClusterSecurityGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A description for the security group.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * A description for the security group.
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
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies an arbitrary set of tags (key–value pairs) to associate with this security group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Specifies an arbitrary set of tags (key–value pairs) to associate with this security group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Specifies an arbitrary set of tags (key–value pairs) to associate with this security group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.redshift.CfnClusterSecurityGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html#cfn-redshift-clustersecuritygroup-description)
     * @param description A description for the security group. 
     */
    public fun description(description: String)

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this security group.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html#cfn-redshift-clustersecuritygroup-tags)
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     * security group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this security group.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html#cfn-redshift-clustersecuritygroup-tags)
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     * security group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup.Builder
        = software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup.Builder.create(scope, id)

    /**
     * A description for the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html#cfn-redshift-clustersecuritygroup-description)
     * @param description A description for the security group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this security group.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html#cfn-redshift-clustersecuritygroup-tags)
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     * security group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this security group.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html#cfn-redshift-clustersecuritygroup-tags)
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     * security group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnClusterSecurityGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnClusterSecurityGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup):
        CfnClusterSecurityGroup = CfnClusterSecurityGroup(cdkObject)

    internal fun unwrap(wrapped: CfnClusterSecurityGroup):
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup = wrapped.cdkObject
  }
}
