@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appintegrations

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an event integration.
 *
 * You provide a name, description, and a reference to an Amazon EventBridge bus in your account and
 * a partner event source that will push events to that bus. No objects are created in your account,
 * only metadata that is persisted on the EventIntegration control plane.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appintegrations.*;
 * CfnEventIntegration cfnEventIntegration = CfnEventIntegration.Builder.create(this,
 * "MyCfnEventIntegration")
 * .eventBridgeBus("eventBridgeBus")
 * .eventFilter(EventFilterProperty.builder()
 * .source("source")
 * .build())
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html)
 */
public open class CfnEventIntegration(
  cdkObject: software.amazon.awscdk.services.appintegrations.CfnEventIntegration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventIntegrationProps,
  ) :
      this(software.amazon.awscdk.services.appintegrations.CfnEventIntegration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEventIntegrationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventIntegrationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventIntegrationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the event integration.
   */
  public open fun attrEventIntegrationArn(): String = unwrap(this).getAttrEventIntegrationArn()

  /**
   * The event integration description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The event integration description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The Amazon EventBridge bus for the event integration.
   */
  public open fun eventBridgeBus(): String = unwrap(this).getEventBridgeBus()

  /**
   * The Amazon EventBridge bus for the event integration.
   */
  public open fun eventBridgeBus(`value`: String) {
    unwrap(this).setEventBridgeBus(`value`)
  }

  /**
   * The event integration filter.
   */
  public open fun eventFilter(): Any = unwrap(this).getEventFilter()

  /**
   * The event integration filter.
   */
  public open fun eventFilter(`value`: IResolvable) {
    unwrap(this).setEventFilter(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The event integration filter.
   */
  public open fun eventFilter(`value`: EventFilterProperty) {
    unwrap(this).setEventFilter(`value`.let(EventFilterProperty.Companion::unwrap))
  }

  /**
   * The event integration filter.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("460cf4195c3f238b565223aae854251e58e1a76047c3f672f449b8315c3a37fe")
  public open fun eventFilter(`value`: EventFilterProperty.Builder.() -> Unit): Unit =
      eventFilter(EventFilterProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the event integration.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the event integration.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appintegrations.CfnEventIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The event integration description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-description)
     * @param description The event integration description. 
     */
    public fun description(description: String)

    /**
     * The Amazon EventBridge bus for the event integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventbridgebus)
     * @param eventBridgeBus The Amazon EventBridge bus for the event integration. 
     */
    public fun eventBridgeBus(eventBridgeBus: String)

    /**
     * The event integration filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventfilter)
     * @param eventFilter The event integration filter. 
     */
    public fun eventFilter(eventFilter: IResolvable)

    /**
     * The event integration filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventfilter)
     * @param eventFilter The event integration filter. 
     */
    public fun eventFilter(eventFilter: EventFilterProperty)

    /**
     * The event integration filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventfilter)
     * @param eventFilter The event integration filter. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cb1d4f55e176a54a6afd4cd01263922ef7c9a98ace6d5a4a98f7345ff7ea2dd")
    public fun eventFilter(eventFilter: EventFilterProperty.Builder.() -> Unit)

    /**
     * The name of the event integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-name)
     * @param name The name of the event integration. 
     */
    public fun name(name: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appintegrations.CfnEventIntegration.Builder =
        software.amazon.awscdk.services.appintegrations.CfnEventIntegration.Builder.create(scope,
        id)

    /**
     * The event integration description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-description)
     * @param description The event integration description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon EventBridge bus for the event integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventbridgebus)
     * @param eventBridgeBus The Amazon EventBridge bus for the event integration. 
     */
    override fun eventBridgeBus(eventBridgeBus: String) {
      cdkBuilder.eventBridgeBus(eventBridgeBus)
    }

    /**
     * The event integration filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventfilter)
     * @param eventFilter The event integration filter. 
     */
    override fun eventFilter(eventFilter: IResolvable) {
      cdkBuilder.eventFilter(eventFilter.let(IResolvable.Companion::unwrap))
    }

    /**
     * The event integration filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventfilter)
     * @param eventFilter The event integration filter. 
     */
    override fun eventFilter(eventFilter: EventFilterProperty) {
      cdkBuilder.eventFilter(eventFilter.let(EventFilterProperty.Companion::unwrap))
    }

    /**
     * The event integration filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventfilter)
     * @param eventFilter The event integration filter. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cb1d4f55e176a54a6afd4cd01263922ef7c9a98ace6d5a4a98f7345ff7ea2dd")
    override fun eventFilter(eventFilter: EventFilterProperty.Builder.() -> Unit): Unit =
        eventFilter(EventFilterProperty(eventFilter))

    /**
     * The name of the event integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-name)
     * @param name The name of the event integration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appintegrations.CfnEventIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appintegrations.CfnEventIntegration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventIntegration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnEventIntegration):
        CfnEventIntegration = CfnEventIntegration(cdkObject)

    internal fun unwrap(wrapped: CfnEventIntegration):
        software.amazon.awscdk.services.appintegrations.CfnEventIntegration = wrapped.cdkObject as
        software.amazon.awscdk.services.appintegrations.CfnEventIntegration
  }

  /**
   * The event integration filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appintegrations.*;
   * EventFilterProperty eventFilterProperty = EventFilterProperty.builder()
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-eventintegration-eventfilter.html)
   */
  public interface EventFilterProperty {
    /**
     * The source of the events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-eventintegration-eventfilter.html#cfn-appintegrations-eventintegration-eventfilter-source)
     */
    public fun source(): String

    /**
     * A builder for [EventFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param source The source of the events. 
       */
      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty.Builder
          =
          software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty.builder()

      /**
       * @param source The source of the events. 
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build():
          software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty,
    ) : CdkObject(cdkObject), EventFilterProperty {
      /**
       * The source of the events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-eventintegration-eventfilter.html#cfn-appintegrations-eventintegration-eventfilter-source)
       */
      override fun source(): String = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty):
          EventFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? EventFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventFilterProperty):
          software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty
    }
  }
}
