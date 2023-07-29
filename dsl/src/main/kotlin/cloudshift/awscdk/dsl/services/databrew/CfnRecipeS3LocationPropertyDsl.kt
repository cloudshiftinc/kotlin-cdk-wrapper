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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnRecipe

/**
 * Represents an Amazon S3 location (bucket name, bucket owner, and object key) where DataBrew can
 * read input data, or write output from a job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .key("key")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-s3location.html)
 */
@CdkDslMarker
public class CfnRecipeS3LocationPropertyDsl {
    private val cdkBuilder: CfnRecipe.S3LocationProperty.Builder =
        CfnRecipe.S3LocationProperty.builder()

    /** @param bucket The Amazon S3 bucket name. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /** @param key The unique name of the object in the bucket. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun build(): CfnRecipe.S3LocationProperty = cdkBuilder.build()
}
