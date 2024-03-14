package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit

public interface LinuxUserDataOptions {
  public fun shebang(): String? = unwrap(this).getShebang()

  public interface Builder {
    public fun shebang(shebang: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LinuxUserDataOptions.Builder =
        software.amazon.awscdk.services.ec2.LinuxUserDataOptions.builder()

    public override fun shebang(shebang: String) {
      cdkBuilder.shebang(shebang)
    }

    public fun build(): software.amazon.awscdk.services.ec2.LinuxUserDataOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.LinuxUserDataOptions,
  ) : LinuxUserDataOptions {
    public override fun shebang(): String? = unwrap(this).getShebang()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LinuxUserDataOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LinuxUserDataOptions):
        LinuxUserDataOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LinuxUserDataOptions):
        software.amazon.awscdk.services.ec2.LinuxUserDataOptions = (wrapped as Wrapper).cdkObject
  }
}
