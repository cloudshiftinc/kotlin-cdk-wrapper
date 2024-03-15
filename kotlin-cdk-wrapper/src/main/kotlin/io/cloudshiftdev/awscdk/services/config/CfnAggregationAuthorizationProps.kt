@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnAggregationAuthorization`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.config.*;
 * CfnAggregationAuthorizationProps cfnAggregationAuthorizationProps =
 * CfnAggregationAuthorizationProps.builder()
 * .authorizedAccountId("authorizedAccountId")
 * .authorizedAwsRegion("authorizedAwsRegion")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html)
 */
public interface CfnAggregationAuthorizationProps {
  /**
   * The 12-digit account ID of the account authorized to aggregate data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedaccountid)
   */
  public fun authorizedAccountId(): String

  /**
   * The region authorized to collect aggregated data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedawsregion)
   */
  public fun authorizedAwsRegion(): String

  /**
   * An array of tag object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAggregationAuthorizationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizedAccountId The 12-digit account ID of the account authorized to aggregate
     * data. 
     */
    public fun authorizedAccountId(authorizedAccountId: String)

    /**
     * @param authorizedAwsRegion The region authorized to collect aggregated data. 
     */
    public fun authorizedAwsRegion(authorizedAwsRegion: String)

    /**
     * @param tags An array of tag object.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of tag object.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps.Builder =
        software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps.builder()

    /**
     * @param authorizedAccountId The 12-digit account ID of the account authorized to aggregate
     * data. 
     */
    override fun authorizedAccountId(authorizedAccountId: String) {
      cdkBuilder.authorizedAccountId(authorizedAccountId)
    }

    /**
     * @param authorizedAwsRegion The region authorized to collect aggregated data. 
     */
    override fun authorizedAwsRegion(authorizedAwsRegion: String) {
      cdkBuilder.authorizedAwsRegion(authorizedAwsRegion)
    }

    /**
     * @param tags An array of tag object.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of tag object.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps,
  ) : CdkObject(cdkObject), CfnAggregationAuthorizationProps {
    /**
     * The 12-digit account ID of the account authorized to aggregate data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedaccountid)
     */
    override fun authorizedAccountId(): String = unwrap(this).getAuthorizedAccountId()

    /**
     * The region authorized to collect aggregated data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedawsregion)
     */
    override fun authorizedAwsRegion(): String = unwrap(this).getAuthorizedAwsRegion()

    /**
     * An array of tag object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAggregationAuthorizationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps):
        CfnAggregationAuthorizationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAggregationAuthorizationProps):
        software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps
  }
}
