@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IVolume,
  ) : CdkObject(cdkObject), IVolume {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantAttachVolume(arg0: IGrantable): Grant =
        unwrap(this).grantAttachVolume(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantAttachVolume(arg0: IGrantable, arg1: List<IInstance>): Grant =
        unwrap(this).grantAttachVolume(arg0.let(IGrantable::unwrap),
        arg1.map(IInstance::unwrap)).let(Grant::wrap)

    override fun grantAttachVolumeByResourceTag(arg0: IGrantable, arg1: List<Construct>): Grant =
        unwrap(this).grantAttachVolumeByResourceTag(arg0.let(IGrantable::unwrap),
        arg1.map(Construct::unwrap)).let(Grant::wrap)

    override fun grantAttachVolumeByResourceTag(
      arg0: IGrantable,
      arg1: List<Construct>,
      arg2: String,
    ): Grant = unwrap(this).grantAttachVolumeByResourceTag(arg0.let(IGrantable::unwrap),
        arg1.map(Construct::unwrap), arg2).let(Grant::wrap)

    override fun grantDetachVolume(arg0: IGrantable): Grant =
        unwrap(this).grantDetachVolume(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantDetachVolume(arg0: IGrantable, arg1: List<IInstance>): Grant =
        unwrap(this).grantDetachVolume(arg0.let(IGrantable::unwrap),
        arg1.map(IInstance::unwrap)).let(Grant::wrap)

    override fun grantDetachVolumeByResourceTag(arg0: IGrantable, arg1: List<Construct>): Grant =
        unwrap(this).grantDetachVolumeByResourceTag(arg0.let(IGrantable::unwrap),
        arg1.map(Construct::unwrap)).let(Grant::wrap)

    override fun grantDetachVolumeByResourceTag(
      arg0: IGrantable,
      arg1: List<Construct>,
      arg2: String,
    ): Grant = unwrap(this).grantDetachVolumeByResourceTag(arg0.let(IGrantable::unwrap),
        arg1.map(Construct::unwrap), arg2).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun volumeId(): String = unwrap(this).getVolumeId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IVolume): IVolume =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVolume): software.amazon.awscdk.services.ec2.IVolume = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IVolume
  }
}
