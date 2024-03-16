@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.collections.List

/**
 * An EBS Volume in AWS EC2.
 */
public interface IVolume : IResource {
  /**
   * The availability zone that the EBS Volume is contained within (ex: us-west-2a).
   */
  public fun availabilityZone(): String

  /**
   * The customer-managed encryption key that is used to encrypt the Volume.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Grants permission to attach this Volume to an instance.
   *
   * CAUTION: Granting an instance permission to attach to itself using this method will lead to
   * an unresolvable circular reference between the instance role and the instance.
   * Use `IVolume.grantAttachVolumeToSelf` to grant an instance permission to attach this
   * volume to itself.
   *
   * @param grantee the principal being granted permission. 
   * @param instances the instances to which permission is being granted to attach this volume to.
   */
  public fun grantAttachVolume(grantee: IGrantable): Grant

  /**
   * Grants permission to attach this Volume to an instance.
   *
   * CAUTION: Granting an instance permission to attach to itself using this method will lead to
   * an unresolvable circular reference between the instance role and the instance.
   * Use `IVolume.grantAttachVolumeToSelf` to grant an instance permission to attach this
   * volume to itself.
   *
   * @param grantee the principal being granted permission. 
   * @param instances the instances to which permission is being granted to attach this volume to.
   */
  public fun grantAttachVolume(grantee: IGrantable, instances: List<IInstance>): Grant

  /**
   * Grants permission to attach the Volume by a ResourceTag condition.
   *
   * If you are looking to
   * grant an Instance, AutoScalingGroup, EC2-Fleet, SpotFleet, ECS host, etc the ability to attach
   * this volume to **itself** then this is the method you want to use.
   *
   * This is implemented by adding a Tag with key `VolumeGrantAttach-&lt;suffix&gt;` to the given
   * constructs and this Volume, and then conditioning the Grant such that the grantee is only
   * given the ability to AttachVolume if both the Volume and the destination Instance have that
   * tag applied to them.
   *
   * @param grantee the principal being granted permission. 
   * @param constructs The list of constructs that will have the generated resource tag applied to
   * them. 
   * @param tagKeySuffix A suffix to use on the generated Tag key in place of the generated hash
   * value.
   */
  public fun grantAttachVolumeByResourceTag(grantee: IGrantable, constructs: List<Construct>): Grant

  /**
   * Grants permission to attach the Volume by a ResourceTag condition.
   *
   * If you are looking to
   * grant an Instance, AutoScalingGroup, EC2-Fleet, SpotFleet, ECS host, etc the ability to attach
   * this volume to **itself** then this is the method you want to use.
   *
   * This is implemented by adding a Tag with key `VolumeGrantAttach-&lt;suffix&gt;` to the given
   * constructs and this Volume, and then conditioning the Grant such that the grantee is only
   * given the ability to AttachVolume if both the Volume and the destination Instance have that
   * tag applied to them.
   *
   * @param grantee the principal being granted permission. 
   * @param constructs The list of constructs that will have the generated resource tag applied to
   * them. 
   * @param tagKeySuffix A suffix to use on the generated Tag key in place of the generated hash
   * value.
   */
  public fun grantAttachVolumeByResourceTag(
    grantee: IGrantable,
    constructs: List<Construct>,
    tagKeySuffix: String,
  ): Grant

  /**
   * Grants permission to detach this Volume from an instance CAUTION: Granting an instance
   * permission to detach from itself using this method will lead to an unresolvable circular reference
   * between the instance role and the instance.
   *
   * Use `IVolume.grantDetachVolumeFromSelf` to grant an instance permission to detach this
   * volume from itself.
   *
   * @param grantee the principal being granted permission. 
   * @param instances the instances to which permission is being granted to detach this volume from.
   */
  public fun grantDetachVolume(grantee: IGrantable): Grant

  /**
   * Grants permission to detach this Volume from an instance CAUTION: Granting an instance
   * permission to detach from itself using this method will lead to an unresolvable circular reference
   * between the instance role and the instance.
   *
   * Use `IVolume.grantDetachVolumeFromSelf` to grant an instance permission to detach this
   * volume from itself.
   *
   * @param grantee the principal being granted permission. 
   * @param instances the instances to which permission is being granted to detach this volume from.
   */
  public fun grantDetachVolume(grantee: IGrantable, instances: List<IInstance>): Grant

  /**
   * Grants permission to detach the Volume by a ResourceTag condition.
   *
   * This is implemented via the same mechanism as `IVolume.grantAttachVolumeByResourceTag`,
   * and is subject to the same conditions.
   *
   * @param grantee the principal being granted permission. 
   * @param constructs The list of constructs that will have the generated resource tag applied to
   * them. 
   * @param tagKeySuffix A suffix to use on the generated Tag key in place of the generated hash
   * value.
   */
  public fun grantDetachVolumeByResourceTag(grantee: IGrantable, constructs: List<Construct>): Grant

  /**
   * Grants permission to detach the Volume by a ResourceTag condition.
   *
   * This is implemented via the same mechanism as `IVolume.grantAttachVolumeByResourceTag`,
   * and is subject to the same conditions.
   *
   * @param grantee the principal being granted permission. 
   * @param constructs The list of constructs that will have the generated resource tag applied to
   * them. 
   * @param tagKeySuffix A suffix to use on the generated Tag key in place of the generated hash
   * value.
   */
  public fun grantDetachVolumeByResourceTag(
    grantee: IGrantable,
    constructs: List<Construct>,
    tagKeySuffix: String,
  ): Grant

  /**
   * The EBS Volume's ID.
   */
  public fun volumeId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IVolume): IVolume =
        CdkObjectWrappers.wrap(cdkObject) as IVolume

    internal fun unwrap(wrapped: IVolume): software.amazon.awscdk.services.ec2.IVolume = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IVolume
  }
}
