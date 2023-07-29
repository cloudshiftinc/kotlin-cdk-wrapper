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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig

/**
 * Result of binding `Template` into a `Product`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * import software.amazon.awscdk.services.servicecatalog.*;
 * Bucket bucket;
 * CloudFormationTemplateConfig cloudFormationTemplateConfig =
 * CloudFormationTemplateConfig.builder()
 * .httpUrl("httpUrl")
 * // the properties below are optional
 * .assetBucket(bucket)
 * .build();
 * ```
 */
@CdkDslMarker
public class CloudFormationTemplateConfigDsl {
    private val cdkBuilder: CloudFormationTemplateConfig.Builder =
        CloudFormationTemplateConfig.builder()

    /** @param assetBucket The S3 bucket containing product stack assets. */
    public fun assetBucket(assetBucket: IBucket) {
        cdkBuilder.assetBucket(assetBucket)
    }

    /** @param httpUrl The http url of the template in S3. */
    public fun httpUrl(httpUrl: String) {
        cdkBuilder.httpUrl(httpUrl)
    }

    public fun build(): CloudFormationTemplateConfig = cdkBuilder.build()
}
