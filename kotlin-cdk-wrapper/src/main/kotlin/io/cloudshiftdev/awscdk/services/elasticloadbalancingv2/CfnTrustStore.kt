@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a trust store.
 *
 * You must specify `CaCertificatesBundleS3Bucket` and `CaCertificatesBundleS3Key` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
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
public open class CfnTrustStore internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTrustStoreProps,
  ) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTrustStoreProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTrustStoreProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTrustStoreProps(props)
  )

  /**
   * The number of ca certificates in the trust store.
   */
  public open fun attrNumberOfCaCertificates(): Number =
      unwrap(this).getAttrNumberOfCaCertificates()

  /**
   * The current status of the trust store.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Amazon Resource Name (ARN) of the trust store.
   */
  public open fun attrTrustStoreArn(): String = unwrap(this).getAttrTrustStoreArn()

  /**
   * The Amazon S3 bucket for the ca certificates bundle.
   */
  public open fun caCertificatesBundleS3Bucket(): String? =
      unwrap(this).getCaCertificatesBundleS3Bucket()

  /**
   * The Amazon S3 bucket for the ca certificates bundle.
   */
  public open fun caCertificatesBundleS3Bucket(`value`: String) {
    unwrap(this).setCaCertificatesBundleS3Bucket(`value`)
  }

  /**
   * The Amazon S3 path for the ca certificates bundle.
   */
  public open fun caCertificatesBundleS3Key(): String? = unwrap(this).getCaCertificatesBundleS3Key()

  /**
   * The Amazon S3 path for the ca certificates bundle.
   */
  public open fun caCertificatesBundleS3Key(`value`: String) {
    unwrap(this).setCaCertificatesBundleS3Key(`value`)
  }

  /**
   * The Amazon S3 object version for the ca certificates bundle.
   */
  public open fun caCertificatesBundleS3ObjectVersion(): String? =
      unwrap(this).getCaCertificatesBundleS3ObjectVersion()

  /**
   * The Amazon S3 object version for the ca certificates bundle.
   */
  public open fun caCertificatesBundleS3ObjectVersion(`value`: String) {
    unwrap(this).setCaCertificatesBundleS3ObjectVersion(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the trust store.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the trust store.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The tags to assign to the trust store.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags to assign to the trust store.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to assign to the trust store.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.CfnTrustStore].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon S3 bucket for the ca certificates bundle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-cacertificatesbundles3bucket)
     * @param caCertificatesBundleS3Bucket The Amazon S3 bucket for the ca certificates bundle. 
     */
    public fun caCertificatesBundleS3Bucket(caCertificatesBundleS3Bucket: String)

    /**
     * The Amazon S3 path for the ca certificates bundle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-cacertificatesbundles3key)
     * @param caCertificatesBundleS3Key The Amazon S3 path for the ca certificates bundle. 
     */
    public fun caCertificatesBundleS3Key(caCertificatesBundleS3Key: String)

    /**
     * The Amazon S3 object version for the ca certificates bundle.
     *
     * If undefined the current version is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-cacertificatesbundles3objectversion)
     * @param caCertificatesBundleS3ObjectVersion The Amazon S3 object version for the ca
     * certificates bundle. 
     */
    public fun caCertificatesBundleS3ObjectVersion(caCertificatesBundleS3ObjectVersion: String)

    /**
     * The name of the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-name)
     * @param name The name of the trust store. 
     */
    public fun name(name: String)

    /**
     * The tags to assign to the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-tags)
     * @param tags The tags to assign to the trust store. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to assign to the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-tags)
     * @param tags The tags to assign to the trust store. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore.Builder.create(scope,
        id)

    /**
     * The Amazon S3 bucket for the ca certificates bundle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-cacertificatesbundles3bucket)
     * @param caCertificatesBundleS3Bucket The Amazon S3 bucket for the ca certificates bundle. 
     */
    override fun caCertificatesBundleS3Bucket(caCertificatesBundleS3Bucket: String) {
      cdkBuilder.caCertificatesBundleS3Bucket(caCertificatesBundleS3Bucket)
    }

    /**
     * The Amazon S3 path for the ca certificates bundle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-cacertificatesbundles3key)
     * @param caCertificatesBundleS3Key The Amazon S3 path for the ca certificates bundle. 
     */
    override fun caCertificatesBundleS3Key(caCertificatesBundleS3Key: String) {
      cdkBuilder.caCertificatesBundleS3Key(caCertificatesBundleS3Key)
    }

    /**
     * The Amazon S3 object version for the ca certificates bundle.
     *
     * If undefined the current version is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-cacertificatesbundles3objectversion)
     * @param caCertificatesBundleS3ObjectVersion The Amazon S3 object version for the ca
     * certificates bundle. 
     */
    override fun caCertificatesBundleS3ObjectVersion(caCertificatesBundleS3ObjectVersion: String) {
      cdkBuilder.caCertificatesBundleS3ObjectVersion(caCertificatesBundleS3ObjectVersion)
    }

    /**
     * The name of the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-name)
     * @param name The name of the trust store. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags to assign to the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-tags)
     * @param tags The tags to assign to the trust store. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to assign to the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststore.html#cfn-elasticloadbalancingv2-truststore-tags)
     * @param tags The tags to assign to the trust store. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrustStore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrustStore(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore):
        CfnTrustStore = CfnTrustStore(cdkObject)

    internal fun unwrap(wrapped: CfnTrustStore):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStore = wrapped.cdkObject
  }
}
