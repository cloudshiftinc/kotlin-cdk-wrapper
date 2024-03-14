package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IBackupVault : IResource {
  public fun backupVaultArn(): String

  public fun backupVaultName(): String

  public fun grant(arg0: IGrantable, arg1: String): Grant

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.backup.IBackupVault,
  ) : IBackupVault {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun backupVaultArn(): String = unwrap(this).getBackupVaultArn()

    public override fun backupVaultName(): String = unwrap(this).getBackupVaultName()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun grant(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grant(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.IBackupVault): IBackupVault
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IBackupVault): software.amazon.awscdk.services.backup.IBackupVault
        = (wrapped as Wrapper).cdkObject
  }
}
