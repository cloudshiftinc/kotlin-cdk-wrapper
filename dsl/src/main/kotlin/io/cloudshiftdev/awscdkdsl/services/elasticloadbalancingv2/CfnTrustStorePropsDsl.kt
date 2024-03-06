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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreProps

/**
 * Properties for defining a `CfnTrustStore`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * CfnTrustStoreProps cfnTrustStoreProps = CfnTrustStoreProps.builder()
 * .caCertificatesBundleS3Bucket("caCertificatesBundleS3Bucket")
 * .caCertificatesBundleS3Key("caCertificatesBundleS3Key")
 * .caCertificatesBundleS3ObjectVersion("caCertificatesBundleS3ObjectVersion")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html)
 */
@CdkDslMarker
public class CfnTrustStorePropsDsl {
    private val cdkBuilder: CfnTrustStoreProps.Builder = CfnTrustStoreProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param caCertificatesBundleS3Bucket The Amazon S3 bucket for the ca certificates bundle. */
    public fun caCertificatesBundleS3Bucket(caCertificatesBundleS3Bucket: String) {
        cdkBuilder.caCertificatesBundleS3Bucket(caCertificatesBundleS3Bucket)
    }

    /** @param caCertificatesBundleS3Key The Amazon S3 path for the ca certificates bundle. */
    public fun caCertificatesBundleS3Key(caCertificatesBundleS3Key: String) {
        cdkBuilder.caCertificatesBundleS3Key(caCertificatesBundleS3Key)
    }

    /**
     * @param caCertificatesBundleS3ObjectVersion The Amazon S3 object version for the ca
     *   certificates bundle. If undefined the current version is used.
     */
    public fun caCertificatesBundleS3ObjectVersion(caCertificatesBundleS3ObjectVersion: String) {
        cdkBuilder.caCertificatesBundleS3ObjectVersion(caCertificatesBundleS3ObjectVersion)
    }

    /** @param name The name of the trust store. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags The tags to assign to the trust store. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to assign to the trust store. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTrustStoreProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
