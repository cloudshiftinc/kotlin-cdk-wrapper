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

package io.cloudshiftdev.awscdkdsl.services.s3.deployment

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Deprecated
import software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata

/**
 * (deprecated) Custom user defined metadata.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.deployment.*;
 * UserDefinedObjectMetadata userDefinedObjectMetadata =
 * UserDefinedObjectMetadata.builder().build();
 * ```
 *
 * @deprecated Use raw property bags instead (object literals, `Map&lt;String,Object&gt;`, etc... )
 */
@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class UserDefinedObjectMetadataDsl {
    private val cdkBuilder: UserDefinedObjectMetadata.Builder = UserDefinedObjectMetadata.builder()

    public fun build(): UserDefinedObjectMetadata = cdkBuilder.build()
}
