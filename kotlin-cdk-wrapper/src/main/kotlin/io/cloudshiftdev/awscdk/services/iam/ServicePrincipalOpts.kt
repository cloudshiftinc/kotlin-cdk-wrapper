@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ServicePrincipalOpts {
  public fun conditions(): Map<String, Any> = unwrap(this).getConditions() ?: emptyMap()

  public fun region(): String? = unwrap(this).getRegion()

  @CdkDslMarker
  public interface Builder {
    public fun conditions(conditions: Map<String, Any>)

    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.ServicePrincipalOpts.Builder =
        software.amazon.awscdk.services.iam.ServicePrincipalOpts.builder()

    override fun conditions(conditions: Map<String, Any>) {
      cdkBuilder.conditions(conditions)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.services.iam.ServicePrincipalOpts =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.ServicePrincipalOpts,
  ) : CdkObject(cdkObject), ServicePrincipalOpts {
    override fun conditions(): Map<String, Any> = unwrap(this).getConditions() ?: emptyMap()

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
