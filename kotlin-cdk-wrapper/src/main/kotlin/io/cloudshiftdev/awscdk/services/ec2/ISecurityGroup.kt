@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface for security group-like objects.
 */
public interface ISecurityGroup : IResource, IPeer {
  /**
   * Add an egress rule for the current security group.
   *
   * `remoteRule` controls where the Rule object is created if the peer is also a
   * securityGroup and they are in different stack. If false (default) the
   * rule object is created under the current SecurityGroup object. If true and the
   * peer is also a SecurityGroup, the rule object is created under the remote
   * SecurityGroup object.
   *
   * @param peer 
   * @param connection 
   * @param description
   * @param remoteRule
   */
  public fun addEgressRule(peer: IPeer, connection: Port)

  /**
   * Add an egress rule for the current security group.
   *
   * `remoteRule` controls where the Rule object is created if the peer is also a
   * securityGroup and they are in different stack. If false (default) the
   * rule object is created under the current SecurityGroup object. If true and the
   * peer is also a SecurityGroup, the rule object is created under the remote
   * SecurityGroup object.
   *
   * @param peer 
   * @param connection 
   * @param description
   * @param remoteRule
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4bf89f5e640a8b7efb17409c9a88eefede4e96a9f59d45b102417c6495109e89")
  public fun addEgressRule(peer: IPeer, connection: Port.Builder.() -> Unit)

  /**
   * Add an egress rule for the current security group.
   *
   * `remoteRule` controls where the Rule object is created if the peer is also a
   * securityGroup and they are in different stack. If false (default) the
   * rule object is created under the current SecurityGroup object. If true and the
   * peer is also a SecurityGroup, the rule object is created under the remote
   * SecurityGroup object.
   *
   * @param peer 
   * @param connection 
   * @param description
   * @param remoteRule
   */
  public fun addEgressRule(
    peer: IPeer,
    connection: Port,
    description: String,
  )

  /**
   * Add an egress rule for the current security group.
   *
   * `remoteRule` controls where the Rule object is created if the peer is also a
   * securityGroup and they are in different stack. If false (default) the
   * rule object is created under the current SecurityGroup object. If true and the
   * peer is also a SecurityGroup, the rule object is created under the remote
   * SecurityGroup object.
   *
   * @param peer 
   * @param connection 
   * @param description
   * @param remoteRule
   */
  public fun addEgressRule(
    peer: IPeer,
    connection: Port,
    description: String,
    remoteRule: Boolean,
  )

  /**
   * Add an ingress rule for the current security group.
   *
   * `remoteRule` controls where the Rule object is created if the peer is also a
   * securityGroup and they are in different stack. If false (default) the
   * rule object is created under the current SecurityGroup object. If true and the
   * peer is also a SecurityGroup, the rule object is created under the remote
   * SecurityGroup object.
   *
   * @param peer 
   * @param connection 
   * @param description
   * @param remoteRule
   */
  public fun addIngressRule(peer: IPeer, connection: Port)

  /**
   * Add an ingress rule for the current security group.
   *
   * `remoteRule` controls where the Rule object is created if the peer is also a
   * securityGroup and they are in different stack. If false (default) the
   * rule object is created under the current SecurityGroup object. If true and the
   * peer is also a SecurityGroup, the rule object is created under the remote
   * SecurityGroup object.
   *
   * @param peer 
   * @param connection 
   * @param description
   * @param remoteRule
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d409b422c545699df421c29fe3c67d472d855aa96dc063ceafcf760d3ba5c249")
  public fun addIngressRule(peer: IPeer, connection: Port.Builder.() -> Unit)

  /**
   * Add an ingress rule for the current security group.
   *
   * `remoteRule` controls where the Rule object is created if the peer is also a
   * securityGroup and they are in different stack. If false (default) the
   * rule object is created under the current SecurityGroup object. If true and the
   * peer is also a SecurityGroup, the rule object is created under the remote
   * SecurityGroup object.
   *
   * @param peer 
   * @param connection 
   * @param description
   * @param remoteRule
   */
  public fun addIngressRule(
    peer: IPeer,
    connection: Port,
    description: String,
  )

  /**
   * Add an ingress rule for the current security group.
   *
   * `remoteRule` controls where the Rule object is created if the peer is also a
   * securityGroup and they are in different stack. If false (default) the
   * rule object is created under the current SecurityGroup object. If true and the
   * peer is also a SecurityGroup, the rule object is created under the remote
   * SecurityGroup object.
   *
   * @param peer 
   * @param connection 
   * @param description
   * @param remoteRule
   */
  public fun addIngressRule(
    peer: IPeer,
    connection: Port,
    description: String,
    remoteRule: Boolean,
  )

  /**
   * Whether the SecurityGroup has been configured to allow all outbound traffic.
   */
  public fun allowAllOutbound(): Boolean

  /**
   * ID for the current security group.
   */
  public fun securityGroupId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ISecurityGroup): ISecurityGroup
        = CdkObjectWrappers.wrap(cdkObject) as ISecurityGroup

    internal fun unwrap(wrapped: ISecurityGroup): software.amazon.awscdk.services.ec2.ISecurityGroup
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ISecurityGroup
  }
}
