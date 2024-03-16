@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String

/**
 *
 */
public interface IInstance : IResource, IConnectable, IGrantable {
  /**
   * The availability zone the instance was launched in.
   */
  public fun instanceAvailabilityZone(): String

  /**
   * The instance's ID.
   */
  public fun instanceId(): String

  /**
   * Private DNS name for this instance.
   */
  public fun instancePrivateDnsName(): String

  /**
   * Private IP for this instance.
   */
  public fun instancePrivateIp(): String

  /**
   * Publicly-routable DNS name for this instance.
   *
   * (May be an empty string if the instance does not have a public name).
   */
  public fun instancePublicDnsName(): String

  /**
   * Publicly-routable IP  address for this instance.
   *
   * (May be an empty string if the instance does not have a public IP).
   */
  public fun instancePublicIp(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IInstance): IInstance =
        CdkObjectWrappers.wrap(cdkObject) as IInstance

    internal fun unwrap(wrapped: IInstance): software.amazon.awscdk.services.ec2.IInstance =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IInstance
  }
}
