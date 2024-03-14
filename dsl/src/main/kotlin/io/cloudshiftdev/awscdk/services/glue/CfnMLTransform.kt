package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMLTransform internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.glue.CfnMLTransform,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A user-defined, long-form description text for the machine learning transform.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A user-defined, long-form description text for the machine learning transform.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * This value determines which version of AWS Glue this machine learning transform is compatible
   * with.
   */
  public open fun glueVersion(): String? = unwrap(this).getGlueVersion()

  /**
   * This value determines which version of AWS Glue this machine learning transform is compatible
   * with.
   */
  public open fun glueVersion(`value`: String) {
    unwrap(this).setGlueVersion(`value`)
  }

  /**
   * A list of AWS Glue table definitions used by the transform.
   */
  public open fun inputRecordTables(): Any = unwrap(this).getInputRecordTables()

  /**
   * A list of AWS Glue table definitions used by the transform.
   */
  public open fun inputRecordTables(`value`: IResolvable) {
    unwrap(this).setInputRecordTables(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of AWS Glue table definitions used by the transform.
   */
  public open fun inputRecordTables(`value`: InputRecordTablesProperty) {
    unwrap(this).setInputRecordTables(`value`.let(InputRecordTablesProperty::unwrap))
  }

  /**
   * A list of AWS Glue table definitions used by the transform.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8d17b09612a6a984b1a4d0528aa1ec658b7e3a3eb5cf7f205100acbfa1318fb7")
  public open fun inputRecordTables(`value`: InputRecordTablesProperty.Builder.() -> Unit): Unit =
      inputRecordTables(InputRecordTablesProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this
   * transform.
   */
  public open fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  /**
   * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this
   * transform.
   */
  public open fun maxCapacity(`value`: Number) {
    unwrap(this).setMaxCapacity(`value`)
  }

  /**
   * The maximum number of times to retry after an `MLTaskRun` of the machine learning transform
   * fails.
   */
  public open fun maxRetries(): Number? = unwrap(this).getMaxRetries()

  /**
   * The maximum number of times to retry after an `MLTaskRun` of the machine learning transform
   * fails.
   */
  public open fun maxRetries(`value`: Number) {
    unwrap(this).setMaxRetries(`value`)
  }

  /**
   * A user-defined name for the machine learning transform.
   *
   * Names are required to be unique. `Name` is optional:.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * A user-defined name for the machine learning transform.
   *
   * Names are required to be unique. `Name` is optional:.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The number of workers of a defined `workerType` that are allocated when a task of the transform
   * runs.
   */
  public open fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

  /**
   * The number of workers of a defined `workerType` that are allocated when a task of the transform
   * runs.
   */
  public open fun numberOfWorkers(`value`: Number) {
    unwrap(this).setNumberOfWorkers(`value`)
  }

  /**
   * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
   */
  public open fun role(): String = unwrap(this).getRole()

  /**
   * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
   */
  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to use with this machine learning transform.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * The tags to use with this machine learning transform.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The timeout in minutes of the machine learning transform.
   */
  public open fun timeout(): Number? = unwrap(this).getTimeout()

  /**
   * The timeout in minutes of the machine learning transform.
   */
  public open fun timeout(`value`: Number) {
    unwrap(this).setTimeout(`value`)
  }

  /**
   * The encryption-at-rest settings of the transform that apply to accessing user data.
   */
  public open fun transformEncryption(): Any? = unwrap(this).getTransformEncryption()

  /**
   * The encryption-at-rest settings of the transform that apply to accessing user data.
   */
  public open fun transformEncryption(`value`: IResolvable) {
    unwrap(this).setTransformEncryption(`value`.let(IResolvable::unwrap))
  }

  /**
   * The encryption-at-rest settings of the transform that apply to accessing user data.
   */
  public open fun transformEncryption(`value`: TransformEncryptionProperty) {
    unwrap(this).setTransformEncryption(`value`.let(TransformEncryptionProperty::unwrap))
  }

  /**
   * The encryption-at-rest settings of the transform that apply to accessing user data.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11ae5be441f598752f9087139ca75baaf4cedb2744d5a4fa806ec59ae9da1d99")
  public open fun transformEncryption(`value`: TransformEncryptionProperty.Builder.() -> Unit): Unit
      = transformEncryption(TransformEncryptionProperty(`value`))

  /**
   * The algorithm-specific parameters that are associated with the machine learning transform.
   */
  public open fun transformParameters(): Any = unwrap(this).getTransformParameters()

  /**
   * The algorithm-specific parameters that are associated with the machine learning transform.
   */
  public open fun transformParameters(`value`: IResolvable) {
    unwrap(this).setTransformParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * The algorithm-specific parameters that are associated with the machine learning transform.
   */
  public open fun transformParameters(`value`: TransformParametersProperty) {
    unwrap(this).setTransformParameters(`value`.let(TransformParametersProperty::unwrap))
  }

  /**
   * The algorithm-specific parameters that are associated with the machine learning transform.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dcc06b7991decb499cc51d8fae892d0555ecb8b535ff5c779af07e05284ee490")
  public open fun transformParameters(`value`: TransformParametersProperty.Builder.() -> Unit): Unit
      = transformParameters(TransformParametersProperty(`value`))

  /**
   * The type of predefined worker that is allocated when a task of this transform runs.
   */
  public open fun workerType(): String? = unwrap(this).getWorkerType()

  /**
   * The type of predefined worker that is allocated when a task of this transform runs.
   */
  public open fun workerType(`value`: String) {
    unwrap(this).setWorkerType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnMLTransform].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A user-defined, long-form description text for the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-description)
     * @param description A user-defined, long-form description text for the machine learning
     * transform. 
     */
    public fun description(description: String)

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
     * @param glueVersion This value determines which version of AWS Glue this machine learning
     * transform is compatible with. 
     */
    public fun glueVersion(glueVersion: String)

    /**
     * A list of AWS Glue table definitions used by the transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-inputrecordtables)
     * @param inputRecordTables A list of AWS Glue table definitions used by the transform. 
     */
    public fun inputRecordTables(inputRecordTables: IResolvable)

    /**
     * A list of AWS Glue table definitions used by the transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-inputrecordtables)
     * @param inputRecordTables A list of AWS Glue table definitions used by the transform. 
     */
    public fun inputRecordTables(inputRecordTables: InputRecordTablesProperty)

    /**
     * A list of AWS Glue table definitions used by the transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-inputrecordtables)
     * @param inputRecordTables A list of AWS Glue table definitions used by the transform. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fca839ef9d1b62497d77256d22b07512a4a920922f8aa6f37e15f312aaa82c75")
    public fun inputRecordTables(inputRecordTables: InputRecordTablesProperty.Builder.() -> Unit)

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
     * @param maxCapacity The number of AWS Glue data processing units (DPUs) that are allocated to
     * task runs for this transform. 
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * The maximum number of times to retry after an `MLTaskRun` of the machine learning transform
     * fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-maxretries)
     * @param maxRetries The maximum number of times to retry after an `MLTaskRun` of the machine
     * learning transform fails. 
     */
    public fun maxRetries(maxRetries: Number)

    /**
     * A user-defined name for the machine learning transform. Names are required to be unique.
     * `Name` is optional:.
     *
     * * If you supply `Name` , the stack cannot be repeatedly created.
     * * If `Name` is not provided, a randomly generated name will be used instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-name)
     * @param name A user-defined name for the machine learning transform. Names are required to be
     * unique. `Name` is optional:. 
     */
    public fun name(name: String)

    /**
     * The number of workers of a defined `workerType` that are allocated when a task of the
     * transform runs.
     *
     * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-numberofworkers)
     * @param numberOfWorkers The number of workers of a defined `workerType` that are allocated
     * when a task of the transform runs. 
     */
    public fun numberOfWorkers(numberOfWorkers: Number)

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
     * @param role The name or Amazon Resource Name (ARN) of the IAM role with the required
     * permissions. 
     */
    public fun role(role: String)

    /**
     * The tags to use with this machine learning transform.
     *
     * You may use tags to limit access to the machine learning transform. For more information
     * about tags in AWS Glue , see [AWS Tags in AWS
     * Glue](https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html) in the developer guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-tags)
     * @param tags The tags to use with this machine learning transform. 
     */
    public fun tags(tags: Any)

    /**
     * The timeout in minutes of the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-timeout)
     * @param timeout The timeout in minutes of the machine learning transform. 
     */
    public fun timeout(timeout: Number)

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
     * @param transformEncryption The encryption-at-rest settings of the transform that apply to
     * accessing user data. 
     */
    public fun transformEncryption(transformEncryption: IResolvable)

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
     * @param transformEncryption The encryption-at-rest settings of the transform that apply to
     * accessing user data. 
     */
    public fun transformEncryption(transformEncryption: TransformEncryptionProperty)

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
     * @param transformEncryption The encryption-at-rest settings of the transform that apply to
     * accessing user data. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b4c4be7710e625f57455d8cede56a9d6bb04bd35ce28cec13ebb09d79d53e11")
    public
        fun transformEncryption(transformEncryption: TransformEncryptionProperty.Builder.() -> Unit)

    /**
     * The algorithm-specific parameters that are associated with the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-transformparameters)
     * @param transformParameters The algorithm-specific parameters that are associated with the
     * machine learning transform. 
     */
    public fun transformParameters(transformParameters: IResolvable)

    /**
     * The algorithm-specific parameters that are associated with the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-transformparameters)
     * @param transformParameters The algorithm-specific parameters that are associated with the
     * machine learning transform. 
     */
    public fun transformParameters(transformParameters: TransformParametersProperty)

    /**
     * The algorithm-specific parameters that are associated with the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-transformparameters)
     * @param transformParameters The algorithm-specific parameters that are associated with the
     * machine learning transform. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fed60572c4823d8272124aedabc053c220a64599b0630ba5a3c181911cfd7ec9")
    public
        fun transformParameters(transformParameters: TransformParametersProperty.Builder.() -> Unit)

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
     * @param workerType The type of predefined worker that is allocated when a task of this
     * transform runs. 
     */
    public fun workerType(workerType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnMLTransform.Builder =
        software.amazon.awscdk.services.glue.CfnMLTransform.Builder.create(scope, id)

    /**
     * A user-defined, long-form description text for the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-description)
     * @param description A user-defined, long-form description text for the machine learning
     * transform. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

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
     * @param glueVersion This value determines which version of AWS Glue this machine learning
     * transform is compatible with. 
     */
    override fun glueVersion(glueVersion: String) {
      cdkBuilder.glueVersion(glueVersion)
    }

    /**
     * A list of AWS Glue table definitions used by the transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-inputrecordtables)
     * @param inputRecordTables A list of AWS Glue table definitions used by the transform. 
     */
    override fun inputRecordTables(inputRecordTables: IResolvable) {
      cdkBuilder.inputRecordTables(inputRecordTables.let(IResolvable::unwrap))
    }

    /**
     * A list of AWS Glue table definitions used by the transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-inputrecordtables)
     * @param inputRecordTables A list of AWS Glue table definitions used by the transform. 
     */
    override fun inputRecordTables(inputRecordTables: InputRecordTablesProperty) {
      cdkBuilder.inputRecordTables(inputRecordTables.let(InputRecordTablesProperty::unwrap))
    }

    /**
     * A list of AWS Glue table definitions used by the transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-inputrecordtables)
     * @param inputRecordTables A list of AWS Glue table definitions used by the transform. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fca839ef9d1b62497d77256d22b07512a4a920922f8aa6f37e15f312aaa82c75")
    override fun inputRecordTables(inputRecordTables: InputRecordTablesProperty.Builder.() -> Unit):
        Unit = inputRecordTables(InputRecordTablesProperty(inputRecordTables))

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
     * @param maxCapacity The number of AWS Glue data processing units (DPUs) that are allocated to
     * task runs for this transform. 
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * The maximum number of times to retry after an `MLTaskRun` of the machine learning transform
     * fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-maxretries)
     * @param maxRetries The maximum number of times to retry after an `MLTaskRun` of the machine
     * learning transform fails. 
     */
    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    /**
     * A user-defined name for the machine learning transform. Names are required to be unique.
     * `Name` is optional:.
     *
     * * If you supply `Name` , the stack cannot be repeatedly created.
     * * If `Name` is not provided, a randomly generated name will be used instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-name)
     * @param name A user-defined name for the machine learning transform. Names are required to be
     * unique. `Name` is optional:. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The number of workers of a defined `workerType` that are allocated when a task of the
     * transform runs.
     *
     * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-numberofworkers)
     * @param numberOfWorkers The number of workers of a defined `workerType` that are allocated
     * when a task of the transform runs. 
     */
    override fun numberOfWorkers(numberOfWorkers: Number) {
      cdkBuilder.numberOfWorkers(numberOfWorkers)
    }

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
     * @param role The name or Amazon Resource Name (ARN) of the IAM role with the required
     * permissions. 
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * The tags to use with this machine learning transform.
     *
     * You may use tags to limit access to the machine learning transform. For more information
     * about tags in AWS Glue , see [AWS Tags in AWS
     * Glue](https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html) in the developer guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-tags)
     * @param tags The tags to use with this machine learning transform. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * The timeout in minutes of the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-timeout)
     * @param timeout The timeout in minutes of the machine learning transform. 
     */
    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

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
     * @param transformEncryption The encryption-at-rest settings of the transform that apply to
     * accessing user data. 
     */
    override fun transformEncryption(transformEncryption: IResolvable) {
      cdkBuilder.transformEncryption(transformEncryption.let(IResolvable::unwrap))
    }

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
     * @param transformEncryption The encryption-at-rest settings of the transform that apply to
     * accessing user data. 
     */
    override fun transformEncryption(transformEncryption: TransformEncryptionProperty) {
      cdkBuilder.transformEncryption(transformEncryption.let(TransformEncryptionProperty::unwrap))
    }

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
     * @param transformEncryption The encryption-at-rest settings of the transform that apply to
     * accessing user data. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b4c4be7710e625f57455d8cede56a9d6bb04bd35ce28cec13ebb09d79d53e11")
    override
        fun transformEncryption(transformEncryption: TransformEncryptionProperty.Builder.() -> Unit):
        Unit = transformEncryption(TransformEncryptionProperty(transformEncryption))

    /**
     * The algorithm-specific parameters that are associated with the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-transformparameters)
     * @param transformParameters The algorithm-specific parameters that are associated with the
     * machine learning transform. 
     */
    override fun transformParameters(transformParameters: IResolvable) {
      cdkBuilder.transformParameters(transformParameters.let(IResolvable::unwrap))
    }

    /**
     * The algorithm-specific parameters that are associated with the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-transformparameters)
     * @param transformParameters The algorithm-specific parameters that are associated with the
     * machine learning transform. 
     */
    override fun transformParameters(transformParameters: TransformParametersProperty) {
      cdkBuilder.transformParameters(transformParameters.let(TransformParametersProperty::unwrap))
    }

    /**
     * The algorithm-specific parameters that are associated with the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-transformparameters)
     * @param transformParameters The algorithm-specific parameters that are associated with the
     * machine learning transform. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fed60572c4823d8272124aedabc053c220a64599b0630ba5a3c181911cfd7ec9")
    override
        fun transformParameters(transformParameters: TransformParametersProperty.Builder.() -> Unit):
        Unit = transformParameters(TransformParametersProperty(transformParameters))

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
     * @param workerType The type of predefined worker that is allocated when a task of this
     * transform runs. 
     */
    override fun workerType(workerType: String) {
      cdkBuilder.workerType(workerType)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnMLTransform = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMLTransform {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMLTransform(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnMLTransform):
        CfnMLTransform = CfnMLTransform(cdkObject)

    internal fun unwrap(wrapped: CfnMLTransform):
        software.amazon.awscdk.services.glue.CfnMLTransform = wrapped.cdkObject
  }

  public interface GlueTablesProperty {
    /**
     * A unique identifier for the AWS Glue Data Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-gluetables.html#cfn-glue-mltransform-gluetables-catalogid)
     */
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    /**
     * The name of the connection to the AWS Glue Data Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-gluetables.html#cfn-glue-mltransform-gluetables-connectionname)
     */
    public fun connectionName(): String? = unwrap(this).getConnectionName()

    /**
     * A database name in the AWS Glue Data Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-gluetables.html#cfn-glue-mltransform-gluetables-databasename)
     */
    public fun databaseName(): String

    /**
     * A table name in the AWS Glue Data Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-gluetables.html#cfn-glue-mltransform-gluetables-tablename)
     */
    public fun tableName(): String

    /**
     * A builder for [GlueTablesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId A unique identifier for the AWS Glue Data Catalog .
       */
      public fun catalogId(catalogId: String)

      /**
       * @param connectionName The name of the connection to the AWS Glue Data Catalog .
       */
      public fun connectionName(connectionName: String)

      /**
       * @param databaseName A database name in the AWS Glue Data Catalog . 
       */
      public fun databaseName(databaseName: String)

      /**
       * @param tableName A table name in the AWS Glue Data Catalog . 
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty.Builder =
          software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty.builder()

      /**
       * @param catalogId A unique identifier for the AWS Glue Data Catalog .
       */
      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      /**
       * @param connectionName The name of the connection to the AWS Glue Data Catalog .
       */
      override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      /**
       * @param databaseName A database name in the AWS Glue Data Catalog . 
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param tableName A table name in the AWS Glue Data Catalog . 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty,
    ) : CdkObject(cdkObject), GlueTablesProperty {
      /**
       * A unique identifier for the AWS Glue Data Catalog .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-gluetables.html#cfn-glue-mltransform-gluetables-catalogid)
       */
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      /**
       * The name of the connection to the AWS Glue Data Catalog .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-gluetables.html#cfn-glue-mltransform-gluetables-connectionname)
       */
      override fun connectionName(): String? = unwrap(this).getConnectionName()

      /**
       * A database name in the AWS Glue Data Catalog .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-gluetables.html#cfn-glue-mltransform-gluetables-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * A table name in the AWS Glue Data Catalog .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-gluetables.html#cfn-glue-mltransform-gluetables-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GlueTablesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty):
          GlueTablesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlueTablesProperty):
          software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty
    }
  }

  public interface TransformEncryptionProperty {
    /**
     * The encryption-at-rest settings of the transform that apply to accessing user data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformencryption.html#cfn-glue-mltransform-transformencryption-mluserdataencryption)
     */
    public fun mlUserDataEncryption(): Any? = unwrap(this).getMlUserDataEncryption()

    /**
     * The name of the security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformencryption.html#cfn-glue-mltransform-transformencryption-taskrunsecurityconfigurationname)
     */
    public fun taskRunSecurityConfigurationName(): String? =
        unwrap(this).getTaskRunSecurityConfigurationName()

    /**
     * A builder for [TransformEncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mlUserDataEncryption The encryption-at-rest settings of the transform that apply to
       * accessing user data.
       */
      public fun mlUserDataEncryption(mlUserDataEncryption: IResolvable)

      /**
       * @param mlUserDataEncryption The encryption-at-rest settings of the transform that apply to
       * accessing user data.
       */
      public fun mlUserDataEncryption(mlUserDataEncryption: MLUserDataEncryptionProperty)

      /**
       * @param mlUserDataEncryption The encryption-at-rest settings of the transform that apply to
       * accessing user data.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6581c0127c03889021bdaa631f1ef422965b6cae92da1772aa113a216c632231")
      public
          fun mlUserDataEncryption(mlUserDataEncryption: MLUserDataEncryptionProperty.Builder.() -> Unit)

      /**
       * @param taskRunSecurityConfigurationName The name of the security configuration.
       */
      public fun taskRunSecurityConfigurationName(taskRunSecurityConfigurationName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty.Builder =
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty.builder()

      /**
       * @param mlUserDataEncryption The encryption-at-rest settings of the transform that apply to
       * accessing user data.
       */
      override fun mlUserDataEncryption(mlUserDataEncryption: IResolvable) {
        cdkBuilder.mlUserDataEncryption(mlUserDataEncryption.let(IResolvable::unwrap))
      }

      /**
       * @param mlUserDataEncryption The encryption-at-rest settings of the transform that apply to
       * accessing user data.
       */
      override fun mlUserDataEncryption(mlUserDataEncryption: MLUserDataEncryptionProperty) {
        cdkBuilder.mlUserDataEncryption(mlUserDataEncryption.let(MLUserDataEncryptionProperty::unwrap))
      }

      /**
       * @param mlUserDataEncryption The encryption-at-rest settings of the transform that apply to
       * accessing user data.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6581c0127c03889021bdaa631f1ef422965b6cae92da1772aa113a216c632231")
      override
          fun mlUserDataEncryption(mlUserDataEncryption: MLUserDataEncryptionProperty.Builder.() -> Unit):
          Unit = mlUserDataEncryption(MLUserDataEncryptionProperty(mlUserDataEncryption))

      /**
       * @param taskRunSecurityConfigurationName The name of the security configuration.
       */
      override fun taskRunSecurityConfigurationName(taskRunSecurityConfigurationName: String) {
        cdkBuilder.taskRunSecurityConfigurationName(taskRunSecurityConfigurationName)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty,
    ) : CdkObject(cdkObject), TransformEncryptionProperty {
      /**
       * The encryption-at-rest settings of the transform that apply to accessing user data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformencryption.html#cfn-glue-mltransform-transformencryption-mluserdataencryption)
       */
      override fun mlUserDataEncryption(): Any? = unwrap(this).getMlUserDataEncryption()

      /**
       * The name of the security configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformencryption.html#cfn-glue-mltransform-transformencryption-taskrunsecurityconfigurationname)
       */
      override fun taskRunSecurityConfigurationName(): String? =
          unwrap(this).getTaskRunSecurityConfigurationName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TransformEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty):
          TransformEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformEncryptionProperty):
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty
    }
  }

  public interface FindMatchesParametersProperty {
    /**
     * The value that is selected when tuning your transform for a balance between accuracy and
     * cost.
     *
     * A value of 0.5 means that the system balances accuracy and cost concerns. A value of 1.0
     * means a bias purely for accuracy, which typically results in a higher cost, sometimes
     * substantially higher. A value of 0.0 means a bias purely for cost, which results in a less
     * accurate `FindMatches` transform, sometimes with unacceptable accuracy.
     *
     * Accuracy measures how well the transform finds true positives and true negatives. Increasing
     * accuracy requires more machine resources and cost. But it also results in increased recall.
     *
     * Cost measures how many compute resources, and thus money, are consumed to run the transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-findmatchesparameters.html#cfn-glue-mltransform-findmatchesparameters-accuracycosttradeoff)
     */
    public fun accuracyCostTradeoff(): Number? = unwrap(this).getAccuracyCostTradeoff()

    /**
     * The value to switch on or off to force the output to match the provided labels from users.
     *
     * If the value is `True` , the `find matches` transform forces the output to match the provided
     * labels. The results override the normal conflation results. If the value is `False` , the `find
     * matches` transform does not ensure all the labels provided are respected, and the results rely
     * on the trained model.
     *
     * Note that setting this value to true may increase the conflation execution time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-findmatchesparameters.html#cfn-glue-mltransform-findmatchesparameters-enforceprovidedlabels)
     */
    public fun enforceProvidedLabels(): Any? = unwrap(this).getEnforceProvidedLabels()

    /**
     * The value selected when tuning your transform for a balance between precision and recall.
     *
     * A value of 0.5 means no preference; a value of 1.0 means a bias purely for precision, and a
     * value of 0.0 means a bias for recall. Because this is a tradeoff, choosing values close to 1.0
     * means very low recall, and choosing values close to 0.0 results in very low precision.
     *
     * The precision metric indicates how often your model is correct when it predicts a match.
     *
     * The recall metric indicates that for an actual match, how often your model predicts the
     * match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-findmatchesparameters.html#cfn-glue-mltransform-findmatchesparameters-precisionrecalltradeoff)
     */
    public fun precisionRecallTradeoff(): Number? = unwrap(this).getPrecisionRecallTradeoff()

    /**
     * The name of a column that uniquely identifies rows in the source table.
     *
     * Used to help identify matching records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-findmatchesparameters.html#cfn-glue-mltransform-findmatchesparameters-primarykeycolumnname)
     */
    public fun primaryKeyColumnName(): String

    /**
     * A builder for [FindMatchesParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accuracyCostTradeoff The value that is selected when tuning your transform for a
       * balance between accuracy and cost.
       * A value of 0.5 means that the system balances accuracy and cost concerns. A value of 1.0
       * means a bias purely for accuracy, which typically results in a higher cost, sometimes
       * substantially higher. A value of 0.0 means a bias purely for cost, which results in a less
       * accurate `FindMatches` transform, sometimes with unacceptable accuracy.
       *
       * Accuracy measures how well the transform finds true positives and true negatives.
       * Increasing accuracy requires more machine resources and cost. But it also results in increased
       * recall.
       *
       * Cost measures how many compute resources, and thus money, are consumed to run the
       * transform.
       */
      public fun accuracyCostTradeoff(accuracyCostTradeoff: Number)

      /**
       * @param enforceProvidedLabels The value to switch on or off to force the output to match the
       * provided labels from users.
       * If the value is `True` , the `find matches` transform forces the output to match the
       * provided labels. The results override the normal conflation results. If the value is `False` ,
       * the `find matches` transform does not ensure all the labels provided are respected, and the
       * results rely on the trained model.
       *
       * Note that setting this value to true may increase the conflation execution time.
       */
      public fun enforceProvidedLabels(enforceProvidedLabels: Boolean)

      /**
       * @param enforceProvidedLabels The value to switch on or off to force the output to match the
       * provided labels from users.
       * If the value is `True` , the `find matches` transform forces the output to match the
       * provided labels. The results override the normal conflation results. If the value is `False` ,
       * the `find matches` transform does not ensure all the labels provided are respected, and the
       * results rely on the trained model.
       *
       * Note that setting this value to true may increase the conflation execution time.
       */
      public fun enforceProvidedLabels(enforceProvidedLabels: IResolvable)

      /**
       * @param precisionRecallTradeoff The value selected when tuning your transform for a balance
       * between precision and recall.
       * A value of 0.5 means no preference; a value of 1.0 means a bias purely for precision, and a
       * value of 0.0 means a bias for recall. Because this is a tradeoff, choosing values close to 1.0
       * means very low recall, and choosing values close to 0.0 results in very low precision.
       *
       * The precision metric indicates how often your model is correct when it predicts a match.
       *
       * The recall metric indicates that for an actual match, how often your model predicts the
       * match.
       */
      public fun precisionRecallTradeoff(precisionRecallTradeoff: Number)

      /**
       * @param primaryKeyColumnName The name of a column that uniquely identifies rows in the
       * source table. 
       * Used to help identify matching records.
       */
      public fun primaryKeyColumnName(primaryKeyColumnName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty.builder()

      /**
       * @param accuracyCostTradeoff The value that is selected when tuning your transform for a
       * balance between accuracy and cost.
       * A value of 0.5 means that the system balances accuracy and cost concerns. A value of 1.0
       * means a bias purely for accuracy, which typically results in a higher cost, sometimes
       * substantially higher. A value of 0.0 means a bias purely for cost, which results in a less
       * accurate `FindMatches` transform, sometimes with unacceptable accuracy.
       *
       * Accuracy measures how well the transform finds true positives and true negatives.
       * Increasing accuracy requires more machine resources and cost. But it also results in increased
       * recall.
       *
       * Cost measures how many compute resources, and thus money, are consumed to run the
       * transform.
       */
      override fun accuracyCostTradeoff(accuracyCostTradeoff: Number) {
        cdkBuilder.accuracyCostTradeoff(accuracyCostTradeoff)
      }

      /**
       * @param enforceProvidedLabels The value to switch on or off to force the output to match the
       * provided labels from users.
       * If the value is `True` , the `find matches` transform forces the output to match the
       * provided labels. The results override the normal conflation results. If the value is `False` ,
       * the `find matches` transform does not ensure all the labels provided are respected, and the
       * results rely on the trained model.
       *
       * Note that setting this value to true may increase the conflation execution time.
       */
      override fun enforceProvidedLabels(enforceProvidedLabels: Boolean) {
        cdkBuilder.enforceProvidedLabels(enforceProvidedLabels)
      }

      /**
       * @param enforceProvidedLabels The value to switch on or off to force the output to match the
       * provided labels from users.
       * If the value is `True` , the `find matches` transform forces the output to match the
       * provided labels. The results override the normal conflation results. If the value is `False` ,
       * the `find matches` transform does not ensure all the labels provided are respected, and the
       * results rely on the trained model.
       *
       * Note that setting this value to true may increase the conflation execution time.
       */
      override fun enforceProvidedLabels(enforceProvidedLabels: IResolvable) {
        cdkBuilder.enforceProvidedLabels(enforceProvidedLabels.let(IResolvable::unwrap))
      }

      /**
       * @param precisionRecallTradeoff The value selected when tuning your transform for a balance
       * between precision and recall.
       * A value of 0.5 means no preference; a value of 1.0 means a bias purely for precision, and a
       * value of 0.0 means a bias for recall. Because this is a tradeoff, choosing values close to 1.0
       * means very low recall, and choosing values close to 0.0 results in very low precision.
       *
       * The precision metric indicates how often your model is correct when it predicts a match.
       *
       * The recall metric indicates that for an actual match, how often your model predicts the
       * match.
       */
      override fun precisionRecallTradeoff(precisionRecallTradeoff: Number) {
        cdkBuilder.precisionRecallTradeoff(precisionRecallTradeoff)
      }

      /**
       * @param primaryKeyColumnName The name of a column that uniquely identifies rows in the
       * source table. 
       * Used to help identify matching records.
       */
      override fun primaryKeyColumnName(primaryKeyColumnName: String) {
        cdkBuilder.primaryKeyColumnName(primaryKeyColumnName)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty,
    ) : CdkObject(cdkObject), FindMatchesParametersProperty {
      /**
       * The value that is selected when tuning your transform for a balance between accuracy and
       * cost.
       *
       * A value of 0.5 means that the system balances accuracy and cost concerns. A value of 1.0
       * means a bias purely for accuracy, which typically results in a higher cost, sometimes
       * substantially higher. A value of 0.0 means a bias purely for cost, which results in a less
       * accurate `FindMatches` transform, sometimes with unacceptable accuracy.
       *
       * Accuracy measures how well the transform finds true positives and true negatives.
       * Increasing accuracy requires more machine resources and cost. But it also results in increased
       * recall.
       *
       * Cost measures how many compute resources, and thus money, are consumed to run the
       * transform.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-findmatchesparameters.html#cfn-glue-mltransform-findmatchesparameters-accuracycosttradeoff)
       */
      override fun accuracyCostTradeoff(): Number? = unwrap(this).getAccuracyCostTradeoff()

      /**
       * The value to switch on or off to force the output to match the provided labels from users.
       *
       * If the value is `True` , the `find matches` transform forces the output to match the
       * provided labels. The results override the normal conflation results. If the value is `False` ,
       * the `find matches` transform does not ensure all the labels provided are respected, and the
       * results rely on the trained model.
       *
       * Note that setting this value to true may increase the conflation execution time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-findmatchesparameters.html#cfn-glue-mltransform-findmatchesparameters-enforceprovidedlabels)
       */
      override fun enforceProvidedLabels(): Any? = unwrap(this).getEnforceProvidedLabels()

      /**
       * The value selected when tuning your transform for a balance between precision and recall.
       *
       * A value of 0.5 means no preference; a value of 1.0 means a bias purely for precision, and a
       * value of 0.0 means a bias for recall. Because this is a tradeoff, choosing values close to 1.0
       * means very low recall, and choosing values close to 0.0 results in very low precision.
       *
       * The precision metric indicates how often your model is correct when it predicts a match.
       *
       * The recall metric indicates that for an actual match, how often your model predicts the
       * match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-findmatchesparameters.html#cfn-glue-mltransform-findmatchesparameters-precisionrecalltradeoff)
       */
      override fun precisionRecallTradeoff(): Number? = unwrap(this).getPrecisionRecallTradeoff()

      /**
       * The name of a column that uniquely identifies rows in the source table.
       *
       * Used to help identify matching records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-findmatchesparameters.html#cfn-glue-mltransform-findmatchesparameters-primarykeycolumnname)
       */
      override fun primaryKeyColumnName(): String = unwrap(this).getPrimaryKeyColumnName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FindMatchesParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty):
          FindMatchesParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FindMatchesParametersProperty):
          software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty
    }
  }

  public interface TransformParametersProperty {
    /**
     * The parameters for the find matches algorithm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters)
     */
    public fun findMatchesParameters(): Any? = unwrap(this).getFindMatchesParameters()

    /**
     * The type of machine learning transform. `FIND_MATCHES` is the only option.
     *
     * For information about the types of machine learning transforms, see [Creating Machine
     * Learning
     * Transforms](https://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters.html#cfn-glue-mltransform-transformparameters-transformtype)
     */
    public fun transformType(): String

    /**
     * A builder for [TransformParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param findMatchesParameters The parameters for the find matches algorithm.
       */
      public fun findMatchesParameters(findMatchesParameters: IResolvable)

      /**
       * @param findMatchesParameters The parameters for the find matches algorithm.
       */
      public fun findMatchesParameters(findMatchesParameters: FindMatchesParametersProperty)

      /**
       * @param findMatchesParameters The parameters for the find matches algorithm.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("055271c8dbf190a4491fabcaa7f3f2e1c134b79e0e44bc9a47180b08b617f409")
      public
          fun findMatchesParameters(findMatchesParameters: FindMatchesParametersProperty.Builder.() -> Unit)

      /**
       * @param transformType The type of machine learning transform. `FIND_MATCHES` is the only
       * option. 
       * For information about the types of machine learning transforms, see [Creating Machine
       * Learning
       * Transforms](https://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html)
       * .
       */
      public fun transformType(transformType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty.Builder =
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty.builder()

      /**
       * @param findMatchesParameters The parameters for the find matches algorithm.
       */
      override fun findMatchesParameters(findMatchesParameters: IResolvable) {
        cdkBuilder.findMatchesParameters(findMatchesParameters.let(IResolvable::unwrap))
      }

      /**
       * @param findMatchesParameters The parameters for the find matches algorithm.
       */
      override fun findMatchesParameters(findMatchesParameters: FindMatchesParametersProperty) {
        cdkBuilder.findMatchesParameters(findMatchesParameters.let(FindMatchesParametersProperty::unwrap))
      }

      /**
       * @param findMatchesParameters The parameters for the find matches algorithm.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("055271c8dbf190a4491fabcaa7f3f2e1c134b79e0e44bc9a47180b08b617f409")
      override
          fun findMatchesParameters(findMatchesParameters: FindMatchesParametersProperty.Builder.() -> Unit):
          Unit = findMatchesParameters(FindMatchesParametersProperty(findMatchesParameters))

      /**
       * @param transformType The type of machine learning transform. `FIND_MATCHES` is the only
       * option. 
       * For information about the types of machine learning transforms, see [Creating Machine
       * Learning
       * Transforms](https://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html)
       * .
       */
      override fun transformType(transformType: String) {
        cdkBuilder.transformType(transformType)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty,
    ) : CdkObject(cdkObject), TransformParametersProperty {
      /**
       * The parameters for the find matches algorithm.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters.html#cfn-glue-mltransform-transformparameters-findmatchesparameters)
       */
      override fun findMatchesParameters(): Any? = unwrap(this).getFindMatchesParameters()

      /**
       * The type of machine learning transform. `FIND_MATCHES` is the only option.
       *
       * For information about the types of machine learning transforms, see [Creating Machine
       * Learning
       * Transforms](https://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters.html#cfn-glue-mltransform-transformparameters-transformtype)
       */
      override fun transformType(): String = unwrap(this).getTransformType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TransformParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty):
          TransformParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformParametersProperty):
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty
    }
  }

  public interface MLUserDataEncryptionProperty {
    /**
     * The ID for the customer-provided KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-mluserdataencryption.html#cfn-glue-mltransform-mluserdataencryption-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The encryption mode applied to user data. Valid values are:.
     *
     * * DISABLED: encryption is disabled.
     * * SSEKMS: use of server-side encryption with AWS Key Management Service (SSE-KMS) for user
     * data
     * stored in Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-mluserdataencryption.html#cfn-glue-mltransform-mluserdataencryption-mluserdataencryptionmode)
     */
    public fun mlUserDataEncryptionMode(): String

    /**
     * A builder for [MLUserDataEncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The ID for the customer-provided KMS key.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param mlUserDataEncryptionMode The encryption mode applied to user data. Valid values
       * are:. 
       * * DISABLED: encryption is disabled.
       * * SSEKMS: use of server-side encryption with AWS Key Management Service (SSE-KMS) for user
       * data
       * stored in Amazon S3.
       */
      public fun mlUserDataEncryptionMode(mlUserDataEncryptionMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty.Builder =
          software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty.builder()

      /**
       * @param kmsKeyId The ID for the customer-provided KMS key.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param mlUserDataEncryptionMode The encryption mode applied to user data. Valid values
       * are:. 
       * * DISABLED: encryption is disabled.
       * * SSEKMS: use of server-side encryption with AWS Key Management Service (SSE-KMS) for user
       * data
       * stored in Amazon S3.
       */
      override fun mlUserDataEncryptionMode(mlUserDataEncryptionMode: String) {
        cdkBuilder.mlUserDataEncryptionMode(mlUserDataEncryptionMode)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty,
    ) : CdkObject(cdkObject), MLUserDataEncryptionProperty {
      /**
       * The ID for the customer-provided KMS key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-mluserdataencryption.html#cfn-glue-mltransform-mluserdataencryption-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The encryption mode applied to user data. Valid values are:.
       *
       * * DISABLED: encryption is disabled.
       * * SSEKMS: use of server-side encryption with AWS Key Management Service (SSE-KMS) for user
       * data
       * stored in Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-mluserdataencryption.html#cfn-glue-mltransform-mluserdataencryption-mluserdataencryptionmode)
       */
      override fun mlUserDataEncryptionMode(): String = unwrap(this).getMlUserDataEncryptionMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MLUserDataEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty):
          MLUserDataEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MLUserDataEncryptionProperty):
          software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty
    }
  }

  public interface InputRecordTablesProperty {
    /**
     * The database and table in the AWS Glue Data Catalog that is used for input or output data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables.html#cfn-glue-mltransform-inputrecordtables-gluetables)
     */
    public fun glueTables(): Any? = unwrap(this).getGlueTables()

    /**
     * A builder for [InputRecordTablesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param glueTables The database and table in the AWS Glue Data Catalog that is used for
       * input or output data.
       */
      public fun glueTables(glueTables: IResolvable)

      /**
       * @param glueTables The database and table in the AWS Glue Data Catalog that is used for
       * input or output data.
       */
      public fun glueTables(glueTables: List<Any>)

      /**
       * @param glueTables The database and table in the AWS Glue Data Catalog that is used for
       * input or output data.
       */
      public fun glueTables(vararg glueTables: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty.Builder =
          software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty.builder()

      /**
       * @param glueTables The database and table in the AWS Glue Data Catalog that is used for
       * input or output data.
       */
      override fun glueTables(glueTables: IResolvable) {
        cdkBuilder.glueTables(glueTables.let(IResolvable::unwrap))
      }

      /**
       * @param glueTables The database and table in the AWS Glue Data Catalog that is used for
       * input or output data.
       */
      override fun glueTables(glueTables: List<Any>) {
        cdkBuilder.glueTables(glueTables)
      }

      /**
       * @param glueTables The database and table in the AWS Glue Data Catalog that is used for
       * input or output data.
       */
      override fun glueTables(vararg glueTables: Any): Unit = glueTables(glueTables.toList())

      public fun build():
          software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty,
    ) : CdkObject(cdkObject), InputRecordTablesProperty {
      /**
       * The database and table in the AWS Glue Data Catalog that is used for input or output data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables.html#cfn-glue-mltransform-inputrecordtables-gluetables)
       */
      override fun glueTables(): Any? = unwrap(this).getGlueTables()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputRecordTablesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty):
          InputRecordTablesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputRecordTablesProperty):
          software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty
    }
  }
}
