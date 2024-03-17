@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnVerifiedAccessInstance`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVerifiedAccessInstanceProps cfnVerifiedAccessInstanceProps =
 * CfnVerifiedAccessInstanceProps.builder()
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
public interface CfnVerifiedAccessInstanceProps {
  /**
   * A description for the AWS Verified Access instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Indicates whether support for Federal Information Processing Standards (FIPS) is enabled on the
   * instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-fipsenabled)
   */
  public fun fipsEnabled(): Any? = unwrap(this).getFipsEnabled()

  /**
   * The logging configuration for the Verified Access instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-loggingconfigurations)
   */
  public fun loggingConfigurations(): Any? = unwrap(this).getLoggingConfigurations()

  /**
   * The tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The IDs of the AWS Verified Access trust providers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviderids)
   */
  public fun verifiedAccessTrustProviderIds(): List<String> =
      unwrap(this).getVerifiedAccessTrustProviderIds() ?: emptyList()

  /**
   * The IDs of the AWS Verified Access trust providers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviders)
   */
  public fun verifiedAccessTrustProviders(): Any? = unwrap(this).getVerifiedAccessTrustProviders()

  /**
   * A builder for [CfnVerifiedAccessInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description for the AWS Verified Access instance.
     */
    public fun description(description: String)

    /**
     * @param fipsEnabled Indicates whether support for Federal Information Processing Standards
     * (FIPS) is enabled on the instance.
     */
    public fun fipsEnabled(fipsEnabled: Boolean)

    /**
     * @param fipsEnabled Indicates whether support for Federal Information Processing Standards
     * (FIPS) is enabled on the instance.
     */
    public fun fipsEnabled(fipsEnabled: IResolvable)

    /**
     * @param loggingConfigurations The logging configuration for the Verified Access instances.
     */
    public fun loggingConfigurations(loggingConfigurations: IResolvable)

    /**
     * @param loggingConfigurations The logging configuration for the Verified Access instances.
     */
    public
        fun loggingConfigurations(loggingConfigurations: CfnVerifiedAccessInstance.VerifiedAccessLogsProperty)

    /**
     * @param loggingConfigurations The logging configuration for the Verified Access instances.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28935767be0a5523e044750fd892a346d2401be507c1591d91d07813534f7706")
    public
        fun loggingConfigurations(loggingConfigurations: CfnVerifiedAccessInstance.VerifiedAccessLogsProperty.Builder.() -> Unit)

    /**
     * @param tags The tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param verifiedAccessTrustProviderIds The IDs of the AWS Verified Access trust providers.
     */
    public fun verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds: List<String>)

    /**
     * @param verifiedAccessTrustProviderIds The IDs of the AWS Verified Access trust providers.
     */
    public fun verifiedAccessTrustProviderIds(vararg verifiedAccessTrustProviderIds: String)

    /**
     * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers.
     */
    public fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: IResolvable)

    /**
     * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers.
     */
    public fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: List<Any>)

    /**
     * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers.
     */
    public fun verifiedAccessTrustProviders(vararg verifiedAccessTrustProviders: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps.builder()

    /**
     * @param description A description for the AWS Verified Access instance.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param fipsEnabled Indicates whether support for Federal Information Processing Standards
     * (FIPS) is enabled on the instance.
     */
    override fun fipsEnabled(fipsEnabled: Boolean) {
      cdkBuilder.fipsEnabled(fipsEnabled)
    }

    /**
     * @param fipsEnabled Indicates whether support for Federal Information Processing Standards
     * (FIPS) is enabled on the instance.
     */
    override fun fipsEnabled(fipsEnabled: IResolvable) {
      cdkBuilder.fipsEnabled(fipsEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param loggingConfigurations The logging configuration for the Verified Access instances.
     */
    override fun loggingConfigurations(loggingConfigurations: IResolvable) {
      cdkBuilder.loggingConfigurations(loggingConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param loggingConfigurations The logging configuration for the Verified Access instances.
     */
    override
        fun loggingConfigurations(loggingConfigurations: CfnVerifiedAccessInstance.VerifiedAccessLogsProperty) {
      cdkBuilder.loggingConfigurations(loggingConfigurations.let(CfnVerifiedAccessInstance.VerifiedAccessLogsProperty::unwrap))
    }

    /**
     * @param loggingConfigurations The logging configuration for the Verified Access instances.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28935767be0a5523e044750fd892a346d2401be507c1591d91d07813534f7706")
    override
        fun loggingConfigurations(loggingConfigurations: CfnVerifiedAccessInstance.VerifiedAccessLogsProperty.Builder.() -> Unit):
        Unit =
        loggingConfigurations(CfnVerifiedAccessInstance.VerifiedAccessLogsProperty(loggingConfigurations))

    /**
     * @param tags The tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param verifiedAccessTrustProviderIds The IDs of the AWS Verified Access trust providers.
     */
    override fun verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds: List<String>) {
      cdkBuilder.verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds)
    }

    /**
     * @param verifiedAccessTrustProviderIds The IDs of the AWS Verified Access trust providers.
     */
    override fun verifiedAccessTrustProviderIds(vararg verifiedAccessTrustProviderIds: String): Unit
        = verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds.toList())

    /**
     * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers.
     */
    override fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: IResolvable) {
      cdkBuilder.verifiedAccessTrustProviders(verifiedAccessTrustProviders.let(IResolvable::unwrap))
    }

    /**
     * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers.
     */
    override fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: List<Any>) {
      cdkBuilder.verifiedAccessTrustProviders(verifiedAccessTrustProviders)
    }

    /**
     * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers.
     */
    override fun verifiedAccessTrustProviders(vararg verifiedAccessTrustProviders: Any): Unit =
        verifiedAccessTrustProviders(verifiedAccessTrustProviders.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps,
  ) : CdkObject(cdkObject), CfnVerifiedAccessInstanceProps {
    /**
     * A description for the AWS Verified Access instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Indicates whether support for Federal Information Processing Standards (FIPS) is enabled on
     * the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-fipsenabled)
     */
    override fun fipsEnabled(): Any? = unwrap(this).getFipsEnabled()

    /**
     * The logging configuration for the Verified Access instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-loggingconfigurations)
     */
    override fun loggingConfigurations(): Any? = unwrap(this).getLoggingConfigurations()

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviderids)
     */
    override fun verifiedAccessTrustProviderIds(): List<String> =
        unwrap(this).getVerifiedAccessTrustProviderIds() ?: emptyList()

    /**
     * The IDs of the AWS Verified Access trust providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviders)
     */
    override fun verifiedAccessTrustProviders(): Any? =
        unwrap(this).getVerifiedAccessTrustProviders()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVerifiedAccessInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps):
        CfnVerifiedAccessInstanceProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnVerifiedAccessInstanceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVerifiedAccessInstanceProps):
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps
  }
}
