@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface AmiContextQuery : ContextLookupRoleOptions {
  public fun filters(): Map<String, List<String>>

  public fun owners(): List<String> = unwrap(this).getOwners() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    public fun filters(filters: Map<String, List<String>>)

    public fun lookupRoleArn(lookupRoleArn: String)

    public fun lookupRoleExternalId(lookupRoleExternalId: String)

    public fun owners(owners: List<String>)

    public fun owners(vararg owners: String)

    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.AmiContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.AmiContextQuery.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    override fun filters(filters: Map<String, List<String>>) {
      cdkBuilder.filters(filters)
    }

    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    override fun lookupRoleExternalId(lookupRoleExternalId: String) {
      cdkBuilder.lookupRoleExternalId(lookupRoleExternalId)
    }

    override fun owners(owners: List<String>) {
      cdkBuilder.owners(owners)
    }

    override fun owners(vararg owners: String): Unit = owners(owners.toList())

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AmiContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.AmiContextQuery,
  ) : CdkObject(cdkObject),
      AmiContextQuery {
    override fun account(): String = unwrap(this).getAccount()

    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

    override fun filters(): Map<String, List<String>> = unwrap(this).getFilters() ?: emptyMap()

    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    override fun lookupRoleExternalId(): String? = unwrap(this).getLookupRoleExternalId()

    override fun owners(): List<String> = unwrap(this).getOwners() ?: emptyList()

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
