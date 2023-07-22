@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.synthetics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.synthetics.CfnCanary
import software.constructs.Construct

/**
 * Creates or updates a canary.
 *
 * Canaries are scripts that monitor your endpoints and APIs from the outside-in. Canaries help you
 * check the availability and latency of your web services and troubleshoot anomalies by investigating
 * load time data, screenshots of the UI, logs, and metrics. You can set up a canary to run
 * continuously or just once.
 *
 * To create canaries, you must have the `CloudWatchSyntheticsFullAccess` policy. If you are
 * creating a new IAM role for the canary, you also need the the `iam:CreateRole` , `iam:CreatePolicy`
 * and `iam:AttachRolePolicy` permissions. For more information, see [Necessary Roles and
 * Permissions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Roles)
 * .
 *
 * Do not include secrets or proprietary information in your canary names. The canary name makes up
 * part of the Amazon Resource Name (ARN) for the canary, and the ARN is included in outbound calls
 * over the internet. For more information, see [Security Considerations for Synthetics
 * Canaries](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.synthetics.*;
 * CfnCanary cfnCanary = CfnCanary.Builder.create(this, "MyCfnCanary")
 * .artifactS3Location("artifactS3Location")
 * .code(CodeProperty.builder()
 * .handler("handler")
 * // the properties below are optional
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .s3ObjectVersion("s3ObjectVersion")
 * .script("script")
 * .sourceLocationArn("sourceLocationArn")
 * .build())
 * .executionRoleArn("executionRoleArn")
 * .name("name")
 * .runtimeVersion("runtimeVersion")
 * .schedule(ScheduleProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .durationInSeconds("durationInSeconds")
 * .build())
 * // the properties below are optional
 * .artifactConfig(ArtifactConfigProperty.builder()
 * .s3Encryption(S3EncryptionProperty.builder()
 * .encryptionMode("encryptionMode")
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .build())
 * .deleteLambdaResourcesOnCanaryDeletion(false)
 * .failureRetentionPeriod(123)
 * .runConfig(RunConfigProperty.builder()
 * .activeTracing(false)
 * .environmentVariables(Map.of(
 * "environmentVariablesKey", "environmentVariables"))
 * .memoryInMb(123)
 * .timeoutInSeconds(123)
 * .build())
 * .startCanaryAfterCreation(false)
 * .successRetentionPeriod(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .visualReference(VisualReferenceProperty.builder()
 * .baseCanaryRunId("baseCanaryRunId")
 * // the properties below are optional
 * .baseScreenshots(List.of(BaseScreenshotProperty.builder()
 * .screenshotName("screenshotName")
 * // the properties below are optional
 * .ignoreCoordinates(List.of("ignoreCoordinates"))
 * .build()))
 * .build())
 * .vpcConfig(VPCConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .vpcId("vpcId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html)
 */
@CdkDslMarker
public class CfnCanaryDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCanary.Builder = CfnCanary.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * A structure that contains the configuration for canary artifacts, including the
   * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifactconfig)
   * @param artifactConfig A structure that contains the configuration for canary artifacts,
   * including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. 
   */
  public fun artifactConfig(artifactConfig: IResolvable) {
    cdkBuilder.artifactConfig(artifactConfig)
  }

  /**
   * A structure that contains the configuration for canary artifacts, including the
   * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifactconfig)
   * @param artifactConfig A structure that contains the configuration for canary artifacts,
   * including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. 
   */
  public fun artifactConfig(artifactConfig: CfnCanary.ArtifactConfigProperty) {
    cdkBuilder.artifactConfig(artifactConfig)
  }

  /**
   * The location in Amazon S3 where Synthetics stores artifacts from the runs of this canary.
   *
   * Artifacts include the log file, screenshots, and HAR files. Specify the full location path,
   * including `s3://` at the beginning of the path.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifacts3location)
   * @param artifactS3Location The location in Amazon S3 where Synthetics stores artifacts from the
   * runs of this canary. 
   */
  public fun artifactS3Location(artifactS3Location: String) {
    cdkBuilder.artifactS3Location(artifactS3Location)
  }

  /**
   * Use this structure to input your script code for the canary.
   *
   * This structure contains the Lambda handler with the location where the canary should start
   * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version are
   * also included. If the script is passed into the canary directly, the script code is contained in
   * the value of `Script` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-code)
   * @param code Use this structure to input your script code for the canary. 
   */
  public fun code(code: IResolvable) {
    cdkBuilder.code(code)
  }

  /**
   * Use this structure to input your script code for the canary.
   *
   * This structure contains the Lambda handler with the location where the canary should start
   * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version are
   * also included. If the script is passed into the canary directly, the script code is contained in
   * the value of `Script` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-code)
   * @param code Use this structure to input your script code for the canary. 
   */
  public fun code(code: CfnCanary.CodeProperty) {
    cdkBuilder.code(code)
  }

  /**
   * (deprecated) Deletes associated lambda resources created by Synthetics if set to True.
   *
   * Default is False
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-deletelambdaresourcesoncanarydeletion)
   * @deprecated this property has been deprecated
   * @param deleteLambdaResourcesOnCanaryDeletion Deletes associated lambda resources created by
   * Synthetics if set to True. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: Boolean) {
    cdkBuilder.deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion)
  }

  /**
   * (deprecated) Deletes associated lambda resources created by Synthetics if set to True.
   *
   * Default is False
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-deletelambdaresourcesoncanarydeletion)
   * @deprecated this property has been deprecated
   * @param deleteLambdaResourcesOnCanaryDeletion Deletes associated lambda resources created by
   * Synthetics if set to True. 
   */
  @Deprecated(message = "deprecated in CDK")
  public
      fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: IResolvable) {
    cdkBuilder.deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion)
  }

  /**
   * The ARN of the IAM role to be used to run the canary.
   *
   * This role must already exist, and must include `lambda.amazonaws.com` as a principal in the
   * trust policy. The role must also have the following permissions:
   *
   * * `s3:PutObject`
   * * `s3:GetBucketLocation`
   * * `s3:ListAllMyBuckets`
   * * `cloudwatch:PutMetricData`
   * * `logs:CreateLogGroup`
   * * `logs:CreateLogStream`
   * * `logs:PutLogEvents`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-executionrolearn)
   * @param executionRoleArn The ARN of the IAM role to be used to run the canary. 
   */
  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  /**
   * The number of days to retain data about failed runs of this canary.
   *
   * If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-failureretentionperiod)
   * @param failureRetentionPeriod The number of days to retain data about failed runs of this
   * canary. 
   */
  public fun failureRetentionPeriod(failureRetentionPeriod: Number) {
    cdkBuilder.failureRetentionPeriod(failureRetentionPeriod)
  }

  /**
   * The name for this canary.
   *
   * Be sure to give it a descriptive name that distinguishes it from other canaries in your
   * account.
   *
   * Do not include secrets or proprietary information in your canary names. The canary name makes
   * up part of the canary ARN, and the ARN is included in outbound calls over the internet. For more
   * information, see [Security Considerations for Synthetics
   * Canaries](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-name)
   * @param name The name for this canary. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * A structure that contains input information for a canary run.
   *
   * If you omit this structure, the frequency of the canary is used as canary's timeout value, up
   * to a maximum of 900 seconds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-runconfig)
   * @param runConfig A structure that contains input information for a canary run. 
   */
  public fun runConfig(runConfig: IResolvable) {
    cdkBuilder.runConfig(runConfig)
  }

  /**
   * A structure that contains input information for a canary run.
   *
   * If you omit this structure, the frequency of the canary is used as canary's timeout value, up
   * to a maximum of 900 seconds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-runconfig)
   * @param runConfig A structure that contains input information for a canary run. 
   */
  public fun runConfig(runConfig: CfnCanary.RunConfigProperty) {
    cdkBuilder.runConfig(runConfig)
  }

  /**
   * Specifies the runtime version to use for the canary.
   *
   * For more information about runtime versions, see [Canary Runtime
   * Versions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-runtimeversion)
   * @param runtimeVersion Specifies the runtime version to use for the canary. 
   */
  public fun runtimeVersion(runtimeVersion: String) {
    cdkBuilder.runtimeVersion(runtimeVersion)
  }

  /**
   * A structure that contains information about how often the canary is to run, and when these runs
   * are to stop.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-schedule)
   * @param schedule A structure that contains information about how often the canary is to run, and
   * when these runs are to stop. 
   */
  public fun schedule(schedule: IResolvable) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * A structure that contains information about how often the canary is to run, and when these runs
   * are to stop.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-schedule)
   * @param schedule A structure that contains information about how often the canary is to run, and
   * when these runs are to stop. 
   */
  public fun schedule(schedule: CfnCanary.ScheduleProperty) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * Specify TRUE to have the canary start making runs immediately after it is created.
   *
   * A canary that you create using CloudFormation can't be used to monitor the CloudFormation stack
   * that creates the canary or to roll back that stack if there is a failure.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-startcanaryaftercreation)
   * @param startCanaryAfterCreation Specify TRUE to have the canary start making runs immediately
   * after it is created. 
   */
  public fun startCanaryAfterCreation(startCanaryAfterCreation: Boolean) {
    cdkBuilder.startCanaryAfterCreation(startCanaryAfterCreation)
  }

  /**
   * Specify TRUE to have the canary start making runs immediately after it is created.
   *
   * A canary that you create using CloudFormation can't be used to monitor the CloudFormation stack
   * that creates the canary or to roll back that stack if there is a failure.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-startcanaryaftercreation)
   * @param startCanaryAfterCreation Specify TRUE to have the canary start making runs immediately
   * after it is created. 
   */
  public fun startCanaryAfterCreation(startCanaryAfterCreation: IResolvable) {
    cdkBuilder.startCanaryAfterCreation(startCanaryAfterCreation)
  }

  /**
   * The number of days to retain data about successful runs of this canary.
   *
   * If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-successretentionperiod)
   * @param successRetentionPeriod The number of days to retain data about successful runs of this
   * canary. 
   */
  public fun successRetentionPeriod(successRetentionPeriod: Number) {
    cdkBuilder.successRetentionPeriod(successRetentionPeriod)
  }

  /**
   * The list of key-value pairs that are associated with the canary.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-tags)
   * @param tags The list of key-value pairs that are associated with the canary. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The list of key-value pairs that are associated with the canary.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-tags)
   * @param tags The list of key-value pairs that are associated with the canary. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * If this canary performs visual monitoring by comparing screenshots, this structure contains the
   * ID of the canary run to use as the baseline for screenshots, and the coordinates of any parts of
   * the screen to ignore during the visual monitoring comparison.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-visualreference)
   * @param visualReference If this canary performs visual monitoring by comparing screenshots, this
   * structure contains the ID of the canary run to use as the baseline for screenshots, and the
   * coordinates of any parts of the screen to ignore during the visual monitoring comparison. 
   */
  public fun visualReference(visualReference: IResolvable) {
    cdkBuilder.visualReference(visualReference)
  }

  /**
   * If this canary performs visual monitoring by comparing screenshots, this structure contains the
   * ID of the canary run to use as the baseline for screenshots, and the coordinates of any parts of
   * the screen to ignore during the visual monitoring comparison.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-visualreference)
   * @param visualReference If this canary performs visual monitoring by comparing screenshots, this
   * structure contains the ID of the canary run to use as the baseline for screenshots, and the
   * coordinates of any parts of the screen to ignore during the visual monitoring comparison. 
   */
  public fun visualReference(visualReference: CfnCanary.VisualReferenceProperty) {
    cdkBuilder.visualReference(visualReference)
  }

  /**
   * If this canary is to test an endpoint in a VPC, this structure contains information about the
   * subnet and security groups of the VPC endpoint.
   *
   * For more information, see [Running a Canary in a
   * VPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-vpcconfig)
   * @param vpcConfig If this canary is to test an endpoint in a VPC, this structure contains
   * information about the subnet and security groups of the VPC endpoint. 
   */
  public fun vpcConfig(vpcConfig: IResolvable) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  /**
   * If this canary is to test an endpoint in a VPC, this structure contains information about the
   * subnet and security groups of the VPC endpoint.
   *
   * For more information, see [Running a Canary in a
   * VPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-vpcconfig)
   * @param vpcConfig If this canary is to test an endpoint in a VPC, this structure contains
   * information about the subnet and security groups of the VPC endpoint. 
   */
  public fun vpcConfig(vpcConfig: CfnCanary.VPCConfigProperty) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): CfnCanary {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
