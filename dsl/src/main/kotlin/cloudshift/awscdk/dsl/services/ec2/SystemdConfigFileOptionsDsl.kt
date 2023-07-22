@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.SystemdConfigFileOptions

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
 * .machineImage(MachineImage.latestAmazonLinux2022())
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
@CdkDslMarker
public class SystemdConfigFileOptionsDsl {
  private val cdkBuilder: SystemdConfigFileOptions.Builder = SystemdConfigFileOptions.builder()

  /**
   * @param afterNetwork Start the service after the networking part of the OS comes up.
   */
  public fun afterNetwork(afterNetwork: Boolean) {
    cdkBuilder.afterNetwork(afterNetwork)
  }

  /**
   * @param command The command to run to start this service. 
   */
  public fun command(command: String) {
    cdkBuilder.command(command)
  }

  /**
   * @param cwd The working directory for the command.
   */
  public fun cwd(cwd: String) {
    cdkBuilder.cwd(cwd)
  }

  /**
   * @param description A description of this service.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param group The group to execute the process under.
   */
  public fun group(group: String) {
    cdkBuilder.group(group)
  }

  /**
   * @param keepRunning Keep the process running all the time.
   * Restarts the process when it exits for any reason other
   * than the machine shutting down.
   */
  public fun keepRunning(keepRunning: Boolean) {
    cdkBuilder.keepRunning(keepRunning)
  }

  /**
   * @param user The user to execute the process under.
   */
  public fun user(user: String) {
    cdkBuilder.user(user)
  }

  public fun build(): SystemdConfigFileOptions = cdkBuilder.build()
}
