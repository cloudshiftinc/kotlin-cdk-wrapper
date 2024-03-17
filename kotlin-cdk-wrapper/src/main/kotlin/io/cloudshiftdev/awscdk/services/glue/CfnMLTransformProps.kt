@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMLTransform`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * Object tags;
 * CfnMLTransformProps cfnMLTransformProps = CfnMLTransformProps.builder()
 * .inputRecordTables(InputRecordTablesProperty.builder()
 * .glueTables(List.of(GlueTablesProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * // the properties below are optional
 * .catalogId("catalogId")
 * .connectionName("connectionName")
 * .build()))
 * .build())
 * .role("role")
 * .transformParameters(TransformParametersProperty.builder()
 * .transformType("transformType")
 * // the properties below are optional
 * .findMatchesParameters(FindMatchesParametersProperty.builder()
 * .primaryKeyColumnName("primaryKeyColumnName")
 * // the properties below are optional
 * .accuracyCostTradeoff(123)
 * .enforceProvidedLabels(false)
 * .precisionRecallTradeoff(123)
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .glueVersion("glueVersion")
 * .maxCapacity(123)
 * .maxRetries(123)
 * .name("name")
 * .numberOfWorkers(123)
 * .tags(tags)
 * .timeout(123)
 * .transformEncryption(TransformEncryptionProperty.builder()
 * .mlUserDataEncryption(MLUserDataEncryptionProperty.builder()
 * .mlUserDataEncryptionMode("mlUserDataEncryptionMode")
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .taskRunSecurityConfigurationName("taskRunSecurityConfigurationName")
 * .build())
 * .workerType("workerType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html)
 */
public interface CfnMLTransformProps {
  /**
   * A user-defined, long-form description text for the machine learning transform.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * This value determines which version of AWS Glue this machine learning transform is compatible
   * with.
   *
   * Glue 1.0 is recommended for most customers. If the value is not set, the Glue compatibility
   * defaults to Glue 0.9. For more information, see [AWS Glue
   * Versions](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions) in
   * the developer guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-glueversion)
   */
  public fun glueVersion(): String? = unwrap(this).getGlueVersion()

  /**
   * A list of AWS Glue table definitions used by the transform.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-inputrecordtables)
   */
  public fun inputRecordTables(): Any

  /**
   * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this
   * transform.
   *
   * You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of
   * processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
   * information, see the [AWS Glue pricing page](https://docs.aws.amazon.com/glue/pricing/) .
   *
   * `MaxCapacity` is a mutually exclusive option with `NumberOfWorkers` and `WorkerType` .
   *
   * * If either `NumberOfWorkers` or `WorkerType` is set, then `MaxCapacity` cannot be set.
   * * If `MaxCapacity` is set then neither `NumberOfWorkers` or `WorkerType` can be set.
   * * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
   * * `MaxCapacity` and `NumberOfWorkers` must both be at least 1.
   *
   * When the `WorkerType` field is set to a value other than `Standard` , the `MaxCapacity` field
   * is set automatically and becomes read-only.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-maxcapacity)
   */
  public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  /**
   * The maximum number of times to retry after an `MLTaskRun` of the machine learning transform
   * fails.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-maxretries)
   */
  public fun maxRetries(): Number? = unwrap(this).getMaxRetries()

  /**
   * A user-defined name for the machine learning transform. Names are required to be unique. `Name`
   * is optional:.
   *
   * * If you supply `Name` , the stack cannot be repeatedly created.
   * * If `Name` is not provided, a randomly generated name will be used instead.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The number of workers of a defined `workerType` that are allocated when a task of the transform
   * runs.
   *
   * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-numberofworkers)
   */
  public fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

  /**
   * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
   *
   * The required permissions include both AWS Glue service role permissions to AWS Glue resources,
   * and Amazon S3 permissions required by the transform.
   *
   * * This role needs AWS Glue service role permissions to allow access to resources in AWS Glue .
   * See [Attach a Policy to IAM Users That Access AWS
   * Glue](https://docs.aws.amazon.com/glue/latest/dg/attach-policy-iam-user.html) .
   * * This role needs permission to your Amazon Simple Storage Service (Amazon S3) sources,
   * targets, temporary directory, scripts, and any libraries used by the task run for this transform.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-role)
   */
  public fun role(): String

  /**
   * The tags to use with this machine learning transform.
   *
   * You may use tags to limit access to the machine learning transform. For more information about
   * tags in AWS Glue , see [AWS Tags in AWS
   * Glue](https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html) in the developer guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * The timeout in minutes of the machine learning transform.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-timeout)
   */
  public fun timeout(): Number? = unwrap(this).getTimeout()

  /**
   * The encryption-at-rest settings of the transform that apply to accessing user data.
   *
   * Machine learning
   * transforms can access user data encrypted in Amazon S3 using KMS.
   *
   * Additionally, imported labels and trained transforms can now be encrypted using a customer
   * provided
   * KMS key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-transformencryption)
   */
  public fun transformEncryption(): Any? = unwrap(this).getTransformEncryption()

  /**
   * The algorithm-specific parameters that are associated with the machine learning transform.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-transformparameters)
   */
  public fun transformParameters(): Any

  /**
   * The type of predefined worker that is allocated when a task of this transform runs.
   *
   * Accepts a value of Standard, G.1X, or G.2X.
   *
   * * For the `Standard` worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
   * and 2 executors per worker.
   * * For the `G.1X` worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and
   * 1 executor per worker.
   * * For the `G.2X` worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk,
   * and 1 executor per worker.
   *
   * `MaxCapacity` is a mutually exclusive option with `NumberOfWorkers` and `WorkerType` .
   *
   * * If either `NumberOfWorkers` or `WorkerType` is set, then `MaxCapacity` cannot be set.
   * * If `MaxCapacity` is set then neither `NumberOfWorkers` or `WorkerType` can be set.
   * * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
   * * `MaxCapacity` and `NumberOfWorkers` must both be at least 1.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-workertype)
   */
  public fun workerType(): String? = unwrap(this).getWorkerType()

  /**
   * A builder for [CfnMLTransformProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A user-defined, long-form description text for the machine learning
     * transform.
     */
    public fun description(description: String)

    /**
     * @param glueVersion This value determines which version of AWS Glue this machine learning
     * transform is compatible with.
     * Glue 1.0 is recommended for most customers. If the value is not set, the Glue compatibility
     * defaults to Glue 0.9. For more information, see [AWS Glue
     * Versions](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions)
     * in the developer guide.
     */
    public fun glueVersion(glueVersion: String)

    /**
     * @param inputRecordTables A list of AWS Glue table definitions used by the transform. 
     */
    public fun inputRecordTables(inputRecordTables: IResolvable)

    /**
     * @param inputRecordTables A list of AWS Glue table definitions used by the transform. 
     */
    public fun inputRecordTables(inputRecordTables: CfnMLTransform.InputRecordTablesProperty)

    /**
     * @param inputRecordTables A list of AWS Glue table definitions used by the transform. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8da151c4040cc639bd7c33e205b6ffe6a64840570c2d41166ca9462040c1fc0")
    public
        fun inputRecordTables(inputRecordTables: CfnMLTransform.InputRecordTablesProperty.Builder.() -> Unit)

    /**
     * @param maxCapacity The number of AWS Glue data processing units (DPUs) that are allocated to
     * task runs for this transform.
     * You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of
     * processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the [AWS Glue pricing page](https://docs.aws.amazon.com/glue/pricing/) .
     *
     * `MaxCapacity` is a mutually exclusive option with `NumberOfWorkers` and `WorkerType` .
     *
     * * If either `NumberOfWorkers` or `WorkerType` is set, then `MaxCapacity` cannot be set.
     * * If `MaxCapacity` is set then neither `NumberOfWorkers` or `WorkerType` can be set.
     * * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
     * * `MaxCapacity` and `NumberOfWorkers` must both be at least 1.
     *
     * When the `WorkerType` field is set to a value other than `Standard` , the `MaxCapacity` field
     * is set automatically and becomes read-only.
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * @param maxRetries The maximum number of times to retry after an `MLTaskRun` of the machine
     * learning transform fails.
     */
    public fun maxRetries(maxRetries: Number)

    /**
     * @param name A user-defined name for the machine learning transform. Names are required to be
     * unique. `Name` is optional:.
     * * If you supply `Name` , the stack cannot be repeatedly created.
     * * If `Name` is not provided, a randomly generated name will be used instead.
     */
    public fun name(name: String)

    /**
     * @param numberOfWorkers The number of workers of a defined `workerType` that are allocated
     * when a task of the transform runs.
     * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
     */
    public fun numberOfWorkers(numberOfWorkers: Number)

    /**
     * @param role The name or Amazon Resource Name (ARN) of the IAM role with the required
     * permissions. 
     * The required permissions include both AWS Glue service role permissions to AWS Glue
     * resources, and Amazon S3 permissions required by the transform.
     *
     * * This role needs AWS Glue service role permissions to allow access to resources in AWS Glue
     * . See [Attach a Policy to IAM Users That Access AWS
     * Glue](https://docs.aws.amazon.com/glue/latest/dg/attach-policy-iam-user.html) .
     * * This role needs permission to your Amazon Simple Storage Service (Amazon S3) sources,
     * targets, temporary directory, scripts, and any libraries used by the task run for this
     * transform.
     */
    public fun role(role: String)

    /**
     * @param tags The tags to use with this machine learning transform.
     * You may use tags to limit access to the machine learning transform. For more information
     * about tags in AWS Glue , see [AWS Tags in AWS
     * Glue](https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html) in the developer guide.
     */
    public fun tags(tags: Any)

    /**
     * @param timeout The timeout in minutes of the machine learning transform.
     */
    public fun timeout(timeout: Number)

    /**
     * @param transformEncryption The encryption-at-rest settings of the transform that apply to
     * accessing user data.
     * Machine learning
     * transforms can access user data encrypted in Amazon S3 using KMS.
     *
     * Additionally, imported labels and trained transforms can now be encrypted using a customer
     * provided
     * KMS key.
     */
    public fun transformEncryption(transformEncryption: IResolvable)

    /**
     * @param transformEncryption The encryption-at-rest settings of the transform that apply to
     * accessing user data.
     * Machine learning
     * transforms can access user data encrypted in Amazon S3 using KMS.
     *
     * Additionally, imported labels and trained transforms can now be encrypted using a customer
     * provided
     * KMS key.
     */
    public fun transformEncryption(transformEncryption: CfnMLTransform.TransformEncryptionProperty)

    /**
     * @param transformEncryption The encryption-at-rest settings of the transform that apply to
     * accessing user data.
     * Machine learning
     * transforms can access user data encrypted in Amazon S3 using KMS.
     *
     * Additionally, imported labels and trained transforms can now be encrypted using a customer
     * provided
     * KMS key.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5cb02a0469e41da2782260cbf1bac3a2f4f537b8dcb9b50de4cb9c520a51a1c")
    public
        fun transformEncryption(transformEncryption: CfnMLTransform.TransformEncryptionProperty.Builder.() -> Unit)

    /**
     * @param transformParameters The algorithm-specific parameters that are associated with the
     * machine learning transform. 
     */
    public fun transformParameters(transformParameters: IResolvable)

    /**
     * @param transformParameters The algorithm-specific parameters that are associated with the
     * machine learning transform. 
     */
    public fun transformParameters(transformParameters: CfnMLTransform.TransformParametersProperty)

    /**
     * @param transformParameters The algorithm-specific parameters that are associated with the
     * machine learning transform. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee80a6d6c67fc3517c42dc75b63b6e6393916cfacb2f238d55b2d215e0abca0f")
    public
        fun transformParameters(transformParameters: CfnMLTransform.TransformParametersProperty.Builder.() -> Unit)

    /**
     * @param workerType The type of predefined worker that is allocated when a task of this
     * transform runs.
     * Accepts a value of Standard, G.1X, or G.2X.
     *
     * * For the `Standard` worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB
     * disk, and 2 executors per worker.
     * * For the `G.1X` worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk,
     * and 1 executor per worker.
     * * For the `G.2X` worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk,
     * and 1 executor per worker.
     *
     * `MaxCapacity` is a mutually exclusive option with `NumberOfWorkers` and `WorkerType` .
     *
     * * If either `NumberOfWorkers` or `WorkerType` is set, then `MaxCapacity` cannot be set.
     * * If `MaxCapacity` is set then neither `NumberOfWorkers` or `WorkerType` can be set.
     * * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
     * * `MaxCapacity` and `NumberOfWorkers` must both be at least 1.
     */
    public fun workerType(workerType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnMLTransformProps.Builder =
        software.amazon.awscdk.services.glue.CfnMLTransformProps.builder()

    /**
     * @param description A user-defined, long-form description text for the machine learning
     * transform.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param glueVersion This value determines which version of AWS Glue this machine learning
     * transform is compatible with.
     * Glue 1.0 is recommended for most customers. If the value is not set, the Glue compatibility
     * defaults to Glue 0.9. For more information, see [AWS Glue
     * Versions](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions)
     * in the developer guide.
     */
    override fun glueVersion(glueVersion: String) {
      cdkBuilder.glueVersion(glueVersion)
    }

    /**
     * @param inputRecordTables A list of AWS Glue table definitions used by the transform. 
     */
    override fun inputRecordTables(inputRecordTables: IResolvable) {
      cdkBuilder.inputRecordTables(inputRecordTables.let(IResolvable::unwrap))
    }

    /**
     * @param inputRecordTables A list of AWS Glue table definitions used by the transform. 
     */
    override fun inputRecordTables(inputRecordTables: CfnMLTransform.InputRecordTablesProperty) {
      cdkBuilder.inputRecordTables(inputRecordTables.let(CfnMLTransform.InputRecordTablesProperty::unwrap))
    }

    /**
     * @param inputRecordTables A list of AWS Glue table definitions used by the transform. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8da151c4040cc639bd7c33e205b6ffe6a64840570c2d41166ca9462040c1fc0")
    override
        fun inputRecordTables(inputRecordTables: CfnMLTransform.InputRecordTablesProperty.Builder.() -> Unit):
        Unit = inputRecordTables(CfnMLTransform.InputRecordTablesProperty(inputRecordTables))

    /**
     * @param maxCapacity The number of AWS Glue data processing units (DPUs) that are allocated to
     * task runs for this transform.
     * You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of
     * processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the [AWS Glue pricing page](https://docs.aws.amazon.com/glue/pricing/) .
     *
     * `MaxCapacity` is a mutually exclusive option with `NumberOfWorkers` and `WorkerType` .
     *
     * * If either `NumberOfWorkers` or `WorkerType` is set, then `MaxCapacity` cannot be set.
     * * If `MaxCapacity` is set then neither `NumberOfWorkers` or `WorkerType` can be set.
     * * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
     * * `MaxCapacity` and `NumberOfWorkers` must both be at least 1.
     *
     * When the `WorkerType` field is set to a value other than `Standard` , the `MaxCapacity` field
     * is set automatically and becomes read-only.
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param maxRetries The maximum number of times to retry after an `MLTaskRun` of the machine
     * learning transform fails.
     */
    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    /**
     * @param name A user-defined name for the machine learning transform. Names are required to be
     * unique. `Name` is optional:.
     * * If you supply `Name` , the stack cannot be repeatedly created.
     * * If `Name` is not provided, a randomly generated name will be used instead.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param numberOfWorkers The number of workers of a defined `workerType` that are allocated
     * when a task of the transform runs.
     * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
     */
    override fun numberOfWorkers(numberOfWorkers: Number) {
      cdkBuilder.numberOfWorkers(numberOfWorkers)
    }

    /**
     * @param role The name or Amazon Resource Name (ARN) of the IAM role with the required
     * permissions. 
     * The required permissions include both AWS Glue service role permissions to AWS Glue
     * resources, and Amazon S3 permissions required by the transform.
     *
     * * This role needs AWS Glue service role permissions to allow access to resources in AWS Glue
     * . See [Attach a Policy to IAM Users That Access AWS
     * Glue](https://docs.aws.amazon.com/glue/latest/dg/attach-policy-iam-user.html) .
     * * This role needs permission to your Amazon Simple Storage Service (Amazon S3) sources,
     * targets, temporary directory, scripts, and any libraries used by the task run for this
     * transform.
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * @param tags The tags to use with this machine learning transform.
     * You may use tags to limit access to the machine learning transform. For more information
     * about tags in AWS Glue , see [AWS Tags in AWS
     * Glue](https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html) in the developer guide.
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param timeout The timeout in minutes of the machine learning transform.
     */
    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    /**
     * @param transformEncryption The encryption-at-rest settings of the transform that apply to
     * accessing user data.
     * Machine learning
     * transforms can access user data encrypted in Amazon S3 using KMS.
     *
     * Additionally, imported labels and trained transforms can now be encrypted using a customer
     * provided
     * KMS key.
     */
    override fun transformEncryption(transformEncryption: IResolvable) {
      cdkBuilder.transformEncryption(transformEncryption.let(IResolvable::unwrap))
    }

    /**
     * @param transformEncryption The encryption-at-rest settings of the transform that apply to
     * accessing user data.
     * Machine learning
     * transforms can access user data encrypted in Amazon S3 using KMS.
     *
     * Additionally, imported labels and trained transforms can now be encrypted using a customer
     * provided
     * KMS key.
     */
    override
        fun transformEncryption(transformEncryption: CfnMLTransform.TransformEncryptionProperty) {
      cdkBuilder.transformEncryption(transformEncryption.let(CfnMLTransform.TransformEncryptionProperty::unwrap))
    }

    /**
     * @param transformEncryption The encryption-at-rest settings of the transform that apply to
     * accessing user data.
     * Machine learning
     * transforms can access user data encrypted in Amazon S3 using KMS.
     *
     * Additionally, imported labels and trained transforms can now be encrypted using a customer
     * provided
     * KMS key.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5cb02a0469e41da2782260cbf1bac3a2f4f537b8dcb9b50de4cb9c520a51a1c")
    override
        fun transformEncryption(transformEncryption: CfnMLTransform.TransformEncryptionProperty.Builder.() -> Unit):
        Unit = transformEncryption(CfnMLTransform.TransformEncryptionProperty(transformEncryption))

    /**
     * @param transformParameters The algorithm-specific parameters that are associated with the
     * machine learning transform. 
     */
    override fun transformParameters(transformParameters: IResolvable) {
      cdkBuilder.transformParameters(transformParameters.let(IResolvable::unwrap))
    }

    /**
     * @param transformParameters The algorithm-specific parameters that are associated with the
     * machine learning transform. 
     */
    override
        fun transformParameters(transformParameters: CfnMLTransform.TransformParametersProperty) {
      cdkBuilder.transformParameters(transformParameters.let(CfnMLTransform.TransformParametersProperty::unwrap))
    }

    /**
     * @param transformParameters The algorithm-specific parameters that are associated with the
     * machine learning transform. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee80a6d6c67fc3517c42dc75b63b6e6393916cfacb2f238d55b2d215e0abca0f")
    override
        fun transformParameters(transformParameters: CfnMLTransform.TransformParametersProperty.Builder.() -> Unit):
        Unit = transformParameters(CfnMLTransform.TransformParametersProperty(transformParameters))

    /**
     * @param workerType The type of predefined worker that is allocated when a task of this
     * transform runs.
     * Accepts a value of Standard, G.1X, or G.2X.
     *
     * * For the `Standard` worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB
     * disk, and 2 executors per worker.
     * * For the `G.1X` worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk,
     * and 1 executor per worker.
     * * For the `G.2X` worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk,
     * and 1 executor per worker.
     *
     * `MaxCapacity` is a mutually exclusive option with `NumberOfWorkers` and `WorkerType` .
     *
     * * If either `NumberOfWorkers` or `WorkerType` is set, then `MaxCapacity` cannot be set.
     * * If `MaxCapacity` is set then neither `NumberOfWorkers` or `WorkerType` can be set.
     * * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
     * * `MaxCapacity` and `NumberOfWorkers` must both be at least 1.
     */
    override fun workerType(workerType: String) {
      cdkBuilder.workerType(workerType)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnMLTransformProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnMLTransformProps,
  ) : CdkObject(cdkObject), CfnMLTransformProps {
    /**
     * A user-defined, long-form description text for the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * This value determines which version of AWS Glue this machine learning transform is compatible
     * with.
     *
     * Glue 1.0 is recommended for most customers. If the value is not set, the Glue compatibility
     * defaults to Glue 0.9. For more information, see [AWS Glue
     * Versions](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions)
     * in the developer guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-glueversion)
     */
    override fun glueVersion(): String? = unwrap(this).getGlueVersion()

    /**
     * A list of AWS Glue table definitions used by the transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-inputrecordtables)
     */
    override fun inputRecordTables(): Any = unwrap(this).getInputRecordTables()

    /**
     * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this
     * transform.
     *
     * You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of
     * processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the [AWS Glue pricing page](https://docs.aws.amazon.com/glue/pricing/) .
     *
     * `MaxCapacity` is a mutually exclusive option with `NumberOfWorkers` and `WorkerType` .
     *
     * * If either `NumberOfWorkers` or `WorkerType` is set, then `MaxCapacity` cannot be set.
     * * If `MaxCapacity` is set then neither `NumberOfWorkers` or `WorkerType` can be set.
     * * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
     * * `MaxCapacity` and `NumberOfWorkers` must both be at least 1.
     *
     * When the `WorkerType` field is set to a value other than `Standard` , the `MaxCapacity` field
     * is set automatically and becomes read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-maxcapacity)
     */
    override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    /**
     * The maximum number of times to retry after an `MLTaskRun` of the machine learning transform
     * fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-maxretries)
     */
    override fun maxRetries(): Number? = unwrap(this).getMaxRetries()

    /**
     * A user-defined name for the machine learning transform. Names are required to be unique.
     * `Name` is optional:.
     *
     * * If you supply `Name` , the stack cannot be repeatedly created.
     * * If `Name` is not provided, a randomly generated name will be used instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The number of workers of a defined `workerType` that are allocated when a task of the
     * transform runs.
     *
     * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-numberofworkers)
     */
    override fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

    /**
     * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
     *
     * The required permissions include both AWS Glue service role permissions to AWS Glue
     * resources, and Amazon S3 permissions required by the transform.
     *
     * * This role needs AWS Glue service role permissions to allow access to resources in AWS Glue
     * . See [Attach a Policy to IAM Users That Access AWS
     * Glue](https://docs.aws.amazon.com/glue/latest/dg/attach-policy-iam-user.html) .
     * * This role needs permission to your Amazon Simple Storage Service (Amazon S3) sources,
     * targets, temporary directory, scripts, and any libraries used by the task run for this
     * transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-role)
     */
    override fun role(): String = unwrap(this).getRole()

    /**
     * The tags to use with this machine learning transform.
     *
     * You may use tags to limit access to the machine learning transform. For more information
     * about tags in AWS Glue , see [AWS Tags in AWS
     * Glue](https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html) in the developer guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()

    /**
     * The timeout in minutes of the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-timeout)
     */
    override fun timeout(): Number? = unwrap(this).getTimeout()

    /**
     * The encryption-at-rest settings of the transform that apply to accessing user data.
     *
     * Machine learning
     * transforms can access user data encrypted in Amazon S3 using KMS.
     *
     * Additionally, imported labels and trained transforms can now be encrypted using a customer
     * provided
     * KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-transformencryption)
     */
    override fun transformEncryption(): Any? = unwrap(this).getTransformEncryption()

    /**
     * The algorithm-specific parameters that are associated with the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-transformparameters)
     */
    override fun transformParameters(): Any = unwrap(this).getTransformParameters()

    /**
     * The type of predefined worker that is allocated when a task of this transform runs.
     *
     * Accepts a value of Standard, G.1X, or G.2X.
     *
     * * For the `Standard` worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB
     * disk, and 2 executors per worker.
     * * For the `G.1X` worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk,
     * and 1 executor per worker.
     * * For the `G.2X` worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk,
     * and 1 executor per worker.
     *
     * `MaxCapacity` is a mutually exclusive option with `NumberOfWorkers` and `WorkerType` .
     *
     * * If either `NumberOfWorkers` or `WorkerType` is set, then `MaxCapacity` cannot be set.
     * * If `MaxCapacity` is set then neither `NumberOfWorkers` or `WorkerType` can be set.
     * * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
     * * `MaxCapacity` and `NumberOfWorkers` must both be at least 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-workertype)
     */
    override fun workerType(): String? = unwrap(this).getWorkerType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMLTransformProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnMLTransformProps):
        CfnMLTransformProps = CdkObjectWrappers.wrap(cdkObject) as? CfnMLTransformProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMLTransformProps):
        software.amazon.awscdk.services.glue.CfnMLTransformProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.glue.CfnMLTransformProps
  }
}
