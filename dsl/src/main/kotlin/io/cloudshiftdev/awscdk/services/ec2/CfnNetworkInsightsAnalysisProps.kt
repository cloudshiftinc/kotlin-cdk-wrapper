package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnNetworkInsightsAnalysisProps {
  /**
   * The member accounts that contain resources that the path can traverse.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-additionalaccounts)
   */
  public fun additionalAccounts(): List<String> = unwrap(this).getAdditionalAccounts() ?:
      emptyList()

  /**
   * The Amazon Resource Names (ARN) of the resources that the path must traverse.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-filterinarns)
   */
  public fun filterInArns(): List<String> = unwrap(this).getFilterInArns() ?: emptyList()

  /**
   * The ID of the path.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-networkinsightspathid)
   */
  public fun networkInsightsPathId(): String

  /**
   * The tags to apply.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnNetworkInsightsAnalysisProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalAccounts The member accounts that contain resources that the path can
     * traverse.
     */
    public fun additionalAccounts(additionalAccounts: List<String>)

    /**
     * @param additionalAccounts The member accounts that contain resources that the path can
     * traverse.
     */
    public fun additionalAccounts(vararg additionalAccounts: String)

    /**
     * @param filterInArns The Amazon Resource Names (ARN) of the resources that the path must
     * traverse.
     */
    public fun filterInArns(filterInArns: List<String>)

    /**
     * @param filterInArns The Amazon Resource Names (ARN) of the resources that the path must
     * traverse.
     */
    public fun filterInArns(vararg filterInArns: String)

    /**
     * @param networkInsightsPathId The ID of the path. 
     */
    public fun networkInsightsPathId(networkInsightsPathId: String)

    /**
     * @param tags The tags to apply.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to apply.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps.builder()

    /**
     * @param additionalAccounts The member accounts that contain resources that the path can
     * traverse.
     */
    override fun additionalAccounts(additionalAccounts: List<String>) {
      cdkBuilder.additionalAccounts(additionalAccounts)
    }

    /**
     * @param additionalAccounts The member accounts that contain resources that the path can
     * traverse.
     */
    override fun additionalAccounts(vararg additionalAccounts: String): Unit =
        additionalAccounts(additionalAccounts.toList())

    /**
     * @param filterInArns The Amazon Resource Names (ARN) of the resources that the path must
     * traverse.
     */
    override fun filterInArns(filterInArns: List<String>) {
      cdkBuilder.filterInArns(filterInArns)
    }

    /**
     * @param filterInArns The Amazon Resource Names (ARN) of the resources that the path must
     * traverse.
     */
    override fun filterInArns(vararg filterInArns: String): Unit =
        filterInArns(filterInArns.toList())

    /**
     * @param networkInsightsPathId The ID of the path. 
     */
    override fun networkInsightsPathId(networkInsightsPathId: String) {
      cdkBuilder.networkInsightsPathId(networkInsightsPathId)
    }

    /**
     * @param tags The tags to apply.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to apply.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps,
  ) : CdkObject(cdkObject), CfnNetworkInsightsAnalysisProps {
    /**
     * The member accounts that contain resources that the path can traverse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-additionalaccounts)
     */
    override fun additionalAccounts(): List<String> = unwrap(this).getAdditionalAccounts() ?:
        emptyList()

    /**
     * The Amazon Resource Names (ARN) of the resources that the path must traverse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-filterinarns)
     */
    override fun filterInArns(): List<String> = unwrap(this).getFilterInArns() ?: emptyList()

    /**
     * The ID of the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-networkinsightspathid)
     */
    override fun networkInsightsPathId(): String = unwrap(this).getNetworkInsightsPathId()

    /**
     * The tags to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsanalysis.html#cfn-ec2-networkinsightsanalysis-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkInsightsAnalysisProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps):
        CfnNetworkInsightsAnalysisProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInsightsAnalysisProps):
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps
  }
}
