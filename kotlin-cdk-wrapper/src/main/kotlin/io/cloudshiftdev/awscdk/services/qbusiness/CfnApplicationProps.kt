@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .displayName("displayName")
 * // the properties below are optional
 * .attachmentsConfiguration(AttachmentsConfigurationProperty.builder()
 * .attachmentsControlMode("attachmentsControlMode")
 * .build())
 * .description("description")
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .identityCenterInstanceArn("identityCenterInstanceArn")
 * .roleArn("roleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html)
 */
public interface CfnApplicationProps {
  /**
   * Configuration information for the file upload during chat feature.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-attachmentsconfiguration)
   */
  public fun attachmentsConfiguration(): Any? = unwrap(this).getAttachmentsConfiguration()

  /**
   * A description for the Amazon Q Business application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the Amazon Q Business application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-displayname)
   */
  public fun displayName(): String

  /**
   * Provides the identifier of the AWS KMS key used to encrypt data indexed by Amazon Q Business.
   *
   * Amazon Q Business doesn't support asymmetric keys.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-encryptionconfiguration)
   */
  public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  /**
   * The Amazon Resource Name (ARN) of the IAM Identity Center instance you are either creating
   * for—or connecting to—your Amazon Q Business application.
   *
   * *Required* : `Yes`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-identitycenterinstancearn)
   */
  public fun identityCenterInstanceArn(): String? = unwrap(this).getIdentityCenterInstanceArn()

  /**
   * The Amazon Resource Name (ARN) of an IAM role with permissions to access your Amazon CloudWatch
   * logs and metrics.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * A list of key-value pairs that identify or categorize your Amazon Q Business application.
   *
   * You can also use tags to help control access to the application. Tag keys and values can
   * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attachmentsConfiguration Configuration information for the file upload during chat
     * feature.
     */
    public fun attachmentsConfiguration(attachmentsConfiguration: IResolvable)

    /**
     * @param attachmentsConfiguration Configuration information for the file upload during chat
     * feature.
     */
    public
        fun attachmentsConfiguration(attachmentsConfiguration: CfnApplication.AttachmentsConfigurationProperty)

    /**
     * @param attachmentsConfiguration Configuration information for the file upload during chat
     * feature.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("206d28644c637f9d78f7b48a9b94de71e3e2b727a54dd6b2d2d057681e1d4fe0")
    public
        fun attachmentsConfiguration(attachmentsConfiguration: CfnApplication.AttachmentsConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description A description for the Amazon Q Business application.
     */
    public fun description(description: String)

    /**
     * @param displayName The name of the Amazon Q Business application. 
     */
    public fun displayName(displayName: String)

    /**
     * @param encryptionConfiguration Provides the identifier of the AWS KMS key used to encrypt
     * data indexed by Amazon Q Business.
     * Amazon Q Business doesn't support asymmetric keys.
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * @param encryptionConfiguration Provides the identifier of the AWS KMS key used to encrypt
     * data indexed by Amazon Q Business.
     * Amazon Q Business doesn't support asymmetric keys.
     */
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnApplication.EncryptionConfigurationProperty)

    /**
     * @param encryptionConfiguration Provides the identifier of the AWS KMS key used to encrypt
     * data indexed by Amazon Q Business.
     * Amazon Q Business doesn't support asymmetric keys.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b53ead9a73b157753b7e74f043d3903dc4a8b26637b2a364eb7ef782346cdc53")
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnApplication.EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param identityCenterInstanceArn The Amazon Resource Name (ARN) of the IAM Identity Center
     * instance you are either creating for—or connecting to—your Amazon Q Business application.
     * *Required* : `Yes`
     */
    public fun identityCenterInstanceArn(identityCenterInstanceArn: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role with permissions to access your
     * Amazon CloudWatch logs and metrics.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business
     * application.
     * You can also use tags to help control access to the application. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business
     * application.
     * You can also use tags to help control access to the application. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.qbusiness.CfnApplicationProps.builder()

    /**
     * @param attachmentsConfiguration Configuration information for the file upload during chat
     * feature.
     */
    override fun attachmentsConfiguration(attachmentsConfiguration: IResolvable) {
      cdkBuilder.attachmentsConfiguration(attachmentsConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param attachmentsConfiguration Configuration information for the file upload during chat
     * feature.
     */
    override
        fun attachmentsConfiguration(attachmentsConfiguration: CfnApplication.AttachmentsConfigurationProperty) {
      cdkBuilder.attachmentsConfiguration(attachmentsConfiguration.let(CfnApplication.AttachmentsConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param attachmentsConfiguration Configuration information for the file upload during chat
     * feature.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("206d28644c637f9d78f7b48a9b94de71e3e2b727a54dd6b2d2d057681e1d4fe0")
    override
        fun attachmentsConfiguration(attachmentsConfiguration: CfnApplication.AttachmentsConfigurationProperty.Builder.() -> Unit):
        Unit =
        attachmentsConfiguration(CfnApplication.AttachmentsConfigurationProperty(attachmentsConfiguration))

    /**
     * @param description A description for the Amazon Q Business application.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The name of the Amazon Q Business application. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param encryptionConfiguration Provides the identifier of the AWS KMS key used to encrypt
     * data indexed by Amazon Q Business.
     * Amazon Q Business doesn't support asymmetric keys.
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param encryptionConfiguration Provides the identifier of the AWS KMS key used to encrypt
     * data indexed by Amazon Q Business.
     * Amazon Q Business doesn't support asymmetric keys.
     */
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnApplication.EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(CfnApplication.EncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param encryptionConfiguration Provides the identifier of the AWS KMS key used to encrypt
     * data indexed by Amazon Q Business.
     * Amazon Q Business doesn't support asymmetric keys.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b53ead9a73b157753b7e74f043d3903dc4a8b26637b2a364eb7ef782346cdc53")
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnApplication.EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        encryptionConfiguration(CfnApplication.EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * @param identityCenterInstanceArn The Amazon Resource Name (ARN) of the IAM Identity Center
     * instance you are either creating for—or connecting to—your Amazon Q Business application.
     * *Required* : `Yes`
     */
    override fun identityCenterInstanceArn(identityCenterInstanceArn: String) {
      cdkBuilder.identityCenterInstanceArn(identityCenterInstanceArn)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role with permissions to access your
     * Amazon CloudWatch logs and metrics.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business
     * application.
     * You can also use tags to help control access to the application. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business
     * application.
     * You can also use tags to help control access to the application. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.qbusiness.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    /**
     * Configuration information for the file upload during chat feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-attachmentsconfiguration)
     */
    override fun attachmentsConfiguration(): Any? = unwrap(this).getAttachmentsConfiguration()

    /**
     * A description for the Amazon Q Business application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the Amazon Q Business application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * Provides the identifier of the AWS KMS key used to encrypt data indexed by Amazon Q Business.
     *
     * Amazon Q Business doesn't support asymmetric keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-encryptionconfiguration)
     */
    override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    /**
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance you are either creating
     * for—or connecting to—your Amazon Q Business application.
     *
     * *Required* : `Yes`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-identitycenterinstancearn)
     */
    override fun identityCenterInstanceArn(): String? = unwrap(this).getIdentityCenterInstanceArn()

    /**
     * The Amazon Resource Name (ARN) of an IAM role with permissions to access your Amazon
     * CloudWatch logs and metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * A list of key-value pairs that identify or categorize your Amazon Q Business application.
     *
     * You can also use tags to help control access to the application. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnApplicationProps):
        CfnApplicationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnApplicationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.qbusiness.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.qbusiness.CfnApplicationProps
  }
}
