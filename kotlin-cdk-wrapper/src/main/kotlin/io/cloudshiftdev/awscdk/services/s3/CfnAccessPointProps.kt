@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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
 * import io.cloudshiftdev.awscdk.services.s3.*;
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
 * .vpcConfiguration(VpcConfigurationProperty.builder()
 * .vpcId("vpcId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html)
 */
public interface CfnAccessPointProps {
  /**
   * The name of the bucket associated with this access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-bucket)
   */
  public fun bucket(): String

  /**
   * The AWS account ID associated with the S3 bucket associated with this access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-bucketaccountid)
   */
  public fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()

  /**
   * The name of this access point.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for the
   * access point name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The access point policy associated with this access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-policy)
   */
  public fun policy(): Any? = unwrap(this).getPolicy()

  /**
   * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
   *
   * You can enable the configuration options in any combination. For more information about when
   * Amazon S3 considers a bucket or object public, see [The Meaning of
   * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
   * in the *Amazon S3 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-publicaccessblockconfiguration)
   */
  public fun publicAccessBlockConfiguration(): Any? =
      unwrap(this).getPublicAccessBlockConfiguration()

  /**
   * The Virtual Private Cloud (VPC) configuration for this access point, if one exists.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-vpcconfiguration)
   */
  public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

  /**
   * A builder for [CfnAccessPointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The name of the bucket associated with this access point. 
     */
    public fun bucket(bucket: String)

    /**
     * @param bucketAccountId The AWS account ID associated with the S3 bucket associated with this
     * access point.
     */
    public fun bucketAccountId(bucketAccountId: String)

    /**
     * @param name The name of this access point.
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the access point name.
     */
    public fun name(name: String)

    /**
     * @param policy The access point policy associated with this access point.
     */
    public fun policy(policy: Any)

    /**
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Amazon S3 bucket.
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     */
    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable)

    /**
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Amazon S3 bucket.
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     */
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnAccessPoint.PublicAccessBlockConfigurationProperty)

    /**
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Amazon S3 bucket.
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("564c702c108265cf01bc21711a1c41481841008d417b48addba2353645ba5fa5")
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnAccessPoint.PublicAccessBlockConfigurationProperty.Builder.() -> Unit)

    /**
     * @param vpcConfiguration The Virtual Private Cloud (VPC) configuration for this access point,
     * if one exists.
     */
    public fun vpcConfiguration(vpcConfiguration: IResolvable)

    /**
     * @param vpcConfiguration The Virtual Private Cloud (VPC) configuration for this access point,
     * if one exists.
     */
    public fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty)

    /**
     * @param vpcConfiguration The Virtual Private Cloud (VPC) configuration for this access point,
     * if one exists.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12db2d4d64eaab5c02cb014fe14c2818bbd8dc93e278ddc724465ebe849d346c")
    public
        fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnAccessPointProps.Builder =
        software.amazon.awscdk.services.s3.CfnAccessPointProps.builder()

    /**
     * @param bucket The name of the bucket associated with this access point. 
     */
    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    /**
     * @param bucketAccountId The AWS account ID associated with the S3 bucket associated with this
     * access point.
     */
    override fun bucketAccountId(bucketAccountId: String) {
      cdkBuilder.bucketAccountId(bucketAccountId)
    }

    /**
     * @param name The name of this access point.
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the access point name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param policy The access point policy associated with this access point.
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Amazon S3 bucket.
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     */
    override fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Amazon S3 bucket.
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     */
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnAccessPoint.PublicAccessBlockConfigurationProperty) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(CfnAccessPoint.PublicAccessBlockConfigurationProperty::unwrap))
    }

    /**
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Amazon S3 bucket.
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("564c702c108265cf01bc21711a1c41481841008d417b48addba2353645ba5fa5")
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnAccessPoint.PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
        Unit =
        publicAccessBlockConfiguration(CfnAccessPoint.PublicAccessBlockConfigurationProperty(publicAccessBlockConfiguration))

    /**
     * @param vpcConfiguration The Virtual Private Cloud (VPC) configuration for this access point,
     * if one exists.
     */
    override fun vpcConfiguration(vpcConfiguration: IResolvable) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param vpcConfiguration The Virtual Private Cloud (VPC) configuration for this access point,
     * if one exists.
     */
    override fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(CfnAccessPoint.VpcConfigurationProperty::unwrap))
    }

    /**
     * @param vpcConfiguration The Virtual Private Cloud (VPC) configuration for this access point,
     * if one exists.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12db2d4d64eaab5c02cb014fe14c2818bbd8dc93e278ddc724465ebe849d346c")
    override
        fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty.Builder.() -> Unit):
        Unit = vpcConfiguration(CfnAccessPoint.VpcConfigurationProperty(vpcConfiguration))

    public fun build(): software.amazon.awscdk.services.s3.CfnAccessPointProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.CfnAccessPointProps,
  ) : CdkObject(cdkObject), CfnAccessPointProps {
    /**
     * The name of the bucket associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-bucket)
     */
    override fun bucket(): String = unwrap(this).getBucket()

    /**
     * The AWS account ID associated with the S3 bucket associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-bucketaccountid)
     */
    override fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()

    /**
     * The name of this access point.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the access point name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The access point policy associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-policy)
     */
    override fun policy(): Any? = unwrap(this).getPolicy()

    /**
     * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers a bucket or object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-publicaccessblockconfiguration)
     */
    override fun publicAccessBlockConfiguration(): Any? =
        unwrap(this).getPublicAccessBlockConfiguration()

    /**
     * The Virtual Private Cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accesspoint.html#cfn-s3-accesspoint-vpcconfiguration)
     */
    override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessPointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessPointProps):
        CfnAccessPointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPointProps):
        software.amazon.awscdk.services.s3.CfnAccessPointProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.CfnAccessPointProps
  }
}
