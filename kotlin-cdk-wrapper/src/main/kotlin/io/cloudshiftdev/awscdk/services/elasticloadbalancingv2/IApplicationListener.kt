@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.Port
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties to reference an existing listener.
 */
public interface IApplicationListener : IListener, IConnectable {
  /**
   * Perform the given action on incoming requests.
   *
   * This allows full control of the default action of the load balancer,
   * including Action chaining, fixed responses and redirect responses. See
   * the `ListenerAction` class for all options.
   *
   * It's possible to add routing conditions to the Action added in this way.
   *
   * It is not possible to add a default action to an imported IApplicationListener.
   * In order to add actions to an imported IApplicationListener a `priority`
   * must be provided.
   *
   * @param id 
   * @param props 
   */
  public fun addAction(id: String, props: AddApplicationActionProps)

  /**
   * Perform the given action on incoming requests.
   *
   * This allows full control of the default action of the load balancer,
   * including Action chaining, fixed responses and redirect responses. See
   * the `ListenerAction` class for all options.
   *
   * It's possible to add routing conditions to the Action added in this way.
   *
   * It is not possible to add a default action to an imported IApplicationListener.
   * In order to add actions to an imported IApplicationListener a `priority`
   * must be provided.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38982a24904e19a27775083a0236be2eab0ffadce58e1eb48572062d8567e700")
  public fun addAction(id: String, props: AddApplicationActionProps.Builder.() -> Unit)

  /**
   * Add one or more certificates to this listener.
   *
   * @param id 
   * @param certificates 
   */
  public fun addCertificates(id: String, certificates: List<IListenerCertificate>)

  /**
   * Load balance incoming requests to the given target groups.
   *
   * It's possible to add conditions to the TargetGroups added in this way.
   * At least one TargetGroup must be added without conditions.
   *
   * @param id 
   * @param props 
   */
  public fun addTargetGroups(id: String, props: AddApplicationTargetGroupsProps)

  /**
   * Load balance incoming requests to the given target groups.
   *
   * It's possible to add conditions to the TargetGroups added in this way.
   * At least one TargetGroup must be added without conditions.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("23d206697af6cd2df80791ed22c62995c4f5c61f025a8e8fccb2df80290df232")
  public fun addTargetGroups(id: String, props: AddApplicationTargetGroupsProps.Builder.() -> Unit)

  /**
   * Load balance incoming requests to the given load balancing targets.
   *
   * This method implicitly creates an ApplicationTargetGroup for the targets
   * involved.
   *
   * It's possible to add conditions to the targets added in this way. At least
   * one set of targets must be added without conditions.
   *
   * @return The newly created target group
   * @param id 
   * @param props 
   */
  public fun addTargets(id: String, props: AddApplicationTargetsProps): ApplicationTargetGroup

  /**
   * Load balance incoming requests to the given load balancing targets.
   *
   * This method implicitly creates an ApplicationTargetGroup for the targets
   * involved.
   *
   * It's possible to add conditions to the targets added in this way. At least
   * one set of targets must be added without conditions.
   *
   * @return The newly created target group
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("65353b2aaa4d44b3413ee899b6257e24f21c3f8adbdf472376980f2c10a0a327")
  public fun addTargets(id: String, props: AddApplicationTargetsProps.Builder.() -> Unit):
      ApplicationTargetGroup

  /**
   * Register that a connectable that has been added to this load balancer.
   *
   * Don't call this directly. It is called by ApplicationTargetGroup.
   *
   * @param connectable 
   * @param portRange 
   */
  public fun registerConnectable(connectable: IConnectable, portRange: Port)

  /**
   * Register that a connectable that has been added to this load balancer.
   *
   * Don't call this directly. It is called by ApplicationTargetGroup.
   *
   * @param connectable 
   * @param portRange 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bcc196a279cd8df29b10150b2d6fcd0fb653d88666d4c7b6871b5f67e18a087a")
  public fun registerConnectable(connectable: IConnectable, portRange: Port.Builder.() -> Unit)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener,
  ) : CdkObject(cdkObject),
      IApplicationListener {
    /**
     * Perform the given action on incoming requests.
     *
     * This allows full control of the default action of the load balancer,
     * including Action chaining, fixed responses and redirect responses. See
     * the `ListenerAction` class for all options.
     *
     * It's possible to add routing conditions to the Action added in this way.
     *
     * It is not possible to add a default action to an imported IApplicationListener.
     * In order to add actions to an imported IApplicationListener a `priority`
     * must be provided.
     *
     * @param id 
     * @param props 
     */
    override fun addAction(id: String, props: AddApplicationActionProps) {
      unwrap(this).addAction(id, props.let(AddApplicationActionProps.Companion::unwrap))
    }

    /**
     * Perform the given action on incoming requests.
     *
     * This allows full control of the default action of the load balancer,
     * including Action chaining, fixed responses and redirect responses. See
     * the `ListenerAction` class for all options.
     *
     * It's possible to add routing conditions to the Action added in this way.
     *
     * It is not possible to add a default action to an imported IApplicationListener.
     * In order to add actions to an imported IApplicationListener a `priority`
     * must be provided.
     *
     * @param id 
     * @param props 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38982a24904e19a27775083a0236be2eab0ffadce58e1eb48572062d8567e700")
    override fun addAction(id: String, props: AddApplicationActionProps.Builder.() -> Unit): Unit =
        addAction(id, AddApplicationActionProps(props))

    /**
     * Add one or more certificates to this listener.
     *
     * @param id 
     * @param certificates 
     */
    override fun addCertificates(id: String, certificates: List<IListenerCertificate>) {
      unwrap(this).addCertificates(id, certificates.map(IListenerCertificate.Companion::unwrap))
    }

    /**
     * Load balance incoming requests to the given target groups.
     *
     * It's possible to add conditions to the TargetGroups added in this way.
     * At least one TargetGroup must be added without conditions.
     *
     * @param id 
     * @param props 
     */
    override fun addTargetGroups(id: String, props: AddApplicationTargetGroupsProps) {
      unwrap(this).addTargetGroups(id, props.let(AddApplicationTargetGroupsProps.Companion::unwrap))
    }

    /**
     * Load balance incoming requests to the given target groups.
     *
     * It's possible to add conditions to the TargetGroups added in this way.
     * At least one TargetGroup must be added without conditions.
     *
     * @param id 
     * @param props 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23d206697af6cd2df80791ed22c62995c4f5c61f025a8e8fccb2df80290df232")
    override fun addTargetGroups(id: String,
        props: AddApplicationTargetGroupsProps.Builder.() -> Unit): Unit = addTargetGroups(id,
        AddApplicationTargetGroupsProps(props))

    /**
     * Load balance incoming requests to the given load balancing targets.
     *
     * This method implicitly creates an ApplicationTargetGroup for the targets
     * involved.
     *
     * It's possible to add conditions to the targets added in this way. At least
     * one set of targets must be added without conditions.
     *
     * @return The newly created target group
     * @param id 
     * @param props 
     */
    override fun addTargets(id: String, props: AddApplicationTargetsProps): ApplicationTargetGroup =
        unwrap(this).addTargets(id,
        props.let(AddApplicationTargetsProps.Companion::unwrap)).let(ApplicationTargetGroup::wrap)

    /**
     * Load balance incoming requests to the given load balancing targets.
     *
     * This method implicitly creates an ApplicationTargetGroup for the targets
     * involved.
     *
     * It's possible to add conditions to the targets added in this way. At least
     * one set of targets must be added without conditions.
     *
     * @return The newly created target group
     * @param id 
     * @param props 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65353b2aaa4d44b3413ee899b6257e24f21c3f8adbdf472376980f2c10a0a327")
    override fun addTargets(id: String, props: AddApplicationTargetsProps.Builder.() -> Unit):
        ApplicationTargetGroup = addTargets(id, AddApplicationTargetsProps(props))

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
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
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
     * ARN of the listener.
     */
    override fun listenerArn(): String = unwrap(this).getListenerArn()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * Register that a connectable that has been added to this load balancer.
     *
     * Don't call this directly. It is called by ApplicationTargetGroup.
     *
     * @param connectable 
     * @param portRange 
     */
    override fun registerConnectable(connectable: IConnectable, portRange: Port) {
      unwrap(this).registerConnectable(connectable.let(IConnectable.Companion::unwrap),
          portRange.let(Port.Companion::unwrap))
    }

    /**
     * Register that a connectable that has been added to this load balancer.
     *
     * Don't call this directly. It is called by ApplicationTargetGroup.
     *
     * @param connectable 
     * @param portRange 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bcc196a279cd8df29b10150b2d6fcd0fb653d88666d4c7b6871b5f67e18a087a")
    override fun registerConnectable(connectable: IConnectable, portRange: Port.Builder.() -> Unit):
        Unit = registerConnectable(connectable, Port(portRange))

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener):
        IApplicationListener = CdkObjectWrappers.wrap(cdkObject) as? IApplicationListener ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApplicationListener):
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener
  }
}
