package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.String
import kotlin.Unit

public interface KeyContextQuery {
  public fun account(): String

  public fun aliasName(): String

  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  public fun region(): String

  public interface Builder {
    public fun account(account: String) {
    }

    public fun aliasName(aliasName: String) {
    }

    public fun lookupRoleArn(lookupRoleArn: String) {
    }

    public fun region(region: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.KeyContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.KeyContextQuery.builder()

    public override fun account(account: String) {
      cdkBuilder.account(account)
    }

    public override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    public override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.KeyContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.KeyContextQuery,
  ) : KeyContextQuery {
    public override fun account(): String = unwrap(this).getAccount()

    public override fun aliasName(): String = unwrap(this).getAliasName()

    public override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    public override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): KeyContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.KeyContextQuery):
        KeyContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyContextQuery):
        software.amazon.awscdk.cloudassembly.schema.KeyContextQuery = (wrapped as Wrapper).cdkObject
  }
}
