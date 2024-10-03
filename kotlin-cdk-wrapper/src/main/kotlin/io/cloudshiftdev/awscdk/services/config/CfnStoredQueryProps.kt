@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnStoredQuery`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.config.*;
 * CfnStoredQueryProps cfnStoredQueryProps = CfnStoredQueryProps.builder()
 * .queryExpression("queryExpression")
 * .queryName("queryName")
 * // the properties below are optional
 * .queryDescription("queryDescription")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html)
 */
public interface CfnStoredQueryProps {
  /**
   * A unique description for the query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-querydescription)
   */
  public fun queryDescription(): String? = unwrap(this).getQueryDescription()

  /**
   * The expression of the query.
   *
   * For example, `SELECT resourceId, resourceType,
   * supplementaryConfiguration.BucketVersioningConfiguration.status WHERE resourceType =
   * 'AWS::S3::Bucket' AND supplementaryConfiguration.BucketVersioningConfiguration.status = 'Off'.`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-queryexpression)
   */
  public fun queryExpression(): String

  /**
   * The name of the query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-queryname)
   */
  public fun queryName(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnStoredQueryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param queryDescription A unique description for the query.
     */
    public fun queryDescription(queryDescription: String)

    /**
     * @param queryExpression The expression of the query. 
     * For example, `SELECT resourceId, resourceType,
     * supplementaryConfiguration.BucketVersioningConfiguration.status WHERE resourceType =
     * 'AWS::S3::Bucket' AND supplementaryConfiguration.BucketVersioningConfiguration.status = 'Off'.`
     */
    public fun queryExpression(queryExpression: String)

    /**
     * @param queryName The name of the query. 
     */
    public fun queryName(queryName: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnStoredQueryProps.Builder =
        software.amazon.awscdk.services.config.CfnStoredQueryProps.builder()

    /**
     * @param queryDescription A unique description for the query.
     */
    override fun queryDescription(queryDescription: String) {
      cdkBuilder.queryDescription(queryDescription)
    }

    /**
     * @param queryExpression The expression of the query. 
     * For example, `SELECT resourceId, resourceType,
     * supplementaryConfiguration.BucketVersioningConfiguration.status WHERE resourceType =
     * 'AWS::S3::Bucket' AND supplementaryConfiguration.BucketVersioningConfiguration.status = 'Off'.`
     */
    override fun queryExpression(queryExpression: String) {
      cdkBuilder.queryExpression(queryExpression)
    }

    /**
     * @param queryName The name of the query. 
     */
    override fun queryName(queryName: String) {
      cdkBuilder.queryName(queryName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.config.CfnStoredQueryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.config.CfnStoredQueryProps,
  ) : CdkObject(cdkObject),
      CfnStoredQueryProps {
    /**
     * A unique description for the query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-querydescription)
     */
    override fun queryDescription(): String? = unwrap(this).getQueryDescription()

    /**
     * The expression of the query.
     *
     * For example, `SELECT resourceId, resourceType,
     * supplementaryConfiguration.BucketVersioningConfiguration.status WHERE resourceType =
     * 'AWS::S3::Bucket' AND supplementaryConfiguration.BucketVersioningConfiguration.status = 'Off'.`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-queryexpression)
     */
    override fun queryExpression(): String = unwrap(this).getQueryExpression()

    /**
     * The name of the query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-queryname)
     */
    override fun queryName(): String = unwrap(this).getQueryName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStoredQueryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnStoredQueryProps):
        CfnStoredQueryProps = CdkObjectWrappers.wrap(cdkObject) as? CfnStoredQueryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStoredQueryProps):
        software.amazon.awscdk.services.config.CfnStoredQueryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.config.CfnStoredQueryProps
  }
}
