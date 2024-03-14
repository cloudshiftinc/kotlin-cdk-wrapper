package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnDatasetGroupProps {
  /**
   * The domain of a Domain dataset group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-domain)
   */
  public fun domain(): String? = unwrap(this).getDomain()

  /**
   * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the
   * datasets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-kmskeyarn)
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The name of the dataset group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-name)
   */
  public fun name(): String

  /**
   * The ARN of the AWS Identity and Access Management (IAM) role that has permissions to access the
   * AWS Key Management Service (KMS) key.
   *
   * Supplying an IAM role is only valid when also specifying a KMS key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * A builder for [CfnDatasetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domain The domain of a Domain dataset group.
     */
    public fun domain(domain: String)

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key
     * used to encrypt the datasets.
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param name The name of the dataset group. 
     */
    public fun name(name: String)

    /**
     * @param roleArn The ARN of the AWS Identity and Access Management (IAM) role that has
     * permissions to access the AWS Key Management Service (KMS) key.
     * Supplying an IAM role is only valid when also specifying a KMS key.
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnDatasetGroupProps.Builder
        = software.amazon.awscdk.services.personalize.CfnDatasetGroupProps.builder()

    /**
     * @param domain The domain of a Domain dataset group.
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key
     * used to encrypt the datasets.
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param name The name of the dataset group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The ARN of the AWS Identity and Access Management (IAM) role that has
     * permissions to access the AWS Key Management Service (KMS) key.
     * Supplying an IAM role is only valid when also specifying a KMS key.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.personalize.CfnDatasetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.personalize.CfnDatasetGroupProps,
  ) : CdkObject(cdkObject), CfnDatasetGroupProps {
    /**
     * The domain of a Domain dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-domain)
     */
    override fun domain(): String? = unwrap(this).getDomain()

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt
     * the datasets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-kmskeyarn)
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The name of the dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The ARN of the AWS Identity and Access Management (IAM) role that has permissions to access
     * the AWS Key Management Service (KMS) key.
     *
     * Supplying an IAM role is only valid when also specifying a KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatasetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnDatasetGroupProps):
        CfnDatasetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetGroupProps):
        software.amazon.awscdk.services.personalize.CfnDatasetGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.personalize.CfnDatasetGroupProps
  }
}
