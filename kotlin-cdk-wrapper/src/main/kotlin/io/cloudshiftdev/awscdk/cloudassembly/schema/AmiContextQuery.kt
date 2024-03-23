@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * AmiContextQuery amiContextQuery = AmiContextQuery.builder()
 * .account("account")
 * .filters(Map.of(
 * "filtersKey", List.of("filters")))
 * .region("region")
 * // the properties below are optional
 * .lookupRoleArn("lookupRoleArn")
 * .owners(List.of("owners"))
 * .build();
 * ```
 */
public interface AmiContextQuery {
  /**
   * Account to query.
   */
  public fun account(): String

  /**
   * Filters to DescribeImages call.
   */
  public fun filters(): Map<String, List<String>>

  /**
   * The ARN of the role that should be used to look up the missing values.
   *
   * Default: - None
   */
  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  /**
   * Owners to DescribeImages call.
   *
   * Default: - All owners
   */
  public fun owners(): List<String> = unwrap(this).getOwners() ?: emptyList()

  /**
   * Region to query.
   */
  public fun region(): String

  /**
   * A builder for [AmiContextQuery]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account Account to query. 
     */
    public fun account(account: String)

    /**
     * @param filters Filters to DescribeImages call. 
     */
    public fun filters(filters: Map<String, List<String>>)

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    public fun lookupRoleArn(lookupRoleArn: String)

    /**
     * @param owners Owners to DescribeImages call.
     */
    public fun owners(owners: List<String>)

    /**
     * @param owners Owners to DescribeImages call.
     */
    public fun owners(vararg owners: String)

    /**
     * @param region Region to query. 
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.AmiContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.AmiContextQuery.builder()

    /**
     * @param account Account to query. 
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
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
     * @param region Region to query. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AmiContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.AmiContextQuery,
  ) : CdkObject(cdkObject), AmiContextQuery {
    /**
     * Account to query.
     */
    override fun account(): String = unwrap(this).getAccount()

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
     * Owners to DescribeImages call.
     *
     * Default: - All owners
     */
    override fun owners(): List<String> = unwrap(this).getOwners() ?: emptyList()

    /**
     * Region to query.
     */
    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AmiContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AmiContextQuery):
        AmiContextQuery = CdkObjectWrappers.wrap(cdkObject) as? AmiContextQuery ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AmiContextQuery):
        software.amazon.awscdk.cloudassembly.schema.AmiContextQuery = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.AmiContextQuery
  }
}
