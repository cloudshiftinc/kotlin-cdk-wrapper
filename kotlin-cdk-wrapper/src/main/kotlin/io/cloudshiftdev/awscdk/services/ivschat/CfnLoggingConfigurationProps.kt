@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivschat

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLoggingConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivschat.*;
 * CfnLoggingConfigurationProps cfnLoggingConfigurationProps =
 * CfnLoggingConfigurationProps.builder()
 * .destinationConfiguration(DestinationConfigurationProperty.builder()
 * .cloudWatchLogs(CloudWatchLogsDestinationConfigurationProperty.builder()
 * .logGroupName("logGroupName")
 * .build())
 * .firehose(FirehoseDestinationConfigurationProperty.builder()
 * .deliveryStreamName("deliveryStreamName")
 * .build())
 * .s3(S3DestinationConfigurationProperty.builder()
 * .bucketName("bucketName")
 * .build())
 * .build())
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html)
 */
public interface CfnLoggingConfigurationProps {
  /**
   * The DestinationConfiguration is a complex type that contains information about where chat
   * content will be logged.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-destinationconfiguration)
   */
  public fun destinationConfiguration(): Any

  /**
   * Logging-configuration name.
   *
   * The value does not need to be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-tag.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLoggingConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationConfiguration The DestinationConfiguration is a complex type that contains
     * information about where chat content will be logged. 
     */
    public fun destinationConfiguration(destinationConfiguration: IResolvable)

    /**
     * @param destinationConfiguration The DestinationConfiguration is a complex type that contains
     * information about where chat content will be logged. 
     */
    public
        fun destinationConfiguration(destinationConfiguration: CfnLoggingConfiguration.DestinationConfigurationProperty)

    /**
     * @param destinationConfiguration The DestinationConfiguration is a complex type that contains
     * information about where chat content will be logged. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2956f2c1ce296e67d60466e3902f9ac5e6f120a73d0b9e57a1caa969a9757f55")
    public
        fun destinationConfiguration(destinationConfiguration: CfnLoggingConfiguration.DestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name Logging-configuration name.
     * The value does not need to be unique.
     */
    public fun name(name: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-tag.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-tag.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps.Builder =
        software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps.builder()

    /**
     * @param destinationConfiguration The DestinationConfiguration is a complex type that contains
     * information about where chat content will be logged. 
     */
    override fun destinationConfiguration(destinationConfiguration: IResolvable) {
      cdkBuilder.destinationConfiguration(destinationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param destinationConfiguration The DestinationConfiguration is a complex type that contains
     * information about where chat content will be logged. 
     */
    override
        fun destinationConfiguration(destinationConfiguration: CfnLoggingConfiguration.DestinationConfigurationProperty) {
      cdkBuilder.destinationConfiguration(destinationConfiguration.let(CfnLoggingConfiguration.DestinationConfigurationProperty::unwrap))
    }

    /**
     * @param destinationConfiguration The DestinationConfiguration is a complex type that contains
     * information about where chat content will be logged. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2956f2c1ce296e67d60466e3902f9ac5e6f120a73d0b9e57a1caa969a9757f55")
    override
        fun destinationConfiguration(destinationConfiguration: CfnLoggingConfiguration.DestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        destinationConfiguration(CfnLoggingConfiguration.DestinationConfigurationProperty(destinationConfiguration))

    /**
     * @param name Logging-configuration name.
     * The value does not need to be unique.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-tag.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-tag.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps,
  ) : CdkObject(cdkObject), CfnLoggingConfigurationProps {
    /**
     * The DestinationConfiguration is a complex type that contains information about where chat
     * content will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-destinationconfiguration)
     */
    override fun destinationConfiguration(): Any = unwrap(this).getDestinationConfiguration()

    /**
     * Logging-configuration name.
     *
     * The value does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoggingConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps):
        CfnLoggingConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoggingConfigurationProps):
        software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps
  }
}
