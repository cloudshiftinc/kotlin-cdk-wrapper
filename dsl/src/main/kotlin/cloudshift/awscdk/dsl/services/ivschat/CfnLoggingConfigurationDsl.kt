@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ivschat

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration
import software.constructs.Construct

/**
 * The `AWS::IVSChat::LoggingConfiguration` resource specifies an  logging configuration that allows
 * clients to store and record sent messages.
 *
 * For more information, see
 * [CreateLoggingConfiguration](https://docs.aws.amazon.com/ivs/latest/ChatAPIReference/API_CreateLoggingConfiguration.html)
 * in the *Amazon Interactive Video Service Chat API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ivschat.*;
 * CfnLoggingConfiguration cfnLoggingConfiguration = CfnLoggingConfiguration.Builder.create(this,
 * "MyCfnLoggingConfiguration")
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
@CdkDslMarker
public class CfnLoggingConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLoggingConfiguration.Builder =
      CfnLoggingConfiguration.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The DestinationConfiguration is a complex type that contains information about where chat
   * content will be logged.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-destinationconfiguration)
   * @param destinationConfiguration The DestinationConfiguration is a complex type that contains
   * information about where chat content will be logged. 
   */
  public fun destinationConfiguration(destinationConfiguration: IResolvable) {
    cdkBuilder.destinationConfiguration(destinationConfiguration)
  }

  /**
   * The DestinationConfiguration is a complex type that contains information about where chat
   * content will be logged.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-destinationconfiguration)
   * @param destinationConfiguration The DestinationConfiguration is a complex type that contains
   * information about where chat content will be logged. 
   */
  public
      fun destinationConfiguration(destinationConfiguration: CfnLoggingConfiguration.DestinationConfigurationProperty) {
    cdkBuilder.destinationConfiguration(destinationConfiguration)
  }

  /**
   * Logging-configuration name.
   *
   * The value does not need to be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-name)
   * @param name Logging-configuration name. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLoggingConfiguration {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
