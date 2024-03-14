package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFunction
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.lambda.CfnFunction,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The instruction set architecture that the function supports. */
    public open fun architectures(): List<String> = unwrap(this).getArchitectures() ?: emptyList()

    /** The instruction set architecture that the function supports. */
    public open fun architectures(`value`: List<String>) {
        unwrap(this).setArchitectures(`value`)
    }

    /** The instruction set architecture that the function supports. */
    public open fun architectures(vararg `value`: String): Unit = architectures(`value`.toList())

    /** The Amazon Resource Name (ARN) of the function. */
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
     * When you provide a
     * [qualified Amazon Resource Name (ARN)](https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using),
     * this response element indicates whether SnapStart is activated for the specified function
     * version.
     */
    public open fun attrSnapStartResponseOptimizationStatus(): String =
        unwrap(this).getAttrSnapStartResponseOptimizationStatus()

    /** The code for the function. */
    public open fun code(): Any = unwrap(this).getCode()

    /** The code for the function. */
    public open fun code(`value`: IResolvable) {
        unwrap(this).setCode(`value`.let(IResolvable::unwrap))
    }

    /** The code for the function. */
    public open fun code(`value`: CodeProperty) {
        unwrap(this).setCode(`value`.let(CodeProperty::unwrap))
    }

    /** The code for the function. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27bc03c11962a84638837c61ff105a539b3caa5340528b2ffd9166edaf307caf")
    public open fun code(`value`: CodeProperty.Builder.() -> Unit): Unit =
        code(CodeProperty(`value`))

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
     * A dead-letter queue configuration that specifies the queue or topic where Lambda sends
     * asynchronous events when they fail processing.
     */
    public open fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

    /**
     * A dead-letter queue configuration that specifies the queue or topic where Lambda sends
     * asynchronous events when they fail processing.
     */
    public open fun deadLetterConfig(`value`: IResolvable) {
        unwrap(this).setDeadLetterConfig(`value`.let(IResolvable::unwrap))
    }

    /**
     * A dead-letter queue configuration that specifies the queue or topic where Lambda sends
     * asynchronous events when they fail processing.
     */
    public open fun deadLetterConfig(`value`: DeadLetterConfigProperty) {
        unwrap(this).setDeadLetterConfig(`value`.let(DeadLetterConfigProperty::unwrap))
    }

    /**
     * A dead-letter queue configuration that specifies the queue or topic where Lambda sends
     * asynchronous events when they fail processing.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82210f417735f1b21f06f2b9874c4d9202ac1920b45ba30cccd2d22bea5b339b")
    public open fun deadLetterConfig(`value`: DeadLetterConfigProperty.Builder.() -> Unit): Unit =
        deadLetterConfig(DeadLetterConfigProperty(`value`))

    /** A description of the function. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** A description of the function. */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
    }

    /** Environment variables that are accessible from function code during execution. */
    public open fun environment(): Any? = unwrap(this).getEnvironment()

    /** Environment variables that are accessible from function code during execution. */
    public open fun environment(`value`: IResolvable) {
        unwrap(this).setEnvironment(`value`.let(IResolvable::unwrap))
    }

    /** Environment variables that are accessible from function code during execution. */
    public open fun environment(`value`: EnvironmentProperty) {
        unwrap(this).setEnvironment(`value`.let(EnvironmentProperty::unwrap))
    }

    /** Environment variables that are accessible from function code during execution. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9fe4e1d1745bd46c7c4df960f9992721cd59f9fbb8b9b0bb9c79fd7087b565d")
    public open fun environment(`value`: EnvironmentProperty.Builder.() -> Unit): Unit =
        environment(EnvironmentProperty(`value`))

    /** The size of the function's `/tmp` directory in MB. */
    public open fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

    /** The size of the function's `/tmp` directory in MB. */
    public open fun ephemeralStorage(`value`: IResolvable) {
        unwrap(this).setEphemeralStorage(`value`.let(IResolvable::unwrap))
    }

    /** The size of the function's `/tmp` directory in MB. */
    public open fun ephemeralStorage(`value`: EphemeralStorageProperty) {
        unwrap(this).setEphemeralStorage(`value`.let(EphemeralStorageProperty::unwrap))
    }

    /** The size of the function's `/tmp` directory in MB. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("acc7854ae4ab271b192bd05cb811163e4ba1c027bc1dc787b933e05eb116688a")
    public open fun ephemeralStorage(`value`: EphemeralStorageProperty.Builder.() -> Unit): Unit =
        ephemeralStorage(EphemeralStorageProperty(`value`))

    /** Connection settings for an Amazon EFS file system. */
    public open fun fileSystemConfigs(): Any? = unwrap(this).getFileSystemConfigs()

    /** Connection settings for an Amazon EFS file system. */
    public open fun fileSystemConfigs(`value`: IResolvable) {
        unwrap(this).setFileSystemConfigs(`value`.let(IResolvable::unwrap))
    }

    /** Connection settings for an Amazon EFS file system. */
    public open fun fileSystemConfigs(__idx_ac66f0: List<Any>) {
        unwrap(this).setFileSystemConfigs(__idx_ac66f0)
    }

    /** Connection settings for an Amazon EFS file system. */
    public open fun fileSystemConfigs(vararg __idx_ac66f0: Any): Unit =
        fileSystemConfigs(__idx_ac66f0.toList())

    /** The name of the Lambda function, up to 64 characters in length. */
    public open fun functionName(): String? = unwrap(this).getFunctionName()

    /** The name of the Lambda function, up to 64 characters in length. */
    public open fun functionName(`value`: String) {
        unwrap(this).setFunctionName(`value`)
    }

    /** The name of the method within your code that Lambda calls to run your function. */
    public open fun handler(): String? = unwrap(this).getHandler()

    /** The name of the method within your code that Lambda calls to run your function. */
    public open fun handler(`value`: String) {
        unwrap(this).setHandler(`value`)
    }

    /** Configuration values that override the container image Dockerfile settings. */
    public open fun imageConfig(): Any? = unwrap(this).getImageConfig()

    /** Configuration values that override the container image Dockerfile settings. */
    public open fun imageConfig(`value`: IResolvable) {
        unwrap(this).setImageConfig(`value`.let(IResolvable::unwrap))
    }

    /** Configuration values that override the container image Dockerfile settings. */
    public open fun imageConfig(`value`: ImageConfigProperty) {
        unwrap(this).setImageConfig(`value`.let(ImageConfigProperty::unwrap))
    }

    /** Configuration values that override the container image Dockerfile settings. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26f56b1f77d999470b731c5bf8d941d0223619013aea217d35f49664aad930fe")
    public open fun imageConfig(`value`: ImageConfigProperty.Builder.() -> Unit): Unit =
        imageConfig(ImageConfigProperty(`value`))

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
     */
    public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

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
     */
    public open fun kmsKeyArn(`value`: String) {
        unwrap(this).setKmsKeyArn(`value`)
    }

    /**
     * A list of
     * [function layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to
     * add to the function's execution environment. Specify each layer by its ARN, including the
     * version.
     */
    public open fun layers(): List<String> = unwrap(this).getLayers() ?: emptyList()

    /**
     * A list of
     * [function layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to
     * add to the function's execution environment. Specify each layer by its ARN, including the
     * version.
     */
    public open fun layers(`value`: List<String>) {
        unwrap(this).setLayers(`value`)
    }

    /**
     * A list of
     * [function layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) to
     * add to the function's execution environment. Specify each layer by its ARN, including the
     * version.
     */
    public open fun layers(vararg `value`: String): Unit = layers(`value`.toList())

    /** The function's Amazon CloudWatch Logs configuration settings. */
    public open fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

    /** The function's Amazon CloudWatch Logs configuration settings. */
    public open fun loggingConfig(`value`: IResolvable) {
        unwrap(this).setLoggingConfig(`value`.let(IResolvable::unwrap))
    }

    /** The function's Amazon CloudWatch Logs configuration settings. */
    public open fun loggingConfig(`value`: LoggingConfigProperty) {
        unwrap(this).setLoggingConfig(`value`.let(LoggingConfigProperty::unwrap))
    }

    /** The function's Amazon CloudWatch Logs configuration settings. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b77c5f63505f2d280810158758ac608f76c842b8ad83359f2a2f0ec20c91736")
    public open fun loggingConfig(`value`: LoggingConfigProperty.Builder.() -> Unit): Unit =
        loggingConfig(LoggingConfigProperty(`value`))

    /**
     * The amount of
     * [memory available to the function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
     * at runtime. Increasing the function memory also increases its CPU allocation. The default
     * value is 128 MB. The value can be any multiple of 1 MB. Note that new AWS accounts have
     * reduced concurrency and memory quotas. AWS raises these quotas automatically based on your
     * usage. You can also request a quota increase.
     */
    public open fun memorySize(): Number? = unwrap(this).getMemorySize()

    /**
     * The amount of
     * [memory available to the function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
     * at runtime. Increasing the function memory also increases its CPU allocation. The default
     * value is 128 MB. The value can be any multiple of 1 MB. Note that new AWS accounts have
     * reduced concurrency and memory quotas. AWS raises these quotas automatically based on your
     * usage. You can also request a quota increase.
     */
    public open fun memorySize(`value`: Number) {
        unwrap(this).setMemorySize(`value`)
    }

    /** The type of deployment package. */
    public open fun packageType(): String? = unwrap(this).getPackageType()

    /** The type of deployment package. */
    public open fun packageType(`value`: String) {
        unwrap(this).setPackageType(`value`)
    }

    /** The number of simultaneous executions to reserve for the function. */
    public open fun reservedConcurrentExecutions(): Number? =
        unwrap(this).getReservedConcurrentExecutions()

    /** The number of simultaneous executions to reserve for the function. */
    public open fun reservedConcurrentExecutions(`value`: Number) {
        unwrap(this).setReservedConcurrentExecutions(`value`)
    }

    /** The Amazon Resource Name (ARN) of the function's execution role. */
    public open fun role(): String = unwrap(this).getRole()

    /** The Amazon Resource Name (ARN) of the function's execution role. */
    public open fun role(`value`: String) {
        unwrap(this).setRole(`value`)
    }

    /**
     * The identifier of the function's
     * [runtime](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Runtime is
     * required if the deployment package is a .zip file archive.
     */
    public open fun runtime(): String? = unwrap(this).getRuntime()

    /**
     * The identifier of the function's
     * [runtime](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Runtime is
     * required if the deployment package is a .zip file archive.
     */
    public open fun runtime(`value`: String) {
        unwrap(this).setRuntime(`value`)
    }

    /** Sets the runtime management configuration for a function's version. */
    public open fun runtimeManagementConfig(): Any? = unwrap(this).getRuntimeManagementConfig()

    /** Sets the runtime management configuration for a function's version. */
    public open fun runtimeManagementConfig(`value`: IResolvable) {
        unwrap(this).setRuntimeManagementConfig(`value`.let(IResolvable::unwrap))
    }

    /** Sets the runtime management configuration for a function's version. */
    public open fun runtimeManagementConfig(`value`: RuntimeManagementConfigProperty) {
        unwrap(this)
            .setRuntimeManagementConfig(`value`.let(RuntimeManagementConfigProperty::unwrap))
    }

    /** Sets the runtime management configuration for a function's version. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1edbee511052488d686a699ce8c30650858b925fc6fbd52d15954522d9e5e58a")
    public open fun runtimeManagementConfig(
        `value`: RuntimeManagementConfigProperty.Builder.() -> Unit
    ): Unit = runtimeManagementConfig(RuntimeManagementConfigProperty(`value`))

    /**
     * The function's
     * [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
     */
    public open fun snapStart(): Any? = unwrap(this).getSnapStart()

    /**
     * The function's
     * [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
     */
    public open fun snapStart(`value`: IResolvable) {
        unwrap(this).setSnapStart(`value`.let(IResolvable::unwrap))
    }

    /**
     * The function's
     * [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
     */
    public open fun snapStart(`value`: SnapStartProperty) {
        unwrap(this).setSnapStart(`value`.let(SnapStartProperty::unwrap))
    }

    /**
     * The function's
     * [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html) setting.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81b72b2b8362d1a960276e8abfc120c20bed9e40f1708761e070ce63675b848f")
    public open fun snapStart(`value`: SnapStartProperty.Builder.() -> Unit): Unit =
        snapStart(SnapStartProperty(`value`))

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /**
     * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to the
     * function.
     */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to the
     * function.
     */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /**
     * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to the
     * function.
     */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** The amount of time (in seconds) that Lambda allows a function to run before stopping it. */
    public open fun timeout(): Number? = unwrap(this).getTimeout()

    /** The amount of time (in seconds) that Lambda allows a function to run before stopping it. */
    public open fun timeout(`value`: Number) {
        unwrap(this).setTimeout(`value`)
    }

    /**
     * Set `Mode` to `Active` to sample and trace a subset of incoming requests with
     * [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
     */
    public open fun tracingConfig(): Any? = unwrap(this).getTracingConfig()

    /**
     * Set `Mode` to `Active` to sample and trace a subset of incoming requests with
     * [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
     */
    public open fun tracingConfig(`value`: IResolvable) {
        unwrap(this).setTracingConfig(`value`.let(IResolvable::unwrap))
    }

    /**
     * Set `Mode` to `Active` to sample and trace a subset of incoming requests with
     * [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
     */
    public open fun tracingConfig(`value`: TracingConfigProperty) {
        unwrap(this).setTracingConfig(`value`.let(TracingConfigProperty::unwrap))
    }

    /**
     * Set `Mode` to `Active` to sample and trace a subset of incoming requests with
     * [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26af4707ceb8d25c09985966f19fe8fc2018338e50c30202b6e3274e10effb61")
    public open fun tracingConfig(`value`: TracingConfigProperty.Builder.() -> Unit): Unit =
        tracingConfig(TracingConfigProperty(`value`))

    /**
     * For network connectivity to AWS resources in a VPC, specify a list of security groups and
     * subnets in the VPC.
     */
    public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

    /**
     * For network connectivity to AWS resources in a VPC, specify a list of security groups and
     * subnets in the VPC.
     */
    public open fun vpcConfig(`value`: IResolvable) {
        unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
    }

    /**
     * For network connectivity to AWS resources in a VPC, specify a list of security groups and
     * subnets in the VPC.
     */
    public open fun vpcConfig(`value`: VpcConfigProperty) {
        unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
    }

    /**
     * For network connectivity to AWS resources in a VPC, specify a list of security groups and
     * subnets in the VPC.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61a85c6b04d196acfcabd6044074bf46c225ba9da5df8f8acc431959fe2fdf45")
    public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(`value`))

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.CfnFunction]. */
    @CdkDslMarker
    public interface Builder {
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
        public fun architectures(architectures: List<String>)

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
        public fun architectures(vararg architectures: String)

        /**
         * The code for the function.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
         *
         * @param code The code for the function.
         */
        public fun code(code: IResolvable)

        /**
         * The code for the function.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
         *
         * @param code The code for the function.
         */
        public fun code(code: CodeProperty)

        /**
         * The code for the function.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
         *
         * @param code The code for the function.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("4b3964a0b102134414b694f5e98f6d476e8117850de3823fb7471a38dd26e1f9")
        public fun code(code: CodeProperty.Builder.() -> Unit)

        /**
         * To enable code signing for this function, specify the ARN of a code-signing
         * configuration.
         *
         * A code-signing configuration includes a set of signing profiles, which define the trusted
         * publishers for this function.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-codesigningconfigarn)
         *
         * @param codeSigningConfigArn To enable code signing for this function, specify the ARN of
         *   a code-signing configuration.
         */
        public fun codeSigningConfigArn(codeSigningConfigArn: String)

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
         * @param deadLetterConfig A dead-letter queue configuration that specifies the queue or
         *   topic where Lambda sends asynchronous events when they fail processing.
         */
        public fun deadLetterConfig(deadLetterConfig: IResolvable)

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
         * @param deadLetterConfig A dead-letter queue configuration that specifies the queue or
         *   topic where Lambda sends asynchronous events when they fail processing.
         */
        public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty)

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
         * @param deadLetterConfig A dead-letter queue configuration that specifies the queue or
         *   topic where Lambda sends asynchronous events when they fail processing.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("752ac7117e2e0fbfe8b87e093fe0487ed1b922480901063ebbdf41963e1b11b9")
        public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit)

        /**
         * A description of the function.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description)
         *
         * @param description A description of the function.
         */
        public fun description(description: String)

        /**
         * Environment variables that are accessible from function code during execution.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
         *
         * @param environment Environment variables that are accessible from function code during
         *   execution.
         */
        public fun environment(environment: IResolvable)

        /**
         * Environment variables that are accessible from function code during execution.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
         *
         * @param environment Environment variables that are accessible from function code during
         *   execution.
         */
        public fun environment(environment: EnvironmentProperty)

        /**
         * Environment variables that are accessible from function code during execution.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
         *
         * @param environment Environment variables that are accessible from function code during
         *   execution.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("6cc75bf28aacefddb8de924be12c3db391e03580ea8cdff98f770371dbd867af")
        public fun environment(environment: EnvironmentProperty.Builder.() -> Unit)

        /**
         * The size of the function's `/tmp` directory in MB.
         *
         * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-ephemeralstorage)
         *
         * @param ephemeralStorage The size of the function's `/tmp` directory in MB.
         */
        public fun ephemeralStorage(ephemeralStorage: IResolvable)

        /**
         * The size of the function's `/tmp` directory in MB.
         *
         * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-ephemeralstorage)
         *
         * @param ephemeralStorage The size of the function's `/tmp` directory in MB.
         */
        public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty)

        /**
         * The size of the function's `/tmp` directory in MB.
         *
         * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-ephemeralstorage)
         *
         * @param ephemeralStorage The size of the function's `/tmp` directory in MB.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("267f185b4ef53e255fd2df4b6cf38e5767b7112a9894eb62b47a0d4071a3efd4")
        public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit)

        /**
         * Connection settings for an Amazon EFS file system.
         *
         * To connect a function to a file system, a mount target must be available in every
         * Availability Zone that your function connects to. If your template contains an
         * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
         * resource, you must also specify a `DependsOn` attribute to ensure that the mount target
         * is created or updated before the function.
         *
         * For more information about using the `DependsOn` attribute, see
         * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
         *
         * @param fileSystemConfigs Connection settings for an Amazon EFS file system.
         */
        public fun fileSystemConfigs(fileSystemConfigs: IResolvable)

        /**
         * Connection settings for an Amazon EFS file system.
         *
         * To connect a function to a file system, a mount target must be available in every
         * Availability Zone that your function connects to. If your template contains an
         * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
         * resource, you must also specify a `DependsOn` attribute to ensure that the mount target
         * is created or updated before the function.
         *
         * For more information about using the `DependsOn` attribute, see
         * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
         *
         * @param fileSystemConfigs Connection settings for an Amazon EFS file system.
         */
        public fun fileSystemConfigs(fileSystemConfigs: List<Any>)

        /**
         * Connection settings for an Amazon EFS file system.
         *
         * To connect a function to a file system, a mount target must be available in every
         * Availability Zone that your function connects to. If your template contains an
         * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
         * resource, you must also specify a `DependsOn` attribute to ensure that the mount target
         * is created or updated before the function.
         *
         * For more information about using the `DependsOn` attribute, see
         * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
         *
         * @param fileSystemConfigs Connection settings for an Amazon EFS file system.
         */
        public fun fileSystemConfigs(vararg fileSystemConfigs: Any)

        /**
         * The name of the Lambda function, up to 64 characters in length.
         *
         * If you don't specify a name, AWS CloudFormation generates one.
         *
         * If you specify a name, you cannot perform updates that require replacement of this
         * resource. You can perform updates that require no or some interruption. If you must
         * replace the resource, specify a new name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname)
         *
         * @param functionName The name of the Lambda function, up to 64 characters in length.
         */
        public fun functionName(functionName: String)

        /**
         * The name of the method within your code that Lambda calls to run your function.
         *
         * Handler is required if the deployment package is a .zip file archive. The format includes
         * the file name. It can also include namespaces and other qualifiers, depending on the
         * runtime. For more information, see
         * [Lambda programming model](https://docs.aws.amazon.com/lambda/latest/dg/foundation-progmodel.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler)
         *
         * @param handler The name of the method within your code that Lambda calls to run your
         *   function.
         */
        public fun handler(handler: String)

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
        public fun imageConfig(imageConfig: IResolvable)

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
        public fun imageConfig(imageConfig: ImageConfigProperty)

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
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("57bb0976d52c1fa65255eccb2f6081a35e932dc8aec9c1d9a9796e8be0d63548")
        public fun imageConfig(imageConfig: ImageConfigProperty.Builder.() -> Unit)

        /**
         * The ARN of the AWS Key Management Service ( AWS KMS ) customer managed key that's used to
         * encrypt your function's
         * [environment variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-encryption)
         * . When
         * [Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-security.html)
         * is activated, Lambda also uses this key is to encrypt your function's snapshot. If you
         * deploy your function using a container image, Lambda also uses this key to encrypt your
         * function when it's deployed. Note that this is not the same key that's used to protect
         * your container image in the Amazon Elastic Container Registry (Amazon ECR). If you don't
         * provide a customer managed key, Lambda uses a default service key.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn)
         *
         * @param kmsKeyArn The ARN of the AWS Key Management Service ( AWS KMS ) customer managed
         *   key that's used to encrypt your function's
         *   [environment variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-encryption)
         *   . When
         *   [Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-security.html)
         *   is activated, Lambda also uses this key is to encrypt your function's snapshot. If you
         *   deploy your function using a container image, Lambda also uses this key to encrypt your
         *   function when it's deployed. Note that this is not the same key that's used to protect
         *   your container image in the Amazon Elastic Container Registry (Amazon ECR). If you
         *   don't provide a customer managed key, Lambda uses a default service key.
         */
        public fun kmsKeyArn(kmsKeyArn: String)

        /**
         * A list of
         * [function layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html)
         * to add to the function's execution environment. Specify each layer by its ARN, including
         * the version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-layers)
         *
         * @param layers A list of
         *   [function layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html)
         *   to add to the function's execution environment. Specify each layer by its ARN,
         *   including the version.
         */
        public fun layers(layers: List<String>)

        /**
         * A list of
         * [function layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html)
         * to add to the function's execution environment. Specify each layer by its ARN, including
         * the version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-layers)
         *
         * @param layers A list of
         *   [function layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html)
         *   to add to the function's execution environment. Specify each layer by its ARN,
         *   including the version.
         */
        public fun layers(vararg layers: String)

        /**
         * The function's Amazon CloudWatch Logs configuration settings.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-loggingconfig)
         *
         * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings.
         */
        public fun loggingConfig(loggingConfig: IResolvable)

        /**
         * The function's Amazon CloudWatch Logs configuration settings.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-loggingconfig)
         *
         * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings.
         */
        public fun loggingConfig(loggingConfig: LoggingConfigProperty)

        /**
         * The function's Amazon CloudWatch Logs configuration settings.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-loggingconfig)
         *
         * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("35a23952b1548ee98fba599d4723265cfca977fe42a79c55077816685417fdfa")
        public fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit)

        /**
         * The amount of
         * [memory available to the function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
         * at runtime. Increasing the function memory also increases its CPU allocation. The default
         * value is 128 MB. The value can be any multiple of 1 MB. Note that new AWS accounts have
         * reduced concurrency and memory quotas. AWS raises these quotas automatically based on
         * your usage. You can also request a quota increase.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize)
         *
         * @param memorySize The amount of
         *   [memory available to the function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
         *   at runtime. Increasing the function memory also increases its CPU allocation. The
         *   default value is 128 MB. The value can be any multiple of 1 MB. Note that new AWS
         *   accounts have reduced concurrency and memory quotas. AWS raises these quotas
         *   automatically based on your usage. You can also request a quota increase.
         */
        public fun memorySize(memorySize: Number)

        /**
         * The type of deployment package.
         *
         * Set to `Image` for container image and set `Zip` for .zip file archive.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-packagetype)
         *
         * @param packageType The type of deployment package.
         */
        public fun packageType(packageType: String)

        /**
         * The number of simultaneous executions to reserve for the function.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions)
         *
         * @param reservedConcurrentExecutions The number of simultaneous executions to reserve for
         *   the function.
         */
        public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number)

        /**
         * The Amazon Resource Name (ARN) of the function's execution role.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role)
         *
         * @param role The Amazon Resource Name (ARN) of the function's execution role.
         */
        public fun role(role: String)

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
         *   [runtime](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Runtime
         *   is required if the deployment package is a .zip file archive.
         */
        public fun runtime(runtime: String)

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
        public fun runtimeManagementConfig(runtimeManagementConfig: IResolvable)

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
        public fun runtimeManagementConfig(runtimeManagementConfig: RuntimeManagementConfigProperty)

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
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("95a300663ca3f8b32e2befd34380c14ac3d734fe6d5c6a108d01ade64520be7b")
        public fun runtimeManagementConfig(
            runtimeManagementConfig: RuntimeManagementConfigProperty.Builder.() -> Unit
        )

        /**
         * The function's
         * [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
         * setting.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-snapstart)
         *
         * @param snapStart The function's
         *   [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
         *   setting.
         */
        public fun snapStart(snapStart: IResolvable)

        /**
         * The function's
         * [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
         * setting.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-snapstart)
         *
         * @param snapStart The function's
         *   [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
         *   setting.
         */
        public fun snapStart(snapStart: SnapStartProperty)

        /**
         * The function's
         * [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
         * setting.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-snapstart)
         *
         * @param snapStart The function's
         *   [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
         *   setting.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("d2590028845f970506309395f8bc94970e797ab159c68443cb26ca01e9e8a449")
        public fun snapStart(snapStart: SnapStartProperty.Builder.() -> Unit)

        /**
         * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to
         * the function.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags)
         *
         * @param tags A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html)
         *   to apply to the function.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to
         * the function.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags)
         *
         * @param tags A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html)
         *   to apply to the function.
         */
        public fun tags(vararg tags: CfnTag)

        /**
         * The amount of time (in seconds) that Lambda allows a function to run before stopping it.
         *
         * The default is 3 seconds. The maximum allowed value is 900 seconds. For more information,
         * see
         * [Lambda execution environment](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-context.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout)
         *
         * @param timeout The amount of time (in seconds) that Lambda allows a function to run
         *   before stopping it.
         */
        public fun timeout(timeout: Number)

        /**
         * Set `Mode` to `Active` to sample and trace a subset of incoming requests with
         * [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
         *
         * @param tracingConfig Set `Mode` to `Active` to sample and trace a subset of incoming
         *   requests with [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html)
         *   .
         */
        public fun tracingConfig(tracingConfig: IResolvable)

        /**
         * Set `Mode` to `Active` to sample and trace a subset of incoming requests with
         * [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
         *
         * @param tracingConfig Set `Mode` to `Active` to sample and trace a subset of incoming
         *   requests with [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html)
         *   .
         */
        public fun tracingConfig(tracingConfig: TracingConfigProperty)

        /**
         * Set `Mode` to `Active` to sample and trace a subset of incoming requests with
         * [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
         *
         * @param tracingConfig Set `Mode` to `Active` to sample and trace a subset of incoming
         *   requests with [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html)
         *   .
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("4e2f5a8b6072e93f227df7d16a2a889f29a7588706e4e11185c859fb17987062")
        public fun tracingConfig(tracingConfig: TracingConfigProperty.Builder.() -> Unit)

        /**
         * For network connectivity to AWS resources in a VPC, specify a list of security groups and
         * subnets in the VPC.
         *
         * When you connect a function to a VPC, it can access resources and the internet only
         * through that VPC. For more information, see
         * [Configuring a Lambda function to access resources in a VPC](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
         *
         * @param vpcConfig For network connectivity to AWS resources in a VPC, specify a list of
         *   security groups and subnets in the VPC.
         */
        public fun vpcConfig(vpcConfig: IResolvable)

        /**
         * For network connectivity to AWS resources in a VPC, specify a list of security groups and
         * subnets in the VPC.
         *
         * When you connect a function to a VPC, it can access resources and the internet only
         * through that VPC. For more information, see
         * [Configuring a Lambda function to access resources in a VPC](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
         *
         * @param vpcConfig For network connectivity to AWS resources in a VPC, specify a list of
         *   security groups and subnets in the VPC.
         */
        public fun vpcConfig(vpcConfig: VpcConfigProperty)

        /**
         * For network connectivity to AWS resources in a VPC, specify a list of security groups and
         * subnets in the VPC.
         *
         * When you connect a function to a VPC, it can access resources and the internet only
         * through that VPC. For more information, see
         * [Configuring a Lambda function to access resources in a VPC](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
         *
         * @param vpcConfig For network connectivity to AWS resources in a VPC, specify a list of
         *   security groups and subnets in the VPC.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
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
         * `x86_64` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-architectures)
         *
         * @param architectures The instruction set architecture that the function supports.
         */
        override fun architectures(architectures: List<String>) {
            cdkBuilder.architectures(architectures)
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
        override fun architectures(vararg architectures: String): Unit =
            architectures(architectures.toList())

        /**
         * The code for the function.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
         *
         * @param code The code for the function.
         */
        override fun code(code: IResolvable) {
            cdkBuilder.code(code.let(IResolvable::unwrap))
        }

        /**
         * The code for the function.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
         *
         * @param code The code for the function.
         */
        override fun code(code: CodeProperty) {
            cdkBuilder.code(code.let(CodeProperty::unwrap))
        }

        /**
         * The code for the function.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-code)
         *
         * @param code The code for the function.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("4b3964a0b102134414b694f5e98f6d476e8117850de3823fb7471a38dd26e1f9")
        override fun code(code: CodeProperty.Builder.() -> Unit): Unit = code(CodeProperty(code))

        /**
         * To enable code signing for this function, specify the ARN of a code-signing
         * configuration.
         *
         * A code-signing configuration includes a set of signing profiles, which define the trusted
         * publishers for this function.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-codesigningconfigarn)
         *
         * @param codeSigningConfigArn To enable code signing for this function, specify the ARN of
         *   a code-signing configuration.
         */
        override fun codeSigningConfigArn(codeSigningConfigArn: String) {
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
         * @param deadLetterConfig A dead-letter queue configuration that specifies the queue or
         *   topic where Lambda sends asynchronous events when they fail processing.
         */
        override fun deadLetterConfig(deadLetterConfig: IResolvable) {
            cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable::unwrap))
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
         * @param deadLetterConfig A dead-letter queue configuration that specifies the queue or
         *   topic where Lambda sends asynchronous events when they fail processing.
         */
        override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty) {
            cdkBuilder.deadLetterConfig(deadLetterConfig.let(DeadLetterConfigProperty::unwrap))
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
         * @param deadLetterConfig A dead-letter queue configuration that specifies the queue or
         *   topic where Lambda sends asynchronous events when they fail processing.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("752ac7117e2e0fbfe8b87e093fe0487ed1b922480901063ebbdf41963e1b11b9")
        override fun deadLetterConfig(
            deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit
        ): Unit = deadLetterConfig(DeadLetterConfigProperty(deadLetterConfig))

        /**
         * A description of the function.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-description)
         *
         * @param description A description of the function.
         */
        override fun description(description: String) {
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
        override fun environment(environment: IResolvable) {
            cdkBuilder.environment(environment.let(IResolvable::unwrap))
        }

        /**
         * Environment variables that are accessible from function code during execution.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
         *
         * @param environment Environment variables that are accessible from function code during
         *   execution.
         */
        override fun environment(environment: EnvironmentProperty) {
            cdkBuilder.environment(environment.let(EnvironmentProperty::unwrap))
        }

        /**
         * Environment variables that are accessible from function code during execution.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-environment)
         *
         * @param environment Environment variables that are accessible from function code during
         *   execution.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("6cc75bf28aacefddb8de924be12c3db391e03580ea8cdff98f770371dbd867af")
        override fun environment(environment: EnvironmentProperty.Builder.() -> Unit): Unit =
            environment(EnvironmentProperty(environment))

        /**
         * The size of the function's `/tmp` directory in MB.
         *
         * The default value is 512, but it can be any whole number between 512 and 10,240 MB.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-ephemeralstorage)
         *
         * @param ephemeralStorage The size of the function's `/tmp` directory in MB.
         */
        override fun ephemeralStorage(ephemeralStorage: IResolvable) {
            cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
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
        override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty) {
            cdkBuilder.ephemeralStorage(ephemeralStorage.let(EphemeralStorageProperty::unwrap))
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
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("267f185b4ef53e255fd2df4b6cf38e5767b7112a9894eb62b47a0d4071a3efd4")
        override fun ephemeralStorage(
            ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit
        ): Unit = ephemeralStorage(EphemeralStorageProperty(ephemeralStorage))

        /**
         * Connection settings for an Amazon EFS file system.
         *
         * To connect a function to a file system, a mount target must be available in every
         * Availability Zone that your function connects to. If your template contains an
         * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
         * resource, you must also specify a `DependsOn` attribute to ensure that the mount target
         * is created or updated before the function.
         *
         * For more information about using the `DependsOn` attribute, see
         * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
         *
         * @param fileSystemConfigs Connection settings for an Amazon EFS file system.
         */
        override fun fileSystemConfigs(fileSystemConfigs: IResolvable) {
            cdkBuilder.fileSystemConfigs(fileSystemConfigs.let(IResolvable::unwrap))
        }

        /**
         * Connection settings for an Amazon EFS file system.
         *
         * To connect a function to a file system, a mount target must be available in every
         * Availability Zone that your function connects to. If your template contains an
         * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
         * resource, you must also specify a `DependsOn` attribute to ensure that the mount target
         * is created or updated before the function.
         *
         * For more information about using the `DependsOn` attribute, see
         * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
         *
         * @param fileSystemConfigs Connection settings for an Amazon EFS file system.
         */
        override fun fileSystemConfigs(fileSystemConfigs: List<Any>) {
            cdkBuilder.fileSystemConfigs(fileSystemConfigs)
        }

        /**
         * Connection settings for an Amazon EFS file system.
         *
         * To connect a function to a file system, a mount target must be available in every
         * Availability Zone that your function connects to. If your template contains an
         * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
         * resource, you must also specify a `DependsOn` attribute to ensure that the mount target
         * is created or updated before the function.
         *
         * For more information about using the `DependsOn` attribute, see
         * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-filesystemconfigs)
         *
         * @param fileSystemConfigs Connection settings for an Amazon EFS file system.
         */
        override fun fileSystemConfigs(vararg fileSystemConfigs: Any): Unit =
            fileSystemConfigs(fileSystemConfigs.toList())

        /**
         * The name of the Lambda function, up to 64 characters in length.
         *
         * If you don't specify a name, AWS CloudFormation generates one.
         *
         * If you specify a name, you cannot perform updates that require replacement of this
         * resource. You can perform updates that require no or some interruption. If you must
         * replace the resource, specify a new name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-functionname)
         *
         * @param functionName The name of the Lambda function, up to 64 characters in length.
         */
        override fun functionName(functionName: String) {
            cdkBuilder.functionName(functionName)
        }

        /**
         * The name of the method within your code that Lambda calls to run your function.
         *
         * Handler is required if the deployment package is a .zip file archive. The format includes
         * the file name. It can also include namespaces and other qualifiers, depending on the
         * runtime. For more information, see
         * [Lambda programming model](https://docs.aws.amazon.com/lambda/latest/dg/foundation-progmodel.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-handler)
         *
         * @param handler The name of the method within your code that Lambda calls to run your
         *   function.
         */
        override fun handler(handler: String) {
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
        override fun imageConfig(imageConfig: IResolvable) {
            cdkBuilder.imageConfig(imageConfig.let(IResolvable::unwrap))
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
        override fun imageConfig(imageConfig: ImageConfigProperty) {
            cdkBuilder.imageConfig(imageConfig.let(ImageConfigProperty::unwrap))
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
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("57bb0976d52c1fa65255eccb2f6081a35e932dc8aec9c1d9a9796e8be0d63548")
        override fun imageConfig(imageConfig: ImageConfigProperty.Builder.() -> Unit): Unit =
            imageConfig(ImageConfigProperty(imageConfig))

        /**
         * The ARN of the AWS Key Management Service ( AWS KMS ) customer managed key that's used to
         * encrypt your function's
         * [environment variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-encryption)
         * . When
         * [Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-security.html)
         * is activated, Lambda also uses this key is to encrypt your function's snapshot. If you
         * deploy your function using a container image, Lambda also uses this key to encrypt your
         * function when it's deployed. Note that this is not the same key that's used to protect
         * your container image in the Amazon Elastic Container Registry (Amazon ECR). If you don't
         * provide a customer managed key, Lambda uses a default service key.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-kmskeyarn)
         *
         * @param kmsKeyArn The ARN of the AWS Key Management Service ( AWS KMS ) customer managed
         *   key that's used to encrypt your function's
         *   [environment variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-encryption)
         *   . When
         *   [Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-security.html)
         *   is activated, Lambda also uses this key is to encrypt your function's snapshot. If you
         *   deploy your function using a container image, Lambda also uses this key to encrypt your
         *   function when it's deployed. Note that this is not the same key that's used to protect
         *   your container image in the Amazon Elastic Container Registry (Amazon ECR). If you
         *   don't provide a customer managed key, Lambda uses a default service key.
         */
        override fun kmsKeyArn(kmsKeyArn: String) {
            cdkBuilder.kmsKeyArn(kmsKeyArn)
        }

        /**
         * A list of
         * [function layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html)
         * to add to the function's execution environment. Specify each layer by its ARN, including
         * the version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-layers)
         *
         * @param layers A list of
         *   [function layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html)
         *   to add to the function's execution environment. Specify each layer by its ARN,
         *   including the version.
         */
        override fun layers(layers: List<String>) {
            cdkBuilder.layers(layers)
        }

        /**
         * A list of
         * [function layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html)
         * to add to the function's execution environment. Specify each layer by its ARN, including
         * the version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-layers)
         *
         * @param layers A list of
         *   [function layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html)
         *   to add to the function's execution environment. Specify each layer by its ARN,
         *   including the version.
         */
        override fun layers(vararg layers: String): Unit = layers(layers.toList())

        /**
         * The function's Amazon CloudWatch Logs configuration settings.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-loggingconfig)
         *
         * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings.
         */
        override fun loggingConfig(loggingConfig: IResolvable) {
            cdkBuilder.loggingConfig(loggingConfig.let(IResolvable::unwrap))
        }

        /**
         * The function's Amazon CloudWatch Logs configuration settings.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-loggingconfig)
         *
         * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings.
         */
        override fun loggingConfig(loggingConfig: LoggingConfigProperty) {
            cdkBuilder.loggingConfig(loggingConfig.let(LoggingConfigProperty::unwrap))
        }

        /**
         * The function's Amazon CloudWatch Logs configuration settings.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-loggingconfig)
         *
         * @param loggingConfig The function's Amazon CloudWatch Logs configuration settings.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("35a23952b1548ee98fba599d4723265cfca977fe42a79c55077816685417fdfa")
        override fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit): Unit =
            loggingConfig(LoggingConfigProperty(loggingConfig))

        /**
         * The amount of
         * [memory available to the function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
         * at runtime. Increasing the function memory also increases its CPU allocation. The default
         * value is 128 MB. The value can be any multiple of 1 MB. Note that new AWS accounts have
         * reduced concurrency and memory quotas. AWS raises these quotas automatically based on
         * your usage. You can also request a quota increase.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-memorysize)
         *
         * @param memorySize The amount of
         *   [memory available to the function](https://docs.aws.amazon.com/lambda/latest/dg/configuration-function-common.html#configuration-memory-console)
         *   at runtime. Increasing the function memory also increases its CPU allocation. The
         *   default value is 128 MB. The value can be any multiple of 1 MB. Note that new AWS
         *   accounts have reduced concurrency and memory quotas. AWS raises these quotas
         *   automatically based on your usage. You can also request a quota increase.
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
         *
         * @param packageType The type of deployment package.
         */
        override fun packageType(packageType: String) {
            cdkBuilder.packageType(packageType)
        }

        /**
         * The number of simultaneous executions to reserve for the function.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-reservedconcurrentexecutions)
         *
         * @param reservedConcurrentExecutions The number of simultaneous executions to reserve for
         *   the function.
         */
        override fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
            cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
        }

        /**
         * The Amazon Resource Name (ARN) of the function's execution role.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-role)
         *
         * @param role The Amazon Resource Name (ARN) of the function's execution role.
         */
        override fun role(role: String) {
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
         *   [runtime](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Runtime
         *   is required if the deployment package is a .zip file archive.
         */
        override fun runtime(runtime: String) {
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
        override fun runtimeManagementConfig(runtimeManagementConfig: IResolvable) {
            cdkBuilder.runtimeManagementConfig(runtimeManagementConfig.let(IResolvable::unwrap))
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
        override fun runtimeManagementConfig(
            runtimeManagementConfig: RuntimeManagementConfigProperty
        ) {
            cdkBuilder.runtimeManagementConfig(
                runtimeManagementConfig.let(RuntimeManagementConfigProperty::unwrap)
            )
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
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("95a300663ca3f8b32e2befd34380c14ac3d734fe6d5c6a108d01ade64520be7b")
        override fun runtimeManagementConfig(
            runtimeManagementConfig: RuntimeManagementConfigProperty.Builder.() -> Unit
        ): Unit = runtimeManagementConfig(RuntimeManagementConfigProperty(runtimeManagementConfig))

        /**
         * The function's
         * [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
         * setting.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-snapstart)
         *
         * @param snapStart The function's
         *   [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
         *   setting.
         */
        override fun snapStart(snapStart: IResolvable) {
            cdkBuilder.snapStart(snapStart.let(IResolvable::unwrap))
        }

        /**
         * The function's
         * [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
         * setting.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-snapstart)
         *
         * @param snapStart The function's
         *   [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
         *   setting.
         */
        override fun snapStart(snapStart: SnapStartProperty) {
            cdkBuilder.snapStart(snapStart.let(SnapStartProperty::unwrap))
        }

        /**
         * The function's
         * [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
         * setting.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-snapstart)
         *
         * @param snapStart The function's
         *   [AWS Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)
         *   setting.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("d2590028845f970506309395f8bc94970e797ab159c68443cb26ca01e9e8a449")
        override fun snapStart(snapStart: SnapStartProperty.Builder.() -> Unit): Unit =
            snapStart(SnapStartProperty(snapStart))

        /**
         * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to
         * the function.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags)
         *
         * @param tags A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html)
         *   to apply to the function.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to apply to
         * the function.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tags)
         *
         * @param tags A list of [tags](https://docs.aws.amazon.com/lambda/latest/dg/tagging.html)
         *   to apply to the function.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        /**
         * The amount of time (in seconds) that Lambda allows a function to run before stopping it.
         *
         * The default is 3 seconds. The maximum allowed value is 900 seconds. For more information,
         * see
         * [Lambda execution environment](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-context.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-timeout)
         *
         * @param timeout The amount of time (in seconds) that Lambda allows a function to run
         *   before stopping it.
         */
        override fun timeout(timeout: Number) {
            cdkBuilder.timeout(timeout)
        }

        /**
         * Set `Mode` to `Active` to sample and trace a subset of incoming requests with
         * [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
         *
         * @param tracingConfig Set `Mode` to `Active` to sample and trace a subset of incoming
         *   requests with [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html)
         *   .
         */
        override fun tracingConfig(tracingConfig: IResolvable) {
            cdkBuilder.tracingConfig(tracingConfig.let(IResolvable::unwrap))
        }

        /**
         * Set `Mode` to `Active` to sample and trace a subset of incoming requests with
         * [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
         *
         * @param tracingConfig Set `Mode` to `Active` to sample and trace a subset of incoming
         *   requests with [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html)
         *   .
         */
        override fun tracingConfig(tracingConfig: TracingConfigProperty) {
            cdkBuilder.tracingConfig(tracingConfig.let(TracingConfigProperty::unwrap))
        }

        /**
         * Set `Mode` to `Active` to sample and trace a subset of incoming requests with
         * [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html) .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-tracingconfig)
         *
         * @param tracingConfig Set `Mode` to `Active` to sample and trace a subset of incoming
         *   requests with [X-Ray](https://docs.aws.amazon.com/lambda/latest/dg/services-xray.html)
         *   .
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("4e2f5a8b6072e93f227df7d16a2a889f29a7588706e4e11185c859fb17987062")
        override fun tracingConfig(tracingConfig: TracingConfigProperty.Builder.() -> Unit): Unit =
            tracingConfig(TracingConfigProperty(tracingConfig))

        /**
         * For network connectivity to AWS resources in a VPC, specify a list of security groups and
         * subnets in the VPC.
         *
         * When you connect a function to a VPC, it can access resources and the internet only
         * through that VPC. For more information, see
         * [Configuring a Lambda function to access resources in a VPC](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
         *
         * @param vpcConfig For network connectivity to AWS resources in a VPC, specify a list of
         *   security groups and subnets in the VPC.
         */
        override fun vpcConfig(vpcConfig: IResolvable) {
            cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
        }

        /**
         * For network connectivity to AWS resources in a VPC, specify a list of security groups and
         * subnets in the VPC.
         *
         * When you connect a function to a VPC, it can access resources and the internet only
         * through that VPC. For more information, see
         * [Configuring a Lambda function to access resources in a VPC](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
         *
         * @param vpcConfig For network connectivity to AWS resources in a VPC, specify a list of
         *   security groups and subnets in the VPC.
         */
        override fun vpcConfig(vpcConfig: VpcConfigProperty) {
            cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
        }

        /**
         * For network connectivity to AWS resources in a VPC, specify a list of security groups and
         * subnets in the VPC.
         *
         * When you connect a function to a VPC, it can access resources and the internet only
         * through that VPC. For more information, see
         * [Configuring a Lambda function to access resources in a VPC](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-function.html#cfn-lambda-function-vpcconfig)
         *
         * @param vpcConfig For network connectivity to AWS resources in a VPC, specify a list of
         *   security groups and subnets in the VPC.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("a95f83151908acd2460fc35b80b4458507ae5c0a7b04dcdf6a96ad632af5a117")
        override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
            vpcConfig(VpcConfigProperty(vpcConfig))

        public fun build(): software.amazon.awscdk.services.lambda.CfnFunction = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnFunction {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnFunction(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lambda.CfnFunction
        ): CfnFunction = CfnFunction(cdkObject)

        internal fun unwrap(
            wrapped: CfnFunction
        ): software.amazon.awscdk.services.lambda.CfnFunction = wrapped.cdkObject
    }

    public interface TracingConfigProperty {
        /**
         * The tracing mode.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html#cfn-lambda-function-tracingconfig-mode)
         */
        public fun mode(): String? = unwrap(this).getMode()

        /** A builder for [TracingConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param mode The tracing mode. */
            public fun mode(mode: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty.Builder =
                software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty.builder()

            /** @param mode The tracing mode. */
            override fun mode(mode: String) {
                cdkBuilder.mode(mode)
            }

            public fun build():
                software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty,
        ) : TracingConfigProperty {
            /**
             * The tracing mode.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-tracingconfig.html#cfn-lambda-function-tracingconfig-mode)
             */
            override fun mode(): String? = unwrap(this).getMode()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): TracingConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty
            ): TracingConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TracingConfigProperty
            ): software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

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
        public fun securityGroupIds(): List<String> =
            unwrap(this).getSecurityGroupIds() ?: emptyList()

        /**
         * A list of VPC subnet IDs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-subnetids)
         */
        public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

        /** A builder for [VpcConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param ipv6AllowedForDualStack Allows outbound IPv6 traffic on VPC functions that are
             *   connected to dual-stack subnets.
             */
            public fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: Boolean)

            /**
             * @param ipv6AllowedForDualStack Allows outbound IPv6 traffic on VPC functions that are
             *   connected to dual-stack subnets.
             */
            public fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: IResolvable)

            /** @param securityGroupIds A list of VPC security group IDs. */
            public fun securityGroupIds(securityGroupIds: List<String>)

            /** @param securityGroupIds A list of VPC security group IDs. */
            public fun securityGroupIds(vararg securityGroupIds: String)

            /** @param subnetIds A list of VPC subnet IDs. */
            public fun subnetIds(subnetIds: List<String>)

            /** @param subnetIds A list of VPC subnet IDs. */
            public fun subnetIds(vararg subnetIds: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty.Builder =
                software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty.builder()

            /**
             * @param ipv6AllowedForDualStack Allows outbound IPv6 traffic on VPC functions that are
             *   connected to dual-stack subnets.
             */
            override fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: Boolean) {
                cdkBuilder.ipv6AllowedForDualStack(ipv6AllowedForDualStack)
            }

            /**
             * @param ipv6AllowedForDualStack Allows outbound IPv6 traffic on VPC functions that are
             *   connected to dual-stack subnets.
             */
            override fun ipv6AllowedForDualStack(ipv6AllowedForDualStack: IResolvable) {
                cdkBuilder.ipv6AllowedForDualStack(ipv6AllowedForDualStack.let(IResolvable::unwrap))
            }

            /** @param securityGroupIds A list of VPC security group IDs. */
            override fun securityGroupIds(securityGroupIds: List<String>) {
                cdkBuilder.securityGroupIds(securityGroupIds)
            }

            /** @param securityGroupIds A list of VPC security group IDs. */
            override fun securityGroupIds(vararg securityGroupIds: String): Unit =
                securityGroupIds(securityGroupIds.toList())

            /** @param subnetIds A list of VPC subnet IDs. */
            override fun subnetIds(subnetIds: List<String>) {
                cdkBuilder.subnetIds(subnetIds)
            }

            /** @param subnetIds A list of VPC subnet IDs. */
            override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

            public fun build():
                software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty,
        ) : VpcConfigProperty {
            /**
             * Allows outbound IPv6 traffic on VPC functions that are connected to dual-stack
             * subnets.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-ipv6allowedfordualstack)
             */
            override fun ipv6AllowedForDualStack(): Any? = unwrap(this).getIpv6AllowedForDualStack()

            /**
             * A list of VPC security group IDs.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-securitygroupids)
             */
            override fun securityGroupIds(): List<String> =
                unwrap(this).getSecurityGroupIds() ?: emptyList()

            /**
             * A list of VPC subnet IDs.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-subnetids)
             */
            override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty
            ): VpcConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VpcConfigProperty
            ): software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SnapStartProperty {
        /**
         * Set `ApplyOn` to `PublishedVersions` to create a snapshot of the initialized execution
         * environment when you publish a function version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstart.html#cfn-lambda-function-snapstart-applyon)
         */
        public fun applyOn(): String

        /** A builder for [SnapStartProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param applyOn Set `ApplyOn` to `PublishedVersions` to create a snapshot of the
             *   initialized execution environment when you publish a function version.
             */
            public fun applyOn(applyOn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty.Builder =
                software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty.builder()

            /**
             * @param applyOn Set `ApplyOn` to `PublishedVersions` to create a snapshot of the
             *   initialized execution environment when you publish a function version.
             */
            override fun applyOn(applyOn: String) {
                cdkBuilder.applyOn(applyOn)
            }

            public fun build():
                software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty,
        ) : SnapStartProperty {
            /**
             * Set `ApplyOn` to `PublishedVersions` to create a snapshot of the initialized
             * execution environment when you publish a function version.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstart.html#cfn-lambda-function-snapstart-applyon)
             */
            override fun applyOn(): String = unwrap(this).getApplyOn()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): SnapStartProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty
            ): SnapStartProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SnapStartProperty
            ): software.amazon.awscdk.services.lambda.CfnFunction.SnapStartProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface EphemeralStorageProperty {
        /**
         * The size of the function's `/tmp` directory.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-ephemeralstorage.html#cfn-lambda-function-ephemeralstorage-size)
         */
        public fun size(): Number

        /** A builder for [EphemeralStorageProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param size The size of the function's `/tmp` directory. */
            public fun size(size: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty.Builder =
                software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty
                    .builder()

            /** @param size The size of the function's `/tmp` directory. */
            override fun size(size: Number) {
                cdkBuilder.size(size)
            }

            public fun build():
                software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty,
        ) : EphemeralStorageProperty {
            /**
             * The size of the function's `/tmp` directory.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-ephemeralstorage.html#cfn-lambda-function-ephemeralstorage-size)
             */
            override fun size(): Number = unwrap(this).getSize()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): EphemeralStorageProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty
            ): EphemeralStorageProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: EphemeralStorageProperty
            ): software.amazon.awscdk.services.lambda.CfnFunction.EphemeralStorageProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

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
         * * *Auto (default)* - Automatically update to the most recent and secure runtime version
         *   using a
         *   [Two-phase runtime version rollout](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase)
         *   . This is the best choice for most customers to ensure they always benefit from runtime
         *   updates.
         * * *FunctionUpdate* - Lambda updates the runtime of you function to the most recent and
         *   secure runtime version when you update your function. This approach synchronizes
         *   runtime updates with function deployments, giving you control over when runtime updates
         *   are applied and allowing you to detect and mitigate rare runtime update
         *   incompatibilities early. When using this setting, you need to regularly update your
         *   functions to keep their runtime up-to-date.
         * * *Manual* - You specify a runtime version in your function configuration. The function
         *   will use this runtime version indefinitely. In the rare case where a new runtime
         *   version is incompatible with an existing function, this allows you to roll back your
         *   function to an earlier runtime version. For more information, see
         *   [Roll back a runtime version](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback)
         *   .
         *
         * *Valid Values* : `Auto` | `FunctionUpdate` | `Manual`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-runtimemanagementconfig.html#cfn-lambda-function-runtimemanagementconfig-updateruntimeon)
         */
        public fun updateRuntimeOn(): String

        /** A builder for [RuntimeManagementConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param runtimeVersionArn The ARN of the runtime version you want the function to use.
             *
             * This is only required if you're using the *Manual* runtime update mode.
             */
            public fun runtimeVersionArn(runtimeVersionArn: String)

            /**
             * @param updateRuntimeOn Specify the runtime update mode.
             * * *Auto (default)* - Automatically update to the most recent and secure runtime
             *   version using a
             *   [Two-phase runtime version rollout](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase)
             *   . This is the best choice for most customers to ensure they always benefit from
             *   runtime updates.
             * * *FunctionUpdate* - Lambda updates the runtime of you function to the most recent
             *   and secure runtime version when you update your function. This approach
             *   synchronizes runtime updates with function deployments, giving you control over
             *   when runtime updates are applied and allowing you to detect and mitigate rare
             *   runtime update incompatibilities early. When using this setting, you need to
             *   regularly update your functions to keep their runtime up-to-date.
             * * *Manual* - You specify a runtime version in your function configuration. The
             *   function will use this runtime version indefinitely. In the rare case where a new
             *   runtime version is incompatible with an existing function, this allows you to roll
             *   back your function to an earlier runtime version. For more information, see
             *   [Roll back a runtime version](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback)
             *   .
             *
             * *Valid Values* : `Auto` | `FunctionUpdate` | `Manual`
             */
            public fun updateRuntimeOn(updateRuntimeOn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty.Builder =
                software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty
                    .builder()

            /**
             * @param runtimeVersionArn The ARN of the runtime version you want the function to use.
             *
             * This is only required if you're using the *Manual* runtime update mode.
             */
            override fun runtimeVersionArn(runtimeVersionArn: String) {
                cdkBuilder.runtimeVersionArn(runtimeVersionArn)
            }

            /**
             * @param updateRuntimeOn Specify the runtime update mode.
             * * *Auto (default)* - Automatically update to the most recent and secure runtime
             *   version using a
             *   [Two-phase runtime version rollout](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase)
             *   . This is the best choice for most customers to ensure they always benefit from
             *   runtime updates.
             * * *FunctionUpdate* - Lambda updates the runtime of you function to the most recent
             *   and secure runtime version when you update your function. This approach
             *   synchronizes runtime updates with function deployments, giving you control over
             *   when runtime updates are applied and allowing you to detect and mitigate rare
             *   runtime update incompatibilities early. When using this setting, you need to
             *   regularly update your functions to keep their runtime up-to-date.
             * * *Manual* - You specify a runtime version in your function configuration. The
             *   function will use this runtime version indefinitely. In the rare case where a new
             *   runtime version is incompatible with an existing function, this allows you to roll
             *   back your function to an earlier runtime version. For more information, see
             *   [Roll back a runtime version](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback)
             *   .
             *
             * *Valid Values* : `Auto` | `FunctionUpdate` | `Manual`
             */
            override fun updateRuntimeOn(updateRuntimeOn: String) {
                cdkBuilder.updateRuntimeOn(updateRuntimeOn)
            }

            public fun build():
                software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty,
        ) : RuntimeManagementConfigProperty {
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
             * * *Auto (default)* - Automatically update to the most recent and secure runtime
             *   version using a
             *   [Two-phase runtime version rollout](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-two-phase)
             *   . This is the best choice for most customers to ensure they always benefit from
             *   runtime updates.
             * * *FunctionUpdate* - Lambda updates the runtime of you function to the most recent
             *   and secure runtime version when you update your function. This approach
             *   synchronizes runtime updates with function deployments, giving you control over
             *   when runtime updates are applied and allowing you to detect and mitigate rare
             *   runtime update incompatibilities early. When using this setting, you need to
             *   regularly update your functions to keep their runtime up-to-date.
             * * *Manual* - You specify a runtime version in your function configuration. The
             *   function will use this runtime version indefinitely. In the rare case where a new
             *   runtime version is incompatible with an existing function, this allows you to roll
             *   back your function to an earlier runtime version. For more information, see
             *   [Roll back a runtime version](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-update.html#runtime-management-rollback)
             *   .
             *
             * *Valid Values* : `Auto` | `FunctionUpdate` | `Manual`
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-runtimemanagementconfig.html#cfn-lambda-function-runtimemanagementconfig-updateruntimeon)
             */
            override fun updateRuntimeOn(): String = unwrap(this).getUpdateRuntimeOn()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): RuntimeManagementConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty
            ): RuntimeManagementConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: RuntimeManagementConfigProperty
            ): software.amazon.awscdk.services.lambda.CfnFunction.RuntimeManagementConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface LoggingConfigProperty {
        /**
         * Set this property to filter the application logs for your function that Lambda sends to
         * CloudWatch.
         *
         * Lambda only sends application logs at the selected level of detail and lower, where
         * `TRACE` is the highest level and `FATAL` is the lowest.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html#cfn-lambda-function-loggingconfig-applicationloglevel)
         */
        public fun applicationLogLevel(): String? = unwrap(this).getApplicationLogLevel()

        /**
         * The format in which Lambda sends your function's application and system logs to
         * CloudWatch.
         *
         * Select between plain text and structured JSON.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html#cfn-lambda-function-loggingconfig-logformat)
         */
        public fun logFormat(): String? = unwrap(this).getLogFormat()

        /**
         * The name of the Amazon CloudWatch log group the function sends logs to.
         *
         * By default, Lambda functions send logs to a default log group named
         * `/aws/lambda/&lt;function name&gt;` . To use a different log group, enter an existing log
         * group or enter a new log group name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html#cfn-lambda-function-loggingconfig-loggroup)
         */
        public fun logGroup(): String? = unwrap(this).getLogGroup()

        /**
         * Set this property to filter the system logs for your function that Lambda sends to
         * CloudWatch.
         *
         * Lambda only sends system logs at the selected level of detail and lower, where `DEBUG` is
         * the highest level and `WARN` is the lowest.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html#cfn-lambda-function-loggingconfig-systemloglevel)
         */
        public fun systemLogLevel(): String? = unwrap(this).getSystemLogLevel()

        /** A builder for [LoggingConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param applicationLogLevel Set this property to filter the application logs for your
             *   function that Lambda sends to CloudWatch. Lambda only sends application logs at the
             *   selected level of detail and lower, where `TRACE` is the highest level and `FATAL`
             *   is the lowest.
             */
            public fun applicationLogLevel(applicationLogLevel: String)

            /**
             * @param logFormat The format in which Lambda sends your function's application and
             *   system logs to CloudWatch. Select between plain text and structured JSON.
             */
            public fun logFormat(logFormat: String)

            /**
             * @param logGroup The name of the Amazon CloudWatch log group the function sends logs
             *   to. By default, Lambda functions send logs to a default log group named
             *   `/aws/lambda/&lt;function name&gt;` . To use a different log group, enter an
             *   existing log group or enter a new log group name.
             */
            public fun logGroup(logGroup: String)

            /**
             * @param systemLogLevel Set this property to filter the system logs for your function
             *   that Lambda sends to CloudWatch. Lambda only sends system logs at the selected
             *   level of detail and lower, where `DEBUG` is the highest level and `WARN` is the
             *   lowest.
             */
            public fun systemLogLevel(systemLogLevel: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty.Builder =
                software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty.builder()

            /**
             * @param applicationLogLevel Set this property to filter the application logs for your
             *   function that Lambda sends to CloudWatch. Lambda only sends application logs at the
             *   selected level of detail and lower, where `TRACE` is the highest level and `FATAL`
             *   is the lowest.
             */
            override fun applicationLogLevel(applicationLogLevel: String) {
                cdkBuilder.applicationLogLevel(applicationLogLevel)
            }

            /**
             * @param logFormat The format in which Lambda sends your function's application and
             *   system logs to CloudWatch. Select between plain text and structured JSON.
             */
            override fun logFormat(logFormat: String) {
                cdkBuilder.logFormat(logFormat)
            }

            /**
             * @param logGroup The name of the Amazon CloudWatch log group the function sends logs
             *   to. By default, Lambda functions send logs to a default log group named
             *   `/aws/lambda/&lt;function name&gt;` . To use a different log group, enter an
             *   existing log group or enter a new log group name.
             */
            override fun logGroup(logGroup: String) {
                cdkBuilder.logGroup(logGroup)
            }

            /**
             * @param systemLogLevel Set this property to filter the system logs for your function
             *   that Lambda sends to CloudWatch. Lambda only sends system logs at the selected
             *   level of detail and lower, where `DEBUG` is the highest level and `WARN` is the
             *   lowest.
             */
            override fun systemLogLevel(systemLogLevel: String) {
                cdkBuilder.systemLogLevel(systemLogLevel)
            }

            public fun build():
                software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty,
        ) : LoggingConfigProperty {
            /**
             * Set this property to filter the application logs for your function that Lambda sends
             * to CloudWatch.
             *
             * Lambda only sends application logs at the selected level of detail and lower, where
             * `TRACE` is the highest level and `FATAL` is the lowest.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html#cfn-lambda-function-loggingconfig-applicationloglevel)
             */
            override fun applicationLogLevel(): String? = unwrap(this).getApplicationLogLevel()

            /**
             * The format in which Lambda sends your function's application and system logs to
             * CloudWatch.
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
             * `/aws/lambda/&lt;function name&gt;` . To use a different log group, enter an existing
             * log group or enter a new log group name.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html#cfn-lambda-function-loggingconfig-loggroup)
             */
            override fun logGroup(): String? = unwrap(this).getLogGroup()

            /**
             * Set this property to filter the system logs for your function that Lambda sends to
             * CloudWatch.
             *
             * Lambda only sends system logs at the selected level of detail and lower, where
             * `DEBUG` is the highest level and `WARN` is the lowest.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html#cfn-lambda-function-loggingconfig-systemloglevel)
             */
            override fun systemLogLevel(): String? = unwrap(this).getSystemLogLevel()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty
            ): LoggingConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: LoggingConfigProperty
            ): software.amazon.awscdk.services.lambda.CfnFunction.LoggingConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface DeadLetterConfigProperty {
        /**
         * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html#cfn-lambda-function-deadletterconfig-targetarn)
         */
        public fun targetArn(): String? = unwrap(this).getTargetArn()

        /** A builder for [DeadLetterConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param targetArn The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS
             *   topic.
             */
            public fun targetArn(targetArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty.Builder =
                software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty
                    .builder()

            /**
             * @param targetArn The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS
             *   topic.
             */
            override fun targetArn(targetArn: String) {
                cdkBuilder.targetArn(targetArn)
            }

            public fun build():
                software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty,
        ) : DeadLetterConfigProperty {
            /**
             * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html#cfn-lambda-function-deadletterconfig-targetarn)
             */
            override fun targetArn(): String? = unwrap(this).getTargetArn()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): DeadLetterConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty
            ): DeadLetterConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: DeadLetterConfigProperty
            ): software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

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

        /** A builder for [ImageConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param command Specifies parameters that you want to pass in with ENTRYPOINT. You can
             *   specify a maximum of 1,500 parameters in the list.
             */
            public fun command(command: List<String>)

            /**
             * @param command Specifies parameters that you want to pass in with ENTRYPOINT. You can
             *   specify a maximum of 1,500 parameters in the list.
             */
            public fun command(vararg command: String)

            /**
             * @param entryPoint Specifies the entry point to their application, which is typically
             *   the location of the runtime executable. You can specify a maximum of 1,500 string
             *   entries in the list.
             */
            public fun entryPoint(entryPoint: List<String>)

            /**
             * @param entryPoint Specifies the entry point to their application, which is typically
             *   the location of the runtime executable. You can specify a maximum of 1,500 string
             *   entries in the list.
             */
            public fun entryPoint(vararg entryPoint: String)

            /**
             * @param workingDirectory Specifies the working directory. The length of the directory
             *   string cannot exceed 1,000 characters.
             */
            public fun workingDirectory(workingDirectory: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty.Builder =
                software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty.builder()

            /**
             * @param command Specifies parameters that you want to pass in with ENTRYPOINT. You can
             *   specify a maximum of 1,500 parameters in the list.
             */
            override fun command(command: List<String>) {
                cdkBuilder.command(command)
            }

            /**
             * @param command Specifies parameters that you want to pass in with ENTRYPOINT. You can
             *   specify a maximum of 1,500 parameters in the list.
             */
            override fun command(vararg command: String): Unit = command(command.toList())

            /**
             * @param entryPoint Specifies the entry point to their application, which is typically
             *   the location of the runtime executable. You can specify a maximum of 1,500 string
             *   entries in the list.
             */
            override fun entryPoint(entryPoint: List<String>) {
                cdkBuilder.entryPoint(entryPoint)
            }

            /**
             * @param entryPoint Specifies the entry point to their application, which is typically
             *   the location of the runtime executable. You can specify a maximum of 1,500 string
             *   entries in the list.
             */
            override fun entryPoint(vararg entryPoint: String): Unit =
                entryPoint(entryPoint.toList())

            /**
             * @param workingDirectory Specifies the working directory. The length of the directory
             *   string cannot exceed 1,000 characters.
             */
            override fun workingDirectory(workingDirectory: String) {
                cdkBuilder.workingDirectory(workingDirectory)
            }

            public fun build():
                software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty,
        ) : ImageConfigProperty {
            /**
             * Specifies parameters that you want to pass in with ENTRYPOINT.
             *
             * You can specify a maximum of 1,500 parameters in the list.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-imageconfig.html#cfn-lambda-function-imageconfig-command)
             */
            override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

            /**
             * Specifies the entry point to their application, which is typically the location of
             * the runtime executable.
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
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): ImageConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty
            ): ImageConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ImageConfigProperty
            ): software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface EnvironmentProperty {
        /**
         * Environment variable key-value pairs.
         *
         * For more information, see
         * [Using Lambda environment variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html#cfn-lambda-function-environment-variables)
         */
        public fun variables(): Any? = unwrap(this).getVariables()

        /** A builder for [EnvironmentProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param variables Environment variable key-value pairs. For more information, see
             *   [Using Lambda environment variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html)
             *   .
             */
            public fun variables(variables: IResolvable)

            /**
             * @param variables Environment variable key-value pairs. For more information, see
             *   [Using Lambda environment variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html)
             *   .
             */
            public fun variables(variables: Map<String, String>)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty.Builder =
                software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty.builder()

            /**
             * @param variables Environment variable key-value pairs. For more information, see
             *   [Using Lambda environment variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html)
             *   .
             */
            override fun variables(variables: IResolvable) {
                cdkBuilder.variables(variables.let(IResolvable::unwrap))
            }

            /**
             * @param variables Environment variable key-value pairs. For more information, see
             *   [Using Lambda environment variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html)
             *   .
             */
            override fun variables(variables: Map<String, String>) {
                cdkBuilder.variables(variables)
            }

            public fun build():
                software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty,
        ) : EnvironmentProperty {
            /**
             * Environment variable key-value pairs.
             *
             * For more information, see
             * [Using Lambda environment variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html#cfn-lambda-function-environment-variables)
             */
            override fun variables(): Any? = unwrap(this).getVariables()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty
            ): EnvironmentProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: EnvironmentProperty
            ): software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface FileSystemConfigProperty {
        /**
         * The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to the
         * file system.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-filesystemconfig.html#cfn-lambda-function-filesystemconfig-arn)
         */
        public fun arn(): String

        /**
         * The path where the function can access the file system, starting with `/mnt/` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-filesystemconfig.html#cfn-lambda-function-filesystemconfig-localmountpath)
         */
        public fun localMountPath(): String

        /** A builder for [FileSystemConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param arn The Amazon Resource Name (ARN) of the Amazon EFS access point that
             *   provides access to the file system.
             */
            public fun arn(arn: String)

            /**
             * @param localMountPath The path where the function can access the file system,
             *   starting with `/mnt/` .
             */
            public fun localMountPath(localMountPath: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty.Builder =
                software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty
                    .builder()

            /**
             * @param arn The Amazon Resource Name (ARN) of the Amazon EFS access point that
             *   provides access to the file system.
             */
            override fun arn(arn: String) {
                cdkBuilder.arn(arn)
            }

            /**
             * @param localMountPath The path where the function can access the file system,
             *   starting with `/mnt/` .
             */
            override fun localMountPath(localMountPath: String) {
                cdkBuilder.localMountPath(localMountPath)
            }

            public fun build():
                software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty,
        ) : FileSystemConfigProperty {
            /**
             * The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to
             * the file system.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-filesystemconfig.html#cfn-lambda-function-filesystemconfig-arn)
             */
            override fun arn(): String = unwrap(this).getArn()

            /**
             * The path where the function can access the file system, starting with `/mnt/` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-filesystemconfig.html#cfn-lambda-function-filesystemconfig-localmountpath)
             */
            override fun localMountPath(): String = unwrap(this).getLocalMountPath()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty
            ): FileSystemConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: FileSystemConfigProperty
            ): software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SnapStartResponseProperty {
        /**
         * When set to `PublishedVersions` , Lambda creates a snapshot of the execution environment
         * when you publish a function version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstartresponse.html#cfn-lambda-function-snapstartresponse-applyon)
         */
        public fun applyOn(): String? = unwrap(this).getApplyOn()

        /**
         * When you provide a
         * [qualified Amazon Resource Name (ARN)](https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using)
         * , this response element indicates whether SnapStart is activated for the specified
         * function version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstartresponse.html#cfn-lambda-function-snapstartresponse-optimizationstatus)
         */
        public fun optimizationStatus(): String? = unwrap(this).getOptimizationStatus()

        /** A builder for [SnapStartResponseProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param applyOn When set to `PublishedVersions` , Lambda creates a snapshot of the
             *   execution environment when you publish a function version.
             */
            public fun applyOn(applyOn: String)

            /**
             * @param optimizationStatus When you provide a
             *   [qualified Amazon Resource Name (ARN)](https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using)
             *   , this response element indicates whether SnapStart is activated for the specified
             *   function version.
             */
            public fun optimizationStatus(optimizationStatus: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty.Builder =
                software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty
                    .builder()

            /**
             * @param applyOn When set to `PublishedVersions` , Lambda creates a snapshot of the
             *   execution environment when you publish a function version.
             */
            override fun applyOn(applyOn: String) {
                cdkBuilder.applyOn(applyOn)
            }

            /**
             * @param optimizationStatus When you provide a
             *   [qualified Amazon Resource Name (ARN)](https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using)
             *   , this response element indicates whether SnapStart is activated for the specified
             *   function version.
             */
            override fun optimizationStatus(optimizationStatus: String) {
                cdkBuilder.optimizationStatus(optimizationStatus)
            }

            public fun build():
                software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty,
        ) : SnapStartResponseProperty {
            /**
             * When set to `PublishedVersions` , Lambda creates a snapshot of the execution
             * environment when you publish a function version.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstartresponse.html#cfn-lambda-function-snapstartresponse-applyon)
             */
            override fun applyOn(): String? = unwrap(this).getApplyOn()

            /**
             * When you provide a
             * [qualified Amazon Resource Name (ARN)](https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using)
             * , this response element indicates whether SnapStart is activated for the specified
             * function version.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-snapstartresponse.html#cfn-lambda-function-snapstartresponse-optimizationstatus)
             */
            override fun optimizationStatus(): String? = unwrap(this).getOptimizationStatus()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): SnapStartResponseProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty
            ): SnapStartResponseProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SnapStartResponseProperty
            ): software.amazon.awscdk.services.lambda.CfnFunction.SnapStartResponseProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CodeProperty {
        /**
         * URI of a
         * [container image](https://docs.aws.amazon.com/lambda/latest/dg/lambda-images.html) in the
         * Amazon ECR registry.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-imageuri)
         */
        public fun imageUri(): String? = unwrap(this).getImageUri()

        /**
         * An Amazon S3 bucket in the same AWS Region as your function.
         *
         * The bucket can be in a different AWS account .
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
         * (Node.js and Python) The source code of your Lambda function. If you include your
         * function source inline with this parameter, AWS CloudFormation places it in a file named
         * `index` and zips it to create a
         * [deployment package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html)
         * . This zip file cannot exceed 4MB. For the `Handler` property, the first part of the
         * handler identifier must be `index` . For example, `index.handler` .
         *
         * For JSON, you must escape quotes and special characters such as newline ( `\n` ) with a
         * backslash.
         *
         * If you specify a function that interacts with an AWS CloudFormation custom resource, you
         * don't have to write your own functions to send responses to the custom resource that
         * invoked the function. AWS CloudFormation provides a response module (
         * [cfn-response](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-lambda-function-code-cfnresponsemodule.html)
         * ) that simplifies sending responses. See
         * [Using AWS Lambda with AWS CloudFormation](https://docs.aws.amazon.com/lambda/latest/dg/services-cloudformation.html)
         * for details.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-zipfile)
         */
        public fun zipFile(): String? = unwrap(this).getZipFile()

        /** A builder for [CodeProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param imageUri URI of a
             *   [container image](https://docs.aws.amazon.com/lambda/latest/dg/lambda-images.html)
             *   in the Amazon ECR registry.
             */
            public fun imageUri(imageUri: String)

            /**
             * @param s3Bucket An Amazon S3 bucket in the same AWS Region as your function. The
             *   bucket can be in a different AWS account .
             */
            public fun s3Bucket(s3Bucket: String)

            /** @param s3Key The Amazon S3 key of the deployment package. */
            public fun s3Key(s3Key: String)

            /**
             * @param s3ObjectVersion For versioned objects, the version of the deployment package
             *   object to use.
             */
            public fun s3ObjectVersion(s3ObjectVersion: String)

            /**
             * @param zipFile (Node.js and Python) The source code of your Lambda function. If you
             *   include your function source inline with this parameter, AWS CloudFormation places
             *   it in a file named `index` and zips it to create a
             *   [deployment package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html)
             *   . This zip file cannot exceed 4MB. For the `Handler` property, the first part of
             *   the handler identifier must be `index` . For example, `index.handler` . For JSON,
             *   you must escape quotes and special characters such as newline ( `\n` ) with a
             *   backslash.
             *
             * If you specify a function that interacts with an AWS CloudFormation custom resource,
             * you don't have to write your own functions to send responses to the custom resource
             * that invoked the function. AWS CloudFormation provides a response module (
             * [cfn-response](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-lambda-function-code-cfnresponsemodule.html)
             * ) that simplifies sending responses. See
             * [Using AWS Lambda with AWS CloudFormation](https://docs.aws.amazon.com/lambda/latest/dg/services-cloudformation.html)
             * for details.
             */
            public fun zipFile(zipFile: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.Builder =
                software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.builder()

            /**
             * @param imageUri URI of a
             *   [container image](https://docs.aws.amazon.com/lambda/latest/dg/lambda-images.html)
             *   in the Amazon ECR registry.
             */
            override fun imageUri(imageUri: String) {
                cdkBuilder.imageUri(imageUri)
            }

            /**
             * @param s3Bucket An Amazon S3 bucket in the same AWS Region as your function. The
             *   bucket can be in a different AWS account .
             */
            override fun s3Bucket(s3Bucket: String) {
                cdkBuilder.s3Bucket(s3Bucket)
            }

            /** @param s3Key The Amazon S3 key of the deployment package. */
            override fun s3Key(s3Key: String) {
                cdkBuilder.s3Key(s3Key)
            }

            /**
             * @param s3ObjectVersion For versioned objects, the version of the deployment package
             *   object to use.
             */
            override fun s3ObjectVersion(s3ObjectVersion: String) {
                cdkBuilder.s3ObjectVersion(s3ObjectVersion)
            }

            /**
             * @param zipFile (Node.js and Python) The source code of your Lambda function. If you
             *   include your function source inline with this parameter, AWS CloudFormation places
             *   it in a file named `index` and zips it to create a
             *   [deployment package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html)
             *   . This zip file cannot exceed 4MB. For the `Handler` property, the first part of
             *   the handler identifier must be `index` . For example, `index.handler` . For JSON,
             *   you must escape quotes and special characters such as newline ( `\n` ) with a
             *   backslash.
             *
             * If you specify a function that interacts with an AWS CloudFormation custom resource,
             * you don't have to write your own functions to send responses to the custom resource
             * that invoked the function. AWS CloudFormation provides a response module (
             * [cfn-response](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-lambda-function-code-cfnresponsemodule.html)
             * ) that simplifies sending responses. See
             * [Using AWS Lambda with AWS CloudFormation](https://docs.aws.amazon.com/lambda/latest/dg/services-cloudformation.html)
             * for details.
             */
            override fun zipFile(zipFile: String) {
                cdkBuilder.zipFile(zipFile)
            }

            public fun build(): software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty,
        ) : CodeProperty {
            /**
             * URI of a
             * [container image](https://docs.aws.amazon.com/lambda/latest/dg/lambda-images.html) in
             * the Amazon ECR registry.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-imageuri)
             */
            override fun imageUri(): String? = unwrap(this).getImageUri()

            /**
             * An Amazon S3 bucket in the same AWS Region as your function.
             *
             * The bucket can be in a different AWS account .
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
             * (Node.js and Python) The source code of your Lambda function. If you include your
             * function source inline with this parameter, AWS CloudFormation places it in a file
             * named `index` and zips it to create a
             * [deployment package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html)
             * . This zip file cannot exceed 4MB. For the `Handler` property, the first part of the
             * handler identifier must be `index` . For example, `index.handler` .
             *
             * For JSON, you must escape quotes and special characters such as newline ( `\n` ) with
             * a backslash.
             *
             * If you specify a function that interacts with an AWS CloudFormation custom resource,
             * you don't have to write your own functions to send responses to the custom resource
             * that invoked the function. AWS CloudFormation provides a response module (
             * [cfn-response](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-lambda-function-code-cfnresponsemodule.html)
             * ) that simplifies sending responses. See
             * [Using AWS Lambda with AWS CloudFormation](https://docs.aws.amazon.com/lambda/latest/dg/services-cloudformation.html)
             * for details.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-zipfile)
             */
            override fun zipFile(): String? = unwrap(this).getZipFile()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): CodeProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty
            ): CodeProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CodeProperty
            ): software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
