@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnReplicatorProps {
  public fun currentVersion(): String? = unwrap(this).getCurrentVersion()

  public fun description(): String? = unwrap(this).getDescription()

  public fun kafkaClusters(): Any

  public fun replicationInfoList(): Any

  public fun replicatorName(): String

  public fun serviceExecutionRoleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun currentVersion(currentVersion: String)

    public fun description(description: String)

    public fun kafkaClusters(kafkaClusters: IResolvable)

    public fun kafkaClusters(kafkaClusters: List<Any>)

    public fun kafkaClusters(vararg kafkaClusters: Any)

    public fun replicationInfoList(replicationInfoList: IResolvable)

    public fun replicationInfoList(replicationInfoList: List<Any>)

    public fun replicationInfoList(vararg replicationInfoList: Any)

    public fun replicatorName(replicatorName: String)

    public fun serviceExecutionRoleArn(serviceExecutionRoleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnReplicatorProps.Builder =
        software.amazon.awscdk.services.msk.CfnReplicatorProps.builder()

    override fun currentVersion(currentVersion: String) {
      cdkBuilder.currentVersion(currentVersion)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun kafkaClusters(kafkaClusters: IResolvable) {
      cdkBuilder.kafkaClusters(kafkaClusters.let(IResolvable::unwrap))
    }

    override fun kafkaClusters(kafkaClusters: List<Any>) {
      cdkBuilder.kafkaClusters(kafkaClusters)
    }

    override fun kafkaClusters(vararg kafkaClusters: Any): Unit =
        kafkaClusters(kafkaClusters.toList())

    override fun replicationInfoList(replicationInfoList: IResolvable) {
      cdkBuilder.replicationInfoList(replicationInfoList.let(IResolvable::unwrap))
    }

    override fun replicationInfoList(replicationInfoList: List<Any>) {
      cdkBuilder.replicationInfoList(replicationInfoList)
    }

    override fun replicationInfoList(vararg replicationInfoList: Any): Unit =
        replicationInfoList(replicationInfoList.toList())

    override fun replicatorName(replicatorName: String) {
      cdkBuilder.replicatorName(replicatorName)
    }

    override fun serviceExecutionRoleArn(serviceExecutionRoleArn: String) {
      cdkBuilder.serviceExecutionRoleArn(serviceExecutionRoleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.msk.CfnReplicatorProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.msk.CfnReplicatorProps,
  ) : CdkObject(cdkObject), CfnReplicatorProps {
    override fun currentVersion(): String? = unwrap(this).getCurrentVersion()

    override fun description(): String? = unwrap(this).getDescription()

    override fun kafkaClusters(): Any = unwrap(this).getKafkaClusters()

    override fun replicationInfoList(): Any = unwrap(this).getReplicationInfoList()

    override fun replicatorName(): String = unwrap(this).getReplicatorName()

    override fun serviceExecutionRoleArn(): String = unwrap(this).getServiceExecutionRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicatorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicatorProps):
        CfnReplicatorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReplicatorProps):
        software.amazon.awscdk.services.msk.CfnReplicatorProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.msk.CfnReplicatorProps
  }
}
