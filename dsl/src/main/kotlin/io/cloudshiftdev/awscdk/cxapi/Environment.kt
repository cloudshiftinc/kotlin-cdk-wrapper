package io.cloudshiftdev.awscdk.cxapi

import kotlin.String
import kotlin.Unit

public interface Environment {
  public fun account(): String

  public fun name(): String

  public fun region(): String

  public interface Builder {
    public fun account(account: String)

    public fun name(name: String)

    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.Environment.Builder =
        software.amazon.awscdk.cxapi.Environment.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cxapi.Environment = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cxapi.Environment,
  ) : Environment {
    override fun account(): String = unwrap(this).getAccount()

    override fun name(): String = unwrap(this).getName()

    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Environment {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.Environment): Environment =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Environment): software.amazon.awscdk.cxapi.Environment = (wrapped
        as Wrapper).cdkObject
  }
}
