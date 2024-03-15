@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.String

/**
 * Base class for creating a custom resource provider.
 */
public abstract class CustomResourceProviderBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CustomResourceProviderBase,
) : Construct(cdkObject) {
  /**
   * Add an IAM policy statement to the inline policy of the provider's lambda function's role.
   *
   * **Please note**: this is a direct IAM JSON policy blob, *not* a `iam.PolicyStatement`
   * object like you will see in the rest of the CDK.
   *
   * Example:
   *
   * ```
   * CustomResourceProvider myProvider;
   * myProvider.addToRolePolicy(Map.of(
   * "Effect", "Allow",
   * "Action", "s3:GetObject",
   * "Resource", "*"));
   * ```
   *
   * @param statement 
   */
  public open fun addToRolePolicy(statement: Any) {
    unwrap(this).addToRolePolicy(statement)
  }

  /**
   * The hash of the lambda code backing this provider.
   *
   * Can be used to trigger updates
   * on code changes, even when the properties of a custom resource remain unchanged.
   */
  public open fun codeHash(): String = unwrap(this).getCodeHash()

  /**
   * The ARN of the provider's AWS Lambda function role.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The ARN of the provider's AWS Lambda function which should be used as the `serviceToken` when
   * defining a custom resource.
   */
  public open fun serviceToken(): String = unwrap(this).getServiceToken()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CustomResourceProviderBase,
  ) : CustomResourceProviderBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.CustomResourceProviderBase):
        CustomResourceProviderBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomResourceProviderBase):
        software.amazon.awscdk.CustomResourceProviderBase = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CustomResourceProviderBase
  }
}
