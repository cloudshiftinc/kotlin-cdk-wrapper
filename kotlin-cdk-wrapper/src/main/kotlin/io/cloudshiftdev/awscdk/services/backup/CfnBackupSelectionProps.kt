@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnBackupSelectionProps {
  public fun backupPlanId(): String

  public fun backupSelection(): Any

  @CdkDslMarker
  public interface Builder {
    public fun backupPlanId(backupPlanId: String)

    public fun backupSelection(backupSelection: IResolvable)

    public
        fun backupSelection(backupSelection: CfnBackupSelection.BackupSelectionResourceTypeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a786542b7bad5971a5d30007a08e40068c8e2588dc6ea90915ec11a496d16fbb")
    public
        fun backupSelection(backupSelection: CfnBackupSelection.BackupSelectionResourceTypeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnBackupSelectionProps.Builder =
        software.amazon.awscdk.services.backup.CfnBackupSelectionProps.builder()

    override fun backupPlanId(backupPlanId: String) {
      cdkBuilder.backupPlanId(backupPlanId)
    }

    override fun backupSelection(backupSelection: IResolvable) {
      cdkBuilder.backupSelection(backupSelection.let(IResolvable::unwrap))
    }

    override
        fun backupSelection(backupSelection: CfnBackupSelection.BackupSelectionResourceTypeProperty) {
      cdkBuilder.backupSelection(backupSelection.let(CfnBackupSelection.BackupSelectionResourceTypeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a786542b7bad5971a5d30007a08e40068c8e2588dc6ea90915ec11a496d16fbb")
    override
        fun backupSelection(backupSelection: CfnBackupSelection.BackupSelectionResourceTypeProperty.Builder.() -> Unit):
        Unit =
        backupSelection(CfnBackupSelection.BackupSelectionResourceTypeProperty(backupSelection))

    public fun build(): software.amazon.awscdk.services.backup.CfnBackupSelectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.CfnBackupSelectionProps,
  ) : CdkObject(cdkObject), CfnBackupSelectionProps {
    override fun backupPlanId(): String = unwrap(this).getBackupPlanId()

    override fun backupSelection(): Any = unwrap(this).getBackupSelection()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBackupSelectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupSelectionProps):
        CfnBackupSelectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBackupSelectionProps):
        software.amazon.awscdk.services.backup.CfnBackupSelectionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.backup.CfnBackupSelectionProps
  }
}
