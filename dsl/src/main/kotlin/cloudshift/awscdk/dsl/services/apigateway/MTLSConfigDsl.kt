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
import software.amazon.awscdk.services.apigateway.MTLSConfig
import software.amazon.awscdk.services.s3.IBucket

/**
 * The mTLS authentication configuration for a custom domain name.
 *
 * Example:
 * ```
 * Object acm;
 * DomainName.Builder.create(this, "domain-name")
 * .domainName("example.com")
 * .certificate(acm.Certificate.fromCertificateArn(this, "cert",
 * "arn:aws:acm:us-east-1:1111111:certificate/11-3336f1-44483d-adc7-9cd375c5169d"))
 * .mtls(MTLSConfig.builder()
 * .bucket(new Bucket(this, "bucket"))
 * .key("truststore.pem")
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
