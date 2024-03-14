package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Boolean
import kotlin.Unit

public interface WindowsUserDataOptions {
  public fun persist(): Boolean? = unwrap(this).getPersist()

  public interface Builder {
    public fun persist(persist: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.WindowsUserDataOptions.Builder =
        software.amazon.awscdk.services.ec2.WindowsUserDataOptions.builder()

    override fun persist(persist: Boolean) {
      cdkBuilder.persist(persist)
    }

    public fun build(): software.amazon.awscdk.services.ec2.WindowsUserDataOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.WindowsUserDataOptions,
  ) : WindowsUserDataOptions {
    override fun persist(): Boolean? = unwrap(this).getPersist()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): WindowsUserDataOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.WindowsUserDataOptions):
        WindowsUserDataOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WindowsUserDataOptions):
        software.amazon.awscdk.services.ec2.WindowsUserDataOptions = (wrapped as Wrapper).cdkObject
  }
}
