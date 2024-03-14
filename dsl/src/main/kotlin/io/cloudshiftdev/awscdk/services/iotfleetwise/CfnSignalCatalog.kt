package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSignalCatalog internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrLastModificationTime(): String = unwrap(this).getAttrLastModificationTime()

  public open fun attrNodeCountsTotalActuators(): IResolvable =
      unwrap(this).getAttrNodeCountsTotalActuators().let(IResolvable::wrap)

  public open fun attrNodeCountsTotalAttributes(): IResolvable =
      unwrap(this).getAttrNodeCountsTotalAttributes().let(IResolvable::wrap)

  public open fun attrNodeCountsTotalBranches(): IResolvable =
      unwrap(this).getAttrNodeCountsTotalBranches().let(IResolvable::wrap)

  public open fun attrNodeCountsTotalNodes(): IResolvable =
      unwrap(this).getAttrNodeCountsTotalNodes().let(IResolvable::wrap)

  public open fun attrNodeCountsTotalSensors(): IResolvable =
      unwrap(this).getAttrNodeCountsTotalSensors().let(IResolvable::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun nodeCounts(): Any? = unwrap(this).getNodeCounts()

  public open fun nodeCounts(`value`: IResolvable) {
    unwrap(this).setNodeCounts(`value`.let(IResolvable::unwrap))
  }

  public open fun nodeCounts(`value`: NodeCountsProperty) {
    unwrap(this).setNodeCounts(`value`.let(NodeCountsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cc3959deed9e373a7066695f451acd3e636548596d2fcb63f9893b8f0a92eba8")
  public open fun nodeCounts(`value`: NodeCountsProperty.Builder.() -> Unit): Unit =
      nodeCounts(NodeCountsProperty(`value`))

  public open fun nodes(): Any? = unwrap(this).getNodes()

  public open fun nodes(`value`: IResolvable) {
    unwrap(this).setNodes(`value`.let(IResolvable::unwrap))
  }

  public open fun nodes(__idx_ac66f0: List<Any>) {
    unwrap(this).setNodes(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun name(name: String) {
    }

    public fun nodeCounts(nodeCounts: IResolvable) {
    }

    public fun nodeCounts(nodeCounts: NodeCountsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c2c036ef5820857fbc4d7fe0319e34db43831f2e7b29d3257ec25b0e0ae6ac7")
    public fun nodeCounts(nodeCounts: NodeCountsProperty.Builder.() -> Unit) {
    }

    public fun nodes(nodes: IResolvable) {
    }

    public fun nodes(nodes: List<Any>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun nodeCounts(nodeCounts: IResolvable) {
      cdkBuilder.nodeCounts(nodeCounts.let(IResolvable::unwrap))
    }

    public override fun nodeCounts(nodeCounts: NodeCountsProperty) {
      cdkBuilder.nodeCounts(nodeCounts.let(NodeCountsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c2c036ef5820857fbc4d7fe0319e34db43831f2e7b29d3257ec25b0e0ae6ac7")
    public override fun nodeCounts(nodeCounts: NodeCountsProperty.Builder.() -> Unit): Unit =
        nodeCounts(NodeCountsProperty(nodeCounts))

    public override fun nodes(nodes: IResolvable) {
      cdkBuilder.nodes(nodes.let(IResolvable::unwrap))
    }

    public override fun nodes(nodes: List<Any>) {
      cdkBuilder.nodes(nodes)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog = wrapped.cdkObject
  }

  public interface ActuatorProperty {
    public fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

    public fun assignedValue(): String? = unwrap(this).getAssignedValue()

    public fun dataType(): String

    public fun description(): String? = unwrap(this).getDescription()

    public fun fullyQualifiedName(): String

    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public fun unit(): String? = unwrap(this).getUnit()

    public interface Builder {
      public fun allowedValues(allowedValues: List<String>) {
      }

      public fun assignedValue(assignedValue: String) {
      }

      public fun dataType(dataType: String) {
      }

      public fun description(description: String) {
      }

      public fun fullyQualifiedName(fullyQualifiedName: String) {
      }

      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }

      public fun unit(unit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.ActuatorProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.ActuatorProperty.builder()

      public override fun allowedValues(allowedValues: List<String>) {
        cdkBuilder.allowedValues(allowedValues)
      }

      public override fun assignedValue(assignedValue: String) {
        cdkBuilder.assignedValue(assignedValue)
      }

      public override fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
      }

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.ActuatorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.ActuatorProperty,
    ) : ActuatorProperty {
      public override fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?:
          emptyList()

      public override fun assignedValue(): String? = unwrap(this).getAssignedValue()

      public override fun dataType(): String = unwrap(this).getDataType()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()

      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()

      public override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActuatorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.ActuatorProperty):
          ActuatorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActuatorProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.ActuatorProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface NodeProperty {
    public fun actuator(): Any? = unwrap(this).getActuator()

    public fun attribute(): Any? = unwrap(this).getAttribute()

    public fun branch(): Any? = unwrap(this).getBranch()

    public fun sensor(): Any? = unwrap(this).getSensor()

    public interface Builder {
      public fun actuator(actuator: IResolvable) {
      }

      public fun actuator(actuator: ActuatorProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2acf8afe2fe7e7b7dd7b7f6bc1739a5e29ddb7cb8a7082f0e9d79366d2264668")
      public fun actuator(actuator: ActuatorProperty.Builder.() -> Unit) {
      }

      public fun attribute(attribute: IResolvable) {
      }

      public fun attribute(attribute: AttributeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29464a7cdb5eddb73849eecbd689fe3011416a4777dbcb1a3106c134dc2295e2")
      public fun attribute(attribute: AttributeProperty.Builder.() -> Unit) {
      }

      public fun branch(branch: IResolvable) {
      }

      public fun branch(branch: BranchProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf3d34cb6af7ed15d1121a1bb70eb3056ab9662f4d5039f094b088c0e1e766bc")
      public fun branch(branch: BranchProperty.Builder.() -> Unit) {
      }

      public fun sensor(sensor: IResolvable) {
      }

      public fun sensor(sensor: SensorProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("892b1e5183f2ea8fd2e210150071f4141fe41b08fb290e79140a246965e4aaad")
      public fun sensor(sensor: SensorProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeProperty.builder()

      public override fun actuator(actuator: IResolvable) {
        cdkBuilder.actuator(actuator.let(IResolvable::unwrap))
      }

      public override fun actuator(actuator: ActuatorProperty) {
        cdkBuilder.actuator(actuator.let(ActuatorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2acf8afe2fe7e7b7dd7b7f6bc1739a5e29ddb7cb8a7082f0e9d79366d2264668")
      public override fun actuator(actuator: ActuatorProperty.Builder.() -> Unit): Unit =
          actuator(ActuatorProperty(actuator))

      public override fun attribute(attribute: IResolvable) {
        cdkBuilder.attribute(attribute.let(IResolvable::unwrap))
      }

      public override fun attribute(attribute: AttributeProperty) {
        cdkBuilder.attribute(attribute.let(AttributeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29464a7cdb5eddb73849eecbd689fe3011416a4777dbcb1a3106c134dc2295e2")
      public override fun attribute(attribute: AttributeProperty.Builder.() -> Unit): Unit =
          attribute(AttributeProperty(attribute))

      public override fun branch(branch: IResolvable) {
        cdkBuilder.branch(branch.let(IResolvable::unwrap))
      }

      public override fun branch(branch: BranchProperty) {
        cdkBuilder.branch(branch.let(BranchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf3d34cb6af7ed15d1121a1bb70eb3056ab9662f4d5039f094b088c0e1e766bc")
      public override fun branch(branch: BranchProperty.Builder.() -> Unit): Unit =
          branch(BranchProperty(branch))

      public override fun sensor(sensor: IResolvable) {
        cdkBuilder.sensor(sensor.let(IResolvable::unwrap))
      }

      public override fun sensor(sensor: SensorProperty) {
        cdkBuilder.sensor(sensor.let(SensorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("892b1e5183f2ea8fd2e210150071f4141fe41b08fb290e79140a246965e4aaad")
      public override fun sensor(sensor: SensorProperty.Builder.() -> Unit): Unit =
          sensor(SensorProperty(sensor))

      public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeProperty,
    ) : NodeProperty {
      public override fun actuator(): Any? = unwrap(this).getActuator()

      public override fun attribute(): Any? = unwrap(this).getAttribute()

      public override fun branch(): Any? = unwrap(this).getBranch()

      public override fun sensor(): Any? = unwrap(this).getSensor()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeProperty):
          NodeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SensorProperty {
    public fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

    public fun dataType(): String

    public fun description(): String? = unwrap(this).getDescription()

    public fun fullyQualifiedName(): String

    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public fun unit(): String? = unwrap(this).getUnit()

    public interface Builder {
      public fun allowedValues(allowedValues: List<String>) {
      }

      public fun dataType(dataType: String) {
      }

      public fun description(description: String) {
      }

      public fun fullyQualifiedName(fullyQualifiedName: String) {
      }

      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }

      public fun unit(unit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.SensorProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.SensorProperty.builder()

      public override fun allowedValues(allowedValues: List<String>) {
        cdkBuilder.allowedValues(allowedValues)
      }

      public override fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
      }

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.SensorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.SensorProperty,
    ) : SensorProperty {
      public override fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?:
          emptyList()

      public override fun dataType(): String = unwrap(this).getDataType()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()

      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()

      public override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SensorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.SensorProperty):
          SensorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SensorProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.SensorProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AttributeProperty {
    public fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

    public fun assignedValue(): String? = unwrap(this).getAssignedValue()

    public fun dataType(): String

    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    public fun description(): String? = unwrap(this).getDescription()

    public fun fullyQualifiedName(): String

    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public fun unit(): String? = unwrap(this).getUnit()

    public interface Builder {
      public fun allowedValues(allowedValues: List<String>) {
      }

      public fun assignedValue(assignedValue: String) {
      }

      public fun dataType(dataType: String) {
      }

      public fun defaultValue(defaultValue: String) {
      }

      public fun description(description: String) {
      }

      public fun fullyQualifiedName(fullyQualifiedName: String) {
      }

      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }

      public fun unit(unit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.AttributeProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.AttributeProperty.builder()

      public override fun allowedValues(allowedValues: List<String>) {
        cdkBuilder.allowedValues(allowedValues)
      }

      public override fun assignedValue(assignedValue: String) {
        cdkBuilder.assignedValue(assignedValue)
      }

      public override fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
      }

      public override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
      }

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.AttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.AttributeProperty,
    ) : AttributeProperty {
      public override fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?:
          emptyList()

      public override fun assignedValue(): String? = unwrap(this).getAssignedValue()

      public override fun dataType(): String = unwrap(this).getDataType()

      public override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()

      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()

      public override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.AttributeProperty):
          AttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.AttributeProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface BranchProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun fullyQualifiedName(): String

    public interface Builder {
      public fun description(description: String) {
      }

      public fun fullyQualifiedName(fullyQualifiedName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.BranchProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.BranchProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.BranchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.BranchProperty,
    ) : BranchProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BranchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.BranchProperty):
          BranchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BranchProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.BranchProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NodeCountsProperty {
    public fun totalActuators(): Number? = unwrap(this).getTotalActuators()

    public fun totalAttributes(): Number? = unwrap(this).getTotalAttributes()

    public fun totalBranches(): Number? = unwrap(this).getTotalBranches()

    public fun totalNodes(): Number? = unwrap(this).getTotalNodes()

    public fun totalSensors(): Number? = unwrap(this).getTotalSensors()

    public interface Builder {
      public fun totalActuators(totalActuators: Number) {
      }

      public fun totalAttributes(totalAttributes: Number) {
      }

      public fun totalBranches(totalBranches: Number) {
      }

      public fun totalNodes(totalNodes: Number) {
      }

      public fun totalSensors(totalSensors: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeCountsProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeCountsProperty.builder()

      public override fun totalActuators(totalActuators: Number) {
        cdkBuilder.totalActuators(totalActuators)
      }

      public override fun totalAttributes(totalAttributes: Number) {
        cdkBuilder.totalAttributes(totalAttributes)
      }

      public override fun totalBranches(totalBranches: Number) {
        cdkBuilder.totalBranches(totalBranches)
      }

      public override fun totalNodes(totalNodes: Number) {
        cdkBuilder.totalNodes(totalNodes)
      }

      public override fun totalSensors(totalSensors: Number) {
        cdkBuilder.totalSensors(totalSensors)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeCountsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeCountsProperty,
    ) : NodeCountsProperty {
      public override fun totalActuators(): Number? = unwrap(this).getTotalActuators()

      public override fun totalAttributes(): Number? = unwrap(this).getTotalAttributes()

      public override fun totalBranches(): Number? = unwrap(this).getTotalBranches()

      public override fun totalNodes(): Number? = unwrap(this).getTotalNodes()

      public override fun totalSensors(): Number? = unwrap(this).getTotalSensors()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NodeCountsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeCountsProperty):
          NodeCountsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeCountsProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog.NodeCountsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
