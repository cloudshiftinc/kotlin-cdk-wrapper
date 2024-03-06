@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.LayerVersionPermission

/**
 * Identification of an account (or organization) that is allowed to access a Lambda Layer Version.
 *
 * Example:
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
@CdkDslMarker
public class LayerVersionPermissionDsl {
    private val cdkBuilder: LayerVersionPermission.Builder = LayerVersionPermission.builder()

    /**
     * @param accountId The AWS Account id of the account that is authorized to use a Lambda Layer
     *   Version. The wild-card `'*'` can be used to grant access to "any" account (or any account
     *   in an organization when `organizationId` is specified).
     */
    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    /**
     * @param organizationId The ID of the AWS Organization to which the grant is restricted. Can
     *   only be specified if `accountId` is `'*'`
     */
    public fun organizationId(organizationId: String) {
        cdkBuilder.organizationId(organizationId)
    }

    public fun build(): LayerVersionPermission = cdkBuilder.build()
}
