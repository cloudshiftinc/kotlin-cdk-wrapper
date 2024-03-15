@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCanary`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.synthetics.*;
 * CfnCanaryProps cfnCanaryProps = CfnCanaryProps.builder()
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
public interface CfnCanaryProps {
  /**
   * A structure that contains the configuration for canary artifacts, including the
   * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifactconfig)
   */
  public fun artifactConfig(): Any? = unwrap(this).getArtifactConfig()

  /**
   * The location in Amazon S3 where Synthetics stores artifacts from the runs of this canary.
   *
   * Artifacts include the log file, screenshots, and HAR files. Specify the full location path,
   * including `s3://` at the beginning of the path.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifacts3location)
   */
  public fun artifactS3Location(): String

  /**
   * Use this structure to input your script code for the canary.
   *
   * This structure contains the Lambda handler with the location where the canary should start
   * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version are
   * also included. If the script is passed into the canary directly, the script code is contained in
   * the value of `Script` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-code)
   */
  public fun code(): Any

  /**
   * (deprecated) Deletes associated lambda resources created by Synthetics if set to True.
   *
   * Default is False
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-deletelambdaresourcesoncanarydeletion)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun deleteLambdaResourcesOnCanaryDeletion(): Any? =
      unwrap(this).getDeleteLambdaResourcesOnCanaryDeletion()

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
   */
  public fun executionRoleArn(): String

  /**
   * The number of days to retain data about failed runs of this canary.
   *
   * If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-failureretentionperiod)
   */
  public fun failureRetentionPeriod(): Number? = unwrap(this).getFailureRetentionPeriod()

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
   */
  public fun name(): String

  /**
   * A structure that contains input information for a canary run.
   *
   * If you omit this structure, the frequency of the canary is used as canary's timeout value, up
   * to a maximum of 900 seconds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-runconfig)
   */
  public fun runConfig(): Any? = unwrap(this).getRunConfig()

  /**
   * Specifies the runtime version to use for the canary.
   *
   * For more information about runtime versions, see [Canary Runtime
   * Versions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-runtimeversion)
   */
  public fun runtimeVersion(): String

  /**
   * A structure that contains information about how often the canary is to run, and when these runs
   * are to stop.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-schedule)
   */
  public fun schedule(): Any

  /**
   * Specify TRUE to have the canary start making runs immediately after it is created.
   *
   * A canary that you create using CloudFormation can't be used to monitor the CloudFormation stack
   * that creates the canary or to roll back that stack if there is a failure.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-startcanaryaftercreation)
   */
  public fun startCanaryAfterCreation(): Any? = unwrap(this).getStartCanaryAfterCreation()

  /**
   * The number of days to retain data about successful runs of this canary.
   *
   * If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-successretentionperiod)
   */
  public fun successRetentionPeriod(): Number? = unwrap(this).getSuccessRetentionPeriod()

  /**
   * The list of key-value pairs that are associated with the canary.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * If this canary performs visual monitoring by comparing screenshots, this structure contains the
   * ID of the canary run to use as the baseline for screenshots, and the coordinates of any parts of
   * the screen to ignore during the visual monitoring comparison.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-visualreference)
   */
  public fun visualReference(): Any? = unwrap(this).getVisualReference()

  /**
   * If this canary is to test an endpoint in a VPC, this structure contains information about the
   * subnet and security groups of the VPC endpoint.
   *
   * For more information, see [Running a Canary in a
   * VPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-vpcconfig)
   */
  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * A builder for [CfnCanaryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param artifactConfig A structure that contains the configuration for canary artifacts,
     * including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
     */
    public fun artifactConfig(artifactConfig: IResolvable)

    /**
     * @param artifactConfig A structure that contains the configuration for canary artifacts,
     * including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
     */
    public fun artifactConfig(artifactConfig: CfnCanary.ArtifactConfigProperty)

    /**
     * @param artifactConfig A structure that contains the configuration for canary artifacts,
     * including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9023fcd521a70bff7f30d89364cec6a1defd5536978a80348e8db6bce0364b34")
    public fun artifactConfig(artifactConfig: CfnCanary.ArtifactConfigProperty.Builder.() -> Unit)

    /**
     * @param artifactS3Location The location in Amazon S3 where Synthetics stores artifacts from
     * the runs of this canary. 
     * Artifacts include the log file, screenshots, and HAR files. Specify the full location path,
     * including `s3://` at the beginning of the path.
     */
    public fun artifactS3Location(artifactS3Location: String)

    /**
     * @param code Use this structure to input your script code for the canary. 
     * This structure contains the Lambda handler with the location where the canary should start
     * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version
     * are also included. If the script is passed into the canary directly, the script code is
     * contained in the value of `Script` .
     */
    public fun code(code: IResolvable)

    /**
     * @param code Use this structure to input your script code for the canary. 
     * This structure contains the Lambda handler with the location where the canary should start
     * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version
     * are also included. If the script is passed into the canary directly, the script code is
     * contained in the value of `Script` .
     */
    public fun code(code: CfnCanary.CodeProperty)

    /**
     * @param code Use this structure to input your script code for the canary. 
     * This structure contains the Lambda handler with the location where the canary should start
     * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version
     * are also included. If the script is passed into the canary directly, the script code is
     * contained in the value of `Script` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01b43f122b7425dd79484e68b6cf4dcfeaaa9f061282a09280c00d54fd757432")
    public fun code(code: CfnCanary.CodeProperty.Builder.() -> Unit)

    /**
     * @param deleteLambdaResourcesOnCanaryDeletion Deletes associated lambda resources created by
     * Synthetics if set to True.
     * Default is False
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: Boolean)

    /**
     * @param deleteLambdaResourcesOnCanaryDeletion Deletes associated lambda resources created by
     * Synthetics if set to True.
     * Default is False
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public
        fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: IResolvable)

    /**
     * @param executionRoleArn The ARN of the IAM role to be used to run the canary. 
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
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * @param failureRetentionPeriod The number of days to retain data about failed runs of this
     * canary.
     * If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     */
    public fun failureRetentionPeriod(failureRetentionPeriod: Number)

    /**
     * @param name The name for this canary. 
     * Be sure to give it a descriptive name that distinguishes it from other canaries in your
     * account.
     *
     * Do not include secrets or proprietary information in your canary names. The canary name makes
     * up part of the canary ARN, and the ARN is included in outbound calls over the internet. For more
     * information, see [Security Considerations for Synthetics
     * Canaries](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html)
     * .
     */
    public fun name(name: String)

    /**
     * @param runConfig A structure that contains input information for a canary run.
     * If you omit this structure, the frequency of the canary is used as canary's timeout value, up
     * to a maximum of 900 seconds.
     */
    public fun runConfig(runConfig: IResolvable)

    /**
     * @param runConfig A structure that contains input information for a canary run.
     * If you omit this structure, the frequency of the canary is used as canary's timeout value, up
     * to a maximum of 900 seconds.
     */
    public fun runConfig(runConfig: CfnCanary.RunConfigProperty)

    /**
     * @param runConfig A structure that contains input information for a canary run.
     * If you omit this structure, the frequency of the canary is used as canary's timeout value, up
     * to a maximum of 900 seconds.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95f2add22a5f361b1ae40d2f5574cb20e8cebf4216aaf41edc9ad2b55203c439")
    public fun runConfig(runConfig: CfnCanary.RunConfigProperty.Builder.() -> Unit)

    /**
     * @param runtimeVersion Specifies the runtime version to use for the canary. 
     * For more information about runtime versions, see [Canary Runtime
     * Versions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html)
     * .
     */
    public fun runtimeVersion(runtimeVersion: String)

    /**
     * @param schedule A structure that contains information about how often the canary is to run,
     * and when these runs are to stop. 
     */
    public fun schedule(schedule: IResolvable)

    /**
     * @param schedule A structure that contains information about how often the canary is to run,
     * and when these runs are to stop. 
     */
    public fun schedule(schedule: CfnCanary.ScheduleProperty)

    /**
     * @param schedule A structure that contains information about how often the canary is to run,
     * and when these runs are to stop. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3482ba41884599df1c8c020dc4ddf53c42bf23df0d9fdc1e4699f128f9922250")
    public fun schedule(schedule: CfnCanary.ScheduleProperty.Builder.() -> Unit)

    /**
     * @param startCanaryAfterCreation Specify TRUE to have the canary start making runs immediately
     * after it is created.
     * A canary that you create using CloudFormation can't be used to monitor the CloudFormation
     * stack that creates the canary or to roll back that stack if there is a failure.
     */
    public fun startCanaryAfterCreation(startCanaryAfterCreation: Boolean)

    /**
     * @param startCanaryAfterCreation Specify TRUE to have the canary start making runs immediately
     * after it is created.
     * A canary that you create using CloudFormation can't be used to monitor the CloudFormation
     * stack that creates the canary or to roll back that stack if there is a failure.
     */
    public fun startCanaryAfterCreation(startCanaryAfterCreation: IResolvable)

    /**
     * @param successRetentionPeriod The number of days to retain data about successful runs of this
     * canary.
     * If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     */
    public fun successRetentionPeriod(successRetentionPeriod: Number)

    /**
     * @param tags The list of key-value pairs that are associated with the canary.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The list of key-value pairs that are associated with the canary.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param visualReference If this canary performs visual monitoring by comparing screenshots,
     * this structure contains the ID of the canary run to use as the baseline for screenshots, and the
     * coordinates of any parts of the screen to ignore during the visual monitoring comparison.
     */
    public fun visualReference(visualReference: IResolvable)

    /**
     * @param visualReference If this canary performs visual monitoring by comparing screenshots,
     * this structure contains the ID of the canary run to use as the baseline for screenshots, and the
     * coordinates of any parts of the screen to ignore during the visual monitoring comparison.
     */
    public fun visualReference(visualReference: CfnCanary.VisualReferenceProperty)

    /**
     * @param visualReference If this canary performs visual monitoring by comparing screenshots,
     * this structure contains the ID of the canary run to use as the baseline for screenshots, and the
     * coordinates of any parts of the screen to ignore during the visual monitoring comparison.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f28d0616e5457fd9b52b67cc85a38dbd57a32be581e7414a43fe10e53ea3a854")
    public
        fun visualReference(visualReference: CfnCanary.VisualReferenceProperty.Builder.() -> Unit)

    /**
     * @param vpcConfig If this canary is to test an endpoint in a VPC, this structure contains
     * information about the subnet and security groups of the VPC endpoint.
     * For more information, see [Running a Canary in a
     * VPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html)
     * .
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * @param vpcConfig If this canary is to test an endpoint in a VPC, this structure contains
     * information about the subnet and security groups of the VPC endpoint.
     * For more information, see [Running a Canary in a
     * VPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html)
     * .
     */
    public fun vpcConfig(vpcConfig: CfnCanary.VPCConfigProperty)

    /**
     * @param vpcConfig If this canary is to test an endpoint in a VPC, this structure contains
     * information about the subnet and security groups of the VPC endpoint.
     * For more information, see [Running a Canary in a
     * VPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e60142d3e19dbffd9227f65176beee64498ccf695c8a131c34bfb96824cb0bd4")
    public fun vpcConfig(vpcConfig: CfnCanary.VPCConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.CfnCanaryProps.Builder =
        software.amazon.awscdk.services.synthetics.CfnCanaryProps.builder()

    /**
     * @param artifactConfig A structure that contains the configuration for canary artifacts,
     * including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
     */
    override fun artifactConfig(artifactConfig: IResolvable) {
      cdkBuilder.artifactConfig(artifactConfig.let(IResolvable::unwrap))
    }

    /**
     * @param artifactConfig A structure that contains the configuration for canary artifacts,
     * including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
     */
    override fun artifactConfig(artifactConfig: CfnCanary.ArtifactConfigProperty) {
      cdkBuilder.artifactConfig(artifactConfig.let(CfnCanary.ArtifactConfigProperty::unwrap))
    }

    /**
     * @param artifactConfig A structure that contains the configuration for canary artifacts,
     * including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9023fcd521a70bff7f30d89364cec6a1defd5536978a80348e8db6bce0364b34")
    override
        fun artifactConfig(artifactConfig: CfnCanary.ArtifactConfigProperty.Builder.() -> Unit):
        Unit = artifactConfig(CfnCanary.ArtifactConfigProperty(artifactConfig))

    /**
     * @param artifactS3Location The location in Amazon S3 where Synthetics stores artifacts from
     * the runs of this canary. 
     * Artifacts include the log file, screenshots, and HAR files. Specify the full location path,
     * including `s3://` at the beginning of the path.
     */
    override fun artifactS3Location(artifactS3Location: String) {
      cdkBuilder.artifactS3Location(artifactS3Location)
    }

    /**
     * @param code Use this structure to input your script code for the canary. 
     * This structure contains the Lambda handler with the location where the canary should start
     * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version
     * are also included. If the script is passed into the canary directly, the script code is
     * contained in the value of `Script` .
     */
    override fun code(code: IResolvable) {
      cdkBuilder.code(code.let(IResolvable::unwrap))
    }

    /**
     * @param code Use this structure to input your script code for the canary. 
     * This structure contains the Lambda handler with the location where the canary should start
     * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version
     * are also included. If the script is passed into the canary directly, the script code is
     * contained in the value of `Script` .
     */
    override fun code(code: CfnCanary.CodeProperty) {
      cdkBuilder.code(code.let(CfnCanary.CodeProperty::unwrap))
    }

    /**
     * @param code Use this structure to input your script code for the canary. 
     * This structure contains the Lambda handler with the location where the canary should start
     * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version
     * are also included. If the script is passed into the canary directly, the script code is
     * contained in the value of `Script` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01b43f122b7425dd79484e68b6cf4dcfeaaa9f061282a09280c00d54fd757432")
    override fun code(code: CfnCanary.CodeProperty.Builder.() -> Unit): Unit =
        code(CfnCanary.CodeProperty(code))

    /**
     * @param deleteLambdaResourcesOnCanaryDeletion Deletes associated lambda resources created by
     * Synthetics if set to True.
     * Default is False
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override
        fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: Boolean) {
      cdkBuilder.deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion)
    }

    /**
     * @param deleteLambdaResourcesOnCanaryDeletion Deletes associated lambda resources created by
     * Synthetics if set to True.
     * Default is False
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override
        fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: IResolvable) {
      cdkBuilder.deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion.let(IResolvable::unwrap))
    }

    /**
     * @param executionRoleArn The ARN of the IAM role to be used to run the canary. 
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
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * @param failureRetentionPeriod The number of days to retain data about failed runs of this
     * canary.
     * If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     */
    override fun failureRetentionPeriod(failureRetentionPeriod: Number) {
      cdkBuilder.failureRetentionPeriod(failureRetentionPeriod)
    }

    /**
     * @param name The name for this canary. 
     * Be sure to give it a descriptive name that distinguishes it from other canaries in your
     * account.
     *
     * Do not include secrets or proprietary information in your canary names. The canary name makes
     * up part of the canary ARN, and the ARN is included in outbound calls over the internet. For more
     * information, see [Security Considerations for Synthetics
     * Canaries](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html)
     * .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param runConfig A structure that contains input information for a canary run.
     * If you omit this structure, the frequency of the canary is used as canary's timeout value, up
     * to a maximum of 900 seconds.
     */
    override fun runConfig(runConfig: IResolvable) {
      cdkBuilder.runConfig(runConfig.let(IResolvable::unwrap))
    }

    /**
     * @param runConfig A structure that contains input information for a canary run.
     * If you omit this structure, the frequency of the canary is used as canary's timeout value, up
     * to a maximum of 900 seconds.
     */
    override fun runConfig(runConfig: CfnCanary.RunConfigProperty) {
      cdkBuilder.runConfig(runConfig.let(CfnCanary.RunConfigProperty::unwrap))
    }

    /**
     * @param runConfig A structure that contains input information for a canary run.
     * If you omit this structure, the frequency of the canary is used as canary's timeout value, up
     * to a maximum of 900 seconds.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95f2add22a5f361b1ae40d2f5574cb20e8cebf4216aaf41edc9ad2b55203c439")
    override fun runConfig(runConfig: CfnCanary.RunConfigProperty.Builder.() -> Unit): Unit =
        runConfig(CfnCanary.RunConfigProperty(runConfig))

    /**
     * @param runtimeVersion Specifies the runtime version to use for the canary. 
     * For more information about runtime versions, see [Canary Runtime
     * Versions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html)
     * .
     */
    override fun runtimeVersion(runtimeVersion: String) {
      cdkBuilder.runtimeVersion(runtimeVersion)
    }

    /**
     * @param schedule A structure that contains information about how often the canary is to run,
     * and when these runs are to stop. 
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    /**
     * @param schedule A structure that contains information about how often the canary is to run,
     * and when these runs are to stop. 
     */
    override fun schedule(schedule: CfnCanary.ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(CfnCanary.ScheduleProperty::unwrap))
    }

    /**
     * @param schedule A structure that contains information about how often the canary is to run,
     * and when these runs are to stop. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3482ba41884599df1c8c020dc4ddf53c42bf23df0d9fdc1e4699f128f9922250")
    override fun schedule(schedule: CfnCanary.ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(CfnCanary.ScheduleProperty(schedule))

    /**
     * @param startCanaryAfterCreation Specify TRUE to have the canary start making runs immediately
     * after it is created.
     * A canary that you create using CloudFormation can't be used to monitor the CloudFormation
     * stack that creates the canary or to roll back that stack if there is a failure.
     */
    override fun startCanaryAfterCreation(startCanaryAfterCreation: Boolean) {
      cdkBuilder.startCanaryAfterCreation(startCanaryAfterCreation)
    }

    /**
     * @param startCanaryAfterCreation Specify TRUE to have the canary start making runs immediately
     * after it is created.
     * A canary that you create using CloudFormation can't be used to monitor the CloudFormation
     * stack that creates the canary or to roll back that stack if there is a failure.
     */
    override fun startCanaryAfterCreation(startCanaryAfterCreation: IResolvable) {
      cdkBuilder.startCanaryAfterCreation(startCanaryAfterCreation.let(IResolvable::unwrap))
    }

    /**
     * @param successRetentionPeriod The number of days to retain data about successful runs of this
     * canary.
     * If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     */
    override fun successRetentionPeriod(successRetentionPeriod: Number) {
      cdkBuilder.successRetentionPeriod(successRetentionPeriod)
    }

    /**
     * @param tags The list of key-value pairs that are associated with the canary.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The list of key-value pairs that are associated with the canary.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param visualReference If this canary performs visual monitoring by comparing screenshots,
     * this structure contains the ID of the canary run to use as the baseline for screenshots, and the
     * coordinates of any parts of the screen to ignore during the visual monitoring comparison.
     */
    override fun visualReference(visualReference: IResolvable) {
      cdkBuilder.visualReference(visualReference.let(IResolvable::unwrap))
    }

    /**
     * @param visualReference If this canary performs visual monitoring by comparing screenshots,
     * this structure contains the ID of the canary run to use as the baseline for screenshots, and the
     * coordinates of any parts of the screen to ignore during the visual monitoring comparison.
     */
    override fun visualReference(visualReference: CfnCanary.VisualReferenceProperty) {
      cdkBuilder.visualReference(visualReference.let(CfnCanary.VisualReferenceProperty::unwrap))
    }

    /**
     * @param visualReference If this canary performs visual monitoring by comparing screenshots,
     * this structure contains the ID of the canary run to use as the baseline for screenshots, and the
     * coordinates of any parts of the screen to ignore during the visual monitoring comparison.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f28d0616e5457fd9b52b67cc85a38dbd57a32be581e7414a43fe10e53ea3a854")
    override
        fun visualReference(visualReference: CfnCanary.VisualReferenceProperty.Builder.() -> Unit):
        Unit = visualReference(CfnCanary.VisualReferenceProperty(visualReference))

    /**
     * @param vpcConfig If this canary is to test an endpoint in a VPC, this structure contains
     * information about the subnet and security groups of the VPC endpoint.
     * For more information, see [Running a Canary in a
     * VPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html)
     * .
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    /**
     * @param vpcConfig If this canary is to test an endpoint in a VPC, this structure contains
     * information about the subnet and security groups of the VPC endpoint.
     * For more information, see [Running a Canary in a
     * VPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html)
     * .
     */
    override fun vpcConfig(vpcConfig: CfnCanary.VPCConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnCanary.VPCConfigProperty::unwrap))
    }

    /**
     * @param vpcConfig If this canary is to test an endpoint in a VPC, this structure contains
     * information about the subnet and security groups of the VPC endpoint.
     * For more information, see [Running a Canary in a
     * VPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e60142d3e19dbffd9227f65176beee64498ccf695c8a131c34bfb96824cb0bd4")
    override fun vpcConfig(vpcConfig: CfnCanary.VPCConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnCanary.VPCConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.synthetics.CfnCanaryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.synthetics.CfnCanaryProps,
  ) : CdkObject(cdkObject), CfnCanaryProps {
    /**
     * A structure that contains the configuration for canary artifacts, including the
     * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifactconfig)
     */
    override fun artifactConfig(): Any? = unwrap(this).getArtifactConfig()

    /**
     * The location in Amazon S3 where Synthetics stores artifacts from the runs of this canary.
     *
     * Artifacts include the log file, screenshots, and HAR files. Specify the full location path,
     * including `s3://` at the beginning of the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifacts3location)
     */
    override fun artifactS3Location(): String = unwrap(this).getArtifactS3Location()

    /**
     * Use this structure to input your script code for the canary.
     *
     * This structure contains the Lambda handler with the location where the canary should start
     * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version
     * are also included. If the script is passed into the canary directly, the script code is
     * contained in the value of `Script` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-code)
     */
    override fun code(): Any = unwrap(this).getCode()

    /**
     * (deprecated) Deletes associated lambda resources created by Synthetics if set to True.
     *
     * Default is False
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-deletelambdaresourcesoncanarydeletion)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun deleteLambdaResourcesOnCanaryDeletion(): Any? =
        unwrap(this).getDeleteLambdaResourcesOnCanaryDeletion()

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
     */
    override fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

    /**
     * The number of days to retain data about failed runs of this canary.
     *
     * If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-failureretentionperiod)
     */
    override fun failureRetentionPeriod(): Number? = unwrap(this).getFailureRetentionPeriod()

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
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A structure that contains input information for a canary run.
     *
     * If you omit this structure, the frequency of the canary is used as canary's timeout value, up
     * to a maximum of 900 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-runconfig)
     */
    override fun runConfig(): Any? = unwrap(this).getRunConfig()

    /**
     * Specifies the runtime version to use for the canary.
     *
     * For more information about runtime versions, see [Canary Runtime
     * Versions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-runtimeversion)
     */
    override fun runtimeVersion(): String = unwrap(this).getRuntimeVersion()

    /**
     * A structure that contains information about how often the canary is to run, and when these
     * runs are to stop.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-schedule)
     */
    override fun schedule(): Any = unwrap(this).getSchedule()

    /**
     * Specify TRUE to have the canary start making runs immediately after it is created.
     *
     * A canary that you create using CloudFormation can't be used to monitor the CloudFormation
     * stack that creates the canary or to roll back that stack if there is a failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-startcanaryaftercreation)
     */
    override fun startCanaryAfterCreation(): Any? = unwrap(this).getStartCanaryAfterCreation()

    /**
     * The number of days to retain data about successful runs of this canary.
     *
     * If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-successretentionperiod)
     */
    override fun successRetentionPeriod(): Number? = unwrap(this).getSuccessRetentionPeriod()

    /**
     * The list of key-value pairs that are associated with the canary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * If this canary performs visual monitoring by comparing screenshots, this structure contains
     * the ID of the canary run to use as the baseline for screenshots, and the coordinates of any
     * parts of the screen to ignore during the visual monitoring comparison.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-visualreference)
     */
    override fun visualReference(): Any? = unwrap(this).getVisualReference()

    /**
     * If this canary is to test an endpoint in a VPC, this structure contains information about the
     * subnet and security groups of the VPC endpoint.
     *
     * For more information, see [Running a Canary in a
     * VPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-vpcconfig)
     */
    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCanaryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanaryProps):
        CfnCanaryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCanaryProps):
        software.amazon.awscdk.services.synthetics.CfnCanaryProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.synthetics.CfnCanaryProps
  }
}
