@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Query to endpoint service context provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * EndpointServiceAvailabilityZonesContextQuery endpointServiceAvailabilityZonesContextQuery =
 * EndpointServiceAvailabilityZonesContextQuery.builder()
 * .account("account")
 * .region("region")
 * .serviceName("serviceName")
 * // the properties below are optional
 * .lookupRoleArn("lookupRoleArn")
 * .build();
 * ```
 */
public interface EndpointServiceAvailabilityZonesContextQuery {
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
   * Query service name.
   */
  public fun serviceName(): String

  /**
   * A builder for [EndpointServiceAvailabilityZonesContextQuery]
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

    /**
     * @param serviceName Query service name. 
     */
    public fun serviceName(serviceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery.Builder
        =
        software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery.builder()

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

    /**
     * @param serviceName Query service name. 
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public fun build():
        software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery,
  ) : CdkObject(cdkObject), EndpointServiceAvailabilityZonesContextQuery {
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

    /**
     * Query service name.
     */
    override fun serviceName(): String = unwrap(this).getServiceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        EndpointServiceAvailabilityZonesContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery):
        EndpointServiceAvailabilityZonesContextQuery = CdkObjectWrappers.wrap(cdkObject) as?
        EndpointServiceAvailabilityZonesContextQuery ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EndpointServiceAvailabilityZonesContextQuery):
        software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery
  }
}
