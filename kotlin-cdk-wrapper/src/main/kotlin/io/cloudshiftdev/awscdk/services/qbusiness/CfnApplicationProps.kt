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
 * .autoSubscriptionConfiguration(AutoSubscriptionConfigurationProperty.builder()
 * .autoSubscribe("autoSubscribe")
 * // the properties below are optional
 * .defaultSubscriptionType("defaultSubscriptionType")
 * .build())
 * .clientIdsForOidc(List.of("clientIdsForOidc"))
 * .description("description")
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .iamIdentityProviderArn("iamIdentityProviderArn")
 * .identityCenterInstanceArn("identityCenterInstanceArn")
 * .identityType("identityType")
 * .personalizationConfiguration(PersonalizationConfigurationProperty.builder()
 * .personalizationControlMode("personalizationControlMode")
 * .build())
 * .qAppsConfiguration(QAppsConfigurationProperty.builder()
 * .qAppsControlMode("qAppsControlMode")
 * .build())
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
   * Subscription configuration information for an Amazon Q Business application using IAM identity
   * federation for user management.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-autosubscriptionconfiguration)
   */
  public fun autoSubscriptionConfiguration(): Any? = unwrap(this).getAutoSubscriptionConfiguration()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-clientidsforoidc)
   */
  public fun clientIdsForOidc(): List<String> = unwrap(this).getClientIdsForOidc() ?: emptyList()

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
   * The Amazon Resource Name (ARN) of an identity provider being used by an Amazon Q Business
   * application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-iamidentityproviderarn)
   */
  public fun iamIdentityProviderArn(): String? = unwrap(this).getIamIdentityProviderArn()

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
   * The authentication type being used by a Amazon Q Business application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-identitytype)
   */
  public fun identityType(): String? = unwrap(this).getIdentityType()

  /**
   * Configuration information about chat response personalization.
   *
   * For more information, see [Personalizing chat
   * responses](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/personalizing-chat-responses.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-personalizationconfiguration)
   */
  public fun personalizationConfiguration(): Any? = unwrap(this).getPersonalizationConfiguration()

  /**
   * Configuration information about Amazon Q Apps.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-qappsconfiguration)
   */
  public fun qAppsConfiguration(): Any? = unwrap(this).getQAppsConfiguration()

  /**
   * The Amazon Resource Name (ARN) of an IAM role with permissions to access your Amazon CloudWatch
   * logs and metrics.
   *
   * If this property is not specified, Amazon Q Business will create a [service linked role
   * (SLR)](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/using-service-linked-roles.html#slr-permissions)
   * and use it as the application's role.
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
     * @param autoSubscriptionConfiguration Subscription configuration information for an Amazon Q
     * Business application using IAM identity federation for user management.
     */
    public fun autoSubscriptionConfiguration(autoSubscriptionConfiguration: IResolvable)

    /**
     * @param autoSubscriptionConfiguration Subscription configuration information for an Amazon Q
     * Business application using IAM identity federation for user management.
     */
    public
        fun autoSubscriptionConfiguration(autoSubscriptionConfiguration: CfnApplication.AutoSubscriptionConfigurationProperty)

    /**
     * @param autoSubscriptionConfiguration Subscription configuration information for an Amazon Q
     * Business application using IAM identity federation for user management.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b4b03e43a5c9a22aab39b9c8d3b9522ab56673c8ab94536da1dff6a8e022107")
    public
        fun autoSubscriptionConfiguration(autoSubscriptionConfiguration: CfnApplication.AutoSubscriptionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param clientIdsForOidc the value to be set.
     */
    public fun clientIdsForOidc(clientIdsForOidc: List<String>)

    /**
     * @param clientIdsForOidc the value to be set.
     */
    public fun clientIdsForOidc(vararg clientIdsForOidc: String)

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
     * @param iamIdentityProviderArn The Amazon Resource Name (ARN) of an identity provider being
     * used by an Amazon Q Business application.
     */
    public fun iamIdentityProviderArn(iamIdentityProviderArn: String)

    /**
     * @param identityCenterInstanceArn The Amazon Resource Name (ARN) of the IAM Identity Center
     * instance you are either creating for—or connecting to—your Amazon Q Business application.
     * *Required* : `Yes`
     */
    public fun identityCenterInstanceArn(identityCenterInstanceArn: String)

    /**
     * @param identityType The authentication type being used by a Amazon Q Business application.
     */
    public fun identityType(identityType: String)

    /**
     * @param personalizationConfiguration Configuration information about chat response
     * personalization.
     * For more information, see [Personalizing chat
     * responses](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/personalizing-chat-responses.html)
     * .
     */
    public fun personalizationConfiguration(personalizationConfiguration: IResolvable)

    /**
     * @param personalizationConfiguration Configuration information about chat response
     * personalization.
     * For more information, see [Personalizing chat
     * responses](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/personalizing-chat-responses.html)
     * .
     */
    public
        fun personalizationConfiguration(personalizationConfiguration: CfnApplication.PersonalizationConfigurationProperty)

    /**
     * @param personalizationConfiguration Configuration information about chat response
     * personalization.
     * For more information, see [Personalizing chat
     * responses](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/personalizing-chat-responses.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fe9f491f8046c630f861de4ae4f59762c0e99118e612ddbc3fba395f7b668f9")
    public
        fun personalizationConfiguration(personalizationConfiguration: CfnApplication.PersonalizationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param qAppsConfiguration Configuration information about Amazon Q Apps.
     */
    public fun qAppsConfiguration(qAppsConfiguration: IResolvable)

    /**
     * @param qAppsConfiguration Configuration information about Amazon Q Apps.
     */
    public fun qAppsConfiguration(qAppsConfiguration: CfnApplication.QAppsConfigurationProperty)

    /**
     * @param qAppsConfiguration Configuration information about Amazon Q Apps.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0f26f3a798119a59262229a82de5e820aafba5cc143caa174e523a1fe90eebd6")
    public
        fun qAppsConfiguration(qAppsConfiguration: CfnApplication.QAppsConfigurationProperty.Builder.() -> Unit)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role with permissions to access your
     * Amazon CloudWatch logs and metrics.
     * If this property is not specified, Amazon Q Business will create a [service linked role
     * (SLR)](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/using-service-linked-roles.html#slr-permissions)
     * and use it as the application's role.
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
     * @param autoSubscriptionConfiguration Subscription configuration information for an Amazon Q
     * Business application using IAM identity federation for user management.
     */
    override fun autoSubscriptionConfiguration(autoSubscriptionConfiguration: IResolvable) {
      cdkBuilder.autoSubscriptionConfiguration(autoSubscriptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param autoSubscriptionConfiguration Subscription configuration information for an Amazon Q
     * Business application using IAM identity federation for user management.
     */
    override
        fun autoSubscriptionConfiguration(autoSubscriptionConfiguration: CfnApplication.AutoSubscriptionConfigurationProperty) {
      cdkBuilder.autoSubscriptionConfiguration(autoSubscriptionConfiguration.let(CfnApplication.AutoSubscriptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param autoSubscriptionConfiguration Subscription configuration information for an Amazon Q
     * Business application using IAM identity federation for user management.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b4b03e43a5c9a22aab39b9c8d3b9522ab56673c8ab94536da1dff6a8e022107")
    override
        fun autoSubscriptionConfiguration(autoSubscriptionConfiguration: CfnApplication.AutoSubscriptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        autoSubscriptionConfiguration(CfnApplication.AutoSubscriptionConfigurationProperty(autoSubscriptionConfiguration))

    /**
     * @param clientIdsForOidc the value to be set.
     */
    override fun clientIdsForOidc(clientIdsForOidc: List<String>) {
      cdkBuilder.clientIdsForOidc(clientIdsForOidc)
    }

    /**
     * @param clientIdsForOidc the value to be set.
     */
    override fun clientIdsForOidc(vararg clientIdsForOidc: String): Unit =
        clientIdsForOidc(clientIdsForOidc.toList())

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
     * @param iamIdentityProviderArn The Amazon Resource Name (ARN) of an identity provider being
     * used by an Amazon Q Business application.
     */
    override fun iamIdentityProviderArn(iamIdentityProviderArn: String) {
      cdkBuilder.iamIdentityProviderArn(iamIdentityProviderArn)
    }

    /**
     * @param identityCenterInstanceArn The Amazon Resource Name (ARN) of the IAM Identity Center
     * instance you are either creating for—or connecting to—your Amazon Q Business application.
     * *Required* : `Yes`
     */
    override fun identityCenterInstanceArn(identityCenterInstanceArn: String) {
      cdkBuilder.identityCenterInstanceArn(identityCenterInstanceArn)
    }

    /**
     * @param identityType The authentication type being used by a Amazon Q Business application.
     */
    override fun identityType(identityType: String) {
      cdkBuilder.identityType(identityType)
    }

    /**
     * @param personalizationConfiguration Configuration information about chat response
     * personalization.
     * For more information, see [Personalizing chat
     * responses](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/personalizing-chat-responses.html)
     * .
     */
    override fun personalizationConfiguration(personalizationConfiguration: IResolvable) {
      cdkBuilder.personalizationConfiguration(personalizationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param personalizationConfiguration Configuration information about chat response
     * personalization.
     * For more information, see [Personalizing chat
     * responses](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/personalizing-chat-responses.html)
     * .
     */
    override
        fun personalizationConfiguration(personalizationConfiguration: CfnApplication.PersonalizationConfigurationProperty) {
      cdkBuilder.personalizationConfiguration(personalizationConfiguration.let(CfnApplication.PersonalizationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param personalizationConfiguration Configuration information about chat response
     * personalization.
     * For more information, see [Personalizing chat
     * responses](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/personalizing-chat-responses.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fe9f491f8046c630f861de4ae4f59762c0e99118e612ddbc3fba395f7b668f9")
    override
        fun personalizationConfiguration(personalizationConfiguration: CfnApplication.PersonalizationConfigurationProperty.Builder.() -> Unit):
        Unit =
        personalizationConfiguration(CfnApplication.PersonalizationConfigurationProperty(personalizationConfiguration))

    /**
     * @param qAppsConfiguration Configuration information about Amazon Q Apps.
     */
    override fun qAppsConfiguration(qAppsConfiguration: IResolvable) {
      cdkBuilder.qAppsConfiguration(qAppsConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param qAppsConfiguration Configuration information about Amazon Q Apps.
     */
    override fun qAppsConfiguration(qAppsConfiguration: CfnApplication.QAppsConfigurationProperty) {
      cdkBuilder.qAppsConfiguration(qAppsConfiguration.let(CfnApplication.QAppsConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param qAppsConfiguration Configuration information about Amazon Q Apps.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0f26f3a798119a59262229a82de5e820aafba5cc143caa174e523a1fe90eebd6")
    override
        fun qAppsConfiguration(qAppsConfiguration: CfnApplication.QAppsConfigurationProperty.Builder.() -> Unit):
        Unit = qAppsConfiguration(CfnApplication.QAppsConfigurationProperty(qAppsConfiguration))

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role with permissions to access your
     * Amazon CloudWatch logs and metrics.
     * If this property is not specified, Amazon Q Business will create a [service linked role
     * (SLR)](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/using-service-linked-roles.html#slr-permissions)
     * and use it as the application's role.
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
  ) : CdkObject(cdkObject),
      CfnApplicationProps {
    /**
     * Configuration information for the file upload during chat feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-attachmentsconfiguration)
     */
    override fun attachmentsConfiguration(): Any? = unwrap(this).getAttachmentsConfiguration()

    /**
     * Subscription configuration information for an Amazon Q Business application using IAM
     * identity federation for user management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-autosubscriptionconfiguration)
     */
    override fun autoSubscriptionConfiguration(): Any? =
        unwrap(this).getAutoSubscriptionConfiguration()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-clientidsforoidc)
     */
    override fun clientIdsForOidc(): List<String> = unwrap(this).getClientIdsForOidc() ?:
        emptyList()

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
     * The Amazon Resource Name (ARN) of an identity provider being used by an Amazon Q Business
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-iamidentityproviderarn)
     */
    override fun iamIdentityProviderArn(): String? = unwrap(this).getIamIdentityProviderArn()

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
     * The authentication type being used by a Amazon Q Business application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-identitytype)
     */
    override fun identityType(): String? = unwrap(this).getIdentityType()

    /**
     * Configuration information about chat response personalization.
     *
     * For more information, see [Personalizing chat
     * responses](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/personalizing-chat-responses.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-personalizationconfiguration)
     */
    override fun personalizationConfiguration(): Any? =
        unwrap(this).getPersonalizationConfiguration()

    /**
     * Configuration information about Amazon Q Apps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-qappsconfiguration)
     */
    override fun qAppsConfiguration(): Any? = unwrap(this).getQAppsConfiguration()

    /**
     * The Amazon Resource Name (ARN) of an IAM role with permissions to access your Amazon
     * CloudWatch logs and metrics.
     *
     * If this property is not specified, Amazon Q Business will create a [service linked role
     * (SLR)](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/using-service-linked-roles.html#slr-permissions)
     * and use it as the application's role.
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
