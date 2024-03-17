@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Query to availability zone context provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * AvailabilityZonesContextQuery availabilityZonesContextQuery =
 * AvailabilityZonesContextQuery.builder()
 * .account("account")
 * .region("region")
 * // the properties below are optional
 * .lookupRoleArn("lookupRoleArn")
 * .build();
 * ```
 */
public interface AvailabilityZonesContextQuery {
  /**
   * Query account.
   */
  public fun account(): String

  /**
   * The ARN of the role that should be used to look up the missing values.
   *
   * Default: - None
   */
  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  /**
   * Query region.
   */
  public fun region(): String

  /**
   * A builder for [AvailabilityZonesContextQuery]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account Query account. 
     */
    public fun account(account: String)

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    public fun lookupRoleArn(lookupRoleArn: String)

    /**
     * @param region Query region. 
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery.builder()

    /**
     * @param account Query account. 
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    /**
     * @param region Query region. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery,
  ) : CdkObject(cdkObject), AvailabilityZonesContextQuery {
    /**
     * Query account.
     */
    override fun account(): String = unwrap(this).getAccount()

    /**
     * The ARN of the role that should be used to look up the missing values.
     *
     * Default: - None
     */
    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    /**
     * Query region.
     */
    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AvailabilityZonesContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery):
        AvailabilityZonesContextQuery = CdkObjectWrappers.wrap(cdkObject) as?
        AvailabilityZonesContextQuery ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AvailabilityZonesContextQuery):
        software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery
  }
}
