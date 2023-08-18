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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CfnCanary
import software.amazon.awscdk.services.synthetics.CfnCanaryProps
import software.amazon.awscdk.services.synthetics.CfnGroup
import software.amazon.awscdk.services.synthetics.CfnGroupProps
import software.constructs.Construct

public object synthetics {
    /**
     * Creates or updates a canary.
     *
     * Canaries are scripts that monitor your endpoints and APIs from the outside-in. Canaries help
     * you check the availability and latency of your web services and troubleshoot anomalies by
     * investigating load time data, screenshots of the UI, logs, and metrics. You can set up a
     * canary to run continuously or just once.
     *
     * To create canaries, you must have the `CloudWatchSyntheticsFullAccess` policy. If you are
     * creating a new IAM role for the canary, you also need the the `iam:CreateRole` ,
     * `iam:CreatePolicy` and `iam:AttachRolePolicy` permissions. For more information, see
     * [Necessary Roles and Permissions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Roles)
     * .
     *
     * Do not include secrets or proprietary information in your canary names. The canary name makes
     * up part of the Amazon Resource Name (ARN) for the canary, and the ARN is included in outbound
     * calls over the internet. For more information, see
     * [Security Considerations for Synthetics Canaries](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html)
     * .
     *
     * Example:
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
    public inline fun cfnCanary(
        scope: Construct,
        id: String,
        block: CfnCanaryDsl.() -> Unit = {},
    ): CfnCanary {
        val builder = CfnCanaryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that contains the configuration for canary artifacts, including the
     * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3 .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.synthetics.*;
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
    public inline fun cfnCanaryArtifactConfigProperty(
        block: CfnCanaryArtifactConfigPropertyDsl.() -> Unit = {}
    ): CfnCanary.ArtifactConfigProperty {
        val builder = CfnCanaryArtifactConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure representing a screenshot that is used as a baseline during visual monitoring
     * comparisons made by the canary.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.synthetics.*;
     * BaseScreenshotProperty baseScreenshotProperty = BaseScreenshotProperty.builder()
     * .screenshotName("screenshotName")
     * // the properties below are optional
     * .ignoreCoordinates(List.of("ignoreCoordinates"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-basescreenshot.html)
     */
    public inline fun cfnCanaryBaseScreenshotProperty(
        block: CfnCanaryBaseScreenshotPropertyDsl.() -> Unit = {}
    ): CfnCanary.BaseScreenshotProperty {
        val builder = CfnCanaryBaseScreenshotPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use this structure to input your script code for the canary.
     *
     * This structure contains the Lambda handler with the location where the canary should start
     * running the script. If the script is stored in an S3 bucket, the bucket name, key, and
     * version are also included. If the script is passed into the canary directly, the script code
     * is contained in the value of `Script` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.synthetics.*;
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
    public inline fun cfnCanaryCodeProperty(
        block: CfnCanaryCodePropertyDsl.() -> Unit = {}
    ): CfnCanary.CodeProperty {
        val builder = CfnCanaryCodePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnCanaryProps(block: CfnCanaryPropsDsl.() -> Unit = {}): CfnCanaryProps {
        val builder = CfnCanaryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that contains input information for a canary run.
     *
     * This structure is required.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.synthetics.*;
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
    public inline fun cfnCanaryRunConfigProperty(
        block: CfnCanaryRunConfigPropertyDsl.() -> Unit = {}
    ): CfnCanary.RunConfigProperty {
        val builder = CfnCanaryRunConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that contains the configuration of the encryption-at-rest settings for artifacts
     * that the canary uploads to Amazon S3 .
     *
     * Artifact encryption functionality is available only for canaries that use Synthetics runtime
     * version syn-nodejs-puppeteer-3.3 or later. For more information, see
     * [Encrypting canary artifacts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.synthetics.*;
     * S3EncryptionProperty s3EncryptionProperty = S3EncryptionProperty.builder()
     * .encryptionMode("encryptionMode")
     * .kmsKeyArn("kmsKeyArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-s3encryption.html)
     */
    public inline fun cfnCanaryS3EncryptionProperty(
        block: CfnCanaryS3EncryptionPropertyDsl.() -> Unit = {}
    ): CfnCanary.S3EncryptionProperty {
        val builder = CfnCanaryS3EncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure specifies how often a canary is to make runs and the date and time when it
     * should stop making runs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.synthetics.*;
     * ScheduleProperty scheduleProperty = ScheduleProperty.builder()
     * .expression("expression")
     * // the properties below are optional
     * .durationInSeconds("durationInSeconds")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-schedule.html)
     */
    public inline fun cfnCanaryScheduleProperty(
        block: CfnCanarySchedulePropertyDsl.() -> Unit = {}
    ): CfnCanary.ScheduleProperty {
        val builder = CfnCanarySchedulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * If this canary is to test an endpoint in a VPC, this structure contains information about the
     * subnet and security groups of the VPC endpoint.
     *
     * For more information, see
     * [Running a Canary in a VPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.synthetics.*;
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
    public inline fun cfnCanaryVPCConfigProperty(
        block: CfnCanaryVPCConfigPropertyDsl.() -> Unit = {}
    ): CfnCanary.VPCConfigProperty {
        val builder = CfnCanaryVPCConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the screenshots to use as the baseline for comparisons during visual monitoring
     * comparisons during future runs of this canary.
     *
     * If you omit this parameter, no changes are made to any baseline screenshots that the canary
     * might be using already.
     *
     * Visual monitoring is supported only on canaries running the *syn-puppeteer-node-3.2* runtime
     * or later. For more information, see
     * [Visual monitoring](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Library_SyntheticsLogger_VisualTesting.html)
     * and
     * [Visual monitoring blueprint](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Blueprints_VisualTesting.html)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.synthetics.*;
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
    public inline fun cfnCanaryVisualReferenceProperty(
        block: CfnCanaryVisualReferencePropertyDsl.() -> Unit = {}
    ): CfnCanary.VisualReferenceProperty {
        val builder = CfnCanaryVisualReferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates a group which you can use to associate canaries with each other, including
     * cross-Region canaries.
     *
     * Using groups can help you with managing and automating your canaries, and you can also view
     * aggregated run results and statistics for all canaries in a group.
     *
     * Groups are global resources. When you create a group, it is replicated across all AWS
     * Regions, and you can add canaries from any Region to it, and view it in any Region. Although
     * the group ARN format reflects the Region name where it was created, a group is not
     * constrained to any Region. This means that you can put canaries from multiple Regions into
     * the same group, and then use that group to view and manage all of those canaries in a single
     * view.
     *
     * Each group can contain as many as 10 canaries. You can have as many as 20 groups in your
     * account. Any single canary can be a member of up to 10 groups.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.synthetics.*;
     * CfnGroup cfnGroup = CfnGroup.Builder.create(this, "MyCfnGroup")
     * .name("name")
     * // the properties below are optional
     * .resourceArns(List.of("resourceArns"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html)
     */
    public inline fun cfnGroup(
        scope: Construct,
        id: String,
        block: CfnGroupDsl.() -> Unit = {},
    ): CfnGroup {
        val builder = CfnGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.synthetics.*;
     * CfnGroupProps cfnGroupProps = CfnGroupProps.builder()
     * .name("name")
     * // the properties below are optional
     * .resourceArns(List.of("resourceArns"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html)
     */
    public inline fun cfnGroupProps(block: CfnGroupPropsDsl.() -> Unit = {}): CfnGroupProps {
        val builder = CfnGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
