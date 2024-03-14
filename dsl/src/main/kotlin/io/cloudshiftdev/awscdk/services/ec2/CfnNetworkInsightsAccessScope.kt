package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNetworkInsightsAccessScope internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreatedDate(): String = unwrap(this).getAttrCreatedDate()

  public open fun attrNetworkInsightsAccessScopeArn(): String =
      unwrap(this).getAttrNetworkInsightsAccessScopeArn()

  public open fun attrNetworkInsightsAccessScopeId(): String =
      unwrap(this).getAttrNetworkInsightsAccessScopeId()

  public open fun attrUpdatedDate(): String = unwrap(this).getAttrUpdatedDate()

  public open fun excludePaths(): Any? = unwrap(this).getExcludePaths()

  public open fun excludePaths(`value`: IResolvable) {
    unwrap(this).setExcludePaths(`value`.let(IResolvable::unwrap))
  }

  public open fun excludePaths(__idx_ac66f0: List<Any>) {
    unwrap(this).setExcludePaths(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun matchPaths(): Any? = unwrap(this).getMatchPaths()

  public open fun matchPaths(`value`: IResolvable) {
    unwrap(this).setMatchPaths(`value`.let(IResolvable::unwrap))
  }

  public open fun matchPaths(__idx_ac66f0: List<Any>) {
    unwrap(this).setMatchPaths(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun excludePaths(excludePaths: IResolvable)

    public fun excludePaths(excludePaths: List<Any>)

    public fun matchPaths(matchPaths: IResolvable)

    public fun matchPaths(matchPaths: List<Any>)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.Builder.create(scope, id)

    override fun excludePaths(excludePaths: IResolvable) {
      cdkBuilder.excludePaths(excludePaths.let(IResolvable::unwrap))
    }

    override fun excludePaths(excludePaths: List<Any>) {
      cdkBuilder.excludePaths(excludePaths)
    }

    override fun matchPaths(matchPaths: IResolvable) {
      cdkBuilder.matchPaths(matchPaths.let(IResolvable::unwrap))
    }

    override fun matchPaths(matchPaths: List<Any>) {
      cdkBuilder.matchPaths(matchPaths)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkInsightsAccessScope {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkInsightsAccessScope(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope):
        CfnNetworkInsightsAccessScope = CfnNetworkInsightsAccessScope(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInsightsAccessScope):
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope = wrapped.cdkObject
  }

  public interface ThroughResourcesStatementRequestProperty {
    public fun resourceStatement(): Any? = unwrap(this).getResourceStatement()

    public interface Builder {
      public fun resourceStatement(resourceStatement: IResolvable)

      public fun resourceStatement(resourceStatement: ResourceStatementRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("423458459363e0c9215239e6647bed7b703cd31ede23af357cb017e6a3612e13")
      public
          fun resourceStatement(resourceStatement: ResourceStatementRequestProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty.builder()

      override fun resourceStatement(resourceStatement: IResolvable) {
        cdkBuilder.resourceStatement(resourceStatement.let(IResolvable::unwrap))
      }

      override fun resourceStatement(resourceStatement: ResourceStatementRequestProperty) {
        cdkBuilder.resourceStatement(resourceStatement.let(ResourceStatementRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("423458459363e0c9215239e6647bed7b703cd31ede23af357cb017e6a3612e13")
      override
          fun resourceStatement(resourceStatement: ResourceStatementRequestProperty.Builder.() -> Unit):
          Unit = resourceStatement(ResourceStatementRequestProperty(resourceStatement))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty,
    ) : ThroughResourcesStatementRequestProperty {
      override fun resourceStatement(): Any? = unwrap(this).getResourceStatement()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ThroughResourcesStatementRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty):
          ThroughResourcesStatementRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThroughResourcesStatementRequestProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PathStatementRequestProperty {
    public fun packetHeaderStatement(): Any? = unwrap(this).getPacketHeaderStatement()

    public fun resourceStatement(): Any? = unwrap(this).getResourceStatement()

    public interface Builder {
      public fun packetHeaderStatement(packetHeaderStatement: IResolvable)

      public fun packetHeaderStatement(packetHeaderStatement: PacketHeaderStatementRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79ded352caa18d864b60f9392e8f63faa86842009ead626b6f9b9eee09a20597")
      public
          fun packetHeaderStatement(packetHeaderStatement: PacketHeaderStatementRequestProperty.Builder.() -> Unit)

      public fun resourceStatement(resourceStatement: IResolvable)

      public fun resourceStatement(resourceStatement: ResourceStatementRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94af38a3de4afaaf2a082829aef56c9b0e4eed32792656b36dc3cfb773f06d10")
      public
          fun resourceStatement(resourceStatement: ResourceStatementRequestProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PathStatementRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PathStatementRequestProperty.builder()

      override fun packetHeaderStatement(packetHeaderStatement: IResolvable) {
        cdkBuilder.packetHeaderStatement(packetHeaderStatement.let(IResolvable::unwrap))
      }

      override
          fun packetHeaderStatement(packetHeaderStatement: PacketHeaderStatementRequestProperty) {
        cdkBuilder.packetHeaderStatement(packetHeaderStatement.let(PacketHeaderStatementRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79ded352caa18d864b60f9392e8f63faa86842009ead626b6f9b9eee09a20597")
      override
          fun packetHeaderStatement(packetHeaderStatement: PacketHeaderStatementRequestProperty.Builder.() -> Unit):
          Unit = packetHeaderStatement(PacketHeaderStatementRequestProperty(packetHeaderStatement))

      override fun resourceStatement(resourceStatement: IResolvable) {
        cdkBuilder.resourceStatement(resourceStatement.let(IResolvable::unwrap))
      }

      override fun resourceStatement(resourceStatement: ResourceStatementRequestProperty) {
        cdkBuilder.resourceStatement(resourceStatement.let(ResourceStatementRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94af38a3de4afaaf2a082829aef56c9b0e4eed32792656b36dc3cfb773f06d10")
      override
          fun resourceStatement(resourceStatement: ResourceStatementRequestProperty.Builder.() -> Unit):
          Unit = resourceStatement(ResourceStatementRequestProperty(resourceStatement))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PathStatementRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PathStatementRequestProperty,
    ) : PathStatementRequestProperty {
      override fun packetHeaderStatement(): Any? = unwrap(this).getPacketHeaderStatement()

      override fun resourceStatement(): Any? = unwrap(this).getResourceStatement()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PathStatementRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PathStatementRequestProperty):
          PathStatementRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PathStatementRequestProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PathStatementRequestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AccessScopePathRequestProperty {
    public fun destination(): Any? = unwrap(this).getDestination()

    public fun source(): Any? = unwrap(this).getSource()

    public fun throughResources(): Any? = unwrap(this).getThroughResources()

    public interface Builder {
      public fun destination(destination: IResolvable)

      public fun destination(destination: PathStatementRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1209f052f40165c46e829f5d00392f3ca65d1ec4efcf2823cdd1b16c5daefaaf")
      public fun destination(destination: PathStatementRequestProperty.Builder.() -> Unit)

      public fun source(source: IResolvable)

      public fun source(source: PathStatementRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e32f15217edb30ee0f70053d61737d03c0ab342e15686f7c971a56274e5fdc6")
      public fun source(source: PathStatementRequestProperty.Builder.() -> Unit)

      public fun throughResources(throughResources: IResolvable)

      public fun throughResources(throughResources: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty.builder()

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: PathStatementRequestProperty) {
        cdkBuilder.destination(destination.let(PathStatementRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1209f052f40165c46e829f5d00392f3ca65d1ec4efcf2823cdd1b16c5daefaaf")
      override fun destination(destination: PathStatementRequestProperty.Builder.() -> Unit): Unit =
          destination(PathStatementRequestProperty(destination))

      override fun source(source: IResolvable) {
        cdkBuilder.source(source.let(IResolvable::unwrap))
      }

      override fun source(source: PathStatementRequestProperty) {
        cdkBuilder.source(source.let(PathStatementRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e32f15217edb30ee0f70053d61737d03c0ab342e15686f7c971a56274e5fdc6")
      override fun source(source: PathStatementRequestProperty.Builder.() -> Unit): Unit =
          source(PathStatementRequestProperty(source))

      override fun throughResources(throughResources: IResolvable) {
        cdkBuilder.throughResources(throughResources.let(IResolvable::unwrap))
      }

      override fun throughResources(throughResources: List<Any>) {
        cdkBuilder.throughResources(throughResources)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty,
    ) : AccessScopePathRequestProperty {
      override fun destination(): Any? = unwrap(this).getDestination()

      override fun source(): Any? = unwrap(this).getSource()

      override fun throughResources(): Any? = unwrap(this).getThroughResources()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessScopePathRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty):
          AccessScopePathRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessScopePathRequestProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PacketHeaderStatementRequestProperty {
    public fun destinationAddresses(): List<String> = unwrap(this).getDestinationAddresses() ?:
        emptyList()

    public fun destinationPorts(): List<String> = unwrap(this).getDestinationPorts() ?: emptyList()

    public fun destinationPrefixLists(): List<String> = unwrap(this).getDestinationPrefixLists() ?:
        emptyList()

    public fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

    public fun sourceAddresses(): List<String> = unwrap(this).getSourceAddresses() ?: emptyList()

    public fun sourcePorts(): List<String> = unwrap(this).getSourcePorts() ?: emptyList()

    public fun sourcePrefixLists(): List<String> = unwrap(this).getSourcePrefixLists() ?:
        emptyList()

    public interface Builder {
      public fun destinationAddresses(destinationAddresses: List<String>)

      public fun destinationPorts(destinationPorts: List<String>)

      public fun destinationPrefixLists(destinationPrefixLists: List<String>)

      public fun protocols(protocols: List<String>)

      public fun sourceAddresses(sourceAddresses: List<String>)

      public fun sourcePorts(sourcePorts: List<String>)

      public fun sourcePrefixLists(sourcePrefixLists: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty.builder()

      override fun destinationAddresses(destinationAddresses: List<String>) {
        cdkBuilder.destinationAddresses(destinationAddresses)
      }

      override fun destinationPorts(destinationPorts: List<String>) {
        cdkBuilder.destinationPorts(destinationPorts)
      }

      override fun destinationPrefixLists(destinationPrefixLists: List<String>) {
        cdkBuilder.destinationPrefixLists(destinationPrefixLists)
      }

      override fun protocols(protocols: List<String>) {
        cdkBuilder.protocols(protocols)
      }

      override fun sourceAddresses(sourceAddresses: List<String>) {
        cdkBuilder.sourceAddresses(sourceAddresses)
      }

      override fun sourcePorts(sourcePorts: List<String>) {
        cdkBuilder.sourcePorts(sourcePorts)
      }

      override fun sourcePrefixLists(sourcePrefixLists: List<String>) {
        cdkBuilder.sourcePrefixLists(sourcePrefixLists)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty,
    ) : PacketHeaderStatementRequestProperty {
      override fun destinationAddresses(): List<String> = unwrap(this).getDestinationAddresses() ?:
          emptyList()

      override fun destinationPorts(): List<String> = unwrap(this).getDestinationPorts() ?:
          emptyList()

      override fun destinationPrefixLists(): List<String> = unwrap(this).getDestinationPrefixLists()
          ?: emptyList()

      override fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

      override fun sourceAddresses(): List<String> = unwrap(this).getSourceAddresses() ?:
          emptyList()

      override fun sourcePorts(): List<String> = unwrap(this).getSourcePorts() ?: emptyList()

      override fun sourcePrefixLists(): List<String> = unwrap(this).getSourcePrefixLists() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PacketHeaderStatementRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty):
          PacketHeaderStatementRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PacketHeaderStatementRequestProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ResourceStatementRequestProperty {
    public fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?: emptyList()

    public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    public interface Builder {
      public fun resourceTypes(resourceTypes: List<String>)

      public fun resources(resources: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty.builder()

      override fun resourceTypes(resourceTypes: List<String>) {
        cdkBuilder.resourceTypes(resourceTypes)
      }

      override fun resources(resources: List<String>) {
        cdkBuilder.resources(resources)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty,
    ) : ResourceStatementRequestProperty {
      override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?: emptyList()

      override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceStatementRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty):
          ResourceStatementRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceStatementRequestProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
