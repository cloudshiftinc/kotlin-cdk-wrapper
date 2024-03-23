@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3outposts

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
 * import io.cloudshiftdev.awscdk.services.s3outposts.*;
 * Object policy;
 * CfnAccessPointProps cfnAccessPointProps = CfnAccessPointProps.builder()
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
public interface CfnAccessPointProps {
  /**
   * The Amazon Resource Name (ARN) of the S3 on Outposts bucket that is associated with this access
   * point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-bucket)
   */
  public fun bucket(): String

  /**
   * The name of this access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-name)
   */
  public fun name(): String

  /**
   * The access point policy associated with this access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-policy)
   */
  public fun policy(): Any? = unwrap(this).getPolicy()

  /**
   * The virtual private cloud (VPC) configuration for this access point, if one exists.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-vpcconfiguration)
   */
  public fun vpcConfiguration(): Any

  /**
   * A builder for [CfnAccessPointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The Amazon Resource Name (ARN) of the S3 on Outposts bucket that is associated
     * with this access point. 
     */
    public fun bucket(bucket: String)

    /**
     * @param name The name of this access point. 
     */
    public fun name(name: String)

    /**
     * @param policy The access point policy associated with this access point.
     */
    public fun policy(policy: Any)

    /**
     * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    public fun vpcConfiguration(vpcConfiguration: IResolvable)

    /**
     * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    public fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty)

    /**
     * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d599d4831fab54cc982cee4b3f94c758b82746f27ddcb45cff22512f9261458")
    public
        fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3outposts.CfnAccessPointProps.Builder =
        software.amazon.awscdk.services.s3outposts.CfnAccessPointProps.builder()

    /**
     * @param bucket The Amazon Resource Name (ARN) of the S3 on Outposts bucket that is associated
     * with this access point. 
     */
    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    /**
     * @param name The name of this access point. 
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
     * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    override fun vpcConfiguration(vpcConfiguration: IResolvable) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    override fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(CfnAccessPoint.VpcConfigurationProperty::unwrap))
    }

    /**
     * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point,
     * if one exists. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d599d4831fab54cc982cee4b3f94c758b82746f27ddcb45cff22512f9261458")
    override
        fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty.Builder.() -> Unit):
        Unit = vpcConfiguration(CfnAccessPoint.VpcConfigurationProperty(vpcConfiguration))

    public fun build(): software.amazon.awscdk.services.s3outposts.CfnAccessPointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3outposts.CfnAccessPointProps,
  ) : CdkObject(cdkObject), CfnAccessPointProps {
    /**
     * The Amazon Resource Name (ARN) of the S3 on Outposts bucket that is associated with this
     * access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-bucket)
     */
    override fun bucket(): String = unwrap(this).getBucket()

    /**
     * The name of this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The access point policy associated with this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-policy)
     */
    override fun policy(): Any? = unwrap(this).getPolicy()

    /**
     * The virtual private cloud (VPC) configuration for this access point, if one exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-vpcconfiguration)
     */
    override fun vpcConfiguration(): Any = unwrap(this).getVpcConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessPointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnAccessPointProps):
        CfnAccessPointProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAccessPointProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPointProps):
        software.amazon.awscdk.services.s3outposts.CfnAccessPointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3outposts.CfnAccessPointProps
  }
}
