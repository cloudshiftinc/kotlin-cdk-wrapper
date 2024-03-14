package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ServicePrincipalOpts {
  /**
   * Additional conditions to add to the Service Principal.
   *
   * Default: - No conditions
   */
  public fun conditions(): Map<String, Any> = unwrap(this).getConditions() ?: emptyMap()

  /**
   * The region in which you want to reference the service.
   *
   * This is only necessary for *cross-region* references to *opt-in* regions. In those
   * cases, the region name needs to be included to reference the correct service principal.
   * In all other cases, the global service principal name is sufficient.
   *
   * This field behaves differently depending on whether the
   * `&#64;aws-cdk/aws-iam:standardizedServicePrincipals`
   * flag is set or not:
   *
   * * If the flag is set, the input service principal is assumed to be of the form
   * `SERVICE.amazonaws.com`.
   * That value will always be returned, unless the given region is an opt-in region and the service
   * principal is rendered in a stack in a different region, in which case
   * `SERVICE.REGION.amazonaws.com`
   * will be rendered. Under this regime, there is no downside to always specifying the region
   * property:
   * it will be rendered only if necessary.
   * * If the flag is not set, the service principal will resolve to a single principal
   * whose name comes from the `&#64;aws-cdk/region-info` package, using the region to override
   * the stack region. If there is no entry for this service principal in the database,, the input
   * service name is returned literally. This is legacy behavior and is not recommended.
   *
   * Default: - the resolving Stack's region.
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * A builder for [ServicePrincipalOpts]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param conditions Additional conditions to add to the Service Principal.
     */
    public fun conditions(conditions: Map<String, Any>)

    /**
     * @param region The region in which you want to reference the service.
     * This is only necessary for *cross-region* references to *opt-in* regions. In those
     * cases, the region name needs to be included to reference the correct service principal.
     * In all other cases, the global service principal name is sufficient.
     *
     * This field behaves differently depending on whether the
     * `&#64;aws-cdk/aws-iam:standardizedServicePrincipals`
     * flag is set or not:
     *
     * * If the flag is set, the input service principal is assumed to be of the form
     * `SERVICE.amazonaws.com`.
     * That value will always be returned, unless the given region is an opt-in region and the
     * service
     * principal is rendered in a stack in a different region, in which case
     * `SERVICE.REGION.amazonaws.com`
     * will be rendered. Under this regime, there is no downside to always specifying the region
     * property:
     * it will be rendered only if necessary.
     * * If the flag is not set, the service principal will resolve to a single principal
     * whose name comes from the `&#64;aws-cdk/region-info` package, using the region to override
     * the stack region. If there is no entry for this service principal in the database,, the input
     * service name is returned literally. This is legacy behavior and is not recommended.
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.ServicePrincipalOpts.Builder =
        software.amazon.awscdk.services.iam.ServicePrincipalOpts.builder()

    /**
     * @param conditions Additional conditions to add to the Service Principal.
     */
    override fun conditions(conditions: Map<String, Any>) {
      cdkBuilder.conditions(conditions)
    }

    /**
     * @param region The region in which you want to reference the service.
     * This is only necessary for *cross-region* references to *opt-in* regions. In those
     * cases, the region name needs to be included to reference the correct service principal.
     * In all other cases, the global service principal name is sufficient.
     *
     * This field behaves differently depending on whether the
     * `&#64;aws-cdk/aws-iam:standardizedServicePrincipals`
     * flag is set or not:
     *
     * * If the flag is set, the input service principal is assumed to be of the form
     * `SERVICE.amazonaws.com`.
     * That value will always be returned, unless the given region is an opt-in region and the
     * service
     * principal is rendered in a stack in a different region, in which case
     * `SERVICE.REGION.amazonaws.com`
     * will be rendered. Under this regime, there is no downside to always specifying the region
     * property:
     * it will be rendered only if necessary.
     * * If the flag is not set, the service principal will resolve to a single principal
     * whose name comes from the `&#64;aws-cdk/region-info` package, using the region to override
     * the stack region. If there is no entry for this service principal in the database,, the input
     * service name is returned literally. This is legacy behavior and is not recommended.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.services.iam.ServicePrincipalOpts =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.ServicePrincipalOpts,
  ) : CdkObject(cdkObject), ServicePrincipalOpts {
    /**
     * Additional conditions to add to the Service Principal.
     *
     * Default: - No conditions
     */
    override fun conditions(): Map<String, Any> = unwrap(this).getConditions() ?: emptyMap()

    /**
     * The region in which you want to reference the service.
     *
     * This is only necessary for *cross-region* references to *opt-in* regions. In those
     * cases, the region name needs to be included to reference the correct service principal.
     * In all other cases, the global service principal name is sufficient.
     *
     * This field behaves differently depending on whether the
     * `&#64;aws-cdk/aws-iam:standardizedServicePrincipals`
     * flag is set or not:
     *
     * * If the flag is set, the input service principal is assumed to be of the form
     * `SERVICE.amazonaws.com`.
     * That value will always be returned, unless the given region is an opt-in region and the
     * service
     * principal is rendered in a stack in a different region, in which case
     * `SERVICE.REGION.amazonaws.com`
     * will be rendered. Under this regime, there is no downside to always specifying the region
     * property:
     * it will be rendered only if necessary.
     * * If the flag is not set, the service principal will resolve to a single principal
     * whose name comes from the `&#64;aws-cdk/region-info` package, using the region to override
     * the stack region. If there is no entry for this service principal in the database,, the input
     * service name is returned literally. This is legacy behavior and is not recommended.
     *
     * Default: - the resolving Stack's region.
     */
    override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServicePrincipalOpts {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.ServicePrincipalOpts):
        ServicePrincipalOpts = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServicePrincipalOpts):
        software.amazon.awscdk.services.iam.ServicePrincipalOpts = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.ServicePrincipalOpts
  }
}
