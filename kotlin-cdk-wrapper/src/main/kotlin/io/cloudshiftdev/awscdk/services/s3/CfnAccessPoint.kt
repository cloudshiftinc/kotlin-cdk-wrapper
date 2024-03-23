@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::S3::AccessPoint resource is an Amazon S3 resource type that you can use to access
 * buckets.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Object policy;
 * CfnAccessPoint cfnAccessPoint = CfnAccessPoint.Builder.create(this, "MyCfnAccessPoint")
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketAccountId("bucketAccountId")
 * .name("name")
 * .policy(policy)
 * .publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty.builder()
 * .blockPublicAcls(false)
 * .blockPublicPolicy(false)
 * .ignorePublicAcls(false)
 * .restrictPublicBuckets(false)
 * .build())
 * .vpcConfiguration(VpcConfigurationProperty.builder()
 * .vpcId("vpcId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html)
 */
public open class CfnAccessPoint(
  cdkObject: software.amazon.awscdk.services.s3.CfnAccessPoint,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessPointProps,
  ) :
      this(software.amazon.awscdk.services.s3.CfnAccessPoint(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnAccessPointProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessPointProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAccessPointProps(props)
  )

  /**
   * The alias for this access point.
   */
  public open fun attrAlias(): String = unwrap(this).getAttrAlias()

  /**
   * This property contains the details of the ARN for the access point.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of this access point.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * Indicates whether this access point allows access from the internet.
   *
   * If `VpcConfiguration` is specified for this access point, then `NetworkOrigin` is `VPC` , and
   * the access point doesn't allow access from the internet. Otherwise, `NetworkOrigin` is `Internet`
   * , and the access point allows access from the internet, subject to the access point and bucket
   * access policies.
   *
   * *Allowed values* : `VPC` | `Internet`
   */
  public open fun attrNetworkOrigin(): String = unwrap(this).getAttrNetworkOrigin()

  /**
   * The name of the bucket associated with this access point.
   */
  public open fun bucket(): String = unwrap(this).getBucket()

  /**
   * The name of the bucket associated with this access point.
   */
  public open fun bucket(`value`: String) {
    unwrap(this).setBucket(`value`)
  }

  /**
   * The AWS account ID associated with the S3 bucket associated with this access point.
   */
  public open fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()

  /**
   * The AWS account ID associated with the S3 bucket associated with this access point.
   */
  public open fun bucketAccountId(`value`: String) {
    unwrap(this).setBucketAccountId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of this access point.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of this access point.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The access point policy associated with this access point.
   */
  public open fun policy(): Any? = unwrap(this).getPolicy()

  /**
   * The access point policy associated with this access point.
   */
  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  /**
   * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
   */
  public open fun publicAccessBlockConfiguration(): Any? =
      unwrap(this).getPublicAccessBlockConfiguration()

  /**
   * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
   */
  public open fun publicAccessBlockConfiguration(`value`: IResolvable) {
    unwrap(this).setPublicAccessBlockConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
   */
  public open fun publicAccessBlockConfiguration(`value`: PublicAccessBlockConfigurationProperty) {
    unwrap(this).setPublicAccessBlockConfiguration(`value`.let(PublicAccessBlockConfigurationProperty::unwrap))
  }

  /**
   * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c05a501d864efbe323e5985f14b7f6248863b7861ff8a00b1a0a6e2ff63d2782")
  public open
      fun publicAccessBlockConfiguration(`value`: PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
      Unit = publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty(`value`))

  /**
   * The Virtual Private Cloud (VPC) configuration for this access point, if one exists.
   */
  public open fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

  /**
   * The Virtual Private Cloud (VPC) configuration for this access point, if one exists.
   */
  public open fun vpcConfiguration(`value`: IResolvable) {
    unwrap(this).setVpcConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Virtual Private Cloud (VPC) configuration for this access point, if one exists.
   */
  public open fun vpcConfiguration(`value`: VpcConfigurationProperty) {
    unwrap(this).setVpcConfiguration(`value`.let(VpcConfigurationProperty::unwrap))
  }

  /**
   * The Virtual Private Cloud (VPC) configuration for this access point, if one exists.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9b6fa3968887f57728a3c211ce41993d6a404130a54eaf5a7c2e6a141ba9b889")
  public open fun vpcConfiguration(`value`: VpcConfigurationProperty.Builder.() -> Unit): Unit =
      vpcConfiguration(VpcConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3.CfnAccessPoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the bucket associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-bucket)
     * @param bucket The name of the bucket associated with this access point. 
     */
    public fun bucket(bucket: String)

    /**
     * The AWS account ID associated with the S3 bucket associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-bucketaccountid)
     * @param bucketAccountId The AWS account ID associated with the S3 bucket associated with this
     * access point. 
     */
    public fun bucketAccountId(bucketAccountId: String)

    /**
     * The name of this access point.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the access point name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-name)
     * @param name The name of this access point. 
     */
    public fun name(name: String)

    /**
     * The access point policy associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-policy)
     * @param policy The access point policy associated with this access point. 
     */
    public fun policy(policy: Any)

    /**
     * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Amazon S3 bucket. 
     */
    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable)

    /**
     * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Amazon S3 bucket. 
     */
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty)

    /**
     * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Amazon S3 bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a94e44c5767736663ba688d54f25e54ade02ad65a0049a0b3b529ad589955982")
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty.Builder.() -> Unit)

    /**
     * The Virtual Private Cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-vpcconfiguration)
     * @param vpcConfiguration The Virtual Private Cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    public fun vpcConfiguration(vpcConfiguration: IResolvable)

    /**
     * The Virtual Private Cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-vpcconfiguration)
     * @param vpcConfiguration The Virtual Private Cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

    /**
     * The Virtual Private Cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-vpcconfiguration)
     * @param vpcConfiguration The Virtual Private Cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("85c47197668efa14d7c0432310d8ae12067385700d95791716f25d33e98362b8")
    public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnAccessPoint.Builder =
        software.amazon.awscdk.services.s3.CfnAccessPoint.Builder.create(scope, id)

    /**
     * The name of the bucket associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-bucket)
     * @param bucket The name of the bucket associated with this access point. 
     */
    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    /**
     * The AWS account ID associated with the S3 bucket associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-bucketaccountid)
     * @param bucketAccountId The AWS account ID associated with the S3 bucket associated with this
     * access point. 
     */
    override fun bucketAccountId(bucketAccountId: String) {
      cdkBuilder.bucketAccountId(bucketAccountId)
    }

    /**
     * The name of this access point.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the access point name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-name)
     * @param name The name of this access point. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The access point policy associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-policy)
     * @param policy The access point policy associated with this access point. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Amazon S3 bucket. 
     */
    override fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Amazon S3 bucket. 
     */
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(PublicAccessBlockConfigurationProperty::unwrap))
    }

    /**
     * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Amazon S3 bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a94e44c5767736663ba688d54f25e54ade02ad65a0049a0b3b529ad589955982")
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
        Unit =
        publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty(publicAccessBlockConfiguration))

    /**
     * The Virtual Private Cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-vpcconfiguration)
     * @param vpcConfiguration The Virtual Private Cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    override fun vpcConfiguration(vpcConfiguration: IResolvable) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The Virtual Private Cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-vpcconfiguration)
     * @param vpcConfiguration The Virtual Private Cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty::unwrap))
    }

    /**
     * The Virtual Private Cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-vpcconfiguration)
     * @param vpcConfiguration The Virtual Private Cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("85c47197668efa14d7c0432310d8ae12067385700d95791716f25d33e98362b8")
    override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
        Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

    public fun build(): software.amazon.awscdk.services.s3.CfnAccessPoint = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3.CfnAccessPoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessPoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessPoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessPoint): CfnAccessPoint
        = CfnAccessPoint(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPoint): software.amazon.awscdk.services.s3.CfnAccessPoint
        = wrapped.cdkObject as software.amazon.awscdk.services.s3.CfnAccessPoint
  }

  /**
   * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
   *
   * You can enable the configuration options in any combination. For more information about when
   * Amazon S3 considers a bucket or object public, see [The Meaning of
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-blockpublicacls)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-blockpublicpolicy)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-ignorepublicacls)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-restrictpublicbuckets)
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
          software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty.builder()

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
          software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty,
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-blockpublicacls)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-blockpublicpolicy)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-ignorepublicacls)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-restrictpublicbuckets)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty):
          PublicAccessBlockConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PublicAccessBlockConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicAccessBlockConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty
    }
  }

  /**
   * The Virtual Private Cloud (VPC) configuration for this access point.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3.*;
   * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-vpcconfiguration.html)
   */
  public interface VpcConfigurationProperty {
    /**
     * If this field is specified, the access point will only allow connections from the specified
     * VPC ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-vpcconfiguration.html#cfn-s3-accesspoint-vpcconfiguration-vpcid)
     */
    public fun vpcId(): String? = unwrap(this).getVpcId()

    /**
     * A builder for [VpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param vpcId If this field is specified, the access point will only allow connections from
       * the specified VPC ID.
       */
      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty.builder()

      /**
       * @param vpcId If this field is specified, the access point will only allow connections from
       * the specified VPC ID.
       */
      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty,
    ) : CdkObject(cdkObject), VpcConfigurationProperty {
      /**
       * If this field is specified, the access point will only allow connections from the specified
       * VPC ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-vpcconfiguration.html#cfn-s3-accesspoint-vpcconfiguration-vpcid)
       */
      override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty):
          VpcConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty
    }
  }
}
