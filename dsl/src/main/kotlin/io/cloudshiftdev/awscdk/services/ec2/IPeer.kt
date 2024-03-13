package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Any
import kotlin.Boolean
import kotlin.String

public interface IPeer : IConnectable {
  public fun canInlineRule(): Boolean

  public fun toEgressRuleConfig(): Any

  public fun toIngressRuleConfig(): Any

  public fun uniqueId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IPeer,
  ) : IPeer {
    public override fun canInlineRule(): Boolean = unwrap(this).getCanInlineRule()

    public override fun connections(): Connections =
        unwrap(this).getConnections().let(Connections::wrap)

    public override fun toEgressRuleConfig(): Any = unwrap(this).toEgressRuleConfig()

    public override fun toIngressRuleConfig(): Any = unwrap(this).toIngressRuleConfig()

    public override fun uniqueId(): String = unwrap(this).getUniqueId()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IPeer): IPeer =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPeer): software.amazon.awscdk.services.ec2.IPeer = (wrapped as
        Wrapper).cdkObject
  }
}
