package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.collections.List

public interface IVolume : IResource {
  public fun availabilityZone(): String

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun grantAttachVolume(arg0: IGrantable): Grant

  public fun grantAttachVolume(arg0: IGrantable, arg1: List<IInstance>): Grant

  public fun grantAttachVolumeByResourceTag(arg0: IGrantable, arg1: List<Construct>): Grant

  public fun grantAttachVolumeByResourceTag(
    arg0: IGrantable,
    arg1: List<Construct>,
    arg2: String,
  ): Grant

  public fun grantDetachVolume(arg0: IGrantable): Grant

  public fun grantDetachVolume(arg0: IGrantable, arg1: List<IInstance>): Grant

  public fun grantDetachVolumeByResourceTag(arg0: IGrantable, arg1: List<Construct>): Grant

  public fun grantDetachVolumeByResourceTag(
    arg0: IGrantable,
    arg1: List<Construct>,
    arg2: String,
  ): Grant

  public fun volumeId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IVolume,
  ) : IVolume {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun grantAttachVolume(arg0: IGrantable): Grant =
        unwrap(this).grantAttachVolume(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun grantAttachVolume(arg0: IGrantable, arg1: List<IInstance>): Grant =
        unwrap(this).grantAttachVolume(arg0.let(IGrantable::unwrap),
        arg1.map(IInstance::unwrap)).let(Grant::wrap)

    public override fun grantAttachVolumeByResourceTag(arg0: IGrantable, arg1: List<Construct>):
        Grant = unwrap(this).grantAttachVolumeByResourceTag(arg0.let(IGrantable::unwrap),
        arg1.map(Construct::unwrap)).let(Grant::wrap)

    public override fun grantAttachVolumeByResourceTag(
      arg0: IGrantable,
      arg1: List<Construct>,
      arg2: String,
    ): Grant = unwrap(this).grantAttachVolumeByResourceTag(arg0.let(IGrantable::unwrap),
        arg1.map(Construct::unwrap), arg2).let(Grant::wrap)

    public override fun grantDetachVolume(arg0: IGrantable): Grant =
        unwrap(this).grantDetachVolume(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun grantDetachVolume(arg0: IGrantable, arg1: List<IInstance>): Grant =
        unwrap(this).grantDetachVolume(arg0.let(IGrantable::unwrap),
        arg1.map(IInstance::unwrap)).let(Grant::wrap)

    public override fun grantDetachVolumeByResourceTag(arg0: IGrantable, arg1: List<Construct>):
        Grant = unwrap(this).grantDetachVolumeByResourceTag(arg0.let(IGrantable::unwrap),
        arg1.map(Construct::unwrap)).let(Grant::wrap)

    public override fun grantDetachVolumeByResourceTag(
      arg0: IGrantable,
      arg1: List<Construct>,
      arg2: String,
    ): Grant = unwrap(this).grantDetachVolumeByResourceTag(arg0.let(IGrantable::unwrap),
        arg1.map(Construct::unwrap), arg2).let(Grant::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun volumeId(): String = unwrap(this).getVolumeId()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IVolume): IVolume =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVolume): software.amazon.awscdk.services.ec2.IVolume = (wrapped as
        Wrapper).cdkObject
  }
}
