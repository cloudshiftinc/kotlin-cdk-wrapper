@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnSignalMap`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnSignalMapProps cfnSignalMapProps = CfnSignalMapProps.builder()
 * .discoveryEntryPointArn("discoveryEntryPointArn")
 * .name("name")
 * // the properties below are optional
 * .cloudWatchAlarmTemplateGroupIdentifiers(List.of("cloudWatchAlarmTemplateGroupIdentifiers"))
 * .description("description")
 * .eventBridgeRuleTemplateGroupIdentifiers(List.of("eventBridgeRuleTemplateGroupIdentifiers"))
 * .forceRediscovery(false)
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html)
 */
public interface CfnSignalMapProps {
  /**
   * A cloudwatch alarm template group's identifier.
   *
   * Can be either be its id or current name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-cloudwatchalarmtemplategroupidentifiers)
   */
  public fun cloudWatchAlarmTemplateGroupIdentifiers(): List<String> =
      unwrap(this).getCloudWatchAlarmTemplateGroupIdentifiers() ?: emptyList()

  /**
   * A resource's optional description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A top-level supported Amazon Web Services resource ARN to discover a signal map from.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-discoveryentrypointarn)
   */
  public fun discoveryEntryPointArn(): String

  /**
   * An eventbridge rule template group's identifier.
   *
   * Can be either be its id or current name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-eventbridgeruletemplategroupidentifiers)
   */
  public fun eventBridgeRuleTemplateGroupIdentifiers(): List<String> =
      unwrap(this).getEventBridgeRuleTemplateGroupIdentifiers() ?: emptyList()

  /**
   * If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is
   * provided.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-forcerediscovery)
   */
  public fun forceRediscovery(): Any? = unwrap(this).getForceRediscovery()

  /**
   * A resource's name.
   *
   * Names must be unique within the scope of a resource type in a specific region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-name)
   */
  public fun name(): String

  /**
   * Represents the tags associated with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnSignalMapProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cloudWatchAlarmTemplateGroupIdentifiers A cloudwatch alarm template group's
     * identifier.
     * Can be either be its id or current name.
     */
    public
        fun cloudWatchAlarmTemplateGroupIdentifiers(cloudWatchAlarmTemplateGroupIdentifiers: List<String>)

    /**
     * @param cloudWatchAlarmTemplateGroupIdentifiers A cloudwatch alarm template group's
     * identifier.
     * Can be either be its id or current name.
     */
    public fun cloudWatchAlarmTemplateGroupIdentifiers(vararg
        cloudWatchAlarmTemplateGroupIdentifiers: String)

    /**
     * @param description A resource's optional description.
     */
    public fun description(description: String)

    /**
     * @param discoveryEntryPointArn A top-level supported Amazon Web Services resource ARN to
     * discover a signal map from. 
     */
    public fun discoveryEntryPointArn(discoveryEntryPointArn: String)

    /**
     * @param eventBridgeRuleTemplateGroupIdentifiers An eventbridge rule template group's
     * identifier.
     * Can be either be its id or current name.
     */
    public
        fun eventBridgeRuleTemplateGroupIdentifiers(eventBridgeRuleTemplateGroupIdentifiers: List<String>)

    /**
     * @param eventBridgeRuleTemplateGroupIdentifiers An eventbridge rule template group's
     * identifier.
     * Can be either be its id or current name.
     */
    public fun eventBridgeRuleTemplateGroupIdentifiers(vararg
        eventBridgeRuleTemplateGroupIdentifiers: String)

    /**
     * @param forceRediscovery If true, will force a rediscovery of a signal map if an unchanged
     * discoveryEntryPointArn is provided.
     */
    public fun forceRediscovery(forceRediscovery: Boolean)

    /**
     * @param forceRediscovery If true, will force a rediscovery of a signal map if an unchanged
     * discoveryEntryPointArn is provided.
     */
    public fun forceRediscovery(forceRediscovery: IResolvable)

    /**
     * @param name A resource's name. 
     * Names must be unique within the scope of a resource type in a specific region.
     */
    public fun name(name: String)

    /**
     * @param tags Represents the tags associated with a resource.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnSignalMapProps.Builder =
        software.amazon.awscdk.services.medialive.CfnSignalMapProps.builder()

    /**
     * @param cloudWatchAlarmTemplateGroupIdentifiers A cloudwatch alarm template group's
     * identifier.
     * Can be either be its id or current name.
     */
    override
        fun cloudWatchAlarmTemplateGroupIdentifiers(cloudWatchAlarmTemplateGroupIdentifiers: List<String>) {
      cdkBuilder.cloudWatchAlarmTemplateGroupIdentifiers(cloudWatchAlarmTemplateGroupIdentifiers)
    }

    /**
     * @param cloudWatchAlarmTemplateGroupIdentifiers A cloudwatch alarm template group's
     * identifier.
     * Can be either be its id or current name.
     */
    override fun cloudWatchAlarmTemplateGroupIdentifiers(vararg
        cloudWatchAlarmTemplateGroupIdentifiers: String): Unit =
        cloudWatchAlarmTemplateGroupIdentifiers(cloudWatchAlarmTemplateGroupIdentifiers.toList())

    /**
     * @param description A resource's optional description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param discoveryEntryPointArn A top-level supported Amazon Web Services resource ARN to
     * discover a signal map from. 
     */
    override fun discoveryEntryPointArn(discoveryEntryPointArn: String) {
      cdkBuilder.discoveryEntryPointArn(discoveryEntryPointArn)
    }

    /**
     * @param eventBridgeRuleTemplateGroupIdentifiers An eventbridge rule template group's
     * identifier.
     * Can be either be its id or current name.
     */
    override
        fun eventBridgeRuleTemplateGroupIdentifiers(eventBridgeRuleTemplateGroupIdentifiers: List<String>) {
      cdkBuilder.eventBridgeRuleTemplateGroupIdentifiers(eventBridgeRuleTemplateGroupIdentifiers)
    }

    /**
     * @param eventBridgeRuleTemplateGroupIdentifiers An eventbridge rule template group's
     * identifier.
     * Can be either be its id or current name.
     */
    override fun eventBridgeRuleTemplateGroupIdentifiers(vararg
        eventBridgeRuleTemplateGroupIdentifiers: String): Unit =
        eventBridgeRuleTemplateGroupIdentifiers(eventBridgeRuleTemplateGroupIdentifiers.toList())

    /**
     * @param forceRediscovery If true, will force a rediscovery of a signal map if an unchanged
     * discoveryEntryPointArn is provided.
     */
    override fun forceRediscovery(forceRediscovery: Boolean) {
      cdkBuilder.forceRediscovery(forceRediscovery)
    }

    /**
     * @param forceRediscovery If true, will force a rediscovery of a signal map if an unchanged
     * discoveryEntryPointArn is provided.
     */
    override fun forceRediscovery(forceRediscovery: IResolvable) {
      cdkBuilder.forceRediscovery(forceRediscovery.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param name A resource's name. 
     * Names must be unique within the scope of a resource type in a specific region.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Represents the tags associated with a resource.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.medialive.CfnSignalMapProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.medialive.CfnSignalMapProps,
  ) : CdkObject(cdkObject),
      CfnSignalMapProps {
    /**
     * A cloudwatch alarm template group's identifier.
     *
     * Can be either be its id or current name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-cloudwatchalarmtemplategroupidentifiers)
     */
    override fun cloudWatchAlarmTemplateGroupIdentifiers(): List<String> =
        unwrap(this).getCloudWatchAlarmTemplateGroupIdentifiers() ?: emptyList()

    /**
     * A resource's optional description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A top-level supported Amazon Web Services resource ARN to discover a signal map from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-discoveryentrypointarn)
     */
    override fun discoveryEntryPointArn(): String = unwrap(this).getDiscoveryEntryPointArn()

    /**
     * An eventbridge rule template group's identifier.
     *
     * Can be either be its id or current name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-eventbridgeruletemplategroupidentifiers)
     */
    override fun eventBridgeRuleTemplateGroupIdentifiers(): List<String> =
        unwrap(this).getEventBridgeRuleTemplateGroupIdentifiers() ?: emptyList()

    /**
     * If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is
     * provided.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-forcerediscovery)
     */
    override fun forceRediscovery(): Any? = unwrap(this).getForceRediscovery()

    /**
     * A resource's name.
     *
     * Names must be unique within the scope of a resource type in a specific region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Represents the tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSignalMapProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnSignalMapProps):
        CfnSignalMapProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSignalMapProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSignalMapProps):
        software.amazon.awscdk.services.medialive.CfnSignalMapProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.medialive.CfnSignalMapProps
  }
}
