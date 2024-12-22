@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleetwise

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a collection of standardized signals that can be reused to create vehicle models.
 *
 * For more information, see [Signal
 * catalogs](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/signal-catalogs.html) in
 * the *AWS IoT FleetWise Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
 * CfnSignalCatalog cfnSignalCatalog = CfnSignalCatalog.Builder.create(this, "MyCfnSignalCatalog")
 * .description("description")
 * .name("name")
 * .nodeCounts(NodeCountsProperty.builder()
 * .totalActuators(123)
 * .totalAttributes(123)
 * .totalBranches(123)
 * .totalNodes(123)
 * .totalSensors(123)
 * .build())
 * .nodes(List.of(NodeProperty.builder()
 * .actuator(ActuatorProperty.builder()
 * .dataType("dataType")
 * .fullyQualifiedName("fullyQualifiedName")
 * // the properties below are optional
 * .allowedValues(List.of("allowedValues"))
 * .assignedValue("assignedValue")
 * .description("description")
 * .max(123)
 * .min(123)
 * .unit("unit")
 * .build())
 * .attribute(AttributeProperty.builder()
 * .dataType("dataType")
 * .fullyQualifiedName("fullyQualifiedName")
 * // the properties below are optional
 * .allowedValues(List.of("allowedValues"))
 * .assignedValue("assignedValue")
 * .defaultValue("defaultValue")
 * .description("description")
 * .max(123)
 * .min(123)
 * .unit("unit")
 * .build())
 * .branch(BranchProperty.builder()
 * .fullyQualifiedName("fullyQualifiedName")
 * // the properties below are optional
 * .description("description")
 * .build())
 * .sensor(SensorProperty.builder()
 * .dataType("dataType")
 * .fullyQualifiedName("fullyQualifiedName")
 * // the properties below are optional
 * .allowedValues(List.of("allowedValues"))
 * .description("description")
 * .max(123)
 * .min(123)
 * .unit("unit")
 * .build())
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html)
 */
public open class CfnSignalCatalog(
  cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSignalCatalogProps,
  ) :
      this(software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSignalCatalogProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSignalCatalogProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSignalCatalogProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the signal catalog.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time the signal catalog was created in seconds since epoch (January 1, 1970 at midnight UTC
   * time).
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The time the signal catalog was last updated in seconds since epoch (January 1, 1970 at
   * midnight UTC time).
   */
  public open fun attrLastModificationTime(): String = unwrap(this).getAttrLastModificationTime()

  /**
   * The total number of nodes in a vehicle network that represent actuators.
   */
  public open fun attrNodeCountsTotalActuators(): IResolvable =
      unwrap(this).getAttrNodeCountsTotalActuators().let(IResolvable::wrap)

  /**
   * The total number of nodes in a vehicle network that represent attributes.
   */
  public open fun attrNodeCountsTotalAttributes(): IResolvable =
      unwrap(this).getAttrNodeCountsTotalAttributes().let(IResolvable::wrap)

  /**
   * The total number of nodes in a vehicle network that represent branches.
   */
  public open fun attrNodeCountsTotalBranches(): IResolvable =
      unwrap(this).getAttrNodeCountsTotalBranches().let(IResolvable::wrap)

  /**
   * The total number of nodes in a vehicle network.
   */
  public open fun attrNodeCountsTotalNodes(): IResolvable =
      unwrap(this).getAttrNodeCountsTotalNodes().let(IResolvable::wrap)

  /**
   * The total number of nodes in a vehicle network that represent sensors.
   */
  public open fun attrNodeCountsTotalSensors(): IResolvable =
      unwrap(this).getAttrNodeCountsTotalSensors().let(IResolvable::wrap)

  /**
   * A brief description of the signal catalog.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A brief description of the signal catalog.
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
   * The name of the signal catalog.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the signal catalog.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Information about the number of nodes and node types in a vehicle network.
   */
  public open fun nodeCounts(): Any? = unwrap(this).getNodeCounts()

  /**
   * Information about the number of nodes and node types in a vehicle network.
   */
  public open fun nodeCounts(`value`: IResolvable) {
    unwrap(this).setNodeCounts(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Information about the number of nodes and node types in a vehicle network.
   */
  public open fun nodeCounts(`value`: NodeCountsProperty) {
    unwrap(this).setNodeCounts(`value`.let(NodeCountsProperty.Companion::unwrap))
  }

  /**
   * Information about the number of nodes and node types in a vehicle network.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cc3959deed9e373a7066695f451acd3e636548596d2fcb63f9893b8f0a92eba8")
  public open fun nodeCounts(`value`: NodeCountsProperty.Builder.() -> Unit): Unit =
      nodeCounts(NodeCountsProperty(`value`))

  /**
   * A list of information about nodes, which are a general abstraction of signals.
   */
  public open fun nodes(): Any? = unwrap(this).getNodes()

  /**
   * A list of information about nodes, which are a general abstraction of signals.
   */
  public open fun nodes(`value`: IResolvable) {
    unwrap(this).setNodes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of information about nodes, which are a general abstraction of signals.
   */
  public open fun nodes(`value`: List<Any>) {
    unwrap(this).setNodes(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of information about nodes, which are a general abstraction of signals.
   */
  public open fun nodes(vararg `value`: Any): Unit = nodes(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata that can be used to manage the signal catalog.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata that can be used to manage the signal catalog.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata that can be used to manage the signal catalog.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotfleetwise.CfnSignalCatalog].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A brief description of the signal catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-description)
     * @param description A brief description of the signal catalog. 
     */
    public fun description(description: String)

    /**
     * The name of the signal catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-name)
     * @param name The name of the signal catalog. 
     */
    public fun name(name: String)

    /**
     * Information about the number of nodes and node types in a vehicle network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodecounts)
     * @param nodeCounts Information about the number of nodes and node types in a vehicle network. 
     */
    public fun nodeCounts(nodeCounts: IResolvable)

    /**
     * Information about the number of nodes and node types in a vehicle network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodecounts)
     * @param nodeCounts Information about the number of nodes and node types in a vehicle network. 
     */
    public fun nodeCounts(nodeCounts: NodeCountsProperty)

    /**
     * Information about the number of nodes and node types in a vehicle network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodecounts)
     * @param nodeCounts Information about the number of nodes and node types in a vehicle network. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c2c036ef5820857fbc4d7fe0319e34db43831f2e7b29d3257ec25b0e0ae6ac7")
    public fun nodeCounts(nodeCounts: NodeCountsProperty.Builder.() -> Unit)

    /**
     * A list of information about nodes, which are a general abstraction of signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodes)
     * @param nodes A list of information about nodes, which are a general abstraction of signals. 
     */
    public fun nodes(nodes: IResolvable)

    /**
     * A list of information about nodes, which are a general abstraction of signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodes)
     * @param nodes A list of information about nodes, which are a general abstraction of signals. 
     */
    public fun nodes(nodes: List<Any>)

    /**
     * A list of information about nodes, which are a general abstraction of signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodes)
     * @param nodes A list of information about nodes, which are a general abstraction of signals. 
     */
    public fun nodes(vararg nodes: Any)

    /**
     * Metadata that can be used to manage the signal catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-tags)
     * @param tags Metadata that can be used to manage the signal catalog. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that can be used to manage the signal catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-tags)
     * @param tags Metadata that can be used to manage the signal catalog. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.Builder.create(scope, id)

    /**
     * A brief description of the signal catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-description)
     * @param description A brief description of the signal catalog. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the signal catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-name)
     * @param name The name of the signal catalog. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Information about the number of nodes and node types in a vehicle network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodecounts)
     * @param nodeCounts Information about the number of nodes and node types in a vehicle network. 
     */
    override fun nodeCounts(nodeCounts: IResolvable) {
      cdkBuilder.nodeCounts(nodeCounts.let(IResolvable.Companion::unwrap))
    }

    /**
     * Information about the number of nodes and node types in a vehicle network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodecounts)
     * @param nodeCounts Information about the number of nodes and node types in a vehicle network. 
     */
    override fun nodeCounts(nodeCounts: NodeCountsProperty) {
      cdkBuilder.nodeCounts(nodeCounts.let(NodeCountsProperty.Companion::unwrap))
    }

    /**
     * Information about the number of nodes and node types in a vehicle network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodecounts)
     * @param nodeCounts Information about the number of nodes and node types in a vehicle network. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c2c036ef5820857fbc4d7fe0319e34db43831f2e7b29d3257ec25b0e0ae6ac7")
    override fun nodeCounts(nodeCounts: NodeCountsProperty.Builder.() -> Unit): Unit =
        nodeCounts(NodeCountsProperty(nodeCounts))

    /**
     * A list of information about nodes, which are a general abstraction of signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodes)
     * @param nodes A list of information about nodes, which are a general abstraction of signals. 
     */
    override fun nodes(nodes: IResolvable) {
      cdkBuilder.nodes(nodes.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of information about nodes, which are a general abstraction of signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodes)
     * @param nodes A list of information about nodes, which are a general abstraction of signals. 
     */
    override fun nodes(nodes: List<Any>) {
      cdkBuilder.nodes(nodes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of information about nodes, which are a general abstraction of signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-nodes)
     * @param nodes A list of information about nodes, which are a general abstraction of signals. 
     */
    override fun nodes(vararg nodes: Any): Unit = nodes(nodes.toList())

    /**
     * Metadata that can be used to manage the signal catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-tags)
     * @param tags Metadata that can be used to manage the signal catalog. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Metadata that can be used to manage the signal catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-signalcatalog.html#cfn-iotfleetwise-signalcatalog-tags)
     * @param tags Metadata that can be used to manage the signal catalog. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSignalCatalog {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSignalCatalog(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog):
        CfnSignalCatalog = CfnSignalCatalog(cdkObject)

    internal fun unwrap(wrapped: CfnSignalCatalog):
        software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog = wrapped.cdkObject as
        software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog
  }

  /**
   * A signal that represents a vehicle device such as the engine, heater, and door locks.
   *
   * Data from an actuator reports the state of a certain vehicle device.
   *
   *
   * Updating actuator data can change the state of a device. For example, you can turn on or off
   * the heater by updating its actuator data.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * ActuatorProperty actuatorProperty = ActuatorProperty.builder()
   * .dataType("dataType")
   * .fullyQualifiedName("fullyQualifiedName")
   * // the properties below are optional
   * .allowedValues(List.of("allowedValues"))
   * .assignedValue("assignedValue")
   * .description("description")
   * .max(123)
   * .min(123)
   * .unit("unit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html)
   */
  public interface ActuatorProperty {
    /**
     * A list of possible values an actuator can take.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html#cfn-iotfleetwise-signalcatalog-actuator-allowedvalues)
     */
    public fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

    /**
     * A specified value for the actuator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html#cfn-iotfleetwise-signalcatalog-actuator-assignedvalue)
     */
    public fun assignedValue(): String? = unwrap(this).getAssignedValue()

    /**
     * The specified data type of the actuator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html#cfn-iotfleetwise-signalcatalog-actuator-datatype)
     */
    public fun dataType(): String

    /**
     * A brief description of the actuator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html#cfn-iotfleetwise-signalcatalog-actuator-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The fully qualified name of the actuator.
     *
     * For example, the fully qualified name of an actuator might be `Vehicle.Front.Left.Door.Lock`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html#cfn-iotfleetwise-signalcatalog-actuator-fullyqualifiedname)
     */
    public fun fullyQualifiedName(): String

    /**
     * The specified possible maximum value of an actuator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html#cfn-iotfleetwise-signalcatalog-actuator-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The specified possible minimum value of an actuator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html#cfn-iotfleetwise-signalcatalog-actuator-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * The scientific unit for the actuator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html#cfn-iotfleetwise-signalcatalog-actuator-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * A builder for [ActuatorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedValues A list of possible values an actuator can take.
       */
      public fun allowedValues(allowedValues: List<String>)

      /**
       * @param allowedValues A list of possible values an actuator can take.
       */
      public fun allowedValues(vararg allowedValues: String)

      /**
       * @param assignedValue A specified value for the actuator.
       */
      public fun assignedValue(assignedValue: String)

      /**
       * @param dataType The specified data type of the actuator. 
       */
      public fun dataType(dataType: String)

      /**
       * @param description A brief description of the actuator.
       */
      public fun description(description: String)

      /**
       * @param fullyQualifiedName The fully qualified name of the actuator. 
       * For example, the fully qualified name of an actuator might be
       * `Vehicle.Front.Left.Door.Lock` .
       */
      public fun fullyQualifiedName(fullyQualifiedName: String)

      /**
       * @param max The specified possible maximum value of an actuator.
       */
      public fun max(max: Number)

      /**
       * @param min The specified possible minimum value of an actuator.
       */
      public fun min(min: Number)

      /**
       * @param unit The scientific unit for the actuator.
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.ActuatorProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.ActuatorProperty.builder()

      /**
       * @param allowedValues A list of possible values an actuator can take.
       */
      override fun allowedValues(allowedValues: List<String>) {
        cdkBuilder.allowedValues(allowedValues)
      }

      /**
       * @param allowedValues A list of possible values an actuator can take.
       */
      override fun allowedValues(vararg allowedValues: String): Unit =
          allowedValues(allowedValues.toList())

      /**
       * @param assignedValue A specified value for the actuator.
       */
      override fun assignedValue(assignedValue: String) {
        cdkBuilder.assignedValue(assignedValue)
      }

      /**
       * @param dataType The specified data type of the actuator. 
       */
      override fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
      }

      /**
       * @param description A brief description of the actuator.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param fullyQualifiedName The fully qualified name of the actuator. 
       * For example, the fully qualified name of an actuator might be
       * `Vehicle.Front.Left.Door.Lock` .
       */
      override fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
      }

      /**
       * @param max The specified possible maximum value of an actuator.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The specified possible minimum value of an actuator.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      /**
       * @param unit The scientific unit for the actuator.
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.ActuatorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.ActuatorProperty,
    ) : CdkObject(cdkObject),
        ActuatorProperty {
      /**
       * A list of possible values an actuator can take.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html#cfn-iotfleetwise-signalcatalog-actuator-allowedvalues)
       */
      override fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

      /**
       * A specified value for the actuator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html#cfn-iotfleetwise-signalcatalog-actuator-assignedvalue)
       */
      override fun assignedValue(): String? = unwrap(this).getAssignedValue()

      /**
       * The specified data type of the actuator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html#cfn-iotfleetwise-signalcatalog-actuator-datatype)
       */
      override fun dataType(): String = unwrap(this).getDataType()

      /**
       * A brief description of the actuator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html#cfn-iotfleetwise-signalcatalog-actuator-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The fully qualified name of the actuator.
       *
       * For example, the fully qualified name of an actuator might be
       * `Vehicle.Front.Left.Door.Lock` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html#cfn-iotfleetwise-signalcatalog-actuator-fullyqualifiedname)
       */
      override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()

      /**
       * The specified possible maximum value of an actuator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html#cfn-iotfleetwise-signalcatalog-actuator-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The specified possible minimum value of an actuator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html#cfn-iotfleetwise-signalcatalog-actuator-min)
       */
      override fun min(): Number? = unwrap(this).getMin()

      /**
       * The scientific unit for the actuator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-actuator.html#cfn-iotfleetwise-signalcatalog-actuator-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActuatorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.ActuatorProperty):
          ActuatorProperty = CdkObjectWrappers.wrap(cdkObject) as? ActuatorProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActuatorProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.ActuatorProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.ActuatorProperty
    }
  }

  /**
   * A signal that represents static information about the vehicle, such as engine type or
   * manufacturing date.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * AttributeProperty attributeProperty = AttributeProperty.builder()
   * .dataType("dataType")
   * .fullyQualifiedName("fullyQualifiedName")
   * // the properties below are optional
   * .allowedValues(List.of("allowedValues"))
   * .assignedValue("assignedValue")
   * .defaultValue("defaultValue")
   * .description("description")
   * .max(123)
   * .min(123)
   * .unit("unit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html)
   */
  public interface AttributeProperty {
    /**
     * A list of possible values an attribute can be assigned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-allowedvalues)
     */
    public fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

    /**
     * A specified value for the attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-assignedvalue)
     */
    public fun assignedValue(): String? = unwrap(this).getAssignedValue()

    /**
     * The specified data type of the attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-datatype)
     */
    public fun dataType(): String

    /**
     * The default value of the attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-defaultvalue)
     */
    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    /**
     * A brief description of the attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The fully qualified name of the attribute.
     *
     * For example, the fully qualified name of an attribute might be `Vehicle.Body.Engine.Type` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-fullyqualifiedname)
     */
    public fun fullyQualifiedName(): String

    /**
     * The specified possible maximum value of the attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The specified possible minimum value of the attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * The scientific unit for the attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * A builder for [AttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedValues A list of possible values an attribute can be assigned.
       */
      public fun allowedValues(allowedValues: List<String>)

      /**
       * @param allowedValues A list of possible values an attribute can be assigned.
       */
      public fun allowedValues(vararg allowedValues: String)

      /**
       * @param assignedValue A specified value for the attribute.
       */
      public fun assignedValue(assignedValue: String)

      /**
       * @param dataType The specified data type of the attribute. 
       */
      public fun dataType(dataType: String)

      /**
       * @param defaultValue The default value of the attribute.
       */
      public fun defaultValue(defaultValue: String)

      /**
       * @param description A brief description of the attribute.
       */
      public fun description(description: String)

      /**
       * @param fullyQualifiedName The fully qualified name of the attribute. 
       * For example, the fully qualified name of an attribute might be `Vehicle.Body.Engine.Type` .
       */
      public fun fullyQualifiedName(fullyQualifiedName: String)

      /**
       * @param max The specified possible maximum value of the attribute.
       */
      public fun max(max: Number)

      /**
       * @param min The specified possible minimum value of the attribute.
       */
      public fun min(min: Number)

      /**
       * @param unit The scientific unit for the attribute.
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.AttributeProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.AttributeProperty.builder()

      /**
       * @param allowedValues A list of possible values an attribute can be assigned.
       */
      override fun allowedValues(allowedValues: List<String>) {
        cdkBuilder.allowedValues(allowedValues)
      }

      /**
       * @param allowedValues A list of possible values an attribute can be assigned.
       */
      override fun allowedValues(vararg allowedValues: String): Unit =
          allowedValues(allowedValues.toList())

      /**
       * @param assignedValue A specified value for the attribute.
       */
      override fun assignedValue(assignedValue: String) {
        cdkBuilder.assignedValue(assignedValue)
      }

      /**
       * @param dataType The specified data type of the attribute. 
       */
      override fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
      }

      /**
       * @param defaultValue The default value of the attribute.
       */
      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      /**
       * @param description A brief description of the attribute.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param fullyQualifiedName The fully qualified name of the attribute. 
       * For example, the fully qualified name of an attribute might be `Vehicle.Body.Engine.Type` .
       */
      override fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
      }

      /**
       * @param max The specified possible maximum value of the attribute.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The specified possible minimum value of the attribute.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      /**
       * @param unit The scientific unit for the attribute.
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.AttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.AttributeProperty,
    ) : CdkObject(cdkObject),
        AttributeProperty {
      /**
       * A list of possible values an attribute can be assigned.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-allowedvalues)
       */
      override fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

      /**
       * A specified value for the attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-assignedvalue)
       */
      override fun assignedValue(): String? = unwrap(this).getAssignedValue()

      /**
       * The specified data type of the attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-datatype)
       */
      override fun dataType(): String = unwrap(this).getDataType()

      /**
       * The default value of the attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-defaultvalue)
       */
      override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      /**
       * A brief description of the attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The fully qualified name of the attribute.
       *
       * For example, the fully qualified name of an attribute might be `Vehicle.Body.Engine.Type` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-fullyqualifiedname)
       */
      override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()

      /**
       * The specified possible maximum value of the attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The specified possible minimum value of the attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-min)
       */
      override fun min(): Number? = unwrap(this).getMin()

      /**
       * The scientific unit for the attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-attribute.html#cfn-iotfleetwise-signalcatalog-attribute-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.AttributeProperty):
          AttributeProperty = CdkObjectWrappers.wrap(cdkObject) as? AttributeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.AttributeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.AttributeProperty
    }
  }

  /**
   * A group of signals that are defined in a hierarchical structure.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * BranchProperty branchProperty = BranchProperty.builder()
   * .fullyQualifiedName("fullyQualifiedName")
   * // the properties below are optional
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-branch.html)
   */
  public interface BranchProperty {
    /**
     * A brief description of the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-branch.html#cfn-iotfleetwise-signalcatalog-branch-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The fully qualified name of the branch.
     *
     * For example, the fully qualified name of a branch might be `Vehicle.Body.Engine` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-branch.html#cfn-iotfleetwise-signalcatalog-branch-fullyqualifiedname)
     */
    public fun fullyQualifiedName(): String

    /**
     * A builder for [BranchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description A brief description of the branch.
       */
      public fun description(description: String)

      /**
       * @param fullyQualifiedName The fully qualified name of the branch. 
       * For example, the fully qualified name of a branch might be `Vehicle.Body.Engine` .
       */
      public fun fullyQualifiedName(fullyQualifiedName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.BranchProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.BranchProperty.builder()

      /**
       * @param description A brief description of the branch.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param fullyQualifiedName The fully qualified name of the branch. 
       * For example, the fully qualified name of a branch might be `Vehicle.Body.Engine` .
       */
      override fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.BranchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.BranchProperty,
    ) : CdkObject(cdkObject),
        BranchProperty {
      /**
       * A brief description of the branch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-branch.html#cfn-iotfleetwise-signalcatalog-branch-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The fully qualified name of the branch.
       *
       * For example, the fully qualified name of a branch might be `Vehicle.Body.Engine` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-branch.html#cfn-iotfleetwise-signalcatalog-branch-fullyqualifiedname)
       */
      override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BranchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.BranchProperty):
          BranchProperty = CdkObjectWrappers.wrap(cdkObject) as? BranchProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BranchProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.BranchProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.BranchProperty
    }
  }

  /**
   * Information about the number of nodes and node types in a vehicle network.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * NodeCountsProperty nodeCountsProperty = NodeCountsProperty.builder()
   * .totalActuators(123)
   * .totalAttributes(123)
   * .totalBranches(123)
   * .totalNodes(123)
   * .totalSensors(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-nodecounts.html)
   */
  public interface NodeCountsProperty {
    /**
     * The total number of nodes in a vehicle network that represent actuators.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-nodecounts.html#cfn-iotfleetwise-signalcatalog-nodecounts-totalactuators)
     */
    public fun totalActuators(): Number? = unwrap(this).getTotalActuators()

    /**
     * The total number of nodes in a vehicle network that represent attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-nodecounts.html#cfn-iotfleetwise-signalcatalog-nodecounts-totalattributes)
     */
    public fun totalAttributes(): Number? = unwrap(this).getTotalAttributes()

    /**
     * The total number of nodes in a vehicle network that represent branches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-nodecounts.html#cfn-iotfleetwise-signalcatalog-nodecounts-totalbranches)
     */
    public fun totalBranches(): Number? = unwrap(this).getTotalBranches()

    /**
     * The total number of nodes in a vehicle network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-nodecounts.html#cfn-iotfleetwise-signalcatalog-nodecounts-totalnodes)
     */
    public fun totalNodes(): Number? = unwrap(this).getTotalNodes()

    /**
     * The total number of nodes in a vehicle network that represent sensors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-nodecounts.html#cfn-iotfleetwise-signalcatalog-nodecounts-totalsensors)
     */
    public fun totalSensors(): Number? = unwrap(this).getTotalSensors()

    /**
     * A builder for [NodeCountsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param totalActuators The total number of nodes in a vehicle network that represent
       * actuators.
       */
      public fun totalActuators(totalActuators: Number)

      /**
       * @param totalAttributes The total number of nodes in a vehicle network that represent
       * attributes.
       */
      public fun totalAttributes(totalAttributes: Number)

      /**
       * @param totalBranches The total number of nodes in a vehicle network that represent
       * branches.
       */
      public fun totalBranches(totalBranches: Number)

      /**
       * @param totalNodes The total number of nodes in a vehicle network.
       */
      public fun totalNodes(totalNodes: Number)

      /**
       * @param totalSensors The total number of nodes in a vehicle network that represent sensors.
       */
      public fun totalSensors(totalSensors: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeCountsProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeCountsProperty.builder()

      /**
       * @param totalActuators The total number of nodes in a vehicle network that represent
       * actuators.
       */
      override fun totalActuators(totalActuators: Number) {
        cdkBuilder.totalActuators(totalActuators)
      }

      /**
       * @param totalAttributes The total number of nodes in a vehicle network that represent
       * attributes.
       */
      override fun totalAttributes(totalAttributes: Number) {
        cdkBuilder.totalAttributes(totalAttributes)
      }

      /**
       * @param totalBranches The total number of nodes in a vehicle network that represent
       * branches.
       */
      override fun totalBranches(totalBranches: Number) {
        cdkBuilder.totalBranches(totalBranches)
      }

      /**
       * @param totalNodes The total number of nodes in a vehicle network.
       */
      override fun totalNodes(totalNodes: Number) {
        cdkBuilder.totalNodes(totalNodes)
      }

      /**
       * @param totalSensors The total number of nodes in a vehicle network that represent sensors.
       */
      override fun totalSensors(totalSensors: Number) {
        cdkBuilder.totalSensors(totalSensors)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeCountsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeCountsProperty,
    ) : CdkObject(cdkObject),
        NodeCountsProperty {
      /**
       * The total number of nodes in a vehicle network that represent actuators.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-nodecounts.html#cfn-iotfleetwise-signalcatalog-nodecounts-totalactuators)
       */
      override fun totalActuators(): Number? = unwrap(this).getTotalActuators()

      /**
       * The total number of nodes in a vehicle network that represent attributes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-nodecounts.html#cfn-iotfleetwise-signalcatalog-nodecounts-totalattributes)
       */
      override fun totalAttributes(): Number? = unwrap(this).getTotalAttributes()

      /**
       * The total number of nodes in a vehicle network that represent branches.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-nodecounts.html#cfn-iotfleetwise-signalcatalog-nodecounts-totalbranches)
       */
      override fun totalBranches(): Number? = unwrap(this).getTotalBranches()

      /**
       * The total number of nodes in a vehicle network.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-nodecounts.html#cfn-iotfleetwise-signalcatalog-nodecounts-totalnodes)
       */
      override fun totalNodes(): Number? = unwrap(this).getTotalNodes()

      /**
       * The total number of nodes in a vehicle network that represent sensors.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-nodecounts.html#cfn-iotfleetwise-signalcatalog-nodecounts-totalsensors)
       */
      override fun totalSensors(): Number? = unwrap(this).getTotalSensors()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NodeCountsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeCountsProperty):
          NodeCountsProperty = CdkObjectWrappers.wrap(cdkObject) as? NodeCountsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeCountsProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeCountsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeCountsProperty
    }
  }

  /**
   * A general abstraction of a signal.
   *
   * A node can be specified as an actuator, attribute, branch, or sensor.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * NodeProperty nodeProperty = NodeProperty.builder()
   * .actuator(ActuatorProperty.builder()
   * .dataType("dataType")
   * .fullyQualifiedName("fullyQualifiedName")
   * // the properties below are optional
   * .allowedValues(List.of("allowedValues"))
   * .assignedValue("assignedValue")
   * .description("description")
   * .max(123)
   * .min(123)
   * .unit("unit")
   * .build())
   * .attribute(AttributeProperty.builder()
   * .dataType("dataType")
   * .fullyQualifiedName("fullyQualifiedName")
   * // the properties below are optional
   * .allowedValues(List.of("allowedValues"))
   * .assignedValue("assignedValue")
   * .defaultValue("defaultValue")
   * .description("description")
   * .max(123)
   * .min(123)
   * .unit("unit")
   * .build())
   * .branch(BranchProperty.builder()
   * .fullyQualifiedName("fullyQualifiedName")
   * // the properties below are optional
   * .description("description")
   * .build())
   * .sensor(SensorProperty.builder()
   * .dataType("dataType")
   * .fullyQualifiedName("fullyQualifiedName")
   * // the properties below are optional
   * .allowedValues(List.of("allowedValues"))
   * .description("description")
   * .max(123)
   * .min(123)
   * .unit("unit")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-node.html)
   */
  public interface NodeProperty {
    /**
     * Information about a node specified as an actuator.
     *
     *
     * An actuator is a digital representation of a vehicle device.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-node.html#cfn-iotfleetwise-signalcatalog-node-actuator)
     */
    public fun actuator(): Any? = unwrap(this).getActuator()

    /**
     * Information about a node specified as an attribute.
     *
     *
     * An attribute represents static information about a vehicle.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-node.html#cfn-iotfleetwise-signalcatalog-node-attribute)
     */
    public fun attribute(): Any? = unwrap(this).getAttribute()

    /**
     * Information about a node specified as a branch.
     *
     *
     * A group of signals that are defined in a hierarchical structure.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-node.html#cfn-iotfleetwise-signalcatalog-node-branch)
     */
    public fun branch(): Any? = unwrap(this).getBranch()

    /**
     * An input component that reports the environmental condition of a vehicle.
     *
     *
     * You can collect data about fluid levels, temperatures, vibrations, or battery voltage from
     * sensors.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-node.html#cfn-iotfleetwise-signalcatalog-node-sensor)
     */
    public fun sensor(): Any? = unwrap(this).getSensor()

    /**
     * A builder for [NodeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actuator Information about a node specified as an actuator.
       *
       * An actuator is a digital representation of a vehicle device.
       */
      public fun actuator(actuator: IResolvable)

      /**
       * @param actuator Information about a node specified as an actuator.
       *
       * An actuator is a digital representation of a vehicle device.
       */
      public fun actuator(actuator: ActuatorProperty)

      /**
       * @param actuator Information about a node specified as an actuator.
       *
       * An actuator is a digital representation of a vehicle device.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2acf8afe2fe7e7b7dd7b7f6bc1739a5e29ddb7cb8a7082f0e9d79366d2264668")
      public fun actuator(actuator: ActuatorProperty.Builder.() -> Unit)

      /**
       * @param attribute Information about a node specified as an attribute.
       *
       * An attribute represents static information about a vehicle.
       */
      public fun attribute(attribute: IResolvable)

      /**
       * @param attribute Information about a node specified as an attribute.
       *
       * An attribute represents static information about a vehicle.
       */
      public fun attribute(attribute: AttributeProperty)

      /**
       * @param attribute Information about a node specified as an attribute.
       *
       * An attribute represents static information about a vehicle.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29464a7cdb5eddb73849eecbd689fe3011416a4777dbcb1a3106c134dc2295e2")
      public fun attribute(attribute: AttributeProperty.Builder.() -> Unit)

      /**
       * @param branch Information about a node specified as a branch.
       *
       * A group of signals that are defined in a hierarchical structure.
       */
      public fun branch(branch: IResolvable)

      /**
       * @param branch Information about a node specified as a branch.
       *
       * A group of signals that are defined in a hierarchical structure.
       */
      public fun branch(branch: BranchProperty)

      /**
       * @param branch Information about a node specified as a branch.
       *
       * A group of signals that are defined in a hierarchical structure.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf3d34cb6af7ed15d1121a1bb70eb3056ab9662f4d5039f094b088c0e1e766bc")
      public fun branch(branch: BranchProperty.Builder.() -> Unit)

      /**
       * @param sensor An input component that reports the environmental condition of a vehicle.
       *
       * You can collect data about fluid levels, temperatures, vibrations, or battery voltage from
       * sensors.
       */
      public fun sensor(sensor: IResolvable)

      /**
       * @param sensor An input component that reports the environmental condition of a vehicle.
       *
       * You can collect data about fluid levels, temperatures, vibrations, or battery voltage from
       * sensors.
       */
      public fun sensor(sensor: SensorProperty)

      /**
       * @param sensor An input component that reports the environmental condition of a vehicle.
       *
       * You can collect data about fluid levels, temperatures, vibrations, or battery voltage from
       * sensors.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("892b1e5183f2ea8fd2e210150071f4141fe41b08fb290e79140a246965e4aaad")
      public fun sensor(sensor: SensorProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeProperty.builder()

      /**
       * @param actuator Information about a node specified as an actuator.
       *
       * An actuator is a digital representation of a vehicle device.
       */
      override fun actuator(actuator: IResolvable) {
        cdkBuilder.actuator(actuator.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param actuator Information about a node specified as an actuator.
       *
       * An actuator is a digital representation of a vehicle device.
       */
      override fun actuator(actuator: ActuatorProperty) {
        cdkBuilder.actuator(actuator.let(ActuatorProperty.Companion::unwrap))
      }

      /**
       * @param actuator Information about a node specified as an actuator.
       *
       * An actuator is a digital representation of a vehicle device.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2acf8afe2fe7e7b7dd7b7f6bc1739a5e29ddb7cb8a7082f0e9d79366d2264668")
      override fun actuator(actuator: ActuatorProperty.Builder.() -> Unit): Unit =
          actuator(ActuatorProperty(actuator))

      /**
       * @param attribute Information about a node specified as an attribute.
       *
       * An attribute represents static information about a vehicle.
       */
      override fun attribute(attribute: IResolvable) {
        cdkBuilder.attribute(attribute.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param attribute Information about a node specified as an attribute.
       *
       * An attribute represents static information about a vehicle.
       */
      override fun attribute(attribute: AttributeProperty) {
        cdkBuilder.attribute(attribute.let(AttributeProperty.Companion::unwrap))
      }

      /**
       * @param attribute Information about a node specified as an attribute.
       *
       * An attribute represents static information about a vehicle.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29464a7cdb5eddb73849eecbd689fe3011416a4777dbcb1a3106c134dc2295e2")
      override fun attribute(attribute: AttributeProperty.Builder.() -> Unit): Unit =
          attribute(AttributeProperty(attribute))

      /**
       * @param branch Information about a node specified as a branch.
       *
       * A group of signals that are defined in a hierarchical structure.
       */
      override fun branch(branch: IResolvable) {
        cdkBuilder.branch(branch.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param branch Information about a node specified as a branch.
       *
       * A group of signals that are defined in a hierarchical structure.
       */
      override fun branch(branch: BranchProperty) {
        cdkBuilder.branch(branch.let(BranchProperty.Companion::unwrap))
      }

      /**
       * @param branch Information about a node specified as a branch.
       *
       * A group of signals that are defined in a hierarchical structure.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf3d34cb6af7ed15d1121a1bb70eb3056ab9662f4d5039f094b088c0e1e766bc")
      override fun branch(branch: BranchProperty.Builder.() -> Unit): Unit =
          branch(BranchProperty(branch))

      /**
       * @param sensor An input component that reports the environmental condition of a vehicle.
       *
       * You can collect data about fluid levels, temperatures, vibrations, or battery voltage from
       * sensors.
       */
      override fun sensor(sensor: IResolvable) {
        cdkBuilder.sensor(sensor.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sensor An input component that reports the environmental condition of a vehicle.
       *
       * You can collect data about fluid levels, temperatures, vibrations, or battery voltage from
       * sensors.
       */
      override fun sensor(sensor: SensorProperty) {
        cdkBuilder.sensor(sensor.let(SensorProperty.Companion::unwrap))
      }

      /**
       * @param sensor An input component that reports the environmental condition of a vehicle.
       *
       * You can collect data about fluid levels, temperatures, vibrations, or battery voltage from
       * sensors.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("892b1e5183f2ea8fd2e210150071f4141fe41b08fb290e79140a246965e4aaad")
      override fun sensor(sensor: SensorProperty.Builder.() -> Unit): Unit =
          sensor(SensorProperty(sensor))

      public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeProperty,
    ) : CdkObject(cdkObject),
        NodeProperty {
      /**
       * Information about a node specified as an actuator.
       *
       *
       * An actuator is a digital representation of a vehicle device.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-node.html#cfn-iotfleetwise-signalcatalog-node-actuator)
       */
      override fun actuator(): Any? = unwrap(this).getActuator()

      /**
       * Information about a node specified as an attribute.
       *
       *
       * An attribute represents static information about a vehicle.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-node.html#cfn-iotfleetwise-signalcatalog-node-attribute)
       */
      override fun attribute(): Any? = unwrap(this).getAttribute()

      /**
       * Information about a node specified as a branch.
       *
       *
       * A group of signals that are defined in a hierarchical structure.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-node.html#cfn-iotfleetwise-signalcatalog-node-branch)
       */
      override fun branch(): Any? = unwrap(this).getBranch()

      /**
       * An input component that reports the environmental condition of a vehicle.
       *
       *
       * You can collect data about fluid levels, temperatures, vibrations, or battery voltage from
       * sensors.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-node.html#cfn-iotfleetwise-signalcatalog-node-sensor)
       */
      override fun sensor(): Any? = unwrap(this).getSensor()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeProperty):
          NodeProperty = CdkObjectWrappers.wrap(cdkObject) as? NodeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeProperty
    }
  }

  /**
   * An input component that reports the environmental condition of a vehicle.
   *
   *
   * You can collect data about fluid levels, temperatures, vibrations, or battery voltage from
   * sensors.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
   * SensorProperty sensorProperty = SensorProperty.builder()
   * .dataType("dataType")
   * .fullyQualifiedName("fullyQualifiedName")
   * // the properties below are optional
   * .allowedValues(List.of("allowedValues"))
   * .description("description")
   * .max(123)
   * .min(123)
   * .unit("unit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-sensor.html)
   */
  public interface SensorProperty {
    /**
     * A list of possible values a sensor can take.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-sensor.html#cfn-iotfleetwise-signalcatalog-sensor-allowedvalues)
     */
    public fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

    /**
     * The specified data type of the sensor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-sensor.html#cfn-iotfleetwise-signalcatalog-sensor-datatype)
     */
    public fun dataType(): String

    /**
     * A brief description of a sensor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-sensor.html#cfn-iotfleetwise-signalcatalog-sensor-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The fully qualified name of the sensor.
     *
     * For example, the fully qualified name of a sensor might be `Vehicle.Body.Engine.Battery` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-sensor.html#cfn-iotfleetwise-signalcatalog-sensor-fullyqualifiedname)
     */
    public fun fullyQualifiedName(): String

    /**
     * The specified possible maximum value of the sensor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-sensor.html#cfn-iotfleetwise-signalcatalog-sensor-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The specified possible minimum value of the sensor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-sensor.html#cfn-iotfleetwise-signalcatalog-sensor-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * The scientific unit of measurement for data collected by the sensor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-sensor.html#cfn-iotfleetwise-signalcatalog-sensor-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * A builder for [SensorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedValues A list of possible values a sensor can take.
       */
      public fun allowedValues(allowedValues: List<String>)

      /**
       * @param allowedValues A list of possible values a sensor can take.
       */
      public fun allowedValues(vararg allowedValues: String)

      /**
       * @param dataType The specified data type of the sensor. 
       */
      public fun dataType(dataType: String)

      /**
       * @param description A brief description of a sensor.
       */
      public fun description(description: String)

      /**
       * @param fullyQualifiedName The fully qualified name of the sensor. 
       * For example, the fully qualified name of a sensor might be `Vehicle.Body.Engine.Battery` .
       */
      public fun fullyQualifiedName(fullyQualifiedName: String)

      /**
       * @param max The specified possible maximum value of the sensor.
       */
      public fun max(max: Number)

      /**
       * @param min The specified possible minimum value of the sensor.
       */
      public fun min(min: Number)

      /**
       * @param unit The scientific unit of measurement for data collected by the sensor.
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.SensorProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.SensorProperty.builder()

      /**
       * @param allowedValues A list of possible values a sensor can take.
       */
      override fun allowedValues(allowedValues: List<String>) {
        cdkBuilder.allowedValues(allowedValues)
      }

      /**
       * @param allowedValues A list of possible values a sensor can take.
       */
      override fun allowedValues(vararg allowedValues: String): Unit =
          allowedValues(allowedValues.toList())

      /**
       * @param dataType The specified data type of the sensor. 
       */
      override fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
      }

      /**
       * @param description A brief description of a sensor.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param fullyQualifiedName The fully qualified name of the sensor. 
       * For example, the fully qualified name of a sensor might be `Vehicle.Body.Engine.Battery` .
       */
      override fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
      }

      /**
       * @param max The specified possible maximum value of the sensor.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The specified possible minimum value of the sensor.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      /**
       * @param unit The scientific unit of measurement for data collected by the sensor.
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.SensorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.SensorProperty,
    ) : CdkObject(cdkObject),
        SensorProperty {
      /**
       * A list of possible values a sensor can take.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-sensor.html#cfn-iotfleetwise-signalcatalog-sensor-allowedvalues)
       */
      override fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

      /**
       * The specified data type of the sensor.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-sensor.html#cfn-iotfleetwise-signalcatalog-sensor-datatype)
       */
      override fun dataType(): String = unwrap(this).getDataType()

      /**
       * A brief description of a sensor.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-sensor.html#cfn-iotfleetwise-signalcatalog-sensor-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The fully qualified name of the sensor.
       *
       * For example, the fully qualified name of a sensor might be `Vehicle.Body.Engine.Battery` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-sensor.html#cfn-iotfleetwise-signalcatalog-sensor-fullyqualifiedname)
       */
      override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()

      /**
       * The specified possible maximum value of the sensor.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-sensor.html#cfn-iotfleetwise-signalcatalog-sensor-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The specified possible minimum value of the sensor.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-sensor.html#cfn-iotfleetwise-signalcatalog-sensor-min)
       */
      override fun min(): Number? = unwrap(this).getMin()

      /**
       * The scientific unit of measurement for data collected by the sensor.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-sensor.html#cfn-iotfleetwise-signalcatalog-sensor-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SensorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.SensorProperty):
          SensorProperty = CdkObjectWrappers.wrap(cdkObject) as? SensorProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SensorProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.SensorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.SensorProperty
    }
  }
}
