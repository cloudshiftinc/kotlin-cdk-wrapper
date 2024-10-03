@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface AvailabilityZonesContextQuery : ContextLookupRoleOptions {
  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    public fun lookupRoleArn(lookupRoleArn: String)

    public fun lookupRoleExternalId(lookupRoleExternalId: String)

    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
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

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery,
  ) : CdkObject(cdkObject),
      AvailabilityZonesContextQuery {
    override fun account(): String = unwrap(this).getAccount()

    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    override fun lookupRoleExternalId(): String? = unwrap(this).getLookupRoleExternalId()

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
