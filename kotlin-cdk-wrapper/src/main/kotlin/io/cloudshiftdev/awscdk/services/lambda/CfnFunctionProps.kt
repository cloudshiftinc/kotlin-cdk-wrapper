@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFunction`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * CfnFunctionProps cfnFunctionProps = CfnFunctionProps.builder()
 * .code(CodeProperty.builder()
 * .imageUri("imageUri")
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .s3ObjectVersion("s3ObjectVersion")
 * .sourceKmsKeyArn("sourceKmsKeyArn")
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
 * .recursiveLoop("recursiveLoop")
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
public interface CfnFunctionProps {
  /**
   * The instruction set architecture that the function supports.
   *
   * Enter a string array with one of the valid values (arm64 or x86_64). The default value is
   * `x86_64` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-architectures)
   */
  public fun architectures(): List<String> = unwrap(this).getArchitectures() ?: emptyList()

  /**
   * The code for the function. You can define your function code in multiple ways:.
   *
   * * For .zip deployment packages, you can specify the Amazon S3 location of the .zip file in the
   * `S3Bucket` , `S3Key` , and `S3ObjectVersion` properties.
   * * For .zip deployment packages, you can alternatively define the function code inline in the
   * `ZipFile` property. This method works only for Node.js and Python functions.
   * * For container images, specify the URI of your container image in the Amazon ECR registry in
   * the `ImageUri` property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
   */
  public fun code(): Any

  /**
   * To enable code signing for this function, specify the ARN of a code-signing configuration.
   *
   * A code-signing configuration
   * includes a set of signing profiles, which define the trusted publishers for this function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-codesigningconfigarn)
   */
  public fun codeSigningConfigArn(): String? = unwrap(this).getCodeSigningConfigArn()

  /**
   * A dead-letter queue configuration that specifies the queue or topic where Lambda sends
   * asynchronous events when they fail processing.
   *
   * For more information, see [Dead-letter
   * queues](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-dlq) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-deadletterconfig)
   */
  public fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

  /**
   * A description of the function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Environment variables that are accessible from function code during execution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
   */
  public fun environment(): Any? = unwrap(this).getEnvironment()

  /**
   * The size of the function's `/tmp` directory in MB.
   *
   * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-ephemeralstorage)
   */
  public fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

  /**
   * Connection settings for an Amazon EFS file system.
   *
   * To connect a function to a file system, a mount target must be available in every Availability
   * Zone that your function connects to. If your template contains an
   * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
   * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is created
   * or updated before the function.
   *
   * For more information about using the `DependsOn` attribute, see [DependsOn
   * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
   */
  public fun fileSystemConfigs(): Any? = unwrap(this).getFileSystemConfigs()

  /**
   * The name of the Lambda function, up to 64 characters in length.
   *
   * If you don't specify a name, AWS CloudFormation generates one.
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname)
   */
  public fun functionName(): String? = unwrap(this).getFunctionName()

  /**
   * The name of the method within your code that Lambda calls to run your function.
   *
   * Handler is required if the deployment package is a .zip file archive. The format includes the
   * file name. It can also include namespaces and other qualifiers, depending on the runtime. For more
   * information, see [Lambda programming
   * model](https://docs.aws.amazon.com/lambda/latest/dg/foundation-progmodel.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler)
   */
  public fun handler(): String? = unwrap(this).getHandler()

  /**
   * Configuration values that override the container image Dockerfile settings.
   *
   * For more information, see [Container image
   * settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-imageconfig)
   */
  public fun imageConfig(): Any? = unwrap(this).getImageConfig()

  /**
   * The ARN of the AWS Key Management Service ( AWS KMS ) customer managed key that's used to
   * encrypt the following resources:.
   *
   * * The function's [environment
   * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-encryption)
   * .
   * * The function's [Lambda
   * SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-security.html) snapshots.
   * * When used with `SourceKMSKeyArn` , the unzipped version of the .zip deployment package that's
   * used for function invocations. For more information, see [Specifying a customer managed key for
   * Lambda](https://docs.aws.amazon.com/lambda/latest/dg/encrypt-zip-package.html#enable-zip-custom-encryption)
   * .
   * * The optimized version of the container image that's used for function invocations. Note that
   * this is not the same key that's used to protect your container image in the Amazon Elastic
   * Container Registry (Amazon ECR). For more information, see [Function
   * lifecycle](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-lifecycle) .
   *
   * If you don't provide a customer managed key, Lambda uses an [AWS owned
   * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-owned-cmk) or an [AWS
   * managed key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn)
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * A list of [function
   * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
   * function's execution environment. Specify each layer by its ARN, including the version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-layers)
   */
  public fun layers(): List<String> = unwrap(this).getLayers() ?: emptyList()

  /**
   * The function's Amazon CloudWatch Logs configuration settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-loggingconfig)
   */
  public fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

  /**
   * The amount of [memory available to the
   * function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
   * at runtime. Increasing the function memory also increases its CPU allocation. The default value is
   * 128 MB. The value can be any multiple of 1 MB. Note that new AWS accounts have reduced concurrency
   * and memory quotas. AWS raises these quotas automatically based on your usage. You can also request
   * a quota increase.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize)
   */
  public fun memorySize(): Number? = unwrap(this).getMemorySize()

  /**
   * The type of deployment package.
   *
   * Set to `Image` for container image and set `Zip` for .zip file archive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-packagetype)
   */
  public fun packageType(): String? = unwrap(this).getPackageType()

  /**
   * The status of your function's recursive loop detection configuration.
   *
   * When this value is set to `Allow` and Lambda detects your function being invoked as part of a
   * recursive loop, it doesn't take any action.
   *
   * When this value is set to `Terminate` and Lambda detects your function being invoked as part of
   * a recursive loop, it stops your function being invoked and notifies you.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-recursiveloop)
   */
  public fun recursiveLoop(): String? = unwrap(this).getRecursiveLoop()

  /**
   * The number of simultaneous executions to reserve for the function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions)
   */
  public fun reservedConcurrentExecutions(): Number? =
      unwrap(this).getReservedConcurrentExecutions()

  /**
   * The Amazon Resource Name (ARN) of the function's execution role.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role)
   */
  public fun role(): String

  /**
   * The identifier of the function's
   * [runtime](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Runtime is required
   * if the deployment package is a .zip file archive. Specifying a runtime results in an error if
   * you're deploying a function using a container image.
   *
   * The following list includes deprecated runtimes. Lambda blocks creating new functions and
   * updating existing functions shortly after each runtime is deprecated. For more information, see
   * [Runtime use after
   * deprecation](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-deprecation-levels)
   * .
   *
   * For a list of all currently supported runtimes, see [Supported
   * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtimes-supported) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime)
   */
  public fun runtime(): String? = unwrap(this).getRuntime()

  /**
   * Sets the runtime management configuration for a function's version.
   *
   * For more information, see [Runtime
   * updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtimemanagementconfig)
   */
  public fun runtimeManagementConfig(): Any? = unwrap(this).getRuntimeManagementConfig()

  /**
   * The function's [AWS Lambda
   * SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-snapstart)
   */
  public fun snapStart(): Any? = unwrap(this).getSnapStart()

  /**
   * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to the
   * function.
   *
   *
   * You must have the `lambda:TagResource` , `lambda:UntagResource` , and `lambda:ListTags`
   * permissions for your [IAM
   * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
   * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
   * unexpected behavior with stack-level tags propagating to the resource during resource creation and
   * update.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The amount of time (in seconds) that Lambda allows a function to run before stopping it.
   *
   * The default is 3 seconds. The maximum allowed value is 900 seconds. For more information, see
   * [Lambda execution environment](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-context.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout)
   */
  public fun timeout(): Number? = unwrap(this).getTimeout()

  /**
   * Set `Mode` to `Active` to sample and trace a subset of incoming requests with
   * [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
   */
  public fun tracingConfig(): Any? = unwrap(this).getTracingConfig()

  /**
   * For network connectivity to AWS resources in a VPC, specify a list of security groups and
   * subnets in the VPC.
   *
   * When you connect a function to a VPC, it can access resources and the internet only through
   * that VPC. For more information, see [Configuring a Lambda function to access resources in a
   * VPC](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
   */
  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * A builder for [CfnFunctionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param architectures The instruction set architecture that the function supports.
     * Enter a string array with one of the valid values (arm64 or x86_64). The default value is
     * `x86_64` .
     */
    public fun architectures(architectures: List<String>)

    /**
     * @param architectures The instruction set architecture that the function supports.
     * Enter a string array with one of the valid values (arm64 or x86_64). The default value is
     * `x86_64` .
     */
    public fun architectures(vararg architectures: String)

    /**
     * @param code The code for the function. You can define your function code in multiple ways:. 
     * * For .zip deployment packages, you can specify the Amazon S3 location of the .zip file in
     * the `S3Bucket` , `S3Key` , and `S3ObjectVersion` properties.
     * * For .zip deployment packages, you can alternatively define the function code inline in the
     * `ZipFile` property. This method works only for Node.js and Python functions.
     * * For container images, specify the URI of your container image in the Amazon ECR registry in
     * the `ImageUri` property.
     */
    public fun code(code: IResolvable)

    /**
     * @param code The code for the function. You can define your function code in multiple ways:. 
     * * For .zip deployment packages, you can specify the Amazon S3 location of the .zip file in
     * the `S3Bucket` , `S3Key` , and `S3ObjectVersion` properties.
     * * For .zip deployment packages, you can alternatively define the function code inline in the
     * `ZipFile` property. This method works only for Node.js and Python functions.
     * * For container images, specify the URI of your container image in the Amazon ECR registry in
     * the `ImageUri` property.
     */
    public fun code(code: CfnFunction.CodeProperty)

    /**
     * @param code The code for the function. You can define your function code in multiple ways:. 
     * * For .zip deployment packages, you can specify the Amazon S3 location of the .zip file in
     * the `S3Bucket` , `S3Key` , and `S3ObjectVersion` properties.
     * * For .zip deployment packages, you can alternatively define the function code inline in the
     * `ZipFile` property. This method works only for Node.js and Python functions.
     * * For container images, specify the URI of your container image in the Amazon ECR registry in
     * the `ImageUri` property.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c52ce7080f82852b50c083937168f8621fc464d4066a012690476c2b249079b")
    public fun code(code: CfnFunction.CodeProperty.Builder.() -> Unit)

    /**
     * @param codeSigningConfigArn To enable code signing for this function, specify the ARN of a
     * code-signing configuration.
     * A code-signing configuration
     * includes a set of signing profiles, which define the trusted publishers for this function.
     */
    public fun codeSigningConfigArn(codeSigningConfigArn: String)

    /**
     * @param deadLetterConfig A dead-letter queue configuration that specifies the queue or topic
     * where Lambda sends asynchronous events when they fail processing.
     * For more information, see [Dead-letter
     * queues](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-dlq) .
     */
    public fun deadLetterConfig(deadLetterConfig: IResolvable)

    /**
     * @param deadLetterConfig A dead-letter queue configuration that specifies the queue or topic
     * where Lambda sends asynchronous events when they fail processing.
     * For more information, see [Dead-letter
     * queues](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-dlq) .
     */
    public fun deadLetterConfig(deadLetterConfig: CfnFunction.DeadLetterConfigProperty)

    /**
     * @param deadLetterConfig A dead-letter queue configuration that specifies the queue or topic
     * where Lambda sends asynchronous events when they fail processing.
     * For more information, see [Dead-letter
     * queues](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-dlq) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d4f1762c765af746c14b00547fb2ca15aa43dcee751128bbc9b947042c57747")
    public
        fun deadLetterConfig(deadLetterConfig: CfnFunction.DeadLetterConfigProperty.Builder.() -> Unit)

    /**
     * @param description A description of the function.
     */
    public fun description(description: String)

    /**
     * @param environment Environment variables that are accessible from function code during
     * execution.
     */
    public fun environment(environment: IResolvable)

    /**
     * @param environment Environment variables that are accessible from function code during
     * execution.
     */
    public fun environment(environment: CfnFunction.EnvironmentProperty)

    /**
     * @param environment Environment variables that are accessible from function code during
     * execution.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b3a85e88e7a4197ee6e1cdb4110e15edcd07a668fdb27de3fb181d90d98778e")
    public fun environment(environment: CfnFunction.EnvironmentProperty.Builder.() -> Unit)

    /**
     * @param ephemeralStorage The size of the function's `/tmp` directory in MB.
     * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
     */
    public fun ephemeralStorage(ephemeralStorage: IResolvable)

    /**
     * @param ephemeralStorage The size of the function's `/tmp` directory in MB.
     * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
     */
    public fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty)

    /**
     * @param ephemeralStorage The size of the function's `/tmp` directory in MB.
     * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e474b10e7ad2e75ec5c28030ceb31899ff7f3339e5c4508d94dbc7fb3efb260")
    public
        fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty.Builder.() -> Unit)

    /**
     * @param fileSystemConfigs Connection settings for an Amazon EFS file system.
     * To connect a function to a file system, a mount target must be available in every
     * Availability Zone that your function connects to. If your template contains an
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is
     * created or updated before the function.
     *
     * For more information about using the `DependsOn` attribute, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     */
    public fun fileSystemConfigs(fileSystemConfigs: IResolvable)

    /**
     * @param fileSystemConfigs Connection settings for an Amazon EFS file system.
     * To connect a function to a file system, a mount target must be available in every
     * Availability Zone that your function connects to. If your template contains an
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is
     * created or updated before the function.
     *
     * For more information about using the `DependsOn` attribute, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     */
    public fun fileSystemConfigs(fileSystemConfigs: List<Any>)

    /**
     * @param fileSystemConfigs Connection settings for an Amazon EFS file system.
     * To connect a function to a file system, a mount target must be available in every
     * Availability Zone that your function connects to. If your template contains an
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is
     * created or updated before the function.
     *
     * For more information about using the `DependsOn` attribute, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     */
    public fun fileSystemConfigs(vararg fileSystemConfigs: Any)

    /**
     * @param functionName The name of the Lambda function, up to 64 characters in length.
     * If you don't specify a name, AWS CloudFormation generates one.
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun functionName(functionName: String)

    /**
     * @param handler The name of the method within your code that Lambda calls to run your
     * function.
     * Handler is required if the deployment package is a .zip file archive. The format includes the
     * file name. It can also include namespaces and other qualifiers, depending on the runtime. For
     * more information, see [Lambda programming
     * model](https://docs.aws.amazon.com/lambda/latest/dg/foundation-progmodel.html) .
     */
    public fun handler(handler: String)

    /**
     * @param imageConfig Configuration values that override the container image Dockerfile
     * settings.
     * For more information, see [Container image
     * settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms) .
     */
    public fun imageConfig(imageConfig: IResolvable)

    /**
     * @param imageConfig Configuration values that override the container image Dockerfile
     * settings.
     * For more information, see [Container image
     * settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms) .
     */
    public fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty)

    /**
     * @param imageConfig Configuration values that override the container image Dockerfile
     * settings.
     * For more information, see [Container image
     * settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1997324bc2087618fc0e50de6b9eed554e767b3bbda6d845bbee3db1be1277e6")
    public fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty.Builder.() -> Unit)

    /**
     * @param kmsKeyArn The ARN of the AWS Key Management Service ( AWS KMS ) customer managed key
     * that's used to encrypt the following resources:.
     * * The function's [environment
     * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-encryption)
     * .
     * * The function's [Lambda
     * SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-security.html) snapshots.
     * * When used with `SourceKMSKeyArn` , the unzipped version of the .zip deployment package
     * that's used for function invocations. For more information, see [Specifying a customer managed
     * key for
     * Lambda](https://docs.aws.amazon.com/lambda/latest/dg/encrypt-zip-package.html#enable-zip-custom-encryption)
     * .
     * * The optimized version of the container image that's used for function invocations. Note
     * that this is not the same key that's used to protect your container image in the Amazon Elastic
     * Container Registry (Amazon ECR). For more information, see [Function
     * lifecycle](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-lifecycle) .
     *
     * If you don't provide a customer managed key, Lambda uses an [AWS owned
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-owned-cmk) or an
     * [AWS managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk) .
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param layers A list of [function
     * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
     * function's execution environment. Specify each layer by its ARN, including the version.
     */
    public fun layers(layers: List<String>)

    /**
     * @param layers A list of [function
     * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
     * function's execution environment. Specify each layer by its ARN, including the version.
     */
    public fun layers(vararg layers: String)

    /**
     * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings.
     */
    public fun loggingConfig(loggingConfig: IResolvable)

    /**
     * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings.
     */
    public fun loggingConfig(loggingConfig: CfnFunction.LoggingConfigProperty)

    /**
     * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec44b63b2176f8c25e5e01fcf663beca7e89dabaed7dd493d681fa5644914e19")
    public fun loggingConfig(loggingConfig: CfnFunction.LoggingConfigProperty.Builder.() -> Unit)

    /**
     * @param memorySize The amount of [memory available to the
     * function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
     * at runtime. Increasing the function memory also increases its CPU allocation. The default value
     * is 128 MB. The value can be any multiple of 1 MB. Note that new AWS accounts have reduced
     * concurrency and memory quotas. AWS raises these quotas automatically based on your usage. You
     * can also request a quota increase.
     */
    public fun memorySize(memorySize: Number)

    /**
     * @param packageType The type of deployment package.
     * Set to `Image` for container image and set `Zip` for .zip file archive.
     */
    public fun packageType(packageType: String)

    /**
     * @param recursiveLoop The status of your function's recursive loop detection configuration.
     * When this value is set to `Allow` and Lambda detects your function being invoked as part of a
     * recursive loop, it doesn't take any action.
     *
     * When this value is set to `Terminate` and Lambda detects your function being invoked as part
     * of a recursive loop, it stops your function being invoked and notifies you.
     */
    public fun recursiveLoop(recursiveLoop: String)

    /**
     * @param reservedConcurrentExecutions The number of simultaneous executions to reserve for the
     * function.
     */
    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number)

    /**
     * @param role The Amazon Resource Name (ARN) of the function's execution role. 
     */
    public fun role(role: String)

    /**
     * @param runtime The identifier of the function's
     * [runtime](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Runtime is
     * required if the deployment package is a .zip file archive. Specifying a runtime results in an
     * error if you're deploying a function using a container image.
     * The following list includes deprecated runtimes. Lambda blocks creating new functions and
     * updating existing functions shortly after each runtime is deprecated. For more information, see
     * [Runtime use after
     * deprecation](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-deprecation-levels)
     * .
     *
     * For a list of all currently supported runtimes, see [Supported
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtimes-supported)
     * .
     */
    public fun runtime(runtime: String)

    /**
     * @param runtimeManagementConfig Sets the runtime management configuration for a function's
     * version.
     * For more information, see [Runtime
     * updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html) .
     */
    public fun runtimeManagementConfig(runtimeManagementConfig: IResolvable)

    /**
     * @param runtimeManagementConfig Sets the runtime management configuration for a function's
     * version.
     * For more information, see [Runtime
     * updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html) .
     */
    public
        fun runtimeManagementConfig(runtimeManagementConfig: CfnFunction.RuntimeManagementConfigProperty)

    /**
     * @param runtimeManagementConfig Sets the runtime management configuration for a function's
     * version.
     * For more information, see [Runtime
     * updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee237fa0a46e8520d21d94c5b1083490aad6f8069ebae77e7cc99088187b3da4")
    public
        fun runtimeManagementConfig(runtimeManagementConfig: CfnFunction.RuntimeManagementConfigProperty.Builder.() -> Unit)

    /**
     * @param snapStart The function's [AWS Lambda
     * SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
     */
    public fun snapStart(snapStart: IResolvable)

    /**
     * @param snapStart The function's [AWS Lambda
     * SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
     */
    public fun snapStart(snapStart: CfnFunction.SnapStartProperty)

    /**
     * @param snapStart The function's [AWS Lambda
     * SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3c406d178cea826eb1e4103e92ba770b5f74b157127cf053b280c97a7ef5cbc")
    public fun snapStart(snapStart: CfnFunction.SnapStartProperty.Builder.() -> Unit)

    /**
     * @param tags A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to
     * apply to the function.
     *
     * You must have the `lambda:TagResource` , `lambda:UntagResource` , and `lambda:ListTags`
     * permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to
     * apply to the function.
     *
     * You must have the `lambda:TagResource` , `lambda:UntagResource` , and `lambda:ListTags`
     * permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param timeout The amount of time (in seconds) that Lambda allows a function to run before
     * stopping it.
     * The default is 3 seconds. The maximum allowed value is 900 seconds. For more information, see
     * [Lambda execution
     * environment](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-context.html) .
     */
    public fun timeout(timeout: Number)

    /**
     * @param tracingConfig Set `Mode` to `Active` to sample and trace a subset of incoming requests
     * with [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
     */
    public fun tracingConfig(tracingConfig: IResolvable)

    /**
     * @param tracingConfig Set `Mode` to `Active` to sample and trace a subset of incoming requests
     * with [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
     */
    public fun tracingConfig(tracingConfig: CfnFunction.TracingConfigProperty)

    /**
     * @param tracingConfig Set `Mode` to `Active` to sample and trace a subset of incoming requests
     * with [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1617c559ff9d0a323cae6bd48c5daadfd680645588ee9571a1adb94b84a4ce89")
    public fun tracingConfig(tracingConfig: CfnFunction.TracingConfigProperty.Builder.() -> Unit)

    /**
     * @param vpcConfig For network connectivity to AWS resources in a VPC, specify a list of
     * security groups and subnets in the VPC.
     * When you connect a function to a VPC, it can access resources and the internet only through
     * that VPC. For more information, see [Configuring a Lambda function to access resources in a
     * VPC](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html) .
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * @param vpcConfig For network connectivity to AWS resources in a VPC, specify a list of
     * security groups and subnets in the VPC.
     * When you connect a function to a VPC, it can access resources and the internet only through
     * that VPC. For more information, see [Configuring a Lambda function to access resources in a
     * VPC](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html) .
     */
    public fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty)

    /**
     * @param vpcConfig For network connectivity to AWS resources in a VPC, specify a list of
     * security groups and subnets in the VPC.
     * When you connect a function to a VPC, it can access resources and the internet only through
     * that VPC. For more information, see [Configuring a Lambda function to access resources in a
     * VPC](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac174c422fe09fe59e61bc17b79df1128fc471b376ea523d527a49b2d14fb1fc")
    public fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder =
        software.amazon.awscdk.services.lambda.CfnFunctionProps.builder()

    /**
     * @param architectures The instruction set architecture that the function supports.
     * Enter a string array with one of the valid values (arm64 or x86_64). The default value is
     * `x86_64` .
     */
    override fun architectures(architectures: List<String>) {
      cdkBuilder.architectures(architectures)
    }

    /**
     * @param architectures The instruction set architecture that the function supports.
     * Enter a string array with one of the valid values (arm64 or x86_64). The default value is
     * `x86_64` .
     */
    override fun architectures(vararg architectures: String): Unit =
        architectures(architectures.toList())

    /**
     * @param code The code for the function. You can define your function code in multiple ways:. 
     * * For .zip deployment packages, you can specify the Amazon S3 location of the .zip file in
     * the `S3Bucket` , `S3Key` , and `S3ObjectVersion` properties.
     * * For .zip deployment packages, you can alternatively define the function code inline in the
     * `ZipFile` property. This method works only for Node.js and Python functions.
     * * For container images, specify the URI of your container image in the Amazon ECR registry in
     * the `ImageUri` property.
     */
    override fun code(code: IResolvable) {
      cdkBuilder.code(code.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param code The code for the function. You can define your function code in multiple ways:. 
     * * For .zip deployment packages, you can specify the Amazon S3 location of the .zip file in
     * the `S3Bucket` , `S3Key` , and `S3ObjectVersion` properties.
     * * For .zip deployment packages, you can alternatively define the function code inline in the
     * `ZipFile` property. This method works only for Node.js and Python functions.
     * * For container images, specify the URI of your container image in the Amazon ECR registry in
     * the `ImageUri` property.
     */
    override fun code(code: CfnFunction.CodeProperty) {
      cdkBuilder.code(code.let(CfnFunction.CodeProperty.Companion::unwrap))
    }

    /**
     * @param code The code for the function. You can define your function code in multiple ways:. 
     * * For .zip deployment packages, you can specify the Amazon S3 location of the .zip file in
     * the `S3Bucket` , `S3Key` , and `S3ObjectVersion` properties.
     * * For .zip deployment packages, you can alternatively define the function code inline in the
     * `ZipFile` property. This method works only for Node.js and Python functions.
     * * For container images, specify the URI of your container image in the Amazon ECR registry in
     * the `ImageUri` property.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c52ce7080f82852b50c083937168f8621fc464d4066a012690476c2b249079b")
    override fun code(code: CfnFunction.CodeProperty.Builder.() -> Unit): Unit =
        code(CfnFunction.CodeProperty(code))

    /**
     * @param codeSigningConfigArn To enable code signing for this function, specify the ARN of a
     * code-signing configuration.
     * A code-signing configuration
     * includes a set of signing profiles, which define the trusted publishers for this function.
     */
    override fun codeSigningConfigArn(codeSigningConfigArn: String) {
      cdkBuilder.codeSigningConfigArn(codeSigningConfigArn)
    }

    /**
     * @param deadLetterConfig A dead-letter queue configuration that specifies the queue or topic
     * where Lambda sends asynchronous events when they fail processing.
     * For more information, see [Dead-letter
     * queues](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-dlq) .
     */
    override fun deadLetterConfig(deadLetterConfig: IResolvable) {
      cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deadLetterConfig A dead-letter queue configuration that specifies the queue or topic
     * where Lambda sends asynchronous events when they fail processing.
     * For more information, see [Dead-letter
     * queues](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-dlq) .
     */
    override fun deadLetterConfig(deadLetterConfig: CfnFunction.DeadLetterConfigProperty) {
      cdkBuilder.deadLetterConfig(deadLetterConfig.let(CfnFunction.DeadLetterConfigProperty.Companion::unwrap))
    }

    /**
     * @param deadLetterConfig A dead-letter queue configuration that specifies the queue or topic
     * where Lambda sends asynchronous events when they fail processing.
     * For more information, see [Dead-letter
     * queues](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-dlq) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d4f1762c765af746c14b00547fb2ca15aa43dcee751128bbc9b947042c57747")
    override
        fun deadLetterConfig(deadLetterConfig: CfnFunction.DeadLetterConfigProperty.Builder.() -> Unit):
        Unit = deadLetterConfig(CfnFunction.DeadLetterConfigProperty(deadLetterConfig))

    /**
     * @param description A description of the function.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param environment Environment variables that are accessible from function code during
     * execution.
     */
    override fun environment(environment: IResolvable) {
      cdkBuilder.environment(environment.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param environment Environment variables that are accessible from function code during
     * execution.
     */
    override fun environment(environment: CfnFunction.EnvironmentProperty) {
      cdkBuilder.environment(environment.let(CfnFunction.EnvironmentProperty.Companion::unwrap))
    }

    /**
     * @param environment Environment variables that are accessible from function code during
     * execution.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b3a85e88e7a4197ee6e1cdb4110e15edcd07a668fdb27de3fb181d90d98778e")
    override fun environment(environment: CfnFunction.EnvironmentProperty.Builder.() -> Unit): Unit
        = environment(CfnFunction.EnvironmentProperty(environment))

    /**
     * @param ephemeralStorage The size of the function's `/tmp` directory in MB.
     * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
     */
    override fun ephemeralStorage(ephemeralStorage: IResolvable) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ephemeralStorage The size of the function's `/tmp` directory in MB.
     * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
     */
    override fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(CfnFunction.EphemeralStorageProperty.Companion::unwrap))
    }

    /**
     * @param ephemeralStorage The size of the function's `/tmp` directory in MB.
     * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e474b10e7ad2e75ec5c28030ceb31899ff7f3339e5c4508d94dbc7fb3efb260")
    override
        fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty.Builder.() -> Unit):
        Unit = ephemeralStorage(CfnFunction.EphemeralStorageProperty(ephemeralStorage))

    /**
     * @param fileSystemConfigs Connection settings for an Amazon EFS file system.
     * To connect a function to a file system, a mount target must be available in every
     * Availability Zone that your function connects to. If your template contains an
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is
     * created or updated before the function.
     *
     * For more information about using the `DependsOn` attribute, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     */
    override fun fileSystemConfigs(fileSystemConfigs: IResolvable) {
      cdkBuilder.fileSystemConfigs(fileSystemConfigs.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param fileSystemConfigs Connection settings for an Amazon EFS file system.
     * To connect a function to a file system, a mount target must be available in every
     * Availability Zone that your function connects to. If your template contains an
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is
     * created or updated before the function.
     *
     * For more information about using the `DependsOn` attribute, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     */
    override fun fileSystemConfigs(fileSystemConfigs: List<Any>) {
      cdkBuilder.fileSystemConfigs(fileSystemConfigs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param fileSystemConfigs Connection settings for an Amazon EFS file system.
     * To connect a function to a file system, a mount target must be available in every
     * Availability Zone that your function connects to. If your template contains an
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is
     * created or updated before the function.
     *
     * For more information about using the `DependsOn` attribute, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     */
    override fun fileSystemConfigs(vararg fileSystemConfigs: Any): Unit =
        fileSystemConfigs(fileSystemConfigs.toList())

    /**
     * @param functionName The name of the Lambda function, up to 64 characters in length.
     * If you don't specify a name, AWS CloudFormation generates one.
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * @param handler The name of the method within your code that Lambda calls to run your
     * function.
     * Handler is required if the deployment package is a .zip file archive. The format includes the
     * file name. It can also include namespaces and other qualifiers, depending on the runtime. For
     * more information, see [Lambda programming
     * model](https://docs.aws.amazon.com/lambda/latest/dg/foundation-progmodel.html) .
     */
    override fun handler(handler: String) {
      cdkBuilder.handler(handler)
    }

    /**
     * @param imageConfig Configuration values that override the container image Dockerfile
     * settings.
     * For more information, see [Container image
     * settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms) .
     */
    override fun imageConfig(imageConfig: IResolvable) {
      cdkBuilder.imageConfig(imageConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param imageConfig Configuration values that override the container image Dockerfile
     * settings.
     * For more information, see [Container image
     * settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms) .
     */
    override fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty) {
      cdkBuilder.imageConfig(imageConfig.let(CfnFunction.ImageConfigProperty.Companion::unwrap))
    }

    /**
     * @param imageConfig Configuration values that override the container image Dockerfile
     * settings.
     * For more information, see [Container image
     * settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1997324bc2087618fc0e50de6b9eed554e767b3bbda6d845bbee3db1be1277e6")
    override fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty.Builder.() -> Unit): Unit
        = imageConfig(CfnFunction.ImageConfigProperty(imageConfig))

    /**
     * @param kmsKeyArn The ARN of the AWS Key Management Service ( AWS KMS ) customer managed key
     * that's used to encrypt the following resources:.
     * * The function's [environment
     * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-encryption)
     * .
     * * The function's [Lambda
     * SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-security.html) snapshots.
     * * When used with `SourceKMSKeyArn` , the unzipped version of the .zip deployment package
     * that's used for function invocations. For more information, see [Specifying a customer managed
     * key for
     * Lambda](https://docs.aws.amazon.com/lambda/latest/dg/encrypt-zip-package.html#enable-zip-custom-encryption)
     * .
     * * The optimized version of the container image that's used for function invocations. Note
     * that this is not the same key that's used to protect your container image in the Amazon Elastic
     * Container Registry (Amazon ECR). For more information, see [Function
     * lifecycle](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-lifecycle) .
     *
     * If you don't provide a customer managed key, Lambda uses an [AWS owned
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-owned-cmk) or an
     * [AWS managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk) .
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param layers A list of [function
     * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
     * function's execution environment. Specify each layer by its ARN, including the version.
     */
    override fun layers(layers: List<String>) {
      cdkBuilder.layers(layers)
    }

    /**
     * @param layers A list of [function
     * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
     * function's execution environment. Specify each layer by its ARN, including the version.
     */
    override fun layers(vararg layers: String): Unit = layers(layers.toList())

    /**
     * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings.
     */
    override fun loggingConfig(loggingConfig: IResolvable) {
      cdkBuilder.loggingConfig(loggingConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings.
     */
    override fun loggingConfig(loggingConfig: CfnFunction.LoggingConfigProperty) {
      cdkBuilder.loggingConfig(loggingConfig.let(CfnFunction.LoggingConfigProperty.Companion::unwrap))
    }

    /**
     * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec44b63b2176f8c25e5e01fcf663beca7e89dabaed7dd493d681fa5644914e19")
    override fun loggingConfig(loggingConfig: CfnFunction.LoggingConfigProperty.Builder.() -> Unit):
        Unit = loggingConfig(CfnFunction.LoggingConfigProperty(loggingConfig))

    /**
     * @param memorySize The amount of [memory available to the
     * function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
     * at runtime. Increasing the function memory also increases its CPU allocation. The default value
     * is 128 MB. The value can be any multiple of 1 MB. Note that new AWS accounts have reduced
     * concurrency and memory quotas. AWS raises these quotas automatically based on your usage. You
     * can also request a quota increase.
     */
    override fun memorySize(memorySize: Number) {
      cdkBuilder.memorySize(memorySize)
    }

    /**
     * @param packageType The type of deployment package.
     * Set to `Image` for container image and set `Zip` for .zip file archive.
     */
    override fun packageType(packageType: String) {
      cdkBuilder.packageType(packageType)
    }

    /**
     * @param recursiveLoop The status of your function's recursive loop detection configuration.
     * When this value is set to `Allow` and Lambda detects your function being invoked as part of a
     * recursive loop, it doesn't take any action.
     *
     * When this value is set to `Terminate` and Lambda detects your function being invoked as part
     * of a recursive loop, it stops your function being invoked and notifies you.
     */
    override fun recursiveLoop(recursiveLoop: String) {
      cdkBuilder.recursiveLoop(recursiveLoop)
    }

    /**
     * @param reservedConcurrentExecutions The number of simultaneous executions to reserve for the
     * function.
     */
    override fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
      cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    /**
     * @param role The Amazon Resource Name (ARN) of the function's execution role. 
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * @param runtime The identifier of the function's
     * [runtime](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Runtime is
     * required if the deployment package is a .zip file archive. Specifying a runtime results in an
     * error if you're deploying a function using a container image.
     * The following list includes deprecated runtimes. Lambda blocks creating new functions and
     * updating existing functions shortly after each runtime is deprecated. For more information, see
     * [Runtime use after
     * deprecation](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-deprecation-levels)
     * .
     *
     * For a list of all currently supported runtimes, see [Supported
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtimes-supported)
     * .
     */
    override fun runtime(runtime: String) {
      cdkBuilder.runtime(runtime)
    }

    /**
     * @param runtimeManagementConfig Sets the runtime management configuration for a function's
     * version.
     * For more information, see [Runtime
     * updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html) .
     */
    override fun runtimeManagementConfig(runtimeManagementConfig: IResolvable) {
      cdkBuilder.runtimeManagementConfig(runtimeManagementConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param runtimeManagementConfig Sets the runtime management configuration for a function's
     * version.
     * For more information, see [Runtime
     * updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html) .
     */
    override
        fun runtimeManagementConfig(runtimeManagementConfig: CfnFunction.RuntimeManagementConfigProperty) {
      cdkBuilder.runtimeManagementConfig(runtimeManagementConfig.let(CfnFunction.RuntimeManagementConfigProperty.Companion::unwrap))
    }

    /**
     * @param runtimeManagementConfig Sets the runtime management configuration for a function's
     * version.
     * For more information, see [Runtime
     * updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee237fa0a46e8520d21d94c5b1083490aad6f8069ebae77e7cc99088187b3da4")
    override
        fun runtimeManagementConfig(runtimeManagementConfig: CfnFunction.RuntimeManagementConfigProperty.Builder.() -> Unit):
        Unit =
        runtimeManagementConfig(CfnFunction.RuntimeManagementConfigProperty(runtimeManagementConfig))

    /**
     * @param snapStart The function's [AWS Lambda
     * SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
     */
    override fun snapStart(snapStart: IResolvable) {
      cdkBuilder.snapStart(snapStart.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param snapStart The function's [AWS Lambda
     * SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
     */
    override fun snapStart(snapStart: CfnFunction.SnapStartProperty) {
      cdkBuilder.snapStart(snapStart.let(CfnFunction.SnapStartProperty.Companion::unwrap))
    }

    /**
     * @param snapStart The function's [AWS Lambda
     * SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3c406d178cea826eb1e4103e92ba770b5f74b157127cf053b280c97a7ef5cbc")
    override fun snapStart(snapStart: CfnFunction.SnapStartProperty.Builder.() -> Unit): Unit =
        snapStart(CfnFunction.SnapStartProperty(snapStart))

    /**
     * @param tags A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to
     * apply to the function.
     *
     * You must have the `lambda:TagResource` , `lambda:UntagResource` , and `lambda:ListTags`
     * permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to
     * apply to the function.
     *
     * You must have the `lambda:TagResource` , `lambda:UntagResource` , and `lambda:ListTags`
     * permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param timeout The amount of time (in seconds) that Lambda allows a function to run before
     * stopping it.
     * The default is 3 seconds. The maximum allowed value is 900 seconds. For more information, see
     * [Lambda execution
     * environment](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-context.html) .
     */
    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    /**
     * @param tracingConfig Set `Mode` to `Active` to sample and trace a subset of incoming requests
     * with [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
     */
    override fun tracingConfig(tracingConfig: IResolvable) {
      cdkBuilder.tracingConfig(tracingConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tracingConfig Set `Mode` to `Active` to sample and trace a subset of incoming requests
     * with [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
     */
    override fun tracingConfig(tracingConfig: CfnFunction.TracingConfigProperty) {
      cdkBuilder.tracingConfig(tracingConfig.let(CfnFunction.TracingConfigProperty.Companion::unwrap))
    }

    /**
     * @param tracingConfig Set `Mode` to `Active` to sample and trace a subset of incoming requests
     * with [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1617c559ff9d0a323cae6bd48c5daadfd680645588ee9571a1adb94b84a4ce89")
    override fun tracingConfig(tracingConfig: CfnFunction.TracingConfigProperty.Builder.() -> Unit):
        Unit = tracingConfig(CfnFunction.TracingConfigProperty(tracingConfig))

    /**
     * @param vpcConfig For network connectivity to AWS resources in a VPC, specify a list of
     * security groups and subnets in the VPC.
     * When you connect a function to a VPC, it can access resources and the internet only through
     * that VPC. For more information, see [Configuring a Lambda function to access resources in a
     * VPC](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html) .
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcConfig For network connectivity to AWS resources in a VPC, specify a list of
     * security groups and subnets in the VPC.
     * When you connect a function to a VPC, it can access resources and the internet only through
     * that VPC. For more information, see [Configuring a Lambda function to access resources in a
     * VPC](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html) .
     */
    override fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnFunction.VpcConfigProperty.Companion::unwrap))
    }

    /**
     * @param vpcConfig For network connectivity to AWS resources in a VPC, specify a list of
     * security groups and subnets in the VPC.
     * When you connect a function to a VPC, it can access resources and the internet only through
     * that VPC. For more information, see [Configuring a Lambda function to access resources in a
     * VPC](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac174c422fe09fe59e61bc17b79df1128fc471b376ea523d527a49b2d14fb1fc")
    override fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnFunction.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.lambda.CfnFunctionProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.CfnFunctionProps,
  ) : CdkObject(cdkObject),
      CfnFunctionProps {
    /**
     * The instruction set architecture that the function supports.
     *
     * Enter a string array with one of the valid values (arm64 or x86_64). The default value is
     * `x86_64` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-architectures)
     */
    override fun architectures(): List<String> = unwrap(this).getArchitectures() ?: emptyList()

    /**
     * The code for the function. You can define your function code in multiple ways:.
     *
     * * For .zip deployment packages, you can specify the Amazon S3 location of the .zip file in
     * the `S3Bucket` , `S3Key` , and `S3ObjectVersion` properties.
     * * For .zip deployment packages, you can alternatively define the function code inline in the
     * `ZipFile` property. This method works only for Node.js and Python functions.
     * * For container images, specify the URI of your container image in the Amazon ECR registry in
     * the `ImageUri` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
     */
    override fun code(): Any = unwrap(this).getCode()

    /**
     * To enable code signing for this function, specify the ARN of a code-signing configuration.
     *
     * A code-signing configuration
     * includes a set of signing profiles, which define the trusted publishers for this function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-codesigningconfigarn)
     */
    override fun codeSigningConfigArn(): String? = unwrap(this).getCodeSigningConfigArn()

    /**
     * A dead-letter queue configuration that specifies the queue or topic where Lambda sends
     * asynchronous events when they fail processing.
     *
     * For more information, see [Dead-letter
     * queues](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-dlq) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-deadletterconfig)
     */
    override fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

    /**
     * A description of the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Environment variables that are accessible from function code during execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
     */
    override fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * The size of the function's `/tmp` directory in MB.
     *
     * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-ephemeralstorage)
     */
    override fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

    /**
     * Connection settings for an Amazon EFS file system.
     *
     * To connect a function to a file system, a mount target must be available in every
     * Availability Zone that your function connects to. If your template contains an
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is
     * created or updated before the function.
     *
     * For more information about using the `DependsOn` attribute, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
     */
    override fun fileSystemConfigs(): Any? = unwrap(this).getFileSystemConfigs()

    /**
     * The name of the Lambda function, up to 64 characters in length.
     *
     * If you don't specify a name, AWS CloudFormation generates one.
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname)
     */
    override fun functionName(): String? = unwrap(this).getFunctionName()

    /**
     * The name of the method within your code that Lambda calls to run your function.
     *
     * Handler is required if the deployment package is a .zip file archive. The format includes the
     * file name. It can also include namespaces and other qualifiers, depending on the runtime. For
     * more information, see [Lambda programming
     * model](https://docs.aws.amazon.com/lambda/latest/dg/foundation-progmodel.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler)
     */
    override fun handler(): String? = unwrap(this).getHandler()

    /**
     * Configuration values that override the container image Dockerfile settings.
     *
     * For more information, see [Container image
     * settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-imageconfig)
     */
    override fun imageConfig(): Any? = unwrap(this).getImageConfig()

    /**
     * The ARN of the AWS Key Management Service ( AWS KMS ) customer managed key that's used to
     * encrypt the following resources:.
     *
     * * The function's [environment
     * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-encryption)
     * .
     * * The function's [Lambda
     * SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-security.html) snapshots.
     * * When used with `SourceKMSKeyArn` , the unzipped version of the .zip deployment package
     * that's used for function invocations. For more information, see [Specifying a customer managed
     * key for
     * Lambda](https://docs.aws.amazon.com/lambda/latest/dg/encrypt-zip-package.html#enable-zip-custom-encryption)
     * .
     * * The optimized version of the container image that's used for function invocations. Note
     * that this is not the same key that's used to protect your container image in the Amazon Elastic
     * Container Registry (Amazon ECR). For more information, see [Function
     * lifecycle](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-lifecycle) .
     *
     * If you don't provide a customer managed key, Lambda uses an [AWS owned
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-owned-cmk) or an
     * [AWS managed
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn)
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * A list of [function
     * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
     * function's execution environment. Specify each layer by its ARN, including the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-layers)
     */
    override fun layers(): List<String> = unwrap(this).getLayers() ?: emptyList()

    /**
     * The function's Amazon CloudWatch Logs configuration settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-loggingconfig)
     */
    override fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

    /**
     * The amount of [memory available to the
     * function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
     * at runtime. Increasing the function memory also increases its CPU allocation. The default value
     * is 128 MB. The value can be any multiple of 1 MB. Note that new AWS accounts have reduced
     * concurrency and memory quotas. AWS raises these quotas automatically based on your usage. You
     * can also request a quota increase.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize)
     */
    override fun memorySize(): Number? = unwrap(this).getMemorySize()

    /**
     * The type of deployment package.
     *
     * Set to `Image` for container image and set `Zip` for .zip file archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-packagetype)
     */
    override fun packageType(): String? = unwrap(this).getPackageType()

    /**
     * The status of your function's recursive loop detection configuration.
     *
     * When this value is set to `Allow` and Lambda detects your function being invoked as part of a
     * recursive loop, it doesn't take any action.
     *
     * When this value is set to `Terminate` and Lambda detects your function being invoked as part
     * of a recursive loop, it stops your function being invoked and notifies you.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-recursiveloop)
     */
    override fun recursiveLoop(): String? = unwrap(this).getRecursiveLoop()

    /**
     * The number of simultaneous executions to reserve for the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions)
     */
    override fun reservedConcurrentExecutions(): Number? =
        unwrap(this).getReservedConcurrentExecutions()

    /**
     * The Amazon Resource Name (ARN) of the function's execution role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role)
     */
    override fun role(): String = unwrap(this).getRole()

    /**
     * The identifier of the function's
     * [runtime](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Runtime is
     * required if the deployment package is a .zip file archive. Specifying a runtime results in an
     * error if you're deploying a function using a container image.
     *
     * The following list includes deprecated runtimes. Lambda blocks creating new functions and
     * updating existing functions shortly after each runtime is deprecated. For more information, see
     * [Runtime use after
     * deprecation](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-deprecation-levels)
     * .
     *
     * For a list of all currently supported runtimes, see [Supported
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtimes-supported)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime)
     */
    override fun runtime(): String? = unwrap(this).getRuntime()

    /**
     * Sets the runtime management configuration for a function's version.
     *
     * For more information, see [Runtime
     * updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtimemanagementconfig)
     */
    override fun runtimeManagementConfig(): Any? = unwrap(this).getRuntimeManagementConfig()

    /**
     * The function's [AWS Lambda
     * SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-snapstart)
     */
    override fun snapStart(): Any? = unwrap(this).getSnapStart()

    /**
     * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to the
     * function.
     *
     *
     * You must have the `lambda:TagResource` , `lambda:UntagResource` , and `lambda:ListTags`
     * permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The amount of time (in seconds) that Lambda allows a function to run before stopping it.
     *
     * The default is 3 seconds. The maximum allowed value is 900 seconds. For more information, see
     * [Lambda execution
     * environment](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-context.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout)
     */
    override fun timeout(): Number? = unwrap(this).getTimeout()

    /**
     * Set `Mode` to `Active` to sample and trace a subset of incoming requests with
     * [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
     */
    override fun tracingConfig(): Any? = unwrap(this).getTracingConfig()

    /**
     * For network connectivity to AWS resources in a VPC, specify a list of security groups and
     * subnets in the VPC.
     *
     * When you connect a function to a VPC, it can access resources and the internet only through
     * that VPC. For more information, see [Configuring a Lambda function to access resources in a
     * VPC](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
     */
    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFunctionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunctionProps):
        CfnFunctionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFunctionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionProps):
        software.amazon.awscdk.services.lambda.CfnFunctionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.CfnFunctionProps
  }
}
