@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnTrustStore`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
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
public interface CfnTrustStoreProps {
  /**
   * The Amazon S3 bucket for the ca certificates bundle.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-cacertificatesbundles3bucket)
   */
  public fun caCertificatesBundleS3Bucket(): String? =
      unwrap(this).getCaCertificatesBundleS3Bucket()

  /**
   * The Amazon S3 path for the ca certificates bundle.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-cacertificatesbundles3key)
   */
  public fun caCertificatesBundleS3Key(): String? = unwrap(this).getCaCertificatesBundleS3Key()

  /**
   * The Amazon S3 object version for the ca certificates bundle.
   *
   * If undefined the current version is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-cacertificatesbundles3objectversion)
   */
  public fun caCertificatesBundleS3ObjectVersion(): String? =
      unwrap(this).getCaCertificatesBundleS3ObjectVersion()

  /**
   * The name of the trust store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The tags to assign to the trust store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnTrustStoreProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param caCertificatesBundleS3Bucket The Amazon S3 bucket for the ca certificates bundle.
     */
    public fun caCertificatesBundleS3Bucket(caCertificatesBundleS3Bucket: String)

    /**
     * @param caCertificatesBundleS3Key The Amazon S3 path for the ca certificates bundle.
     */
    public fun caCertificatesBundleS3Key(caCertificatesBundleS3Key: String)

    /**
     * @param caCertificatesBundleS3ObjectVersion The Amazon S3 object version for the ca
     * certificates bundle.
     * If undefined the current version is used.
     */
    public fun caCertificatesBundleS3ObjectVersion(caCertificatesBundleS3ObjectVersion: String)

    /**
     * @param name The name of the trust store.
     */
    public fun name(name: String)

    /**
     * @param tags The tags to assign to the trust store.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to assign to the trust store.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreProps.builder()

    /**
     * @param caCertificatesBundleS3Bucket The Amazon S3 bucket for the ca certificates bundle.
     */
    override fun caCertificatesBundleS3Bucket(caCertificatesBundleS3Bucket: String) {
      cdkBuilder.caCertificatesBundleS3Bucket(caCertificatesBundleS3Bucket)
    }

    /**
     * @param caCertificatesBundleS3Key The Amazon S3 path for the ca certificates bundle.
     */
    override fun caCertificatesBundleS3Key(caCertificatesBundleS3Key: String) {
      cdkBuilder.caCertificatesBundleS3Key(caCertificatesBundleS3Key)
    }

    /**
     * @param caCertificatesBundleS3ObjectVersion The Amazon S3 object version for the ca
     * certificates bundle.
     * If undefined the current version is used.
     */
    override fun caCertificatesBundleS3ObjectVersion(caCertificatesBundleS3ObjectVersion: String) {
      cdkBuilder.caCertificatesBundleS3ObjectVersion(caCertificatesBundleS3ObjectVersion)
    }

    /**
     * @param name The name of the trust store.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags to assign to the trust store.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to assign to the trust store.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreProps,
  ) : CdkObject(cdkObject), CfnTrustStoreProps {
    /**
     * The Amazon S3 bucket for the ca certificates bundle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-cacertificatesbundles3bucket)
     */
    override fun caCertificatesBundleS3Bucket(): String? =
        unwrap(this).getCaCertificatesBundleS3Bucket()

    /**
     * The Amazon S3 path for the ca certificates bundle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-cacertificatesbundles3key)
     */
    override fun caCertificatesBundleS3Key(): String? = unwrap(this).getCaCertificatesBundleS3Key()

    /**
     * The Amazon S3 object version for the ca certificates bundle.
     *
     * If undefined the current version is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-cacertificatesbundles3objectversion)
     */
    override fun caCertificatesBundleS3ObjectVersion(): String? =
        unwrap(this).getCaCertificatesBundleS3ObjectVersion()

    /**
     * The name of the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The tags to assign to the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrustStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreProps):
        CfnTrustStoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrustStoreProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreProps
  }
}
