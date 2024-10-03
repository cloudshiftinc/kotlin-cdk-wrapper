@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resourceexplorer2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Turns on Resource Explorer in the AWS Region in which you called this operation by creating an
 * index.
 *
 * Resource Explorer begins discovering the resources in this Region and stores the details about
 * the resources in the index so that they can be queried by using the
 * [Search](https://docs.aws.amazon.com/resource-explorer/latest/apireference/API_Search.html)
 * operation.
 *
 * You can create either a local index that returns search results from only the AWS Region in which
 * the index exists, or you can create an aggregator index that returns search results from all AWS
 * Regions in the AWS account .
 *
 * For more details about what happens when you turn on Resource Explorer in an AWS Region , see
 * [Turning on Resource Explorer to index your resources in an AWS
 * Region](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-service-activate.html)
 * in the *AWS Resource Explorer User Guide.*
 *
 * If this is the first AWS Region in which you've created an index for Resource Explorer, this
 * operation also creates a service-linked role in your AWS account that allows Resource Explorer to
 * search for your resources and populate the index.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.resourceexplorer2.*;
 * CfnIndex cfnIndex = CfnIndex.Builder.create(this, "MyCfnIndex")
 * .type("type")
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html)
 */
public open class CfnIndex(
  cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnIndex,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIndexProps,
  ) :
      this(software.amazon.awscdk.services.resourceexplorer2.CfnIndex(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIndexProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIndexProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIndexProps(props)
  )

  /**
   * The ARN of the new index for the AWS Region . For example:.
   *
   * `arn:aws:resource-explorer-2:us-east-1:123456789012:index/EXAMPLE8-90ab-cdef-fedc-EXAMPLE22222`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Indicates the current state of the index. For example:.
   *
   * `CREATING`
   */
  public open fun attrIndexState(): String = unwrap(this).getAttrIndexState()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The specified tags are attached to only the index created in this AWS Region .
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * The specified tags are attached to only the index created in this AWS Region .
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * Specifies the type of the index in this Region.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * Specifies the type of the index in this Region.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.resourceexplorer2.CfnIndex].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The specified tags are attached to only the index created in this AWS Region .
     *
     * The tags don't attach to any of the resources listed in the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html#cfn-resourceexplorer2-index-tags)
     * @param tags The specified tags are attached to only the index created in this AWS Region . 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * Specifies the type of the index in this Region.
     *
     * For information about the aggregator index and how it differs from a local index, see
     * [Turning on cross-Region search by creating an aggregator
     * index](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html)
     * in the *AWS Resource Explorer User Guide.* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html#cfn-resourceexplorer2-index-type)
     * @param type Specifies the type of the index in this Region. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.resourceexplorer2.CfnIndex.Builder =
        software.amazon.awscdk.services.resourceexplorer2.CfnIndex.Builder.create(scope, id)

    /**
     * The specified tags are attached to only the index created in this AWS Region .
     *
     * The tags don't attach to any of the resources listed in the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html#cfn-resourceexplorer2-index-tags)
     * @param tags The specified tags are attached to only the index created in this AWS Region . 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * Specifies the type of the index in this Region.
     *
     * For information about the aggregator index and how it differs from a local index, see
     * [Turning on cross-Region search by creating an aggregator
     * index](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html)
     * in the *AWS Resource Explorer User Guide.* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html#cfn-resourceexplorer2-index-type)
     * @param type Specifies the type of the index in this Region. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.resourceexplorer2.CfnIndex =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.resourceexplorer2.CfnIndex.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIndex {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIndex(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnIndex):
        CfnIndex = CfnIndex(cdkObject)

    internal fun unwrap(wrapped: CfnIndex):
        software.amazon.awscdk.services.resourceexplorer2.CfnIndex = wrapped.cdkObject as
        software.amazon.awscdk.services.resourceexplorer2.CfnIndex
  }
}
