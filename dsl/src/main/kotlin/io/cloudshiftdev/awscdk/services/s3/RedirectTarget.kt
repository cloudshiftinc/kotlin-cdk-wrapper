package io.cloudshiftdev.awscdk.services.s3

import kotlin.String
import kotlin.Unit

public interface RedirectTarget {
  public fun hostName(): String

  public fun protocol(): RedirectProtocol? = unwrap(this).getProtocol()?.let(RedirectProtocol::wrap)

  public interface Builder {
    public fun hostName(hostName: String) {
    }

    public fun protocol(protocol: RedirectProtocol) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.RedirectTarget.Builder =
        software.amazon.awscdk.services.s3.RedirectTarget.builder()

    public override fun hostName(hostName: String) {
      cdkBuilder.hostName(hostName)
    }

    public override fun protocol(protocol: RedirectProtocol) {
      cdkBuilder.protocol(protocol.let(RedirectProtocol::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.RedirectTarget = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.RedirectTarget,
  ) : RedirectTarget {
    public override fun hostName(): String = unwrap(this).getHostName()

    public override fun protocol(): RedirectProtocol? =
        unwrap(this).getProtocol()?.let(RedirectProtocol::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RedirectTarget {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.RedirectTarget): RedirectTarget
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RedirectTarget): software.amazon.awscdk.services.s3.RedirectTarget
        = (wrapped as Wrapper).cdkObject
  }
}
