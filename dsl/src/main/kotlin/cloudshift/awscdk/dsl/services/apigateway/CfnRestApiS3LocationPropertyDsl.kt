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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnRestApi

/**
 * `S3Location` is a property of the
 * [AWS::ApiGateway::RestApi](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html)
 * resource that specifies the Amazon S3 location of a OpenAPI (formerly Swagger) file that defines
 * a set of RESTful APIs in JSON or YAML.
 *
 * On January 1, 2016, the Swagger Specification was donated to the
 * [OpenAPI initiative](https://docs.aws.amazon.com/https://www.openapis.org/) , becoming the
 * foundation of the OpenAPI Specification.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
 * .bucket("bucket")
 * .eTag("eTag")
 * .key("key")
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html)
 */
@CdkDslMarker
public class CfnRestApiS3LocationPropertyDsl {
    private val cdkBuilder: CfnRestApi.S3LocationProperty.Builder =
        CfnRestApi.S3LocationProperty.builder()

    /** @param bucket The name of the S3 bucket where the OpenAPI file is stored. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * @param eTag The Amazon S3 ETag (a file checksum) of the OpenAPI file. If you don't specify a
     *   value, API Gateway skips ETag validation of your OpenAPI file.
     */
    public fun eTag(eTag: String) {
        cdkBuilder.eTag(eTag)
    }

    /** @param key The file name of the OpenAPI file (Amazon S3 object name). */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param version For versioning-enabled buckets, a specific version of the OpenAPI file. */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnRestApi.S3LocationProperty = cdkBuilder.build()
}
