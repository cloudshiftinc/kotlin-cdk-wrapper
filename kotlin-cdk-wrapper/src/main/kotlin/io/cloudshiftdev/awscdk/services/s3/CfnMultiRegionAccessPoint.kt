@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::S3::MultiRegionAccessPoint` resource creates an Amazon S3 Multi-Region Access Point.
 *
 * To learn more about Multi-Region Access Points, see [Multi-Region Access Points in Amazon
 * S3](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPoints.html) in the in
 * the *Amazon S3 User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * CfnMultiRegionAccessPoint cfnMultiRegionAccessPoint =
 * CfnMultiRegionAccessPoint.Builder.create(this, "MyCfnMultiRegionAccessPoint")
 * .regions(List.of(RegionProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketAccountId("bucketAccountId")
 * .build()))
 * // the properties below are optional
 * .name("name")
 * .publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty.builder()
 * .blockPublicAcls(false)
 * .blockPublicPolicy(false)
 * .ignorePublicAcls(false)
 * .restrictPublicBuckets(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html)
 */
public open class CfnMultiRegionAccessPoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The alias for the Multi-Region Access Point.
   *
   * For more information about the distinction between the name and the alias of an Multi-Region
   * Access Point, see [Managing Multi-Region Access
   * Points](https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html#multi-region-access-point-naming)
   * in the *Amazon S3 User Guide* .
   */
  public open fun attrAlias(): String = unwrap(this).getAttrAlias()

  /**
   * The timestamp of when the Multi-Region Access Point is created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the Multi-Region Access Point.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the Multi-Region Access Point.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The PublicAccessBlock configuration that you want to apply to this Multi-Region Access Point.
   */
  public open fun publicAccessBlockConfiguration(): Any? =
      unwrap(this).getPublicAccessBlockConfiguration()

  /**
   * The PublicAccessBlock configuration that you want to apply to this Multi-Region Access Point.
   */
  public open fun publicAccessBlockConfiguration(`value`: IResolvable) {
    unwrap(this).setPublicAccessBlockConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The PublicAccessBlock configuration that you want to apply to this Multi-Region Access Point.
   */
  public open fun publicAccessBlockConfiguration(`value`: PublicAccessBlockConfigurationProperty) {
    unwrap(this).setPublicAccessBlockConfiguration(`value`.let(PublicAccessBlockConfigurationProperty::unwrap))
  }

  /**
   * The PublicAccessBlock configuration that you want to apply to this Multi-Region Access Point.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c390c16087080e9d6b36faced5b46f09f3f88fc6960bb7e21b02fac4f8becfda")
  public open
      fun publicAccessBlockConfiguration(`value`: PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
      Unit = publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty(`value`))

  /**
   * A collection of the Regions and buckets associated with the Multi-Region Access Point.
   */
  public open fun regions(): Any = unwrap(this).getRegions()

  /**
   * A collection of the Regions and buckets associated with the Multi-Region Access Point.
   */
  public open fun regions(`value`: IResolvable) {
    unwrap(this).setRegions(`value`.let(IResolvable::unwrap))
  }

  /**
   * A collection of the Regions and buckets associated with the Multi-Region Access Point.
   */
  public open fun regions(__idx_ac66f0: List<Any>) {
    unwrap(this).setRegions(__idx_ac66f0)
  }

  /**
   * A collection of the Regions and buckets associated with the Multi-Region Access Point.
   */
  public open fun regions(vararg __idx_ac66f0: Any): Unit = regions(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3.CfnMultiRegionAccessPoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-name)
     * @param name The name of the Multi-Region Access Point. 
     */
    public fun name(name: String)

    /**
     * The PublicAccessBlock configuration that you want to apply to this Multi-Region Access Point.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers an object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Multi-Region Access Point. 
     */
    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable)

    /**
     * The PublicAccessBlock configuration that you want to apply to this Multi-Region Access Point.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers an object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Multi-Region Access Point. 
     */
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty)

    /**
     * The PublicAccessBlock configuration that you want to apply to this Multi-Region Access Point.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers an object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Multi-Region Access Point. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20f6a7f47a3bc4cd686a60978549578e0dd3252392a493f7262eb0a74e430e1c")
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty.Builder.() -> Unit)

    /**
     * A collection of the Regions and buckets associated with the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-regions)
     * @param regions A collection of the Regions and buckets associated with the Multi-Region
     * Access Point. 
     */
    public fun regions(regions: IResolvable)

    /**
     * A collection of the Regions and buckets associated with the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-regions)
     * @param regions A collection of the Regions and buckets associated with the Multi-Region
     * Access Point. 
     */
    public fun regions(regions: List<Any>)

    /**
     * A collection of the Regions and buckets associated with the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-regions)
     * @param regions A collection of the Regions and buckets associated with the Multi-Region
     * Access Point. 
     */
    public fun regions(vararg regions: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.Builder =
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.Builder.create(scope, id)

    /**
     * The name of the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-name)
     * @param name The name of the Multi-Region Access Point. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The PublicAccessBlock configuration that you want to apply to this Multi-Region Access Point.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers an object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Multi-Region Access Point. 
     */
    override fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The PublicAccessBlock configuration that you want to apply to this Multi-Region Access Point.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers an object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Multi-Region Access Point. 
     */
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(PublicAccessBlockConfigurationProperty::unwrap))
    }

    /**
     * The PublicAccessBlock configuration that you want to apply to this Multi-Region Access Point.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers an object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Multi-Region Access Point. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20f6a7f47a3bc4cd686a60978549578e0dd3252392a493f7262eb0a74e430e1c")
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
        Unit =
        publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty(publicAccessBlockConfiguration))

    /**
     * A collection of the Regions and buckets associated with the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-regions)
     * @param regions A collection of the Regions and buckets associated with the Multi-Region
     * Access Point. 
     */
    override fun regions(regions: IResolvable) {
      cdkBuilder.regions(regions.let(IResolvable::unwrap))
    }

    /**
     * A collection of the Regions and buckets associated with the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-regions)
     * @param regions A collection of the Regions and buckets associated with the Multi-Region
     * Access Point. 
     */
    override fun regions(regions: List<Any>) {
      cdkBuilder.regions(regions)
    }

    /**
     * A collection of the Regions and buckets associated with the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-regions)
     * @param regions A collection of the Regions and buckets associated with the Multi-Region
     * Access Point. 
     */
    override fun regions(vararg regions: Any): Unit = regions(regions.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMultiRegionAccessPoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMultiRegionAccessPoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint):
        CfnMultiRegionAccessPoint = CfnMultiRegionAccessPoint(cdkObject)

    internal fun unwrap(wrapped: CfnMultiRegionAccessPoint):
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint = wrapped.cdkObject
  }

  /**
   * The PublicAccessBlock configuration that you want to apply to this Amazon S3 Multi-Region
   * Access Point.
   *
   * You can enable the configuration options in any combination. For more information about when
   * Amazon S3 considers an object public, see [The Meaning of
   * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
   * in the *Amazon S3 User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3.*;
   * PublicAccessBlockConfigurationProperty publicAccessBlockConfigurationProperty =
   * PublicAccessBlockConfigurationProperty.builder()
   * .blockPublicAcls(false)
   * .blockPublicPolicy(false)
   * .ignorePublicAcls(false)
   * .restrictPublicBuckets(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspoint-publicaccessblockconfiguration.html)
   */
  public interface PublicAccessBlockConfigurationProperty {
    /**
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket
     * and objects in this bucket.
     *
     * Setting this element to `TRUE` causes the following behavior:
     *
     * * PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
     * * PUT Object calls fail if the request includes a public ACL.
     * * PUT Bucket calls fail if the request includes a public ACL.
     *
     * Enabling this setting doesn't affect existing policies or ACLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspoint-publicaccessblockconfiguration.html#cfn-s3-multiregionaccesspoint-publicaccessblockconfiguration-blockpublicacls)
     */
    public fun blockPublicAcls(): Any? = unwrap(this).getBlockPublicAcls()

    /**
     * Specifies whether Amazon S3 should block public bucket policies for this bucket.
     *
     * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
     * specified bucket policy allows public access.
     *
     * Enabling this setting doesn't affect existing bucket policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspoint-publicaccessblockconfiguration.html#cfn-s3-multiregionaccesspoint-publicaccessblockconfiguration-blockpublicpolicy)
     */
    public fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

    /**
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this
     * bucket.
     *
     * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on this bucket and
     * objects in this bucket.
     *
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent
     * new public ACLs from being set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspoint-publicaccessblockconfiguration.html#cfn-s3-multiregionaccesspoint-publicaccessblockconfiguration-ignorepublicacls)
     */
    public fun ignorePublicAcls(): Any? = unwrap(this).getIgnorePublicAcls()

    /**
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket.
     *
     * Setting this element to `TRUE` restricts access to this bucket to only AWS service principals
     * and authorized users within this account if the bucket has a public policy.
     *
     * Enabling this setting doesn't affect previously stored bucket policies, except that public
     * and cross-account access within any public bucket policy, including non-public delegation to
     * specific accounts, is blocked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspoint-publicaccessblockconfiguration.html#cfn-s3-multiregionaccesspoint-publicaccessblockconfiguration-restrictpublicbuckets)
     */
    public fun restrictPublicBuckets(): Any? = unwrap(this).getRestrictPublicBuckets()

    /**
     * A builder for [PublicAccessBlockConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blockPublicAcls Specifies whether Amazon S3 should block public access control lists
       * (ACLs) for this bucket and objects in this bucket.
       * Setting this element to `TRUE` causes the following behavior:
       *
       * * PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
       * * PUT Object calls fail if the request includes a public ACL.
       * * PUT Bucket calls fail if the request includes a public ACL.
       *
       * Enabling this setting doesn't affect existing policies or ACLs.
       */
      public fun blockPublicAcls(blockPublicAcls: Boolean)

      /**
       * @param blockPublicAcls Specifies whether Amazon S3 should block public access control lists
       * (ACLs) for this bucket and objects in this bucket.
       * Setting this element to `TRUE` causes the following behavior:
       *
       * * PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
       * * PUT Object calls fail if the request includes a public ACL.
       * * PUT Bucket calls fail if the request includes a public ACL.
       *
       * Enabling this setting doesn't affect existing policies or ACLs.
       */
      public fun blockPublicAcls(blockPublicAcls: IResolvable)

      /**
       * @param blockPublicPolicy Specifies whether Amazon S3 should block public bucket policies
       * for this bucket.
       * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
       * specified bucket policy allows public access.
       *
       * Enabling this setting doesn't affect existing bucket policies.
       */
      public fun blockPublicPolicy(blockPublicPolicy: Boolean)

      /**
       * @param blockPublicPolicy Specifies whether Amazon S3 should block public bucket policies
       * for this bucket.
       * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
       * specified bucket policy allows public access.
       *
       * Enabling this setting doesn't affect existing bucket policies.
       */
      public fun blockPublicPolicy(blockPublicPolicy: IResolvable)

      /**
       * @param ignorePublicAcls Specifies whether Amazon S3 should ignore public ACLs for this
       * bucket and objects in this bucket.
       * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on this bucket
       * and objects in this bucket.
       *
       * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't
       * prevent new public ACLs from being set.
       */
      public fun ignorePublicAcls(ignorePublicAcls: Boolean)

      /**
       * @param ignorePublicAcls Specifies whether Amazon S3 should ignore public ACLs for this
       * bucket and objects in this bucket.
       * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on this bucket
       * and objects in this bucket.
       *
       * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't
       * prevent new public ACLs from being set.
       */
      public fun ignorePublicAcls(ignorePublicAcls: IResolvable)

      /**
       * @param restrictPublicBuckets Specifies whether Amazon S3 should restrict public bucket
       * policies for this bucket.
       * Setting this element to `TRUE` restricts access to this bucket to only AWS service
       * principals and authorized users within this account if the bucket has a public policy.
       *
       * Enabling this setting doesn't affect previously stored bucket policies, except that public
       * and cross-account access within any public bucket policy, including non-public delegation to
       * specific accounts, is blocked.
       */
      public fun restrictPublicBuckets(restrictPublicBuckets: Boolean)

      /**
       * @param restrictPublicBuckets Specifies whether Amazon S3 should restrict public bucket
       * policies for this bucket.
       * Setting this element to `TRUE` restricts access to this bucket to only AWS service
       * principals and authorized users within this account if the bucket has a public policy.
       *
       * Enabling this setting doesn't affect previously stored bucket policies, except that public
       * and cross-account access within any public bucket policy, including non-public delegation to
       * specific accounts, is blocked.
       */
      public fun restrictPublicBuckets(restrictPublicBuckets: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty.builder()

      /**
       * @param blockPublicAcls Specifies whether Amazon S3 should block public access control lists
       * (ACLs) for this bucket and objects in this bucket.
       * Setting this element to `TRUE` causes the following behavior:
       *
       * * PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
       * * PUT Object calls fail if the request includes a public ACL.
       * * PUT Bucket calls fail if the request includes a public ACL.
       *
       * Enabling this setting doesn't affect existing policies or ACLs.
       */
      override fun blockPublicAcls(blockPublicAcls: Boolean) {
        cdkBuilder.blockPublicAcls(blockPublicAcls)
      }

      /**
       * @param blockPublicAcls Specifies whether Amazon S3 should block public access control lists
       * (ACLs) for this bucket and objects in this bucket.
       * Setting this element to `TRUE` causes the following behavior:
       *
       * * PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
       * * PUT Object calls fail if the request includes a public ACL.
       * * PUT Bucket calls fail if the request includes a public ACL.
       *
       * Enabling this setting doesn't affect existing policies or ACLs.
       */
      override fun blockPublicAcls(blockPublicAcls: IResolvable) {
        cdkBuilder.blockPublicAcls(blockPublicAcls.let(IResolvable::unwrap))
      }

      /**
       * @param blockPublicPolicy Specifies whether Amazon S3 should block public bucket policies
       * for this bucket.
       * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
       * specified bucket policy allows public access.
       *
       * Enabling this setting doesn't affect existing bucket policies.
       */
      override fun blockPublicPolicy(blockPublicPolicy: Boolean) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy)
      }

      /**
       * @param blockPublicPolicy Specifies whether Amazon S3 should block public bucket policies
       * for this bucket.
       * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
       * specified bucket policy allows public access.
       *
       * Enabling this setting doesn't affect existing bucket policies.
       */
      override fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param ignorePublicAcls Specifies whether Amazon S3 should ignore public ACLs for this
       * bucket and objects in this bucket.
       * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on this bucket
       * and objects in this bucket.
       *
       * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't
       * prevent new public ACLs from being set.
       */
      override fun ignorePublicAcls(ignorePublicAcls: Boolean) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls)
      }

      /**
       * @param ignorePublicAcls Specifies whether Amazon S3 should ignore public ACLs for this
       * bucket and objects in this bucket.
       * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on this bucket
       * and objects in this bucket.
       *
       * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't
       * prevent new public ACLs from being set.
       */
      override fun ignorePublicAcls(ignorePublicAcls: IResolvable) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls.let(IResolvable::unwrap))
      }

      /**
       * @param restrictPublicBuckets Specifies whether Amazon S3 should restrict public bucket
       * policies for this bucket.
       * Setting this element to `TRUE` restricts access to this bucket to only AWS service
       * principals and authorized users within this account if the bucket has a public policy.
       *
       * Enabling this setting doesn't affect previously stored bucket policies, except that public
       * and cross-account access within any public bucket policy, including non-public delegation to
       * specific accounts, is blocked.
       */
      override fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
      }

      /**
       * @param restrictPublicBuckets Specifies whether Amazon S3 should restrict public bucket
       * policies for this bucket.
       * Setting this element to `TRUE` restricts access to this bucket to only AWS service
       * principals and authorized users within this account if the bucket has a public policy.
       *
       * Enabling this setting doesn't affect previously stored bucket policies, except that public
       * and cross-account access within any public bucket policy, including non-public delegation to
       * specific accounts, is blocked.
       */
      override fun restrictPublicBuckets(restrictPublicBuckets: IResolvable) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty,
    ) : CdkObject(cdkObject), PublicAccessBlockConfigurationProperty {
      /**
       * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket
       * and objects in this bucket.
       *
       * Setting this element to `TRUE` causes the following behavior:
       *
       * * PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
       * * PUT Object calls fail if the request includes a public ACL.
       * * PUT Bucket calls fail if the request includes a public ACL.
       *
       * Enabling this setting doesn't affect existing policies or ACLs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspoint-publicaccessblockconfiguration.html#cfn-s3-multiregionaccesspoint-publicaccessblockconfiguration-blockpublicacls)
       */
      override fun blockPublicAcls(): Any? = unwrap(this).getBlockPublicAcls()

      /**
       * Specifies whether Amazon S3 should block public bucket policies for this bucket.
       *
       * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
       * specified bucket policy allows public access.
       *
       * Enabling this setting doesn't affect existing bucket policies.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspoint-publicaccessblockconfiguration.html#cfn-s3-multiregionaccesspoint-publicaccessblockconfiguration-blockpublicpolicy)
       */
      override fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

      /**
       * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this
       * bucket.
       *
       * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on this bucket
       * and objects in this bucket.
       *
       * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't
       * prevent new public ACLs from being set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspoint-publicaccessblockconfiguration.html#cfn-s3-multiregionaccesspoint-publicaccessblockconfiguration-ignorepublicacls)
       */
      override fun ignorePublicAcls(): Any? = unwrap(this).getIgnorePublicAcls()

      /**
       * Specifies whether Amazon S3 should restrict public bucket policies for this bucket.
       *
       * Setting this element to `TRUE` restricts access to this bucket to only AWS service
       * principals and authorized users within this account if the bucket has a public policy.
       *
       * Enabling this setting doesn't affect previously stored bucket policies, except that public
       * and cross-account access within any public bucket policy, including non-public delegation to
       * specific accounts, is blocked.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspoint-publicaccessblockconfiguration.html#cfn-s3-multiregionaccesspoint-publicaccessblockconfiguration-restrictpublicbuckets)
       */
      override fun restrictPublicBuckets(): Any? = unwrap(this).getRestrictPublicBuckets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PublicAccessBlockConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty):
          PublicAccessBlockConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicAccessBlockConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty
    }
  }

  /**
   * A bucket associated with a specific Region when creating Multi-Region Access Points.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3.*;
   * RegionProperty regionProperty = RegionProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketAccountId("bucketAccountId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspoint-region.html)
   */
  public interface RegionProperty {
    /**
     * The name of the associated bucket for the Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspoint-region.html#cfn-s3-multiregionaccesspoint-region-bucket)
     */
    public fun bucket(): String

    /**
     * The AWS account ID that owns the Amazon S3 bucket that's associated with this Multi-Region
     * Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspoint-region.html#cfn-s3-multiregionaccesspoint-region-bucketaccountid)
     */
    public fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()

    /**
     * A builder for [RegionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the associated bucket for the Region. 
       */
      public fun bucket(bucket: String)

      /**
       * @param bucketAccountId The AWS account ID that owns the Amazon S3 bucket that's associated
       * with this Multi-Region Access Point.
       */
      public fun bucketAccountId(bucketAccountId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty.Builder =
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty.builder()

      /**
       * @param bucket The name of the associated bucket for the Region. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param bucketAccountId The AWS account ID that owns the Amazon S3 bucket that's associated
       * with this Multi-Region Access Point.
       */
      override fun bucketAccountId(bucketAccountId: String) {
        cdkBuilder.bucketAccountId(bucketAccountId)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty,
    ) : CdkObject(cdkObject), RegionProperty {
      /**
       * The name of the associated bucket for the Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspoint-region.html#cfn-s3-multiregionaccesspoint-region-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The AWS account ID that owns the Amazon S3 bucket that's associated with this Multi-Region
       * Access Point.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspoint-region.html#cfn-s3-multiregionaccesspoint-region-bucketaccountid)
       */
      override fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RegionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty):
          RegionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegionProperty):
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty
    }
  }
}
