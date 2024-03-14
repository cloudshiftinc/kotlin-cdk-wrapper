package io.cloudshiftdev.awscdk.services.networkmanager

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

public open class CfnGlobalNetwork internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.networkmanager.CfnGlobalNetwork,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the global network.
   *
   * For example,
   * `arn:aws:networkmanager::123456789012:global-network/global-network-01231231231231231` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the global network.
   *
   * For example, `global-network-01231231231231231` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The date and time that the global network was created.
   */
  public open fun createdAt(): String? = unwrap(this).getCreatedAt()

  /**
   * The date and time that the global network was created.
   */
  public open fun createdAt(`value`: String) {
    unwrap(this).setCreatedAt(`value`)
  }

  /**
   * A description of the global network.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the global network.
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
   * The state of the global network.
   */
  public open fun state(): String? = unwrap(this).getState()

  /**
   * The state of the global network.
   */
  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the global network.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the global network.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the global network.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.networkmanager.CfnGlobalNetwork].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The date and time that the global network was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-createdat)
     * @param createdAt The date and time that the global network was created. 
     */
    public fun createdAt(createdAt: String)

    /**
     * A description of the global network.
     *
     * Constraints: Maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-description)
     * @param description A description of the global network. 
     */
    public fun description(description: String)

    /**
     * The state of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-state)
     * @param state The state of the global network. 
     */
    public fun state(state: String)

    /**
     * The tags for the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-tags)
     * @param tags The tags for the global network. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-tags)
     * @param tags The tags for the global network. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnGlobalNetwork.Builder
        = software.amazon.awscdk.services.networkmanager.CfnGlobalNetwork.Builder.create(scope, id)

    /**
     * The date and time that the global network was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-createdat)
     * @param createdAt The date and time that the global network was created. 
     */
    override fun createdAt(createdAt: String) {
      cdkBuilder.createdAt(createdAt)
    }

    /**
     * A description of the global network.
     *
     * Constraints: Maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-description)
     * @param description A description of the global network. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The state of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-state)
     * @param state The state of the global network. 
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * The tags for the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-tags)
     * @param tags The tags for the global network. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-tags)
     * @param tags The tags for the global network. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnGlobalNetwork =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGlobalNetwork {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGlobalNetwork(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnGlobalNetwork):
        CfnGlobalNetwork = CfnGlobalNetwork(cdkObject)

    internal fun unwrap(wrapped: CfnGlobalNetwork):
        software.amazon.awscdk.services.networkmanager.CfnGlobalNetwork = wrapped.cdkObject
  }
}
