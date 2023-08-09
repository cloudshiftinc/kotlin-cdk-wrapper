@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.devopsguru

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration
import software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegrationProps
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps
import software.amazon.awscdk.services.devopsguru.CfnResourceCollection
import software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps
import software.constructs.Construct

public object devopsguru {
    /**
     * Information about the integration of DevOps Guru with CloudWatch log groups for log anomaly
     * detection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.devopsguru.*;
     * CfnLogAnomalyDetectionIntegration cfnLogAnomalyDetectionIntegration =
     * CfnLogAnomalyDetectionIntegration.Builder.create(this,
     * "MyCfnLogAnomalyDetectionIntegration").build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-loganomalydetectionintegration.html)
     */
    public inline fun cfnLogAnomalyDetectionIntegration(
        scope: Construct,
        id: String,
        block: CfnLogAnomalyDetectionIntegrationDsl.() -> Unit = {},
    ): CfnLogAnomalyDetectionIntegration {
        val builder = CfnLogAnomalyDetectionIntegrationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLogAnomalyDetectionIntegration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.devopsguru.*;
     * CfnLogAnomalyDetectionIntegrationProps cfnLogAnomalyDetectionIntegrationProps =
     * CfnLogAnomalyDetectionIntegrationProps.builder().build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-loganomalydetectionintegration.html)
     */
    public inline fun cfnLogAnomalyDetectionIntegrationProps(
        block: CfnLogAnomalyDetectionIntegrationPropsDsl.() -> Unit = {}
    ): CfnLogAnomalyDetectionIntegrationProps {
        val builder = CfnLogAnomalyDetectionIntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds a notification channel to DevOps Guru.
     *
     * A notification channel is used to notify you about important DevOps Guru events, such as when
     * an insight is generated.
     *
     * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants
     * DevOps Guru permission to send it notifications. DevOps Guru adds the required policy on your
     * behalf to send notifications using Amazon SNS in your account. DevOps Guru only supports
     * standard SNS topics. For more information, see
     * [Permissions for Amazon SNS topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html)
     * .
     *
     * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service
     * customer-managed key (CMK), then you must add permissions to the CMK. For more information,
     * see
     * [Permissions for AWS KMS–encrypted Amazon SNS topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.devopsguru.*;
     * CfnNotificationChannel cfnNotificationChannel = CfnNotificationChannel.Builder.create(this,
     * "MyCfnNotificationChannel")
     * .config(NotificationChannelConfigProperty.builder()
     * .filters(NotificationFilterConfigProperty.builder()
     * .messageTypes(List.of("messageTypes"))
     * .severities(List.of("severities"))
     * .build())
     * .sns(SnsChannelConfigProperty.builder()
     * .topicArn("topicArn")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html)
     */
    public inline fun cfnNotificationChannel(
        scope: Construct,
        id: String,
        block: CfnNotificationChannelDsl.() -> Unit = {},
    ): CfnNotificationChannel {
        val builder = CfnNotificationChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about notification channels you have configured with DevOps Guru.
     *
     * The one supported notification channel is Amazon Simple Notification Service (Amazon SNS).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.devopsguru.*;
     * NotificationChannelConfigProperty notificationChannelConfigProperty =
     * NotificationChannelConfigProperty.builder()
     * .filters(NotificationFilterConfigProperty.builder()
     * .messageTypes(List.of("messageTypes"))
     * .severities(List.of("severities"))
     * .build())
     * .sns(SnsChannelConfigProperty.builder()
     * .topicArn("topicArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-notificationchannelconfig.html)
     */
    public inline fun cfnNotificationChannelNotificationChannelConfigProperty(
        block: CfnNotificationChannelNotificationChannelConfigPropertyDsl.() -> Unit = {}
    ): CfnNotificationChannel.NotificationChannelConfigProperty {
        val builder = CfnNotificationChannelNotificationChannelConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The filter configurations for the Amazon SNS notification topic you use with DevOps Guru.
     *
     * You can choose to specify which events or message types to receive notifications for. You can
     * also choose to specify which severity levels to receive notifications for.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.devopsguru.*;
     * NotificationFilterConfigProperty notificationFilterConfigProperty =
     * NotificationFilterConfigProperty.builder()
     * .messageTypes(List.of("messageTypes"))
     * .severities(List.of("severities"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-notificationfilterconfig.html)
     */
    public inline fun cfnNotificationChannelNotificationFilterConfigProperty(
        block: CfnNotificationChannelNotificationFilterConfigPropertyDsl.() -> Unit = {}
    ): CfnNotificationChannel.NotificationFilterConfigProperty {
        val builder = CfnNotificationChannelNotificationFilterConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNotificationChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.devopsguru.*;
     * CfnNotificationChannelProps cfnNotificationChannelProps = CfnNotificationChannelProps.builder()
     * .config(NotificationChannelConfigProperty.builder()
     * .filters(NotificationFilterConfigProperty.builder()
     * .messageTypes(List.of("messageTypes"))
     * .severities(List.of("severities"))
     * .build())
     * .sns(SnsChannelConfigProperty.builder()
     * .topicArn("topicArn")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html)
     */
    public inline fun cfnNotificationChannelProps(
        block: CfnNotificationChannelPropsDsl.() -> Unit = {}
    ): CfnNotificationChannelProps {
        val builder = CfnNotificationChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the Amazon Resource Name (ARN) of an Amazon Simple Notification Service topic.
     *
     * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants
     * DevOps Guru permission to send it notifications. DevOps Guru adds the required policy on your
     * behalf to send notifications using Amazon SNS in your account. DevOps Guru only supports
     * standard SNS topics. For more information, see
     * [Permissions for Amazon SNS topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html)
     * .
     *
     * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service
     * customer-managed key (CMK), then you must add permissions to the CMK. For more information,
     * see
     * [Permissions for AWS KMS–encrypted Amazon SNS topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.devopsguru.*;
     * SnsChannelConfigProperty snsChannelConfigProperty = SnsChannelConfigProperty.builder()
     * .topicArn("topicArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-snschannelconfig.html)
     */
    public inline fun cfnNotificationChannelSnsChannelConfigProperty(
        block: CfnNotificationChannelSnsChannelConfigPropertyDsl.() -> Unit = {}
    ): CfnNotificationChannel.SnsChannelConfigProperty {
        val builder = CfnNotificationChannelSnsChannelConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of AWS resources supported by DevOps Guru.
     *
     * The one type of AWS resource collection supported is AWS CloudFormation stacks. DevOps Guru
     * can be configured to analyze only the AWS resources that are defined in the stacks.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.devopsguru.*;
     * CfnResourceCollection cfnResourceCollection = CfnResourceCollection.Builder.create(this,
     * "MyCfnResourceCollection")
     * .resourceCollectionFilter(ResourceCollectionFilterProperty.builder()
     * .cloudFormation(CloudFormationCollectionFilterProperty.builder()
     * .stackNames(List.of("stackNames"))
     * .build())
     * .tags(List.of(TagCollectionProperty.builder()
     * .appBoundaryKey("appBoundaryKey")
     * .tagValues(List.of("tagValues"))
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-resourcecollection.html)
     */
    public inline fun cfnResourceCollection(
        scope: Construct,
        id: String,
        block: CfnResourceCollectionDsl.() -> Unit = {},
    ): CfnResourceCollection {
        val builder = CfnResourceCollectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about AWS CloudFormation stacks.
     *
     * You can use up to 1000 stacks to specify which AWS resources in your account to analyze. For
     * more information, see
     * [Stacks](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html) in the
     * *AWS CloudFormation User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.devopsguru.*;
     * CloudFormationCollectionFilterProperty cloudFormationCollectionFilterProperty =
     * CloudFormationCollectionFilterProperty.builder()
     * .stackNames(List.of("stackNames"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-cloudformationcollectionfilter.html)
     */
    public inline fun cfnResourceCollectionCloudFormationCollectionFilterProperty(
        block: CfnResourceCollectionCloudFormationCollectionFilterPropertyDsl.() -> Unit = {}
    ): CfnResourceCollection.CloudFormationCollectionFilterProperty {
        val builder = CfnResourceCollectionCloudFormationCollectionFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResourceCollection`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.devopsguru.*;
     * CfnResourceCollectionProps cfnResourceCollectionProps = CfnResourceCollectionProps.builder()
     * .resourceCollectionFilter(ResourceCollectionFilterProperty.builder()
     * .cloudFormation(CloudFormationCollectionFilterProperty.builder()
     * .stackNames(List.of("stackNames"))
     * .build())
     * .tags(List.of(TagCollectionProperty.builder()
     * .appBoundaryKey("appBoundaryKey")
     * .tagValues(List.of("tagValues"))
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-resourcecollection.html)
     */
    public inline fun cfnResourceCollectionProps(
        block: CfnResourceCollectionPropsDsl.() -> Unit = {}
    ): CfnResourceCollectionProps {
        val builder = CfnResourceCollectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a filter used to specify which AWS resources are analyzed for anomalous
     * behavior by DevOps Guru.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.devopsguru.*;
     * ResourceCollectionFilterProperty resourceCollectionFilterProperty =
     * ResourceCollectionFilterProperty.builder()
     * .cloudFormation(CloudFormationCollectionFilterProperty.builder()
     * .stackNames(List.of("stackNames"))
     * .build())
     * .tags(List.of(TagCollectionProperty.builder()
     * .appBoundaryKey("appBoundaryKey")
     * .tagValues(List.of("tagValues"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-resourcecollectionfilter.html)
     */
    public inline fun cfnResourceCollectionResourceCollectionFilterProperty(
        block: CfnResourceCollectionResourceCollectionFilterPropertyDsl.() -> Unit = {}
    ): CfnResourceCollection.ResourceCollectionFilterProperty {
        val builder = CfnResourceCollectionResourceCollectionFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of AWS tags.
     *
     * Tags help you identify and organize your AWS resources. Many AWS services support tagging, so
     * you can assign the same tag to resources from different services to indicate that the
     * resources are related. For example, you can assign the same tag to an Amazon DynamoDB table
     * resource that you assign to an AWS Lambda function. For more information about using tags,
     * see the
     * [Tagging best practices](https://docs.aws.amazon.com/whitepapers/latest/tagging-best-practices/tagging-best-practices.html)
     * whitepaper.
     *
     * Each AWS tag has two parts.
     * * A tag *key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag
     *   *keys* are case-sensitive.
     * * A field known as a tag *value* (for example, `111122223333` , `Production` , or a team
     *   name). Omitting the tag *value* is the same as using an empty string. Like tag *keys* , tag
     *   *values* are case-sensitive. The tag value is a required property when *AppBoundaryKey* is
     *   specified.
     *
     * Together these are known as *key* - *value* pairs.
     *
     * The string used for a *key* in a tag that you use to define your resource coverage must begin
     * with the prefix `Devops-guru-` . The tag *key* might be `DevOps-Guru-deployment-application`
     * or `devops-guru-rds-application` . When you create a *key* , the case of characters in the
     * *key* can be whatever you choose. After you create a *key* , it is case-sensitive. For
     * example, DevOps Guru works with a *key* named `devops-guru-rds` and a *key* named
     * `DevOps-Guru-RDS` , and these act as two different *keys* . Possible *key* / *value* pairs in
     * your application might be `Devops-Guru-production-application/RDS` or
     * `Devops-Guru-production-application/containers` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.devopsguru.*;
     * TagCollectionProperty tagCollectionProperty = TagCollectionProperty.builder()
     * .appBoundaryKey("appBoundaryKey")
     * .tagValues(List.of("tagValues"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-resourcecollection-tagcollection.html)
     */
    public inline fun cfnResourceCollectionTagCollectionProperty(
        block: CfnResourceCollectionTagCollectionPropertyDsl.() -> Unit = {}
    ): CfnResourceCollection.TagCollectionProperty {
        val builder = CfnResourceCollectionTagCollectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
