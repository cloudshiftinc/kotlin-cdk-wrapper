@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnRestoreTestingPlanProps {
  public fun recoveryPointSelection(): Any

  public fun restoreTestingPlanName(): String

  public fun scheduleExpression(): String

  public fun scheduleExpressionTimezone(): String? = unwrap(this).getScheduleExpressionTimezone()

  public fun startWindowHours(): Number? = unwrap(this).getStartWindowHours()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun recoveryPointSelection(recoveryPointSelection: IResolvable)

    public
        fun recoveryPointSelection(recoveryPointSelection: CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9dfacce4f113115aecc49d0f94c42403daeef0c7c18e63ee5fb771523a009c8a")
    public
        fun recoveryPointSelection(recoveryPointSelection: CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty.Builder.() -> Unit)

    public fun restoreTestingPlanName(restoreTestingPlanName: String)

    public fun scheduleExpression(scheduleExpression: String)

    public fun scheduleExpressionTimezone(scheduleExpressionTimezone: String)

    public fun startWindowHours(startWindowHours: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.backup.CfnRestoreTestingPlanProps.Builder =
        software.amazon.awscdk.services.backup.CfnRestoreTestingPlanProps.builder()

    override fun recoveryPointSelection(recoveryPointSelection: IResolvable) {
      cdkBuilder.recoveryPointSelection(recoveryPointSelection.let(IResolvable::unwrap))
    }

    override
        fun recoveryPointSelection(recoveryPointSelection: CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty) {
      cdkBuilder.recoveryPointSelection(recoveryPointSelection.let(CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9dfacce4f113115aecc49d0f94c42403daeef0c7c18e63ee5fb771523a009c8a")
    override
        fun recoveryPointSelection(recoveryPointSelection: CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty.Builder.() -> Unit):
        Unit =
        recoveryPointSelection(CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty(recoveryPointSelection))

    override fun restoreTestingPlanName(restoreTestingPlanName: String) {
      cdkBuilder.restoreTestingPlanName(restoreTestingPlanName)
    }

    override fun scheduleExpression(scheduleExpression: String) {
      cdkBuilder.scheduleExpression(scheduleExpression)
    }

    override fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
      cdkBuilder.scheduleExpressionTimezone(scheduleExpressionTimezone)
    }

    override fun startWindowHours(startWindowHours: Number) {
      cdkBuilder.startWindowHours(startWindowHours)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.backup.CfnRestoreTestingPlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingPlanProps,
  ) : CdkObject(cdkObject), CfnRestoreTestingPlanProps {
    override fun recoveryPointSelection(): Any = unwrap(this).getRecoveryPointSelection()

    override fun restoreTestingPlanName(): String = unwrap(this).getRestoreTestingPlanName()

    override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()

    override fun scheduleExpressionTimezone(): String? =
        unwrap(this).getScheduleExpressionTimezone()

    override fun startWindowHours(): Number? = unwrap(this).getStartWindowHours()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRestoreTestingPlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingPlanProps):
        CfnRestoreTestingPlanProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRestoreTestingPlanProps):
        software.amazon.awscdk.services.backup.CfnRestoreTestingPlanProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.backup.CfnRestoreTestingPlanProps
  }
}
