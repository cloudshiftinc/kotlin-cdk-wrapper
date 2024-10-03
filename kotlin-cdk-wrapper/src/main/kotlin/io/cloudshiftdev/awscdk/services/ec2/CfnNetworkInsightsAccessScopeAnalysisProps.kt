@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnNetworkInsightsAccessScopeAnalysis`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnNetworkInsightsAccessScopeAnalysisProps cfnNetworkInsightsAccessScopeAnalysisProps =
 * CfnNetworkInsightsAccessScopeAnalysisProps.builder()
 * .networkInsightsAccessScopeId("networkInsightsAccessScopeId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html)
 */
public interface CfnNetworkInsightsAccessScopeAnalysisProps {
  /**
   * The ID of the Network Access Scope.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html#cfn-ec2-networkinsightsaccessscopeanalysis-networkinsightsaccessscopeid)
   */
  public fun networkInsightsAccessScopeId(): String

  /**
   * The tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html#cfn-ec2-networkinsightsaccessscopeanalysis-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnNetworkInsightsAccessScopeAnalysisProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param networkInsightsAccessScopeId The ID of the Network Access Scope. 
     */
    public fun networkInsightsAccessScopeId(networkInsightsAccessScopeId: String)

    /**
     * @param tags The tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps.builder()

    /**
     * @param networkInsightsAccessScopeId The ID of the Network Access Scope. 
     */
    override fun networkInsightsAccessScopeId(networkInsightsAccessScopeId: String) {
      cdkBuilder.networkInsightsAccessScopeId(networkInsightsAccessScopeId)
    }

    /**
     * @param tags The tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps,
  ) : CdkObject(cdkObject),
      CfnNetworkInsightsAccessScopeAnalysisProps {
    /**
     * The ID of the Network Access Scope.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html#cfn-ec2-networkinsightsaccessscopeanalysis-networkinsightsaccessscopeid)
     */
    override fun networkInsightsAccessScopeId(): String =
        unwrap(this).getNetworkInsightsAccessScopeId()

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html#cfn-ec2-networkinsightsaccessscopeanalysis-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnNetworkInsightsAccessScopeAnalysisProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps):
        CfnNetworkInsightsAccessScopeAnalysisProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnNetworkInsightsAccessScopeAnalysisProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInsightsAccessScopeAnalysisProps):
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps
  }
}
