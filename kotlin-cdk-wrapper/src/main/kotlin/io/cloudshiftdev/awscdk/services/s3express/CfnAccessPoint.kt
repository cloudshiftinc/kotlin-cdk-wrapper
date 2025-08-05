@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3express

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
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Access points simplify managing data access at scale for shared datasets in Amazon S3 .
 *
 * Access points are unique hostnames you create to enforce distinct permissions and network
 * controls for all requests made through an access point. You can create hundreds of access points per
 * bucket, each with a distinct name and permissions customized for each application. Each access point
 * works in conjunction with the bucket policy that is attached to the underlying bucket. For more
 * information, see [Managing access to shared datasets in directory buckets with access
 * points](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3express.*;
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
 * .scope(ScopeProperty.builder()
 * .permissions(List.of("permissions"))
 * .prefixes(List.of("prefixes"))
 * .build())
 * .vpcConfiguration(VpcConfigurationProperty.builder()
 * .vpcId("vpcId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html)
 */
public open class CfnAccessPoint(
  cdkObject: software.amazon.awscdk.services.s3express.CfnAccessPoint,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessPointProps,
  ) :
      this(software.amazon.awscdk.services.s3express.CfnAccessPoint(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAccessPointProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessPointProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAccessPointProps(props)
  )

  /**
   * The ARN of the access point.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The network configuration of the access point.
   */
  public open fun attrNetworkOrigin(): String = unwrap(this).getAttrNetworkOrigin()

  /**
   * The name of the bucket that you want to associate the access point with.
   */
  public open fun bucket(): String = unwrap(this).getBucket()

  /**
   * The name of the bucket that you want to associate the access point with.
   */
  public open fun bucket(`value`: String) {
    unwrap(this).setBucket(`value`)
  }

  /**
   * The AWS account ID that owns the bucket associated with this access point.
   */
  public open fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()

  /**
   * The AWS account ID that owns the bucket associated with this access point.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * An access point name consists of a base name you provide, followed by the zoneID ( AWS Local
   * Zone) followed by the prefix `--xa-s3` .
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * An access point name consists of a base name you provide, followed by the zoneID ( AWS Local
   * Zone) followed by the prefix `--xa-s3` .
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The access point policy associated with the specified access point.
   */
  public open fun policy(): Any? = unwrap(this).getPolicy()

  /**
   * The access point policy associated with the specified access point.
   */
  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  /**
   * Public access is blocked by default to access points for directory buckets.
   */
  public open fun publicAccessBlockConfiguration(): Any? =
      unwrap(this).getPublicAccessBlockConfiguration()

  /**
   * Public access is blocked by default to access points for directory buckets.
   */
  public open fun publicAccessBlockConfiguration(`value`: IResolvable) {
    unwrap(this).setPublicAccessBlockConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Public access is blocked by default to access points for directory buckets.
   */
  public open fun publicAccessBlockConfiguration(`value`: PublicAccessBlockConfigurationProperty) {
    unwrap(this).setPublicAccessBlockConfiguration(`value`.let(PublicAccessBlockConfigurationProperty.Companion::unwrap))
  }

  /**
   * Public access is blocked by default to access points for directory buckets.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dbc1a092b08f304a823a7bf38d438f7750dbef796daa51b2432945d638e8857c")
  public open
      fun publicAccessBlockConfiguration(`value`: PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
      Unit = publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty(`value`))

  /**
   * You can use the access point scope to restrict access to specific prefixes, API operations, or
   * a combination of both.
   */
  public open fun scope(): Any? = unwrap(this).getScope()

  /**
   * You can use the access point scope to restrict access to specific prefixes, API operations, or
   * a combination of both.
   */
  public open fun scope(`value`: IResolvable) {
    unwrap(this).setScope(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * You can use the access point scope to restrict access to specific prefixes, API operations, or
   * a combination of both.
   */
  public open fun scope(`value`: ScopeProperty) {
    unwrap(this).setScope(`value`.let(ScopeProperty.Companion::unwrap))
  }

  /**
   * You can use the access point scope to restrict access to specific prefixes, API operations, or
   * a combination of both.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("712c604d74141c1d23602f23d1c2b9ec9e004569194507b010dbf3ac85706900")
  public open fun scope(`value`: ScopeProperty.Builder.() -> Unit): Unit =
      scope(ScopeProperty(`value`))

  /**
   * If you include this field, Amazon S3 restricts access to this access point to requests from the
   * specified virtual private cloud (VPC).
   */
  public open fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

  /**
   * If you include this field, Amazon S3 restricts access to this access point to requests from the
   * specified virtual private cloud (VPC).
   */
  public open fun vpcConfiguration(`value`: IResolvable) {
    unwrap(this).setVpcConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * If you include this field, Amazon S3 restricts access to this access point to requests from the
   * specified virtual private cloud (VPC).
   */
  public open fun vpcConfiguration(`value`: VpcConfigurationProperty) {
    unwrap(this).setVpcConfiguration(`value`.let(VpcConfigurationProperty.Companion::unwrap))
  }

  /**
   * If you include this field, Amazon S3 restricts access to this access point to requests from the
   * specified virtual private cloud (VPC).
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("08803ca6b0d3956121d0c15a450b3bf323797eea15b0cc20e076fefdac42155b")
  public open fun vpcConfiguration(`value`: VpcConfigurationProperty.Builder.() -> Unit): Unit =
      vpcConfiguration(VpcConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3express.CfnAccessPoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the bucket that you want to associate the access point with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-bucket)
     * @param bucket The name of the bucket that you want to associate the access point with. 
     */
    public fun bucket(bucket: String)

    /**
     * The AWS account ID that owns the bucket associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-bucketaccountid)
     * @param bucketAccountId The AWS account ID that owns the bucket associated with this access
     * point. 
     */
    public fun bucketAccountId(bucketAccountId: String)

    /**
     * An access point name consists of a base name you provide, followed by the zoneID ( AWS Local
     * Zone) followed by the prefix `--xa-s3` .
     *
     * For example, accesspointname--zoneID--xa-s3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-name)
     * @param name An access point name consists of a base name you provide, followed by the zoneID
     * ( AWS Local Zone) followed by the prefix `--xa-s3` . 
     */
    public fun name(name: String)

    /**
     * The access point policy associated with the specified access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-policy)
     * @param policy The access point policy associated with the specified access point. 
     */
    public fun policy(policy: Any)

    /**
     * Public access is blocked by default to access points for directory buckets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration Public access is blocked by default to access points
     * for directory buckets. 
     */
    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable)

    /**
     * Public access is blocked by default to access points for directory buckets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration Public access is blocked by default to access points
     * for directory buckets. 
     */
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty)

    /**
     * Public access is blocked by default to access points for directory buckets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration Public access is blocked by default to access points
     * for directory buckets. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da5d4c1c6b1e9e627f53865726074fb4a7347580c3b0d90965132962a0de2bfb")
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty.Builder.() -> Unit)

    /**
     * You can use the access point scope to restrict access to specific prefixes, API operations,
     * or a combination of both.
     *
     * For more information, see [Manage the scope of your access points for directory
     * buckets.](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets-manage-scope.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-scope)
     * @param scope You can use the access point scope to restrict access to specific prefixes, API
     * operations, or a combination of both. 
     */
    public fun scope(scope: IResolvable)

    /**
     * You can use the access point scope to restrict access to specific prefixes, API operations,
     * or a combination of both.
     *
     * For more information, see [Manage the scope of your access points for directory
     * buckets.](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets-manage-scope.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-scope)
     * @param scope You can use the access point scope to restrict access to specific prefixes, API
     * operations, or a combination of both. 
     */
    public fun scope(scope: ScopeProperty)

    /**
     * You can use the access point scope to restrict access to specific prefixes, API operations,
     * or a combination of both.
     *
     * For more information, see [Manage the scope of your access points for directory
     * buckets.](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets-manage-scope.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-scope)
     * @param scope You can use the access point scope to restrict access to specific prefixes, API
     * operations, or a combination of both. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("248e9eb5630c58c72d3166f5b87c08e515ce47edb29dad5bff3f92f4d0e73441")
    public fun scope(scope: ScopeProperty.Builder.() -> Unit)

    /**
     * If you include this field, Amazon S3 restricts access to this access point to requests from
     * the specified virtual private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-vpcconfiguration)
     * @param vpcConfiguration If you include this field, Amazon S3 restricts access to this access
     * point to requests from the specified virtual private cloud (VPC). 
     */
    public fun vpcConfiguration(vpcConfiguration: IResolvable)

    /**
     * If you include this field, Amazon S3 restricts access to this access point to requests from
     * the specified virtual private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-vpcconfiguration)
     * @param vpcConfiguration If you include this field, Amazon S3 restricts access to this access
     * point to requests from the specified virtual private cloud (VPC). 
     */
    public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

    /**
     * If you include this field, Amazon S3 restricts access to this access point to requests from
     * the specified virtual private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-vpcconfiguration)
     * @param vpcConfiguration If you include this field, Amazon S3 restricts access to this access
     * point to requests from the specified virtual private cloud (VPC). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fbe04552cf56fc7fdb1da88aff5704953be88b06e8217b7a0d41b7b7d3bbab09")
    public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3express.CfnAccessPoint.Builder =
        software.amazon.awscdk.services.s3express.CfnAccessPoint.Builder.create(scope, id)

    /**
     * The name of the bucket that you want to associate the access point with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-bucket)
     * @param bucket The name of the bucket that you want to associate the access point with. 
     */
    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    /**
     * The AWS account ID that owns the bucket associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-bucketaccountid)
     * @param bucketAccountId The AWS account ID that owns the bucket associated with this access
     * point. 
     */
    override fun bucketAccountId(bucketAccountId: String) {
      cdkBuilder.bucketAccountId(bucketAccountId)
    }

    /**
     * An access point name consists of a base name you provide, followed by the zoneID ( AWS Local
     * Zone) followed by the prefix `--xa-s3` .
     *
     * For example, accesspointname--zoneID--xa-s3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-name)
     * @param name An access point name consists of a base name you provide, followed by the zoneID
     * ( AWS Local Zone) followed by the prefix `--xa-s3` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The access point policy associated with the specified access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-policy)
     * @param policy The access point policy associated with the specified access point. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * Public access is blocked by default to access points for directory buckets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration Public access is blocked by default to access points
     * for directory buckets. 
     */
    override fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Public access is blocked by default to access points for directory buckets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration Public access is blocked by default to access points
     * for directory buckets. 
     */
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(PublicAccessBlockConfigurationProperty.Companion::unwrap))
    }

    /**
     * Public access is blocked by default to access points for directory buckets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration Public access is blocked by default to access points
     * for directory buckets. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da5d4c1c6b1e9e627f53865726074fb4a7347580c3b0d90965132962a0de2bfb")
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
        Unit =
        publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty(publicAccessBlockConfiguration))

    /**
     * You can use the access point scope to restrict access to specific prefixes, API operations,
     * or a combination of both.
     *
     * For more information, see [Manage the scope of your access points for directory
     * buckets.](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets-manage-scope.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-scope)
     * @param scope You can use the access point scope to restrict access to specific prefixes, API
     * operations, or a combination of both. 
     */
    override fun scope(scope: IResolvable) {
      cdkBuilder.scope(scope.let(IResolvable.Companion::unwrap))
    }

    /**
     * You can use the access point scope to restrict access to specific prefixes, API operations,
     * or a combination of both.
     *
     * For more information, see [Manage the scope of your access points for directory
     * buckets.](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets-manage-scope.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-scope)
     * @param scope You can use the access point scope to restrict access to specific prefixes, API
     * operations, or a combination of both. 
     */
    override fun scope(scope: ScopeProperty) {
      cdkBuilder.scope(scope.let(ScopeProperty.Companion::unwrap))
    }

    /**
     * You can use the access point scope to restrict access to specific prefixes, API operations,
     * or a combination of both.
     *
     * For more information, see [Manage the scope of your access points for directory
     * buckets.](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets-manage-scope.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-scope)
     * @param scope You can use the access point scope to restrict access to specific prefixes, API
     * operations, or a combination of both. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("248e9eb5630c58c72d3166f5b87c08e515ce47edb29dad5bff3f92f4d0e73441")
    override fun scope(scope: ScopeProperty.Builder.() -> Unit): Unit = scope(ScopeProperty(scope))

    /**
     * If you include this field, Amazon S3 restricts access to this access point to requests from
     * the specified virtual private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-vpcconfiguration)
     * @param vpcConfiguration If you include this field, Amazon S3 restricts access to this access
     * point to requests from the specified virtual private cloud (VPC). 
     */
    override fun vpcConfiguration(vpcConfiguration: IResolvable) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * If you include this field, Amazon S3 restricts access to this access point to requests from
     * the specified virtual private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-vpcconfiguration)
     * @param vpcConfiguration If you include this field, Amazon S3 restricts access to this access
     * point to requests from the specified virtual private cloud (VPC). 
     */
    override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty.Companion::unwrap))
    }

    /**
     * If you include this field, Amazon S3 restricts access to this access point to requests from
     * the specified virtual private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-vpcconfiguration)
     * @param vpcConfiguration If you include this field, Amazon S3 restricts access to this access
     * point to requests from the specified virtual private cloud (VPC). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fbe04552cf56fc7fdb1da88aff5704953be88b06e8217b7a0d41b7b7d3bbab09")
    override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
        Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

    public fun build(): software.amazon.awscdk.services.s3express.CfnAccessPoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3express.CfnAccessPoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessPoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessPoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnAccessPoint):
        CfnAccessPoint = CfnAccessPoint(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPoint):
        software.amazon.awscdk.services.s3express.CfnAccessPoint = wrapped.cdkObject as
        software.amazon.awscdk.services.s3express.CfnAccessPoint
  }

  /**
   * Public access is blocked by default to access points for directory buckets.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3express.*;
   * PublicAccessBlockConfigurationProperty publicAccessBlockConfigurationProperty =
   * PublicAccessBlockConfigurationProperty.builder()
   * .blockPublicAcls(false)
   * .blockPublicPolicy(false)
   * .ignorePublicAcls(false)
   * .restrictPublicBuckets(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-publicaccessblockconfiguration.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-publicaccessblockconfiguration.html#cfn-s3express-accesspoint-publicaccessblockconfiguration-blockpublicacls)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-publicaccessblockconfiguration.html#cfn-s3express-accesspoint-publicaccessblockconfiguration-blockpublicpolicy)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-publicaccessblockconfiguration.html#cfn-s3express-accesspoint-publicaccessblockconfiguration-ignorepublicacls)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-publicaccessblockconfiguration.html#cfn-s3express-accesspoint-publicaccessblockconfiguration-restrictpublicbuckets)
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
          software.amazon.awscdk.services.s3express.CfnAccessPoint.PublicAccessBlockConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3express.CfnAccessPoint.PublicAccessBlockConfigurationProperty.builder()

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
        cdkBuilder.blockPublicAcls(blockPublicAcls.let(IResolvable.Companion::unwrap))
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
        cdkBuilder.blockPublicPolicy(blockPublicPolicy.let(IResolvable.Companion::unwrap))
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
        cdkBuilder.ignorePublicAcls(ignorePublicAcls.let(IResolvable.Companion::unwrap))
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
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.s3express.CfnAccessPoint.PublicAccessBlockConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3express.CfnAccessPoint.PublicAccessBlockConfigurationProperty,
    ) : CdkObject(cdkObject),
        PublicAccessBlockConfigurationProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-publicaccessblockconfiguration.html#cfn-s3express-accesspoint-publicaccessblockconfiguration-blockpublicacls)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-publicaccessblockconfiguration.html#cfn-s3express-accesspoint-publicaccessblockconfiguration-blockpublicpolicy)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-publicaccessblockconfiguration.html#cfn-s3express-accesspoint-publicaccessblockconfiguration-ignorepublicacls)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-publicaccessblockconfiguration.html#cfn-s3express-accesspoint-publicaccessblockconfiguration-restrictpublicbuckets)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnAccessPoint.PublicAccessBlockConfigurationProperty):
          PublicAccessBlockConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PublicAccessBlockConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicAccessBlockConfigurationProperty):
          software.amazon.awscdk.services.s3express.CfnAccessPoint.PublicAccessBlockConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3express.CfnAccessPoint.PublicAccessBlockConfigurationProperty
    }
  }

  /**
   * You can use the access point scope to restrict access to specific prefixes, API operations, or
   * a combination of both.
   *
   * For more information, see [Manage the scope of your access points for directory
   * buckets.](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets-manage-scope.html)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3express.*;
   * ScopeProperty scopeProperty = ScopeProperty.builder()
   * .permissions(List.of("permissions"))
   * .prefixes(List.of("prefixes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-scope.html)
   */
  public interface ScopeProperty {
    /**
     * You can include one or more API operations as permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-scope.html#cfn-s3express-accesspoint-scope-permissions)
     */
    public fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

    /**
     * You can specify any amount of prefixes, but the total length of characters of all prefixes
     * must be less than 256 bytes in size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-scope.html#cfn-s3express-accesspoint-scope-prefixes)
     */
    public fun prefixes(): List<String> = unwrap(this).getPrefixes() ?: emptyList()

    /**
     * A builder for [ScopeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param permissions You can include one or more API operations as permissions.
       */
      public fun permissions(permissions: List<String>)

      /**
       * @param permissions You can include one or more API operations as permissions.
       */
      public fun permissions(vararg permissions: String)

      /**
       * @param prefixes You can specify any amount of prefixes, but the total length of characters
       * of all prefixes must be less than 256 bytes in size.
       */
      public fun prefixes(prefixes: List<String>)

      /**
       * @param prefixes You can specify any amount of prefixes, but the total length of characters
       * of all prefixes must be less than 256 bytes in size.
       */
      public fun prefixes(vararg prefixes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3express.CfnAccessPoint.ScopeProperty.Builder =
          software.amazon.awscdk.services.s3express.CfnAccessPoint.ScopeProperty.builder()

      /**
       * @param permissions You can include one or more API operations as permissions.
       */
      override fun permissions(permissions: List<String>) {
        cdkBuilder.permissions(permissions)
      }

      /**
       * @param permissions You can include one or more API operations as permissions.
       */
      override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

      /**
       * @param prefixes You can specify any amount of prefixes, but the total length of characters
       * of all prefixes must be less than 256 bytes in size.
       */
      override fun prefixes(prefixes: List<String>) {
        cdkBuilder.prefixes(prefixes)
      }

      /**
       * @param prefixes You can specify any amount of prefixes, but the total length of characters
       * of all prefixes must be less than 256 bytes in size.
       */
      override fun prefixes(vararg prefixes: String): Unit = prefixes(prefixes.toList())

      public fun build(): software.amazon.awscdk.services.s3express.CfnAccessPoint.ScopeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3express.CfnAccessPoint.ScopeProperty,
    ) : CdkObject(cdkObject),
        ScopeProperty {
      /**
       * You can include one or more API operations as permissions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-scope.html#cfn-s3express-accesspoint-scope-permissions)
       */
      override fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

      /**
       * You can specify any amount of prefixes, but the total length of characters of all prefixes
       * must be less than 256 bytes in size.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-scope.html#cfn-s3express-accesspoint-scope-prefixes)
       */
      override fun prefixes(): List<String> = unwrap(this).getPrefixes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScopeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnAccessPoint.ScopeProperty):
          ScopeProperty = CdkObjectWrappers.wrap(cdkObject) as? ScopeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScopeProperty):
          software.amazon.awscdk.services.s3express.CfnAccessPoint.ScopeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3express.CfnAccessPoint.ScopeProperty
    }
  }

  /**
   * The Virtual Private Cloud (VPC) configuration for a bucket access point.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3express.*;
   * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-vpcconfiguration.html)
   */
  public interface VpcConfigurationProperty {
    /**
     * If this field is specified, this access point will only allow connections from the specified
     * VPC ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-vpcconfiguration.html#cfn-s3express-accesspoint-vpcconfiguration-vpcid)
     */
    public fun vpcId(): String? = unwrap(this).getVpcId()

    /**
     * A builder for [VpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param vpcId If this field is specified, this access point will only allow connections from
       * the specified VPC ID.
       */
      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3express.CfnAccessPoint.VpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3express.CfnAccessPoint.VpcConfigurationProperty.builder()

      /**
       * @param vpcId If this field is specified, this access point will only allow connections from
       * the specified VPC ID.
       */
      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build():
          software.amazon.awscdk.services.s3express.CfnAccessPoint.VpcConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3express.CfnAccessPoint.VpcConfigurationProperty,
    ) : CdkObject(cdkObject),
        VpcConfigurationProperty {
      /**
       * If this field is specified, this access point will only allow connections from the
       * specified VPC ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3express-accesspoint-vpcconfiguration.html#cfn-s3express-accesspoint-vpcconfiguration-vpcid)
       */
      override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnAccessPoint.VpcConfigurationProperty):
          VpcConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigurationProperty):
          software.amazon.awscdk.services.s3express.CfnAccessPoint.VpcConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3express.CfnAccessPoint.VpcConfigurationProperty
    }
  }
}
