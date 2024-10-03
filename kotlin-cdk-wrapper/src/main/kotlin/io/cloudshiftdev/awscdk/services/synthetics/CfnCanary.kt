@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

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
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.synthetics.*;
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
public open class CfnCanary(
  cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCanaryProps,
  ) :
      this(software.amazon.awscdk.services.synthetics.CfnCanary(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCanaryProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCanaryProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCanaryProps(props)
  )

  /**
   * A structure that contains the configuration for canary artifacts, including the
   * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
   */
  public open fun artifactConfig(): Any? = unwrap(this).getArtifactConfig()

  /**
   * A structure that contains the configuration for canary artifacts, including the
   * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
   */
  public open fun artifactConfig(`value`: IResolvable) {
    unwrap(this).setArtifactConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A structure that contains the configuration for canary artifacts, including the
   * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
   */
  public open fun artifactConfig(`value`: ArtifactConfigProperty) {
    unwrap(this).setArtifactConfig(`value`.let(ArtifactConfigProperty.Companion::unwrap))
  }

  /**
   * A structure that contains the configuration for canary artifacts, including the
   * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f3cb1704f83216a2bfdfbf7cf9496a1793bed3dbae1788e8a7e3f5fd09fa6932")
  public open fun artifactConfig(`value`: ArtifactConfigProperty.Builder.() -> Unit): Unit =
      artifactConfig(ArtifactConfigProperty(`value`))

  /**
   * The location in Amazon S3 where Synthetics stores artifacts from the runs of this canary.
   */
  public open fun artifactS3Location(): String = unwrap(this).getArtifactS3Location()

  /**
   * The location in Amazon S3 where Synthetics stores artifacts from the runs of this canary.
   */
  public open fun artifactS3Location(`value`: String) {
    unwrap(this).setArtifactS3Location(`value`)
  }

  /**
   * `Ref` returns the ARN of the Lambda layer where Synthetics stores the canary script code.
   */
  public open fun attrCodeSourceLocationArn(): String = unwrap(this).getAttrCodeSourceLocationArn()

  /**
   * The ID of the canary.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The state of the canary.
   *
   * For example, `RUNNING` .
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * Use this structure to input your script code for the canary.
   */
  public open fun code(): Any = unwrap(this).getCode()

  /**
   * Use this structure to input your script code for the canary.
   */
  public open fun code(`value`: IResolvable) {
    unwrap(this).setCode(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Use this structure to input your script code for the canary.
   */
  public open fun code(`value`: CodeProperty) {
    unwrap(this).setCode(`value`.let(CodeProperty.Companion::unwrap))
  }

  /**
   * Use this structure to input your script code for the canary.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4fc5bd083f88ecc4e8524b58bfdd35b15084318d123150fd624c972b2f2b24dc")
  public open fun code(`value`: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(`value`))

  /**
   * (deprecated) Deletes associated lambda resources created by Synthetics if set to True.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun deleteLambdaResourcesOnCanaryDeletion(): Any? =
      unwrap(this).getDeleteLambdaResourcesOnCanaryDeletion()

  /**
   * (deprecated) Deletes associated lambda resources created by Synthetics if set to True.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun deleteLambdaResourcesOnCanaryDeletion(`value`: Boolean) {
    unwrap(this).setDeleteLambdaResourcesOnCanaryDeletion(`value`)
  }

  /**
   * (deprecated) Deletes associated lambda resources created by Synthetics if set to True.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun deleteLambdaResourcesOnCanaryDeletion(`value`: IResolvable) {
    unwrap(this).setDeleteLambdaResourcesOnCanaryDeletion(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The ARN of the IAM role to be used to run the canary.
   */
  public open fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

  /**
   * The ARN of the IAM role to be used to run the canary.
   */
  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
  }

  /**
   * The number of days to retain data about failed runs of this canary.
   */
  public open fun failureRetentionPeriod(): Number? = unwrap(this).getFailureRetentionPeriod()

  /**
   * The number of days to retain data about failed runs of this canary.
   */
  public open fun failureRetentionPeriod(`value`: Number) {
    unwrap(this).setFailureRetentionPeriod(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name for this canary.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name for this canary.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A structure that contains input information for a canary run.
   */
  public open fun runConfig(): Any? = unwrap(this).getRunConfig()

  /**
   * A structure that contains input information for a canary run.
   */
  public open fun runConfig(`value`: IResolvable) {
    unwrap(this).setRunConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A structure that contains input information for a canary run.
   */
  public open fun runConfig(`value`: RunConfigProperty) {
    unwrap(this).setRunConfig(`value`.let(RunConfigProperty.Companion::unwrap))
  }

  /**
   * A structure that contains input information for a canary run.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eb98029d262fc07236f6cc9512e890ef821f4ee256e72cd14c3ea90d56df3429")
  public open fun runConfig(`value`: RunConfigProperty.Builder.() -> Unit): Unit =
      runConfig(RunConfigProperty(`value`))

  /**
   * Specifies the runtime version to use for the canary.
   */
  public open fun runtimeVersion(): String = unwrap(this).getRuntimeVersion()

  /**
   * Specifies the runtime version to use for the canary.
   */
  public open fun runtimeVersion(`value`: String) {
    unwrap(this).setRuntimeVersion(`value`)
  }

  /**
   * A structure that contains information about how often the canary is to run, and when these runs
   * are to stop.
   */
  public open fun schedule(): Any = unwrap(this).getSchedule()

  /**
   * A structure that contains information about how often the canary is to run, and when these runs
   * are to stop.
   */
  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A structure that contains information about how often the canary is to run, and when these runs
   * are to stop.
   */
  public open fun schedule(`value`: ScheduleProperty) {
    unwrap(this).setSchedule(`value`.let(ScheduleProperty.Companion::unwrap))
  }

  /**
   * A structure that contains information about how often the canary is to run, and when these runs
   * are to stop.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("93aeb981857476ec769a7a2742025af40fef3205942257c7d9ce1c2c6b0c3570")
  public open fun schedule(`value`: ScheduleProperty.Builder.() -> Unit): Unit =
      schedule(ScheduleProperty(`value`))

  /**
   * Specify TRUE to have the canary start making runs immediately after it is created.
   */
  public open fun startCanaryAfterCreation(): Any? = unwrap(this).getStartCanaryAfterCreation()

  /**
   * Specify TRUE to have the canary start making runs immediately after it is created.
   */
  public open fun startCanaryAfterCreation(`value`: Boolean) {
    unwrap(this).setStartCanaryAfterCreation(`value`)
  }

  /**
   * Specify TRUE to have the canary start making runs immediately after it is created.
   */
  public open fun startCanaryAfterCreation(`value`: IResolvable) {
    unwrap(this).setStartCanaryAfterCreation(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The number of days to retain data about successful runs of this canary.
   */
  public open fun successRetentionPeriod(): Number? = unwrap(this).getSuccessRetentionPeriod()

  /**
   * The number of days to retain data about successful runs of this canary.
   */
  public open fun successRetentionPeriod(`value`: Number) {
    unwrap(this).setSuccessRetentionPeriod(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The list of key-value pairs that are associated with the canary.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The list of key-value pairs that are associated with the canary.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The list of key-value pairs that are associated with the canary.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * If this canary performs visual monitoring by comparing screenshots, this structure contains the
   * ID of the canary run to use as the baseline for screenshots, and the coordinates of any parts of
   * the screen to ignore during the visual monitoring comparison.
   */
  public open fun visualReference(): Any? = unwrap(this).getVisualReference()

  /**
   * If this canary performs visual monitoring by comparing screenshots, this structure contains the
   * ID of the canary run to use as the baseline for screenshots, and the coordinates of any parts of
   * the screen to ignore during the visual monitoring comparison.
   */
  public open fun visualReference(`value`: IResolvable) {
    unwrap(this).setVisualReference(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * If this canary performs visual monitoring by comparing screenshots, this structure contains the
   * ID of the canary run to use as the baseline for screenshots, and the coordinates of any parts of
   * the screen to ignore during the visual monitoring comparison.
   */
  public open fun visualReference(`value`: VisualReferenceProperty) {
    unwrap(this).setVisualReference(`value`.let(VisualReferenceProperty.Companion::unwrap))
  }

  /**
   * If this canary performs visual monitoring by comparing screenshots, this structure contains the
   * ID of the canary run to use as the baseline for screenshots, and the coordinates of any parts of
   * the screen to ignore during the visual monitoring comparison.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("97e7c35ac5fac3fde2721d515323f2bf59afca8fb0695744278bdb75b635c8ea")
  public open fun visualReference(`value`: VisualReferenceProperty.Builder.() -> Unit): Unit =
      visualReference(VisualReferenceProperty(`value`))

  /**
   * If this canary is to test an endpoint in a VPC, this structure contains information about the
   * subnet and security groups of the VPC endpoint.
   */
  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * If this canary is to test an endpoint in a VPC, this structure contains information about the
   * subnet and security groups of the VPC endpoint.
   */
  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * If this canary is to test an endpoint in a VPC, this structure contains information about the
   * subnet and security groups of the VPC endpoint.
   */
  public open fun vpcConfig(`value`: VPCConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VPCConfigProperty.Companion::unwrap))
  }

  /**
   * If this canary is to test an endpoint in a VPC, this structure contains information about the
   * subnet and security groups of the VPC endpoint.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2c745b5b442c7930b15a62104ceadf907406274b133cbac468889dd9ce9dde37")
  public open fun vpcConfig(`value`: VPCConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VPCConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.synthetics.CfnCanary].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A structure that contains the configuration for canary artifacts, including the
     * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifactconfig)
     * @param artifactConfig A structure that contains the configuration for canary artifacts,
     * including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. 
     */
    public fun artifactConfig(artifactConfig: IResolvable)

    /**
     * A structure that contains the configuration for canary artifacts, including the
     * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifactconfig)
     * @param artifactConfig A structure that contains the configuration for canary artifacts,
     * including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. 
     */
    public fun artifactConfig(artifactConfig: ArtifactConfigProperty)

    /**
     * A structure that contains the configuration for canary artifacts, including the
     * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifactconfig)
     * @param artifactConfig A structure that contains the configuration for canary artifacts,
     * including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b23f001e2dd8a6cfb00b3131af1425ae09f30fc4cbc4fc44e8f860e9febcc135")
    public fun artifactConfig(artifactConfig: ArtifactConfigProperty.Builder.() -> Unit)

    /**
     * The location in Amazon S3 where Synthetics stores artifacts from the runs of this canary.
     *
     * Artifacts include the log file, screenshots, and HAR files. Specify the full location path,
     * including `s3://` at the beginning of the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifacts3location)
     * @param artifactS3Location The location in Amazon S3 where Synthetics stores artifacts from
     * the runs of this canary. 
     */
    public fun artifactS3Location(artifactS3Location: String)

    /**
     * Use this structure to input your script code for the canary.
     *
     * This structure contains the Lambda handler with the location where the canary should start
     * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version
     * are also included. If the script is passed into the canary directly, the script code is
     * contained in the value of `Script` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-code)
     * @param code Use this structure to input your script code for the canary. 
     */
    public fun code(code: IResolvable)

    /**
     * Use this structure to input your script code for the canary.
     *
     * This structure contains the Lambda handler with the location where the canary should start
     * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version
     * are also included. If the script is passed into the canary directly, the script code is
     * contained in the value of `Script` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-code)
     * @param code Use this structure to input your script code for the canary. 
     */
    public fun code(code: CodeProperty)

    /**
     * Use this structure to input your script code for the canary.
     *
     * This structure contains the Lambda handler with the location where the canary should start
     * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version
     * are also included. If the script is passed into the canary directly, the script code is
     * contained in the value of `Script` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-code)
     * @param code Use this structure to input your script code for the canary. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c812154cd31e9058f9a59ba258f53c8ba550d96607d8ec454c71346200d4796")
    public fun code(code: CodeProperty.Builder.() -> Unit)

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
    public fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: Boolean)

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
        fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: IResolvable)

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
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * The number of days to retain data about failed runs of this canary.
     *
     * If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-failureretentionperiod)
     * @param failureRetentionPeriod The number of days to retain data about failed runs of this
     * canary. 
     */
    public fun failureRetentionPeriod(failureRetentionPeriod: Number)

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
    public fun name(name: String)

    /**
     * A structure that contains input information for a canary run.
     *
     * If you omit this structure, the frequency of the canary is used as canary's timeout value, up
     * to a maximum of 900 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-runconfig)
     * @param runConfig A structure that contains input information for a canary run. 
     */
    public fun runConfig(runConfig: IResolvable)

    /**
     * A structure that contains input information for a canary run.
     *
     * If you omit this structure, the frequency of the canary is used as canary's timeout value, up
     * to a maximum of 900 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-runconfig)
     * @param runConfig A structure that contains input information for a canary run. 
     */
    public fun runConfig(runConfig: RunConfigProperty)

    /**
     * A structure that contains input information for a canary run.
     *
     * If you omit this structure, the frequency of the canary is used as canary's timeout value, up
     * to a maximum of 900 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-runconfig)
     * @param runConfig A structure that contains input information for a canary run. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("593ad653374326f03b8fffc50aebd3f75a0ebf23cee869b1d32c4fbc0ab76399")
    public fun runConfig(runConfig: RunConfigProperty.Builder.() -> Unit)

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
    public fun runtimeVersion(runtimeVersion: String)

    /**
     * A structure that contains information about how often the canary is to run, and when these
     * runs are to stop.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-schedule)
     * @param schedule A structure that contains information about how often the canary is to run,
     * and when these runs are to stop. 
     */
    public fun schedule(schedule: IResolvable)

    /**
     * A structure that contains information about how often the canary is to run, and when these
     * runs are to stop.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-schedule)
     * @param schedule A structure that contains information about how often the canary is to run,
     * and when these runs are to stop. 
     */
    public fun schedule(schedule: ScheduleProperty)

    /**
     * A structure that contains information about how often the canary is to run, and when these
     * runs are to stop.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-schedule)
     * @param schedule A structure that contains information about how often the canary is to run,
     * and when these runs are to stop. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fd52bf09f0ec9f283e051ca56ffb048645d905bc4e602bd1a3c9395b5b79ddb")
    public fun schedule(schedule: ScheduleProperty.Builder.() -> Unit)

    /**
     * Specify TRUE to have the canary start making runs immediately after it is created.
     *
     * A canary that you create using CloudFormation can't be used to monitor the CloudFormation
     * stack that creates the canary or to roll back that stack if there is a failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-startcanaryaftercreation)
     * @param startCanaryAfterCreation Specify TRUE to have the canary start making runs immediately
     * after it is created. 
     */
    public fun startCanaryAfterCreation(startCanaryAfterCreation: Boolean)

    /**
     * Specify TRUE to have the canary start making runs immediately after it is created.
     *
     * A canary that you create using CloudFormation can't be used to monitor the CloudFormation
     * stack that creates the canary or to roll back that stack if there is a failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-startcanaryaftercreation)
     * @param startCanaryAfterCreation Specify TRUE to have the canary start making runs immediately
     * after it is created. 
     */
    public fun startCanaryAfterCreation(startCanaryAfterCreation: IResolvable)

    /**
     * The number of days to retain data about successful runs of this canary.
     *
     * If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-successretentionperiod)
     * @param successRetentionPeriod The number of days to retain data about successful runs of this
     * canary. 
     */
    public fun successRetentionPeriod(successRetentionPeriod: Number)

    /**
     * The list of key-value pairs that are associated with the canary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-tags)
     * @param tags The list of key-value pairs that are associated with the canary. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The list of key-value pairs that are associated with the canary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-tags)
     * @param tags The list of key-value pairs that are associated with the canary. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * If this canary performs visual monitoring by comparing screenshots, this structure contains
     * the ID of the canary run to use as the baseline for screenshots, and the coordinates of any
     * parts of the screen to ignore during the visual monitoring comparison.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-visualreference)
     * @param visualReference If this canary performs visual monitoring by comparing screenshots,
     * this structure contains the ID of the canary run to use as the baseline for screenshots, and the
     * coordinates of any parts of the screen to ignore during the visual monitoring comparison. 
     */
    public fun visualReference(visualReference: IResolvable)

    /**
     * If this canary performs visual monitoring by comparing screenshots, this structure contains
     * the ID of the canary run to use as the baseline for screenshots, and the coordinates of any
     * parts of the screen to ignore during the visual monitoring comparison.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-visualreference)
     * @param visualReference If this canary performs visual monitoring by comparing screenshots,
     * this structure contains the ID of the canary run to use as the baseline for screenshots, and the
     * coordinates of any parts of the screen to ignore during the visual monitoring comparison. 
     */
    public fun visualReference(visualReference: VisualReferenceProperty)

    /**
     * If this canary performs visual monitoring by comparing screenshots, this structure contains
     * the ID of the canary run to use as the baseline for screenshots, and the coordinates of any
     * parts of the screen to ignore during the visual monitoring comparison.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-visualreference)
     * @param visualReference If this canary performs visual monitoring by comparing screenshots,
     * this structure contains the ID of the canary run to use as the baseline for screenshots, and the
     * coordinates of any parts of the screen to ignore during the visual monitoring comparison. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bbb4cbb9894123c40e44079dc0cc74d2f61a18097234b42c75576546fef8718")
    public fun visualReference(visualReference: VisualReferenceProperty.Builder.() -> Unit)

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
    public fun vpcConfig(vpcConfig: IResolvable)

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
    public fun vpcConfig(vpcConfig: VPCConfigProperty)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42466e6db317ff4a78574c685c398063fd03f17ed16764eba50d382eca61f3d6")
    public fun vpcConfig(vpcConfig: VPCConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.CfnCanary.Builder =
        software.amazon.awscdk.services.synthetics.CfnCanary.Builder.create(scope, id)

    /**
     * A structure that contains the configuration for canary artifacts, including the
     * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifactconfig)
     * @param artifactConfig A structure that contains the configuration for canary artifacts,
     * including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. 
     */
    override fun artifactConfig(artifactConfig: IResolvable) {
      cdkBuilder.artifactConfig(artifactConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * A structure that contains the configuration for canary artifacts, including the
     * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifactconfig)
     * @param artifactConfig A structure that contains the configuration for canary artifacts,
     * including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. 
     */
    override fun artifactConfig(artifactConfig: ArtifactConfigProperty) {
      cdkBuilder.artifactConfig(artifactConfig.let(ArtifactConfigProperty.Companion::unwrap))
    }

    /**
     * A structure that contains the configuration for canary artifacts, including the
     * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifactconfig)
     * @param artifactConfig A structure that contains the configuration for canary artifacts,
     * including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b23f001e2dd8a6cfb00b3131af1425ae09f30fc4cbc4fc44e8f860e9febcc135")
    override fun artifactConfig(artifactConfig: ArtifactConfigProperty.Builder.() -> Unit): Unit =
        artifactConfig(ArtifactConfigProperty(artifactConfig))

    /**
     * The location in Amazon S3 where Synthetics stores artifacts from the runs of this canary.
     *
     * Artifacts include the log file, screenshots, and HAR files. Specify the full location path,
     * including `s3://` at the beginning of the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-artifacts3location)
     * @param artifactS3Location The location in Amazon S3 where Synthetics stores artifacts from
     * the runs of this canary. 
     */
    override fun artifactS3Location(artifactS3Location: String) {
      cdkBuilder.artifactS3Location(artifactS3Location)
    }

    /**
     * Use this structure to input your script code for the canary.
     *
     * This structure contains the Lambda handler with the location where the canary should start
     * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version
     * are also included. If the script is passed into the canary directly, the script code is
     * contained in the value of `Script` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-code)
     * @param code Use this structure to input your script code for the canary. 
     */
    override fun code(code: IResolvable) {
      cdkBuilder.code(code.let(IResolvable.Companion::unwrap))
    }

    /**
     * Use this structure to input your script code for the canary.
     *
     * This structure contains the Lambda handler with the location where the canary should start
     * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version
     * are also included. If the script is passed into the canary directly, the script code is
     * contained in the value of `Script` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-code)
     * @param code Use this structure to input your script code for the canary. 
     */
    override fun code(code: CodeProperty) {
      cdkBuilder.code(code.let(CodeProperty.Companion::unwrap))
    }

    /**
     * Use this structure to input your script code for the canary.
     *
     * This structure contains the Lambda handler with the location where the canary should start
     * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version
     * are also included. If the script is passed into the canary directly, the script code is
     * contained in the value of `Script` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-code)
     * @param code Use this structure to input your script code for the canary. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c812154cd31e9058f9a59ba258f53c8ba550d96607d8ec454c71346200d4796")
    override fun code(code: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(code))

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
    override
        fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: Boolean) {
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
    override
        fun deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion: IResolvable) {
      cdkBuilder.deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion.let(IResolvable.Companion::unwrap))
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
    override fun executionRoleArn(executionRoleArn: String) {
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
    override fun failureRetentionPeriod(failureRetentionPeriod: Number) {
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
    override fun name(name: String) {
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
    override fun runConfig(runConfig: IResolvable) {
      cdkBuilder.runConfig(runConfig.let(IResolvable.Companion::unwrap))
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
    override fun runConfig(runConfig: RunConfigProperty) {
      cdkBuilder.runConfig(runConfig.let(RunConfigProperty.Companion::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("593ad653374326f03b8fffc50aebd3f75a0ebf23cee869b1d32c4fbc0ab76399")
    override fun runConfig(runConfig: RunConfigProperty.Builder.() -> Unit): Unit =
        runConfig(RunConfigProperty(runConfig))

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
    override fun runtimeVersion(runtimeVersion: String) {
      cdkBuilder.runtimeVersion(runtimeVersion)
    }

    /**
     * A structure that contains information about how often the canary is to run, and when these
     * runs are to stop.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-schedule)
     * @param schedule A structure that contains information about how often the canary is to run,
     * and when these runs are to stop. 
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable.Companion::unwrap))
    }

    /**
     * A structure that contains information about how often the canary is to run, and when these
     * runs are to stop.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-schedule)
     * @param schedule A structure that contains information about how often the canary is to run,
     * and when these runs are to stop. 
     */
    override fun schedule(schedule: ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(ScheduleProperty.Companion::unwrap))
    }

    /**
     * A structure that contains information about how often the canary is to run, and when these
     * runs are to stop.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-schedule)
     * @param schedule A structure that contains information about how often the canary is to run,
     * and when these runs are to stop. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fd52bf09f0ec9f283e051ca56ffb048645d905bc4e602bd1a3c9395b5b79ddb")
    override fun schedule(schedule: ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(ScheduleProperty(schedule))

    /**
     * Specify TRUE to have the canary start making runs immediately after it is created.
     *
     * A canary that you create using CloudFormation can't be used to monitor the CloudFormation
     * stack that creates the canary or to roll back that stack if there is a failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-startcanaryaftercreation)
     * @param startCanaryAfterCreation Specify TRUE to have the canary start making runs immediately
     * after it is created. 
     */
    override fun startCanaryAfterCreation(startCanaryAfterCreation: Boolean) {
      cdkBuilder.startCanaryAfterCreation(startCanaryAfterCreation)
    }

    /**
     * Specify TRUE to have the canary start making runs immediately after it is created.
     *
     * A canary that you create using CloudFormation can't be used to monitor the CloudFormation
     * stack that creates the canary or to roll back that stack if there is a failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-startcanaryaftercreation)
     * @param startCanaryAfterCreation Specify TRUE to have the canary start making runs immediately
     * after it is created. 
     */
    override fun startCanaryAfterCreation(startCanaryAfterCreation: IResolvable) {
      cdkBuilder.startCanaryAfterCreation(startCanaryAfterCreation.let(IResolvable.Companion::unwrap))
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
    override fun successRetentionPeriod(successRetentionPeriod: Number) {
      cdkBuilder.successRetentionPeriod(successRetentionPeriod)
    }

    /**
     * The list of key-value pairs that are associated with the canary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-tags)
     * @param tags The list of key-value pairs that are associated with the canary. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The list of key-value pairs that are associated with the canary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-tags)
     * @param tags The list of key-value pairs that are associated with the canary. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * If this canary performs visual monitoring by comparing screenshots, this structure contains
     * the ID of the canary run to use as the baseline for screenshots, and the coordinates of any
     * parts of the screen to ignore during the visual monitoring comparison.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-visualreference)
     * @param visualReference If this canary performs visual monitoring by comparing screenshots,
     * this structure contains the ID of the canary run to use as the baseline for screenshots, and the
     * coordinates of any parts of the screen to ignore during the visual monitoring comparison. 
     */
    override fun visualReference(visualReference: IResolvable) {
      cdkBuilder.visualReference(visualReference.let(IResolvable.Companion::unwrap))
    }

    /**
     * If this canary performs visual monitoring by comparing screenshots, this structure contains
     * the ID of the canary run to use as the baseline for screenshots, and the coordinates of any
     * parts of the screen to ignore during the visual monitoring comparison.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-visualreference)
     * @param visualReference If this canary performs visual monitoring by comparing screenshots,
     * this structure contains the ID of the canary run to use as the baseline for screenshots, and the
     * coordinates of any parts of the screen to ignore during the visual monitoring comparison. 
     */
    override fun visualReference(visualReference: VisualReferenceProperty) {
      cdkBuilder.visualReference(visualReference.let(VisualReferenceProperty.Companion::unwrap))
    }

    /**
     * If this canary performs visual monitoring by comparing screenshots, this structure contains
     * the ID of the canary run to use as the baseline for screenshots, and the coordinates of any
     * parts of the screen to ignore during the visual monitoring comparison.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-visualreference)
     * @param visualReference If this canary performs visual monitoring by comparing screenshots,
     * this structure contains the ID of the canary run to use as the baseline for screenshots, and the
     * coordinates of any parts of the screen to ignore during the visual monitoring comparison. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bbb4cbb9894123c40e44079dc0cc74d2f61a18097234b42c75576546fef8718")
    override fun visualReference(visualReference: VisualReferenceProperty.Builder.() -> Unit): Unit
        = visualReference(VisualReferenceProperty(visualReference))

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
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable.Companion::unwrap))
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
    override fun vpcConfig(vpcConfig: VPCConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VPCConfigProperty.Companion::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42466e6db317ff4a78574c685c398063fd03f17ed16764eba50d382eca61f3d6")
    override fun vpcConfig(vpcConfig: VPCConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VPCConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.synthetics.CfnCanary = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.synthetics.CfnCanary.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCanary {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCanary(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary): CfnCanary =
        CfnCanary(cdkObject)

    internal fun unwrap(wrapped: CfnCanary): software.amazon.awscdk.services.synthetics.CfnCanary =
        wrapped.cdkObject as software.amazon.awscdk.services.synthetics.CfnCanary
  }

  /**
   * A structure that contains the configuration for canary artifacts, including the
   * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3 .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.synthetics.*;
   * ArtifactConfigProperty artifactConfigProperty = ArtifactConfigProperty.builder()
   * .s3Encryption(S3EncryptionProperty.builder()
   * .encryptionMode("encryptionMode")
   * .kmsKeyArn("kmsKeyArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-artifactconfig.html)
   */
  public interface ArtifactConfigProperty {
    /**
     * A structure that contains the configuration of the encryption-at-rest settings for artifacts
     * that the canary uploads to Amazon S3 .
     *
     * Artifact encryption functionality is available only for canaries that use Synthetics runtime
     * version syn-nodejs-puppeteer-3.3 or later. For more information, see [Encrypting canary
     * artifacts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-artifactconfig.html#cfn-synthetics-canary-artifactconfig-s3encryption)
     */
    public fun s3Encryption(): Any? = unwrap(this).getS3Encryption()

    /**
     * A builder for [ArtifactConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Encryption A structure that contains the configuration of the encryption-at-rest
       * settings for artifacts that the canary uploads to Amazon S3 .
       * Artifact encryption functionality is available only for canaries that use Synthetics
       * runtime version syn-nodejs-puppeteer-3.3 or later. For more information, see [Encrypting
       * canary
       * artifacts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html)
       * .
       */
      public fun s3Encryption(s3Encryption: IResolvable)

      /**
       * @param s3Encryption A structure that contains the configuration of the encryption-at-rest
       * settings for artifacts that the canary uploads to Amazon S3 .
       * Artifact encryption functionality is available only for canaries that use Synthetics
       * runtime version syn-nodejs-puppeteer-3.3 or later. For more information, see [Encrypting
       * canary
       * artifacts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html)
       * .
       */
      public fun s3Encryption(s3Encryption: S3EncryptionProperty)

      /**
       * @param s3Encryption A structure that contains the configuration of the encryption-at-rest
       * settings for artifacts that the canary uploads to Amazon S3 .
       * Artifact encryption functionality is available only for canaries that use Synthetics
       * runtime version syn-nodejs-puppeteer-3.3 or later. For more information, see [Encrypting
       * canary
       * artifacts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c139218594ab3ddb52cd25fe29117d299d2b333cbade9bb9b71aa26d9e27fa73")
      public fun s3Encryption(s3Encryption: S3EncryptionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.synthetics.CfnCanary.ArtifactConfigProperty.Builder =
          software.amazon.awscdk.services.synthetics.CfnCanary.ArtifactConfigProperty.builder()

      /**
       * @param s3Encryption A structure that contains the configuration of the encryption-at-rest
       * settings for artifacts that the canary uploads to Amazon S3 .
       * Artifact encryption functionality is available only for canaries that use Synthetics
       * runtime version syn-nodejs-puppeteer-3.3 or later. For more information, see [Encrypting
       * canary
       * artifacts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html)
       * .
       */
      override fun s3Encryption(s3Encryption: IResolvable) {
        cdkBuilder.s3Encryption(s3Encryption.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3Encryption A structure that contains the configuration of the encryption-at-rest
       * settings for artifacts that the canary uploads to Amazon S3 .
       * Artifact encryption functionality is available only for canaries that use Synthetics
       * runtime version syn-nodejs-puppeteer-3.3 or later. For more information, see [Encrypting
       * canary
       * artifacts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html)
       * .
       */
      override fun s3Encryption(s3Encryption: S3EncryptionProperty) {
        cdkBuilder.s3Encryption(s3Encryption.let(S3EncryptionProperty.Companion::unwrap))
      }

      /**
       * @param s3Encryption A structure that contains the configuration of the encryption-at-rest
       * settings for artifacts that the canary uploads to Amazon S3 .
       * Artifact encryption functionality is available only for canaries that use Synthetics
       * runtime version syn-nodejs-puppeteer-3.3 or later. For more information, see [Encrypting
       * canary
       * artifacts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c139218594ab3ddb52cd25fe29117d299d2b333cbade9bb9b71aa26d9e27fa73")
      override fun s3Encryption(s3Encryption: S3EncryptionProperty.Builder.() -> Unit): Unit =
          s3Encryption(S3EncryptionProperty(s3Encryption))

      public fun build():
          software.amazon.awscdk.services.synthetics.CfnCanary.ArtifactConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.ArtifactConfigProperty,
    ) : CdkObject(cdkObject),
        ArtifactConfigProperty {
      /**
       * A structure that contains the configuration of the encryption-at-rest settings for
       * artifacts that the canary uploads to Amazon S3 .
       *
       * Artifact encryption functionality is available only for canaries that use Synthetics
       * runtime version syn-nodejs-puppeteer-3.3 or later. For more information, see [Encrypting
       * canary
       * artifacts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-artifactconfig.html#cfn-synthetics-canary-artifactconfig-s3encryption)
       */
      override fun s3Encryption(): Any? = unwrap(this).getS3Encryption()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.ArtifactConfigProperty):
          ArtifactConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? ArtifactConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArtifactConfigProperty):
          software.amazon.awscdk.services.synthetics.CfnCanary.ArtifactConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.synthetics.CfnCanary.ArtifactConfigProperty
    }
  }

  /**
   * A structure representing a screenshot that is used as a baseline during visual monitoring
   * comparisons made by the canary.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.synthetics.*;
   * BaseScreenshotProperty baseScreenshotProperty = BaseScreenshotProperty.builder()
   * .screenshotName("screenshotName")
   * // the properties below are optional
   * .ignoreCoordinates(List.of("ignoreCoordinates"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-basescreenshot.html)
   */
  public interface BaseScreenshotProperty {
    /**
     * Coordinates that define the part of a screen to ignore during screenshot comparisons.
     *
     * To obtain the coordinates to use here, use the CloudWatch console to draw the boundaries on
     * the screen. For more information, see [Edit or delete a
     * canary](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-basescreenshot.html#cfn-synthetics-canary-basescreenshot-ignorecoordinates)
     */
    public fun ignoreCoordinates(): List<String> = unwrap(this).getIgnoreCoordinates() ?:
        emptyList()

    /**
     * The name of the screenshot.
     *
     * This is generated the first time the canary is run after the `UpdateCanary` operation that
     * specified for this canary to perform visual monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-basescreenshot.html#cfn-synthetics-canary-basescreenshot-screenshotname)
     */
    public fun screenshotName(): String

    /**
     * A builder for [BaseScreenshotProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ignoreCoordinates Coordinates that define the part of a screen to ignore during
       * screenshot comparisons.
       * To obtain the coordinates to use here, use the CloudWatch console to draw the boundaries on
       * the screen. For more information, see [Edit or delete a
       * canary](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html)
       * .
       */
      public fun ignoreCoordinates(ignoreCoordinates: List<String>)

      /**
       * @param ignoreCoordinates Coordinates that define the part of a screen to ignore during
       * screenshot comparisons.
       * To obtain the coordinates to use here, use the CloudWatch console to draw the boundaries on
       * the screen. For more information, see [Edit or delete a
       * canary](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html)
       * .
       */
      public fun ignoreCoordinates(vararg ignoreCoordinates: String)

      /**
       * @param screenshotName The name of the screenshot. 
       * This is generated the first time the canary is run after the `UpdateCanary` operation that
       * specified for this canary to perform visual monitoring.
       */
      public fun screenshotName(screenshotName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty.Builder =
          software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty.builder()

      /**
       * @param ignoreCoordinates Coordinates that define the part of a screen to ignore during
       * screenshot comparisons.
       * To obtain the coordinates to use here, use the CloudWatch console to draw the boundaries on
       * the screen. For more information, see [Edit or delete a
       * canary](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html)
       * .
       */
      override fun ignoreCoordinates(ignoreCoordinates: List<String>) {
        cdkBuilder.ignoreCoordinates(ignoreCoordinates)
      }

      /**
       * @param ignoreCoordinates Coordinates that define the part of a screen to ignore during
       * screenshot comparisons.
       * To obtain the coordinates to use here, use the CloudWatch console to draw the boundaries on
       * the screen. For more information, see [Edit or delete a
       * canary](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html)
       * .
       */
      override fun ignoreCoordinates(vararg ignoreCoordinates: String): Unit =
          ignoreCoordinates(ignoreCoordinates.toList())

      /**
       * @param screenshotName The name of the screenshot. 
       * This is generated the first time the canary is run after the `UpdateCanary` operation that
       * specified for this canary to perform visual monitoring.
       */
      override fun screenshotName(screenshotName: String) {
        cdkBuilder.screenshotName(screenshotName)
      }

      public fun build():
          software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty,
    ) : CdkObject(cdkObject),
        BaseScreenshotProperty {
      /**
       * Coordinates that define the part of a screen to ignore during screenshot comparisons.
       *
       * To obtain the coordinates to use here, use the CloudWatch console to draw the boundaries on
       * the screen. For more information, see [Edit or delete a
       * canary](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-basescreenshot.html#cfn-synthetics-canary-basescreenshot-ignorecoordinates)
       */
      override fun ignoreCoordinates(): List<String> = unwrap(this).getIgnoreCoordinates() ?:
          emptyList()

      /**
       * The name of the screenshot.
       *
       * This is generated the first time the canary is run after the `UpdateCanary` operation that
       * specified for this canary to perform visual monitoring.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-basescreenshot.html#cfn-synthetics-canary-basescreenshot-screenshotname)
       */
      override fun screenshotName(): String = unwrap(this).getScreenshotName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BaseScreenshotProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty):
          BaseScreenshotProperty = CdkObjectWrappers.wrap(cdkObject) as? BaseScreenshotProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BaseScreenshotProperty):
          software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty
    }
  }

  /**
   * Use this structure to input your script code for the canary.
   *
   * This structure contains the Lambda handler with the location where the canary should start
   * running the script. If the script is stored in an S3 bucket, the bucket name, key, and version are
   * also included. If the script is passed into the canary directly, the script code is contained in
   * the value of `Script` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.synthetics.*;
   * CodeProperty codeProperty = CodeProperty.builder()
   * .handler("handler")
   * // the properties below are optional
   * .s3Bucket("s3Bucket")
   * .s3Key("s3Key")
   * .s3ObjectVersion("s3ObjectVersion")
   * .script("script")
   * .sourceLocationArn("sourceLocationArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html)
   */
  public interface CodeProperty {
    /**
     * The entry point to use for the source code when running the canary.
     *
     * For canaries that use the `syn-python-selenium-1.0` runtime or a `syn-nodejs.puppeteer`
     * runtime earlier than `syn-nodejs.puppeteer-3.4` , the handler must be specified as `*fileName*
     * .handler` . For `syn-python-selenium-1.1` , `syn-nodejs.puppeteer-3.4` , and later runtimes, the
     * handler can be specified as `*fileName* . *functionName*` , or you can specify a folder where
     * canary scripts reside as `*folder* / *fileName* . *functionName*` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-handler)
     */
    public fun handler(): String

    /**
     * If your canary script is located in S3, specify the bucket name here.
     *
     * The bucket must already exist.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3bucket)
     */
    public fun s3Bucket(): String? = unwrap(this).getS3Bucket()

    /**
     * The S3 key of your script.
     *
     * For more information, see [Working with Amazon S3
     * Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3key)
     */
    public fun s3Key(): String? = unwrap(this).getS3Key()

    /**
     * The S3 version ID of your script.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3objectversion)
     */
    public fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()

    /**
     * If you input your canary script directly into the canary instead of referring to an S3
     * location, the value of this parameter is the script in plain text.
     *
     * It can be up to 5 MB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-script)
     */
    public fun script(): String? = unwrap(this).getScript()

    /**
     * The ARN of the Lambda layer where Synthetics stores the canary script code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-sourcelocationarn)
     */
    public fun sourceLocationArn(): String? = unwrap(this).getSourceLocationArn()

    /**
     * A builder for [CodeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param handler The entry point to use for the source code when running the canary. 
       * For canaries that use the `syn-python-selenium-1.0` runtime or a `syn-nodejs.puppeteer`
       * runtime earlier than `syn-nodejs.puppeteer-3.4` , the handler must be specified as `*fileName*
       * .handler` . For `syn-python-selenium-1.1` , `syn-nodejs.puppeteer-3.4` , and later runtimes,
       * the handler can be specified as `*fileName* . *functionName*` , or you can specify a folder
       * where canary scripts reside as `*folder* / *fileName* . *functionName*` .
       */
      public fun handler(handler: String)

      /**
       * @param s3Bucket If your canary script is located in S3, specify the bucket name here.
       * The bucket must already exist.
       */
      public fun s3Bucket(s3Bucket: String)

      /**
       * @param s3Key The S3 key of your script.
       * For more information, see [Working with Amazon S3
       * Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html) .
       */
      public fun s3Key(s3Key: String)

      /**
       * @param s3ObjectVersion The S3 version ID of your script.
       */
      public fun s3ObjectVersion(s3ObjectVersion: String)

      /**
       * @param script If you input your canary script directly into the canary instead of referring
       * to an S3 location, the value of this parameter is the script in plain text.
       * It can be up to 5 MB.
       */
      public fun script(script: String)

      /**
       * @param sourceLocationArn The ARN of the Lambda layer where Synthetics stores the canary
       * script code.
       */
      public fun sourceLocationArn(sourceLocationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty.Builder =
          software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty.builder()

      /**
       * @param handler The entry point to use for the source code when running the canary. 
       * For canaries that use the `syn-python-selenium-1.0` runtime or a `syn-nodejs.puppeteer`
       * runtime earlier than `syn-nodejs.puppeteer-3.4` , the handler must be specified as `*fileName*
       * .handler` . For `syn-python-selenium-1.1` , `syn-nodejs.puppeteer-3.4` , and later runtimes,
       * the handler can be specified as `*fileName* . *functionName*` , or you can specify a folder
       * where canary scripts reside as `*folder* / *fileName* . *functionName*` .
       */
      override fun handler(handler: String) {
        cdkBuilder.handler(handler)
      }

      /**
       * @param s3Bucket If your canary script is located in S3, specify the bucket name here.
       * The bucket must already exist.
       */
      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      /**
       * @param s3Key The S3 key of your script.
       * For more information, see [Working with Amazon S3
       * Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html) .
       */
      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      /**
       * @param s3ObjectVersion The S3 version ID of your script.
       */
      override fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
      }

      /**
       * @param script If you input your canary script directly into the canary instead of referring
       * to an S3 location, the value of this parameter is the script in plain text.
       * It can be up to 5 MB.
       */
      override fun script(script: String) {
        cdkBuilder.script(script)
      }

      /**
       * @param sourceLocationArn The ARN of the Lambda layer where Synthetics stores the canary
       * script code.
       */
      override fun sourceLocationArn(sourceLocationArn: String) {
        cdkBuilder.sourceLocationArn(sourceLocationArn)
      }

      public fun build(): software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty,
    ) : CdkObject(cdkObject),
        CodeProperty {
      /**
       * The entry point to use for the source code when running the canary.
       *
       * For canaries that use the `syn-python-selenium-1.0` runtime or a `syn-nodejs.puppeteer`
       * runtime earlier than `syn-nodejs.puppeteer-3.4` , the handler must be specified as `*fileName*
       * .handler` . For `syn-python-selenium-1.1` , `syn-nodejs.puppeteer-3.4` , and later runtimes,
       * the handler can be specified as `*fileName* . *functionName*` , or you can specify a folder
       * where canary scripts reside as `*folder* / *fileName* . *functionName*` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-handler)
       */
      override fun handler(): String = unwrap(this).getHandler()

      /**
       * If your canary script is located in S3, specify the bucket name here.
       *
       * The bucket must already exist.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3bucket)
       */
      override fun s3Bucket(): String? = unwrap(this).getS3Bucket()

      /**
       * The S3 key of your script.
       *
       * For more information, see [Working with Amazon S3
       * Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3key)
       */
      override fun s3Key(): String? = unwrap(this).getS3Key()

      /**
       * The S3 version ID of your script.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-s3objectversion)
       */
      override fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()

      /**
       * If you input your canary script directly into the canary instead of referring to an S3
       * location, the value of this parameter is the script in plain text.
       *
       * It can be up to 5 MB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-script)
       */
      override fun script(): String? = unwrap(this).getScript()

      /**
       * The ARN of the Lambda layer where Synthetics stores the canary script code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-code.html#cfn-synthetics-canary-code-sourcelocationarn)
       */
      override fun sourceLocationArn(): String? = unwrap(this).getSourceLocationArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty):
          CodeProperty = CdkObjectWrappers.wrap(cdkObject) as? CodeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeProperty):
          software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty
    }
  }

  /**
   * A structure that contains input information for a canary run.
   *
   * This structure is required.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.synthetics.*;
   * RunConfigProperty runConfigProperty = RunConfigProperty.builder()
   * .activeTracing(false)
   * .environmentVariables(Map.of(
   * "environmentVariablesKey", "environmentVariables"))
   * .memoryInMb(123)
   * .timeoutInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html)
   */
  public interface RunConfigProperty {
    /**
     * Specifies whether this canary is to use active AWS X-Ray tracing when it runs.
     *
     * Active tracing enables this canary run to be displayed in the ServiceLens and X-Ray service
     * maps even if the canary does not hit an endpoint that has X-Ray tracing enabled. Using X-Ray
     * tracing incurs charges. For more information, see [Canaries and X-Ray
     * tracing](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html)
     * .
     *
     * You can enable active tracing only for canaries that use version `syn-nodejs-2.0` or later
     * for their canary runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html#cfn-synthetics-canary-runconfig-activetracing)
     */
    public fun activeTracing(): Any? = unwrap(this).getActiveTracing()

    /**
     * Specifies the keys and values to use for any environment variables used in the canary script.
     *
     * Use the following format:
     *
     * { "key1" : "value1", "key2" : "value2", ...}
     *
     * Keys must start with a letter and be at least two characters. The total size of your
     * environment variables cannot exceed 4 KB. You can't specify any Lambda reserved environment
     * variables as the keys for your environment variables. For more information about reserved keys,
     * see [Runtime environment
     * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-runtime)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html#cfn-synthetics-canary-runconfig-environmentvariables)
     */
    public fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

    /**
     * The maximum amount of memory that the canary can use while running.
     *
     * This value must be a multiple of 64. The range is 960 to 3008.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html#cfn-synthetics-canary-runconfig-memoryinmb)
     */
    public fun memoryInMb(): Number? = unwrap(this).getMemoryInMb()

    /**
     * How long the canary is allowed to run before it must stop.
     *
     * You can't set this time to be longer than the frequency of the runs of this canary.
     *
     * If you omit this field, the frequency of the canary is used as this value, up to a maximum of
     * 900 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html#cfn-synthetics-canary-runconfig-timeoutinseconds)
     */
    public fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

    /**
     * A builder for [RunConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param activeTracing Specifies whether this canary is to use active AWS X-Ray tracing when
       * it runs.
       * Active tracing enables this canary run to be displayed in the ServiceLens and X-Ray service
       * maps even if the canary does not hit an endpoint that has X-Ray tracing enabled. Using X-Ray
       * tracing incurs charges. For more information, see [Canaries and X-Ray
       * tracing](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html)
       * .
       *
       * You can enable active tracing only for canaries that use version `syn-nodejs-2.0` or later
       * for their canary runtime.
       */
      public fun activeTracing(activeTracing: Boolean)

      /**
       * @param activeTracing Specifies whether this canary is to use active AWS X-Ray tracing when
       * it runs.
       * Active tracing enables this canary run to be displayed in the ServiceLens and X-Ray service
       * maps even if the canary does not hit an endpoint that has X-Ray tracing enabled. Using X-Ray
       * tracing incurs charges. For more information, see [Canaries and X-Ray
       * tracing](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html)
       * .
       *
       * You can enable active tracing only for canaries that use version `syn-nodejs-2.0` or later
       * for their canary runtime.
       */
      public fun activeTracing(activeTracing: IResolvable)

      /**
       * @param environmentVariables Specifies the keys and values to use for any environment
       * variables used in the canary script.
       * Use the following format:
       *
       * { "key1" : "value1", "key2" : "value2", ...}
       *
       * Keys must start with a letter and be at least two characters. The total size of your
       * environment variables cannot exceed 4 KB. You can't specify any Lambda reserved environment
       * variables as the keys for your environment variables. For more information about reserved
       * keys, see [Runtime environment
       * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-runtime)
       * .
       */
      public fun environmentVariables(environmentVariables: IResolvable)

      /**
       * @param environmentVariables Specifies the keys and values to use for any environment
       * variables used in the canary script.
       * Use the following format:
       *
       * { "key1" : "value1", "key2" : "value2", ...}
       *
       * Keys must start with a letter and be at least two characters. The total size of your
       * environment variables cannot exceed 4 KB. You can't specify any Lambda reserved environment
       * variables as the keys for your environment variables. For more information about reserved
       * keys, see [Runtime environment
       * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-runtime)
       * .
       */
      public fun environmentVariables(environmentVariables: Map<String, String>)

      /**
       * @param memoryInMb The maximum amount of memory that the canary can use while running.
       * This value must be a multiple of 64. The range is 960 to 3008.
       */
      public fun memoryInMb(memoryInMb: Number)

      /**
       * @param timeoutInSeconds How long the canary is allowed to run before it must stop.
       * You can't set this time to be longer than the frequency of the runs of this canary.
       *
       * If you omit this field, the frequency of the canary is used as this value, up to a maximum
       * of 900 seconds.
       */
      public fun timeoutInSeconds(timeoutInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty.Builder =
          software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty.builder()

      /**
       * @param activeTracing Specifies whether this canary is to use active AWS X-Ray tracing when
       * it runs.
       * Active tracing enables this canary run to be displayed in the ServiceLens and X-Ray service
       * maps even if the canary does not hit an endpoint that has X-Ray tracing enabled. Using X-Ray
       * tracing incurs charges. For more information, see [Canaries and X-Ray
       * tracing](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html)
       * .
       *
       * You can enable active tracing only for canaries that use version `syn-nodejs-2.0` or later
       * for their canary runtime.
       */
      override fun activeTracing(activeTracing: Boolean) {
        cdkBuilder.activeTracing(activeTracing)
      }

      /**
       * @param activeTracing Specifies whether this canary is to use active AWS X-Ray tracing when
       * it runs.
       * Active tracing enables this canary run to be displayed in the ServiceLens and X-Ray service
       * maps even if the canary does not hit an endpoint that has X-Ray tracing enabled. Using X-Ray
       * tracing incurs charges. For more information, see [Canaries and X-Ray
       * tracing](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html)
       * .
       *
       * You can enable active tracing only for canaries that use version `syn-nodejs-2.0` or later
       * for their canary runtime.
       */
      override fun activeTracing(activeTracing: IResolvable) {
        cdkBuilder.activeTracing(activeTracing.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param environmentVariables Specifies the keys and values to use for any environment
       * variables used in the canary script.
       * Use the following format:
       *
       * { "key1" : "value1", "key2" : "value2", ...}
       *
       * Keys must start with a letter and be at least two characters. The total size of your
       * environment variables cannot exceed 4 KB. You can't specify any Lambda reserved environment
       * variables as the keys for your environment variables. For more information about reserved
       * keys, see [Runtime environment
       * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-runtime)
       * .
       */
      override fun environmentVariables(environmentVariables: IResolvable) {
        cdkBuilder.environmentVariables(environmentVariables.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param environmentVariables Specifies the keys and values to use for any environment
       * variables used in the canary script.
       * Use the following format:
       *
       * { "key1" : "value1", "key2" : "value2", ...}
       *
       * Keys must start with a letter and be at least two characters. The total size of your
       * environment variables cannot exceed 4 KB. You can't specify any Lambda reserved environment
       * variables as the keys for your environment variables. For more information about reserved
       * keys, see [Runtime environment
       * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-runtime)
       * .
       */
      override fun environmentVariables(environmentVariables: Map<String, String>) {
        cdkBuilder.environmentVariables(environmentVariables)
      }

      /**
       * @param memoryInMb The maximum amount of memory that the canary can use while running.
       * This value must be a multiple of 64. The range is 960 to 3008.
       */
      override fun memoryInMb(memoryInMb: Number) {
        cdkBuilder.memoryInMb(memoryInMb)
      }

      /**
       * @param timeoutInSeconds How long the canary is allowed to run before it must stop.
       * You can't set this time to be longer than the frequency of the runs of this canary.
       *
       * If you omit this field, the frequency of the canary is used as this value, up to a maximum
       * of 900 seconds.
       */
      override fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
      }

      public fun build(): software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty,
    ) : CdkObject(cdkObject),
        RunConfigProperty {
      /**
       * Specifies whether this canary is to use active AWS X-Ray tracing when it runs.
       *
       * Active tracing enables this canary run to be displayed in the ServiceLens and X-Ray service
       * maps even if the canary does not hit an endpoint that has X-Ray tracing enabled. Using X-Ray
       * tracing incurs charges. For more information, see [Canaries and X-Ray
       * tracing](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html)
       * .
       *
       * You can enable active tracing only for canaries that use version `syn-nodejs-2.0` or later
       * for their canary runtime.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html#cfn-synthetics-canary-runconfig-activetracing)
       */
      override fun activeTracing(): Any? = unwrap(this).getActiveTracing()

      /**
       * Specifies the keys and values to use for any environment variables used in the canary
       * script.
       *
       * Use the following format:
       *
       * { "key1" : "value1", "key2" : "value2", ...}
       *
       * Keys must start with a letter and be at least two characters. The total size of your
       * environment variables cannot exceed 4 KB. You can't specify any Lambda reserved environment
       * variables as the keys for your environment variables. For more information about reserved
       * keys, see [Runtime environment
       * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-runtime)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html#cfn-synthetics-canary-runconfig-environmentvariables)
       */
      override fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

      /**
       * The maximum amount of memory that the canary can use while running.
       *
       * This value must be a multiple of 64. The range is 960 to 3008.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html#cfn-synthetics-canary-runconfig-memoryinmb)
       */
      override fun memoryInMb(): Number? = unwrap(this).getMemoryInMb()

      /**
       * How long the canary is allowed to run before it must stop.
       *
       * You can't set this time to be longer than the frequency of the runs of this canary.
       *
       * If you omit this field, the frequency of the canary is used as this value, up to a maximum
       * of 900 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html#cfn-synthetics-canary-runconfig-timeoutinseconds)
       */
      override fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RunConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty):
          RunConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? RunConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RunConfigProperty):
          software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty
    }
  }

  /**
   * A structure that contains the configuration of the encryption-at-rest settings for artifacts
   * that the canary uploads to Amazon S3 .
   *
   * Artifact encryption functionality is available only for canaries that use Synthetics runtime
   * version syn-nodejs-puppeteer-3.3 or later. For more information, see [Encrypting canary
   * artifacts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.synthetics.*;
   * S3EncryptionProperty s3EncryptionProperty = S3EncryptionProperty.builder()
   * .encryptionMode("encryptionMode")
   * .kmsKeyArn("kmsKeyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-s3encryption.html)
   */
  public interface S3EncryptionProperty {
    /**
     * The encryption method to use for artifacts created by this canary.
     *
     * Specify `SSE_S3` to use server-side encryption (SSE) with an Amazon S3-managed key. Specify
     * `SSE-KMS` to use server-side encryption with a customer-managed AWS KMS key.
     *
     * If you omit this parameter, an AWS -managed AWS KMS key is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-s3encryption.html#cfn-synthetics-canary-s3encryption-encryptionmode)
     */
    public fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

    /**
     * The ARN of the customer-managed AWS KMS key to use, if you specify `SSE-KMS` for
     * `EncryptionMode`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-s3encryption.html#cfn-synthetics-canary-s3encryption-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * A builder for [S3EncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionMode The encryption method to use for artifacts created by this canary.
       * Specify `SSE_S3` to use server-side encryption (SSE) with an Amazon S3-managed key. Specify
       * `SSE-KMS` to use server-side encryption with a customer-managed AWS KMS key.
       *
       * If you omit this parameter, an AWS -managed AWS KMS key is used.
       */
      public fun encryptionMode(encryptionMode: String)

      /**
       * @param kmsKeyArn The ARN of the customer-managed AWS KMS key to use, if you specify
       * `SSE-KMS` for `EncryptionMode`.
       */
      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.synthetics.CfnCanary.S3EncryptionProperty.Builder =
          software.amazon.awscdk.services.synthetics.CfnCanary.S3EncryptionProperty.builder()

      /**
       * @param encryptionMode The encryption method to use for artifacts created by this canary.
       * Specify `SSE_S3` to use server-side encryption (SSE) with an Amazon S3-managed key. Specify
       * `SSE-KMS` to use server-side encryption with a customer-managed AWS KMS key.
       *
       * If you omit this parameter, an AWS -managed AWS KMS key is used.
       */
      override fun encryptionMode(encryptionMode: String) {
        cdkBuilder.encryptionMode(encryptionMode)
      }

      /**
       * @param kmsKeyArn The ARN of the customer-managed AWS KMS key to use, if you specify
       * `SSE-KMS` for `EncryptionMode`.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build(): software.amazon.awscdk.services.synthetics.CfnCanary.S3EncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.S3EncryptionProperty,
    ) : CdkObject(cdkObject),
        S3EncryptionProperty {
      /**
       * The encryption method to use for artifacts created by this canary.
       *
       * Specify `SSE_S3` to use server-side encryption (SSE) with an Amazon S3-managed key. Specify
       * `SSE-KMS` to use server-side encryption with a customer-managed AWS KMS key.
       *
       * If you omit this parameter, an AWS -managed AWS KMS key is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-s3encryption.html#cfn-synthetics-canary-s3encryption-encryptionmode)
       */
      override fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

      /**
       * The ARN of the customer-managed AWS KMS key to use, if you specify `SSE-KMS` for
       * `EncryptionMode`.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-s3encryption.html#cfn-synthetics-canary-s3encryption-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3EncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.S3EncryptionProperty):
          S3EncryptionProperty = CdkObjectWrappers.wrap(cdkObject) as? S3EncryptionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3EncryptionProperty):
          software.amazon.awscdk.services.synthetics.CfnCanary.S3EncryptionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.synthetics.CfnCanary.S3EncryptionProperty
    }
  }

  /**
   * This structure specifies how often a canary is to make runs and the date and time when it
   * should stop making runs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.synthetics.*;
   * ScheduleProperty scheduleProperty = ScheduleProperty.builder()
   * .expression("expression")
   * // the properties below are optional
   * .durationInSeconds("durationInSeconds")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-schedule.html)
   */
  public interface ScheduleProperty {
    /**
     * How long, in seconds, for the canary to continue making regular runs according to the
     * schedule in the `Expression` value.
     *
     * If you specify 0, the canary continues making runs until you stop it. If you omit this field,
     * the default of 0 is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-schedule.html#cfn-synthetics-canary-schedule-durationinseconds)
     */
    public fun durationInSeconds(): String? = unwrap(this).getDurationInSeconds()

    /**
     * A `rate` expression or a `cron` expression that defines how often the canary is to run.
     *
     * For a rate expression, The syntax is `rate( *number unit* )` . *unit* can be `minute` ,
     * `minutes` , or `hour` .
     *
     * For example, `rate(1 minute)` runs the canary once a minute, `rate(10 minutes)` runs it once
     * every 10 minutes, and `rate(1 hour)` runs it once every hour. You can specify a frequency
     * between `rate(1 minute)` and `rate(1 hour)` .
     *
     * Specifying `rate(0 minute)` or `rate(0 hour)` is a special value that causes the canary to
     * run only once when it is started.
     *
     * Use `cron( *expression* )` to specify a cron expression. You can't schedule a canary to wait
     * for more than a year before running. For information about the syntax for cron expressions, see
     * [Scheduling canary runs using
     * cron](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_cron.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-schedule.html#cfn-synthetics-canary-schedule-expression)
     */
    public fun expression(): String

    /**
     * A builder for [ScheduleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param durationInSeconds How long, in seconds, for the canary to continue making regular
       * runs according to the schedule in the `Expression` value.
       * If you specify 0, the canary continues making runs until you stop it. If you omit this
       * field, the default of 0 is used.
       */
      public fun durationInSeconds(durationInSeconds: String)

      /**
       * @param expression A `rate` expression or a `cron` expression that defines how often the
       * canary is to run. 
       * For a rate expression, The syntax is `rate( *number unit* )` . *unit* can be `minute` ,
       * `minutes` , or `hour` .
       *
       * For example, `rate(1 minute)` runs the canary once a minute, `rate(10 minutes)` runs it
       * once every 10 minutes, and `rate(1 hour)` runs it once every hour. You can specify a frequency
       * between `rate(1 minute)` and `rate(1 hour)` .
       *
       * Specifying `rate(0 minute)` or `rate(0 hour)` is a special value that causes the canary to
       * run only once when it is started.
       *
       * Use `cron( *expression* )` to specify a cron expression. You can't schedule a canary to
       * wait for more than a year before running. For information about the syntax for cron
       * expressions, see [Scheduling canary runs using
       * cron](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_cron.html)
       * .
       */
      public fun expression(expression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty.Builder =
          software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty.builder()

      /**
       * @param durationInSeconds How long, in seconds, for the canary to continue making regular
       * runs according to the schedule in the `Expression` value.
       * If you specify 0, the canary continues making runs until you stop it. If you omit this
       * field, the default of 0 is used.
       */
      override fun durationInSeconds(durationInSeconds: String) {
        cdkBuilder.durationInSeconds(durationInSeconds)
      }

      /**
       * @param expression A `rate` expression or a `cron` expression that defines how often the
       * canary is to run. 
       * For a rate expression, The syntax is `rate( *number unit* )` . *unit* can be `minute` ,
       * `minutes` , or `hour` .
       *
       * For example, `rate(1 minute)` runs the canary once a minute, `rate(10 minutes)` runs it
       * once every 10 minutes, and `rate(1 hour)` runs it once every hour. You can specify a frequency
       * between `rate(1 minute)` and `rate(1 hour)` .
       *
       * Specifying `rate(0 minute)` or `rate(0 hour)` is a special value that causes the canary to
       * run only once when it is started.
       *
       * Use `cron( *expression* )` to specify a cron expression. You can't schedule a canary to
       * wait for more than a year before running. For information about the syntax for cron
       * expressions, see [Scheduling canary runs using
       * cron](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_cron.html)
       * .
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      public fun build(): software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty,
    ) : CdkObject(cdkObject),
        ScheduleProperty {
      /**
       * How long, in seconds, for the canary to continue making regular runs according to the
       * schedule in the `Expression` value.
       *
       * If you specify 0, the canary continues making runs until you stop it. If you omit this
       * field, the default of 0 is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-schedule.html#cfn-synthetics-canary-schedule-durationinseconds)
       */
      override fun durationInSeconds(): String? = unwrap(this).getDurationInSeconds()

      /**
       * A `rate` expression or a `cron` expression that defines how often the canary is to run.
       *
       * For a rate expression, The syntax is `rate( *number unit* )` . *unit* can be `minute` ,
       * `minutes` , or `hour` .
       *
       * For example, `rate(1 minute)` runs the canary once a minute, `rate(10 minutes)` runs it
       * once every 10 minutes, and `rate(1 hour)` runs it once every hour. You can specify a frequency
       * between `rate(1 minute)` and `rate(1 hour)` .
       *
       * Specifying `rate(0 minute)` or `rate(0 hour)` is a special value that causes the canary to
       * run only once when it is started.
       *
       * Use `cron( *expression* )` to specify a cron expression. You can't schedule a canary to
       * wait for more than a year before running. For information about the syntax for cron
       * expressions, see [Scheduling canary runs using
       * cron](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_cron.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-schedule.html#cfn-synthetics-canary-schedule-expression)
       */
      override fun expression(): String = unwrap(this).getExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty):
          ScheduleProperty = CdkObjectWrappers.wrap(cdkObject) as? ScheduleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleProperty):
          software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty
    }
  }

  /**
   * If this canary is to test an endpoint in a VPC, this structure contains information about the
   * subnet and security groups of the VPC endpoint.
   *
   * For more information, see [Running a Canary in a
   * VPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.synthetics.*;
   * VPCConfigProperty vPCConfigProperty = VPCConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * // the properties below are optional
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-vpcconfig.html)
   */
  public interface VPCConfigProperty {
    /**
     * The IDs of the security groups for this canary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-vpcconfig.html#cfn-synthetics-canary-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * The IDs of the subnets where this canary is to run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-vpcconfig.html#cfn-synthetics-canary-vpcconfig-subnetids)
     */
    public fun subnetIds(): List<String>

    /**
     * The ID of the VPC where this canary is to run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-vpcconfig.html#cfn-synthetics-canary-vpcconfig-vpcid)
     */
    public fun vpcId(): String? = unwrap(this).getVpcId()

    /**
     * A builder for [VPCConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The IDs of the security groups for this canary. 
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The IDs of the security groups for this canary. 
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds The IDs of the subnets where this canary is to run. 
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds The IDs of the subnets where this canary is to run. 
       */
      public fun subnetIds(vararg subnetIds: String)

      /**
       * @param vpcId The ID of the VPC where this canary is to run.
       */
      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty.Builder =
          software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty.builder()

      /**
       * @param securityGroupIds The IDs of the security groups for this canary. 
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The IDs of the security groups for this canary. 
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds The IDs of the subnets where this canary is to run. 
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds The IDs of the subnets where this canary is to run. 
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      /**
       * @param vpcId The ID of the VPC where this canary is to run.
       */
      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build(): software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty,
    ) : CdkObject(cdkObject),
        VPCConfigProperty {
      /**
       * The IDs of the security groups for this canary.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-vpcconfig.html#cfn-synthetics-canary-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * The IDs of the subnets where this canary is to run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-vpcconfig.html#cfn-synthetics-canary-vpcconfig-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

      /**
       * The ID of the VPC where this canary is to run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-vpcconfig.html#cfn-synthetics-canary-vpcconfig-vpcid)
       */
      override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VPCConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty):
          VPCConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? VPCConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VPCConfigProperty):
          software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty
    }
  }

  /**
   * Defines the screenshots to use as the baseline for comparisons during visual monitoring
   * comparisons during future runs of this canary.
   *
   * If you omit this parameter, no changes are made to any baseline screenshots that the canary
   * might be using already.
   *
   * Visual monitoring is supported only on canaries running the *syn-puppeteer-node-3.2* runtime or
   * later. For more information, see [Visual
   * monitoring](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Library_SyntheticsLogger_VisualTesting.html)
   * and [Visual monitoring
   * blueprint](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Blueprints_VisualTesting.html)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.synthetics.*;
   * VisualReferenceProperty visualReferenceProperty = VisualReferenceProperty.builder()
   * .baseCanaryRunId("baseCanaryRunId")
   * // the properties below are optional
   * .baseScreenshots(List.of(BaseScreenshotProperty.builder()
   * .screenshotName("screenshotName")
   * // the properties below are optional
   * .ignoreCoordinates(List.of("ignoreCoordinates"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-visualreference.html)
   */
  public interface VisualReferenceProperty {
    /**
     * Specifies which canary run to use the screenshots from as the baseline for future visual
     * monitoring with this canary.
     *
     * Valid values are `nextrun` to use the screenshots from the next run after this update is
     * made, `lastrun` to use the screenshots from the most recent run before this update was made, or
     * the value of `Id` in the
     * [CanaryRun](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CanaryRun.html)
     * from any past run of this canary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-visualreference.html#cfn-synthetics-canary-visualreference-basecanaryrunid)
     */
    public fun baseCanaryRunId(): String

    /**
     * An array of screenshots that are used as the baseline for comparisons during visual
     * monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-visualreference.html#cfn-synthetics-canary-visualreference-basescreenshots)
     */
    public fun baseScreenshots(): Any? = unwrap(this).getBaseScreenshots()

    /**
     * A builder for [VisualReferenceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param baseCanaryRunId Specifies which canary run to use the screenshots from as the
       * baseline for future visual monitoring with this canary. 
       * Valid values are `nextrun` to use the screenshots from the next run after this update is
       * made, `lastrun` to use the screenshots from the most recent run before this update was made,
       * or the value of `Id` in the
       * [CanaryRun](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CanaryRun.html)
       * from any past run of this canary.
       */
      public fun baseCanaryRunId(baseCanaryRunId: String)

      /**
       * @param baseScreenshots An array of screenshots that are used as the baseline for
       * comparisons during visual monitoring.
       */
      public fun baseScreenshots(baseScreenshots: IResolvable)

      /**
       * @param baseScreenshots An array of screenshots that are used as the baseline for
       * comparisons during visual monitoring.
       */
      public fun baseScreenshots(baseScreenshots: List<Any>)

      /**
       * @param baseScreenshots An array of screenshots that are used as the baseline for
       * comparisons during visual monitoring.
       */
      public fun baseScreenshots(vararg baseScreenshots: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty.Builder =
          software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty.builder()

      /**
       * @param baseCanaryRunId Specifies which canary run to use the screenshots from as the
       * baseline for future visual monitoring with this canary. 
       * Valid values are `nextrun` to use the screenshots from the next run after this update is
       * made, `lastrun` to use the screenshots from the most recent run before this update was made,
       * or the value of `Id` in the
       * [CanaryRun](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CanaryRun.html)
       * from any past run of this canary.
       */
      override fun baseCanaryRunId(baseCanaryRunId: String) {
        cdkBuilder.baseCanaryRunId(baseCanaryRunId)
      }

      /**
       * @param baseScreenshots An array of screenshots that are used as the baseline for
       * comparisons during visual monitoring.
       */
      override fun baseScreenshots(baseScreenshots: IResolvable) {
        cdkBuilder.baseScreenshots(baseScreenshots.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param baseScreenshots An array of screenshots that are used as the baseline for
       * comparisons during visual monitoring.
       */
      override fun baseScreenshots(baseScreenshots: List<Any>) {
        cdkBuilder.baseScreenshots(baseScreenshots.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param baseScreenshots An array of screenshots that are used as the baseline for
       * comparisons during visual monitoring.
       */
      override fun baseScreenshots(vararg baseScreenshots: Any): Unit =
          baseScreenshots(baseScreenshots.toList())

      public fun build():
          software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty,
    ) : CdkObject(cdkObject),
        VisualReferenceProperty {
      /**
       * Specifies which canary run to use the screenshots from as the baseline for future visual
       * monitoring with this canary.
       *
       * Valid values are `nextrun` to use the screenshots from the next run after this update is
       * made, `lastrun` to use the screenshots from the most recent run before this update was made,
       * or the value of `Id` in the
       * [CanaryRun](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CanaryRun.html)
       * from any past run of this canary.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-visualreference.html#cfn-synthetics-canary-visualreference-basecanaryrunid)
       */
      override fun baseCanaryRunId(): String = unwrap(this).getBaseCanaryRunId()

      /**
       * An array of screenshots that are used as the baseline for comparisons during visual
       * monitoring.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-visualreference.html#cfn-synthetics-canary-visualreference-basescreenshots)
       */
      override fun baseScreenshots(): Any? = unwrap(this).getBaseScreenshots()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VisualReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty):
          VisualReferenceProperty = CdkObjectWrappers.wrap(cdkObject) as? VisualReferenceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VisualReferenceProperty):
          software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty
    }
  }
}
