@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDevEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * Object arguments_;
 * Object tags;
 * CfnDevEndpointProps cfnDevEndpointProps = CfnDevEndpointProps.builder()
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
public interface CfnDevEndpointProps {
  /**
   * A map of arguments used to configure the `DevEndpoint` .
   *
   * Valid arguments are:
   *
   * * `"--enable-glue-datacatalog": ""`
   * * `"GLUE_PYTHON_VERSION": "3"`
   * * `"GLUE_PYTHON_VERSION": "2"`
   *
   * You can specify a version of Python support for development endpoints by using the `Arguments`
   * parameter in the `CreateDevEndpoint` or `UpdateDevEndpoint` APIs. If no arguments are provided,
   * the version defaults to Python 2.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-arguments)
   */
  public fun arguments(): Any? = unwrap(this).getArguments()

  /**
   * The name of the `DevEndpoint` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname)
   */
  public fun endpointName(): String? = unwrap(this).getEndpointName()

  /**
   * The path to one or more Java `.jar` files in an S3 bucket that should be loaded in your
   * `DevEndpoint` .
   *
   *
   * You can only use pure Java/Scala libraries with a `DevEndpoint` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrajarss3path)
   */
  public fun extraJarsS3Path(): String? = unwrap(this).getExtraJarsS3Path()

  /**
   * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your
   * `DevEndpoint` .
   *
   * Multiple values must be complete paths separated by a comma.
   *
   *
   * You can only use pure Python libraries with a `DevEndpoint` . Libraries that rely on C
   * extensions, such as the [pandas](https://docs.aws.amazon.com/http://pandas.pydata.org/) Python
   * data analysis library, are not currently supported.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path)
   */
  public fun extraPythonLibsS3Path(): String? = unwrap(this).getExtraPythonLibsS3Path()

  /**
   * The AWS Glue version determines the versions of Apache Spark and Python that AWS Glue supports.
   *
   * The Python version indicates the version supported for running your ETL scripts on development
   * endpoints.
   *
   * For more information about the available AWS Glue versions and corresponding Spark and Python
   * versions, see [Glue version](https://docs.aws.amazon.com/glue/latest/dg/add-job.html) in the
   * developer guide.
   *
   * Development endpoints that are created without specifying a Glue version default to Glue 0.9.
   *
   * You can specify a version of Python support for development endpoints by using the `Arguments`
   * parameter in the `CreateDevEndpoint` or `UpdateDevEndpoint` APIs. If no arguments are provided,
   * the version defaults to Python 2.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-glueversion)
   */
  public fun glueVersion(): String? = unwrap(this).getGlueVersion()

  /**
   * The number of AWS Glue Data Processing Units (DPUs) allocated to this `DevEndpoint` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofnodes)
   */
  public fun numberOfNodes(): Number? = unwrap(this).getNumberOfNodes()

  /**
   * The number of workers of a defined `workerType` that are allocated to the development endpoint.
   *
   * The maximum number of workers you can define are 299 for `G.1X` , and 149 for `G.2X` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofworkers)
   */
  public fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

  /**
   * The public key to be used by this `DevEndpoint` for authentication.
   *
   * This attribute is provided for backward compatibility because the recommended attribute to use
   * is public keys.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey)
   */
  public fun publicKey(): String? = unwrap(this).getPublicKey()

  /**
   * A list of public keys to be used by the `DevEndpoints` for authentication.
   *
   * Using this attribute is preferred over a single public key because the public keys allow you to
   * have a different private key per client.
   *
   *
   * If you previously created an endpoint with a public key, you must remove that key to be able to
   * set a list of public keys. Call the `UpdateDevEndpoint` API operation with the public key content
   * in the `deletePublicKeys` attribute, and the list of new keys in the `addPublicKeys` attribute.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickeys)
   */
  public fun publicKeys(): List<String> = unwrap(this).getPublicKeys() ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) of the IAM role used in this `DevEndpoint` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn)
   */
  public fun roleArn(): String

  /**
   * The name of the `SecurityConfiguration` structure to be used with this `DevEndpoint` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securityconfiguration)
   */
  public fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

  /**
   * A list of security group identifiers used in this `DevEndpoint` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * The subnet ID for this `DevEndpoint` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid)
   */
  public fun subnetId(): String? = unwrap(this).getSubnetId()

  /**
   * The tags to use with this DevEndpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * The type of predefined worker that is allocated to the development endpoint.
   *
   * Accepts a value of Standard, G.1X, or G.2X.
   *
   * * For the `Standard` worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
   * and 2 executors per worker.
   * * For the `G.1X` worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk),
   * and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
   * * For the `G.2X` worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk),
   * and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
   *
   * Known issue: when a development endpoint is created with the `G.2X` `WorkerType` configuration,
   * the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a 64 GB
   * disk.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-workertype)
   */
  public fun workerType(): String? = unwrap(this).getWorkerType()

  /**
   * A builder for [CfnDevEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param arguments A map of arguments used to configure the `DevEndpoint` .
     * Valid arguments are:
     *
     * * `"--enable-glue-datacatalog": ""`
     * * `"GLUE_PYTHON_VERSION": "3"`
     * * `"GLUE_PYTHON_VERSION": "2"`
     *
     * You can specify a version of Python support for development endpoints by using the
     * `Arguments` parameter in the `CreateDevEndpoint` or `UpdateDevEndpoint` APIs. If no arguments
     * are provided, the version defaults to Python 2.
     */
    public fun arguments(arguments: Any)

    /**
     * @param endpointName The name of the `DevEndpoint` .
     */
    public fun endpointName(endpointName: String)

    /**
     * @param extraJarsS3Path The path to one or more Java `.jar` files in an S3 bucket that should
     * be loaded in your `DevEndpoint` .
     *
     * You can only use pure Java/Scala libraries with a `DevEndpoint` .
     */
    public fun extraJarsS3Path(extraJarsS3Path: String)

    /**
     * @param extraPythonLibsS3Path The paths to one or more Python libraries in an Amazon S3 bucket
     * that should be loaded in your `DevEndpoint` .
     * Multiple values must be complete paths separated by a comma.
     *
     *
     * You can only use pure Python libraries with a `DevEndpoint` . Libraries that rely on C
     * extensions, such as the [pandas](https://docs.aws.amazon.com/http://pandas.pydata.org/) Python
     * data analysis library, are not currently supported.
     */
    public fun extraPythonLibsS3Path(extraPythonLibsS3Path: String)

    /**
     * @param glueVersion The AWS Glue version determines the versions of Apache Spark and Python
     * that AWS Glue supports.
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
     */
    public fun glueVersion(glueVersion: String)

    /**
     * @param numberOfNodes The number of AWS Glue Data Processing Units (DPUs) allocated to this
     * `DevEndpoint` .
     */
    public fun numberOfNodes(numberOfNodes: Number)

    /**
     * @param numberOfWorkers The number of workers of a defined `workerType` that are allocated to
     * the development endpoint.
     * The maximum number of workers you can define are 299 for `G.1X` , and 149 for `G.2X` .
     */
    public fun numberOfWorkers(numberOfWorkers: Number)

    /**
     * @param publicKey The public key to be used by this `DevEndpoint` for authentication.
     * This attribute is provided for backward compatibility because the recommended attribute to
     * use is public keys.
     */
    public fun publicKey(publicKey: String)

    /**
     * @param publicKeys A list of public keys to be used by the `DevEndpoints` for authentication.
     * Using this attribute is preferred over a single public key because the public keys allow you
     * to have a different private key per client.
     *
     *
     * If you previously created an endpoint with a public key, you must remove that key to be able
     * to set a list of public keys. Call the `UpdateDevEndpoint` API operation with the public key
     * content in the `deletePublicKeys` attribute, and the list of new keys in the `addPublicKeys`
     * attribute.
     */
    public fun publicKeys(publicKeys: List<String>)

    /**
     * @param publicKeys A list of public keys to be used by the `DevEndpoints` for authentication.
     * Using this attribute is preferred over a single public key because the public keys allow you
     * to have a different private key per client.
     *
     *
     * If you previously created an endpoint with a public key, you must remove that key to be able
     * to set a list of public keys. Call the `UpdateDevEndpoint` API operation with the public key
     * content in the `deletePublicKeys` attribute, and the list of new keys in the `addPublicKeys`
     * attribute.
     */
    public fun publicKeys(vararg publicKeys: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role used in this `DevEndpoint` . 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param securityConfiguration The name of the `SecurityConfiguration` structure to be used
     * with this `DevEndpoint` .
     */
    public fun securityConfiguration(securityConfiguration: String)

    /**
     * @param securityGroupIds A list of security group identifiers used in this `DevEndpoint` .
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds A list of security group identifiers used in this `DevEndpoint` .
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param subnetId The subnet ID for this `DevEndpoint` .
     */
    public fun subnetId(subnetId: String)

    /**
     * @param tags The tags to use with this DevEndpoint.
     */
    public fun tags(tags: Any)

    /**
     * @param workerType The type of predefined worker that is allocated to the development
     * endpoint.
     * Accepts a value of Standard, G.1X, or G.2X.
     *
     * * For the `Standard` worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB
     * disk, and 2 executors per worker.
     * * For the `G.1X` worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB
     * disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive
     * jobs.
     * * For the `G.2X` worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB
     * disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive
     * jobs.
     *
     * Known issue: when a development endpoint is created with the `G.2X` `WorkerType`
     * configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of
     * memory, and a 64 GB disk.
     */
    public fun workerType(workerType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnDevEndpointProps.Builder =
        software.amazon.awscdk.services.glue.CfnDevEndpointProps.builder()

    /**
     * @param arguments A map of arguments used to configure the `DevEndpoint` .
     * Valid arguments are:
     *
     * * `"--enable-glue-datacatalog": ""`
     * * `"GLUE_PYTHON_VERSION": "3"`
     * * `"GLUE_PYTHON_VERSION": "2"`
     *
     * You can specify a version of Python support for development endpoints by using the
     * `Arguments` parameter in the `CreateDevEndpoint` or `UpdateDevEndpoint` APIs. If no arguments
     * are provided, the version defaults to Python 2.
     */
    override fun arguments(arguments: Any) {
      cdkBuilder.arguments(arguments)
    }

    /**
     * @param endpointName The name of the `DevEndpoint` .
     */
    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    /**
     * @param extraJarsS3Path The path to one or more Java `.jar` files in an S3 bucket that should
     * be loaded in your `DevEndpoint` .
     *
     * You can only use pure Java/Scala libraries with a `DevEndpoint` .
     */
    override fun extraJarsS3Path(extraJarsS3Path: String) {
      cdkBuilder.extraJarsS3Path(extraJarsS3Path)
    }

    /**
     * @param extraPythonLibsS3Path The paths to one or more Python libraries in an Amazon S3 bucket
     * that should be loaded in your `DevEndpoint` .
     * Multiple values must be complete paths separated by a comma.
     *
     *
     * You can only use pure Python libraries with a `DevEndpoint` . Libraries that rely on C
     * extensions, such as the [pandas](https://docs.aws.amazon.com/http://pandas.pydata.org/) Python
     * data analysis library, are not currently supported.
     */
    override fun extraPythonLibsS3Path(extraPythonLibsS3Path: String) {
      cdkBuilder.extraPythonLibsS3Path(extraPythonLibsS3Path)
    }

    /**
     * @param glueVersion The AWS Glue version determines the versions of Apache Spark and Python
     * that AWS Glue supports.
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
     */
    override fun glueVersion(glueVersion: String) {
      cdkBuilder.glueVersion(glueVersion)
    }

    /**
     * @param numberOfNodes The number of AWS Glue Data Processing Units (DPUs) allocated to this
     * `DevEndpoint` .
     */
    override fun numberOfNodes(numberOfNodes: Number) {
      cdkBuilder.numberOfNodes(numberOfNodes)
    }

    /**
     * @param numberOfWorkers The number of workers of a defined `workerType` that are allocated to
     * the development endpoint.
     * The maximum number of workers you can define are 299 for `G.1X` , and 149 for `G.2X` .
     */
    override fun numberOfWorkers(numberOfWorkers: Number) {
      cdkBuilder.numberOfWorkers(numberOfWorkers)
    }

    /**
     * @param publicKey The public key to be used by this `DevEndpoint` for authentication.
     * This attribute is provided for backward compatibility because the recommended attribute to
     * use is public keys.
     */
    override fun publicKey(publicKey: String) {
      cdkBuilder.publicKey(publicKey)
    }

    /**
     * @param publicKeys A list of public keys to be used by the `DevEndpoints` for authentication.
     * Using this attribute is preferred over a single public key because the public keys allow you
     * to have a different private key per client.
     *
     *
     * If you previously created an endpoint with a public key, you must remove that key to be able
     * to set a list of public keys. Call the `UpdateDevEndpoint` API operation with the public key
     * content in the `deletePublicKeys` attribute, and the list of new keys in the `addPublicKeys`
     * attribute.
     */
    override fun publicKeys(publicKeys: List<String>) {
      cdkBuilder.publicKeys(publicKeys)
    }

    /**
     * @param publicKeys A list of public keys to be used by the `DevEndpoints` for authentication.
     * Using this attribute is preferred over a single public key because the public keys allow you
     * to have a different private key per client.
     *
     *
     * If you previously created an endpoint with a public key, you must remove that key to be able
     * to set a list of public keys. Call the `UpdateDevEndpoint` API operation with the public key
     * content in the `deletePublicKeys` attribute, and the list of new keys in the `addPublicKeys`
     * attribute.
     */
    override fun publicKeys(vararg publicKeys: String): Unit = publicKeys(publicKeys.toList())

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role used in this `DevEndpoint` . 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param securityConfiguration The name of the `SecurityConfiguration` structure to be used
     * with this `DevEndpoint` .
     */
    override fun securityConfiguration(securityConfiguration: String) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    /**
     * @param securityGroupIds A list of security group identifiers used in this `DevEndpoint` .
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds A list of security group identifiers used in this `DevEndpoint` .
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param subnetId The subnet ID for this `DevEndpoint` .
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * @param tags The tags to use with this DevEndpoint.
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param workerType The type of predefined worker that is allocated to the development
     * endpoint.
     * Accepts a value of Standard, G.1X, or G.2X.
     *
     * * For the `Standard` worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB
     * disk, and 2 executors per worker.
     * * For the `G.1X` worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB
     * disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive
     * jobs.
     * * For the `G.2X` worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB
     * disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive
     * jobs.
     *
     * Known issue: when a development endpoint is created with the `G.2X` `WorkerType`
     * configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of
     * memory, and a 64 GB disk.
     */
    override fun workerType(workerType: String) {
      cdkBuilder.workerType(workerType)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnDevEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.glue.CfnDevEndpointProps,
  ) : CdkObject(cdkObject),
      CfnDevEndpointProps {
    /**
     * A map of arguments used to configure the `DevEndpoint` .
     *
     * Valid arguments are:
     *
     * * `"--enable-glue-datacatalog": ""`
     * * `"GLUE_PYTHON_VERSION": "3"`
     * * `"GLUE_PYTHON_VERSION": "2"`
     *
     * You can specify a version of Python support for development endpoints by using the
     * `Arguments` parameter in the `CreateDevEndpoint` or `UpdateDevEndpoint` APIs. If no arguments
     * are provided, the version defaults to Python 2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-arguments)
     */
    override fun arguments(): Any? = unwrap(this).getArguments()

    /**
     * The name of the `DevEndpoint` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname)
     */
    override fun endpointName(): String? = unwrap(this).getEndpointName()

    /**
     * The path to one or more Java `.jar` files in an S3 bucket that should be loaded in your
     * `DevEndpoint` .
     *
     *
     * You can only use pure Java/Scala libraries with a `DevEndpoint` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrajarss3path)
     */
    override fun extraJarsS3Path(): String? = unwrap(this).getExtraJarsS3Path()

    /**
     * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in
     * your `DevEndpoint` .
     *
     * Multiple values must be complete paths separated by a comma.
     *
     *
     * You can only use pure Python libraries with a `DevEndpoint` . Libraries that rely on C
     * extensions, such as the [pandas](https://docs.aws.amazon.com/http://pandas.pydata.org/) Python
     * data analysis library, are not currently supported.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path)
     */
    override fun extraPythonLibsS3Path(): String? = unwrap(this).getExtraPythonLibsS3Path()

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
     */
    override fun glueVersion(): String? = unwrap(this).getGlueVersion()

    /**
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this `DevEndpoint` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofnodes)
     */
    override fun numberOfNodes(): Number? = unwrap(this).getNumberOfNodes()

    /**
     * The number of workers of a defined `workerType` that are allocated to the development
     * endpoint.
     *
     * The maximum number of workers you can define are 299 for `G.1X` , and 149 for `G.2X` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofworkers)
     */
    override fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

    /**
     * The public key to be used by this `DevEndpoint` for authentication.
     *
     * This attribute is provided for backward compatibility because the recommended attribute to
     * use is public keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey)
     */
    override fun publicKey(): String? = unwrap(this).getPublicKey()

    /**
     * A list of public keys to be used by the `DevEndpoints` for authentication.
     *
     * Using this attribute is preferred over a single public key because the public keys allow you
     * to have a different private key per client.
     *
     *
     * If you previously created an endpoint with a public key, you must remove that key to be able
     * to set a list of public keys. Call the `UpdateDevEndpoint` API operation with the public key
     * content in the `deletePublicKeys` attribute, and the list of new keys in the `addPublicKeys`
     * attribute.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickeys)
     */
    override fun publicKeys(): List<String> = unwrap(this).getPublicKeys() ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of the IAM role used in this `DevEndpoint` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The name of the `SecurityConfiguration` structure to be used with this `DevEndpoint` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securityconfiguration)
     */
    override fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

    /**
     * A list of security group identifiers used in this `DevEndpoint` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * The subnet ID for this `DevEndpoint` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid)
     */
    override fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * The tags to use with this DevEndpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()

    /**
     * The type of predefined worker that is allocated to the development endpoint.
     *
     * Accepts a value of Standard, G.1X, or G.2X.
     *
     * * For the `Standard` worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB
     * disk, and 2 executors per worker.
     * * For the `G.1X` worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB
     * disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive
     * jobs.
     * * For the `G.2X` worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB
     * disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive
     * jobs.
     *
     * Known issue: when a development endpoint is created with the `G.2X` `WorkerType`
     * configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of
     * memory, and a 64 GB disk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-workertype)
     */
    override fun workerType(): String? = unwrap(this).getWorkerType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDevEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDevEndpointProps):
        CfnDevEndpointProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDevEndpointProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDevEndpointProps):
        software.amazon.awscdk.services.glue.CfnDevEndpointProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.glue.CfnDevEndpointProps
  }
}
