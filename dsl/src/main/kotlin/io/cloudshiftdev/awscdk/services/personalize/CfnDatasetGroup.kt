package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDatasetGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.personalize.CfnDatasetGroup,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Name (ARN) of the dataset group.
   */
  public open fun attrDatasetGroupArn(): String = unwrap(this).getAttrDatasetGroupArn()

  /**
   * The domain of a Domain dataset group.
   */
  public open fun domain(): String? = unwrap(this).getDomain()

  /**
   * The domain of a Domain dataset group.
   */
  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the
   * datasets.
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the
   * datasets.
   */
  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  /**
   * The name of the dataset group.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the dataset group.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ARN of the AWS Identity and Access Management (IAM) role that has permissions to access the
   * AWS Key Management Service (KMS) key.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The ARN of the AWS Identity and Access Management (IAM) role that has permissions to access the
   * AWS Key Management Service (KMS) key.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.personalize.CfnDatasetGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The domain of a Domain dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-domain)
     * @param domain The domain of a Domain dataset group. 
     */
    public fun domain(domain: String)

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt
     * the datasets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key
     * used to encrypt the datasets. 
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * The name of the dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-name)
     * @param name The name of the dataset group. 
     */
    public fun name(name: String)

    /**
     * The ARN of the AWS Identity and Access Management (IAM) role that has permissions to access
     * the AWS Key Management Service (KMS) key.
     *
     * Supplying an IAM role is only valid when also specifying a KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-rolearn)
     * @param roleArn The ARN of the AWS Identity and Access Management (IAM) role that has
     * permissions to access the AWS Key Management Service (KMS) key. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnDatasetGroup.Builder =
        software.amazon.awscdk.services.personalize.CfnDatasetGroup.Builder.create(scope, id)

    /**
     * The domain of a Domain dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-domain)
     * @param domain The domain of a Domain dataset group. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt
     * the datasets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key
     * used to encrypt the datasets. 
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * The name of the dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-name)
     * @param name The name of the dataset group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ARN of the AWS Identity and Access Management (IAM) role that has permissions to access
     * the AWS Key Management Service (KMS) key.
     *
     * Supplying an IAM role is only valid when also specifying a KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-rolearn)
     * @param roleArn The ARN of the AWS Identity and Access Management (IAM) role that has
     * permissions to access the AWS Key Management Service (KMS) key. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.personalize.CfnDatasetGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDatasetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDatasetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnDatasetGroup):
        CfnDatasetGroup = CfnDatasetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetGroup):
        software.amazon.awscdk.services.personalize.CfnDatasetGroup = wrapped.cdkObject
  }
}
