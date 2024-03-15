@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchserverless

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
 * Specifies an OpenSearch Serverless collection.
 *
 * For more information, see [Creating and managing Amazon OpenSearch Serverless
 * collections](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html)
 * in the *Amazon OpenSearch Service Developer Guide* .
 *
 *
 * You must create a matching [encryption
 * policy](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html)
 * in order for a collection to be created successfully. You can specify the policy resource within the
 * same CloudFormation template as the collection resource if you use the
 * [DependsOn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * attribute. See
 * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#aws-resource-opensearchserverless-collection--examples)
 * for a sample template. Otherwise the encryption policy must already exist before you create the
 * collection.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
 * CfnCollection cfnCollection = CfnCollection.Builder.create(this, "MyCfnCollection")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .standbyReplicas("standbyReplicas")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html)
 */
public open class CfnCollection internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.opensearchserverless.CfnCollection,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the collection.
   *
   * For example, `arn:aws:aoss:us-east-1:123456789012:collection/07tjusf2h91cunochc` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Collection-specific endpoint used to submit index, search, and data upload requests to an
   * OpenSearch Serverless collection.
   *
   * For example, `https://07tjusf2h91cunochc.us-east-1.aoss.amazonaws.com` .
   */
  public open fun attrCollectionEndpoint(): String = unwrap(this).getAttrCollectionEndpoint()

  /**
   * The collection-specific endpoint used to access OpenSearch Dashboards.
   *
   * For example, `https://07tjusf2h91cunochc.us-east-1.aoss.amazonaws.com/_dashboards` .
   */
  public open fun attrDashboardEndpoint(): String = unwrap(this).getAttrDashboardEndpoint()

  /**
   * A unique identifier for the collection.
   *
   * For example, `07tjusf2h91cunochc` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A description of the collection.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the collection.
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
   * The name of the collection.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the collection.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Indicates whether to use standby replicas for the collection.
   */
  public open fun standbyReplicas(): String? = unwrap(this).getStandbyReplicas()

  /**
   * Indicates whether to use standby replicas for the collection.
   */
  public open fun standbyReplicas(`value`: String) {
    unwrap(this).setStandbyReplicas(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An arbitrary set of tags (key–value pairs) to associate with the collection.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An arbitrary set of tags (key–value pairs) to associate with the collection.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An arbitrary set of tags (key–value pairs) to associate with the collection.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of collection.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * The type of collection.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.opensearchserverless.CfnCollection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-description)
     * @param description A description of the collection. 
     */
    public fun description(description: String)

    /**
     * The name of the collection.
     *
     * Collection names must meet the following criteria:
     *
     * * Starts with a lowercase letter
     * * Unique to your account and AWS Region
     * * Contains between 3 and 28 characters
     * * Contains only lowercase letters a-z, the numbers 0-9, and the hyphen (-)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-name)
     * @param name The name of the collection. 
     */
    public fun name(name: String)

    /**
     * Indicates whether to use standby replicas for the collection.
     *
     * You can't update this property after the collection is already created. If you attempt to
     * modify this property, the collection continues to use the original value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-standbyreplicas)
     * @param standbyReplicas Indicates whether to use standby replicas for the collection. 
     */
    public fun standbyReplicas(standbyReplicas: String)

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the collection.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-tags)
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the collection. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the collection.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-tags)
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the collection. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of collection.
     *
     * Possible values are `SEARCH` , `TIMESERIES` , and `VECTORSEARCH` . For more information, see
     * [Choosing a collection
     * type](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html#serverless-usecase)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-type)
     * @param type The type of collection. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchserverless.CfnCollection.Builder =
        software.amazon.awscdk.services.opensearchserverless.CfnCollection.Builder.create(scope, id)

    /**
     * A description of the collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-description)
     * @param description A description of the collection. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the collection.
     *
     * Collection names must meet the following criteria:
     *
     * * Starts with a lowercase letter
     * * Unique to your account and AWS Region
     * * Contains between 3 and 28 characters
     * * Contains only lowercase letters a-z, the numbers 0-9, and the hyphen (-)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-name)
     * @param name The name of the collection. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Indicates whether to use standby replicas for the collection.
     *
     * You can't update this property after the collection is already created. If you attempt to
     * modify this property, the collection continues to use the original value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-standbyreplicas)
     * @param standbyReplicas Indicates whether to use standby replicas for the collection. 
     */
    override fun standbyReplicas(standbyReplicas: String) {
      cdkBuilder.standbyReplicas(standbyReplicas)
    }

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the collection.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-tags)
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the collection. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the collection.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-tags)
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the collection. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of collection.
     *
     * Possible values are `SEARCH` , `TIMESERIES` , and `VECTORSEARCH` . For more information, see
     * [Choosing a collection
     * type](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html#serverless-usecase)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-type)
     * @param type The type of collection. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.opensearchserverless.CfnCollection =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.opensearchserverless.CfnCollection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCollection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCollection(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnCollection):
        CfnCollection = CfnCollection(cdkObject)

    internal fun unwrap(wrapped: CfnCollection):
        software.amazon.awscdk.services.opensearchserverless.CfnCollection = wrapped.cdkObject
  }
}
