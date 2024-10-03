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
 * Query to AMI context provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * Object assumeRoleAdditionalOptions;
 * AmiContextQuery amiContextQuery = AmiContextQuery.builder()
 * .account("account")
 * .filters(Map.of(
 * "filtersKey", List.of("filters")))
 * .region("region")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .lookupRoleArn("lookupRoleArn")
 * .lookupRoleExternalId("lookupRoleExternalId")
 * .owners(List.of("owners"))
 * .build();
 * ```
 */
public interface AmiContextQuery : ContextLookupRoleOptions {
  /**
   * Filters to DescribeImages call.
   */
  public fun filters(): Map<String, List<String>>

  /**
   * Owners to DescribeImages call.
   *
   * Default: - All owners
   */
  public fun owners(): List<String> = unwrap(this).getOwners() ?: emptyList()

  /**
   * A builder for [AmiContextQuery]
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
     * @param filters Filters to DescribeImages call. 
     */
    public fun filters(filters: Map<String, List<String>>)

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
     * @param owners Owners to DescribeImages call.
     */
    public fun owners(owners: List<String>)

    /**
     * @param owners Owners to DescribeImages call.
     */
    public fun owners(vararg owners: String)

    /**
     * @param region Query region. 
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.AmiContextQuery.Builder =
        software.amazon.awscdk.cloud_assembly_schema.AmiContextQuery.builder()

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
     * @param filters Filters to DescribeImages call. 
     */
    override fun filters(filters: Map<String, List<String>>) {
      cdkBuilder.filters(filters)
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
     * @param owners Owners to DescribeImages call.
     */
    override fun owners(owners: List<String>) {
      cdkBuilder.owners(owners)
    }

    /**
     * @param owners Owners to DescribeImages call.
     */
    override fun owners(vararg owners: String): Unit = owners(owners.toList())

    /**
     * @param region Query region. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.AmiContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.AmiContextQuery,
  ) : CdkObject(cdkObject),
      AmiContextQuery {
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
     * Filters to DescribeImages call.
     */
    override fun filters(): Map<String, List<String>> = unwrap(this).getFilters() ?: emptyMap()

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
     * Owners to DescribeImages call.
     *
     * Default: - All owners
     */
    override fun owners(): List<String> = unwrap(this).getOwners() ?: emptyList()

    /**
     * Query region.
     */
    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AmiContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.AmiContextQuery):
        AmiContextQuery = CdkObjectWrappers.wrap(cdkObject) as? AmiContextQuery ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AmiContextQuery):
        software.amazon.awscdk.cloud_assembly_schema.AmiContextQuery = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.AmiContextQuery
  }
}
