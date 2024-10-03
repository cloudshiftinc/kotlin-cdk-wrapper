@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorscep

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Connector for SCEP is a service that links AWS Private Certificate Authority to your SCEP-enabled
 * devices.
 *
 * The connector brokers the exchange of certificates from AWS Private CA to your SCEP-enabled
 * devices and mobile device management systems. The connector is a complex type that contains the
 * connector's configuration settings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pcaconnectorscep.*;
 * CfnConnector cfnConnector = CfnConnector.Builder.create(this, "MyCfnConnector")
 * .certificateAuthorityArn("certificateAuthorityArn")
 * // the properties below are optional
 * .mobileDeviceManagement(MobileDeviceManagementProperty.builder()
 * .intune(IntuneConfigurationProperty.builder()
 * .azureApplicationId("azureApplicationId")
 * .domain("domain")
 * .build())
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html)
 */
public open class CfnConnector(
  cdkObject: software.amazon.awscdk.services.pcaconnectorscep.CfnConnector,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectorProps,
  ) :
      this(software.amazon.awscdk.services.pcaconnectorscep.CfnConnector(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConnectorProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectorProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConnectorProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the connector.
   */
  public open fun attrConnectorArn(): String = unwrap(this).getAttrConnectorArn()

  /**
   * The connector's HTTPS public SCEP URL.
   */
  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  /**
   *
   */
  public open fun attrOpenIdConfiguration(): IResolvable =
      unwrap(this).getAttrOpenIdConfiguration().let(IResolvable::wrap)

  /**
   * The connector type.
   */
  public open fun attrType(): String = unwrap(this).getAttrType()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The Amazon Resource Name (ARN) of the certificate authority associated with the connector.
   */
  public open fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

  /**
   * The Amazon Resource Name (ARN) of the certificate authority associated with the connector.
   */
  public open fun certificateAuthorityArn(`value`: String) {
    unwrap(this).setCertificateAuthorityArn(`value`)
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
   * Contains settings relevant to the mobile device management system that you chose for the
   * connector.
   */
  public open fun mobileDeviceManagement(): Any? = unwrap(this).getMobileDeviceManagement()

  /**
   * Contains settings relevant to the mobile device management system that you chose for the
   * connector.
   */
  public open fun mobileDeviceManagement(`value`: IResolvable) {
    unwrap(this).setMobileDeviceManagement(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains settings relevant to the mobile device management system that you chose for the
   * connector.
   */
  public open fun mobileDeviceManagement(`value`: MobileDeviceManagementProperty) {
    unwrap(this).setMobileDeviceManagement(`value`.let(MobileDeviceManagementProperty.Companion::unwrap))
  }

  /**
   * Contains settings relevant to the mobile device management system that you chose for the
   * connector.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3ba085a2d9907a7f9f063c5c54b27ff11e8c46d4343ed776f3721825a9224f88")
  public open
      fun mobileDeviceManagement(`value`: MobileDeviceManagementProperty.Builder.() -> Unit): Unit =
      mobileDeviceManagement(MobileDeviceManagementProperty(`value`))

  /**
   *
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   *
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pcaconnectorscep.CfnConnector].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the certificate authority associated with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html#cfn-pcaconnectorscep-connector-certificateauthorityarn)
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the certificate authority
     * associated with the connector. 
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    /**
     * Contains settings relevant to the mobile device management system that you chose for the
     * connector.
     *
     * If you didn't configure `MobileDeviceManagement` , then the connector is for general-purpose
     * use and this object is empty.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html#cfn-pcaconnectorscep-connector-mobiledevicemanagement)
     * @param mobileDeviceManagement Contains settings relevant to the mobile device management
     * system that you chose for the connector. 
     */
    public fun mobileDeviceManagement(mobileDeviceManagement: IResolvable)

    /**
     * Contains settings relevant to the mobile device management system that you chose for the
     * connector.
     *
     * If you didn't configure `MobileDeviceManagement` , then the connector is for general-purpose
     * use and this object is empty.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html#cfn-pcaconnectorscep-connector-mobiledevicemanagement)
     * @param mobileDeviceManagement Contains settings relevant to the mobile device management
     * system that you chose for the connector. 
     */
    public fun mobileDeviceManagement(mobileDeviceManagement: MobileDeviceManagementProperty)

    /**
     * Contains settings relevant to the mobile device management system that you chose for the
     * connector.
     *
     * If you didn't configure `MobileDeviceManagement` , then the connector is for general-purpose
     * use and this object is empty.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html#cfn-pcaconnectorscep-connector-mobiledevicemanagement)
     * @param mobileDeviceManagement Contains settings relevant to the mobile device management
     * system that you chose for the connector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("464a07dd5cc699f261661f3ecdb7ae910ed63f059a5da9e10062a43f349cfd5b")
    public
        fun mobileDeviceManagement(mobileDeviceManagement: MobileDeviceManagementProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html#cfn-pcaconnectorscep-connector-tags)
     * @param tags 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.Builder =
        software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the certificate authority associated with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html#cfn-pcaconnectorscep-connector-certificateauthorityarn)
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the certificate authority
     * associated with the connector. 
     */
    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /**
     * Contains settings relevant to the mobile device management system that you chose for the
     * connector.
     *
     * If you didn't configure `MobileDeviceManagement` , then the connector is for general-purpose
     * use and this object is empty.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html#cfn-pcaconnectorscep-connector-mobiledevicemanagement)
     * @param mobileDeviceManagement Contains settings relevant to the mobile device management
     * system that you chose for the connector. 
     */
    override fun mobileDeviceManagement(mobileDeviceManagement: IResolvable) {
      cdkBuilder.mobileDeviceManagement(mobileDeviceManagement.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains settings relevant to the mobile device management system that you chose for the
     * connector.
     *
     * If you didn't configure `MobileDeviceManagement` , then the connector is for general-purpose
     * use and this object is empty.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html#cfn-pcaconnectorscep-connector-mobiledevicemanagement)
     * @param mobileDeviceManagement Contains settings relevant to the mobile device management
     * system that you chose for the connector. 
     */
    override fun mobileDeviceManagement(mobileDeviceManagement: MobileDeviceManagementProperty) {
      cdkBuilder.mobileDeviceManagement(mobileDeviceManagement.let(MobileDeviceManagementProperty.Companion::unwrap))
    }

    /**
     * Contains settings relevant to the mobile device management system that you chose for the
     * connector.
     *
     * If you didn't configure `MobileDeviceManagement` , then the connector is for general-purpose
     * use and this object is empty.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html#cfn-pcaconnectorscep-connector-mobiledevicemanagement)
     * @param mobileDeviceManagement Contains settings relevant to the mobile device management
     * system that you chose for the connector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("464a07dd5cc699f261661f3ecdb7ae910ed63f059a5da9e10062a43f349cfd5b")
    override
        fun mobileDeviceManagement(mobileDeviceManagement: MobileDeviceManagementProperty.Builder.() -> Unit):
        Unit = mobileDeviceManagement(MobileDeviceManagementProperty(mobileDeviceManagement))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html#cfn-pcaconnectorscep-connector-tags)
     * @param tags 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcaconnectorscep.CfnConnector =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnector {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnector(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorscep.CfnConnector):
        CfnConnector = CfnConnector(cdkObject)

    internal fun unwrap(wrapped: CfnConnector):
        software.amazon.awscdk.services.pcaconnectorscep.CfnConnector = wrapped.cdkObject as
        software.amazon.awscdk.services.pcaconnectorscep.CfnConnector
  }

  /**
   * Contains configuration details for use with Microsoft Intune.
   *
   * For information about using Connector for SCEP for Microsoft Intune, see [Using Connector for
   * SCEP for Microsoft
   * Intune](https://docs.aws.amazon.com/privateca/latest/userguide/scep-connector.htmlconnector-for-scep-intune.html)
   * .
   *
   * When you use Connector for SCEP for Microsoft Intune, certain functionalities are enabled by
   * accessing Microsoft Intune through the Microsoft API. Your use of the Connector for SCEP and
   * accompanying AWS services doesn't remove your need to have a valid license for your use of the
   * Microsoft Intune service. You should also review the [Microsoft Intune® App Protection
   * Policies](https://docs.aws.amazon.com/https://learn.microsoft.com/en-us/mem/intune/apps/app-protection-policy)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcaconnectorscep.*;
   * IntuneConfigurationProperty intuneConfigurationProperty = IntuneConfigurationProperty.builder()
   * .azureApplicationId("azureApplicationId")
   * .domain("domain")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorscep-connector-intuneconfiguration.html)
   */
  public interface IntuneConfigurationProperty {
    /**
     * The directory (tenant) ID from your Microsoft Entra ID app registration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorscep-connector-intuneconfiguration.html#cfn-pcaconnectorscep-connector-intuneconfiguration-azureapplicationid)
     */
    public fun azureApplicationId(): String

    /**
     * The primary domain from your Microsoft Entra ID app registration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorscep-connector-intuneconfiguration.html#cfn-pcaconnectorscep-connector-intuneconfiguration-domain)
     */
    public fun domain(): String

    /**
     * A builder for [IntuneConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param azureApplicationId The directory (tenant) ID from your Microsoft Entra ID app
       * registration. 
       */
      public fun azureApplicationId(azureApplicationId: String)

      /**
       * @param domain The primary domain from your Microsoft Entra ID app registration. 
       */
      public fun domain(domain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.IntuneConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.IntuneConfigurationProperty.builder()

      /**
       * @param azureApplicationId The directory (tenant) ID from your Microsoft Entra ID app
       * registration. 
       */
      override fun azureApplicationId(azureApplicationId: String) {
        cdkBuilder.azureApplicationId(azureApplicationId)
      }

      /**
       * @param domain The primary domain from your Microsoft Entra ID app registration. 
       */
      override fun domain(domain: String) {
        cdkBuilder.domain(domain)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.IntuneConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.IntuneConfigurationProperty,
    ) : CdkObject(cdkObject),
        IntuneConfigurationProperty {
      /**
       * The directory (tenant) ID from your Microsoft Entra ID app registration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorscep-connector-intuneconfiguration.html#cfn-pcaconnectorscep-connector-intuneconfiguration-azureapplicationid)
       */
      override fun azureApplicationId(): String = unwrap(this).getAzureApplicationId()

      /**
       * The primary domain from your Microsoft Entra ID app registration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorscep-connector-intuneconfiguration.html#cfn-pcaconnectorscep-connector-intuneconfiguration-domain)
       */
      override fun domain(): String = unwrap(this).getDomain()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IntuneConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.IntuneConfigurationProperty):
          IntuneConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IntuneConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntuneConfigurationProperty):
          software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.IntuneConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.IntuneConfigurationProperty
    }
  }

  /**
   * If you don't supply a value, by default Connector for SCEP creates a connector for
   * general-purpose use.
   *
   * A general-purpose connector is designed to work with clients or endpoints that support the SCEP
   * protocol, except Connector for SCEP for Microsoft Intune. For information about considerations and
   * limitations with using Connector for SCEP, see [Considerations and
   * Limitations](https://docs.aws.amazon.com/privateca/latest/userguide/scep-connector.htmlc4scep-considerations-limitations.html)
   * .
   *
   * If you provide an `IntuneConfiguration` , Connector for SCEP creates a connector for use with
   * Microsoft Intune, and you manage the challenge passwords using Microsoft Intune. For more
   * information, see [Using Connector for SCEP for Microsoft
   * Intune](https://docs.aws.amazon.com/privateca/latest/userguide/scep-connector.htmlconnector-for-scep-intune.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcaconnectorscep.*;
   * MobileDeviceManagementProperty mobileDeviceManagementProperty =
   * MobileDeviceManagementProperty.builder()
   * .intune(IntuneConfigurationProperty.builder()
   * .azureApplicationId("azureApplicationId")
   * .domain("domain")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorscep-connector-mobiledevicemanagement.html)
   */
  public interface MobileDeviceManagementProperty {
    /**
     * Configuration settings for use with Microsoft Intune.
     *
     * For information about using Connector for SCEP for Microsoft Intune, see [Using Connector for
     * SCEP for Microsoft
     * Intune](https://docs.aws.amazon.com/privateca/latest/userguide/scep-connector.htmlconnector-for-scep-intune.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorscep-connector-mobiledevicemanagement.html#cfn-pcaconnectorscep-connector-mobiledevicemanagement-intune)
     */
    public fun intune(): Any

    /**
     * A builder for [MobileDeviceManagementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param intune Configuration settings for use with Microsoft Intune. 
       * For information about using Connector for SCEP for Microsoft Intune, see [Using Connector
       * for SCEP for Microsoft
       * Intune](https://docs.aws.amazon.com/privateca/latest/userguide/scep-connector.htmlconnector-for-scep-intune.html)
       * .
       */
      public fun intune(intune: IResolvable)

      /**
       * @param intune Configuration settings for use with Microsoft Intune. 
       * For information about using Connector for SCEP for Microsoft Intune, see [Using Connector
       * for SCEP for Microsoft
       * Intune](https://docs.aws.amazon.com/privateca/latest/userguide/scep-connector.htmlconnector-for-scep-intune.html)
       * .
       */
      public fun intune(intune: IntuneConfigurationProperty)

      /**
       * @param intune Configuration settings for use with Microsoft Intune. 
       * For information about using Connector for SCEP for Microsoft Intune, see [Using Connector
       * for SCEP for Microsoft
       * Intune](https://docs.aws.amazon.com/privateca/latest/userguide/scep-connector.htmlconnector-for-scep-intune.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("923cab7a0f6e4d35d28d0ddb4bcfe56b0aac201455ec2ab14435dc6a14c20c9e")
      public fun intune(intune: IntuneConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.MobileDeviceManagementProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.MobileDeviceManagementProperty.builder()

      /**
       * @param intune Configuration settings for use with Microsoft Intune. 
       * For information about using Connector for SCEP for Microsoft Intune, see [Using Connector
       * for SCEP for Microsoft
       * Intune](https://docs.aws.amazon.com/privateca/latest/userguide/scep-connector.htmlconnector-for-scep-intune.html)
       * .
       */
      override fun intune(intune: IResolvable) {
        cdkBuilder.intune(intune.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param intune Configuration settings for use with Microsoft Intune. 
       * For information about using Connector for SCEP for Microsoft Intune, see [Using Connector
       * for SCEP for Microsoft
       * Intune](https://docs.aws.amazon.com/privateca/latest/userguide/scep-connector.htmlconnector-for-scep-intune.html)
       * .
       */
      override fun intune(intune: IntuneConfigurationProperty) {
        cdkBuilder.intune(intune.let(IntuneConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param intune Configuration settings for use with Microsoft Intune. 
       * For information about using Connector for SCEP for Microsoft Intune, see [Using Connector
       * for SCEP for Microsoft
       * Intune](https://docs.aws.amazon.com/privateca/latest/userguide/scep-connector.htmlconnector-for-scep-intune.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("923cab7a0f6e4d35d28d0ddb4bcfe56b0aac201455ec2ab14435dc6a14c20c9e")
      override fun intune(intune: IntuneConfigurationProperty.Builder.() -> Unit): Unit =
          intune(IntuneConfigurationProperty(intune))

      public fun build():
          software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.MobileDeviceManagementProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.MobileDeviceManagementProperty,
    ) : CdkObject(cdkObject),
        MobileDeviceManagementProperty {
      /**
       * Configuration settings for use with Microsoft Intune.
       *
       * For information about using Connector for SCEP for Microsoft Intune, see [Using Connector
       * for SCEP for Microsoft
       * Intune](https://docs.aws.amazon.com/privateca/latest/userguide/scep-connector.htmlconnector-for-scep-intune.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorscep-connector-mobiledevicemanagement.html#cfn-pcaconnectorscep-connector-mobiledevicemanagement-intune)
       */
      override fun intune(): Any = unwrap(this).getIntune()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MobileDeviceManagementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.MobileDeviceManagementProperty):
          MobileDeviceManagementProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MobileDeviceManagementProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MobileDeviceManagementProperty):
          software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.MobileDeviceManagementProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.MobileDeviceManagementProperty
    }
  }

  /**
   * Contains OpenID Connect (OIDC) parameters for use with Microsoft Intune.
   *
   * For more information about using Connector for SCEP for Microsoft Intune, see [Using Connector
   * for SCEP for Microsoft
   * Intune](https://docs.aws.amazon.com/privateca/latest/userguide/scep-connector.htmlconnector-for-scep-intune.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcaconnectorscep.*;
   * OpenIdConfigurationProperty openIdConfigurationProperty = OpenIdConfigurationProperty.builder()
   * .audience("audience")
   * .issuer("issuer")
   * .subject("subject")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorscep-connector-openidconfiguration.html)
   */
  public interface OpenIdConfigurationProperty {
    /**
     * The audience value to copy into your Microsoft Entra app registration's OIDC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorscep-connector-openidconfiguration.html#cfn-pcaconnectorscep-connector-openidconfiguration-audience)
     */
    public fun audience(): String? = unwrap(this).getAudience()

    /**
     * The issuer value to copy into your Microsoft Entra app registration's OIDC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorscep-connector-openidconfiguration.html#cfn-pcaconnectorscep-connector-openidconfiguration-issuer)
     */
    public fun issuer(): String? = unwrap(this).getIssuer()

    /**
     * The subject value to copy into your Microsoft Entra app registration's OIDC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorscep-connector-openidconfiguration.html#cfn-pcaconnectorscep-connector-openidconfiguration-subject)
     */
    public fun subject(): String? = unwrap(this).getSubject()

    /**
     * A builder for [OpenIdConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param audience The audience value to copy into your Microsoft Entra app registration's
       * OIDC.
       */
      public fun audience(audience: String)

      /**
       * @param issuer The issuer value to copy into your Microsoft Entra app registration's OIDC.
       */
      public fun issuer(issuer: String)

      /**
       * @param subject The subject value to copy into your Microsoft Entra app registration's OIDC.
       */
      public fun subject(subject: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.OpenIdConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.OpenIdConfigurationProperty.builder()

      /**
       * @param audience The audience value to copy into your Microsoft Entra app registration's
       * OIDC.
       */
      override fun audience(audience: String) {
        cdkBuilder.audience(audience)
      }

      /**
       * @param issuer The issuer value to copy into your Microsoft Entra app registration's OIDC.
       */
      override fun issuer(issuer: String) {
        cdkBuilder.issuer(issuer)
      }

      /**
       * @param subject The subject value to copy into your Microsoft Entra app registration's OIDC.
       */
      override fun subject(subject: String) {
        cdkBuilder.subject(subject)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.OpenIdConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.OpenIdConfigurationProperty,
    ) : CdkObject(cdkObject),
        OpenIdConfigurationProperty {
      /**
       * The audience value to copy into your Microsoft Entra app registration's OIDC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorscep-connector-openidconfiguration.html#cfn-pcaconnectorscep-connector-openidconfiguration-audience)
       */
      override fun audience(): String? = unwrap(this).getAudience()

      /**
       * The issuer value to copy into your Microsoft Entra app registration's OIDC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorscep-connector-openidconfiguration.html#cfn-pcaconnectorscep-connector-openidconfiguration-issuer)
       */
      override fun issuer(): String? = unwrap(this).getIssuer()

      /**
       * The subject value to copy into your Microsoft Entra app registration's OIDC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorscep-connector-openidconfiguration.html#cfn-pcaconnectorscep-connector-openidconfiguration-subject)
       */
      override fun subject(): String? = unwrap(this).getSubject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OpenIdConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.OpenIdConfigurationProperty):
          OpenIdConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenIdConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenIdConfigurationProperty):
          software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.OpenIdConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorscep.CfnConnector.OpenIdConfigurationProperty
    }
  }
}
