@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.lambdalayer.awscli

import io.cloudshiftdev.awscdk.services.lambda.LayerVersion
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * An AWS Lambda layer that includes the AWS CLI.
 *
 * Example:
 *
 * ```
 * // AwsCliLayer bundles the AWS CLI in a lambda layer
 * import io.cloudshiftdev.awscdk.lambdalayer.awscli.AwsCliLayer;
 * Function fn;
 * fn.addLayers(new AwsCliLayer(this, "AwsCliLayer"));
 * ```
 */
public open class AwsCliLayer(
  cdkObject: software.amazon.awscdk.lambdalayer.awscli.AwsCliLayer,
) : LayerVersion(cdkObject) {
  public constructor(scope: Construct, id: String) :
      this(software.amazon.awscdk.lambdalayer.awscli.AwsCliLayer(scope.let(Construct::unwrap), id)
  )

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.lambdalayer.awscli.AwsCliLayer): AwsCliLayer
        = AwsCliLayer(cdkObject)

    internal fun unwrap(wrapped: AwsCliLayer): software.amazon.awscdk.lambdalayer.awscli.AwsCliLayer
        = wrapped.cdkObject as software.amazon.awscdk.lambdalayer.awscli.AwsCliLayer
  }
}
