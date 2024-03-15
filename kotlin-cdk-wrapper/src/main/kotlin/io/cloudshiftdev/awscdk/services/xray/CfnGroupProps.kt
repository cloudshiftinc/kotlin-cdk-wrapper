@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.xray

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.xray.*;
 * CfnGroupProps cfnGroupProps = CfnGroupProps.builder()
 * .groupName("groupName")
 * // the properties below are optional
 * .filterExpression("filterExpression")
 * .insightsConfiguration(InsightsConfigurationProperty.builder()
 * .insightsEnabled(false)
 * .notificationsEnabled(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html)
 */
public interface CfnGroupProps {
  /**
   * The filter expression defining the parameters to include traces.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-filterexpression)
   */
  public fun filterExpression(): String? = unwrap(this).getFilterExpression()

  /**
   * The unique case-sensitive name of the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-groupname)
   */
  public fun groupName(): String

  /**
   * The structure containing configurations related to insights.
   *
   * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
   * disable insights for the group.
   * * The NotificationsEnabled boolean can be set to true to enable insights notifications through
   * Amazon EventBridge for the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-insightsconfiguration)
   */
  public fun insightsConfiguration(): Any? = unwrap(this).getInsightsConfiguration()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param filterExpression The filter expression defining the parameters to include traces.
     */
    public fun filterExpression(filterExpression: String)

    /**
     * @param groupName The unique case-sensitive name of the group. 
     */
    public fun groupName(groupName: String)

    /**
     * @param insightsConfiguration The structure containing configurations related to insights.
     * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
     * disable insights for the group.
     * * The NotificationsEnabled boolean can be set to true to enable insights notifications
     * through Amazon EventBridge for the group.
     */
    public fun insightsConfiguration(insightsConfiguration: IResolvable)

    /**
     * @param insightsConfiguration The structure containing configurations related to insights.
     * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
     * disable insights for the group.
     * * The NotificationsEnabled boolean can be set to true to enable insights notifications
     * through Amazon EventBridge for the group.
     */
    public fun insightsConfiguration(insightsConfiguration: CfnGroup.InsightsConfigurationProperty)

    /**
     * @param insightsConfiguration The structure containing configurations related to insights.
     * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
     * disable insights for the group.
     * * The NotificationsEnabled boolean can be set to true to enable insights notifications
     * through Amazon EventBridge for the group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f688e96f135b85484005cdd9f1b4e254c33776f7c9c31d5524c29e661cd007d")
    public
        fun insightsConfiguration(insightsConfiguration: CfnGroup.InsightsConfigurationProperty.Builder.() -> Unit)

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
    private val cdkBuilder: software.amazon.awscdk.services.xray.CfnGroupProps.Builder =
        software.amazon.awscdk.services.xray.CfnGroupProps.builder()

    /**
     * @param filterExpression The filter expression defining the parameters to include traces.
     */
    override fun filterExpression(filterExpression: String) {
      cdkBuilder.filterExpression(filterExpression)
    }

    /**
     * @param groupName The unique case-sensitive name of the group. 
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    /**
     * @param insightsConfiguration The structure containing configurations related to insights.
     * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
     * disable insights for the group.
     * * The NotificationsEnabled boolean can be set to true to enable insights notifications
     * through Amazon EventBridge for the group.
     */
    override fun insightsConfiguration(insightsConfiguration: IResolvable) {
      cdkBuilder.insightsConfiguration(insightsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param insightsConfiguration The structure containing configurations related to insights.
     * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
     * disable insights for the group.
     * * The NotificationsEnabled boolean can be set to true to enable insights notifications
     * through Amazon EventBridge for the group.
     */
    override
        fun insightsConfiguration(insightsConfiguration: CfnGroup.InsightsConfigurationProperty) {
      cdkBuilder.insightsConfiguration(insightsConfiguration.let(CfnGroup.InsightsConfigurationProperty::unwrap))
    }

    /**
     * @param insightsConfiguration The structure containing configurations related to insights.
     * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
     * disable insights for the group.
     * * The NotificationsEnabled boolean can be set to true to enable insights notifications
     * through Amazon EventBridge for the group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f688e96f135b85484005cdd9f1b4e254c33776f7c9c31d5524c29e661cd007d")
    override
        fun insightsConfiguration(insightsConfiguration: CfnGroup.InsightsConfigurationProperty.Builder.() -> Unit):
        Unit = insightsConfiguration(CfnGroup.InsightsConfigurationProperty(insightsConfiguration))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.xray.CfnGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.xray.CfnGroupProps,
  ) : CdkObject(cdkObject), CfnGroupProps {
    /**
     * The filter expression defining the parameters to include traces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-filterexpression)
     */
    override fun filterExpression(): String? = unwrap(this).getFilterExpression()

    /**
     * The unique case-sensitive name of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-groupname)
     */
    override fun groupName(): String = unwrap(this).getGroupName()

    /**
     * The structure containing configurations related to insights.
     *
     * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
     * disable insights for the group.
     * * The NotificationsEnabled boolean can be set to true to enable insights notifications
     * through Amazon EventBridge for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-insightsconfiguration)
     */
    override fun insightsConfiguration(): Any? = unwrap(this).getInsightsConfiguration()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnGroupProps): CfnGroupProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupProps): software.amazon.awscdk.services.xray.CfnGroupProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.xray.CfnGroupProps
  }
}
