@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String

/**
 * Lambda code from an inline string.
 *
 * Example:
 *
 * ```
 * LayerVersion layer = LayerVersion.Builder.create(stack, "MyLayer")
 * .code(Code.fromAsset(join(__dirname, "layer-code")))
 * .compatibleRuntimes(List.of(Runtime.NODEJS_LATEST))
 * .license("Apache-2.0")
 * .description("A layer to test the L2 construct")
 * .build();
 * // To grant usage by other AWS accounts
 * layer.addPermission("remote-account-grant",
 * LayerVersionPermission.builder().accountId(awsAccountId).build());
 * // To grant usage to all accounts in some AWS Ogranization
 * // layer.grantUsage({ accountId: '*', organizationId });
 * // To grant usage to all accounts in some AWS Ogranization
 * // layer.grantUsage({ accountId: '*', organizationId });
 * Function.Builder.create(stack, "MyLayeredLambda")
 * .code(new InlineCode("foo"))
 * .handler("index.handler")
 * .runtime(Runtime.NODEJS_LATEST)
 * .layers(List.of(layer))
 * .build();
 * ```
 */
public open class InlineCode internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.InlineCode,
) : Code(cdkObject) {
  public constructor(code: String) : this(software.amazon.awscdk.services.lambda.InlineCode(code))

  /**
   * Called when the lambda or layer is initialized to allow this object to bind to the stack, add
   * resources and have fun.
   *
   * @param _scope 
   */
  public override fun bind(_scope: Construct): CodeConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  /**
   * Determines whether this Code is inline code or not.
   */
  public open fun isInline(): Boolean = unwrap(this).getIsInline()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.InlineCode): InlineCode =
        InlineCode(cdkObject)

    internal fun unwrap(wrapped: InlineCode): software.amazon.awscdk.services.lambda.InlineCode =
        wrapped.cdkObject
  }
}
