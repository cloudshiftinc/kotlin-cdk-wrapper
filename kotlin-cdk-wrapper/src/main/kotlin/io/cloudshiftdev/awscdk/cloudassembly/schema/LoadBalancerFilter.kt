@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface LoadBalancerFilter : ContextLookupRoleOptions {
  public fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

  public fun loadBalancerTags(): List<Tag> = unwrap(this).getLoadBalancerTags()?.map(Tag::wrap) ?:
      emptyList()

  public fun loadBalancerType(): LoadBalancerType

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    public fun loadBalancerArn(loadBalancerArn: String)

    public fun loadBalancerTags(loadBalancerTags: List<Tag>)

    public fun loadBalancerTags(vararg loadBalancerTags: Tag)

    public fun loadBalancerType(loadBalancerType: LoadBalancerType)

    public fun lookupRoleArn(lookupRoleArn: String)

    public fun lookupRoleExternalId(lookupRoleExternalId: String)

    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter.Builder =
        software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    override fun loadBalancerTags(loadBalancerTags: List<Tag>) {
      cdkBuilder.loadBalancerTags(loadBalancerTags.map(Tag.Companion::unwrap))
    }

    override fun loadBalancerTags(vararg loadBalancerTags: Tag): Unit =
        loadBalancerTags(loadBalancerTags.toList())

    override fun loadBalancerType(loadBalancerType: LoadBalancerType) {
      cdkBuilder.loadBalancerType(loadBalancerType.let(LoadBalancerType.Companion::unwrap))
    }

    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    override fun lookupRoleExternalId(lookupRoleExternalId: String) {
      cdkBuilder.lookupRoleExternalId(lookupRoleExternalId)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter,
  ) : CdkObject(cdkObject),
      LoadBalancerFilter {
    override fun account(): String = unwrap(this).getAccount()

    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

    override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    override fun loadBalancerTags(): List<Tag> = unwrap(this).getLoadBalancerTags()?.map(Tag::wrap)
        ?: emptyList()

    override fun loadBalancerType(): LoadBalancerType =
        unwrap(this).getLoadBalancerType().let(LoadBalancerType::wrap)

    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    override fun lookupRoleExternalId(): String? = unwrap(this).getLookupRoleExternalId()

    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerFilter {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter):
        LoadBalancerFilter = CdkObjectWrappers.wrap(cdkObject) as? LoadBalancerFilter ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerFilter):
        software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter
  }
}
