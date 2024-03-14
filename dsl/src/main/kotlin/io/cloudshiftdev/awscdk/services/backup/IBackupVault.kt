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
  /**
   * The ARN of the backup vault.
   */
  public fun backupVaultArn(): String

  /**
   * The name of a logical container where backups are stored.
   */
  public fun backupVaultName(): String

  /**
   * Grant the actions defined in actions to the given grantee on this backup vault.
   *
   * @param grantee 
   * @param actions 
   */
  public fun grant(grantee: IGrantable, actions: String): Grant

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.backup.IBackupVault,
  ) : IBackupVault {
    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The ARN of the backup vault.
     */
    override fun backupVaultArn(): String = unwrap(this).getBackupVaultArn()

    /**
     * The name of a logical container where backups are stored.
     */
    override fun backupVaultName(): String = unwrap(this).getBackupVaultName()

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Grant the actions defined in actions to the given grantee on this backup vault.
     *
     * @param grantee 
     * @param actions 
     */
    override fun grant(grantee: IGrantable, actions: String): Grant =
        unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
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
