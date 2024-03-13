package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit

public interface Environment {
  public fun account(): String? = unwrap(this).getAccount()

  public fun region(): String? = unwrap(this).getRegion()

  public interface Builder {
    public fun account(account: String) {
    }

    public fun region(region: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.Environment.Builder =
        software.amazon.awscdk.Environment.builder()

    public override fun account(account: String) {
      cdkBuilder.account(account)
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.Environment = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.Environment,
  ) : Environment {
    public override fun account(): String? = unwrap(this).getAccount()

    public override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Environment {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.Environment): Environment =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Environment): software.amazon.awscdk.Environment = (wrapped as
        Wrapper).cdkObject
  }
}
