@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.Any
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

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.ISecurityGroup,
  ) : CdkObject(cdkObject), ISecurityGroup {
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
    override fun addEgressRule(peer: IPeer, connection: Port) {
      unwrap(this).addEgressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap))
    }

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
    override fun addEgressRule(peer: IPeer, connection: Port.Builder.() -> Unit): Unit =
        addEgressRule(peer, Port(connection))

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
    override fun addEgressRule(
      peer: IPeer,
      connection: Port,
      description: String,
    ) {
      unwrap(this).addEgressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap), description)
    }

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
    override fun addEgressRule(
      peer: IPeer,
      connection: Port,
      description: String,
      remoteRule: Boolean,
    ) {
      unwrap(this).addEgressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap), description,
          remoteRule)
    }

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
    override fun addIngressRule(peer: IPeer, connection: Port) {
      unwrap(this).addIngressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap))
    }

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
    override fun addIngressRule(peer: IPeer, connection: Port.Builder.() -> Unit): Unit =
        addIngressRule(peer, Port(connection))

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
    override fun addIngressRule(
      peer: IPeer,
      connection: Port,
      description: String,
    ) {
      unwrap(this).addIngressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap),
          description)
    }

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
    override fun addIngressRule(
      peer: IPeer,
      connection: Port,
      description: String,
      remoteRule: Boolean,
    ) {
      unwrap(this).addIngressRule(peer.let(IPeer::unwrap), connection.let(Port::unwrap),
          description, remoteRule)
    }

    /**
     * Whether the SecurityGroup has been configured to allow all outbound traffic.
     */
    override fun allowAllOutbound(): Boolean = unwrap(this).getAllowAllOutbound()

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
     * Whether the rule can be inlined into a SecurityGroup or not.
     */
    override fun canInlineRule(): Boolean = unwrap(this).getCanInlineRule()

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

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * ID for the current security group.
     */
    override fun securityGroupId(): String = unwrap(this).getSecurityGroupId()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * Produce the egress rule JSON for the given connection.
     */
    override fun toEgressRuleConfig(): Any = unwrap(this).toEgressRuleConfig()

    /**
     * Produce the ingress rule JSON for the given connection.
     */
    override fun toIngressRuleConfig(): Any = unwrap(this).toIngressRuleConfig()

    /**
     * A unique identifier for this connection peer.
     */
    override fun uniqueId(): String = unwrap(this).getUniqueId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ISecurityGroup): ISecurityGroup
        = CdkObjectWrappers.wrap(cdkObject) as? ISecurityGroup ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISecurityGroup): software.amazon.awscdk.services.ec2.ISecurityGroup
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ISecurityGroup
  }
}
