@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConfigurationRecorder`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.config.*;
 * CfnConfigurationRecorderProps cfnConfigurationRecorderProps =
 * CfnConfigurationRecorderProps.builder()
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
public interface CfnConfigurationRecorderProps {
  /**
   * The name of the configuration recorder. AWS Config automatically assigns the name of "default"
   * when creating the configuration recorder.
   *
   * You cannot change the name of the configuration recorder after it has been created. To change
   * the configuration recorder name, you must delete it and create a new configuration recorder with a
   * new name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Specifies which resource types AWS Config records for configuration changes.
   *
   *
   * *High Number of AWS Config Evaluations*
   *
   * You may notice increased activity in your account during your initial month recording with AWS
   * Config when compared to subsequent months. During the initial bootstrapping process, AWS Config
   * runs evaluations on all the resources in your account that you have selected for AWS Config to
   * record.
   *
   * If you are running ephemeral workloads, you may see increased activity from AWS Config as it
   * records configuration changes associated with creating and deleting these temporary resources. An
   * *ephemeral workload* is a temporary use of computing resources that are loaded and run when
   * needed. Examples include Amazon Elastic Compute Cloud ( Amazon EC2 ) Spot Instances, Amazon EMR
   * jobs, and AWS Auto Scaling . If you want to avoid the increased activity from running ephemeral
   * workloads, you can run these types of workloads in a separate account with AWS Config turned off
   * to avoid increased configuration recording and rule evaluations.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordinggroup)
   */
  public fun recordingGroup(): Any? = unwrap(this).getRecordingGroup()

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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordingmode)
   */
  public fun recordingMode(): Any? = unwrap(this).getRecordingMode()

  /**
   * Amazon Resource Name (ARN) of the IAM role assumed by AWS Config and used by the configuration
   * recorder.
   *
   * For more information, see [Permissions for the IAM Role
   * Assigned](https://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) to
   * AWS Config in the AWS Config Developer Guide.
   *
   *
   * *Pre-existing AWS Config role*
   *
   * If you have used an AWS service that uses AWS Config , such as AWS Security Hub or AWS Control
   * Tower , and an AWS Config role has already been created, make sure that the IAM role that you use
   * when setting up AWS Config keeps the same minimum permissions as the already created AWS Config
   * role. You must do this so that the other AWS service continues to run as expected.
   *
   * For example, if AWS Control Tower has an IAM role that allows AWS Config to read Amazon Simple
   * Storage Service ( Amazon S3 ) objects, make sure that the same permissions are granted within the
   * IAM role you use when setting up AWS Config . Otherwise, it may interfere with how AWS Control
   * Tower operates. For more information about IAM roles for AWS Config , see [*Identity and Access
   * Management for AWS
   * Config*](https://docs.aws.amazon.com/config/latest/developerguide/security-iam.html) in the *AWS
   * Config Developer Guide* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-rolearn)
   */
  public fun roleArn(): String

  /**
   * A builder for [CfnConfigurationRecorderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the configuration recorder. AWS Config automatically assigns the name
     * of "default" when creating the configuration recorder.
     * You cannot change the name of the configuration recorder after it has been created. To change
     * the configuration recorder name, you must delete it and create a new configuration recorder with
     * a new name.
     */
    public fun name(name: String)

    /**
     * @param recordingGroup Specifies which resource types AWS Config records for configuration
     * changes.
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
     */
    public fun recordingGroup(recordingGroup: IResolvable)

    /**
     * @param recordingGroup Specifies which resource types AWS Config records for configuration
     * changes.
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
     */
    public fun recordingGroup(recordingGroup: CfnConfigurationRecorder.RecordingGroupProperty)

    /**
     * @param recordingGroup Specifies which resource types AWS Config records for configuration
     * changes.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d07c861dfc7844a316aa9149574d7c25c0c0eb903a0b025847098b8536a501c")
    public
        fun recordingGroup(recordingGroup: CfnConfigurationRecorder.RecordingGroupProperty.Builder.() -> Unit)

    /**
     * @param recordingMode Specifies the default recording frequency that AWS Config uses to record
     * configuration changes.
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
     */
    public fun recordingMode(recordingMode: IResolvable)

    /**
     * @param recordingMode Specifies the default recording frequency that AWS Config uses to record
     * configuration changes.
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
     */
    public fun recordingMode(recordingMode: CfnConfigurationRecorder.RecordingModeProperty)

    /**
     * @param recordingMode Specifies the default recording frequency that AWS Config uses to record
     * configuration changes.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c37cbed818ebfce8cbed37118534cb9818eb79e17f095e9146ccee1f331b41b6")
    public
        fun recordingMode(recordingMode: CfnConfigurationRecorder.RecordingModeProperty.Builder.() -> Unit)

    /**
     * @param roleArn Amazon Resource Name (ARN) of the IAM role assumed by AWS Config and used by
     * the configuration recorder. 
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
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnConfigurationRecorderProps.Builder =
        software.amazon.awscdk.services.config.CfnConfigurationRecorderProps.builder()

    /**
     * @param name The name of the configuration recorder. AWS Config automatically assigns the name
     * of "default" when creating the configuration recorder.
     * You cannot change the name of the configuration recorder after it has been created. To change
     * the configuration recorder name, you must delete it and create a new configuration recorder with
     * a new name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param recordingGroup Specifies which resource types AWS Config records for configuration
     * changes.
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
     */
    override fun recordingGroup(recordingGroup: IResolvable) {
      cdkBuilder.recordingGroup(recordingGroup.let(IResolvable::unwrap))
    }

    /**
     * @param recordingGroup Specifies which resource types AWS Config records for configuration
     * changes.
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
     */
    override fun recordingGroup(recordingGroup: CfnConfigurationRecorder.RecordingGroupProperty) {
      cdkBuilder.recordingGroup(recordingGroup.let(CfnConfigurationRecorder.RecordingGroupProperty::unwrap))
    }

    /**
     * @param recordingGroup Specifies which resource types AWS Config records for configuration
     * changes.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d07c861dfc7844a316aa9149574d7c25c0c0eb903a0b025847098b8536a501c")
    override
        fun recordingGroup(recordingGroup: CfnConfigurationRecorder.RecordingGroupProperty.Builder.() -> Unit):
        Unit = recordingGroup(CfnConfigurationRecorder.RecordingGroupProperty(recordingGroup))

    /**
     * @param recordingMode Specifies the default recording frequency that AWS Config uses to record
     * configuration changes.
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
     */
    override fun recordingMode(recordingMode: IResolvable) {
      cdkBuilder.recordingMode(recordingMode.let(IResolvable::unwrap))
    }

    /**
     * @param recordingMode Specifies the default recording frequency that AWS Config uses to record
     * configuration changes.
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
     */
    override fun recordingMode(recordingMode: CfnConfigurationRecorder.RecordingModeProperty) {
      cdkBuilder.recordingMode(recordingMode.let(CfnConfigurationRecorder.RecordingModeProperty::unwrap))
    }

    /**
     * @param recordingMode Specifies the default recording frequency that AWS Config uses to record
     * configuration changes.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c37cbed818ebfce8cbed37118534cb9818eb79e17f095e9146ccee1f331b41b6")
    override
        fun recordingMode(recordingMode: CfnConfigurationRecorder.RecordingModeProperty.Builder.() -> Unit):
        Unit = recordingMode(CfnConfigurationRecorder.RecordingModeProperty(recordingMode))

    /**
     * @param roleArn Amazon Resource Name (ARN) of the IAM role assumed by AWS Config and used by
     * the configuration recorder. 
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
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.config.CfnConfigurationRecorderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorderProps,
  ) : CdkObject(cdkObject), CfnConfigurationRecorderProps {
    /**
     * The name of the configuration recorder. AWS Config automatically assigns the name of
     * "default" when creating the configuration recorder.
     *
     * You cannot change the name of the configuration recorder after it has been created. To change
     * the configuration recorder name, you must delete it and create a new configuration recorder with
     * a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-name)
     */
    override fun name(): String? = unwrap(this).getName()

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
     */
    override fun recordingGroup(): Any? = unwrap(this).getRecordingGroup()

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
     */
    override fun recordingMode(): Any? = unwrap(this).getRecordingMode()

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
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationRecorderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationRecorderProps):
        CfnConfigurationRecorderProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnConfigurationRecorderProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationRecorderProps):
        software.amazon.awscdk.services.config.CfnConfigurationRecorderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.config.CfnConfigurationRecorderProps
  }
}
