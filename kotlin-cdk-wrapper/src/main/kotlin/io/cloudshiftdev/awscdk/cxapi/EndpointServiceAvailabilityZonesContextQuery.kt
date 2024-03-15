@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Query to hosted zone context provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * EndpointServiceAvailabilityZonesContextQuery endpointServiceAvailabilityZonesContextQuery =
 * EndpointServiceAvailabilityZonesContextQuery.builder()
 * .account("account")
 * .region("region")
 * .serviceName("serviceName")
 * .build();
 * ```
 */
public interface EndpointServiceAvailabilityZonesContextQuery {
  /**
   * Query account.
   */
  public fun account(): String? = unwrap(this).getAccount()

  /**
   * Query region.
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * Query service name.
   */
  public fun serviceName(): String? = unwrap(this).getServiceName()

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
        software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery.Builder =
        software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery.builder()

    /**
     * @param account Query account.
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
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

    public fun build(): software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery,
  ) : CdkObject(cdkObject), EndpointServiceAvailabilityZonesContextQuery {
    /**
     * Query account.
     */
    override fun account(): String? = unwrap(this).getAccount()

    /**
     * Query region.
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * Query service name.
     */
    override fun serviceName(): String? = unwrap(this).getServiceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        EndpointServiceAvailabilityZonesContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery):
        EndpointServiceAvailabilityZonesContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EndpointServiceAvailabilityZonesContextQuery):
        software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery
  }
}
