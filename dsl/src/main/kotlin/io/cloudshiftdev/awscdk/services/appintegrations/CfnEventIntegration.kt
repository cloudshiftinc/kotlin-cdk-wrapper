package io.cloudshiftdev.awscdk.services.appintegrations

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEventIntegration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.appintegrations.CfnEventIntegration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
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
    unwrap(this).setEventFilter(`value`.let(IResolvable::unwrap))
  }

  /**
   * The event integration filter.
   */
  public open fun eventFilter(`value`: EventFilterProperty) {
    unwrap(this).setEventFilter(`value`.let(EventFilterProperty::unwrap))
  }

  /**
   * The event integration filter.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("460cf4195c3f238b565223aae854251e58e1a76047c3f672f449b8315c3a37fe")
  public open fun eventFilter(`value`: EventFilterProperty.Builder.() -> Unit): Unit =
      eventFilter(EventFilterProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
      cdkBuilder.eventFilter(eventFilter.let(IResolvable::unwrap))
    }

    /**
     * The event integration filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventfilter)
     * @param eventFilter The event integration filter. 
     */
    override fun eventFilter(eventFilter: EventFilterProperty) {
      cdkBuilder.eventFilter(eventFilter.let(EventFilterProperty::unwrap))
    }

    /**
     * The event integration filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventfilter)
     * @param eventFilter The event integration filter. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
        software.amazon.awscdk.services.appintegrations.CfnEventIntegration = wrapped.cdkObject
  }

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
      override val cdkObject:
          software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty,
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
          EventFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventFilterProperty):
          software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty
    }
  }
}
