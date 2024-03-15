@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public open class ServicePrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.ServicePrincipal,
) : PrincipalBase(cdkObject) {
  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public open fun service(): String = unwrap(this).getService()

  @CdkDslMarker
  public interface Builder {
    public fun conditions(conditions: Map<String, Any>)

    public fun region(region: String)
  }

  private class BuilderImpl(
    service: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.ServicePrincipal.Builder =
        software.amazon.awscdk.services.iam.ServicePrincipal.Builder.create(service)

    override fun conditions(conditions: Map<String, Any>) {
      cdkBuilder.conditions(conditions)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.services.iam.ServicePrincipal = cdkBuilder.build()
  }

  public companion object {
    public fun servicePrincipalName(service: String): String =
        software.amazon.awscdk.services.iam.ServicePrincipal.servicePrincipalName(service)

    public operator fun invoke(service: String, block: Builder.() -> Unit = {}): ServicePrincipal {
      val builderImpl = BuilderImpl(service)
      return ServicePrincipal(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.ServicePrincipal):
        ServicePrincipal = ServicePrincipal(cdkObject)

    internal fun unwrap(wrapped: ServicePrincipal):
        software.amazon.awscdk.services.iam.ServicePrincipal = wrapped.cdkObject
  }
}
