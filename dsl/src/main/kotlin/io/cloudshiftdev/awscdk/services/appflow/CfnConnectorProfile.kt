package io.cloudshiftdev.awscdk.services.appflow

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConnectorProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Name (ARN) of the connector profile.
   */
  public open fun attrConnectorProfileArn(): String = unwrap(this).getAttrConnectorProfileArn()

  /**
   * The Amazon Resource Name (ARN) of the connector profile credentials.
   */
  public open fun attrCredentialsArn(): String = unwrap(this).getAttrCredentialsArn()

  /**
   * Indicates the connection mode and if it is public or private.
   */
  public open fun connectionMode(): String = unwrap(this).getConnectionMode()

  /**
   * Indicates the connection mode and if it is public or private.
   */
  public open fun connectionMode(`value`: String) {
    unwrap(this).setConnectionMode(`value`)
  }

  /**
   * The label for the connector profile being created.
   */
  public open fun connectorLabel(): String? = unwrap(this).getConnectorLabel()

  /**
   * The label for the connector profile being created.
   */
  public open fun connectorLabel(`value`: String) {
    unwrap(this).setConnectorLabel(`value`)
  }

  /**
   * Defines the connector-specific configuration and credentials.
   */
  public open fun connectorProfileConfig(): Any? = unwrap(this).getConnectorProfileConfig()

  /**
   * Defines the connector-specific configuration and credentials.
   */
  public open fun connectorProfileConfig(`value`: IResolvable) {
    unwrap(this).setConnectorProfileConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Defines the connector-specific configuration and credentials.
   */
  public open fun connectorProfileConfig(`value`: ConnectorProfileConfigProperty) {
    unwrap(this).setConnectorProfileConfig(`value`.let(ConnectorProfileConfigProperty::unwrap))
  }

  /**
   * Defines the connector-specific configuration and credentials.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f1e1d92d37f697e4f9c19ccd5a89423faafa23a3bdf862d0f41897a2e157f954")
  public open
      fun connectorProfileConfig(`value`: ConnectorProfileConfigProperty.Builder.() -> Unit): Unit =
      connectorProfileConfig(ConnectorProfileConfigProperty(`value`))

  /**
   * The name of the connector profile.
   */
  public open fun connectorProfileName(): String = unwrap(this).getConnectorProfileName()

  /**
   * The name of the connector profile.
   */
  public open fun connectorProfileName(`value`: String) {
    unwrap(this).setConnectorProfileName(`value`)
  }

  /**
   * The type of connector, such as Salesforce, Amplitude, and so on.
   */
  public open fun connectorType(): String = unwrap(this).getConnectorType()

  /**
   * The type of connector, such as Salesforce, Amplitude, and so on.
   */
  public open fun connectorType(`value`: String) {
    unwrap(this).setConnectorType(`value`)
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
   * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
   * encryption.
   */
  public open fun kmsArn(): String? = unwrap(this).getKmsArn()

  /**
   * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
   * encryption.
   */
  public open fun kmsArn(`value`: String) {
    unwrap(this).setKmsArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appflow.CfnConnectorProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates the connection mode and if it is public or private.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectionmode)
     * @param connectionMode Indicates the connection mode and if it is public or private. 
     */
    public fun connectionMode(connectionMode: String)

    /**
     * The label for the connector profile being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorlabel)
     * @param connectorLabel The label for the connector profile being created. 
     */
    public fun connectorLabel(connectorLabel: String)

    /**
     * Defines the connector-specific configuration and credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofileconfig)
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials. 
     */
    public fun connectorProfileConfig(connectorProfileConfig: IResolvable)

    /**
     * Defines the connector-specific configuration and credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofileconfig)
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials. 
     */
    public fun connectorProfileConfig(connectorProfileConfig: ConnectorProfileConfigProperty)

    /**
     * Defines the connector-specific configuration and credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofileconfig)
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("896dbebf0606f5983d44893199ec825db9e0300487c20c43d14b8864588a81c7")
    public
        fun connectorProfileConfig(connectorProfileConfig: ConnectorProfileConfigProperty.Builder.() -> Unit)

    /**
     * The name of the connector profile.
     *
     * The name is unique for each `ConnectorProfile` in the AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofilename)
     * @param connectorProfileName The name of the connector profile. 
     */
    public fun connectorProfileName(connectorProfileName: String)

    /**
     * The type of connector, such as Salesforce, Amplitude, and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectortype)
     * @param connectorType The type of connector, such as Salesforce, Amplitude, and so on. 
     */
    public fun connectorType(connectorType: String)

    /**
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
     * encryption.
     *
     * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
     * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-kmsarn)
     * @param kmsArn The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you
     * provide for encryption. 
     */
    public fun kmsArn(kmsArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appflow.CfnConnectorProfile.Builder =
        software.amazon.awscdk.services.appflow.CfnConnectorProfile.Builder.create(scope, id)

    /**
     * Indicates the connection mode and if it is public or private.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectionmode)
     * @param connectionMode Indicates the connection mode and if it is public or private. 
     */
    override fun connectionMode(connectionMode: String) {
      cdkBuilder.connectionMode(connectionMode)
    }

    /**
     * The label for the connector profile being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorlabel)
     * @param connectorLabel The label for the connector profile being created. 
     */
    override fun connectorLabel(connectorLabel: String) {
      cdkBuilder.connectorLabel(connectorLabel)
    }

    /**
     * Defines the connector-specific configuration and credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofileconfig)
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials. 
     */
    override fun connectorProfileConfig(connectorProfileConfig: IResolvable) {
      cdkBuilder.connectorProfileConfig(connectorProfileConfig.let(IResolvable::unwrap))
    }

    /**
     * Defines the connector-specific configuration and credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofileconfig)
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials. 
     */
    override fun connectorProfileConfig(connectorProfileConfig: ConnectorProfileConfigProperty) {
      cdkBuilder.connectorProfileConfig(connectorProfileConfig.let(ConnectorProfileConfigProperty::unwrap))
    }

    /**
     * Defines the connector-specific configuration and credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofileconfig)
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("896dbebf0606f5983d44893199ec825db9e0300487c20c43d14b8864588a81c7")
    override
        fun connectorProfileConfig(connectorProfileConfig: ConnectorProfileConfigProperty.Builder.() -> Unit):
        Unit = connectorProfileConfig(ConnectorProfileConfigProperty(connectorProfileConfig))

    /**
     * The name of the connector profile.
     *
     * The name is unique for each `ConnectorProfile` in the AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofilename)
     * @param connectorProfileName The name of the connector profile. 
     */
    override fun connectorProfileName(connectorProfileName: String) {
      cdkBuilder.connectorProfileName(connectorProfileName)
    }

    /**
     * The type of connector, such as Salesforce, Amplitude, and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectortype)
     * @param connectorType The type of connector, such as Salesforce, Amplitude, and so on. 
     */
    override fun connectorType(connectorType: String) {
      cdkBuilder.connectorType(connectorType)
    }

    /**
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
     * encryption.
     *
     * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
     * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-kmsarn)
     * @param kmsArn The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you
     * provide for encryption. 
     */
    override fun kmsArn(kmsArn: String) {
      cdkBuilder.kmsArn(kmsArn)
    }

    public fun build(): software.amazon.awscdk.services.appflow.CfnConnectorProfile =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnectorProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnectorProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile):
        CfnConnectorProfile = CfnConnectorProfile(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorProfile):
        software.amazon.awscdk.services.appflow.CfnConnectorProfile = wrapped.cdkObject
  }

  public interface MarketoConnectorProfilePropertiesProperty {
    /**
     * The location of the Marketo resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-marketoconnectorprofileproperties.html#cfn-appflow-connectorprofile-marketoconnectorprofileproperties-instanceurl)
     */
    public fun instanceUrl(): String

    /**
     * A builder for [MarketoConnectorProfilePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceUrl The location of the Marketo resource. 
       */
      public fun instanceUrl(instanceUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty.builder()

      /**
       * @param instanceUrl The location of the Marketo resource. 
       */
      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), MarketoConnectorProfilePropertiesProperty {
      /**
       * The location of the Marketo resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-marketoconnectorprofileproperties.html#cfn-appflow-connectorprofile-marketoconnectorprofileproperties-instanceurl)
       */
      override fun instanceUrl(): String = unwrap(this).getInstanceUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MarketoConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty):
          MarketoConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MarketoConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty
    }
  }

  public interface ConnectorProfileCredentialsProperty {
    /**
     * The connector-specific credentials required when using Amplitude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-amplitude)
     */
    public fun amplitude(): Any? = unwrap(this).getAmplitude()

    /**
     * The connector-specific profile credentials that are required when using the custom connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-customconnector)
     */
    public fun customConnector(): Any? = unwrap(this).getCustomConnector()

    /**
     * The connector-specific credentials required when using Datadog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-datadog)
     */
    public fun datadog(): Any? = unwrap(this).getDatadog()

    /**
     * The connector-specific credentials required when using Dynatrace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-dynatrace)
     */
    public fun dynatrace(): Any? = unwrap(this).getDynatrace()

    /**
     * The connector-specific credentials required when using Google Analytics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-googleanalytics)
     */
    public fun googleAnalytics(): Any? = unwrap(this).getGoogleAnalytics()

    /**
     * The connector-specific credentials required when using Infor Nexus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-infornexus)
     */
    public fun inforNexus(): Any? = unwrap(this).getInforNexus()

    /**
     * The connector-specific credentials required when using Marketo.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-marketo)
     */
    public fun marketo(): Any? = unwrap(this).getMarketo()

    /**
     * The connector-specific credentials required when using Salesforce Pardot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-pardot)
     */
    public fun pardot(): Any? = unwrap(this).getPardot()

    /**
     * The connector-specific credentials required when using Amazon Redshift.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-redshift)
     */
    public fun redshift(): Any? = unwrap(this).getRedshift()

    /**
     * The connector-specific credentials required when using Salesforce.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-salesforce)
     */
    public fun salesforce(): Any? = unwrap(this).getSalesforce()

    /**
     * The connector-specific profile credentials required when using SAPOData.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-sapodata)
     */
    public fun sapoData(): Any? = unwrap(this).getSapoData()

    /**
     * The connector-specific credentials required when using ServiceNow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-servicenow)
     */
    public fun serviceNow(): Any? = unwrap(this).getServiceNow()

    /**
     * The connector-specific credentials required when using Singular.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-singular)
     */
    public fun singular(): Any? = unwrap(this).getSingular()

    /**
     * The connector-specific credentials required when using Slack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-slack)
     */
    public fun slack(): Any? = unwrap(this).getSlack()

    /**
     * The connector-specific credentials required when using Snowflake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-snowflake)
     */
    public fun snowflake(): Any? = unwrap(this).getSnowflake()

    /**
     * The connector-specific credentials required when using Trend Micro.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-trendmicro)
     */
    public fun trendmicro(): Any? = unwrap(this).getTrendmicro()

    /**
     * The connector-specific credentials required when using Veeva.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-veeva)
     */
    public fun veeva(): Any? = unwrap(this).getVeeva()

    /**
     * The connector-specific credentials required when using Zendesk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-zendesk)
     */
    public fun zendesk(): Any? = unwrap(this).getZendesk()

    /**
     * A builder for [ConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param amplitude The connector-specific credentials required when using Amplitude.
       */
      public fun amplitude(amplitude: IResolvable)

      /**
       * @param amplitude The connector-specific credentials required when using Amplitude.
       */
      public fun amplitude(amplitude: AmplitudeConnectorProfileCredentialsProperty)

      /**
       * @param amplitude The connector-specific credentials required when using Amplitude.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a13f3a6b92c3140a2c2fe844178b159a8f6c9ce1d4a6e33c92219233fa83b518")
      public
          fun amplitude(amplitude: AmplitudeConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param customConnector The connector-specific profile credentials that are required when
       * using the custom connector.
       */
      public fun customConnector(customConnector: IResolvable)

      /**
       * @param customConnector The connector-specific profile credentials that are required when
       * using the custom connector.
       */
      public fun customConnector(customConnector: CustomConnectorProfileCredentialsProperty)

      /**
       * @param customConnector The connector-specific profile credentials that are required when
       * using the custom connector.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de0ec9a1a2110ec01eafab27e2ba55679dd59904dfa0a5d6856ed80f2a07b6d6")
      public
          fun customConnector(customConnector: CustomConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param datadog The connector-specific credentials required when using Datadog.
       */
      public fun datadog(datadog: IResolvable)

      /**
       * @param datadog The connector-specific credentials required when using Datadog.
       */
      public fun datadog(datadog: DatadogConnectorProfileCredentialsProperty)

      /**
       * @param datadog The connector-specific credentials required when using Datadog.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5b81882db9311849adfac68497a8ab987817c80dba2ac5eb58eaa565b9666547")
      public fun datadog(datadog: DatadogConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param dynatrace The connector-specific credentials required when using Dynatrace.
       */
      public fun dynatrace(dynatrace: IResolvable)

      /**
       * @param dynatrace The connector-specific credentials required when using Dynatrace.
       */
      public fun dynatrace(dynatrace: DynatraceConnectorProfileCredentialsProperty)

      /**
       * @param dynatrace The connector-specific credentials required when using Dynatrace.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76a744f75a48180cf95e434c5966e699291eecaa8ace81adf30603721b1853d0")
      public
          fun dynatrace(dynatrace: DynatraceConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param googleAnalytics The connector-specific credentials required when using Google
       * Analytics.
       */
      public fun googleAnalytics(googleAnalytics: IResolvable)

      /**
       * @param googleAnalytics The connector-specific credentials required when using Google
       * Analytics.
       */
      public
          fun googleAnalytics(googleAnalytics: GoogleAnalyticsConnectorProfileCredentialsProperty)

      /**
       * @param googleAnalytics The connector-specific credentials required when using Google
       * Analytics.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb30e74d46c198db42bf392ba83b60f71c4b33d2e41625918bebf390c571c507")
      public
          fun googleAnalytics(googleAnalytics: GoogleAnalyticsConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param inforNexus The connector-specific credentials required when using Infor Nexus.
       */
      public fun inforNexus(inforNexus: IResolvable)

      /**
       * @param inforNexus The connector-specific credentials required when using Infor Nexus.
       */
      public fun inforNexus(inforNexus: InforNexusConnectorProfileCredentialsProperty)

      /**
       * @param inforNexus The connector-specific credentials required when using Infor Nexus.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8acbe30d4da577abfa3193ab8a767edd13ec6ca3478ecf140ff83c3285c438c0")
      public
          fun inforNexus(inforNexus: InforNexusConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param marketo The connector-specific credentials required when using Marketo.
       */
      public fun marketo(marketo: IResolvable)

      /**
       * @param marketo The connector-specific credentials required when using Marketo.
       */
      public fun marketo(marketo: MarketoConnectorProfileCredentialsProperty)

      /**
       * @param marketo The connector-specific credentials required when using Marketo.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("af93a2d55331477318e73fbfe419cd99ef86085447734542841ad9ea8a6c4c98")
      public fun marketo(marketo: MarketoConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param pardot The connector-specific credentials required when using Salesforce Pardot.
       */
      public fun pardot(pardot: IResolvable)

      /**
       * @param pardot The connector-specific credentials required when using Salesforce Pardot.
       */
      public fun pardot(pardot: PardotConnectorProfileCredentialsProperty)

      /**
       * @param pardot The connector-specific credentials required when using Salesforce Pardot.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c831f31c91ed683a67abeafbf5a5743266097be49831a41f426f4ed1e01c4d9")
      public fun pardot(pardot: PardotConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param redshift The connector-specific credentials required when using Amazon Redshift.
       */
      public fun redshift(redshift: IResolvable)

      /**
       * @param redshift The connector-specific credentials required when using Amazon Redshift.
       */
      public fun redshift(redshift: RedshiftConnectorProfileCredentialsProperty)

      /**
       * @param redshift The connector-specific credentials required when using Amazon Redshift.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("af49186e8f9f01e2ee0b591799b253cabf5f87c28b08b0d129443942e9fc2300")
      public fun redshift(redshift: RedshiftConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param salesforce The connector-specific credentials required when using Salesforce.
       */
      public fun salesforce(salesforce: IResolvable)

      /**
       * @param salesforce The connector-specific credentials required when using Salesforce.
       */
      public fun salesforce(salesforce: SalesforceConnectorProfileCredentialsProperty)

      /**
       * @param salesforce The connector-specific credentials required when using Salesforce.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8125096d4230ebacb552ce3d9537159b8a68b9464d2450bd5aa6f1facbe95b0e")
      public
          fun salesforce(salesforce: SalesforceConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param sapoData The connector-specific profile credentials required when using SAPOData.
       */
      public fun sapoData(sapoData: IResolvable)

      /**
       * @param sapoData The connector-specific profile credentials required when using SAPOData.
       */
      public fun sapoData(sapoData: SAPODataConnectorProfileCredentialsProperty)

      /**
       * @param sapoData The connector-specific profile credentials required when using SAPOData.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4eb8222a1406f59b6fa58b7a02bf8901be05d665f914ad45d45ac5fd045f4f4c")
      public fun sapoData(sapoData: SAPODataConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param serviceNow The connector-specific credentials required when using ServiceNow.
       */
      public fun serviceNow(serviceNow: IResolvable)

      /**
       * @param serviceNow The connector-specific credentials required when using ServiceNow.
       */
      public fun serviceNow(serviceNow: ServiceNowConnectorProfileCredentialsProperty)

      /**
       * @param serviceNow The connector-specific credentials required when using ServiceNow.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b02952e6f6b2fe2b5336744ecbc9f91b211bac85d0f16e3b1f03a113823df128")
      public
          fun serviceNow(serviceNow: ServiceNowConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param singular The connector-specific credentials required when using Singular.
       */
      public fun singular(singular: IResolvable)

      /**
       * @param singular The connector-specific credentials required when using Singular.
       */
      public fun singular(singular: SingularConnectorProfileCredentialsProperty)

      /**
       * @param singular The connector-specific credentials required when using Singular.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10de7c54878920efd72a7492da089d5a5b5215db09a83d79d585211a7b854585")
      public fun singular(singular: SingularConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param slack The connector-specific credentials required when using Slack.
       */
      public fun slack(slack: IResolvable)

      /**
       * @param slack The connector-specific credentials required when using Slack.
       */
      public fun slack(slack: SlackConnectorProfileCredentialsProperty)

      /**
       * @param slack The connector-specific credentials required when using Slack.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e708360ff956de5ae66e5bcf479a906c70976420e0fdf09de88597ae609bcdfe")
      public fun slack(slack: SlackConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param snowflake The connector-specific credentials required when using Snowflake.
       */
      public fun snowflake(snowflake: IResolvable)

      /**
       * @param snowflake The connector-specific credentials required when using Snowflake.
       */
      public fun snowflake(snowflake: SnowflakeConnectorProfileCredentialsProperty)

      /**
       * @param snowflake The connector-specific credentials required when using Snowflake.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7966e621aa0ec164496005a82ac4e96ad8951af5b97b6b1de9a0ee9f1fe01c6")
      public
          fun snowflake(snowflake: SnowflakeConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param trendmicro The connector-specific credentials required when using Trend Micro.
       */
      public fun trendmicro(trendmicro: IResolvable)

      /**
       * @param trendmicro The connector-specific credentials required when using Trend Micro.
       */
      public fun trendmicro(trendmicro: TrendmicroConnectorProfileCredentialsProperty)

      /**
       * @param trendmicro The connector-specific credentials required when using Trend Micro.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9e50fa6e8affa334e551d0eeb002d38e8cd5ccdd5816cd285234e481ccab15a")
      public
          fun trendmicro(trendmicro: TrendmicroConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param veeva The connector-specific credentials required when using Veeva.
       */
      public fun veeva(veeva: IResolvable)

      /**
       * @param veeva The connector-specific credentials required when using Veeva.
       */
      public fun veeva(veeva: VeevaConnectorProfileCredentialsProperty)

      /**
       * @param veeva The connector-specific credentials required when using Veeva.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9003ee28121c39c203be2c1846faf43651b82652c7c1232e5aaffd48f12ad32b")
      public fun veeva(veeva: VeevaConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param zendesk The connector-specific credentials required when using Zendesk.
       */
      public fun zendesk(zendesk: IResolvable)

      /**
       * @param zendesk The connector-specific credentials required when using Zendesk.
       */
      public fun zendesk(zendesk: ZendeskConnectorProfileCredentialsProperty)

      /**
       * @param zendesk The connector-specific credentials required when using Zendesk.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c85e7ef3b51b61014438db51cceae114f0fd4b3e187906252b9a9db8d5fd1406")
      public fun zendesk(zendesk: ZendeskConnectorProfileCredentialsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty.builder()

      /**
       * @param amplitude The connector-specific credentials required when using Amplitude.
       */
      override fun amplitude(amplitude: IResolvable) {
        cdkBuilder.amplitude(amplitude.let(IResolvable::unwrap))
      }

      /**
       * @param amplitude The connector-specific credentials required when using Amplitude.
       */
      override fun amplitude(amplitude: AmplitudeConnectorProfileCredentialsProperty) {
        cdkBuilder.amplitude(amplitude.let(AmplitudeConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param amplitude The connector-specific credentials required when using Amplitude.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a13f3a6b92c3140a2c2fe844178b159a8f6c9ce1d4a6e33c92219233fa83b518")
      override
          fun amplitude(amplitude: AmplitudeConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = amplitude(AmplitudeConnectorProfileCredentialsProperty(amplitude))

      /**
       * @param customConnector The connector-specific profile credentials that are required when
       * using the custom connector.
       */
      override fun customConnector(customConnector: IResolvable) {
        cdkBuilder.customConnector(customConnector.let(IResolvable::unwrap))
      }

      /**
       * @param customConnector The connector-specific profile credentials that are required when
       * using the custom connector.
       */
      override fun customConnector(customConnector: CustomConnectorProfileCredentialsProperty) {
        cdkBuilder.customConnector(customConnector.let(CustomConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param customConnector The connector-specific profile credentials that are required when
       * using the custom connector.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de0ec9a1a2110ec01eafab27e2ba55679dd59904dfa0a5d6856ed80f2a07b6d6")
      override
          fun customConnector(customConnector: CustomConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = customConnector(CustomConnectorProfileCredentialsProperty(customConnector))

      /**
       * @param datadog The connector-specific credentials required when using Datadog.
       */
      override fun datadog(datadog: IResolvable) {
        cdkBuilder.datadog(datadog.let(IResolvable::unwrap))
      }

      /**
       * @param datadog The connector-specific credentials required when using Datadog.
       */
      override fun datadog(datadog: DatadogConnectorProfileCredentialsProperty) {
        cdkBuilder.datadog(datadog.let(DatadogConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param datadog The connector-specific credentials required when using Datadog.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5b81882db9311849adfac68497a8ab987817c80dba2ac5eb58eaa565b9666547")
      override fun datadog(datadog: DatadogConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = datadog(DatadogConnectorProfileCredentialsProperty(datadog))

      /**
       * @param dynatrace The connector-specific credentials required when using Dynatrace.
       */
      override fun dynatrace(dynatrace: IResolvable) {
        cdkBuilder.dynatrace(dynatrace.let(IResolvable::unwrap))
      }

      /**
       * @param dynatrace The connector-specific credentials required when using Dynatrace.
       */
      override fun dynatrace(dynatrace: DynatraceConnectorProfileCredentialsProperty) {
        cdkBuilder.dynatrace(dynatrace.let(DynatraceConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param dynatrace The connector-specific credentials required when using Dynatrace.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76a744f75a48180cf95e434c5966e699291eecaa8ace81adf30603721b1853d0")
      override
          fun dynatrace(dynatrace: DynatraceConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = dynatrace(DynatraceConnectorProfileCredentialsProperty(dynatrace))

      /**
       * @param googleAnalytics The connector-specific credentials required when using Google
       * Analytics.
       */
      override fun googleAnalytics(googleAnalytics: IResolvable) {
        cdkBuilder.googleAnalytics(googleAnalytics.let(IResolvable::unwrap))
      }

      /**
       * @param googleAnalytics The connector-specific credentials required when using Google
       * Analytics.
       */
      override
          fun googleAnalytics(googleAnalytics: GoogleAnalyticsConnectorProfileCredentialsProperty) {
        cdkBuilder.googleAnalytics(googleAnalytics.let(GoogleAnalyticsConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param googleAnalytics The connector-specific credentials required when using Google
       * Analytics.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb30e74d46c198db42bf392ba83b60f71c4b33d2e41625918bebf390c571c507")
      override
          fun googleAnalytics(googleAnalytics: GoogleAnalyticsConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit =
          googleAnalytics(GoogleAnalyticsConnectorProfileCredentialsProperty(googleAnalytics))

      /**
       * @param inforNexus The connector-specific credentials required when using Infor Nexus.
       */
      override fun inforNexus(inforNexus: IResolvable) {
        cdkBuilder.inforNexus(inforNexus.let(IResolvable::unwrap))
      }

      /**
       * @param inforNexus The connector-specific credentials required when using Infor Nexus.
       */
      override fun inforNexus(inforNexus: InforNexusConnectorProfileCredentialsProperty) {
        cdkBuilder.inforNexus(inforNexus.let(InforNexusConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param inforNexus The connector-specific credentials required when using Infor Nexus.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8acbe30d4da577abfa3193ab8a767edd13ec6ca3478ecf140ff83c3285c438c0")
      override
          fun inforNexus(inforNexus: InforNexusConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = inforNexus(InforNexusConnectorProfileCredentialsProperty(inforNexus))

      /**
       * @param marketo The connector-specific credentials required when using Marketo.
       */
      override fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo.let(IResolvable::unwrap))
      }

      /**
       * @param marketo The connector-specific credentials required when using Marketo.
       */
      override fun marketo(marketo: MarketoConnectorProfileCredentialsProperty) {
        cdkBuilder.marketo(marketo.let(MarketoConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param marketo The connector-specific credentials required when using Marketo.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("af93a2d55331477318e73fbfe419cd99ef86085447734542841ad9ea8a6c4c98")
      override fun marketo(marketo: MarketoConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = marketo(MarketoConnectorProfileCredentialsProperty(marketo))

      /**
       * @param pardot The connector-specific credentials required when using Salesforce Pardot.
       */
      override fun pardot(pardot: IResolvable) {
        cdkBuilder.pardot(pardot.let(IResolvable::unwrap))
      }

      /**
       * @param pardot The connector-specific credentials required when using Salesforce Pardot.
       */
      override fun pardot(pardot: PardotConnectorProfileCredentialsProperty) {
        cdkBuilder.pardot(pardot.let(PardotConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param pardot The connector-specific credentials required when using Salesforce Pardot.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c831f31c91ed683a67abeafbf5a5743266097be49831a41f426f4ed1e01c4d9")
      override fun pardot(pardot: PardotConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = pardot(PardotConnectorProfileCredentialsProperty(pardot))

      /**
       * @param redshift The connector-specific credentials required when using Amazon Redshift.
       */
      override fun redshift(redshift: IResolvable) {
        cdkBuilder.redshift(redshift.let(IResolvable::unwrap))
      }

      /**
       * @param redshift The connector-specific credentials required when using Amazon Redshift.
       */
      override fun redshift(redshift: RedshiftConnectorProfileCredentialsProperty) {
        cdkBuilder.redshift(redshift.let(RedshiftConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param redshift The connector-specific credentials required when using Amazon Redshift.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("af49186e8f9f01e2ee0b591799b253cabf5f87c28b08b0d129443942e9fc2300")
      override
          fun redshift(redshift: RedshiftConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = redshift(RedshiftConnectorProfileCredentialsProperty(redshift))

      /**
       * @param salesforce The connector-specific credentials required when using Salesforce.
       */
      override fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce.let(IResolvable::unwrap))
      }

      /**
       * @param salesforce The connector-specific credentials required when using Salesforce.
       */
      override fun salesforce(salesforce: SalesforceConnectorProfileCredentialsProperty) {
        cdkBuilder.salesforce(salesforce.let(SalesforceConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param salesforce The connector-specific credentials required when using Salesforce.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8125096d4230ebacb552ce3d9537159b8a68b9464d2450bd5aa6f1facbe95b0e")
      override
          fun salesforce(salesforce: SalesforceConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = salesforce(SalesforceConnectorProfileCredentialsProperty(salesforce))

      /**
       * @param sapoData The connector-specific profile credentials required when using SAPOData.
       */
      override fun sapoData(sapoData: IResolvable) {
        cdkBuilder.sapoData(sapoData.let(IResolvable::unwrap))
      }

      /**
       * @param sapoData The connector-specific profile credentials required when using SAPOData.
       */
      override fun sapoData(sapoData: SAPODataConnectorProfileCredentialsProperty) {
        cdkBuilder.sapoData(sapoData.let(SAPODataConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param sapoData The connector-specific profile credentials required when using SAPOData.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4eb8222a1406f59b6fa58b7a02bf8901be05d665f914ad45d45ac5fd045f4f4c")
      override
          fun sapoData(sapoData: SAPODataConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = sapoData(SAPODataConnectorProfileCredentialsProperty(sapoData))

      /**
       * @param serviceNow The connector-specific credentials required when using ServiceNow.
       */
      override fun serviceNow(serviceNow: IResolvable) {
        cdkBuilder.serviceNow(serviceNow.let(IResolvable::unwrap))
      }

      /**
       * @param serviceNow The connector-specific credentials required when using ServiceNow.
       */
      override fun serviceNow(serviceNow: ServiceNowConnectorProfileCredentialsProperty) {
        cdkBuilder.serviceNow(serviceNow.let(ServiceNowConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param serviceNow The connector-specific credentials required when using ServiceNow.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b02952e6f6b2fe2b5336744ecbc9f91b211bac85d0f16e3b1f03a113823df128")
      override
          fun serviceNow(serviceNow: ServiceNowConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = serviceNow(ServiceNowConnectorProfileCredentialsProperty(serviceNow))

      /**
       * @param singular The connector-specific credentials required when using Singular.
       */
      override fun singular(singular: IResolvable) {
        cdkBuilder.singular(singular.let(IResolvable::unwrap))
      }

      /**
       * @param singular The connector-specific credentials required when using Singular.
       */
      override fun singular(singular: SingularConnectorProfileCredentialsProperty) {
        cdkBuilder.singular(singular.let(SingularConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param singular The connector-specific credentials required when using Singular.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10de7c54878920efd72a7492da089d5a5b5215db09a83d79d585211a7b854585")
      override
          fun singular(singular: SingularConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = singular(SingularConnectorProfileCredentialsProperty(singular))

      /**
       * @param slack The connector-specific credentials required when using Slack.
       */
      override fun slack(slack: IResolvable) {
        cdkBuilder.slack(slack.let(IResolvable::unwrap))
      }

      /**
       * @param slack The connector-specific credentials required when using Slack.
       */
      override fun slack(slack: SlackConnectorProfileCredentialsProperty) {
        cdkBuilder.slack(slack.let(SlackConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param slack The connector-specific credentials required when using Slack.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e708360ff956de5ae66e5bcf479a906c70976420e0fdf09de88597ae609bcdfe")
      override fun slack(slack: SlackConnectorProfileCredentialsProperty.Builder.() -> Unit): Unit =
          slack(SlackConnectorProfileCredentialsProperty(slack))

      /**
       * @param snowflake The connector-specific credentials required when using Snowflake.
       */
      override fun snowflake(snowflake: IResolvable) {
        cdkBuilder.snowflake(snowflake.let(IResolvable::unwrap))
      }

      /**
       * @param snowflake The connector-specific credentials required when using Snowflake.
       */
      override fun snowflake(snowflake: SnowflakeConnectorProfileCredentialsProperty) {
        cdkBuilder.snowflake(snowflake.let(SnowflakeConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param snowflake The connector-specific credentials required when using Snowflake.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7966e621aa0ec164496005a82ac4e96ad8951af5b97b6b1de9a0ee9f1fe01c6")
      override
          fun snowflake(snowflake: SnowflakeConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = snowflake(SnowflakeConnectorProfileCredentialsProperty(snowflake))

      /**
       * @param trendmicro The connector-specific credentials required when using Trend Micro.
       */
      override fun trendmicro(trendmicro: IResolvable) {
        cdkBuilder.trendmicro(trendmicro.let(IResolvable::unwrap))
      }

      /**
       * @param trendmicro The connector-specific credentials required when using Trend Micro.
       */
      override fun trendmicro(trendmicro: TrendmicroConnectorProfileCredentialsProperty) {
        cdkBuilder.trendmicro(trendmicro.let(TrendmicroConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param trendmicro The connector-specific credentials required when using Trend Micro.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9e50fa6e8affa334e551d0eeb002d38e8cd5ccdd5816cd285234e481ccab15a")
      override
          fun trendmicro(trendmicro: TrendmicroConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = trendmicro(TrendmicroConnectorProfileCredentialsProperty(trendmicro))

      /**
       * @param veeva The connector-specific credentials required when using Veeva.
       */
      override fun veeva(veeva: IResolvable) {
        cdkBuilder.veeva(veeva.let(IResolvable::unwrap))
      }

      /**
       * @param veeva The connector-specific credentials required when using Veeva.
       */
      override fun veeva(veeva: VeevaConnectorProfileCredentialsProperty) {
        cdkBuilder.veeva(veeva.let(VeevaConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param veeva The connector-specific credentials required when using Veeva.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9003ee28121c39c203be2c1846faf43651b82652c7c1232e5aaffd48f12ad32b")
      override fun veeva(veeva: VeevaConnectorProfileCredentialsProperty.Builder.() -> Unit): Unit =
          veeva(VeevaConnectorProfileCredentialsProperty(veeva))

      /**
       * @param zendesk The connector-specific credentials required when using Zendesk.
       */
      override fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk.let(IResolvable::unwrap))
      }

      /**
       * @param zendesk The connector-specific credentials required when using Zendesk.
       */
      override fun zendesk(zendesk: ZendeskConnectorProfileCredentialsProperty) {
        cdkBuilder.zendesk(zendesk.let(ZendeskConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param zendesk The connector-specific credentials required when using Zendesk.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c85e7ef3b51b61014438db51cceae114f0fd4b3e187906252b9a9db8d5fd1406")
      override fun zendesk(zendesk: ZendeskConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = zendesk(ZendeskConnectorProfileCredentialsProperty(zendesk))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), ConnectorProfileCredentialsProperty {
      /**
       * The connector-specific credentials required when using Amplitude.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-amplitude)
       */
      override fun amplitude(): Any? = unwrap(this).getAmplitude()

      /**
       * The connector-specific profile credentials that are required when using the custom
       * connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-customconnector)
       */
      override fun customConnector(): Any? = unwrap(this).getCustomConnector()

      /**
       * The connector-specific credentials required when using Datadog.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-datadog)
       */
      override fun datadog(): Any? = unwrap(this).getDatadog()

      /**
       * The connector-specific credentials required when using Dynatrace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-dynatrace)
       */
      override fun dynatrace(): Any? = unwrap(this).getDynatrace()

      /**
       * The connector-specific credentials required when using Google Analytics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-googleanalytics)
       */
      override fun googleAnalytics(): Any? = unwrap(this).getGoogleAnalytics()

      /**
       * The connector-specific credentials required when using Infor Nexus.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-infornexus)
       */
      override fun inforNexus(): Any? = unwrap(this).getInforNexus()

      /**
       * The connector-specific credentials required when using Marketo.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-marketo)
       */
      override fun marketo(): Any? = unwrap(this).getMarketo()

      /**
       * The connector-specific credentials required when using Salesforce Pardot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-pardot)
       */
      override fun pardot(): Any? = unwrap(this).getPardot()

      /**
       * The connector-specific credentials required when using Amazon Redshift.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-redshift)
       */
      override fun redshift(): Any? = unwrap(this).getRedshift()

      /**
       * The connector-specific credentials required when using Salesforce.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-salesforce)
       */
      override fun salesforce(): Any? = unwrap(this).getSalesforce()

      /**
       * The connector-specific profile credentials required when using SAPOData.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-sapodata)
       */
      override fun sapoData(): Any? = unwrap(this).getSapoData()

      /**
       * The connector-specific credentials required when using ServiceNow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-servicenow)
       */
      override fun serviceNow(): Any? = unwrap(this).getServiceNow()

      /**
       * The connector-specific credentials required when using Singular.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-singular)
       */
      override fun singular(): Any? = unwrap(this).getSingular()

      /**
       * The connector-specific credentials required when using Slack.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-slack)
       */
      override fun slack(): Any? = unwrap(this).getSlack()

      /**
       * The connector-specific credentials required when using Snowflake.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-snowflake)
       */
      override fun snowflake(): Any? = unwrap(this).getSnowflake()

      /**
       * The connector-specific credentials required when using Trend Micro.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-trendmicro)
       */
      override fun trendmicro(): Any? = unwrap(this).getTrendmicro()

      /**
       * The connector-specific credentials required when using Veeva.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-veeva)
       */
      override fun veeva(): Any? = unwrap(this).getVeeva()

      /**
       * The connector-specific credentials required when using Zendesk.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofilecredentials.html#cfn-appflow-connectorprofile-connectorprofilecredentials-zendesk)
       */
      override fun zendesk(): Any? = unwrap(this).getZendesk()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty):
          ConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty
    }
  }

  public interface ConnectorProfileConfigProperty {
    /**
     * The connector-specific credentials required by each connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileconfig.html#cfn-appflow-connectorprofile-connectorprofileconfig-connectorprofilecredentials)
     */
    public fun connectorProfileCredentials(): Any? = unwrap(this).getConnectorProfileCredentials()

    /**
     * The connector-specific properties of the profile configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileconfig.html#cfn-appflow-connectorprofile-connectorprofileconfig-connectorprofileproperties)
     */
    public fun connectorProfileProperties(): Any? = unwrap(this).getConnectorProfileProperties()

    /**
     * A builder for [ConnectorProfileConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectorProfileCredentials The connector-specific credentials required by each
       * connector.
       */
      public fun connectorProfileCredentials(connectorProfileCredentials: IResolvable)

      /**
       * @param connectorProfileCredentials The connector-specific credentials required by each
       * connector.
       */
      public
          fun connectorProfileCredentials(connectorProfileCredentials: ConnectorProfileCredentialsProperty)

      /**
       * @param connectorProfileCredentials The connector-specific credentials required by each
       * connector.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78778b1f9eeaa31c36d3eb49b35214ea9780c33419d1bb5dc2578d2149bbfcbd")
      public
          fun connectorProfileCredentials(connectorProfileCredentials: ConnectorProfileCredentialsProperty.Builder.() -> Unit)

      /**
       * @param connectorProfileProperties The connector-specific properties of the profile
       * configuration.
       */
      public fun connectorProfileProperties(connectorProfileProperties: IResolvable)

      /**
       * @param connectorProfileProperties The connector-specific properties of the profile
       * configuration.
       */
      public
          fun connectorProfileProperties(connectorProfileProperties: ConnectorProfilePropertiesProperty)

      /**
       * @param connectorProfileProperties The connector-specific properties of the profile
       * configuration.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a4f9955d4fa6725ec82e5142587f8d99d8a127f0b14839c12236d96b0fc2301")
      public
          fun connectorProfileProperties(connectorProfileProperties: ConnectorProfilePropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty.builder()

      /**
       * @param connectorProfileCredentials The connector-specific credentials required by each
       * connector.
       */
      override fun connectorProfileCredentials(connectorProfileCredentials: IResolvable) {
        cdkBuilder.connectorProfileCredentials(connectorProfileCredentials.let(IResolvable::unwrap))
      }

      /**
       * @param connectorProfileCredentials The connector-specific credentials required by each
       * connector.
       */
      override
          fun connectorProfileCredentials(connectorProfileCredentials: ConnectorProfileCredentialsProperty) {
        cdkBuilder.connectorProfileCredentials(connectorProfileCredentials.let(ConnectorProfileCredentialsProperty::unwrap))
      }

      /**
       * @param connectorProfileCredentials The connector-specific credentials required by each
       * connector.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78778b1f9eeaa31c36d3eb49b35214ea9780c33419d1bb5dc2578d2149bbfcbd")
      override
          fun connectorProfileCredentials(connectorProfileCredentials: ConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit =
          connectorProfileCredentials(ConnectorProfileCredentialsProperty(connectorProfileCredentials))

      /**
       * @param connectorProfileProperties The connector-specific properties of the profile
       * configuration.
       */
      override fun connectorProfileProperties(connectorProfileProperties: IResolvable) {
        cdkBuilder.connectorProfileProperties(connectorProfileProperties.let(IResolvable::unwrap))
      }

      /**
       * @param connectorProfileProperties The connector-specific properties of the profile
       * configuration.
       */
      override
          fun connectorProfileProperties(connectorProfileProperties: ConnectorProfilePropertiesProperty) {
        cdkBuilder.connectorProfileProperties(connectorProfileProperties.let(ConnectorProfilePropertiesProperty::unwrap))
      }

      /**
       * @param connectorProfileProperties The connector-specific properties of the profile
       * configuration.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a4f9955d4fa6725ec82e5142587f8d99d8a127f0b14839c12236d96b0fc2301")
      override
          fun connectorProfileProperties(connectorProfileProperties: ConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit =
          connectorProfileProperties(ConnectorProfilePropertiesProperty(connectorProfileProperties))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty,
    ) : CdkObject(cdkObject), ConnectorProfileConfigProperty {
      /**
       * The connector-specific credentials required by each connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileconfig.html#cfn-appflow-connectorprofile-connectorprofileconfig-connectorprofilecredentials)
       */
      override fun connectorProfileCredentials(): Any? =
          unwrap(this).getConnectorProfileCredentials()

      /**
       * The connector-specific properties of the profile configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileconfig.html#cfn-appflow-connectorprofile-connectorprofileconfig-connectorprofileproperties)
       */
      override fun connectorProfileProperties(): Any? = unwrap(this).getConnectorProfileProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectorProfileConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty):
          ConnectorProfileConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorProfileConfigProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty
    }
  }

  public interface CustomConnectorProfilePropertiesProperty {
    /**
     * The OAuth 2.0 properties required for OAuth 2.0 authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofileproperties.html#cfn-appflow-connectorprofile-customconnectorprofileproperties-oauth2properties)
     */
    public fun oAuth2Properties(): Any? = unwrap(this).getOAuth2Properties()

    /**
     * A map of properties that are required to create a profile for the custom connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofileproperties.html#cfn-appflow-connectorprofile-customconnectorprofileproperties-profileproperties)
     */
    public fun profileProperties(): Any? = unwrap(this).getProfileProperties()

    /**
     * A builder for [CustomConnectorProfilePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param oAuth2Properties The OAuth 2.0 properties required for OAuth 2.0 authentication.
       */
      public fun oAuth2Properties(oAuth2Properties: IResolvable)

      /**
       * @param oAuth2Properties The OAuth 2.0 properties required for OAuth 2.0 authentication.
       */
      public fun oAuth2Properties(oAuth2Properties: OAuth2PropertiesProperty)

      /**
       * @param oAuth2Properties The OAuth 2.0 properties required for OAuth 2.0 authentication.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b19f4de65de008ed686f361f574db4fd256cbdcbd75798f4357eb0f8a2695bf")
      public fun oAuth2Properties(oAuth2Properties: OAuth2PropertiesProperty.Builder.() -> Unit)

      /**
       * @param profileProperties A map of properties that are required to create a profile for the
       * custom connector.
       */
      public fun profileProperties(profileProperties: IResolvable)

      /**
       * @param profileProperties A map of properties that are required to create a profile for the
       * custom connector.
       */
      public fun profileProperties(profileProperties: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfilePropertiesProperty.builder()

      /**
       * @param oAuth2Properties The OAuth 2.0 properties required for OAuth 2.0 authentication.
       */
      override fun oAuth2Properties(oAuth2Properties: IResolvable) {
        cdkBuilder.oAuth2Properties(oAuth2Properties.let(IResolvable::unwrap))
      }

      /**
       * @param oAuth2Properties The OAuth 2.0 properties required for OAuth 2.0 authentication.
       */
      override fun oAuth2Properties(oAuth2Properties: OAuth2PropertiesProperty) {
        cdkBuilder.oAuth2Properties(oAuth2Properties.let(OAuth2PropertiesProperty::unwrap))
      }

      /**
       * @param oAuth2Properties The OAuth 2.0 properties required for OAuth 2.0 authentication.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b19f4de65de008ed686f361f574db4fd256cbdcbd75798f4357eb0f8a2695bf")
      override fun oAuth2Properties(oAuth2Properties: OAuth2PropertiesProperty.Builder.() -> Unit):
          Unit = oAuth2Properties(OAuth2PropertiesProperty(oAuth2Properties))

      /**
       * @param profileProperties A map of properties that are required to create a profile for the
       * custom connector.
       */
      override fun profileProperties(profileProperties: IResolvable) {
        cdkBuilder.profileProperties(profileProperties.let(IResolvable::unwrap))
      }

      /**
       * @param profileProperties A map of properties that are required to create a profile for the
       * custom connector.
       */
      override fun profileProperties(profileProperties: Map<String, String>) {
        cdkBuilder.profileProperties(profileProperties)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), CustomConnectorProfilePropertiesProperty {
      /**
       * The OAuth 2.0 properties required for OAuth 2.0 authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofileproperties.html#cfn-appflow-connectorprofile-customconnectorprofileproperties-oauth2properties)
       */
      override fun oAuth2Properties(): Any? = unwrap(this).getOAuth2Properties()

      /**
       * A map of properties that are required to create a profile for the custom connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofileproperties.html#cfn-appflow-connectorprofile-customconnectorprofileproperties-profileproperties)
       */
      override fun profileProperties(): Any? = unwrap(this).getProfileProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfilePropertiesProperty):
          CustomConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfilePropertiesProperty
    }
  }

  public interface SnowflakeConnectorProfileCredentialsProperty {
    /**
     * The password that corresponds to the user name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofilecredentials.html#cfn-appflow-connectorprofile-snowflakeconnectorprofilecredentials-password)
     */
    public fun password(): String

    /**
     * The name of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofilecredentials.html#cfn-appflow-connectorprofile-snowflakeconnectorprofilecredentials-username)
     */
    public fun username(): String

    /**
     * A builder for [SnowflakeConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param password The password that corresponds to the user name. 
       */
      public fun password(password: String)

      /**
       * @param username The name of the user. 
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty.builder()

      /**
       * @param password The password that corresponds to the user name. 
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param username The name of the user. 
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), SnowflakeConnectorProfileCredentialsProperty {
      /**
       * The password that corresponds to the user name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofilecredentials.html#cfn-appflow-connectorprofile-snowflakeconnectorprofilecredentials-password)
       */
      override fun password(): String = unwrap(this).getPassword()

      /**
       * The name of the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofilecredentials.html#cfn-appflow-connectorprofile-snowflakeconnectorprofilecredentials-username)
       */
      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SnowflakeConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty):
          SnowflakeConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnowflakeConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty
    }
  }

  public interface OAuthCredentialsProperty {
    /**
     * The access token used to access protected SAPOData resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthcredentials.html#cfn-appflow-connectorprofile-oauthcredentials-accesstoken)
     */
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    /**
     * The identifier for the desired client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthcredentials.html#cfn-appflow-connectorprofile-oauthcredentials-clientid)
     */
    public fun clientId(): String? = unwrap(this).getClientId()

    /**
     * The client secret used by the OAuth client to authenticate to the authorization server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthcredentials.html#cfn-appflow-connectorprofile-oauthcredentials-clientsecret)
     */
    public fun clientSecret(): String? = unwrap(this).getClientSecret()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthcredentials.html#cfn-appflow-connectorprofile-oauthcredentials-connectoroauthrequest)
     */
    public fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

    /**
     * The refresh token used to refresh expired access token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthcredentials.html#cfn-appflow-connectorprofile-oauthcredentials-refreshtoken)
     */
    public fun refreshToken(): String? = unwrap(this).getRefreshToken()

    /**
     * A builder for [OAuthCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessToken The access token used to access protected SAPOData resources.
       */
      public fun accessToken(accessToken: String)

      /**
       * @param clientId The identifier for the desired client.
       */
      public fun clientId(clientId: String)

      /**
       * @param clientSecret The client secret used by the OAuth client to authenticate to the
       * authorization server.
       */
      public fun clientSecret(clientSecret: String)

      /**
       * @param connectorOAuthRequest the value to be set.
       */
      public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable)

      /**
       * @param connectorOAuthRequest the value to be set.
       */
      public fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty)

      /**
       * @param connectorOAuthRequest the value to be set.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8442f2194e283e001ea82ffc637844ff009a16f0f2c0533ea53c18d98645acd7")
      public
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit)

      /**
       * @param refreshToken The refresh token used to refresh expired access token.
       */
      public fun refreshToken(refreshToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthCredentialsProperty.builder()

      /**
       * @param accessToken The access token used to access protected SAPOData resources.
       */
      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      /**
       * @param clientId The identifier for the desired client.
       */
      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      /**
       * @param clientSecret The client secret used by the OAuth client to authenticate to the
       * authorization server.
       */
      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      /**
       * @param connectorOAuthRequest the value to be set.
       */
      override fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(IResolvable::unwrap))
      }

      /**
       * @param connectorOAuthRequest the value to be set.
       */
      override fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(ConnectorOAuthRequestProperty::unwrap))
      }

      /**
       * @param connectorOAuthRequest the value to be set.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8442f2194e283e001ea82ffc637844ff009a16f0f2c0533ea53c18d98645acd7")
      override
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit):
          Unit = connectorOAuthRequest(ConnectorOAuthRequestProperty(connectorOAuthRequest))

      /**
       * @param refreshToken The refresh token used to refresh expired access token.
       */
      override fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthCredentialsProperty,
    ) : CdkObject(cdkObject), OAuthCredentialsProperty {
      /**
       * The access token used to access protected SAPOData resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthcredentials.html#cfn-appflow-connectorprofile-oauthcredentials-accesstoken)
       */
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      /**
       * The identifier for the desired client.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthcredentials.html#cfn-appflow-connectorprofile-oauthcredentials-clientid)
       */
      override fun clientId(): String? = unwrap(this).getClientId()

      /**
       * The client secret used by the OAuth client to authenticate to the authorization server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthcredentials.html#cfn-appflow-connectorprofile-oauthcredentials-clientsecret)
       */
      override fun clientSecret(): String? = unwrap(this).getClientSecret()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthcredentials.html#cfn-appflow-connectorprofile-oauthcredentials-connectoroauthrequest)
       */
      override fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

      /**
       * The refresh token used to refresh expired access token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthcredentials.html#cfn-appflow-connectorprofile-oauthcredentials-refreshtoken)
       */
      override fun refreshToken(): String? = unwrap(this).getRefreshToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OAuthCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthCredentialsProperty):
          OAuthCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OAuthCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthCredentialsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthCredentialsProperty
    }
  }

  public interface ConnectorProfilePropertiesProperty {
    /**
     * The properties required by the custom connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-customconnector)
     */
    public fun customConnector(): Any? = unwrap(this).getCustomConnector()

    /**
     * The connector-specific properties required by Datadog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-datadog)
     */
    public fun datadog(): Any? = unwrap(this).getDatadog()

    /**
     * The connector-specific properties required by Dynatrace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-dynatrace)
     */
    public fun dynatrace(): Any? = unwrap(this).getDynatrace()

    /**
     * The connector-specific properties required by Infor Nexus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-infornexus)
     */
    public fun inforNexus(): Any? = unwrap(this).getInforNexus()

    /**
     * The connector-specific properties required by Marketo.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-marketo)
     */
    public fun marketo(): Any? = unwrap(this).getMarketo()

    /**
     * The connector-specific properties required by Salesforce Pardot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-pardot)
     */
    public fun pardot(): Any? = unwrap(this).getPardot()

    /**
     * The connector-specific properties required by Amazon Redshift.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-redshift)
     */
    public fun redshift(): Any? = unwrap(this).getRedshift()

    /**
     * The connector-specific properties required by Salesforce.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-salesforce)
     */
    public fun salesforce(): Any? = unwrap(this).getSalesforce()

    /**
     * The connector-specific profile properties required when using SAPOData.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-sapodata)
     */
    public fun sapoData(): Any? = unwrap(this).getSapoData()

    /**
     * The connector-specific properties required by serviceNow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-servicenow)
     */
    public fun serviceNow(): Any? = unwrap(this).getServiceNow()

    /**
     * The connector-specific properties required by Slack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-slack)
     */
    public fun slack(): Any? = unwrap(this).getSlack()

    /**
     * The connector-specific properties required by Snowflake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-snowflake)
     */
    public fun snowflake(): Any? = unwrap(this).getSnowflake()

    /**
     * The connector-specific properties required by Veeva.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-veeva)
     */
    public fun veeva(): Any? = unwrap(this).getVeeva()

    /**
     * The connector-specific properties required by Zendesk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-zendesk)
     */
    public fun zendesk(): Any? = unwrap(this).getZendesk()

    /**
     * A builder for [ConnectorProfilePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customConnector The properties required by the custom connector.
       */
      public fun customConnector(customConnector: IResolvable)

      /**
       * @param customConnector The properties required by the custom connector.
       */
      public fun customConnector(customConnector: CustomConnectorProfilePropertiesProperty)

      /**
       * @param customConnector The properties required by the custom connector.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83ee810629f8884c96faf678459b8f71a6aff8dc0721cfeee24e12718451451e")
      public
          fun customConnector(customConnector: CustomConnectorProfilePropertiesProperty.Builder.() -> Unit)

      /**
       * @param datadog The connector-specific properties required by Datadog.
       */
      public fun datadog(datadog: IResolvable)

      /**
       * @param datadog The connector-specific properties required by Datadog.
       */
      public fun datadog(datadog: DatadogConnectorProfilePropertiesProperty)

      /**
       * @param datadog The connector-specific properties required by Datadog.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c564a6fb3733938ad2bcfacebbf309873dd15a6e5d2ac56e4a61c8845a49d419")
      public fun datadog(datadog: DatadogConnectorProfilePropertiesProperty.Builder.() -> Unit)

      /**
       * @param dynatrace The connector-specific properties required by Dynatrace.
       */
      public fun dynatrace(dynatrace: IResolvable)

      /**
       * @param dynatrace The connector-specific properties required by Dynatrace.
       */
      public fun dynatrace(dynatrace: DynatraceConnectorProfilePropertiesProperty)

      /**
       * @param dynatrace The connector-specific properties required by Dynatrace.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0883adb236b23111878b40eed90b7e6f96d38a81f41b484d0f296ecaa758e80")
      public
          fun dynatrace(dynatrace: DynatraceConnectorProfilePropertiesProperty.Builder.() -> Unit)

      /**
       * @param inforNexus The connector-specific properties required by Infor Nexus.
       */
      public fun inforNexus(inforNexus: IResolvable)

      /**
       * @param inforNexus The connector-specific properties required by Infor Nexus.
       */
      public fun inforNexus(inforNexus: InforNexusConnectorProfilePropertiesProperty)

      /**
       * @param inforNexus The connector-specific properties required by Infor Nexus.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("051420319c8592948cadaa21137f85123ef95f0ca61745555b707071e757d0b2")
      public
          fun inforNexus(inforNexus: InforNexusConnectorProfilePropertiesProperty.Builder.() -> Unit)

      /**
       * @param marketo The connector-specific properties required by Marketo.
       */
      public fun marketo(marketo: IResolvable)

      /**
       * @param marketo The connector-specific properties required by Marketo.
       */
      public fun marketo(marketo: MarketoConnectorProfilePropertiesProperty)

      /**
       * @param marketo The connector-specific properties required by Marketo.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1336f043e62dbd2f2a97f99366ae7872013e4e199a6a49e3f8eaf1cd122ab697")
      public fun marketo(marketo: MarketoConnectorProfilePropertiesProperty.Builder.() -> Unit)

      /**
       * @param pardot The connector-specific properties required by Salesforce Pardot.
       */
      public fun pardot(pardot: IResolvable)

      /**
       * @param pardot The connector-specific properties required by Salesforce Pardot.
       */
      public fun pardot(pardot: PardotConnectorProfilePropertiesProperty)

      /**
       * @param pardot The connector-specific properties required by Salesforce Pardot.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c65da59347459711bc397bb3dbc1ec11dae4eac674f001a943e7ebe90ab2b307")
      public fun pardot(pardot: PardotConnectorProfilePropertiesProperty.Builder.() -> Unit)

      /**
       * @param redshift The connector-specific properties required by Amazon Redshift.
       */
      public fun redshift(redshift: IResolvable)

      /**
       * @param redshift The connector-specific properties required by Amazon Redshift.
       */
      public fun redshift(redshift: RedshiftConnectorProfilePropertiesProperty)

      /**
       * @param redshift The connector-specific properties required by Amazon Redshift.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c13aad35344297979d923d223a184df47ac30b340e609c650481cdfe3bf619b6")
      public fun redshift(redshift: RedshiftConnectorProfilePropertiesProperty.Builder.() -> Unit)

      /**
       * @param salesforce The connector-specific properties required by Salesforce.
       */
      public fun salesforce(salesforce: IResolvable)

      /**
       * @param salesforce The connector-specific properties required by Salesforce.
       */
      public fun salesforce(salesforce: SalesforceConnectorProfilePropertiesProperty)

      /**
       * @param salesforce The connector-specific properties required by Salesforce.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0c8bb30e7f3bbbf0e1f8d359eeb8680400ad1b9b8b063c92617b0d9a6617476")
      public
          fun salesforce(salesforce: SalesforceConnectorProfilePropertiesProperty.Builder.() -> Unit)

      /**
       * @param sapoData The connector-specific profile properties required when using SAPOData.
       */
      public fun sapoData(sapoData: IResolvable)

      /**
       * @param sapoData The connector-specific profile properties required when using SAPOData.
       */
      public fun sapoData(sapoData: SAPODataConnectorProfilePropertiesProperty)

      /**
       * @param sapoData The connector-specific profile properties required when using SAPOData.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("525711f5aee270541e888570d39f5dab16dd025dfb56a4688018951e1d0f0709")
      public fun sapoData(sapoData: SAPODataConnectorProfilePropertiesProperty.Builder.() -> Unit)

      /**
       * @param serviceNow The connector-specific properties required by serviceNow.
       */
      public fun serviceNow(serviceNow: IResolvable)

      /**
       * @param serviceNow The connector-specific properties required by serviceNow.
       */
      public fun serviceNow(serviceNow: ServiceNowConnectorProfilePropertiesProperty)

      /**
       * @param serviceNow The connector-specific properties required by serviceNow.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccf15b390387c3eaf011d5bdf432a4803e240844a47ffa39ddb04da730293d25")
      public
          fun serviceNow(serviceNow: ServiceNowConnectorProfilePropertiesProperty.Builder.() -> Unit)

      /**
       * @param slack The connector-specific properties required by Slack.
       */
      public fun slack(slack: IResolvable)

      /**
       * @param slack The connector-specific properties required by Slack.
       */
      public fun slack(slack: SlackConnectorProfilePropertiesProperty)

      /**
       * @param slack The connector-specific properties required by Slack.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a97573d8fe1cf050e5807ba73d78f36907be09ba79653422c392f7acd4e2e21")
      public fun slack(slack: SlackConnectorProfilePropertiesProperty.Builder.() -> Unit)

      /**
       * @param snowflake The connector-specific properties required by Snowflake.
       */
      public fun snowflake(snowflake: IResolvable)

      /**
       * @param snowflake The connector-specific properties required by Snowflake.
       */
      public fun snowflake(snowflake: SnowflakeConnectorProfilePropertiesProperty)

      /**
       * @param snowflake The connector-specific properties required by Snowflake.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be797d1bb2569029d64440c81f0ae5c1c97e51fc93c238a0ea4b6521e1b4f907")
      public
          fun snowflake(snowflake: SnowflakeConnectorProfilePropertiesProperty.Builder.() -> Unit)

      /**
       * @param veeva The connector-specific properties required by Veeva.
       */
      public fun veeva(veeva: IResolvable)

      /**
       * @param veeva The connector-specific properties required by Veeva.
       */
      public fun veeva(veeva: VeevaConnectorProfilePropertiesProperty)

      /**
       * @param veeva The connector-specific properties required by Veeva.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd5533750d9a06d562f5148d5e41ba2bdfb626ac3643765b9667b5fbf56bb147")
      public fun veeva(veeva: VeevaConnectorProfilePropertiesProperty.Builder.() -> Unit)

      /**
       * @param zendesk The connector-specific properties required by Zendesk.
       */
      public fun zendesk(zendesk: IResolvable)

      /**
       * @param zendesk The connector-specific properties required by Zendesk.
       */
      public fun zendesk(zendesk: ZendeskConnectorProfilePropertiesProperty)

      /**
       * @param zendesk The connector-specific properties required by Zendesk.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fd1044e8d4e16eceae0c81d6ec1ad2034a55fdfc8d4078d99dcf3144bb8dc9c2")
      public fun zendesk(zendesk: ZendeskConnectorProfilePropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty.builder()

      /**
       * @param customConnector The properties required by the custom connector.
       */
      override fun customConnector(customConnector: IResolvable) {
        cdkBuilder.customConnector(customConnector.let(IResolvable::unwrap))
      }

      /**
       * @param customConnector The properties required by the custom connector.
       */
      override fun customConnector(customConnector: CustomConnectorProfilePropertiesProperty) {
        cdkBuilder.customConnector(customConnector.let(CustomConnectorProfilePropertiesProperty::unwrap))
      }

      /**
       * @param customConnector The properties required by the custom connector.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83ee810629f8884c96faf678459b8f71a6aff8dc0721cfeee24e12718451451e")
      override
          fun customConnector(customConnector: CustomConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = customConnector(CustomConnectorProfilePropertiesProperty(customConnector))

      /**
       * @param datadog The connector-specific properties required by Datadog.
       */
      override fun datadog(datadog: IResolvable) {
        cdkBuilder.datadog(datadog.let(IResolvable::unwrap))
      }

      /**
       * @param datadog The connector-specific properties required by Datadog.
       */
      override fun datadog(datadog: DatadogConnectorProfilePropertiesProperty) {
        cdkBuilder.datadog(datadog.let(DatadogConnectorProfilePropertiesProperty::unwrap))
      }

      /**
       * @param datadog The connector-specific properties required by Datadog.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c564a6fb3733938ad2bcfacebbf309873dd15a6e5d2ac56e4a61c8845a49d419")
      override fun datadog(datadog: DatadogConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = datadog(DatadogConnectorProfilePropertiesProperty(datadog))

      /**
       * @param dynatrace The connector-specific properties required by Dynatrace.
       */
      override fun dynatrace(dynatrace: IResolvable) {
        cdkBuilder.dynatrace(dynatrace.let(IResolvable::unwrap))
      }

      /**
       * @param dynatrace The connector-specific properties required by Dynatrace.
       */
      override fun dynatrace(dynatrace: DynatraceConnectorProfilePropertiesProperty) {
        cdkBuilder.dynatrace(dynatrace.let(DynatraceConnectorProfilePropertiesProperty::unwrap))
      }

      /**
       * @param dynatrace The connector-specific properties required by Dynatrace.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0883adb236b23111878b40eed90b7e6f96d38a81f41b484d0f296ecaa758e80")
      override
          fun dynatrace(dynatrace: DynatraceConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = dynatrace(DynatraceConnectorProfilePropertiesProperty(dynatrace))

      /**
       * @param inforNexus The connector-specific properties required by Infor Nexus.
       */
      override fun inforNexus(inforNexus: IResolvable) {
        cdkBuilder.inforNexus(inforNexus.let(IResolvable::unwrap))
      }

      /**
       * @param inforNexus The connector-specific properties required by Infor Nexus.
       */
      override fun inforNexus(inforNexus: InforNexusConnectorProfilePropertiesProperty) {
        cdkBuilder.inforNexus(inforNexus.let(InforNexusConnectorProfilePropertiesProperty::unwrap))
      }

      /**
       * @param inforNexus The connector-specific properties required by Infor Nexus.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("051420319c8592948cadaa21137f85123ef95f0ca61745555b707071e757d0b2")
      override
          fun inforNexus(inforNexus: InforNexusConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = inforNexus(InforNexusConnectorProfilePropertiesProperty(inforNexus))

      /**
       * @param marketo The connector-specific properties required by Marketo.
       */
      override fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo.let(IResolvable::unwrap))
      }

      /**
       * @param marketo The connector-specific properties required by Marketo.
       */
      override fun marketo(marketo: MarketoConnectorProfilePropertiesProperty) {
        cdkBuilder.marketo(marketo.let(MarketoConnectorProfilePropertiesProperty::unwrap))
      }

      /**
       * @param marketo The connector-specific properties required by Marketo.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1336f043e62dbd2f2a97f99366ae7872013e4e199a6a49e3f8eaf1cd122ab697")
      override fun marketo(marketo: MarketoConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = marketo(MarketoConnectorProfilePropertiesProperty(marketo))

      /**
       * @param pardot The connector-specific properties required by Salesforce Pardot.
       */
      override fun pardot(pardot: IResolvable) {
        cdkBuilder.pardot(pardot.let(IResolvable::unwrap))
      }

      /**
       * @param pardot The connector-specific properties required by Salesforce Pardot.
       */
      override fun pardot(pardot: PardotConnectorProfilePropertiesProperty) {
        cdkBuilder.pardot(pardot.let(PardotConnectorProfilePropertiesProperty::unwrap))
      }

      /**
       * @param pardot The connector-specific properties required by Salesforce Pardot.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c65da59347459711bc397bb3dbc1ec11dae4eac674f001a943e7ebe90ab2b307")
      override fun pardot(pardot: PardotConnectorProfilePropertiesProperty.Builder.() -> Unit): Unit
          = pardot(PardotConnectorProfilePropertiesProperty(pardot))

      /**
       * @param redshift The connector-specific properties required by Amazon Redshift.
       */
      override fun redshift(redshift: IResolvable) {
        cdkBuilder.redshift(redshift.let(IResolvable::unwrap))
      }

      /**
       * @param redshift The connector-specific properties required by Amazon Redshift.
       */
      override fun redshift(redshift: RedshiftConnectorProfilePropertiesProperty) {
        cdkBuilder.redshift(redshift.let(RedshiftConnectorProfilePropertiesProperty::unwrap))
      }

      /**
       * @param redshift The connector-specific properties required by Amazon Redshift.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c13aad35344297979d923d223a184df47ac30b340e609c650481cdfe3bf619b6")
      override
          fun redshift(redshift: RedshiftConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = redshift(RedshiftConnectorProfilePropertiesProperty(redshift))

      /**
       * @param salesforce The connector-specific properties required by Salesforce.
       */
      override fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce.let(IResolvable::unwrap))
      }

      /**
       * @param salesforce The connector-specific properties required by Salesforce.
       */
      override fun salesforce(salesforce: SalesforceConnectorProfilePropertiesProperty) {
        cdkBuilder.salesforce(salesforce.let(SalesforceConnectorProfilePropertiesProperty::unwrap))
      }

      /**
       * @param salesforce The connector-specific properties required by Salesforce.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0c8bb30e7f3bbbf0e1f8d359eeb8680400ad1b9b8b063c92617b0d9a6617476")
      override
          fun salesforce(salesforce: SalesforceConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = salesforce(SalesforceConnectorProfilePropertiesProperty(salesforce))

      /**
       * @param sapoData The connector-specific profile properties required when using SAPOData.
       */
      override fun sapoData(sapoData: IResolvable) {
        cdkBuilder.sapoData(sapoData.let(IResolvable::unwrap))
      }

      /**
       * @param sapoData The connector-specific profile properties required when using SAPOData.
       */
      override fun sapoData(sapoData: SAPODataConnectorProfilePropertiesProperty) {
        cdkBuilder.sapoData(sapoData.let(SAPODataConnectorProfilePropertiesProperty::unwrap))
      }

      /**
       * @param sapoData The connector-specific profile properties required when using SAPOData.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("525711f5aee270541e888570d39f5dab16dd025dfb56a4688018951e1d0f0709")
      override
          fun sapoData(sapoData: SAPODataConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = sapoData(SAPODataConnectorProfilePropertiesProperty(sapoData))

      /**
       * @param serviceNow The connector-specific properties required by serviceNow.
       */
      override fun serviceNow(serviceNow: IResolvable) {
        cdkBuilder.serviceNow(serviceNow.let(IResolvable::unwrap))
      }

      /**
       * @param serviceNow The connector-specific properties required by serviceNow.
       */
      override fun serviceNow(serviceNow: ServiceNowConnectorProfilePropertiesProperty) {
        cdkBuilder.serviceNow(serviceNow.let(ServiceNowConnectorProfilePropertiesProperty::unwrap))
      }

      /**
       * @param serviceNow The connector-specific properties required by serviceNow.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccf15b390387c3eaf011d5bdf432a4803e240844a47ffa39ddb04da730293d25")
      override
          fun serviceNow(serviceNow: ServiceNowConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = serviceNow(ServiceNowConnectorProfilePropertiesProperty(serviceNow))

      /**
       * @param slack The connector-specific properties required by Slack.
       */
      override fun slack(slack: IResolvable) {
        cdkBuilder.slack(slack.let(IResolvable::unwrap))
      }

      /**
       * @param slack The connector-specific properties required by Slack.
       */
      override fun slack(slack: SlackConnectorProfilePropertiesProperty) {
        cdkBuilder.slack(slack.let(SlackConnectorProfilePropertiesProperty::unwrap))
      }

      /**
       * @param slack The connector-specific properties required by Slack.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a97573d8fe1cf050e5807ba73d78f36907be09ba79653422c392f7acd4e2e21")
      override fun slack(slack: SlackConnectorProfilePropertiesProperty.Builder.() -> Unit): Unit =
          slack(SlackConnectorProfilePropertiesProperty(slack))

      /**
       * @param snowflake The connector-specific properties required by Snowflake.
       */
      override fun snowflake(snowflake: IResolvable) {
        cdkBuilder.snowflake(snowflake.let(IResolvable::unwrap))
      }

      /**
       * @param snowflake The connector-specific properties required by Snowflake.
       */
      override fun snowflake(snowflake: SnowflakeConnectorProfilePropertiesProperty) {
        cdkBuilder.snowflake(snowflake.let(SnowflakeConnectorProfilePropertiesProperty::unwrap))
      }

      /**
       * @param snowflake The connector-specific properties required by Snowflake.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be797d1bb2569029d64440c81f0ae5c1c97e51fc93c238a0ea4b6521e1b4f907")
      override
          fun snowflake(snowflake: SnowflakeConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = snowflake(SnowflakeConnectorProfilePropertiesProperty(snowflake))

      /**
       * @param veeva The connector-specific properties required by Veeva.
       */
      override fun veeva(veeva: IResolvable) {
        cdkBuilder.veeva(veeva.let(IResolvable::unwrap))
      }

      /**
       * @param veeva The connector-specific properties required by Veeva.
       */
      override fun veeva(veeva: VeevaConnectorProfilePropertiesProperty) {
        cdkBuilder.veeva(veeva.let(VeevaConnectorProfilePropertiesProperty::unwrap))
      }

      /**
       * @param veeva The connector-specific properties required by Veeva.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd5533750d9a06d562f5148d5e41ba2bdfb626ac3643765b9667b5fbf56bb147")
      override fun veeva(veeva: VeevaConnectorProfilePropertiesProperty.Builder.() -> Unit): Unit =
          veeva(VeevaConnectorProfilePropertiesProperty(veeva))

      /**
       * @param zendesk The connector-specific properties required by Zendesk.
       */
      override fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk.let(IResolvable::unwrap))
      }

      /**
       * @param zendesk The connector-specific properties required by Zendesk.
       */
      override fun zendesk(zendesk: ZendeskConnectorProfilePropertiesProperty) {
        cdkBuilder.zendesk(zendesk.let(ZendeskConnectorProfilePropertiesProperty::unwrap))
      }

      /**
       * @param zendesk The connector-specific properties required by Zendesk.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fd1044e8d4e16eceae0c81d6ec1ad2034a55fdfc8d4078d99dcf3144bb8dc9c2")
      override fun zendesk(zendesk: ZendeskConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = zendesk(ZendeskConnectorProfilePropertiesProperty(zendesk))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), ConnectorProfilePropertiesProperty {
      /**
       * The properties required by the custom connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-customconnector)
       */
      override fun customConnector(): Any? = unwrap(this).getCustomConnector()

      /**
       * The connector-specific properties required by Datadog.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-datadog)
       */
      override fun datadog(): Any? = unwrap(this).getDatadog()

      /**
       * The connector-specific properties required by Dynatrace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-dynatrace)
       */
      override fun dynatrace(): Any? = unwrap(this).getDynatrace()

      /**
       * The connector-specific properties required by Infor Nexus.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-infornexus)
       */
      override fun inforNexus(): Any? = unwrap(this).getInforNexus()

      /**
       * The connector-specific properties required by Marketo.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-marketo)
       */
      override fun marketo(): Any? = unwrap(this).getMarketo()

      /**
       * The connector-specific properties required by Salesforce Pardot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-pardot)
       */
      override fun pardot(): Any? = unwrap(this).getPardot()

      /**
       * The connector-specific properties required by Amazon Redshift.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-redshift)
       */
      override fun redshift(): Any? = unwrap(this).getRedshift()

      /**
       * The connector-specific properties required by Salesforce.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-salesforce)
       */
      override fun salesforce(): Any? = unwrap(this).getSalesforce()

      /**
       * The connector-specific profile properties required when using SAPOData.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-sapodata)
       */
      override fun sapoData(): Any? = unwrap(this).getSapoData()

      /**
       * The connector-specific properties required by serviceNow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-servicenow)
       */
      override fun serviceNow(): Any? = unwrap(this).getServiceNow()

      /**
       * The connector-specific properties required by Slack.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-slack)
       */
      override fun slack(): Any? = unwrap(this).getSlack()

      /**
       * The connector-specific properties required by Snowflake.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-snowflake)
       */
      override fun snowflake(): Any? = unwrap(this).getSnowflake()

      /**
       * The connector-specific properties required by Veeva.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-veeva)
       */
      override fun veeva(): Any? = unwrap(this).getVeeva()

      /**
       * The connector-specific properties required by Zendesk.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectorprofileproperties.html#cfn-appflow-connectorprofile-connectorprofileproperties-zendesk)
       */
      override fun zendesk(): Any? = unwrap(this).getZendesk()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty):
          ConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty
    }
  }

  public interface DynatraceConnectorProfilePropertiesProperty {
    /**
     * The location of the Dynatrace resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-dynatraceconnectorprofileproperties.html#cfn-appflow-connectorprofile-dynatraceconnectorprofileproperties-instanceurl)
     */
    public fun instanceUrl(): String

    /**
     * A builder for [DynatraceConnectorProfilePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceUrl The location of the Dynatrace resource. 
       */
      public fun instanceUrl(instanceUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty.builder()

      /**
       * @param instanceUrl The location of the Dynatrace resource. 
       */
      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), DynatraceConnectorProfilePropertiesProperty {
      /**
       * The location of the Dynatrace resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-dynatraceconnectorprofileproperties.html#cfn-appflow-connectorprofile-dynatraceconnectorprofileproperties-instanceurl)
       */
      override fun instanceUrl(): String = unwrap(this).getInstanceUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DynatraceConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty):
          DynatraceConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynatraceConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty
    }
  }

  public interface InforNexusConnectorProfilePropertiesProperty {
    /**
     * The location of the Infor Nexus resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-infornexusconnectorprofileproperties.html#cfn-appflow-connectorprofile-infornexusconnectorprofileproperties-instanceurl)
     */
    public fun instanceUrl(): String

    /**
     * A builder for [InforNexusConnectorProfilePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceUrl The location of the Infor Nexus resource. 
       */
      public fun instanceUrl(instanceUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty.builder()

      /**
       * @param instanceUrl The location of the Infor Nexus resource. 
       */
      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), InforNexusConnectorProfilePropertiesProperty {
      /**
       * The location of the Infor Nexus resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-infornexusconnectorprofileproperties.html#cfn-appflow-connectorprofile-infornexusconnectorprofileproperties-instanceurl)
       */
      override fun instanceUrl(): String = unwrap(this).getInstanceUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InforNexusConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty):
          InforNexusConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InforNexusConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty
    }
  }

  public interface OAuthPropertiesProperty {
    /**
     * The authorization code url required to redirect to SAP Login Page to fetch authorization code
     * for OAuth type authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthproperties.html#cfn-appflow-connectorprofile-oauthproperties-authcodeurl)
     */
    public fun authCodeUrl(): String? = unwrap(this).getAuthCodeUrl()

    /**
     * The OAuth scopes required for OAuth type authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthproperties.html#cfn-appflow-connectorprofile-oauthproperties-oauthscopes)
     */
    public fun oAuthScopes(): List<String> = unwrap(this).getOAuthScopes() ?: emptyList()

    /**
     * The token url required to fetch access/refresh tokens using authorization code and also to
     * refresh expired access token using refresh token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthproperties.html#cfn-appflow-connectorprofile-oauthproperties-tokenurl)
     */
    public fun tokenUrl(): String? = unwrap(this).getTokenUrl()

    /**
     * A builder for [OAuthPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authCodeUrl The authorization code url required to redirect to SAP Login Page to
       * fetch authorization code for OAuth type authentication.
       */
      public fun authCodeUrl(authCodeUrl: String)

      /**
       * @param oAuthScopes The OAuth scopes required for OAuth type authentication.
       */
      public fun oAuthScopes(oAuthScopes: List<String>)

      /**
       * @param oAuthScopes The OAuth scopes required for OAuth type authentication.
       */
      public fun oAuthScopes(vararg oAuthScopes: String)

      /**
       * @param tokenUrl The token url required to fetch access/refresh tokens using authorization
       * code and also to refresh expired access token using refresh token.
       */
      public fun tokenUrl(tokenUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty.builder()

      /**
       * @param authCodeUrl The authorization code url required to redirect to SAP Login Page to
       * fetch authorization code for OAuth type authentication.
       */
      override fun authCodeUrl(authCodeUrl: String) {
        cdkBuilder.authCodeUrl(authCodeUrl)
      }

      /**
       * @param oAuthScopes The OAuth scopes required for OAuth type authentication.
       */
      override fun oAuthScopes(oAuthScopes: List<String>) {
        cdkBuilder.oAuthScopes(oAuthScopes)
      }

      /**
       * @param oAuthScopes The OAuth scopes required for OAuth type authentication.
       */
      override fun oAuthScopes(vararg oAuthScopes: String): Unit = oAuthScopes(oAuthScopes.toList())

      /**
       * @param tokenUrl The token url required to fetch access/refresh tokens using authorization
       * code and also to refresh expired access token using refresh token.
       */
      override fun tokenUrl(tokenUrl: String) {
        cdkBuilder.tokenUrl(tokenUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty,
    ) : CdkObject(cdkObject), OAuthPropertiesProperty {
      /**
       * The authorization code url required to redirect to SAP Login Page to fetch authorization
       * code for OAuth type authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthproperties.html#cfn-appflow-connectorprofile-oauthproperties-authcodeurl)
       */
      override fun authCodeUrl(): String? = unwrap(this).getAuthCodeUrl()

      /**
       * The OAuth scopes required for OAuth type authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthproperties.html#cfn-appflow-connectorprofile-oauthproperties-oauthscopes)
       */
      override fun oAuthScopes(): List<String> = unwrap(this).getOAuthScopes() ?: emptyList()

      /**
       * The token url required to fetch access/refresh tokens using authorization code and also to
       * refresh expired access token using refresh token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauthproperties.html#cfn-appflow-connectorprofile-oauthproperties-tokenurl)
       */
      override fun tokenUrl(): String? = unwrap(this).getTokenUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OAuthPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty):
          OAuthPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OAuthPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty
    }
  }

  public interface ServiceNowConnectorProfileCredentialsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-servicenowconnectorprofilecredentials.html#cfn-appflow-connectorprofile-servicenowconnectorprofilecredentials-oauth2credentials)
     */
    public fun oAuth2Credentials(): Any? = unwrap(this).getOAuth2Credentials()

    /**
     * The password that corresponds to the user name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-servicenowconnectorprofilecredentials.html#cfn-appflow-connectorprofile-servicenowconnectorprofilecredentials-password)
     */
    public fun password(): String? = unwrap(this).getPassword()

    /**
     * The name of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-servicenowconnectorprofilecredentials.html#cfn-appflow-connectorprofile-servicenowconnectorprofilecredentials-username)
     */
    public fun username(): String? = unwrap(this).getUsername()

    /**
     * A builder for [ServiceNowConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param oAuth2Credentials the value to be set.
       */
      public fun oAuth2Credentials(oAuth2Credentials: IResolvable)

      /**
       * @param oAuth2Credentials the value to be set.
       */
      public fun oAuth2Credentials(oAuth2Credentials: OAuth2CredentialsProperty)

      /**
       * @param oAuth2Credentials the value to be set.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52363dd6c5a8eb299b5db6177cba24c77f4eff2eb58a49b48fab009df69af22f")
      public fun oAuth2Credentials(oAuth2Credentials: OAuth2CredentialsProperty.Builder.() -> Unit)

      /**
       * @param password The password that corresponds to the user name.
       */
      public fun password(password: String)

      /**
       * @param username The name of the user.
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty.builder()

      /**
       * @param oAuth2Credentials the value to be set.
       */
      override fun oAuth2Credentials(oAuth2Credentials: IResolvable) {
        cdkBuilder.oAuth2Credentials(oAuth2Credentials.let(IResolvable::unwrap))
      }

      /**
       * @param oAuth2Credentials the value to be set.
       */
      override fun oAuth2Credentials(oAuth2Credentials: OAuth2CredentialsProperty) {
        cdkBuilder.oAuth2Credentials(oAuth2Credentials.let(OAuth2CredentialsProperty::unwrap))
      }

      /**
       * @param oAuth2Credentials the value to be set.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52363dd6c5a8eb299b5db6177cba24c77f4eff2eb58a49b48fab009df69af22f")
      override
          fun oAuth2Credentials(oAuth2Credentials: OAuth2CredentialsProperty.Builder.() -> Unit):
          Unit = oAuth2Credentials(OAuth2CredentialsProperty(oAuth2Credentials))

      /**
       * @param password The password that corresponds to the user name.
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param username The name of the user.
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), ServiceNowConnectorProfileCredentialsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-servicenowconnectorprofilecredentials.html#cfn-appflow-connectorprofile-servicenowconnectorprofilecredentials-oauth2credentials)
       */
      override fun oAuth2Credentials(): Any? = unwrap(this).getOAuth2Credentials()

      /**
       * The password that corresponds to the user name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-servicenowconnectorprofilecredentials.html#cfn-appflow-connectorprofile-servicenowconnectorprofilecredentials-password)
       */
      override fun password(): String? = unwrap(this).getPassword()

      /**
       * The name of the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-servicenowconnectorprofilecredentials.html#cfn-appflow-connectorprofile-servicenowconnectorprofilecredentials-username)
       */
      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceNowConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty):
          ServiceNowConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceNowConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty
    }
  }

  public interface ServiceNowConnectorProfilePropertiesProperty {
    /**
     * The location of the ServiceNow resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-servicenowconnectorprofileproperties.html#cfn-appflow-connectorprofile-servicenowconnectorprofileproperties-instanceurl)
     */
    public fun instanceUrl(): String

    /**
     * A builder for [ServiceNowConnectorProfilePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceUrl The location of the ServiceNow resource. 
       */
      public fun instanceUrl(instanceUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty.builder()

      /**
       * @param instanceUrl The location of the ServiceNow resource. 
       */
      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), ServiceNowConnectorProfilePropertiesProperty {
      /**
       * The location of the ServiceNow resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-servicenowconnectorprofileproperties.html#cfn-appflow-connectorprofile-servicenowconnectorprofileproperties-instanceurl)
       */
      override fun instanceUrl(): String = unwrap(this).getInstanceUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceNowConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty):
          ServiceNowConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceNowConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty
    }
  }

  public interface PardotConnectorProfileCredentialsProperty {
    /**
     * The credentials used to access protected Salesforce Pardot resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofilecredentials.html#cfn-appflow-connectorprofile-pardotconnectorprofilecredentials-accesstoken)
     */
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    /**
     * The secret manager ARN, which contains the client ID and client secret of the connected app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofilecredentials.html#cfn-appflow-connectorprofile-pardotconnectorprofilecredentials-clientcredentialsarn)
     */
    public fun clientCredentialsArn(): String? = unwrap(this).getClientCredentialsArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofilecredentials.html#cfn-appflow-connectorprofile-pardotconnectorprofilecredentials-connectoroauthrequest)
     */
    public fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

    /**
     * The credentials used to acquire new access tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofilecredentials.html#cfn-appflow-connectorprofile-pardotconnectorprofilecredentials-refreshtoken)
     */
    public fun refreshToken(): String? = unwrap(this).getRefreshToken()

    /**
     * A builder for [PardotConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessToken The credentials used to access protected Salesforce Pardot resources.
       */
      public fun accessToken(accessToken: String)

      /**
       * @param clientCredentialsArn The secret manager ARN, which contains the client ID and client
       * secret of the connected app.
       */
      public fun clientCredentialsArn(clientCredentialsArn: String)

      /**
       * @param connectorOAuthRequest the value to be set.
       */
      public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable)

      /**
       * @param connectorOAuthRequest the value to be set.
       */
      public fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty)

      /**
       * @param connectorOAuthRequest the value to be set.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39ab3c472f4a497ec72452bbf4eb331f225ea0fad5409ed04313e340bfb59fcb")
      public
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit)

      /**
       * @param refreshToken The credentials used to acquire new access tokens.
       */
      public fun refreshToken(refreshToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfileCredentialsProperty.builder()

      /**
       * @param accessToken The credentials used to access protected Salesforce Pardot resources.
       */
      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      /**
       * @param clientCredentialsArn The secret manager ARN, which contains the client ID and client
       * secret of the connected app.
       */
      override fun clientCredentialsArn(clientCredentialsArn: String) {
        cdkBuilder.clientCredentialsArn(clientCredentialsArn)
      }

      /**
       * @param connectorOAuthRequest the value to be set.
       */
      override fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(IResolvable::unwrap))
      }

      /**
       * @param connectorOAuthRequest the value to be set.
       */
      override fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(ConnectorOAuthRequestProperty::unwrap))
      }

      /**
       * @param connectorOAuthRequest the value to be set.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39ab3c472f4a497ec72452bbf4eb331f225ea0fad5409ed04313e340bfb59fcb")
      override
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit):
          Unit = connectorOAuthRequest(ConnectorOAuthRequestProperty(connectorOAuthRequest))

      /**
       * @param refreshToken The credentials used to acquire new access tokens.
       */
      override fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), PardotConnectorProfileCredentialsProperty {
      /**
       * The credentials used to access protected Salesforce Pardot resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofilecredentials.html#cfn-appflow-connectorprofile-pardotconnectorprofilecredentials-accesstoken)
       */
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      /**
       * The secret manager ARN, which contains the client ID and client secret of the connected
       * app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofilecredentials.html#cfn-appflow-connectorprofile-pardotconnectorprofilecredentials-clientcredentialsarn)
       */
      override fun clientCredentialsArn(): String? = unwrap(this).getClientCredentialsArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofilecredentials.html#cfn-appflow-connectorprofile-pardotconnectorprofilecredentials-connectoroauthrequest)
       */
      override fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

      /**
       * The credentials used to acquire new access tokens.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofilecredentials.html#cfn-appflow-connectorprofile-pardotconnectorprofilecredentials-refreshtoken)
       */
      override fun refreshToken(): String? = unwrap(this).getRefreshToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PardotConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfileCredentialsProperty):
          PardotConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PardotConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfileCredentialsProperty
    }
  }

  public interface DatadogConnectorProfilePropertiesProperty {
    /**
     * The location of the Datadog resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-datadogconnectorprofileproperties.html#cfn-appflow-connectorprofile-datadogconnectorprofileproperties-instanceurl)
     */
    public fun instanceUrl(): String

    /**
     * A builder for [DatadogConnectorProfilePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceUrl The location of the Datadog resource. 
       */
      public fun instanceUrl(instanceUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty.builder()

      /**
       * @param instanceUrl The location of the Datadog resource. 
       */
      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), DatadogConnectorProfilePropertiesProperty {
      /**
       * The location of the Datadog resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-datadogconnectorprofileproperties.html#cfn-appflow-connectorprofile-datadogconnectorprofileproperties-instanceurl)
       */
      override fun instanceUrl(): String = unwrap(this).getInstanceUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DatadogConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty):
          DatadogConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatadogConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty
    }
  }

  public interface ApiKeyCredentialsProperty {
    /**
     * The API key required for API key authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-apikeycredentials.html#cfn-appflow-connectorprofile-apikeycredentials-apikey)
     */
    public fun apiKey(): String

    /**
     * The API secret key required for API key authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-apikeycredentials.html#cfn-appflow-connectorprofile-apikeycredentials-apisecretkey)
     */
    public fun apiSecretKey(): String? = unwrap(this).getApiSecretKey()

    /**
     * A builder for [ApiKeyCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apiKey The API key required for API key authentication. 
       */
      public fun apiKey(apiKey: String)

      /**
       * @param apiSecretKey The API secret key required for API key authentication.
       */
      public fun apiSecretKey(apiSecretKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ApiKeyCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ApiKeyCredentialsProperty.builder()

      /**
       * @param apiKey The API key required for API key authentication. 
       */
      override fun apiKey(apiKey: String) {
        cdkBuilder.apiKey(apiKey)
      }

      /**
       * @param apiSecretKey The API secret key required for API key authentication.
       */
      override fun apiSecretKey(apiSecretKey: String) {
        cdkBuilder.apiSecretKey(apiSecretKey)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ApiKeyCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ApiKeyCredentialsProperty,
    ) : CdkObject(cdkObject), ApiKeyCredentialsProperty {
      /**
       * The API key required for API key authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-apikeycredentials.html#cfn-appflow-connectorprofile-apikeycredentials-apikey)
       */
      override fun apiKey(): String = unwrap(this).getApiKey()

      /**
       * The API secret key required for API key authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-apikeycredentials.html#cfn-appflow-connectorprofile-apikeycredentials-apisecretkey)
       */
      override fun apiSecretKey(): String? = unwrap(this).getApiSecretKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApiKeyCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ApiKeyCredentialsProperty):
          ApiKeyCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApiKeyCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ApiKeyCredentialsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ApiKeyCredentialsProperty
    }
  }

  public interface ZendeskConnectorProfilePropertiesProperty {
    /**
     * The location of the Zendesk resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-zendeskconnectorprofileproperties.html#cfn-appflow-connectorprofile-zendeskconnectorprofileproperties-instanceurl)
     */
    public fun instanceUrl(): String

    /**
     * A builder for [ZendeskConnectorProfilePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceUrl The location of the Zendesk resource. 
       */
      public fun instanceUrl(instanceUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty.builder()

      /**
       * @param instanceUrl The location of the Zendesk resource. 
       */
      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), ZendeskConnectorProfilePropertiesProperty {
      /**
       * The location of the Zendesk resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-zendeskconnectorprofileproperties.html#cfn-appflow-connectorprofile-zendeskconnectorprofileproperties-instanceurl)
       */
      override fun instanceUrl(): String = unwrap(this).getInstanceUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ZendeskConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty):
          ZendeskConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZendeskConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty
    }
  }

  public interface ConnectorOAuthRequestProperty {
    /**
     * The code provided by the connector when it has been authenticated via the connected app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectoroauthrequest.html#cfn-appflow-connectorprofile-connectoroauthrequest-authcode)
     */
    public fun authCode(): String? = unwrap(this).getAuthCode()

    /**
     * The URL to which the authentication server redirects the browser after authorization has been
     * granted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectoroauthrequest.html#cfn-appflow-connectorprofile-connectoroauthrequest-redirecturi)
     */
    public fun redirectUri(): String? = unwrap(this).getRedirectUri()

    /**
     * A builder for [ConnectorOAuthRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authCode The code provided by the connector when it has been authenticated via the
       * connected app.
       */
      public fun authCode(authCode: String)

      /**
       * @param redirectUri The URL to which the authentication server redirects the browser after
       * authorization has been granted.
       */
      public fun redirectUri(redirectUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty.builder()

      /**
       * @param authCode The code provided by the connector when it has been authenticated via the
       * connected app.
       */
      override fun authCode(authCode: String) {
        cdkBuilder.authCode(authCode)
      }

      /**
       * @param redirectUri The URL to which the authentication server redirects the browser after
       * authorization has been granted.
       */
      override fun redirectUri(redirectUri: String) {
        cdkBuilder.redirectUri(redirectUri)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty,
    ) : CdkObject(cdkObject), ConnectorOAuthRequestProperty {
      /**
       * The code provided by the connector when it has been authenticated via the connected app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectoroauthrequest.html#cfn-appflow-connectorprofile-connectoroauthrequest-authcode)
       */
      override fun authCode(): String? = unwrap(this).getAuthCode()

      /**
       * The URL to which the authentication server redirects the browser after authorization has
       * been granted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-connectoroauthrequest.html#cfn-appflow-connectorprofile-connectoroauthrequest-redirecturi)
       */
      override fun redirectUri(): String? = unwrap(this).getRedirectUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectorOAuthRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty):
          ConnectorOAuthRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorOAuthRequestProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty
    }
  }

  public interface BasicAuthCredentialsProperty {
    /**
     * The password to use to connect to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-basicauthcredentials.html#cfn-appflow-connectorprofile-basicauthcredentials-password)
     */
    public fun password(): String

    /**
     * The username to use to connect to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-basicauthcredentials.html#cfn-appflow-connectorprofile-basicauthcredentials-username)
     */
    public fun username(): String

    /**
     * A builder for [BasicAuthCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param password The password to use to connect to a resource. 
       */
      public fun password(password: String)

      /**
       * @param username The username to use to connect to a resource. 
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.BasicAuthCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.BasicAuthCredentialsProperty.builder()

      /**
       * @param password The password to use to connect to a resource. 
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param username The username to use to connect to a resource. 
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.BasicAuthCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.BasicAuthCredentialsProperty,
    ) : CdkObject(cdkObject), BasicAuthCredentialsProperty {
      /**
       * The password to use to connect to a resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-basicauthcredentials.html#cfn-appflow-connectorprofile-basicauthcredentials-password)
       */
      override fun password(): String = unwrap(this).getPassword()

      /**
       * The username to use to connect to a resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-basicauthcredentials.html#cfn-appflow-connectorprofile-basicauthcredentials-username)
       */
      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BasicAuthCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.BasicAuthCredentialsProperty):
          BasicAuthCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BasicAuthCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.BasicAuthCredentialsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.BasicAuthCredentialsProperty
    }
  }

  public interface SalesforceConnectorProfilePropertiesProperty {
    /**
     * The location of the Salesforce resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofileproperties.html#cfn-appflow-connectorprofile-salesforceconnectorprofileproperties-instanceurl)
     */
    public fun instanceUrl(): String? = unwrap(this).getInstanceUrl()

    /**
     * Indicates whether the connector profile applies to a sandbox or production environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofileproperties.html#cfn-appflow-connectorprofile-salesforceconnectorprofileproperties-issandboxenvironment)
     */
    public fun isSandboxEnvironment(): Any? = unwrap(this).getIsSandboxEnvironment()

    /**
     * If the connection mode for the connector profile is private, this parameter sets whether
     * Amazon AppFlow uses the private network to send metadata and authorization calls to Salesforce.
     *
     * Amazon AppFlow sends private calls through AWS PrivateLink . These calls travel through AWS
     * infrastructure without being exposed to the public internet.
     *
     * Set either of the following values:
     *
     * * **true** - Amazon AppFlow sends all calls to Salesforce over the private network.
     *
     * These private calls are:
     *
     * * Calls to get metadata about your Salesforce records. This metadata describes your
     * Salesforce objects and their fields.
     * * Calls to get or refresh access tokens that allow Amazon AppFlow to access your Salesforce
     * records.
     * * Calls to transfer your Salesforce records as part of a flow run.
     * * **false** - The default value. Amazon AppFlow sends some calls to Salesforce privately and
     * other calls over the public internet.
     *
     * The public calls are:
     *
     * * Calls to get metadata about your Salesforce records.
     * * Calls to get or refresh access tokens.
     *
     * The private calls are:
     *
     * * Calls to transfer your Salesforce records as part of a flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofileproperties.html#cfn-appflow-connectorprofile-salesforceconnectorprofileproperties-useprivatelinkformetadataandauthorization)
     */
    public fun usePrivateLinkForMetadataAndAuthorization(): Any? =
        unwrap(this).getUsePrivateLinkForMetadataAndAuthorization()

    /**
     * A builder for [SalesforceConnectorProfilePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceUrl The location of the Salesforce resource.
       */
      public fun instanceUrl(instanceUrl: String)

      /**
       * @param isSandboxEnvironment Indicates whether the connector profile applies to a sandbox or
       * production environment.
       */
      public fun isSandboxEnvironment(isSandboxEnvironment: Boolean)

      /**
       * @param isSandboxEnvironment Indicates whether the connector profile applies to a sandbox or
       * production environment.
       */
      public fun isSandboxEnvironment(isSandboxEnvironment: IResolvable)

      /**
       * @param usePrivateLinkForMetadataAndAuthorization If the connection mode for the connector
       * profile is private, this parameter sets whether Amazon AppFlow uses the private network to
       * send metadata and authorization calls to Salesforce.
       * Amazon AppFlow sends private calls through AWS PrivateLink . These calls travel through AWS
       * infrastructure without being exposed to the public internet.
       *
       * Set either of the following values:
       *
       * * **true** - Amazon AppFlow sends all calls to Salesforce over the private network.
       *
       * These private calls are:
       *
       * * Calls to get metadata about your Salesforce records. This metadata describes your
       * Salesforce objects and their fields.
       * * Calls to get or refresh access tokens that allow Amazon AppFlow to access your Salesforce
       * records.
       * * Calls to transfer your Salesforce records as part of a flow run.
       * * **false** - The default value. Amazon AppFlow sends some calls to Salesforce privately
       * and other calls over the public internet.
       *
       * The public calls are:
       *
       * * Calls to get metadata about your Salesforce records.
       * * Calls to get or refresh access tokens.
       *
       * The private calls are:
       *
       * * Calls to transfer your Salesforce records as part of a flow run.
       */
      public
          fun usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization: Boolean)

      /**
       * @param usePrivateLinkForMetadataAndAuthorization If the connection mode for the connector
       * profile is private, this parameter sets whether Amazon AppFlow uses the private network to
       * send metadata and authorization calls to Salesforce.
       * Amazon AppFlow sends private calls through AWS PrivateLink . These calls travel through AWS
       * infrastructure without being exposed to the public internet.
       *
       * Set either of the following values:
       *
       * * **true** - Amazon AppFlow sends all calls to Salesforce over the private network.
       *
       * These private calls are:
       *
       * * Calls to get metadata about your Salesforce records. This metadata describes your
       * Salesforce objects and their fields.
       * * Calls to get or refresh access tokens that allow Amazon AppFlow to access your Salesforce
       * records.
       * * Calls to transfer your Salesforce records as part of a flow run.
       * * **false** - The default value. Amazon AppFlow sends some calls to Salesforce privately
       * and other calls over the public internet.
       *
       * The public calls are:
       *
       * * Calls to get metadata about your Salesforce records.
       * * Calls to get or refresh access tokens.
       *
       * The private calls are:
       *
       * * Calls to transfer your Salesforce records as part of a flow run.
       */
      public
          fun usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty.builder()

      /**
       * @param instanceUrl The location of the Salesforce resource.
       */
      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      /**
       * @param isSandboxEnvironment Indicates whether the connector profile applies to a sandbox or
       * production environment.
       */
      override fun isSandboxEnvironment(isSandboxEnvironment: Boolean) {
        cdkBuilder.isSandboxEnvironment(isSandboxEnvironment)
      }

      /**
       * @param isSandboxEnvironment Indicates whether the connector profile applies to a sandbox or
       * production environment.
       */
      override fun isSandboxEnvironment(isSandboxEnvironment: IResolvable) {
        cdkBuilder.isSandboxEnvironment(isSandboxEnvironment.let(IResolvable::unwrap))
      }

      /**
       * @param usePrivateLinkForMetadataAndAuthorization If the connection mode for the connector
       * profile is private, this parameter sets whether Amazon AppFlow uses the private network to
       * send metadata and authorization calls to Salesforce.
       * Amazon AppFlow sends private calls through AWS PrivateLink . These calls travel through AWS
       * infrastructure without being exposed to the public internet.
       *
       * Set either of the following values:
       *
       * * **true** - Amazon AppFlow sends all calls to Salesforce over the private network.
       *
       * These private calls are:
       *
       * * Calls to get metadata about your Salesforce records. This metadata describes your
       * Salesforce objects and their fields.
       * * Calls to get or refresh access tokens that allow Amazon AppFlow to access your Salesforce
       * records.
       * * Calls to transfer your Salesforce records as part of a flow run.
       * * **false** - The default value. Amazon AppFlow sends some calls to Salesforce privately
       * and other calls over the public internet.
       *
       * The public calls are:
       *
       * * Calls to get metadata about your Salesforce records.
       * * Calls to get or refresh access tokens.
       *
       * The private calls are:
       *
       * * Calls to transfer your Salesforce records as part of a flow run.
       */
      override
          fun usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization: Boolean) {
        cdkBuilder.usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization)
      }

      /**
       * @param usePrivateLinkForMetadataAndAuthorization If the connection mode for the connector
       * profile is private, this parameter sets whether Amazon AppFlow uses the private network to
       * send metadata and authorization calls to Salesforce.
       * Amazon AppFlow sends private calls through AWS PrivateLink . These calls travel through AWS
       * infrastructure without being exposed to the public internet.
       *
       * Set either of the following values:
       *
       * * **true** - Amazon AppFlow sends all calls to Salesforce over the private network.
       *
       * These private calls are:
       *
       * * Calls to get metadata about your Salesforce records. This metadata describes your
       * Salesforce objects and their fields.
       * * Calls to get or refresh access tokens that allow Amazon AppFlow to access your Salesforce
       * records.
       * * Calls to transfer your Salesforce records as part of a flow run.
       * * **false** - The default value. Amazon AppFlow sends some calls to Salesforce privately
       * and other calls over the public internet.
       *
       * The public calls are:
       *
       * * Calls to get metadata about your Salesforce records.
       * * Calls to get or refresh access tokens.
       *
       * The private calls are:
       *
       * * Calls to transfer your Salesforce records as part of a flow run.
       */
      override
          fun usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization: IResolvable) {
        cdkBuilder.usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), SalesforceConnectorProfilePropertiesProperty {
      /**
       * The location of the Salesforce resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofileproperties.html#cfn-appflow-connectorprofile-salesforceconnectorprofileproperties-instanceurl)
       */
      override fun instanceUrl(): String? = unwrap(this).getInstanceUrl()

      /**
       * Indicates whether the connector profile applies to a sandbox or production environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofileproperties.html#cfn-appflow-connectorprofile-salesforceconnectorprofileproperties-issandboxenvironment)
       */
      override fun isSandboxEnvironment(): Any? = unwrap(this).getIsSandboxEnvironment()

      /**
       * If the connection mode for the connector profile is private, this parameter sets whether
       * Amazon AppFlow uses the private network to send metadata and authorization calls to
       * Salesforce.
       *
       * Amazon AppFlow sends private calls through AWS PrivateLink . These calls travel through AWS
       * infrastructure without being exposed to the public internet.
       *
       * Set either of the following values:
       *
       * * **true** - Amazon AppFlow sends all calls to Salesforce over the private network.
       *
       * These private calls are:
       *
       * * Calls to get metadata about your Salesforce records. This metadata describes your
       * Salesforce objects and their fields.
       * * Calls to get or refresh access tokens that allow Amazon AppFlow to access your Salesforce
       * records.
       * * Calls to transfer your Salesforce records as part of a flow run.
       * * **false** - The default value. Amazon AppFlow sends some calls to Salesforce privately
       * and other calls over the public internet.
       *
       * The public calls are:
       *
       * * Calls to get metadata about your Salesforce records.
       * * Calls to get or refresh access tokens.
       *
       * The private calls are:
       *
       * * Calls to transfer your Salesforce records as part of a flow run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofileproperties.html#cfn-appflow-connectorprofile-salesforceconnectorprofileproperties-useprivatelinkformetadataandauthorization)
       */
      override fun usePrivateLinkForMetadataAndAuthorization(): Any? =
          unwrap(this).getUsePrivateLinkForMetadataAndAuthorization()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty):
          SalesforceConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty
    }
  }

  public interface DynatraceConnectorProfileCredentialsProperty {
    /**
     * The API tokens used by Dynatrace API to authenticate various API calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-dynatraceconnectorprofilecredentials.html#cfn-appflow-connectorprofile-dynatraceconnectorprofilecredentials-apitoken)
     */
    public fun apiToken(): String

    /**
     * A builder for [DynatraceConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apiToken The API tokens used by Dynatrace API to authenticate various API calls. 
       */
      public fun apiToken(apiToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty.builder()

      /**
       * @param apiToken The API tokens used by Dynatrace API to authenticate various API calls. 
       */
      override fun apiToken(apiToken: String) {
        cdkBuilder.apiToken(apiToken)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), DynatraceConnectorProfileCredentialsProperty {
      /**
       * The API tokens used by Dynatrace API to authenticate various API calls.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-dynatraceconnectorprofilecredentials.html#cfn-appflow-connectorprofile-dynatraceconnectorprofilecredentials-apitoken)
       */
      override fun apiToken(): String = unwrap(this).getApiToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DynatraceConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty):
          DynatraceConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynatraceConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty
    }
  }

  public interface SnowflakeConnectorProfilePropertiesProperty {
    /**
     * The name of the account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofileproperties.html#cfn-appflow-connectorprofile-snowflakeconnectorprofileproperties-accountname)
     */
    public fun accountName(): String? = unwrap(this).getAccountName()

    /**
     * The name of the Amazon S3 bucket associated with Snowflake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofileproperties.html#cfn-appflow-connectorprofile-snowflakeconnectorprofileproperties-bucketname)
     */
    public fun bucketName(): String

    /**
     * The bucket path that refers to the Amazon S3 bucket associated with Snowflake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofileproperties.html#cfn-appflow-connectorprofile-snowflakeconnectorprofileproperties-bucketprefix)
     */
    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    /**
     * The Snowflake Private Link service name to be used for private data transfers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofileproperties.html#cfn-appflow-connectorprofile-snowflakeconnectorprofileproperties-privatelinkservicename)
     */
    public fun privateLinkServiceName(): String? = unwrap(this).getPrivateLinkServiceName()

    /**
     * The AWS Region of the Snowflake account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofileproperties.html#cfn-appflow-connectorprofile-snowflakeconnectorprofileproperties-region)
     */
    public fun region(): String? = unwrap(this).getRegion()

    /**
     * The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the
     * Snowflake account.
     *
     * This is written in the following format: &lt; Database&gt;&lt; Schema&gt;<Stage Name>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofileproperties.html#cfn-appflow-connectorprofile-snowflakeconnectorprofileproperties-stage)
     */
    public fun stage(): String

    /**
     * The name of the Snowflake warehouse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofileproperties.html#cfn-appflow-connectorprofile-snowflakeconnectorprofileproperties-warehouse)
     */
    public fun warehouse(): String

    /**
     * A builder for [SnowflakeConnectorProfilePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accountName The name of the account.
       */
      public fun accountName(accountName: String)

      /**
       * @param bucketName The name of the Amazon S3 bucket associated with Snowflake. 
       */
      public fun bucketName(bucketName: String)

      /**
       * @param bucketPrefix The bucket path that refers to the Amazon S3 bucket associated with
       * Snowflake.
       */
      public fun bucketPrefix(bucketPrefix: String)

      /**
       * @param privateLinkServiceName The Snowflake Private Link service name to be used for
       * private data transfers.
       */
      public fun privateLinkServiceName(privateLinkServiceName: String)

      /**
       * @param region The AWS Region of the Snowflake account.
       */
      public fun region(region: String)

      /**
       * @param stage The name of the Amazon S3 stage that was created while setting up an Amazon S3
       * stage in the Snowflake account. 
       * This is written in the following format: &lt; Database&gt;&lt; Schema&gt;<Stage Name>.
       */
      public fun stage(stage: String)

      /**
       * @param warehouse The name of the Snowflake warehouse. 
       */
      public fun warehouse(warehouse: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty.builder()

      /**
       * @param accountName The name of the account.
       */
      override fun accountName(accountName: String) {
        cdkBuilder.accountName(accountName)
      }

      /**
       * @param bucketName The name of the Amazon S3 bucket associated with Snowflake. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param bucketPrefix The bucket path that refers to the Amazon S3 bucket associated with
       * Snowflake.
       */
      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      /**
       * @param privateLinkServiceName The Snowflake Private Link service name to be used for
       * private data transfers.
       */
      override fun privateLinkServiceName(privateLinkServiceName: String) {
        cdkBuilder.privateLinkServiceName(privateLinkServiceName)
      }

      /**
       * @param region The AWS Region of the Snowflake account.
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      /**
       * @param stage The name of the Amazon S3 stage that was created while setting up an Amazon S3
       * stage in the Snowflake account. 
       * This is written in the following format: &lt; Database&gt;&lt; Schema&gt;<Stage Name>.
       */
      override fun stage(stage: String) {
        cdkBuilder.stage(stage)
      }

      /**
       * @param warehouse The name of the Snowflake warehouse. 
       */
      override fun warehouse(warehouse: String) {
        cdkBuilder.warehouse(warehouse)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), SnowflakeConnectorProfilePropertiesProperty {
      /**
       * The name of the account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofileproperties.html#cfn-appflow-connectorprofile-snowflakeconnectorprofileproperties-accountname)
       */
      override fun accountName(): String? = unwrap(this).getAccountName()

      /**
       * The name of the Amazon S3 bucket associated with Snowflake.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofileproperties.html#cfn-appflow-connectorprofile-snowflakeconnectorprofileproperties-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * The bucket path that refers to the Amazon S3 bucket associated with Snowflake.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofileproperties.html#cfn-appflow-connectorprofile-snowflakeconnectorprofileproperties-bucketprefix)
       */
      override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      /**
       * The Snowflake Private Link service name to be used for private data transfers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofileproperties.html#cfn-appflow-connectorprofile-snowflakeconnectorprofileproperties-privatelinkservicename)
       */
      override fun privateLinkServiceName(): String? = unwrap(this).getPrivateLinkServiceName()

      /**
       * The AWS Region of the Snowflake account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofileproperties.html#cfn-appflow-connectorprofile-snowflakeconnectorprofileproperties-region)
       */
      override fun region(): String? = unwrap(this).getRegion()

      /**
       * The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the
       * Snowflake account.
       *
       * This is written in the following format: &lt; Database&gt;&lt; Schema&gt;<Stage Name>.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofileproperties.html#cfn-appflow-connectorprofile-snowflakeconnectorprofileproperties-stage)
       */
      override fun stage(): String = unwrap(this).getStage()

      /**
       * The name of the Snowflake warehouse.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-snowflakeconnectorprofileproperties.html#cfn-appflow-connectorprofile-snowflakeconnectorprofileproperties-warehouse)
       */
      override fun warehouse(): String = unwrap(this).getWarehouse()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SnowflakeConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty):
          SnowflakeConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnowflakeConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty
    }
  }

  public interface PardotConnectorProfilePropertiesProperty {
    /**
     * The business unit id of Salesforce Pardot instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofileproperties.html#cfn-appflow-connectorprofile-pardotconnectorprofileproperties-businessunitid)
     */
    public fun businessUnitId(): String

    /**
     * The location of the Salesforce Pardot resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofileproperties.html#cfn-appflow-connectorprofile-pardotconnectorprofileproperties-instanceurl)
     */
    public fun instanceUrl(): String? = unwrap(this).getInstanceUrl()

    /**
     * Indicates whether the connector profile applies to a sandbox or production environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofileproperties.html#cfn-appflow-connectorprofile-pardotconnectorprofileproperties-issandboxenvironment)
     */
    public fun isSandboxEnvironment(): Any? = unwrap(this).getIsSandboxEnvironment()

    /**
     * A builder for [PardotConnectorProfilePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param businessUnitId The business unit id of Salesforce Pardot instance. 
       */
      public fun businessUnitId(businessUnitId: String)

      /**
       * @param instanceUrl The location of the Salesforce Pardot resource.
       */
      public fun instanceUrl(instanceUrl: String)

      /**
       * @param isSandboxEnvironment Indicates whether the connector profile applies to a sandbox or
       * production environment.
       */
      public fun isSandboxEnvironment(isSandboxEnvironment: Boolean)

      /**
       * @param isSandboxEnvironment Indicates whether the connector profile applies to a sandbox or
       * production environment.
       */
      public fun isSandboxEnvironment(isSandboxEnvironment: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfilePropertiesProperty.builder()

      /**
       * @param businessUnitId The business unit id of Salesforce Pardot instance. 
       */
      override fun businessUnitId(businessUnitId: String) {
        cdkBuilder.businessUnitId(businessUnitId)
      }

      /**
       * @param instanceUrl The location of the Salesforce Pardot resource.
       */
      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      /**
       * @param isSandboxEnvironment Indicates whether the connector profile applies to a sandbox or
       * production environment.
       */
      override fun isSandboxEnvironment(isSandboxEnvironment: Boolean) {
        cdkBuilder.isSandboxEnvironment(isSandboxEnvironment)
      }

      /**
       * @param isSandboxEnvironment Indicates whether the connector profile applies to a sandbox or
       * production environment.
       */
      override fun isSandboxEnvironment(isSandboxEnvironment: IResolvable) {
        cdkBuilder.isSandboxEnvironment(isSandboxEnvironment.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), PardotConnectorProfilePropertiesProperty {
      /**
       * The business unit id of Salesforce Pardot instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofileproperties.html#cfn-appflow-connectorprofile-pardotconnectorprofileproperties-businessunitid)
       */
      override fun businessUnitId(): String = unwrap(this).getBusinessUnitId()

      /**
       * The location of the Salesforce Pardot resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofileproperties.html#cfn-appflow-connectorprofile-pardotconnectorprofileproperties-instanceurl)
       */
      override fun instanceUrl(): String? = unwrap(this).getInstanceUrl()

      /**
       * Indicates whether the connector profile applies to a sandbox or production environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-pardotconnectorprofileproperties.html#cfn-appflow-connectorprofile-pardotconnectorprofileproperties-issandboxenvironment)
       */
      override fun isSandboxEnvironment(): Any? = unwrap(this).getIsSandboxEnvironment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PardotConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfilePropertiesProperty):
          PardotConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PardotConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfilePropertiesProperty
    }
  }

  public interface MarketoConnectorProfileCredentialsProperty {
    /**
     * The credentials used to access protected Marketo resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-marketoconnectorprofilecredentials.html#cfn-appflow-connectorprofile-marketoconnectorprofilecredentials-accesstoken)
     */
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    /**
     * The identifier for the desired client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-marketoconnectorprofilecredentials.html#cfn-appflow-connectorprofile-marketoconnectorprofilecredentials-clientid)
     */
    public fun clientId(): String

    /**
     * The client secret used by the OAuth client to authenticate to the authorization server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-marketoconnectorprofilecredentials.html#cfn-appflow-connectorprofile-marketoconnectorprofilecredentials-clientsecret)
     */
    public fun clientSecret(): String

    /**
     * Used by select connectors for which the OAuth workflow is supported, such as Salesforce,
     * Google Analytics, Marketo, Zendesk, and Slack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-marketoconnectorprofilecredentials.html#cfn-appflow-connectorprofile-marketoconnectorprofilecredentials-connectoroauthrequest)
     */
    public fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

    /**
     * A builder for [MarketoConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessToken The credentials used to access protected Marketo resources.
       */
      public fun accessToken(accessToken: String)

      /**
       * @param clientId The identifier for the desired client. 
       */
      public fun clientId(clientId: String)

      /**
       * @param clientSecret The client secret used by the OAuth client to authenticate to the
       * authorization server. 
       */
      public fun clientSecret(clientSecret: String)

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable)

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      public fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty)

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8bdb1e299be6f3f735fa466dee66c3a670e66cb5b936de9a655580cb9d7f106")
      public
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty.builder()

      /**
       * @param accessToken The credentials used to access protected Marketo resources.
       */
      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      /**
       * @param clientId The identifier for the desired client. 
       */
      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      /**
       * @param clientSecret The client secret used by the OAuth client to authenticate to the
       * authorization server. 
       */
      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      override fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(IResolvable::unwrap))
      }

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      override fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(ConnectorOAuthRequestProperty::unwrap))
      }

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8bdb1e299be6f3f735fa466dee66c3a670e66cb5b936de9a655580cb9d7f106")
      override
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit):
          Unit = connectorOAuthRequest(ConnectorOAuthRequestProperty(connectorOAuthRequest))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), MarketoConnectorProfileCredentialsProperty {
      /**
       * The credentials used to access protected Marketo resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-marketoconnectorprofilecredentials.html#cfn-appflow-connectorprofile-marketoconnectorprofilecredentials-accesstoken)
       */
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      /**
       * The identifier for the desired client.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-marketoconnectorprofilecredentials.html#cfn-appflow-connectorprofile-marketoconnectorprofilecredentials-clientid)
       */
      override fun clientId(): String = unwrap(this).getClientId()

      /**
       * The client secret used by the OAuth client to authenticate to the authorization server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-marketoconnectorprofilecredentials.html#cfn-appflow-connectorprofile-marketoconnectorprofilecredentials-clientsecret)
       */
      override fun clientSecret(): String = unwrap(this).getClientSecret()

      /**
       * Used by select connectors for which the OAuth workflow is supported, such as Salesforce,
       * Google Analytics, Marketo, Zendesk, and Slack.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-marketoconnectorprofilecredentials.html#cfn-appflow-connectorprofile-marketoconnectorprofilecredentials-connectoroauthrequest)
       */
      override fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MarketoConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty):
          MarketoConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MarketoConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty
    }
  }

  public interface VeevaConnectorProfileCredentialsProperty {
    /**
     * The password that corresponds to the user name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-veevaconnectorprofilecredentials.html#cfn-appflow-connectorprofile-veevaconnectorprofilecredentials-password)
     */
    public fun password(): String

    /**
     * The name of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-veevaconnectorprofilecredentials.html#cfn-appflow-connectorprofile-veevaconnectorprofilecredentials-username)
     */
    public fun username(): String

    /**
     * A builder for [VeevaConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param password The password that corresponds to the user name. 
       */
      public fun password(password: String)

      /**
       * @param username The name of the user. 
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty.builder()

      /**
       * @param password The password that corresponds to the user name. 
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param username The name of the user. 
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), VeevaConnectorProfileCredentialsProperty {
      /**
       * The password that corresponds to the user name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-veevaconnectorprofilecredentials.html#cfn-appflow-connectorprofile-veevaconnectorprofilecredentials-password)
       */
      override fun password(): String = unwrap(this).getPassword()

      /**
       * The name of the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-veevaconnectorprofilecredentials.html#cfn-appflow-connectorprofile-veevaconnectorprofilecredentials-username)
       */
      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VeevaConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty):
          VeevaConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VeevaConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty
    }
  }

  public interface GoogleAnalyticsConnectorProfileCredentialsProperty {
    /**
     * The credentials used to access protected Google Analytics resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials.html#cfn-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials-accesstoken)
     */
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    /**
     * The identifier for the desired client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials.html#cfn-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials-clientid)
     */
    public fun clientId(): String

    /**
     * The client secret used by the OAuth client to authenticate to the authorization server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials.html#cfn-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials-clientsecret)
     */
    public fun clientSecret(): String

    /**
     * Used by select connectors for which the OAuth workflow is supported, such as Salesforce,
     * Google Analytics, Marketo, Zendesk, and Slack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials.html#cfn-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials-connectoroauthrequest)
     */
    public fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

    /**
     * The credentials used to acquire new access tokens.
     *
     * This is required only for OAuth2 access tokens, and is not required for OAuth1 access tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials.html#cfn-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials-refreshtoken)
     */
    public fun refreshToken(): String? = unwrap(this).getRefreshToken()

    /**
     * A builder for [GoogleAnalyticsConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessToken The credentials used to access protected Google Analytics resources.
       */
      public fun accessToken(accessToken: String)

      /**
       * @param clientId The identifier for the desired client. 
       */
      public fun clientId(clientId: String)

      /**
       * @param clientSecret The client secret used by the OAuth client to authenticate to the
       * authorization server. 
       */
      public fun clientSecret(clientSecret: String)

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable)

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      public fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty)

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc32999d9a74fb5605e941346909015c5109ad22c34a7eb73f8b0cdce34afd49")
      public
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit)

      /**
       * @param refreshToken The credentials used to acquire new access tokens.
       * This is required only for OAuth2 access tokens, and is not required for OAuth1 access
       * tokens.
       */
      public fun refreshToken(refreshToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty.builder()

      /**
       * @param accessToken The credentials used to access protected Google Analytics resources.
       */
      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      /**
       * @param clientId The identifier for the desired client. 
       */
      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      /**
       * @param clientSecret The client secret used by the OAuth client to authenticate to the
       * authorization server. 
       */
      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      override fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(IResolvable::unwrap))
      }

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      override fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(ConnectorOAuthRequestProperty::unwrap))
      }

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc32999d9a74fb5605e941346909015c5109ad22c34a7eb73f8b0cdce34afd49")
      override
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit):
          Unit = connectorOAuthRequest(ConnectorOAuthRequestProperty(connectorOAuthRequest))

      /**
       * @param refreshToken The credentials used to acquire new access tokens.
       * This is required only for OAuth2 access tokens, and is not required for OAuth1 access
       * tokens.
       */
      override fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), GoogleAnalyticsConnectorProfileCredentialsProperty {
      /**
       * The credentials used to access protected Google Analytics resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials.html#cfn-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials-accesstoken)
       */
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      /**
       * The identifier for the desired client.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials.html#cfn-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials-clientid)
       */
      override fun clientId(): String = unwrap(this).getClientId()

      /**
       * The client secret used by the OAuth client to authenticate to the authorization server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials.html#cfn-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials-clientsecret)
       */
      override fun clientSecret(): String = unwrap(this).getClientSecret()

      /**
       * Used by select connectors for which the OAuth workflow is supported, such as Salesforce,
       * Google Analytics, Marketo, Zendesk, and Slack.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials.html#cfn-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials-connectoroauthrequest)
       */
      override fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

      /**
       * The credentials used to acquire new access tokens.
       *
       * This is required only for OAuth2 access tokens, and is not required for OAuth1 access
       * tokens.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials.html#cfn-appflow-connectorprofile-googleanalyticsconnectorprofilecredentials-refreshtoken)
       */
      override fun refreshToken(): String? = unwrap(this).getRefreshToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GoogleAnalyticsConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty):
          GoogleAnalyticsConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GoogleAnalyticsConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty
    }
  }

  public interface SingularConnectorProfileCredentialsProperty {
    /**
     * A unique alphanumeric identifier used to authenticate a user, developer, or calling program
     * to your API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-singularconnectorprofilecredentials.html#cfn-appflow-connectorprofile-singularconnectorprofilecredentials-apikey)
     */
    public fun apiKey(): String

    /**
     * A builder for [SingularConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apiKey A unique alphanumeric identifier used to authenticate a user, developer, or
       * calling program to your API. 
       */
      public fun apiKey(apiKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty.builder()

      /**
       * @param apiKey A unique alphanumeric identifier used to authenticate a user, developer, or
       * calling program to your API. 
       */
      override fun apiKey(apiKey: String) {
        cdkBuilder.apiKey(apiKey)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), SingularConnectorProfileCredentialsProperty {
      /**
       * A unique alphanumeric identifier used to authenticate a user, developer, or calling program
       * to your API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-singularconnectorprofilecredentials.html#cfn-appflow-connectorprofile-singularconnectorprofilecredentials-apikey)
       */
      override fun apiKey(): String = unwrap(this).getApiKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SingularConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty):
          SingularConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingularConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty
    }
  }

  public interface SlackConnectorProfilePropertiesProperty {
    /**
     * The location of the Slack resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-slackconnectorprofileproperties.html#cfn-appflow-connectorprofile-slackconnectorprofileproperties-instanceurl)
     */
    public fun instanceUrl(): String

    /**
     * A builder for [SlackConnectorProfilePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceUrl The location of the Slack resource. 
       */
      public fun instanceUrl(instanceUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty.builder()

      /**
       * @param instanceUrl The location of the Slack resource. 
       */
      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), SlackConnectorProfilePropertiesProperty {
      /**
       * The location of the Slack resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-slackconnectorprofileproperties.html#cfn-appflow-connectorprofile-slackconnectorprofileproperties-instanceurl)
       */
      override fun instanceUrl(): String = unwrap(this).getInstanceUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SlackConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty):
          SlackConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlackConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty
    }
  }

  public interface SalesforceConnectorProfileCredentialsProperty {
    /**
     * The credentials used to access protected Salesforce resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofilecredentials.html#cfn-appflow-connectorprofile-salesforceconnectorprofilecredentials-accesstoken)
     */
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    /**
     * The secret manager ARN, which contains the client ID and client secret of the connected app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofilecredentials.html#cfn-appflow-connectorprofile-salesforceconnectorprofilecredentials-clientcredentialsarn)
     */
    public fun clientCredentialsArn(): String? = unwrap(this).getClientCredentialsArn()

    /**
     * Used by select connectors for which the OAuth workflow is supported, such as Salesforce,
     * Google Analytics, Marketo, Zendesk, and Slack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofilecredentials.html#cfn-appflow-connectorprofile-salesforceconnectorprofilecredentials-connectoroauthrequest)
     */
    public fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

    /**
     * A JSON web token (JWT) that authorizes Amazon AppFlow to access your Salesforce records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofilecredentials.html#cfn-appflow-connectorprofile-salesforceconnectorprofilecredentials-jwttoken)
     */
    public fun jwtToken(): String? = unwrap(this).getJwtToken()

    /**
     * Specifies the OAuth 2.0 grant type that Amazon AppFlow uses when it requests an access token
     * from Salesforce. Amazon AppFlow requires an access token each time it attempts to access your
     * Salesforce records.
     *
     * You can specify one of the following values:
     *
     * * **AUTHORIZATION_CODE** - Amazon AppFlow passes an authorization code when it requests the
     * access token from Salesforce. Amazon AppFlow receives the authorization code from Salesforce
     * after you log in to your Salesforce account and authorize Amazon AppFlow to access your records.
     * * **CLIENT_CREDENTIALS** - Amazon AppFlow passes client credentials (a client ID and client
     * secret) when it requests the access token from Salesforce. You provide these credentials to
     * Amazon AppFlow when you define the connection to your Salesforce account.
     * * **JWT_BEARER** - Amazon AppFlow passes a JSON web token (JWT) when it requests the access
     * token from Salesforce. You provide the JWT to Amazon AppFlow when you define the connection to
     * your Salesforce account. When you use this grant type, you don't need to log in to your
     * Salesforce account to authorize Amazon AppFlow to access your records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofilecredentials.html#cfn-appflow-connectorprofile-salesforceconnectorprofilecredentials-oauth2granttype)
     */
    public fun oAuth2GrantType(): String? = unwrap(this).getOAuth2GrantType()

    /**
     * The credentials used to acquire new access tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofilecredentials.html#cfn-appflow-connectorprofile-salesforceconnectorprofilecredentials-refreshtoken)
     */
    public fun refreshToken(): String? = unwrap(this).getRefreshToken()

    /**
     * A builder for [SalesforceConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessToken The credentials used to access protected Salesforce resources.
       */
      public fun accessToken(accessToken: String)

      /**
       * @param clientCredentialsArn The secret manager ARN, which contains the client ID and client
       * secret of the connected app.
       */
      public fun clientCredentialsArn(clientCredentialsArn: String)

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable)

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      public fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty)

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05b5b87a5c00f6b8e1d374bf90ffc9cf90006dc3c79379d0efacdad291a09d99")
      public
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit)

      /**
       * @param jwtToken A JSON web token (JWT) that authorizes Amazon AppFlow to access your
       * Salesforce records.
       */
      public fun jwtToken(jwtToken: String)

      /**
       * @param oAuth2GrantType Specifies the OAuth 2.0 grant type that Amazon AppFlow uses when it
       * requests an access token from Salesforce. Amazon AppFlow requires an access token each time it
       * attempts to access your Salesforce records.
       * You can specify one of the following values:
       *
       * * **AUTHORIZATION_CODE** - Amazon AppFlow passes an authorization code when it requests the
       * access token from Salesforce. Amazon AppFlow receives the authorization code from Salesforce
       * after you log in to your Salesforce account and authorize Amazon AppFlow to access your
       * records.
       * * **CLIENT_CREDENTIALS** - Amazon AppFlow passes client credentials (a client ID and client
       * secret) when it requests the access token from Salesforce. You provide these credentials to
       * Amazon AppFlow when you define the connection to your Salesforce account.
       * * **JWT_BEARER** - Amazon AppFlow passes a JSON web token (JWT) when it requests the access
       * token from Salesforce. You provide the JWT to Amazon AppFlow when you define the connection to
       * your Salesforce account. When you use this grant type, you don't need to log in to your
       * Salesforce account to authorize Amazon AppFlow to access your records.
       */
      public fun oAuth2GrantType(oAuth2GrantType: String)

      /**
       * @param refreshToken The credentials used to acquire new access tokens.
       */
      public fun refreshToken(refreshToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty.builder()

      /**
       * @param accessToken The credentials used to access protected Salesforce resources.
       */
      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      /**
       * @param clientCredentialsArn The secret manager ARN, which contains the client ID and client
       * secret of the connected app.
       */
      override fun clientCredentialsArn(clientCredentialsArn: String) {
        cdkBuilder.clientCredentialsArn(clientCredentialsArn)
      }

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      override fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(IResolvable::unwrap))
      }

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      override fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(ConnectorOAuthRequestProperty::unwrap))
      }

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05b5b87a5c00f6b8e1d374bf90ffc9cf90006dc3c79379d0efacdad291a09d99")
      override
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit):
          Unit = connectorOAuthRequest(ConnectorOAuthRequestProperty(connectorOAuthRequest))

      /**
       * @param jwtToken A JSON web token (JWT) that authorizes Amazon AppFlow to access your
       * Salesforce records.
       */
      override fun jwtToken(jwtToken: String) {
        cdkBuilder.jwtToken(jwtToken)
      }

      /**
       * @param oAuth2GrantType Specifies the OAuth 2.0 grant type that Amazon AppFlow uses when it
       * requests an access token from Salesforce. Amazon AppFlow requires an access token each time it
       * attempts to access your Salesforce records.
       * You can specify one of the following values:
       *
       * * **AUTHORIZATION_CODE** - Amazon AppFlow passes an authorization code when it requests the
       * access token from Salesforce. Amazon AppFlow receives the authorization code from Salesforce
       * after you log in to your Salesforce account and authorize Amazon AppFlow to access your
       * records.
       * * **CLIENT_CREDENTIALS** - Amazon AppFlow passes client credentials (a client ID and client
       * secret) when it requests the access token from Salesforce. You provide these credentials to
       * Amazon AppFlow when you define the connection to your Salesforce account.
       * * **JWT_BEARER** - Amazon AppFlow passes a JSON web token (JWT) when it requests the access
       * token from Salesforce. You provide the JWT to Amazon AppFlow when you define the connection to
       * your Salesforce account. When you use this grant type, you don't need to log in to your
       * Salesforce account to authorize Amazon AppFlow to access your records.
       */
      override fun oAuth2GrantType(oAuth2GrantType: String) {
        cdkBuilder.oAuth2GrantType(oAuth2GrantType)
      }

      /**
       * @param refreshToken The credentials used to acquire new access tokens.
       */
      override fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), SalesforceConnectorProfileCredentialsProperty {
      /**
       * The credentials used to access protected Salesforce resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofilecredentials.html#cfn-appflow-connectorprofile-salesforceconnectorprofilecredentials-accesstoken)
       */
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      /**
       * The secret manager ARN, which contains the client ID and client secret of the connected
       * app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofilecredentials.html#cfn-appflow-connectorprofile-salesforceconnectorprofilecredentials-clientcredentialsarn)
       */
      override fun clientCredentialsArn(): String? = unwrap(this).getClientCredentialsArn()

      /**
       * Used by select connectors for which the OAuth workflow is supported, such as Salesforce,
       * Google Analytics, Marketo, Zendesk, and Slack.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofilecredentials.html#cfn-appflow-connectorprofile-salesforceconnectorprofilecredentials-connectoroauthrequest)
       */
      override fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

      /**
       * A JSON web token (JWT) that authorizes Amazon AppFlow to access your Salesforce records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofilecredentials.html#cfn-appflow-connectorprofile-salesforceconnectorprofilecredentials-jwttoken)
       */
      override fun jwtToken(): String? = unwrap(this).getJwtToken()

      /**
       * Specifies the OAuth 2.0 grant type that Amazon AppFlow uses when it requests an access
       * token from Salesforce. Amazon AppFlow requires an access token each time it attempts to access
       * your Salesforce records.
       *
       * You can specify one of the following values:
       *
       * * **AUTHORIZATION_CODE** - Amazon AppFlow passes an authorization code when it requests the
       * access token from Salesforce. Amazon AppFlow receives the authorization code from Salesforce
       * after you log in to your Salesforce account and authorize Amazon AppFlow to access your
       * records.
       * * **CLIENT_CREDENTIALS** - Amazon AppFlow passes client credentials (a client ID and client
       * secret) when it requests the access token from Salesforce. You provide these credentials to
       * Amazon AppFlow when you define the connection to your Salesforce account.
       * * **JWT_BEARER** - Amazon AppFlow passes a JSON web token (JWT) when it requests the access
       * token from Salesforce. You provide the JWT to Amazon AppFlow when you define the connection to
       * your Salesforce account. When you use this grant type, you don't need to log in to your
       * Salesforce account to authorize Amazon AppFlow to access your records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofilecredentials.html#cfn-appflow-connectorprofile-salesforceconnectorprofilecredentials-oauth2granttype)
       */
      override fun oAuth2GrantType(): String? = unwrap(this).getOAuth2GrantType()

      /**
       * The credentials used to acquire new access tokens.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofilecredentials.html#cfn-appflow-connectorprofile-salesforceconnectorprofilecredentials-refreshtoken)
       */
      override fun refreshToken(): String? = unwrap(this).getRefreshToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty):
          SalesforceConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty
    }
  }

  public interface CustomAuthCredentialsProperty {
    /**
     * A map that holds custom authentication credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customauthcredentials.html#cfn-appflow-connectorprofile-customauthcredentials-credentialsmap)
     */
    public fun credentialsMap(): Any? = unwrap(this).getCredentialsMap()

    /**
     * The custom authentication type that the connector uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customauthcredentials.html#cfn-appflow-connectorprofile-customauthcredentials-customauthenticationtype)
     */
    public fun customAuthenticationType(): String

    /**
     * A builder for [CustomAuthCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param credentialsMap A map that holds custom authentication credentials.
       */
      public fun credentialsMap(credentialsMap: IResolvable)

      /**
       * @param credentialsMap A map that holds custom authentication credentials.
       */
      public fun credentialsMap(credentialsMap: Map<String, String>)

      /**
       * @param customAuthenticationType The custom authentication type that the connector uses. 
       */
      public fun customAuthenticationType(customAuthenticationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomAuthCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomAuthCredentialsProperty.builder()

      /**
       * @param credentialsMap A map that holds custom authentication credentials.
       */
      override fun credentialsMap(credentialsMap: IResolvable) {
        cdkBuilder.credentialsMap(credentialsMap.let(IResolvable::unwrap))
      }

      /**
       * @param credentialsMap A map that holds custom authentication credentials.
       */
      override fun credentialsMap(credentialsMap: Map<String, String>) {
        cdkBuilder.credentialsMap(credentialsMap)
      }

      /**
       * @param customAuthenticationType The custom authentication type that the connector uses. 
       */
      override fun customAuthenticationType(customAuthenticationType: String) {
        cdkBuilder.customAuthenticationType(customAuthenticationType)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomAuthCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomAuthCredentialsProperty,
    ) : CdkObject(cdkObject), CustomAuthCredentialsProperty {
      /**
       * A map that holds custom authentication credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customauthcredentials.html#cfn-appflow-connectorprofile-customauthcredentials-credentialsmap)
       */
      override fun credentialsMap(): Any? = unwrap(this).getCredentialsMap()

      /**
       * The custom authentication type that the connector uses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customauthcredentials.html#cfn-appflow-connectorprofile-customauthcredentials-customauthenticationtype)
       */
      override fun customAuthenticationType(): String = unwrap(this).getCustomAuthenticationType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomAuthCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomAuthCredentialsProperty):
          CustomAuthCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomAuthCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomAuthCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomAuthCredentialsProperty
    }
  }

  public interface RedshiftConnectorProfilePropertiesProperty {
    /**
     * A name for the associated Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-bucketname)
     */
    public fun bucketName(): String

    /**
     * The object key for the destination bucket in which Amazon AppFlow places the files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-bucketprefix)
     */
    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    /**
     * The unique ID that's assigned to an Amazon Redshift cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-clusteridentifier)
     */
    public fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

    /**
     * The Amazon Resource Name (ARN) of an IAM role that permits Amazon AppFlow to access your
     * Amazon Redshift database through the Data API.
     *
     * For more information, and for the polices that you attach to this role, see [Allow Amazon
     * AppFlow to access Amazon Redshift databases with the Data
     * API](https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#access-redshift)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-dataapirolearn)
     */
    public fun dataApiRoleArn(): String? = unwrap(this).getDataApiRoleArn()

    /**
     * The name of an Amazon Redshift database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * The JDBC URL of the Amazon Redshift cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-databaseurl)
     */
    public fun databaseUrl(): String? = unwrap(this).getDatabaseUrl()

    /**
     * Indicates whether the connector profile defines a connection to an Amazon Redshift Serverless
     * data warehouse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-isredshiftserverless)
     */
    public fun isRedshiftServerless(): Any? = unwrap(this).getIsRedshiftServerless()

    /**
     * The Amazon Resource Name (ARN) of IAM role that grants Amazon Redshift read-only access to
     * Amazon S3.
     *
     * For more information, and for the polices that you attach to this role, see [Allow Amazon
     * Redshift to access your Amazon AppFlow data in Amazon
     * S3](https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#redshift-access-s3)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-rolearn)
     */
    public fun roleArn(): String

    /**
     * The name of an Amazon Redshift workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-workgroupname)
     */
    public fun workgroupName(): String? = unwrap(this).getWorkgroupName()

    /**
     * A builder for [RedshiftConnectorProfilePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName A name for the associated Amazon S3 bucket. 
       */
      public fun bucketName(bucketName: String)

      /**
       * @param bucketPrefix The object key for the destination bucket in which Amazon AppFlow
       * places the files.
       */
      public fun bucketPrefix(bucketPrefix: String)

      /**
       * @param clusterIdentifier The unique ID that's assigned to an Amazon Redshift cluster.
       */
      public fun clusterIdentifier(clusterIdentifier: String)

      /**
       * @param dataApiRoleArn The Amazon Resource Name (ARN) of an IAM role that permits Amazon
       * AppFlow to access your Amazon Redshift database through the Data API.
       * For more information, and for the polices that you attach to this role, see [Allow Amazon
       * AppFlow to access Amazon Redshift databases with the Data
       * API](https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#access-redshift)
       * .
       */
      public fun dataApiRoleArn(dataApiRoleArn: String)

      /**
       * @param databaseName The name of an Amazon Redshift database.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param databaseUrl The JDBC URL of the Amazon Redshift cluster.
       */
      public fun databaseUrl(databaseUrl: String)

      /**
       * @param isRedshiftServerless Indicates whether the connector profile defines a connection to
       * an Amazon Redshift Serverless data warehouse.
       */
      public fun isRedshiftServerless(isRedshiftServerless: Boolean)

      /**
       * @param isRedshiftServerless Indicates whether the connector profile defines a connection to
       * an Amazon Redshift Serverless data warehouse.
       */
      public fun isRedshiftServerless(isRedshiftServerless: IResolvable)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of IAM role that grants Amazon Redshift
       * read-only access to Amazon S3. 
       * For more information, and for the polices that you attach to this role, see [Allow Amazon
       * Redshift to access your Amazon AppFlow data in Amazon
       * S3](https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#redshift-access-s3)
       * .
       */
      public fun roleArn(roleArn: String)

      /**
       * @param workgroupName The name of an Amazon Redshift workgroup.
       */
      public fun workgroupName(workgroupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty.builder()

      /**
       * @param bucketName A name for the associated Amazon S3 bucket. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param bucketPrefix The object key for the destination bucket in which Amazon AppFlow
       * places the files.
       */
      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      /**
       * @param clusterIdentifier The unique ID that's assigned to an Amazon Redshift cluster.
       */
      override fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
      }

      /**
       * @param dataApiRoleArn The Amazon Resource Name (ARN) of an IAM role that permits Amazon
       * AppFlow to access your Amazon Redshift database through the Data API.
       * For more information, and for the polices that you attach to this role, see [Allow Amazon
       * AppFlow to access Amazon Redshift databases with the Data
       * API](https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#access-redshift)
       * .
       */
      override fun dataApiRoleArn(dataApiRoleArn: String) {
        cdkBuilder.dataApiRoleArn(dataApiRoleArn)
      }

      /**
       * @param databaseName The name of an Amazon Redshift database.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param databaseUrl The JDBC URL of the Amazon Redshift cluster.
       */
      override fun databaseUrl(databaseUrl: String) {
        cdkBuilder.databaseUrl(databaseUrl)
      }

      /**
       * @param isRedshiftServerless Indicates whether the connector profile defines a connection to
       * an Amazon Redshift Serverless data warehouse.
       */
      override fun isRedshiftServerless(isRedshiftServerless: Boolean) {
        cdkBuilder.isRedshiftServerless(isRedshiftServerless)
      }

      /**
       * @param isRedshiftServerless Indicates whether the connector profile defines a connection to
       * an Amazon Redshift Serverless data warehouse.
       */
      override fun isRedshiftServerless(isRedshiftServerless: IResolvable) {
        cdkBuilder.isRedshiftServerless(isRedshiftServerless.let(IResolvable::unwrap))
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of IAM role that grants Amazon Redshift
       * read-only access to Amazon S3. 
       * For more information, and for the polices that you attach to this role, see [Allow Amazon
       * Redshift to access your Amazon AppFlow data in Amazon
       * S3](https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#redshift-access-s3)
       * .
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param workgroupName The name of an Amazon Redshift workgroup.
       */
      override fun workgroupName(workgroupName: String) {
        cdkBuilder.workgroupName(workgroupName)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), RedshiftConnectorProfilePropertiesProperty {
      /**
       * A name for the associated Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * The object key for the destination bucket in which Amazon AppFlow places the files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-bucketprefix)
       */
      override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      /**
       * The unique ID that's assigned to an Amazon Redshift cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-clusteridentifier)
       */
      override fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

      /**
       * The Amazon Resource Name (ARN) of an IAM role that permits Amazon AppFlow to access your
       * Amazon Redshift database through the Data API.
       *
       * For more information, and for the polices that you attach to this role, see [Allow Amazon
       * AppFlow to access Amazon Redshift databases with the Data
       * API](https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#access-redshift)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-dataapirolearn)
       */
      override fun dataApiRoleArn(): String? = unwrap(this).getDataApiRoleArn()

      /**
       * The name of an Amazon Redshift database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * The JDBC URL of the Amazon Redshift cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-databaseurl)
       */
      override fun databaseUrl(): String? = unwrap(this).getDatabaseUrl()

      /**
       * Indicates whether the connector profile defines a connection to an Amazon Redshift
       * Serverless data warehouse.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-isredshiftserverless)
       */
      override fun isRedshiftServerless(): Any? = unwrap(this).getIsRedshiftServerless()

      /**
       * The Amazon Resource Name (ARN) of IAM role that grants Amazon Redshift read-only access to
       * Amazon S3.
       *
       * For more information, and for the polices that you attach to this role, see [Allow Amazon
       * Redshift to access your Amazon AppFlow data in Amazon
       * S3](https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#redshift-access-s3)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The name of an Amazon Redshift workgroup.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofileproperties.html#cfn-appflow-connectorprofile-redshiftconnectorprofileproperties-workgroupname)
       */
      override fun workgroupName(): String? = unwrap(this).getWorkgroupName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty):
          RedshiftConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty
    }
  }

  public interface ZendeskConnectorProfileCredentialsProperty {
    /**
     * The credentials used to access protected Zendesk resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-zendeskconnectorprofilecredentials.html#cfn-appflow-connectorprofile-zendeskconnectorprofilecredentials-accesstoken)
     */
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    /**
     * The identifier for the desired client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-zendeskconnectorprofilecredentials.html#cfn-appflow-connectorprofile-zendeskconnectorprofilecredentials-clientid)
     */
    public fun clientId(): String

    /**
     * The client secret used by the OAuth client to authenticate to the authorization server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-zendeskconnectorprofilecredentials.html#cfn-appflow-connectorprofile-zendeskconnectorprofilecredentials-clientsecret)
     */
    public fun clientSecret(): String

    /**
     * Used by select connectors for which the OAuth workflow is supported, such as Salesforce,
     * Google Analytics, Marketo, Zendesk, and Slack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-zendeskconnectorprofilecredentials.html#cfn-appflow-connectorprofile-zendeskconnectorprofilecredentials-connectoroauthrequest)
     */
    public fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

    /**
     * A builder for [ZendeskConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessToken The credentials used to access protected Zendesk resources.
       */
      public fun accessToken(accessToken: String)

      /**
       * @param clientId The identifier for the desired client. 
       */
      public fun clientId(clientId: String)

      /**
       * @param clientSecret The client secret used by the OAuth client to authenticate to the
       * authorization server. 
       */
      public fun clientSecret(clientSecret: String)

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable)

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      public fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty)

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d29d020530b959b07eeaaab77bfcbc9bc73fe8d6ad3ed392f9f4f2f9f5bacb45")
      public
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty.builder()

      /**
       * @param accessToken The credentials used to access protected Zendesk resources.
       */
      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      /**
       * @param clientId The identifier for the desired client. 
       */
      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      /**
       * @param clientSecret The client secret used by the OAuth client to authenticate to the
       * authorization server. 
       */
      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      override fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(IResolvable::unwrap))
      }

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      override fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(ConnectorOAuthRequestProperty::unwrap))
      }

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d29d020530b959b07eeaaab77bfcbc9bc73fe8d6ad3ed392f9f4f2f9f5bacb45")
      override
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit):
          Unit = connectorOAuthRequest(ConnectorOAuthRequestProperty(connectorOAuthRequest))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), ZendeskConnectorProfileCredentialsProperty {
      /**
       * The credentials used to access protected Zendesk resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-zendeskconnectorprofilecredentials.html#cfn-appflow-connectorprofile-zendeskconnectorprofilecredentials-accesstoken)
       */
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      /**
       * The identifier for the desired client.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-zendeskconnectorprofilecredentials.html#cfn-appflow-connectorprofile-zendeskconnectorprofilecredentials-clientid)
       */
      override fun clientId(): String = unwrap(this).getClientId()

      /**
       * The client secret used by the OAuth client to authenticate to the authorization server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-zendeskconnectorprofilecredentials.html#cfn-appflow-connectorprofile-zendeskconnectorprofilecredentials-clientsecret)
       */
      override fun clientSecret(): String = unwrap(this).getClientSecret()

      /**
       * Used by select connectors for which the OAuth workflow is supported, such as Salesforce,
       * Google Analytics, Marketo, Zendesk, and Slack.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-zendeskconnectorprofilecredentials.html#cfn-appflow-connectorprofile-zendeskconnectorprofilecredentials-connectoroauthrequest)
       */
      override fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ZendeskConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty):
          ZendeskConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZendeskConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty
    }
  }

  public interface CustomConnectorProfileCredentialsProperty {
    /**
     * The API keys required for the authentication of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofilecredentials.html#cfn-appflow-connectorprofile-customconnectorprofilecredentials-apikey)
     */
    public fun apiKey(): Any? = unwrap(this).getApiKey()

    /**
     * The authentication type that the custom connector uses for authenticating while creating a
     * connector profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofilecredentials.html#cfn-appflow-connectorprofile-customconnectorprofilecredentials-authenticationtype)
     */
    public fun authenticationType(): String

    /**
     * The basic credentials that are required for the authentication of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofilecredentials.html#cfn-appflow-connectorprofile-customconnectorprofilecredentials-basic)
     */
    public fun basic(): Any? = unwrap(this).getBasic()

    /**
     * If the connector uses the custom authentication mechanism, this holds the required
     * credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofilecredentials.html#cfn-appflow-connectorprofile-customconnectorprofilecredentials-custom)
     */
    public fun custom(): Any? = unwrap(this).getCustom()

    /**
     * The OAuth 2.0 credentials required for the authentication of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofilecredentials.html#cfn-appflow-connectorprofile-customconnectorprofilecredentials-oauth2)
     */
    public fun oauth2(): Any? = unwrap(this).getOauth2()

    /**
     * A builder for [CustomConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apiKey The API keys required for the authentication of the user.
       */
      public fun apiKey(apiKey: IResolvable)

      /**
       * @param apiKey The API keys required for the authentication of the user.
       */
      public fun apiKey(apiKey: ApiKeyCredentialsProperty)

      /**
       * @param apiKey The API keys required for the authentication of the user.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bda9c7ae8acca1765606651cbf1342b871184c3896a0ceba607cce3b48aa28ab")
      public fun apiKey(apiKey: ApiKeyCredentialsProperty.Builder.() -> Unit)

      /**
       * @param authenticationType The authentication type that the custom connector uses for
       * authenticating while creating a connector profile. 
       */
      public fun authenticationType(authenticationType: String)

      /**
       * @param basic The basic credentials that are required for the authentication of the user.
       */
      public fun basic(basic: IResolvable)

      /**
       * @param basic The basic credentials that are required for the authentication of the user.
       */
      public fun basic(basic: BasicAuthCredentialsProperty)

      /**
       * @param basic The basic credentials that are required for the authentication of the user.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("baf9e4c4b7919bde7a4210e14a74239e0e76b1c7d17663717ad1a3e13368e7b0")
      public fun basic(basic: BasicAuthCredentialsProperty.Builder.() -> Unit)

      /**
       * @param custom If the connector uses the custom authentication mechanism, this holds the
       * required credentials.
       */
      public fun custom(custom: IResolvable)

      /**
       * @param custom If the connector uses the custom authentication mechanism, this holds the
       * required credentials.
       */
      public fun custom(custom: CustomAuthCredentialsProperty)

      /**
       * @param custom If the connector uses the custom authentication mechanism, this holds the
       * required credentials.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac29a2fddade456121fe054623920654f76aa806595f8c1f8601ae65913a4452")
      public fun custom(custom: CustomAuthCredentialsProperty.Builder.() -> Unit)

      /**
       * @param oauth2 The OAuth 2.0 credentials required for the authentication of the user.
       */
      public fun oauth2(oauth2: IResolvable)

      /**
       * @param oauth2 The OAuth 2.0 credentials required for the authentication of the user.
       */
      public fun oauth2(oauth2: OAuth2CredentialsProperty)

      /**
       * @param oauth2 The OAuth 2.0 credentials required for the authentication of the user.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d281424b16b15ada3366ead134f9f690373cc0331fd6365f23b2c6a26223839")
      public fun oauth2(oauth2: OAuth2CredentialsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfileCredentialsProperty.builder()

      /**
       * @param apiKey The API keys required for the authentication of the user.
       */
      override fun apiKey(apiKey: IResolvable) {
        cdkBuilder.apiKey(apiKey.let(IResolvable::unwrap))
      }

      /**
       * @param apiKey The API keys required for the authentication of the user.
       */
      override fun apiKey(apiKey: ApiKeyCredentialsProperty) {
        cdkBuilder.apiKey(apiKey.let(ApiKeyCredentialsProperty::unwrap))
      }

      /**
       * @param apiKey The API keys required for the authentication of the user.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bda9c7ae8acca1765606651cbf1342b871184c3896a0ceba607cce3b48aa28ab")
      override fun apiKey(apiKey: ApiKeyCredentialsProperty.Builder.() -> Unit): Unit =
          apiKey(ApiKeyCredentialsProperty(apiKey))

      /**
       * @param authenticationType The authentication type that the custom connector uses for
       * authenticating while creating a connector profile. 
       */
      override fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
      }

      /**
       * @param basic The basic credentials that are required for the authentication of the user.
       */
      override fun basic(basic: IResolvable) {
        cdkBuilder.basic(basic.let(IResolvable::unwrap))
      }

      /**
       * @param basic The basic credentials that are required for the authentication of the user.
       */
      override fun basic(basic: BasicAuthCredentialsProperty) {
        cdkBuilder.basic(basic.let(BasicAuthCredentialsProperty::unwrap))
      }

      /**
       * @param basic The basic credentials that are required for the authentication of the user.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("baf9e4c4b7919bde7a4210e14a74239e0e76b1c7d17663717ad1a3e13368e7b0")
      override fun basic(basic: BasicAuthCredentialsProperty.Builder.() -> Unit): Unit =
          basic(BasicAuthCredentialsProperty(basic))

      /**
       * @param custom If the connector uses the custom authentication mechanism, this holds the
       * required credentials.
       */
      override fun custom(custom: IResolvable) {
        cdkBuilder.custom(custom.let(IResolvable::unwrap))
      }

      /**
       * @param custom If the connector uses the custom authentication mechanism, this holds the
       * required credentials.
       */
      override fun custom(custom: CustomAuthCredentialsProperty) {
        cdkBuilder.custom(custom.let(CustomAuthCredentialsProperty::unwrap))
      }

      /**
       * @param custom If the connector uses the custom authentication mechanism, this holds the
       * required credentials.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac29a2fddade456121fe054623920654f76aa806595f8c1f8601ae65913a4452")
      override fun custom(custom: CustomAuthCredentialsProperty.Builder.() -> Unit): Unit =
          custom(CustomAuthCredentialsProperty(custom))

      /**
       * @param oauth2 The OAuth 2.0 credentials required for the authentication of the user.
       */
      override fun oauth2(oauth2: IResolvable) {
        cdkBuilder.oauth2(oauth2.let(IResolvable::unwrap))
      }

      /**
       * @param oauth2 The OAuth 2.0 credentials required for the authentication of the user.
       */
      override fun oauth2(oauth2: OAuth2CredentialsProperty) {
        cdkBuilder.oauth2(oauth2.let(OAuth2CredentialsProperty::unwrap))
      }

      /**
       * @param oauth2 The OAuth 2.0 credentials required for the authentication of the user.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d281424b16b15ada3366ead134f9f690373cc0331fd6365f23b2c6a26223839")
      override fun oauth2(oauth2: OAuth2CredentialsProperty.Builder.() -> Unit): Unit =
          oauth2(OAuth2CredentialsProperty(oauth2))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), CustomConnectorProfileCredentialsProperty {
      /**
       * The API keys required for the authentication of the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofilecredentials.html#cfn-appflow-connectorprofile-customconnectorprofilecredentials-apikey)
       */
      override fun apiKey(): Any? = unwrap(this).getApiKey()

      /**
       * The authentication type that the custom connector uses for authenticating while creating a
       * connector profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofilecredentials.html#cfn-appflow-connectorprofile-customconnectorprofilecredentials-authenticationtype)
       */
      override fun authenticationType(): String = unwrap(this).getAuthenticationType()

      /**
       * The basic credentials that are required for the authentication of the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofilecredentials.html#cfn-appflow-connectorprofile-customconnectorprofilecredentials-basic)
       */
      override fun basic(): Any? = unwrap(this).getBasic()

      /**
       * If the connector uses the custom authentication mechanism, this holds the required
       * credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofilecredentials.html#cfn-appflow-connectorprofile-customconnectorprofilecredentials-custom)
       */
      override fun custom(): Any? = unwrap(this).getCustom()

      /**
       * The OAuth 2.0 credentials required for the authentication of the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-customconnectorprofilecredentials.html#cfn-appflow-connectorprofile-customconnectorprofilecredentials-oauth2)
       */
      override fun oauth2(): Any? = unwrap(this).getOauth2()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfileCredentialsProperty):
          CustomConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfileCredentialsProperty
    }
  }

  public interface VeevaConnectorProfilePropertiesProperty {
    /**
     * The location of the Veeva resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-veevaconnectorprofileproperties.html#cfn-appflow-connectorprofile-veevaconnectorprofileproperties-instanceurl)
     */
    public fun instanceUrl(): String

    /**
     * A builder for [VeevaConnectorProfilePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceUrl The location of the Veeva resource. 
       */
      public fun instanceUrl(instanceUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty.builder()

      /**
       * @param instanceUrl The location of the Veeva resource. 
       */
      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), VeevaConnectorProfilePropertiesProperty {
      /**
       * The location of the Veeva resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-veevaconnectorprofileproperties.html#cfn-appflow-connectorprofile-veevaconnectorprofileproperties-instanceurl)
       */
      override fun instanceUrl(): String = unwrap(this).getInstanceUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VeevaConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty):
          VeevaConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VeevaConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty
    }
  }

  public interface OAuth2CredentialsProperty {
    /**
     * The access token used to access the connector on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2credentials.html#cfn-appflow-connectorprofile-oauth2credentials-accesstoken)
     */
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    /**
     * The identifier for the desired client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2credentials.html#cfn-appflow-connectorprofile-oauth2credentials-clientid)
     */
    public fun clientId(): String? = unwrap(this).getClientId()

    /**
     * The client secret used by the OAuth client to authenticate to the authorization server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2credentials.html#cfn-appflow-connectorprofile-oauth2credentials-clientsecret)
     */
    public fun clientSecret(): String? = unwrap(this).getClientSecret()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2credentials.html#cfn-appflow-connectorprofile-oauth2credentials-oauthrequest)
     */
    public fun oAuthRequest(): Any? = unwrap(this).getOAuthRequest()

    /**
     * The refresh token used to refresh an expired access token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2credentials.html#cfn-appflow-connectorprofile-oauth2credentials-refreshtoken)
     */
    public fun refreshToken(): String? = unwrap(this).getRefreshToken()

    /**
     * A builder for [OAuth2CredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessToken The access token used to access the connector on your behalf.
       */
      public fun accessToken(accessToken: String)

      /**
       * @param clientId The identifier for the desired client.
       */
      public fun clientId(clientId: String)

      /**
       * @param clientSecret The client secret used by the OAuth client to authenticate to the
       * authorization server.
       */
      public fun clientSecret(clientSecret: String)

      /**
       * @param oAuthRequest the value to be set.
       */
      public fun oAuthRequest(oAuthRequest: IResolvable)

      /**
       * @param oAuthRequest the value to be set.
       */
      public fun oAuthRequest(oAuthRequest: ConnectorOAuthRequestProperty)

      /**
       * @param oAuthRequest the value to be set.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c3eb0d875de5660f896f978d3b639a614e893c8dedd762ca9248a0f3e4b08194")
      public fun oAuthRequest(oAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit)

      /**
       * @param refreshToken The refresh token used to refresh an expired access token.
       */
      public fun refreshToken(refreshToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2CredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2CredentialsProperty.builder()

      /**
       * @param accessToken The access token used to access the connector on your behalf.
       */
      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      /**
       * @param clientId The identifier for the desired client.
       */
      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      /**
       * @param clientSecret The client secret used by the OAuth client to authenticate to the
       * authorization server.
       */
      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      /**
       * @param oAuthRequest the value to be set.
       */
      override fun oAuthRequest(oAuthRequest: IResolvable) {
        cdkBuilder.oAuthRequest(oAuthRequest.let(IResolvable::unwrap))
      }

      /**
       * @param oAuthRequest the value to be set.
       */
      override fun oAuthRequest(oAuthRequest: ConnectorOAuthRequestProperty) {
        cdkBuilder.oAuthRequest(oAuthRequest.let(ConnectorOAuthRequestProperty::unwrap))
      }

      /**
       * @param oAuthRequest the value to be set.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c3eb0d875de5660f896f978d3b639a614e893c8dedd762ca9248a0f3e4b08194")
      override fun oAuthRequest(oAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit):
          Unit = oAuthRequest(ConnectorOAuthRequestProperty(oAuthRequest))

      /**
       * @param refreshToken The refresh token used to refresh an expired access token.
       */
      override fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2CredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2CredentialsProperty,
    ) : CdkObject(cdkObject), OAuth2CredentialsProperty {
      /**
       * The access token used to access the connector on your behalf.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2credentials.html#cfn-appflow-connectorprofile-oauth2credentials-accesstoken)
       */
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      /**
       * The identifier for the desired client.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2credentials.html#cfn-appflow-connectorprofile-oauth2credentials-clientid)
       */
      override fun clientId(): String? = unwrap(this).getClientId()

      /**
       * The client secret used by the OAuth client to authenticate to the authorization server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2credentials.html#cfn-appflow-connectorprofile-oauth2credentials-clientsecret)
       */
      override fun clientSecret(): String? = unwrap(this).getClientSecret()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2credentials.html#cfn-appflow-connectorprofile-oauth2credentials-oauthrequest)
       */
      override fun oAuthRequest(): Any? = unwrap(this).getOAuthRequest()

      /**
       * The refresh token used to refresh an expired access token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2credentials.html#cfn-appflow-connectorprofile-oauth2credentials-refreshtoken)
       */
      override fun refreshToken(): String? = unwrap(this).getRefreshToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OAuth2CredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2CredentialsProperty):
          OAuth2CredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OAuth2CredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2CredentialsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2CredentialsProperty
    }
  }

  public interface RedshiftConnectorProfileCredentialsProperty {
    /**
     * The password that corresponds to the user name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofilecredentials.html#cfn-appflow-connectorprofile-redshiftconnectorprofilecredentials-password)
     */
    public fun password(): String? = unwrap(this).getPassword()

    /**
     * The name of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofilecredentials.html#cfn-appflow-connectorprofile-redshiftconnectorprofilecredentials-username)
     */
    public fun username(): String? = unwrap(this).getUsername()

    /**
     * A builder for [RedshiftConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param password The password that corresponds to the user name.
       */
      public fun password(password: String)

      /**
       * @param username The name of the user.
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty.builder()

      /**
       * @param password The password that corresponds to the user name.
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param username The name of the user.
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), RedshiftConnectorProfileCredentialsProperty {
      /**
       * The password that corresponds to the user name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofilecredentials.html#cfn-appflow-connectorprofile-redshiftconnectorprofilecredentials-password)
       */
      override fun password(): String? = unwrap(this).getPassword()

      /**
       * The name of the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofilecredentials.html#cfn-appflow-connectorprofile-redshiftconnectorprofilecredentials-username)
       */
      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty):
          RedshiftConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty
    }
  }

  public interface SAPODataConnectorProfileCredentialsProperty {
    /**
     * The SAPOData basic authentication credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofilecredentials.html#cfn-appflow-connectorprofile-sapodataconnectorprofilecredentials-basicauthcredentials)
     */
    public fun basicAuthCredentials(): Any? = unwrap(this).getBasicAuthCredentials()

    /**
     * The SAPOData OAuth type authentication credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofilecredentials.html#cfn-appflow-connectorprofile-sapodataconnectorprofilecredentials-oauthcredentials)
     */
    public fun oAuthCredentials(): Any? = unwrap(this).getOAuthCredentials()

    /**
     * A builder for [SAPODataConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param basicAuthCredentials The SAPOData basic authentication credentials.
       */
      public fun basicAuthCredentials(basicAuthCredentials: IResolvable)

      /**
       * @param basicAuthCredentials The SAPOData basic authentication credentials.
       */
      public fun basicAuthCredentials(basicAuthCredentials: BasicAuthCredentialsProperty)

      /**
       * @param basicAuthCredentials The SAPOData basic authentication credentials.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f3e18012316994888207e7b5a0bf13f1b43634901a4b07b06315e9e737f1681")
      public
          fun basicAuthCredentials(basicAuthCredentials: BasicAuthCredentialsProperty.Builder.() -> Unit)

      /**
       * @param oAuthCredentials The SAPOData OAuth type authentication credentials.
       */
      public fun oAuthCredentials(oAuthCredentials: IResolvable)

      /**
       * @param oAuthCredentials The SAPOData OAuth type authentication credentials.
       */
      public fun oAuthCredentials(oAuthCredentials: OAuthCredentialsProperty)

      /**
       * @param oAuthCredentials The SAPOData OAuth type authentication credentials.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbc0b138a061f54950e4c81143a33d514416661bb5e7456c875ce5cadd430fa8")
      public fun oAuthCredentials(oAuthCredentials: OAuthCredentialsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty.builder()

      /**
       * @param basicAuthCredentials The SAPOData basic authentication credentials.
       */
      override fun basicAuthCredentials(basicAuthCredentials: IResolvable) {
        cdkBuilder.basicAuthCredentials(basicAuthCredentials.let(IResolvable::unwrap))
      }

      /**
       * @param basicAuthCredentials The SAPOData basic authentication credentials.
       */
      override fun basicAuthCredentials(basicAuthCredentials: BasicAuthCredentialsProperty) {
        cdkBuilder.basicAuthCredentials(basicAuthCredentials.let(BasicAuthCredentialsProperty::unwrap))
      }

      /**
       * @param basicAuthCredentials The SAPOData basic authentication credentials.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f3e18012316994888207e7b5a0bf13f1b43634901a4b07b06315e9e737f1681")
      override
          fun basicAuthCredentials(basicAuthCredentials: BasicAuthCredentialsProperty.Builder.() -> Unit):
          Unit = basicAuthCredentials(BasicAuthCredentialsProperty(basicAuthCredentials))

      /**
       * @param oAuthCredentials The SAPOData OAuth type authentication credentials.
       */
      override fun oAuthCredentials(oAuthCredentials: IResolvable) {
        cdkBuilder.oAuthCredentials(oAuthCredentials.let(IResolvable::unwrap))
      }

      /**
       * @param oAuthCredentials The SAPOData OAuth type authentication credentials.
       */
      override fun oAuthCredentials(oAuthCredentials: OAuthCredentialsProperty) {
        cdkBuilder.oAuthCredentials(oAuthCredentials.let(OAuthCredentialsProperty::unwrap))
      }

      /**
       * @param oAuthCredentials The SAPOData OAuth type authentication credentials.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbc0b138a061f54950e4c81143a33d514416661bb5e7456c875ce5cadd430fa8")
      override fun oAuthCredentials(oAuthCredentials: OAuthCredentialsProperty.Builder.() -> Unit):
          Unit = oAuthCredentials(OAuthCredentialsProperty(oAuthCredentials))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), SAPODataConnectorProfileCredentialsProperty {
      /**
       * The SAPOData basic authentication credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofilecredentials.html#cfn-appflow-connectorprofile-sapodataconnectorprofilecredentials-basicauthcredentials)
       */
      override fun basicAuthCredentials(): Any? = unwrap(this).getBasicAuthCredentials()

      /**
       * The SAPOData OAuth type authentication credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofilecredentials.html#cfn-appflow-connectorprofile-sapodataconnectorprofilecredentials-oauthcredentials)
       */
      override fun oAuthCredentials(): Any? = unwrap(this).getOAuthCredentials()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SAPODataConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty):
          SAPODataConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAPODataConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty
    }
  }

  public interface OAuth2PropertiesProperty {
    /**
     * The OAuth 2.0 grant type used by connector for OAuth 2.0 authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2properties.html#cfn-appflow-connectorprofile-oauth2properties-oauth2granttype)
     */
    public fun oAuth2GrantType(): String? = unwrap(this).getOAuth2GrantType()

    /**
     * The token URL required for OAuth 2.0 authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2properties.html#cfn-appflow-connectorprofile-oauth2properties-tokenurl)
     */
    public fun tokenUrl(): String? = unwrap(this).getTokenUrl()

    /**
     * Associates your token URL with a map of properties that you define.
     *
     * Use this parameter to provide any additional details that the connector requires to
     * authenticate your request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2properties.html#cfn-appflow-connectorprofile-oauth2properties-tokenurlcustomproperties)
     */
    public fun tokenUrlCustomProperties(): Any? = unwrap(this).getTokenUrlCustomProperties()

    /**
     * A builder for [OAuth2PropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param oAuth2GrantType The OAuth 2.0 grant type used by connector for OAuth 2.0
       * authentication.
       */
      public fun oAuth2GrantType(oAuth2GrantType: String)

      /**
       * @param tokenUrl The token URL required for OAuth 2.0 authentication.
       */
      public fun tokenUrl(tokenUrl: String)

      /**
       * @param tokenUrlCustomProperties Associates your token URL with a map of properties that you
       * define.
       * Use this parameter to provide any additional details that the connector requires to
       * authenticate your request.
       */
      public fun tokenUrlCustomProperties(tokenUrlCustomProperties: IResolvable)

      /**
       * @param tokenUrlCustomProperties Associates your token URL with a map of properties that you
       * define.
       * Use this parameter to provide any additional details that the connector requires to
       * authenticate your request.
       */
      public fun tokenUrlCustomProperties(tokenUrlCustomProperties: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2PropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2PropertiesProperty.builder()

      /**
       * @param oAuth2GrantType The OAuth 2.0 grant type used by connector for OAuth 2.0
       * authentication.
       */
      override fun oAuth2GrantType(oAuth2GrantType: String) {
        cdkBuilder.oAuth2GrantType(oAuth2GrantType)
      }

      /**
       * @param tokenUrl The token URL required for OAuth 2.0 authentication.
       */
      override fun tokenUrl(tokenUrl: String) {
        cdkBuilder.tokenUrl(tokenUrl)
      }

      /**
       * @param tokenUrlCustomProperties Associates your token URL with a map of properties that you
       * define.
       * Use this parameter to provide any additional details that the connector requires to
       * authenticate your request.
       */
      override fun tokenUrlCustomProperties(tokenUrlCustomProperties: IResolvable) {
        cdkBuilder.tokenUrlCustomProperties(tokenUrlCustomProperties.let(IResolvable::unwrap))
      }

      /**
       * @param tokenUrlCustomProperties Associates your token URL with a map of properties that you
       * define.
       * Use this parameter to provide any additional details that the connector requires to
       * authenticate your request.
       */
      override fun tokenUrlCustomProperties(tokenUrlCustomProperties: Map<String, String>) {
        cdkBuilder.tokenUrlCustomProperties(tokenUrlCustomProperties)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2PropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2PropertiesProperty,
    ) : CdkObject(cdkObject), OAuth2PropertiesProperty {
      /**
       * The OAuth 2.0 grant type used by connector for OAuth 2.0 authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2properties.html#cfn-appflow-connectorprofile-oauth2properties-oauth2granttype)
       */
      override fun oAuth2GrantType(): String? = unwrap(this).getOAuth2GrantType()

      /**
       * The token URL required for OAuth 2.0 authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2properties.html#cfn-appflow-connectorprofile-oauth2properties-tokenurl)
       */
      override fun tokenUrl(): String? = unwrap(this).getTokenUrl()

      /**
       * Associates your token URL with a map of properties that you define.
       *
       * Use this parameter to provide any additional details that the connector requires to
       * authenticate your request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-oauth2properties.html#cfn-appflow-connectorprofile-oauth2properties-tokenurlcustomproperties)
       */
      override fun tokenUrlCustomProperties(): Any? = unwrap(this).getTokenUrlCustomProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OAuth2PropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2PropertiesProperty):
          OAuth2PropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OAuth2PropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2PropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2PropertiesProperty
    }
  }

  public interface SAPODataConnectorProfilePropertiesProperty {
    /**
     * The location of the SAPOData resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html#cfn-appflow-connectorprofile-sapodataconnectorprofileproperties-applicationhosturl)
     */
    public fun applicationHostUrl(): String? = unwrap(this).getApplicationHostUrl()

    /**
     * The application path to catalog service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html#cfn-appflow-connectorprofile-sapodataconnectorprofileproperties-applicationservicepath)
     */
    public fun applicationServicePath(): String? = unwrap(this).getApplicationServicePath()

    /**
     * The client number for the client creating the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html#cfn-appflow-connectorprofile-sapodataconnectorprofileproperties-clientnumber)
     */
    public fun clientNumber(): String? = unwrap(this).getClientNumber()

    /**
     * If you set this parameter to true, Amazon AppFlow bypasses the single sign-on (SSO) settings
     * in your SAP account when it accesses your SAP OData instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html#cfn-appflow-connectorprofile-sapodataconnectorprofileproperties-disablesso)
     */
    public fun disableSso(): Any? = unwrap(this).getDisableSso()

    /**
     * The logon language of SAPOData instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html#cfn-appflow-connectorprofile-sapodataconnectorprofileproperties-logonlanguage)
     */
    public fun logonLanguage(): String? = unwrap(this).getLogonLanguage()

    /**
     * The SAPOData OAuth properties required for OAuth type authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html#cfn-appflow-connectorprofile-sapodataconnectorprofileproperties-oauthproperties)
     */
    public fun oAuthProperties(): Any? = unwrap(this).getOAuthProperties()

    /**
     * The port number of the SAPOData instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html#cfn-appflow-connectorprofile-sapodataconnectorprofileproperties-portnumber)
     */
    public fun portNumber(): Number? = unwrap(this).getPortNumber()

    /**
     * The SAPOData Private Link service name to be used for private data transfers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html#cfn-appflow-connectorprofile-sapodataconnectorprofileproperties-privatelinkservicename)
     */
    public fun privateLinkServiceName(): String? = unwrap(this).getPrivateLinkServiceName()

    /**
     * A builder for [SAPODataConnectorProfilePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationHostUrl The location of the SAPOData resource.
       */
      public fun applicationHostUrl(applicationHostUrl: String)

      /**
       * @param applicationServicePath The application path to catalog service.
       */
      public fun applicationServicePath(applicationServicePath: String)

      /**
       * @param clientNumber The client number for the client creating the connection.
       */
      public fun clientNumber(clientNumber: String)

      /**
       * @param disableSso If you set this parameter to true, Amazon AppFlow bypasses the single
       * sign-on (SSO) settings in your SAP account when it accesses your SAP OData instance.
       */
      public fun disableSso(disableSso: Boolean)

      /**
       * @param disableSso If you set this parameter to true, Amazon AppFlow bypasses the single
       * sign-on (SSO) settings in your SAP account when it accesses your SAP OData instance.
       */
      public fun disableSso(disableSso: IResolvable)

      /**
       * @param logonLanguage The logon language of SAPOData instance.
       */
      public fun logonLanguage(logonLanguage: String)

      /**
       * @param oAuthProperties The SAPOData OAuth properties required for OAuth type
       * authentication.
       */
      public fun oAuthProperties(oAuthProperties: IResolvable)

      /**
       * @param oAuthProperties The SAPOData OAuth properties required for OAuth type
       * authentication.
       */
      public fun oAuthProperties(oAuthProperties: OAuthPropertiesProperty)

      /**
       * @param oAuthProperties The SAPOData OAuth properties required for OAuth type
       * authentication.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("234337966d9cc333f43582bd408bf7f62af955ea3e1b8cb2d39e12371af762ed")
      public fun oAuthProperties(oAuthProperties: OAuthPropertiesProperty.Builder.() -> Unit)

      /**
       * @param portNumber The port number of the SAPOData instance.
       */
      public fun portNumber(portNumber: Number)

      /**
       * @param privateLinkServiceName The SAPOData Private Link service name to be used for private
       * data transfers.
       */
      public fun privateLinkServiceName(privateLinkServiceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty.builder()

      /**
       * @param applicationHostUrl The location of the SAPOData resource.
       */
      override fun applicationHostUrl(applicationHostUrl: String) {
        cdkBuilder.applicationHostUrl(applicationHostUrl)
      }

      /**
       * @param applicationServicePath The application path to catalog service.
       */
      override fun applicationServicePath(applicationServicePath: String) {
        cdkBuilder.applicationServicePath(applicationServicePath)
      }

      /**
       * @param clientNumber The client number for the client creating the connection.
       */
      override fun clientNumber(clientNumber: String) {
        cdkBuilder.clientNumber(clientNumber)
      }

      /**
       * @param disableSso If you set this parameter to true, Amazon AppFlow bypasses the single
       * sign-on (SSO) settings in your SAP account when it accesses your SAP OData instance.
       */
      override fun disableSso(disableSso: Boolean) {
        cdkBuilder.disableSso(disableSso)
      }

      /**
       * @param disableSso If you set this parameter to true, Amazon AppFlow bypasses the single
       * sign-on (SSO) settings in your SAP account when it accesses your SAP OData instance.
       */
      override fun disableSso(disableSso: IResolvable) {
        cdkBuilder.disableSso(disableSso.let(IResolvable::unwrap))
      }

      /**
       * @param logonLanguage The logon language of SAPOData instance.
       */
      override fun logonLanguage(logonLanguage: String) {
        cdkBuilder.logonLanguage(logonLanguage)
      }

      /**
       * @param oAuthProperties The SAPOData OAuth properties required for OAuth type
       * authentication.
       */
      override fun oAuthProperties(oAuthProperties: IResolvable) {
        cdkBuilder.oAuthProperties(oAuthProperties.let(IResolvable::unwrap))
      }

      /**
       * @param oAuthProperties The SAPOData OAuth properties required for OAuth type
       * authentication.
       */
      override fun oAuthProperties(oAuthProperties: OAuthPropertiesProperty) {
        cdkBuilder.oAuthProperties(oAuthProperties.let(OAuthPropertiesProperty::unwrap))
      }

      /**
       * @param oAuthProperties The SAPOData OAuth properties required for OAuth type
       * authentication.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("234337966d9cc333f43582bd408bf7f62af955ea3e1b8cb2d39e12371af762ed")
      override fun oAuthProperties(oAuthProperties: OAuthPropertiesProperty.Builder.() -> Unit):
          Unit = oAuthProperties(OAuthPropertiesProperty(oAuthProperties))

      /**
       * @param portNumber The port number of the SAPOData instance.
       */
      override fun portNumber(portNumber: Number) {
        cdkBuilder.portNumber(portNumber)
      }

      /**
       * @param privateLinkServiceName The SAPOData Private Link service name to be used for private
       * data transfers.
       */
      override fun privateLinkServiceName(privateLinkServiceName: String) {
        cdkBuilder.privateLinkServiceName(privateLinkServiceName)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), SAPODataConnectorProfilePropertiesProperty {
      /**
       * The location of the SAPOData resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html#cfn-appflow-connectorprofile-sapodataconnectorprofileproperties-applicationhosturl)
       */
      override fun applicationHostUrl(): String? = unwrap(this).getApplicationHostUrl()

      /**
       * The application path to catalog service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html#cfn-appflow-connectorprofile-sapodataconnectorprofileproperties-applicationservicepath)
       */
      override fun applicationServicePath(): String? = unwrap(this).getApplicationServicePath()

      /**
       * The client number for the client creating the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html#cfn-appflow-connectorprofile-sapodataconnectorprofileproperties-clientnumber)
       */
      override fun clientNumber(): String? = unwrap(this).getClientNumber()

      /**
       * If you set this parameter to true, Amazon AppFlow bypasses the single sign-on (SSO)
       * settings in your SAP account when it accesses your SAP OData instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html#cfn-appflow-connectorprofile-sapodataconnectorprofileproperties-disablesso)
       */
      override fun disableSso(): Any? = unwrap(this).getDisableSso()

      /**
       * The logon language of SAPOData instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html#cfn-appflow-connectorprofile-sapodataconnectorprofileproperties-logonlanguage)
       */
      override fun logonLanguage(): String? = unwrap(this).getLogonLanguage()

      /**
       * The SAPOData OAuth properties required for OAuth type authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html#cfn-appflow-connectorprofile-sapodataconnectorprofileproperties-oauthproperties)
       */
      override fun oAuthProperties(): Any? = unwrap(this).getOAuthProperties()

      /**
       * The port number of the SAPOData instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html#cfn-appflow-connectorprofile-sapodataconnectorprofileproperties-portnumber)
       */
      override fun portNumber(): Number? = unwrap(this).getPortNumber()

      /**
       * The SAPOData Private Link service name to be used for private data transfers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-sapodataconnectorprofileproperties.html#cfn-appflow-connectorprofile-sapodataconnectorprofileproperties-privatelinkservicename)
       */
      override fun privateLinkServiceName(): String? = unwrap(this).getPrivateLinkServiceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SAPODataConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty):
          SAPODataConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAPODataConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty
    }
  }

  public interface InforNexusConnectorProfileCredentialsProperty {
    /**
     * The Access Key portion of the credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-infornexusconnectorprofilecredentials.html#cfn-appflow-connectorprofile-infornexusconnectorprofilecredentials-accesskeyid)
     */
    public fun accessKeyId(): String

    /**
     * The encryption keys used to encrypt data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-infornexusconnectorprofilecredentials.html#cfn-appflow-connectorprofile-infornexusconnectorprofilecredentials-datakey)
     */
    public fun datakey(): String

    /**
     * The secret key used to sign requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-infornexusconnectorprofilecredentials.html#cfn-appflow-connectorprofile-infornexusconnectorprofilecredentials-secretaccesskey)
     */
    public fun secretAccessKey(): String

    /**
     * The identifier for the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-infornexusconnectorprofilecredentials.html#cfn-appflow-connectorprofile-infornexusconnectorprofilecredentials-userid)
     */
    public fun userId(): String

    /**
     * A builder for [InforNexusConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessKeyId The Access Key portion of the credentials. 
       */
      public fun accessKeyId(accessKeyId: String)

      /**
       * @param datakey The encryption keys used to encrypt data. 
       */
      public fun datakey(datakey: String)

      /**
       * @param secretAccessKey The secret key used to sign requests. 
       */
      public fun secretAccessKey(secretAccessKey: String)

      /**
       * @param userId The identifier for the user. 
       */
      public fun userId(userId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty.builder()

      /**
       * @param accessKeyId The Access Key portion of the credentials. 
       */
      override fun accessKeyId(accessKeyId: String) {
        cdkBuilder.accessKeyId(accessKeyId)
      }

      /**
       * @param datakey The encryption keys used to encrypt data. 
       */
      override fun datakey(datakey: String) {
        cdkBuilder.datakey(datakey)
      }

      /**
       * @param secretAccessKey The secret key used to sign requests. 
       */
      override fun secretAccessKey(secretAccessKey: String) {
        cdkBuilder.secretAccessKey(secretAccessKey)
      }

      /**
       * @param userId The identifier for the user. 
       */
      override fun userId(userId: String) {
        cdkBuilder.userId(userId)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), InforNexusConnectorProfileCredentialsProperty {
      /**
       * The Access Key portion of the credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-infornexusconnectorprofilecredentials.html#cfn-appflow-connectorprofile-infornexusconnectorprofilecredentials-accesskeyid)
       */
      override fun accessKeyId(): String = unwrap(this).getAccessKeyId()

      /**
       * The encryption keys used to encrypt data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-infornexusconnectorprofilecredentials.html#cfn-appflow-connectorprofile-infornexusconnectorprofilecredentials-datakey)
       */
      override fun datakey(): String = unwrap(this).getDatakey()

      /**
       * The secret key used to sign requests.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-infornexusconnectorprofilecredentials.html#cfn-appflow-connectorprofile-infornexusconnectorprofilecredentials-secretaccesskey)
       */
      override fun secretAccessKey(): String = unwrap(this).getSecretAccessKey()

      /**
       * The identifier for the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-infornexusconnectorprofilecredentials.html#cfn-appflow-connectorprofile-infornexusconnectorprofilecredentials-userid)
       */
      override fun userId(): String = unwrap(this).getUserId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InforNexusConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty):
          InforNexusConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InforNexusConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty
    }
  }

  public interface TrendmicroConnectorProfileCredentialsProperty {
    /**
     * The Secret Access Key portion of the credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-trendmicroconnectorprofilecredentials.html#cfn-appflow-connectorprofile-trendmicroconnectorprofilecredentials-apisecretkey)
     */
    public fun apiSecretKey(): String

    /**
     * A builder for [TrendmicroConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apiSecretKey The Secret Access Key portion of the credentials. 
       */
      public fun apiSecretKey(apiSecretKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty.builder()

      /**
       * @param apiSecretKey The Secret Access Key portion of the credentials. 
       */
      override fun apiSecretKey(apiSecretKey: String) {
        cdkBuilder.apiSecretKey(apiSecretKey)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), TrendmicroConnectorProfileCredentialsProperty {
      /**
       * The Secret Access Key portion of the credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-trendmicroconnectorprofilecredentials.html#cfn-appflow-connectorprofile-trendmicroconnectorprofilecredentials-apisecretkey)
       */
      override fun apiSecretKey(): String = unwrap(this).getApiSecretKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TrendmicroConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty):
          TrendmicroConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrendmicroConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty
    }
  }

  public interface SlackConnectorProfileCredentialsProperty {
    /**
     * The credentials used to access protected Slack resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-slackconnectorprofilecredentials.html#cfn-appflow-connectorprofile-slackconnectorprofilecredentials-accesstoken)
     */
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    /**
     * The identifier for the client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-slackconnectorprofilecredentials.html#cfn-appflow-connectorprofile-slackconnectorprofilecredentials-clientid)
     */
    public fun clientId(): String

    /**
     * The client secret used by the OAuth client to authenticate to the authorization server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-slackconnectorprofilecredentials.html#cfn-appflow-connectorprofile-slackconnectorprofilecredentials-clientsecret)
     */
    public fun clientSecret(): String

    /**
     * Used by select connectors for which the OAuth workflow is supported, such as Salesforce,
     * Google Analytics, Marketo, Zendesk, and Slack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-slackconnectorprofilecredentials.html#cfn-appflow-connectorprofile-slackconnectorprofilecredentials-connectoroauthrequest)
     */
    public fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

    /**
     * A builder for [SlackConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessToken The credentials used to access protected Slack resources.
       */
      public fun accessToken(accessToken: String)

      /**
       * @param clientId The identifier for the client. 
       */
      public fun clientId(clientId: String)

      /**
       * @param clientSecret The client secret used by the OAuth client to authenticate to the
       * authorization server. 
       */
      public fun clientSecret(clientSecret: String)

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable)

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      public fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty)

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a269a2424052e57448352507b00d903028640821e3a9216e4706a214f40ace47")
      public
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfileCredentialsProperty.builder()

      /**
       * @param accessToken The credentials used to access protected Slack resources.
       */
      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      /**
       * @param clientId The identifier for the client. 
       */
      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      /**
       * @param clientSecret The client secret used by the OAuth client to authenticate to the
       * authorization server. 
       */
      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      override fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(IResolvable::unwrap))
      }

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      override fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(ConnectorOAuthRequestProperty::unwrap))
      }

      /**
       * @param connectorOAuthRequest Used by select connectors for which the OAuth workflow is
       * supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a269a2424052e57448352507b00d903028640821e3a9216e4706a214f40ace47")
      override
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit):
          Unit = connectorOAuthRequest(ConnectorOAuthRequestProperty(connectorOAuthRequest))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), SlackConnectorProfileCredentialsProperty {
      /**
       * The credentials used to access protected Slack resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-slackconnectorprofilecredentials.html#cfn-appflow-connectorprofile-slackconnectorprofilecredentials-accesstoken)
       */
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      /**
       * The identifier for the client.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-slackconnectorprofilecredentials.html#cfn-appflow-connectorprofile-slackconnectorprofilecredentials-clientid)
       */
      override fun clientId(): String = unwrap(this).getClientId()

      /**
       * The client secret used by the OAuth client to authenticate to the authorization server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-slackconnectorprofilecredentials.html#cfn-appflow-connectorprofile-slackconnectorprofilecredentials-clientsecret)
       */
      override fun clientSecret(): String = unwrap(this).getClientSecret()

      /**
       * Used by select connectors for which the OAuth workflow is supported, such as Salesforce,
       * Google Analytics, Marketo, Zendesk, and Slack.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-slackconnectorprofilecredentials.html#cfn-appflow-connectorprofile-slackconnectorprofilecredentials-connectoroauthrequest)
       */
      override fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SlackConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfileCredentialsProperty):
          SlackConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlackConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfileCredentialsProperty
    }
  }

  public interface DatadogConnectorProfileCredentialsProperty {
    /**
     * A unique alphanumeric identifier used to authenticate a user, developer, or calling program
     * to your API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-datadogconnectorprofilecredentials.html#cfn-appflow-connectorprofile-datadogconnectorprofilecredentials-apikey)
     */
    public fun apiKey(): String

    /**
     * Application keys, in conjunction with your API key, give you full access to Datadog’s
     * programmatic API.
     *
     * Application keys are associated with the user account that created them. The application key
     * is used to log all requests made to the API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-datadogconnectorprofilecredentials.html#cfn-appflow-connectorprofile-datadogconnectorprofilecredentials-applicationkey)
     */
    public fun applicationKey(): String

    /**
     * A builder for [DatadogConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apiKey A unique alphanumeric identifier used to authenticate a user, developer, or
       * calling program to your API. 
       */
      public fun apiKey(apiKey: String)

      /**
       * @param applicationKey Application keys, in conjunction with your API key, give you full
       * access to Datadog’s programmatic API. 
       * Application keys are associated with the user account that created them. The application
       * key is used to log all requests made to the API.
       */
      public fun applicationKey(applicationKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty.builder()

      /**
       * @param apiKey A unique alphanumeric identifier used to authenticate a user, developer, or
       * calling program to your API. 
       */
      override fun apiKey(apiKey: String) {
        cdkBuilder.apiKey(apiKey)
      }

      /**
       * @param applicationKey Application keys, in conjunction with your API key, give you full
       * access to Datadog’s programmatic API. 
       * Application keys are associated with the user account that created them. The application
       * key is used to log all requests made to the API.
       */
      override fun applicationKey(applicationKey: String) {
        cdkBuilder.applicationKey(applicationKey)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), DatadogConnectorProfileCredentialsProperty {
      /**
       * A unique alphanumeric identifier used to authenticate a user, developer, or calling program
       * to your API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-datadogconnectorprofilecredentials.html#cfn-appflow-connectorprofile-datadogconnectorprofilecredentials-apikey)
       */
      override fun apiKey(): String = unwrap(this).getApiKey()

      /**
       * Application keys, in conjunction with your API key, give you full access to Datadog’s
       * programmatic API.
       *
       * Application keys are associated with the user account that created them. The application
       * key is used to log all requests made to the API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-datadogconnectorprofilecredentials.html#cfn-appflow-connectorprofile-datadogconnectorprofilecredentials-applicationkey)
       */
      override fun applicationKey(): String = unwrap(this).getApplicationKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DatadogConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty):
          DatadogConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatadogConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty
    }
  }

  public interface AmplitudeConnectorProfileCredentialsProperty {
    /**
     * A unique alphanumeric identifier used to authenticate a user, developer, or calling program
     * to your API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-amplitudeconnectorprofilecredentials.html#cfn-appflow-connectorprofile-amplitudeconnectorprofilecredentials-apikey)
     */
    public fun apiKey(): String

    /**
     * The Secret Access Key portion of the credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-amplitudeconnectorprofilecredentials.html#cfn-appflow-connectorprofile-amplitudeconnectorprofilecredentials-secretkey)
     */
    public fun secretKey(): String

    /**
     * A builder for [AmplitudeConnectorProfileCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apiKey A unique alphanumeric identifier used to authenticate a user, developer, or
       * calling program to your API. 
       */
      public fun apiKey(apiKey: String)

      /**
       * @param secretKey The Secret Access Key portion of the credentials. 
       */
      public fun secretKey(secretKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty.builder()

      /**
       * @param apiKey A unique alphanumeric identifier used to authenticate a user, developer, or
       * calling program to your API. 
       */
      override fun apiKey(apiKey: String) {
        cdkBuilder.apiKey(apiKey)
      }

      /**
       * @param secretKey The Secret Access Key portion of the credentials. 
       */
      override fun secretKey(secretKey: String) {
        cdkBuilder.secretKey(secretKey)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), AmplitudeConnectorProfileCredentialsProperty {
      /**
       * A unique alphanumeric identifier used to authenticate a user, developer, or calling program
       * to your API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-amplitudeconnectorprofilecredentials.html#cfn-appflow-connectorprofile-amplitudeconnectorprofilecredentials-apikey)
       */
      override fun apiKey(): String = unwrap(this).getApiKey()

      /**
       * The Secret Access Key portion of the credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-amplitudeconnectorprofilecredentials.html#cfn-appflow-connectorprofile-amplitudeconnectorprofilecredentials-secretkey)
       */
      override fun secretKey(): String = unwrap(this).getSecretKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmplitudeConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty):
          AmplitudeConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmplitudeConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty
    }
  }
}
