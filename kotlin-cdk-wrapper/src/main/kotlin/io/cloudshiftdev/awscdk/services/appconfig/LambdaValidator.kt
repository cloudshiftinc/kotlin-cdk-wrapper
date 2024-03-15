@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.Function
import kotlin.String

/**
 * Defines an AWS Lambda validator.
 *
 * Example:
 *
 * ```
 * Application application;
 * Function fn;
 * HostedConfiguration.Builder.create(this, "MyHostedConfiguration")
 * .application(application)
 * .content(ConfigurationContent.fromInlineText("This is my configuration content."))
 * .validators(List.of(JsonSchemaValidator.fromFile("schema.json"),
 * LambdaValidator.fromFunction(fn)))
 * .build();
 * ```
 */
public abstract class LambdaValidator internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.LambdaValidator,
) : CdkObject(cdkObject), IValidator {
  /**
   * The content of the validator.
   */
  public override fun content(): String = unwrap(this).getContent()

  /**
   * The type of validator.
   */
  public override fun type(): ValidatorType = unwrap(this).getType().let(ValidatorType::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.LambdaValidator,
  ) : LambdaValidator(cdkObject)

  public companion object {
    public fun fromFunction(func: Function): LambdaValidator =
        software.amazon.awscdk.services.appconfig.LambdaValidator.fromFunction(func.let(Function::unwrap)).let(LambdaValidator::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.LambdaValidator):
        LambdaValidator = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaValidator):
        software.amazon.awscdk.services.appconfig.LambdaValidator = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appconfig.LambdaValidator
  }
}
