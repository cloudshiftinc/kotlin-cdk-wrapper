@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchserverless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCollection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
 * CfnCollectionProps cfnCollectionProps = CfnCollectionProps.builder()
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
public interface CfnCollectionProps {
  /**
   * A description of the collection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

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
   */
  public fun name(): String

  /**
   * Indicates whether to use standby replicas for the collection.
   *
   * You can't update this property after the collection is already created. If you attempt to
   * modify this property, the collection continues to use the original value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-standbyreplicas)
   */
  public fun standbyReplicas(): String? = unwrap(this).getStandbyReplicas()

  /**
   * An arbitrary set of tags (key–value pairs) to associate with the collection.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of collection.
   *
   * Possible values are `SEARCH` , `TIMESERIES` , and `VECTORSEARCH` . For more information, see
   * [Choosing a collection
   * type](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html#serverless-usecase)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * A builder for [CfnCollectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the collection.
     */
    public fun description(description: String)

    /**
     * @param name The name of the collection. 
     * Collection names must meet the following criteria:
     *
     * * Starts with a lowercase letter
     * * Unique to your account and AWS Region
     * * Contains between 3 and 28 characters
     * * Contains only lowercase letters a-z, the numbers 0-9, and the hyphen (-)
     */
    public fun name(name: String)

    /**
     * @param standbyReplicas Indicates whether to use standby replicas for the collection.
     * You can't update this property after the collection is already created. If you attempt to
     * modify this property, the collection continues to use the original value.
     */
    public fun standbyReplicas(standbyReplicas: String)

    /**
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the collection.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the collection.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of collection.
     * Possible values are `SEARCH` , `TIMESERIES` , and `VECTORSEARCH` . For more information, see
     * [Choosing a collection
     * type](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html#serverless-usecase)
     * .
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchserverless.CfnCollectionProps.Builder =
        software.amazon.awscdk.services.opensearchserverless.CfnCollectionProps.builder()

    /**
     * @param description A description of the collection.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the collection. 
     * Collection names must meet the following criteria:
     *
     * * Starts with a lowercase letter
     * * Unique to your account and AWS Region
     * * Contains between 3 and 28 characters
     * * Contains only lowercase letters a-z, the numbers 0-9, and the hyphen (-)
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param standbyReplicas Indicates whether to use standby replicas for the collection.
     * You can't update this property after the collection is already created. If you attempt to
     * modify this property, the collection continues to use the original value.
     */
    override fun standbyReplicas(standbyReplicas: String) {
      cdkBuilder.standbyReplicas(standbyReplicas)
    }

    /**
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the collection.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the collection.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of collection.
     * Possible values are `SEARCH` , `TIMESERIES` , and `VECTORSEARCH` . For more information, see
     * [Choosing a collection
     * type](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html#serverless-usecase)
     * .
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.opensearchserverless.CfnCollectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnCollectionProps,
  ) : CdkObject(cdkObject), CfnCollectionProps {
    /**
     * A description of the collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

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
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Indicates whether to use standby replicas for the collection.
     *
     * You can't update this property after the collection is already created. If you attempt to
     * modify this property, the collection continues to use the original value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-standbyreplicas)
     */
    override fun standbyReplicas(): String? = unwrap(this).getStandbyReplicas()

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the collection.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of collection.
     *
     * Possible values are `SEARCH` , `TIMESERIES` , and `VECTORSEARCH` . For more information, see
     * [Choosing a collection
     * type](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html#serverless-usecase)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-type)
     */
    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCollectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnCollectionProps):
        CfnCollectionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCollectionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCollectionProps):
        software.amazon.awscdk.services.opensearchserverless.CfnCollectionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.opensearchserverless.CfnCollectionProps
  }
}
