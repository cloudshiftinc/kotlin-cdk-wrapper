@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3outposts

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::S3Outposts::AccessPoint resource specifies an access point and associates it with the
 * specified Amazon S3 on Outposts bucket.
 *
 * For more information, see [Managing data access with Amazon S3 access
 * points](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html) .
 *
 *
 * S3 on Outposts supports only VPC-style access points.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3outposts.*;
 * Object policy;
 * CfnAccessPoint cfnAccessPoint = CfnAccessPoint.Builder.create(this, "MyCfnAccessPoint")
 * .bucket("bucket")
 * .name("name")
 * .vpcConfiguration(VpcConfigurationProperty.builder()
 * .vpcId("vpcId")
 * .build())
 * // the properties below are optional
 * .policy(policy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html)
 */
public open class CfnAccessPoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3outposts.CfnAccessPoint,
) : CfnResource(cdkObject), IInspectable {
  /**
   * This resource contains the details of the S3 on Outposts bucket access point ARN.
   *
   * This resource is read-only.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Amazon Resource Name (ARN) of the S3 on Outposts bucket that is associated with this access
   * point.
   */
  public open fun bucket(): String = unwrap(this).getBucket()

  /**
   * The Amazon Resource Name (ARN) of the S3 on Outposts bucket that is associated with this access
   * point.
   */
  public open fun bucket(`value`: String) {
    unwrap(this).setBucket(`value`)
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
  public open fun name(): String = unwrap(this).getName()

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
   * The virtual private cloud (VPC) configuration for this access point, if one exists.
   */
  public open fun vpcConfiguration(): Any = unwrap(this).getVpcConfiguration()

  /**
   * The virtual private cloud (VPC) configuration for this access point, if one exists.
   */
  public open fun vpcConfiguration(`value`: IResolvable) {
    unwrap(this).setVpcConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The virtual private cloud (VPC) configuration for this access point, if one exists.
   */
  public open fun vpcConfiguration(`value`: VpcConfigurationProperty) {
    unwrap(this).setVpcConfiguration(`value`.let(VpcConfigurationProperty::unwrap))
  }

  /**
   * The virtual private cloud (VPC) configuration for this access point, if one exists.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("80240af01eeeeeb9f055a0e42db4eb9c151b604d88b6afc33dde3576f40af094")
  public open fun vpcConfiguration(`value`: VpcConfigurationProperty.Builder.() -> Unit): Unit =
      vpcConfiguration(VpcConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3outposts.CfnAccessPoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the S3 on Outposts bucket that is associated with this
     * access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-bucket)
     * @param bucket The Amazon Resource Name (ARN) of the S3 on Outposts bucket that is associated
     * with this access point. 
     */
    public fun bucket(bucket: String)

    /**
     * The name of this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-name)
     * @param name The name of this access point. 
     */
    public fun name(name: String)

    /**
     * The access point policy associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-policy)
     * @param policy The access point policy associated with this access point. 
     */
    public fun policy(policy: Any)

    /**
     * The virtual private cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-vpcconfiguration)
     * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    public fun vpcConfiguration(vpcConfiguration: IResolvable)

    /**
     * The virtual private cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-vpcconfiguration)
     * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

    /**
     * The virtual private cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-vpcconfiguration)
     * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("976c8b71b8c4dac1e1cfbe46758d9b84a482e26bcb0925e996378f22936c0789")
    public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3outposts.CfnAccessPoint.Builder =
        software.amazon.awscdk.services.s3outposts.CfnAccessPoint.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the S3 on Outposts bucket that is associated with this
     * access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-bucket)
     * @param bucket The Amazon Resource Name (ARN) of the S3 on Outposts bucket that is associated
     * with this access point. 
     */
    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    /**
     * The name of this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-name)
     * @param name The name of this access point. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The access point policy associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-policy)
     * @param policy The access point policy associated with this access point. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * The virtual private cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-vpcconfiguration)
     * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    override fun vpcConfiguration(vpcConfiguration: IResolvable) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The virtual private cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-vpcconfiguration)
     * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty::unwrap))
    }

    /**
     * The virtual private cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-vpcconfiguration)
     * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("976c8b71b8c4dac1e1cfbe46758d9b84a482e26bcb0925e996378f22936c0789")
    override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
        Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

    public fun build(): software.amazon.awscdk.services.s3outposts.CfnAccessPoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3outposts.CfnAccessPoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessPoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessPoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnAccessPoint):
        CfnAccessPoint = CfnAccessPoint(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPoint):
        software.amazon.awscdk.services.s3outposts.CfnAccessPoint = wrapped.cdkObject
  }

  /**
   * Contains the virtual private cloud (VPC) configuration for the specified access point.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3outposts.*;
   * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-accesspoint-vpcconfiguration.html)
   */
  public interface VpcConfigurationProperty {
    /**
     * Virtual Private Cloud (VPC) Id from which AccessPoint will allow requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-accesspoint-vpcconfiguration.html#cfn-s3outposts-accesspoint-vpcconfiguration-vpcid)
     */
    public fun vpcId(): String? = unwrap(this).getVpcId()

    /**
     * A builder for [VpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param vpcId Virtual Private Cloud (VPC) Id from which AccessPoint will allow requests.
       */
      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty.builder()

      /**
       * @param vpcId Virtual Private Cloud (VPC) Id from which AccessPoint will allow requests.
       */
      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build():
          software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty,
    ) : CdkObject(cdkObject), VpcConfigurationProperty {
      /**
       * Virtual Private Cloud (VPC) Id from which AccessPoint will allow requests.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-accesspoint-vpcconfiguration.html#cfn-s3outposts-accesspoint-vpcconfiguration-vpcid)
       */
      override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty):
          VpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigurationProperty):
          software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty
    }
  }
}
