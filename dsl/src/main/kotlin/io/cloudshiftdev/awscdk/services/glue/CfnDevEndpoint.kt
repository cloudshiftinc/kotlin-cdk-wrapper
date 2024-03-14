package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDevEndpoint
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.glue.CfnDevEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** A map of arguments used to configure the `DevEndpoint` . */
    public open fun arguments(): Any? = unwrap(this).getArguments()

    /** A map of arguments used to configure the `DevEndpoint` . */
    public open fun arguments(`value`: Any) {
        unwrap(this).setArguments(`value`)
    }

    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** The name of the `DevEndpoint` . */
    public open fun endpointName(): String? = unwrap(this).getEndpointName()

    /** The name of the `DevEndpoint` . */
    public open fun endpointName(`value`: String) {
        unwrap(this).setEndpointName(`value`)
    }

    /**
     * The path to one or more Java `.jar` files in an S3 bucket that should be loaded in your
     * `DevEndpoint` .
     */
    public open fun extraJarsS3Path(): String? = unwrap(this).getExtraJarsS3Path()

    /**
     * The path to one or more Java `.jar` files in an S3 bucket that should be loaded in your
     * `DevEndpoint` .
     */
    public open fun extraJarsS3Path(`value`: String) {
        unwrap(this).setExtraJarsS3Path(`value`)
    }

    /**
     * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in
     * your `DevEndpoint` .
     */
    public open fun extraPythonLibsS3Path(): String? = unwrap(this).getExtraPythonLibsS3Path()

    /**
     * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in
     * your `DevEndpoint` .
     */
    public open fun extraPythonLibsS3Path(`value`: String) {
        unwrap(this).setExtraPythonLibsS3Path(`value`)
    }

    /**
     * The AWS Glue version determines the versions of Apache Spark and Python that AWS Glue
     * supports.
     */
    public open fun glueVersion(): String? = unwrap(this).getGlueVersion()

    /**
     * The AWS Glue version determines the versions of Apache Spark and Python that AWS Glue
     * supports.
     */
    public open fun glueVersion(`value`: String) {
        unwrap(this).setGlueVersion(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The number of AWS Glue Data Processing Units (DPUs) allocated to this `DevEndpoint` . */
    public open fun numberOfNodes(): Number? = unwrap(this).getNumberOfNodes()

    /** The number of AWS Glue Data Processing Units (DPUs) allocated to this `DevEndpoint` . */
    public open fun numberOfNodes(`value`: Number) {
        unwrap(this).setNumberOfNodes(`value`)
    }

    /**
     * The number of workers of a defined `workerType` that are allocated to the development
     * endpoint.
     */
    public open fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

    /**
     * The number of workers of a defined `workerType` that are allocated to the development
     * endpoint.
     */
    public open fun numberOfWorkers(`value`: Number) {
        unwrap(this).setNumberOfWorkers(`value`)
    }

    /** The public key to be used by this `DevEndpoint` for authentication. */
    public open fun publicKey(): String? = unwrap(this).getPublicKey()

    /** The public key to be used by this `DevEndpoint` for authentication. */
    public open fun publicKey(`value`: String) {
        unwrap(this).setPublicKey(`value`)
    }

    /** A list of public keys to be used by the `DevEndpoints` for authentication. */
    public open fun publicKeys(): List<String> = unwrap(this).getPublicKeys() ?: emptyList()

    /** A list of public keys to be used by the `DevEndpoints` for authentication. */
    public open fun publicKeys(`value`: List<String>) {
        unwrap(this).setPublicKeys(`value`)
    }

    /** A list of public keys to be used by the `DevEndpoints` for authentication. */
    public open fun publicKeys(vararg `value`: String): Unit = publicKeys(`value`.toList())

    /** The Amazon Resource Name (ARN) of the IAM role used in this `DevEndpoint` . */
    public open fun roleArn(): String = unwrap(this).getRoleArn()

    /** The Amazon Resource Name (ARN) of the IAM role used in this `DevEndpoint` . */
    public open fun roleArn(`value`: String) {
        unwrap(this).setRoleArn(`value`)
    }

    /** The name of the `SecurityConfiguration` structure to be used with this `DevEndpoint` . */
    public open fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

    /** The name of the `SecurityConfiguration` structure to be used with this `DevEndpoint` . */
    public open fun securityConfiguration(`value`: String) {
        unwrap(this).setSecurityConfiguration(`value`)
    }

    /** A list of security group identifiers used in this `DevEndpoint` . */
    public open fun securityGroupIds(): List<String> =
        unwrap(this).getSecurityGroupIds() ?: emptyList()

    /** A list of security group identifiers used in this `DevEndpoint` . */
    public open fun securityGroupIds(`value`: List<String>) {
        unwrap(this).setSecurityGroupIds(`value`)
    }

    /** A list of security group identifiers used in this `DevEndpoint` . */
    public open fun securityGroupIds(vararg `value`: String): Unit =
        securityGroupIds(`value`.toList())

    /** The subnet ID for this `DevEndpoint` . */
    public open fun subnetId(): String? = unwrap(this).getSubnetId()

    /** The subnet ID for this `DevEndpoint` . */
    public open fun subnetId(`value`: String) {
        unwrap(this).setSubnetId(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** The tags to use with this DevEndpoint. */
    public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

    /** The tags to use with this DevEndpoint. */
    public open fun tagsRaw(`value`: Any) {
        unwrap(this).setTagsRaw(`value`)
    }

    /** The type of predefined worker that is allocated to the development endpoint. */
    public open fun workerType(): String? = unwrap(this).getWorkerType()

    /** The type of predefined worker that is allocated to the development endpoint. */
    public open fun workerType(`value`: String) {
        unwrap(this).setWorkerType(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnDevEndpoint]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * A map of arguments used to configure the `DevEndpoint` .
         *
         * Valid arguments are:
         * * `"--enable-glue-datacatalog": ""`
         * * `"GLUE_PYTHON_VERSION": "3"`
         * * `"GLUE_PYTHON_VERSION": "2"`
         *
         * You can specify a version of Python support for development endpoints by using the
         * `Arguments` parameter in the `CreateDevEndpoint` or `UpdateDevEndpoint` APIs. If no
         * arguments are provided, the version defaults to Python 2.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-arguments)
         *
         * @param arguments A map of arguments used to configure the `DevEndpoint` .
         */
        public fun arguments(arguments: Any)

        /**
         * The name of the `DevEndpoint` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname)
         *
         * @param endpointName The name of the `DevEndpoint` .
         */
        public fun endpointName(endpointName: String)

        /**
         * The path to one or more Java `.jar` files in an S3 bucket that should be loaded in your
         * `DevEndpoint` .
         *
         * You can only use pure Java/Scala libraries with a `DevEndpoint` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrajarss3path)
         *
         * @param extraJarsS3Path The path to one or more Java `.jar` files in an S3 bucket that
         *   should be loaded in your `DevEndpoint` .
         */
        public fun extraJarsS3Path(extraJarsS3Path: String)

        /**
         * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in
         * your `DevEndpoint` .
         *
         * Multiple values must be complete paths separated by a comma.
         *
         * You can only use pure Python libraries with a `DevEndpoint` . Libraries that rely on C
         * extensions, such as the [pandas](https://docs.aws.amazon.com/http://pandas.pydata.org/)
         * Python data analysis library, are not currently supported.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path)
         *
         * @param extraPythonLibsS3Path The paths to one or more Python libraries in an Amazon S3
         *   bucket that should be loaded in your `DevEndpoint` .
         */
        public fun extraPythonLibsS3Path(extraPythonLibsS3Path: String)

        /**
         * The AWS Glue version determines the versions of Apache Spark and Python that AWS Glue
         * supports.
         *
         * The Python version indicates the version supported for running your ETL scripts on
         * development endpoints.
         *
         * For more information about the available AWS Glue versions and corresponding Spark and
         * Python versions, see
         * [Glue version](https://docs.aws.amazon.com/glue/latest/dg/add-job.html) in the developer
         * guide.
         *
         * Development endpoints that are created without specifying a Glue version default to Glue
         * 0.9.
         *
         * You can specify a version of Python support for development endpoints by using the
         * `Arguments` parameter in the `CreateDevEndpoint` or `UpdateDevEndpoint` APIs. If no
         * arguments are provided, the version defaults to Python 2.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-glueversion)
         *
         * @param glueVersion The AWS Glue version determines the versions of Apache Spark and
         *   Python that AWS Glue supports.
         */
        public fun glueVersion(glueVersion: String)

        /**
         * The number of AWS Glue Data Processing Units (DPUs) allocated to this `DevEndpoint` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofnodes)
         *
         * @param numberOfNodes The number of AWS Glue Data Processing Units (DPUs) allocated to
         *   this `DevEndpoint` .
         */
        public fun numberOfNodes(numberOfNodes: Number)

        /**
         * The number of workers of a defined `workerType` that are allocated to the development
         * endpoint.
         *
         * The maximum number of workers you can define are 299 for `G.1X` , and 149 for `G.2X` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofworkers)
         *
         * @param numberOfWorkers The number of workers of a defined `workerType` that are allocated
         *   to the development endpoint.
         */
        public fun numberOfWorkers(numberOfWorkers: Number)

        /**
         * The public key to be used by this `DevEndpoint` for authentication.
         *
         * This attribute is provided for backward compatibility because the recommended attribute
         * to use is public keys.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey)
         *
         * @param publicKey The public key to be used by this `DevEndpoint` for authentication.
         */
        public fun publicKey(publicKey: String)

        /**
         * A list of public keys to be used by the `DevEndpoints` for authentication.
         *
         * Using this attribute is preferred over a single public key because the public keys allow
         * you to have a different private key per client.
         *
         * If you previously created an endpoint with a public key, you must remove that key to be
         * able to set a list of public keys. Call the `UpdateDevEndpoint` API operation with the
         * public key content in the `deletePublicKeys` attribute, and the list of new keys in the
         * `addPublicKeys` attribute.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickeys)
         *
         * @param publicKeys A list of public keys to be used by the `DevEndpoints` for
         *   authentication.
         */
        public fun publicKeys(publicKeys: List<String>)

        /**
         * A list of public keys to be used by the `DevEndpoints` for authentication.
         *
         * Using this attribute is preferred over a single public key because the public keys allow
         * you to have a different private key per client.
         *
         * If you previously created an endpoint with a public key, you must remove that key to be
         * able to set a list of public keys. Call the `UpdateDevEndpoint` API operation with the
         * public key content in the `deletePublicKeys` attribute, and the list of new keys in the
         * `addPublicKeys` attribute.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickeys)
         *
         * @param publicKeys A list of public keys to be used by the `DevEndpoints` for
         *   authentication.
         */
        public fun publicKeys(vararg publicKeys: String)

        /**
         * The Amazon Resource Name (ARN) of the IAM role used in this `DevEndpoint` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn)
         *
         * @param roleArn The Amazon Resource Name (ARN) of the IAM role used in this `DevEndpoint`
         *   .
         */
        public fun roleArn(roleArn: String)

        /**
         * The name of the `SecurityConfiguration` structure to be used with this `DevEndpoint` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securityconfiguration)
         *
         * @param securityConfiguration The name of the `SecurityConfiguration` structure to be used
         *   with this `DevEndpoint` .
         */
        public fun securityConfiguration(securityConfiguration: String)

        /**
         * A list of security group identifiers used in this `DevEndpoint` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids)
         *
         * @param securityGroupIds A list of security group identifiers used in this `DevEndpoint` .
         */
        public fun securityGroupIds(securityGroupIds: List<String>)

        /**
         * A list of security group identifiers used in this `DevEndpoint` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids)
         *
         * @param securityGroupIds A list of security group identifiers used in this `DevEndpoint` .
         */
        public fun securityGroupIds(vararg securityGroupIds: String)

        /**
         * The subnet ID for this `DevEndpoint` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid)
         *
         * @param subnetId The subnet ID for this `DevEndpoint` .
         */
        public fun subnetId(subnetId: String)

        /**
         * The tags to use with this DevEndpoint.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-tags)
         *
         * @param tags The tags to use with this DevEndpoint.
         */
        public fun tags(tags: Any)

        /**
         * The type of predefined worker that is allocated to the development endpoint.
         *
         * Accepts a value of Standard, G.1X, or G.2X.
         * * For the `Standard` worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB
         *   disk, and 2 executors per worker.
         * * For the `G.1X` worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB
         *   disk), and provides 1 executor per worker. We recommend this worker type for
         *   memory-intensive jobs.
         * * For the `G.2X` worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB
         *   disk), and provides 1 executor per worker. We recommend this worker type for
         *   memory-intensive jobs.
         *
         * Known issue: when a development endpoint is created with the `G.2X` `WorkerType`
         * configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB
         * of memory, and a 64 GB disk.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-workertype)
         *
         * @param workerType The type of predefined worker that is allocated to the development
         *   endpoint.
         */
        public fun workerType(workerType: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.glue.CfnDevEndpoint.Builder =
            software.amazon.awscdk.services.glue.CfnDevEndpoint.Builder.create(scope, id)

        /**
         * A map of arguments used to configure the `DevEndpoint` .
         *
         * Valid arguments are:
         * * `"--enable-glue-datacatalog": ""`
         * * `"GLUE_PYTHON_VERSION": "3"`
         * * `"GLUE_PYTHON_VERSION": "2"`
         *
         * You can specify a version of Python support for development endpoints by using the
         * `Arguments` parameter in the `CreateDevEndpoint` or `UpdateDevEndpoint` APIs. If no
         * arguments are provided, the version defaults to Python 2.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-arguments)
         *
         * @param arguments A map of arguments used to configure the `DevEndpoint` .
         */
        override fun arguments(arguments: Any) {
            cdkBuilder.arguments(arguments)
        }

        /**
         * The name of the `DevEndpoint` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname)
         *
         * @param endpointName The name of the `DevEndpoint` .
         */
        override fun endpointName(endpointName: String) {
            cdkBuilder.endpointName(endpointName)
        }

        /**
         * The path to one or more Java `.jar` files in an S3 bucket that should be loaded in your
         * `DevEndpoint` .
         *
         * You can only use pure Java/Scala libraries with a `DevEndpoint` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrajarss3path)
         *
         * @param extraJarsS3Path The path to one or more Java `.jar` files in an S3 bucket that
         *   should be loaded in your `DevEndpoint` .
         */
        override fun extraJarsS3Path(extraJarsS3Path: String) {
            cdkBuilder.extraJarsS3Path(extraJarsS3Path)
        }

        /**
         * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in
         * your `DevEndpoint` .
         *
         * Multiple values must be complete paths separated by a comma.
         *
         * You can only use pure Python libraries with a `DevEndpoint` . Libraries that rely on C
         * extensions, such as the [pandas](https://docs.aws.amazon.com/http://pandas.pydata.org/)
         * Python data analysis library, are not currently supported.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path)
         *
         * @param extraPythonLibsS3Path The paths to one or more Python libraries in an Amazon S3
         *   bucket that should be loaded in your `DevEndpoint` .
         */
        override fun extraPythonLibsS3Path(extraPythonLibsS3Path: String) {
            cdkBuilder.extraPythonLibsS3Path(extraPythonLibsS3Path)
        }

        /**
         * The AWS Glue version determines the versions of Apache Spark and Python that AWS Glue
         * supports.
         *
         * The Python version indicates the version supported for running your ETL scripts on
         * development endpoints.
         *
         * For more information about the available AWS Glue versions and corresponding Spark and
         * Python versions, see
         * [Glue version](https://docs.aws.amazon.com/glue/latest/dg/add-job.html) in the developer
         * guide.
         *
         * Development endpoints that are created without specifying a Glue version default to Glue
         * 0.9.
         *
         * You can specify a version of Python support for development endpoints by using the
         * `Arguments` parameter in the `CreateDevEndpoint` or `UpdateDevEndpoint` APIs. If no
         * arguments are provided, the version defaults to Python 2.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-glueversion)
         *
         * @param glueVersion The AWS Glue version determines the versions of Apache Spark and
         *   Python that AWS Glue supports.
         */
        override fun glueVersion(glueVersion: String) {
            cdkBuilder.glueVersion(glueVersion)
        }

        /**
         * The number of AWS Glue Data Processing Units (DPUs) allocated to this `DevEndpoint` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofnodes)
         *
         * @param numberOfNodes The number of AWS Glue Data Processing Units (DPUs) allocated to
         *   this `DevEndpoint` .
         */
        override fun numberOfNodes(numberOfNodes: Number) {
            cdkBuilder.numberOfNodes(numberOfNodes)
        }

        /**
         * The number of workers of a defined `workerType` that are allocated to the development
         * endpoint.
         *
         * The maximum number of workers you can define are 299 for `G.1X` , and 149 for `G.2X` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofworkers)
         *
         * @param numberOfWorkers The number of workers of a defined `workerType` that are allocated
         *   to the development endpoint.
         */
        override fun numberOfWorkers(numberOfWorkers: Number) {
            cdkBuilder.numberOfWorkers(numberOfWorkers)
        }

        /**
         * The public key to be used by this `DevEndpoint` for authentication.
         *
         * This attribute is provided for backward compatibility because the recommended attribute
         * to use is public keys.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey)
         *
         * @param publicKey The public key to be used by this `DevEndpoint` for authentication.
         */
        override fun publicKey(publicKey: String) {
            cdkBuilder.publicKey(publicKey)
        }

        /**
         * A list of public keys to be used by the `DevEndpoints` for authentication.
         *
         * Using this attribute is preferred over a single public key because the public keys allow
         * you to have a different private key per client.
         *
         * If you previously created an endpoint with a public key, you must remove that key to be
         * able to set a list of public keys. Call the `UpdateDevEndpoint` API operation with the
         * public key content in the `deletePublicKeys` attribute, and the list of new keys in the
         * `addPublicKeys` attribute.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickeys)
         *
         * @param publicKeys A list of public keys to be used by the `DevEndpoints` for
         *   authentication.
         */
        override fun publicKeys(publicKeys: List<String>) {
            cdkBuilder.publicKeys(publicKeys)
        }

        /**
         * A list of public keys to be used by the `DevEndpoints` for authentication.
         *
         * Using this attribute is preferred over a single public key because the public keys allow
         * you to have a different private key per client.
         *
         * If you previously created an endpoint with a public key, you must remove that key to be
         * able to set a list of public keys. Call the `UpdateDevEndpoint` API operation with the
         * public key content in the `deletePublicKeys` attribute, and the list of new keys in the
         * `addPublicKeys` attribute.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickeys)
         *
         * @param publicKeys A list of public keys to be used by the `DevEndpoints` for
         *   authentication.
         */
        override fun publicKeys(vararg publicKeys: String): Unit = publicKeys(publicKeys.toList())

        /**
         * The Amazon Resource Name (ARN) of the IAM role used in this `DevEndpoint` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn)
         *
         * @param roleArn The Amazon Resource Name (ARN) of the IAM role used in this `DevEndpoint`
         *   .
         */
        override fun roleArn(roleArn: String) {
            cdkBuilder.roleArn(roleArn)
        }

        /**
         * The name of the `SecurityConfiguration` structure to be used with this `DevEndpoint` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securityconfiguration)
         *
         * @param securityConfiguration The name of the `SecurityConfiguration` structure to be used
         *   with this `DevEndpoint` .
         */
        override fun securityConfiguration(securityConfiguration: String) {
            cdkBuilder.securityConfiguration(securityConfiguration)
        }

        /**
         * A list of security group identifiers used in this `DevEndpoint` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids)
         *
         * @param securityGroupIds A list of security group identifiers used in this `DevEndpoint` .
         */
        override fun securityGroupIds(securityGroupIds: List<String>) {
            cdkBuilder.securityGroupIds(securityGroupIds)
        }

        /**
         * A list of security group identifiers used in this `DevEndpoint` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids)
         *
         * @param securityGroupIds A list of security group identifiers used in this `DevEndpoint` .
         */
        override fun securityGroupIds(vararg securityGroupIds: String): Unit =
            securityGroupIds(securityGroupIds.toList())

        /**
         * The subnet ID for this `DevEndpoint` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid)
         *
         * @param subnetId The subnet ID for this `DevEndpoint` .
         */
        override fun subnetId(subnetId: String) {
            cdkBuilder.subnetId(subnetId)
        }

        /**
         * The tags to use with this DevEndpoint.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-tags)
         *
         * @param tags The tags to use with this DevEndpoint.
         */
        override fun tags(tags: Any) {
            cdkBuilder.tags(tags)
        }

        /**
         * The type of predefined worker that is allocated to the development endpoint.
         *
         * Accepts a value of Standard, G.1X, or G.2X.
         * * For the `Standard` worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB
         *   disk, and 2 executors per worker.
         * * For the `G.1X` worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB
         *   disk), and provides 1 executor per worker. We recommend this worker type for
         *   memory-intensive jobs.
         * * For the `G.2X` worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB
         *   disk), and provides 1 executor per worker. We recommend this worker type for
         *   memory-intensive jobs.
         *
         * Known issue: when a development endpoint is created with the `G.2X` `WorkerType`
         * configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB
         * of memory, and a 64 GB disk.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-workertype)
         *
         * @param workerType The type of predefined worker that is allocated to the development
         *   endpoint.
         */
        override fun workerType(workerType: String) {
            cdkBuilder.workerType(workerType)
        }

        public fun build(): software.amazon.awscdk.services.glue.CfnDevEndpoint = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnDevEndpoint {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnDevEndpoint(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.glue.CfnDevEndpoint
        ): CfnDevEndpoint = CfnDevEndpoint(cdkObject)

        internal fun unwrap(
            wrapped: CfnDevEndpoint
        ): software.amazon.awscdk.services.glue.CfnDevEndpoint = wrapped.cdkObject
    }
}
