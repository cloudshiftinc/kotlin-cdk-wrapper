@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCertificateProvider`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnCertificateProviderProps cfnCertificateProviderProps = CfnCertificateProviderProps.builder()
 * .accountDefaultForOperations(List.of("accountDefaultForOperations"))
 * .lambdaFunctionArn("lambdaFunctionArn")
 * // the properties below are optional
 * .certificateProviderName("certificateProviderName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html)
 */
public interface CfnCertificateProviderProps {
  /**
   * A list of the operations that the certificate provider will use to generate certificates.
   *
   * Valid value: `CreateCertificateFromCsr` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-accountdefaultforoperations)
   */
  public fun accountDefaultForOperations(): List<String>

  /**
   * The name of the certificate provider.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-certificateprovidername)
   */
  public fun certificateProviderName(): String? = unwrap(this).getCertificateProviderName()

  /**
   * The ARN of the Lambda function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-lambdafunctionarn)
   */
  public fun lambdaFunctionArn(): String

  /**
   * Metadata that can be used to manage the certificate provider.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCertificateProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountDefaultForOperations A list of the operations that the certificate provider
     * will use to generate certificates. 
     * Valid value: `CreateCertificateFromCsr` .
     */
    public fun accountDefaultForOperations(accountDefaultForOperations: List<String>)

    /**
     * @param accountDefaultForOperations A list of the operations that the certificate provider
     * will use to generate certificates. 
     * Valid value: `CreateCertificateFromCsr` .
     */
    public fun accountDefaultForOperations(vararg accountDefaultForOperations: String)

    /**
     * @param certificateProviderName The name of the certificate provider.
     */
    public fun certificateProviderName(certificateProviderName: String)

    /**
     * @param lambdaFunctionArn The ARN of the Lambda function. 
     */
    public fun lambdaFunctionArn(lambdaFunctionArn: String)

    /**
     * @param tags Metadata that can be used to manage the certificate provider.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that can be used to manage the certificate provider.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCertificateProviderProps.Builder
        = software.amazon.awscdk.services.iot.CfnCertificateProviderProps.builder()

    /**
     * @param accountDefaultForOperations A list of the operations that the certificate provider
     * will use to generate certificates. 
     * Valid value: `CreateCertificateFromCsr` .
     */
    override fun accountDefaultForOperations(accountDefaultForOperations: List<String>) {
      cdkBuilder.accountDefaultForOperations(accountDefaultForOperations)
    }

    /**
     * @param accountDefaultForOperations A list of the operations that the certificate provider
     * will use to generate certificates. 
     * Valid value: `CreateCertificateFromCsr` .
     */
    override fun accountDefaultForOperations(vararg accountDefaultForOperations: String): Unit =
        accountDefaultForOperations(accountDefaultForOperations.toList())

    /**
     * @param certificateProviderName The name of the certificate provider.
     */
    override fun certificateProviderName(certificateProviderName: String) {
      cdkBuilder.certificateProviderName(certificateProviderName)
    }

    /**
     * @param lambdaFunctionArn The ARN of the Lambda function. 
     */
    override fun lambdaFunctionArn(lambdaFunctionArn: String) {
      cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
    }

    /**
     * @param tags Metadata that can be used to manage the certificate provider.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata that can be used to manage the certificate provider.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnCertificateProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnCertificateProviderProps,
  ) : CdkObject(cdkObject), CfnCertificateProviderProps {
    /**
     * A list of the operations that the certificate provider will use to generate certificates.
     *
     * Valid value: `CreateCertificateFromCsr` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-accountdefaultforoperations)
     */
    override fun accountDefaultForOperations(): List<String> =
        unwrap(this).getAccountDefaultForOperations()

    /**
     * The name of the certificate provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-certificateprovidername)
     */
    override fun certificateProviderName(): String? = unwrap(this).getCertificateProviderName()

    /**
     * The ARN of the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-lambdafunctionarn)
     */
    override fun lambdaFunctionArn(): String = unwrap(this).getLambdaFunctionArn()

    /**
     * Metadata that can be used to manage the certificate provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCertificateProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCertificateProviderProps):
        CfnCertificateProviderProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnCertificateProviderProps

    internal fun unwrap(wrapped: CfnCertificateProviderProps):
        software.amazon.awscdk.services.iot.CfnCertificateProviderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnCertificateProviderProps
  }
}
