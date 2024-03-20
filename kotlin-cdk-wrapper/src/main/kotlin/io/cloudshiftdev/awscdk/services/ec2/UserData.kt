@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Instance User Data.
 *
 * Example:
 *
 * ```
 * MultipartUserData multipartUserData = new MultipartUserData();
 * UserData commandsUserData = UserData.forLinux();
 * multipartUserData.addUserDataPart(commandsUserData, MultipartBody.SHELL_SCRIPT, true);
 * // Adding commands to the multipartUserData adds them to commandsUserData, and vice-versa.
 * multipartUserData.addCommands("touch /root/multi.txt");
 * commandsUserData.addCommands("touch /root/userdata.txt");
 * ```
 */
public abstract class UserData internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.UserData,
) : CdkObject(cdkObject) {
  /**
   * Add one or more commands to the user data.
   *
   * @param commands 
   */
  public open fun addCommands(vararg commands: String) {
    unwrap(this).addCommands(*commands)
  }

  /**
   * Adds commands to execute a file.
   *
   * @param params 
   */
  public open fun addExecuteFileCommand(params: ExecuteFileOptions) {
    unwrap(this).addExecuteFileCommand(params.let(ExecuteFileOptions::unwrap))
  }

  /**
   * Adds commands to execute a file.
   *
   * @param params 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b557a6f4a2ca15b71d1150c77bb51fd8c3435694ec30126636099a14c197a4fd")
  public open fun addExecuteFileCommand(params: ExecuteFileOptions.Builder.() -> Unit): Unit =
      addExecuteFileCommand(ExecuteFileOptions(params))

  /**
   * Add one or more commands to the user data that will run when the script exits.
   *
   * @param commands 
   */
  public open fun addOnExitCommands(vararg commands: String) {
    unwrap(this).addOnExitCommands(*commands)
  }

  /**
   * Adds commands to download a file from S3.
   *
   * @return : The local path that the file will be downloaded to
   * @param params 
   */
  public open fun addS3DownloadCommand(params: S3DownloadOptions): String =
      unwrap(this).addS3DownloadCommand(params.let(S3DownloadOptions::unwrap))

  /**
   * Adds commands to download a file from S3.
   *
   * @return : The local path that the file will be downloaded to
   * @param params 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ca5291b6617557daf5643d9f19e97f8894451b651dc29154159b383765d7c98b")
  public open fun addS3DownloadCommand(params: S3DownloadOptions.Builder.() -> Unit): String =
      addS3DownloadCommand(S3DownloadOptions(params))

  /**
   * Adds a command which will send a cfn-signal when the user data script ends.
   *
   * @param resource 
   */
  public open fun addSignalOnExitCommand(resource: Resource) {
    unwrap(this).addSignalOnExitCommand(resource.let(Resource::unwrap))
  }

  /**
   * Render the UserData for use in a construct.
   */
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
        CdkObjectWrappers.wrap(cdkObject) as? UserData ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserData): software.amazon.awscdk.services.ec2.UserData = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.UserData
  }
}
