@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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
 * The `AWS::Config::ConfigurationRecorder` resource type describes the AWS resource types that AWS
 * Config records for configuration changes.
 *
 * The configuration recorder stores the configuration changes of the specified resources in your
 * account as configuration items.
 *
 *
 * To enable AWS Config , you must create a configuration recorder and a delivery channel.
 *
 * AWS Config uses the delivery channel to deliver the configuration changes to your Amazon S3
 * bucket or Amazon SNS topic. For more information, see
 * [AWS::Config::DeliveryChannel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html)
 * .
 *
 *
 * AWS CloudFormation starts the recorder as soon as the delivery channel is available.
 *
 * To stop the recorder and delete it, delete the configuration recorder from your stack. To stop
 * the recorder without deleting it, call the
 * [StopConfigurationRecorder](https://docs.aws.amazon.com/config/latest/APIReference/API_StopConfigurationRecorder.html)
 * action of the AWS Config API directly.
 *
 * For more information, see [Configuration
 * Recorder](https://docs.aws.amazon.com/config/latest/developerguide/config-concepts.html#config-recorder)
 * in the AWS Config Developer Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.config.*;
 * CfnConfigurationRecorder cfnConfigurationRecorder = CfnConfigurationRecorder.Builder.create(this,
 * "MyCfnConfigurationRecorder")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .name("name")
 * .recordingGroup(RecordingGroupProperty.builder()
 * .allSupported(false)
 * .exclusionByResourceTypes(ExclusionByResourceTypesProperty.builder()
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .includeGlobalResourceTypes(false)
 * .recordingStrategy(RecordingStrategyProperty.builder()
 * .useOnly("useOnly")
 * .build())
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .recordingMode(RecordingModeProperty.builder()
 * .recordingFrequency("recordingFrequency")
 * // the properties below are optional
 * .recordingModeOverrides(List.of(RecordingModeOverrideProperty.builder()
 * .recordingFrequency("recordingFrequency")
 * .resourceTypes(List.of("resourceTypes"))
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html)
 */
public open class CfnConfigurationRecorder(
  cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfigurationRecorderProps,
  ) :
      this(software.amazon.awscdk.services.config.CfnConfigurationRecorder(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnConfigurationRecorderProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfigurationRecorderProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConfigurationRecorderProps(props)
  )

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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the configuration recorder.
   *
   * AWS Config automatically assigns the name of "default" when creating the configuration
   * recorder.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the configuration recorder.
   *
   * AWS Config automatically assigns the name of "default" when creating the configuration
   * recorder.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies which resource types AWS Config records for configuration changes.
   */
  public open fun recordingGroup(): Any? = unwrap(this).getRecordingGroup()

  /**
   * Specifies which resource types AWS Config records for configuration changes.
   */
  public open fun recordingGroup(`value`: IResolvable) {
    unwrap(this).setRecordingGroup(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies which resource types AWS Config records for configuration changes.
   */
  public open fun recordingGroup(`value`: RecordingGroupProperty) {
    unwrap(this).setRecordingGroup(`value`.let(RecordingGroupProperty::unwrap))
  }

  /**
   * Specifies which resource types AWS Config records for configuration changes.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d81d36d616df531c4481129ef27222b12607b0045c300de88782b000b096effb")
  public open fun recordingGroup(`value`: RecordingGroupProperty.Builder.() -> Unit): Unit =
      recordingGroup(RecordingGroupProperty(`value`))

  /**
   * Specifies the default recording frequency that AWS Config uses to record configuration changes.
   */
  public open fun recordingMode(): Any? = unwrap(this).getRecordingMode()

  /**
   * Specifies the default recording frequency that AWS Config uses to record configuration changes.
   */
  public open fun recordingMode(`value`: IResolvable) {
    unwrap(this).setRecordingMode(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the default recording frequency that AWS Config uses to record configuration changes.
   */
  public open fun recordingMode(`value`: RecordingModeProperty) {
    unwrap(this).setRecordingMode(`value`.let(RecordingModeProperty::unwrap))
  }

  /**
   * Specifies the default recording frequency that AWS Config uses to record configuration changes.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0a9d8ec9a54119901b41a6b7621459d3e9717792772bfbdc26a080973620387f")
  public open fun recordingMode(`value`: RecordingModeProperty.Builder.() -> Unit): Unit =
      recordingMode(RecordingModeProperty(`value`))

  /**
   * Amazon Resource Name (ARN) of the IAM role assumed by AWS Config and used by the configuration
   * recorder.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * Amazon Resource Name (ARN) of the IAM role assumed by AWS Config and used by the configuration
   * recorder.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.config.CfnConfigurationRecorder].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the configuration recorder. AWS Config automatically assigns the name of
     * "default" when creating the configuration recorder.
     *
     * You cannot change the name of the configuration recorder after it has been created. To change
     * the configuration recorder name, you must delete it and create a new configuration recorder with
     * a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-name)
     * @param name The name of the configuration recorder. AWS Config automatically assigns the name
     * of "default" when creating the configuration recorder. 
     */
    public fun name(name: String)

    /**
     * Specifies which resource types AWS Config records for configuration changes.
     *
     *
     * *High Number of AWS Config Evaluations*
     *
     * You may notice increased activity in your account during your initial month recording with
     * AWS Config when compared to subsequent months. During the initial bootstrapping process, AWS
     * Config runs evaluations on all the resources in your account that you have selected for AWS
     * Config to record.
     *
     * If you are running ephemeral workloads, you may see increased activity from AWS Config as it
     * records configuration changes associated with creating and deleting these temporary resources.
     * An *ephemeral workload* is a temporary use of computing resources that are loaded and run when
     * needed. Examples include Amazon Elastic Compute Cloud ( Amazon EC2 ) Spot Instances, Amazon EMR
     * jobs, and AWS Auto Scaling . If you want to avoid the increased activity from running ephemeral
     * workloads, you can run these types of workloads in a separate account with AWS Config turned off
     * to avoid increased configuration recording and rule evaluations.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordinggroup)
     * @param recordingGroup Specifies which resource types AWS Config records for configuration
     * changes. 
     */
    public fun recordingGroup(recordingGroup: IResolvable)

    /**
     * Specifies which resource types AWS Config records for configuration changes.
     *
     *
     * *High Number of AWS Config Evaluations*
     *
     * You may notice increased activity in your account during your initial month recording with
     * AWS Config when compared to subsequent months. During the initial bootstrapping process, AWS
     * Config runs evaluations on all the resources in your account that you have selected for AWS
     * Config to record.
     *
     * If you are running ephemeral workloads, you may see increased activity from AWS Config as it
     * records configuration changes associated with creating and deleting these temporary resources.
     * An *ephemeral workload* is a temporary use of computing resources that are loaded and run when
     * needed. Examples include Amazon Elastic Compute Cloud ( Amazon EC2 ) Spot Instances, Amazon EMR
     * jobs, and AWS Auto Scaling . If you want to avoid the increased activity from running ephemeral
     * workloads, you can run these types of workloads in a separate account with AWS Config turned off
     * to avoid increased configuration recording and rule evaluations.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordinggroup)
     * @param recordingGroup Specifies which resource types AWS Config records for configuration
     * changes. 
     */
    public fun recordingGroup(recordingGroup: RecordingGroupProperty)

    /**
     * Specifies which resource types AWS Config records for configuration changes.
     *
     *
     * *High Number of AWS Config Evaluations*
     *
     * You may notice increased activity in your account during your initial month recording with
     * AWS Config when compared to subsequent months. During the initial bootstrapping process, AWS
     * Config runs evaluations on all the resources in your account that you have selected for AWS
     * Config to record.
     *
     * If you are running ephemeral workloads, you may see increased activity from AWS Config as it
     * records configuration changes associated with creating and deleting these temporary resources.
     * An *ephemeral workload* is a temporary use of computing resources that are loaded and run when
     * needed. Examples include Amazon Elastic Compute Cloud ( Amazon EC2 ) Spot Instances, Amazon EMR
     * jobs, and AWS Auto Scaling . If you want to avoid the increased activity from running ephemeral
     * workloads, you can run these types of workloads in a separate account with AWS Config turned off
     * to avoid increased configuration recording and rule evaluations.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordinggroup)
     * @param recordingGroup Specifies which resource types AWS Config records for configuration
     * changes. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b09cf777c91a242656b58a7264175f61c5bb297186f5746c36aaaab39c1b1ec0")
    public fun recordingGroup(recordingGroup: RecordingGroupProperty.Builder.() -> Unit)

    /**
     * Specifies the default recording frequency that AWS Config uses to record configuration
     * changes.
     *
     * AWS Config supports *Continuous recording* and *Daily recording* .
     *
     * * Continuous recording allows you to record configuration changes continuously whenever a
     * change occurs.
     * * Daily recording allows you to receive a configuration item (CI) representing the most
     * recent state of your resources over the last 24-hour period, only if it’s different from the
     * previous CI recorded.
     *
     *
     * AWS Firewall Manager depends on continuous recording to monitor your resources. If you are
     * using Firewall Manager, it is recommended that you set the recording frequency to Continuous.
     *
     *
     * You can also override the recording frequency for specific resource types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordingmode)
     * @param recordingMode Specifies the default recording frequency that AWS Config uses to record
     * configuration changes. 
     */
    public fun recordingMode(recordingMode: IResolvable)

    /**
     * Specifies the default recording frequency that AWS Config uses to record configuration
     * changes.
     *
     * AWS Config supports *Continuous recording* and *Daily recording* .
     *
     * * Continuous recording allows you to record configuration changes continuously whenever a
     * change occurs.
     * * Daily recording allows you to receive a configuration item (CI) representing the most
     * recent state of your resources over the last 24-hour period, only if it’s different from the
     * previous CI recorded.
     *
     *
     * AWS Firewall Manager depends on continuous recording to monitor your resources. If you are
     * using Firewall Manager, it is recommended that you set the recording frequency to Continuous.
     *
     *
     * You can also override the recording frequency for specific resource types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordingmode)
     * @param recordingMode Specifies the default recording frequency that AWS Config uses to record
     * configuration changes. 
     */
    public fun recordingMode(recordingMode: RecordingModeProperty)

    /**
     * Specifies the default recording frequency that AWS Config uses to record configuration
     * changes.
     *
     * AWS Config supports *Continuous recording* and *Daily recording* .
     *
     * * Continuous recording allows you to record configuration changes continuously whenever a
     * change occurs.
     * * Daily recording allows you to receive a configuration item (CI) representing the most
     * recent state of your resources over the last 24-hour period, only if it’s different from the
     * previous CI recorded.
     *
     *
     * AWS Firewall Manager depends on continuous recording to monitor your resources. If you are
     * using Firewall Manager, it is recommended that you set the recording frequency to Continuous.
     *
     *
     * You can also override the recording frequency for specific resource types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordingmode)
     * @param recordingMode Specifies the default recording frequency that AWS Config uses to record
     * configuration changes. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00ffd9c129635aac8d171277a5f2480e3862c30ee64c42d0cee3790005d4a31a")
    public fun recordingMode(recordingMode: RecordingModeProperty.Builder.() -> Unit)

    /**
     * Amazon Resource Name (ARN) of the IAM role assumed by AWS Config and used by the
     * configuration recorder.
     *
     * For more information, see [Permissions for the IAM Role
     * Assigned](https://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) to
     * AWS Config in the AWS Config Developer Guide.
     *
     *
     * *Pre-existing AWS Config role*
     *
     * If you have used an AWS service that uses AWS Config , such as AWS Security Hub or AWS
     * Control Tower , and an AWS Config role has already been created, make sure that the IAM role
     * that you use when setting up AWS Config keeps the same minimum permissions as the already
     * created AWS Config role. You must do this so that the other AWS service continues to run as
     * expected.
     *
     * For example, if AWS Control Tower has an IAM role that allows AWS Config to read Amazon
     * Simple Storage Service ( Amazon S3 ) objects, make sure that the same permissions are granted
     * within the IAM role you use when setting up AWS Config . Otherwise, it may interfere with how
     * AWS Control Tower operates. For more information about IAM roles for AWS Config , see [*Identity
     * and Access Management for AWS
     * Config*](https://docs.aws.amazon.com/config/latest/developerguide/security-iam.html) in the *AWS
     * Config Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-rolearn)
     * @param roleArn Amazon Resource Name (ARN) of the IAM role assumed by AWS Config and used by
     * the configuration recorder. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnConfigurationRecorder.Builder
        = software.amazon.awscdk.services.config.CfnConfigurationRecorder.Builder.create(scope, id)

    /**
     * The name of the configuration recorder. AWS Config automatically assigns the name of
     * "default" when creating the configuration recorder.
     *
     * You cannot change the name of the configuration recorder after it has been created. To change
     * the configuration recorder name, you must delete it and create a new configuration recorder with
     * a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-name)
     * @param name The name of the configuration recorder. AWS Config automatically assigns the name
     * of "default" when creating the configuration recorder. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specifies which resource types AWS Config records for configuration changes.
     *
     *
     * *High Number of AWS Config Evaluations*
     *
     * You may notice increased activity in your account during your initial month recording with
     * AWS Config when compared to subsequent months. During the initial bootstrapping process, AWS
     * Config runs evaluations on all the resources in your account that you have selected for AWS
     * Config to record.
     *
     * If you are running ephemeral workloads, you may see increased activity from AWS Config as it
     * records configuration changes associated with creating and deleting these temporary resources.
     * An *ephemeral workload* is a temporary use of computing resources that are loaded and run when
     * needed. Examples include Amazon Elastic Compute Cloud ( Amazon EC2 ) Spot Instances, Amazon EMR
     * jobs, and AWS Auto Scaling . If you want to avoid the increased activity from running ephemeral
     * workloads, you can run these types of workloads in a separate account with AWS Config turned off
     * to avoid increased configuration recording and rule evaluations.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordinggroup)
     * @param recordingGroup Specifies which resource types AWS Config records for configuration
     * changes. 
     */
    override fun recordingGroup(recordingGroup: IResolvable) {
      cdkBuilder.recordingGroup(recordingGroup.let(IResolvable::unwrap))
    }

    /**
     * Specifies which resource types AWS Config records for configuration changes.
     *
     *
     * *High Number of AWS Config Evaluations*
     *
     * You may notice increased activity in your account during your initial month recording with
     * AWS Config when compared to subsequent months. During the initial bootstrapping process, AWS
     * Config runs evaluations on all the resources in your account that you have selected for AWS
     * Config to record.
     *
     * If you are running ephemeral workloads, you may see increased activity from AWS Config as it
     * records configuration changes associated with creating and deleting these temporary resources.
     * An *ephemeral workload* is a temporary use of computing resources that are loaded and run when
     * needed. Examples include Amazon Elastic Compute Cloud ( Amazon EC2 ) Spot Instances, Amazon EMR
     * jobs, and AWS Auto Scaling . If you want to avoid the increased activity from running ephemeral
     * workloads, you can run these types of workloads in a separate account with AWS Config turned off
     * to avoid increased configuration recording and rule evaluations.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordinggroup)
     * @param recordingGroup Specifies which resource types AWS Config records for configuration
     * changes. 
     */
    override fun recordingGroup(recordingGroup: RecordingGroupProperty) {
      cdkBuilder.recordingGroup(recordingGroup.let(RecordingGroupProperty::unwrap))
    }

    /**
     * Specifies which resource types AWS Config records for configuration changes.
     *
     *
     * *High Number of AWS Config Evaluations*
     *
     * You may notice increased activity in your account during your initial month recording with
     * AWS Config when compared to subsequent months. During the initial bootstrapping process, AWS
     * Config runs evaluations on all the resources in your account that you have selected for AWS
     * Config to record.
     *
     * If you are running ephemeral workloads, you may see increased activity from AWS Config as it
     * records configuration changes associated with creating and deleting these temporary resources.
     * An *ephemeral workload* is a temporary use of computing resources that are loaded and run when
     * needed. Examples include Amazon Elastic Compute Cloud ( Amazon EC2 ) Spot Instances, Amazon EMR
     * jobs, and AWS Auto Scaling . If you want to avoid the increased activity from running ephemeral
     * workloads, you can run these types of workloads in a separate account with AWS Config turned off
     * to avoid increased configuration recording and rule evaluations.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordinggroup)
     * @param recordingGroup Specifies which resource types AWS Config records for configuration
     * changes. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b09cf777c91a242656b58a7264175f61c5bb297186f5746c36aaaab39c1b1ec0")
    override fun recordingGroup(recordingGroup: RecordingGroupProperty.Builder.() -> Unit): Unit =
        recordingGroup(RecordingGroupProperty(recordingGroup))

    /**
     * Specifies the default recording frequency that AWS Config uses to record configuration
     * changes.
     *
     * AWS Config supports *Continuous recording* and *Daily recording* .
     *
     * * Continuous recording allows you to record configuration changes continuously whenever a
     * change occurs.
     * * Daily recording allows you to receive a configuration item (CI) representing the most
     * recent state of your resources over the last 24-hour period, only if it’s different from the
     * previous CI recorded.
     *
     *
     * AWS Firewall Manager depends on continuous recording to monitor your resources. If you are
     * using Firewall Manager, it is recommended that you set the recording frequency to Continuous.
     *
     *
     * You can also override the recording frequency for specific resource types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordingmode)
     * @param recordingMode Specifies the default recording frequency that AWS Config uses to record
     * configuration changes. 
     */
    override fun recordingMode(recordingMode: IResolvable) {
      cdkBuilder.recordingMode(recordingMode.let(IResolvable::unwrap))
    }

    /**
     * Specifies the default recording frequency that AWS Config uses to record configuration
     * changes.
     *
     * AWS Config supports *Continuous recording* and *Daily recording* .
     *
     * * Continuous recording allows you to record configuration changes continuously whenever a
     * change occurs.
     * * Daily recording allows you to receive a configuration item (CI) representing the most
     * recent state of your resources over the last 24-hour period, only if it’s different from the
     * previous CI recorded.
     *
     *
     * AWS Firewall Manager depends on continuous recording to monitor your resources. If you are
     * using Firewall Manager, it is recommended that you set the recording frequency to Continuous.
     *
     *
     * You can also override the recording frequency for specific resource types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordingmode)
     * @param recordingMode Specifies the default recording frequency that AWS Config uses to record
     * configuration changes. 
     */
    override fun recordingMode(recordingMode: RecordingModeProperty) {
      cdkBuilder.recordingMode(recordingMode.let(RecordingModeProperty::unwrap))
    }

    /**
     * Specifies the default recording frequency that AWS Config uses to record configuration
     * changes.
     *
     * AWS Config supports *Continuous recording* and *Daily recording* .
     *
     * * Continuous recording allows you to record configuration changes continuously whenever a
     * change occurs.
     * * Daily recording allows you to receive a configuration item (CI) representing the most
     * recent state of your resources over the last 24-hour period, only if it’s different from the
     * previous CI recorded.
     *
     *
     * AWS Firewall Manager depends on continuous recording to monitor your resources. If you are
     * using Firewall Manager, it is recommended that you set the recording frequency to Continuous.
     *
     *
     * You can also override the recording frequency for specific resource types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordingmode)
     * @param recordingMode Specifies the default recording frequency that AWS Config uses to record
     * configuration changes. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00ffd9c129635aac8d171277a5f2480e3862c30ee64c42d0cee3790005d4a31a")
    override fun recordingMode(recordingMode: RecordingModeProperty.Builder.() -> Unit): Unit =
        recordingMode(RecordingModeProperty(recordingMode))

    /**
     * Amazon Resource Name (ARN) of the IAM role assumed by AWS Config and used by the
     * configuration recorder.
     *
     * For more information, see [Permissions for the IAM Role
     * Assigned](https://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) to
     * AWS Config in the AWS Config Developer Guide.
     *
     *
     * *Pre-existing AWS Config role*
     *
     * If you have used an AWS service that uses AWS Config , such as AWS Security Hub or AWS
     * Control Tower , and an AWS Config role has already been created, make sure that the IAM role
     * that you use when setting up AWS Config keeps the same minimum permissions as the already
     * created AWS Config role. You must do this so that the other AWS service continues to run as
     * expected.
     *
     * For example, if AWS Control Tower has an IAM role that allows AWS Config to read Amazon
     * Simple Storage Service ( Amazon S3 ) objects, make sure that the same permissions are granted
     * within the IAM role you use when setting up AWS Config . Otherwise, it may interfere with how
     * AWS Control Tower operates. For more information about IAM roles for AWS Config , see [*Identity
     * and Access Management for AWS
     * Config*](https://docs.aws.amazon.com/config/latest/developerguide/security-iam.html) in the *AWS
     * Config Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-rolearn)
     * @param roleArn Amazon Resource Name (ARN) of the IAM role assumed by AWS Config and used by
     * the configuration recorder. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.config.CfnConfigurationRecorder =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.config.CfnConfigurationRecorder.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationRecorder {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationRecorder(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder):
        CfnConfigurationRecorder = CfnConfigurationRecorder(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationRecorder):
        software.amazon.awscdk.services.config.CfnConfigurationRecorder = wrapped.cdkObject as
        software.amazon.awscdk.services.config.CfnConfigurationRecorder
  }

  /**
   * Specifies whether the configuration recorder excludes certain resource types from being
   * recorded.
   *
   * Use the `ResourceTypes` field to enter a comma-separated list of resource types you want to
   * exclude from recording.
   *
   * By default, when AWS Config adds support for a new resource type in the Region where you set up
   * the configuration recorder, including global resource types, AWS Config starts recording resources
   * of that type automatically.
   *
   *
   * *How to use the exclusion recording strategy*
   *
   * To use this option, you must set the `useOnly` field of
   * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
   * to `EXCLUSION_BY_RESOURCE_TYPES` .
   *
   * AWS Config will then record configuration changes for all supported resource types, except the
   * resource types that you specify to exclude from being recorded.
   *
   * *Global resource types and the exclusion recording strategy*
   *
   * Unless specifically listed as exclusions, `AWS::RDS::GlobalCluster` will be recorded
   * automatically in all supported AWS Config Regions were the configuration recorder is enabled.
   *
   * IAM users, groups, roles, and customer managed policies will be recorded in the Region where
   * you set up the configuration recorder if that is a Region where AWS Config was available before
   * February 2022. You cannot be record the global IAM resouce types in Regions supported by AWS
   * Config after February 2022. This list where you cannot record the global IAM resource types
   * includes the following Regions:
   *
   * * Asia Pacific (Hyderabad)
   * * Asia Pacific (Melbourne)
   * * Canada West (Calgary)
   * * Europe (Spain)
   * * Europe (Zurich)
   * * Israel (Tel Aviv)
   * * Middle East (UAE)
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * ExclusionByResourceTypesProperty exclusionByResourceTypesProperty =
   * ExclusionByResourceTypesProperty.builder()
   * .resourceTypes(List.of("resourceTypes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-exclusionbyresourcetypes.html)
   */
  public interface ExclusionByResourceTypesProperty {
    /**
     * A comma-separated list of resource types to exclude from recording by the configuration
     * recorder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-exclusionbyresourcetypes.html#cfn-config-configurationrecorder-exclusionbyresourcetypes-resourcetypes)
     */
    public fun resourceTypes(): List<String>

    /**
     * A builder for [ExclusionByResourceTypesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceTypes A comma-separated list of resource types to exclude from recording by
       * the configuration recorder. 
       */
      public fun resourceTypes(resourceTypes: List<String>)

      /**
       * @param resourceTypes A comma-separated list of resource types to exclude from recording by
       * the configuration recorder. 
       */
      public fun resourceTypes(vararg resourceTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty.builder()

      /**
       * @param resourceTypes A comma-separated list of resource types to exclude from recording by
       * the configuration recorder. 
       */
      override fun resourceTypes(resourceTypes: List<String>) {
        cdkBuilder.resourceTypes(resourceTypes)
      }

      /**
       * @param resourceTypes A comma-separated list of resource types to exclude from recording by
       * the configuration recorder. 
       */
      override fun resourceTypes(vararg resourceTypes: String): Unit =
          resourceTypes(resourceTypes.toList())

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty,
    ) : CdkObject(cdkObject), ExclusionByResourceTypesProperty {
      /**
       * A comma-separated list of resource types to exclude from recording by the configuration
       * recorder.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-exclusionbyresourcetypes.html#cfn-config-configurationrecorder-exclusionbyresourcetypes-resourcetypes)
       */
      override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExclusionByResourceTypesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty):
          ExclusionByResourceTypesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExclusionByResourceTypesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExclusionByResourceTypesProperty):
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.ExclusionByResourceTypesProperty
    }
  }

  /**
   * Specifies which resource types AWS Config records for configuration changes.
   *
   * By default, AWS Config records configuration changes for all current and future supported
   * resource types in the AWS Region where you have enabled AWS Config , excluding the global IAM
   * resource types: IAM users, groups, roles, and customer managed policies.
   *
   * In the recording group, you specify whether you want to record all supported current and future
   * supported resource types or to include or exclude specific resources types. For a list of
   * supported resource types, see [Supported Resource
   * Types](https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources)
   * in the *AWS Config developer guide* .
   *
   * If you don't want AWS Config to record all current and future supported resource types
   * (excluding the global IAM resource types), use one of the following recording strategies:
   *
   * * *Record all current and future resource types with exclusions* (
   * `EXCLUSION_BY_RESOURCE_TYPES` ), or
   * * *Record specific resource types* ( `INCLUSION_BY_RESOURCE_TYPES` ).
   *
   * If you use the recording strategy to *Record all current and future resource types* (
   * `ALL_SUPPORTED_RESOURCE_TYPES` ), you can use the flag `IncludeGlobalResourceTypes` to include the
   * global IAM resource types in your recording.
   *
   *
   * *Aurora global clusters are recorded in all enabled Regions*
   *
   * The `AWS::RDS::GlobalCluster` resource type will be recorded in all supported AWS Config
   * Regions where the configuration recorder is enabled.
   *
   * If you do not want to record `AWS::RDS::GlobalCluster` in all enabled Regions, use the
   * `EXCLUSION_BY_RESOURCE_TYPES` or `INCLUSION_BY_RESOURCE_TYPES` recording strategy.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * RecordingGroupProperty recordingGroupProperty = RecordingGroupProperty.builder()
   * .allSupported(false)
   * .exclusionByResourceTypes(ExclusionByResourceTypesProperty.builder()
   * .resourceTypes(List.of("resourceTypes"))
   * .build())
   * .includeGlobalResourceTypes(false)
   * .recordingStrategy(RecordingStrategyProperty.builder()
   * .useOnly("useOnly")
   * .build())
   * .resourceTypes(List.of("resourceTypes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html)
   */
  public interface RecordingGroupProperty {
    /**
     * Specifies whether AWS Config records configuration changes for all supported resource types,
     * excluding the global IAM resource types.
     *
     * If you set this field to `true` , when AWS Config adds support for a new resource type, AWS
     * Config starts recording resources of that type automatically.
     *
     * If you set this field to `true` , you cannot enumerate specific resource types to record in
     * the `resourceTypes` field of
     * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
     * , or to exclude in the `resourceTypes` field of
     * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
     * .
     *
     *
     * *Region availability*
     *
     * Check [Resource Coverage by Region
     * Availability](https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html)
     * to see if a resource type is supported in the AWS Region where you set up AWS Config .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-allsupported)
     */
    public fun allSupported(): Any? = unwrap(this).getAllSupported()

    /**
     * An object that specifies how AWS Config excludes resource types from being recorded by the
     * configuration recorder.
     *
     * To use this option, you must set the `useOnly` field of [AWS::Config::ConfigurationRecorder
     * RecordingStrategy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingstrategy.html)
     * to `EXCLUSION_BY_RESOURCE_TYPES` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-exclusionbyresourcetypes)
     */
    public fun exclusionByResourceTypes(): Any? = unwrap(this).getExclusionByResourceTypes()

    /**
     * This option is a bundle which only applies to the global IAM resource types: IAM users,
     * groups, roles, and customer managed policies.
     *
     * These global IAM resource types can only be recorded by AWS Config in Regions where AWS
     * Config was available before February 2022. You cannot be record the global IAM resouce types in
     * Regions supported by AWS Config after February 2022. This list where you cannot record the
     * global IAM resource types includes the following Regions:
     *
     * * Asia Pacific (Hyderabad)
     * * Asia Pacific (Melbourne)
     * * Canada West (Calgary)
     * * Europe (Spain)
     * * Europe (Zurich)
     * * Israel (Tel Aviv)
     * * Middle East (UAE)
     *
     *
     * *Aurora global clusters are recorded in all enabled Regions*
     *
     * The `AWS::RDS::GlobalCluster` resource type will be recorded in all supported AWS Config
     * Regions where the configuration recorder is enabled, even if `IncludeGlobalResourceTypes` is set
     * to `false` . The `IncludeGlobalResourceTypes` option is a bundle which only applies to IAM
     * users, groups, roles, and customer managed policies.
     *
     * If you do not want to record `AWS::RDS::GlobalCluster` in all enabled Regions, use one of the
     * following recording strategies:
     *
     * * *Record all current and future resource types with exclusions* (
     * `EXCLUSION_BY_RESOURCE_TYPES` ), or
     * * *Record specific resource types* ( `INCLUSION_BY_RESOURCE_TYPES` ).
     *
     * For more information, see [Selecting Which Resources are
     * Recorded](https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html#select-resources-all)
     * in the *AWS Config developer guide* . &gt; *IncludeGlobalResourceTypes and the exclusion
     * recording strategy*
     *
     * The `IncludeGlobalResourceTypes` field has no impact on the `EXCLUSION_BY_RESOURCE_TYPES`
     * recording strategy. This means that the global IAM resource types ( IAM users, groups, roles,
     * and customer managed policies) will not be automatically added as exclusions for
     * `ExclusionByResourceTypes` when `IncludeGlobalResourceTypes` is set to `false` .
     *
     * The `IncludeGlobalResourceTypes` field should only be used to modify the `AllSupported`
     * field, as the default for the `AllSupported` field is to record configuration changes for all
     * supported resource types excluding the global IAM resource types. To include the global IAM
     * resource types when `AllSupported` is set to `true` , make sure to set
     * `IncludeGlobalResourceTypes` to `true` .
     *
     * To exclude the global IAM resource types for the `EXCLUSION_BY_RESOURCE_TYPES` recording
     * strategy, you need to manually add them to the `ResourceTypes` field of
     * `ExclusionByResourceTypes` . &gt; *Required and optional fields*
     *
     * Before you set this field to `true` , set the `AllSupported` field of
     * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
     * to `true` . Optionally, you can set the `useOnly` field of
     * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
     * to `ALL_SUPPORTED_RESOURCE_TYPES` . &gt; *Overriding fields*
     *
     * If you set this field to `false` but list global IAM resource types in the `ResourceTypes`
     * field of
     * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
     * , AWS Config will still record configuration changes for those specified resource types
     * *regardless* of if you set the `IncludeGlobalResourceTypes` field to false.
     *
     * If you do not want to record configuration changes to the global IAM resource types (IAM
     * users, groups, roles, and customer managed policies), make sure to not list them in the
     * `ResourceTypes` field in addition to setting the `IncludeGlobalResourceTypes` field to false.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-includeglobalresourcetypes)
     */
    public fun includeGlobalResourceTypes(): Any? = unwrap(this).getIncludeGlobalResourceTypes()

    /**
     * An object that specifies the recording strategy for the configuration recorder.
     *
     * * If you set the `useOnly` field of
     * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
     * to `ALL_SUPPORTED_RESOURCE_TYPES` , AWS Config records configuration changes for all supported
     * resource types, excluding the global IAM resource types. You also must set the `AllSupported`
     * field of
     * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
     * to `true` . When AWS Config adds support for a new resource type, AWS Config automatically
     * starts recording resources of that type.
     * * If you set the `useOnly` field of
     * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
     * to `INCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration changes for only the
     * resource types you specify in the `ResourceTypes` field of
     * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
     * .
     * * If you set the `useOnly` field of
     * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
     * to `EXCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration changes for all supported
     * resource types except the resource types that you specify to exclude from being recorded in the
     * `ResourceTypes` field of
     * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
     * .
     *
     *
     * *Required and optional fields*
     *
     * The `recordingStrategy` field is optional when you set the `AllSupported` field of
     * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
     * to `true` .
     *
     * The `recordingStrategy` field is optional when you list resource types in the `ResourceTypes`
     * field of
     * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
     * .
     *
     * The `recordingStrategy` field is required if you list resource types to exclude from
     * recording in the `ResourceTypes` field of
     * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
     * . &gt; *Overriding fields*
     *
     * If you choose `EXCLUSION_BY_RESOURCE_TYPES` for the recording strategy, the
     * `ExclusionByResourceTypes` field will override other properties in the request.
     *
     * For example, even if you set `IncludeGlobalResourceTypes` to false, global IAM resource types
     * will still be automatically recorded in this option unless those resource types are specifically
     * listed as exclusions in the `ResourceTypes` field of `ExclusionByResourceTypes` . &gt; *Global
     * resources types and the resource exclusion recording strategy*
     *
     * By default, if you choose the `EXCLUSION_BY_RESOURCE_TYPES` recording strategy, when AWS
     * Config adds support for a new resource type in the Region where you set up the configuration
     * recorder, including global resource types, AWS Config starts recording resources of that type
     * automatically.
     *
     * Unless specifically listed as exclusions, `AWS::RDS::GlobalCluster` will be recorded
     * automatically in all supported AWS Config Regions were the configuration recorder is enabled.
     *
     * IAM users, groups, roles, and customer managed policies will be recorded in the Region where
     * you set up the configuration recorder if that is a Region where AWS Config was available before
     * February 2022. You cannot be record the global IAM resouce types in Regions supported by AWS
     * Config after February 2022. This list where you cannot record the global IAM resource types
     * includes the following Regions:
     *
     * * Asia Pacific (Hyderabad)
     * * Asia Pacific (Melbourne)
     * * Canada West (Calgary)
     * * Europe (Spain)
     * * Europe (Zurich)
     * * Israel (Tel Aviv)
     * * Middle East (UAE)
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-recordingstrategy)
     */
    public fun recordingStrategy(): Any? = unwrap(this).getRecordingStrategy()

    /**
     * A comma-separated list that specifies which resource types AWS Config records.
     *
     * For a list of valid `ResourceTypes` values, see the *Resource Type Value* column in
     * [Supported AWS resource
     * Types](https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources)
     * in the *AWS Config developer guide* .
     *
     *
     * *Required and optional fields*
     *
     * Optionally, you can set the `useOnly` field of
     * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
     * to `INCLUSION_BY_RESOURCE_TYPES` .
     *
     * To record all configuration changes, set the `AllSupported` field of
     * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
     * to `true` , and either omit this field or don't specify any resource types in this field. If you
     * set the `AllSupported` field to `false` and specify values for `ResourceTypes` , when AWS Config
     * adds support for a new type of resource, it will not record resources of that type unless you
     * manually add that type to your recording group. &gt; *Region availability*
     *
     * Before specifying a resource type for AWS Config to track, check [Resource Coverage by Region
     * Availability](https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html)
     * to see if the resource type is supported in the AWS Region where you set up AWS Config . If a
     * resource type is supported by AWS Config in at least one Region, you can enable the recording of
     * that resource type in all Regions supported by AWS Config , even if the specified resource type
     * is not supported in the AWS Region where you set up AWS Config .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-resourcetypes)
     */
    public fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?: emptyList()

    /**
     * A builder for [RecordingGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allSupported Specifies whether AWS Config records configuration changes for all
       * supported resource types, excluding the global IAM resource types.
       * If you set this field to `true` , when AWS Config adds support for a new resource type, AWS
       * Config starts recording resources of that type automatically.
       *
       * If you set this field to `true` , you cannot enumerate specific resource types to record in
       * the `resourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * , or to exclude in the `resourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * .
       *
       *
       * *Region availability*
       *
       * Check [Resource Coverage by Region
       * Availability](https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html)
       * to see if a resource type is supported in the AWS Region where you set up AWS Config .
       */
      public fun allSupported(allSupported: Boolean)

      /**
       * @param allSupported Specifies whether AWS Config records configuration changes for all
       * supported resource types, excluding the global IAM resource types.
       * If you set this field to `true` , when AWS Config adds support for a new resource type, AWS
       * Config starts recording resources of that type automatically.
       *
       * If you set this field to `true` , you cannot enumerate specific resource types to record in
       * the `resourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * , or to exclude in the `resourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * .
       *
       *
       * *Region availability*
       *
       * Check [Resource Coverage by Region
       * Availability](https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html)
       * to see if a resource type is supported in the AWS Region where you set up AWS Config .
       */
      public fun allSupported(allSupported: IResolvable)

      /**
       * @param exclusionByResourceTypes An object that specifies how AWS Config excludes resource
       * types from being recorded by the configuration recorder.
       * To use this option, you must set the `useOnly` field of [AWS::Config::ConfigurationRecorder
       * RecordingStrategy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingstrategy.html)
       * to `EXCLUSION_BY_RESOURCE_TYPES` .
       */
      public fun exclusionByResourceTypes(exclusionByResourceTypes: IResolvable)

      /**
       * @param exclusionByResourceTypes An object that specifies how AWS Config excludes resource
       * types from being recorded by the configuration recorder.
       * To use this option, you must set the `useOnly` field of [AWS::Config::ConfigurationRecorder
       * RecordingStrategy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingstrategy.html)
       * to `EXCLUSION_BY_RESOURCE_TYPES` .
       */
      public
          fun exclusionByResourceTypes(exclusionByResourceTypes: ExclusionByResourceTypesProperty)

      /**
       * @param exclusionByResourceTypes An object that specifies how AWS Config excludes resource
       * types from being recorded by the configuration recorder.
       * To use this option, you must set the `useOnly` field of [AWS::Config::ConfigurationRecorder
       * RecordingStrategy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingstrategy.html)
       * to `EXCLUSION_BY_RESOURCE_TYPES` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f27336b188846920bb30023db5d8a8a8808af70358e8d90cb15a76098a0c1937")
      public
          fun exclusionByResourceTypes(exclusionByResourceTypes: ExclusionByResourceTypesProperty.Builder.() -> Unit)

      /**
       * @param includeGlobalResourceTypes This option is a bundle which only applies to the global
       * IAM resource types: IAM users, groups, roles, and customer managed policies.
       * These global IAM resource types can only be recorded by AWS Config in Regions where AWS
       * Config was available before February 2022. You cannot be record the global IAM resouce types
       * in Regions supported by AWS Config after February 2022. This list where you cannot record the
       * global IAM resource types includes the following Regions:
       *
       * * Asia Pacific (Hyderabad)
       * * Asia Pacific (Melbourne)
       * * Canada West (Calgary)
       * * Europe (Spain)
       * * Europe (Zurich)
       * * Israel (Tel Aviv)
       * * Middle East (UAE)
       *
       *
       * *Aurora global clusters are recorded in all enabled Regions*
       *
       * The `AWS::RDS::GlobalCluster` resource type will be recorded in all supported AWS Config
       * Regions where the configuration recorder is enabled, even if `IncludeGlobalResourceTypes` is
       * set to `false` . The `IncludeGlobalResourceTypes` option is a bundle which only applies to IAM
       * users, groups, roles, and customer managed policies.
       *
       * If you do not want to record `AWS::RDS::GlobalCluster` in all enabled Regions, use one of
       * the following recording strategies:
       *
       * * *Record all current and future resource types with exclusions* (
       * `EXCLUSION_BY_RESOURCE_TYPES` ), or
       * * *Record specific resource types* ( `INCLUSION_BY_RESOURCE_TYPES` ).
       *
       * For more information, see [Selecting Which Resources are
       * Recorded](https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html#select-resources-all)
       * in the *AWS Config developer guide* . &gt; *IncludeGlobalResourceTypes and the exclusion
       * recording strategy*
       *
       * The `IncludeGlobalResourceTypes` field has no impact on the `EXCLUSION_BY_RESOURCE_TYPES`
       * recording strategy. This means that the global IAM resource types ( IAM users, groups, roles,
       * and customer managed policies) will not be automatically added as exclusions for
       * `ExclusionByResourceTypes` when `IncludeGlobalResourceTypes` is set to `false` .
       *
       * The `IncludeGlobalResourceTypes` field should only be used to modify the `AllSupported`
       * field, as the default for the `AllSupported` field is to record configuration changes for all
       * supported resource types excluding the global IAM resource types. To include the global IAM
       * resource types when `AllSupported` is set to `true` , make sure to set
       * `IncludeGlobalResourceTypes` to `true` .
       *
       * To exclude the global IAM resource types for the `EXCLUSION_BY_RESOURCE_TYPES` recording
       * strategy, you need to manually add them to the `ResourceTypes` field of
       * `ExclusionByResourceTypes` . &gt; *Required and optional fields*
       *
       * Before you set this field to `true` , set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` . Optionally, you can set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `ALL_SUPPORTED_RESOURCE_TYPES` . &gt; *Overriding fields*
       *
       * If you set this field to `false` but list global IAM resource types in the `ResourceTypes`
       * field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * , AWS Config will still record configuration changes for those specified resource types
       * *regardless* of if you set the `IncludeGlobalResourceTypes` field to false.
       *
       * If you do not want to record configuration changes to the global IAM resource types (IAM
       * users, groups, roles, and customer managed policies), make sure to not list them in the
       * `ResourceTypes` field in addition to setting the `IncludeGlobalResourceTypes` field to false.
       */
      public fun includeGlobalResourceTypes(includeGlobalResourceTypes: Boolean)

      /**
       * @param includeGlobalResourceTypes This option is a bundle which only applies to the global
       * IAM resource types: IAM users, groups, roles, and customer managed policies.
       * These global IAM resource types can only be recorded by AWS Config in Regions where AWS
       * Config was available before February 2022. You cannot be record the global IAM resouce types
       * in Regions supported by AWS Config after February 2022. This list where you cannot record the
       * global IAM resource types includes the following Regions:
       *
       * * Asia Pacific (Hyderabad)
       * * Asia Pacific (Melbourne)
       * * Canada West (Calgary)
       * * Europe (Spain)
       * * Europe (Zurich)
       * * Israel (Tel Aviv)
       * * Middle East (UAE)
       *
       *
       * *Aurora global clusters are recorded in all enabled Regions*
       *
       * The `AWS::RDS::GlobalCluster` resource type will be recorded in all supported AWS Config
       * Regions where the configuration recorder is enabled, even if `IncludeGlobalResourceTypes` is
       * set to `false` . The `IncludeGlobalResourceTypes` option is a bundle which only applies to IAM
       * users, groups, roles, and customer managed policies.
       *
       * If you do not want to record `AWS::RDS::GlobalCluster` in all enabled Regions, use one of
       * the following recording strategies:
       *
       * * *Record all current and future resource types with exclusions* (
       * `EXCLUSION_BY_RESOURCE_TYPES` ), or
       * * *Record specific resource types* ( `INCLUSION_BY_RESOURCE_TYPES` ).
       *
       * For more information, see [Selecting Which Resources are
       * Recorded](https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html#select-resources-all)
       * in the *AWS Config developer guide* . &gt; *IncludeGlobalResourceTypes and the exclusion
       * recording strategy*
       *
       * The `IncludeGlobalResourceTypes` field has no impact on the `EXCLUSION_BY_RESOURCE_TYPES`
       * recording strategy. This means that the global IAM resource types ( IAM users, groups, roles,
       * and customer managed policies) will not be automatically added as exclusions for
       * `ExclusionByResourceTypes` when `IncludeGlobalResourceTypes` is set to `false` .
       *
       * The `IncludeGlobalResourceTypes` field should only be used to modify the `AllSupported`
       * field, as the default for the `AllSupported` field is to record configuration changes for all
       * supported resource types excluding the global IAM resource types. To include the global IAM
       * resource types when `AllSupported` is set to `true` , make sure to set
       * `IncludeGlobalResourceTypes` to `true` .
       *
       * To exclude the global IAM resource types for the `EXCLUSION_BY_RESOURCE_TYPES` recording
       * strategy, you need to manually add them to the `ResourceTypes` field of
       * `ExclusionByResourceTypes` . &gt; *Required and optional fields*
       *
       * Before you set this field to `true` , set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` . Optionally, you can set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `ALL_SUPPORTED_RESOURCE_TYPES` . &gt; *Overriding fields*
       *
       * If you set this field to `false` but list global IAM resource types in the `ResourceTypes`
       * field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * , AWS Config will still record configuration changes for those specified resource types
       * *regardless* of if you set the `IncludeGlobalResourceTypes` field to false.
       *
       * If you do not want to record configuration changes to the global IAM resource types (IAM
       * users, groups, roles, and customer managed policies), make sure to not list them in the
       * `ResourceTypes` field in addition to setting the `IncludeGlobalResourceTypes` field to false.
       */
      public fun includeGlobalResourceTypes(includeGlobalResourceTypes: IResolvable)

      /**
       * @param recordingStrategy An object that specifies the recording strategy for the
       * configuration recorder.
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `ALL_SUPPORTED_RESOURCE_TYPES` , AWS Config records configuration changes for all supported
       * resource types, excluding the global IAM resource types. You also must set the `AllSupported`
       * field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` . When AWS Config adds support for a new resource type, AWS Config automatically
       * starts recording resources of that type.
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `INCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration changes for only the
       * resource types you specify in the `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `EXCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration changes for all supported
       * resource types except the resource types that you specify to exclude from being recorded in
       * the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * .
       *
       *
       * *Required and optional fields*
       *
       * The `recordingStrategy` field is optional when you set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` .
       *
       * The `recordingStrategy` field is optional when you list resource types in the
       * `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       *
       * The `recordingStrategy` field is required if you list resource types to exclude from
       * recording in the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * . &gt; *Overriding fields*
       *
       * If you choose `EXCLUSION_BY_RESOURCE_TYPES` for the recording strategy, the
       * `ExclusionByResourceTypes` field will override other properties in the request.
       *
       * For example, even if you set `IncludeGlobalResourceTypes` to false, global IAM resource
       * types will still be automatically recorded in this option unless those resource types are
       * specifically listed as exclusions in the `ResourceTypes` field of `ExclusionByResourceTypes` .
       * &gt; *Global resources types and the resource exclusion recording strategy*
       *
       * By default, if you choose the `EXCLUSION_BY_RESOURCE_TYPES` recording strategy, when AWS
       * Config adds support for a new resource type in the Region where you set up the configuration
       * recorder, including global resource types, AWS Config starts recording resources of that type
       * automatically.
       *
       * Unless specifically listed as exclusions, `AWS::RDS::GlobalCluster` will be recorded
       * automatically in all supported AWS Config Regions were the configuration recorder is enabled.
       *
       * IAM users, groups, roles, and customer managed policies will be recorded in the Region
       * where you set up the configuration recorder if that is a Region where AWS Config was available
       * before February 2022. You cannot be record the global IAM resouce types in Regions supported
       * by AWS Config after February 2022. This list where you cannot record the global IAM resource
       * types includes the following Regions:
       *
       * * Asia Pacific (Hyderabad)
       * * Asia Pacific (Melbourne)
       * * Canada West (Calgary)
       * * Europe (Spain)
       * * Europe (Zurich)
       * * Israel (Tel Aviv)
       * * Middle East (UAE)
       */
      public fun recordingStrategy(recordingStrategy: IResolvable)

      /**
       * @param recordingStrategy An object that specifies the recording strategy for the
       * configuration recorder.
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `ALL_SUPPORTED_RESOURCE_TYPES` , AWS Config records configuration changes for all supported
       * resource types, excluding the global IAM resource types. You also must set the `AllSupported`
       * field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` . When AWS Config adds support for a new resource type, AWS Config automatically
       * starts recording resources of that type.
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `INCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration changes for only the
       * resource types you specify in the `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `EXCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration changes for all supported
       * resource types except the resource types that you specify to exclude from being recorded in
       * the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * .
       *
       *
       * *Required and optional fields*
       *
       * The `recordingStrategy` field is optional when you set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` .
       *
       * The `recordingStrategy` field is optional when you list resource types in the
       * `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       *
       * The `recordingStrategy` field is required if you list resource types to exclude from
       * recording in the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * . &gt; *Overriding fields*
       *
       * If you choose `EXCLUSION_BY_RESOURCE_TYPES` for the recording strategy, the
       * `ExclusionByResourceTypes` field will override other properties in the request.
       *
       * For example, even if you set `IncludeGlobalResourceTypes` to false, global IAM resource
       * types will still be automatically recorded in this option unless those resource types are
       * specifically listed as exclusions in the `ResourceTypes` field of `ExclusionByResourceTypes` .
       * &gt; *Global resources types and the resource exclusion recording strategy*
       *
       * By default, if you choose the `EXCLUSION_BY_RESOURCE_TYPES` recording strategy, when AWS
       * Config adds support for a new resource type in the Region where you set up the configuration
       * recorder, including global resource types, AWS Config starts recording resources of that type
       * automatically.
       *
       * Unless specifically listed as exclusions, `AWS::RDS::GlobalCluster` will be recorded
       * automatically in all supported AWS Config Regions were the configuration recorder is enabled.
       *
       * IAM users, groups, roles, and customer managed policies will be recorded in the Region
       * where you set up the configuration recorder if that is a Region where AWS Config was available
       * before February 2022. You cannot be record the global IAM resouce types in Regions supported
       * by AWS Config after February 2022. This list where you cannot record the global IAM resource
       * types includes the following Regions:
       *
       * * Asia Pacific (Hyderabad)
       * * Asia Pacific (Melbourne)
       * * Canada West (Calgary)
       * * Europe (Spain)
       * * Europe (Zurich)
       * * Israel (Tel Aviv)
       * * Middle East (UAE)
       */
      public fun recordingStrategy(recordingStrategy: RecordingStrategyProperty)

      /**
       * @param recordingStrategy An object that specifies the recording strategy for the
       * configuration recorder.
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `ALL_SUPPORTED_RESOURCE_TYPES` , AWS Config records configuration changes for all supported
       * resource types, excluding the global IAM resource types. You also must set the `AllSupported`
       * field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` . When AWS Config adds support for a new resource type, AWS Config automatically
       * starts recording resources of that type.
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `INCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration changes for only the
       * resource types you specify in the `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `EXCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration changes for all supported
       * resource types except the resource types that you specify to exclude from being recorded in
       * the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * .
       *
       *
       * *Required and optional fields*
       *
       * The `recordingStrategy` field is optional when you set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` .
       *
       * The `recordingStrategy` field is optional when you list resource types in the
       * `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       *
       * The `recordingStrategy` field is required if you list resource types to exclude from
       * recording in the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * . &gt; *Overriding fields*
       *
       * If you choose `EXCLUSION_BY_RESOURCE_TYPES` for the recording strategy, the
       * `ExclusionByResourceTypes` field will override other properties in the request.
       *
       * For example, even if you set `IncludeGlobalResourceTypes` to false, global IAM resource
       * types will still be automatically recorded in this option unless those resource types are
       * specifically listed as exclusions in the `ResourceTypes` field of `ExclusionByResourceTypes` .
       * &gt; *Global resources types and the resource exclusion recording strategy*
       *
       * By default, if you choose the `EXCLUSION_BY_RESOURCE_TYPES` recording strategy, when AWS
       * Config adds support for a new resource type in the Region where you set up the configuration
       * recorder, including global resource types, AWS Config starts recording resources of that type
       * automatically.
       *
       * Unless specifically listed as exclusions, `AWS::RDS::GlobalCluster` will be recorded
       * automatically in all supported AWS Config Regions were the configuration recorder is enabled.
       *
       * IAM users, groups, roles, and customer managed policies will be recorded in the Region
       * where you set up the configuration recorder if that is a Region where AWS Config was available
       * before February 2022. You cannot be record the global IAM resouce types in Regions supported
       * by AWS Config after February 2022. This list where you cannot record the global IAM resource
       * types includes the following Regions:
       *
       * * Asia Pacific (Hyderabad)
       * * Asia Pacific (Melbourne)
       * * Canada West (Calgary)
       * * Europe (Spain)
       * * Europe (Zurich)
       * * Israel (Tel Aviv)
       * * Middle East (UAE)
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1515b32155e4b51fcd151606146580e58457af5e02830e5901331e907f50589")
      public fun recordingStrategy(recordingStrategy: RecordingStrategyProperty.Builder.() -> Unit)

      /**
       * @param resourceTypes A comma-separated list that specifies which resource types AWS Config
       * records.
       * For a list of valid `ResourceTypes` values, see the *Resource Type Value* column in
       * [Supported AWS resource
       * Types](https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources)
       * in the *AWS Config developer guide* .
       *
       *
       * *Required and optional fields*
       *
       * Optionally, you can set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `INCLUSION_BY_RESOURCE_TYPES` .
       *
       * To record all configuration changes, set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` , and either omit this field or don't specify any resource types in this field. If
       * you set the `AllSupported` field to `false` and specify values for `ResourceTypes` , when AWS
       * Config adds support for a new type of resource, it will not record resources of that type
       * unless you manually add that type to your recording group. &gt; *Region availability*
       *
       * Before specifying a resource type for AWS Config to track, check [Resource Coverage by
       * Region
       * Availability](https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html)
       * to see if the resource type is supported in the AWS Region where you set up AWS Config . If a
       * resource type is supported by AWS Config in at least one Region, you can enable the recording
       * of that resource type in all Regions supported by AWS Config , even if the specified resource
       * type is not supported in the AWS Region where you set up AWS Config .
       */
      public fun resourceTypes(resourceTypes: List<String>)

      /**
       * @param resourceTypes A comma-separated list that specifies which resource types AWS Config
       * records.
       * For a list of valid `ResourceTypes` values, see the *Resource Type Value* column in
       * [Supported AWS resource
       * Types](https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources)
       * in the *AWS Config developer guide* .
       *
       *
       * *Required and optional fields*
       *
       * Optionally, you can set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `INCLUSION_BY_RESOURCE_TYPES` .
       *
       * To record all configuration changes, set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` , and either omit this field or don't specify any resource types in this field. If
       * you set the `AllSupported` field to `false` and specify values for `ResourceTypes` , when AWS
       * Config adds support for a new type of resource, it will not record resources of that type
       * unless you manually add that type to your recording group. &gt; *Region availability*
       *
       * Before specifying a resource type for AWS Config to track, check [Resource Coverage by
       * Region
       * Availability](https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html)
       * to see if the resource type is supported in the AWS Region where you set up AWS Config . If a
       * resource type is supported by AWS Config in at least one Region, you can enable the recording
       * of that resource type in all Regions supported by AWS Config , even if the specified resource
       * type is not supported in the AWS Region where you set up AWS Config .
       */
      public fun resourceTypes(vararg resourceTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty.builder()

      /**
       * @param allSupported Specifies whether AWS Config records configuration changes for all
       * supported resource types, excluding the global IAM resource types.
       * If you set this field to `true` , when AWS Config adds support for a new resource type, AWS
       * Config starts recording resources of that type automatically.
       *
       * If you set this field to `true` , you cannot enumerate specific resource types to record in
       * the `resourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * , or to exclude in the `resourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * .
       *
       *
       * *Region availability*
       *
       * Check [Resource Coverage by Region
       * Availability](https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html)
       * to see if a resource type is supported in the AWS Region where you set up AWS Config .
       */
      override fun allSupported(allSupported: Boolean) {
        cdkBuilder.allSupported(allSupported)
      }

      /**
       * @param allSupported Specifies whether AWS Config records configuration changes for all
       * supported resource types, excluding the global IAM resource types.
       * If you set this field to `true` , when AWS Config adds support for a new resource type, AWS
       * Config starts recording resources of that type automatically.
       *
       * If you set this field to `true` , you cannot enumerate specific resource types to record in
       * the `resourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * , or to exclude in the `resourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * .
       *
       *
       * *Region availability*
       *
       * Check [Resource Coverage by Region
       * Availability](https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html)
       * to see if a resource type is supported in the AWS Region where you set up AWS Config .
       */
      override fun allSupported(allSupported: IResolvable) {
        cdkBuilder.allSupported(allSupported.let(IResolvable::unwrap))
      }

      /**
       * @param exclusionByResourceTypes An object that specifies how AWS Config excludes resource
       * types from being recorded by the configuration recorder.
       * To use this option, you must set the `useOnly` field of [AWS::Config::ConfigurationRecorder
       * RecordingStrategy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingstrategy.html)
       * to `EXCLUSION_BY_RESOURCE_TYPES` .
       */
      override fun exclusionByResourceTypes(exclusionByResourceTypes: IResolvable) {
        cdkBuilder.exclusionByResourceTypes(exclusionByResourceTypes.let(IResolvable::unwrap))
      }

      /**
       * @param exclusionByResourceTypes An object that specifies how AWS Config excludes resource
       * types from being recorded by the configuration recorder.
       * To use this option, you must set the `useOnly` field of [AWS::Config::ConfigurationRecorder
       * RecordingStrategy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingstrategy.html)
       * to `EXCLUSION_BY_RESOURCE_TYPES` .
       */
      override
          fun exclusionByResourceTypes(exclusionByResourceTypes: ExclusionByResourceTypesProperty) {
        cdkBuilder.exclusionByResourceTypes(exclusionByResourceTypes.let(ExclusionByResourceTypesProperty::unwrap))
      }

      /**
       * @param exclusionByResourceTypes An object that specifies how AWS Config excludes resource
       * types from being recorded by the configuration recorder.
       * To use this option, you must set the `useOnly` field of [AWS::Config::ConfigurationRecorder
       * RecordingStrategy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingstrategy.html)
       * to `EXCLUSION_BY_RESOURCE_TYPES` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f27336b188846920bb30023db5d8a8a8808af70358e8d90cb15a76098a0c1937")
      override
          fun exclusionByResourceTypes(exclusionByResourceTypes: ExclusionByResourceTypesProperty.Builder.() -> Unit):
          Unit =
          exclusionByResourceTypes(ExclusionByResourceTypesProperty(exclusionByResourceTypes))

      /**
       * @param includeGlobalResourceTypes This option is a bundle which only applies to the global
       * IAM resource types: IAM users, groups, roles, and customer managed policies.
       * These global IAM resource types can only be recorded by AWS Config in Regions where AWS
       * Config was available before February 2022. You cannot be record the global IAM resouce types
       * in Regions supported by AWS Config after February 2022. This list where you cannot record the
       * global IAM resource types includes the following Regions:
       *
       * * Asia Pacific (Hyderabad)
       * * Asia Pacific (Melbourne)
       * * Canada West (Calgary)
       * * Europe (Spain)
       * * Europe (Zurich)
       * * Israel (Tel Aviv)
       * * Middle East (UAE)
       *
       *
       * *Aurora global clusters are recorded in all enabled Regions*
       *
       * The `AWS::RDS::GlobalCluster` resource type will be recorded in all supported AWS Config
       * Regions where the configuration recorder is enabled, even if `IncludeGlobalResourceTypes` is
       * set to `false` . The `IncludeGlobalResourceTypes` option is a bundle which only applies to IAM
       * users, groups, roles, and customer managed policies.
       *
       * If you do not want to record `AWS::RDS::GlobalCluster` in all enabled Regions, use one of
       * the following recording strategies:
       *
       * * *Record all current and future resource types with exclusions* (
       * `EXCLUSION_BY_RESOURCE_TYPES` ), or
       * * *Record specific resource types* ( `INCLUSION_BY_RESOURCE_TYPES` ).
       *
       * For more information, see [Selecting Which Resources are
       * Recorded](https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html#select-resources-all)
       * in the *AWS Config developer guide* . &gt; *IncludeGlobalResourceTypes and the exclusion
       * recording strategy*
       *
       * The `IncludeGlobalResourceTypes` field has no impact on the `EXCLUSION_BY_RESOURCE_TYPES`
       * recording strategy. This means that the global IAM resource types ( IAM users, groups, roles,
       * and customer managed policies) will not be automatically added as exclusions for
       * `ExclusionByResourceTypes` when `IncludeGlobalResourceTypes` is set to `false` .
       *
       * The `IncludeGlobalResourceTypes` field should only be used to modify the `AllSupported`
       * field, as the default for the `AllSupported` field is to record configuration changes for all
       * supported resource types excluding the global IAM resource types. To include the global IAM
       * resource types when `AllSupported` is set to `true` , make sure to set
       * `IncludeGlobalResourceTypes` to `true` .
       *
       * To exclude the global IAM resource types for the `EXCLUSION_BY_RESOURCE_TYPES` recording
       * strategy, you need to manually add them to the `ResourceTypes` field of
       * `ExclusionByResourceTypes` . &gt; *Required and optional fields*
       *
       * Before you set this field to `true` , set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` . Optionally, you can set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `ALL_SUPPORTED_RESOURCE_TYPES` . &gt; *Overriding fields*
       *
       * If you set this field to `false` but list global IAM resource types in the `ResourceTypes`
       * field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * , AWS Config will still record configuration changes for those specified resource types
       * *regardless* of if you set the `IncludeGlobalResourceTypes` field to false.
       *
       * If you do not want to record configuration changes to the global IAM resource types (IAM
       * users, groups, roles, and customer managed policies), make sure to not list them in the
       * `ResourceTypes` field in addition to setting the `IncludeGlobalResourceTypes` field to false.
       */
      override fun includeGlobalResourceTypes(includeGlobalResourceTypes: Boolean) {
        cdkBuilder.includeGlobalResourceTypes(includeGlobalResourceTypes)
      }

      /**
       * @param includeGlobalResourceTypes This option is a bundle which only applies to the global
       * IAM resource types: IAM users, groups, roles, and customer managed policies.
       * These global IAM resource types can only be recorded by AWS Config in Regions where AWS
       * Config was available before February 2022. You cannot be record the global IAM resouce types
       * in Regions supported by AWS Config after February 2022. This list where you cannot record the
       * global IAM resource types includes the following Regions:
       *
       * * Asia Pacific (Hyderabad)
       * * Asia Pacific (Melbourne)
       * * Canada West (Calgary)
       * * Europe (Spain)
       * * Europe (Zurich)
       * * Israel (Tel Aviv)
       * * Middle East (UAE)
       *
       *
       * *Aurora global clusters are recorded in all enabled Regions*
       *
       * The `AWS::RDS::GlobalCluster` resource type will be recorded in all supported AWS Config
       * Regions where the configuration recorder is enabled, even if `IncludeGlobalResourceTypes` is
       * set to `false` . The `IncludeGlobalResourceTypes` option is a bundle which only applies to IAM
       * users, groups, roles, and customer managed policies.
       *
       * If you do not want to record `AWS::RDS::GlobalCluster` in all enabled Regions, use one of
       * the following recording strategies:
       *
       * * *Record all current and future resource types with exclusions* (
       * `EXCLUSION_BY_RESOURCE_TYPES` ), or
       * * *Record specific resource types* ( `INCLUSION_BY_RESOURCE_TYPES` ).
       *
       * For more information, see [Selecting Which Resources are
       * Recorded](https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html#select-resources-all)
       * in the *AWS Config developer guide* . &gt; *IncludeGlobalResourceTypes and the exclusion
       * recording strategy*
       *
       * The `IncludeGlobalResourceTypes` field has no impact on the `EXCLUSION_BY_RESOURCE_TYPES`
       * recording strategy. This means that the global IAM resource types ( IAM users, groups, roles,
       * and customer managed policies) will not be automatically added as exclusions for
       * `ExclusionByResourceTypes` when `IncludeGlobalResourceTypes` is set to `false` .
       *
       * The `IncludeGlobalResourceTypes` field should only be used to modify the `AllSupported`
       * field, as the default for the `AllSupported` field is to record configuration changes for all
       * supported resource types excluding the global IAM resource types. To include the global IAM
       * resource types when `AllSupported` is set to `true` , make sure to set
       * `IncludeGlobalResourceTypes` to `true` .
       *
       * To exclude the global IAM resource types for the `EXCLUSION_BY_RESOURCE_TYPES` recording
       * strategy, you need to manually add them to the `ResourceTypes` field of
       * `ExclusionByResourceTypes` . &gt; *Required and optional fields*
       *
       * Before you set this field to `true` , set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` . Optionally, you can set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `ALL_SUPPORTED_RESOURCE_TYPES` . &gt; *Overriding fields*
       *
       * If you set this field to `false` but list global IAM resource types in the `ResourceTypes`
       * field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * , AWS Config will still record configuration changes for those specified resource types
       * *regardless* of if you set the `IncludeGlobalResourceTypes` field to false.
       *
       * If you do not want to record configuration changes to the global IAM resource types (IAM
       * users, groups, roles, and customer managed policies), make sure to not list them in the
       * `ResourceTypes` field in addition to setting the `IncludeGlobalResourceTypes` field to false.
       */
      override fun includeGlobalResourceTypes(includeGlobalResourceTypes: IResolvable) {
        cdkBuilder.includeGlobalResourceTypes(includeGlobalResourceTypes.let(IResolvable::unwrap))
      }

      /**
       * @param recordingStrategy An object that specifies the recording strategy for the
       * configuration recorder.
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `ALL_SUPPORTED_RESOURCE_TYPES` , AWS Config records configuration changes for all supported
       * resource types, excluding the global IAM resource types. You also must set the `AllSupported`
       * field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` . When AWS Config adds support for a new resource type, AWS Config automatically
       * starts recording resources of that type.
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `INCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration changes for only the
       * resource types you specify in the `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `EXCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration changes for all supported
       * resource types except the resource types that you specify to exclude from being recorded in
       * the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * .
       *
       *
       * *Required and optional fields*
       *
       * The `recordingStrategy` field is optional when you set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` .
       *
       * The `recordingStrategy` field is optional when you list resource types in the
       * `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       *
       * The `recordingStrategy` field is required if you list resource types to exclude from
       * recording in the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * . &gt; *Overriding fields*
       *
       * If you choose `EXCLUSION_BY_RESOURCE_TYPES` for the recording strategy, the
       * `ExclusionByResourceTypes` field will override other properties in the request.
       *
       * For example, even if you set `IncludeGlobalResourceTypes` to false, global IAM resource
       * types will still be automatically recorded in this option unless those resource types are
       * specifically listed as exclusions in the `ResourceTypes` field of `ExclusionByResourceTypes` .
       * &gt; *Global resources types and the resource exclusion recording strategy*
       *
       * By default, if you choose the `EXCLUSION_BY_RESOURCE_TYPES` recording strategy, when AWS
       * Config adds support for a new resource type in the Region where you set up the configuration
       * recorder, including global resource types, AWS Config starts recording resources of that type
       * automatically.
       *
       * Unless specifically listed as exclusions, `AWS::RDS::GlobalCluster` will be recorded
       * automatically in all supported AWS Config Regions were the configuration recorder is enabled.
       *
       * IAM users, groups, roles, and customer managed policies will be recorded in the Region
       * where you set up the configuration recorder if that is a Region where AWS Config was available
       * before February 2022. You cannot be record the global IAM resouce types in Regions supported
       * by AWS Config after February 2022. This list where you cannot record the global IAM resource
       * types includes the following Regions:
       *
       * * Asia Pacific (Hyderabad)
       * * Asia Pacific (Melbourne)
       * * Canada West (Calgary)
       * * Europe (Spain)
       * * Europe (Zurich)
       * * Israel (Tel Aviv)
       * * Middle East (UAE)
       */
      override fun recordingStrategy(recordingStrategy: IResolvable) {
        cdkBuilder.recordingStrategy(recordingStrategy.let(IResolvable::unwrap))
      }

      /**
       * @param recordingStrategy An object that specifies the recording strategy for the
       * configuration recorder.
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `ALL_SUPPORTED_RESOURCE_TYPES` , AWS Config records configuration changes for all supported
       * resource types, excluding the global IAM resource types. You also must set the `AllSupported`
       * field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` . When AWS Config adds support for a new resource type, AWS Config automatically
       * starts recording resources of that type.
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `INCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration changes for only the
       * resource types you specify in the `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `EXCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration changes for all supported
       * resource types except the resource types that you specify to exclude from being recorded in
       * the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * .
       *
       *
       * *Required and optional fields*
       *
       * The `recordingStrategy` field is optional when you set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` .
       *
       * The `recordingStrategy` field is optional when you list resource types in the
       * `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       *
       * The `recordingStrategy` field is required if you list resource types to exclude from
       * recording in the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * . &gt; *Overriding fields*
       *
       * If you choose `EXCLUSION_BY_RESOURCE_TYPES` for the recording strategy, the
       * `ExclusionByResourceTypes` field will override other properties in the request.
       *
       * For example, even if you set `IncludeGlobalResourceTypes` to false, global IAM resource
       * types will still be automatically recorded in this option unless those resource types are
       * specifically listed as exclusions in the `ResourceTypes` field of `ExclusionByResourceTypes` .
       * &gt; *Global resources types and the resource exclusion recording strategy*
       *
       * By default, if you choose the `EXCLUSION_BY_RESOURCE_TYPES` recording strategy, when AWS
       * Config adds support for a new resource type in the Region where you set up the configuration
       * recorder, including global resource types, AWS Config starts recording resources of that type
       * automatically.
       *
       * Unless specifically listed as exclusions, `AWS::RDS::GlobalCluster` will be recorded
       * automatically in all supported AWS Config Regions were the configuration recorder is enabled.
       *
       * IAM users, groups, roles, and customer managed policies will be recorded in the Region
       * where you set up the configuration recorder if that is a Region where AWS Config was available
       * before February 2022. You cannot be record the global IAM resouce types in Regions supported
       * by AWS Config after February 2022. This list where you cannot record the global IAM resource
       * types includes the following Regions:
       *
       * * Asia Pacific (Hyderabad)
       * * Asia Pacific (Melbourne)
       * * Canada West (Calgary)
       * * Europe (Spain)
       * * Europe (Zurich)
       * * Israel (Tel Aviv)
       * * Middle East (UAE)
       */
      override fun recordingStrategy(recordingStrategy: RecordingStrategyProperty) {
        cdkBuilder.recordingStrategy(recordingStrategy.let(RecordingStrategyProperty::unwrap))
      }

      /**
       * @param recordingStrategy An object that specifies the recording strategy for the
       * configuration recorder.
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `ALL_SUPPORTED_RESOURCE_TYPES` , AWS Config records configuration changes for all supported
       * resource types, excluding the global IAM resource types. You also must set the `AllSupported`
       * field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` . When AWS Config adds support for a new resource type, AWS Config automatically
       * starts recording resources of that type.
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `INCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration changes for only the
       * resource types you specify in the `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `EXCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration changes for all supported
       * resource types except the resource types that you specify to exclude from being recorded in
       * the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * .
       *
       *
       * *Required and optional fields*
       *
       * The `recordingStrategy` field is optional when you set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` .
       *
       * The `recordingStrategy` field is optional when you list resource types in the
       * `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       *
       * The `recordingStrategy` field is required if you list resource types to exclude from
       * recording in the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * . &gt; *Overriding fields*
       *
       * If you choose `EXCLUSION_BY_RESOURCE_TYPES` for the recording strategy, the
       * `ExclusionByResourceTypes` field will override other properties in the request.
       *
       * For example, even if you set `IncludeGlobalResourceTypes` to false, global IAM resource
       * types will still be automatically recorded in this option unless those resource types are
       * specifically listed as exclusions in the `ResourceTypes` field of `ExclusionByResourceTypes` .
       * &gt; *Global resources types and the resource exclusion recording strategy*
       *
       * By default, if you choose the `EXCLUSION_BY_RESOURCE_TYPES` recording strategy, when AWS
       * Config adds support for a new resource type in the Region where you set up the configuration
       * recorder, including global resource types, AWS Config starts recording resources of that type
       * automatically.
       *
       * Unless specifically listed as exclusions, `AWS::RDS::GlobalCluster` will be recorded
       * automatically in all supported AWS Config Regions were the configuration recorder is enabled.
       *
       * IAM users, groups, roles, and customer managed policies will be recorded in the Region
       * where you set up the configuration recorder if that is a Region where AWS Config was available
       * before February 2022. You cannot be record the global IAM resouce types in Regions supported
       * by AWS Config after February 2022. This list where you cannot record the global IAM resource
       * types includes the following Regions:
       *
       * * Asia Pacific (Hyderabad)
       * * Asia Pacific (Melbourne)
       * * Canada West (Calgary)
       * * Europe (Spain)
       * * Europe (Zurich)
       * * Israel (Tel Aviv)
       * * Middle East (UAE)
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1515b32155e4b51fcd151606146580e58457af5e02830e5901331e907f50589")
      override
          fun recordingStrategy(recordingStrategy: RecordingStrategyProperty.Builder.() -> Unit):
          Unit = recordingStrategy(RecordingStrategyProperty(recordingStrategy))

      /**
       * @param resourceTypes A comma-separated list that specifies which resource types AWS Config
       * records.
       * For a list of valid `ResourceTypes` values, see the *Resource Type Value* column in
       * [Supported AWS resource
       * Types](https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources)
       * in the *AWS Config developer guide* .
       *
       *
       * *Required and optional fields*
       *
       * Optionally, you can set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `INCLUSION_BY_RESOURCE_TYPES` .
       *
       * To record all configuration changes, set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` , and either omit this field or don't specify any resource types in this field. If
       * you set the `AllSupported` field to `false` and specify values for `ResourceTypes` , when AWS
       * Config adds support for a new type of resource, it will not record resources of that type
       * unless you manually add that type to your recording group. &gt; *Region availability*
       *
       * Before specifying a resource type for AWS Config to track, check [Resource Coverage by
       * Region
       * Availability](https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html)
       * to see if the resource type is supported in the AWS Region where you set up AWS Config . If a
       * resource type is supported by AWS Config in at least one Region, you can enable the recording
       * of that resource type in all Regions supported by AWS Config , even if the specified resource
       * type is not supported in the AWS Region where you set up AWS Config .
       */
      override fun resourceTypes(resourceTypes: List<String>) {
        cdkBuilder.resourceTypes(resourceTypes)
      }

      /**
       * @param resourceTypes A comma-separated list that specifies which resource types AWS Config
       * records.
       * For a list of valid `ResourceTypes` values, see the *Resource Type Value* column in
       * [Supported AWS resource
       * Types](https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources)
       * in the *AWS Config developer guide* .
       *
       *
       * *Required and optional fields*
       *
       * Optionally, you can set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `INCLUSION_BY_RESOURCE_TYPES` .
       *
       * To record all configuration changes, set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` , and either omit this field or don't specify any resource types in this field. If
       * you set the `AllSupported` field to `false` and specify values for `ResourceTypes` , when AWS
       * Config adds support for a new type of resource, it will not record resources of that type
       * unless you manually add that type to your recording group. &gt; *Region availability*
       *
       * Before specifying a resource type for AWS Config to track, check [Resource Coverage by
       * Region
       * Availability](https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html)
       * to see if the resource type is supported in the AWS Region where you set up AWS Config . If a
       * resource type is supported by AWS Config in at least one Region, you can enable the recording
       * of that resource type in all Regions supported by AWS Config , even if the specified resource
       * type is not supported in the AWS Region where you set up AWS Config .
       */
      override fun resourceTypes(vararg resourceTypes: String): Unit =
          resourceTypes(resourceTypes.toList())

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty,
    ) : CdkObject(cdkObject), RecordingGroupProperty {
      /**
       * Specifies whether AWS Config records configuration changes for all supported resource
       * types, excluding the global IAM resource types.
       *
       * If you set this field to `true` , when AWS Config adds support for a new resource type, AWS
       * Config starts recording resources of that type automatically.
       *
       * If you set this field to `true` , you cannot enumerate specific resource types to record in
       * the `resourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * , or to exclude in the `resourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * .
       *
       *
       * *Region availability*
       *
       * Check [Resource Coverage by Region
       * Availability](https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html)
       * to see if a resource type is supported in the AWS Region where you set up AWS Config .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-allsupported)
       */
      override fun allSupported(): Any? = unwrap(this).getAllSupported()

      /**
       * An object that specifies how AWS Config excludes resource types from being recorded by the
       * configuration recorder.
       *
       * To use this option, you must set the `useOnly` field of [AWS::Config::ConfigurationRecorder
       * RecordingStrategy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingstrategy.html)
       * to `EXCLUSION_BY_RESOURCE_TYPES` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-exclusionbyresourcetypes)
       */
      override fun exclusionByResourceTypes(): Any? = unwrap(this).getExclusionByResourceTypes()

      /**
       * This option is a bundle which only applies to the global IAM resource types: IAM users,
       * groups, roles, and customer managed policies.
       *
       * These global IAM resource types can only be recorded by AWS Config in Regions where AWS
       * Config was available before February 2022. You cannot be record the global IAM resouce types
       * in Regions supported by AWS Config after February 2022. This list where you cannot record the
       * global IAM resource types includes the following Regions:
       *
       * * Asia Pacific (Hyderabad)
       * * Asia Pacific (Melbourne)
       * * Canada West (Calgary)
       * * Europe (Spain)
       * * Europe (Zurich)
       * * Israel (Tel Aviv)
       * * Middle East (UAE)
       *
       *
       * *Aurora global clusters are recorded in all enabled Regions*
       *
       * The `AWS::RDS::GlobalCluster` resource type will be recorded in all supported AWS Config
       * Regions where the configuration recorder is enabled, even if `IncludeGlobalResourceTypes` is
       * set to `false` . The `IncludeGlobalResourceTypes` option is a bundle which only applies to IAM
       * users, groups, roles, and customer managed policies.
       *
       * If you do not want to record `AWS::RDS::GlobalCluster` in all enabled Regions, use one of
       * the following recording strategies:
       *
       * * *Record all current and future resource types with exclusions* (
       * `EXCLUSION_BY_RESOURCE_TYPES` ), or
       * * *Record specific resource types* ( `INCLUSION_BY_RESOURCE_TYPES` ).
       *
       * For more information, see [Selecting Which Resources are
       * Recorded](https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html#select-resources-all)
       * in the *AWS Config developer guide* . &gt; *IncludeGlobalResourceTypes and the exclusion
       * recording strategy*
       *
       * The `IncludeGlobalResourceTypes` field has no impact on the `EXCLUSION_BY_RESOURCE_TYPES`
       * recording strategy. This means that the global IAM resource types ( IAM users, groups, roles,
       * and customer managed policies) will not be automatically added as exclusions for
       * `ExclusionByResourceTypes` when `IncludeGlobalResourceTypes` is set to `false` .
       *
       * The `IncludeGlobalResourceTypes` field should only be used to modify the `AllSupported`
       * field, as the default for the `AllSupported` field is to record configuration changes for all
       * supported resource types excluding the global IAM resource types. To include the global IAM
       * resource types when `AllSupported` is set to `true` , make sure to set
       * `IncludeGlobalResourceTypes` to `true` .
       *
       * To exclude the global IAM resource types for the `EXCLUSION_BY_RESOURCE_TYPES` recording
       * strategy, you need to manually add them to the `ResourceTypes` field of
       * `ExclusionByResourceTypes` . &gt; *Required and optional fields*
       *
       * Before you set this field to `true` , set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` . Optionally, you can set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `ALL_SUPPORTED_RESOURCE_TYPES` . &gt; *Overriding fields*
       *
       * If you set this field to `false` but list global IAM resource types in the `ResourceTypes`
       * field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * , AWS Config will still record configuration changes for those specified resource types
       * *regardless* of if you set the `IncludeGlobalResourceTypes` field to false.
       *
       * If you do not want to record configuration changes to the global IAM resource types (IAM
       * users, groups, roles, and customer managed policies), make sure to not list them in the
       * `ResourceTypes` field in addition to setting the `IncludeGlobalResourceTypes` field to false.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-includeglobalresourcetypes)
       */
      override fun includeGlobalResourceTypes(): Any? = unwrap(this).getIncludeGlobalResourceTypes()

      /**
       * An object that specifies the recording strategy for the configuration recorder.
       *
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `ALL_SUPPORTED_RESOURCE_TYPES` , AWS Config records configuration changes for all supported
       * resource types, excluding the global IAM resource types. You also must set the `AllSupported`
       * field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` . When AWS Config adds support for a new resource type, AWS Config automatically
       * starts recording resources of that type.
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `INCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration changes for only the
       * resource types you specify in the `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       * * If you set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `EXCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration changes for all supported
       * resource types except the resource types that you specify to exclude from being recorded in
       * the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * .
       *
       *
       * *Required and optional fields*
       *
       * The `recordingStrategy` field is optional when you set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` .
       *
       * The `recordingStrategy` field is optional when you list resource types in the
       * `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       *
       * The `recordingStrategy` field is required if you list resource types to exclude from
       * recording in the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * . &gt; *Overriding fields*
       *
       * If you choose `EXCLUSION_BY_RESOURCE_TYPES` for the recording strategy, the
       * `ExclusionByResourceTypes` field will override other properties in the request.
       *
       * For example, even if you set `IncludeGlobalResourceTypes` to false, global IAM resource
       * types will still be automatically recorded in this option unless those resource types are
       * specifically listed as exclusions in the `ResourceTypes` field of `ExclusionByResourceTypes` .
       * &gt; *Global resources types and the resource exclusion recording strategy*
       *
       * By default, if you choose the `EXCLUSION_BY_RESOURCE_TYPES` recording strategy, when AWS
       * Config adds support for a new resource type in the Region where you set up the configuration
       * recorder, including global resource types, AWS Config starts recording resources of that type
       * automatically.
       *
       * Unless specifically listed as exclusions, `AWS::RDS::GlobalCluster` will be recorded
       * automatically in all supported AWS Config Regions were the configuration recorder is enabled.
       *
       * IAM users, groups, roles, and customer managed policies will be recorded in the Region
       * where you set up the configuration recorder if that is a Region where AWS Config was available
       * before February 2022. You cannot be record the global IAM resouce types in Regions supported
       * by AWS Config after February 2022. This list where you cannot record the global IAM resource
       * types includes the following Regions:
       *
       * * Asia Pacific (Hyderabad)
       * * Asia Pacific (Melbourne)
       * * Canada West (Calgary)
       * * Europe (Spain)
       * * Europe (Zurich)
       * * Israel (Tel Aviv)
       * * Middle East (UAE)
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-recordingstrategy)
       */
      override fun recordingStrategy(): Any? = unwrap(this).getRecordingStrategy()

      /**
       * A comma-separated list that specifies which resource types AWS Config records.
       *
       * For a list of valid `ResourceTypes` values, see the *Resource Type Value* column in
       * [Supported AWS resource
       * Types](https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources)
       * in the *AWS Config developer guide* .
       *
       *
       * *Required and optional fields*
       *
       * Optionally, you can set the `useOnly` field of
       * [RecordingStrategy](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html)
       * to `INCLUSION_BY_RESOURCE_TYPES` .
       *
       * To record all configuration changes, set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` , and either omit this field or don't specify any resource types in this field. If
       * you set the `AllSupported` field to `false` and specify values for `ResourceTypes` , when AWS
       * Config adds support for a new type of resource, it will not record resources of that type
       * unless you manually add that type to your recording group. &gt; *Region availability*
       *
       * Before specifying a resource type for AWS Config to track, check [Resource Coverage by
       * Region
       * Availability](https://docs.aws.amazon.com/config/latest/developerguide/what-is-resource-config-coverage.html)
       * to see if the resource type is supported in the AWS Region where you set up AWS Config . If a
       * resource type is supported by AWS Config in at least one Region, you can enable the recording
       * of that resource type in all Regions supported by AWS Config , even if the specified resource
       * type is not supported in the AWS Region where you set up AWS Config .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-resourcetypes)
       */
      override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordingGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty):
          RecordingGroupProperty = CdkObjectWrappers.wrap(cdkObject) as? RecordingGroupProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordingGroupProperty):
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty
    }
  }

  /**
   * An object for you to specify your overrides for the recording mode.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * RecordingModeOverrideProperty recordingModeOverrideProperty =
   * RecordingModeOverrideProperty.builder()
   * .recordingFrequency("recordingFrequency")
   * .resourceTypes(List.of("resourceTypes"))
   * // the properties below are optional
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingmodeoverride.html)
   */
  public interface RecordingModeOverrideProperty {
    /**
     * A description that you provide for the override.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingmodeoverride.html#cfn-config-configurationrecorder-recordingmodeoverride-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The recording frequency that will be applied to all the resource types specified in the
     * override.
     *
     * * Continuous recording allows you to record configuration changes continuously whenever a
     * change occurs.
     * * Daily recording allows you to receive a configuration item (CI) representing the most
     * recent state of your resources over the last 24-hour period, only if it’s different from the
     * previous CI recorded.
     *
     *
     * AWS Firewall Manager depends on continuous recording to monitor your resources. If you are
     * using Firewall Manager, it is recommended that you set the recording frequency to Continuous.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingmodeoverride.html#cfn-config-configurationrecorder-recordingmodeoverride-recordingfrequency)
     */
    public fun recordingFrequency(): String

    /**
     * A comma-separated list that specifies which resource types AWS Config includes in the
     * override.
     *
     *
     * Daily recording is not supported for the following resource types:
     *
     * * `AWS::Config::ResourceCompliance`
     * * `AWS::Config::ConformancePackCompliance`
     * * `AWS::Config::ConfigurationRecorder`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingmodeoverride.html#cfn-config-configurationrecorder-recordingmodeoverride-resourcetypes)
     */
    public fun resourceTypes(): List<String>

    /**
     * A builder for [RecordingModeOverrideProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description A description that you provide for the override.
       */
      public fun description(description: String)

      /**
       * @param recordingFrequency The recording frequency that will be applied to all the resource
       * types specified in the override. 
       * * Continuous recording allows you to record configuration changes continuously whenever a
       * change occurs.
       * * Daily recording allows you to receive a configuration item (CI) representing the most
       * recent state of your resources over the last 24-hour period, only if it’s different from the
       * previous CI recorded.
       *
       *
       * AWS Firewall Manager depends on continuous recording to monitor your resources. If you are
       * using Firewall Manager, it is recommended that you set the recording frequency to Continuous.
       */
      public fun recordingFrequency(recordingFrequency: String)

      /**
       * @param resourceTypes A comma-separated list that specifies which resource types AWS Config
       * includes in the override. 
       *
       * Daily recording is not supported for the following resource types:
       *
       * * `AWS::Config::ResourceCompliance`
       * * `AWS::Config::ConformancePackCompliance`
       * * `AWS::Config::ConfigurationRecorder`
       */
      public fun resourceTypes(resourceTypes: List<String>)

      /**
       * @param resourceTypes A comma-separated list that specifies which resource types AWS Config
       * includes in the override. 
       *
       * Daily recording is not supported for the following resource types:
       *
       * * `AWS::Config::ResourceCompliance`
       * * `AWS::Config::ConformancePackCompliance`
       * * `AWS::Config::ConfigurationRecorder`
       */
      public fun resourceTypes(vararg resourceTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty.builder()

      /**
       * @param description A description that you provide for the override.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param recordingFrequency The recording frequency that will be applied to all the resource
       * types specified in the override. 
       * * Continuous recording allows you to record configuration changes continuously whenever a
       * change occurs.
       * * Daily recording allows you to receive a configuration item (CI) representing the most
       * recent state of your resources over the last 24-hour period, only if it’s different from the
       * previous CI recorded.
       *
       *
       * AWS Firewall Manager depends on continuous recording to monitor your resources. If you are
       * using Firewall Manager, it is recommended that you set the recording frequency to Continuous.
       */
      override fun recordingFrequency(recordingFrequency: String) {
        cdkBuilder.recordingFrequency(recordingFrequency)
      }

      /**
       * @param resourceTypes A comma-separated list that specifies which resource types AWS Config
       * includes in the override. 
       *
       * Daily recording is not supported for the following resource types:
       *
       * * `AWS::Config::ResourceCompliance`
       * * `AWS::Config::ConformancePackCompliance`
       * * `AWS::Config::ConfigurationRecorder`
       */
      override fun resourceTypes(resourceTypes: List<String>) {
        cdkBuilder.resourceTypes(resourceTypes)
      }

      /**
       * @param resourceTypes A comma-separated list that specifies which resource types AWS Config
       * includes in the override. 
       *
       * Daily recording is not supported for the following resource types:
       *
       * * `AWS::Config::ResourceCompliance`
       * * `AWS::Config::ConformancePackCompliance`
       * * `AWS::Config::ConfigurationRecorder`
       */
      override fun resourceTypes(vararg resourceTypes: String): Unit =
          resourceTypes(resourceTypes.toList())

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty,
    ) : CdkObject(cdkObject), RecordingModeOverrideProperty {
      /**
       * A description that you provide for the override.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingmodeoverride.html#cfn-config-configurationrecorder-recordingmodeoverride-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The recording frequency that will be applied to all the resource types specified in the
       * override.
       *
       * * Continuous recording allows you to record configuration changes continuously whenever a
       * change occurs.
       * * Daily recording allows you to receive a configuration item (CI) representing the most
       * recent state of your resources over the last 24-hour period, only if it’s different from the
       * previous CI recorded.
       *
       *
       * AWS Firewall Manager depends on continuous recording to monitor your resources. If you are
       * using Firewall Manager, it is recommended that you set the recording frequency to Continuous.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingmodeoverride.html#cfn-config-configurationrecorder-recordingmodeoverride-recordingfrequency)
       */
      override fun recordingFrequency(): String = unwrap(this).getRecordingFrequency()

      /**
       * A comma-separated list that specifies which resource types AWS Config includes in the
       * override.
       *
       *
       * Daily recording is not supported for the following resource types:
       *
       * * `AWS::Config::ResourceCompliance`
       * * `AWS::Config::ConformancePackCompliance`
       * * `AWS::Config::ConfigurationRecorder`
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingmodeoverride.html#cfn-config-configurationrecorder-recordingmodeoverride-resourcetypes)
       */
      override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordingModeOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty):
          RecordingModeOverrideProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RecordingModeOverrideProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordingModeOverrideProperty):
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeOverrideProperty
    }
  }

  /**
   * Specifies the default recording frequency that AWS Config uses to record configuration changes.
   *
   * AWS Config supports *Continuous recording* and *Daily recording* .
   *
   * * Continuous recording allows you to record configuration changes continuously whenever a
   * change occurs.
   * * Daily recording allows you to receive a configuration item (CI) representing the most recent
   * state of your resources over the last 24-hour period, only if it’s different from the previous CI
   * recorded.
   *
   *
   * AWS Firewall Manager depends on continuous recording to monitor your resources. If you are
   * using Firewall Manager, it is recommended that you set the recording frequency to Continuous.
   *
   *
   * You can also override the recording frequency for specific resource types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * RecordingModeProperty recordingModeProperty = RecordingModeProperty.builder()
   * .recordingFrequency("recordingFrequency")
   * // the properties below are optional
   * .recordingModeOverrides(List.of(RecordingModeOverrideProperty.builder()
   * .recordingFrequency("recordingFrequency")
   * .resourceTypes(List.of("resourceTypes"))
   * // the properties below are optional
   * .description("description")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingmode.html)
   */
  public interface RecordingModeProperty {
    /**
     * The default recording frequency that AWS Config uses to record configuration changes.
     *
     *
     * Daily recording is not supported for the following resource types:
     *
     * * `AWS::Config::ResourceCompliance`
     * * `AWS::Config::ConformancePackCompliance`
     * * `AWS::Config::ConfigurationRecorder`
     *
     * For the *allSupported* ( `ALL_SUPPORTED_RESOURCE_TYPES` ) recording strategy, these resource
     * types will be set to Continuous recording.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingmode.html#cfn-config-configurationrecorder-recordingmode-recordingfrequency)
     */
    public fun recordingFrequency(): String

    /**
     * An array of `recordingModeOverride` objects for you to specify your overrides for the
     * recording mode.
     *
     * The `recordingModeOverride` object in the `recordingModeOverrides` array consists of three
     * fields: a `description` , the new `recordingFrequency` , and an array of `resourceTypes` to
     * override.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingmode.html#cfn-config-configurationrecorder-recordingmode-recordingmodeoverrides)
     */
    public fun recordingModeOverrides(): Any? = unwrap(this).getRecordingModeOverrides()

    /**
     * A builder for [RecordingModeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recordingFrequency The default recording frequency that AWS Config uses to record
       * configuration changes. 
       *
       * Daily recording is not supported for the following resource types:
       *
       * * `AWS::Config::ResourceCompliance`
       * * `AWS::Config::ConformancePackCompliance`
       * * `AWS::Config::ConfigurationRecorder`
       *
       * For the *allSupported* ( `ALL_SUPPORTED_RESOURCE_TYPES` ) recording strategy, these
       * resource types will be set to Continuous recording.
       */
      public fun recordingFrequency(recordingFrequency: String)

      /**
       * @param recordingModeOverrides An array of `recordingModeOverride` objects for you to
       * specify your overrides for the recording mode.
       * The `recordingModeOverride` object in the `recordingModeOverrides` array consists of three
       * fields: a `description` , the new `recordingFrequency` , and an array of `resourceTypes` to
       * override.
       */
      public fun recordingModeOverrides(recordingModeOverrides: IResolvable)

      /**
       * @param recordingModeOverrides An array of `recordingModeOverride` objects for you to
       * specify your overrides for the recording mode.
       * The `recordingModeOverride` object in the `recordingModeOverrides` array consists of three
       * fields: a `description` , the new `recordingFrequency` , and an array of `resourceTypes` to
       * override.
       */
      public fun recordingModeOverrides(recordingModeOverrides: List<Any>)

      /**
       * @param recordingModeOverrides An array of `recordingModeOverride` objects for you to
       * specify your overrides for the recording mode.
       * The `recordingModeOverride` object in the `recordingModeOverrides` array consists of three
       * fields: a `description` , the new `recordingFrequency` , and an array of `resourceTypes` to
       * override.
       */
      public fun recordingModeOverrides(vararg recordingModeOverrides: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty.builder()

      /**
       * @param recordingFrequency The default recording frequency that AWS Config uses to record
       * configuration changes. 
       *
       * Daily recording is not supported for the following resource types:
       *
       * * `AWS::Config::ResourceCompliance`
       * * `AWS::Config::ConformancePackCompliance`
       * * `AWS::Config::ConfigurationRecorder`
       *
       * For the *allSupported* ( `ALL_SUPPORTED_RESOURCE_TYPES` ) recording strategy, these
       * resource types will be set to Continuous recording.
       */
      override fun recordingFrequency(recordingFrequency: String) {
        cdkBuilder.recordingFrequency(recordingFrequency)
      }

      /**
       * @param recordingModeOverrides An array of `recordingModeOverride` objects for you to
       * specify your overrides for the recording mode.
       * The `recordingModeOverride` object in the `recordingModeOverrides` array consists of three
       * fields: a `description` , the new `recordingFrequency` , and an array of `resourceTypes` to
       * override.
       */
      override fun recordingModeOverrides(recordingModeOverrides: IResolvable) {
        cdkBuilder.recordingModeOverrides(recordingModeOverrides.let(IResolvable::unwrap))
      }

      /**
       * @param recordingModeOverrides An array of `recordingModeOverride` objects for you to
       * specify your overrides for the recording mode.
       * The `recordingModeOverride` object in the `recordingModeOverrides` array consists of three
       * fields: a `description` , the new `recordingFrequency` , and an array of `resourceTypes` to
       * override.
       */
      override fun recordingModeOverrides(recordingModeOverrides: List<Any>) {
        cdkBuilder.recordingModeOverrides(recordingModeOverrides.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param recordingModeOverrides An array of `recordingModeOverride` objects for you to
       * specify your overrides for the recording mode.
       * The `recordingModeOverride` object in the `recordingModeOverrides` array consists of three
       * fields: a `description` , the new `recordingFrequency` , and an array of `resourceTypes` to
       * override.
       */
      override fun recordingModeOverrides(vararg recordingModeOverrides: Any): Unit =
          recordingModeOverrides(recordingModeOverrides.toList())

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty,
    ) : CdkObject(cdkObject), RecordingModeProperty {
      /**
       * The default recording frequency that AWS Config uses to record configuration changes.
       *
       *
       * Daily recording is not supported for the following resource types:
       *
       * * `AWS::Config::ResourceCompliance`
       * * `AWS::Config::ConformancePackCompliance`
       * * `AWS::Config::ConfigurationRecorder`
       *
       * For the *allSupported* ( `ALL_SUPPORTED_RESOURCE_TYPES` ) recording strategy, these
       * resource types will be set to Continuous recording.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingmode.html#cfn-config-configurationrecorder-recordingmode-recordingfrequency)
       */
      override fun recordingFrequency(): String = unwrap(this).getRecordingFrequency()

      /**
       * An array of `recordingModeOverride` objects for you to specify your overrides for the
       * recording mode.
       *
       * The `recordingModeOverride` object in the `recordingModeOverrides` array consists of three
       * fields: a `description` , the new `recordingFrequency` , and an array of `resourceTypes` to
       * override.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingmode.html#cfn-config-configurationrecorder-recordingmode-recordingmodeoverrides)
       */
      override fun recordingModeOverrides(): Any? = unwrap(this).getRecordingModeOverrides()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordingModeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty):
          RecordingModeProperty = CdkObjectWrappers.wrap(cdkObject) as? RecordingModeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordingModeProperty):
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingModeProperty
    }
  }

  /**
   * Specifies the recording strategy of the configuration recorder.
   *
   * Valid values include: `ALL_SUPPORTED_RESOURCE_TYPES` , `INCLUSION_BY_RESOURCE_TYPES` , and
   * `EXCLUSION_BY_RESOURCE_TYPES` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * RecordingStrategyProperty recordingStrategyProperty = RecordingStrategyProperty.builder()
   * .useOnly("useOnly")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingstrategy.html)
   */
  public interface RecordingStrategyProperty {
    /**
     * The recording strategy for the configuration recorder.
     *
     * * If you set this option to `ALL_SUPPORTED_RESOURCE_TYPES` , AWS Config records configuration
     * changes for all supported resource types, excluding the global IAM resource types. You also must
     * set the `AllSupported` field of
     * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
     * to `true` . When AWS Config adds support for a new resource type, AWS Config automatically
     * starts recording resources of that type. For a list of supported resource types, see [Supported
     * Resource
     * Types](https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources)
     * in the *AWS Config developer guide* .
     * * If you set this option to `INCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration
     * changes for only the resource types that you specify in the `ResourceTypes` field of
     * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
     * .
     * * If you set this option to `EXCLUSION_BY_RESOURCE_TYPES` , AWS Config records configuration
     * changes for all supported resource types, except the resource types that you specify to exclude
     * from being recorded in the `ResourceTypes` field of
     * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
     * .
     *
     *
     * *Required and optional fields*
     *
     * The `recordingStrategy` field is optional when you set the `AllSupported` field of
     * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
     * to `true` .
     *
     * The `recordingStrategy` field is optional when you list resource types in the `ResourceTypes`
     * field of
     * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
     * .
     *
     * The `recordingStrategy` field is required if you list resource types to exclude from
     * recording in the `ResourceTypes` field of
     * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
     * . &gt; *Overriding fields*
     *
     * If you choose `EXCLUSION_BY_RESOURCE_TYPES` for the recording strategy, the
     * `ExclusionByResourceTypes` field will override other properties in the request.
     *
     * For example, even if you set `IncludeGlobalResourceTypes` to false, global IAM resource types
     * will still be automatically recorded in this option unless those resource types are specifically
     * listed as exclusions in the `ResourceTypes` field of `ExclusionByResourceTypes` . &gt; *Global
     * resource types and the exclusion recording strategy*
     *
     * By default, if you choose the `EXCLUSION_BY_RESOURCE_TYPES` recording strategy, when AWS
     * Config adds support for a new resource type in the Region where you set up the configuration
     * recorder, including global resource types, AWS Config starts recording resources of that type
     * automatically.
     *
     * Unless specifically listed as exclusions, `AWS::RDS::GlobalCluster` will be recorded
     * automatically in all supported AWS Config Regions were the configuration recorder is enabled.
     *
     * IAM users, groups, roles, and customer managed policies will be recorded in the Region where
     * you set up the configuration recorder if that is a Region where AWS Config was available before
     * February 2022. You cannot be record the global IAM resouce types in Regions supported by AWS
     * Config after February 2022. This list where you cannot record the global IAM resource types
     * includes the following Regions:
     *
     * * Asia Pacific (Hyderabad)
     * * Asia Pacific (Melbourne)
     * * Canada West (Calgary)
     * * Europe (Spain)
     * * Europe (Zurich)
     * * Israel (Tel Aviv)
     * * Middle East (UAE)
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingstrategy.html#cfn-config-configurationrecorder-recordingstrategy-useonly)
     */
    public fun useOnly(): String

    /**
     * A builder for [RecordingStrategyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param useOnly The recording strategy for the configuration recorder. 
       * * If you set this option to `ALL_SUPPORTED_RESOURCE_TYPES` , AWS Config records
       * configuration changes for all supported resource types, excluding the global IAM resource
       * types. You also must set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` . When AWS Config adds support for a new resource type, AWS Config automatically
       * starts recording resources of that type. For a list of supported resource types, see
       * [Supported Resource
       * Types](https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources)
       * in the *AWS Config developer guide* .
       * * If you set this option to `INCLUSION_BY_RESOURCE_TYPES` , AWS Config records
       * configuration changes for only the resource types that you specify in the `ResourceTypes`
       * field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       * * If you set this option to `EXCLUSION_BY_RESOURCE_TYPES` , AWS Config records
       * configuration changes for all supported resource types, except the resource types that you
       * specify to exclude from being recorded in the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * .
       *
       *
       * *Required and optional fields*
       *
       * The `recordingStrategy` field is optional when you set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` .
       *
       * The `recordingStrategy` field is optional when you list resource types in the
       * `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       *
       * The `recordingStrategy` field is required if you list resource types to exclude from
       * recording in the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * . &gt; *Overriding fields*
       *
       * If you choose `EXCLUSION_BY_RESOURCE_TYPES` for the recording strategy, the
       * `ExclusionByResourceTypes` field will override other properties in the request.
       *
       * For example, even if you set `IncludeGlobalResourceTypes` to false, global IAM resource
       * types will still be automatically recorded in this option unless those resource types are
       * specifically listed as exclusions in the `ResourceTypes` field of `ExclusionByResourceTypes` .
       * &gt; *Global resource types and the exclusion recording strategy*
       *
       * By default, if you choose the `EXCLUSION_BY_RESOURCE_TYPES` recording strategy, when AWS
       * Config adds support for a new resource type in the Region where you set up the configuration
       * recorder, including global resource types, AWS Config starts recording resources of that type
       * automatically.
       *
       * Unless specifically listed as exclusions, `AWS::RDS::GlobalCluster` will be recorded
       * automatically in all supported AWS Config Regions were the configuration recorder is enabled.
       *
       * IAM users, groups, roles, and customer managed policies will be recorded in the Region
       * where you set up the configuration recorder if that is a Region where AWS Config was available
       * before February 2022. You cannot be record the global IAM resouce types in Regions supported
       * by AWS Config after February 2022. This list where you cannot record the global IAM resource
       * types includes the following Regions:
       *
       * * Asia Pacific (Hyderabad)
       * * Asia Pacific (Melbourne)
       * * Canada West (Calgary)
       * * Europe (Spain)
       * * Europe (Zurich)
       * * Israel (Tel Aviv)
       * * Middle East (UAE)
       */
      public fun useOnly(useOnly: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty.builder()

      /**
       * @param useOnly The recording strategy for the configuration recorder. 
       * * If you set this option to `ALL_SUPPORTED_RESOURCE_TYPES` , AWS Config records
       * configuration changes for all supported resource types, excluding the global IAM resource
       * types. You also must set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` . When AWS Config adds support for a new resource type, AWS Config automatically
       * starts recording resources of that type. For a list of supported resource types, see
       * [Supported Resource
       * Types](https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources)
       * in the *AWS Config developer guide* .
       * * If you set this option to `INCLUSION_BY_RESOURCE_TYPES` , AWS Config records
       * configuration changes for only the resource types that you specify in the `ResourceTypes`
       * field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       * * If you set this option to `EXCLUSION_BY_RESOURCE_TYPES` , AWS Config records
       * configuration changes for all supported resource types, except the resource types that you
       * specify to exclude from being recorded in the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * .
       *
       *
       * *Required and optional fields*
       *
       * The `recordingStrategy` field is optional when you set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` .
       *
       * The `recordingStrategy` field is optional when you list resource types in the
       * `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       *
       * The `recordingStrategy` field is required if you list resource types to exclude from
       * recording in the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * . &gt; *Overriding fields*
       *
       * If you choose `EXCLUSION_BY_RESOURCE_TYPES` for the recording strategy, the
       * `ExclusionByResourceTypes` field will override other properties in the request.
       *
       * For example, even if you set `IncludeGlobalResourceTypes` to false, global IAM resource
       * types will still be automatically recorded in this option unless those resource types are
       * specifically listed as exclusions in the `ResourceTypes` field of `ExclusionByResourceTypes` .
       * &gt; *Global resource types and the exclusion recording strategy*
       *
       * By default, if you choose the `EXCLUSION_BY_RESOURCE_TYPES` recording strategy, when AWS
       * Config adds support for a new resource type in the Region where you set up the configuration
       * recorder, including global resource types, AWS Config starts recording resources of that type
       * automatically.
       *
       * Unless specifically listed as exclusions, `AWS::RDS::GlobalCluster` will be recorded
       * automatically in all supported AWS Config Regions were the configuration recorder is enabled.
       *
       * IAM users, groups, roles, and customer managed policies will be recorded in the Region
       * where you set up the configuration recorder if that is a Region where AWS Config was available
       * before February 2022. You cannot be record the global IAM resouce types in Regions supported
       * by AWS Config after February 2022. This list where you cannot record the global IAM resource
       * types includes the following Regions:
       *
       * * Asia Pacific (Hyderabad)
       * * Asia Pacific (Melbourne)
       * * Canada West (Calgary)
       * * Europe (Spain)
       * * Europe (Zurich)
       * * Israel (Tel Aviv)
       * * Middle East (UAE)
       */
      override fun useOnly(useOnly: String) {
        cdkBuilder.useOnly(useOnly)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty,
    ) : CdkObject(cdkObject), RecordingStrategyProperty {
      /**
       * The recording strategy for the configuration recorder.
       *
       * * If you set this option to `ALL_SUPPORTED_RESOURCE_TYPES` , AWS Config records
       * configuration changes for all supported resource types, excluding the global IAM resource
       * types. You also must set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` . When AWS Config adds support for a new resource type, AWS Config automatically
       * starts recording resources of that type. For a list of supported resource types, see
       * [Supported Resource
       * Types](https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources)
       * in the *AWS Config developer guide* .
       * * If you set this option to `INCLUSION_BY_RESOURCE_TYPES` , AWS Config records
       * configuration changes for only the resource types that you specify in the `ResourceTypes`
       * field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       * * If you set this option to `EXCLUSION_BY_RESOURCE_TYPES` , AWS Config records
       * configuration changes for all supported resource types, except the resource types that you
       * specify to exclude from being recorded in the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * .
       *
       *
       * *Required and optional fields*
       *
       * The `recordingStrategy` field is optional when you set the `AllSupported` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * to `true` .
       *
       * The `recordingStrategy` field is optional when you list resource types in the
       * `ResourceTypes` field of
       * [RecordingGroup](https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html)
       * .
       *
       * The `recordingStrategy` field is required if you list resource types to exclude from
       * recording in the `ResourceTypes` field of
       * [ExclusionByResourceTypes](https://docs.aws.amazon.com/config/latest/APIReference/API_ExclusionByResourceTypes.html)
       * . &gt; *Overriding fields*
       *
       * If you choose `EXCLUSION_BY_RESOURCE_TYPES` for the recording strategy, the
       * `ExclusionByResourceTypes` field will override other properties in the request.
       *
       * For example, even if you set `IncludeGlobalResourceTypes` to false, global IAM resource
       * types will still be automatically recorded in this option unless those resource types are
       * specifically listed as exclusions in the `ResourceTypes` field of `ExclusionByResourceTypes` .
       * &gt; *Global resource types and the exclusion recording strategy*
       *
       * By default, if you choose the `EXCLUSION_BY_RESOURCE_TYPES` recording strategy, when AWS
       * Config adds support for a new resource type in the Region where you set up the configuration
       * recorder, including global resource types, AWS Config starts recording resources of that type
       * automatically.
       *
       * Unless specifically listed as exclusions, `AWS::RDS::GlobalCluster` will be recorded
       * automatically in all supported AWS Config Regions were the configuration recorder is enabled.
       *
       * IAM users, groups, roles, and customer managed policies will be recorded in the Region
       * where you set up the configuration recorder if that is a Region where AWS Config was available
       * before February 2022. You cannot be record the global IAM resouce types in Regions supported
       * by AWS Config after February 2022. This list where you cannot record the global IAM resource
       * types includes the following Regions:
       *
       * * Asia Pacific (Hyderabad)
       * * Asia Pacific (Melbourne)
       * * Canada West (Calgary)
       * * Europe (Spain)
       * * Europe (Zurich)
       * * Israel (Tel Aviv)
       * * Middle East (UAE)
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordingstrategy.html#cfn-config-configurationrecorder-recordingstrategy-useonly)
       */
      override fun useOnly(): String = unwrap(this).getUseOnly()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordingStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty):
          RecordingStrategyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RecordingStrategyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordingStrategyProperty):
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingStrategyProperty
    }
  }
}
