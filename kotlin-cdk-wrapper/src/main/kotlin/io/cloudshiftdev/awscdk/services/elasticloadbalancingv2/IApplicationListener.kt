@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.Port
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

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener):
        IApplicationListener = CdkObjectWrappers.wrap(cdkObject) as IApplicationListener

    internal fun unwrap(wrapped: IApplicationListener):
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener
  }
}
