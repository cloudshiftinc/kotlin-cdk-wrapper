@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.neptunegraph

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnGraphProps {
  public fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  public fun graphName(): String? = unwrap(this).getGraphName()

  public fun provisionedMemory(): Number

  public fun publicConnectivity(): Any? = unwrap(this).getPublicConnectivity()

  public fun replicaCount(): Number? = unwrap(this).getReplicaCount()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vectorSearchConfiguration(): Any? = unwrap(this).getVectorSearchConfiguration()

  @CdkDslMarker
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
        fun vectorSearchConfiguration(vectorSearchConfiguration: CfnGraph.VectorSearchConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a56aa0b385969cca92d1ec6d1384ddbb35eddf7fe74f0dba03fd40d9e449c4c")
    public
        fun vectorSearchConfiguration(vectorSearchConfiguration: CfnGraph.VectorSearchConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.neptunegraph.CfnGraphProps.Builder =
        software.amazon.awscdk.services.neptunegraph.CfnGraphProps.builder()

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
        fun vectorSearchConfiguration(vectorSearchConfiguration: CfnGraph.VectorSearchConfigurationProperty) {
      cdkBuilder.vectorSearchConfiguration(vectorSearchConfiguration.let(CfnGraph.VectorSearchConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a56aa0b385969cca92d1ec6d1384ddbb35eddf7fe74f0dba03fd40d9e449c4c")
    override
        fun vectorSearchConfiguration(vectorSearchConfiguration: CfnGraph.VectorSearchConfigurationProperty.Builder.() -> Unit):
        Unit =
        vectorSearchConfiguration(CfnGraph.VectorSearchConfigurationProperty(vectorSearchConfiguration))

    public fun build(): software.amazon.awscdk.services.neptunegraph.CfnGraphProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.neptunegraph.CfnGraphProps,
  ) : CdkObject(cdkObject), CfnGraphProps {
    override fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

    override fun graphName(): String? = unwrap(this).getGraphName()

    override fun provisionedMemory(): Number = unwrap(this).getProvisionedMemory()

    override fun publicConnectivity(): Any? = unwrap(this).getPublicConnectivity()

    override fun replicaCount(): Number? = unwrap(this).getReplicaCount()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vectorSearchConfiguration(): Any? = unwrap(this).getVectorSearchConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGraphProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.neptunegraph.CfnGraphProps):
        CfnGraphProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGraphProps):
        software.amazon.awscdk.services.neptunegraph.CfnGraphProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.neptunegraph.CfnGraphProps
  }
}
