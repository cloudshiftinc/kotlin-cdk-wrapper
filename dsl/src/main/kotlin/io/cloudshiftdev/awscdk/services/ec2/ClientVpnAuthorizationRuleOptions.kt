package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit

public interface ClientVpnAuthorizationRuleOptions {
  public fun cidr(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun groupId(): String? = unwrap(this).getGroupId()

  public interface Builder {
    public fun cidr(cidr: String)

    public fun description(description: String)

    public fun groupId(groupId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions.Builder =
        software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions.builder()

    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions,
  ) : ClientVpnAuthorizationRuleOptions {
    override fun cidr(): String = unwrap(this).getCidr()

    override fun description(): String? = unwrap(this).getDescription()

    override fun groupId(): String? = unwrap(this).getGroupId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ClientVpnAuthorizationRuleOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions):
        ClientVpnAuthorizationRuleOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClientVpnAuthorizationRuleOptions):
        software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions = (wrapped as
        Wrapper).cdkObject
  }
}
