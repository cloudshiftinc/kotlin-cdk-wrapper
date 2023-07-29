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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnMLTransform
import software.constructs.Construct

/**
 * The AWS::Glue::MLTransform is an AWS Glue resource type that manages machine learning transforms.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object tags;
 * CfnMLTransform cfnMLTransform = CfnMLTransform.Builder.create(this, "MyCfnMLTransform")
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
@CdkDslMarker
public class CfnMLTransformDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMLTransform.Builder = CfnMLTransform.Builder.create(scope, id)

    /**
     * A user-defined, long-form description text for the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-description)
     *
     * @param description A user-defined, long-form description text for the machine learning
     *   transform.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * This value determines which version of AWS Glue this machine learning transform is compatible
     * with.
     *
     * Glue 1.0 is recommended for most customers. If the value is not set, the Glue compatibility
     * defaults to Glue 0.9. For more information, see
     * [AWS Glue Versions](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions)
     * in the developer guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-glueversion)
     *
     * @param glueVersion This value determines which version of AWS Glue this machine learning
     *   transform is compatible with.
     */
    public fun glueVersion(glueVersion: String) {
        cdkBuilder.glueVersion(glueVersion)
    }

    /**
     * A list of AWS Glue table definitions used by the transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-inputrecordtables)
     *
     * @param inputRecordTables A list of AWS Glue table definitions used by the transform.
     */
    public fun inputRecordTables(inputRecordTables: IResolvable) {
        cdkBuilder.inputRecordTables(inputRecordTables)
    }

    /**
     * A list of AWS Glue table definitions used by the transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-inputrecordtables)
     *
     * @param inputRecordTables A list of AWS Glue table definitions used by the transform.
     */
    public fun inputRecordTables(inputRecordTables: CfnMLTransform.InputRecordTablesProperty) {
        cdkBuilder.inputRecordTables(inputRecordTables)
    }

    /**
     * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this
     * transform.
     *
     * You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of
     * processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the [AWS Glue pricing page](https://docs.aws.amazon.com/glue/pricing/) .
     *
     * `MaxCapacity` is a mutually exclusive option with `NumberOfWorkers` and `WorkerType` .
     * * If either `NumberOfWorkers` or `WorkerType` is set, then `MaxCapacity` cannot be set.
     * * If `MaxCapacity` is set then neither `NumberOfWorkers` or `WorkerType` can be set.
     * * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
     * * `MaxCapacity` and `NumberOfWorkers` must both be at least 1.
     *
     * When the `WorkerType` field is set to a value other than `Standard` , the `MaxCapacity` field
     * is set automatically and becomes read-only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-maxcapacity)
     *
     * @param maxCapacity The number of AWS Glue data processing units (DPUs) that are allocated to
     *   task runs for this transform.
     */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * The maximum number of times to retry after an `MLTaskRun` of the machine learning transform
     * fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-maxretries)
     *
     * @param maxRetries The maximum number of times to retry after an `MLTaskRun` of the machine
     *   learning transform fails.
     */
    public fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
    }

    /**
     * A user-defined name for the machine learning transform. Names are required to be unique.
     * `Name` is optional:.
     * * If you supply `Name` , the stack cannot be repeatedly created.
     * * If `Name` is not provided, a randomly generated name will be used instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-name)
     *
     * @param name A user-defined name for the machine learning transform. Names are required to be
     *   unique. `Name` is optional:.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The number of workers of a defined `workerType` that are allocated when a task of the
     * transform runs.
     *
     * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-numberofworkers)
     *
     * @param numberOfWorkers The number of workers of a defined `workerType` that are allocated
     *   when a task of the transform runs.
     */
    public fun numberOfWorkers(numberOfWorkers: Number) {
        cdkBuilder.numberOfWorkers(numberOfWorkers)
    }

    /**
     * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
     *
     * The required permissions include both AWS Glue service role permissions to AWS Glue
     * resources, and Amazon S3 permissions required by the transform.
     * * This role needs AWS Glue service role permissions to allow access to resources in AWS Glue
     *   . See
     *   [Attach a Policy to IAM Users That Access AWS Glue](https://docs.aws.amazon.com/glue/latest/dg/attach-policy-iam-user.html)
     *   .
     * * This role needs permission to your Amazon Simple Storage Service (Amazon S3) sources,
     *   targets, temporary directory, scripts, and any libraries used by the task run for this
     *   transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-role)
     *
     * @param role The name or Amazon Resource Name (ARN) of the IAM role with the required
     *   permissions.
     */
    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    /**
     * The tags to use with this machine learning transform.
     *
     * You may use tags to limit access to the machine learning transform. For more information
     * about tags in AWS Glue , see
     * [AWS Tags in AWS Glue](https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html) in the
     * developer guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-tags)
     *
     * @param tags The tags to use with this machine learning transform.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * The tags to use with this machine learning transform.
     *
     * You may use tags to limit access to the machine learning transform. For more information
     * about tags in AWS Glue , see
     * [AWS Tags in AWS Glue](https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html) in the
     * developer guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-tags)
     *
     * @param tags The tags to use with this machine learning transform.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    /**
     * The timeout in minutes of the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-timeout)
     *
     * @param timeout The timeout in minutes of the machine learning transform.
     */
    public fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * The encryption-at-rest settings of the transform that apply to accessing user data.
     *
     * Machine learning transforms can access user data encrypted in Amazon S3 using KMS.
     *
     * Additionally, imported labels and trained transforms can now be encrypted using a customer
     * provided KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-transformencryption)
     *
     * @param transformEncryption The encryption-at-rest settings of the transform that apply to
     *   accessing user data.
     */
    public fun transformEncryption(transformEncryption: IResolvable) {
        cdkBuilder.transformEncryption(transformEncryption)
    }

    /**
     * The encryption-at-rest settings of the transform that apply to accessing user data.
     *
     * Machine learning transforms can access user data encrypted in Amazon S3 using KMS.
     *
     * Additionally, imported labels and trained transforms can now be encrypted using a customer
     * provided KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-transformencryption)
     *
     * @param transformEncryption The encryption-at-rest settings of the transform that apply to
     *   accessing user data.
     */
    public fun transformEncryption(
        transformEncryption: CfnMLTransform.TransformEncryptionProperty
    ) {
        cdkBuilder.transformEncryption(transformEncryption)
    }

    /**
     * The algorithm-specific parameters that are associated with the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-transformparameters)
     *
     * @param transformParameters The algorithm-specific parameters that are associated with the
     *   machine learning transform.
     */
    public fun transformParameters(transformParameters: IResolvable) {
        cdkBuilder.transformParameters(transformParameters)
    }

    /**
     * The algorithm-specific parameters that are associated with the machine learning transform.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-transformparameters)
     *
     * @param transformParameters The algorithm-specific parameters that are associated with the
     *   machine learning transform.
     */
    public fun transformParameters(
        transformParameters: CfnMLTransform.TransformParametersProperty
    ) {
        cdkBuilder.transformParameters(transformParameters)
    }

    /**
     * The type of predefined worker that is allocated when a task of this transform runs.
     *
     * Accepts a value of Standard, G.1X, or G.2X.
     * * For the `Standard` worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB
     *   disk, and 2 executors per worker.
     * * For the `G.1X` worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk,
     *   and 1 executor per worker.
     * * For the `G.2X` worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk,
     *   and 1 executor per worker.
     *
     * `MaxCapacity` is a mutually exclusive option with `NumberOfWorkers` and `WorkerType` .
     * * If either `NumberOfWorkers` or `WorkerType` is set, then `MaxCapacity` cannot be set.
     * * If `MaxCapacity` is set then neither `NumberOfWorkers` or `WorkerType` can be set.
     * * If `WorkerType` is set, then `NumberOfWorkers` is required (and vice versa).
     * * `MaxCapacity` and `NumberOfWorkers` must both be at least 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-mltransform.html#cfn-glue-mltransform-workertype)
     *
     * @param workerType The type of predefined worker that is allocated when a task of this
     *   transform runs.
     */
    public fun workerType(workerType: String) {
        cdkBuilder.workerType(workerType)
    }

    public fun build(): CfnMLTransform = cdkBuilder.build()
}
