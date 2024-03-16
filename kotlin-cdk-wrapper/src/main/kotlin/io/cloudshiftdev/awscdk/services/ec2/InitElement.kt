@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Base class for all CloudFormation Init elements.
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
public abstract class InitElement internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InitElement,
) : CdkObject(cdkObject) {
  /**
   * Returns the init element type for this element.
   */
  public open fun elementType(): String = unwrap(this).getElementType()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitElement): InitElement =
        CdkObjectWrappers.wrap(cdkObject) as InitElement

    internal fun unwrap(wrapped: InitElement): software.amazon.awscdk.services.ec2.InitElement =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.InitElement
  }
}
