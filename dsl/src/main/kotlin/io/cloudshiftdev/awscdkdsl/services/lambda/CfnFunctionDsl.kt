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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnFunction
import software.constructs.Construct

/**
 * The `AWS::Lambda::Function` resource creates a Lambda function.
 *
 * To create a function, you need a
 * [deployment package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html)
 * and an
 * [execution role](https://docs.aws.amazon.com/lambda/latest/dg/lambda-intro-execution-role.html) .
 * The deployment package is a .zip file archive or container image that contains your function
 * code. The execution role grants the function permission to use AWS services, such as Amazon
 * CloudWatch Logs for log streaming and AWS X-Ray for request tracing.
 *
 * You set the package type to `Image` if the deployment package is a
 * [container image](https://docs.aws.amazon.com/lambda/latest/dg/lambda-images.html) . For a
 * container image, the code property must include the URI of a container image in the Amazon ECR
 * registry. You do not need to specify the handler and runtime properties.
 *
 * You set the package type to `Zip` if the deployment package is a
 * [.zip file archive](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html#gettingstarted-package-zip)
 * . For a .zip file archive, the code property specifies the location of the .zip file. You must
 * also specify the handler and runtime properties. For a Python example, see
 * [Deploy Python Lambda functions with .zip file archives](https://docs.aws.amazon.com/lambda/latest/dg/python-package.html)
 * .
 *
 * You can use
 * [code signing](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html) if
 * your deployment package is a .zip file archive. To enable code signing for this function, specify
 * the ARN of a code-signing configuration. When a user attempts to deploy a code package with
 * `UpdateFunctionCode` , Lambda checks that the code package has a valid signature from a trusted
 * publisher. The code-signing configuration includes a set of signing profiles, which define the
 * trusted publishers for this function.
 *
 * Note that you configure
 * [provisioned concurrency](https://docs.aws.amazon.com/lambda/latest/dg/provisioned-concurrency.html)
 * on a `AWS::Lambda::Version` or a `AWS::Lambda::Alias` .
 *
 * For a complete introduction to Lambda functions, see
 * [What is Lambda?](https://docs.aws.amazon.com/lambda/latest/dg/lambda-welcome.html) in the
 * *Lambda developer guide.*
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CfnFunction cfnFunction = CfnFunction.Builder.create(this, "MyCfnFunction")
 * .code(CodeProperty.builder()
 * .imageUri("imageUri")
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .s3ObjectVersion("s3ObjectVersion")
 * .zipFile("zipFile")
 * .build())
 * .role("role")
 * // the properties below are optional
 * .architectures(List.of("architectures"))
 * .codeSigningConfigArn("codeSigningConfigArn")
 * .deadLetterConfig(DeadLetterConfigProperty.builder()
 * .targetArn("targetArn")
 * .build())
 * .description("description")
 * .environment(EnvironmentProperty.builder()
 * .variables(Map.of(
 * "variablesKey", "variables"))
 * .build())
 * .ephemeralStorage(EphemeralStorageProperty.builder()
 * .size(123)
 * .build())
 * .fileSystemConfigs(List.of(FileSystemConfigProperty.builder()
 * .arn("arn")
 * .localMountPath("localMountPath")
 * .build()))
 * .functionName("functionName")
 * .handler("handler")
 * .imageConfig(ImageConfigProperty.builder()
 * .command(List.of("command"))
 * .entryPoint(List.of("entryPoint"))
 * .workingDirectory("workingDirectory")
 * .build())
 * .kmsKeyArn("kmsKeyArn")
 * .layers(List.of("layers"))
 * .loggingConfig(LoggingConfigProperty.builder()
 * .applicationLogLevel("applicationLogLevel")
 * .logFormat("logFormat")
 * .logGroup("logGroup")
 * .systemLogLevel("systemLogLevel")
 * .build())
 * .memorySize(123)
 * .packageType("packageType")
 * .reservedConcurrentExecutions(123)
 * .runtime("runtime")
 * .runtimeManagementConfig(RuntimeManagementConfigProperty.builder()
 * .updateRuntimeOn("updateRuntimeOn")
 * // the properties below are optional
 * .runtimeVersionArn("runtimeVersionArn")
 * .build())
 * .snapStart(SnapStartProperty.builder()
 * .applyOn("applyOn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .timeout(123)
 * .tracingConfig(TracingConfigProperty.builder()
 * .mode("mode")
 * .build())
 * .vpcConfig(VpcConfigProperty.builder()
 * .ipv6AllowedForDualStack(false)
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html)
 */
@CdkDslMarker
public class CfnFunctionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFunction.Builder = CfnFunction.Builder.create(scope, id)

    private val _architectures: MutableList<String> = mutableListOf()

    private val _fileSystemConfigs: MutableList<Any> = mutableListOf()

    private val _layers: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The instruction set architecture that the function supports.
     *
     * Enter a string array with one of the valid values (arm64 or x86_64). The default value is
     * `x86_64` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-architectures)
     *
     * @param architectures The instruction set architecture that the function supports.
     */
    public fun architectures(vararg architectures: String) {
        _architectures.addAll(listOf(*architectures))
    }

    /**
     * The instruction set architecture that the function supports.
     *
     * Enter a string array with one of the valid values (arm64 or x86_64). The default value is
     * `x86_64` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-architectures)
     *
     * @param architectures The instruction set architecture that the function supports.
     */
    public fun architectures(architectures: Collection<String>) {
        _architectures.addAll(architectures)
    }

    /**
     * The code for the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
     *
     * @param code The code for the function.
     */
    public fun code(code: IResolvable) {
        cdkBuilder.code(code)
    }

    /**
     * The code for the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
     *
     * @param code The code for the function.
     */
    public fun code(code: CfnFunction.CodeProperty) {
        cdkBuilder.code(code)
    }

    /**
     * To enable code signing for this function, specify the ARN of a code-signing configuration.
     *
     * A code-signing configuration includes a set of signing profiles, which define the trusted
     * publishers for this function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-codesigningconfigarn)
     *
     * @param codeSigningConfigArn To enable code signing for this function, specify the ARN of a
     *   code-signing configuration.
     */
    public fun codeSigningConfigArn(codeSigningConfigArn: String) {
        cdkBuilder.codeSigningConfigArn(codeSigningConfigArn)
    }

    /**
     * A dead-letter queue configuration that specifies the queue or topic where Lambda sends
     * asynchronous events when they fail processing.
     *
     * For more information, see
     * [Dead-letter queues](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-dlq)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-deadletterconfig)
     *
     * @param deadLetterConfig A dead-letter queue configuration that specifies the queue or topic
     *   where Lambda sends asynchronous events when they fail processing.
     */
    public fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig)
    }

    /**
     * A dead-letter queue configuration that specifies the queue or topic where Lambda sends
     * asynchronous events when they fail processing.
     *
     * For more information, see
     * [Dead-letter queues](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-dlq)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-deadletterconfig)
     *
     * @param deadLetterConfig A dead-letter queue configuration that specifies the queue or topic
     *   where Lambda sends asynchronous events when they fail processing.
     */
    public fun deadLetterConfig(deadLetterConfig: CfnFunction.DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig)
    }

    /**
     * A description of the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description)
     *
     * @param description A description of the function.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Environment variables that are accessible from function code during execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
     *
     * @param environment Environment variables that are accessible from function code during
     *   execution.
     */
    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    /**
     * Environment variables that are accessible from function code during execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
     *
     * @param environment Environment variables that are accessible from function code during
     *   execution.
     */
    public fun environment(environment: CfnFunction.EnvironmentProperty) {
        cdkBuilder.environment(environment)
    }

    /**
     * The size of the function's `/tmp` directory in MB.
     *
     * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-ephemeralstorage)
     *
     * @param ephemeralStorage The size of the function's `/tmp` directory in MB.
     */
    public fun ephemeralStorage(ephemeralStorage: IResolvable) {
        cdkBuilder.ephemeralStorage(ephemeralStorage)
    }

    /**
     * The size of the function's `/tmp` directory in MB.
     *
     * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-ephemeralstorage)
     *
     * @param ephemeralStorage The size of the function's `/tmp` directory in MB.
     */
    public fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty) {
        cdkBuilder.ephemeralStorage(ephemeralStorage)
    }

    /**
     * Connection settings for an Amazon EFS file system.
     *
     * To connect a function to a file system, a mount target must be available in every
     * Availability Zone that your function connects to. If your template contains an
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is
     * created or updated before the function.
     *
     * For more information about using the `DependsOn` attribute, see
     * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
     *
     * @param fileSystemConfigs Connection settings for an Amazon EFS file system.
     */
    public fun fileSystemConfigs(vararg fileSystemConfigs: Any) {
        _fileSystemConfigs.addAll(listOf(*fileSystemConfigs))
    }

    /**
     * Connection settings for an Amazon EFS file system.
     *
     * To connect a function to a file system, a mount target must be available in every
     * Availability Zone that your function connects to. If your template contains an
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is
     * created or updated before the function.
     *
     * For more information about using the `DependsOn` attribute, see
     * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
     *
     * @param fileSystemConfigs Connection settings for an Amazon EFS file system.
     */
    public fun fileSystemConfigs(fileSystemConfigs: Collection<Any>) {
        _fileSystemConfigs.addAll(fileSystemConfigs)
    }

    /**
     * Connection settings for an Amazon EFS file system.
     *
     * To connect a function to a file system, a mount target must be available in every
     * Availability Zone that your function connects to. If your template contains an
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is
     * created or updated before the function.
     *
     * For more information about using the `DependsOn` attribute, see
     * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
     *
     * @param fileSystemConfigs Connection settings for an Amazon EFS file system.
     */
    public fun fileSystemConfigs(fileSystemConfigs: IResolvable) {
        cdkBuilder.fileSystemConfigs(fileSystemConfigs)
    }

    /**
     * The name of the Lambda function, up to 64 characters in length.
     *
     * If you don't specify a name, AWS CloudFormation generates one.
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname)
     *
     * @param functionName The name of the Lambda function, up to 64 characters in length.
     */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    /**
     * The name of the method within your code that Lambda calls to run your function.
     *
     * Handler is required if the deployment package is a .zip file archive. The format includes the
     * file name. It can also include namespaces and other qualifiers, depending on the runtime. For
     * more information, see
     * [Lambda programming model](https://docs.aws.amazon.com/lambda/latest/dg/foundation-progmodel.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler)
     *
     * @param handler The name of the method within your code that Lambda calls to run your
     *   function.
     */
    public fun handler(handler: String) {
        cdkBuilder.handler(handler)
    }

    /**
     * Configuration values that override the container image Dockerfile settings.
     *
     * For more information, see
     * [Container image settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-imageconfig)
     *
     * @param imageConfig Configuration values that override the container image Dockerfile
     *   settings.
     */
    public fun imageConfig(imageConfig: IResolvable) {
        cdkBuilder.imageConfig(imageConfig)
    }

    /**
     * Configuration values that override the container image Dockerfile settings.
     *
     * For more information, see
     * [Container image settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-imageconfig)
     *
     * @param imageConfig Configuration values that override the container image Dockerfile
     *   settings.
     */
    public fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty) {
        cdkBuilder.imageConfig(imageConfig)
    }

    /**
     * The ARN of the AWS Key Management Service ( AWS KMS ) customer managed key that's used to
     * encrypt your function's
     * [environment variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-encryption)
     * . When
     * [Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-security.html) is
     * activated, Lambda also uses this key is to encrypt your function's snapshot. If you deploy
     * your function using a container image, Lambda also uses this key to encrypt your function
     * when it's deployed. Note that this is not the same key that's used to protect your container
     * image in the Amazon Elastic Container Registry (Amazon ECR). If you don't provide a customer
     * managed key, Lambda uses a default service key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn)
     *
     * @param kmsKeyArn The ARN of the AWS Key Management Service ( AWS KMS ) customer managed key
     *   that's used to encrypt your function's
     *   [environment variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-encryption)
     *   . When
     *   [Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-security.html) is
     *   activated, Lambda also uses this key is to encrypt your function's snapshot. If you deploy
     *   your function using a container image, Lambda also uses this key to encrypt your function
     *   when it's deployed. Note that this is not the same key that's used to protect your
     *   container image in the Amazon Elastic Container Registry (Amazon ECR). If you don't provide
     *   a customer managed key, Lambda uses a default service key.
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * A list of
     * [function layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to
     * add to the function's execution environment. Specify each layer by its ARN, including the
     * version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-layers)
     *
     * @param layers A list of
     *   [function layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html)
     *   to add to the function's execution environment. Specify each layer by its ARN, including
     *   the version.
     */
    public fun layers(vararg layers: String) {
        _layers.addAll(listOf(*layers))
    }

    /**
     * A list of
     * [function layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to
     * add to the function's execution environment. Specify each layer by its ARN, including the
     * version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-layers)
     *
     * @param layers A list of
     *   [function layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html)
     *   to add to the function's execution environment. Specify each layer by its ARN, including
     *   the version.
     */
    public fun layers(layers: Collection<String>) {
        _layers.addAll(layers)
    }

    /**
     * The function's Amazon CloudWatch Logs configuration settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-loggingconfig)
     *
     * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings.
     */
    public fun loggingConfig(loggingConfig: IResolvable) {
        cdkBuilder.loggingConfig(loggingConfig)
    }

    /**
     * The function's Amazon CloudWatch Logs configuration settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-loggingconfig)
     *
     * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings.
     */
    public fun loggingConfig(loggingConfig: CfnFunction.LoggingConfigProperty) {
        cdkBuilder.loggingConfig(loggingConfig)
    }

    /**
     * The amount of
     * [memory available to the function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
     * at runtime. Increasing the function memory also increases its CPU allocation. The default
     * value is 128 MB. The value can be any multiple of 1 MB. Note that new AWS accounts have
     * reduced concurrency and memory quotas. AWS raises these quotas automatically based on your
     * usage. You can also request a quota increase.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize)
     *
     * @param memorySize The amount of
     *   [memory available to the function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
     *   at runtime. Increasing the function memory also increases its CPU allocation. The default
     *   value is 128 MB. The value can be any multiple of 1 MB. Note that new AWS accounts have
     *   reduced concurrency and memory quotas. AWS raises these quotas automatically based on your
     *   usage. You can also request a quota increase.
     */
    public fun memorySize(memorySize: Number) {
        cdkBuilder.memorySize(memorySize)
    }

    /**
     * The type of deployment package.
     *
     * Set to `Image` for container image and set `Zip` for .zip file archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-packagetype)
     *
     * @param packageType The type of deployment package.
     */
    public fun packageType(packageType: String) {
        cdkBuilder.packageType(packageType)
    }

    /**
     * The number of simultaneous executions to reserve for the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions)
     *
     * @param reservedConcurrentExecutions The number of simultaneous executions to reserve for the
     *   function.
     */
    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
        cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    /**
     * The Amazon Resource Name (ARN) of the function's execution role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role)
     *
     * @param role The Amazon Resource Name (ARN) of the function's execution role.
     */
    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    /**
     * The identifier of the function's
     * [runtime](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Runtime is
     * required if the deployment package is a .zip file archive.
     *
     * The following list includes deprecated runtimes. For more information, see
     * [Runtime deprecation policy](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-support-policy)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime)
     *
     * @param runtime The identifier of the function's
     *   [runtime](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Runtime is
     *   required if the deployment package is a .zip file archive.
     */
    public fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
    }

    /**
     * Sets the runtime management configuration for a function's version.
     *
     * For more information, see
     * [Runtime updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtimemanagementconfig)
     *
     * @param runtimeManagementConfig Sets the runtime management configuration for a function's
     *   version.
     */
    public fun runtimeManagementConfig(runtimeManagementConfig: IResolvable) {
        cdkBuilder.runtimeManagementConfig(runtimeManagementConfig)
    }

    /**
     * Sets the runtime management configuration for a function's version.
     *
     * For more information, see
     * [Runtime updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtimemanagementconfig)
     *
     * @param runtimeManagementConfig Sets the runtime management configuration for a function's
     *   version.
     */
    public fun runtimeManagementConfig(
        runtimeManagementConfig: CfnFunction.RuntimeManagementConfigProperty
    ) {
        cdkBuilder.runtimeManagementConfig(runtimeManagementConfig)
    }

    /**
     * The function's
     * [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-snapstart)
     *
     * @param snapStart The function's
     *   [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
     *   setting.
     */
    public fun snapStart(snapStart: IResolvable) {
        cdkBuilder.snapStart(snapStart)
    }

    /**
     * The function's
     * [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-snapstart)
     *
     * @param snapStart The function's
     *   [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
     *   setting.
     */
    public fun snapStart(snapStart: CfnFunction.SnapStartProperty) {
        cdkBuilder.snapStart(snapStart)
    }

    /**
     * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to the
     * function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags)
     *
     * @param tags A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to
     *   apply to the function.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to the
     * function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags)
     *
     * @param tags A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to
     *   apply to the function.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The amount of time (in seconds) that Lambda allows a function to run before stopping it.
     *
     * The default is 3 seconds. The maximum allowed value is 900 seconds. For more information, see
     * [Lambda execution environment](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-context.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout)
     *
     * @param timeout The amount of time (in seconds) that Lambda allows a function to run before
     *   stopping it.
     */
    public fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * Set `Mode` to `Active` to sample and trace a subset of incoming requests with
     * [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
     *
     * @param tracingConfig Set `Mode` to `Active` to sample and trace a subset of incoming requests
     *   with [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
     */
    public fun tracingConfig(tracingConfig: IResolvable) {
        cdkBuilder.tracingConfig(tracingConfig)
    }

    /**
     * Set `Mode` to `Active` to sample and trace a subset of incoming requests with
     * [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
     *
     * @param tracingConfig Set `Mode` to `Active` to sample and trace a subset of incoming requests
     *   with [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
     */
    public fun tracingConfig(tracingConfig: CfnFunction.TracingConfigProperty) {
        cdkBuilder.tracingConfig(tracingConfig)
    }

    /**
     * For network connectivity to AWS resources in a VPC, specify a list of security groups and
     * subnets in the VPC.
     *
     * When you connect a function to a VPC, it can access resources and the internet only through
     * that VPC. For more information, see
     * [Configuring a Lambda function to access resources in a VPC](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
     *
     * @param vpcConfig For network connectivity to AWS resources in a VPC, specify a list of
     *   security groups and subnets in the VPC.
     */
    public fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    /**
     * For network connectivity to AWS resources in a VPC, specify a list of security groups and
     * subnets in the VPC.
     *
     * When you connect a function to a VPC, it can access resources and the internet only through
     * that VPC. For more information, see
     * [Configuring a Lambda function to access resources in a VPC](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
     *
     * @param vpcConfig For network connectivity to AWS resources in a VPC, specify a list of
     *   security groups and subnets in the VPC.
     */
    public fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun build(): CfnFunction {
        if (_architectures.isNotEmpty()) cdkBuilder.architectures(_architectures)
        if (_fileSystemConfigs.isNotEmpty()) cdkBuilder.fileSystemConfigs(_fileSystemConfigs)
        if (_layers.isNotEmpty()) cdkBuilder.layers(_layers)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
