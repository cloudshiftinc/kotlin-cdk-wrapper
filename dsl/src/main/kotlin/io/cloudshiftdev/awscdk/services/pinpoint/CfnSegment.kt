package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CfnResource
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

public open class CfnSegment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrSegmentId(): String = unwrap(this).getAttrSegmentId()

  public open fun dimensions(): Any? = unwrap(this).getDimensions()

  public open fun dimensions(`value`: IResolvable) {
    unwrap(this).setDimensions(`value`.let(IResolvable::unwrap))
  }

  public open fun dimensions(`value`: SegmentDimensionsProperty) {
    unwrap(this).setDimensions(`value`.let(SegmentDimensionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0a2044384b36baa8bbe33f009c6462602b6882314214a6c4fd4ccbb10898e2fe")
  public open fun dimensions(`value`: SegmentDimensionsProperty.Builder.() -> Unit): Unit =
      dimensions(SegmentDimensionsProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun segmentGroups(): Any? = unwrap(this).getSegmentGroups()

  public open fun segmentGroups(`value`: IResolvable) {
    unwrap(this).setSegmentGroups(`value`.let(IResolvable::unwrap))
  }

  public open fun segmentGroups(`value`: SegmentGroupsProperty) {
    unwrap(this).setSegmentGroups(`value`.let(SegmentGroupsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fa834199bd9aefdd0a4e79f4b67d28df9ccf03b5b5e23247e2105dd222594fc7")
  public open fun segmentGroups(`value`: SegmentGroupsProperty.Builder.() -> Unit): Unit =
      segmentGroups(SegmentGroupsProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun applicationId(applicationId: String)

    public fun dimensions(dimensions: IResolvable)

    public fun dimensions(dimensions: SegmentDimensionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd231d0070f91e7a6132a26cb52126283d7f2eb07aaf9f5926fdad4e20799623")
    public fun dimensions(dimensions: SegmentDimensionsProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun segmentGroups(segmentGroups: IResolvable)

    public fun segmentGroups(segmentGroups: SegmentGroupsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2fc3a1035c47b59302a0ca42c5b71efb23a05c4c0cb18c0f4f87f402dab8c26")
    public fun segmentGroups(segmentGroups: SegmentGroupsProperty.Builder.() -> Unit)

    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnSegment.Builder =
        software.amazon.awscdk.services.pinpoint.CfnSegment.Builder.create(scope, id)

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun dimensions(dimensions: IResolvable) {
      cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
    }

    override fun dimensions(dimensions: SegmentDimensionsProperty) {
      cdkBuilder.dimensions(dimensions.let(SegmentDimensionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd231d0070f91e7a6132a26cb52126283d7f2eb07aaf9f5926fdad4e20799623")
    override fun dimensions(dimensions: SegmentDimensionsProperty.Builder.() -> Unit): Unit =
        dimensions(SegmentDimensionsProperty(dimensions))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun segmentGroups(segmentGroups: IResolvable) {
      cdkBuilder.segmentGroups(segmentGroups.let(IResolvable::unwrap))
    }

    override fun segmentGroups(segmentGroups: SegmentGroupsProperty) {
      cdkBuilder.segmentGroups(segmentGroups.let(SegmentGroupsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2fc3a1035c47b59302a0ca42c5b71efb23a05c4c0cb18c0f4f87f402dab8c26")
    override fun segmentGroups(segmentGroups: SegmentGroupsProperty.Builder.() -> Unit): Unit =
        segmentGroups(SegmentGroupsProperty(segmentGroups))

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnSegment = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSegment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSegment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment): CfnSegment =
        CfnSegment(cdkObject)

    internal fun unwrap(wrapped: CfnSegment): software.amazon.awscdk.services.pinpoint.CfnSegment =
        wrapped.cdkObject
  }

  public interface GroupsProperty {
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    public fun sourceSegments(): Any? = unwrap(this).getSourceSegments()

    public fun sourceType(): String? = unwrap(this).getSourceType()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun dimensions(dimensions: IResolvable)

      public fun dimensions(dimensions: List<Any>)

      public fun dimensions(vararg dimensions: Any)

      public fun sourceSegments(sourceSegments: IResolvable)

      public fun sourceSegments(sourceSegments: List<Any>)

      public fun sourceSegments(vararg sourceSegments: Any)

      public fun sourceType(sourceType: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnSegment.GroupsProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnSegment.GroupsProperty.builder()

      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      override fun sourceSegments(sourceSegments: IResolvable) {
        cdkBuilder.sourceSegments(sourceSegments.let(IResolvable::unwrap))
      }

      override fun sourceSegments(sourceSegments: List<Any>) {
        cdkBuilder.sourceSegments(sourceSegments)
      }

      override fun sourceSegments(vararg sourceSegments: Any): Unit =
          sourceSegments(sourceSegments.toList())

      override fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnSegment.GroupsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.GroupsProperty,
    ) : GroupsProperty {
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      override fun sourceSegments(): Any? = unwrap(this).getSourceSegments()

      override fun sourceType(): String? = unwrap(this).getSourceType()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GroupsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.GroupsProperty):
          GroupsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GroupsProperty):
          software.amazon.awscdk.services.pinpoint.CfnSegment.GroupsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AttributeDimensionProperty {
    public fun attributeType(): String? = unwrap(this).getAttributeType()

    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    public interface Builder {
      public fun attributeType(attributeType: String)

      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnSegment.AttributeDimensionProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnSegment.AttributeDimensionProperty.builder()

      override fun attributeType(attributeType: String) {
        cdkBuilder.attributeType(attributeType)
      }

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnSegment.AttributeDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnSegment.AttributeDimensionProperty,
    ) : AttributeDimensionProperty {
      override fun attributeType(): String? = unwrap(this).getAttributeType()

      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.AttributeDimensionProperty):
          AttributeDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeDimensionProperty):
          software.amazon.awscdk.services.pinpoint.CfnSegment.AttributeDimensionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SegmentDimensionsProperty {
    public fun attributes(): Any? = unwrap(this).getAttributes()

    public fun behavior(): Any? = unwrap(this).getBehavior()

    public fun demographic(): Any? = unwrap(this).getDemographic()

    public fun location(): Any? = unwrap(this).getLocation()

    public fun metrics(): Any? = unwrap(this).getMetrics()

    public fun userAttributes(): Any? = unwrap(this).getUserAttributes()

    public interface Builder {
      public fun attributes(attributes: Any)

      public fun behavior(behavior: IResolvable)

      public fun behavior(behavior: BehaviorProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae95bd65406a2e5e09a7c29b613743d86d3e37dc044d0d9cc2febffcd005ad68")
      public fun behavior(behavior: BehaviorProperty.Builder.() -> Unit)

      public fun demographic(demographic: IResolvable)

      public fun demographic(demographic: DemographicProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69b2bab0965b363672304e7d1297fcf2f35c9a92e95ff9c1b3994510c9684037")
      public fun demographic(demographic: DemographicProperty.Builder.() -> Unit)

      public fun location(location: IResolvable)

      public fun location(location: LocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0b209f7947f4e1b6e5a9f30d13e1cce22c3583e79da6055dfc8cc4b3ec3aedc")
      public fun location(location: LocationProperty.Builder.() -> Unit)

      public fun metrics(metrics: Any)

      public fun userAttributes(userAttributes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty.builder()

      override fun attributes(attributes: Any) {
        cdkBuilder.attributes(attributes)
      }

      override fun behavior(behavior: IResolvable) {
        cdkBuilder.behavior(behavior.let(IResolvable::unwrap))
      }

      override fun behavior(behavior: BehaviorProperty) {
        cdkBuilder.behavior(behavior.let(BehaviorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae95bd65406a2e5e09a7c29b613743d86d3e37dc044d0d9cc2febffcd005ad68")
      override fun behavior(behavior: BehaviorProperty.Builder.() -> Unit): Unit =
          behavior(BehaviorProperty(behavior))

      override fun demographic(demographic: IResolvable) {
        cdkBuilder.demographic(demographic.let(IResolvable::unwrap))
      }

      override fun demographic(demographic: DemographicProperty) {
        cdkBuilder.demographic(demographic.let(DemographicProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69b2bab0965b363672304e7d1297fcf2f35c9a92e95ff9c1b3994510c9684037")
      override fun demographic(demographic: DemographicProperty.Builder.() -> Unit): Unit =
          demographic(DemographicProperty(demographic))

      override fun location(location: IResolvable) {
        cdkBuilder.location(location.let(IResolvable::unwrap))
      }

      override fun location(location: LocationProperty) {
        cdkBuilder.location(location.let(LocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0b209f7947f4e1b6e5a9f30d13e1cce22c3583e79da6055dfc8cc4b3ec3aedc")
      override fun location(location: LocationProperty.Builder.() -> Unit): Unit =
          location(LocationProperty(location))

      override fun metrics(metrics: Any) {
        cdkBuilder.metrics(metrics)
      }

      override fun userAttributes(userAttributes: Any) {
        cdkBuilder.userAttributes(userAttributes)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty,
    ) : SegmentDimensionsProperty {
      override fun attributes(): Any? = unwrap(this).getAttributes()

      override fun behavior(): Any? = unwrap(this).getBehavior()

      override fun demographic(): Any? = unwrap(this).getDemographic()

      override fun location(): Any? = unwrap(this).getLocation()

      override fun metrics(): Any? = unwrap(this).getMetrics()

      override fun userAttributes(): Any? = unwrap(this).getUserAttributes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SegmentDimensionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty):
          SegmentDimensionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SegmentDimensionsProperty):
          software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SegmentGroupsProperty {
    public fun groups(): Any? = unwrap(this).getGroups()

    public fun include(): String? = unwrap(this).getInclude()

    public interface Builder {
      public fun groups(groups: IResolvable)

      public fun groups(groups: List<Any>)

      public fun groups(vararg groups: Any)

      public fun include(include: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty.builder()

      override fun groups(groups: IResolvable) {
        cdkBuilder.groups(groups.let(IResolvable::unwrap))
      }

      override fun groups(groups: List<Any>) {
        cdkBuilder.groups(groups)
      }

      override fun groups(vararg groups: Any): Unit = groups(groups.toList())

      override fun include(include: String) {
        cdkBuilder.include(include)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty,
    ) : SegmentGroupsProperty {
      override fun groups(): Any? = unwrap(this).getGroups()

      override fun include(): String? = unwrap(this).getInclude()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SegmentGroupsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty):
          SegmentGroupsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SegmentGroupsProperty):
          software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LocationProperty {
    public fun country(): Any? = unwrap(this).getCountry()

    public fun gpsPoint(): Any? = unwrap(this).getGpsPoint()

    public interface Builder {
      public fun country(country: IResolvable)

      public fun country(country: SetDimensionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16f2c23a3efd8caa63761821f79f5e5ac9855184b3fa61f098d320d5d80b9ff9")
      public fun country(country: SetDimensionProperty.Builder.() -> Unit)

      public fun gpsPoint(gpsPoint: IResolvable)

      public fun gpsPoint(gpsPoint: GPSPointProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("823d386aae3d6722b4591e67f72c640b6d7c7077d4e566b2e7aeba751ec04aea")
      public fun gpsPoint(gpsPoint: GPSPointProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnSegment.LocationProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnSegment.LocationProperty.builder()

      override fun country(country: IResolvable) {
        cdkBuilder.country(country.let(IResolvable::unwrap))
      }

      override fun country(country: SetDimensionProperty) {
        cdkBuilder.country(country.let(SetDimensionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16f2c23a3efd8caa63761821f79f5e5ac9855184b3fa61f098d320d5d80b9ff9")
      override fun country(country: SetDimensionProperty.Builder.() -> Unit): Unit =
          country(SetDimensionProperty(country))

      override fun gpsPoint(gpsPoint: IResolvable) {
        cdkBuilder.gpsPoint(gpsPoint.let(IResolvable::unwrap))
      }

      override fun gpsPoint(gpsPoint: GPSPointProperty) {
        cdkBuilder.gpsPoint(gpsPoint.let(GPSPointProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("823d386aae3d6722b4591e67f72c640b6d7c7077d4e566b2e7aeba751ec04aea")
      override fun gpsPoint(gpsPoint: GPSPointProperty.Builder.() -> Unit): Unit =
          gpsPoint(GPSPointProperty(gpsPoint))

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnSegment.LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.LocationProperty,
    ) : LocationProperty {
      override fun country(): Any? = unwrap(this).getCountry()

      override fun gpsPoint(): Any? = unwrap(this).getGpsPoint()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.LocationProperty):
          LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationProperty):
          software.amazon.awscdk.services.pinpoint.CfnSegment.LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GPSPointProperty {
    public fun coordinates(): Any

    public fun rangeInKilometers(): Number

    public interface Builder {
      public fun coordinates(coordinates: IResolvable)

      public fun coordinates(coordinates: CoordinatesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7d7d71717832380717e0035b56e17867d611051035eed7ca06df7d996d74b22")
      public fun coordinates(coordinates: CoordinatesProperty.Builder.() -> Unit)

      public fun rangeInKilometers(rangeInKilometers: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty.builder()

      override fun coordinates(coordinates: IResolvable) {
        cdkBuilder.coordinates(coordinates.let(IResolvable::unwrap))
      }

      override fun coordinates(coordinates: CoordinatesProperty) {
        cdkBuilder.coordinates(coordinates.let(CoordinatesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7d7d71717832380717e0035b56e17867d611051035eed7ca06df7d996d74b22")
      override fun coordinates(coordinates: CoordinatesProperty.Builder.() -> Unit): Unit =
          coordinates(CoordinatesProperty(coordinates))

      override fun rangeInKilometers(rangeInKilometers: Number) {
        cdkBuilder.rangeInKilometers(rangeInKilometers)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty,
    ) : GPSPointProperty {
      override fun coordinates(): Any = unwrap(this).getCoordinates()

      override fun rangeInKilometers(): Number = unwrap(this).getRangeInKilometers()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GPSPointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty):
          GPSPointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GPSPointProperty):
          software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SourceSegmentsProperty {
    public fun id(): String

    public fun version(): Number? = unwrap(this).getVersion()

    public interface Builder {
      public fun id(id: String)

      public fun version(version: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnSegment.SourceSegmentsProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnSegment.SourceSegmentsProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun version(version: Number) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnSegment.SourceSegmentsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnSegment.SourceSegmentsProperty,
    ) : SourceSegmentsProperty {
      override fun id(): String = unwrap(this).getId()

      override fun version(): Number? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceSegmentsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.SourceSegmentsProperty):
          SourceSegmentsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceSegmentsProperty):
          software.amazon.awscdk.services.pinpoint.CfnSegment.SourceSegmentsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DemographicProperty {
    public fun appVersion(): Any? = unwrap(this).getAppVersion()

    public fun channel(): Any? = unwrap(this).getChannel()

    public fun deviceType(): Any? = unwrap(this).getDeviceType()

    public fun make(): Any? = unwrap(this).getMake()

    public fun model(): Any? = unwrap(this).getModel()

    public fun platform(): Any? = unwrap(this).getPlatform()

    public interface Builder {
      public fun appVersion(appVersion: IResolvable)

      public fun appVersion(appVersion: SetDimensionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3cdbe321b533a2244e7cfb7b2dc41a4d1ec18b37de4450c57ee36b2362d74407")
      public fun appVersion(appVersion: SetDimensionProperty.Builder.() -> Unit)

      public fun channel(channel: IResolvable)

      public fun channel(channel: SetDimensionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4ae95fd8f8f0a81e2699d160383ebd1b5666aed92847710237c8885ecfbc6f0")
      public fun channel(channel: SetDimensionProperty.Builder.() -> Unit)

      public fun deviceType(deviceType: IResolvable)

      public fun deviceType(deviceType: SetDimensionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0becdead57f17835365d8b71d99bee111ee48fa40fb463f780d03fce80f351e1")
      public fun deviceType(deviceType: SetDimensionProperty.Builder.() -> Unit)

      public fun make(make: IResolvable)

      public fun make(make: SetDimensionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56e8b3ed5f07e23f3a5bfe14b907430eb6400e88a6fae67171fb39d214231cb4")
      public fun make(make: SetDimensionProperty.Builder.() -> Unit)

      public fun model(model: IResolvable)

      public fun model(model: SetDimensionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44c0acbfc9cc551ae612d254946305d0a93a9983fec0b33c4370a0a2b00df946")
      public fun model(model: SetDimensionProperty.Builder.() -> Unit)

      public fun platform(platform: IResolvable)

      public fun platform(platform: SetDimensionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("759701803e587f7cc2fdf4f7f1bf1723587e07c00f62e28b6af77b867f681988")
      public fun platform(platform: SetDimensionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnSegment.DemographicProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnSegment.DemographicProperty.builder()

      override fun appVersion(appVersion: IResolvable) {
        cdkBuilder.appVersion(appVersion.let(IResolvable::unwrap))
      }

      override fun appVersion(appVersion: SetDimensionProperty) {
        cdkBuilder.appVersion(appVersion.let(SetDimensionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3cdbe321b533a2244e7cfb7b2dc41a4d1ec18b37de4450c57ee36b2362d74407")
      override fun appVersion(appVersion: SetDimensionProperty.Builder.() -> Unit): Unit =
          appVersion(SetDimensionProperty(appVersion))

      override fun channel(channel: IResolvable) {
        cdkBuilder.channel(channel.let(IResolvable::unwrap))
      }

      override fun channel(channel: SetDimensionProperty) {
        cdkBuilder.channel(channel.let(SetDimensionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4ae95fd8f8f0a81e2699d160383ebd1b5666aed92847710237c8885ecfbc6f0")
      override fun channel(channel: SetDimensionProperty.Builder.() -> Unit): Unit =
          channel(SetDimensionProperty(channel))

      override fun deviceType(deviceType: IResolvable) {
        cdkBuilder.deviceType(deviceType.let(IResolvable::unwrap))
      }

      override fun deviceType(deviceType: SetDimensionProperty) {
        cdkBuilder.deviceType(deviceType.let(SetDimensionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0becdead57f17835365d8b71d99bee111ee48fa40fb463f780d03fce80f351e1")
      override fun deviceType(deviceType: SetDimensionProperty.Builder.() -> Unit): Unit =
          deviceType(SetDimensionProperty(deviceType))

      override fun make(make: IResolvable) {
        cdkBuilder.make(make.let(IResolvable::unwrap))
      }

      override fun make(make: SetDimensionProperty) {
        cdkBuilder.make(make.let(SetDimensionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56e8b3ed5f07e23f3a5bfe14b907430eb6400e88a6fae67171fb39d214231cb4")
      override fun make(make: SetDimensionProperty.Builder.() -> Unit): Unit =
          make(SetDimensionProperty(make))

      override fun model(model: IResolvable) {
        cdkBuilder.model(model.let(IResolvable::unwrap))
      }

      override fun model(model: SetDimensionProperty) {
        cdkBuilder.model(model.let(SetDimensionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44c0acbfc9cc551ae612d254946305d0a93a9983fec0b33c4370a0a2b00df946")
      override fun model(model: SetDimensionProperty.Builder.() -> Unit): Unit =
          model(SetDimensionProperty(model))

      override fun platform(platform: IResolvable) {
        cdkBuilder.platform(platform.let(IResolvable::unwrap))
      }

      override fun platform(platform: SetDimensionProperty) {
        cdkBuilder.platform(platform.let(SetDimensionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("759701803e587f7cc2fdf4f7f1bf1723587e07c00f62e28b6af77b867f681988")
      override fun platform(platform: SetDimensionProperty.Builder.() -> Unit): Unit =
          platform(SetDimensionProperty(platform))

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnSegment.DemographicProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnSegment.DemographicProperty,
    ) : DemographicProperty {
      override fun appVersion(): Any? = unwrap(this).getAppVersion()

      override fun channel(): Any? = unwrap(this).getChannel()

      override fun deviceType(): Any? = unwrap(this).getDeviceType()

      override fun make(): Any? = unwrap(this).getMake()

      override fun model(): Any? = unwrap(this).getModel()

      override fun platform(): Any? = unwrap(this).getPlatform()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DemographicProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.DemographicProperty):
          DemographicProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DemographicProperty):
          software.amazon.awscdk.services.pinpoint.CfnSegment.DemographicProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BehaviorProperty {
    public fun recency(): Any? = unwrap(this).getRecency()

    public interface Builder {
      public fun recency(recency: IResolvable)

      public fun recency(recency: RecencyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a02e7a3b0b05f0794aedf261afe400f20852aa041843a293b845a54c5c749d4")
      public fun recency(recency: RecencyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnSegment.BehaviorProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnSegment.BehaviorProperty.builder()

      override fun recency(recency: IResolvable) {
        cdkBuilder.recency(recency.let(IResolvable::unwrap))
      }

      override fun recency(recency: RecencyProperty) {
        cdkBuilder.recency(recency.let(RecencyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a02e7a3b0b05f0794aedf261afe400f20852aa041843a293b845a54c5c749d4")
      override fun recency(recency: RecencyProperty.Builder.() -> Unit): Unit =
          recency(RecencyProperty(recency))

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnSegment.BehaviorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.BehaviorProperty,
    ) : BehaviorProperty {
      override fun recency(): Any? = unwrap(this).getRecency()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BehaviorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.BehaviorProperty):
          BehaviorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BehaviorProperty):
          software.amazon.awscdk.services.pinpoint.CfnSegment.BehaviorProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SetDimensionProperty {
    public fun dimensionType(): String? = unwrap(this).getDimensionType()

    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    public interface Builder {
      public fun dimensionType(dimensionType: String)

      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty.builder()

      override fun dimensionType(dimensionType: String) {
        cdkBuilder.dimensionType(dimensionType)
      }

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty,
    ) : SetDimensionProperty {
      override fun dimensionType(): String? = unwrap(this).getDimensionType()

      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SetDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty):
          SetDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SetDimensionProperty):
          software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CoordinatesProperty {
    public fun latitude(): Number

    public fun longitude(): Number

    public interface Builder {
      public fun latitude(latitude: Number)

      public fun longitude(longitude: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty.builder()

      override fun latitude(latitude: Number) {
        cdkBuilder.latitude(latitude)
      }

      override fun longitude(longitude: Number) {
        cdkBuilder.longitude(longitude)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty,
    ) : CoordinatesProperty {
      override fun latitude(): Number = unwrap(this).getLatitude()

      override fun longitude(): Number = unwrap(this).getLongitude()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CoordinatesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty):
          CoordinatesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoordinatesProperty):
          software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RecencyProperty {
    public fun duration(): String

    public fun recencyType(): String

    public interface Builder {
      public fun duration(duration: String)

      public fun recencyType(recencyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty.builder()

      override fun duration(duration: String) {
        cdkBuilder.duration(duration)
      }

      override fun recencyType(recencyType: String) {
        cdkBuilder.recencyType(recencyType)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty,
    ) : RecencyProperty {
      override fun duration(): String = unwrap(this).getDuration()

      override fun recencyType(): String = unwrap(this).getRecencyType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty):
          RecencyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecencyProperty):
          software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
