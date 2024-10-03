@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Filters for selecting load balancers.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * Object assumeRoleAdditionalOptions;
 * LoadBalancerFilter loadBalancerFilter = LoadBalancerFilter.builder()
 * .account("account")
 * .loadBalancerType(LoadBalancerType.NETWORK)
 * .region("region")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .loadBalancerArn("loadBalancerArn")
 * .loadBalancerTags(List.of(Tag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .lookupRoleArn("lookupRoleArn")
 * .lookupRoleExternalId("lookupRoleExternalId")
 * .build();
 * ```
 */
public interface LoadBalancerFilter : ContextLookupRoleOptions {
  /**
   * Find by load balancer's ARN.
   *
   * Default: - does not search by load balancer arn
   */
  public fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

  /**
   * Match load balancer tags.
   *
   * Default: - does not match load balancers by tags
   */
  public fun loadBalancerTags(): List<Tag> = unwrap(this).getLoadBalancerTags()?.map(Tag::wrap) ?:
      emptyList()

  /**
   * Filter load balancers by their type.
   */
  public fun loadBalancerType(): LoadBalancerType

  /**
   * A builder for [LoadBalancerFilter]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account Query account. 
     */
    public fun account(account: String)

    /**
     * @param assumeRoleAdditionalOptions Additional options to pass to STS when assuming the lookup
     * role.
     * * `RoleArn` should not be used. Use the dedicated `lookupRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `lookupRoleExternalId` instead.
     */
    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    /**
     * @param loadBalancerArn Find by load balancer's ARN.
     */
    public fun loadBalancerArn(loadBalancerArn: String)

    /**
     * @param loadBalancerTags Match load balancer tags.
     */
    public fun loadBalancerTags(loadBalancerTags: List<Tag>)

    /**
     * @param loadBalancerTags Match load balancer tags.
     */
    public fun loadBalancerTags(vararg loadBalancerTags: Tag)

    /**
     * @param loadBalancerType Filter load balancers by their type. 
     */
    public fun loadBalancerType(loadBalancerType: LoadBalancerType)

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    public fun lookupRoleArn(lookupRoleArn: String)

    /**
     * @param lookupRoleExternalId The ExternalId that needs to be supplied while assuming this
     * role.
     */
    public fun lookupRoleExternalId(lookupRoleExternalId: String)

    /**
     * @param region Query region. 
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.LoadBalancerFilter.Builder
        = software.amazon.awscdk.cloud_assembly_schema.LoadBalancerFilter.builder()

    /**
     * @param account Query account. 
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param assumeRoleAdditionalOptions Additional options to pass to STS when assuming the lookup
     * role.
     * * `RoleArn` should not be used. Use the dedicated `lookupRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `lookupRoleExternalId` instead.
     */
    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param loadBalancerArn Find by load balancer's ARN.
     */
    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    /**
     * @param loadBalancerTags Match load balancer tags.
     */
    override fun loadBalancerTags(loadBalancerTags: List<Tag>) {
      cdkBuilder.loadBalancerTags(loadBalancerTags.map(Tag.Companion::unwrap))
    }

    /**
     * @param loadBalancerTags Match load balancer tags.
     */
    override fun loadBalancerTags(vararg loadBalancerTags: Tag): Unit =
        loadBalancerTags(loadBalancerTags.toList())

    /**
     * @param loadBalancerType Filter load balancers by their type. 
     */
    override fun loadBalancerType(loadBalancerType: LoadBalancerType) {
      cdkBuilder.loadBalancerType(loadBalancerType.let(LoadBalancerType.Companion::unwrap))
    }

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    /**
     * @param lookupRoleExternalId The ExternalId that needs to be supplied while assuming this
     * role.
     */
    override fun lookupRoleExternalId(lookupRoleExternalId: String) {
      cdkBuilder.lookupRoleExternalId(lookupRoleExternalId)
    }

    /**
     * @param region Query region. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.LoadBalancerFilter =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.LoadBalancerFilter,
  ) : CdkObject(cdkObject),
      LoadBalancerFilter {
    /**
     * Query account.
     */
    override fun account(): String = unwrap(this).getAccount()

    /**
     * Additional options to pass to STS when assuming the lookup role.
     *
     * * `RoleArn` should not be used. Use the dedicated `lookupRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `lookupRoleExternalId` instead.
     *
     * Default: - No additional options.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/STS.html#assumeRole-property)
     */
    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

    /**
     * Find by load balancer's ARN.
     *
     * Default: - does not search by load balancer arn
     */
    override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    /**
     * Match load balancer tags.
     *
     * Default: - does not match load balancers by tags
     */
    override fun loadBalancerTags(): List<Tag> = unwrap(this).getLoadBalancerTags()?.map(Tag::wrap)
        ?: emptyList()

    /**
     * Filter load balancers by their type.
     */
    override fun loadBalancerType(): LoadBalancerType =
        unwrap(this).getLoadBalancerType().let(LoadBalancerType::wrap)

    /**
     * The ARN of the role that should be used to look up the missing values.
     *
     * Default: - None
     */
    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    /**
     * The ExternalId that needs to be supplied while assuming this role.
     *
     * Default: - No ExternalId will be supplied
     */
    override fun lookupRoleExternalId(): String? = unwrap(this).getLookupRoleExternalId()

    /**
     * Query region.
     */
    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerFilter {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.LoadBalancerFilter):
        LoadBalancerFilter = CdkObjectWrappers.wrap(cdkObject) as? LoadBalancerFilter ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerFilter):
        software.amazon.awscdk.cloud_assembly_schema.LoadBalancerFilter = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.LoadBalancerFilter
  }
}
