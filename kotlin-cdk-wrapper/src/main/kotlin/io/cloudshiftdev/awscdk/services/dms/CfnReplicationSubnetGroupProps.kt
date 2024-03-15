@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnReplicationSubnetGroupProps {
  public fun replicationSubnetGroupDescription(): String

  public fun replicationSubnetGroupIdentifier(): String? =
      unwrap(this).getReplicationSubnetGroupIdentifier()

  public fun subnetIds(): List<String>

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun replicationSubnetGroupDescription(replicationSubnetGroupDescription: String)

    public fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps.Builder =
        software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps.builder()

    override fun replicationSubnetGroupDescription(replicationSubnetGroupDescription: String) {
      cdkBuilder.replicationSubnetGroupDescription(replicationSubnetGroupDescription)
    }

    override fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String) {
      cdkBuilder.replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps,
  ) : CdkObject(cdkObject), CfnReplicationSubnetGroupProps {
    override fun replicationSubnetGroupDescription(): String =
        unwrap(this).getReplicationSubnetGroupDescription()

    override fun replicationSubnetGroupIdentifier(): String? =
        unwrap(this).getReplicationSubnetGroupIdentifier()

    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicationSubnetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps):
        CfnReplicationSubnetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationSubnetGroupProps):
        software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps
  }
}
