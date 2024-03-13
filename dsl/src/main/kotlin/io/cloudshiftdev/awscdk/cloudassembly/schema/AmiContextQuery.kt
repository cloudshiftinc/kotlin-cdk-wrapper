package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface AmiContextQuery {
  public fun account(): String

  public fun filters(): Map<String, List<String>>

  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  public fun owners(): List<String> = unwrap(this).getOwners() ?: emptyList()

  public fun region(): String

  public interface Builder {
    public fun account(account: String) {
    }

    public fun filters(filters: Map<String, List<String>>) {
    }

    public fun lookupRoleArn(lookupRoleArn: String) {
    }

    public fun owners(owners: List<String>) {
    }

    public fun region(region: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.AmiContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.AmiContextQuery.builder()

    public override fun account(account: String) {
      cdkBuilder.account(account)
    }

    public override fun filters(filters: Map<String, List<String>>) {
      cdkBuilder.filters(filters)
    }

    public override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    public override fun owners(owners: List<String>) {
      cdkBuilder.owners(owners)
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AmiContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.AmiContextQuery,
  ) : AmiContextQuery {
    public override fun account(): String = unwrap(this).getAccount()

    public override fun filters(): Map<String, List<String>> = unwrap(this).getFilters() ?:
        emptyMap()

    public override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    public override fun owners(): List<String> = unwrap(this).getOwners() ?: emptyList()

    public override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AmiContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AmiContextQuery):
        AmiContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AmiContextQuery):
        software.amazon.awscdk.cloudassembly.schema.AmiContextQuery = (wrapped as Wrapper).cdkObject
  }
}
