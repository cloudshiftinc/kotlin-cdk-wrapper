@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnEventTrigger`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
 * CfnEventTriggerProps cfnEventTriggerProps = CfnEventTriggerProps.builder()
 * .domainName("domainName")
 * .eventTriggerConditions(List.of(EventTriggerConditionProperty.builder()
 * .eventTriggerDimensions(List.of(EventTriggerDimensionProperty.builder()
 * .objectAttributes(List.of(ObjectAttributeProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .values(List.of("values"))
 * // the properties below are optional
 * .fieldName("fieldName")
 * .source("source")
 * .build()))
 * .build()))
 * .logicalOperator("logicalOperator")
 * .build()))
 * .eventTriggerName("eventTriggerName")
 * .objectTypeName("objectTypeName")
 * // the properties below are optional
 * .description("description")
 * .eventTriggerLimits(EventTriggerLimitsProperty.builder()
 * .eventExpiration(123)
 * .periods(List.of(PeriodProperty.builder()
 * .unit("unit")
 * .value(123)
 * // the properties below are optional
 * .maxInvocationsPerProfile(123)
 * .unlimited(false)
 * .build()))
 * .build())
 * .segmentFilter("segmentFilter")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html)
 */
public interface CfnEventTriggerProps {
  /**
   * The description of the event trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The unique name of the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-domainname)
   */
  public fun domainName(): String

  /**
   * A list of conditions that determine when an event should trigger the destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggerconditions)
   */
  public fun eventTriggerConditions(): Any

  /**
   * Defines limits controlling whether an event triggers the destination, based on ingestion
   * latency and the number of invocations per profile over specific time periods.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggerlimits)
   */
  public fun eventTriggerLimits(): Any? = unwrap(this).getEventTriggerLimits()

  /**
   * The unique name of the event trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggername)
   */
  public fun eventTriggerName(): String

  /**
   * The unique name of the object type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-objecttypename)
   */
  public fun objectTypeName(): String

  /**
   * The destination is triggered only for profiles that meet the criteria of a segment definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-segmentfilter)
   */
  public fun segmentFilter(): String? = unwrap(this).getSegmentFilter()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEventTriggerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the event trigger.
     */
    public fun description(description: String)

    /**
     * @param domainName The unique name of the domain. 
     */
    public fun domainName(domainName: String)

    /**
     * @param eventTriggerConditions A list of conditions that determine when an event should
     * trigger the destination. 
     */
    public fun eventTriggerConditions(eventTriggerConditions: IResolvable)

    /**
     * @param eventTriggerConditions A list of conditions that determine when an event should
     * trigger the destination. 
     */
    public fun eventTriggerConditions(eventTriggerConditions: List<Any>)

    /**
     * @param eventTriggerConditions A list of conditions that determine when an event should
     * trigger the destination. 
     */
    public fun eventTriggerConditions(vararg eventTriggerConditions: Any)

    /**
     * @param eventTriggerLimits Defines limits controlling whether an event triggers the
     * destination, based on ingestion latency and the number of invocations per profile over specific
     * time periods.
     */
    public fun eventTriggerLimits(eventTriggerLimits: IResolvable)

    /**
     * @param eventTriggerLimits Defines limits controlling whether an event triggers the
     * destination, based on ingestion latency and the number of invocations per profile over specific
     * time periods.
     */
    public fun eventTriggerLimits(eventTriggerLimits: CfnEventTrigger.EventTriggerLimitsProperty)

    /**
     * @param eventTriggerLimits Defines limits controlling whether an event triggers the
     * destination, based on ingestion latency and the number of invocations per profile over specific
     * time periods.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50ac51356ad3d7520c7ff2322c7db53a600380664f5c3e384260e7f0c40a0979")
    public
        fun eventTriggerLimits(eventTriggerLimits: CfnEventTrigger.EventTriggerLimitsProperty.Builder.() -> Unit)

    /**
     * @param eventTriggerName The unique name of the event trigger. 
     */
    public fun eventTriggerName(eventTriggerName: String)

    /**
     * @param objectTypeName The unique name of the object type. 
     */
    public fun objectTypeName(objectTypeName: String)

    /**
     * @param segmentFilter The destination is triggered only for profiles that meet the criteria of
     * a segment definition.
     */
    public fun segmentFilter(segmentFilter: String)

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
    private val cdkBuilder:
        software.amazon.awscdk.services.customerprofiles.CfnEventTriggerProps.Builder =
        software.amazon.awscdk.services.customerprofiles.CfnEventTriggerProps.builder()

    /**
     * @param description The description of the event trigger.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainName The unique name of the domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param eventTriggerConditions A list of conditions that determine when an event should
     * trigger the destination. 
     */
    override fun eventTriggerConditions(eventTriggerConditions: IResolvable) {
      cdkBuilder.eventTriggerConditions(eventTriggerConditions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param eventTriggerConditions A list of conditions that determine when an event should
     * trigger the destination. 
     */
    override fun eventTriggerConditions(eventTriggerConditions: List<Any>) {
      cdkBuilder.eventTriggerConditions(eventTriggerConditions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param eventTriggerConditions A list of conditions that determine when an event should
     * trigger the destination. 
     */
    override fun eventTriggerConditions(vararg eventTriggerConditions: Any): Unit =
        eventTriggerConditions(eventTriggerConditions.toList())

    /**
     * @param eventTriggerLimits Defines limits controlling whether an event triggers the
     * destination, based on ingestion latency and the number of invocations per profile over specific
     * time periods.
     */
    override fun eventTriggerLimits(eventTriggerLimits: IResolvable) {
      cdkBuilder.eventTriggerLimits(eventTriggerLimits.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param eventTriggerLimits Defines limits controlling whether an event triggers the
     * destination, based on ingestion latency and the number of invocations per profile over specific
     * time periods.
     */
    override
        fun eventTriggerLimits(eventTriggerLimits: CfnEventTrigger.EventTriggerLimitsProperty) {
      cdkBuilder.eventTriggerLimits(eventTriggerLimits.let(CfnEventTrigger.EventTriggerLimitsProperty.Companion::unwrap))
    }

    /**
     * @param eventTriggerLimits Defines limits controlling whether an event triggers the
     * destination, based on ingestion latency and the number of invocations per profile over specific
     * time periods.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50ac51356ad3d7520c7ff2322c7db53a600380664f5c3e384260e7f0c40a0979")
    override
        fun eventTriggerLimits(eventTriggerLimits: CfnEventTrigger.EventTriggerLimitsProperty.Builder.() -> Unit):
        Unit = eventTriggerLimits(CfnEventTrigger.EventTriggerLimitsProperty(eventTriggerLimits))

    /**
     * @param eventTriggerName The unique name of the event trigger. 
     */
    override fun eventTriggerName(eventTriggerName: String) {
      cdkBuilder.eventTriggerName(eventTriggerName)
    }

    /**
     * @param objectTypeName The unique name of the object type. 
     */
    override fun objectTypeName(objectTypeName: String) {
      cdkBuilder.objectTypeName(objectTypeName)
    }

    /**
     * @param segmentFilter The destination is triggered only for profiles that meet the criteria of
     * a segment definition.
     */
    override fun segmentFilter(segmentFilter: String) {
      cdkBuilder.segmentFilter(segmentFilter)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnEventTriggerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventTriggerProps,
  ) : CdkObject(cdkObject),
      CfnEventTriggerProps {
    /**
     * The description of the event trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * A list of conditions that determine when an event should trigger the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggerconditions)
     */
    override fun eventTriggerConditions(): Any = unwrap(this).getEventTriggerConditions()

    /**
     * Defines limits controlling whether an event triggers the destination, based on ingestion
     * latency and the number of invocations per profile over specific time periods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggerlimits)
     */
    override fun eventTriggerLimits(): Any? = unwrap(this).getEventTriggerLimits()

    /**
     * The unique name of the event trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggername)
     */
    override fun eventTriggerName(): String = unwrap(this).getEventTriggerName()

    /**
     * The unique name of the object type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-objecttypename)
     */
    override fun objectTypeName(): String = unwrap(this).getObjectTypeName()

    /**
     * The destination is triggered only for profiles that meet the criteria of a segment
     * definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-segmentfilter)
     */
    override fun segmentFilter(): String? = unwrap(this).getSegmentFilter()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventTriggerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventTriggerProps):
        CfnEventTriggerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEventTriggerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventTriggerProps):
        software.amazon.awscdk.services.customerprofiles.CfnEventTriggerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.customerprofiles.CfnEventTriggerProps
  }
}
