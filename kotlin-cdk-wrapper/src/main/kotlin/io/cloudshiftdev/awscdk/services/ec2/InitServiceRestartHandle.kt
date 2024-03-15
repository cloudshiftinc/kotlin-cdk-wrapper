@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject

/**
 * An object that represents reasons to restart an InitService.
 *
 * Pass an instance of this object to the `InitFile`, `InitCommand`,
 * `InitSource` and `InitPackage` objects, and finally to an `InitService`
 * itself to cause the actions (files, commands, sources, and packages)
 * to trigger a restart of the service.
 *
 * For example, the following will run a custom command to install Nginx,
 * and trigger the nginx service to be restarted after the command has run.
 *
 * ```
 * InitServiceRestartHandle handle = new InitServiceRestartHandle();
 * CloudFormationInit.fromElements(InitCommand.shellCommand("/usr/bin/custom-nginx-install.sh",
 * InitCommandOptions.builder().serviceRestartHandles(List.of(handle)).build()),
 * InitService.enable("nginx", InitServiceOptions.builder().serviceRestartHandle(handle).build()));
 * ```
 *
 * Example:
 *
 * ```
 * Bucket myBucket;
 * InitServiceRestartHandle handle = new InitServiceRestartHandle();
 * CloudFormationInit.fromElements(InitFile.fromString("/etc/nginx/nginx.conf", "...",
 * InitFileOptions.builder().serviceRestartHandles(List.of(handle)).build()),
 * InitSource.fromS3Object("/var/www/html", myBucket, "html.zip",
 * InitSourceOptions.builder().serviceRestartHandles(List.of(handle)).build()),
 * InitService.enable("nginx", InitServiceOptions.builder()
 * .serviceRestartHandle(handle)
 * .build()));
 * ```
 */
public open class InitServiceRestartHandle internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InitServiceRestartHandle,
) : CdkObject(cdkObject) {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitServiceRestartHandle):
        InitServiceRestartHandle = InitServiceRestartHandle(cdkObject)

    internal fun unwrap(wrapped: InitServiceRestartHandle):
        software.amazon.awscdk.services.ec2.InitServiceRestartHandle = wrapped.cdkObject
  }
}
