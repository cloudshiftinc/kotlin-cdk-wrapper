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
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore
import software.constructs.Construct

/**
 * Creates a trust store.
 *
 * You must specify `CaCertificatesBundleS3Bucket` and `CaCertificatesBundleS3Key` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * CfnTrustStore cfnTrustStore = CfnTrustStore.Builder.create(this, "MyCfnTrustStore")
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
public class CfnTrustStoreDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTrustStore.Builder = CfnTrustStore.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The Amazon S3 bucket for the ca certificates bundle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-cacertificatesbundles3bucket)
     *
     * @param caCertificatesBundleS3Bucket The Amazon S3 bucket for the ca certificates bundle.
     */
    public fun caCertificatesBundleS3Bucket(caCertificatesBundleS3Bucket: String) {
        cdkBuilder.caCertificatesBundleS3Bucket(caCertificatesBundleS3Bucket)
    }

    /**
     * The Amazon S3 path for the ca certificates bundle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-cacertificatesbundles3key)
     *
     * @param caCertificatesBundleS3Key The Amazon S3 path for the ca certificates bundle.
     */
    public fun caCertificatesBundleS3Key(caCertificatesBundleS3Key: String) {
        cdkBuilder.caCertificatesBundleS3Key(caCertificatesBundleS3Key)
    }

    /**
     * The Amazon S3 object version for the ca certificates bundle.
     *
     * If undefined the current version is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-cacertificatesbundles3objectversion)
     *
     * @param caCertificatesBundleS3ObjectVersion The Amazon S3 object version for the ca
     *   certificates bundle.
     */
    public fun caCertificatesBundleS3ObjectVersion(caCertificatesBundleS3ObjectVersion: String) {
        cdkBuilder.caCertificatesBundleS3ObjectVersion(caCertificatesBundleS3ObjectVersion)
    }

    /**
     * The name of the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-name)
     *
     * @param name The name of the trust store.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The tags to assign to the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-tags)
     *
     * @param tags The tags to assign to the trust store.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to assign to the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-tags)
     *
     * @param tags The tags to assign to the trust store.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTrustStore {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
