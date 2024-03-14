package io.cloudshiftdev.awscdk.services.synthetics

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

public open class CfnGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.synthetics.CfnGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Id of the group.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A name for the group.
   *
   * It can include any Unicode characters.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name for the group.
   *
   * It can include any Unicode characters.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ARNs of the canaries that you want to associate with this group.
   */
  public open fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

  /**
   * The ARNs of the canaries that you want to associate with this group.
   */
  public open fun resourceArns(`value`: List<String>) {
    unwrap(this).setResourceArns(`value`)
  }

  /**
   * The ARNs of the canaries that you want to associate with this group.
   */
  public open fun resourceArns(vararg `value`: String): Unit = resourceArns(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The list of key-value pairs that are associated with the group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The list of key-value pairs that are associated with the group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The list of key-value pairs that are associated with the group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.synthetics.CfnGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A name for the group. It can include any Unicode characters.
     *
     * The names for all groups in your account, across all Regions, must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-name)
     * @param name A name for the group. It can include any Unicode characters. 
     */
    public fun name(name: String)

    /**
     * The ARNs of the canaries that you want to associate with this group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-resourcearns)
     * @param resourceArns The ARNs of the canaries that you want to associate with this group. 
     */
    public fun resourceArns(resourceArns: List<String>)

    /**
     * The ARNs of the canaries that you want to associate with this group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-resourcearns)
     * @param resourceArns The ARNs of the canaries that you want to associate with this group. 
     */
    public fun resourceArns(vararg resourceArns: String)

    /**
     * The list of key-value pairs that are associated with the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-tags)
     * @param tags The list of key-value pairs that are associated with the group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The list of key-value pairs that are associated with the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-tags)
     * @param tags The list of key-value pairs that are associated with the group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.CfnGroup.Builder =
        software.amazon.awscdk.services.synthetics.CfnGroup.Builder.create(scope, id)

    /**
     * A name for the group. It can include any Unicode characters.
     *
     * The names for all groups in your account, across all Regions, must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-name)
     * @param name A name for the group. It can include any Unicode characters. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ARNs of the canaries that you want to associate with this group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-resourcearns)
     * @param resourceArns The ARNs of the canaries that you want to associate with this group. 
     */
    override fun resourceArns(resourceArns: List<String>) {
      cdkBuilder.resourceArns(resourceArns)
    }

    /**
     * The ARNs of the canaries that you want to associate with this group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-resourcearns)
     * @param resourceArns The ARNs of the canaries that you want to associate with this group. 
     */
    override fun resourceArns(vararg resourceArns: String): Unit =
        resourceArns(resourceArns.toList())

    /**
     * The list of key-value pairs that are associated with the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-tags)
     * @param tags The list of key-value pairs that are associated with the group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The list of key-value pairs that are associated with the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-tags)
     * @param tags The list of key-value pairs that are associated with the group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.synthetics.CfnGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnGroup): CfnGroup =
        CfnGroup(cdkObject)

    internal fun unwrap(wrapped: CfnGroup): software.amazon.awscdk.services.synthetics.CfnGroup =
        wrapped.cdkObject
  }
}
