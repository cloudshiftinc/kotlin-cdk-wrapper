@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.notifications

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Configures a `NotificationConfiguration` for AWS User Notifications .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.notifications.*;
 * CfnNotificationConfiguration cfnNotificationConfiguration =
 * CfnNotificationConfiguration.Builder.create(this, "MyCfnNotificationConfiguration")
 * .description("description")
 * .name("name")
 * // the properties below are optional
 * .aggregationDuration("aggregationDuration")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html)
 */
public open class CfnNotificationConfiguration(
  cdkObject: software.amazon.awscdk.services.notifications.CfnNotificationConfiguration,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNotificationConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.notifications.CfnNotificationConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnNotificationConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNotificationConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNotificationConfigurationProps(props)
  )

  /**
   * The aggregation preference of the `NotificationConfiguration` .
   */
  public open fun aggregationDuration(): String? = unwrap(this).getAggregationDuration()

  /**
   * The aggregation preference of the `NotificationConfiguration` .
   */
  public open fun aggregationDuration(`value`: String) {
    unwrap(this).setAggregationDuration(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the `NotificationConfiguration` resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The creation time of the `NotificationConfiguration` .
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The current status of the `NotificationConfiguration` .
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the `NotificationConfiguration` .
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * The description of the `NotificationConfiguration` .
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the `NotificationConfiguration` .
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the `NotificationConfiguration` .
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A map of tags assigned to a `NotificationConfiguration` .
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A map of tags assigned to a `NotificationConfiguration` .
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A map of tags assigned to a `NotificationConfiguration` .
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.notifications.CfnNotificationConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The aggregation preference of the `NotificationConfiguration` .
     *
     * * Values:
     * * `LONG`
     * * Aggregate notifications for long periods of time (12 hours).
     * * `SHORT`
     * * Aggregate notifications for short periods of time (5 minutes).
     * * `NONE`
     * * Don't aggregate notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-aggregationduration)
     * @param aggregationDuration The aggregation preference of the `NotificationConfiguration` . 
     */
    public fun aggregationDuration(aggregationDuration: String)

    /**
     * The description of the `NotificationConfiguration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-description)
     * @param description The description of the `NotificationConfiguration` . 
     */
    public fun description(description: String)

    /**
     * The name of the `NotificationConfiguration` .
     *
     * Supports RFC 3986's unreserved characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-name)
     * @param name The name of the `NotificationConfiguration` . 
     */
    public fun name(name: String)

    /**
     * A map of tags assigned to a `NotificationConfiguration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-tags)
     * @param tags A map of tags assigned to a `NotificationConfiguration` . 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A map of tags assigned to a `NotificationConfiguration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-tags)
     * @param tags A map of tags assigned to a `NotificationConfiguration` . 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.notifications.CfnNotificationConfiguration.Builder =
        software.amazon.awscdk.services.notifications.CfnNotificationConfiguration.Builder.create(scope,
        id)

    /**
     * The aggregation preference of the `NotificationConfiguration` .
     *
     * * Values:
     * * `LONG`
     * * Aggregate notifications for long periods of time (12 hours).
     * * `SHORT`
     * * Aggregate notifications for short periods of time (5 minutes).
     * * `NONE`
     * * Don't aggregate notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-aggregationduration)
     * @param aggregationDuration The aggregation preference of the `NotificationConfiguration` . 
     */
    override fun aggregationDuration(aggregationDuration: String) {
      cdkBuilder.aggregationDuration(aggregationDuration)
    }

    /**
     * The description of the `NotificationConfiguration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-description)
     * @param description The description of the `NotificationConfiguration` . 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the `NotificationConfiguration` .
     *
     * Supports RFC 3986's unreserved characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-name)
     * @param name The name of the `NotificationConfiguration` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A map of tags assigned to a `NotificationConfiguration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-tags)
     * @param tags A map of tags assigned to a `NotificationConfiguration` . 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A map of tags assigned to a `NotificationConfiguration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-notificationconfiguration.html#cfn-notifications-notificationconfiguration-tags)
     * @param tags A map of tags assigned to a `NotificationConfiguration` . 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.notifications.CfnNotificationConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.notifications.CfnNotificationConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNotificationConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNotificationConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.notifications.CfnNotificationConfiguration):
        CfnNotificationConfiguration = CfnNotificationConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnNotificationConfiguration):
        software.amazon.awscdk.services.notifications.CfnNotificationConfiguration =
        wrapped.cdkObject as
        software.amazon.awscdk.services.notifications.CfnNotificationConfiguration
  }
}
