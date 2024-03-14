package io.cloudshiftdev.awscdk.services.xray

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.xray.CfnGroup,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The group ARN that was created or updated.
   */
  public open fun attrGroupArn(): String = unwrap(this).getAttrGroupArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The filter expression defining the parameters to include traces.
   */
  public open fun filterExpression(): String? = unwrap(this).getFilterExpression()

  /**
   * The filter expression defining the parameters to include traces.
   */
  public open fun filterExpression(`value`: String) {
    unwrap(this).setFilterExpression(`value`)
  }

  /**
   * The unique case-sensitive name of the group.
   */
  public open fun groupName(): String = unwrap(this).getGroupName()

  /**
   * The unique case-sensitive name of the group.
   */
  public open fun groupName(`value`: String) {
    unwrap(this).setGroupName(`value`)
  }

  /**
   * The structure containing configurations related to insights.
   */
  public open fun insightsConfiguration(): Any? = unwrap(this).getInsightsConfiguration()

  /**
   * The structure containing configurations related to insights.
   */
  public open fun insightsConfiguration(`value`: IResolvable) {
    unwrap(this).setInsightsConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The structure containing configurations related to insights.
   */
  public open fun insightsConfiguration(`value`: InsightsConfigurationProperty) {
    unwrap(this).setInsightsConfiguration(`value`.let(InsightsConfigurationProperty::unwrap))
  }

  /**
   * The structure containing configurations related to insights.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6e7a1b1ee0c528a291571125f084fe3f352b6eee004c646e010cd75b4d911253")
  public open fun insightsConfiguration(`value`: InsightsConfigurationProperty.Builder.() -> Unit):
      Unit = insightsConfiguration(InsightsConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.xray.CfnGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The filter expression defining the parameters to include traces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-filterexpression)
     * @param filterExpression The filter expression defining the parameters to include traces. 
     */
    public fun filterExpression(filterExpression: String)

    /**
     * The unique case-sensitive name of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-groupname)
     * @param groupName The unique case-sensitive name of the group. 
     */
    public fun groupName(groupName: String)

    /**
     * The structure containing configurations related to insights.
     *
     * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
     * disable insights for the group.
     * * The NotificationsEnabled boolean can be set to true to enable insights notifications
     * through Amazon EventBridge for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-insightsconfiguration)
     * @param insightsConfiguration The structure containing configurations related to insights. 
     */
    public fun insightsConfiguration(insightsConfiguration: IResolvable)

    /**
     * The structure containing configurations related to insights.
     *
     * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
     * disable insights for the group.
     * * The NotificationsEnabled boolean can be set to true to enable insights notifications
     * through Amazon EventBridge for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-insightsconfiguration)
     * @param insightsConfiguration The structure containing configurations related to insights. 
     */
    public fun insightsConfiguration(insightsConfiguration: InsightsConfigurationProperty)

    /**
     * The structure containing configurations related to insights.
     *
     * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
     * disable insights for the group.
     * * The NotificationsEnabled boolean can be set to true to enable insights notifications
     * through Amazon EventBridge for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-insightsconfiguration)
     * @param insightsConfiguration The structure containing configurations related to insights. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e14f6cec07b18027436bd71c2f8cbcc7699546fea0b70fd3021cfc68390e860")
    public
        fun insightsConfiguration(insightsConfiguration: InsightsConfigurationProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.xray.CfnGroup.Builder =
        software.amazon.awscdk.services.xray.CfnGroup.Builder.create(scope, id)

    /**
     * The filter expression defining the parameters to include traces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-filterexpression)
     * @param filterExpression The filter expression defining the parameters to include traces. 
     */
    override fun filterExpression(filterExpression: String) {
      cdkBuilder.filterExpression(filterExpression)
    }

    /**
     * The unique case-sensitive name of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-groupname)
     * @param groupName The unique case-sensitive name of the group. 
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    /**
     * The structure containing configurations related to insights.
     *
     * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
     * disable insights for the group.
     * * The NotificationsEnabled boolean can be set to true to enable insights notifications
     * through Amazon EventBridge for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-insightsconfiguration)
     * @param insightsConfiguration The structure containing configurations related to insights. 
     */
    override fun insightsConfiguration(insightsConfiguration: IResolvable) {
      cdkBuilder.insightsConfiguration(insightsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The structure containing configurations related to insights.
     *
     * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
     * disable insights for the group.
     * * The NotificationsEnabled boolean can be set to true to enable insights notifications
     * through Amazon EventBridge for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-insightsconfiguration)
     * @param insightsConfiguration The structure containing configurations related to insights. 
     */
    override fun insightsConfiguration(insightsConfiguration: InsightsConfigurationProperty) {
      cdkBuilder.insightsConfiguration(insightsConfiguration.let(InsightsConfigurationProperty::unwrap))
    }

    /**
     * The structure containing configurations related to insights.
     *
     * * The InsightsEnabled boolean can be set to true to enable insights for the group or false to
     * disable insights for the group.
     * * The NotificationsEnabled boolean can be set to true to enable insights notifications
     * through Amazon EventBridge for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-insightsconfiguration)
     * @param insightsConfiguration The structure containing configurations related to insights. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e14f6cec07b18027436bd71c2f8cbcc7699546fea0b70fd3021cfc68390e860")
    override
        fun insightsConfiguration(insightsConfiguration: InsightsConfigurationProperty.Builder.() -> Unit):
        Unit = insightsConfiguration(InsightsConfigurationProperty(insightsConfiguration))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html#cfn-xray-group-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.xray.CfnGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.xray.CfnGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnGroup): CfnGroup =
        CfnGroup(cdkObject)

    internal fun unwrap(wrapped: CfnGroup): software.amazon.awscdk.services.xray.CfnGroup =
        wrapped.cdkObject
  }

  public interface InsightsConfigurationProperty {
    /**
     * Set the InsightsEnabled value to true to enable insights or false to disable insights.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-group-insightsconfiguration.html#cfn-xray-group-insightsconfiguration-insightsenabled)
     */
    public fun insightsEnabled(): Any? = unwrap(this).getInsightsEnabled()

    /**
     * Set the NotificationsEnabled value to true to enable insights notifications.
     *
     * Notifications can only be enabled on a group with InsightsEnabled set to true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-group-insightsconfiguration.html#cfn-xray-group-insightsconfiguration-notificationsenabled)
     */
    public fun notificationsEnabled(): Any? = unwrap(this).getNotificationsEnabled()

    /**
     * A builder for [InsightsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param insightsEnabled Set the InsightsEnabled value to true to enable insights or false to
       * disable insights.
       */
      public fun insightsEnabled(insightsEnabled: Boolean)

      /**
       * @param insightsEnabled Set the InsightsEnabled value to true to enable insights or false to
       * disable insights.
       */
      public fun insightsEnabled(insightsEnabled: IResolvable)

      /**
       * @param notificationsEnabled Set the NotificationsEnabled value to true to enable insights
       * notifications.
       * Notifications can only be enabled on a group with InsightsEnabled set to true.
       */
      public fun notificationsEnabled(notificationsEnabled: Boolean)

      /**
       * @param notificationsEnabled Set the NotificationsEnabled value to true to enable insights
       * notifications.
       * Notifications can only be enabled on a group with InsightsEnabled set to true.
       */
      public fun notificationsEnabled(notificationsEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty.Builder =
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty.builder()

      /**
       * @param insightsEnabled Set the InsightsEnabled value to true to enable insights or false to
       * disable insights.
       */
      override fun insightsEnabled(insightsEnabled: Boolean) {
        cdkBuilder.insightsEnabled(insightsEnabled)
      }

      /**
       * @param insightsEnabled Set the InsightsEnabled value to true to enable insights or false to
       * disable insights.
       */
      override fun insightsEnabled(insightsEnabled: IResolvable) {
        cdkBuilder.insightsEnabled(insightsEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param notificationsEnabled Set the NotificationsEnabled value to true to enable insights
       * notifications.
       * Notifications can only be enabled on a group with InsightsEnabled set to true.
       */
      override fun notificationsEnabled(notificationsEnabled: Boolean) {
        cdkBuilder.notificationsEnabled(notificationsEnabled)
      }

      /**
       * @param notificationsEnabled Set the NotificationsEnabled value to true to enable insights
       * notifications.
       * Notifications can only be enabled on a group with InsightsEnabled set to true.
       */
      override fun notificationsEnabled(notificationsEnabled: IResolvable) {
        cdkBuilder.notificationsEnabled(notificationsEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty,
    ) : CdkObject(cdkObject), InsightsConfigurationProperty {
      /**
       * Set the InsightsEnabled value to true to enable insights or false to disable insights.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-group-insightsconfiguration.html#cfn-xray-group-insightsconfiguration-insightsenabled)
       */
      override fun insightsEnabled(): Any? = unwrap(this).getInsightsEnabled()

      /**
       * Set the NotificationsEnabled value to true to enable insights notifications.
       *
       * Notifications can only be enabled on a group with InsightsEnabled set to true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-group-insightsconfiguration.html#cfn-xray-group-insightsconfiguration-notificationsenabled)
       */
      override fun notificationsEnabled(): Any? = unwrap(this).getNotificationsEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InsightsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty):
          InsightsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InsightsConfigurationProperty):
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty
    }
  }
}
