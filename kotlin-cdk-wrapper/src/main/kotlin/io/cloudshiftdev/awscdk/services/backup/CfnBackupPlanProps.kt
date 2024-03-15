@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnBackupPlanProps {
  public fun backupPlan(): Any

  public fun backupPlanTags(): Map<String, String> = unwrap(this).getBackupPlanTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun backupPlan(backupPlan: IResolvable)

    public fun backupPlan(backupPlan: CfnBackupPlan.BackupPlanResourceTypeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3821f99c61f0dddd7d9c960d5f919f9e56da9d555e0aca6256ed57d22a08ed4")
    public
        fun backupPlan(backupPlan: CfnBackupPlan.BackupPlanResourceTypeProperty.Builder.() -> Unit)

    public fun backupPlanTags(backupPlanTags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnBackupPlanProps.Builder =
        software.amazon.awscdk.services.backup.CfnBackupPlanProps.builder()

    override fun backupPlan(backupPlan: IResolvable) {
      cdkBuilder.backupPlan(backupPlan.let(IResolvable::unwrap))
    }

    override fun backupPlan(backupPlan: CfnBackupPlan.BackupPlanResourceTypeProperty) {
      cdkBuilder.backupPlan(backupPlan.let(CfnBackupPlan.BackupPlanResourceTypeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3821f99c61f0dddd7d9c960d5f919f9e56da9d555e0aca6256ed57d22a08ed4")
    override
        fun backupPlan(backupPlan: CfnBackupPlan.BackupPlanResourceTypeProperty.Builder.() -> Unit):
        Unit = backupPlan(CfnBackupPlan.BackupPlanResourceTypeProperty(backupPlan))

    override fun backupPlanTags(backupPlanTags: Map<String, String>) {
      cdkBuilder.backupPlanTags(backupPlanTags)
    }

    public fun build(): software.amazon.awscdk.services.backup.CfnBackupPlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlanProps,
  ) : CdkObject(cdkObject), CfnBackupPlanProps {
    override fun backupPlan(): Any = unwrap(this).getBackupPlan()

    override fun backupPlanTags(): Map<String, String> = unwrap(this).getBackupPlanTags() ?:
        emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBackupPlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlanProps):
        CfnBackupPlanProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBackupPlanProps):
        software.amazon.awscdk.services.backup.CfnBackupPlanProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.backup.CfnBackupPlanProps
  }
}
