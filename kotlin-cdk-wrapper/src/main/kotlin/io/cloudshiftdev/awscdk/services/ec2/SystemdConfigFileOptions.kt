@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Options for creating a SystemD configuration file.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * InstanceType instanceType;
 * Instance.Builder.create(this, "Instance")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(MachineImage.latestAmazonLinux2023())
 * .init(CloudFormationInit.fromElements(InitService.systemdConfigFile("simpleserver",
 * SystemdConfigFileOptions.builder()
 * .command("/usr/bin/python3 -m http.server 8080")
 * .cwd("/var/www/html")
 * .build()), InitService.enable("simpleserver", InitServiceOptions.builder()
 * .serviceManager(ServiceManager.SYSTEMD)
 * .build()), InitFile.fromString("/var/www/html/index.html", "Hello! It's working!")))
 * .build();
 * ```
 */
public interface SystemdConfigFileOptions {
  /**
   * Start the service after the networking part of the OS comes up.
   *
   * Default: true
   */
  public fun afterNetwork(): Boolean? = unwrap(this).getAfterNetwork()

  /**
   * The command to run to start this service.
   */
  public fun command(): String

  /**
   * The working directory for the command.
   *
   * Default: Root directory or home directory of specified user
   */
  public fun cwd(): String? = unwrap(this).getCwd()

  /**
   * A description of this service.
   *
   * Default: - No description
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The group to execute the process under.
   *
   * Default: root
   */
  public fun group(): String? = unwrap(this).getGroup()

  /**
   * Keep the process running all the time.
   *
   * Restarts the process when it exits for any reason other
   * than the machine shutting down.
   *
   * Default: true
   */
  public fun keepRunning(): Boolean? = unwrap(this).getKeepRunning()

  /**
   * The user to execute the process under.
   *
   * Default: root
   */
  public fun user(): String? = unwrap(this).getUser()

  /**
   * A builder for [SystemdConfigFileOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param afterNetwork Start the service after the networking part of the OS comes up.
     */
    public fun afterNetwork(afterNetwork: Boolean)

    /**
     * @param command The command to run to start this service. 
     */
    public fun command(command: String)

    /**
     * @param cwd The working directory for the command.
     */
    public fun cwd(cwd: String)

    /**
     * @param description A description of this service.
     */
    public fun description(description: String)

    /**
     * @param group The group to execute the process under.
     */
    public fun group(group: String)

    /**
     * @param keepRunning Keep the process running all the time.
     * Restarts the process when it exits for any reason other
     * than the machine shutting down.
     */
    public fun keepRunning(keepRunning: Boolean)

    /**
     * @param user The user to execute the process under.
     */
    public fun user(user: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SystemdConfigFileOptions.Builder =
        software.amazon.awscdk.services.ec2.SystemdConfigFileOptions.builder()

    /**
     * @param afterNetwork Start the service after the networking part of the OS comes up.
     */
    override fun afterNetwork(afterNetwork: Boolean) {
      cdkBuilder.afterNetwork(afterNetwork)
    }

    /**
     * @param command The command to run to start this service. 
     */
    override fun command(command: String) {
      cdkBuilder.command(command)
    }

    /**
     * @param cwd The working directory for the command.
     */
    override fun cwd(cwd: String) {
      cdkBuilder.cwd(cwd)
    }

    /**
     * @param description A description of this service.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param group The group to execute the process under.
     */
    override fun group(group: String) {
      cdkBuilder.group(group)
    }

    /**
     * @param keepRunning Keep the process running all the time.
     * Restarts the process when it exits for any reason other
     * than the machine shutting down.
     */
    override fun keepRunning(keepRunning: Boolean) {
      cdkBuilder.keepRunning(keepRunning)
    }

    /**
     * @param user The user to execute the process under.
     */
    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    public fun build(): software.amazon.awscdk.services.ec2.SystemdConfigFileOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.SystemdConfigFileOptions,
  ) : CdkObject(cdkObject), SystemdConfigFileOptions {
    /**
     * Start the service after the networking part of the OS comes up.
     *
     * Default: true
     */
    override fun afterNetwork(): Boolean? = unwrap(this).getAfterNetwork()

    /**
     * The command to run to start this service.
     */
    override fun command(): String = unwrap(this).getCommand()

    /**
     * The working directory for the command.
     *
     * Default: Root directory or home directory of specified user
     */
    override fun cwd(): String? = unwrap(this).getCwd()

    /**
     * A description of this service.
     *
     * Default: - No description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The group to execute the process under.
     *
     * Default: root
     */
    override fun group(): String? = unwrap(this).getGroup()

    /**
     * Keep the process running all the time.
     *
     * Restarts the process when it exits for any reason other
     * than the machine shutting down.
     *
     * Default: true
     */
    override fun keepRunning(): Boolean? = unwrap(this).getKeepRunning()

    /**
     * The user to execute the process under.
     *
     * Default: root
     */
    override fun user(): String? = unwrap(this).getUser()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SystemdConfigFileOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SystemdConfigFileOptions):
        SystemdConfigFileOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SystemdConfigFileOptions):
        software.amazon.awscdk.services.ec2.SystemdConfigFileOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.SystemdConfigFileOptions
  }
}
