@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnReplicationTaskProps {
  public fun cdcStartPosition(): String? = unwrap(this).getCdcStartPosition()

  public fun cdcStartTime(): Number? = unwrap(this).getCdcStartTime()

  public fun cdcStopPosition(): String? = unwrap(this).getCdcStopPosition()

  public fun migrationType(): String

  public fun replicationInstanceArn(): String

  public fun replicationTaskIdentifier(): String? = unwrap(this).getReplicationTaskIdentifier()

  public fun replicationTaskSettings(): String? = unwrap(this).getReplicationTaskSettings()

  public fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  public fun sourceEndpointArn(): String

  public fun tableMappings(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targetEndpointArn(): String

  public fun taskData(): String? = unwrap(this).getTaskData()

  @CdkDslMarker
  public interface Builder {
    public fun cdcStartPosition(cdcStartPosition: String)

    public fun cdcStartTime(cdcStartTime: Number)

    public fun cdcStopPosition(cdcStopPosition: String)

    public fun migrationType(migrationType: String)

    public fun replicationInstanceArn(replicationInstanceArn: String)

    public fun replicationTaskIdentifier(replicationTaskIdentifier: String)

    public fun replicationTaskSettings(replicationTaskSettings: String)

    public fun resourceIdentifier(resourceIdentifier: String)

    public fun sourceEndpointArn(sourceEndpointArn: String)

    public fun tableMappings(tableMappings: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetEndpointArn(targetEndpointArn: String)

    public fun taskData(taskData: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder =
        software.amazon.awscdk.services.dms.CfnReplicationTaskProps.builder()

    override fun cdcStartPosition(cdcStartPosition: String) {
      cdkBuilder.cdcStartPosition(cdcStartPosition)
    }

    override fun cdcStartTime(cdcStartTime: Number) {
      cdkBuilder.cdcStartTime(cdcStartTime)
    }

    override fun cdcStopPosition(cdcStopPosition: String) {
      cdkBuilder.cdcStopPosition(cdcStopPosition)
    }

    override fun migrationType(migrationType: String) {
      cdkBuilder.migrationType(migrationType)
    }

    override fun replicationInstanceArn(replicationInstanceArn: String) {
      cdkBuilder.replicationInstanceArn(replicationInstanceArn)
    }

    override fun replicationTaskIdentifier(replicationTaskIdentifier: String) {
      cdkBuilder.replicationTaskIdentifier(replicationTaskIdentifier)
    }

    override fun replicationTaskSettings(replicationTaskSettings: String) {
      cdkBuilder.replicationTaskSettings(replicationTaskSettings)
    }

    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    override fun sourceEndpointArn(sourceEndpointArn: String) {
      cdkBuilder.sourceEndpointArn(sourceEndpointArn)
    }

    override fun tableMappings(tableMappings: String) {
      cdkBuilder.tableMappings(tableMappings)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetEndpointArn(targetEndpointArn: String) {
      cdkBuilder.targetEndpointArn(targetEndpointArn)
    }

    override fun taskData(taskData: String) {
      cdkBuilder.taskData(taskData)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnReplicationTaskProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dms.CfnReplicationTaskProps,
  ) : CdkObject(cdkObject), CfnReplicationTaskProps {
    override fun cdcStartPosition(): String? = unwrap(this).getCdcStartPosition()

    override fun cdcStartTime(): Number? = unwrap(this).getCdcStartTime()

    override fun cdcStopPosition(): String? = unwrap(this).getCdcStopPosition()

    override fun migrationType(): String = unwrap(this).getMigrationType()

    override fun replicationInstanceArn(): String = unwrap(this).getReplicationInstanceArn()

    override fun replicationTaskIdentifier(): String? = unwrap(this).getReplicationTaskIdentifier()

    override fun replicationTaskSettings(): String? = unwrap(this).getReplicationTaskSettings()

    override fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

    override fun sourceEndpointArn(): String = unwrap(this).getSourceEndpointArn()

    override fun tableMappings(): String = unwrap(this).getTableMappings()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targetEndpointArn(): String = unwrap(this).getTargetEndpointArn()

    override fun taskData(): String? = unwrap(this).getTaskData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicationTaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationTaskProps):
        CfnReplicationTaskProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationTaskProps):
        software.amazon.awscdk.services.dms.CfnReplicationTaskProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dms.CfnReplicationTaskProps
  }
}
