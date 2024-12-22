@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnParameter
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Unit

/**
 * Construction properties for `CfnParametersCode`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * CfnParameter cfnParameter;
 * Key key;
 * CfnParametersCodeProps cfnParametersCodeProps = CfnParametersCodeProps.builder()
 * .bucketNameParam(cfnParameter)
 * .objectKeyParam(cfnParameter)
 * .sourceKMSKey(key)
 * .build();
 * ```
 */
public interface CfnParametersCodeProps {
  /**
   * The CloudFormation parameter that represents the name of the S3 Bucket where the Lambda code
   * will be located in.
   *
   * Must be of type 'String'.
   *
   * Default: a new parameter will be created
   */
  public fun bucketNameParam(): CfnParameter? =
      unwrap(this).getBucketNameParam()?.let(CfnParameter::wrap)

  /**
   * The CloudFormation parameter that represents the path inside the S3 Bucket where the Lambda
   * code will be located at.
   *
   * Must be of type 'String'.
   *
   * Default: a new parameter will be created
   */
  public fun objectKeyParam(): CfnParameter? =
      unwrap(this).getObjectKeyParam()?.let(CfnParameter::wrap)

  /**
   * The ARN of the KMS key used to encrypt the handler code.
   *
   * Default: - the default server-side encryption with Amazon S3 managed keys(SSE-S3) key will be
   * used.
   */
  public fun sourceKMSKey(): IKey? = unwrap(this).getSourceKMSKey()?.let(IKey::wrap)

  /**
   * A builder for [CfnParametersCodeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucketNameParam The CloudFormation parameter that represents the name of the S3 Bucket
     * where the Lambda code will be located in.
     * Must be of type 'String'.
     */
    public fun bucketNameParam(bucketNameParam: CfnParameter)

    /**
     * @param objectKeyParam The CloudFormation parameter that represents the path inside the S3
     * Bucket where the Lambda code will be located at.
     * Must be of type 'String'.
     */
    public fun objectKeyParam(objectKeyParam: CfnParameter)

    /**
     * @param sourceKmsKey The ARN of the KMS key used to encrypt the handler code.
     */
    public fun sourceKmsKey(sourceKmsKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnParametersCodeProps.Builder =
        software.amazon.awscdk.services.lambda.CfnParametersCodeProps.builder()

    /**
     * @param bucketNameParam The CloudFormation parameter that represents the name of the S3 Bucket
     * where the Lambda code will be located in.
     * Must be of type 'String'.
     */
    override fun bucketNameParam(bucketNameParam: CfnParameter) {
      cdkBuilder.bucketNameParam(bucketNameParam.let(CfnParameter.Companion::unwrap))
    }

    /**
     * @param objectKeyParam The CloudFormation parameter that represents the path inside the S3
     * Bucket where the Lambda code will be located at.
     * Must be of type 'String'.
     */
    override fun objectKeyParam(objectKeyParam: CfnParameter) {
      cdkBuilder.objectKeyParam(objectKeyParam.let(CfnParameter.Companion::unwrap))
    }

    /**
     * @param sourceKmsKey The ARN of the KMS key used to encrypt the handler code.
     */
    override fun sourceKmsKey(sourceKmsKey: IKey) {
      cdkBuilder.sourceKmsKey(sourceKmsKey.let(IKey.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnParametersCodeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.CfnParametersCodeProps,
  ) : CdkObject(cdkObject),
      CfnParametersCodeProps {
    /**
     * The CloudFormation parameter that represents the name of the S3 Bucket where the Lambda code
     * will be located in.
     *
     * Must be of type 'String'.
     *
     * Default: a new parameter will be created
     */
    override fun bucketNameParam(): CfnParameter? =
        unwrap(this).getBucketNameParam()?.let(CfnParameter::wrap)

    /**
     * The CloudFormation parameter that represents the path inside the S3 Bucket where the Lambda
     * code will be located at.
     *
     * Must be of type 'String'.
     *
     * Default: a new parameter will be created
     */
    override fun objectKeyParam(): CfnParameter? =
        unwrap(this).getObjectKeyParam()?.let(CfnParameter::wrap)

    /**
     * The ARN of the KMS key used to encrypt the handler code.
     *
     * Default: - the default server-side encryption with Amazon S3 managed keys(SSE-S3) key will be
     * used.
     */
    override fun sourceKMSKey(): IKey? = unwrap(this).getSourceKMSKey()?.let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnParametersCodeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnParametersCodeProps):
        CfnParametersCodeProps = CdkObjectWrappers.wrap(cdkObject) as? CfnParametersCodeProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnParametersCodeProps):
        software.amazon.awscdk.services.lambda.CfnParametersCodeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CfnParametersCodeProps
  }
}
