package io.cloudshiftdev.awscdk.services.ec2

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

public open class CfnNetworkInsightsPath internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreatedDate(): String = unwrap(this).getAttrCreatedDate()

  public open fun attrDestinationArn(): String = unwrap(this).getAttrDestinationArn()

  public open fun attrNetworkInsightsPathArn(): String =
      unwrap(this).getAttrNetworkInsightsPathArn()

  public open fun attrNetworkInsightsPathId(): String = unwrap(this).getAttrNetworkInsightsPathId()

  public open fun attrSourceArn(): String = unwrap(this).getAttrSourceArn()

  public open fun destination(): String? = unwrap(this).getDestination()

  public open fun destination(`value`: String) {
    unwrap(this).setDestination(`value`)
  }

  public open fun destinationIp(): String? = unwrap(this).getDestinationIp()

  public open fun destinationIp(`value`: String) {
    unwrap(this).setDestinationIp(`value`)
  }

  public open fun destinationPort(): Number? = unwrap(this).getDestinationPort()

  public open fun destinationPort(`value`: Number) {
    unwrap(this).setDestinationPort(`value`)
  }

  public open fun filterAtDestination(): Any? = unwrap(this).getFilterAtDestination()

  public open fun filterAtDestination(`value`: IResolvable) {
    unwrap(this).setFilterAtDestination(`value`.let(IResolvable::unwrap))
  }

  public open fun filterAtDestination(`value`: PathFilterProperty) {
    unwrap(this).setFilterAtDestination(`value`.let(PathFilterProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("811226232cd399da97bd4a0e15da731af46c73e929db62cc81474e019b945684")
  public open fun filterAtDestination(`value`: PathFilterProperty.Builder.() -> Unit): Unit =
      filterAtDestination(PathFilterProperty(`value`))

  public open fun filterAtSource(): Any? = unwrap(this).getFilterAtSource()

  public open fun filterAtSource(`value`: IResolvable) {
    unwrap(this).setFilterAtSource(`value`.let(IResolvable::unwrap))
  }

  public open fun filterAtSource(`value`: PathFilterProperty) {
    unwrap(this).setFilterAtSource(`value`.let(PathFilterProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("606c3a46cb8ac9d7e6a3d4e3c4ccf69b5a0ece272cf356ef23ff148455476fda")
  public open fun filterAtSource(`value`: PathFilterProperty.Builder.() -> Unit): Unit =
      filterAtSource(PathFilterProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun protocol(): String = unwrap(this).getProtocol()

  public open fun protocol(`value`: String) {
    unwrap(this).setProtocol(`value`)
  }

  public open fun source(): String = unwrap(this).getSource()

  public open fun source(`value`: String) {
    unwrap(this).setSource(`value`)
  }

  public open fun sourceIp(): String? = unwrap(this).getSourceIp()

  public open fun sourceIp(`value`: String) {
    unwrap(this).setSourceIp(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun destination(destination: String)

    public fun destinationIp(destinationIp: String)

    public fun destinationPort(destinationPort: Number)

    public fun filterAtDestination(filterAtDestination: IResolvable)

    public fun filterAtDestination(filterAtDestination: PathFilterProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fc130fe57308efc3533736b34dac6c768021dee3a12c125c4af637efd2dfd29")
    public fun filterAtDestination(filterAtDestination: PathFilterProperty.Builder.() -> Unit)

    public fun filterAtSource(filterAtSource: IResolvable)

    public fun filterAtSource(filterAtSource: PathFilterProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38704953e7735b78475c41a7ccf525fb6e132f5f4e23a8fb04bf1c9d6d18eb63")
    public fun filterAtSource(filterAtSource: PathFilterProperty.Builder.() -> Unit)

    public fun protocol(protocol: String)

    public fun source(source: String)

    public fun sourceIp(sourceIp: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.Builder.create(scope, id)

    override fun destination(destination: String) {
      cdkBuilder.destination(destination)
    }

    override fun destinationIp(destinationIp: String) {
      cdkBuilder.destinationIp(destinationIp)
    }

    override fun destinationPort(destinationPort: Number) {
      cdkBuilder.destinationPort(destinationPort)
    }

    override fun filterAtDestination(filterAtDestination: IResolvable) {
      cdkBuilder.filterAtDestination(filterAtDestination.let(IResolvable::unwrap))
    }

    override fun filterAtDestination(filterAtDestination: PathFilterProperty) {
      cdkBuilder.filterAtDestination(filterAtDestination.let(PathFilterProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fc130fe57308efc3533736b34dac6c768021dee3a12c125c4af637efd2dfd29")
    override fun filterAtDestination(filterAtDestination: PathFilterProperty.Builder.() -> Unit):
        Unit = filterAtDestination(PathFilterProperty(filterAtDestination))

    override fun filterAtSource(filterAtSource: IResolvable) {
      cdkBuilder.filterAtSource(filterAtSource.let(IResolvable::unwrap))
    }

    override fun filterAtSource(filterAtSource: PathFilterProperty) {
      cdkBuilder.filterAtSource(filterAtSource.let(PathFilterProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38704953e7735b78475c41a7ccf525fb6e132f5f4e23a8fb04bf1c9d6d18eb63")
    override fun filterAtSource(filterAtSource: PathFilterProperty.Builder.() -> Unit): Unit =
        filterAtSource(PathFilterProperty(filterAtSource))

    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    override fun sourceIp(sourceIp: String) {
      cdkBuilder.sourceIp(sourceIp)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkInsightsPath {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkInsightsPath(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath):
        CfnNetworkInsightsPath = CfnNetworkInsightsPath(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInsightsPath):
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath = wrapped.cdkObject
  }

  public interface PathFilterProperty {
    public fun destinationAddress(): String? = unwrap(this).getDestinationAddress()

    public fun destinationPortRange(): Any? = unwrap(this).getDestinationPortRange()

    public fun sourceAddress(): String? = unwrap(this).getSourceAddress()

    public fun sourcePortRange(): Any? = unwrap(this).getSourcePortRange()

    public interface Builder {
      public fun destinationAddress(destinationAddress: String)

      public fun destinationPortRange(destinationPortRange: IResolvable)

      public fun destinationPortRange(destinationPortRange: FilterPortRangeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d2e3d751dbdd68807cdb605a72c7006ea486c9202424100dbd476d58321fb565")
      public
          fun destinationPortRange(destinationPortRange: FilterPortRangeProperty.Builder.() -> Unit)

      public fun sourceAddress(sourceAddress: String)

      public fun sourcePortRange(sourcePortRange: IResolvable)

      public fun sourcePortRange(sourcePortRange: FilterPortRangeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82cb8eb403d87ec69322d186a73a64fce9267a481e349f0eb4dd921267b55e2d")
      public fun sourcePortRange(sourcePortRange: FilterPortRangeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.PathFilterProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.PathFilterProperty.builder()

      override fun destinationAddress(destinationAddress: String) {
        cdkBuilder.destinationAddress(destinationAddress)
      }

      override fun destinationPortRange(destinationPortRange: IResolvable) {
        cdkBuilder.destinationPortRange(destinationPortRange.let(IResolvable::unwrap))
      }

      override fun destinationPortRange(destinationPortRange: FilterPortRangeProperty) {
        cdkBuilder.destinationPortRange(destinationPortRange.let(FilterPortRangeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d2e3d751dbdd68807cdb605a72c7006ea486c9202424100dbd476d58321fb565")
      override
          fun destinationPortRange(destinationPortRange: FilterPortRangeProperty.Builder.() -> Unit):
          Unit = destinationPortRange(FilterPortRangeProperty(destinationPortRange))

      override fun sourceAddress(sourceAddress: String) {
        cdkBuilder.sourceAddress(sourceAddress)
      }

      override fun sourcePortRange(sourcePortRange: IResolvable) {
        cdkBuilder.sourcePortRange(sourcePortRange.let(IResolvable::unwrap))
      }

      override fun sourcePortRange(sourcePortRange: FilterPortRangeProperty) {
        cdkBuilder.sourcePortRange(sourcePortRange.let(FilterPortRangeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82cb8eb403d87ec69322d186a73a64fce9267a481e349f0eb4dd921267b55e2d")
      override fun sourcePortRange(sourcePortRange: FilterPortRangeProperty.Builder.() -> Unit):
          Unit = sourcePortRange(FilterPortRangeProperty(sourcePortRange))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.PathFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.PathFilterProperty,
    ) : PathFilterProperty {
      override fun destinationAddress(): String? = unwrap(this).getDestinationAddress()

      override fun destinationPortRange(): Any? = unwrap(this).getDestinationPortRange()

      override fun sourceAddress(): String? = unwrap(this).getSourceAddress()

      override fun sourcePortRange(): Any? = unwrap(this).getSourcePortRange()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PathFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.PathFilterProperty):
          PathFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PathFilterProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.PathFilterProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FilterPortRangeProperty {
    public fun fromPort(): Number? = unwrap(this).getFromPort()

    public fun toPort(): Number? = unwrap(this).getToPort()

    public interface Builder {
      public fun fromPort(fromPort: Number)

      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.FilterPortRangeProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.FilterPortRangeProperty.builder()

      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.FilterPortRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.FilterPortRangeProperty,
    ) : FilterPortRangeProperty {
      override fun fromPort(): Number? = unwrap(this).getFromPort()

      override fun toPort(): Number? = unwrap(this).getToPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterPortRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.FilterPortRangeProperty):
          FilterPortRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterPortRangeProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.FilterPortRangeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
