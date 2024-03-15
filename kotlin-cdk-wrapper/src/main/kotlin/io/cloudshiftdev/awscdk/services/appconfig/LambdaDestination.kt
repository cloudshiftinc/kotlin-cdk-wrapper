@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.String

/**
 * Use an AWS Lambda function as an event destination.
 *
 * Example:
 *
 * ```
 * Function fn;
 * Extension.Builder.create(this, "MyExtension")
 * .actions(List.of(
 * Action.Builder.create()
 * .actionPoints(List.of(ActionPoint.ON_DEPLOYMENT_START))
 * .eventDestination(new LambdaDestination(fn))
 * .build()))
 * .build();
 * ```
 */
public open class LambdaDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.LambdaDestination,
) : CdkObject(cdkObject), IEventDestination {
  public constructor(func: IFunction) :
      this(software.amazon.awscdk.services.appconfig.LambdaDestination(IFunction.unwrap(func)))

  /**
   * The URI of the extension event destination.
   */
  public override fun extensionUri(): String = unwrap(this).getExtensionUri()

  /**
   * The IAM policy document to invoke the event destination.
   */
  public override fun policyDocument(): PolicyDocument? =
      unwrap(this).getPolicyDocument()?.let(PolicyDocument::wrap)

  /**
   * The type of the extension event destination.
   */
  public override fun type(): SourceType = unwrap(this).getType().let(SourceType::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.LambdaDestination):
        LambdaDestination = LambdaDestination(cdkObject)

    internal fun unwrap(wrapped: LambdaDestination):
        software.amazon.awscdk.services.appconfig.LambdaDestination = wrapped.cdkObject
  }
}
