@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Identification of an account (or organization) that is allowed to access a Lambda Layer Version.
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
public interface LayerVersionPermission {
  /**
   * The AWS Account id of the account that is authorized to use a Lambda Layer Version.
   *
   * The wild-card `'*'` can be
   * used to grant access to "any" account (or any account in an organization when `organizationId`
   * is specified).
   */
  public fun accountId(): String

  /**
   * The ID of the AWS Organization to which the grant is restricted.
   *
   * Can only be specified if `accountId` is `'*'`
   */
  public fun organizationId(): String? = unwrap(this).getOrganizationId()

  /**
   * A builder for [LayerVersionPermission]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountId The AWS Account id of the account that is authorized to use a Lambda Layer
     * Version. 
     * The wild-card `'*'` can be
     * used to grant access to "any" account (or any account in an organization when
     * `organizationId` is specified).
     */
    public fun accountId(accountId: String)

    /**
     * @param organizationId The ID of the AWS Organization to which the grant is restricted.
     * Can only be specified if `accountId` is `'*'`
     */
    public fun organizationId(organizationId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.LayerVersionPermission.Builder =
        software.amazon.awscdk.services.lambda.LayerVersionPermission.builder()

    /**
     * @param accountId The AWS Account id of the account that is authorized to use a Lambda Layer
     * Version. 
     * The wild-card `'*'` can be
     * used to grant access to "any" account (or any account in an organization when
     * `organizationId` is specified).
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * @param organizationId The ID of the AWS Organization to which the grant is restricted.
     * Can only be specified if `accountId` is `'*'`
     */
    override fun organizationId(organizationId: String) {
      cdkBuilder.organizationId(organizationId)
    }

    public fun build(): software.amazon.awscdk.services.lambda.LayerVersionPermission =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.LayerVersionPermission,
  ) : CdkObject(cdkObject),
      LayerVersionPermission {
    /**
     * The AWS Account id of the account that is authorized to use a Lambda Layer Version.
     *
     * The wild-card `'*'` can be
     * used to grant access to "any" account (or any account in an organization when
     * `organizationId` is specified).
     */
    override fun accountId(): String = unwrap(this).getAccountId()

    /**
     * The ID of the AWS Organization to which the grant is restricted.
     *
     * Can only be specified if `accountId` is `'*'`
     */
    override fun organizationId(): String? = unwrap(this).getOrganizationId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LayerVersionPermission {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LayerVersionPermission):
        LayerVersionPermission = CdkObjectWrappers.wrap(cdkObject) as? LayerVersionPermission ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LayerVersionPermission):
        software.amazon.awscdk.services.lambda.LayerVersionPermission = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.LayerVersionPermission
  }
}
