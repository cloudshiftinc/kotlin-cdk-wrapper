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
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps

/**
 * Example:
 * ```
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.lambda.*;
 * Function myLambdaFunction;
 * Bucket destinationBucket;
 * //(Optional) if provided, the resulting processed file would be uploaded to the destinationBucket
 * under the destinationKey name.
 * String destinationKey;
 * Role role;
 * DeployTimeSubstitutedFile.Builder.create(this, "MyFile")
 * .source("my-file.yaml")
 * .destinationKey(destinationKey)
 * .destinationBucket(destinationBucket)
 * .substitutions(Map.of(
 * "variableName", myLambdaFunction.getFunctionName()))
 * .role(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class DeployTimeSubstitutedFilePropsDsl {
    private val cdkBuilder: DeployTimeSubstitutedFileProps.Builder =
        DeployTimeSubstitutedFileProps.builder()

    /** @param destinationBucket The S3 bucket to sync the contents of the zip file to. */
    public fun destinationBucket(destinationBucket: IBucket) {
        cdkBuilder.destinationBucket(destinationBucket)
    }

    /**
     * @param destinationKey The object key in the destination bucket where the processed file would
     *   be written to.
     */
    public fun destinationKey(destinationKey: String) {
        cdkBuilder.destinationKey(destinationKey)
    }

    /** @param role Execution role associated with this function. */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /** @param source Path to the user's local file. */
    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    /**
     * @param substitutions User-defined substitutions to make in the file. Placeholders in the
     *   user's local file must be specified with double curly brackets and spaces. For example, if
     *   you use the key 'xxxx' in the file, it must be written as: {{ xxxx }} to be recognized by
     *   the construct as a substitution.
     */
    public fun substitutions(substitutions: Map<String, String>) {
        cdkBuilder.substitutions(substitutions)
    }

    public fun build(): DeployTimeSubstitutedFileProps = cdkBuilder.build()
}
