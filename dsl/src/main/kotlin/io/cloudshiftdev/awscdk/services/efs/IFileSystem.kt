package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IResourceWithPolicy
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.IDependable
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IFileSystem : IConnectable, IResourceWithPolicy {
  /**
   * The ARN of the file system.
   */
  public fun fileSystemArn(): String

  /**
   * The ID of the file system, assigned by Amazon EFS.
   */
  public fun fileSystemId(): String

  /**
   * Grant the actions defined in actions to the given grantee on this File System resource.
   *
   * @param grantee 
   * @param actions 
   */
  public fun grant(grantee: IGrantable, actions: String): Grant

  /**
   * Grant read permissions for this file system to an IAM principal.
   *
   * @param grantee The principal to grant read to. 
   */
  public fun grantRead(grantee: IGrantable): Grant

  /**
   * Grant read and write permissions for this file system to an IAM principal.
   *
   * @param grantee The principal to grant read and write to. 
   */
  public fun grantReadWrite(grantee: IGrantable): Grant

  /**
   * As root user, grant read and write permissions for this file system to an IAM principal.
   *
   * @param grantee The principal to grant root access to. 
   */
  public fun grantRootAccess(grantee: IGrantable): Grant

  /**
   * Dependable that can be depended upon to ensure the mount targets of the filesystem are ready.
   */
  public fun mountTargetsAvailable(): IDependable

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.efs.IFileSystem,
  ) : CdkObject(cdkObject), IFileSystem {
    /**
     * Add a statement to the resource's resource policy.
     *
     * @param statement 
     */
    override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

    /**
     * Add a statement to the resource's resource policy.
     *
     * @param statement 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

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
     * The network connections associated with this resource.
     */
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

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
     * The ARN of the file system.
     */
    override fun fileSystemArn(): String = unwrap(this).getFileSystemArn()

    /**
     * The ID of the file system, assigned by Amazon EFS.
     */
    override fun fileSystemId(): String = unwrap(this).getFileSystemId()

    /**
     * Grant the actions defined in actions to the given grantee on this File System resource.
     *
     * @param grantee 
     * @param actions 
     */
    override fun grant(grantee: IGrantable, actions: String): Grant =
        unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

    /**
     * Grant read permissions for this file system to an IAM principal.
     *
     * @param grantee The principal to grant read to. 
     */
    override fun grantRead(grantee: IGrantable): Grant =
        unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Grant read and write permissions for this file system to an IAM principal.
     *
     * @param grantee The principal to grant read and write to. 
     */
    override fun grantReadWrite(grantee: IGrantable): Grant =
        unwrap(this).grantReadWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * As root user, grant read and write permissions for this file system to an IAM principal.
     *
     * @param grantee The principal to grant root access to. 
     */
    override fun grantRootAccess(grantee: IGrantable): Grant =
        unwrap(this).grantRootAccess(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Dependable that can be depended upon to ensure the mount targets of the filesystem are ready.
     */
    override fun mountTargetsAvailable(): IDependable =
        unwrap(this).getMountTargetsAvailable().let(IDependable::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.IFileSystem): IFileSystem =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFileSystem): software.amazon.awscdk.services.efs.IFileSystem =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.efs.IFileSystem
  }
}
