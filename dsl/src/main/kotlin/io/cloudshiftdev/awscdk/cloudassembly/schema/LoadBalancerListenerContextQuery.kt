package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface LoadBalancerListenerContextQuery : LoadBalancerFilter {
  public fun account(): String

  public fun listenerArn(): String? = unwrap(this).getListenerArn()

  public fun listenerPort(): Number? = unwrap(this).getListenerPort()

  public fun listenerProtocol(): LoadBalancerListenerProtocol? =
      unwrap(this).getListenerProtocol()?.let(LoadBalancerListenerProtocol::wrap)

  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  public fun region(): String

  public interface Builder {
    public fun account(account: String) {
    }

    public fun listenerArn(listenerArn: String) {
    }

    public fun listenerPort(listenerPort: Number) {
    }

    public fun listenerProtocol(listenerProtocol: LoadBalancerListenerProtocol) {
    }

    public fun loadBalancerArn(loadBalancerArn: String) {
    }

    public fun loadBalancerTags(loadBalancerTags: List<Tag>) {
    }

    public fun loadBalancerType(loadBalancerType: LoadBalancerType) {
    }

    public fun lookupRoleArn(lookupRoleArn: String) {
    }

    public fun region(region: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery.builder()

    public override fun account(account: String) {
      cdkBuilder.account(account)
    }

    public override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    public override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    public override fun listenerProtocol(listenerProtocol: LoadBalancerListenerProtocol) {
      cdkBuilder.listenerProtocol(listenerProtocol.let(LoadBalancerListenerProtocol::unwrap))
    }

    public override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    public override fun loadBalancerTags(loadBalancerTags: List<Tag>) {
      cdkBuilder.loadBalancerTags(loadBalancerTags.map(Tag::unwrap))
    }

    public override fun loadBalancerType(loadBalancerType: LoadBalancerType) {
      cdkBuilder.loadBalancerType(loadBalancerType.let(LoadBalancerType::unwrap))
    }

    public override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery,
  ) : LoadBalancerListenerContextQuery {
    public override fun account(): String = unwrap(this).getAccount()

    public override fun listenerArn(): String? = unwrap(this).getListenerArn()

    public override fun listenerPort(): Number? = unwrap(this).getListenerPort()

    public override fun listenerProtocol(): LoadBalancerListenerProtocol? =
        unwrap(this).getListenerProtocol()?.let(LoadBalancerListenerProtocol::wrap)

    public override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    public override fun loadBalancerTags(): List<Tag> =
        unwrap(this).getLoadBalancerTags()?.map(Tag::wrap) ?: emptyList()

    public override fun loadBalancerType(): LoadBalancerType =
        unwrap(this).getLoadBalancerType().let(LoadBalancerType::wrap)

    public override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    public override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerListenerContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery):
        LoadBalancerListenerContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerListenerContextQuery):
        software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery = (wrapped as
        Wrapper).cdkObject
  }
}
