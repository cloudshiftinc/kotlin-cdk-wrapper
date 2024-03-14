package io.cloudshiftdev.awscdk.services.neptunegraph

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGraph internal constructor(
  private val cdkObject: software.amazon.awscdk.services.neptunegraph.CfnGraph,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  public open fun attrGraphArn(): String = unwrap(this).getAttrGraphArn()

  public open fun attrGraphId(): String = unwrap(this).getAttrGraphId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  public open fun deletionProtection(`value`: Boolean) {
    unwrap(this).setDeletionProtection(`value`)
  }

  public open fun deletionProtection(`value`: IResolvable) {
    unwrap(this).setDeletionProtection(`value`.let(IResolvable::unwrap))
  }

  public open fun graphName(): String? = unwrap(this).getGraphName()

  public open fun graphName(`value`: String) {
    unwrap(this).setGraphName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun provisionedMemory(): Number = unwrap(this).getProvisionedMemory()

  public open fun provisionedMemory(`value`: Number) {
    unwrap(this).setProvisionedMemory(`value`)
  }

  public open fun publicConnectivity(): Any? = unwrap(this).getPublicConnectivity()

  public open fun publicConnectivity(`value`: Boolean) {
    unwrap(this).setPublicConnectivity(`value`)
  }

  public open fun publicConnectivity(`value`: IResolvable) {
    unwrap(this).setPublicConnectivity(`value`.let(IResolvable::unwrap))
  }

  public open fun replicaCount(): Number? = unwrap(this).getReplicaCount()

  public open fun replicaCount(`value`: Number) {
    unwrap(this).setReplicaCount(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public open fun vectorSearchConfiguration(): Any? = unwrap(this).getVectorSearchConfiguration()

  public open fun vectorSearchConfiguration(`value`: IResolvable) {
    unwrap(this).setVectorSearchConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun vectorSearchConfiguration(`value`: VectorSearchConfigurationProperty) {
    unwrap(this).setVectorSearchConfiguration(`value`.let(VectorSearchConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2db39964ab84f6aa24fd8c7b54bb139ca19a50016d6fd12c994462707ed7f2dc")
  public open
      fun vectorSearchConfiguration(`value`: VectorSearchConfigurationProperty.Builder.() -> Unit):
      Unit = vectorSearchConfiguration(VectorSearchConfigurationProperty(`value`))

  public interface Builder {
    public fun deletionProtection(deletionProtection: Boolean)

    public fun deletionProtection(deletionProtection: IResolvable)

    public fun graphName(graphName: String)

    public fun provisionedMemory(provisionedMemory: Number)

    public fun publicConnectivity(publicConnectivity: Boolean)

    public fun publicConnectivity(publicConnectivity: IResolvable)

    public fun replicaCount(replicaCount: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vectorSearchConfiguration(vectorSearchConfiguration: IResolvable)

    public
        fun vectorSearchConfiguration(vectorSearchConfiguration: VectorSearchConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a50c47a0fd99d77a3af008b1f03bfbbc900276e2bb178564f91fb0b023d353b")
    public
        fun vectorSearchConfiguration(vectorSearchConfiguration: VectorSearchConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.neptunegraph.CfnGraph.Builder =
        software.amazon.awscdk.services.neptunegraph.CfnGraph.Builder.create(scope, id)

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

    override fun graphName(graphName: String) {
      cdkBuilder.graphName(graphName)
    }

    override fun provisionedMemory(provisionedMemory: Number) {
      cdkBuilder.provisionedMemory(provisionedMemory)
    }

    override fun publicConnectivity(publicConnectivity: Boolean) {
      cdkBuilder.publicConnectivity(publicConnectivity)
    }

    override fun publicConnectivity(publicConnectivity: IResolvable) {
      cdkBuilder.publicConnectivity(publicConnectivity.let(IResolvable::unwrap))
    }

    override fun replicaCount(replicaCount: Number) {
      cdkBuilder.replicaCount(replicaCount)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vectorSearchConfiguration(vectorSearchConfiguration: IResolvable) {
      cdkBuilder.vectorSearchConfiguration(vectorSearchConfiguration.let(IResolvable::unwrap))
    }

    override
        fun vectorSearchConfiguration(vectorSearchConfiguration: VectorSearchConfigurationProperty) {
      cdkBuilder.vectorSearchConfiguration(vectorSearchConfiguration.let(VectorSearchConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a50c47a0fd99d77a3af008b1f03bfbbc900276e2bb178564f91fb0b023d353b")
    override
        fun vectorSearchConfiguration(vectorSearchConfiguration: VectorSearchConfigurationProperty.Builder.() -> Unit):
        Unit =
        vectorSearchConfiguration(VectorSearchConfigurationProperty(vectorSearchConfiguration))

    public fun build(): software.amazon.awscdk.services.neptunegraph.CfnGraph = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGraph {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGraph(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.neptunegraph.CfnGraph): CfnGraph =
        CfnGraph(cdkObject)

    internal fun unwrap(wrapped: CfnGraph): software.amazon.awscdk.services.neptunegraph.CfnGraph =
        wrapped.cdkObject
  }

  public interface VectorSearchConfigurationProperty {
    public fun vectorSearchDimension(): Number

    public interface Builder {
      public fun vectorSearchDimension(vectorSearchDimension: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.neptunegraph.CfnGraph.VectorSearchConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.neptunegraph.CfnGraph.VectorSearchConfigurationProperty.builder()

      override fun vectorSearchDimension(vectorSearchDimension: Number) {
        cdkBuilder.vectorSearchDimension(vectorSearchDimension)
      }

      public fun build():
          software.amazon.awscdk.services.neptunegraph.CfnGraph.VectorSearchConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.neptunegraph.CfnGraph.VectorSearchConfigurationProperty,
    ) : VectorSearchConfigurationProperty {
      override fun vectorSearchDimension(): Number = unwrap(this).getVectorSearchDimension()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          VectorSearchConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.neptunegraph.CfnGraph.VectorSearchConfigurationProperty):
          VectorSearchConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VectorSearchConfigurationProperty):
          software.amazon.awscdk.services.neptunegraph.CfnGraph.VectorSearchConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
