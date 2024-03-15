@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IBackupVault : IResource {
  public fun backupVaultArn(): String

  public fun backupVaultName(): String

  public fun grant(arg0: IGrantable, arg1: String): Grant

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.IBackupVault,
  ) : CdkObject(cdkObject), IBackupVault {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun backupVaultArn(): String = unwrap(this).getBackupVaultArn()

    override fun backupVaultName(): String = unwrap(this).getBackupVaultName()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grant(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grant(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.IBackupVault): IBackupVault
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IBackupVault): software.amazon.awscdk.services.backup.IBackupVault
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.backup.IBackupVault
  }
}
