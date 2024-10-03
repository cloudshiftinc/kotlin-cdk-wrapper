@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnStreamingDistribution`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnStreamingDistributionProps cfnStreamingDistributionProps =
 * CfnStreamingDistributionProps.builder()
 * .streamingDistributionConfig(StreamingDistributionConfigProperty.builder()
 * .comment("comment")
 * .enabled(false)
 * .s3Origin(S3OriginProperty.builder()
 * .domainName("domainName")
 * .originAccessIdentity("originAccessIdentity")
 * .build())
 * .trustedSigners(TrustedSignersProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .awsAccountNumbers(List.of("awsAccountNumbers"))
 * .build())
 * // the properties below are optional
 * .aliases(List.of("aliases"))
 * .logging(LoggingProperty.builder()
 * .bucket("bucket")
 * .enabled(false)
 * .prefix("prefix")
 * .build())
 * .priceClass("priceClass")
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html)
 */
public interface CfnStreamingDistributionProps {
  /**
   * The current configuration information for the RTMP distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig)
   */
  public fun streamingDistributionConfig(): Any

  /**
   * A complex type that contains zero or more `Tag` elements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnStreamingDistributionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param streamingDistributionConfig The current configuration information for the RTMP
     * distribution. 
     */
    public fun streamingDistributionConfig(streamingDistributionConfig: IResolvable)

    /**
     * @param streamingDistributionConfig The current configuration information for the RTMP
     * distribution. 
     */
    public
        fun streamingDistributionConfig(streamingDistributionConfig: CfnStreamingDistribution.StreamingDistributionConfigProperty)

    /**
     * @param streamingDistributionConfig The current configuration information for the RTMP
     * distribution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94dd962918394e1605c7052dfe34aba62dd793fb67fc2aa1f2b0c97e18585fef")
    public
        fun streamingDistributionConfig(streamingDistributionConfig: CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.() -> Unit)

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps.builder()

    /**
     * @param streamingDistributionConfig The current configuration information for the RTMP
     * distribution. 
     */
    override fun streamingDistributionConfig(streamingDistributionConfig: IResolvable) {
      cdkBuilder.streamingDistributionConfig(streamingDistributionConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param streamingDistributionConfig The current configuration information for the RTMP
     * distribution. 
     */
    override
        fun streamingDistributionConfig(streamingDistributionConfig: CfnStreamingDistribution.StreamingDistributionConfigProperty) {
      cdkBuilder.streamingDistributionConfig(streamingDistributionConfig.let(CfnStreamingDistribution.StreamingDistributionConfigProperty.Companion::unwrap))
    }

    /**
     * @param streamingDistributionConfig The current configuration information for the RTMP
     * distribution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94dd962918394e1605c7052dfe34aba62dd793fb67fc2aa1f2b0c97e18585fef")
    override
        fun streamingDistributionConfig(streamingDistributionConfig: CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.() -> Unit):
        Unit =
        streamingDistributionConfig(CfnStreamingDistribution.StreamingDistributionConfigProperty(streamingDistributionConfig))

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps,
  ) : CdkObject(cdkObject),
      CfnStreamingDistributionProps {
    /**
     * The current configuration information for the RTMP distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig)
     */
    override fun streamingDistributionConfig(): Any = unwrap(this).getStreamingDistributionConfig()

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStreamingDistributionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps):
        CfnStreamingDistributionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnStreamingDistributionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStreamingDistributionProps):
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps
  }
}
