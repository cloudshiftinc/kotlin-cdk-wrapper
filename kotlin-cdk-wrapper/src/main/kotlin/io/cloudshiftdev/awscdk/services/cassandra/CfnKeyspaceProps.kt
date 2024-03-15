@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cassandra

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnKeyspaceProps {
  public fun keyspaceName(): String? = unwrap(this).getKeyspaceName()

  public fun replicationSpecification(): Any? = unwrap(this).getReplicationSpecification()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun keyspaceName(keyspaceName: String)

    public fun replicationSpecification(replicationSpecification: IResolvable)

    public
        fun replicationSpecification(replicationSpecification: CfnKeyspace.ReplicationSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30db27c9ea2a3e4fb2961ad2a1434e1894548888258dae4384165ffb9384b226")
    public
        fun replicationSpecification(replicationSpecification: CfnKeyspace.ReplicationSpecificationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cassandra.CfnKeyspaceProps.Builder =
        software.amazon.awscdk.services.cassandra.CfnKeyspaceProps.builder()

    override fun keyspaceName(keyspaceName: String) {
      cdkBuilder.keyspaceName(keyspaceName)
    }

    override fun replicationSpecification(replicationSpecification: IResolvable) {
      cdkBuilder.replicationSpecification(replicationSpecification.let(IResolvable::unwrap))
    }

    override
        fun replicationSpecification(replicationSpecification: CfnKeyspace.ReplicationSpecificationProperty) {
      cdkBuilder.replicationSpecification(replicationSpecification.let(CfnKeyspace.ReplicationSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30db27c9ea2a3e4fb2961ad2a1434e1894548888258dae4384165ffb9384b226")
    override
        fun replicationSpecification(replicationSpecification: CfnKeyspace.ReplicationSpecificationProperty.Builder.() -> Unit):
        Unit =
        replicationSpecification(CfnKeyspace.ReplicationSpecificationProperty(replicationSpecification))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cassandra.CfnKeyspaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cassandra.CfnKeyspaceProps,
  ) : CdkObject(cdkObject), CfnKeyspaceProps {
    override fun keyspaceName(): String? = unwrap(this).getKeyspaceName()

    override fun replicationSpecification(): Any? = unwrap(this).getReplicationSpecification()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnKeyspaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnKeyspaceProps):
        CfnKeyspaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnKeyspaceProps):
        software.amazon.awscdk.services.cassandra.CfnKeyspaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cassandra.CfnKeyspaceProps
  }
}
