@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * A class used to configure Logging during AwsCustomResource SDK calls.
 *
 * Example:
 *
 * ```
 * AwsCustomResource getParameter = AwsCustomResource.Builder.create(this, "GetParameter")
 * .onUpdate(AwsSdkCall.builder()
 * .service("SSM")
 * .action("GetParameter")
 * .parameters(Map.of(
 * "Name", "my-parameter",
 * "WithDecryption", true))
 * .physicalResourceId(PhysicalResourceId.of(Date.now().toString()))
 * .logging(Logging.withDataHidden())
 * .build())
 * .policy(AwsCustomResourcePolicy.fromSdkCalls(SdkCallsPolicyOptions.builder()
 * .resources(AwsCustomResourcePolicy.ANY_RESOURCE)
 * .build()))
 * .build();
 * ```
 */
public abstract class Logging(
  cdkObject: software.amazon.awscdk.customresources.Logging,
) : CdkObject(cdkObject) {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.customresources.Logging,
  ) : Logging(cdkObject)

  public companion object {
    public fun all(): Logging =
        software.amazon.awscdk.customresources.Logging.all().let(Logging::wrap)

    public fun withDataHidden(): Logging =
        software.amazon.awscdk.customresources.Logging.withDataHidden().let(Logging::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.Logging): Logging =
        CdkObjectWrappers.wrap(cdkObject) as? Logging ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Logging): software.amazon.awscdk.customresources.Logging = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.customresources.Logging
  }
}
