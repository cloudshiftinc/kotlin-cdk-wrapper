package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface WindowsUserDataOptions {
  /**
   * Set to true to set this userdata to persist through an instance reboot;
   *
   * allowing
   * it to run on every instance start.
   * By default, UserData is run only once during the first instance launch.
   *
   * For more information, see:
   * https://aws.amazon.com/premiumsupport/knowledge-center/execute-user-data-ec2/
   * https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-windows-user-data.html#user-data-scripts
   *
   * Default: false
   */
  public fun persist(): Boolean? = unwrap(this).getPersist()

  /**
   * A builder for [WindowsUserDataOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param persist Set to true to set this userdata to persist through an instance reboot;.
     * allowing
     * it to run on every instance start.
     * By default, UserData is run only once during the first instance launch.
     *
     * For more information, see:
     * https://aws.amazon.com/premiumsupport/knowledge-center/execute-user-data-ec2/
     * https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-windows-user-data.html#user-data-scripts
     */
    public fun persist(persist: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.WindowsUserDataOptions.Builder =
        software.amazon.awscdk.services.ec2.WindowsUserDataOptions.builder()

    /**
     * @param persist Set to true to set this userdata to persist through an instance reboot;.
     * allowing
     * it to run on every instance start.
     * By default, UserData is run only once during the first instance launch.
     *
     * For more information, see:
     * https://aws.amazon.com/premiumsupport/knowledge-center/execute-user-data-ec2/
     * https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-windows-user-data.html#user-data-scripts
     */
    override fun persist(persist: Boolean) {
      cdkBuilder.persist(persist)
    }

    public fun build(): software.amazon.awscdk.services.ec2.WindowsUserDataOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.WindowsUserDataOptions,
  ) : WindowsUserDataOptions {
    /**
     * Set to true to set this userdata to persist through an instance reboot;
     *
     * allowing
     * it to run on every instance start.
     * By default, UserData is run only once during the first instance launch.
     *
     * For more information, see:
     * https://aws.amazon.com/premiumsupport/knowledge-center/execute-user-data-ec2/
     * https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-windows-user-data.html#user-data-scripts
     *
     * Default: false
     */
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
