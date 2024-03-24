@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.finspace

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::FinSpace::Environment` resource represents an Amazon FinSpace environment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.finspace.*;
 * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
 * .name("name")
 * // the properties below are optional
 * .dataBundles(List.of("dataBundles"))
 * .description("description")
 * .federationMode("federationMode")
 * .federationParameters(FederationParametersProperty.builder()
 * .applicationCallBackUrl("applicationCallBackUrl")
 * .attributeMap(List.of(AttributeMapItemsProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .federationProviderName("federationProviderName")
 * .federationUrn("federationUrn")
 * .samlMetadataDocument("samlMetadataDocument")
 * .samlMetadataUrl("samlMetadataUrl")
 * .build())
 * .kmsKeyId("kmsKeyId")
 * .superuserParameters(SuperuserParametersProperty.builder()
 * .emailAddress("emailAddress")
 * .firstName("firstName")
 * .lastName("lastName")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html)
 */
public open class CfnEnvironment(
  cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentProps,
  ) :
      this(software.amazon.awscdk.services.finspace.CfnEnvironment(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnEnvironmentProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEnvironmentProps(props)
  )

  /**
   * The ID of the AWS account in which the FinSpace environment is created.
   */
  public open fun attrAwsAccountId(): String = unwrap(this).getAttrAwsAccountId()

  /**
   * The AWS account ID of the dedicated service account associated with your FinSpace environment.
   */
  public open fun attrDedicatedServiceAccountId(): String =
      unwrap(this).getAttrDedicatedServiceAccountId()

  /**
   * The Amazon Resource Name (ARN) of your FinSpace environment.
   */
  public open fun attrEnvironmentArn(): String = unwrap(this).getAttrEnvironmentArn()

  /**
   * The identifier of the FinSpace environment.
   */
  public open fun attrEnvironmentId(): String = unwrap(this).getAttrEnvironmentId()

  /**
   * The sign-in url for the web application of your FinSpace environment.
   */
  public open fun attrEnvironmentUrl(): String = unwrap(this).getAttrEnvironmentUrl()

  /**
   * The url of the integrated FinSpace notebook environment in your web application.
   */
  public open fun attrSageMakerStudioDomainUrl(): String =
      unwrap(this).getAttrSageMakerStudioDomainUrl()

  /**
   * The current status of creation of the FinSpace environment.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * (deprecated) ARNs of FinSpace Data Bundles to install.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun dataBundles(): List<String> = unwrap(this).getDataBundles() ?: emptyList()

  /**
   * (deprecated) ARNs of FinSpace Data Bundles to install.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun dataBundles(`value`: List<String>) {
    unwrap(this).setDataBundles(`value`)
  }

  /**
   * (deprecated) ARNs of FinSpace Data Bundles to install.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun dataBundles(vararg `value`: String): Unit = dataBundles(`value`.toList())

  /**
   * The description of the FinSpace environment.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the FinSpace environment.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The authentication mode for the environment.
   */
  public open fun federationMode(): String? = unwrap(this).getFederationMode()

  /**
   * The authentication mode for the environment.
   */
  public open fun federationMode(`value`: String) {
    unwrap(this).setFederationMode(`value`)
  }

  /**
   * Configuration information when authentication mode is FEDERATED.
   */
  public open fun federationParameters(): Any? = unwrap(this).getFederationParameters()

  /**
   * Configuration information when authentication mode is FEDERATED.
   */
  public open fun federationParameters(`value`: IResolvable) {
    unwrap(this).setFederationParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration information when authentication mode is FEDERATED.
   */
  public open fun federationParameters(`value`: FederationParametersProperty) {
    unwrap(this).setFederationParameters(`value`.let(FederationParametersProperty::unwrap))
  }

  /**
   * Configuration information when authentication mode is FEDERATED.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("12b626a58737f7c11275a88aaab0c643989ed1a92d1d630aef27ec8339e4e7ce")
  public open fun federationParameters(`value`: FederationParametersProperty.Builder.() -> Unit):
      Unit = federationParameters(FederationParametersProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The KMS key id used to encrypt in the FinSpace environment.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The KMS key id used to encrypt in the FinSpace environment.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The name of the FinSpace environment.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the FinSpace environment.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Configuration information for the superuser.
   */
  public open fun superuserParameters(): Any? = unwrap(this).getSuperuserParameters()

  /**
   * Configuration information for the superuser.
   */
  public open fun superuserParameters(`value`: IResolvable) {
    unwrap(this).setSuperuserParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration information for the superuser.
   */
  public open fun superuserParameters(`value`: SuperuserParametersProperty) {
    unwrap(this).setSuperuserParameters(`value`.let(SuperuserParametersProperty::unwrap))
  }

  /**
   * Configuration information for the superuser.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("130a9ed514447909c8271eb10fb11dbd2d00de39694e4f629bea34418e2a512f")
  public open fun superuserParameters(`value`: SuperuserParametersProperty.Builder.() -> Unit): Unit
      = superuserParameters(SuperuserParametersProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.finspace.CfnEnvironment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * (deprecated) ARNs of FinSpace Data Bundles to install.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-databundles)
     * @deprecated this property has been deprecated
     * @param dataBundles ARNs of FinSpace Data Bundles to install. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun dataBundles(dataBundles: List<String>)

    /**
     * (deprecated) ARNs of FinSpace Data Bundles to install.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-databundles)
     * @deprecated this property has been deprecated
     * @param dataBundles ARNs of FinSpace Data Bundles to install. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun dataBundles(vararg dataBundles: String)

    /**
     * The description of the FinSpace environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-description)
     * @param description The description of the FinSpace environment. 
     */
    public fun description(description: String)

    /**
     * The authentication mode for the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-federationmode)
     * @param federationMode The authentication mode for the environment. 
     */
    public fun federationMode(federationMode: String)

    /**
     * Configuration information when authentication mode is FEDERATED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-federationparameters)
     * @param federationParameters Configuration information when authentication mode is FEDERATED. 
     */
    public fun federationParameters(federationParameters: IResolvable)

    /**
     * Configuration information when authentication mode is FEDERATED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-federationparameters)
     * @param federationParameters Configuration information when authentication mode is FEDERATED. 
     */
    public fun federationParameters(federationParameters: FederationParametersProperty)

    /**
     * Configuration information when authentication mode is FEDERATED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-federationparameters)
     * @param federationParameters Configuration information when authentication mode is FEDERATED. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9df12da2f0c697b85c338698db8006b519ebdbe211ca2f952127f7ceff4496d0")
    public
        fun federationParameters(federationParameters: FederationParametersProperty.Builder.() -> Unit)

    /**
     * The KMS key id used to encrypt in the FinSpace environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-kmskeyid)
     * @param kmsKeyId The KMS key id used to encrypt in the FinSpace environment. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The name of the FinSpace environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-name)
     * @param name The name of the FinSpace environment. 
     */
    public fun name(name: String)

    /**
     * Configuration information for the superuser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-superuserparameters)
     * @param superuserParameters Configuration information for the superuser. 
     */
    public fun superuserParameters(superuserParameters: IResolvable)

    /**
     * Configuration information for the superuser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-superuserparameters)
     * @param superuserParameters Configuration information for the superuser. 
     */
    public fun superuserParameters(superuserParameters: SuperuserParametersProperty)

    /**
     * Configuration information for the superuser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-superuserparameters)
     * @param superuserParameters Configuration information for the superuser. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8539c50c6b8910ceea4521f816dc281fc996c5bab7195e03c37e5ef08360a309")
    public
        fun superuserParameters(superuserParameters: SuperuserParametersProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.finspace.CfnEnvironment.Builder =
        software.amazon.awscdk.services.finspace.CfnEnvironment.Builder.create(scope, id)

    /**
     * (deprecated) ARNs of FinSpace Data Bundles to install.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-databundles)
     * @deprecated this property has been deprecated
     * @param dataBundles ARNs of FinSpace Data Bundles to install. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun dataBundles(dataBundles: List<String>) {
      cdkBuilder.dataBundles(dataBundles)
    }

    /**
     * (deprecated) ARNs of FinSpace Data Bundles to install.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-databundles)
     * @deprecated this property has been deprecated
     * @param dataBundles ARNs of FinSpace Data Bundles to install. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun dataBundles(vararg dataBundles: String): Unit = dataBundles(dataBundles.toList())

    /**
     * The description of the FinSpace environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-description)
     * @param description The description of the FinSpace environment. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The authentication mode for the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-federationmode)
     * @param federationMode The authentication mode for the environment. 
     */
    override fun federationMode(federationMode: String) {
      cdkBuilder.federationMode(federationMode)
    }

    /**
     * Configuration information when authentication mode is FEDERATED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-federationparameters)
     * @param federationParameters Configuration information when authentication mode is FEDERATED. 
     */
    override fun federationParameters(federationParameters: IResolvable) {
      cdkBuilder.federationParameters(federationParameters.let(IResolvable::unwrap))
    }

    /**
     * Configuration information when authentication mode is FEDERATED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-federationparameters)
     * @param federationParameters Configuration information when authentication mode is FEDERATED. 
     */
    override fun federationParameters(federationParameters: FederationParametersProperty) {
      cdkBuilder.federationParameters(federationParameters.let(FederationParametersProperty::unwrap))
    }

    /**
     * Configuration information when authentication mode is FEDERATED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-federationparameters)
     * @param federationParameters Configuration information when authentication mode is FEDERATED. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9df12da2f0c697b85c338698db8006b519ebdbe211ca2f952127f7ceff4496d0")
    override
        fun federationParameters(federationParameters: FederationParametersProperty.Builder.() -> Unit):
        Unit = federationParameters(FederationParametersProperty(federationParameters))

    /**
     * The KMS key id used to encrypt in the FinSpace environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-kmskeyid)
     * @param kmsKeyId The KMS key id used to encrypt in the FinSpace environment. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The name of the FinSpace environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-name)
     * @param name The name of the FinSpace environment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Configuration information for the superuser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-superuserparameters)
     * @param superuserParameters Configuration information for the superuser. 
     */
    override fun superuserParameters(superuserParameters: IResolvable) {
      cdkBuilder.superuserParameters(superuserParameters.let(IResolvable::unwrap))
    }

    /**
     * Configuration information for the superuser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-superuserparameters)
     * @param superuserParameters Configuration information for the superuser. 
     */
    override fun superuserParameters(superuserParameters: SuperuserParametersProperty) {
      cdkBuilder.superuserParameters(superuserParameters.let(SuperuserParametersProperty::unwrap))
    }

    /**
     * Configuration information for the superuser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-superuserparameters)
     * @param superuserParameters Configuration information for the superuser. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8539c50c6b8910ceea4521f816dc281fc996c5bab7195e03c37e5ef08360a309")
    override
        fun superuserParameters(superuserParameters: SuperuserParametersProperty.Builder.() -> Unit):
        Unit = superuserParameters(SuperuserParametersProperty(superuserParameters))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.finspace.CfnEnvironment = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.finspace.CfnEnvironment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironment):
        CfnEnvironment = CfnEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironment):
        software.amazon.awscdk.services.finspace.CfnEnvironment = wrapped.cdkObject as
        software.amazon.awscdk.services.finspace.CfnEnvironment
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.finspace.*;
   * AttributeMapItemsProperty attributeMapItemsProperty = AttributeMapItemsProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-attributemapitems.html)
   */
  public interface AttributeMapItemsProperty {
    /**
     * The key name of the tag.
     *
     * You can specify a value that is 1 to 128 Unicode characters in length and cannot be prefixed
     * with aws:. You can use any of the following characters: the set of Unicode letters, digits,
     * whitespace, _, ., /, =, +, and -.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-attributemapitems.html#cfn-finspace-environment-attributemapitems-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The value for the tag.
     *
     * You can specify a value that is 0 to 256 Unicode characters in length and cannot be prefixed
     * with aws:. You can use any of the following characters: the set of Unicode letters, digits,
     * whitespace, _, ., /, =, +, and -.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-attributemapitems.html#cfn-finspace-environment-attributemapitems-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [AttributeMapItemsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key name of the tag.
       * You can specify a value that is 1 to 128 Unicode characters in length and cannot be
       * prefixed with aws:. You can use any of the following characters: the set of Unicode letters,
       * digits, whitespace, _, ., /, =, +, and -.
       */
      public fun key(key: String)

      /**
       * @param value The value for the tag.
       * You can specify a value that is 0 to 256 Unicode characters in length and cannot be
       * prefixed with aws:. You can use any of the following characters: the set of Unicode letters,
       * digits, whitespace, _, ., /, =, +, and -.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.finspace.CfnEnvironment.AttributeMapItemsProperty.Builder
          =
          software.amazon.awscdk.services.finspace.CfnEnvironment.AttributeMapItemsProperty.builder()

      /**
       * @param key The key name of the tag.
       * You can specify a value that is 1 to 128 Unicode characters in length and cannot be
       * prefixed with aws:. You can use any of the following characters: the set of Unicode letters,
       * digits, whitespace, _, ., /, =, +, and -.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value for the tag.
       * You can specify a value that is 0 to 256 Unicode characters in length and cannot be
       * prefixed with aws:. You can use any of the following characters: the set of Unicode letters,
       * digits, whitespace, _, ., /, =, +, and -.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.finspace.CfnEnvironment.AttributeMapItemsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironment.AttributeMapItemsProperty,
    ) : CdkObject(cdkObject), AttributeMapItemsProperty {
      /**
       * The key name of the tag.
       *
       * You can specify a value that is 1 to 128 Unicode characters in length and cannot be
       * prefixed with aws:. You can use any of the following characters: the set of Unicode letters,
       * digits, whitespace, _, ., /, =, +, and -.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-attributemapitems.html#cfn-finspace-environment-attributemapitems-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The value for the tag.
       *
       * You can specify a value that is 0 to 256 Unicode characters in length and cannot be
       * prefixed with aws:. You can use any of the following characters: the set of Unicode letters,
       * digits, whitespace, _, ., /, =, +, and -.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-attributemapitems.html#cfn-finspace-environment-attributemapitems-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeMapItemsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironment.AttributeMapItemsProperty):
          AttributeMapItemsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AttributeMapItemsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeMapItemsProperty):
          software.amazon.awscdk.services.finspace.CfnEnvironment.AttributeMapItemsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.finspace.CfnEnvironment.AttributeMapItemsProperty
    }
  }

  /**
   * Configuration information when authentication mode is FEDERATED.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.finspace.*;
   * FederationParametersProperty federationParametersProperty =
   * FederationParametersProperty.builder()
   * .applicationCallBackUrl("applicationCallBackUrl")
   * .attributeMap(List.of(AttributeMapItemsProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .federationProviderName("federationProviderName")
   * .federationUrn("federationUrn")
   * .samlMetadataDocument("samlMetadataDocument")
   * .samlMetadataUrl("samlMetadataUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-federationparameters.html)
   */
  public interface FederationParametersProperty {
    /**
     * The redirect or sign-in URL that should be entered into the SAML 2.0 compliant identity
     * provider configuration (IdP).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-federationparameters.html#cfn-finspace-environment-federationparameters-applicationcallbackurl)
     */
    public fun applicationCallBackUrl(): String? = unwrap(this).getApplicationCallBackUrl()

    /**
     * SAML attribute name and value.
     *
     * The name must always be `Email` and the value should be set to the attribute definition in
     * which user email is set. For example, name would be `Email` and value
     * `http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress` . Please check your SAML
     * 2.0 compliant identity provider (IdP) documentation for details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-federationparameters.html#cfn-finspace-environment-federationparameters-attributemap)
     */
    public fun attributeMap(): Any? = unwrap(this).getAttributeMap()

    /**
     * Name of the identity provider (IdP).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-federationparameters.html#cfn-finspace-environment-federationparameters-federationprovidername)
     */
    public fun federationProviderName(): String? = unwrap(this).getFederationProviderName()

    /**
     * The Uniform Resource Name (URN).
     *
     * Also referred as Service Provider URN or Audience URI or Service Provider Entity ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-federationparameters.html#cfn-finspace-environment-federationparameters-federationurn)
     */
    public fun federationUrn(): String? = unwrap(this).getFederationUrn()

    /**
     * SAML 2.0 Metadata document from identity provider (IdP).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-federationparameters.html#cfn-finspace-environment-federationparameters-samlmetadatadocument)
     */
    public fun samlMetadataDocument(): String? = unwrap(this).getSamlMetadataDocument()

    /**
     * Provide the metadata URL from your SAML 2.0 compliant identity provider (IdP).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-federationparameters.html#cfn-finspace-environment-federationparameters-samlmetadataurl)
     */
    public fun samlMetadataUrl(): String? = unwrap(this).getSamlMetadataUrl()

    /**
     * A builder for [FederationParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationCallBackUrl The redirect or sign-in URL that should be entered into the
       * SAML 2.0 compliant identity provider configuration (IdP).
       */
      public fun applicationCallBackUrl(applicationCallBackUrl: String)

      /**
       * @param attributeMap SAML attribute name and value.
       * The name must always be `Email` and the value should be set to the attribute definition in
       * which user email is set. For example, name would be `Email` and value
       * `http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress` . Please check your SAML
       * 2.0 compliant identity provider (IdP) documentation for details.
       */
      public fun attributeMap(attributeMap: IResolvable)

      /**
       * @param attributeMap SAML attribute name and value.
       * The name must always be `Email` and the value should be set to the attribute definition in
       * which user email is set. For example, name would be `Email` and value
       * `http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress` . Please check your SAML
       * 2.0 compliant identity provider (IdP) documentation for details.
       */
      public fun attributeMap(attributeMap: List<Any>)

      /**
       * @param attributeMap SAML attribute name and value.
       * The name must always be `Email` and the value should be set to the attribute definition in
       * which user email is set. For example, name would be `Email` and value
       * `http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress` . Please check your SAML
       * 2.0 compliant identity provider (IdP) documentation for details.
       */
      public fun attributeMap(vararg attributeMap: Any)

      /**
       * @param federationProviderName Name of the identity provider (IdP).
       */
      public fun federationProviderName(federationProviderName: String)

      /**
       * @param federationUrn The Uniform Resource Name (URN).
       * Also referred as Service Provider URN or Audience URI or Service Provider Entity ID.
       */
      public fun federationUrn(federationUrn: String)

      /**
       * @param samlMetadataDocument SAML 2.0 Metadata document from identity provider (IdP).
       */
      public fun samlMetadataDocument(samlMetadataDocument: String)

      /**
       * @param samlMetadataUrl Provide the metadata URL from your SAML 2.0 compliant identity
       * provider (IdP).
       */
      public fun samlMetadataUrl(samlMetadataUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty.Builder
          =
          software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty.builder()

      /**
       * @param applicationCallBackUrl The redirect or sign-in URL that should be entered into the
       * SAML 2.0 compliant identity provider configuration (IdP).
       */
      override fun applicationCallBackUrl(applicationCallBackUrl: String) {
        cdkBuilder.applicationCallBackUrl(applicationCallBackUrl)
      }

      /**
       * @param attributeMap SAML attribute name and value.
       * The name must always be `Email` and the value should be set to the attribute definition in
       * which user email is set. For example, name would be `Email` and value
       * `http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress` . Please check your SAML
       * 2.0 compliant identity provider (IdP) documentation for details.
       */
      override fun attributeMap(attributeMap: IResolvable) {
        cdkBuilder.attributeMap(attributeMap.let(IResolvable::unwrap))
      }

      /**
       * @param attributeMap SAML attribute name and value.
       * The name must always be `Email` and the value should be set to the attribute definition in
       * which user email is set. For example, name would be `Email` and value
       * `http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress` . Please check your SAML
       * 2.0 compliant identity provider (IdP) documentation for details.
       */
      override fun attributeMap(attributeMap: List<Any>) {
        cdkBuilder.attributeMap(attributeMap.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param attributeMap SAML attribute name and value.
       * The name must always be `Email` and the value should be set to the attribute definition in
       * which user email is set. For example, name would be `Email` and value
       * `http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress` . Please check your SAML
       * 2.0 compliant identity provider (IdP) documentation for details.
       */
      override fun attributeMap(vararg attributeMap: Any): Unit =
          attributeMap(attributeMap.toList())

      /**
       * @param federationProviderName Name of the identity provider (IdP).
       */
      override fun federationProviderName(federationProviderName: String) {
        cdkBuilder.federationProviderName(federationProviderName)
      }

      /**
       * @param federationUrn The Uniform Resource Name (URN).
       * Also referred as Service Provider URN or Audience URI or Service Provider Entity ID.
       */
      override fun federationUrn(federationUrn: String) {
        cdkBuilder.federationUrn(federationUrn)
      }

      /**
       * @param samlMetadataDocument SAML 2.0 Metadata document from identity provider (IdP).
       */
      override fun samlMetadataDocument(samlMetadataDocument: String) {
        cdkBuilder.samlMetadataDocument(samlMetadataDocument)
      }

      /**
       * @param samlMetadataUrl Provide the metadata URL from your SAML 2.0 compliant identity
       * provider (IdP).
       */
      override fun samlMetadataUrl(samlMetadataUrl: String) {
        cdkBuilder.samlMetadataUrl(samlMetadataUrl)
      }

      public fun build():
          software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty,
    ) : CdkObject(cdkObject), FederationParametersProperty {
      /**
       * The redirect or sign-in URL that should be entered into the SAML 2.0 compliant identity
       * provider configuration (IdP).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-federationparameters.html#cfn-finspace-environment-federationparameters-applicationcallbackurl)
       */
      override fun applicationCallBackUrl(): String? = unwrap(this).getApplicationCallBackUrl()

      /**
       * SAML attribute name and value.
       *
       * The name must always be `Email` and the value should be set to the attribute definition in
       * which user email is set. For example, name would be `Email` and value
       * `http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress` . Please check your SAML
       * 2.0 compliant identity provider (IdP) documentation for details.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-federationparameters.html#cfn-finspace-environment-federationparameters-attributemap)
       */
      override fun attributeMap(): Any? = unwrap(this).getAttributeMap()

      /**
       * Name of the identity provider (IdP).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-federationparameters.html#cfn-finspace-environment-federationparameters-federationprovidername)
       */
      override fun federationProviderName(): String? = unwrap(this).getFederationProviderName()

      /**
       * The Uniform Resource Name (URN).
       *
       * Also referred as Service Provider URN or Audience URI or Service Provider Entity ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-federationparameters.html#cfn-finspace-environment-federationparameters-federationurn)
       */
      override fun federationUrn(): String? = unwrap(this).getFederationUrn()

      /**
       * SAML 2.0 Metadata document from identity provider (IdP).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-federationparameters.html#cfn-finspace-environment-federationparameters-samlmetadatadocument)
       */
      override fun samlMetadataDocument(): String? = unwrap(this).getSamlMetadataDocument()

      /**
       * Provide the metadata URL from your SAML 2.0 compliant identity provider (IdP).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-federationparameters.html#cfn-finspace-environment-federationparameters-samlmetadataurl)
       */
      override fun samlMetadataUrl(): String? = unwrap(this).getSamlMetadataUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FederationParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty):
          FederationParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FederationParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FederationParametersProperty):
          software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty
    }
  }

  /**
   * Configuration information for the superuser.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.finspace.*;
   * SuperuserParametersProperty superuserParametersProperty = SuperuserParametersProperty.builder()
   * .emailAddress("emailAddress")
   * .firstName("firstName")
   * .lastName("lastName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-superuserparameters.html)
   */
  public interface SuperuserParametersProperty {
    /**
     * The email address of the superuser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-superuserparameters.html#cfn-finspace-environment-superuserparameters-emailaddress)
     */
    public fun emailAddress(): String? = unwrap(this).getEmailAddress()

    /**
     * The first name of the superuser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-superuserparameters.html#cfn-finspace-environment-superuserparameters-firstname)
     */
    public fun firstName(): String? = unwrap(this).getFirstName()

    /**
     * The last name of the superuser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-superuserparameters.html#cfn-finspace-environment-superuserparameters-lastname)
     */
    public fun lastName(): String? = unwrap(this).getLastName()

    /**
     * A builder for [SuperuserParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param emailAddress The email address of the superuser.
       */
      public fun emailAddress(emailAddress: String)

      /**
       * @param firstName The first name of the superuser.
       */
      public fun firstName(firstName: String)

      /**
       * @param lastName The last name of the superuser.
       */
      public fun lastName(lastName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.finspace.CfnEnvironment.SuperuserParametersProperty.Builder
          =
          software.amazon.awscdk.services.finspace.CfnEnvironment.SuperuserParametersProperty.builder()

      /**
       * @param emailAddress The email address of the superuser.
       */
      override fun emailAddress(emailAddress: String) {
        cdkBuilder.emailAddress(emailAddress)
      }

      /**
       * @param firstName The first name of the superuser.
       */
      override fun firstName(firstName: String) {
        cdkBuilder.firstName(firstName)
      }

      /**
       * @param lastName The last name of the superuser.
       */
      override fun lastName(lastName: String) {
        cdkBuilder.lastName(lastName)
      }

      public fun build():
          software.amazon.awscdk.services.finspace.CfnEnvironment.SuperuserParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironment.SuperuserParametersProperty,
    ) : CdkObject(cdkObject), SuperuserParametersProperty {
      /**
       * The email address of the superuser.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-superuserparameters.html#cfn-finspace-environment-superuserparameters-emailaddress)
       */
      override fun emailAddress(): String? = unwrap(this).getEmailAddress()

      /**
       * The first name of the superuser.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-superuserparameters.html#cfn-finspace-environment-superuserparameters-firstname)
       */
      override fun firstName(): String? = unwrap(this).getFirstName()

      /**
       * The last name of the superuser.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-superuserparameters.html#cfn-finspace-environment-superuserparameters-lastname)
       */
      override fun lastName(): String? = unwrap(this).getLastName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SuperuserParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironment.SuperuserParametersProperty):
          SuperuserParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SuperuserParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SuperuserParametersProperty):
          software.amazon.awscdk.services.finspace.CfnEnvironment.SuperuserParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.finspace.CfnEnvironment.SuperuserParametersProperty
    }
  }
}
