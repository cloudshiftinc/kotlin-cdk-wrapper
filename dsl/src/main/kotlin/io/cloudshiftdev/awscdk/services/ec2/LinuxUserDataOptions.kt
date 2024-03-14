package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface LinuxUserDataOptions {
  /**
   * Shebang for the UserData script.
   *
   * Default: "#!/bin/bash"
   */
  public fun shebang(): String? = unwrap(this).getShebang()

  /**
   * A builder for [LinuxUserDataOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param shebang Shebang for the UserData script.
     */
    public fun shebang(shebang: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LinuxUserDataOptions.Builder =
        software.amazon.awscdk.services.ec2.LinuxUserDataOptions.builder()

    /**
     * @param shebang Shebang for the UserData script.
     */
    override fun shebang(shebang: String) {
      cdkBuilder.shebang(shebang)
    }

    public fun build(): software.amazon.awscdk.services.ec2.LinuxUserDataOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.LinuxUserDataOptions,
  ) : LinuxUserDataOptions {
    /**
     * Shebang for the UserData script.
     *
     * Default: "#!/bin/bash"
     */
    override fun shebang(): String? = unwrap(this).getShebang()
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
