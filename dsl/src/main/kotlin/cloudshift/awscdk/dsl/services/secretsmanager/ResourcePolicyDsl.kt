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

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.ResourcePolicy
import software.constructs.Construct

/**
 * Resource Policy for SecretsManager Secrets.
 *
 * Policies define the operations that are allowed on this resource.
 *
 * You almost never need to define this construct directly.
 *
 * All AWS resources that support resource policies have a method called `addToResourcePolicy()`,
 * which will automatically create a new resource policy if one doesn't exist yet, otherwise it will
 * add to the existing policy.
 *
 * Prefer to use `addToResourcePolicy()` instead.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.secretsmanager.*;
 * Secret secret;
 * ResourcePolicy resourcePolicy = ResourcePolicy.Builder.create(this, "MyResourcePolicy")
 * .secret(secret)
 * .build();
 * ```
 */
@CdkDslMarker
public class ResourcePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ResourcePolicy.Builder = ResourcePolicy.Builder.create(scope, id)

    /**
     * The secret to attach a resource-based permissions policy.
     *
     * @param secret The secret to attach a resource-based permissions policy.
     */
    public fun secret(secret: ISecret) {
        cdkBuilder.secret(secret)
    }

    public fun build(): ResourcePolicy = cdkBuilder.build()
}
