package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit

public interface ResourceEnvironment {
  public fun account(): String

  public fun region(): String

  public interface Builder {
    public fun account(account: String)

    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.ResourceEnvironment.Builder =
        software.amazon.awscdk.ResourceEnvironment.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.ResourceEnvironment = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.ResourceEnvironment,
  ) : ResourceEnvironment {
    override fun account(): String = unwrap(this).getAccount()

    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceEnvironment {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ResourceEnvironment): ResourceEnvironment =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourceEnvironment): software.amazon.awscdk.ResourceEnvironment =
        (wrapped as Wrapper).cdkObject
  }
}
