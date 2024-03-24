@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMultiRegionAccessPoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * CfnMultiRegionAccessPointProps cfnMultiRegionAccessPointProps =
 * CfnMultiRegionAccessPointProps.builder()
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
public interface CfnMultiRegionAccessPointProps {
  /**
   * The name of the Multi-Region Access Point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The PublicAccessBlock configuration that you want to apply to this Multi-Region Access Point.
   *
   * You can enable the configuration options in any combination. For more information about when
   * Amazon S3 considers an object public, see [The Meaning of
   * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
   * in the *Amazon S3 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-publicaccessblockconfiguration)
   */
  public fun publicAccessBlockConfiguration(): Any? =
      unwrap(this).getPublicAccessBlockConfiguration()

  /**
   * A collection of the Regions and buckets associated with the Multi-Region Access Point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-regions)
   */
  public fun regions(): Any

  /**
   * A builder for [CfnMultiRegionAccessPointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the Multi-Region Access Point.
     */
    public fun name(name: String)

    /**
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Multi-Region Access Point.
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers an object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     */
    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable)

    /**
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Multi-Region Access Point.
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers an object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     */
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty)

    /**
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Multi-Region Access Point.
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers an object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7882be387743c683f416f8b4455ab6fc2f45349530c47f542634a5846c73ac4")
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty.Builder.() -> Unit)

    /**
     * @param regions A collection of the Regions and buckets associated with the Multi-Region
     * Access Point. 
     */
    public fun regions(regions: IResolvable)

    /**
     * @param regions A collection of the Regions and buckets associated with the Multi-Region
     * Access Point. 
     */
    public fun regions(regions: List<Any>)

    /**
     * @param regions A collection of the Regions and buckets associated with the Multi-Region
     * Access Point. 
     */
    public fun regions(vararg regions: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps.Builder =
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps.builder()

    /**
     * @param name The name of the Multi-Region Access Point.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Multi-Region Access Point.
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers an object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     */
    override fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Multi-Region Access Point.
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers an object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     */
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty::unwrap))
    }

    /**
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     * apply to this Multi-Region Access Point.
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers an object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7882be387743c683f416f8b4455ab6fc2f45349530c47f542634a5846c73ac4")
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
        Unit =
        publicAccessBlockConfiguration(CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty(publicAccessBlockConfiguration))

    /**
     * @param regions A collection of the Regions and buckets associated with the Multi-Region
     * Access Point. 
     */
    override fun regions(regions: IResolvable) {
      cdkBuilder.regions(regions.let(IResolvable::unwrap))
    }

    /**
     * @param regions A collection of the Regions and buckets associated with the Multi-Region
     * Access Point. 
     */
    override fun regions(regions: List<Any>) {
      cdkBuilder.regions(regions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param regions A collection of the Regions and buckets associated with the Multi-Region
     * Access Point. 
     */
    override fun regions(vararg regions: Any): Unit = regions(regions.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps,
  ) : CdkObject(cdkObject), CfnMultiRegionAccessPointProps {
    /**
     * The name of the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The PublicAccessBlock configuration that you want to apply to this Multi-Region Access Point.
     *
     * You can enable the configuration options in any combination. For more information about when
     * Amazon S3 considers an object public, see [The Meaning of
     * "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-publicaccessblockconfiguration)
     */
    override fun publicAccessBlockConfiguration(): Any? =
        unwrap(this).getPublicAccessBlockConfiguration()

    /**
     * A collection of the Regions and buckets associated with the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html#cfn-s3-multiregionaccesspoint-regions)
     */
    override fun regions(): Any = unwrap(this).getRegions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMultiRegionAccessPointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps):
        CfnMultiRegionAccessPointProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnMultiRegionAccessPointProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMultiRegionAccessPointProps):
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps
  }
}
