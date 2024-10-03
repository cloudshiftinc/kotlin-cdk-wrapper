@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Lambda::Function` resource creates a Lambda function.
 *
 * To create a function, you need a [deployment
 * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) and an [execution
 * role](https://docs.aws.amazon.com/lambda/latest/dg/lambda-intro-execution-role.html) . The
 * deployment package is a .zip file archive or container image that contains your function code. The
 * execution role grants the function permission to use AWS services, such as Amazon CloudWatch Logs
 * for log streaming and AWS X-Ray for request tracing.
 *
 * You set the package type to `Image` if the deployment package is a [container
 * image](https://docs.aws.amazon.com/lambda/latest/dg/lambda-images.html) . For these functions,
 * include the URI of the container image in the Amazon ECR registry in the [`ImageUri` property of the
 * `Code`
 * property](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-imageuri)
 * . You do not need to specify the handler and runtime properties.
 *
 * You set the package type to `Zip` if the deployment package is a [.zip file
 * archive](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html#gettingstarted-package-zip)
 * . For these functions, specify the Amazon S3 location of your .zip file in the `Code` property.
 * Alternatively, for Node.js and Python functions, you can define your function inline in the
 * [`ZipFile` property of the `Code`
 * property](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-zipfile)
 * . In both cases, you must also specify the handler and runtime properties.
 *
 * You can use [code
 * signing](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html) if your
 * deployment package is a .zip file archive. To enable code signing for this function, specify the ARN
 * of a code-signing configuration. When a user attempts to deploy a code package with
 * `UpdateFunctionCode` , Lambda checks that the code package has a valid signature from a trusted
 * publisher. The code-signing configuration includes a set of signing profiles, which define the
 * trusted publishers for this function.
 *
 * When you update a `AWS::Lambda::Function` resource, CloudFormation calls the
 * [UpdateFunctionConfiguration](https://docs.aws.amazon.com/lambda/latest/api/API_UpdateFunctionConfiguration.html)
 * and [UpdateFunctionCode](https://docs.aws.amazon.com/lambda/latest/api/API_UpdateFunctionCode.html)
 * Lambda APIs under the hood. Because these calls happen sequentially, and invocations can happen
 * between these calls, your function may encounter errors in the time between the calls. For example,
 * if you remove an environment variable, and the code that references that environment variable in the
 * same CloudFormation update, you may see invocation errors related to a missing environment variable.
 * To work around this, you can invoke your function against a version or alias by default, rather than
 * the `$LATEST` version.
 *
 * Note that you configure [provisioned
 * concurrency](https://docs.aws.amazon.com/lambda/latest/dg/provisioned-concurrency.html) on a
 * `AWS::Lambda::Version` or a `AWS::Lambda::Alias` .
 *
 * For a complete introduction to Lambda functions, see [What is
 * Lambda?](https://docs.aws.amazon.com/lambda/latest/dg/lambda-welcome.html) in the *Lambda developer
 * guide.*
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * CfnFunction cfnFunction = CfnFunction.Builder.create(this, "MyCfnFunction")
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
public open class CfnFunction(
  cdkObject: software.amazon.awscdk.services.lambda.CfnFunction,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFunctionProps,
  ) :
      this(software.amazon.awscdk.services.lambda.CfnFunction(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFunctionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFunctionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFunctionProps(props)
  )

  /**
   * The instruction set architecture that the function supports.
   */
  public open fun architectures(): List<String> = unwrap(this).getArchitectures() ?: emptyList()

  /**
   * The instruction set architecture that the function supports.
   */
  public open fun architectures(`value`: List<String>) {
    unwrap(this).setArchitectures(`value`)
  }

  /**
   * The instruction set architecture that the function supports.
   */
  public open fun architectures(vararg `value`: String): Unit = architectures(`value`.toList())

  /**
   *
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The function's [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
   * setting.
   */
  public open fun attrSnapStartResponse(): IResolvable =
      unwrap(this).getAttrSnapStartResponse().let(IResolvable::wrap)

  /**
   * When set to `PublishedVersions`, Lambda creates a snapshot of the execution environment when
   * you publish a function version.
   */
  public open fun attrSnapStartResponseApplyOn(): String =
      unwrap(this).getAttrSnapStartResponseApplyOn()

  /**
   * When you provide a [qualified Amazon Resource Name
   * (ARN)](https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using),
   * this response element indicates whether SnapStart is activated for the specified function version.
   */
  public open fun attrSnapStartResponseOptimizationStatus(): String =
      unwrap(this).getAttrSnapStartResponseOptimizationStatus()

  /**
   * The [deployment
   * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
   * function. To deploy a function defined as a container image, you specify the location of a
   * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
   * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
   * function code inline in the template.  Changes to a deployment package in Amazon S3 or a container
   * image in ECR are not detected automatically during stack updates. To update the function code,
   * change the object key or version in the template.
   */
  public open fun code(): Any = unwrap(this).getCode()

  /**
   * The [deployment
   * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
   * function. To deploy a function defined as a container image, you specify the location of a
   * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
   * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
   * function code inline in the template.  Changes to a deployment package in Amazon S3 or a container
   * image in ECR are not detected automatically during stack updates. To update the function code,
   * change the object key or version in the template.
   */
  public open fun code(`value`: IResolvable) {
    unwrap(this).setCode(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The [deployment
   * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
   * function. To deploy a function defined as a container image, you specify the location of a
   * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
   * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
   * function code inline in the template.  Changes to a deployment package in Amazon S3 or a container
   * image in ECR are not detected automatically during stack updates. To update the function code,
   * change the object key or version in the template.
   */
  public open fun code(`value`: CodeProperty) {
    unwrap(this).setCode(`value`.let(CodeProperty.Companion::unwrap))
  }

  /**
   * The [deployment
   * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
   * function. To deploy a function defined as a container image, you specify the location of a
   * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
   * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
   * function code inline in the template.  Changes to a deployment package in Amazon S3 or a container
   * image in ECR are not detected automatically during stack updates. To update the function code,
   * change the object key or version in the template.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("27bc03c11962a84638837c61ff105a539b3caa5340528b2ffd9166edaf307caf")
  public open fun code(`value`: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(`value`))

  /**
   * To enable code signing for this function, specify the ARN of a code-signing configuration.
   */
  public open fun codeSigningConfigArn(): String? = unwrap(this).getCodeSigningConfigArn()

  /**
   * To enable code signing for this function, specify the ARN of a code-signing configuration.
   */
  public open fun codeSigningConfigArn(`value`: String) {
    unwrap(this).setCodeSigningConfigArn(`value`)
  }

  /**
   * The [dead-letter queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq)
   * for failed asynchronous invocations.
   */
  public open fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

  /**
   * The [dead-letter queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq)
   * for failed asynchronous invocations.
   */
  public open fun deadLetterConfig(`value`: IResolvable) {
    unwrap(this).setDeadLetterConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The [dead-letter queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq)
   * for failed asynchronous invocations.
   */
  public open fun deadLetterConfig(`value`: DeadLetterConfigProperty) {
    unwrap(this).setDeadLetterConfig(`value`.let(DeadLetterConfigProperty.Companion::unwrap))
  }

  /**
   * The [dead-letter queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq)
   * for failed asynchronous invocations.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("82210f417735f1b21f06f2b9874c4d9202ac1920b45ba30cccd2d22bea5b339b")
  public open fun deadLetterConfig(`value`: DeadLetterConfigProperty.Builder.() -> Unit): Unit =
      deadLetterConfig(DeadLetterConfigProperty(`value`))

  /**
   * A description of the function.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the function.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * A function's environment variable settings.
   */
  public open fun environment(): Any? = unwrap(this).getEnvironment()

  /**
   * A function's environment variable settings.
   */
  public open fun environment(`value`: IResolvable) {
    unwrap(this).setEnvironment(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A function's environment variable settings.
   */
  public open fun environment(`value`: EnvironmentProperty) {
    unwrap(this).setEnvironment(`value`.let(EnvironmentProperty.Companion::unwrap))
  }

  /**
   * A function's environment variable settings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9fe4e1d1745bd46c7c4df960f9992721cd59f9fbb8b9b0bb9c79fd7087b565d")
  public open fun environment(`value`: EnvironmentProperty.Builder.() -> Unit): Unit =
      environment(EnvironmentProperty(`value`))

  /**
   * The size of the function's `/tmp` directory in MB.
   */
  public open fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

  /**
   * The size of the function's `/tmp` directory in MB.
   */
  public open fun ephemeralStorage(`value`: IResolvable) {
    unwrap(this).setEphemeralStorage(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The size of the function's `/tmp` directory in MB.
   */
  public open fun ephemeralStorage(`value`: EphemeralStorageProperty) {
    unwrap(this).setEphemeralStorage(`value`.let(EphemeralStorageProperty.Companion::unwrap))
  }

  /**
   * The size of the function's `/tmp` directory in MB.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("acc7854ae4ab271b192bd05cb811163e4ba1c027bc1dc787b933e05eb116688a")
  public open fun ephemeralStorage(`value`: EphemeralStorageProperty.Builder.() -> Unit): Unit =
      ephemeralStorage(EphemeralStorageProperty(`value`))

  /**
   * Connection settings for an Amazon EFS file system.
   */
  public open fun fileSystemConfigs(): Any? = unwrap(this).getFileSystemConfigs()

  /**
   * Connection settings for an Amazon EFS file system.
   */
  public open fun fileSystemConfigs(`value`: IResolvable) {
    unwrap(this).setFileSystemConfigs(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Connection settings for an Amazon EFS file system.
   */
  public open fun fileSystemConfigs(`value`: List<Any>) {
    unwrap(this).setFileSystemConfigs(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Connection settings for an Amazon EFS file system.
   */
  public open fun fileSystemConfigs(vararg `value`: Any): Unit = fileSystemConfigs(`value`.toList())

  /**
   * The name of the Lambda function, up to 64 characters in length.
   */
  public open fun functionName(): String? = unwrap(this).getFunctionName()

  /**
   * The name of the Lambda function, up to 64 characters in length.
   */
  public open fun functionName(`value`: String) {
    unwrap(this).setFunctionName(`value`)
  }

  /**
   * The name of the method within your code that Lambda calls to run your function.
   */
  public open fun handler(): String? = unwrap(this).getHandler()

  /**
   * The name of the method within your code that Lambda calls to run your function.
   */
  public open fun handler(`value`: String) {
    unwrap(this).setHandler(`value`)
  }

  /**
   * Configuration values that override the container image Dockerfile settings.
   */
  public open fun imageConfig(): Any? = unwrap(this).getImageConfig()

  /**
   * Configuration values that override the container image Dockerfile settings.
   */
  public open fun imageConfig(`value`: IResolvable) {
    unwrap(this).setImageConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration values that override the container image Dockerfile settings.
   */
  public open fun imageConfig(`value`: ImageConfigProperty) {
    unwrap(this).setImageConfig(`value`.let(ImageConfigProperty.Companion::unwrap))
  }

  /**
   * Configuration values that override the container image Dockerfile settings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("26f56b1f77d999470b731c5bf8d941d0223619013aea217d35f49664aad930fe")
  public open fun imageConfig(`value`: ImageConfigProperty.Builder.() -> Unit): Unit =
      imageConfig(ImageConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ARN of the KMSlong (KMS) customer managed key that's used to encrypt your function's
   * [environment
   * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-encryption).
   * When [Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-security.html) is
   * activated, Lambda also uses this key is to encrypt your function's snapshot. If you deploy your
   * function using a container image, Lambda also uses this key to encrypt your function when it's
   * deployed. Note that this is not the same key that's used to protect your container image in the
   * Amazon Elastic Container Registry (Amazon ECR). If you don't provide a customer managed key,
   * Lambda uses a default service key.
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The ARN of the KMSlong (KMS) customer managed key that's used to encrypt your function's
   * [environment
   * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-encryption).
   * When [Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-security.html) is
   * activated, Lambda also uses this key is to encrypt your function's snapshot. If you deploy your
   * function using a container image, Lambda also uses this key to encrypt your function when it's
   * deployed. Note that this is not the same key that's used to protect your container image in the
   * Amazon Elastic Container Registry (Amazon ECR). If you don't provide a customer managed key,
   * Lambda uses a default service key.
   */
  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  /**
   * A list of [function
   * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
   * function's execution environment. Specify each layer by its ARN, including the version.
   */
  public open fun layers(): List<String> = unwrap(this).getLayers() ?: emptyList()

  /**
   * A list of [function
   * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
   * function's execution environment. Specify each layer by its ARN, including the version.
   */
  public open fun layers(`value`: List<String>) {
    unwrap(this).setLayers(`value`)
  }

  /**
   * A list of [function
   * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
   * function's execution environment. Specify each layer by its ARN, including the version.
   */
  public open fun layers(vararg `value`: String): Unit = layers(`value`.toList())

  /**
   * The function's Amazon CloudWatch Logs configuration settings.
   */
  public open fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

  /**
   * The function's Amazon CloudWatch Logs configuration settings.
   */
  public open fun loggingConfig(`value`: IResolvable) {
    unwrap(this).setLoggingConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The function's Amazon CloudWatch Logs configuration settings.
   */
  public open fun loggingConfig(`value`: LoggingConfigProperty) {
    unwrap(this).setLoggingConfig(`value`.let(LoggingConfigProperty.Companion::unwrap))
  }

  /**
   * The function's Amazon CloudWatch Logs configuration settings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6b77c5f63505f2d280810158758ac608f76c842b8ad83359f2a2f0ec20c91736")
  public open fun loggingConfig(`value`: LoggingConfigProperty.Builder.() -> Unit): Unit =
      loggingConfig(LoggingConfigProperty(`value`))

  /**
   * The amount of [memory available to the
   * function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
   * at runtime. Increasing the function memory also increases its CPU allocation. The default value is
   * 128 MB. The value can be any multiple of 1 MB. Note that new AWS accounts have reduced concurrency
   * and memory quotas. AWS raises these quotas automatically based on your usage. You can also request
   * a quota increase.
   */
  public open fun memorySize(): Number? = unwrap(this).getMemorySize()

  /**
   * The amount of [memory available to the
   * function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
   * at runtime. Increasing the function memory also increases its CPU allocation. The default value is
   * 128 MB. The value can be any multiple of 1 MB. Note that new AWS accounts have reduced concurrency
   * and memory quotas. AWS raises these quotas automatically based on your usage. You can also request
   * a quota increase.
   */
  public open fun memorySize(`value`: Number) {
    unwrap(this).setMemorySize(`value`)
  }

  /**
   * The type of deployment package.
   */
  public open fun packageType(): String? = unwrap(this).getPackageType()

  /**
   * The type of deployment package.
   */
  public open fun packageType(`value`: String) {
    unwrap(this).setPackageType(`value`)
  }

  /**
   * This property is set to terminate unintended recursions.
   */
  public open fun recursiveLoop(): String? = unwrap(this).getRecursiveLoop()

  /**
   * This property is set to terminate unintended recursions.
   */
  public open fun recursiveLoop(`value`: String) {
    unwrap(this).setRecursiveLoop(`value`)
  }

  /**
   * The number of simultaneous executions to reserve for the function.
   */
  public open fun reservedConcurrentExecutions(): Number? =
      unwrap(this).getReservedConcurrentExecutions()

  /**
   * The number of simultaneous executions to reserve for the function.
   */
  public open fun reservedConcurrentExecutions(`value`: Number) {
    unwrap(this).setReservedConcurrentExecutions(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the function's execution role.
   */
  public open fun role(): String = unwrap(this).getRole()

  /**
   * The Amazon Resource Name (ARN) of the function's execution role.
   */
  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  /**
   * The identifier of the function's
   * [runtime](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html). Runtime is required
   * if the deployment package is a .zip file archive. Specifying a runtime results in an error if
   * you're deploying a function using a container image.  The following list includes deprecated
   * runtimes. Lambda blocks creating new functions and updating existing functions shortly after each
   * runtime is deprecated. For more information, see [Runtime use after
   * deprecation](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-deprecation-levels).
   *  For a list of all currently supported runtimes, see [Supported
   * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtimes-supported).
   */
  public open fun runtime(): String? = unwrap(this).getRuntime()

  /**
   * The identifier of the function's
   * [runtime](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html). Runtime is required
   * if the deployment package is a .zip file archive. Specifying a runtime results in an error if
   * you're deploying a function using a container image.  The following list includes deprecated
   * runtimes. Lambda blocks creating new functions and updating existing functions shortly after each
   * runtime is deprecated. For more information, see [Runtime use after
   * deprecation](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-deprecation-levels).
   *  For a list of all currently supported runtimes, see [Supported
   * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtimes-supported).
   */
  public open fun runtime(`value`: String) {
    unwrap(this).setRuntime(`value`)
  }

  /**
   * Sets the runtime management configuration for a function's version.
   */
  public open fun runtimeManagementConfig(): Any? = unwrap(this).getRuntimeManagementConfig()

  /**
   * Sets the runtime management configuration for a function's version.
   */
  public open fun runtimeManagementConfig(`value`: IResolvable) {
    unwrap(this).setRuntimeManagementConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Sets the runtime management configuration for a function's version.
   */
  public open fun runtimeManagementConfig(`value`: RuntimeManagementConfigProperty) {
    unwrap(this).setRuntimeManagementConfig(`value`.let(RuntimeManagementConfigProperty.Companion::unwrap))
  }

  /**
   * Sets the runtime management configuration for a function's version.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1edbee511052488d686a699ce8c30650858b925fc6fbd52d15954522d9e5e58a")
  public open
      fun runtimeManagementConfig(`value`: RuntimeManagementConfigProperty.Builder.() -> Unit): Unit
      = runtimeManagementConfig(RuntimeManagementConfigProperty(`value`))

  /**
   * The function's [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
   * setting.
   */
  public open fun snapStart(): Any? = unwrap(this).getSnapStart()

  /**
   * The function's [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
   * setting.
   */
  public open fun snapStart(`value`: IResolvable) {
    unwrap(this).setSnapStart(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The function's [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
   * setting.
   */
  public open fun snapStart(`value`: SnapStartProperty) {
    unwrap(this).setSnapStart(`value`.let(SnapStartProperty.Companion::unwrap))
  }

  /**
   * The function's [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
   * setting.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("81b72b2b8362d1a960276e8abfc120c20bed9e40f1708761e070ce63675b848f")
  public open fun snapStart(`value`: SnapStartProperty.Builder.() -> Unit): Unit =
      snapStart(SnapStartProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to the
   * function.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to the
   * function.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to the
   * function.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The amount of time (in seconds) that Lambda allows a function to run before stopping it.
   */
  public open fun timeout(): Number? = unwrap(this).getTimeout()

  /**
   * The amount of time (in seconds) that Lambda allows a function to run before stopping it.
   */
  public open fun timeout(`value`: Number) {
    unwrap(this).setTimeout(`value`)
  }

  /**
   * The function's [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing
   * configuration. To sample and record incoming requests, set `Mode` to `Active`.
   */
  public open fun tracingConfig(): Any? = unwrap(this).getTracingConfig()

  /**
   * The function's [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing
   * configuration. To sample and record incoming requests, set `Mode` to `Active`.
   */
  public open fun tracingConfig(`value`: IResolvable) {
    unwrap(this).setTracingConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The function's [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing
   * configuration. To sample and record incoming requests, set `Mode` to `Active`.
   */
  public open fun tracingConfig(`value`: TracingConfigProperty) {
    unwrap(this).setTracingConfig(`value`.let(TracingConfigProperty.Companion::unwrap))
  }

  /**
   * The function's [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing
   * configuration. To sample and record incoming requests, set `Mode` to `Active`.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("26af4707ceb8d25c09985966f19fe8fc2018338e50c30202b6e3274e10effb61")
  public open fun tracingConfig(`value`: TracingConfigProperty.Builder.() -> Unit): Unit =
      tracingConfig(TracingConfigProperty(`value`))

  /**
   * The VPC security groups and subnets that are attached to a Lambda function.
   */
  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * The VPC security groups and subnets that are attached to a Lambda function.
   */
  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The VPC security groups and subnets that are attached to a Lambda function.
   */
  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty.Companion::unwrap))
  }

  /**
   * The VPC security groups and subnets that are attached to a Lambda function.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("61a85c6b04d196acfcabd6044074bf46c225ba9da5df8f8acc431959fe2fdf45")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.CfnFunction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The instruction set architecture that the function supports.
     *
     * Enter a string array with one of the valid values (arm64 or x86_64). The default value is
     * `x86_64`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-architectures)
     * @param architectures The instruction set architecture that the function supports. 
     */
    public fun architectures(architectures: List<String>)

    /**
     * The instruction set architecture that the function supports.
     *
     * Enter a string array with one of the valid values (arm64 or x86_64). The default value is
     * `x86_64`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-architectures)
     * @param architectures The instruction set architecture that the function supports. 
     */
    public fun architectures(vararg architectures: String)

    /**
     * The [deployment
     * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
     * function. To deploy a function defined as a container image, you specify the location of a
     * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
     * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
     * function code inline in the template.  Changes to a deployment package in Amazon S3 or a
     * container image in ECR are not detected automatically during stack updates. To update the
     * function code, change the object key or version in the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
     * @param code The [deployment
     * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
     * function. To deploy a function defined as a container image, you specify the location of a
     * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
     * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
     * function code inline in the template.  Changes to a deployment package in Amazon S3 or a
     * container image in ECR are not detected automatically during stack updates. To update the
     * function code, change the object key or version in the template. 
     */
    public fun code(code: IResolvable)

    /**
     * The [deployment
     * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
     * function. To deploy a function defined as a container image, you specify the location of a
     * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
     * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
     * function code inline in the template.  Changes to a deployment package in Amazon S3 or a
     * container image in ECR are not detected automatically during stack updates. To update the
     * function code, change the object key or version in the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
     * @param code The [deployment
     * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
     * function. To deploy a function defined as a container image, you specify the location of a
     * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
     * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
     * function code inline in the template.  Changes to a deployment package in Amazon S3 or a
     * container image in ECR are not detected automatically during stack updates. To update the
     * function code, change the object key or version in the template. 
     */
    public fun code(code: CodeProperty)

    /**
     * The [deployment
     * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
     * function. To deploy a function defined as a container image, you specify the location of a
     * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
     * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
     * function code inline in the template.  Changes to a deployment package in Amazon S3 or a
     * container image in ECR are not detected automatically during stack updates. To update the
     * function code, change the object key or version in the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
     * @param code The [deployment
     * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
     * function. To deploy a function defined as a container image, you specify the location of a
     * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
     * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
     * function code inline in the template.  Changes to a deployment package in Amazon S3 or a
     * container image in ECR are not detected automatically during stack updates. To update the
     * function code, change the object key or version in the template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b3964a0b102134414b694f5e98f6d476e8117850de3823fb7471a38dd26e1f9")
    public fun code(code: CodeProperty.Builder.() -> Unit)

    /**
     * To enable code signing for this function, specify the ARN of a code-signing configuration.
     *
     * A code-signing configuration includes a set of signing profiles, which define the trusted
     * publishers for this function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-codesigningconfigarn)
     * @param codeSigningConfigArn To enable code signing for this function, specify the ARN of a
     * code-signing configuration. 
     */
    public fun codeSigningConfigArn(codeSigningConfigArn: String)

    /**
     * The [dead-letter
     * queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq) for failed
     * asynchronous invocations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-deadletterconfig)
     * @param deadLetterConfig The [dead-letter
     * queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq) for failed
     * asynchronous invocations. 
     */
    public fun deadLetterConfig(deadLetterConfig: IResolvable)

    /**
     * The [dead-letter
     * queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq) for failed
     * asynchronous invocations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-deadletterconfig)
     * @param deadLetterConfig The [dead-letter
     * queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq) for failed
     * asynchronous invocations. 
     */
    public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty)

    /**
     * The [dead-letter
     * queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq) for failed
     * asynchronous invocations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-deadletterconfig)
     * @param deadLetterConfig The [dead-letter
     * queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq) for failed
     * asynchronous invocations. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("752ac7117e2e0fbfe8b87e093fe0487ed1b922480901063ebbdf41963e1b11b9")
    public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit)

    /**
     * A description of the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description)
     * @param description A description of the function. 
     */
    public fun description(description: String)

    /**
     * A function's environment variable settings.
     *
     * You can use environment variables to adjust your function's behavior without updating code.
     * An environment variable is a pair of strings that are stored in a function's version-specific
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
     * @param environment A function's environment variable settings. 
     */
    public fun environment(environment: IResolvable)

    /**
     * A function's environment variable settings.
     *
     * You can use environment variables to adjust your function's behavior without updating code.
     * An environment variable is a pair of strings that are stored in a function's version-specific
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
     * @param environment A function's environment variable settings. 
     */
    public fun environment(environment: EnvironmentProperty)

    /**
     * A function's environment variable settings.
     *
     * You can use environment variables to adjust your function's behavior without updating code.
     * An environment variable is a pair of strings that are stored in a function's version-specific
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
     * @param environment A function's environment variable settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cc75bf28aacefddb8de924be12c3db391e03580ea8cdff98f770371dbd867af")
    public fun environment(environment: EnvironmentProperty.Builder.() -> Unit)

    /**
     * The size of the function's `/tmp` directory in MB.
     *
     * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-ephemeralstorage)
     * @param ephemeralStorage The size of the function's `/tmp` directory in MB. 
     */
    public fun ephemeralStorage(ephemeralStorage: IResolvable)

    /**
     * The size of the function's `/tmp` directory in MB.
     *
     * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-ephemeralstorage)
     * @param ephemeralStorage The size of the function's `/tmp` directory in MB. 
     */
    public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty)

    /**
     * The size of the function's `/tmp` directory in MB.
     *
     * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-ephemeralstorage)
     * @param ephemeralStorage The size of the function's `/tmp` directory in MB. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("267f185b4ef53e255fd2df4b6cf38e5767b7112a9894eb62b47a0d4071a3efd4")
    public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit)

    /**
     * Connection settings for an Amazon EFS file system.
     *
     * To connect a function to a file system, a mount target must be available in every
     * Availability Zone that your function connects to. If your template contains an
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is
     * created or updated before the function.
     * For more information about using the `DependsOn` attribute, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
     * @param fileSystemConfigs Connection settings for an Amazon EFS file system. 
     */
    public fun fileSystemConfigs(fileSystemConfigs: IResolvable)

    /**
     * Connection settings for an Amazon EFS file system.
     *
     * To connect a function to a file system, a mount target must be available in every
     * Availability Zone that your function connects to. If your template contains an
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is
     * created or updated before the function.
     * For more information about using the `DependsOn` attribute, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
     * @param fileSystemConfigs Connection settings for an Amazon EFS file system. 
     */
    public fun fileSystemConfigs(fileSystemConfigs: List<Any>)

    /**
     * Connection settings for an Amazon EFS file system.
     *
     * To connect a function to a file system, a mount target must be available in every
     * Availability Zone that your function connects to. If your template contains an
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is
     * created or updated before the function.
     * For more information about using the `DependsOn` attribute, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
     * @param fileSystemConfigs Connection settings for an Amazon EFS file system. 
     */
    public fun fileSystemConfigs(vararg fileSystemConfigs: Any)

    /**
     * The name of the Lambda function, up to 64 characters in length.
     *
     * If you don't specify a name, CFN generates one.
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname)
     * @param functionName The name of the Lambda function, up to 64 characters in length. 
     */
    public fun functionName(functionName: String)

    /**
     * The name of the method within your code that Lambda calls to run your function.
     *
     * Handler is required if the deployment package is a .zip file archive. The format includes the
     * file name. It can also include namespaces and other qualifiers, depending on the runtime. For
     * more information, see [Lambda programming
     * model](https://docs.aws.amazon.com/lambda/latest/dg/foundation-progmodel.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler)
     * @param handler The name of the method within your code that Lambda calls to run your
     * function. 
     */
    public fun handler(handler: String)

    /**
     * Configuration values that override the container image Dockerfile settings.
     *
     * For more information, see [Container image
     * settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-imageconfig)
     * @param imageConfig Configuration values that override the container image Dockerfile
     * settings. 
     */
    public fun imageConfig(imageConfig: IResolvable)

    /**
     * Configuration values that override the container image Dockerfile settings.
     *
     * For more information, see [Container image
     * settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-imageconfig)
     * @param imageConfig Configuration values that override the container image Dockerfile
     * settings. 
     */
    public fun imageConfig(imageConfig: ImageConfigProperty)

    /**
     * Configuration values that override the container image Dockerfile settings.
     *
     * For more information, see [Container image
     * settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-imageconfig)
     * @param imageConfig Configuration values that override the container image Dockerfile
     * settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57bb0976d52c1fa65255eccb2f6081a35e932dc8aec9c1d9a9796e8be0d63548")
    public fun imageConfig(imageConfig: ImageConfigProperty.Builder.() -> Unit)

    /**
     * The ARN of the KMSlong (KMS) customer managed key that's used to encrypt your function's
     * [environment
     * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-encryption).
     * When [Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-security.html) is
     * activated, Lambda also uses this key is to encrypt your function's snapshot. If you deploy your
     * function using a container image, Lambda also uses this key to encrypt your function when it's
     * deployed. Note that this is not the same key that's used to protect your container image in the
     * Amazon Elastic Container Registry (Amazon ECR). If you don't provide a customer managed key,
     * Lambda uses a default service key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn)
     * @param kmsKeyArn The ARN of the KMSlong (KMS) customer managed key that's used to encrypt
     * your function's [environment
     * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-encryption).
     * When [Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-security.html) is
     * activated, Lambda also uses this key is to encrypt your function's snapshot. If you deploy your
     * function using a container image, Lambda also uses this key to encrypt your function when it's
     * deployed. Note that this is not the same key that's used to protect your container image in the
     * Amazon Elastic Container Registry (Amazon ECR). If you don't provide a customer managed key,
     * Lambda uses a default service key. 
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * A list of [function
     * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
     * function's execution environment. Specify each layer by its ARN, including the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-layers)
     * @param layers A list of [function
     * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
     * function's execution environment. Specify each layer by its ARN, including the version. 
     */
    public fun layers(layers: List<String>)

    /**
     * A list of [function
     * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
     * function's execution environment. Specify each layer by its ARN, including the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-layers)
     * @param layers A list of [function
     * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
     * function's execution environment. Specify each layer by its ARN, including the version. 
     */
    public fun layers(vararg layers: String)

    /**
     * The function's Amazon CloudWatch Logs configuration settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-loggingconfig)
     * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings. 
     */
    public fun loggingConfig(loggingConfig: IResolvable)

    /**
     * The function's Amazon CloudWatch Logs configuration settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-loggingconfig)
     * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings. 
     */
    public fun loggingConfig(loggingConfig: LoggingConfigProperty)

    /**
     * The function's Amazon CloudWatch Logs configuration settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-loggingconfig)
     * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35a23952b1548ee98fba599d4723265cfca977fe42a79c55077816685417fdfa")
    public fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit)

    /**
     * The amount of [memory available to the
     * function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
     * at runtime. Increasing the function memory also increases its CPU allocation. The default value
     * is 128 MB. The value can be any multiple of 1 MB. Note that new AWS accounts have reduced
     * concurrency and memory quotas. AWS raises these quotas automatically based on your usage. You
     * can also request a quota increase.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize)
     * @param memorySize The amount of [memory available to the
     * function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
     * at runtime. Increasing the function memory also increases its CPU allocation. The default value
     * is 128 MB. The value can be any multiple of 1 MB. Note that new AWS accounts have reduced
     * concurrency and memory quotas. AWS raises these quotas automatically based on your usage. You
     * can also request a quota increase. 
     */
    public fun memorySize(memorySize: Number)

    /**
     * The type of deployment package.
     *
     * Set to `Image` for container image and set `Zip` for .zip file archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-packagetype)
     * @param packageType The type of deployment package. 
     */
    public fun packageType(packageType: String)

    /**
     * This property is set to terminate unintended recursions.
     *
     * If set to `Terminate`, Lambda detects and terminates unitended recursive loops. If set to
     * `Allow` Lambda lets recursions be and does not terminate it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-recursiveloop)
     * @param recursiveLoop This property is set to terminate unintended recursions. 
     */
    public fun recursiveLoop(recursiveLoop: String)

    /**
     * The number of simultaneous executions to reserve for the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions)
     * @param reservedConcurrentExecutions The number of simultaneous executions to reserve for the
     * function. 
     */
    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number)

    /**
     * The Amazon Resource Name (ARN) of the function's execution role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role)
     * @param role The Amazon Resource Name (ARN) of the function's execution role. 
     */
    public fun role(role: String)

    /**
     * The identifier of the function's
     * [runtime](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html). Runtime is
     * required if the deployment package is a .zip file archive. Specifying a runtime results in an
     * error if you're deploying a function using a container image.  The following list includes
     * deprecated runtimes. Lambda blocks creating new functions and updating existing functions
     * shortly after each runtime is deprecated. For more information, see [Runtime use after
     * deprecation](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-deprecation-levels).
     *  For a list of all currently supported runtimes, see [Supported
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtimes-supported).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime)
     * @param runtime The identifier of the function's
     * [runtime](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html). Runtime is
     * required if the deployment package is a .zip file archive. Specifying a runtime results in an
     * error if you're deploying a function using a container image.  The following list includes
     * deprecated runtimes. Lambda blocks creating new functions and updating existing functions
     * shortly after each runtime is deprecated. For more information, see [Runtime use after
     * deprecation](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-deprecation-levels).
     *  For a list of all currently supported runtimes, see [Supported
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtimes-supported).
     * 
     */
    public fun runtime(runtime: String)

    /**
     * Sets the runtime management configuration for a function's version.
     *
     * For more information, see [Runtime
     * updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtimemanagementconfig)
     * @param runtimeManagementConfig Sets the runtime management configuration for a function's
     * version. 
     */
    public fun runtimeManagementConfig(runtimeManagementConfig: IResolvable)

    /**
     * Sets the runtime management configuration for a function's version.
     *
     * For more information, see [Runtime
     * updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtimemanagementconfig)
     * @param runtimeManagementConfig Sets the runtime management configuration for a function's
     * version. 
     */
    public fun runtimeManagementConfig(runtimeManagementConfig: RuntimeManagementConfigProperty)

    /**
     * Sets the runtime management configuration for a function's version.
     *
     * For more information, see [Runtime
     * updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtimemanagementconfig)
     * @param runtimeManagementConfig Sets the runtime management configuration for a function's
     * version. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95a300663ca3f8b32e2befd34380c14ac3d734fe6d5c6a108d01ade64520be7b")
    public
        fun runtimeManagementConfig(runtimeManagementConfig: RuntimeManagementConfigProperty.Builder.() -> Unit)

    /**
     * The function's [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
     * setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-snapstart)
     * @param snapStart The function's
     * [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting. 
     */
    public fun snapStart(snapStart: IResolvable)

    /**
     * The function's [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
     * setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-snapstart)
     * @param snapStart The function's
     * [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting. 
     */
    public fun snapStart(snapStart: SnapStartProperty)

    /**
     * The function's [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
     * setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-snapstart)
     * @param snapStart The function's
     * [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2590028845f970506309395f8bc94970e797ab159c68443cb26ca01e9e8a449")
    public fun snapStart(snapStart: SnapStartProperty.Builder.() -> Unit)

    /**
     * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to the
     * function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags)
     * @param tags A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to
     * apply to the function. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to the
     * function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags)
     * @param tags A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to
     * apply to the function. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The amount of time (in seconds) that Lambda allows a function to run before stopping it.
     *
     * The default is 3 seconds. The maximum allowed value is 900 seconds. For more information, see
     * [Lambda execution
     * environment](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-context.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout)
     * @param timeout The amount of time (in seconds) that Lambda allows a function to run before
     * stopping it. 
     */
    public fun timeout(timeout: Number)

    /**
     * The function's [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing
     * configuration. To sample and record incoming requests, set `Mode` to `Active`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
     * @param tracingConfig The function's
     * [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing configuration. To
     * sample and record incoming requests, set `Mode` to `Active`. 
     */
    public fun tracingConfig(tracingConfig: IResolvable)

    /**
     * The function's [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing
     * configuration. To sample and record incoming requests, set `Mode` to `Active`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
     * @param tracingConfig The function's
     * [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing configuration. To
     * sample and record incoming requests, set `Mode` to `Active`. 
     */
    public fun tracingConfig(tracingConfig: TracingConfigProperty)

    /**
     * The function's [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing
     * configuration. To sample and record incoming requests, set `Mode` to `Active`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
     * @param tracingConfig The function's
     * [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing configuration. To
     * sample and record incoming requests, set `Mode` to `Active`. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e2f5a8b6072e93f227df7d16a2a889f29a7588706e4e11185c859fb17987062")
    public fun tracingConfig(tracingConfig: TracingConfigProperty.Builder.() -> Unit)

    /**
     * The VPC security groups and subnets that are attached to a Lambda function.
     *
     * When you connect a function to a VPC, Lambda creates an elastic network interface for each
     * combination of security group and subnet in the function's VPC configuration. The function can
     * only access resources and the internet through that VPC. For more information, see [VPC
     * Settings](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html).
     * When you delete a function, CFN monitors the state of its network interfaces and waits for
     * Lambda to delete them before proceeding. If the VPC is defined in the same stack, the network
     * interfaces need to be deleted by Lambda before CFN can delete the VPC's resources.
     * To monitor network interfaces, CFN needs the `ec2:DescribeNetworkInterfaces` permission. It
     * obtains this from the user or role that modifies the stack. If you don't provide this
     * permission, CFN does not wait for network interfaces to be deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a Lambda function. 
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * The VPC security groups and subnets that are attached to a Lambda function.
     *
     * When you connect a function to a VPC, Lambda creates an elastic network interface for each
     * combination of security group and subnet in the function's VPC configuration. The function can
     * only access resources and the internet through that VPC. For more information, see [VPC
     * Settings](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html).
     * When you delete a function, CFN monitors the state of its network interfaces and waits for
     * Lambda to delete them before proceeding. If the VPC is defined in the same stack, the network
     * interfaces need to be deleted by Lambda before CFN can delete the VPC's resources.
     * To monitor network interfaces, CFN needs the `ec2:DescribeNetworkInterfaces` permission. It
     * obtains this from the user or role that modifies the stack. If you don't provide this
     * permission, CFN does not wait for network interfaces to be deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a Lambda function. 
     */
    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    /**
     * The VPC security groups and subnets that are attached to a Lambda function.
     *
     * When you connect a function to a VPC, Lambda creates an elastic network interface for each
     * combination of security group and subnet in the function's VPC configuration. The function can
     * only access resources and the internet through that VPC. For more information, see [VPC
     * Settings](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html).
     * When you delete a function, CFN monitors the state of its network interfaces and waits for
     * Lambda to delete them before proceeding. If the VPC is defined in the same stack, the network
     * interfaces need to be deleted by Lambda before CFN can delete the VPC's resources.
     * To monitor network interfaces, CFN needs the `ec2:DescribeNetworkInterfaces` permission. It
     * obtains this from the user or role that modifies the stack. If you don't provide this
     * permission, CFN does not wait for network interfaces to be deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a Lambda function. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a95f83151908acd2460fc35b80b4458507ae5c0a7b04dcdf6a96ad632af5a117")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnFunction.Builder =
        software.amazon.awscdk.services.lambda.CfnFunction.Builder.create(scope, id)

    /**
     * The instruction set architecture that the function supports.
     *
     * Enter a string array with one of the valid values (arm64 or x86_64). The default value is
     * `x86_64`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-architectures)
     * @param architectures The instruction set architecture that the function supports. 
     */
    override fun architectures(architectures: List<String>) {
      cdkBuilder.architectures(architectures)
    }

    /**
     * The instruction set architecture that the function supports.
     *
     * Enter a string array with one of the valid values (arm64 or x86_64). The default value is
     * `x86_64`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-architectures)
     * @param architectures The instruction set architecture that the function supports. 
     */
    override fun architectures(vararg architectures: String): Unit =
        architectures(architectures.toList())

    /**
     * The [deployment
     * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
     * function. To deploy a function defined as a container image, you specify the location of a
     * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
     * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
     * function code inline in the template.  Changes to a deployment package in Amazon S3 or a
     * container image in ECR are not detected automatically during stack updates. To update the
     * function code, change the object key or version in the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
     * @param code The [deployment
     * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
     * function. To deploy a function defined as a container image, you specify the location of a
     * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
     * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
     * function code inline in the template.  Changes to a deployment package in Amazon S3 or a
     * container image in ECR are not detected automatically during stack updates. To update the
     * function code, change the object key or version in the template. 
     */
    override fun code(code: IResolvable) {
      cdkBuilder.code(code.let(IResolvable.Companion::unwrap))
    }

    /**
     * The [deployment
     * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
     * function. To deploy a function defined as a container image, you specify the location of a
     * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
     * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
     * function code inline in the template.  Changes to a deployment package in Amazon S3 or a
     * container image in ECR are not detected automatically during stack updates. To update the
     * function code, change the object key or version in the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
     * @param code The [deployment
     * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
     * function. To deploy a function defined as a container image, you specify the location of a
     * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
     * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
     * function code inline in the template.  Changes to a deployment package in Amazon S3 or a
     * container image in ECR are not detected automatically during stack updates. To update the
     * function code, change the object key or version in the template. 
     */
    override fun code(code: CodeProperty) {
      cdkBuilder.code(code.let(CodeProperty.Companion::unwrap))
    }

    /**
     * The [deployment
     * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
     * function. To deploy a function defined as a container image, you specify the location of a
     * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
     * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
     * function code inline in the template.  Changes to a deployment package in Amazon S3 or a
     * container image in ECR are not detected automatically during stack updates. To update the
     * function code, change the object key or version in the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
     * @param code The [deployment
     * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
     * function. To deploy a function defined as a container image, you specify the location of a
     * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
     * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
     * function code inline in the template.  Changes to a deployment package in Amazon S3 or a
     * container image in ECR are not detected automatically during stack updates. To update the
     * function code, change the object key or version in the template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b3964a0b102134414b694f5e98f6d476e8117850de3823fb7471a38dd26e1f9")
    override fun code(code: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(code))

    /**
     * To enable code signing for this function, specify the ARN of a code-signing configuration.
     *
     * A code-signing configuration includes a set of signing profiles, which define the trusted
     * publishers for this function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-codesigningconfigarn)
     * @param codeSigningConfigArn To enable code signing for this function, specify the ARN of a
     * code-signing configuration. 
     */
    override fun codeSigningConfigArn(codeSigningConfigArn: String) {
      cdkBuilder.codeSigningConfigArn(codeSigningConfigArn)
    }

    /**
     * The [dead-letter
     * queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq) for failed
     * asynchronous invocations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-deadletterconfig)
     * @param deadLetterConfig The [dead-letter
     * queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq) for failed
     * asynchronous invocations. 
     */
    override fun deadLetterConfig(deadLetterConfig: IResolvable) {
      cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The [dead-letter
     * queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq) for failed
     * asynchronous invocations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-deadletterconfig)
     * @param deadLetterConfig The [dead-letter
     * queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq) for failed
     * asynchronous invocations. 
     */
    override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty) {
      cdkBuilder.deadLetterConfig(deadLetterConfig.let(DeadLetterConfigProperty.Companion::unwrap))
    }

    /**
     * The [dead-letter
     * queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq) for failed
     * asynchronous invocations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-deadletterconfig)
     * @param deadLetterConfig The [dead-letter
     * queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq) for failed
     * asynchronous invocations. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("752ac7117e2e0fbfe8b87e093fe0487ed1b922480901063ebbdf41963e1b11b9")
    override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit):
        Unit = deadLetterConfig(DeadLetterConfigProperty(deadLetterConfig))

    /**
     * A description of the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description)
     * @param description A description of the function. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A function's environment variable settings.
     *
     * You can use environment variables to adjust your function's behavior without updating code.
     * An environment variable is a pair of strings that are stored in a function's version-specific
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
     * @param environment A function's environment variable settings. 
     */
    override fun environment(environment: IResolvable) {
      cdkBuilder.environment(environment.let(IResolvable.Companion::unwrap))
    }

    /**
     * A function's environment variable settings.
     *
     * You can use environment variables to adjust your function's behavior without updating code.
     * An environment variable is a pair of strings that are stored in a function's version-specific
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
     * @param environment A function's environment variable settings. 
     */
    override fun environment(environment: EnvironmentProperty) {
      cdkBuilder.environment(environment.let(EnvironmentProperty.Companion::unwrap))
    }

    /**
     * A function's environment variable settings.
     *
     * You can use environment variables to adjust your function's behavior without updating code.
     * An environment variable is a pair of strings that are stored in a function's version-specific
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
     * @param environment A function's environment variable settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cc75bf28aacefddb8de924be12c3db391e03580ea8cdff98f770371dbd867af")
    override fun environment(environment: EnvironmentProperty.Builder.() -> Unit): Unit =
        environment(EnvironmentProperty(environment))

    /**
     * The size of the function's `/tmp` directory in MB.
     *
     * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-ephemeralstorage)
     * @param ephemeralStorage The size of the function's `/tmp` directory in MB. 
     */
    override fun ephemeralStorage(ephemeralStorage: IResolvable) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable.Companion::unwrap))
    }

    /**
     * The size of the function's `/tmp` directory in MB.
     *
     * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-ephemeralstorage)
     * @param ephemeralStorage The size of the function's `/tmp` directory in MB. 
     */
    override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(EphemeralStorageProperty.Companion::unwrap))
    }

    /**
     * The size of the function's `/tmp` directory in MB.
     *
     * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-ephemeralstorage)
     * @param ephemeralStorage The size of the function's `/tmp` directory in MB. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("267f185b4ef53e255fd2df4b6cf38e5767b7112a9894eb62b47a0d4071a3efd4")
    override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit):
        Unit = ephemeralStorage(EphemeralStorageProperty(ephemeralStorage))

    /**
     * Connection settings for an Amazon EFS file system.
     *
     * To connect a function to a file system, a mount target must be available in every
     * Availability Zone that your function connects to. If your template contains an
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is
     * created or updated before the function.
     * For more information about using the `DependsOn` attribute, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
     * @param fileSystemConfigs Connection settings for an Amazon EFS file system. 
     */
    override fun fileSystemConfigs(fileSystemConfigs: IResolvable) {
      cdkBuilder.fileSystemConfigs(fileSystemConfigs.let(IResolvable.Companion::unwrap))
    }

    /**
     * Connection settings for an Amazon EFS file system.
     *
     * To connect a function to a file system, a mount target must be available in every
     * Availability Zone that your function connects to. If your template contains an
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is
     * created or updated before the function.
     * For more information about using the `DependsOn` attribute, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
     * @param fileSystemConfigs Connection settings for an Amazon EFS file system. 
     */
    override fun fileSystemConfigs(fileSystemConfigs: List<Any>) {
      cdkBuilder.fileSystemConfigs(fileSystemConfigs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Connection settings for an Amazon EFS file system.
     *
     * To connect a function to a file system, a mount target must be available in every
     * Availability Zone that your function connects to. If your template contains an
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * resource, you must also specify a `DependsOn` attribute to ensure that the mount target is
     * created or updated before the function.
     * For more information about using the `DependsOn` attribute, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
     * @param fileSystemConfigs Connection settings for an Amazon EFS file system. 
     */
    override fun fileSystemConfigs(vararg fileSystemConfigs: Any): Unit =
        fileSystemConfigs(fileSystemConfigs.toList())

    /**
     * The name of the Lambda function, up to 64 characters in length.
     *
     * If you don't specify a name, CFN generates one.
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname)
     * @param functionName The name of the Lambda function, up to 64 characters in length. 
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * The name of the method within your code that Lambda calls to run your function.
     *
     * Handler is required if the deployment package is a .zip file archive. The format includes the
     * file name. It can also include namespaces and other qualifiers, depending on the runtime. For
     * more information, see [Lambda programming
     * model](https://docs.aws.amazon.com/lambda/latest/dg/foundation-progmodel.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler)
     * @param handler The name of the method within your code that Lambda calls to run your
     * function. 
     */
    override fun handler(handler: String) {
      cdkBuilder.handler(handler)
    }

    /**
     * Configuration values that override the container image Dockerfile settings.
     *
     * For more information, see [Container image
     * settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-imageconfig)
     * @param imageConfig Configuration values that override the container image Dockerfile
     * settings. 
     */
    override fun imageConfig(imageConfig: IResolvable) {
      cdkBuilder.imageConfig(imageConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configuration values that override the container image Dockerfile settings.
     *
     * For more information, see [Container image
     * settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-imageconfig)
     * @param imageConfig Configuration values that override the container image Dockerfile
     * settings. 
     */
    override fun imageConfig(imageConfig: ImageConfigProperty) {
      cdkBuilder.imageConfig(imageConfig.let(ImageConfigProperty.Companion::unwrap))
    }

    /**
     * Configuration values that override the container image Dockerfile settings.
     *
     * For more information, see [Container image
     * settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-imageconfig)
     * @param imageConfig Configuration values that override the container image Dockerfile
     * settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57bb0976d52c1fa65255eccb2f6081a35e932dc8aec9c1d9a9796e8be0d63548")
    override fun imageConfig(imageConfig: ImageConfigProperty.Builder.() -> Unit): Unit =
        imageConfig(ImageConfigProperty(imageConfig))

    /**
     * The ARN of the KMSlong (KMS) customer managed key that's used to encrypt your function's
     * [environment
     * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-encryption).
     * When [Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-security.html) is
     * activated, Lambda also uses this key is to encrypt your function's snapshot. If you deploy your
     * function using a container image, Lambda also uses this key to encrypt your function when it's
     * deployed. Note that this is not the same key that's used to protect your container image in the
     * Amazon Elastic Container Registry (Amazon ECR). If you don't provide a customer managed key,
     * Lambda uses a default service key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn)
     * @param kmsKeyArn The ARN of the KMSlong (KMS) customer managed key that's used to encrypt
     * your function's [environment
     * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-encryption).
     * When [Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-security.html) is
     * activated, Lambda also uses this key is to encrypt your function's snapshot. If you deploy your
     * function using a container image, Lambda also uses this key to encrypt your function when it's
     * deployed. Note that this is not the same key that's used to protect your container image in the
     * Amazon Elastic Container Registry (Amazon ECR). If you don't provide a customer managed key,
     * Lambda uses a default service key. 
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * A list of [function
     * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
     * function's execution environment. Specify each layer by its ARN, including the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-layers)
     * @param layers A list of [function
     * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
     * function's execution environment. Specify each layer by its ARN, including the version. 
     */
    override fun layers(layers: List<String>) {
      cdkBuilder.layers(layers)
    }

    /**
     * A list of [function
     * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
     * function's execution environment. Specify each layer by its ARN, including the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-layers)
     * @param layers A list of [function
     * layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to add to the
     * function's execution environment. Specify each layer by its ARN, including the version. 
     */
    override fun layers(vararg layers: String): Unit = layers(layers.toList())

    /**
     * The function's Amazon CloudWatch Logs configuration settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-loggingconfig)
     * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings. 
     */
    override fun loggingConfig(loggingConfig: IResolvable) {
      cdkBuilder.loggingConfig(loggingConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The function's Amazon CloudWatch Logs configuration settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-loggingconfig)
     * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings. 
     */
    override fun loggingConfig(loggingConfig: LoggingConfigProperty) {
      cdkBuilder.loggingConfig(loggingConfig.let(LoggingConfigProperty.Companion::unwrap))
    }

    /**
     * The function's Amazon CloudWatch Logs configuration settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-loggingconfig)
     * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35a23952b1548ee98fba599d4723265cfca977fe42a79c55077816685417fdfa")
    override fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit): Unit =
        loggingConfig(LoggingConfigProperty(loggingConfig))

    /**
     * The amount of [memory available to the
     * function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
     * at runtime. Increasing the function memory also increases its CPU allocation. The default value
     * is 128 MB. The value can be any multiple of 1 MB. Note that new AWS accounts have reduced
     * concurrency and memory quotas. AWS raises these quotas automatically based on your usage. You
     * can also request a quota increase.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize)
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
     * The type of deployment package.
     *
     * Set to `Image` for container image and set `Zip` for .zip file archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-packagetype)
     * @param packageType The type of deployment package. 
     */
    override fun packageType(packageType: String) {
      cdkBuilder.packageType(packageType)
    }

    /**
     * This property is set to terminate unintended recursions.
     *
     * If set to `Terminate`, Lambda detects and terminates unitended recursive loops. If set to
     * `Allow` Lambda lets recursions be and does not terminate it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-recursiveloop)
     * @param recursiveLoop This property is set to terminate unintended recursions. 
     */
    override fun recursiveLoop(recursiveLoop: String) {
      cdkBuilder.recursiveLoop(recursiveLoop)
    }

    /**
     * The number of simultaneous executions to reserve for the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions)
     * @param reservedConcurrentExecutions The number of simultaneous executions to reserve for the
     * function. 
     */
    override fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
      cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    /**
     * The Amazon Resource Name (ARN) of the function's execution role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role)
     * @param role The Amazon Resource Name (ARN) of the function's execution role. 
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * The identifier of the function's
     * [runtime](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html). Runtime is
     * required if the deployment package is a .zip file archive. Specifying a runtime results in an
     * error if you're deploying a function using a container image.  The following list includes
     * deprecated runtimes. Lambda blocks creating new functions and updating existing functions
     * shortly after each runtime is deprecated. For more information, see [Runtime use after
     * deprecation](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-deprecation-levels).
     *  For a list of all currently supported runtimes, see [Supported
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtimes-supported).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtime)
     * @param runtime The identifier of the function's
     * [runtime](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html). Runtime is
     * required if the deployment package is a .zip file archive. Specifying a runtime results in an
     * error if you're deploying a function using a container image.  The following list includes
     * deprecated runtimes. Lambda blocks creating new functions and updating existing functions
     * shortly after each runtime is deprecated. For more information, see [Runtime use after
     * deprecation](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtime-deprecation-levels).
     *  For a list of all currently supported runtimes, see [Supported
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html#runtimes-supported).
     * 
     */
    override fun runtime(runtime: String) {
      cdkBuilder.runtime(runtime)
    }

    /**
     * Sets the runtime management configuration for a function's version.
     *
     * For more information, see [Runtime
     * updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtimemanagementconfig)
     * @param runtimeManagementConfig Sets the runtime management configuration for a function's
     * version. 
     */
    override fun runtimeManagementConfig(runtimeManagementConfig: IResolvable) {
      cdkBuilder.runtimeManagementConfig(runtimeManagementConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Sets the runtime management configuration for a function's version.
     *
     * For more information, see [Runtime
     * updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtimemanagementconfig)
     * @param runtimeManagementConfig Sets the runtime management configuration for a function's
     * version. 
     */
    override fun runtimeManagementConfig(runtimeManagementConfig: RuntimeManagementConfigProperty) {
      cdkBuilder.runtimeManagementConfig(runtimeManagementConfig.let(RuntimeManagementConfigProperty.Companion::unwrap))
    }

    /**
     * Sets the runtime management configuration for a function's version.
     *
     * For more information, see [Runtime
     * updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-runtimemanagementconfig)
     * @param runtimeManagementConfig Sets the runtime management configuration for a function's
     * version. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95a300663ca3f8b32e2befd34380c14ac3d734fe6d5c6a108d01ade64520be7b")
    override
        fun runtimeManagementConfig(runtimeManagementConfig: RuntimeManagementConfigProperty.Builder.() -> Unit):
        Unit = runtimeManagementConfig(RuntimeManagementConfigProperty(runtimeManagementConfig))

    /**
     * The function's [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
     * setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-snapstart)
     * @param snapStart The function's
     * [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting. 
     */
    override fun snapStart(snapStart: IResolvable) {
      cdkBuilder.snapStart(snapStart.let(IResolvable.Companion::unwrap))
    }

    /**
     * The function's [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
     * setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-snapstart)
     * @param snapStart The function's
     * [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting. 
     */
    override fun snapStart(snapStart: SnapStartProperty) {
      cdkBuilder.snapStart(snapStart.let(SnapStartProperty.Companion::unwrap))
    }

    /**
     * The function's [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
     * setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-snapstart)
     * @param snapStart The function's
     * [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2590028845f970506309395f8bc94970e797ab159c68443cb26ca01e9e8a449")
    override fun snapStart(snapStart: SnapStartProperty.Builder.() -> Unit): Unit =
        snapStart(SnapStartProperty(snapStart))

    /**
     * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to the
     * function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags)
     * @param tags A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to
     * apply to the function. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to the
     * function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags)
     * @param tags A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to
     * apply to the function. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The amount of time (in seconds) that Lambda allows a function to run before stopping it.
     *
     * The default is 3 seconds. The maximum allowed value is 900 seconds. For more information, see
     * [Lambda execution
     * environment](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-context.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout)
     * @param timeout The amount of time (in seconds) that Lambda allows a function to run before
     * stopping it. 
     */
    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    /**
     * The function's [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing
     * configuration. To sample and record incoming requests, set `Mode` to `Active`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
     * @param tracingConfig The function's
     * [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing configuration. To
     * sample and record incoming requests, set `Mode` to `Active`. 
     */
    override fun tracingConfig(tracingConfig: IResolvable) {
      cdkBuilder.tracingConfig(tracingConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The function's [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing
     * configuration. To sample and record incoming requests, set `Mode` to `Active`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
     * @param tracingConfig The function's
     * [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing configuration. To
     * sample and record incoming requests, set `Mode` to `Active`. 
     */
    override fun tracingConfig(tracingConfig: TracingConfigProperty) {
      cdkBuilder.tracingConfig(tracingConfig.let(TracingConfigProperty.Companion::unwrap))
    }

    /**
     * The function's [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing
     * configuration. To sample and record incoming requests, set `Mode` to `Active`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
     * @param tracingConfig The function's
     * [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing configuration. To
     * sample and record incoming requests, set `Mode` to `Active`. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e2f5a8b6072e93f227df7d16a2a889f29a7588706e4e11185c859fb17987062")
    override fun tracingConfig(tracingConfig: TracingConfigProperty.Builder.() -> Unit): Unit =
        tracingConfig(TracingConfigProperty(tracingConfig))

    /**
     * The VPC security groups and subnets that are attached to a Lambda function.
     *
     * When you connect a function to a VPC, Lambda creates an elastic network interface for each
     * combination of security group and subnet in the function's VPC configuration. The function can
     * only access resources and the internet through that VPC. For more information, see [VPC
     * Settings](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html).
     * When you delete a function, CFN monitors the state of its network interfaces and waits for
     * Lambda to delete them before proceeding. If the VPC is defined in the same stack, the network
     * interfaces need to be deleted by Lambda before CFN can delete the VPC's resources.
     * To monitor network interfaces, CFN needs the `ec2:DescribeNetworkInterfaces` permission. It
     * obtains this from the user or role that modifies the stack. If you don't provide this
     * permission, CFN does not wait for network interfaces to be deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a Lambda function. 
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The VPC security groups and subnets that are attached to a Lambda function.
     *
     * When you connect a function to a VPC, Lambda creates an elastic network interface for each
     * combination of security group and subnet in the function's VPC configuration. The function can
     * only access resources and the internet through that VPC. For more information, see [VPC
     * Settings](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html).
     * When you delete a function, CFN monitors the state of its network interfaces and waits for
     * Lambda to delete them before proceeding. If the VPC is defined in the same stack, the network
     * interfaces need to be deleted by Lambda before CFN can delete the VPC's resources.
     * To monitor network interfaces, CFN needs the `ec2:DescribeNetworkInterfaces` permission. It
     * obtains this from the user or role that modifies the stack. If you don't provide this
     * permission, CFN does not wait for network interfaces to be deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a Lambda function. 
     */
    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty.Companion::unwrap))
    }

    /**
     * The VPC security groups and subnets that are attached to a Lambda function.
     *
     * When you connect a function to a VPC, Lambda creates an elastic network interface for each
     * combination of security group and subnet in the function's VPC configuration. The function can
     * only access resources and the internet through that VPC. For more information, see [VPC
     * Settings](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html).
     * When you delete a function, CFN monitors the state of its network interfaces and waits for
     * Lambda to delete them before proceeding. If the VPC is defined in the same stack, the network
     * interfaces need to be deleted by Lambda before CFN can delete the VPC's resources.
     * To monitor network interfaces, CFN needs the `ec2:DescribeNetworkInterfaces` permission. It
     * obtains this from the user or role that modifies the stack. If you don't provide this
     * permission, CFN does not wait for network interfaces to be deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a Lambda function. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a95f83151908acd2460fc35b80b4458507ae5c0a7b04dcdf6a96ad632af5a117")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.lambda.CfnFunction = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lambda.CfnFunction.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFunction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFunction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction): CfnFunction =
        CfnFunction(cdkObject)

    internal fun unwrap(wrapped: CfnFunction): software.amazon.awscdk.services.lambda.CfnFunction =
        wrapped.cdkObject as software.amazon.awscdk.services.lambda.CfnFunction
  }

  /**
   * The [deployment
   * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) for a Lambda
   * function. To deploy a function defined as a container image, you specify the location of a
   * container image in the Amazon ECR registry. For a .zip file deployment package, you can specify
   * the location of an object in Amazon S3. For Node.js and Python functions, you can specify the
   * function code inline in the template.  Changes to a deployment package in Amazon S3 or a container
   * image in ECR are not detected automatically during stack updates. To update the function code,
   * change the object key or version in the template.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * CodeProperty codeProperty = CodeProperty.builder()
   * .imageUri("imageUri")
   * .s3Bucket("s3Bucket")
   * .s3Key("s3Key")
   * .s3ObjectVersion("s3ObjectVersion")
   * .sourceKmsKeyArn("sourceKmsKeyArn")
   * .zipFile("zipFile")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html)
   */
  public interface CodeProperty {
    /**
     * URI of a [container image](https://docs.aws.amazon.com/lambda/latest/dg/lambda-images.html)
     * in the Amazon ECR registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-imageuri)
     */
    public fun imageUri(): String? = unwrap(this).getImageUri()

    /**
     * An Amazon S3 bucket in the same AWS-Region as your function.
     *
     * The bucket can be in a different AWS-account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3bucket)
     */
    public fun s3Bucket(): String? = unwrap(this).getS3Bucket()

    /**
     * The Amazon S3 key of the deployment package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3key)
     */
    public fun s3Key(): String? = unwrap(this).getS3Key()

    /**
     * For versioned objects, the version of the deployment package object to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3objectversion)
     */
    public fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-sourcekmskeyarn)
     */
    public fun sourceKmsKeyArn(): String? = unwrap(this).getSourceKmsKeyArn()

    /**
     * (Node.js and Python) The source code of your Lambda function. If you include your function
     * source inline with this parameter, CFN places it in a file named `index` and zips it to create a
     * [deployment package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html).
     * This zip file cannot exceed 4MB. For the `Handler` property, the first part of the handler
     * identifier must be `index`. For example, `index.handler`.   For JSON, you must escape quotes and
     * special characters such as newline (`\n`) with a backslash.  If you specify a function that
     * interacts with an AWS CloudFormation custom resource, you don't have to write your own functions
     * to send responses to the custom resource that invoked the function. AWS CloudFormation provides
     * a response module
     * ([cfn-response](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-lambda-function-code-cfnresponsemodule.html))
     * that simplifies sending responses. See [Using Lambda with
     * CloudFormation](https://docs.aws.amazon.com/lambda/latest/dg/services-cloudformation.html) for
     * details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-zipfile)
     */
    public fun zipFile(): String? = unwrap(this).getZipFile()

    /**
     * A builder for [CodeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param imageUri URI of a [container
       * image](https://docs.aws.amazon.com/lambda/latest/dg/lambda-images.html) in the Amazon ECR
       * registry.
       */
      public fun imageUri(imageUri: String)

      /**
       * @param s3Bucket An Amazon S3 bucket in the same AWS-Region as your function.
       * The bucket can be in a different AWS-account.
       */
      public fun s3Bucket(s3Bucket: String)

      /**
       * @param s3Key The Amazon S3 key of the deployment package.
       */
      public fun s3Key(s3Key: String)

      /**
       * @param s3ObjectVersion For versioned objects, the version of the deployment package object
       * to use.
       */
      public fun s3ObjectVersion(s3ObjectVersion: String)

      /**
       * @param sourceKmsKeyArn the value to be set.
       */
      public fun sourceKmsKeyArn(sourceKmsKeyArn: String)

      /**
       * @param zipFile (Node.js and Python) The source code of your Lambda function. If you include
       * your function source inline with this parameter, CFN places it in a file named `index` and
       * zips it to create a [deployment
       * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html). This zip
       * file cannot exceed 4MB. For the `Handler` property, the first part of the handler identifier
       * must be `index`. For example, `index.handler`.   For JSON, you must escape quotes and special
       * characters such as newline (`\n`) with a backslash.  If you specify a function that interacts
       * with an AWS CloudFormation custom resource, you don't have to write your own functions to send
       * responses to the custom resource that invoked the function. AWS CloudFormation provides a
       * response module
       * ([cfn-response](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-lambda-function-code-cfnresponsemodule.html))
       * that simplifies sending responses. See [Using Lambda with
       * CloudFormation](https://docs.aws.amazon.com/lambda/latest/dg/services-cloudformation.html) for
       * details.
       */
      public fun zipFile(zipFile: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.builder()

      /**
       * @param imageUri URI of a [container
       * image](https://docs.aws.amazon.com/lambda/latest/dg/lambda-images.html) in the Amazon ECR
       * registry.
       */
      override fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
      }

      /**
       * @param s3Bucket An Amazon S3 bucket in the same AWS-Region as your function.
       * The bucket can be in a different AWS-account.
       */
      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      /**
       * @param s3Key The Amazon S3 key of the deployment package.
       */
      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      /**
       * @param s3ObjectVersion For versioned objects, the version of the deployment package object
       * to use.
       */
      override fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
      }

      /**
       * @param sourceKmsKeyArn the value to be set.
       */
      override fun sourceKmsKeyArn(sourceKmsKeyArn: String) {
        cdkBuilder.sourceKmsKeyArn(sourceKmsKeyArn)
      }

      /**
       * @param zipFile (Node.js and Python) The source code of your Lambda function. If you include
       * your function source inline with this parameter, CFN places it in a file named `index` and
       * zips it to create a [deployment
       * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html). This zip
       * file cannot exceed 4MB. For the `Handler` property, the first part of the handler identifier
       * must be `index`. For example, `index.handler`.   For JSON, you must escape quotes and special
       * characters such as newline (`\n`) with a backslash.  If you specify a function that interacts
       * with an AWS CloudFormation custom resource, you don't have to write your own functions to send
       * responses to the custom resource that invoked the function. AWS CloudFormation provides a
       * response module
       * ([cfn-response](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-lambda-function-code-cfnresponsemodule.html))
       * that simplifies sending responses. See [Using Lambda with
       * CloudFormation](https://docs.aws.amazon.com/lambda/latest/dg/services-cloudformation.html) for
       * details.
       */
      override fun zipFile(zipFile: String) {
        cdkBuilder.zipFile(zipFile)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty,
    ) : CdkObject(cdkObject),
        CodeProperty {
      /**
       * URI of a [container image](https://docs.aws.amazon.com/lambda/latest/dg/lambda-images.html)
       * in the Amazon ECR registry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-imageuri)
       */
      override fun imageUri(): String? = unwrap(this).getImageUri()

      /**
       * An Amazon S3 bucket in the same AWS-Region as your function.
       *
       * The bucket can be in a different AWS-account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3bucket)
       */
      override fun s3Bucket(): String? = unwrap(this).getS3Bucket()

      /**
       * The Amazon S3 key of the deployment package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3key)
       */
      override fun s3Key(): String? = unwrap(this).getS3Key()

      /**
       * For versioned objects, the version of the deployment package object to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3objectversion)
       */
      override fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-sourcekmskeyarn)
       */
      override fun sourceKmsKeyArn(): String? = unwrap(this).getSourceKmsKeyArn()

      /**
       * (Node.js and Python) The source code of your Lambda function. If you include your function
       * source inline with this parameter, CFN places it in a file named `index` and zips it to create
       * a [deployment
       * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html). This zip
       * file cannot exceed 4MB. For the `Handler` property, the first part of the handler identifier
       * must be `index`. For example, `index.handler`.   For JSON, you must escape quotes and special
       * characters such as newline (`\n`) with a backslash.  If you specify a function that interacts
       * with an AWS CloudFormation custom resource, you don't have to write your own functions to send
       * responses to the custom resource that invoked the function. AWS CloudFormation provides a
       * response module
       * ([cfn-response](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-lambda-function-code-cfnresponsemodule.html))
       * that simplifies sending responses. See [Using Lambda with
       * CloudFormation](https://docs.aws.amazon.com/lambda/latest/dg/services-cloudformation.html) for
       * details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-zipfile)
       */
      override fun zipFile(): String? = unwrap(this).getZipFile()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty):
          CodeProperty = CdkObjectWrappers.wrap(cdkObject) as? CodeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty
    }
  }

  /**
   * The [dead-letter queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq)
   * for failed asynchronous invocations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * DeadLetterConfigProperty deadLetterConfigProperty = DeadLetterConfigProperty.builder()
   * .targetArn("targetArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html)
   */
  public interface DeadLetterConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html#cfn-lambda-function-deadletterconfig-targetarn)
     */
    public fun targetArn(): String? = unwrap(this).getTargetArn()

    /**
     * A builder for [DeadLetterConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetArn The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
       */
      public fun targetArn(targetArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty.builder()

      /**
       * @param targetArn The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
       */
      override fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty,
    ) : CdkObject(cdkObject),
        DeadLetterConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html#cfn-lambda-function-deadletterconfig-targetarn)
       */
      override fun targetArn(): String? = unwrap(this).getTargetArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeadLetterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty):
          DeadLetterConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? DeadLetterConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeadLetterConfigProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty
    }
  }

  /**
   * A function's environment variable settings.
   *
   * You can use environment variables to adjust your function's behavior without updating code. An
   * environment variable is a pair of strings that are stored in a function's version-specific
   * configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * EnvironmentProperty environmentProperty = EnvironmentProperty.builder()
   * .variables(Map.of(
   * "variablesKey", "variables"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html)
   */
  public interface EnvironmentProperty {
    /**
     * Environment variable key-value pairs.
     *
     * For more information, see [Using Lambda environment
     * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html#cfn-lambda-function-environment-variables)
     */
    public fun variables(): Any? = unwrap(this).getVariables()

    /**
     * A builder for [EnvironmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param variables Environment variable key-value pairs.
       * For more information, see [Using Lambda environment
       * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html).
       */
      public fun variables(variables: IResolvable)

      /**
       * @param variables Environment variable key-value pairs.
       * For more information, see [Using Lambda environment
       * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html).
       */
      public fun variables(variables: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty.builder()

      /**
       * @param variables Environment variable key-value pairs.
       * For more information, see [Using Lambda environment
       * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html).
       */
      override fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param variables Environment variable key-value pairs.
       * For more information, see [Using Lambda environment
       * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html).
       */
      override fun variables(variables: Map<String, String>) {
        cdkBuilder.variables(variables)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty,
    ) : CdkObject(cdkObject),
        EnvironmentProperty {
      /**
       * Environment variable key-value pairs.
       *
       * For more information, see [Using Lambda environment
       * variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html#cfn-lambda-function-environment-variables)
       */
      override fun variables(): Any? = unwrap(this).getVariables()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty):
          EnvironmentProperty = CdkObjectWrappers.wrap(cdkObject) as? EnvironmentProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty
    }
  }

  /**
   * The size of the function's `/tmp` directory in MB.
   *
   * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * EphemeralStorageProperty ephemeralStorageProperty = EphemeralStorageProperty.builder()
   * .size(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-ephemeralstorage.html)
   */
  public interface EphemeralStorageProperty {
    /**
     * The size of the function's `/tmp` directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-ephemeralstorage.html#cfn-lambda-function-ephemeralstorage-size)
     */
    public fun size(): Number

    /**
     * A builder for [EphemeralStorageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param size The size of the function's `/tmp` directory. 
       */
      public fun size(size: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty.builder()

      /**
       * @param size The size of the function's `/tmp` directory. 
       */
      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty,
    ) : CdkObject(cdkObject),
        EphemeralStorageProperty {
      /**
       * The size of the function's `/tmp` directory.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-ephemeralstorage.html#cfn-lambda-function-ephemeralstorage-size)
       */
      override fun size(): Number = unwrap(this).getSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EphemeralStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty):
          EphemeralStorageProperty = CdkObjectWrappers.wrap(cdkObject) as? EphemeralStorageProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EphemeralStorageProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty
    }
  }

  /**
   * Details about the connection between a Lambda function and an [Amazon EFS file
   * system](https://docs.aws.amazon.com/lambda/latest/dg/configuration-filesystem.html).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * FileSystemConfigProperty fileSystemConfigProperty = FileSystemConfigProperty.builder()
   * .arn("arn")
   * .localMountPath("localMountPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-filesystemconfig.html)
   */
  public interface FileSystemConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to the
     * file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-filesystemconfig.html#cfn-lambda-function-filesystemconfig-arn)
     */
    public fun arn(): String

    /**
     * The path where the function can access the file system, starting with `/mnt/`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-filesystemconfig.html#cfn-lambda-function-filesystemconfig-localmountpath)
     */
    public fun localMountPath(): String

    /**
     * A builder for [FileSystemConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Amazon Resource Name (ARN) of the Amazon EFS access point that provides
       * access to the file system. 
       */
      public fun arn(arn: String)

      /**
       * @param localMountPath The path where the function can access the file system, starting with
       * `/mnt/`. 
       */
      public fun localMountPath(localMountPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty.builder()

      /**
       * @param arn The Amazon Resource Name (ARN) of the Amazon EFS access point that provides
       * access to the file system. 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param localMountPath The path where the function can access the file system, starting with
       * `/mnt/`. 
       */
      override fun localMountPath(localMountPath: String) {
        cdkBuilder.localMountPath(localMountPath)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty,
    ) : CdkObject(cdkObject),
        FileSystemConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to the
       * file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-filesystemconfig.html#cfn-lambda-function-filesystemconfig-arn)
       */
      override fun arn(): String = unwrap(this).getArn()

      /**
       * The path where the function can access the file system, starting with `/mnt/`.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-filesystemconfig.html#cfn-lambda-function-filesystemconfig-localmountpath)
       */
      override fun localMountPath(): String = unwrap(this).getLocalMountPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty):
          FileSystemConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? FileSystemConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileSystemConfigProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty
    }
  }

  /**
   * Configuration values that override the container image Dockerfile settings.
   *
   * For more information, see [Container image
   * settings](https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * ImageConfigProperty imageConfigProperty = ImageConfigProperty.builder()
   * .command(List.of("command"))
   * .entryPoint(List.of("entryPoint"))
   * .workingDirectory("workingDirectory")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-imageconfig.html)
   */
  public interface ImageConfigProperty {
    /**
     * Specifies parameters that you want to pass in with ENTRYPOINT.
     *
     * You can specify a maximum of 1,500 parameters in the list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-imageconfig.html#cfn-lambda-function-imageconfig-command)
     */
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * Specifies the entry point to their application, which is typically the location of the
     * runtime executable.
     *
     * You can specify a maximum of 1,500 string entries in the list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-imageconfig.html#cfn-lambda-function-imageconfig-entrypoint)
     */
    public fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

    /**
     * Specifies the working directory.
     *
     * The length of the directory string cannot exceed 1,000 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-imageconfig.html#cfn-lambda-function-imageconfig-workingdirectory)
     */
    public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

    /**
     * A builder for [ImageConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param command Specifies parameters that you want to pass in with ENTRYPOINT.
       * You can specify a maximum of 1,500 parameters in the list.
       */
      public fun command(command: List<String>)

      /**
       * @param command Specifies parameters that you want to pass in with ENTRYPOINT.
       * You can specify a maximum of 1,500 parameters in the list.
       */
      public fun command(vararg command: String)

      /**
       * @param entryPoint Specifies the entry point to their application, which is typically the
       * location of the runtime executable.
       * You can specify a maximum of 1,500 string entries in the list.
       */
      public fun entryPoint(entryPoint: List<String>)

      /**
       * @param entryPoint Specifies the entry point to their application, which is typically the
       * location of the runtime executable.
       * You can specify a maximum of 1,500 string entries in the list.
       */
      public fun entryPoint(vararg entryPoint: String)

      /**
       * @param workingDirectory Specifies the working directory.
       * The length of the directory string cannot exceed 1,000 characters.
       */
      public fun workingDirectory(workingDirectory: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty.builder()

      /**
       * @param command Specifies parameters that you want to pass in with ENTRYPOINT.
       * You can specify a maximum of 1,500 parameters in the list.
       */
      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      /**
       * @param command Specifies parameters that you want to pass in with ENTRYPOINT.
       * You can specify a maximum of 1,500 parameters in the list.
       */
      override fun command(vararg command: String): Unit = command(command.toList())

      /**
       * @param entryPoint Specifies the entry point to their application, which is typically the
       * location of the runtime executable.
       * You can specify a maximum of 1,500 string entries in the list.
       */
      override fun entryPoint(entryPoint: List<String>) {
        cdkBuilder.entryPoint(entryPoint)
      }

      /**
       * @param entryPoint Specifies the entry point to their application, which is typically the
       * location of the runtime executable.
       * You can specify a maximum of 1,500 string entries in the list.
       */
      override fun entryPoint(vararg entryPoint: String): Unit = entryPoint(entryPoint.toList())

      /**
       * @param workingDirectory Specifies the working directory.
       * The length of the directory string cannot exceed 1,000 characters.
       */
      override fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty,
    ) : CdkObject(cdkObject),
        ImageConfigProperty {
      /**
       * Specifies parameters that you want to pass in with ENTRYPOINT.
       *
       * You can specify a maximum of 1,500 parameters in the list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-imageconfig.html#cfn-lambda-function-imageconfig-command)
       */
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      /**
       * Specifies the entry point to their application, which is typically the location of the
       * runtime executable.
       *
       * You can specify a maximum of 1,500 string entries in the list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-imageconfig.html#cfn-lambda-function-imageconfig-entrypoint)
       */
      override fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

      /**
       * Specifies the working directory.
       *
       * The length of the directory string cannot exceed 1,000 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-imageconfig.html#cfn-lambda-function-imageconfig-workingdirectory)
       */
      override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ImageConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty):
          ImageConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? ImageConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageConfigProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty
    }
  }

  /**
   * The function's Amazon CloudWatch Logs configuration settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * LoggingConfigProperty loggingConfigProperty = LoggingConfigProperty.builder()
   * .applicationLogLevel("applicationLogLevel")
   * .logFormat("logFormat")
   * .logGroup("logGroup")
   * .systemLogLevel("systemLogLevel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html)
   */
  public interface LoggingConfigProperty {
    /**
     * Set this property to filter the application logs for your function that Lambda sends to
     * CloudWatch.
     *
     * Lambda only sends application logs at the selected level of detail and lower, where `TRACE`
     * is the highest level and `FATAL` is the lowest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html#cfn-lambda-function-loggingconfig-applicationloglevel)
     */
    public fun applicationLogLevel(): String? = unwrap(this).getApplicationLogLevel()

    /**
     * The format in which Lambda sends your function's application and system logs to CloudWatch.
     *
     * Select between plain text and structured JSON.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html#cfn-lambda-function-loggingconfig-logformat)
     */
    public fun logFormat(): String? = unwrap(this).getLogFormat()

    /**
     * The name of the Amazon CloudWatch log group the function sends logs to.
     *
     * By default, Lambda functions send logs to a default log group named `/aws/lambda/&lt;function
     * name&gt;`. To use a different log group, enter an existing log group or enter a new log group
     * name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html#cfn-lambda-function-loggingconfig-loggroup)
     */
    public fun logGroup(): String? = unwrap(this).getLogGroup()

    /**
     * Set this property to filter the system logs for your function that Lambda sends to
     * CloudWatch.
     *
     * Lambda only sends system logs at the selected level of detail and lower, where `DEBUG` is the
     * highest level and `WARN` is the lowest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html#cfn-lambda-function-loggingconfig-systemloglevel)
     */
    public fun systemLogLevel(): String? = unwrap(this).getSystemLogLevel()

    /**
     * A builder for [LoggingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationLogLevel Set this property to filter the application logs for your
       * function that Lambda sends to CloudWatch.
       * Lambda only sends application logs at the selected level of detail and lower, where `TRACE`
       * is the highest level and `FATAL` is the lowest.
       */
      public fun applicationLogLevel(applicationLogLevel: String)

      /**
       * @param logFormat The format in which Lambda sends your function's application and system
       * logs to CloudWatch.
       * Select between plain text and structured JSON.
       */
      public fun logFormat(logFormat: String)

      /**
       * @param logGroup The name of the Amazon CloudWatch log group the function sends logs to.
       * By default, Lambda functions send logs to a default log group named
       * `/aws/lambda/&lt;function name&gt;`. To use a different log group, enter an existing log group
       * or enter a new log group name.
       */
      public fun logGroup(logGroup: String)

      /**
       * @param systemLogLevel Set this property to filter the system logs for your function that
       * Lambda sends to CloudWatch.
       * Lambda only sends system logs at the selected level of detail and lower, where `DEBUG` is
       * the highest level and `WARN` is the lowest.
       */
      public fun systemLogLevel(systemLogLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty.builder()

      /**
       * @param applicationLogLevel Set this property to filter the application logs for your
       * function that Lambda sends to CloudWatch.
       * Lambda only sends application logs at the selected level of detail and lower, where `TRACE`
       * is the highest level and `FATAL` is the lowest.
       */
      override fun applicationLogLevel(applicationLogLevel: String) {
        cdkBuilder.applicationLogLevel(applicationLogLevel)
      }

      /**
       * @param logFormat The format in which Lambda sends your function's application and system
       * logs to CloudWatch.
       * Select between plain text and structured JSON.
       */
      override fun logFormat(logFormat: String) {
        cdkBuilder.logFormat(logFormat)
      }

      /**
       * @param logGroup The name of the Amazon CloudWatch log group the function sends logs to.
       * By default, Lambda functions send logs to a default log group named
       * `/aws/lambda/&lt;function name&gt;`. To use a different log group, enter an existing log group
       * or enter a new log group name.
       */
      override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      /**
       * @param systemLogLevel Set this property to filter the system logs for your function that
       * Lambda sends to CloudWatch.
       * Lambda only sends system logs at the selected level of detail and lower, where `DEBUG` is
       * the highest level and `WARN` is the lowest.
       */
      override fun systemLogLevel(systemLogLevel: String) {
        cdkBuilder.systemLogLevel(systemLogLevel)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty,
    ) : CdkObject(cdkObject),
        LoggingConfigProperty {
      /**
       * Set this property to filter the application logs for your function that Lambda sends to
       * CloudWatch.
       *
       * Lambda only sends application logs at the selected level of detail and lower, where `TRACE`
       * is the highest level and `FATAL` is the lowest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html#cfn-lambda-function-loggingconfig-applicationloglevel)
       */
      override fun applicationLogLevel(): String? = unwrap(this).getApplicationLogLevel()

      /**
       * The format in which Lambda sends your function's application and system logs to CloudWatch.
       *
       * Select between plain text and structured JSON.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html#cfn-lambda-function-loggingconfig-logformat)
       */
      override fun logFormat(): String? = unwrap(this).getLogFormat()

      /**
       * The name of the Amazon CloudWatch log group the function sends logs to.
       *
       * By default, Lambda functions send logs to a default log group named
       * `/aws/lambda/&lt;function name&gt;`. To use a different log group, enter an existing log group
       * or enter a new log group name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html#cfn-lambda-function-loggingconfig-loggroup)
       */
      override fun logGroup(): String? = unwrap(this).getLogGroup()

      /**
       * Set this property to filter the system logs for your function that Lambda sends to
       * CloudWatch.
       *
       * Lambda only sends system logs at the selected level of detail and lower, where `DEBUG` is
       * the highest level and `WARN` is the lowest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html#cfn-lambda-function-loggingconfig-systemloglevel)
       */
      override fun systemLogLevel(): String? = unwrap(this).getSystemLogLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty):
          LoggingConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? LoggingConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty
    }
  }

  /**
   * Sets the runtime management configuration for a function's version.
   *
   * For more information, see [Runtime
   * updates](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * RuntimeManagementConfigProperty runtimeManagementConfigProperty =
   * RuntimeManagementConfigProperty.builder()
   * .updateRuntimeOn("updateRuntimeOn")
   * // the properties below are optional
   * .runtimeVersionArn("runtimeVersionArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-runtimemanagementconfig.html)
   */
  public interface RuntimeManagementConfigProperty {
    /**
     * The ARN of the runtime version you want the function to use.
     *
     * This is only required if you're using the *Manual* runtime update mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-runtimemanagementconfig.html#cfn-lambda-function-runtimemanagementconfig-runtimeversionarn)
     */
    public fun runtimeVersionArn(): String? = unwrap(this).getRuntimeVersionArn()

    /**
     * Specify the runtime update mode.
     *
     * * *Auto (default)* - Automatically update to the most recent and secure runtime version using
     * a [Two-phase runtime version
     * rollout](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase).
     * This is the best choice for most customers to ensure they always benefit from runtime updates.
     * * *FunctionUpdate* - LAM updates the runtime of you function to the most recent and secure
     * runtime version when you update your function. This approach synchronizes runtime updates with
     * function deployments, giving you control over when runtime updates are applied and allowing you
     * to detect and mitigate rare runtime update incompatibilities early. When using this setting, you
     * need to regularly update your functions to keep their runtime up-to-date.
     * * *Manual* - You specify a runtime version in your function configuration. The function will
     * use this runtime version indefinitely. In the rare case where a new runtime version is
     * incompatible with an existing function, this allows you to roll back your function to an earlier
     * runtime version. For more information, see [Roll back a runtime
     * version](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback).
     *
     * *Valid Values*: `Auto` | `FunctionUpdate` | `Manual`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-runtimemanagementconfig.html#cfn-lambda-function-runtimemanagementconfig-updateruntimeon)
     */
    public fun updateRuntimeOn(): String

    /**
     * A builder for [RuntimeManagementConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param runtimeVersionArn The ARN of the runtime version you want the function to use.
       * This is only required if you're using the *Manual* runtime update mode.
       */
      public fun runtimeVersionArn(runtimeVersionArn: String)

      /**
       * @param updateRuntimeOn Specify the runtime update mode. 
       * * *Auto (default)* - Automatically update to the most recent and secure runtime version
       * using a [Two-phase runtime version
       * rollout](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase).
       * This is the best choice for most customers to ensure they always benefit from runtime updates.
       * * *FunctionUpdate* - LAM updates the runtime of you function to the most recent and secure
       * runtime version when you update your function. This approach synchronizes runtime updates with
       * function deployments, giving you control over when runtime updates are applied and allowing
       * you to detect and mitigate rare runtime update incompatibilities early. When using this
       * setting, you need to regularly update your functions to keep their runtime up-to-date.
       * * *Manual* - You specify a runtime version in your function configuration. The function
       * will use this runtime version indefinitely. In the rare case where a new runtime version is
       * incompatible with an existing function, this allows you to roll back your function to an
       * earlier runtime version. For more information, see [Roll back a runtime
       * version](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback).
       *
       * *Valid Values*: `Auto` | `FunctionUpdate` | `Manual`
       */
      public fun updateRuntimeOn(updateRuntimeOn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty.builder()

      /**
       * @param runtimeVersionArn The ARN of the runtime version you want the function to use.
       * This is only required if you're using the *Manual* runtime update mode.
       */
      override fun runtimeVersionArn(runtimeVersionArn: String) {
        cdkBuilder.runtimeVersionArn(runtimeVersionArn)
      }

      /**
       * @param updateRuntimeOn Specify the runtime update mode. 
       * * *Auto (default)* - Automatically update to the most recent and secure runtime version
       * using a [Two-phase runtime version
       * rollout](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase).
       * This is the best choice for most customers to ensure they always benefit from runtime updates.
       * * *FunctionUpdate* - LAM updates the runtime of you function to the most recent and secure
       * runtime version when you update your function. This approach synchronizes runtime updates with
       * function deployments, giving you control over when runtime updates are applied and allowing
       * you to detect and mitigate rare runtime update incompatibilities early. When using this
       * setting, you need to regularly update your functions to keep their runtime up-to-date.
       * * *Manual* - You specify a runtime version in your function configuration. The function
       * will use this runtime version indefinitely. In the rare case where a new runtime version is
       * incompatible with an existing function, this allows you to roll back your function to an
       * earlier runtime version. For more information, see [Roll back a runtime
       * version](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback).
       *
       * *Valid Values*: `Auto` | `FunctionUpdate` | `Manual`
       */
      override fun updateRuntimeOn(updateRuntimeOn: String) {
        cdkBuilder.updateRuntimeOn(updateRuntimeOn)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty,
    ) : CdkObject(cdkObject),
        RuntimeManagementConfigProperty {
      /**
       * The ARN of the runtime version you want the function to use.
       *
       * This is only required if you're using the *Manual* runtime update mode.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-runtimemanagementconfig.html#cfn-lambda-function-runtimemanagementconfig-runtimeversionarn)
       */
      override fun runtimeVersionArn(): String? = unwrap(this).getRuntimeVersionArn()

      /**
       * Specify the runtime update mode.
       *
       * * *Auto (default)* - Automatically update to the most recent and secure runtime version
       * using a [Two-phase runtime version
       * rollout](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase).
       * This is the best choice for most customers to ensure they always benefit from runtime updates.
       * * *FunctionUpdate* - LAM updates the runtime of you function to the most recent and secure
       * runtime version when you update your function. This approach synchronizes runtime updates with
       * function deployments, giving you control over when runtime updates are applied and allowing
       * you to detect and mitigate rare runtime update incompatibilities early. When using this
       * setting, you need to regularly update your functions to keep their runtime up-to-date.
       * * *Manual* - You specify a runtime version in your function configuration. The function
       * will use this runtime version indefinitely. In the rare case where a new runtime version is
       * incompatible with an existing function, this allows you to roll back your function to an
       * earlier runtime version. For more information, see [Roll back a runtime
       * version](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback).
       *
       * *Valid Values*: `Auto` | `FunctionUpdate` | `Manual`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-runtimemanagementconfig.html#cfn-lambda-function-runtimemanagementconfig-updateruntimeon)
       */
      override fun updateRuntimeOn(): String = unwrap(this).getUpdateRuntimeOn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuntimeManagementConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty):
          RuntimeManagementConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RuntimeManagementConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuntimeManagementConfigProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty
    }
  }

  /**
   * The function's [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
   * setting.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * SnapStartProperty snapStartProperty = SnapStartProperty.builder()
   * .applyOn("applyOn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstart.html)
   */
  public interface SnapStartProperty {
    /**
     * Set `ApplyOn` to `PublishedVersions` to create a snapshot of the initialized execution
     * environment when you publish a function version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstart.html#cfn-lambda-function-snapstart-applyon)
     */
    public fun applyOn(): String

    /**
     * A builder for [SnapStartProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applyOn Set `ApplyOn` to `PublishedVersions` to create a snapshot of the initialized
       * execution environment when you publish a function version. 
       */
      public fun applyOn(applyOn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty.builder()

      /**
       * @param applyOn Set `ApplyOn` to `PublishedVersions` to create a snapshot of the initialized
       * execution environment when you publish a function version. 
       */
      override fun applyOn(applyOn: String) {
        cdkBuilder.applyOn(applyOn)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty,
    ) : CdkObject(cdkObject),
        SnapStartProperty {
      /**
       * Set `ApplyOn` to `PublishedVersions` to create a snapshot of the initialized execution
       * environment when you publish a function version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstart.html#cfn-lambda-function-snapstart-applyon)
       */
      override fun applyOn(): String = unwrap(this).getApplyOn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnapStartProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty):
          SnapStartProperty = CdkObjectWrappers.wrap(cdkObject) as? SnapStartProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnapStartProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty
    }
  }

  /**
   * The function's [SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
   * setting.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * SnapStartResponseProperty snapStartResponseProperty = SnapStartResponseProperty.builder()
   * .applyOn("applyOn")
   * .optimizationStatus("optimizationStatus")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstartresponse.html)
   */
  public interface SnapStartResponseProperty {
    /**
     * When set to `PublishedVersions`, Lambda creates a snapshot of the execution environment when
     * you publish a function version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstartresponse.html#cfn-lambda-function-snapstartresponse-applyon)
     */
    public fun applyOn(): String? = unwrap(this).getApplyOn()

    /**
     * When you provide a [qualified Amazon Resource Name
     * (ARN)](https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using),
     * this response element indicates whether SnapStart is activated for the specified function
     * version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstartresponse.html#cfn-lambda-function-snapstartresponse-optimizationstatus)
     */
    public fun optimizationStatus(): String? = unwrap(this).getOptimizationStatus()

    /**
     * A builder for [SnapStartResponseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applyOn When set to `PublishedVersions`, Lambda creates a snapshot of the execution
       * environment when you publish a function version.
       */
      public fun applyOn(applyOn: String)

      /**
       * @param optimizationStatus When you provide a [qualified Amazon Resource Name
       * (ARN)](https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using),
       * this response element indicates whether SnapStart is activated for the specified function
       * version.
       */
      public fun optimizationStatus(optimizationStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty.builder()

      /**
       * @param applyOn When set to `PublishedVersions`, Lambda creates a snapshot of the execution
       * environment when you publish a function version.
       */
      override fun applyOn(applyOn: String) {
        cdkBuilder.applyOn(applyOn)
      }

      /**
       * @param optimizationStatus When you provide a [qualified Amazon Resource Name
       * (ARN)](https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using),
       * this response element indicates whether SnapStart is activated for the specified function
       * version.
       */
      override fun optimizationStatus(optimizationStatus: String) {
        cdkBuilder.optimizationStatus(optimizationStatus)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty,
    ) : CdkObject(cdkObject),
        SnapStartResponseProperty {
      /**
       * When set to `PublishedVersions`, Lambda creates a snapshot of the execution environment
       * when you publish a function version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstartresponse.html#cfn-lambda-function-snapstartresponse-applyon)
       */
      override fun applyOn(): String? = unwrap(this).getApplyOn()

      /**
       * When you provide a [qualified Amazon Resource Name
       * (ARN)](https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using),
       * this response element indicates whether SnapStart is activated for the specified function
       * version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstartresponse.html#cfn-lambda-function-snapstartresponse-optimizationstatus)
       */
      override fun optimizationStatus(): String? = unwrap(this).getOptimizationStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnapStartResponseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty):
          SnapStartResponseProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SnapStartResponseProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnapStartResponseProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty
    }
  }

  /**
   * The function's [](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) tracing
   * configuration. To sample and record incoming requests, set `Mode` to `Active`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * TracingConfigProperty tracingConfigProperty = TracingConfigProperty.builder()
   * .mode("mode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html)
   */
  public interface TracingConfigProperty {
    /**
     * The tracing mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html#cfn-lambda-function-tracingconfig-mode)
     */
    public fun mode(): String? = unwrap(this).getMode()

    /**
     * A builder for [TracingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mode The tracing mode.
       */
      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty.builder()

      /**
       * @param mode The tracing mode.
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty,
    ) : CdkObject(cdkObject),
        TracingConfigProperty {
      /**
       * The tracing mode.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html#cfn-lambda-function-tracingconfig-mode)
       */
      override fun mode(): String? = unwrap(this).getMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TracingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty):
          TracingConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? TracingConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TracingConfigProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty
    }
  }

  /**
   * The VPC security groups and subnets that are attached to a Lambda function.
   *
   * When you connect a function to a VPC, Lambda creates an elastic network interface for each
   * combination of security group and subnet in the function's VPC configuration. The function can
   * only access resources and the internet through that VPC. For more information, see [VPC
   * Settings](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html).
   * When you delete a function, CFN monitors the state of its network interfaces and waits for
   * Lambda to delete them before proceeding. If the VPC is defined in the same stack, the network
   * interfaces need to be deleted by Lambda before CFN can delete the VPC's resources.
   * To monitor network interfaces, CFN needs the `ec2:DescribeNetworkInterfaces` permission. It
   * obtains this from the user or role that modifies the stack. If you don't provide this permission,
   * CFN does not wait for network interfaces to be deleted.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
   * .ipv6AllowedForDualStack(false)
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html)
   */
  public interface VpcConfigProperty {
    /**
     * Allows outbound IPv6 traffic on VPC functions that are connected to dual-stack subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-ipv6allowedfordualstack)
     */
    public fun ipv6AllowedForDualStack(): Any? = unwrap(this).getIpv6AllowedForDualStack()

    /**
     * A list of VPC security group IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * A list of VPC subnet IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-subnetids)
     */
    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * A builder for [VpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipv6AllowedForDualStack Allows outbound IPv6 traffic on VPC functions that are
       * connected to dual-stack subnets.
       */
      public fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: Boolean)

      /**
       * @param ipv6AllowedForDualStack Allows outbound IPv6 traffic on VPC functions that are
       * connected to dual-stack subnets.
       */
      public fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: IResolvable)

      /**
       * @param securityGroupIds A list of VPC security group IDs.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds A list of VPC security group IDs.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds A list of VPC subnet IDs.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds A list of VPC subnet IDs.
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty.builder()

      /**
       * @param ipv6AllowedForDualStack Allows outbound IPv6 traffic on VPC functions that are
       * connected to dual-stack subnets.
       */
      override fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: Boolean) {
        cdkBuilder.ipv6AllowedForDualStack(ipv6AllowedForDualStack)
      }

      /**
       * @param ipv6AllowedForDualStack Allows outbound IPv6 traffic on VPC functions that are
       * connected to dual-stack subnets.
       */
      override fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: IResolvable) {
        cdkBuilder.ipv6AllowedForDualStack(ipv6AllowedForDualStack.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param securityGroupIds A list of VPC security group IDs.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds A list of VPC security group IDs.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds A list of VPC subnet IDs.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds A list of VPC subnet IDs.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build(): software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty,
    ) : CdkObject(cdkObject),
        VpcConfigProperty {
      /**
       * Allows outbound IPv6 traffic on VPC functions that are connected to dual-stack subnets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-ipv6allowedfordualstack)
       */
      override fun ipv6AllowedForDualStack(): Any? = unwrap(this).getIpv6AllowedForDualStack()

      /**
       * A list of VPC security group IDs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * A list of VPC subnet IDs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty):
          VpcConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty
    }
  }
}
