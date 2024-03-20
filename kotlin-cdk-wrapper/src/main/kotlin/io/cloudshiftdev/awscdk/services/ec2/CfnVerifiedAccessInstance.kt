@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

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
 * An AWS Verified Access instance is a regional entity that evaluates application requests and
 * grants access only when your security requirements are met.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVerifiedAccessInstance cfnVerifiedAccessInstance =
 * CfnVerifiedAccessInstance.Builder.create(this, "MyCfnVerifiedAccessInstance")
 * .description("description")
 * .fipsEnabled(false)
 * .loggingConfigurations(VerifiedAccessLogsProperty.builder()
 * .cloudWatchLogs(CloudWatchLogsProperty.builder()
 * .enabled(false)
 * .logGroup("logGroup")
 * .build())
 * .includeTrustContext(false)
 * .kinesisDataFirehose(KinesisDataFirehoseProperty.builder()
 * .deliveryStream("deliveryStream")
 * .enabled(false)
 * .build())
 * .logVersion("logVersion")
 * .s3(S3Property.builder()
 * .bucketName("bucketName")
 * .bucketOwner("bucketOwner")
 * .enabled(false)
 * .prefix("prefix")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .verifiedAccessTrustProviderIds(List.of("verifiedAccessTrustProviderIds"))
 * .verifiedAccessTrustProviders(List.of(VerifiedAccessTrustProviderProperty.builder()
 * .description("description")
 * .deviceTrustProviderType("deviceTrustProviderType")
 * .trustProviderType("trustProviderType")
 * .userTrustProviderType("userTrustProviderType")
 * .verifiedAccessTrustProviderId("verifiedAccessTrustProviderId")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html)
 */
public open class CfnVerifiedAccessInstance internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVerifiedAccessInstanceProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnVerifiedAccessInstanceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVerifiedAccessInstanceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVerifiedAccessInstanceProps(props)
  )

  /**
   * The creation time.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The last updated time.
   */
  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  /**
   * The ID of the Verified Access instance.
   */
  public open fun attrVerifiedAccessInstanceId(): String =
      unwrap(this).getAttrVerifiedAccessInstanceId()

  /**
   * A description for the AWS Verified Access instance.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the AWS Verified Access instance.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Indicates whether support for Federal Information Processing Standards (FIPS) is enabled on the
   * instance.
   */
  public open fun fipsEnabled(): Any? = unwrap(this).getFipsEnabled()

  /**
   * Indicates whether support for Federal Information Processing Standards (FIPS) is enabled on the
   * instance.
   */
  public open fun fipsEnabled(`value`: Boolean) {
    unwrap(this).setFipsEnabled(`value`)
  }

  /**
   * Indicates whether support for Federal Information Processing Standards (FIPS) is enabled on the
   * instance.
   */
  public open fun fipsEnabled(`value`: IResolvable) {
    unwrap(this).setFipsEnabled(`value`.let(IResolvable::unwrap))
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
   * The logging configuration for the Verified Access instances.
   */
  public open fun loggingConfigurations(): Any? = unwrap(this).getLoggingConfigurations()

  /**
   * The logging configuration for the Verified Access instances.
   */
  public open fun loggingConfigurations(`value`: IResolvable) {
    unwrap(this).setLoggingConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * The logging configuration for the Verified Access instances.
   */
  public open fun loggingConfigurations(`value`: VerifiedAccessLogsProperty) {
    unwrap(this).setLoggingConfigurations(`value`.let(VerifiedAccessLogsProperty::unwrap))
  }

  /**
   * The logging configuration for the Verified Access instances.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c5e806110dd174bbb0e8f423cf5f9572d6f877d3f7eef6312dd126d303a8077")
  public open fun loggingConfigurations(`value`: VerifiedAccessLogsProperty.Builder.() -> Unit):
      Unit = loggingConfigurations(VerifiedAccessLogsProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The IDs of the AWS Verified Access trust providers.
   */
  public open fun verifiedAccessTrustProviderIds(): List<String> =
      unwrap(this).getVerifiedAccessTrustProviderIds() ?: emptyList()

  /**
   * The IDs of the AWS Verified Access trust providers.
   */
  public open fun verifiedAccessTrustProviderIds(`value`: List<String>) {
    unwrap(this).setVerifiedAccessTrustProviderIds(`value`)
  }

  /**
   * The IDs of the AWS Verified Access trust providers.
   */
  public open fun verifiedAccessTrustProviderIds(vararg `value`: String): Unit =
      verifiedAccessTrustProviderIds(`value`.toList())

  /**
   * The IDs of the AWS Verified Access trust providers.
   */
  public open fun verifiedAccessTrustProviders(): Any? =
      unwrap(this).getVerifiedAccessTrustProviders()

  /**
   * The IDs of the AWS Verified Access trust providers.
   */
  public open fun verifiedAccessTrustProviders(`value`: IResolvable) {
    unwrap(this).setVerifiedAccessTrustProviders(`value`.let(IResolvable::unwrap))
  }

  /**
   * The IDs of the AWS Verified Access trust providers.
   */
  public open fun verifiedAccessTrustProviders(`value`: List<Any>) {
    unwrap(this).setVerifiedAccessTrustProviders(`value`)
  }

  /**
   * The IDs of the AWS Verified Access trust providers.
   */
  public open fun verifiedAccessTrustProviders(vararg `value`: Any): Unit =
      verifiedAccessTrustProviders(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVerifiedAccessInstance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the AWS Verified Access instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-description)
     * @param description A description for the AWS Verified Access instance. 
     */
    public fun description(description: String)

    /**
     * Indicates whether support for Federal Information Processing Standards (FIPS) is enabled on
     * the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-fipsenabled)
     * @param fipsEnabled Indicates whether support for Federal Information Processing Standards
     * (FIPS) is enabled on the instance. 
     */
    public fun fipsEnabled(fipsEnabled: Boolean)

    /**
     * Indicates whether support for Federal Information Processing Standards (FIPS) is enabled on
     * the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-fipsenabled)
     * @param fipsEnabled Indicates whether support for Federal Information Processing Standards
     * (FIPS) is enabled on the instance. 
     */
    public fun fipsEnabled(fipsEnabled: IResolvable)

    /**
     * The logging configuration for the Verified Access instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-loggingconfigurations)
     * @param loggingConfigurations The logging configuration for the Verified Access instances. 
     */
    public fun loggingConfigurations(loggingConfigurations: IResolvable)

    /**
     * The logging configuration for the Verified Access instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-loggingconfigurations)
     * @param loggingConfigurations The logging configuration for the Verified Access instances. 
     */
    public fun loggingConfigurations(loggingConfigurations: VerifiedAccessLogsProperty)

    /**
     * The logging configuration for the Verified Access instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-loggingconfigurations)
     * @param loggingConfigurations The logging configuration for the Verified Access instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99df720468d1e979b85ec3ee08dff0ce186fbc0bbf564c059bf72d92494764a8")
    public
        fun loggingConfigurations(loggingConfigurations: VerifiedAccessLogsProperty.Builder.() -> Unit)

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-tags)
     * @param tags The tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-tags)
     * @param tags The tags. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviderids)
     * @param verifiedAccessTrustProviderIds The IDs of the AWS Verified Access trust providers. 
     */
    public fun verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds: List<String>)

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviderids)
     * @param verifiedAccessTrustProviderIds The IDs of the AWS Verified Access trust providers. 
     */
    public fun verifiedAccessTrustProviderIds(vararg verifiedAccessTrustProviderIds: String)

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviders)
     * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers. 
     */
    public fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: IResolvable)

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviders)
     * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers. 
     */
    public fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: List<Any>)

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviders)
     * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers. 
     */
    public fun verifiedAccessTrustProviders(vararg verifiedAccessTrustProviders: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.Builder =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.Builder.create(scope, id)

    /**
     * A description for the AWS Verified Access instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-description)
     * @param description A description for the AWS Verified Access instance. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Indicates whether support for Federal Information Processing Standards (FIPS) is enabled on
     * the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-fipsenabled)
     * @param fipsEnabled Indicates whether support for Federal Information Processing Standards
     * (FIPS) is enabled on the instance. 
     */
    override fun fipsEnabled(fipsEnabled: Boolean) {
      cdkBuilder.fipsEnabled(fipsEnabled)
    }

    /**
     * Indicates whether support for Federal Information Processing Standards (FIPS) is enabled on
     * the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-fipsenabled)
     * @param fipsEnabled Indicates whether support for Federal Information Processing Standards
     * (FIPS) is enabled on the instance. 
     */
    override fun fipsEnabled(fipsEnabled: IResolvable) {
      cdkBuilder.fipsEnabled(fipsEnabled.let(IResolvable::unwrap))
    }

    /**
     * The logging configuration for the Verified Access instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-loggingconfigurations)
     * @param loggingConfigurations The logging configuration for the Verified Access instances. 
     */
    override fun loggingConfigurations(loggingConfigurations: IResolvable) {
      cdkBuilder.loggingConfigurations(loggingConfigurations.let(IResolvable::unwrap))
    }

    /**
     * The logging configuration for the Verified Access instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-loggingconfigurations)
     * @param loggingConfigurations The logging configuration for the Verified Access instances. 
     */
    override fun loggingConfigurations(loggingConfigurations: VerifiedAccessLogsProperty) {
      cdkBuilder.loggingConfigurations(loggingConfigurations.let(VerifiedAccessLogsProperty::unwrap))
    }

    /**
     * The logging configuration for the Verified Access instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-loggingconfigurations)
     * @param loggingConfigurations The logging configuration for the Verified Access instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99df720468d1e979b85ec3ee08dff0ce186fbc0bbf564c059bf72d92494764a8")
    override
        fun loggingConfigurations(loggingConfigurations: VerifiedAccessLogsProperty.Builder.() -> Unit):
        Unit = loggingConfigurations(VerifiedAccessLogsProperty(loggingConfigurations))

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-tags)
     * @param tags The tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-tags)
     * @param tags The tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviderids)
     * @param verifiedAccessTrustProviderIds The IDs of the AWS Verified Access trust providers. 
     */
    override fun verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds: List<String>) {
      cdkBuilder.verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds)
    }

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviderids)
     * @param verifiedAccessTrustProviderIds The IDs of the AWS Verified Access trust providers. 
     */
    override fun verifiedAccessTrustProviderIds(vararg verifiedAccessTrustProviderIds: String): Unit
        = verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds.toList())

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviders)
     * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers. 
     */
    override fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: IResolvable) {
      cdkBuilder.verifiedAccessTrustProviders(verifiedAccessTrustProviders.let(IResolvable::unwrap))
    }

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviders)
     * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers. 
     */
    override fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: List<Any>) {
      cdkBuilder.verifiedAccessTrustProviders(verifiedAccessTrustProviders)
    }

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviders)
     * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers. 
     */
    override fun verifiedAccessTrustProviders(vararg verifiedAccessTrustProviders: Any): Unit =
        verifiedAccessTrustProviders(verifiedAccessTrustProviders.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVerifiedAccessInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVerifiedAccessInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance):
        CfnVerifiedAccessInstance = CfnVerifiedAccessInstance(cdkObject)

    internal fun unwrap(wrapped: CfnVerifiedAccessInstance):
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance = wrapped.cdkObject
  }

  /**
   * Describes the options for Verified Access logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * VerifiedAccessLogsProperty verifiedAccessLogsProperty = VerifiedAccessLogsProperty.builder()
   * .cloudWatchLogs(CloudWatchLogsProperty.builder()
   * .enabled(false)
   * .logGroup("logGroup")
   * .build())
   * .includeTrustContext(false)
   * .kinesisDataFirehose(KinesisDataFirehoseProperty.builder()
   * .deliveryStream("deliveryStream")
   * .enabled(false)
   * .build())
   * .logVersion("logVersion")
   * .s3(S3Property.builder()
   * .bucketName("bucketName")
   * .bucketOwner("bucketOwner")
   * .enabled(false)
   * .prefix("prefix")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesslogs.html)
   */
  public interface VerifiedAccessLogsProperty {
    /**
     * CloudWatch Logs logging destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesslogs.html#cfn-ec2-verifiedaccessinstance-verifiedaccesslogs-cloudwatchlogs)
     */
    public fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

    /**
     * Indicates whether to include trust data sent by trust providers in the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesslogs.html#cfn-ec2-verifiedaccessinstance-verifiedaccesslogs-includetrustcontext)
     */
    public fun includeTrustContext(): Any? = unwrap(this).getIncludeTrustContext()

    /**
     * Kinesis logging destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesslogs.html#cfn-ec2-verifiedaccessinstance-verifiedaccesslogs-kinesisdatafirehose)
     */
    public fun kinesisDataFirehose(): Any? = unwrap(this).getKinesisDataFirehose()

    /**
     * The logging version.
     *
     * Valid values: `ocsf-0.1` | `ocsf-1.0.0-rc.2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesslogs.html#cfn-ec2-verifiedaccessinstance-verifiedaccesslogs-logversion)
     */
    public fun logVersion(): String? = unwrap(this).getLogVersion()

    /**
     * Amazon S3 logging options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesslogs.html#cfn-ec2-verifiedaccessinstance-verifiedaccesslogs-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * A builder for [VerifiedAccessLogsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogs CloudWatch Logs logging destination.
       */
      public fun cloudWatchLogs(cloudWatchLogs: IResolvable)

      /**
       * @param cloudWatchLogs CloudWatch Logs logging destination.
       */
      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty)

      /**
       * @param cloudWatchLogs CloudWatch Logs logging destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39b540269ddc0fae51ac097e3797d65413d3ae85ee6b5395fa380bbb12a67c60")
      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty.Builder.() -> Unit)

      /**
       * @param includeTrustContext Indicates whether to include trust data sent by trust providers
       * in the logs.
       */
      public fun includeTrustContext(includeTrustContext: Boolean)

      /**
       * @param includeTrustContext Indicates whether to include trust data sent by trust providers
       * in the logs.
       */
      public fun includeTrustContext(includeTrustContext: IResolvable)

      /**
       * @param kinesisDataFirehose Kinesis logging destination.
       */
      public fun kinesisDataFirehose(kinesisDataFirehose: IResolvable)

      /**
       * @param kinesisDataFirehose Kinesis logging destination.
       */
      public fun kinesisDataFirehose(kinesisDataFirehose: KinesisDataFirehoseProperty)

      /**
       * @param kinesisDataFirehose Kinesis logging destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a0f2a2fe07149a1be9a246f07526a0fd870e0759fa81bd7393a2180b8a15013")
      public
          fun kinesisDataFirehose(kinesisDataFirehose: KinesisDataFirehoseProperty.Builder.() -> Unit)

      /**
       * @param logVersion The logging version.
       * Valid values: `ocsf-0.1` | `ocsf-1.0.0-rc.2`
       */
      public fun logVersion(logVersion: String)

      /**
       * @param s3 Amazon S3 logging options.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Amazon S3 logging options.
       */
      public fun s3(s3: S3Property)

      /**
       * @param s3 Amazon S3 logging options.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c69bfd4264fe92e2ffb6015e86765982d8efc263627ca8eb32bc2adaeb15d2e")
      public fun s3(s3: S3Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessLogsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessLogsProperty.builder()

      /**
       * @param cloudWatchLogs CloudWatch Logs logging destination.
       */
      override fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLogs CloudWatch Logs logging destination.
       */
      override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(CloudWatchLogsProperty::unwrap))
      }

      /**
       * @param cloudWatchLogs CloudWatch Logs logging destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39b540269ddc0fae51ac097e3797d65413d3ae85ee6b5395fa380bbb12a67c60")
      override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsProperty.Builder.() -> Unit): Unit =
          cloudWatchLogs(CloudWatchLogsProperty(cloudWatchLogs))

      /**
       * @param includeTrustContext Indicates whether to include trust data sent by trust providers
       * in the logs.
       */
      override fun includeTrustContext(includeTrustContext: Boolean) {
        cdkBuilder.includeTrustContext(includeTrustContext)
      }

      /**
       * @param includeTrustContext Indicates whether to include trust data sent by trust providers
       * in the logs.
       */
      override fun includeTrustContext(includeTrustContext: IResolvable) {
        cdkBuilder.includeTrustContext(includeTrustContext.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisDataFirehose Kinesis logging destination.
       */
      override fun kinesisDataFirehose(kinesisDataFirehose: IResolvable) {
        cdkBuilder.kinesisDataFirehose(kinesisDataFirehose.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisDataFirehose Kinesis logging destination.
       */
      override fun kinesisDataFirehose(kinesisDataFirehose: KinesisDataFirehoseProperty) {
        cdkBuilder.kinesisDataFirehose(kinesisDataFirehose.let(KinesisDataFirehoseProperty::unwrap))
      }

      /**
       * @param kinesisDataFirehose Kinesis logging destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a0f2a2fe07149a1be9a246f07526a0fd870e0759fa81bd7393a2180b8a15013")
      override
          fun kinesisDataFirehose(kinesisDataFirehose: KinesisDataFirehoseProperty.Builder.() -> Unit):
          Unit = kinesisDataFirehose(KinesisDataFirehoseProperty(kinesisDataFirehose))

      /**
       * @param logVersion The logging version.
       * Valid values: `ocsf-0.1` | `ocsf-1.0.0-rc.2`
       */
      override fun logVersion(logVersion: String) {
        cdkBuilder.logVersion(logVersion)
      }

      /**
       * @param s3 Amazon S3 logging options.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      /**
       * @param s3 Amazon S3 logging options.
       */
      override fun s3(s3: S3Property) {
        cdkBuilder.s3(s3.let(S3Property::unwrap))
      }

      /**
       * @param s3 Amazon S3 logging options.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c69bfd4264fe92e2ffb6015e86765982d8efc263627ca8eb32bc2adaeb15d2e")
      override fun s3(s3: S3Property.Builder.() -> Unit): Unit = s3(S3Property(s3))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessLogsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessLogsProperty,
    ) : CdkObject(cdkObject), VerifiedAccessLogsProperty {
      /**
       * CloudWatch Logs logging destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesslogs.html#cfn-ec2-verifiedaccessinstance-verifiedaccesslogs-cloudwatchlogs)
       */
      override fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

      /**
       * Indicates whether to include trust data sent by trust providers in the logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesslogs.html#cfn-ec2-verifiedaccessinstance-verifiedaccesslogs-includetrustcontext)
       */
      override fun includeTrustContext(): Any? = unwrap(this).getIncludeTrustContext()

      /**
       * Kinesis logging destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesslogs.html#cfn-ec2-verifiedaccessinstance-verifiedaccesslogs-kinesisdatafirehose)
       */
      override fun kinesisDataFirehose(): Any? = unwrap(this).getKinesisDataFirehose()

      /**
       * The logging version.
       *
       * Valid values: `ocsf-0.1` | `ocsf-1.0.0-rc.2`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesslogs.html#cfn-ec2-verifiedaccessinstance-verifiedaccesslogs-logversion)
       */
      override fun logVersion(): String? = unwrap(this).getLogVersion()

      /**
       * Amazon S3 logging options.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesslogs.html#cfn-ec2-verifiedaccessinstance-verifiedaccesslogs-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VerifiedAccessLogsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessLogsProperty):
          VerifiedAccessLogsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VerifiedAccessLogsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VerifiedAccessLogsProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessLogsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessLogsProperty
    }
  }

  /**
   * Options for Amazon S3 as a logging destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * S3Property s3Property = S3Property.builder()
   * .bucketName("bucketName")
   * .bucketOwner("bucketOwner")
   * .enabled(false)
   * .prefix("prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-s3.html)
   */
  public interface S3Property {
    /**
     * The bucket name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-s3.html#cfn-ec2-verifiedaccessinstance-s3-bucketname)
     */
    public fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * The AWS account number that owns the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-s3.html#cfn-ec2-verifiedaccessinstance-s3-bucketowner)
     */
    public fun bucketOwner(): String? = unwrap(this).getBucketOwner()

    /**
     * Indicates whether logging is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-s3.html#cfn-ec2-verifiedaccessinstance-s3-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The bucket prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-s3.html#cfn-ec2-verifiedaccessinstance-s3-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * A builder for [S3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The bucket name.
       */
      public fun bucketName(bucketName: String)

      /**
       * @param bucketOwner The AWS account number that owns the bucket.
       */
      public fun bucketOwner(bucketOwner: String)

      /**
       * @param enabled Indicates whether logging is enabled.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether logging is enabled.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param prefix The bucket prefix.
       */
      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.S3Property.Builder =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.S3Property.builder()

      /**
       * @param bucketName The bucket name.
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param bucketOwner The AWS account number that owns the bucket.
       */
      override fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
      }

      /**
       * @param enabled Indicates whether logging is enabled.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether logging is enabled.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param prefix The bucket prefix.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.S3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.S3Property,
    ) : CdkObject(cdkObject), S3Property {
      /**
       * The bucket name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-s3.html#cfn-ec2-verifiedaccessinstance-s3-bucketname)
       */
      override fun bucketName(): String? = unwrap(this).getBucketName()

      /**
       * The AWS account number that owns the bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-s3.html#cfn-ec2-verifiedaccessinstance-s3-bucketowner)
       */
      override fun bucketOwner(): String? = unwrap(this).getBucketOwner()

      /**
       * Indicates whether logging is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-s3.html#cfn-ec2-verifiedaccessinstance-s3-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The bucket prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-s3.html#cfn-ec2-verifiedaccessinstance-s3-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.S3Property):
          S3Property = CdkObjectWrappers.wrap(cdkObject) as? S3Property ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3Property):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.S3Property = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.S3Property
    }
  }

  /**
   * Options for CloudWatch Logs as a logging destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * CloudWatchLogsProperty cloudWatchLogsProperty = CloudWatchLogsProperty.builder()
   * .enabled(false)
   * .logGroup("logGroup")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-cloudwatchlogs.html)
   */
  public interface CloudWatchLogsProperty {
    /**
     * Indicates whether logging is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-cloudwatchlogs.html#cfn-ec2-verifiedaccessinstance-cloudwatchlogs-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The ID of the CloudWatch Logs log group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-cloudwatchlogs.html#cfn-ec2-verifiedaccessinstance-cloudwatchlogs-loggroup)
     */
    public fun logGroup(): String? = unwrap(this).getLogGroup()

    /**
     * A builder for [CloudWatchLogsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Indicates whether logging is enabled.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether logging is enabled.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param logGroup The ID of the CloudWatch Logs log group.
       */
      public fun logGroup(logGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.CloudWatchLogsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.CloudWatchLogsProperty.builder()

      /**
       * @param enabled Indicates whether logging is enabled.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether logging is enabled.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param logGroup The ID of the CloudWatch Logs log group.
       */
      override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.CloudWatchLogsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.CloudWatchLogsProperty,
    ) : CdkObject(cdkObject), CloudWatchLogsProperty {
      /**
       * Indicates whether logging is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-cloudwatchlogs.html#cfn-ec2-verifiedaccessinstance-cloudwatchlogs-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The ID of the CloudWatch Logs log group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-cloudwatchlogs.html#cfn-ec2-verifiedaccessinstance-cloudwatchlogs-loggroup)
       */
      override fun logGroup(): String? = unwrap(this).getLogGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLogsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.CloudWatchLogsProperty):
          CloudWatchLogsProperty = CdkObjectWrappers.wrap(cdkObject) as? CloudWatchLogsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.CloudWatchLogsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.CloudWatchLogsProperty
    }
  }

  /**
   * Options for Kinesis as a logging destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * KinesisDataFirehoseProperty kinesisDataFirehoseProperty = KinesisDataFirehoseProperty.builder()
   * .deliveryStream("deliveryStream")
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-kinesisdatafirehose.html)
   */
  public interface KinesisDataFirehoseProperty {
    /**
     * The ID of the delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-kinesisdatafirehose.html#cfn-ec2-verifiedaccessinstance-kinesisdatafirehose-deliverystream)
     */
    public fun deliveryStream(): String? = unwrap(this).getDeliveryStream()

    /**
     * Indicates whether logging is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-kinesisdatafirehose.html#cfn-ec2-verifiedaccessinstance-kinesisdatafirehose-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [KinesisDataFirehoseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deliveryStream The ID of the delivery stream.
       */
      public fun deliveryStream(deliveryStream: String)

      /**
       * @param enabled Indicates whether logging is enabled.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether logging is enabled.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.KinesisDataFirehoseProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.KinesisDataFirehoseProperty.builder()

      /**
       * @param deliveryStream The ID of the delivery stream.
       */
      override fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
      }

      /**
       * @param enabled Indicates whether logging is enabled.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether logging is enabled.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.KinesisDataFirehoseProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.KinesisDataFirehoseProperty,
    ) : CdkObject(cdkObject), KinesisDataFirehoseProperty {
      /**
       * The ID of the delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-kinesisdatafirehose.html#cfn-ec2-verifiedaccessinstance-kinesisdatafirehose-deliverystream)
       */
      override fun deliveryStream(): String? = unwrap(this).getDeliveryStream()

      /**
       * Indicates whether logging is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-kinesisdatafirehose.html#cfn-ec2-verifiedaccessinstance-kinesisdatafirehose-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisDataFirehoseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.KinesisDataFirehoseProperty):
          KinesisDataFirehoseProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KinesisDataFirehoseProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisDataFirehoseProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.KinesisDataFirehoseProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.KinesisDataFirehoseProperty
    }
  }

  /**
   * A trust provider is a third-party entity that creates, maintains, and manages identity
   * information for users and devices.
   *
   * When an application request is made, the identity information sent by the trust provider is
   * evaluated by Verified Access before allowing or denying the application request.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * VerifiedAccessTrustProviderProperty verifiedAccessTrustProviderProperty =
   * VerifiedAccessTrustProviderProperty.builder()
   * .description("description")
   * .deviceTrustProviderType("deviceTrustProviderType")
   * .trustProviderType("trustProviderType")
   * .userTrustProviderType("userTrustProviderType")
   * .verifiedAccessTrustProviderId("verifiedAccessTrustProviderId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesstrustprovider.html)
   */
  public interface VerifiedAccessTrustProviderProperty {
    /**
     * A description for the AWS Verified Access trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustprovider-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The type of device-based trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustprovider-devicetrustprovidertype)
     */
    public fun deviceTrustProviderType(): String? = unwrap(this).getDeviceTrustProviderType()

    /**
     * The type of Verified Access trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustprovider-trustprovidertype)
     */
    public fun trustProviderType(): String? = unwrap(this).getTrustProviderType()

    /**
     * The type of user-based trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustprovider-usertrustprovidertype)
     */
    public fun userTrustProviderType(): String? = unwrap(this).getUserTrustProviderType()

    /**
     * The ID of the AWS Verified Access trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustprovider-verifiedaccesstrustproviderid)
     */
    public fun verifiedAccessTrustProviderId(): String? =
        unwrap(this).getVerifiedAccessTrustProviderId()

    /**
     * A builder for [VerifiedAccessTrustProviderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description A description for the AWS Verified Access trust provider.
       */
      public fun description(description: String)

      /**
       * @param deviceTrustProviderType The type of device-based trust provider.
       */
      public fun deviceTrustProviderType(deviceTrustProviderType: String)

      /**
       * @param trustProviderType The type of Verified Access trust provider.
       */
      public fun trustProviderType(trustProviderType: String)

      /**
       * @param userTrustProviderType The type of user-based trust provider.
       */
      public fun userTrustProviderType(userTrustProviderType: String)

      /**
       * @param verifiedAccessTrustProviderId The ID of the AWS Verified Access trust provider.
       */
      public fun verifiedAccessTrustProviderId(verifiedAccessTrustProviderId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty.builder()

      /**
       * @param description A description for the AWS Verified Access trust provider.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param deviceTrustProviderType The type of device-based trust provider.
       */
      override fun deviceTrustProviderType(deviceTrustProviderType: String) {
        cdkBuilder.deviceTrustProviderType(deviceTrustProviderType)
      }

      /**
       * @param trustProviderType The type of Verified Access trust provider.
       */
      override fun trustProviderType(trustProviderType: String) {
        cdkBuilder.trustProviderType(trustProviderType)
      }

      /**
       * @param userTrustProviderType The type of user-based trust provider.
       */
      override fun userTrustProviderType(userTrustProviderType: String) {
        cdkBuilder.userTrustProviderType(userTrustProviderType)
      }

      /**
       * @param verifiedAccessTrustProviderId The ID of the AWS Verified Access trust provider.
       */
      override fun verifiedAccessTrustProviderId(verifiedAccessTrustProviderId: String) {
        cdkBuilder.verifiedAccessTrustProviderId(verifiedAccessTrustProviderId)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty,
    ) : CdkObject(cdkObject), VerifiedAccessTrustProviderProperty {
      /**
       * A description for the AWS Verified Access trust provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustprovider-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The type of device-based trust provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustprovider-devicetrustprovidertype)
       */
      override fun deviceTrustProviderType(): String? = unwrap(this).getDeviceTrustProviderType()

      /**
       * The type of Verified Access trust provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustprovider-trustprovidertype)
       */
      override fun trustProviderType(): String? = unwrap(this).getTrustProviderType()

      /**
       * The type of user-based trust provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustprovider-usertrustprovidertype)
       */
      override fun userTrustProviderType(): String? = unwrap(this).getUserTrustProviderType()

      /**
       * The ID of the AWS Verified Access trust provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustprovider-verifiedaccesstrustproviderid)
       */
      override fun verifiedAccessTrustProviderId(): String? =
          unwrap(this).getVerifiedAccessTrustProviderId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VerifiedAccessTrustProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty):
          VerifiedAccessTrustProviderProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VerifiedAccessTrustProviderProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VerifiedAccessTrustProviderProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty
    }
  }
}
