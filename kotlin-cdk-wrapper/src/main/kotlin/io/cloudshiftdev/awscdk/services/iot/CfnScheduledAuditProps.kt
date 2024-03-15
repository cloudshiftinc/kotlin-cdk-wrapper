@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnScheduledAuditProps {
  public fun dayOfMonth(): String? = unwrap(this).getDayOfMonth()

  public fun dayOfWeek(): String? = unwrap(this).getDayOfWeek()

  public fun frequency(): String

  public fun scheduledAuditName(): String? = unwrap(this).getScheduledAuditName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targetCheckNames(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun dayOfMonth(dayOfMonth: String)

    public fun dayOfWeek(dayOfWeek: String)

    public fun frequency(frequency: String)

    public fun scheduledAuditName(scheduledAuditName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetCheckNames(targetCheckNames: List<String>)

    public fun targetCheckNames(vararg targetCheckNames: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnScheduledAuditProps.Builder =
        software.amazon.awscdk.services.iot.CfnScheduledAuditProps.builder()

    override fun dayOfMonth(dayOfMonth: String) {
      cdkBuilder.dayOfMonth(dayOfMonth)
    }

    override fun dayOfWeek(dayOfWeek: String) {
      cdkBuilder.dayOfWeek(dayOfWeek)
    }

    override fun frequency(frequency: String) {
      cdkBuilder.frequency(frequency)
    }

    override fun scheduledAuditName(scheduledAuditName: String) {
      cdkBuilder.scheduledAuditName(scheduledAuditName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetCheckNames(targetCheckNames: List<String>) {
      cdkBuilder.targetCheckNames(targetCheckNames)
    }

    override fun targetCheckNames(vararg targetCheckNames: String): Unit =
        targetCheckNames(targetCheckNames.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnScheduledAuditProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnScheduledAuditProps,
  ) : CdkObject(cdkObject), CfnScheduledAuditProps {
    override fun dayOfMonth(): String? = unwrap(this).getDayOfMonth()

    override fun dayOfWeek(): String? = unwrap(this).getDayOfWeek()

    override fun frequency(): String = unwrap(this).getFrequency()

    override fun scheduledAuditName(): String? = unwrap(this).getScheduledAuditName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targetCheckNames(): List<String> = unwrap(this).getTargetCheckNames()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScheduledAuditProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnScheduledAuditProps):
        CfnScheduledAuditProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScheduledAuditProps):
        software.amazon.awscdk.services.iot.CfnScheduledAuditProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnScheduledAuditProps
  }
}
