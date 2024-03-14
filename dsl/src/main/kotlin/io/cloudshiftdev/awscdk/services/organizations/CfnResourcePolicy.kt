package io.cloudshiftdev.awscdk.services.organizations

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourcePolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.organizations.CfnResourcePolicy,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Returns the Amazon Resource Name (ARN) of the policy.
   *
   * For example:
   * `arn:aws:organizations::111111111111:resourcepolicy/o-exampleorgid/rp-examplepolicyid111` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the unique identifier (ID) of the resource policy.
   *
   * For example: `rp-examplepolicyid111` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The policy text of the organization resource policy.
   */
  public open fun content(): Any = unwrap(this).getContent()

  /**
   * The policy text of the organization resource policy.
   */
  public open fun content(`value`: Any) {
    unwrap(this).setContent(`value`)
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
   * A list of tags that you want to attach to the newly created resource policy.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags that you want to attach to the newly created resource policy.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tags that you want to attach to the newly created resource policy.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.organizations.CfnResourcePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The policy text of the organization resource policy.
     *
     * You can specify the resource policy content as a JSON object or a JSON string.
     *
     *
     * When you specify the resource policy content as a JSON string, you can't perform drift
     * detection on the CloudFormation stack. For this reason, we recommend specifying the resource
     * policy content as a JSON object instead.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-resourcepolicy.html#cfn-organizations-resourcepolicy-content)
     * @param content The policy text of the organization resource policy. 
     */
    public fun content(content: Any)

    /**
     * A list of tags that you want to attach to the newly created resource policy.
     *
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * *AWS Organizations User Guide* .
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for the
     * resource policy, then the entire request fails and the resource policy is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-resourcepolicy.html#cfn-organizations-resourcepolicy-tags)
     * @param tags A list of tags that you want to attach to the newly created resource policy. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags that you want to attach to the newly created resource policy.
     *
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * *AWS Organizations User Guide* .
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for the
     * resource policy, then the entire request fails and the resource policy is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-resourcepolicy.html#cfn-organizations-resourcepolicy-tags)
     * @param tags A list of tags that you want to attach to the newly created resource policy. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.organizations.CfnResourcePolicy.Builder
        = software.amazon.awscdk.services.organizations.CfnResourcePolicy.Builder.create(scope, id)

    /**
     * The policy text of the organization resource policy.
     *
     * You can specify the resource policy content as a JSON object or a JSON string.
     *
     *
     * When you specify the resource policy content as a JSON string, you can't perform drift
     * detection on the CloudFormation stack. For this reason, we recommend specifying the resource
     * policy content as a JSON object instead.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-resourcepolicy.html#cfn-organizations-resourcepolicy-content)
     * @param content The policy text of the organization resource policy. 
     */
    override fun content(content: Any) {
      cdkBuilder.content(content)
    }

    /**
     * A list of tags that you want to attach to the newly created resource policy.
     *
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * *AWS Organizations User Guide* .
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for the
     * resource policy, then the entire request fails and the resource policy is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-resourcepolicy.html#cfn-organizations-resourcepolicy-tags)
     * @param tags A list of tags that you want to attach to the newly created resource policy. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tags that you want to attach to the newly created resource policy.
     *
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * *AWS Organizations User Guide* .
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for the
     * resource policy, then the entire request fails and the resource policy is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-resourcepolicy.html#cfn-organizations-resourcepolicy-tags)
     * @param tags A list of tags that you want to attach to the newly created resource policy. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.organizations.CfnResourcePolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourcePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourcePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.organizations.CfnResourcePolicy):
        CfnResourcePolicy = CfnResourcePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicy):
        software.amazon.awscdk.services.organizations.CfnResourcePolicy = wrapped.cdkObject
  }
}
