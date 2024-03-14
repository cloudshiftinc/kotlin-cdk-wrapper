package io.cloudshiftdev.awscdk.services.efs

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
  public fun fileSystemArn(): String

  public fun fileSystemId(): String

  public fun grant(arg0: IGrantable, arg1: String): Grant

  public fun grantRead(arg0: IGrantable): Grant

  public fun grantReadWrite(arg0: IGrantable): Grant

  public fun grantRootAccess(arg0: IGrantable): Grant

  public fun mountTargetsAvailable(): IDependable

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.efs.IFileSystem,
  ) : IFileSystem {
    override fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(arg0.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    override fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(arg0))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun fileSystemArn(): String = unwrap(this).getFileSystemArn()

    override fun fileSystemId(): String = unwrap(this).getFileSystemId()

    override fun grant(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grant(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantRead(arg0: IGrantable): Grant =
        unwrap(this).grantRead(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantReadWrite(arg0: IGrantable): Grant =
        unwrap(this).grantReadWrite(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantRootAccess(arg0: IGrantable): Grant =
        unwrap(this).grantRootAccess(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun mountTargetsAvailable(): IDependable =
        unwrap(this).getMountTargetsAvailable().let(IDependable::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.IFileSystem): IFileSystem =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFileSystem): software.amazon.awscdk.services.efs.IFileSystem =
        (wrapped as Wrapper).cdkObject
  }
}
