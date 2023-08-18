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

package io.cloudshiftdev.awscdkdsl.services.synthetics

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
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
import software.amazon.awscdk.services.synthetics.CfnCanaryProps

/**
 * Properties for defining a `CfnCanary`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.synthetics.*;
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
@CdkDslMarker
public class CfnCanaryPropsDsl {
    private val cdkBuilder: CfnCanaryProps.Builder = CfnCanaryProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param artifactConfig A structure that contains the configuration for canary artifacts,
     *   including the encryption-at-rest settings for artifacts that the canary uploads to Amazon
     *   S3.
     */
    public fun artifactConfig(artifactConfig: IResolvable) {
        cdkBuilder.artifactConfig(artifactConfig)
    }

    /**
     * @param artifactConfig A structure that contains the configuration for canary artifacts,
     *   including the encryption-at-rest settings for artifacts that the canary uploads to Amazon
     *   S3.
     */
    public fun artifactConfig(artifactConfig: CfnCanary.ArtifactConfigProperty) {
        cdkBuilder.artifactConfig(artifactConfig)
    }

    /**
     * @param artifactS3Location The location in Amazon S3 where Synthetics stores artifacts from
     *   the runs of this canary. Artifacts include the log file, screenshots, and HAR files.
     *   Specify the full location path, including `s3://` at the beginning of the path.
     */
    public fun artifactS3Location(artifactS3Location: String) {
        cdkBuilder.artifactS3Location(artifactS3Location)
    }

    /**
     * @param code Use this structure to input your script code for the canary. This structure
     *   contains the Lambda handler with the location where the canary should start running the
     *   script. If the script is stored in an S3 bucket, the bucket name, key, and version are also
     *   included. If the script is passed into the canary directly, the script code is contained in
     *   the value of `Script` .
     */
    public fun code(code: IResolvable) {
        cdkBuilder.code(code)
    }

    /**
     * @param code Use this structure to input your script code for the canary. This structure
     *   contains the Lambda handler with the location where the canary should start running the
     *   script. If the script is stored in an S3 bucket, the bucket name, key, and version are also
     *   included. If the script is passed into the canary directly, the script code is contained in
     *   the value of `Script` .
     */
    public fun code(code: CfnCanary.CodeProperty) {
        cdkBuilder.code(code)
    }

    /**
     * @param deleteLambdaResourcesOnCanaryDeletion Deletes associated lambda resources created by
     *   Synthetics if set to True. Default is False
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun deleteLambdaResourcesOnCanaryDeletion(
        deleteLambdaResourcesOnCanaryDeletion: Boolean
    ) {
        cdkBuilder.deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion)
    }

    /**
     * @param deleteLambdaResourcesOnCanaryDeletion Deletes associated lambda resources created by
     *   Synthetics if set to True. Default is False
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun deleteLambdaResourcesOnCanaryDeletion(
        deleteLambdaResourcesOnCanaryDeletion: IResolvable
    ) {
        cdkBuilder.deleteLambdaResourcesOnCanaryDeletion(deleteLambdaResourcesOnCanaryDeletion)
    }

    /**
     * @param executionRoleArn The ARN of the IAM role to be used to run the canary. This role must
     *   already exist, and must include `lambda.amazonaws.com` as a principal in the trust policy.
     *   The role must also have the following permissions:
     * * `s3:PutObject`
     * * `s3:GetBucketLocation`
     * * `s3:ListAllMyBuckets`
     * * `cloudwatch:PutMetricData`
     * * `logs:CreateLogGroup`
     * * `logs:CreateLogStream`
     * * `logs:PutLogEvents`
     */
    public fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * @param failureRetentionPeriod The number of days to retain data about failed runs of this
     *   canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455
     *   days.
     */
    public fun failureRetentionPeriod(failureRetentionPeriod: Number) {
        cdkBuilder.failureRetentionPeriod(failureRetentionPeriod)
    }

    /**
     * @param name The name for this canary. Be sure to give it a descriptive name that
     *   distinguishes it from other canaries in your account.
     *
     * Do not include secrets or proprietary information in your canary names. The canary name makes
     * up part of the canary ARN, and the ARN is included in outbound calls over the internet. For
     * more information, see
     * [Security Considerations for Synthetics Canaries](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html)
     * .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param runConfig A structure that contains input information for a canary run. If you omit
     *   this structure, the frequency of the canary is used as canary's timeout value, up to a
     *   maximum of 900 seconds.
     */
    public fun runConfig(runConfig: IResolvable) {
        cdkBuilder.runConfig(runConfig)
    }

    /**
     * @param runConfig A structure that contains input information for a canary run. If you omit
     *   this structure, the frequency of the canary is used as canary's timeout value, up to a
     *   maximum of 900 seconds.
     */
    public fun runConfig(runConfig: CfnCanary.RunConfigProperty) {
        cdkBuilder.runConfig(runConfig)
    }

    /**
     * @param runtimeVersion Specifies the runtime version to use for the canary. For more
     *   information about runtime versions, see
     *   [Canary Runtime Versions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html)
     *   .
     */
    public fun runtimeVersion(runtimeVersion: String) {
        cdkBuilder.runtimeVersion(runtimeVersion)
    }

    /**
     * @param schedule A structure that contains information about how often the canary is to run,
     *   and when these runs are to stop.
     */
    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * @param schedule A structure that contains information about how often the canary is to run,
     *   and when these runs are to stop.
     */
    public fun schedule(schedule: CfnCanary.ScheduleProperty) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * @param startCanaryAfterCreation Specify TRUE to have the canary start making runs immediately
     *   after it is created. A canary that you create using CloudFormation can't be used to monitor
     *   the CloudFormation stack that creates the canary or to roll back that stack if there is a
     *   failure.
     */
    public fun startCanaryAfterCreation(startCanaryAfterCreation: Boolean) {
        cdkBuilder.startCanaryAfterCreation(startCanaryAfterCreation)
    }

    /**
     * @param startCanaryAfterCreation Specify TRUE to have the canary start making runs immediately
     *   after it is created. A canary that you create using CloudFormation can't be used to monitor
     *   the CloudFormation stack that creates the canary or to roll back that stack if there is a
     *   failure.
     */
    public fun startCanaryAfterCreation(startCanaryAfterCreation: IResolvable) {
        cdkBuilder.startCanaryAfterCreation(startCanaryAfterCreation)
    }

    /**
     * @param successRetentionPeriod The number of days to retain data about successful runs of this
     *   canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455
     *   days.
     */
    public fun successRetentionPeriod(successRetentionPeriod: Number) {
        cdkBuilder.successRetentionPeriod(successRetentionPeriod)
    }

    /** @param tags The list of key-value pairs that are associated with the canary. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The list of key-value pairs that are associated with the canary. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param visualReference If this canary performs visual monitoring by comparing screenshots,
     *   this structure contains the ID of the canary run to use as the baseline for screenshots,
     *   and the coordinates of any parts of the screen to ignore during the visual monitoring
     *   comparison.
     */
    public fun visualReference(visualReference: IResolvable) {
        cdkBuilder.visualReference(visualReference)
    }

    /**
     * @param visualReference If this canary performs visual monitoring by comparing screenshots,
     *   this structure contains the ID of the canary run to use as the baseline for screenshots,
     *   and the coordinates of any parts of the screen to ignore during the visual monitoring
     *   comparison.
     */
    public fun visualReference(visualReference: CfnCanary.VisualReferenceProperty) {
        cdkBuilder.visualReference(visualReference)
    }

    /**
     * @param vpcConfig If this canary is to test an endpoint in a VPC, this structure contains
     *   information about the subnet and security groups of the VPC endpoint. For more information,
     *   see
     *   [Running a Canary in a VPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html)
     *   .
     */
    public fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    /**
     * @param vpcConfig If this canary is to test an endpoint in a VPC, this structure contains
     *   information about the subnet and security groups of the VPC endpoint. For more information,
     *   see
     *   [Running a Canary in a VPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html)
     *   .
     */
    public fun vpcConfig(vpcConfig: CfnCanary.VPCConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun build(): CfnCanaryProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
