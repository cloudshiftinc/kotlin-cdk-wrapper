@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
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
 * This resource is deprecated.
 *
 * Amazon CloudFront is deprecating real-time messaging protocol (RTMP) distributions on December
 * 31, 2020. For more information, [read the
 * announcement](https://docs.aws.amazon.com/ann.jspa?annID=7356) on the Amazon CloudFront discussion
 * forum.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnStreamingDistribution cfnStreamingDistribution = CfnStreamingDistribution.Builder.create(this,
 * "MyCfnStreamingDistribution")
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
public open class CfnStreamingDistribution(
  cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStreamingDistributionProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStreamingDistributionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStreamingDistributionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStreamingDistributionProps(props)
  )

  /**
   * The domain name of the resource, such as `d111111abcdef8.cloudfront.net` .
   */
  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The current configuration information for the RTMP distribution.
   */
  public open fun streamingDistributionConfig(): Any = unwrap(this).getStreamingDistributionConfig()

  /**
   * The current configuration information for the RTMP distribution.
   */
  public open fun streamingDistributionConfig(`value`: IResolvable) {
    unwrap(this).setStreamingDistributionConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The current configuration information for the RTMP distribution.
   */
  public open fun streamingDistributionConfig(`value`: StreamingDistributionConfigProperty) {
    unwrap(this).setStreamingDistributionConfig(`value`.let(StreamingDistributionConfigProperty.Companion::unwrap))
  }

  /**
   * The current configuration information for the RTMP distribution.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7cb15058a414f523fe7eb5c4826cc129a779e8c2ea5fd447a001c0106893a413")
  public open
      fun streamingDistributionConfig(`value`: StreamingDistributionConfigProperty.Builder.() -> Unit):
      Unit = streamingDistributionConfig(StreamingDistributionConfigProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A complex type that contains zero or more `Tag` elements.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A complex type that contains zero or more `Tag` elements.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A complex type that contains zero or more `Tag` elements.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CfnStreamingDistribution].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The current configuration information for the RTMP distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig)
     * @param streamingDistributionConfig The current configuration information for the RTMP
     * distribution. 
     */
    public fun streamingDistributionConfig(streamingDistributionConfig: IResolvable)

    /**
     * The current configuration information for the RTMP distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig)
     * @param streamingDistributionConfig The current configuration information for the RTMP
     * distribution. 
     */
    public
        fun streamingDistributionConfig(streamingDistributionConfig: StreamingDistributionConfigProperty)

    /**
     * The current configuration information for the RTMP distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig)
     * @param streamingDistributionConfig The current configuration information for the RTMP
     * distribution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e9e247bd8e0c49394b5256d88df77e390a367befd6d78e2d0c82fd1b014d789")
    public
        fun streamingDistributionConfig(streamingDistributionConfig: StreamingDistributionConfigProperty.Builder.() -> Unit)

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.Builder =
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.Builder.create(scope,
        id)

    /**
     * The current configuration information for the RTMP distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig)
     * @param streamingDistributionConfig The current configuration information for the RTMP
     * distribution. 
     */
    override fun streamingDistributionConfig(streamingDistributionConfig: IResolvable) {
      cdkBuilder.streamingDistributionConfig(streamingDistributionConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The current configuration information for the RTMP distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig)
     * @param streamingDistributionConfig The current configuration information for the RTMP
     * distribution. 
     */
    override
        fun streamingDistributionConfig(streamingDistributionConfig: StreamingDistributionConfigProperty) {
      cdkBuilder.streamingDistributionConfig(streamingDistributionConfig.let(StreamingDistributionConfigProperty.Companion::unwrap))
    }

    /**
     * The current configuration information for the RTMP distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig)
     * @param streamingDistributionConfig The current configuration information for the RTMP
     * distribution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e9e247bd8e0c49394b5256d88df77e390a367befd6d78e2d0c82fd1b014d789")
    override
        fun streamingDistributionConfig(streamingDistributionConfig: StreamingDistributionConfigProperty.Builder.() -> Unit):
        Unit =
        streamingDistributionConfig(StreamingDistributionConfigProperty(streamingDistributionConfig))

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStreamingDistribution {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStreamingDistribution(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution):
        CfnStreamingDistribution = CfnStreamingDistribution(cdkObject)

    internal fun unwrap(wrapped: CfnStreamingDistribution):
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution
  }

  /**
   * A complex type that controls whether access logs are written for the streaming distribution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * LoggingProperty loggingProperty = LoggingProperty.builder()
   * .bucket("bucket")
   * .enabled(false)
   * .prefix("prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html)
   */
  public interface LoggingProperty {
    /**
     * The Amazon S3 bucket to store the access logs in, for example,
     * `amzn-s3-demo-bucket.s3.amazonaws.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-bucket)
     */
    public fun bucket(): String

    /**
     * Specifies whether you want CloudFront to save access logs to an Amazon S3 bucket.
     *
     * If you don't want to enable logging when you create a streaming distribution or if you want
     * to disable logging for an existing streaming distribution, specify `false` for `Enabled` , and
     * specify `empty Bucket` and `Prefix` elements. If you specify `false` for `Enabled` but you
     * specify values for `Bucket` and `Prefix` , the values are automatically deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-enabled)
     */
    public fun enabled(): Any

    /**
     * An optional string that you want CloudFront to prefix to the access log filenames for this
     * streaming distribution, for example, `myprefix/` .
     *
     * If you want to enable logging, but you don't want to specify a prefix, you still must include
     * an empty `Prefix` element in the `Logging` element.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-prefix)
     */
    public fun prefix(): String

    /**
     * A builder for [LoggingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The Amazon S3 bucket to store the access logs in, for example,
       * `amzn-s3-demo-bucket.s3.amazonaws.com` . 
       */
      public fun bucket(bucket: String)

      /**
       * @param enabled Specifies whether you want CloudFront to save access logs to an Amazon S3
       * bucket. 
       * If you don't want to enable logging when you create a streaming distribution or if you want
       * to disable logging for an existing streaming distribution, specify `false` for `Enabled` , and
       * specify `empty Bucket` and `Prefix` elements. If you specify `false` for `Enabled` but you
       * specify values for `Bucket` and `Prefix` , the values are automatically deleted.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specifies whether you want CloudFront to save access logs to an Amazon S3
       * bucket. 
       * If you don't want to enable logging when you create a streaming distribution or if you want
       * to disable logging for an existing streaming distribution, specify `false` for `Enabled` , and
       * specify `empty Bucket` and `Prefix` elements. If you specify `false` for `Enabled` but you
       * specify values for `Bucket` and `Prefix` , the values are automatically deleted.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param prefix An optional string that you want CloudFront to prefix to the access log
       * filenames for this streaming distribution, for example, `myprefix/` . 
       * If you want to enable logging, but you don't want to specify a prefix, you still must
       * include an empty `Prefix` element in the `Logging` element.
       */
      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty.builder()

      /**
       * @param bucket The Amazon S3 bucket to store the access logs in, for example,
       * `amzn-s3-demo-bucket.s3.amazonaws.com` . 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param enabled Specifies whether you want CloudFront to save access logs to an Amazon S3
       * bucket. 
       * If you don't want to enable logging when you create a streaming distribution or if you want
       * to disable logging for an existing streaming distribution, specify `false` for `Enabled` , and
       * specify `empty Bucket` and `Prefix` elements. If you specify `false` for `Enabled` but you
       * specify values for `Bucket` and `Prefix` , the values are automatically deleted.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specifies whether you want CloudFront to save access logs to an Amazon S3
       * bucket. 
       * If you don't want to enable logging when you create a streaming distribution or if you want
       * to disable logging for an existing streaming distribution, specify `false` for `Enabled` , and
       * specify `empty Bucket` and `Prefix` elements. If you specify `false` for `Enabled` but you
       * specify values for `Bucket` and `Prefix` , the values are automatically deleted.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param prefix An optional string that you want CloudFront to prefix to the access log
       * filenames for this streaming distribution, for example, `myprefix/` . 
       * If you want to enable logging, but you don't want to specify a prefix, you still must
       * include an empty `Prefix` element in the `Logging` element.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty,
    ) : CdkObject(cdkObject),
        LoggingProperty {
      /**
       * The Amazon S3 bucket to store the access logs in, for example,
       * `amzn-s3-demo-bucket.s3.amazonaws.com` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * Specifies whether you want CloudFront to save access logs to an Amazon S3 bucket.
       *
       * If you don't want to enable logging when you create a streaming distribution or if you want
       * to disable logging for an existing streaming distribution, specify `false` for `Enabled` , and
       * specify `empty Bucket` and `Prefix` elements. If you specify `false` for `Enabled` but you
       * specify values for `Bucket` and `Prefix` , the values are automatically deleted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * An optional string that you want CloudFront to prefix to the access log filenames for this
       * streaming distribution, for example, `myprefix/` .
       *
       * If you want to enable logging, but you don't want to specify a prefix, you still must
       * include an empty `Prefix` element in the `Logging` element.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-prefix)
       */
      override fun prefix(): String = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty):
          LoggingProperty = CdkObjectWrappers.wrap(cdkObject) as? LoggingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingProperty):
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty
    }
  }

  /**
   * A complex type that contains information about the Amazon S3 bucket from which you want
   * CloudFront to get your media files for distribution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * S3OriginProperty s3OriginProperty = S3OriginProperty.builder()
   * .domainName("domainName")
   * .originAccessIdentity("originAccessIdentity")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html)
   */
  public interface S3OriginProperty {
    /**
     * The DNS name of the Amazon S3 origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-domainname)
     */
    public fun domainName(): String

    /**
     * The CloudFront origin access identity to associate with the distribution.
     *
     * Use an origin access identity to configure the distribution so that end users can only access
     * objects in an Amazon S3 bucket through CloudFront.
     *
     * If you want end users to be able to access objects using either the CloudFront URL or the
     * Amazon S3 URL, specify an empty `OriginAccessIdentity` element.
     *
     * To delete the origin access identity from an existing distribution, update the distribution
     * configuration and include an empty `OriginAccessIdentity` element.
     *
     * To replace the origin access identity, update the distribution configuration and specify the
     * new origin access identity.
     *
     * For more information, see [Using an Origin Access Identity to Restrict Access to Your Amazon
     * S3
     * Content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-originaccessidentity)
     */
    public fun originAccessIdentity(): String

    /**
     * A builder for [S3OriginProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param domainName The DNS name of the Amazon S3 origin. 
       */
      public fun domainName(domainName: String)

      /**
       * @param originAccessIdentity The CloudFront origin access identity to associate with the
       * distribution. 
       * Use an origin access identity to configure the distribution so that end users can only
       * access objects in an Amazon S3 bucket through CloudFront.
       *
       * If you want end users to be able to access objects using either the CloudFront URL or the
       * Amazon S3 URL, specify an empty `OriginAccessIdentity` element.
       *
       * To delete the origin access identity from an existing distribution, update the distribution
       * configuration and include an empty `OriginAccessIdentity` element.
       *
       * To replace the origin access identity, update the distribution configuration and specify
       * the new origin access identity.
       *
       * For more information, see [Using an Origin Access Identity to Restrict Access to Your
       * Amazon S3
       * Content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originAccessIdentity(originAccessIdentity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty.builder()

      /**
       * @param domainName The DNS name of the Amazon S3 origin. 
       */
      override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      /**
       * @param originAccessIdentity The CloudFront origin access identity to associate with the
       * distribution. 
       * Use an origin access identity to configure the distribution so that end users can only
       * access objects in an Amazon S3 bucket through CloudFront.
       *
       * If you want end users to be able to access objects using either the CloudFront URL or the
       * Amazon S3 URL, specify an empty `OriginAccessIdentity` element.
       *
       * To delete the origin access identity from an existing distribution, update the distribution
       * configuration and include an empty `OriginAccessIdentity` element.
       *
       * To replace the origin access identity, update the distribution configuration and specify
       * the new origin access identity.
       *
       * For more information, see [Using an Origin Access Identity to Restrict Access to Your
       * Amazon S3
       * Content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originAccessIdentity(originAccessIdentity: String) {
        cdkBuilder.originAccessIdentity(originAccessIdentity)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty,
    ) : CdkObject(cdkObject),
        S3OriginProperty {
      /**
       * The DNS name of the Amazon S3 origin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-domainname)
       */
      override fun domainName(): String = unwrap(this).getDomainName()

      /**
       * The CloudFront origin access identity to associate with the distribution.
       *
       * Use an origin access identity to configure the distribution so that end users can only
       * access objects in an Amazon S3 bucket through CloudFront.
       *
       * If you want end users to be able to access objects using either the CloudFront URL or the
       * Amazon S3 URL, specify an empty `OriginAccessIdentity` element.
       *
       * To delete the origin access identity from an existing distribution, update the distribution
       * configuration and include an empty `OriginAccessIdentity` element.
       *
       * To replace the origin access identity, update the distribution configuration and specify
       * the new origin access identity.
       *
       * For more information, see [Using an Origin Access Identity to Restrict Access to Your
       * Amazon S3
       * Content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-originaccessidentity)
       */
      override fun originAccessIdentity(): String = unwrap(this).getOriginAccessIdentity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3OriginProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty):
          S3OriginProperty = CdkObjectWrappers.wrap(cdkObject) as? S3OriginProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OriginProperty):
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty
    }
  }

  /**
   * The RTMP distribution's configuration information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * StreamingDistributionConfigProperty streamingDistributionConfigProperty =
   * StreamingDistributionConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html)
   */
  public interface StreamingDistributionConfigProperty {
    /**
     * A complex type that contains information about CNAMEs (alternate domain names), if any, for
     * this streaming distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-aliases)
     */
    public fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

    /**
     * Any comments you want to include about the streaming distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-comment)
     */
    public fun comment(): String

    /**
     * Whether the streaming distribution is enabled to accept user requests for content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-enabled)
     */
    public fun enabled(): Any

    /**
     * A complex type that controls whether access logs are written for the streaming distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-logging)
     */
    public fun logging(): Any? = unwrap(this).getLogging()

    /**
     * A complex type that contains information about price class for this streaming distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-priceclass)
     */
    public fun priceClass(): String? = unwrap(this).getPriceClass()

    /**
     * A complex type that contains information about the Amazon S3 bucket from which you want
     * CloudFront to get your media files for distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-s3origin)
     */
    public fun s3Origin(): Any

    /**
     * A complex type that specifies any AWS accounts that you want to permit to create signed URLs
     * for private content.
     *
     * If you want the distribution to use signed URLs, include this element; if you want the
     * distribution to use public URLs, remove this element. For more information, see [Serving Private
     * Content through
     * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-trustedsigners)
     */
    public fun trustedSigners(): Any

    /**
     * A builder for [StreamingDistributionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aliases A complex type that contains information about CNAMEs (alternate domain
       * names), if any, for this streaming distribution.
       */
      public fun aliases(aliases: List<String>)

      /**
       * @param aliases A complex type that contains information about CNAMEs (alternate domain
       * names), if any, for this streaming distribution.
       */
      public fun aliases(vararg aliases: String)

      /**
       * @param comment Any comments you want to include about the streaming distribution. 
       */
      public fun comment(comment: String)

      /**
       * @param enabled Whether the streaming distribution is enabled to accept user requests for
       * content. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Whether the streaming distribution is enabled to accept user requests for
       * content. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param logging A complex type that controls whether access logs are written for the
       * streaming distribution.
       */
      public fun logging(logging: IResolvable)

      /**
       * @param logging A complex type that controls whether access logs are written for the
       * streaming distribution.
       */
      public fun logging(logging: LoggingProperty)

      /**
       * @param logging A complex type that controls whether access logs are written for the
       * streaming distribution.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2f86d3e1713c896fb6b6048a204745494e4f7ad2e124a1ed4e078c164c50efe")
      public fun logging(logging: LoggingProperty.Builder.() -> Unit)

      /**
       * @param priceClass A complex type that contains information about price class for this
       * streaming distribution.
       */
      public fun priceClass(priceClass: String)

      /**
       * @param s3Origin A complex type that contains information about the Amazon S3 bucket from
       * which you want CloudFront to get your media files for distribution. 
       */
      public fun s3Origin(s3Origin: IResolvable)

      /**
       * @param s3Origin A complex type that contains information about the Amazon S3 bucket from
       * which you want CloudFront to get your media files for distribution. 
       */
      public fun s3Origin(s3Origin: S3OriginProperty)

      /**
       * @param s3Origin A complex type that contains information about the Amazon S3 bucket from
       * which you want CloudFront to get your media files for distribution. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4c12f2c7ecb120a8392f852fb6f6fbdb57dd7fbeb250122704d188034199aea")
      public fun s3Origin(s3Origin: S3OriginProperty.Builder.() -> Unit)

      /**
       * @param trustedSigners A complex type that specifies any AWS accounts that you want to
       * permit to create signed URLs for private content. 
       * If you want the distribution to use signed URLs, include this element; if you want the
       * distribution to use public URLs, remove this element. For more information, see [Serving
       * Private Content through
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun trustedSigners(trustedSigners: IResolvable)

      /**
       * @param trustedSigners A complex type that specifies any AWS accounts that you want to
       * permit to create signed URLs for private content. 
       * If you want the distribution to use signed URLs, include this element; if you want the
       * distribution to use public URLs, remove this element. For more information, see [Serving
       * Private Content through
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun trustedSigners(trustedSigners: TrustedSignersProperty)

      /**
       * @param trustedSigners A complex type that specifies any AWS accounts that you want to
       * permit to create signed URLs for private content. 
       * If you want the distribution to use signed URLs, include this element; if you want the
       * distribution to use public URLs, remove this element. For more information, see [Serving
       * Private Content through
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("743ef977a158c5f6c2f051d502ab89211e8cda4e0e8658699025623e3dd74121")
      public fun trustedSigners(trustedSigners: TrustedSignersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.builder()

      /**
       * @param aliases A complex type that contains information about CNAMEs (alternate domain
       * names), if any, for this streaming distribution.
       */
      override fun aliases(aliases: List<String>) {
        cdkBuilder.aliases(aliases)
      }

      /**
       * @param aliases A complex type that contains information about CNAMEs (alternate domain
       * names), if any, for this streaming distribution.
       */
      override fun aliases(vararg aliases: String): Unit = aliases(aliases.toList())

      /**
       * @param comment Any comments you want to include about the streaming distribution. 
       */
      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      /**
       * @param enabled Whether the streaming distribution is enabled to accept user requests for
       * content. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Whether the streaming distribution is enabled to accept user requests for
       * content. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param logging A complex type that controls whether access logs are written for the
       * streaming distribution.
       */
      override fun logging(logging: IResolvable) {
        cdkBuilder.logging(logging.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param logging A complex type that controls whether access logs are written for the
       * streaming distribution.
       */
      override fun logging(logging: LoggingProperty) {
        cdkBuilder.logging(logging.let(LoggingProperty.Companion::unwrap))
      }

      /**
       * @param logging A complex type that controls whether access logs are written for the
       * streaming distribution.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2f86d3e1713c896fb6b6048a204745494e4f7ad2e124a1ed4e078c164c50efe")
      override fun logging(logging: LoggingProperty.Builder.() -> Unit): Unit =
          logging(LoggingProperty(logging))

      /**
       * @param priceClass A complex type that contains information about price class for this
       * streaming distribution.
       */
      override fun priceClass(priceClass: String) {
        cdkBuilder.priceClass(priceClass)
      }

      /**
       * @param s3Origin A complex type that contains information about the Amazon S3 bucket from
       * which you want CloudFront to get your media files for distribution. 
       */
      override fun s3Origin(s3Origin: IResolvable) {
        cdkBuilder.s3Origin(s3Origin.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3Origin A complex type that contains information about the Amazon S3 bucket from
       * which you want CloudFront to get your media files for distribution. 
       */
      override fun s3Origin(s3Origin: S3OriginProperty) {
        cdkBuilder.s3Origin(s3Origin.let(S3OriginProperty.Companion::unwrap))
      }

      /**
       * @param s3Origin A complex type that contains information about the Amazon S3 bucket from
       * which you want CloudFront to get your media files for distribution. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4c12f2c7ecb120a8392f852fb6f6fbdb57dd7fbeb250122704d188034199aea")
      override fun s3Origin(s3Origin: S3OriginProperty.Builder.() -> Unit): Unit =
          s3Origin(S3OriginProperty(s3Origin))

      /**
       * @param trustedSigners A complex type that specifies any AWS accounts that you want to
       * permit to create signed URLs for private content. 
       * If you want the distribution to use signed URLs, include this element; if you want the
       * distribution to use public URLs, remove this element. For more information, see [Serving
       * Private Content through
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun trustedSigners(trustedSigners: IResolvable) {
        cdkBuilder.trustedSigners(trustedSigners.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param trustedSigners A complex type that specifies any AWS accounts that you want to
       * permit to create signed URLs for private content. 
       * If you want the distribution to use signed URLs, include this element; if you want the
       * distribution to use public URLs, remove this element. For more information, see [Serving
       * Private Content through
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun trustedSigners(trustedSigners: TrustedSignersProperty) {
        cdkBuilder.trustedSigners(trustedSigners.let(TrustedSignersProperty.Companion::unwrap))
      }

      /**
       * @param trustedSigners A complex type that specifies any AWS accounts that you want to
       * permit to create signed URLs for private content. 
       * If you want the distribution to use signed URLs, include this element; if you want the
       * distribution to use public URLs, remove this element. For more information, see [Serving
       * Private Content through
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("743ef977a158c5f6c2f051d502ab89211e8cda4e0e8658699025623e3dd74121")
      override fun trustedSigners(trustedSigners: TrustedSignersProperty.Builder.() -> Unit): Unit =
          trustedSigners(TrustedSignersProperty(trustedSigners))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty,
    ) : CdkObject(cdkObject),
        StreamingDistributionConfigProperty {
      /**
       * A complex type that contains information about CNAMEs (alternate domain names), if any, for
       * this streaming distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-aliases)
       */
      override fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

      /**
       * Any comments you want to include about the streaming distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-comment)
       */
      override fun comment(): String = unwrap(this).getComment()

      /**
       * Whether the streaming distribution is enabled to accept user requests for content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * A complex type that controls whether access logs are written for the streaming
       * distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-logging)
       */
      override fun logging(): Any? = unwrap(this).getLogging()

      /**
       * A complex type that contains information about price class for this streaming distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-priceclass)
       */
      override fun priceClass(): String? = unwrap(this).getPriceClass()

      /**
       * A complex type that contains information about the Amazon S3 bucket from which you want
       * CloudFront to get your media files for distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-s3origin)
       */
      override fun s3Origin(): Any = unwrap(this).getS3Origin()

      /**
       * A complex type that specifies any AWS accounts that you want to permit to create signed
       * URLs for private content.
       *
       * If you want the distribution to use signed URLs, include this element; if you want the
       * distribution to use public URLs, remove this element. For more information, see [Serving
       * Private Content through
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-trustedsigners)
       */
      override fun trustedSigners(): Any = unwrap(this).getTrustedSigners()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StreamingDistributionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty):
          StreamingDistributionConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StreamingDistributionConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamingDistributionConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty
    }
  }

  /**
   * A list of AWS accounts whose public keys CloudFront can use to verify the signatures of signed
   * URLs and signed cookies.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * TrustedSignersProperty trustedSignersProperty = TrustedSignersProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .awsAccountNumbers(List.of("awsAccountNumbers"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html)
   */
  public interface TrustedSignersProperty {
    /**
     * An AWS account number that contains active CloudFront key pairs that CloudFront can use to
     * verify the signatures of signed URLs and signed cookies.
     *
     * If the AWS account that owns the key pairs is the same account that owns the CloudFront
     * distribution, the value of this field is `self` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-awsaccountnumbers)
     */
    public fun awsAccountNumbers(): List<String> = unwrap(this).getAwsAccountNumbers() ?:
        emptyList()

    /**
     * This field is `true` if any of the AWS accounts in the list are configured as trusted
     * signers.
     *
     * If not, this field is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [TrustedSignersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsAccountNumbers An AWS account number that contains active CloudFront key pairs
       * that CloudFront can use to verify the signatures of signed URLs and signed cookies.
       * If the AWS account that owns the key pairs is the same account that owns the CloudFront
       * distribution, the value of this field is `self` .
       */
      public fun awsAccountNumbers(awsAccountNumbers: List<String>)

      /**
       * @param awsAccountNumbers An AWS account number that contains active CloudFront key pairs
       * that CloudFront can use to verify the signatures of signed URLs and signed cookies.
       * If the AWS account that owns the key pairs is the same account that owns the CloudFront
       * distribution, the value of this field is `self` .
       */
      public fun awsAccountNumbers(vararg awsAccountNumbers: String)

      /**
       * @param enabled This field is `true` if any of the AWS accounts in the list are configured
       * as trusted signers. 
       * If not, this field is `false` .
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled This field is `true` if any of the AWS accounts in the list are configured
       * as trusted signers. 
       * If not, this field is `false` .
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty.builder()

      /**
       * @param awsAccountNumbers An AWS account number that contains active CloudFront key pairs
       * that CloudFront can use to verify the signatures of signed URLs and signed cookies.
       * If the AWS account that owns the key pairs is the same account that owns the CloudFront
       * distribution, the value of this field is `self` .
       */
      override fun awsAccountNumbers(awsAccountNumbers: List<String>) {
        cdkBuilder.awsAccountNumbers(awsAccountNumbers)
      }

      /**
       * @param awsAccountNumbers An AWS account number that contains active CloudFront key pairs
       * that CloudFront can use to verify the signatures of signed URLs and signed cookies.
       * If the AWS account that owns the key pairs is the same account that owns the CloudFront
       * distribution, the value of this field is `self` .
       */
      override fun awsAccountNumbers(vararg awsAccountNumbers: String): Unit =
          awsAccountNumbers(awsAccountNumbers.toList())

      /**
       * @param enabled This field is `true` if any of the AWS accounts in the list are configured
       * as trusted signers. 
       * If not, this field is `false` .
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled This field is `true` if any of the AWS accounts in the list are configured
       * as trusted signers. 
       * If not, this field is `false` .
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty,
    ) : CdkObject(cdkObject),
        TrustedSignersProperty {
      /**
       * An AWS account number that contains active CloudFront key pairs that CloudFront can use to
       * verify the signatures of signed URLs and signed cookies.
       *
       * If the AWS account that owns the key pairs is the same account that owns the CloudFront
       * distribution, the value of this field is `self` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-awsaccountnumbers)
       */
      override fun awsAccountNumbers(): List<String> = unwrap(this).getAwsAccountNumbers() ?:
          emptyList()

      /**
       * This field is `true` if any of the AWS accounts in the list are configured as trusted
       * signers.
       *
       * If not, this field is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html#cfn-cloudfront-streamingdistribution-trustedsigners-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrustedSignersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty):
          TrustedSignersProperty = CdkObjectWrappers.wrap(cdkObject) as? TrustedSignersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrustedSignersProperty):
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty
    }
  }
}
