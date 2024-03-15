@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class UserData internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.UserData,
) : CdkObject(cdkObject) {
  public open fun addCommands(arg0: String) {
    unwrap(this).addCommands(arg0)
  }

  public open fun addExecuteFileCommand(arg0: ExecuteFileOptions) {
    unwrap(this).addExecuteFileCommand(arg0.let(ExecuteFileOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b557a6f4a2ca15b71d1150c77bb51fd8c3435694ec30126636099a14c197a4fd")
  public open fun addExecuteFileCommand(arg0: ExecuteFileOptions.Builder.() -> Unit): Unit =
      addExecuteFileCommand(ExecuteFileOptions(arg0))

  public open fun addOnExitCommands(arg0: String) {
    unwrap(this).addOnExitCommands(arg0)
  }

  public open fun addS3DownloadCommand(arg0: S3DownloadOptions): String =
      unwrap(this).addS3DownloadCommand(arg0.let(S3DownloadOptions::unwrap))

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ca5291b6617557daf5643d9f19e97f8894451b651dc29154159b383765d7c98b")
  public open fun addS3DownloadCommand(arg0: S3DownloadOptions.Builder.() -> Unit): String =
      addS3DownloadCommand(S3DownloadOptions(arg0))

  public open fun addSignalOnExitCommand(arg0: Resource) {
    unwrap(this).addSignalOnExitCommand(arg0.let(Resource::unwrap))
  }

  public open fun render(): String = unwrap(this).render()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.UserData,
  ) : UserData(cdkObject)

  public companion object {
    public fun custom(content: String): UserData =
        software.amazon.awscdk.services.ec2.UserData.custom(content).let(UserData::wrap)

    public fun forLinux(): UserData =
        software.amazon.awscdk.services.ec2.UserData.forLinux().let(UserData::wrap)

    public fun forLinux(options: LinuxUserDataOptions): UserData =
        software.amazon.awscdk.services.ec2.UserData.forLinux(options.let(LinuxUserDataOptions::unwrap)).let(UserData::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d0f6580db612bc851c54d2099ec88beae3a75a687c834d4720cd21d88b136b1b")
    public fun forLinux(options: LinuxUserDataOptions.Builder.() -> Unit): UserData =
        forLinux(LinuxUserDataOptions(options))

    public fun forOperatingSystem(os: OperatingSystemType): UserData =
        software.amazon.awscdk.services.ec2.UserData.forOperatingSystem(os.let(OperatingSystemType::unwrap)).let(UserData::wrap)

    public fun forWindows(): UserData =
        software.amazon.awscdk.services.ec2.UserData.forWindows().let(UserData::wrap)

    public fun forWindows(options: WindowsUserDataOptions): UserData =
        software.amazon.awscdk.services.ec2.UserData.forWindows(options.let(WindowsUserDataOptions::unwrap)).let(UserData::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fbba03fb3cbf7b7fbd6f4cfa74c1e39e79eeb185157e50feec0de02231b7da9c")
    public fun forWindows(options: WindowsUserDataOptions.Builder.() -> Unit): UserData =
        forWindows(WindowsUserDataOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.UserData): UserData =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserData): software.amazon.awscdk.services.ec2.UserData = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.UserData
  }
}
