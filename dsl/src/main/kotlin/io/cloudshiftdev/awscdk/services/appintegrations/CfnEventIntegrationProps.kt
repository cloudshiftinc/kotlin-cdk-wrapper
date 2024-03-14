package io.cloudshiftdev.awscdk.services.appintegrations

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnEventIntegrationProps {
  /**
   * The event integration description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon EventBridge bus for the event integration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventbridgebus)
   */
  public fun eventBridgeBus(): String

  /**
   * The event integration filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventfilter)
   */
  public fun eventFilter(): Any

  /**
   * The name of the event integration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-name)
   */
  public fun name(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEventIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The event integration description.
     */
    public fun description(description: String)

    /**
     * @param eventBridgeBus The Amazon EventBridge bus for the event integration. 
     */
    public fun eventBridgeBus(eventBridgeBus: String)

    /**
     * @param eventFilter The event integration filter. 
     */
    public fun eventFilter(eventFilter: IResolvable)

    /**
     * @param eventFilter The event integration filter. 
     */
    public fun eventFilter(eventFilter: CfnEventIntegration.EventFilterProperty)

    /**
     * @param eventFilter The event integration filter. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("705d0aed548b064586a91bab2cece68818501e2ba35ecd90bd0068936c771813")
    public fun eventFilter(eventFilter: CfnEventIntegration.EventFilterProperty.Builder.() -> Unit)

    /**
     * @param name The name of the event integration. 
     */
    public fun name(name: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps.Builder =
        software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps.builder()

    /**
     * @param description The event integration description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param eventBridgeBus The Amazon EventBridge bus for the event integration. 
     */
    override fun eventBridgeBus(eventBridgeBus: String) {
      cdkBuilder.eventBridgeBus(eventBridgeBus)
    }

    /**
     * @param eventFilter The event integration filter. 
     */
    override fun eventFilter(eventFilter: IResolvable) {
      cdkBuilder.eventFilter(eventFilter.let(IResolvable::unwrap))
    }

    /**
     * @param eventFilter The event integration filter. 
     */
    override fun eventFilter(eventFilter: CfnEventIntegration.EventFilterProperty) {
      cdkBuilder.eventFilter(eventFilter.let(CfnEventIntegration.EventFilterProperty::unwrap))
    }

    /**
     * @param eventFilter The event integration filter. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("705d0aed548b064586a91bab2cece68818501e2ba35ecd90bd0068936c771813")
    override
        fun eventFilter(eventFilter: CfnEventIntegration.EventFilterProperty.Builder.() -> Unit):
        Unit = eventFilter(CfnEventIntegration.EventFilterProperty(eventFilter))

    /**
     * @param name The name of the event integration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps,
  ) : CdkObject(cdkObject), CfnEventIntegrationProps {
    /**
     * The event integration description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon EventBridge bus for the event integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventbridgebus)
     */
    override fun eventBridgeBus(): String = unwrap(this).getEventBridgeBus()

    /**
     * The event integration filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-eventfilter)
     */
    override fun eventFilter(): Any = unwrap(this).getEventFilter()

    /**
     * The name of the event integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html#cfn-appintegrations-eventintegration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps):
        CfnEventIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventIntegrationProps):
        software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps
  }
}
