@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3express

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAccessPoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3express.*;
 * Object policy;
 * CfnAccessPointProps cfnAccessPointProps = CfnAccessPointProps.builder()
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
public interface CfnAccessPointProps {
  /**
   * The name of the bucket that you want to associate the access point with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-bucket)
   */
  public fun bucket(): String

  /**
   * The AWS account ID that owns the bucket associated with this access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-bucketaccountid)
   */
  public fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()

  /**
   * An access point name consists of a base name you provide, followed by the zoneID ( AWS Local
   * Zone) followed by the prefix `--xa-s3` .
   *
   * For example, accesspointname--zoneID--xa-s3.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The access point policy associated with the specified access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-policy)
   */
  public fun policy(): Any? = unwrap(this).getPolicy()

  /**
   * Public access is blocked by default to access points for directory buckets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-publicaccessblockconfiguration)
   */
  public fun publicAccessBlockConfiguration(): Any? =
      unwrap(this).getPublicAccessBlockConfiguration()

  /**
   * You can use the access point scope to restrict access to specific prefixes, API operations, or
   * a combination of both.
   *
   * For more information, see [Manage the scope of your access points for directory
   * buckets.](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets-manage-scope.html)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-scope)
   */
  public fun scope(): Any? = unwrap(this).getScope()

  /**
   * If you include this field, Amazon S3 restricts access to this access point to requests from the
   * specified virtual private cloud (VPC).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-vpcconfiguration)
   */
  public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

  /**
   * A builder for [CfnAccessPointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The name of the bucket that you want to associate the access point with. 
     */
    public fun bucket(bucket: String)

    /**
     * @param bucketAccountId The AWS account ID that owns the bucket associated with this access
     * point.
     */
    public fun bucketAccountId(bucketAccountId: String)

    /**
     * @param name An access point name consists of a base name you provide, followed by the zoneID
     * ( AWS Local Zone) followed by the prefix `--xa-s3` .
     * For example, accesspointname--zoneID--xa-s3.
     */
    public fun name(name: String)

    /**
     * @param policy The access point policy associated with the specified access point.
     */
    public fun policy(policy: Any)

    /**
     * @param publicAccessBlockConfiguration Public access is blocked by default to access points
     * for directory buckets.
     */
    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable)

    /**
     * @param publicAccessBlockConfiguration Public access is blocked by default to access points
     * for directory buckets.
     */
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnAccessPoint.PublicAccessBlockConfigurationProperty)

    /**
     * @param publicAccessBlockConfiguration Public access is blocked by default to access points
     * for directory buckets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("085c22818724eae8d795c074efde88ecdd8681df0efa4501efd9f99469a17bed")
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnAccessPoint.PublicAccessBlockConfigurationProperty.Builder.() -> Unit)

    /**
     * @param scope You can use the access point scope to restrict access to specific prefixes, API
     * operations, or a combination of both.
     * For more information, see [Manage the scope of your access points for directory
     * buckets.](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets-manage-scope.html)
     */
    public fun scope(scope: IResolvable)

    /**
     * @param scope You can use the access point scope to restrict access to specific prefixes, API
     * operations, or a combination of both.
     * For more information, see [Manage the scope of your access points for directory
     * buckets.](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets-manage-scope.html)
     */
    public fun scope(scope: CfnAccessPoint.ScopeProperty)

    /**
     * @param scope You can use the access point scope to restrict access to specific prefixes, API
     * operations, or a combination of both.
     * For more information, see [Manage the scope of your access points for directory
     * buckets.](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets-manage-scope.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70d504e5c061ba52f29ce3b038392341743dc7982ce514febdea40207b69f93a")
    public fun scope(scope: CfnAccessPoint.ScopeProperty.Builder.() -> Unit)

    /**
     * @param vpcConfiguration If you include this field, Amazon S3 restricts access to this access
     * point to requests from the specified virtual private cloud (VPC).
     */
    public fun vpcConfiguration(vpcConfiguration: IResolvable)

    /**
     * @param vpcConfiguration If you include this field, Amazon S3 restricts access to this access
     * point to requests from the specified virtual private cloud (VPC).
     */
    public fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty)

    /**
     * @param vpcConfiguration If you include this field, Amazon S3 restricts access to this access
     * point to requests from the specified virtual private cloud (VPC).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e319a38509740e286c3c4d1a199a03039867a358bd76319d0bf41784dd71a9c3")
    public
        fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3express.CfnAccessPointProps.Builder =
        software.amazon.awscdk.services.s3express.CfnAccessPointProps.builder()

    /**
     * @param bucket The name of the bucket that you want to associate the access point with. 
     */
    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    /**
     * @param bucketAccountId The AWS account ID that owns the bucket associated with this access
     * point.
     */
    override fun bucketAccountId(bucketAccountId: String) {
      cdkBuilder.bucketAccountId(bucketAccountId)
    }

    /**
     * @param name An access point name consists of a base name you provide, followed by the zoneID
     * ( AWS Local Zone) followed by the prefix `--xa-s3` .
     * For example, accesspointname--zoneID--xa-s3.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param policy The access point policy associated with the specified access point.
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * @param publicAccessBlockConfiguration Public access is blocked by default to access points
     * for directory buckets.
     */
    override fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param publicAccessBlockConfiguration Public access is blocked by default to access points
     * for directory buckets.
     */
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnAccessPoint.PublicAccessBlockConfigurationProperty) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(CfnAccessPoint.PublicAccessBlockConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param publicAccessBlockConfiguration Public access is blocked by default to access points
     * for directory buckets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("085c22818724eae8d795c074efde88ecdd8681df0efa4501efd9f99469a17bed")
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnAccessPoint.PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
        Unit =
        publicAccessBlockConfiguration(CfnAccessPoint.PublicAccessBlockConfigurationProperty(publicAccessBlockConfiguration))

    /**
     * @param scope You can use the access point scope to restrict access to specific prefixes, API
     * operations, or a combination of both.
     * For more information, see [Manage the scope of your access points for directory
     * buckets.](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets-manage-scope.html)
     */
    override fun scope(scope: IResolvable) {
      cdkBuilder.scope(scope.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param scope You can use the access point scope to restrict access to specific prefixes, API
     * operations, or a combination of both.
     * For more information, see [Manage the scope of your access points for directory
     * buckets.](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets-manage-scope.html)
     */
    override fun scope(scope: CfnAccessPoint.ScopeProperty) {
      cdkBuilder.scope(scope.let(CfnAccessPoint.ScopeProperty.Companion::unwrap))
    }

    /**
     * @param scope You can use the access point scope to restrict access to specific prefixes, API
     * operations, or a combination of both.
     * For more information, see [Manage the scope of your access points for directory
     * buckets.](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets-manage-scope.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70d504e5c061ba52f29ce3b038392341743dc7982ce514febdea40207b69f93a")
    override fun scope(scope: CfnAccessPoint.ScopeProperty.Builder.() -> Unit): Unit =
        scope(CfnAccessPoint.ScopeProperty(scope))

    /**
     * @param vpcConfiguration If you include this field, Amazon S3 restricts access to this access
     * point to requests from the specified virtual private cloud (VPC).
     */
    override fun vpcConfiguration(vpcConfiguration: IResolvable) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcConfiguration If you include this field, Amazon S3 restricts access to this access
     * point to requests from the specified virtual private cloud (VPC).
     */
    override fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(CfnAccessPoint.VpcConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param vpcConfiguration If you include this field, Amazon S3 restricts access to this access
     * point to requests from the specified virtual private cloud (VPC).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e319a38509740e286c3c4d1a199a03039867a358bd76319d0bf41784dd71a9c3")
    override
        fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty.Builder.() -> Unit):
        Unit = vpcConfiguration(CfnAccessPoint.VpcConfigurationProperty(vpcConfiguration))

    public fun build(): software.amazon.awscdk.services.s3express.CfnAccessPointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3express.CfnAccessPointProps,
  ) : CdkObject(cdkObject),
      CfnAccessPointProps {
    /**
     * The name of the bucket that you want to associate the access point with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-bucket)
     */
    override fun bucket(): String = unwrap(this).getBucket()

    /**
     * The AWS account ID that owns the bucket associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-bucketaccountid)
     */
    override fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()

    /**
     * An access point name consists of a base name you provide, followed by the zoneID ( AWS Local
     * Zone) followed by the prefix `--xa-s3` .
     *
     * For example, accesspointname--zoneID--xa-s3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The access point policy associated with the specified access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-policy)
     */
    override fun policy(): Any? = unwrap(this).getPolicy()

    /**
     * Public access is blocked by default to access points for directory buckets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-publicaccessblockconfiguration)
     */
    override fun publicAccessBlockConfiguration(): Any? =
        unwrap(this).getPublicAccessBlockConfiguration()

    /**
     * You can use the access point scope to restrict access to specific prefixes, API operations,
     * or a combination of both.
     *
     * For more information, see [Manage the scope of your access points for directory
     * buckets.](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets-manage-scope.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-scope)
     */
    override fun scope(): Any? = unwrap(this).getScope()

    /**
     * If you include this field, Amazon S3 restricts access to this access point to requests from
     * the specified virtual private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-accesspoint.html#cfn-s3express-accesspoint-vpcconfiguration)
     */
    override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessPointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnAccessPointProps):
        CfnAccessPointProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAccessPointProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPointProps):
        software.amazon.awscdk.services.s3express.CfnAccessPointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3express.CfnAccessPointProps
  }
}
