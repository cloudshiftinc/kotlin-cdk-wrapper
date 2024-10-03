@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resourceexplorer2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnIndex`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.resourceexplorer2.*;
 * CfnIndexProps cfnIndexProps = CfnIndexProps.builder()
 * .type("type")
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html)
 */
public interface CfnIndexProps {
  /**
   * The specified tags are attached to only the index created in this AWS Region .
   *
   * The tags don't attach to any of the resources listed in the index.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html#cfn-resourceexplorer2-index-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Specifies the type of the index in this Region.
   *
   * For information about the aggregator index and how it differs from a local index, see [Turning
   * on cross-Region search by creating an aggregator
   * index](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html)
   * in the *AWS Resource Explorer User Guide.* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html#cfn-resourceexplorer2-index-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnIndexProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param tags The specified tags are attached to only the index created in this AWS Region .
     * The tags don't attach to any of the resources listed in the index.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param type Specifies the type of the index in this Region. 
     * For information about the aggregator index and how it differs from a local index, see
     * [Turning on cross-Region search by creating an aggregator
     * index](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html)
     * in the *AWS Resource Explorer User Guide.* .
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps.Builder
        = software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps.builder()

    /**
     * @param tags The specified tags are attached to only the index created in this AWS Region .
     * The tags don't attach to any of the resources listed in the index.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param type Specifies the type of the index in this Region. 
     * For information about the aggregator index and how it differs from a local index, see
     * [Turning on cross-Region search by creating an aggregator
     * index](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html)
     * in the *AWS Resource Explorer User Guide.* .
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps,
  ) : CdkObject(cdkObject),
      CfnIndexProps {
    /**
     * The specified tags are attached to only the index created in this AWS Region .
     *
     * The tags don't attach to any of the resources listed in the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html#cfn-resourceexplorer2-index-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * Specifies the type of the index in this Region.
     *
     * For information about the aggregator index and how it differs from a local index, see
     * [Turning on cross-Region search by creating an aggregator
     * index](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html)
     * in the *AWS Resource Explorer User Guide.* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html#cfn-resourceexplorer2-index-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIndexProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps):
        CfnIndexProps = CdkObjectWrappers.wrap(cdkObject) as? CfnIndexProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIndexProps):
        software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps
  }
}
