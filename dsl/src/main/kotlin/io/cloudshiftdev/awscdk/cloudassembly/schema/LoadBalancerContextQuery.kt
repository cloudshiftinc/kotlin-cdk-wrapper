package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface LoadBalancerContextQuery : LoadBalancerFilter {
  public fun account(): String

  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  public fun region(): String

  public interface Builder {
    public fun account(account: String)

    public fun loadBalancerArn(loadBalancerArn: String)

    public fun loadBalancerTags(loadBalancerTags: List<Tag>)

    public fun loadBalancerType(loadBalancerType: LoadBalancerType)

    public fun lookupRoleArn(lookupRoleArn: String)

    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.LoadBalancerContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.LoadBalancerContextQuery.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    override fun loadBalancerTags(loadBalancerTags: List<Tag>) {
      cdkBuilder.loadBalancerTags(loadBalancerTags.map(Tag::unwrap))
    }

    override fun loadBalancerType(loadBalancerType: LoadBalancerType) {
      cdkBuilder.loadBalancerType(loadBalancerType.let(LoadBalancerType::unwrap))
    }

    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.LoadBalancerContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadBalancerContextQuery,
  ) : LoadBalancerContextQuery {
    override fun account(): String = unwrap(this).getAccount()

    override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    override fun loadBalancerTags(): List<Tag> = unwrap(this).getLoadBalancerTags()?.map(Tag::wrap)
        ?: emptyList()

    override fun loadBalancerType(): LoadBalancerType =
        unwrap(this).getLoadBalancerType().let(LoadBalancerType::wrap)

    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadBalancerContextQuery):
        LoadBalancerContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerContextQuery):
        software.amazon.awscdk.cloudassembly.schema.LoadBalancerContextQuery = (wrapped as
        Wrapper).cdkObject
  }
}
