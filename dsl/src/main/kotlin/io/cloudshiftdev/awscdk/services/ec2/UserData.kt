package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class UserData internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.UserData,
) {
  public open fun addCommands(arg0: String) {
    unwrap(this).addCommands(arg0)
  }

  public open fun addExecuteFileCommand(arg0: ExecuteFileOptions) {
    unwrap(this).addExecuteFileCommand(arg0.let(ExecuteFileOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b557a6f4a2ca15b71d1150c77bb51fd8c3435694ec30126636099a14c197a4fd")
  public open fun addExecuteFileCommand(arg0: ExecuteFileOptions.Builder.() -> Unit): Unit =
      addExecuteFileCommand(ExecuteFileOptions(arg0))

  public open fun addOnExitCommands(arg0: String) {
    unwrap(this).addOnExitCommands(arg0)
  }

  public open fun addS3DownloadCommand(arg0: S3DownloadOptions): String =
      unwrap(this).addS3DownloadCommand(arg0.let(S3DownloadOptions::unwrap))

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ca5291b6617557daf5643d9f19e97f8894451b651dc29154159b383765d7c98b")
  public open fun addS3DownloadCommand(arg0: S3DownloadOptions.Builder.() -> Unit): String =
      addS3DownloadCommand(S3DownloadOptions(arg0))

  public open fun addSignalOnExitCommand(arg0: Resource) {
    unwrap(this).addSignalOnExitCommand(arg0.let(Resource::unwrap))
  }

  public open fun render(): String = unwrap(this).render()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.UserData,
  ) : UserData(cdkObject)

  public companion object {
    public open fun custom(content: String): UserData =
        software.amazon.awscdk.services.ec2.UserData.custom(content).let(UserData::wrap)

    public open fun forLinux(): UserData =
        software.amazon.awscdk.services.ec2.UserData.forLinux().let(UserData::wrap)

    public open fun forLinux(options: LinuxUserDataOptions): UserData =
        software.amazon.awscdk.services.ec2.UserData.forLinux(options.let(LinuxUserDataOptions::unwrap)).let(UserData::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d0f6580db612bc851c54d2099ec88beae3a75a687c834d4720cd21d88b136b1b")
    public open fun forLinux(options: LinuxUserDataOptions.Builder.() -> Unit): UserData =
        forLinux(LinuxUserDataOptions(options))

    public open fun forOperatingSystem(os: OperatingSystemType): UserData =
        software.amazon.awscdk.services.ec2.UserData.forOperatingSystem(os.let(OperatingSystemType::unwrap)).let(UserData::wrap)

    public open fun forWindows(): UserData =
        software.amazon.awscdk.services.ec2.UserData.forWindows().let(UserData::wrap)

    public open fun forWindows(options: WindowsUserDataOptions): UserData =
        software.amazon.awscdk.services.ec2.UserData.forWindows(options.let(WindowsUserDataOptions::unwrap)).let(UserData::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fbba03fb3cbf7b7fbd6f4cfa74c1e39e79eeb185157e50feec0de02231b7da9c")
    public open fun forWindows(options: WindowsUserDataOptions.Builder.() -> Unit): UserData =
        forWindows(WindowsUserDataOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.UserData): UserData =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserData): software.amazon.awscdk.services.ec2.UserData = (wrapped
        as Wrapper).cdkObject
  }
}
