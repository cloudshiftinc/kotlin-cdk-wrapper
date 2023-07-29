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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.glue.CfnDevEndpoint
import software.constructs.Construct

/**
 * The `AWS::Glue::DevEndpoint` resource specifies a development endpoint where a developer can
 * remotely debug ETL scripts for AWS Glue .
 *
 * For more information, see
 * [DevEndpoint Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-jobs-dev-endpoint.html#aws-glue-api-jobs-dev-endpoint-DevEndpoint)
 * in the AWS Glue Developer Guide.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object arguments_;
 * Object tags;
 * CfnDevEndpoint cfnDevEndpoint = CfnDevEndpoint.Builder.create(this, "MyCfnDevEndpoint")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .arguments(arguments_)
 * .endpointName("endpointName")
 * .extraJarsS3Path("extraJarsS3Path")
 * .extraPythonLibsS3Path("extraPythonLibsS3Path")
 * .glueVersion("glueVersion")
 * .numberOfNodes(123)
 * .numberOfWorkers(123)
 * .publicKey("publicKey")
 * .publicKeys(List.of("publicKeys"))
 * .securityConfiguration("securityConfiguration")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetId("subnetId")
 * .tags(tags)
 * .workerType("workerType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html)
 */
@CdkDslMarker
public class CfnDevEndpointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDevEndpoint.Builder = CfnDevEndpoint.Builder.create(scope, id)

    private val _publicKeys: MutableList<String> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    /**
     * A map of arguments used to configure the `DevEndpoint` .
     *
     * Valid arguments are:
     * * `"--enable-glue-datacatalog": ""`
     * * `"GLUE_PYTHON_VERSION": "3"`
     * * `"GLUE_PYTHON_VERSION": "2"`
     *
     * You can specify a version of Python support for development endpoints by using the
     * `Arguments` parameter in the `CreateDevEndpoint` or `UpdateDevEndpoint` APIs. If no arguments
     * are provided, the version defaults to Python 2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-arguments)
     *
     * @param arguments A map of arguments used to configure the `DevEndpoint` .
     */
    public fun arguments(arguments: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(arguments)
        cdkBuilder.arguments(builder.map)
    }

    /**
     * A map of arguments used to configure the `DevEndpoint` .
     *
     * Valid arguments are:
     * * `"--enable-glue-datacatalog": ""`
     * * `"GLUE_PYTHON_VERSION": "3"`
     * * `"GLUE_PYTHON_VERSION": "2"`
     *
     * You can specify a version of Python support for development endpoints by using the
     * `Arguments` parameter in the `CreateDevEndpoint` or `UpdateDevEndpoint` APIs. If no arguments
     * are provided, the version defaults to Python 2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-arguments)
     *
     * @param arguments A map of arguments used to configure the `DevEndpoint` .
     */
    public fun arguments(arguments: Any) {
        cdkBuilder.arguments(arguments)
    }

    /**
     * The name of the `DevEndpoint` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname)
     *
     * @param endpointName The name of the `DevEndpoint` .
     */
    public fun endpointName(endpointName: String) {
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
     * @param extraJarsS3Path The path to one or more Java `.jar` files in an S3 bucket that should
     *   be loaded in your `DevEndpoint` .
     */
    public fun extraJarsS3Path(extraJarsS3Path: String) {
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
     * @param extraPythonLibsS3Path The paths to one or more Python libraries in an Amazon S3 bucket
     *   that should be loaded in your `DevEndpoint` .
     */
    public fun extraPythonLibsS3Path(extraPythonLibsS3Path: String) {
        cdkBuilder.extraPythonLibsS3Path(extraPythonLibsS3Path)
    }

    /**
     * The AWS Glue version determines the versions of Apache Spark and Python that AWS Glue
     * supports.
     *
     * The Python version indicates the version supported for running your ETL scripts on
     * development endpoints.
     *
     * For more information about the available AWS Glue versions and corresponding Spark and Python
     * versions, see [Glue version](https://docs.aws.amazon.com/glue/latest/dg/add-job.html) in the
     * developer guide.
     *
     * Development endpoints that are created without specifying a Glue version default to Glue 0.9.
     *
     * You can specify a version of Python support for development endpoints by using the
     * `Arguments` parameter in the `CreateDevEndpoint` or `UpdateDevEndpoint` APIs. If no arguments
     * are provided, the version defaults to Python 2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-glueversion)
     *
     * @param glueVersion The AWS Glue version determines the versions of Apache Spark and Python
     *   that AWS Glue supports.
     */
    public fun glueVersion(glueVersion: String) {
        cdkBuilder.glueVersion(glueVersion)
    }

    /**
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this `DevEndpoint` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofnodes)
     *
     * @param numberOfNodes The number of AWS Glue Data Processing Units (DPUs) allocated to this
     *   `DevEndpoint` .
     */
    public fun numberOfNodes(numberOfNodes: Number) {
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
     * @param numberOfWorkers The number of workers of a defined `workerType` that are allocated to
     *   the development endpoint.
     */
    public fun numberOfWorkers(numberOfWorkers: Number) {
        cdkBuilder.numberOfWorkers(numberOfWorkers)
    }

    /**
     * The public key to be used by this `DevEndpoint` for authentication.
     *
     * This attribute is provided for backward compatibility because the recommended attribute to
     * use is public keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey)
     *
     * @param publicKey The public key to be used by this `DevEndpoint` for authentication.
     */
    public fun publicKey(publicKey: String) {
        cdkBuilder.publicKey(publicKey)
    }

    /**
     * A list of public keys to be used by the `DevEndpoints` for authentication.
     *
     * Using this attribute is preferred over a single public key because the public keys allow you
     * to have a different private key per client.
     *
     * If you previously created an endpoint with a public key, you must remove that key to be able
     * to set a list of public keys. Call the `UpdateDevEndpoint` API operation with the public key
     * content in the `deletePublicKeys` attribute, and the list of new keys in the `addPublicKeys`
     * attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickeys)
     *
     * @param publicKeys A list of public keys to be used by the `DevEndpoints` for authentication.
     */
    public fun publicKeys(vararg publicKeys: String) {
        _publicKeys.addAll(listOf(*publicKeys))
    }

    /**
     * A list of public keys to be used by the `DevEndpoints` for authentication.
     *
     * Using this attribute is preferred over a single public key because the public keys allow you
     * to have a different private key per client.
     *
     * If you previously created an endpoint with a public key, you must remove that key to be able
     * to set a list of public keys. Call the `UpdateDevEndpoint` API operation with the public key
     * content in the `deletePublicKeys` attribute, and the list of new keys in the `addPublicKeys`
     * attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickeys)
     *
     * @param publicKeys A list of public keys to be used by the `DevEndpoints` for authentication.
     */
    public fun publicKeys(publicKeys: Collection<String>) {
        _publicKeys.addAll(publicKeys)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role used in this `DevEndpoint` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn)
     *
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role used in this `DevEndpoint` .
     */
    public fun roleArn(roleArn: String) {
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
    public fun securityConfiguration(securityConfiguration: String) {
        cdkBuilder.securityConfiguration(securityConfiguration)
    }

    /**
     * A list of security group identifiers used in this `DevEndpoint` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids)
     *
     * @param securityGroupIds A list of security group identifiers used in this `DevEndpoint` .
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * A list of security group identifiers used in this `DevEndpoint` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids)
     *
     * @param securityGroupIds A list of security group identifiers used in this `DevEndpoint` .
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * The subnet ID for this `DevEndpoint` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid)
     *
     * @param subnetId The subnet ID for this `DevEndpoint` .
     */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    /**
     * The tags to use with this DevEndpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-tags)
     *
     * @param tags The tags to use with this DevEndpoint.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * The tags to use with this DevEndpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-tags)
     *
     * @param tags The tags to use with this DevEndpoint.
     */
    public fun tags(tags: Any) {
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
     * configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of
     * memory, and a 64 GB disk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-workertype)
     *
     * @param workerType The type of predefined worker that is allocated to the development
     *   endpoint.
     */
    public fun workerType(workerType: String) {
        cdkBuilder.workerType(workerType)
    }

    public fun build(): CfnDevEndpoint {
        if (_publicKeys.isNotEmpty()) cdkBuilder.publicKeys(_publicKeys)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        return cdkBuilder.build()
    }
}
