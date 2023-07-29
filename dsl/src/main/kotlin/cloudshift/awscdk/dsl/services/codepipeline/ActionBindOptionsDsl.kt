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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.ActionBindOptions
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.s3.IBucket

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.s3.*;
 * Bucket bucket;
 * Role role;
 * ActionBindOptions actionBindOptions = ActionBindOptions.builder()
 * .bucket(bucket)
 * .role(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class ActionBindOptionsDsl {
    private val cdkBuilder: ActionBindOptions.Builder = ActionBindOptions.builder()

    /** @param bucket the value to be set. */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /** @param role the value to be set. */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): ActionBindOptions = cdkBuilder.build()
}
