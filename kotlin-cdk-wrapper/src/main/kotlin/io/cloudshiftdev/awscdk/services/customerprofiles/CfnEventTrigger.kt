@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies the rules to perform an action based on customer ingested data.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
 * CfnEventTrigger cfnEventTrigger = CfnEventTrigger.Builder.create(this, "MyCfnEventTrigger")
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
public open class CfnEventTrigger(
  cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventTrigger,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventTriggerProps,
  ) :
      this(software.amazon.awscdk.services.customerprofiles.CfnEventTrigger(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEventTriggerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventTriggerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventTriggerProps(props)
  )

  /**
   * The timestamp of when the event trigger was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The timestamp of when the event trigger was most recently updated.
   */
  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the event trigger.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the event trigger.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The unique name of the domain.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The unique name of the domain.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * A list of conditions that determine when an event should trigger the destination.
   */
  public open fun eventTriggerConditions(): Any = unwrap(this).getEventTriggerConditions()

  /**
   * A list of conditions that determine when an event should trigger the destination.
   */
  public open fun eventTriggerConditions(`value`: IResolvable) {
    unwrap(this).setEventTriggerConditions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of conditions that determine when an event should trigger the destination.
   */
  public open fun eventTriggerConditions(`value`: List<Any>) {
    unwrap(this).setEventTriggerConditions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of conditions that determine when an event should trigger the destination.
   */
  public open fun eventTriggerConditions(vararg `value`: Any): Unit =
      eventTriggerConditions(`value`.toList())

  /**
   * Defines limits controlling whether an event triggers the destination, based on ingestion
   * latency and the number of invocations per profile over specific time periods.
   */
  public open fun eventTriggerLimits(): Any? = unwrap(this).getEventTriggerLimits()

  /**
   * Defines limits controlling whether an event triggers the destination, based on ingestion
   * latency and the number of invocations per profile over specific time periods.
   */
  public open fun eventTriggerLimits(`value`: IResolvable) {
    unwrap(this).setEventTriggerLimits(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Defines limits controlling whether an event triggers the destination, based on ingestion
   * latency and the number of invocations per profile over specific time periods.
   */
  public open fun eventTriggerLimits(`value`: EventTriggerLimitsProperty) {
    unwrap(this).setEventTriggerLimits(`value`.let(EventTriggerLimitsProperty.Companion::unwrap))
  }

  /**
   * Defines limits controlling whether an event triggers the destination, based on ingestion
   * latency and the number of invocations per profile over specific time periods.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5ae120d6ae76b7d4285023947ac7ca9af31123ce4e41ae153feb116b6e4ae7df")
  public open fun eventTriggerLimits(`value`: EventTriggerLimitsProperty.Builder.() -> Unit): Unit =
      eventTriggerLimits(EventTriggerLimitsProperty(`value`))

  /**
   * The unique name of the event trigger.
   */
  public open fun eventTriggerName(): String = unwrap(this).getEventTriggerName()

  /**
   * The unique name of the event trigger.
   */
  public open fun eventTriggerName(`value`: String) {
    unwrap(this).setEventTriggerName(`value`)
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
   * The unique name of the object type.
   */
  public open fun objectTypeName(): String = unwrap(this).getObjectTypeName()

  /**
   * The unique name of the object type.
   */
  public open fun objectTypeName(`value`: String) {
    unwrap(this).setObjectTypeName(`value`)
  }

  /**
   * The destination is triggered only for profiles that meet the criteria of a segment definition.
   */
  public open fun segmentFilter(): String? = unwrap(this).getSegmentFilter()

  /**
   * The destination is triggered only for profiles that meet the criteria of a segment definition.
   */
  public open fun segmentFilter(`value`: String) {
    unwrap(this).setSegmentFilter(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.customerprofiles.CfnEventTrigger].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the event trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-description)
     * @param description The description of the event trigger. 
     */
    public fun description(description: String)

    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-domainname)
     * @param domainName The unique name of the domain. 
     */
    public fun domainName(domainName: String)

    /**
     * A list of conditions that determine when an event should trigger the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggerconditions)
     * @param eventTriggerConditions A list of conditions that determine when an event should
     * trigger the destination. 
     */
    public fun eventTriggerConditions(eventTriggerConditions: IResolvable)

    /**
     * A list of conditions that determine when an event should trigger the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggerconditions)
     * @param eventTriggerConditions A list of conditions that determine when an event should
     * trigger the destination. 
     */
    public fun eventTriggerConditions(eventTriggerConditions: List<Any>)

    /**
     * A list of conditions that determine when an event should trigger the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggerconditions)
     * @param eventTriggerConditions A list of conditions that determine when an event should
     * trigger the destination. 
     */
    public fun eventTriggerConditions(vararg eventTriggerConditions: Any)

    /**
     * Defines limits controlling whether an event triggers the destination, based on ingestion
     * latency and the number of invocations per profile over specific time periods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggerlimits)
     * @param eventTriggerLimits Defines limits controlling whether an event triggers the
     * destination, based on ingestion latency and the number of invocations per profile over specific
     * time periods. 
     */
    public fun eventTriggerLimits(eventTriggerLimits: IResolvable)

    /**
     * Defines limits controlling whether an event triggers the destination, based on ingestion
     * latency and the number of invocations per profile over specific time periods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggerlimits)
     * @param eventTriggerLimits Defines limits controlling whether an event triggers the
     * destination, based on ingestion latency and the number of invocations per profile over specific
     * time periods. 
     */
    public fun eventTriggerLimits(eventTriggerLimits: EventTriggerLimitsProperty)

    /**
     * Defines limits controlling whether an event triggers the destination, based on ingestion
     * latency and the number of invocations per profile over specific time periods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggerlimits)
     * @param eventTriggerLimits Defines limits controlling whether an event triggers the
     * destination, based on ingestion latency and the number of invocations per profile over specific
     * time periods. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f830b7ccde351e117a9f455079f41d14fb01adf796da062a543b6c2f5da0dde1")
    public fun eventTriggerLimits(eventTriggerLimits: EventTriggerLimitsProperty.Builder.() -> Unit)

    /**
     * The unique name of the event trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggername)
     * @param eventTriggerName The unique name of the event trigger. 
     */
    public fun eventTriggerName(eventTriggerName: String)

    /**
     * The unique name of the object type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-objecttypename)
     * @param objectTypeName The unique name of the object type. 
     */
    public fun objectTypeName(objectTypeName: String)

    /**
     * The destination is triggered only for profiles that meet the criteria of a segment
     * definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-segmentfilter)
     * @param segmentFilter The destination is triggered only for profiles that meet the criteria of
     * a segment definition. 
     */
    public fun segmentFilter(segmentFilter: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.Builder
        = software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.Builder.create(scope, id)

    /**
     * The description of the event trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-description)
     * @param description The description of the event trigger. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-domainname)
     * @param domainName The unique name of the domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * A list of conditions that determine when an event should trigger the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggerconditions)
     * @param eventTriggerConditions A list of conditions that determine when an event should
     * trigger the destination. 
     */
    override fun eventTriggerConditions(eventTriggerConditions: IResolvable) {
      cdkBuilder.eventTriggerConditions(eventTriggerConditions.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of conditions that determine when an event should trigger the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggerconditions)
     * @param eventTriggerConditions A list of conditions that determine when an event should
     * trigger the destination. 
     */
    override fun eventTriggerConditions(eventTriggerConditions: List<Any>) {
      cdkBuilder.eventTriggerConditions(eventTriggerConditions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of conditions that determine when an event should trigger the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggerconditions)
     * @param eventTriggerConditions A list of conditions that determine when an event should
     * trigger the destination. 
     */
    override fun eventTriggerConditions(vararg eventTriggerConditions: Any): Unit =
        eventTriggerConditions(eventTriggerConditions.toList())

    /**
     * Defines limits controlling whether an event triggers the destination, based on ingestion
     * latency and the number of invocations per profile over specific time periods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggerlimits)
     * @param eventTriggerLimits Defines limits controlling whether an event triggers the
     * destination, based on ingestion latency and the number of invocations per profile over specific
     * time periods. 
     */
    override fun eventTriggerLimits(eventTriggerLimits: IResolvable) {
      cdkBuilder.eventTriggerLimits(eventTriggerLimits.let(IResolvable.Companion::unwrap))
    }

    /**
     * Defines limits controlling whether an event triggers the destination, based on ingestion
     * latency and the number of invocations per profile over specific time periods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggerlimits)
     * @param eventTriggerLimits Defines limits controlling whether an event triggers the
     * destination, based on ingestion latency and the number of invocations per profile over specific
     * time periods. 
     */
    override fun eventTriggerLimits(eventTriggerLimits: EventTriggerLimitsProperty) {
      cdkBuilder.eventTriggerLimits(eventTriggerLimits.let(EventTriggerLimitsProperty.Companion::unwrap))
    }

    /**
     * Defines limits controlling whether an event triggers the destination, based on ingestion
     * latency and the number of invocations per profile over specific time periods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggerlimits)
     * @param eventTriggerLimits Defines limits controlling whether an event triggers the
     * destination, based on ingestion latency and the number of invocations per profile over specific
     * time periods. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f830b7ccde351e117a9f455079f41d14fb01adf796da062a543b6c2f5da0dde1")
    override
        fun eventTriggerLimits(eventTriggerLimits: EventTriggerLimitsProperty.Builder.() -> Unit):
        Unit = eventTriggerLimits(EventTriggerLimitsProperty(eventTriggerLimits))

    /**
     * The unique name of the event trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-eventtriggername)
     * @param eventTriggerName The unique name of the event trigger. 
     */
    override fun eventTriggerName(eventTriggerName: String) {
      cdkBuilder.eventTriggerName(eventTriggerName)
    }

    /**
     * The unique name of the object type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-objecttypename)
     * @param objectTypeName The unique name of the object type. 
     */
    override fun objectTypeName(objectTypeName: String) {
      cdkBuilder.objectTypeName(objectTypeName)
    }

    /**
     * The destination is triggered only for profiles that meet the criteria of a segment
     * definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-segmentfilter)
     * @param segmentFilter The destination is triggered only for profiles that meet the criteria of
     * a segment definition. 
     */
    override fun segmentFilter(segmentFilter: String) {
      cdkBuilder.segmentFilter(segmentFilter)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventtrigger.html#cfn-customerprofiles-eventtrigger-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnEventTrigger =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventTrigger {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventTrigger(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventTrigger):
        CfnEventTrigger = CfnEventTrigger(cdkObject)

    internal fun unwrap(wrapped: CfnEventTrigger):
        software.amazon.awscdk.services.customerprofiles.CfnEventTrigger = wrapped.cdkObject as
        software.amazon.awscdk.services.customerprofiles.CfnEventTrigger
  }

  /**
   * Specifies the circumstances under which the event should trigger the destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * EventTriggerConditionProperty eventTriggerConditionProperty =
   * EventTriggerConditionProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-eventtriggercondition.html)
   */
  public interface EventTriggerConditionProperty {
    /**
     * A list of dimensions to be evaluated for the event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-eventtriggercondition.html#cfn-customerprofiles-eventtrigger-eventtriggercondition-eventtriggerdimensions)
     */
    public fun eventTriggerDimensions(): Any

    /**
     * The operator used to combine multiple dimensions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-eventtriggercondition.html#cfn-customerprofiles-eventtrigger-eventtriggercondition-logicaloperator)
     */
    public fun logicalOperator(): String

    /**
     * A builder for [EventTriggerConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventTriggerDimensions A list of dimensions to be evaluated for the event. 
       */
      public fun eventTriggerDimensions(eventTriggerDimensions: IResolvable)

      /**
       * @param eventTriggerDimensions A list of dimensions to be evaluated for the event. 
       */
      public fun eventTriggerDimensions(eventTriggerDimensions: List<Any>)

      /**
       * @param eventTriggerDimensions A list of dimensions to be evaluated for the event. 
       */
      public fun eventTriggerDimensions(vararg eventTriggerDimensions: Any)

      /**
       * @param logicalOperator The operator used to combine multiple dimensions. 
       */
      public fun logicalOperator(logicalOperator: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerConditionProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerConditionProperty.builder()

      /**
       * @param eventTriggerDimensions A list of dimensions to be evaluated for the event. 
       */
      override fun eventTriggerDimensions(eventTriggerDimensions: IResolvable) {
        cdkBuilder.eventTriggerDimensions(eventTriggerDimensions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param eventTriggerDimensions A list of dimensions to be evaluated for the event. 
       */
      override fun eventTriggerDimensions(eventTriggerDimensions: List<Any>) {
        cdkBuilder.eventTriggerDimensions(eventTriggerDimensions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param eventTriggerDimensions A list of dimensions to be evaluated for the event. 
       */
      override fun eventTriggerDimensions(vararg eventTriggerDimensions: Any): Unit =
          eventTriggerDimensions(eventTriggerDimensions.toList())

      /**
       * @param logicalOperator The operator used to combine multiple dimensions. 
       */
      override fun logicalOperator(logicalOperator: String) {
        cdkBuilder.logicalOperator(logicalOperator)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerConditionProperty,
    ) : CdkObject(cdkObject),
        EventTriggerConditionProperty {
      /**
       * A list of dimensions to be evaluated for the event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-eventtriggercondition.html#cfn-customerprofiles-eventtrigger-eventtriggercondition-eventtriggerdimensions)
       */
      override fun eventTriggerDimensions(): Any = unwrap(this).getEventTriggerDimensions()

      /**
       * The operator used to combine multiple dimensions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-eventtriggercondition.html#cfn-customerprofiles-eventtrigger-eventtriggercondition-logicaloperator)
       */
      override fun logicalOperator(): String = unwrap(this).getLogicalOperator()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventTriggerConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerConditionProperty):
          EventTriggerConditionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EventTriggerConditionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventTriggerConditionProperty):
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerConditionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerConditionProperty
    }
  }

  /**
   * A specific event dimension to be assessed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * EventTriggerDimensionProperty eventTriggerDimensionProperty =
   * EventTriggerDimensionProperty.builder()
   * .objectAttributes(List.of(ObjectAttributeProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .values(List.of("values"))
   * // the properties below are optional
   * .fieldName("fieldName")
   * .source("source")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-eventtriggerdimension.html)
   */
  public interface EventTriggerDimensionProperty {
    /**
     * A list of object attributes to be evaluated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-eventtriggerdimension.html#cfn-customerprofiles-eventtrigger-eventtriggerdimension-objectattributes)
     */
    public fun objectAttributes(): Any

    /**
     * A builder for [EventTriggerDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param objectAttributes A list of object attributes to be evaluated. 
       */
      public fun objectAttributes(objectAttributes: IResolvable)

      /**
       * @param objectAttributes A list of object attributes to be evaluated. 
       */
      public fun objectAttributes(objectAttributes: List<Any>)

      /**
       * @param objectAttributes A list of object attributes to be evaluated. 
       */
      public fun objectAttributes(vararg objectAttributes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerDimensionProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerDimensionProperty.builder()

      /**
       * @param objectAttributes A list of object attributes to be evaluated. 
       */
      override fun objectAttributes(objectAttributes: IResolvable) {
        cdkBuilder.objectAttributes(objectAttributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param objectAttributes A list of object attributes to be evaluated. 
       */
      override fun objectAttributes(objectAttributes: List<Any>) {
        cdkBuilder.objectAttributes(objectAttributes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param objectAttributes A list of object attributes to be evaluated. 
       */
      override fun objectAttributes(vararg objectAttributes: Any): Unit =
          objectAttributes(objectAttributes.toList())

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerDimensionProperty,
    ) : CdkObject(cdkObject),
        EventTriggerDimensionProperty {
      /**
       * A list of object attributes to be evaluated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-eventtriggerdimension.html#cfn-customerprofiles-eventtrigger-eventtriggerdimension-objectattributes)
       */
      override fun objectAttributes(): Any = unwrap(this).getObjectAttributes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventTriggerDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerDimensionProperty):
          EventTriggerDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EventTriggerDimensionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventTriggerDimensionProperty):
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerDimensionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerDimensionProperty
    }
  }

  /**
   * Defines limits controlling whether an event triggers the destination, based on ingestion
   * latency and the number of invocations per profile over specific time periods.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * EventTriggerLimitsProperty eventTriggerLimitsProperty = EventTriggerLimitsProperty.builder()
   * .eventExpiration(123)
   * .periods(List.of(PeriodProperty.builder()
   * .unit("unit")
   * .value(123)
   * // the properties below are optional
   * .maxInvocationsPerProfile(123)
   * .unlimited(false)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-eventtriggerlimits.html)
   */
  public interface EventTriggerLimitsProperty {
    /**
     * Specifies that an event will only trigger the destination if it is processed within a certain
     * latency period.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-eventtriggerlimits.html#cfn-customerprofiles-eventtrigger-eventtriggerlimits-eventexpiration)
     */
    public fun eventExpiration(): Number? = unwrap(this).getEventExpiration()

    /**
     * A list of time periods during which the limits apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-eventtriggerlimits.html#cfn-customerprofiles-eventtrigger-eventtriggerlimits-periods)
     */
    public fun periods(): Any? = unwrap(this).getPeriods()

    /**
     * A builder for [EventTriggerLimitsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventExpiration Specifies that an event will only trigger the destination if it is
       * processed within a certain latency period.
       */
      public fun eventExpiration(eventExpiration: Number)

      /**
       * @param periods A list of time periods during which the limits apply.
       */
      public fun periods(periods: IResolvable)

      /**
       * @param periods A list of time periods during which the limits apply.
       */
      public fun periods(periods: List<Any>)

      /**
       * @param periods A list of time periods during which the limits apply.
       */
      public fun periods(vararg periods: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerLimitsProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerLimitsProperty.builder()

      /**
       * @param eventExpiration Specifies that an event will only trigger the destination if it is
       * processed within a certain latency period.
       */
      override fun eventExpiration(eventExpiration: Number) {
        cdkBuilder.eventExpiration(eventExpiration)
      }

      /**
       * @param periods A list of time periods during which the limits apply.
       */
      override fun periods(periods: IResolvable) {
        cdkBuilder.periods(periods.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param periods A list of time periods during which the limits apply.
       */
      override fun periods(periods: List<Any>) {
        cdkBuilder.periods(periods.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param periods A list of time periods during which the limits apply.
       */
      override fun periods(vararg periods: Any): Unit = periods(periods.toList())

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerLimitsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerLimitsProperty,
    ) : CdkObject(cdkObject),
        EventTriggerLimitsProperty {
      /**
       * Specifies that an event will only trigger the destination if it is processed within a
       * certain latency period.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-eventtriggerlimits.html#cfn-customerprofiles-eventtrigger-eventtriggerlimits-eventexpiration)
       */
      override fun eventExpiration(): Number? = unwrap(this).getEventExpiration()

      /**
       * A list of time periods during which the limits apply.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-eventtriggerlimits.html#cfn-customerprofiles-eventtrigger-eventtriggerlimits-periods)
       */
      override fun periods(): Any? = unwrap(this).getPeriods()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventTriggerLimitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerLimitsProperty):
          EventTriggerLimitsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EventTriggerLimitsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventTriggerLimitsProperty):
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerLimitsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.EventTriggerLimitsProperty
    }
  }

  /**
   * The criteria that a specific object attribute must meet to trigger the destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * ObjectAttributeProperty objectAttributeProperty = ObjectAttributeProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .values(List.of("values"))
   * // the properties below are optional
   * .fieldName("fieldName")
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-objectattribute.html)
   */
  public interface ObjectAttributeProperty {
    /**
     * The operator used to compare an attribute against a list of values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-objectattribute.html#cfn-customerprofiles-eventtrigger-objectattribute-comparisonoperator)
     */
    public fun comparisonOperator(): String

    /**
     * A field defined within an object type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-objectattribute.html#cfn-customerprofiles-eventtrigger-objectattribute-fieldname)
     */
    public fun fieldName(): String? = unwrap(this).getFieldName()

    /**
     * An attribute contained within a source object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-objectattribute.html#cfn-customerprofiles-eventtrigger-objectattribute-source)
     */
    public fun source(): String? = unwrap(this).getSource()

    /**
     * The amount of time of the specified unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-objectattribute.html#cfn-customerprofiles-eventtrigger-objectattribute-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [ObjectAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparisonOperator The operator used to compare an attribute against a list of
       * values. 
       */
      public fun comparisonOperator(comparisonOperator: String)

      /**
       * @param fieldName A field defined within an object type.
       */
      public fun fieldName(fieldName: String)

      /**
       * @param source An attribute contained within a source object.
       */
      public fun source(source: String)

      /**
       * @param values The amount of time of the specified unit. 
       */
      public fun values(values: List<String>)

      /**
       * @param values The amount of time of the specified unit. 
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.ObjectAttributeProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.ObjectAttributeProperty.builder()

      /**
       * @param comparisonOperator The operator used to compare an attribute against a list of
       * values. 
       */
      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      /**
       * @param fieldName A field defined within an object type.
       */
      override fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
      }

      /**
       * @param source An attribute contained within a source object.
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      /**
       * @param values The amount of time of the specified unit. 
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The amount of time of the specified unit. 
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.ObjectAttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.ObjectAttributeProperty,
    ) : CdkObject(cdkObject),
        ObjectAttributeProperty {
      /**
       * The operator used to compare an attribute against a list of values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-objectattribute.html#cfn-customerprofiles-eventtrigger-objectattribute-comparisonoperator)
       */
      override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

      /**
       * A field defined within an object type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-objectattribute.html#cfn-customerprofiles-eventtrigger-objectattribute-fieldname)
       */
      override fun fieldName(): String? = unwrap(this).getFieldName()

      /**
       * An attribute contained within a source object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-objectattribute.html#cfn-customerprofiles-eventtrigger-objectattribute-source)
       */
      override fun source(): String? = unwrap(this).getSource()

      /**
       * The amount of time of the specified unit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-objectattribute.html#cfn-customerprofiles-eventtrigger-objectattribute-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ObjectAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.ObjectAttributeProperty):
          ObjectAttributeProperty = CdkObjectWrappers.wrap(cdkObject) as? ObjectAttributeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObjectAttributeProperty):
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.ObjectAttributeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.ObjectAttributeProperty
    }
  }

  /**
   * Defines a limit and the time period during which it is enforced.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * PeriodProperty periodProperty = PeriodProperty.builder()
   * .unit("unit")
   * .value(123)
   * // the properties below are optional
   * .maxInvocationsPerProfile(123)
   * .unlimited(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-period.html)
   */
  public interface PeriodProperty {
    /**
     * The maximum allowed number of destination invocations per profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-period.html#cfn-customerprofiles-eventtrigger-period-maxinvocationsperprofile)
     */
    public fun maxInvocationsPerProfile(): Number? = unwrap(this).getMaxInvocationsPerProfile()

    /**
     * The unit of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-period.html#cfn-customerprofiles-eventtrigger-period-unit)
     */
    public fun unit(): String

    /**
     * If set to true, there is no limit on the number of destination invocations per profile.
     *
     * The default is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-period.html#cfn-customerprofiles-eventtrigger-period-unlimited)
     */
    public fun unlimited(): Any? = unwrap(this).getUnlimited()

    /**
     * The amount of time of the specified unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-period.html#cfn-customerprofiles-eventtrigger-period-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [PeriodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxInvocationsPerProfile The maximum allowed number of destination invocations per
       * profile.
       */
      public fun maxInvocationsPerProfile(maxInvocationsPerProfile: Number)

      /**
       * @param unit The unit of time. 
       */
      public fun unit(unit: String)

      /**
       * @param unlimited If set to true, there is no limit on the number of destination invocations
       * per profile.
       * The default is false.
       */
      public fun unlimited(unlimited: Boolean)

      /**
       * @param unlimited If set to true, there is no limit on the number of destination invocations
       * per profile.
       * The default is false.
       */
      public fun unlimited(unlimited: IResolvable)

      /**
       * @param value The amount of time of the specified unit. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.PeriodProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.PeriodProperty.builder()

      /**
       * @param maxInvocationsPerProfile The maximum allowed number of destination invocations per
       * profile.
       */
      override fun maxInvocationsPerProfile(maxInvocationsPerProfile: Number) {
        cdkBuilder.maxInvocationsPerProfile(maxInvocationsPerProfile)
      }

      /**
       * @param unit The unit of time. 
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param unlimited If set to true, there is no limit on the number of destination invocations
       * per profile.
       * The default is false.
       */
      override fun unlimited(unlimited: Boolean) {
        cdkBuilder.unlimited(unlimited)
      }

      /**
       * @param unlimited If set to true, there is no limit on the number of destination invocations
       * per profile.
       * The default is false.
       */
      override fun unlimited(unlimited: IResolvable) {
        cdkBuilder.unlimited(unlimited.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param value The amount of time of the specified unit. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.PeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.PeriodProperty,
    ) : CdkObject(cdkObject),
        PeriodProperty {
      /**
       * The maximum allowed number of destination invocations per profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-period.html#cfn-customerprofiles-eventtrigger-period-maxinvocationsperprofile)
       */
      override fun maxInvocationsPerProfile(): Number? = unwrap(this).getMaxInvocationsPerProfile()

      /**
       * The unit of time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-period.html#cfn-customerprofiles-eventtrigger-period-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()

      /**
       * If set to true, there is no limit on the number of destination invocations per profile.
       *
       * The default is false.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-period.html#cfn-customerprofiles-eventtrigger-period-unlimited)
       */
      override fun unlimited(): Any? = unwrap(this).getUnlimited()

      /**
       * The amount of time of the specified unit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventtrigger-period.html#cfn-customerprofiles-eventtrigger-period-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.PeriodProperty):
          PeriodProperty = CdkObjectWrappers.wrap(cdkObject) as? PeriodProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PeriodProperty):
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.PeriodProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnEventTrigger.PeriodProperty
    }
  }
}
