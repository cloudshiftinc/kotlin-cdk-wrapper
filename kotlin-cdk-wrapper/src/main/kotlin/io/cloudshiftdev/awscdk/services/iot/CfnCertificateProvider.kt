@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a certificate provider.
 *
 * AWS IoT Core certificate provider lets you customize how to sign a certificate signing request
 * (CSR) in fleet provisioning. For more information, see [Self-managed certificate signing using AWS
 * IoT Core certificate
 * provider](https://docs.aws.amazon.com/iot/latest/developerguide/provisioning-cert-provider.html)
 * from the *AWS IoT Core Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnCertificateProvider cfnCertificateProvider = CfnCertificateProvider.Builder.create(this,
 * "MyCfnCertificateProvider")
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
public open class CfnCertificateProvider(
  cdkObject: software.amazon.awscdk.services.iot.CfnCertificateProvider,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCertificateProviderProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnCertificateProvider(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCertificateProviderProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCertificateProviderProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCertificateProviderProps(props)
  )

  /**
   * A list of the operations that the certificate provider will use to generate certificates.
   */
  public open fun accountDefaultForOperations(): List<String> =
      unwrap(this).getAccountDefaultForOperations()

  /**
   * A list of the operations that the certificate provider will use to generate certificates.
   */
  public open fun accountDefaultForOperations(`value`: List<String>) {
    unwrap(this).setAccountDefaultForOperations(`value`)
  }

  /**
   * A list of the operations that the certificate provider will use to generate certificates.
   */
  public open fun accountDefaultForOperations(vararg `value`: String): Unit =
      accountDefaultForOperations(`value`.toList())

  /**
   * Returns the Amazon Resource Name (ARN) for the certificate. For example:.
   *
   * `{ "Fn::GetAtt": ["MyCertificateProvider", "Arn"] }`
   *
   * A value similar to the following is returned:
   *
   * `arn:aws:iot:ap-southeast-2:123456789012:certprovider/my-certificate-provider`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The name of the certificate provider.
   */
  public open fun certificateProviderName(): String? = unwrap(this).getCertificateProviderName()

  /**
   * The name of the certificate provider.
   */
  public open fun certificateProviderName(`value`: String) {
    unwrap(this).setCertificateProviderName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ARN of the Lambda function.
   */
  public open fun lambdaFunctionArn(): String = unwrap(this).getLambdaFunctionArn()

  /**
   * The ARN of the Lambda function.
   */
  public open fun lambdaFunctionArn(`value`: String) {
    unwrap(this).setLambdaFunctionArn(`value`)
  }

  /**
   * Metadata that can be used to manage the certificate provider.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Metadata that can be used to manage the certificate provider.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata that can be used to manage the certificate provider.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnCertificateProvider].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of the operations that the certificate provider will use to generate certificates.
     *
     * Valid value: `CreateCertificateFromCsr` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-accountdefaultforoperations)
     * @param accountDefaultForOperations A list of the operations that the certificate provider
     * will use to generate certificates. 
     */
    public fun accountDefaultForOperations(accountDefaultForOperations: List<String>)

    /**
     * A list of the operations that the certificate provider will use to generate certificates.
     *
     * Valid value: `CreateCertificateFromCsr` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-accountdefaultforoperations)
     * @param accountDefaultForOperations A list of the operations that the certificate provider
     * will use to generate certificates. 
     */
    public fun accountDefaultForOperations(vararg accountDefaultForOperations: String)

    /**
     * The name of the certificate provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-certificateprovidername)
     * @param certificateProviderName The name of the certificate provider. 
     */
    public fun certificateProviderName(certificateProviderName: String)

    /**
     * The ARN of the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-lambdafunctionarn)
     * @param lambdaFunctionArn The ARN of the Lambda function. 
     */
    public fun lambdaFunctionArn(lambdaFunctionArn: String)

    /**
     * Metadata that can be used to manage the certificate provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-tags)
     * @param tags Metadata that can be used to manage the certificate provider. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that can be used to manage the certificate provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-tags)
     * @param tags Metadata that can be used to manage the certificate provider. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCertificateProvider.Builder =
        software.amazon.awscdk.services.iot.CfnCertificateProvider.Builder.create(scope, id)

    /**
     * A list of the operations that the certificate provider will use to generate certificates.
     *
     * Valid value: `CreateCertificateFromCsr` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-accountdefaultforoperations)
     * @param accountDefaultForOperations A list of the operations that the certificate provider
     * will use to generate certificates. 
     */
    override fun accountDefaultForOperations(accountDefaultForOperations: List<String>) {
      cdkBuilder.accountDefaultForOperations(accountDefaultForOperations)
    }

    /**
     * A list of the operations that the certificate provider will use to generate certificates.
     *
     * Valid value: `CreateCertificateFromCsr` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-accountdefaultforoperations)
     * @param accountDefaultForOperations A list of the operations that the certificate provider
     * will use to generate certificates. 
     */
    override fun accountDefaultForOperations(vararg accountDefaultForOperations: String): Unit =
        accountDefaultForOperations(accountDefaultForOperations.toList())

    /**
     * The name of the certificate provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-certificateprovidername)
     * @param certificateProviderName The name of the certificate provider. 
     */
    override fun certificateProviderName(certificateProviderName: String) {
      cdkBuilder.certificateProviderName(certificateProviderName)
    }

    /**
     * The ARN of the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-lambdafunctionarn)
     * @param lambdaFunctionArn The ARN of the Lambda function. 
     */
    override fun lambdaFunctionArn(lambdaFunctionArn: String) {
      cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
    }

    /**
     * Metadata that can be used to manage the certificate provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-tags)
     * @param tags Metadata that can be used to manage the certificate provider. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Metadata that can be used to manage the certificate provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-tags)
     * @param tags Metadata that can be used to manage the certificate provider. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnCertificateProvider =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnCertificateProvider.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCertificateProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCertificateProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCertificateProvider):
        CfnCertificateProvider = CfnCertificateProvider(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateProvider):
        software.amazon.awscdk.services.iot.CfnCertificateProvider = wrapped.cdkObject as
        software.amazon.awscdk.services.iot.CfnCertificateProvider
  }
}
