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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.MTLSConfig
import software.amazon.awscdk.services.s3.IBucket

/**
 * The mTLS authentication configuration for a custom domain name.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.s3.*;
 * import software.amazon.awscdk.services.certificatemanager.*;
 * Bucket bucket;
 * String certArn = "arn:aws:acm:us-east-1:111111111111:certificate";
 * String domainName = "example.com";
 * DomainName.Builder.create(this, "DomainName")
 * .domainName(domainName)
 * .certificate(Certificate.fromCertificateArn(this, "cert", certArn))
 * .mtls(MTLSConfig.builder()
 * .bucket(bucket)
 * .key("someca.pem")
 * .version("version")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class MTLSConfigDsl {
    private val cdkBuilder: MTLSConfig.Builder = MTLSConfig.builder()

    /** @param bucket The bucket that the trust store is hosted in. */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /** @param key The key in S3 to look at for the trust store. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param version The version of the S3 object that contains your truststore. To specify a
     *   version, you must have versioning enabled for the S3 bucket.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): MTLSConfig = cdkBuilder.build()
}
