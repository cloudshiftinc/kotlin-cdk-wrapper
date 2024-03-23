@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String

/**
 * Interface for classes that provide the peer-specification parts of a security group rule.
 */
public interface IPeer : IConnectable {
  /**
   * Whether the rule can be inlined into a SecurityGroup or not.
   */
  public fun canInlineRule(): Boolean

  /**
   * Produce the egress rule JSON for the given connection.
   */
  public fun toEgressRuleConfig(): Any

  /**
   * Produce the ingress rule JSON for the given connection.
   */
  public fun toIngressRuleConfig(): Any

  /**
   * A unique identifier for this connection peer.
   */
  public fun uniqueId(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.IPeer,
  ) : CdkObject(cdkObject), IPeer {
    /**
     * Whether the rule can be inlined into a SecurityGroup or not.
     */
    override fun canInlineRule(): Boolean = unwrap(this).getCanInlineRule()

    /**
     * The network connections associated with this resource.
     */
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

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
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IPeer): IPeer =
        CdkObjectWrappers.wrap(cdkObject) as? IPeer ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPeer): software.amazon.awscdk.services.ec2.IPeer = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IPeer
  }
}
