package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReplicationTask internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dms.CfnReplicationTask,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun cdcStartPosition(): String? = unwrap(this).getCdcStartPosition()

  public open fun cdcStartPosition(`value`: String) {
    unwrap(this).setCdcStartPosition(`value`)
  }

  public open fun cdcStartTime(): Number? = unwrap(this).getCdcStartTime()

  public open fun cdcStartTime(`value`: Number) {
    unwrap(this).setCdcStartTime(`value`)
  }

  public open fun cdcStopPosition(): String? = unwrap(this).getCdcStopPosition()

  public open fun cdcStopPosition(`value`: String) {
    unwrap(this).setCdcStopPosition(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun migrationType(): String = unwrap(this).getMigrationType()

  public open fun migrationType(`value`: String) {
    unwrap(this).setMigrationType(`value`)
  }

  public open fun replicationInstanceArn(): String = unwrap(this).getReplicationInstanceArn()

  public open fun replicationInstanceArn(`value`: String) {
    unwrap(this).setReplicationInstanceArn(`value`)
  }

  public open fun replicationTaskIdentifier(): String? = unwrap(this).getReplicationTaskIdentifier()

  public open fun replicationTaskIdentifier(`value`: String) {
    unwrap(this).setReplicationTaskIdentifier(`value`)
  }

  public open fun replicationTaskSettings(): String? = unwrap(this).getReplicationTaskSettings()

  public open fun replicationTaskSettings(`value`: String) {
    unwrap(this).setReplicationTaskSettings(`value`)
  }

  public open fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  public open fun resourceIdentifier(`value`: String) {
    unwrap(this).setResourceIdentifier(`value`)
  }

  public open fun sourceEndpointArn(): String = unwrap(this).getSourceEndpointArn()

  public open fun sourceEndpointArn(`value`: String) {
    unwrap(this).setSourceEndpointArn(`value`)
  }

  public open fun tableMappings(): String = unwrap(this).getTableMappings()

  public open fun tableMappings(`value`: String) {
    unwrap(this).setTableMappings(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun targetEndpointArn(): String = unwrap(this).getTargetEndpointArn()

  public open fun targetEndpointArn(`value`: String) {
    unwrap(this).setTargetEndpointArn(`value`)
  }

  public open fun taskData(): String? = unwrap(this).getTaskData()

  public open fun taskData(`value`: String) {
    unwrap(this).setTaskData(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnReplicationTask.Builder =
        software.amazon.awscdk.services.dms.CfnReplicationTask.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.dms.CfnReplicationTask = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReplicationTask {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReplicationTask(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationTask):
        CfnReplicationTask = CfnReplicationTask(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationTask):
        software.amazon.awscdk.services.dms.CfnReplicationTask = wrapped.cdkObject
  }
}
