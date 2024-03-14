package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMaintenanceWindow internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindow,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun allowUnassociatedTargets(): Any = unwrap(this).getAllowUnassociatedTargets()

  public open fun allowUnassociatedTargets(`value`: Boolean) {
    unwrap(this).setAllowUnassociatedTargets(`value`)
  }

  public open fun allowUnassociatedTargets(`value`: IResolvable) {
    unwrap(this).setAllowUnassociatedTargets(`value`.let(IResolvable::unwrap))
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun cutoff(): Number = unwrap(this).getCutoff()

  public open fun cutoff(`value`: Number) {
    unwrap(this).setCutoff(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun duration(): Number = unwrap(this).getDuration()

  public open fun duration(`value`: Number) {
    unwrap(this).setDuration(`value`)
  }

  public open fun endDate(): String? = unwrap(this).getEndDate()

  public open fun endDate(`value`: String) {
    unwrap(this).setEndDate(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun schedule(): String = unwrap(this).getSchedule()

  public open fun schedule(`value`: String) {
    unwrap(this).setSchedule(`value`)
  }

  public open fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

  public open fun scheduleOffset(`value`: Number) {
    unwrap(this).setScheduleOffset(`value`)
  }

  public open fun scheduleTimezone(): String? = unwrap(this).getScheduleTimezone()

  public open fun scheduleTimezone(`value`: String) {
    unwrap(this).setScheduleTimezone(`value`)
  }

  public open fun startDate(): String? = unwrap(this).getStartDate()

  public open fun startDate(`value`: String) {
    unwrap(this).setStartDate(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun allowUnassociatedTargets(allowUnassociatedTargets: Boolean)

    public fun allowUnassociatedTargets(allowUnassociatedTargets: IResolvable)

    public fun cutoff(cutoff: Number)

    public fun description(description: String)

    public fun duration(duration: Number)

    public fun endDate(endDate: String)

    public fun name(name: String)

    public fun schedule(schedule: String)

    public fun scheduleOffset(scheduleOffset: Number)

    public fun scheduleTimezone(scheduleTimezone: String)

    public fun startDate(startDate: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnMaintenanceWindow.Builder =
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindow.Builder.create(scope, id)

    override fun allowUnassociatedTargets(allowUnassociatedTargets: Boolean) {
      cdkBuilder.allowUnassociatedTargets(allowUnassociatedTargets)
    }

    override fun allowUnassociatedTargets(allowUnassociatedTargets: IResolvable) {
      cdkBuilder.allowUnassociatedTargets(allowUnassociatedTargets.let(IResolvable::unwrap))
    }

    override fun cutoff(cutoff: Number) {
      cdkBuilder.cutoff(cutoff)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun duration(duration: Number) {
      cdkBuilder.duration(duration)
    }

    override fun endDate(endDate: String) {
      cdkBuilder.endDate(endDate)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun schedule(schedule: String) {
      cdkBuilder.schedule(schedule)
    }

    override fun scheduleOffset(scheduleOffset: Number) {
      cdkBuilder.scheduleOffset(scheduleOffset)
    }

    override fun scheduleTimezone(scheduleTimezone: String) {
      cdkBuilder.scheduleTimezone(scheduleTimezone)
    }

    override fun startDate(startDate: String) {
      cdkBuilder.startDate(startDate)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ssm.CfnMaintenanceWindow =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMaintenanceWindow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMaintenanceWindow(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindow):
        CfnMaintenanceWindow = CfnMaintenanceWindow(cdkObject)

    internal fun unwrap(wrapped: CfnMaintenanceWindow):
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindow = wrapped.cdkObject
  }
}
