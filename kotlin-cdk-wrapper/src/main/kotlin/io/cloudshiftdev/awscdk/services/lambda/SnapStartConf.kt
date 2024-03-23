@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Example:
 *
 * ```
 * Function fn = Function.Builder.create(this, "MyFunction")
 * .code(Code.fromAsset(join(__dirname, "handler.zip")))
 * .runtime(Runtime.JAVA_11)
 * .handler("example.Handler::handleRequest")
 * .snapStart(SnapStartConf.ON_PUBLISHED_VERSIONS)
 * .build();
 * Version version = fn.getCurrentVersion();
 * ```
 */
public abstract class SnapStartConf(
  cdkObject: software.amazon.awscdk.services.lambda.SnapStartConf,
) : CdkObject(cdkObject) {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.SnapStartConf,
  ) : SnapStartConf(cdkObject)

  public companion object {
    public val ON_PUBLISHED_VERSIONS: SnapStartConf =
        SnapStartConf.wrap(software.amazon.awscdk.services.lambda.SnapStartConf.ON_PUBLISHED_VERSIONS)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.SnapStartConf):
        SnapStartConf = CdkObjectWrappers.wrap(cdkObject) as? SnapStartConf ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SnapStartConf):
        software.amazon.awscdk.services.lambda.SnapStartConf = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.SnapStartConf
  }
}
