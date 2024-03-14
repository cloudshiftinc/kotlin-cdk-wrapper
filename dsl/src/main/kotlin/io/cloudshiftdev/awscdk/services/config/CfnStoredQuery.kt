package io.cloudshiftdev.awscdk.services.config

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

public open class CfnStoredQuery internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.config.CfnStoredQuery,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Amazon Resource Name (ARN) of the query.
   *
   * For example, arn:partition:service:region:account-id:resource-type/resource-name/resource-id.
   */
  public open fun attrQueryArn(): String = unwrap(this).getAttrQueryArn()

  /**
   * The ID of the query.
   */
  public open fun attrQueryId(): String = unwrap(this).getAttrQueryId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A unique description for the query.
   */
  public open fun queryDescription(): String? = unwrap(this).getQueryDescription()

  /**
   * A unique description for the query.
   */
  public open fun queryDescription(`value`: String) {
    unwrap(this).setQueryDescription(`value`)
  }

  /**
   * The expression of the query.
   */
  public open fun queryExpression(): String = unwrap(this).getQueryExpression()

  /**
   * The expression of the query.
   */
  public open fun queryExpression(`value`: String) {
    unwrap(this).setQueryExpression(`value`)
  }

  /**
   * The name of the query.
   */
  public open fun queryName(): String = unwrap(this).getQueryName()

  /**
   * The name of the query.
   */
  public open fun queryName(`value`: String) {
    unwrap(this).setQueryName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.config.CfnStoredQuery].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A unique description for the query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-querydescription)
     * @param queryDescription A unique description for the query. 
     */
    public fun queryDescription(queryDescription: String)

    /**
     * The expression of the query.
     *
     * For example, `SELECT resourceId, resourceType,
     * supplementaryConfiguration.BucketVersioningConfiguration.status WHERE resourceType =
     * 'AWS::S3::Bucket' AND supplementaryConfiguration.BucketVersioningConfiguration.status = 'Off'.`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-queryexpression)
     * @param queryExpression The expression of the query. 
     */
    public fun queryExpression(queryExpression: String)

    /**
     * The name of the query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-queryname)
     * @param queryName The name of the query. 
     */
    public fun queryName(queryName: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnStoredQuery.Builder =
        software.amazon.awscdk.services.config.CfnStoredQuery.Builder.create(scope, id)

    /**
     * A unique description for the query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-querydescription)
     * @param queryDescription A unique description for the query. 
     */
    override fun queryDescription(queryDescription: String) {
      cdkBuilder.queryDescription(queryDescription)
    }

    /**
     * The expression of the query.
     *
     * For example, `SELECT resourceId, resourceType,
     * supplementaryConfiguration.BucketVersioningConfiguration.status WHERE resourceType =
     * 'AWS::S3::Bucket' AND supplementaryConfiguration.BucketVersioningConfiguration.status = 'Off'.`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-queryexpression)
     * @param queryExpression The expression of the query. 
     */
    override fun queryExpression(queryExpression: String) {
      cdkBuilder.queryExpression(queryExpression)
    }

    /**
     * The name of the query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-queryname)
     * @param queryName The name of the query. 
     */
    override fun queryName(queryName: String) {
      cdkBuilder.queryName(queryName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.config.CfnStoredQuery = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStoredQuery {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStoredQuery(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnStoredQuery):
        CfnStoredQuery = CfnStoredQuery(cdkObject)

    internal fun unwrap(wrapped: CfnStoredQuery):
        software.amazon.awscdk.services.config.CfnStoredQuery = wrapped.cdkObject
  }
}
